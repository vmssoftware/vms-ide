import ctypes
import signal
import socket
import sys
import threading
import time
import os.path

# settings
class SETTINGS:
    HOST = '127.0.0.1'
    PORT = 54326
# messages to send
class MESSAGE:
    DEBUG = 'DEBUG'
    PAUSED = 'PAUSED'
    EXITED = 'EXITED'
    CONTINUED = 'CONTINUED'
    STEPPED = 'STEPPED'
    # MESSAGE.RETRIED = 'RETRIED'
    INFORMATION = 'INFO'
    EXCEPTION = 'EXCEPTION'
    SIGNAL = 'SIGNAL'
# command to receive
class COMMAND:
    PAUSE = 'p'
    CONTINUE = 'c'
    STEP = 's'
    INFO = 'i'

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
        self._breakpoints = {}
        # incapsulate functions from other classes
        self._lockTrace = threading.Lock()
        self._currentThread = threading.current_thread
        self._sleep = time.sleep
        self._setTrace = sys.settrace
        self._setThreadTrace = threading.settrace
        self._versionInfo = sys.version_info
        self._changeLocals = ctypes.pythonapi.PyFrame_LocalsToFast
        self._Obj = ctypes.py_object
        self._Int = ctypes.c_int
        self._os_path_basename = os.path.basename
        self._os_path_abspath = os.path.abspath
        self._setSignal = signal.signal
        self._messages = MESSAGE
        self._commands = COMMAND
        self._sig_int = signal.SIGINT
        self._sig_break = signal.SIGBREAK
        self._sig_def = signal.SIG_DFL

    def _setupTrace(self):
        self._setSignal(self._sig_int, self._signalHandler)
        self._setSignal(self._sig_break, self._signalHandler)
        self._connect()
        self._oldSysTrace = sys.gettrace()
        self._setTrace(self._traceFunc)
        self._setThreadTrace(self._traceFunc)

    def _connect(self):
        self._open()
        self._sendDbgMessage(self._messages.DEBUG)

    def _disconnect(self):
        self._sendDbgMessage(self._messages.EXITED)
        self._close()

    def _open(self):
        self._socket = None
        try:
            self._socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
            self._socket.connect((SETTINGS.HOST, self._port))
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
        self._setSignal(self._sig_break, self._sig_def)
        self._setSignal(self._sig_int, self._sig_def)
        self._disconnect()

    def _signalHandler(self, signum, frame):
        self._sendDbgMessage(self._messages.SIGNAL + ": " + str(signum))
        self._paused = True
    
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
        # wait until tracing enabled
        if not self._startTracing:
            return self._traceFunc
        # skip this file
        if frame.f_code.co_filename == self._fileName:
            return self._traceFunc
        # skip system files
        if self._os_path_abspath(frame.f_code.co_filename) == frame.f_code.co_filename:
            return self._traceFunc
        # skip no files
        if frame.f_code.co_filename == "<string>":
            return self._traceFunc
        # wait untin tracing file entered
        if self._waitingForAFile:
            if self._waitingForAFile != frame.f_code.co_filename:
                return self._traceFunc
            # now we are ready to trace
            self._waitingForAFile = None
            # autopause
            self._paused = True
        ident = self._currentThread().ident
        entry = {'ident': ident, 'frame': frame, 'event': event, 'arg': arg, 'paused': True, 'level': 0}
        if ident in self._threads:
            # get level from dictionary
            entry['level'] = self._threads[ident]['level']
        else:
            self._sendDbgMessage(" thread: %s started" % ident)
        # save entry to dictionary
        self._threads[ident] = entry
        # keep level tracking
        if event == 'call':
            entry['level'] = entry['level'] + 1
        if event == 'return':
            entry['level'] = entry['level'] - 1
            if entry['level'] == 0:
                # remove thread info and go out
                del self._threads[ident]
                self._sendDbgMessage(" thread: %s ended" % ident)
                return self._traceFunc
        with self._lockTrace:
            # point of tracing 
            self._sendDbgMessage(" thread: %s file: %s line: %i event: %s level: %i" % (ident, self._os_path_basename(frame.f_code.co_filename), frame.f_lineno, event, entry['level']))
            if self._paused:
                self._sendDbgMessage(self._messages.PAUSED)
            if event == 'exception':
                self._sendDbgMessage(self._messages.EXCEPTION)
                excType, excValue, excTraceback = arg
                self._sendDbgMessage ('Tracing exception: %s "%s" on line %s of %s' % (excType.__name__, excValue, frame.f_lineno, frame.f_code.co_name))
                self._paused = True
            cmd = self._readDbgMessage()
            if cmd:
                if cmd == self._commands.PAUSE:
                    if not self._paused:
                        self._sendDbgMessage(self._messages.PAUSED)
                    self._paused = True
                # elif cmd
            while self._paused and self._isConnected():
                if cmd == self._commands.CONTINUE:
                    if self._paused:
                        self._sendDbgMessage(self._messages.CONTINUED)
                    self._paused = False
                elif cmd == self._commands.STEP:
                    self._sendDbgMessage(self._messages.STEPPED)
                    break
                elif cmd == self._commands.INFO:
                    self._sendDbgMessage(self._messages.INFORMATION)
                    self._sendDbgMessage("Threads: %i" % len(self._threads))
                    for threadEntry in self._threads.values():
                        self._sendDbgMessage("  thread %i%s:" % (threadEntry['ident'], " paused" if threadEntry['paused'] else ""))
                        self._sendDbgMessage("      file: %s" % threadEntry['frame'].f_code.co_filename)
                        self._sendDbgMessage("      line: %i" % threadEntry['frame'].f_lineno)
                # elif "test" == cmd:
                #     self._sendDbgMessage(RETRIED)
                #     self._sendDbgMessage("x was %i" % frame.f_locals['x'])
                #     frame.f_lineno = frame.f_lineno - 1
                #     frame.f_locals.update({
                #         'x': 10,
                #     })
                #     self._changeLocals(self._Obj(frame), self._Int(0))
                #     self._sendDbgMessage("x is %i" % frame.f_locals['x'])
                #     break
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
                self._sendDbgMessage(self._messages.EXCEPTION + ": " +repr(ex))
            else:
                print(repr(ex))
    
    def run(self, filename):
        self._setupTrace()
        self._runscript(filename)
        self._cleanupTrace()

#===================================================================

if __name__ == "__main__":

    _usage = """\
usage: tracer.py pyfile [arg] ...

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

    tracer = Tracer(SETTINGS.PORT)
    tracer.run(args[0])
