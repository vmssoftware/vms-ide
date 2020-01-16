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
    ENTRY = 'ENTRY',
    PAUSED = 'PAUSED',
    BREAK = 'BREAK',
    BP_CONFIRM = 'BP_CONFIRM',
    BP_WAIT = 'BP_WAIT',
    BP_RESET = 'BP_RESET',
    EXITED = 'EXITED',
    CONTINUED = 'CONTINUED',
    STEPPED = 'STEPPED',
    THREADS = 'THREADS',
    INFO = 'INFO',
    EXCEPTION = 'EXCEPTION',
    SIGNAL = 'SIGNAL',
    SYNTAX_ERROR = 'SYNTAX_ERROR',
    LOCALS = 'LOCALS',
};

// see tracer.py
export enum PythonServerCommand {
    PAUSE = 'p',
    CONTINUE = 'c',
    STEP = 's',
    INFO = 'i',
    QUIT = 'q',
    HELP = 'h',
    THREADS = 't',
    FRAME  = 'f',
    BP_SET = 'bps',
    BP_RESET = 'bpr',
    LOCALS = 'l'
};

export interface IPythonThread {
    id: number;
    paused: boolean;
    framesNum: number;
    frames: IPythonFrame[];
};

export interface IPythonFrame {
    file: string;
    line: number;
    function?: string;
};

export interface IPythonVariable {
    varId: number;
    name: string;
    value?: string;
    type?: string,
    typeName?: string,
    arraySize?: number,
    parentId?: number;
    vars?: IPythonVariable[];
};

// see tracer.py
const _rgxBpConfirm = /BP_CONFIRM "(.*?)" (\d+)/;
const _rgxThreads   = /THREADS (\d+) current (\d+)/;
const _rgxFrames    = /thread (\d+) frames (\d+) is (\S+)/;

export class PythonShellRuntime extends EventEmitter {
    
    private logFn: LogFunction;

    private threads: IPythonThread[];

    private started: boolean;
    private running: boolean;

    private ident: number | undefined;

    constructor(private queue: ICmdQueue, _logFn?: LogFunction) {
        super();

        // tslint:disable-next-line:no-empty
        this.logFn = _logFn || (() => {});

        this.started = false;
        this.running = false;
        this.threads = [];
        
        this.queue.onUnexpectedLine((line) => {
            this.onUnexpectedLine(line);
        });
    }

    private onUnexpectedLine(line: string | undefined): void {
        if (line) {
            const trimmed = line.trim();
            if (trimmed) {
                this.sendEvent(PythonRuntimeEvents.output, trimmed);
                let stopReason: PythonRuntimeEvents | undefined;
                switch(trimmed) {
                    case  PythonServerMessage.PAUSED:
                        stopReason = PythonRuntimeEvents.stopOnPause;
                        break;
                    case  PythonServerMessage.ENTRY:
                        stopReason = PythonRuntimeEvents.stopOnEntry;
                        break;
                    case PythonServerMessage.BREAK:
                        stopReason = PythonRuntimeEvents.stopOnBreakpoint;
                        break;
                    case PythonServerMessage.STEPPED:
                        stopReason = PythonRuntimeEvents.stopOnStep;
                        break;
                    case PythonServerMessage.EXCEPTION:
                        stopReason = PythonRuntimeEvents.stopOnException;
                        break;
                }
                if (stopReason !== undefined) {
                    this.running = false;
                    let reason = stopReason;
                    this.threadsRequest().then(() => {
                        this.sendEvent(reason, this.ident);
                    });
                    return;
                }
                if (trimmed == PythonServerMessage.EXITED) {
                    this.running = false;
                    this.queue.postCommand(PythonServerCommand.QUIT);
                    this.sendEvent(PythonRuntimeEvents.end);
                    return;
                }
                if (trimmed == PythonServerMessage.CONTINUED) {
                    this.running = true;
                    //this.sendEvent(PythonRuntimeEvents.);
                    return;
                }
                if (trimmed.startsWith(PythonServerMessage.BP_CONFIRM)) {
                    const match = trimmed.match(_rgxBpConfirm);
                    if (match) {
                        this.sendEvent(PythonRuntimeEvents.breakpointValidated, match[1], +match[2]);
                    }
                    return;
                }
            }
        }
    }

    /******************************************************************************************/
    // public
    /******************************************************************************************/

    public async start() {
        this.started = true;
        this.running = true;
    }

    public threadsCollected() {
        return this.threads;
    }
    
    public async threadsRequest() {
        if (!this.started) {
            return [];
        }
        if (this.running) {
            return [];
        }
        this.threads = [];
        this.ident = undefined;
        let threadNum: number | undefined;
        let pythonThread: IPythonThread | undefined = undefined;
        await this.queue.postCommand(PythonServerCommand.THREADS, (cmd, line) => {
            if (line === undefined) {
                this.logFn(LogType.debug, () => `threads: aborted`);
                return ListenerResponse.stop;
            }
            if (threadNum == undefined) {
                const match = line.match(_rgxThreads);
                if (match) {
                    threadNum = +match[1];
                    this.ident = +match[2];
                    return ListenerResponse.needMoreLines;
                }
            } else {
                const match = line.match(_rgxFrames);
                if (match) {
                    pythonThread = {
                        id: +match[1],
                        framesNum: +match[2],
                        paused: match[3] == 'paused',
                        frames: [],
                    } as IPythonThread;
                    this.threads.push(pythonThread);
                }
                if (this.threads.length == threadNum) {
                    return ListenerResponse.stop;
                }
            }
            return ListenerResponse.needMoreLines;
        });
        return this.threads;
    }

    public async framesRequest(ident: number, startFrame: number, endFrame: number): Promise<IPythonFrame[]> {
        if (!this.started) {
            return [];
        }
        if (this.running) {
            return [];
        }
        return [];
    }

    public async continueRequest() {
        if (!this.started) {
            return false;
        }
        if (this.running) {
            return false;
        }
        return this.queue.postCommand(PythonServerCommand.CONTINUE, undefined);
    }

    public async nextRequest() {
        if (!this.started) {
            return false;
        }
        if (this.running) {
            return false;
        }
        return this.queue.postCommand(PythonServerCommand.STEP, undefined);
    }

    public async stepInRequest() {
        if (!this.started) {
            return false;
        }
        if (this.running) {
            return false;
        }
        return this.queue.postCommand(PythonServerCommand.STEP, undefined);
    }

    public async stepOutRequest() {
        if (!this.started) {
            return false;
        }
        if (this.running) {
            return false;
        }
        return this.queue.postCommand(PythonServerCommand.STEP, undefined);
    }

    public async pauseRequest() {
        if (!this.started) {
            return false;
        }
        if (!this.running) {
            return true;
        }
        return this.queue.postCommand(PythonServerCommand.PAUSE, undefined);
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