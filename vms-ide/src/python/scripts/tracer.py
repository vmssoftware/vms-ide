import ctypes
import signal
import socket
import sys
import threading
import time
import os.path
import collections

# settings
class SETTINGS:
    HOST = '127.0.0.1'
    PORT = 54326
# messages to send
class MESSAGE:
    DEBUG = 'DEBUG'
    PAUSED = 'PAUSED'
    BREAK = 'BREAK'
    BP_CONFIRM = 'BP_CONFIRM'
    BP_WAIT = 'BP_WAIT'
    BP_RESET = 'BP_RESET'
    EXITED = 'EXITED'
    CONTINUED = 'CONTINUED'
    STEPPED = 'STEPPED'
    # MESSAGE.RETRIED = 'RETRIED'
    INFORMATION = 'INFO'
    EXCEPTION = 'EXCEPTION'
    SIGNAL = 'SIGNAL'
    SYNTAX_ERROR = 'SYNTAX_ERROR'
    LOCALS = 'LOCALS'
# command to receive
class COMMAND:
    PAUSE = 'p'
    CONTINUE = 'c'
    STEP = 's'
    INFO = 'i'
    WHERE = 'w'
    BP_SET = 'bps'          # bps file line
    BP_RESET = 'bpr'        # bpr [file [line]]
    LOCALS = 'l'            # l [frame [ident]] current farme is zero

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
        self._threads = {}                                          # thread enrties by [thread id]
        self._mainThread = None
        self._breakpointsConfirmed = collections.defaultdict(set)   # confirmed break line list by [file name]
        self._breakpointsWait = collections.defaultdict(set)        # wait break line list by [file name]
        self._lines = collections.defaultdict(dict)                 # all usable line list by [file name [ function name ]]
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
        # self._sig_break = signal.SIGBREAK
        self._sig_def = signal.SIG_DFL

    def _setupTrace(self):
        self._setSignal(self._sig_int, self._signalHandler)
        # self._setSignal(self._sig_break, self._signalHandler)
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
        # self._setSignal(self._sig_break, self._sig_def)
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
                        self._close()
                else:
                    self._close()
            except:
                self._close()

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
                        self._close()
                else:
                    self._close()
            except:
                self._close()
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
        if self._mainThread == None: 
            self._mainThread = ident
        entry = {'ident': ident, 'frame': frame, 'event': event, 'arg': arg, 'paused': True, 'level': 0}
        if ident in self._threads:
            # get level from dictionary
            entry['level'] = self._threads[ident]['level']
        else:
            pass
            # first entry
            # self._sendDbgMessage(" thread: %s started" % ident)
        # save entry to dictionary
        self._threads[ident] = entry
        # frame level tracking
        if event == 'call':
            entry['level'] = entry['level'] + 1
        if event == 'return':
            # if frame.f_back == None:
            #     self._sendDbgMessage(" thread: %s ended by None of back" % ident)
            entry['level'] = entry['level'] - 1
            if entry['level'] == 0:
                # remove thread info and go out
                del self._threads[ident]
                # self._sendDbgMessage(" thread: %s ended" % ident)
                return self._traceFunc
        with self._lockTrace:
            # point of tracing (comment next line in release)
            # self._sendDbgMessage(" thread: %s file: %s line: %i event: %s level: %i" % (ident, self._os_path_basename(frame.f_code.co_filename), frame.f_lineno, event, entry['level']))
            if frame.f_code.co_name not in self._lines[frame.f_code.co_filename]:
                # collect usable code lines
                # self._sendDbgMessage("collect lines for function %s in  file: %s" % (frame.f_code.co_name, frame.f_code.co_filename))
                lines = []
                lineno = frame.f_lineno
                values = iter(frame.f_code.co_lnotab)
                while True:
                    try:
                        addr_incr = next(values)
                        line_incr = next(values)
                        if isinstance(addr_incr, str):
                            addr_incr = ord(addr_incr)
                        if isinstance(line_incr, str):
                            line_incr = ord(line_incr)
                        # self._sendDbgMessage("%s" % type(line_incr))
                        if addr_incr == 0:
                            lineno += line_incr
                            continue
                        if line_incr == 0:
                            continue
                        lineno += line_incr
                        lines.append(lineno)
                        # self._sendDbgMessage("  %i" % lineno)
                    except: # Exception as ex:
                        # self._sendDbgMessage(repr(ex))
                        break
                self._lines[frame.f_code.co_filename][frame.f_code.co_name] = lines
                self._checkFileBreakpoints(frame.f_code.co_filename, lines)
            # show message when pause
            if self._paused:
                self._sendDbgMessage(self._messages.PAUSED)
            # examine breakpoint
            if frame.f_lineno in self._breakpointsConfirmed[frame.f_code.co_filename]:
                self._sendDbgMessage(self._messages.BREAK)
                self._sendDbgMessage('%i: file %s line %i function %s' % (ident, frame.f_code.co_filename, frame.f_lineno, frame.f_code.co_name))
                self._paused = True
            # examine exception
            if event == 'exception':
                self._sendDbgMessage(self._messages.EXCEPTION)
                self._sendDbgMessage('%i: file %s line %i' % (ident, frame.f_code.co_filename, frame.f_lineno))
                excType, excValue, tmp = arg
                self._sendDbgMessage('%s: %s' % (excType.__name__, excValue))
                self._paused = True
            # tests runtime commands
            cmd = self._readDbgMessage()
            while cmd:
                if cmd == self._commands.PAUSE:
                    if not self._paused:
                        self._sendDbgMessage(self._messages.PAUSED)
                    self._paused = True
                elif cmd == self._commands.INFO:
                    self._showInfo()
                else:
                    self._parseBp(cmd)
                cmd = self._readDbgMessage()
            # test commands on pause
            while self._paused and self._isConnected():
                if cmd:
                    if cmd == self._commands.CONTINUE:
                        if self._paused:
                            self._sendDbgMessage(self._messages.CONTINUED)
                        self._paused = False
                    elif cmd == self._commands.STEP:
                        self._sendDbgMessage(self._messages.STEPPED)
                        break
                    elif cmd == self._commands.INFO:
                        self._showInfo()
                    elif cmd == self._commands.WHERE:
                        self._sendDbgMessage("%i: file %s line %i function %s" % (ident, frame.f_code.co_filename, frame.f_lineno, frame.f_code.co_name))
                    elif cmd.startswith(self._commands.LOCALS):
                        locals_args = cmd.split()
                        if len(locals_args) == 1:
                            self._showLocals(ident, 0)
                        elif len(locals_args) == 2:
                            self._showLocals(ident, int(locals_args[1]))
                        elif len(locals_args) == 3:
                            self._showLocals(int(locals_args[2]), int(locals_args[1]))
                    else:
                        self._parseBp(cmd)
                self._sleep(0.3)
                cmd = self._readDbgMessage()
            # ---------------------------------------------
        entry['paused'] = False
        return self._traceFunc
    
    def _showLocals(self, ident, frameNum):
        for threadEntry in self._threads.values():
            if threadEntry['ident'] != ident:
                continue
            currentFrame = threadEntry['frame']
            currentFrameNum = 0
            while frameNum != currentFrameNum and currentFrame:
                currentFrameNum = currentFrameNum + 1
                currentFrame = currentFrame.f_back
            if currentFrame == None:
                self._sendDbgMessage('%s: %s has no frame %s' % (self._messages.SYNTAX_ERROR, ident, frameNum))
            else:
                self._sendDbgMessage(self._messages.LOCALS)
                # TODO: do own display
                self._sendDbgMessage(repr(currentFrame.f_locals))
            break
        else:
            self._sendDbgMessage('%s: invalid ident %s' % (self._messages.SYNTAX_ERROR, ident))
    
    def _showInfo(self):
        self._sendDbgMessage(self._messages.INFORMATION)
        self._sendDbgMessage("Threads: %i" % len(self._threads))
        for threadEntry in self._threads.values():
            numFrames = 0
            stackFrame = threadEntry['frame']
            while stackFrame:
                numFrames = numFrames + 1
                stackFrame = stackFrame.f_back
            self._sendDbgMessage("  thread %i frames %i %s:" % (threadEntry['ident'], numFrames, " paused" if threadEntry['paused'] else 'running'))
            self._sendDbgMessage("    file: %s" % threadEntry['frame'].f_code.co_filename)
            self._sendDbgMessage("    line: %i" % threadEntry['frame'].f_lineno)
            self._sendDbgMessage("    function: %s" % threadEntry['frame'].f_code.co_name)
    
    def _checkFileBreakpoints(self, file, lines):
        """ test all waiting breakpoints for file """
        unconfirmed = set()
        for bp_line in self._breakpointsWait[file]:
            if bp_line in lines:
                self._confirmBreakpoint(file, bp_line)
            else:
                unconfirmed.add(bp_line)
        self._breakpointsWait[file] = unconfirmed
    
    def _testBreakpoint(self, bp_file, bp_line):
        """ test breakpoint """
        for funcLines in self._lines[bp_file].values():
            if bp_line in funcLines:
                return True
        return False
    
    def _confirmBreakpoint(self, bp_file, bp_line):
        """ add to confirmed """
        self._sendDbgMessage("%s %s %i " % (self._messages.BP_CONFIRM, bp_file, bp_line))
        self._breakpointsConfirmed[bp_file].add(bp_line)

    def _waitBreakpoint(self, bp_file, bp_line):
        """ add for waiting """
        self._sendDbgMessage("%s %s %i " % (self._messages.BP_WAIT, bp_file, bp_line))
        self._breakpointsWait[bp_file].add(bp_line)

    def _parseBp(self, cmd):
        if cmd.startswith(self._commands.BP_SET):
            try:
                cmd, bp_file, bp_line = cmd.split()
                self._setBp(bp_file, int(bp_line))
            except Exception as ex:
                self._sendDbgMessage(repr(ex))
        elif cmd.startswith(self._commands.BP_RESET):
            try:
                bp_args = cmd.split()
                if len(bp_args) == 1:
                    self._resetBp(None, None)
                elif len(bp_args) == 2:
                    cmd, bp_file = bp_args
                    self._resetBp(bp_file, None)
                else:
                    cmd, bp_file, bp_line = bp_args
                    self._resetBp(bp_file, int(bp_line))
            except Exception as ex:
                self._sendDbgMessage(repr(ex))

    def _setBp(self, bp_file, bp_line):
        if self._testBreakpoint(bp_file, bp_line):
            self._confirmBreakpoint(bp_file, bp_line)
        else:
            self._waitBreakpoint(bp_file, bp_line)

    def _resetBp(self, bp_file, bp_line):
        if bp_file:
            if bp_file in self._breakpointsWait:
                if bp_line != None:
                    self._breakpointsWait[bp_file].discard(bp_line)
                    self._sendDbgMessage("%s %s %i" % (self._messages.BP_RESET, bp_file, bp_line))
                else:
                    self._breakpointsWait[bp_file].clear()
                    self._sendDbgMessage("%s %s" % (self._messages.BP_RESET, bp_file))
            if bp_file in self._breakpointsConfirmed:
                if bp_line != None:
                    self._breakpointsConfirmed[bp_file].discard(bp_line)
                    self._sendDbgMessage("%s %s %i" % (self._messages.BP_RESET, bp_file, bp_line))
                else:
                    self._breakpointsConfirmed[bp_file].clear()
                    self._sendDbgMessage("%s %s" % (self._messages.BP_RESET, bp_file))
        else:
            self._breakpointsWait.clear()
            self._breakpointsConfirmed.clear()
            self._sendDbgMessage(self._messages.BP_RESET)

    def _changeLocalVar(self, frame, varName, newValue):
        frame.f_locals.update({
            varName: newValue,
        })
        self._changeLocals(self._Obj(frame), self._Int(0))

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
