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
    BP_CONFIRM = 'BP_CONFIRM',
    BP_RESET = 'BP_RESET',
    BP_WAIT = 'BP_WAIT',
    BREAK = 'BREAK',
    CONTINUED = 'CONTINUED',
    DEBUG = 'DEBUG',
    DISPLAY = 'DISPLAY',
    ENTRY = 'ENTRY',
    EXCEPTION = 'EXCEPTION',
    EXITED = 'EXITED',
    GOTO = 'GOTO',
    GOTO_TARGETS = 'GOTO_TARGETS',
    INFO = 'INFO',
    PAUSED = 'PAUSED',
    SIGNAL = 'SIGNAL',
    STEPPED = 'STEPPED',
    SYNTAX_ERROR = 'SYNTAX_ERROR',
    THREADS = 'THREADS',
};

// see tracer.py
export enum PythonServerCommand {
    AMEND = 'a',
    BP_RESET = 'bpr',
    BP_SET = 'bps',
    CONTINUE = 'c',
    DISPLAY = 'd',
    FRAME  = 'f',
    GOTO = 'g',
    GOTO_TARGETS = 'gt',
    HELP = 'h',
    INFO = 'i',
    NEXT = 'n',
    PAUSE = 'p',
    QUIT = 'q',
    RETURN = 'r',
    STEP = 's',
    THREADS = 't',
};

export enum EPythonValueFormat {
    decimal,
    hex
}

export interface IPythonThread {
    id: number;
    paused: boolean;
    framesNum: number;
    frames?: IPythonFrame[];
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
    locals      = '-locals-',
    failed      = 'failed',
    ok          = 'ok',
    value       = 'value',
    children    = 'children',
    length      = 'length',
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
const _rgxBpConfirm         = /BP_CONFIRM "(.*?)" (\d+)(?: (\d+))?/;
const _rgxBpConfirm_File    = 1;
const _rgxBpConfirm_Line    = 2;
const _rgxBpConfirm_Line_R  = 3;

const _rgxThreads           = /THREADS (\d+) current (\d+)/;
const _rgxThreads_Thread    = 1;
const _rgxThreads_Current   = 2;

const _rgxFrames            = /thread (\d+) frames (\d+) is (\S+)/;
const _rgxFrames_Thread     = 1;
const _rgxFrames_Frames     = 2;
const _rgxFrames_State      = 3;

const _rgxFrame             = /file: "(.*?)" line: (\d+) function: "(.*?)"/;
const _rgxFrame_File        = 1;
const _rgxFrame_Line        = 2;
const _rgxFrame_Function    = 3;

const _rgxDisplay               = /DISPLAY "(.*?)" (failed|<(?:type|class|enum) '(.*?)'> (?:(value|children|length): (.*)))/;
const _rgxDisplay_Name          = 1;
const _rgxDisplay_Result        = 2;
const _rgxDisplay_Type          = 3;
const _rgxDisplay_ValueDescr    = 4;
const _rgxDisplay_Value         = 5;

const _rgxAmend                 = /AMEND (failed|ok) (.*)/;
const _rgxAmend_Result          = 1;
const _rgxAmend_Value           = 2;

const _rgxGotoTargtes           = /GOTO_TARGETS (failed|ok)(.*)/;
const _rgxGotoTargtes_Result    = 1;

const _rgxGoto                  = /GOTO (failed|ok)/;
const _rgxGoto_Result           = 1;

export const rgxEsc = /\x1B(?:[@-Z\\-_=>]|\[[0-?]*[ -/]*[@-~]|[)(][AB012])/g;

export class PythonShellRuntime extends EventEmitter {
    
    private logFn: LogFunction;

    private threads?: IPythonThread[];

    private started: boolean;
    private running: boolean;

    /**
     * should be acquired exactly at the start of each public procedure
     */
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
            line = line.trim().replace(rgxEsc, '');
            if (line) {
                this.sendEvent(PythonRuntimeEvents.output, line);
                let stopReason: PythonRuntimeEvents | undefined;
                switch(line) {
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
                }
                if (stopReason === undefined && line.startsWith(PythonServerMessage.EXCEPTION)) {
                    stopReason = PythonRuntimeEvents.stopOnException;
                }
                if (stopReason !== undefined) {
                    this.running = false;
                    let reason = stopReason;
                    this.threadsRequest().then(() => {
                        this.sendEvent(reason, this.ident);
                    });
                    return;
                }
                if (line.startsWith(PythonServerMessage.EXITED)) {
                    this.running = false;
                    this.queue.postCommand(PythonServerCommand.QUIT);
                    this.sendEvent(PythonRuntimeEvents.end);
                    return;
                }
                if (line.startsWith(PythonServerMessage.CONTINUED)) {
                    //this.sendEvent(PythonRuntimeEvents.);
                    return;
                }
                if (line.startsWith(PythonServerMessage.BP_CONFIRM)) {
                    const match = line.match(_rgxBpConfirm);
                    if (match) {
                        this.sendEvent(PythonRuntimeEvents.breakpointValidated, 
                            match[_rgxBpConfirm_File], 
                            +match[_rgxBpConfirm_Line],
                            match[_rgxBpConfirm_Line_R]?+match[_rgxBpConfirm_Line_R]:undefined);
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

    public isRunning() {
        return this.started && this.running;
    }

    public isPaused() {
        return this.started && !this.running;
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
            line = line.trim();
            if (line) {
                if (line.startsWith(PythonServerMessage.SYNTAX_ERROR)) {
                    return ListenerResponse.stop;
                }
                if (threadNum == undefined) {
                    const match = line.match(_rgxThreads);
                    if (match) {
                        threadNum = +match[_rgxThreads_Thread];
                        this.ident = +match[_rgxThreads_Current];
                        return ListenerResponse.needMoreLines;
                    }
                } else {
                    const match = line.match(_rgxFrames);
                    if (match) {
                        pythonThread = {
                            id: +match[_rgxFrames_Thread],
                            framesNum: +match[_rgxFrames_Frames],
                            paused: match[_rgxFrames_State] == 'paused',
                        } as IPythonThread;
                        threads.push(pythonThread);
                        if (threads.length == threadNum) {
                            return ListenerResponse.stop;
                        }
                        return ListenerResponse.needMoreLines;
                    }
                }
                this.onUnexpectedLine(line);
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
                let parsedFrame = 0;
                await this.queue.postCommand(command, (cmd, line) => {
                    if (line === undefined) {
                        this.logFn(LogType.debug, () => `frames: aborted`);
                        return ListenerResponse.stop;
                    }
                    line = line.trim();
                    if (line) {
                        if (line.startsWith(PythonServerMessage.SYNTAX_ERROR)) {
                            return ListenerResponse.stop;
                        }
                        const match = line.match(_rgxFrame);
                        if (match) {
                            const frame: IPythonFrame = {
                                ident,
                                frame: startFrame + parsedFrame,
                                file: match[_rgxFrame_File],
                                line: +match[_rgxFrame_Line],
                                function: match[_rgxFrame_Function],
                            };
                            ++parsedFrame;
                            frames.push(frame);
                            if (parsedFrame >= numFrames) {
                                return ListenerResponse.stop;
                            }
                            return ListenerResponse.needMoreLines;
                        }
                        this.onUnexpectedLine(line);
                    }
                    return ListenerResponse.needMoreLines;
                });
            }
        }
        this.locker.release();
        return frames;
    }

    /**
     * 
     * @param ident 
     * @param frame 
     * @param variableFullName set to empty string to get locals
     */
    public async variableRequest(ident: number, frame: number, variableFullName: string, start?: number, count?: number, showHex?: boolean): Promise<IPythonVariable[]> {

        await this.locker.acquire();

        const variables: IPythonVariable[] = [];
        if (!this.started || this.running) {
            this.locker.release();
            return variables;
        }

        let varPath = variableFullName;
        if (variableFullName) {
            // if it is not a locals (in case of empty variable), add dot to the end to get children names (if they exist)
            // it is only for inner purpose, this dot doesn't pass to tracer, so indexed variables must work fine
            varPath = variableFullName + '.';
        }

        let command = `${PythonServerCommand.DISPLAY}${showHex?'h':''} ${ident} ${frame} ${varPath}`;
        if (start !== undefined) {
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
            line = line.trim();
            if (line) {
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
                                path: variableFullName,
                                type: match[_rgxDisplay_Type],
                            };
                            if (start !== undefined) {
                                // patch the name
                                let pos = lastVar.name.lastIndexOf("[");
                                if (pos >= 0) {
                                    lastVar.name = lastVar.name.substr(pos);
                                }
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
            }
            return ListenerResponse.needMoreLines;
        });
        this.locker.release();
        return variables;
    }

    public async requestSetVariable(ident: number, frame: number, fullName: string, value: string) {
        
        await this.locker.acquire();
        
        let success = false;
        if (!this.started || this.running) {
            this.locker.release();
            return { success, value };
        }

        let command = `${PythonServerCommand.AMEND} ${ident} ${frame} ${fullName} ${value}`;
        let posted = await this.queue.postCommand(command, (cmd, line) => {
            if (line === undefined) {
                this.logFn(LogType.debug, () => `amend: aborted`);
                return ListenerResponse.stop;
            }
            line = line.trim();
            if (line) {
                if (line.startsWith(PythonServerMessage.SYNTAX_ERROR)) {
                    return ListenerResponse.stop;
                }
                const match = line.match(_rgxAmend);
                if (match) {
                    if (match[_rgxAmend_Result] === EPythonConst.ok) {
                        success = true;
                        value = match[_rgxAmend_Value];
                    } else {
                        this.logFn(LogType.warning, () => match[_rgxAmend_Value], true);
                    }
                    return ListenerResponse.stop;
                }
                this.onUnexpectedLine(line);
            }
            return ListenerResponse.needMoreLines;
        });
        success = success && posted;
        this.locker.release();
        return { success, value };
    }

    public async requestGotoTargets(currFile: string, currLine: number) {
        await this.locker.acquire();

        let awailable = false;
        if (!this.started || this.running) {
            this.locker.release();
            return awailable;
        }

        let command = `${PythonServerCommand.GOTO_TARGETS} ${currFile} ${currLine}`;
        let posted = await this.queue.postCommand(command, (cmd, line) => {
            if (line === undefined) {
                this.logFn(LogType.debug, () => `gototargets: aborted`);
                return ListenerResponse.stop;
            }
            line = line.trim();
            if (line) {
                if (line.startsWith(PythonServerMessage.SYNTAX_ERROR)) {
                    return ListenerResponse.stop;
                }
                const match = line.match(_rgxGotoTargtes);
                if (match) {
                    awailable = match[_rgxGotoTargtes_Result] === EPythonConst.ok;
                    return ListenerResponse.stop;
                }
                this.onUnexpectedLine(line);
            }
            return ListenerResponse.needMoreLines;
        });
        this.locker.release();
        return posted && awailable;
    }

    public async requestGoto(ident: number, nextLine: number) {
        await this.locker.acquire();

        if (!this.started || this.running) {
            this.locker.release();
            return false;
        }

        let command = `${PythonServerCommand.GOTO} ${ident} ${nextLine}`;
        let posted = await this.queue.postCommand(command, (cmd, line) => {
            if (line === undefined) {
                this.logFn(LogType.debug, () => `goto: aborted`);
                return ListenerResponse.stop;
            }
            line = line.trim();
            if (line) {
                if (line.startsWith(PythonServerMessage.SYNTAX_ERROR)) {
                    return ListenerResponse.stop;
                }
                const match = line.match(_rgxGoto);
                if (match) {
                    return ListenerResponse.stop;
                }
                this.onUnexpectedLine(line);
            }
            return ListenerResponse.needMoreLines;
        });
        this.locker.release();
        return posted;
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

    public async resetBreakPoint(file: string, line: number) {
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

    public async exceptionRequest(ident: number) {
        await this.locker.acquire();
        
        let success = false;
        if (!this.started || this.running) {
            this.locker.release();
            return { success, info: "" };
        }

        return { success, info: "Exception info" };
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