import ctypes
import signal
import socket
import sys
import threading
import time

HOST = '127.0.0.1'
PORT = 54326
CONSOLE = 'CONSOLE'
DEBUG = 'DEBUG'

class Tracer:
    def __init__(self, port):
        self._port = port
        self._fileName = __file__
        self._socket = None
        self._sendBuffer = b""
        self._recvBuffer = b""
        self._oldSysTrace = None
        self._paused = False
        self._waitingForAFile = None
        self._startTracing = False
        self._originalSigint = None
        self._originalSigbreak = None
        self._threads = {}
        self._lockTrace = threading.Lock()
        # save imported functions
        self._currentThread = threading.current_thread
        self._sleep = time.sleep
        self._setTrace = sys.settrace
        self._setThreadTrace = threading.settrace
        self._versionInfo = sys.version_info
        # self._setSignal = signal.signal
        # just strings
        self._PAUSED = 'PAUSED'
        self._EXITED = 'EXITED'
        self._CONTUNUED = 'CONTUNUED'
        self._STEPPED = 'STEPPED'
        self._INFO = 'INFO'
        self._EXCEPTION = 'EXCEPTION'
        self._SIGNAL = 'SIGNAL'

    def _setupTrace(self):
        # self._setSignal(signal.SIGINT, self._signalHandler)
        # self._setSignal(signal.SIGBREAK, self._signalHandler)
        self._connect()
        self._oldSysTrace = sys.gettrace()
        self._setTrace(self._traceFunc)
        self._setThreadTrace(self._traceFunc)

    def _connect(self):
        self._open()
        self._sendDbgMessage(DEBUG)

    def _disconnect(self):
        self._sendDbgMessage(self._EXITED)
        self._close()

    def _open(self):
        self._socket = None
        try:
            self._socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
            self._socket.connect((HOST, self._port))
            self._socket.setblocking(False)
        except:
            # print('Connect failed')
            self._socket = None
    
    def _close(self):
        try:
            self._socket.close()
        except:
            pass
        finally:
            self._socket = None

    def _cleanupTrace(self):
        self._setTrace(self._oldSysTrace)
        self._setThreadTrace(self._oldSysTrace)
        self._disconnect()

    # def _signalHandler(self, signum, frame):
    #     self._sendDbgMessage(self._SIGNAL + ": " + str(signum))
    
    def _isConnected(self):
        return bool(self._socket)

    def _sendDbgMessage(self, message):
        """ Also add EOL at the end of message """
        self._sendBuffer += message.encode()
        self._sendBuffer += b'\n'
        if self._isConnected():
            try:
                sent = self._socket.send(self._sendBuffer)
                self._sendBuffer = self._sendBuffer[sent:]
            except Exception as ex:
                if isinstance(ex, IOError):
                    errno = ex.errno % 1000
                    if errno != 35:
                        self._socket = None
                else:
                    self._socket = None
            except:
                self._socket = None

    def _readDbgMessage(self):
        if self._isConnected():
            try:
                data = self._socket.recv(4096)
                if data:
                    self._recvBuffer += data
                else:
                    self._close()
            except Exception as ex:
                if isinstance(ex, IOError):
                    errno = ex.errno % 1000
                    if errno != 35:
                        self._socket = None
                else:
                    self._socket = None
            except:
                self._socket = None
            if self._recvBuffer:
                idx = self._recvBuffer.find(b"\n")
                if idx >= 0:
                    line = self._recvBuffer[:idx].decode()
                    self._recvBuffer = self._recvBuffer[idx+1:]
                    return line
        return None

    def _traceFunc(self, frame, event, arg):
        ident = self._currentThread().ident
        entry = {'ident': ident, 'frame': frame, 'event': event, 'arg': arg, 'paused': True}
        self._threads[ident] = entry

        # self._sendDbgMessage(self._INFO)
        # self._sendDbgMessage(event)
        # self._sendDbgMessage("Threads: %i" % len(self._threads))
        # for threadEntry in self._threads.values():
        #     self._sendDbgMessage("  thread %i%s:" % (threadEntry['ident'], " paused" if threadEntry['paused'] else ""))
        #     self._sendDbgMessage("      file: %s" % threadEntry['frame'].f_code.co_filename)
        #     self._sendDbgMessage("      line: %i" % threadEntry['frame'].f_lineno)

        if not self._startTracing:
            entry['paused'] = False
            return self._traceFunc
        if frame.f_code.co_filename == self._fileName:
            entry['paused'] = False
            return self._traceFunc
        if self._waitingForAFile:
            if self._waitingForAFile == frame.f_code.co_filename:
                self._waitingForAFile = None
                self._paused = True
        if not self._waitingForAFile:
            with self._lockTrace:
                if self._paused:
                    self._sendDbgMessage(self._PAUSED)
                cmd = self._readDbgMessage()
                if cmd == 'p':
                    if not self._paused:
                        self._sendDbgMessage(self._PAUSED)
                    self._paused = True
                while self._paused and self._isConnected():
                    if "c" == cmd:
                        if self._paused:
                            self._sendDbgMessage(self._CONTUNUED)
                        self._paused = False
                    elif "s" == cmd:
                        self._sendDbgMessage(self._STEPPED)
                        break
                    elif "i" == cmd:
                        self._sendDbgMessage(self._INFO)
                        self._sendDbgMessage("Threads: %i" % len(self._threads))
                        for threadEntry in self._threads.values():
                            self._sendDbgMessage("  thread %i%s:" % (threadEntry['ident'], " paused" if threadEntry['paused'] else ""))
                            self._sendDbgMessage("      file: %s" % threadEntry['frame'].f_code.co_filename)
                            self._sendDbgMessage("      line: %i" % threadEntry['frame'].f_lineno)
                    self._sleep(0.3)
                    cmd = self._readDbgMessage()
        entry['paused'] = False
        return self._traceFunc

    def _runscript(self, filename):
        # === Given from PDB.PY ===
        import __main__
        builtinsT = __builtins__
        __main__.__dict__.clear()
        __main__.__dict__.update({"__name__"    : "__main__",
                                  "__file__"    : filename,
                                  "__builtins__": builtinsT,
                                 })
        self._waitingForAFile = filename
        globalsT = __main__.__dict__
        try:
            if self._versionInfo[0] < 3:
                self._startTracing = True
                execfile(filename, globalsT, globalsT)
            else:
                with open(filename, "rb") as fp:
                    statement = "exec(compile(%r, %r, 'exec'))" % (fp.read(), filename)
                self._startTracing = True
                exec(statement, globalsT, globalsT)
        except Exception as ex:
            if self._isConnected():
                self._sendDbgMessage(self._EXCEPTION + ": " +repr(ex))
            else:
                print(repr(ex))
    
    def run(self, filename):
        self._setupTrace()
        self._runscript(filename)
        self._cleanupTrace()

#===================================================================

if __name__ == "__main__":

    _usage = """\
usage: deb.py [-c command] ... [-m module | pyfile] [arg] ...

Debug the Python program given by pyfile."""

    import getopt

    opts, args = getopt.getopt(sys.argv[1:], 'h:', ['help'])

    if not args:
        print(_usage)
        sys.exit(2)

    for opt, optarg in opts:
        if opt in ['-h', '--help']:
            print(_usage)
            sys.exit()
        else:
            print("Unlnown option %s" % opt)

    tracer = Tracer(PORT)
    tracer.run(args[0])
