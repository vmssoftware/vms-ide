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
    DISPLAY = 'DISPLAY',
};

// see tracer.py
export enum PythonServerCommand {
    PAUSE = 'p',
    CONTINUE = 'c',
    STEP = 's',
    NEXT = 'n',
    RETURN = 'r',
    INFO = 'i',
    QUIT = 'q',
    HELP = 'h',
    THREADS = 't',
    FRAME  = 'f',
    BP_SET = 'bps',
    BP_RESET = 'bpr',
    DISPLAY = 'd',
};

export interface IPythonThread {
    id: number;
    paused: boolean;
    framesNum: number;
};

export interface IPythonFrame {
    ident: number;
    frame: number;
    file: string;
    line: number;
    function: string;
};

export interface IPythonVariable {
    ident: number;
    frame: number;
    name: string;
    path?: string;
    type: string;
    size?: number;
    value?: string;
};

export enum EPythonConst {
    locals = '-locals-',
    failed = 'failed',
    value = 'value',
    children = 'children',
    length = 'length',
};

export enum EPythonValueType {
    'int',
    'str',
    'float',
    'complex',
    'NoneType'
};

export enum EPythonArrayType {
    'list',
};

export enum EPythonInstanceType {
    'instance',
};

// see tracer.py
const _rgxBpConfirm = /BP_CONFIRM "(.*?)" (\d+)/;
const _rgxThreads   = /THREADS (\d+) current (\d+)/;
const _rgxFrames    = /thread (\d+) frames (\d+) is (\S+)/;
const _rgxFrame     = /file: "(.*?)" line: (\d+) function: "(.*?)"/;
const _rgxDisplay   = /DISPLAY "(.*?)" (failed|<(?:type|class) '(.*?)'> (?:(value|children|length): (.*)))/;
const _rgxDisplay_Name = 1
const _rgxDisplay_Result = 2
const _rgxDisplay_Type = 3
const _rgxDisplay_ValueDescr = 4
const _rgxDisplay_Value = 5

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
            if (line.startsWith(PythonServerMessage.SYNTAX_ERROR)) {
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
                    if (threads.length == threadNum) {
                        return ListenerResponse.stop;
                    }
                    return ListenerResponse.needMoreLines;
                }
            }
            this.onUnexpectedLine(line);
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
                let parsedFrame = 0;
                await this.queue.postCommand(command, (cmd, line) => {
                    if (line === undefined) {
                        this.logFn(LogType.debug, () => `frames: aborted`);
                        return ListenerResponse.stop;
                    }
                    if (line.startsWith(PythonServerMessage.SYNTAX_ERROR)) {
                        return ListenerResponse.stop;
                    }
                    const match = line.match(_rgxFrame);
                    if (match) {
                        const frame: IPythonFrame = {
                            ident,
                            frame: startFrame + parsedFrame,
                            file: match[1],
                            line: +match[2],
                            function: match[3],
                        };
                        ++parsedFrame;
                        frames.push(frame);
                        if (parsedFrame >= numFrames) {
                            return ListenerResponse.stop;
                        }
                        return ListenerResponse.needMoreLines;
                    }
                    this.onUnexpectedLine(line);
                    return ListenerResponse.needMoreLines;
                });
            }
        }
        this.locker.release();
        return frames;
    }

    // public async localsRequest(ident: number, frame: number): Promise<IPythonVariable[]> {

    //     await this.locker.acquire();

    //     const variables: IPythonVariable[] = [];
    //     if (!this.started || this.running) {
    //         this.locker.release();
    //         return variables;
    //     }
    //     let command = `${PythonServerCommand.DISPLAY} ${frame} ${ident}`;
    //     let numLocals: number | undefined;
    //     let parsedLocals = 0;
    //     await this.queue.postCommand(command, (cmd, line) => {
    //         if (line === undefined) {
    //             this.logFn(LogType.debug, () => `locals: aborted`);
    //             return ListenerResponse.stop;
    //         }
    //         if (numLocals == undefined) {
    //             const match = line.match(_rgxDisplay);
    //             if (match) {
    //                 if (match[_rgxDisplay_Name] !== '' ||
    //                     match[_rgxDisplay_Result] === PythonConst.failed || 
    //                     match[_rgxDisplay_Type] !== PythonConst.locals) {
    //                     return ListenerResponse.stop;
    //                 }
    //                 if ( match[_rgxDisplay_ValueDescr] === PythonConst.children) {
    //                     numLocals = +match[_rgxDisplay_Value];
    //                     if (numLocals == 0) {
    //                         return ListenerResponse.stop;
    //                     }
    //                     return ListenerResponse.needMoreLines;
    //                 }
    //                 return ListenerResponse.stop;
    //             }
    //         } else {
    //             const match = line.match(_rgxDisplay);
    //             if (match) {
    //                 const nameMatched = match[_rgxDisplay_Name];
    //                 variables.push({
    //                     id: 0,
    //                     ident,
    //                     frame,
    //                     name: nameMatched,
    //                     type: match[_rgxDisplay_Type],
    //                     value: match[_rgxDisplay_Value],
    //                 });
    //                 ++parsedLocals;
    //                 if (parsedLocals >= numLocals) {
    //                     return ListenerResponse.stop;
    //                 }
    //                 return ListenerResponse.needMoreLines;
    //             }
    //         }
    //         this.onUnexpectedLine(line);
    //         return ListenerResponse.needMoreLines;
    //     });
    //     this.locker.release();
    //     return variables;
    // }

    /**
     * 
     * @param ident 
     * @param frame 
     * @param variableFullName set to empty string to get locals
     */
    public async variableRequest(ident: number, frame: number, variableFullName: string, start?: number, count?: number): Promise<IPythonVariable[]> {

        const variables: IPythonVariable[] = [];
        if (!this.started || this.running) {
            return variables;
        }

        await this.locker.acquire();

        let varPath = variableFullName;
        if (variableFullName) {
            //if it is not a locals (in case of empty variable), add dot to the end to get children names (if they exist)
            varPath = variableFullName + '.';
        }

        let command = `${PythonServerCommand.DISPLAY} ${frame} ${ident} ${varPath}`;
        let innerPath: string | undefined = variableFullName ? variableFullName : undefined;
        if (start !== undefined) {
            let lastDot = variableFullName.lastIndexOf('.');
            if (lastDot > 0) {
                innerPath = variableFullName.substr(0, lastDot);
            } else {
                innerPath = undefined;
            }
            command += ` ${start}`;
            if (count !== undefined) {
                command += ` ${count}`;
            }
        }
        let numVars: number | undefined;
        let parsedVars = 0;
        let waitQuota: string | undefined;
        let lastVar: IPythonVariable | undefined;
        await this.queue.postCommand(command, (cmd, line) => {
            if (line === undefined) {
                this.logFn(LogType.debug, () => `variables: aborted`);
                return ListenerResponse.stop;
            }
            // first test case when string is splitted onto several lines
            if (waitQuota !== undefined && lastVar !== undefined) {
                if (lastVar.value !== undefined) {
                    lastVar.value += line;
                } else {
                    lastVar.value = line;
                }
                if (lastVar.value.trim().endsWith(waitQuota)) {
                    let pos = lastVar.value.lastIndexOf(waitQuota);
                    lastVar.value = lastVar.value.substr(0, pos + 1);   // include last quota
                    waitQuota = undefined;
                    lastVar = undefined;
                    if (numVars === undefined) {
                        // it was main variable
                        return ListenerResponse.stop;
                    } else {
                        // proceed to the next variable
                        ++parsedVars;
                        if (parsedVars >= numVars) {
                            return ListenerResponse.stop;
                        }
                        return ListenerResponse.needMoreLines;
                    }
                } else {
                    return ListenerResponse.needMoreLines;
                }
            }
            // second test - if SYNTAX_ERROR
            if (line.startsWith(PythonServerMessage.SYNTAX_ERROR)) {
                return ListenerResponse.stop;
            }
            const match = line.match(_rgxDisplay);
            if (match) {
                if (numVars === undefined) {
                    // parse first line - parent
                    // must succeed
                    if (match[_rgxDisplay_Result] === EPythonConst.failed) {
                        return ListenerResponse.stop;
                    }
                    // must have children or length
                    if (match[_rgxDisplay_ValueDescr] === EPythonConst.value) {
                        return ListenerResponse.stop;
                    }
                    numVars = +match[_rgxDisplay_Value];
                    if (numVars === 0) {
                        return ListenerResponse.stop;
                    }
                    return ListenerResponse.needMoreLines;
                } else {
                    // parse other lines - children
                    if (match[_rgxDisplay_Result] !== EPythonConst.failed) {
                        lastVar = {
                            ident,
                            frame,
                            name: match[_rgxDisplay_Name],
                            path: innerPath,
                            type: match[_rgxDisplay_Type],
                        };
                        if (start !== undefined) {
                            // patch the name
                        }
                        // do not handle children length, not necessary at this point
                        if (match[_rgxDisplay_ValueDescr] == EPythonConst.length) {
                            lastVar.size = +match[_rgxDisplay_Value];
                        } else if (match[_rgxDisplay_ValueDescr] == EPythonConst.value) {
                            lastVar.value = match[_rgxDisplay_Value];
                        } 
                        variables.push(lastVar);
                        // test if variable is long string
                        if (lastVar.value && (lastVar.value.startsWith('"') || lastVar.value.startsWith("'"))) {
                            waitQuota = lastVar.value[0];
                            if (lastVar.value.trim().endsWith(waitQuota)) {
                                // does not split
                                waitQuota = undefined;
                                lastVar = undefined;
                            } else {
                                // split, wait the end of string
                                return ListenerResponse.needMoreLines;
                            }
                        }
                    }
                    ++parsedVars;
                    if (parsedVars >= numVars) {
                        return ListenerResponse.stop;
                    }
                    return ListenerResponse.needMoreLines;
                }
            }
            this.onUnexpectedLine(line);
            return ListenerResponse.needMoreLines;
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

    public async nextRequest(ident: number) {
        await this.locker.acquire();
        if (!this.started || this.running) {
            this.locker.release()
            return false;
        }
        this.setRunning();
        const command = `${PythonServerCommand.NEXT} ${ident}`;
        return this.queue.postCommand(command, undefined).then((ok) => {
            this.locker.release();
            return ok;
        });
    }

    public async stepInRequest(ident: number) {
        await this.locker.acquire();
        if (!this.started || this.running) {
            this.locker.release()
            return false;
        }
        this.setRunning();
        const command = `${PythonServerCommand.STEP} ${ident}`;
        return this.queue.postCommand(command, undefined).then((ok) => {
            this.locker.release();
            return ok;
        });
    }

    public async stepOutRequest(ident: number) {
        await this.locker.acquire();
        if (!this.started || this.running) {
            this.locker.release()
            return false;
        }
        this.setRunning();
        const command = `${PythonServerCommand.RETURN} ${ident}`;
        return this.queue.postCommand(command, undefined).then((ok) => {
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