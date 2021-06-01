import { EventEmitter } from "events";
import * as nls from "vscode-nls";
import path from 'path';

import { LogFunction, LogType, Lock } from "../common/main";
import { ICmdQueue, ListenerResponse } from "../vms_jvm_debug/communication";
import { test_enclosing_quotes } from "../common/quotes";

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
    stopOnSignal = 'stopOnSignal',
    breakpointValidated = 'breakpointValidated',
    output = 'output',
    end = 'end',
};

export enum PythonServerMessage {
    BP_CONFIRM = 'BP_CONFIRM',
    BP_CONFIRM64 = 'BP_CONFIRM64',
    BP_RESET = 'BP_RESET',
    BP_RESET64 = 'BP_RESET64',
    BP_WAIT = 'BP_WAIT',
    BP_WAIT64 = 'BP_WAIT64',
    BREAK = 'BREAK',
    CONTINUED = 'CONTINUED',
    DEBUG = 'DEBUG',
    DISPLAY = 'DISPLAY',
    DISPLAY64 = 'DISPLAY64',
    ENTRY = 'ENTRY',
    EXCEPTION = 'EXCEPTION',
    EXITED = 'EXITED',
    FRAME = 'FRAME',
    FRAME64 = 'FRAME64',
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
    DISPLAY64 = 'd64',
    FRAME  = 'f',
    FRAME64  = 'f64',
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

export interface IAmendResult {
    success: boolean;
    type?: string;
    value?: string;
    size?: number;
};

export interface IPythonVariable {
    ident: number;
    frame: number;
    name: string;
    path?: string;
    type: string;
    size?: number;
    value?: string;
    parent?: IPythonVariable;
    is_long_string?: boolean;
    dict_order?: number;
};

export enum EPythonConst {
    locals      = '-locals-',
    failed      = 'failed',
    aborted     = 'aborted',
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

const _rgxBpConfirm64         = /BP_CONFIRM64 (\d+) (.*)/;
const _rgxBpConfirm64_Len     = 1;
const _rgxBpConfirm64_Result  = 2;

const _rgxBpWait         =  /BP_WAIT "(.*?)" (\d+)?/;
const _rgxBpWait_File    = 1;
const _rgxBpWait_Line    = 2;

const _rgxBpWait64         = /BP_WAIT64 (\d+) (.*)/;
const _rgxBpWait64_Len     = 1;
const _rgxBpWait64_Result  = 2;

const _rgxBpReset         =  /BP_RESET "(.*?)" (\d+)?/;
const _rgxBpReset_File    = 1;
const _rgxBpReset_Line    = 2;

const _rgxBpReset64         = /BP_RESET64 (\d+) (.*)/;
const _rgxBpReset64_Len     = 1;
const _rgxBpReset64_Result  = 2;

const _rgxThreads           = /THREADS (\d+) current (\d+)/;
const _rgxThreads_Thread    = 1;
const _rgxThreads_Current   = 2;

const _rgxFrames            = /thread (\d+) frames (\d+) is (\S+)/;
const _rgxFrames_Thread     = 1;
const _rgxFrames_Frames     = 2;
const _rgxFrames_State      = 3;

const _rgxFrame             = /FRAME file: "(.*?)" line: (\d+) function: "(.*?)" (dead|alive)/;
const _rgxFrame_File        = 1;
const _rgxFrame_Line        = 2;
const _rgxFrame_Function    = 3;

const _rgxFrame64             = /FRAME64 (\d+) (.*)/;
const _rgxFrame64_Len         = 1;
const _rgxFrame64_Result      = 2;

const _rgxDisplay               = /DISPLAY "(.*?)" (failed|aborted|<(?:type|class|enum) '(.*?)'> (?:(value|children|length): (.*)))/;
const _rgxDisplay_Name          = 1;
const _rgxDisplay_Result        = 2;
const _rgxDisplay_Type          = 3;
const _rgxDisplay_ValueDescr    = 4;
const _rgxDisplay_Value         = 5;

const _rgxDisplay64             = /DISPLAY64 (\d+) (.*)/;
const _rgxDisplay64_Len         = 1;
const _rgxDisplay64_Result      = 2;

const _rgxAmend                 = /AMEND (failed|ok) (?:<(?:type|class|enum) '(.*?)'>(?: \[(\d+)\]| = (.*))?)?(.*)/;
const _rgxAmend_Result          = 1;
const _rgxAmend_Type            = 2;
const _rgxAmend_Size            = 3;
const _rgxAmend_Value           = 4;
const _rgxAmend_Message         = 5;

const _rgxGotoTargtes           = /GOTO_TARGETS (failed|ok)(.*)/;
const _rgxGotoTargtes_Result    = 1;

const _rgxGoto                  = /GOTO (failed|ok)/;
const _rgxGoto_Result           = 1;

const _rgxNonBase64idx          = /\[[0-9]+(-[0-9]+)\]/;
const _rgxBase64idx             = /\[[A-Za-z0-9]+=*\]/;

const _rgxCommands = {
    AMEND:          /^a (\d+) (\d+) (\S+) (.+)$/,
    BP_RESET :      /^bpr (?:(\S)+(?: (\S+))?)?$/,
    BP_SET :        /^bps (\S+) (\d+)$/,
    CONTINUE :      /^c$/,
    DISPLAY :       /^d(h|o)?(?: (\d+)(?: (\d+)(?: (\S+)(?: (\d+)(?: (\d+)))?)?)?)?$/,
    DISPLAY64 :     /^d64(h|o)?(?: (\d+)(?: (\d+)(?: (\S+)(?: (\d+)(?: (\d+)))?)?)?)?$/,
    EXEC :          /^e (.+)$/,
    FRAME :         /^f(?: (\d+)(?: (\d+)(?: (\d+))?)?)?$/,
    FRAME64 :       /^f64(?: (\d+)(?: (\d+)(?: (\d+))?)?)?$/,
    GOTO :          /^g (\d+) (\d+)$/,
    GOTO_TARGETS :  /^gt (\S+) (\d+)$/,
    INFO :          /^i$/,
    MODE :          /^m(?: ([0|1]))?$/,
    NEXT :          /^n(?: (\d+))?$/,
    PAUSE :         /^p$/,
    RETURN :        /^r(?: (\d+))?$/,
    STEP :          /^s(?: (\d+))?$/,
    THREADS :       /^t$/,
    RADIX :         /^x (8|10|16)$/,
    PATHFILTER :    /^y(?: \S+)?$/,
};

const _rgxSignal = /SIGNAL:(\d+)/;
const _signalNames = [
    '0',
    'SIGHUP',
    'SIGINT',
    'SIGQUIT',
    'SIGILL',
    'SIGTRAP',
    'SIGABRT',
    '7',
    'SIGFPE',
    'SIGKILL',
    'SIGBUS',
    'SIGSEGV',
    'SIGSYS',
    'SIGPIPE',
    'SIGALRM',
    'SIGTERM',
    'SIGUSR1',
    'SIGUSR2',
    'SIGCHLD',
    '19',
    'SIGTSTP',
    'SIGURG',
    'SIGPOLL',
    'SIGSTOP',
    '24',
    'SIGCONT',
    'SIGTTIN',
    'SIGTTOU',
    'SIGVTALRM',
    'SIGPROF',
    'SIGXCPU',
    'SIGXFSZ',
]

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

    private _confirm64line: string | undefined;
    private _confirm64length: number | undefined;

    private _wait64line: string | undefined;
    private _wait64length: number | undefined;

    private _reset64line: string | undefined;
    private _reset64length: number | undefined;

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
            line = line.replace(rgxEsc, '').replace(/\0/g, '').trim();
            if (line) {
                let stopReason: PythonRuntimeEvents | undefined;
                switch(line) {
                    case  PythonServerMessage.PAUSED:
                        stopReason = PythonRuntimeEvents.stopOnPause;
                        this.sendEvent(PythonRuntimeEvents.output, 'paused');
                        break;
                    case  PythonServerMessage.ENTRY:
                        stopReason = PythonRuntimeEvents.stopOnEntry;
                        break;
                    case PythonServerMessage.BREAK:
                        stopReason = PythonRuntimeEvents.stopOnBreakpoint;
                        this.sendEvent(PythonRuntimeEvents.output, 'breakpoint');
                        break;
                    case PythonServerMessage.STEPPED:
                        stopReason = PythonRuntimeEvents.stopOnStep;
                        this.sendEvent(PythonRuntimeEvents.output, 'step');
                        break;
                }
                if (stopReason === undefined && line.startsWith(PythonServerMessage.EXCEPTION)) {
                    stopReason = PythonRuntimeEvents.stopOnException;
                    this.sendEvent(PythonRuntimeEvents.output, line);
                }
                if (stopReason === undefined && line.startsWith(PythonServerMessage.SIGNAL)) {
                    stopReason = PythonRuntimeEvents.stopOnSignal;
                    let strOut = 'Unhandled ' + line;
                    const matchSignal = line.match(_rgxSignal);
                    if (matchSignal) {
                        const id = +matchSignal[1];
                        if (id < _signalNames.length) {
                            strOut = 'Unhandled ' + _signalNames[id];
                        }
                    }
                    this.sendEvent(PythonRuntimeEvents.output, strOut);
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
                    this.sendEvent(PythonRuntimeEvents.output, 'exit');
                    this.sendEvent(PythonRuntimeEvents.end);
                    return;
                }
                if (line.startsWith(PythonServerMessage.CONTINUED)) {
                    //this.sendEvent(PythonRuntimeEvents.);
                    this.sendEvent(PythonRuntimeEvents.output, 'continue');
                    return;
                }

                // test confirm64 and convert inplace
                if (this._confirm64line !== undefined && this._confirm64length !== undefined ) {
                    // TODO: test if line is suitable for base64
                    this._confirm64line += line.trim();
                    if (this._confirm64line.length >= this._confirm64length) {
                        line = PythonServerMessage.BP_CONFIRM + ' ' + Buffer.from(this._confirm64line, 'base64').toString('utf-8');
                        this._confirm64line = undefined;
                        this._confirm64length = undefined;
                    } else {
                        // wait for a tail
                        return;
                    }
                }
                const matchConfirm64 = line.match(_rgxBpConfirm64);
                if (matchConfirm64) {
                    this._confirm64length = +matchConfirm64[_rgxBpConfirm64_Len];
                    this._confirm64line = matchConfirm64[_rgxBpConfirm64_Result];
                    if (this._confirm64line.length >= this._confirm64length) {
                        line = PythonServerMessage.BP_CONFIRM + ' ' + Buffer.from(this._confirm64line, 'base64').toString('utf-8');
                        this._confirm64length = undefined;
                        this._confirm64line = undefined;
                    } else {
                        // wait for a tail
                        return;
                    }
                }
                const matchConfirm = line.match(_rgxBpConfirm);
                if (matchConfirm) {
                    this.sendEvent(PythonRuntimeEvents.breakpointValidated,
                        matchConfirm[_rgxBpConfirm_File],
                        +matchConfirm[_rgxBpConfirm_Line],
                        matchConfirm[_rgxBpConfirm_Line_R]?+matchConfirm[_rgxBpConfirm_Line_R]:undefined);
                    let file = matchConfirm[_rgxBpConfirm_File];
                    let line = matchConfirm[_rgxBpConfirm_Line_R]?+matchConfirm[_rgxBpConfirm_Line_R]:+matchConfirm[_rgxBpConfirm_Line];
                    this.sendEvent(PythonRuntimeEvents.output, 'bp confirmed for ' + path.basename(file) + ':' + String(line));
                    return;
                }

                // test wait64 and convert inplace
                if (this._wait64line !== undefined && this._wait64length !== undefined ) {
                    // TODO: test if line is suitable for base64
                    this._wait64line += line.trim();
                    if (this._wait64line.length >= this._wait64length) {
                        line = PythonServerMessage.BP_WAIT + ' ' + Buffer.from(this._wait64line, 'base64').toString('utf-8');
                        this._wait64line = undefined;
                        this._wait64length = undefined;
                    } else {
                        // wait for a tail
                        return;
                    }
                }

                const matchWait64 = line.match(_rgxBpWait64);
                if (matchWait64) {
                    this._wait64length = +matchWait64[_rgxBpWait64_Len];
                    this._wait64line = matchWait64[_rgxBpWait64_Result];
                    if (this._wait64line.length >= this._wait64length) {
                        line = PythonServerMessage.BP_WAIT + ' ' + Buffer.from(this._wait64line, 'base64').toString('utf-8');
                        this._wait64length = undefined;
                        this._wait64line = undefined;
                    } else {
                        // wait for a tail
                        return;
                    }
                }
                const matchWait = line.match(_rgxBpWait);
                if (matchWait) {
                    let file = matchWait[_rgxBpWait_File];
                    let line = +matchWait[_rgxBpWait_Line];
                    this.sendEvent(PythonRuntimeEvents.output, 'bp waited for ' + path.basename(file) + ':' + String(line));
                    return;
                }

                // test reset64 and convert inplace
                if (this._reset64line !== undefined && this._reset64length !== undefined ) {
                    // TODO: test if line is suitable for base64
                    this._reset64line += line.trim();
                    if (this._reset64line.length >= this._reset64length) {
                        line = PythonServerMessage.BP_RESET + ' ' + Buffer.from(this._reset64line, 'base64').toString('utf-8');
                        this._reset64line = undefined;
                        this._reset64length = undefined;
                    } else {
                        // wait for a tail
                        return;
                    }
                }

                const matchReset64 = line.match(_rgxBpReset64);
                if (matchReset64) {
                    this._reset64length = +matchReset64[_rgxBpReset64_Len];
                    this._reset64line = matchReset64[_rgxBpReset64_Result];
                    if (this._reset64line.length >= this._reset64length) {
                        line = PythonServerMessage.BP_RESET + ' ' + Buffer.from(this._reset64line, 'base64').toString('utf-8');
                        this._reset64length = undefined;
                        this._reset64line = undefined;
                    } else {
                        // wait for a tail
                        return;
                    }
                }
                const matchReset = line.match(_rgxBpReset);
                if (matchReset) {
                    let file = matchReset[_rgxBpReset_File];
                    let line = +matchReset[_rgxBpReset_Line];
                    this.sendEvent(PythonRuntimeEvents.output, 'bp reset for ' + path.basename(file) + ':' + String(line));
                    return;
                }

                let is_a_command = false;
                for (let rgxName in _rgxCommands) {
                    let rgx = (_rgxCommands as any)[rgxName] as RegExp;
                    if (line.match(rgx)) {
                        is_a_command = true;
                        break;
                    }
                }
                if (!is_a_command) {
                    this.sendEvent(PythonRuntimeEvents.output, line);
                }
            }
        }
    }

    /******************************************************************************************/
    // public
    /******************************************************************************************/

    public start() {
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
                let command = `${PythonServerCommand.FRAME64} ${ident} ${startFrame} ${numFrames}`;
                let parsedFrame = 0;
                let frame64line: string | undefined;
                let frame64length: number | undefined;
                await this.queue.postCommand(command, (cmd, line) => {
                    if (line === undefined) {
                        this.logFn(LogType.debug, () => `frames: aborted`);
                        return ListenerResponse.stop;
                    }
                    // test frame64
                    if (frame64line !== undefined && frame64length !== undefined) {
                        frame64line += line.trim();
                        if (frame64line.length >= frame64length) {
                            frame64line = Buffer.from(frame64line, 'base64').toString('utf-8');
                            line = PythonServerMessage.FRAME + ' ' + frame64line;
                            frame64line = undefined;
                            frame64length = undefined;
                        } else {
                            return ListenerResponse.needMoreLines;
                        }
                    }
                    line = line.trim();
                    if (line) {
                        if (line.startsWith(PythonServerMessage.SYNTAX_ERROR)) {
                            return ListenerResponse.stop;
                        }
                        const match64 = line.match(_rgxFrame64);
                        if (match64) {
                            frame64length = +match64[_rgxFrame64_Len];
                            frame64line = match64[_rgxFrame64_Result];
                            if (frame64line.length >= frame64length) {
                                frame64line = Buffer.from(frame64line, 'base64').toString('utf-8');
                                line = PythonServerMessage.FRAME + ' ' + frame64line;
                                frame64line = undefined;
                                frame64length = undefined;
                            } else {
                                return ListenerResponse.needMoreLines;
                            }
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

        let command = `${PythonServerCommand.DISPLAY64}${showHex?'h':''} ${ident} ${frame} ${varPath}`;
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
        let display64line: string | undefined;
        let display64length: number | undefined;
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
                let enc = test_enclosing_quotes(lastVar.value.trim());
                if (enc.enclosed) {
                    lastVar.value = lastVar.value.trim();
                    if (lastVar.value.length > enc.quote_pos + 1) {
                        lastVar.is_long_string = true;
                    }
                    lastVar.value = lastVar.value.slice(0, enc.quote_pos + 1);
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
            // test display64
            if (display64line !== undefined && display64length !== undefined) {
                display64line += line.trim();
                if (display64line.length >= display64length) {
                    display64line = Buffer.from(display64line, 'base64').toString('utf-8');
                    line = PythonServerMessage.DISPLAY + ' ' + display64line;
                    display64line = undefined;
                    display64length = undefined;
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
                const match64 = line.match(_rgxDisplay64);
                if (match64) {
                    display64length = +match64[_rgxDisplay64_Len];
                    display64line = match64[_rgxDisplay64_Result];
                    if (display64line.length >= display64length) {
                        display64line = Buffer.from(display64line, 'base64').toString('utf-8');
                        line = PythonServerMessage.DISPLAY + ' ' + display64line;
                        display64line = undefined;
                        display64length = undefined;
                    } else {
                        return ListenerResponse.needMoreLines;
                    }
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
                                    if (lastVar.name.startsWith("[=")) {
                                        let dictKey = Buffer.from(lastVar.name.substr(2), 'base64').toString('utf-8');
                                        if (dictKey) {
                                            lastVar.name = '[' + dictKey + ']';
                                            // suppose we have only dict values in this request
                                            lastVar.dict_order = variables.length + (start?start:0);
                                        }
                                    }
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
                                let enc = test_enclosing_quotes(lastVar.value.trim());
                                if (enc.enclosed) {
                                    // does not split
                                    lastVar.value = lastVar.value.trim();
                                    if (lastVar.value.length > enc.quote_pos + 1) {
                                        lastVar.is_long_string = true;
                                    }
                                    lastVar.value = lastVar.value.slice(0, enc.quote_pos + 1);
                                    waitQuota = undefined;
                                    lastVar = undefined;
                                } else {
                                    // split, wait the end of string
                                    return ListenerResponse.needMoreLines;
                                }
                            }
                        } else if (match[_rgxDisplay_Result] === EPythonConst.aborted) {
                            return ListenerResponse.stop;
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

    public async requestSetVariable(ident: number, frame: number, fullName: string, value: string): Promise<IAmendResult> {

        await this.locker.acquire();

        let success = false;
        if (!this.started || this.running) {
            this.locker.release();
            return { success };
        }
        let type: string | undefined;
        let size: number | undefined;

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
                        type = match[_rgxAmend_Type];
                        value = match[_rgxAmend_Value];
                        size = match[_rgxAmend_Size] ? +match[_rgxAmend_Size] : undefined;
                    } else {
                        this.logFn(LogType.warning, () => match[_rgxAmend_Message], true);
                    }
                    return ListenerResponse.stop;
                }
                this.onUnexpectedLine(line);
            }
            return ListenerResponse.needMoreLines;
        });
        success = success && posted;
        this.locker.release();
        return { success, value, type, size };
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