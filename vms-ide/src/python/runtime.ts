import { EventEmitter } from "events";
import * as nls from "vscode-nls";

import { LogFunction, LogType, Lock } from "../common/main";
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
};

export interface IPythonFrame {
    file: string;
    line: number;
    function: string;
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
const _rgxFrame     = /file: "(.*?)" line: (\d+) function: "(.*?)"/;
const _rgxLocal     = /LOCALS (\d+)/;
const _rgxVar       = /name: "(.*?)" type: "(.*?)" value: "(.*?)"/;

export class PythonShellRuntime extends EventEmitter {
    
    private logFn: LogFunction;

    private threads?: IPythonThread[];

    private started: boolean;
    private running: boolean;

    private locker = new Lock();

    private ident: number | undefined;

    constructor(private queue: ICmdQueue, _logFn?: LogFunction) {
        super();

        // tslint:disable-next-line:no-empty
        this.logFn = _logFn || (() => {});

        this.started = false;
        this.running = false;
        
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

        await this.locker.acquire();

        if (!this.started || this.running) {
            this.locker.release();
            return undefined;
        }
        
        if (this.threads != undefined) {
            this.locker.release();
            return this.threads;
        }

        let threads: IPythonThread[] = [];
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
                    } as IPythonThread;
                    threads.push(pythonThread);
                }
                if (threads.length == threadNum) {
                    return ListenerResponse.stop;
                }
            }
            return ListenerResponse.needMoreLines;
        });
        this.threads = threads;
        this.locker.release();
        return this.threads;
    }

    public async framesRequest(ident: number, startFrame: number, endFrame: number): Promise<IPythonFrame[]> {

        await this.locker.acquire();

        const frames: IPythonFrame[] = [];
        if (!this.started || this.running) {
            this.locker.release();
            return frames;
        }
        const maxFrame = this.threads?.find(x => x.id == ident)?.framesNum;
        if (maxFrame !== undefined) {
            startFrame = Math.min(startFrame, maxFrame);
            startFrame = Math.max(startFrame, 0);
            endFrame = Math.min(endFrame, maxFrame);
            endFrame = Math.max(endFrame, startFrame);
            let numFrames = endFrame - startFrame;
            if (numFrames > 0) {
                let command = `${PythonServerCommand.FRAME} ${ident} ${startFrame} ${numFrames}`;
                await this.queue.postCommand(command, (cmd, line) => {
                    if (line === undefined) {
                        this.logFn(LogType.debug, () => `frames: aborted`);
                        return ListenerResponse.stop;
                    }
                    const match = line.match(_rgxFrame);
                    if (match) {
                        const frame: IPythonFrame = {
                            file: match[1],
                            line: +match[2],
                            function: match[3],
                        };
                        frames.push(frame);
                        --numFrames;
                        if (numFrames == 0) {
                            return ListenerResponse.stop;
                        }
                    }
                    return ListenerResponse.needMoreLines;
                });
            }
        }
        this.locker.release();
        return frames;
    }

    public async localsRequest(ident: number, frame: number): Promise<IPythonVariable[]> {

        await this.locker.acquire();

        const variables: IPythonVariable[] = [];
        if (!this.started || this.running) {
            this.locker.release();
            return variables;
        }
        let command = `${PythonServerCommand.LOCALS} ${frame} ${ident}`;
        await this.queue.postCommand(command, (cmd, line) => {
            if (line === undefined) {
                this.logFn(LogType.debug, () => `locals: aborted`);
                return ListenerResponse.stop;
            }
            const match = line.match(_rgxLocal);
            return ListenerResponse.stop;
        });
        this.locker.release();
        return variables;
    }

    private setRunning() {
        this.running = true;
        this.threads = undefined;
        this.ident = undefined;
    }

    public async continueRequest() {
        await this.locker.acquire();
        if (!this.started || this.running) {
            this.locker.release()
            return false;
        }
        this.setRunning();
        return this.queue.postCommand(PythonServerCommand.CONTINUE, undefined).then((ok) => {
            this.locker.release();
            return ok;
        });
    }

    public async nextRequest() {
        await this.locker.acquire();
        if (!this.started || this.running) {
            this.locker.release()
            return false;
        }
        this.setRunning();
        return this.queue.postCommand(PythonServerCommand.STEP, undefined).then((ok) => {
            this.locker.release();
            return ok;
        });
    }

    public async stepInRequest() {
        await this.locker.acquire();
        if (!this.started || this.running) {
            this.locker.release()
            return false;
        }
        this.setRunning();
        return this.queue.postCommand(PythonServerCommand.STEP, undefined).then((ok) => {
            this.locker.release();
            return ok;
        });
    }

    public async stepOutRequest() {
        await this.locker.acquire();
        if (!this.started || this.running) {
            this.locker.release()
            return false;
        }
        this.setRunning();
        return this.queue.postCommand(PythonServerCommand.STEP, undefined).then((ok) => {
            this.locker.release();
            return ok;
        });
    }

    public async pauseRequest() {
        await this.locker.acquire();
        if (!this.started || !this.running) {
            this.locker.release()
            return false;
        }
        return this.queue.postCommand(PythonServerCommand.PAUSE, undefined).then((ok) => {
            this.locker.release();
            return ok;
        });
    }

    public async setBreakPoint(file: string, line: number) {
        await this.locker.acquire();
        if (!this.started) {
            this.locker.release()
            return false;
        }
        let command = `${PythonServerCommand.BP_SET} ${file} ${line}`;
        return this.queue.postCommand(command, undefined).then((ok) => {
            this.locker.release();
            return ok;
        });
    }

    public async reSetBreakPoint(file: string, line: number) {
        await this.locker.acquire();
        if (!this.started) {
            this.locker.release()
            return false;
        }
        let command = `${PythonServerCommand.BP_RESET} ${file} ${line}`;
        return this.queue.postCommand(command, undefined).then((ok) => {
            this.locker.release();
            return ok;
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