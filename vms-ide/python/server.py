import sys
import socket
import select
import threading
import time

# settings
class SETTINGS:
    HOST = '127.0.0.1'
    PORT = 54326

class TYPE:
    CONSOLE = 'CONSOLE'
    DEBUG = 'DEBUG'

# messages
class MESSAGE:
    AMENDED = 'AMENDED'
    BP_CONFIRM = 'BP_CONFIRM'
    BP_RESET = 'BP_RESET'
    BP_WAIT = 'BP_WAIT'
    BREAK = 'BREAK'
    CONTINUED = 'CONTINUED'
    DEBUG = 'DEBUG'
    DISPLAY = 'DISPLAY'
    ENTRY = 'ENTRY'
    EXCEPTION = 'EXCEPTION'
    EXITED = 'EXITED'
    INFO = 'INFO'
    PAUSED = 'PAUSED'
    SIGNAL = 'SIGNAL'
    STEPPED = 'STEPPED'
    SYNTAX_ERROR = 'SYNTAX_ERROR'
    THREADS = 'THREADS'

# commands
class COMMAND:
    AMEND = 'a'             # a ident frame name value
    BP_RESET = 'bpr'        # bpr [file [line]]
    BP_SET = 'bps'          # bps file line
    CONTINUE = 'c'
    DISPLAY = 'd'           # d [frameNum [ident [fullName [start [count]]]]]   // frame is zero-based
    FRAME  = 'f'            # f [ident [frameStart [frameNum]]]                 // frame is zero-based
    INFO = 'i'
    NEXT = 'n'              # n [ident]     // step over
    PAUSE = 'p'
    RETURN = 'r'            # r [ident]     // step out
    STEP = 's'              # s [ident]     // step in
    THREADS = 't'
    # server only commands
    QUIT = 'q'
    HELP = 'h'

_helpInfo = """\
    AMEND = 'a'             # a ident frame name value
    BP_RESET = 'bpr'        # bpr [file [line]]
    BP_SET = 'bps'          # bps file line
    CONTINUE = 'c'
    DISPLAY = 'd'           # d [ident [frame [fullName [start [count]]]]]      // frame is zero-based
    FRAME  = 'f'            # f [ident [frameStart [frameNum]]]                 // frame is zero-based
    INFO = 'i'
    NEXT = 'n'              # n [ident]     // step over
    PAUSE = 'p'
    RETURN = 'r'            # r [ident]     // step out
    STEP = 's'              # s [ident]     // step in
    THREADS = 't'
    # server only commands
    QUIT = 'q'
    HELP = 'h'
"""

class Connection:
    def __init__(self, socket):
        self._socket = socket
        self._recvBuffer = b''
        self._sendBuffer = b''
        self._type = None
    
    def getType(self):
        return self._type

    def close(self):
        try:
            self._socket.close()
        except:
            pass
        self._socket = None

    def read(self):
        """ EOL delimited. """
        self._read()
        lines = []
        start = 0
        while True:
            idx = self._recvBuffer.find(b"\n", start)
            if idx == -1:
                break
            line = self._recvBuffer[start:idx].decode()
            # first message is the type
            if not self._type:
                self._type = line
                if self._type == TYPE.DEBUG:
                    # send PAUSE (TODO: make command line option)
                    # autopause
                    self.post(COMMAND.PAUSE)
            elif line:
                lines.append(line)
            start = idx + 1
        self._recvBuffer = self._recvBuffer[start:]
        return lines

    def post(self, line):
        """ One command per line. Add EOL at the and """
        self._sendBuffer += line.encode()
        self._sendBuffer += b'\n'
    
    def write(self):
        self._write()

    def wantRead(self):
        return self._socket

    def wantWrite(self):
        if self._sendBuffer:
            return self._socket
        return None

    def _read(self):
        try:
            data = self._socket.recv(4096)
            if data:
                self._recvBuffer += data
        except:
            pass

    def _write(self):
        if self._sendBuffer:
            try:
                sent = self._socket.send(self._sendBuffer)
                self._sendBuffer = self._sendBuffer[sent:]
            except:
                pass

class DebugServer:
    def __init__(self, port):
        self._port = port
        self._listenSocket = None
        self._connections = None
        self._thread = None
        self._stopped = False

    def start(self):
        if self._thread:
            self.stop()
            self.join()
        self._thread = threading.Thread(target=self._run)
        self._stopped = False
        self._thread.start()
    
    def stop(self):
        self._stopped = True
    
    def join(self):
        if self._thread:
            self._thread.join()

    def isAlive(self):
        return self._thread != None and self._thread.is_alive()
    
    def _run(self):
        self._listenSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        # self._listenSocket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        try:
            self._listenSocket.bind((SETTINGS.HOST, self._port))
            print('listening port %i' % self._port)
        except:
            print('port %i is busy' % self._port)
            sys.exit()

        self._listenSocket.listen(2)
        self._listenSocket.setblocking(False)
        self._connections = {}
        try:
            while not self._stopped:
                inputs = [self._listenSocket]
                outputs = []
                for conn in self._connections.values():
                    inp = conn.wantRead()
                    if inp:
                        inputs.append(inp)
                    outp = conn.wantWrite()
                    if outp:
                        outputs.append(outp)
                readable, writable, exceptional = select.select(inputs, outputs, inputs)
                for s in readable:
                    if s == self._listenSocket:
                        self._acceptWrapper()
                    else:
                        connection = self._connections[s]
                        lines = connection.read()
                        if len(lines) > 0:
                            if connection.getType() == TYPE.DEBUG:
                                # print lines
                                for line in lines:
                                    print(line)
                                    # if line == MESSAGE.EXITED:
                                    #     # exit loop
                                    #     self._stopped = True
                            elif connection.getType() == TYPE.CONSOLE:
                                # test if "pause"
                                if line == COMMAND.PAUSE:
                                    pass
                                # pass lines to debuggers
                                for conn in self._connections.values():
                                    if conn.getType() == TYPE.DEBUG:
                                        for line in lines:
                                            conn.post(line)
                for s in writable:
                    if s != self._listenSocket:
                        self._connections[s].write()
                for s in exceptional:
                    if s != self._listenSocket:
                        self._connections[s].close()
                        del self._connections[s]
        except:
            pass
        for connection in self._connections.values():
            try:
                connection.close()
            except:
                pass
        self._connections = None
        try:
            self._listenSocket.close()
        except:
            pass
        self._listenSocket = None
        self._thread = None
        self._selector = None
    
    def _acceptWrapper(self):
        conn, addr = self._listenSocket.accept()
        # print("Connected %s" % repr(addr))
        conn.setblocking(False)
        connection = Connection(conn)
        self._connections[conn] = connection

if __name__ == "__main__":

    _usage = """\
usage: server.py -p port

Start debug server."""

    import getopt

    opts, args = getopt.getopt(sys.argv[1:], 'hp:', ['help','port='])

    for opt, optarg in opts:
        if opt in ['-h', '--help']:
            print(_usage)
            sys.exit()
        elif opt in ['-p', '--port']:
            SETTINGS.PORT = int(optarg)
        else:
            print("Unknown option %s" % opt)

    server = DebugServer(SETTINGS.PORT)
    server.start()
    time.sleep(0.5)
    try:
        consoleSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        consoleSocket.connect_ex((SETTINGS.HOST, SETTINGS.PORT))
        consoleSocket.send((TYPE.CONSOLE + "\n").encode())
        while server.isAlive():
            if sys.version_info[0] < 3:
                cmd = raw_input()
            else:
                cmd = input()
            if cmd == COMMAND.HELP:
                print(_helpInfo)
            else:
                consoleSocket.send((cmd + "\n").encode())
                if cmd == COMMAND.QUIT:
                    break
    except:
        pass
    server.stop()
    try:
        consoleSocket.send(b"\n")
    except:
        pass
    server.join()
