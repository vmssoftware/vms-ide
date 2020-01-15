import { EventEmitter } from "events";
import * as nls from "vscode-nls";

import { LogFunction, LogType } from "../common/main";
import { ICmdQueue, ListenerResponse } from "../vms_jvm_debug/communication";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export enum PythonRuntimeEvents {
    stopOnEntry = 'stopOnEntry',
    stopOnStep = 'stopOnStep',
    stopOnBreakpoint = 'stopOnBreakpoint',
    stopOnBreakpointError = 'stopOnBreakpointError',
    stopOnException = 'stopOnException',
    stopOnPause = 'stopOnPause',
    stopOnDataChange = 'stopOnDataChange',
    stopOnDataAccess = 'stopOnDataAccess',
    breakpointValidated = 'breakpointValidated',
    output = 'output',
    end = 'end',
};

export enum PythonServerMessage {
    DEBUG = 'DEBUG',
    PAUSED = 'PAUSED',
    BREAK = 'BREAK',
    BP_CONFIRM = 'BP_CONFIRM',
    BP_WAIT = 'BP_WAIT',
    BP_RESET = 'BP_RESET',
    EXITED = 'EXITED',
    CONTINUED = 'CONTINUED',
    STEPPED = 'STEPPED',
    INFORMATION = 'INFO',
    EXCEPTION = 'EXCEPTION',
    SIGNAL = 'SIGNAL',
    SYNTAX_ERROR = 'SYNTAX_ERROR',
    LOCALS = 'LOCALS',
};

export enum PythonServerCommand {
    PAUSE = 'p',
    CONTINUE = 'c',
    STEP = 's',
    INFO = 'i',
    QUIT = 'q',
    HELP = 'h',
};

export interface PythonThread {
    id: number;
    paused: boolean;
    framesNum: number;
    frames: PythonFrame[];
};

export interface PythonFrame {
    file: string;
    line: number;
    function?: string;
};

export class PythonShellRuntime extends EventEmitter {
    
    private _logFn: LogFunction;

    private _threads?: PythonThread[];

    constructor(private _queue: ICmdQueue, logFn?: LogFunction) {
        super();
        // tslint:disable-next-line:no-empty
        this._logFn = logFn || (() => {});
        
        this._queue.onUnexpectedLine((line) => {
            this.onUnexpectedLine(line);
        });
    }

    private onUnexpectedLine(line: string | undefined): void {
        if (line) {
            const trimmed = line.trim();
            if (trimmed) {
                switch(trimmed) {
                    case  PythonServerMessage.PAUSED:
                        this._queue.postCommand(PythonServerCommand.CONTINUE);
                        break;
                    case PythonServerMessage.BREAK:
                        this._queue.postCommand(PythonServerCommand.CONTINUE);
                        break;
                    case PythonServerMessage.EXCEPTION:
                        this._queue.postCommand(PythonServerCommand.CONTINUE);
                        break;
                    case PythonServerMessage.EXITED:
                        this._queue.postCommand(PythonServerCommand.QUIT);
                        this.sendEvent(PythonRuntimeEvents.end);
                        break;
                }
                this.sendEvent(PythonRuntimeEvents.output, trimmed);
            }
        }
    }

    /******************************************************************************************/
    // public
    /******************************************************************************************/

    public async start() {
    }

    // given as is from <tracer.py>
    private readonly _rgxThreadNum = /Threads: (\d+)/;
    private readonly _rgxThread =   /thread (\d+) frames (\d+) (\S+):/;

    public async requestThreads() {
        this._threads = [];
        let threadNum = 0;
        let pythonThread: PythonThread | undefined = undefined;
        this._queue.postCommand(PythonServerCommand.INFO, (cmd, line) => {
            if (line === undefined) {
                this._logFn(LogType.debug, () => `threads: aborted`);
                return ListenerResponse.stop;
            }
            if (threadNum == 0) {
                const matchThreadNum = line.match(this._rgxThreadNum);
                if (matchThreadNum) {
                    threadNum = +matchThreadNum[1];
                }
            } else {
                const matchThread = line.match(this._rgxThread);
                if (matchThread) {
                    const threadFrames = +matchThread[2];
                    pythonThread = {
                        id: +matchThread[1],
                        framesNum: +matchThread[2],
                        paused: matchThread[3] == 'paused',
                        frames: [],
                    } as PythonThread;
                    this._threads?.push(pythonThread);
                }
                if (this._threads?.length == threadNum) {
                    return ListenerResponse.stop;
                }
            }
            return ListenerResponse.needMoreLines;
        });
    }

    /******************************************************************************************/
    // private
    /******************************************************************************************/
    
    private sendEvent(event: string, ... args: any[]) {
        setImmediate(_ => {
            this.emit(event, ...args);
        });
    }
}