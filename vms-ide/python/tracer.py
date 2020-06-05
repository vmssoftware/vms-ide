import ctypes
import signal
import socket
import sys
import threading
import time
import os.path
import collections
import base64
import re

# settings
class SETTINGS:
    HOST = '127.0.0.1'
    PORT = 54326
# messages to send
class MESSAGE:
    AMEND = 'AMEND'
    BP_CONFIRM = 'BP_CONFIRM'
    BP_RESET = 'BP_RESET'
    BP_WAIT = 'BP_WAIT'
    BREAK = 'BREAK'
    CONTINUED = 'CONTINUED'
    DEBUG = 'DEBUG'
    DEVELOPER = 'DEVELOPER'
    DISPLAY = 'DISPLAY'
    DISPLAY64 = 'DISPLAY64'
    ENTRY = 'ENTRY'
    EXCEPTION = 'EXCEPTION'
    EXECUTE = 'EXECUTE'
    EXITED = 'EXITED'
    GOTO = 'GOTO'
    GOTO_TARGETS = 'GOTO_TARGETS'
    INFO = 'INFO'
    PAUSED = 'PAUSED'
    SIGNAL = 'SIGNAL'
    STEPPED = 'STEPPED'
    SYNTAX_ERROR = 'SYNTAX_ERROR'
    THREADS = 'THREADS'
    RADIX = 'RADIX'
    PATHFILTER = 'PATHFILTER'

# command to receive
class COMMAND:
    AMEND = 'a'             # a ident frame name value
    BP_RESET = 'bpr'        # bpr [file [line]]
    BP_SET = 'bps'          # bps file line
    CONTINUE = 'c'
    DISPLAY = 'd'           # d[h] [ident [frame [fullName [start [count]]]]]   // frame is zero-based
    EXEC = 'e'              # e expression                                      // execute expression in the current frame
    FRAME  = 'f'            # f [ident [frameStart [frameNum]]]                 // frame is zero-based
    GOTO = 'g'              # g ident line
    GOTO_TARGETS = 'gt'     # gt file line  // test if we can go to target from current place
    INFO = 'i'
    MODE = 'm'              # m [0|1]       // user | developer
    NEXT = 'n'              # n [ident]     // step over
    PAUSE = 'p'
    RETURN = 'r'            # r [ident]     // step out
    STEP = 's'              # s [ident]     // step in
    THREADS = 't'
    RADIX = 'x'             # x [10|16]     // default 10
    PATHFILTER = 'y'        # y [path]      // always trace this path

class Tracer:
    def __init__(self, port, insensitive=False, developerMode=False):
        self._insensitive = insensitive
        # self._postDebugMessage = None
        self._showHex = False
        self._developerMode = developerMode
        self._pathFilter = ''
        self._re_compile = re.compile
        self._co_lnotab_signed = sys.version_info.major >= 3 and sys.version_info.minor >= 6
        self._knownValueTypes = [int, str, float, bool, complex, type(None)]
        self._port = port
        self._fileName = __file__
        self._socket = None
        self._sendBuffer = b''
        self._recvBuffer = b''
        self._oldSysTrace = None
        self._paused = False
        self._fileWaitingFor = None
        self._startTracing = False
        self._originalSigint = None
        self._originalSigbreak = None
        self._threads = {}                                          # thread enrties by [thread id]
        self._mainThread = None
        self._steppingThread = None
        self._steppingLevel = None
        self._breakpointsConfirmed = collections.defaultdict(set)   # confirmed break line list by [file name]
        self._breakpointsWait = collections.defaultdict(set)        # wait break line list by [file name]
        self._lines = collections.defaultdict(dict)                 # all usable line list by [file name [ function name ]]
        # self._files = set()
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
        self._b64decode = base64.b64decode
        self._b64encode = base64.b64encode
        # DEBUG
        # self._enter_counter = 0

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
        self._sendDbgMessage(self._messages.SIGNAL + ':' + str(signum))
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
                idx = self._recvBuffer.find(b'\n')
                if idx >= 0:
                    line = self._recvBuffer[:idx].decode()
                    self._recvBuffer = self._recvBuffer[idx+1:]
                    return line
        return None

    def _processFile(self, fileName):
        if self._developerMode:
            # tracer in developer mode
            # self._sendDbgMessage('=== in developer mode')
            return True
        if self._pathFilter and fileName.startswith(self._pathFilter):
            # file in filtered folder
            # self._sendDbgMessage('=== in filtered folder')
            return True
        if fileName in self._breakpointsConfirmed.keys() and len(self._breakpointsConfirmed[fileName]) > 0:
            # file has confirmed breakpoint
            # self._sendDbgMessage('=== in _breakpointsConfirmed')
            return True
        if fileName in self._breakpointsWait.keys() and len(self._breakpointsWait[fileName]) > 0:
            # file has waiting breakpoint
            # self._sendDbgMessage('=== in _breakpointsWait')
            return True
        if fileName.startswith("/") or fileName.startswith('<'):
            return False
        # self._sendDbgMessage('=== in local folder')
        return True

    def _traceFunc(self, frame, event, arg):
        """ Do not forget not sending any data without locking (but ENTRY) """

        # self._enter_counter = self._enter_counter + 1

        # wait until tracing enabled
        if not self._startTracing:
            if not self._fileWaitingFor:
                return None
            return self._traceFunc

        currentFile = self.canonizeFile(frame.f_code.co_filename)
        # if not currentFile in self._files:
        #     self._files.add(currentFile)
            # self._sendDbgMessage('NEW FILE: %s' % currentFile)

        # skip this file tracer.py
        if currentFile == self._fileName:
            if not self._fileWaitingFor:
                return None
            return self._traceFunc

        # skip system files or strings
        if not self._processFile(currentFile):
            if not self._fileWaitingFor:
                return None
            return self._traceFunc

        # wait until tracing file entered
        if self._fileWaitingFor:
            if self._fileWaitingFor != currentFile:
                return self._traceFunc
            # now we are ready to trace
            self._fileWaitingFor = None
            # autopause
            self._sendDbgMessage(self._messages.ENTRY)
            self._paused = True

        # take an ident
        ident = self._currentThread().ident
        if self._mainThread == None:
            self._mainThread = ident

        # create current entry
        entry = {'ident': ident, 'frame': frame, 'event': event, 'arg': arg, 'paused': True, 'level': 0, 'exception': None, 'traceback': None }
        if ident in self._threads:
            # get previous entry information from dictionary
            entry['level'] = self._threads[ident]['level']
            entry['exception'] = self._threads[ident]['exception']
            entry['traceback'] = self._threads[ident]['traceback']
        # save entry to dictionary
        self._threads[ident] = entry

        # frame level tracking
        if event == 'call':
            entry['level'] = entry['level'] + 1
        if event == 'return':
            entry['level'] = entry['level'] - 1

        # clear exception info if it is already handled
        if event not in ['exception', 'return']:
            entry['exception'] = None
            entry['traceback'] = None

        with self._lockTrace:
            # point of tracing
            # if event != 'line':
            #     self._sendDbgMessage('EVENT: %s' % event)
            if event == 'call':
                # test if that function not in list
                code_name = frame.f_code.co_name + ":" + str(frame.f_lineno)
                code_lines = self._linesByFile(currentFile)
                # self._sendDbgMessage('CALLED: %s %s' % (currentFile, code_name))
                if code_name not in code_lines:
                    # self._sendDbgMessage('not in lines')
                    # collect usable code lines
                    lines = []
                    lineno = frame.f_lineno
                    lines.append(lineno)
                    tail = frame.f_code.co_lnotab
                    while len(tail) > 1:
                        line_incr = tail[1]
                        tail = tail[2:]
                        if line_incr:
                            if isinstance(line_incr, str):
                                line_incr = ord(line_incr)
                            if self._co_lnotab_signed:
                                if line_incr > 127:
                                    line_incr = line_incr - 256
                            lineno += line_incr
                            lines.append(lineno)
                    code_lines[code_name] = sorted(lines)
                    self._checkFileBreakpoints(currentFile, lines)
                    # self._sendDbgMessage('NEW FRAME: %s %s %s' % (currentFile, frame.f_code.co_name, repr(lines)))

            # examine exception and save it
            if event == 'exception':
                entry['exception'] = arg[1]
                entry['traceback'] = arg[2]
                # for testing purpose => always stop
                # self._sendDbgMessage(self._messages.EXCEPTION + ' ' + repr(entry['exception']))
                # self._paused = True

            # pause on unhandled exception
            if entry['exception'] != None and entry['level'] <= 0:
                self._sendDbgMessage(self._messages.EXCEPTION + ' ' + repr(entry['exception']))
                self._paused = True

            # examine breakpoint
            bp_file = currentFile.lower() if self._insensitive else currentFile
            if not self._paused and frame.f_lineno in self._breakpointsConfirmed[bp_file]:
                self._sendDbgMessage(self._messages.BREAK)
                # self._sendDbgMessage('_COUNTER_ ' + repr(self._enter_counter) + '\n')
                self._paused = True

            # tests runtime commands
            cmd = self._readDbgMessage()
            while cmd:
                if cmd == self._commands.PAUSE:
                    if not self._paused:
                        self._sendDbgMessage(self._messages.PAUSED)
                        # self._sendDbgMessage('_COUNTER_ ' + repr(self._enter_counter) + '\n')
                    self._paused = True
                elif cmd == self._commands.INFO:
                    self._showInfo(ident)
                # breakpoints
                elif cmd.startswith(self._commands.BP_SET):
                    self._doSetBreakPoint(cmd)
                elif cmd.startswith(self._commands.BP_RESET):
                    self._doResetBreakPoint(cmd)
                cmd = self._readDbgMessage()

            # test stepping
            if not self._paused and self._steppingThread == ident and (self._steppingLevel == None or self._steppingLevel >= entry['level'] and event != 'return'):
                self._steppingThread = None
                self._steppingLevel = None
                self._paused = True
                self._sendDbgMessage(self._messages.STEPPED)
                # self._sendDbgMessage('_COUNTER_ ' + repr(self._enter_counter) + '\n')

            # pause loop
            while self._paused and self._isConnected():
                if cmd:
                    # continue
                    if cmd == self._commands.CONTINUE:
                        self._doContinue()
                        break   # break pause loop
                    # step
                    elif cmd.startswith(self._commands.STEP) or cmd.startswith(self._commands.NEXT) or cmd.startswith(self._commands.RETURN):
                        self._doStepping(cmd, ident, entry)
                        break   # break pause loop
                    # show threads
                    elif cmd == self._commands.THREADS:
                        self._showThreads(ident)
                    # change variable
                    elif cmd.startswith(self._commands.AMEND):
                        self._doAmend(cmd)
                    # show frames
                    elif cmd.startswith(self._commands.FRAME):
                        self._doFrames(cmd, ident)
                    # display variable
                    elif cmd.startswith(self._commands.DISPLAY):
                        self._doDisplay(cmd, ident)
                    # information (unused)
                    elif cmd == self._commands.INFO:
                        self._showInfo(ident)
                    # breakpoints
                    elif cmd.startswith(self._commands.BP_SET):
                        self._doSetBreakPoint(cmd)
                    elif cmd.startswith(self._commands.BP_RESET):
                        self._doResetBreakPoint(cmd)
                    elif cmd.startswith(self._commands.GOTO_TARGETS):
                        self._doGotoTargets(cmd, ident)
                    elif cmd.startswith(self._commands.GOTO):
                        self._doGoto(cmd)
                    elif cmd.startswith(self._commands.MODE):
                        self._doMode(cmd)
                    # show threads
                    elif cmd.startswith(self._commands.RADIX):
                        self._setRadix(cmd)
                    elif cmd.startswith(self._commands.PATHFILTER):
                        self._setFilter(cmd)
                    elif cmd.startswith(self._commands.EXEC):
                        self._execExpression(cmd, ident)
                # wait and read command again
                self._sleep(0.3)
                cmd = self._readDbgMessage()
            # ---------------------------------------------
        entry['paused'] = False
        if entry['level'] <= 0:
            # last line in this thread
            del self._threads[ident]
            if entry['exception'] != None:
                # unhandled exception
                if ident == self._mainThread:
                    self._sendDbgMessage(self._messages.EXITED)
                raise SystemExit()
        return self._traceFunc

    def canonizeFile(self, fileName):
        if fileName.startswith('./'):
            return fileName[2:]
        return fileName

    def _doGoto(self, cmd):
        locals_args = cmd.split()
        try:
            ident = int(locals_args[1])
            nextLine = int(locals_args[2])
            currFrame, isPostMortem = self._getFrame(ident, 0)
            isPostMortem = isPostMortem
            if currFrame != None:
                currFrame.f_lineno = nextLine
                self._sendDbgMessage('%s %s' % (self._messages.GOTO, 'ok'))
                # self._doStepping('s %i' % ident, ident, self._threads[ident])
        except Exception as ex:
            self._sendDbgMessage('%s %s %s' % (self._messages.GOTO, 'failed', repr(ex)))

    def _setRadix(self, cmd):
        locals_args = cmd.split()
        try:
            self._showHex = (16 == int(locals_args[1]))
            self._sendDbgMessage('%s %s' % (self._messages.RADIX, 'hex' if self._showHex else 'dec'))
        except Exception as ex:
            self._sendDbgMessage('%s %s %s' % (self._messages.RADIX, 'failed', repr(ex)))

    def _setFilter(self, cmd):
        try:
            self._pathFilter = cmd[2:].strip()
            self._sendDbgMessage('%s %s %s' % (self._messages.PATHFILTER, 'set', repr(self._pathFilter)))
        except Exception as ex:
            self._sendDbgMessage('%s %s %s' % (self._messages.PATHFILTER, 'failed', repr(ex)))

    def _execExpression(self, cmd, ident):
        try:
            expression = cmd[2:].strip()
            frame, isPostMortem = self._getFrame(ident, 0)
            isPostMortem = isPostMortem
            if frame != None:
                exec(expression, globals(), frame.f_locals)
        except Exception as ex:
            self._sendDbgMessage('%s %s %s' % (self._messages.EXECUTE, 'failed', repr(ex)))

    def _doGotoTargets(self, cmd, ident):
        locals_args = cmd.split()
        try:
            frame = self._threads[ident]['frame']
            code_file = self.canonizeFile(frame.f_code.co_filename)
            gotoFile = locals_args[1]
            if self._insensitive:
                gotoFile = gotoFile.lower()
                code_file = code_file.lower()
            if code_file == gotoFile:
                gotoLine = int(locals_args[2])
                currentLine = frame.f_lineno
                for _, code_lines in self._linesByFile(gotoFile).items():
                    if currentLine in code_lines and gotoLine in code_lines:
                        self._sendDbgMessage('%s ok' % self._messages.GOTO_TARGETS)
                        return
        except Exception as ex:
            self._sendDbgMessage('%s failed %s' % (self._messages.GOTO_TARGETS, repr(ex)))
            return
        self._sendDbgMessage('%s failed' % self._messages.GOTO_TARGETS)

    def _doDisplay(self, cmd, ident):
        locals_args = cmd.split()
        showHex = True if locals_args[0].endswith('h') else self._showHex
        if len(locals_args) == 1:
            self._display(ident, 0, '.', None, None, showHex)
        elif len(locals_args) == 2:
            self._display(int(locals_args[1]), 0, '.', None, None, showHex)
        elif len(locals_args) == 3:
            self._display(int(locals_args[1]), int(locals_args[2]), '.', None, None, showHex)
        elif len(locals_args) == 4:
            self._display(int(locals_args[1]), int(locals_args[2]), locals_args[3], None, None, showHex)
        elif len(locals_args) == 5:
            self._display(int(locals_args[1]), int(locals_args[2]), locals_args[3], int(locals_args[4]), None, showHex)
        elif len(locals_args) == 6:
            self._display(int(locals_args[1]), int(locals_args[2]), locals_args[3], int(locals_args[4]), int(locals_args[5]), showHex)

    def _doFrames(self, cmd, ident):
        locals_args = cmd.split()
        if len(locals_args) == 1:
            self._showFrame(ident, None, None)                          # all frames in current ident
        elif len(locals_args) == 2:
            self._showFrame(int(locals_args[1]), None, None)            # all frames in given ident
        elif len(locals_args) == 3:
            self._showFrame(int(locals_args[1]), int(locals_args[2]), 1) # one given frame in given ident
        elif len(locals_args) == 4:
            self._showFrame(int(locals_args[1]), int(locals_args[2]), int(locals_args[3])) # given amount of frames starting given frame in given ident

    def _doAmend(self, cmd):
        sep = ' '
        cmd, sep, tail = cmd.partition(sep)
        aIdent, sep, tail = tail.partition(sep)
        aFrame, sep, tail = tail.partition(sep)
        aName, sep, aValue = tail.partition(sep)
        self._amend(int(aIdent), int(aFrame), aName, aValue)

    def _doContinue(self):
        if self._paused:
            self._sendDbgMessage(self._messages.CONTINUED)
        self._paused = False
        self._steppingThread = None
        self._steppingLevel = None

    def _doStepping(self, cmd, ident, entry):
        locals_args = cmd.split()
        if len(locals_args) == 1:
            self._steppingThread = ident
        elif len(locals_args) == 2:
            self._steppingThread = int(locals_args[1])
        self._steppingLevel = None
        if cmd.startswith(self._commands.NEXT):
            self._steppingLevel = entry['level']
        elif cmd.startswith(self._commands.RETURN):
            self._steppingLevel = entry['level'] - 1
        self._paused = False
        self._sendDbgMessage(self._messages.CONTINUED)

    def _doMode(self, cmd):
        locals_args = cmd.split()
        if len(locals_args) == 1:
            self._developerMode = False
        elif len(locals_args) == 2:
            self._developerMode = str(locals_args[1]).lower() in ['true', '1', 't', 'y', 'yes', 'yeah', 'yup', 'certainly', 'uh-huh']
        self._sendDbgMessage(self._messages.DEVELOPER + ' ' + str(self._developerMode))

    def _numFrames(self, entry):
        numFrames = 0
        if entry['traceback'] == None or entry['level'] > 0:
            frame = entry['frame']
            while frame:
                if self._isDebuggerFrame(frame):
                    frame = None
                    break
                numFrames = numFrames + 1
                frame = frame.f_back
        else:
            trace = entry['traceback']
            while trace:
                numFrames = numFrames + 1
                trace = trace.tb_next
        return numFrames

    def _showInfo(self, ident):
        self._sendDbgMessage(self._messages.INFO)
        self._sendDbgMessage('Main: %i' % self._mainThread)
        self._sendDbgMessage('Where: %i' % ident)
        self._sendDbgMessage('Threads: %i' % len(self._threads))
        for threadEntry in self._threads.values():
            if threadEntry['exception'] != None and threadEntry['level'] <= 0:
                # post-mortem info
                self._sendDbgMessage('  thread %i unhandled exception:' % threadEntry['ident'])
            else:
                # runing info
                self._sendDbgMessage('  thread %i frames %i %s:' % (
                        threadEntry['ident'],
                        self._numFrames(threadEntry),
                        'paused' if threadEntry['paused'] else 'running' ))
                self._sendDbgMessage('    file: "%s"' % self.canonizeFile(threadEntry['frame'].f_code.co_filename))
                self._sendDbgMessage('    line: %i' % threadEntry['frame'].f_lineno)
                self._sendDbgMessage('    function: "%s"' % threadEntry['frame'].f_code.co_name)

    def _getFrame(self, ident, frameNum):
        for entry in self._threads.values():
            if entry['ident'] != ident:
                continue
            if entry['traceback'] == None or entry['level'] > 0:
                currentFrame = entry['frame']
                currentFrameNum = 0
                while frameNum != currentFrameNum and currentFrame:
                    if self._isDebuggerFrame(currentFrame):
                        currentFrame = None
                        break
                    currentFrameNum = currentFrameNum + 1
                    currentFrame = currentFrame.f_back
                # check if given frame isn't debugger frame
                if self._isDebuggerFrame(currentFrame):
                    currentFrame = None
                if currentFrame == None:
                    self._sendDbgMessage('%s: %s has no frame %s' % (self._messages.SYNTAX_ERROR, ident, frameNum))
                    return (None, False)
                else:
                    return (currentFrame, False)
                break
            else:
                frames = []
                trace = entry['traceback']
                while trace:
                    frames.append(trace.tb_frame)
                    trace = trace.tb_next
                if len(frames) > frameNum:
                    return (frames[len(frames) - frameNum - 1], True)
        else:
            self._sendDbgMessage('%s: invalid ident %s' % (self._messages.SYNTAX_ERROR, ident))
        return (None, False)

    def _eval_variable(self, name, root):
        idxStart = name.find('[')
        if idxStart < 0:
            return eval(name, {}, root)
        #get head
        if idxStart:
            head = name[:idxStart]
            head = eval(head, {}, root)
        else:
            head = root
        # get idx name
        idxEnd = name.find("]", idxStart)
        idx = name[idxStart+1:idxEnd]
        # get tail
        tail = name[idxEnd+1:]
        # find a value by idx
        result = None
        if type(head) == dict:
            idx = self._b64decode(idx).decode('utf-8')
            for _, (k, v) in enumerate(head.items()):
                if repr(k) == idx:
                    result = v
                    break
        else:
            result = head[int(idx)]
        if tail and result != None:
            if tail.startswith('['):
                return self._eval_variable(tail, result)
            elif tail.startswith('.'):
                return self._eval_variable(tail[1:], result.__dict__)
        return result

    def _amend_impl(self, name, value, frame):
        if not any((c in ".[]") for c in name):
            self._changeLocalVar(frame, name, value)
        else:
            if name.endswith(']'):
                brkPos = name.rfind('[')
                head = self._eval_variable(name[:brkPos], frame.f_locals)
                idx  = name[brkPos+1:-1]
                if type(head) == dict:
                    try:
                        idx = self._b64decode(idx).decode('utf-8')
                    except:
                        pass
                    for _, (k, _) in enumerate(head.items()):
                        if repr(k) == idx:
                            head[k] = value
                            break
                else:
                    head[int(idx)] = value
            else:
                dotPos = name.rfind('.')
                if dotPos > 0:
                    head = self._eval_variable(name[:dotPos], frame.f_locals)
                    try:
                        head.__dict__.update({
                            name[dotPos+1:]: value,
                        })
                        # head.__dict__[name[dotPos+1:]] = value
                        testValue = head.__dict__[name[dotPos+1:]]
                        if value != testValue:
                            self._sendDbgMessage('_amend_impl value != testValue')
                    except Exception as ex:
                        self._sendDbgMessage('_amend_impl head.__dict__ exception %s' % str(ex))
                else:
                    self._sendDbgMessage('_amend_impl has no dot')
        return

    def _amend(self, ident, frameNum, name, value):
        frame, isPostMortem = self._getFrame(ident, frameNum)
        if isPostMortem:
            self._sendDbgMessage('%s failed Cannot amend post-mortem frames' % self._messages.AMEND)
            return
        if frame != None:
            try:
                value = eval(value, {}, {})
                self._amend_impl(name, value, frame)
                result = self._eval_variable(name, frame.f_locals)
                resultType = type(result)
                if resultType in self._knownValueTypes:
                    # if we know that is valueType, return it
                    if resultType == int and self._showHex:
                        self._sendDbgMessage('%s ok %s = %s' % (self._messages.AMEND, resultType, hex(result)))
                    else:
                        self._sendDbgMessage('%s ok %s = %s' % (self._messages.AMEND, resultType, repr(result)))
                    return
                else:
                    try:
                        # in first try to get length of value (test if it is enumerable)
                        length = len(result)
                        self._sendDbgMessage('%s ok %s [%s]' % (self._messages.AMEND, resultType, length))
                    except:
                        self._sendDbgMessage('%s ok %s' % (self._messages.AMEND, resultType))
                return
            except Exception as ex:
                self._sendDbgMessage('%s failed %s' % (self._messages.AMEND, str(ex)))
                return
        self._sendDbgMessage('%s failed Invalid frame' % self._messages.AMEND)

    def _sendDisplayResult(self, result):
        result = self._b64encode(result.encode()).decode()
        self._sendDbgMessage('%s %s %s' % (self._messages.DISPLAY64, len(result), result))

    def _display(self, ident, frameNum, fullName, start, count, showHex):
        # self._sendDbgMessage('_display %s' % fullName)
        frame, isPostMortem = self._getFrame(ident, frameNum)
        isPostMortem = isPostMortem
        if frame != None:
            try:
                if fullName.endswith('.'):
                    displayChildren = True
                    fullName = fullName[:-1]
                    displayName = fullName
                else:
                    displayChildren = False
                    displayName = fullName.rpartition('.')[2]
                if fullName:
                    # we have a name - get its value
                    result = self._eval_variable(fullName, frame.f_locals)
                    resultType = type(result)
                    if resultType in self._knownValueTypes:
                        # if we know that is valueType, display it
                        if resultType == int and showHex:
                            self._sendDisplayResult('"%s" %s value: %s' % (displayName, resultType, hex(result)))
                        else:
                            self._sendDisplayResult('"%s" %s value: %s' % (displayName, resultType, repr(result)))
                        return
                    else:
                        try:
                            # in first try to get length of value (test if it is enumerable)
                            length = len(result)
                            # we have a length, so test given start and count
                            if start != None:
                                # go through indexed children
                                if start < length:
                                    if count == None or start + count > length:
                                        count = length - start
                                    self._sendDisplayResult('"%s" %s length: %s' % (displayName, resultType, count))
                                    # enumerate through, cutting displayName
                                    # self._sendDbgMessage('_display fullName=%s' % fullName)
                                    displayName = fullName.rpartition('.')[2]
                                    # self._sendDbgMessage('_display displayName=%s' % displayName)
                                    enumerated = enumerate(iter(result))
                                    # self._sendDbgMessage('_display enumerated=%s' % repr(enumerated))
                                    for x in enumerated:
                                        if start > 0:
                                            # wait a start
                                            start = start - 1
                                            continue
                                        if count > 0:
                                            # until count
                                            idx, value = x
                                            if type(result) == dict:
                                                idx = repr(value)
                                                value = result[value]
                                            resultType = type(value)
                                            if resultType in self._knownValueTypes:
                                                if resultType == int and showHex:
                                                    self._sendDisplayResult('"%s" %s value: %s' % (displayName + ('[%s]' % idx), resultType, hex(value)))
                                                else:
                                                    self._sendDisplayResult('"%s" %s value: %s' % (displayName + ('[%s]' % idx), resultType, repr(value)))
                                            else:
                                                try:
                                                    length = len(value)
                                                    self._sendDisplayResult('"%s" %s length: %s' % (displayName + ('[%s]' % idx), resultType, length))
                                                except:
                                                    children = dir(value)
                                                    self._sendDisplayResult('"%s" %s children: %s' % (displayName + ('[%s]' % idx), resultType, len(children)))
                                            count = count - 1
                                        else:
                                            break
                                    # enumerated all
                                    if count:
                                        self._sendDisplayResult('"%s" aborted There are %s elements missed' % (displayName, repr(count)))
                                    return
                                else:
                                    # have no corresponding children
                                    self._sendDisplayResult('"%s" %s length: 0' % (displayName, resultType))
                                    return
                            else:
                                # no start, just return length of children
                                self._sendDisplayResult('"%s" %s length: %s' % (displayName, resultType, length))
                                return
                        except:
                            children = dir(result)
                else:
                    # localc
                    resultType = "<type '-locals-'>"
                    children = frame.f_locals
                    displayChildren = True
                # test if variable has at least children
                self._sendDisplayResult('"%s" %s children: %s' % (displayName, resultType, len(children)))
                if displayChildren:
                    for childName in children:
                        self._display(ident, frameNum, (fullName + '.' if fullName else '') + childName, None, None, showHex)
            except Exception as ex:
                self._sendDisplayResult('"%s" failed: %s' % (displayName, repr(ex)))

    def _isDebuggerFrame(self, frame):
        return frame and self.canonizeFile(frame.f_code.co_filename) == self._fileName and frame.f_code.co_name == "_runscript"

    def _showThreads(self, ident):
        self._sendDbgMessage(self._messages.THREADS + (' %i current %i' % (len(self._threads), ident)))
        for threadEntry in self._threads.values():
            self._sendDbgMessage('thread %i frames %i is %s' % (
                    threadEntry['ident'],
                    self._numFrames(threadEntry),
                    'paused' if threadEntry['paused'] else 'running' ))

    def _showFrame(self, ident, frameStart, numFrames):
        if frameStart == None:
            frameStart = 0
        frame, isPostMortem = self._getFrame(ident, frameStart)
        frameNum = 0
        while frame != None and frameNum != numFrames:
            if self._isDebuggerFrame(frame):
                break
            self._sendDbgMessage('file: "%s" line: %i function: "%s" %s' % (self.canonizeFile(frame.f_code.co_filename), frame.f_lineno, frame.f_code.co_name, 'dead' if isPostMortem else 'alive' ))
            frameNum = frameNum + 1
            frame = frame.f_back

    def _checkFileBreakpoints(self, bp_file, lines):
        """ test all waiting breakpoints for file """
        unconfirmed = set()
        bp_file = bp_file.lower() if self._insensitive else bp_file
        for bp_line in self._breakpointsWait[bp_file]:
            if bp_line in lines:
                self._confirmBreakpoint(bp_file, bp_line, None)
            else:
                confirmed = False
                # if bp at the non-code line between adjacent real-code lines
                if bp_line > lines[0] and bp_line < lines[-1]:
                    for i in range(len(lines) - 1):
                        if bp_line < lines[i+1]:
                            if lines[i+1] - lines[i] < 3:
                                self._confirmBreakpoint(bp_file, bp_line, lines[i])
                                confirmed = True
                            break
                if not confirmed:
                    unconfirmed.add(bp_line)
        self._breakpointsWait[bp_file] = unconfirmed

    def _linesByFile(self, file):
        if self._insensitive and self._lines:
            file = file.lower()
            for key, value in self._lines.items():
                if key.lower() == file:
                    return value
        return self._lines[file]

    def _testBreakpoint(self, bp_file, bp_line):
        """ test breakpoint """
        for funcLines in self._linesByFile(bp_file).values():
            if bp_line in funcLines:
                return True
        return False

    def _confirmBreakpoint(self, bp_file, bp_line, bp_line_real):
        """ add to confirmed """
        if bp_line_real != None:
            self._sendDbgMessage(self._messages.BP_CONFIRM + (' "%s" %i %i' % (bp_file, bp_line, bp_line_real)))
            self._breakpointsConfirmed[bp_file].add(bp_line_real)
        else:
            self._sendDbgMessage(self._messages.BP_CONFIRM + (' "%s" %i' % (bp_file, bp_line)))
            self._breakpointsConfirmed[bp_file].add(bp_line)

    def _waitBreakpoint(self, bp_file, bp_line):
        """ add for waiting """
        self._sendDbgMessage(self._messages.BP_WAIT + (' "%s" %i' % (bp_file, bp_line)))
        self._breakpointsWait[bp_file].add(bp_line)

    def _doSetBreakPoint(self, cmd):
        try:
            cmd, bp_file, bp_line = cmd.split()
            self._setBp(bp_file, int(bp_line))
        except Exception as ex:
            self._sendDbgMessage(self._messages.EXCEPTION + ' ' + repr(ex))

    def _doResetBreakPoint(self, cmd):
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
            self._sendDbgMessage(self._messages.EXCEPTION + ' ' + repr(ex))

    def _setBp(self, bp_file, bp_line):
        bp_file = bp_file.lower() if self._insensitive else bp_file
        if self._testBreakpoint(bp_file, bp_line):
            self._confirmBreakpoint(bp_file, bp_line, None)
        else:
            self._waitBreakpoint(bp_file, bp_line)

    def _resetBp(self, bp_file, bp_line):
        if bp_file:
            bp_file = bp_file.lower() if self._insensitive else bp_file
            if bp_line != None:
                self._breakpointsWait[bp_file].discard(bp_line)
                self._breakpointsConfirmed[bp_file].discard(bp_line)
                self._sendDbgMessage(self._messages.BP_RESET + (' "%s" %i' % (bp_file, bp_line)))
            else:
                del self._breakpointsWait[bp_file]
                del self._breakpointsConfirmed[bp_file]
                self._sendDbgMessage(self._messages.BP_RESET + (' "%s"' % bp_file))
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
        sys.path.insert(0, '.')      # add cwd
        # === Given from PDB.PY ===
        import __main__
        builtinsT = __builtins__
        __main__.__dict__.clear()
        __main__.__dict__.update({'__name__'    : '__main__',
                                  '__file__'    : filename,
                                  '__builtins__': builtinsT,
                                 })
        self._fileWaitingFor = filename
        globalsT = __main__.__dict__
        try:
            # self._sendDbgMessage('PATH: %s' % repr(sys.path))
            with open(filename, 'rb') as fp:
                statement = "exec(compile(%r, %r, 'exec'))" % (fp.read(), filename)
            self._startTracing = True
            exec(statement, globalsT, globalsT)
        except Exception as ex:
            if self._isConnected():
                self._sendDbgMessage(self._messages.EXCEPTION + ' ' + repr(ex))
            else:
                print(repr(ex))

    def run(self, filename):
        self._setupTrace()
        self._runscript(filename)
        self._cleanupTrace()

#===================================================================

if __name__ == '__main__':

    _usage = """\
usage: tracer.py -p port [-d] [-i] pyfile [arg] ...

Debug the Python program given by pyfile."""

    import getopt

    opts, args = getopt.getopt(sys.argv[1:], 'hp:di', ['help','port='])

    if not args:
        print(_usage)
        sys.exit(2)

    developerMode = False
    insensitive = False

    for opt, optarg in opts:
        if opt in ['-h', '--help']:
            print(_usage)
            sys.exit()
        elif opt in ['-p', '--port']:
            SETTINGS.PORT = int(optarg)
        elif opt in ['-d']:
            developerMode = True
        elif opt in ['-i']:
            insensitive = True
        else:
            print('Unknown option %s' % opt)

    sys.argv = args

    tracer = Tracer(SETTINGS.PORT, developerMode=developerMode, insensitive=insensitive)
    tracer.run(args[0])
