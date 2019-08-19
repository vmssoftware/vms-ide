import * as nls from "vscode-nls";
import { EventEmitter } from "events";
import { LogFunction, LogType, LockQueueAction, LockQueue} from "../common/main";
import { ICmdQueue, ListenerResponse } from "./communication";
import { RgxStrFromStr } from "../common/rgx-from-str";
import { DropCommand } from "./drop";
import { setTimeout } from "timers";
import { stringify } from "querystring";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

interface IParserData {
    currentVar: IJvmVariable,       // current variable
    state: ParserState,             // parser inner state
    inside?: boolean,               // inside object or scope (note: we cannot have expanded objects inside scope)
    quotas?: number,                // number of quotas in givan string value, required for skipping buffer lines
    needRequest?: IJvmVariable[],   // variables for retrieving actual values after parsing
};

enum ParserRequest {
    nextLine,
    fetchAllAndContinueParsing,
}

enum ParserState {
    normal,
    stopped,
    error,
    stringEncountered,
}

export enum JvmRuntimeEvents {
    stopOnEntry = 'stopOnEntry',
    stopOnStep = 'stopOnStep',
    stopOnBreakpoint = 'stopOnBreakpoint',
    stopOnException = 'stopOnException',
    stopOnPause = 'stopOnPause',
    breakpointValidated = 'breakpointValidated',
    output = 'output',
    end = 'end',
};

const SetBreakCommand = true;
const ClearBreakCommand = false;

interface ISetVariableParser {
    command: string,
    resultStart: string,
    echo?: string,
    error?: string,
    result?: boolean,
};

export interface JvmBreakpoint {
	/** unique id */
	breakId: number;
    className: string;
    place: string | number;
    verified?: boolean;
    sent?: boolean;
};

export interface IJvmStack {
	frameId: number;
	level: number;
	place: string;
	file: string;
    line: number;
    thread: IJvmThread;
    scopes: IJvmVariable[];
};

export const _primitiveTypes = [
    "byte",
    "short",
    "int",
    "long",
    "float",
    "double",
    "boolean",
    "char",
];

export const _primitiveBoxedTypes = [
    "java.lang.Byte",
    "java.lang.Short",
    "java.lang.Integer",
    "java.lang.Long",
    "java.lang.Float",
    "java.lang.Double",
    "java.lang.Boolean",
];

export const _charBoxedTypes = [
    "java.lang.Character",
];

export const _typesCanBeAsPrimitiveArray = [
    ..._primitiveTypes,
    ..._primitiveBoxedTypes,
    ..._charBoxedTypes,
];

export const _typesRequiredUnboxing = [
    ..._primitiveBoxedTypes,
    ..._charBoxedTypes,
];

export const _stringTypes = [
    "java.lang.String",
];

export enum JvmVarType {
    'string',
    'boolean',
    'char',
    'number',
    'object',
    'scope',
};

interface IJvmTypeFromTypeName {
    type: JvmVarType,
    typeNames: string[];
    rgxValue?: RegExp;
};

export const _typeFromNames: IJvmTypeFromTypeName[] = [
    {
        type: JvmVarType.string,
        typeNames: ["java.lang.String"],
        rgxValue: /\"/i,
    },
    {
        type: JvmVarType.boolean,
        typeNames: [
            "boolean",
            "java.lang.Boolean"
        ],
        rgxValue: /\btrue\b|\bfalse\b/i,
    },
    {
        type: JvmVarType.char,
        typeNames: [
            "char",
            "java.lang.Character"
        ],
    },
    {
        type: JvmVarType.number,
        typeNames: [
            "byte",
            "short",
            "int",
            "long",
            "float",
            "double",
            "java.lang.Byte",
            "java.lang.Short",
            "java.lang.Integer",
            "java.lang.Long",
            "java.lang.Float",
            "java.lang.Double",
        ],
        rgxValue: /\d+(\.\d+)?/i,
    }
];

export interface IJvmVariable {
    varId: number;
    name: string;
    value?: string;
    type?: JvmVarType,
    typeName?: string,
    arraySize?: number,
    parentId?: number;
    vars?: IJvmVariable[];
};

export function isJvmVarNeedReference(jvmVar: IJvmVariable): boolean {
    return  jvmVar.type === JvmVarType.scope || jvmVar.type === JvmVarType.object || jvmVar.arraySize !== undefined;
}

export interface IJvmThread {
	/** thread unique id */
	id: number;
	/** description inside brackets */
	place: string;
	/** tail after thread id */
	description: string;
	/** name of the thread, first part of the description, prompt */
	name?: string;
	/** current stack level, inside square brackets */
	stackLevel?: number;
	/** thread state, last part of the description */
	state?: string;
	/** stack */
	stack: IJvmStack[];
};

export interface JvmStoppedThread {
	name: string;
	reason: string;
};

export interface IJvmLaunch {
    /** a class to execute. */
    class: string;
    /** a ':' separated list of directories, JAR archives, and ZIP archives to search for class files. */
    classpath: string;
    /** a port to debug. */
    port?: string;
    /** command line arguments */
    arguments?: string;
    /** automatically stop target after launch. If not specified, target does not stop. */
    stopOnEntry?: boolean;
	/** scope */
    scope?: string;
};

/**
 * Local structures and data
 */

interface IStopLine {
	rgx: RegExp;
	reason: string;
};

const _stopEvents: IStopLine[] = [
    {
        rgx: /Breakpoint hit:/,
        reason: JvmRuntimeEvents.stopOnBreakpoint
    },
    {
        rgx: /Step completed:/,
        reason: JvmRuntimeEvents.stopOnStep
    },
    {
        rgx: /Exception occurred:/,
        reason: JvmRuntimeEvents.stopOnException
    },
];

const _pauseEvent = {
    rgx: /All threads suspended./,
    reason: JvmRuntimeEvents.stopOnPause
};

const _exitEvents: IStopLine[] = [
    {
        rgx: /The application exited/,
        reason: JvmRuntimeEvents.end
    },
    {
        rgx: /The application has been disconnected/,
        reason: JvmRuntimeEvents.end
    },
    {
        rgx: /\x00/,
        reason: JvmRuntimeEvents.end
    }
];

const _rgxStoppedThread = {
    rgx: /\"thread=(.*?)\", /,
    threadName: 1,
};

const _rgxDefPrompt = {
    rgx: /^>\s*$/,
};

const _rgxThreadPrompt = {
    rgx: /^(.*?)\[(\d+)\]\s*$/,
    threadName: 1,
    stackLevel: 2,
};

const _rgxAttachFailed = { 
    rgx: /Unable to attach to target VM/,
};

const _rgxGroup = { 
    rgx: /^Group (.*?):/,
    groupName: 1,
};

const _rgxThread = {
    rgx: /\((.*?)\)0x([0-9a-fA-F]+)\s+(.*)/,
    place: 1,
    id: 2,
    description: 3,
};

const _rgxStack = {
    rgx: /\[(\d+)\]\s+(\S+)\s+\((.+?)\)/,
    rgxFileLine: /(\S+?):(\d+)/,
    level: 1,
    place: 2,
    fileline: 3,
    file: 1,
    line: 2,
};

const _rgxBreakPoint = { 
    rgxFail: /Unable to set breakpoint/,
    rgxDefer: /It will be set after the class is loaded/,
    rgxSet: /Set breakpoint (\S+)/,
    rgxSetDef: /Set deferred breakpoint (\S+)/,
    rgxClear: /Removed: breakpoint (\S+)/,
};

const _rgxParse = {
    rgxScope : /^(.+?):\s*$/,
    rgxVariable : /^\s*(\S+?)\s*[:=]\s*(.*?)\s*$/,
    rgxVariableString : /^\s*(\S+?)\s*[:=]\s*\"/,
    rgxVariableObjectStart : /^\s*(\S+?)\s*[:=]\s*\{\s*$/,
    rgxVariableObjectEnd : /^\s*\}\s*$/,
    rgxLocals : /^\s*locals\s*$/,
    rgxDump : /^\s*dump (.*)\s*$/,
    rgxPrimitive: /^(?:\S*)ParseException: Cannot access field of primitive type: (.)$/,
    rgxIsJvmInstanceOf: /instance of ([^\s\[\(]+)(?:\[(\d+)\])?/,
    rgxBadResult: /= null\s*$/,
};

const _rgxFix = {
    rgxUnicode : /\\u[\da-f]{4}/i,
    rgxNumber : /([-+])?\d+(\.\d+)?/i,
    rgxEsc : /([^\\]*)\\(.)/,
    rgxEmptyStr: /\s*\+\s*\"\"\s*/g,
};

/**
 * Only when we are waiting for result lines
 */
export enum JvmRuntimeOperation {
	none,
	askAttach,
	waitPrompt,
	askThreads,
	askStack,
};

export enum JvmPrompt {
    promptIsUnknownThread = -3,
    promptIsStoppedThread = -2,
    promptIsDefault = -1,
    promptIsNotAPrompt = 0,
};

export function convertCodeToJavaEscaped(code: number) {
    if (code < 0x20 || code >= 0x7f || code === 0x22 ) {
        return "\\u" + code.toString(16).padStart(4, "0");
    }
    return String.fromCharCode(code);
}

export function convertCodeToJavaCharacter(code: number) {
    if (code < 0x20 || code >= 0x7f || code === 0x22 ) {
        return `"+java.lang.Character.valueOf(${code})+"`;
    }
    return String.fromCharCode(code);
}

export function convertStringToJavaEscaped(str: string) {
    let result = "";
    for (let i = 0; i < str.length; ++i) {
        result += convertCodeToJavaEscaped(str.charCodeAt(i));
    }
    return result;
}

interface IEscCode {
    code: string,
    value: string,
}

const _escCodes: IEscCode[] = [
    {
        code: "r",
        value: "\r"
    },
    {
        code: "n",
        value: "\n"
    },
    {
        code: "t",
        value: "\t"
    },
    {
        code: "b",
        value: "\b"
    },
    {
        code: "f",
        value: "\f"
    },
    {
        code: "'",
        value: "'"
    },
    {
        code: "\"",
        value: "\""
    },
    {
        code: "\\",
        value: "\\"
    },
];

export function unescapeJavaString(str: string) {
    let result = "";
    while(true) {
        const found = str.match(_rgxFix.rgxEsc);
        if (!found) {
            break;
        }
        result += found[1];
        let   cutLength = found[0].length;
        const codeToFind = found[2].toLowerCase();
        const foundEsc = _escCodes.find(esc => esc.code === codeToFind);
        if (foundEsc) {
            result += foundEsc.value;
        } else if (codeToFind === 'u') {
            let uniCode = 0;
            const maxUnicodeSymbols = 4;
            for(let i = 0; i < maxUnicodeSymbols && cutLength < str.length; ++i) {
                const addUniCode = parseInt(str[cutLength], 16);
                if (!Number.isNaN(addUniCode)) {
                    uniCode = uniCode * 16 + addUniCode;
                    ++cutLength;
                } else {
                    break;
                }
            }
            result += String.fromCharCode(uniCode);
        } else if (codeToFind >= '0' && codeToFind <= '7') {
            let eightCode = parseInt(codeToFind, 8);
            const maxEightCodeSymbols = 2;
            for(let i = 0; i < maxEightCodeSymbols && cutLength < str.length; ++i) {
                const addEightCode = parseInt(str[cutLength], 8);
                if (!Number.isNaN(addEightCode)) {
                    eightCode = eightCode * 8 + addEightCode;
                    ++cutLength;
                } else {
                    break;
                }
            }
            result += String.fromCharCode(eightCode);
        }
        str = str.substr(cutLength);
    }
    result += str;
    return result;
}

export function makeStringReadyToSet(str: string) {
    let result = "\"";
    for (let i = 0; i < str.length; ++i) {
        const code = str.charCodeAt(i);
        result += convertCodeToJavaCharacter(code);
    }
    return (result + "\"").replace(_rgxFix.rgxEmptyStr, "");
}

/**
 * A Jvm runtime.
 */
export class JvmShellRuntime extends EventEmitter {

	private _logFn: LogFunction;

	private _breakpointLastId = 0;
	private _breakpoints: Map<string, JvmBreakpoint> = new Map<string, JvmBreakpoint>();

	private _args: IJvmLaunch | undefined;

	private _threadMap: Map<string, IJvmThread[]> | undefined;
	
	private _attached = false;
    private _running = false;
    private _requestRun = 0;
    
    private _stoppedThreads: JvmStoppedThread[] = [];
    private _stoppedThreadId?: number;

    private _lastThreadId = 0;
    private _lastFrameId = 0;
    private _isPausePressed = false;

    private _vars = new Map<number, IJvmVariable>();

    private readonly waitFetch = 500;

    private cmdLock = new LockQueue(false);

	constructor(private _queue: ICmdQueue, logFn?: LogFunction) {
		super();
        // tslint:disable-next-line:no-empty
        this._logFn = logFn || (() => {});
        
        this._queue.onUnexpectedLine((line) => {
            this.onUnexpectedLine(line);
        });
    }

    /******************************************************************************************/
    // public
    /******************************************************************************************/

    /**
     * Do any command. TODO: REMOVE
     * @param command 
     */
    public async command(command: string) {
        this._logFn(LogType.debug, () => `POSTING ${command}`);
		this._queue.postCommand(command, undefined);
	}

	/**
	 * Start executing the given program.
	 */
	public async start(args: IJvmLaunch) {
		this._args = args;
        return this.attachJDB().
            then((attached) => {
                if (attached) {
                    if (this.isPaused()) {
                        return this.sendAllBreakPoints();
                    }
                }
                return false;
            }).
            then((breakPointsSet) => {
                if (breakPointsSet) {
                    return this.cont();
                }
                return false;
            });
    }
    
	/**
	 * Pause execution
	 */
	public async pause() {
        const command = 'suspend';
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        if (acquired) {
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            if (this.isRunning()) {
                this._logFn(LogType.debug, () => `POSTING ${command}`);
                return this._queue.postCommand(command, undefined).
                    then((isOk) => {
                        this.cmdLock.release();
                        this._logFn(LogType.debug, () => `CMD released "${command}"`);
                        return isOk;
                    });
            }
            this.cmdLock.release();
            this._logFn(LogType.debug, () => `CMD released "${command}"`);
        }
        return false;
	}

    /**
	 * Continue execution
	 */
	public async cont(threadID?: number) {
        const command = 'cont';
        ++this._requestRun;
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        --this._requestRun;
        if (acquired) {
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            return this.runByCommand(command, threadID).
                then((isOk) => {
                    this.cmdLock.release();
                    this._logFn(LogType.debug, () => `CMD released "${command}"`);
                    return isOk;
                });
        }
        return false;
	}

	/**
	 * Step into
	 */
	public async step(threadID?: number) {
        const command = 'step';
        ++this._requestRun;
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        --this._requestRun;
        if (acquired) {
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            return this.runByCommand(command, threadID).
                then((isOk) => {
                    this.cmdLock.release();
                    this._logFn(LogType.debug, () => `CMD released "${command}"`);
                    return isOk;
                });
        }
        return false;
	}

	/**
	 * Step over
	 */
	public async next(threadID?: number) {
        let command = 'next';
        if (threadID && this._stoppedThreadId !== threadID) {
            command = 'step';   //if thread changes we cannot post 'next' because it runs whole program
        }
        ++this._requestRun;
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        --this._requestRun;
        if (acquired) {
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            return this.runByCommand(command, threadID).
                then((isOk) => {
                    this.cmdLock.release();
                    this._logFn(LogType.debug, () => `CMD released "${command}"`);
                    return isOk;
                });
        }
        return false;
	}
    
	/**
	 * Step out
	 */
	public async stepOut(threadID?: number) {
        const command = 'step up';
        ++this._requestRun;
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        --this._requestRun;
        if (acquired) {
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            return this.runByCommand(command, threadID).
                then((isOk) => {
                    this.cmdLock.release();
                    this._logFn(LogType.debug, () => `CMD released "${command}"`);
                    return isOk;
                });
        }
        return false;
    }
    
    /**
     * Request threads
     */
	public async requestThreads() {
        const command = 'requestThreads';
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        if (acquired) {
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            if (!this._threadMap) {
                await this.populateThreadsInfo();
            }
            this.cmdLock.release();
            this._logFn(LogType.debug, () => `CMD released "${command}"`);
        }
		return this.mainThreads();
	}

    /**
	 * Request stack
	 */
	public requestStack(threadId: number, startFrame: number, endFrame: number) {
        let     frames: IJvmStack[] = [];
        let     totalFrames = 0;
        const   mainGroup = this.mainThreads();
        if (mainGroup) {
            for(const threadInfo of mainGroup) {
                if (threadInfo.id === threadId) {
                    totalFrames = threadInfo.stack.length;
                    if (totalFrames) {
                        frames = threadInfo.stack.slice(startFrame, endFrame);
                    } else {
                        totalFrames = 1;
                        frames.push({
                            frameId: 0,
                            file: "",
                            line: 1,
                            level: 1,
                            place: "",
                            thread: threadInfo,
                            scopes: []
                        });
                    }
                    break;
                }
            }
        }
		return {
			frames,
			totalFrames,
		};
    }

    /**
     * Request variable
     * @param jvmVar 
     * @param start 
     * @param count 
     */
    public async requestVariable(jvmVar: IJvmVariable, start?: number, count?: number) {
        if (jvmVar.type === JvmVarType.scope || jvmVar.vars !== undefined) {
            return true;
        }
        const command = 'requestVariable';
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        if (acquired) {
            let retCode = true;
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            if (this.isDataCommandAllowed()) {
                if (jvmVar.arraySize === undefined) {
                    retCode = await this.dumpVariable(jvmVar);
                } else {
                    start = start || 0;
                    count = count || jvmVar.arraySize - start;
                    count = Math.min(count, jvmVar.arraySize - start);
                    if (jvmVar.typeName !== undefined && _typesCanBeAsPrimitiveArray.includes(jvmVar.typeName)) {
                        retCode = await this.evalPrimitiveArray(jvmVar, start, count);
                    } else {
                        for (let i = start; retCode && i < start + count; ++i) {
                            let indexedVar: IJvmVariable = {
                                name: `[${i}]`,
                                varId: this._vars.size + 1,
                                parentId: jvmVar.varId,
                            };
                            this._vars.set(indexedVar.varId, indexedVar);
                            jvmVar.vars = jvmVar.vars || [];
                            jvmVar.vars.push(indexedVar);
                            if (jvmVar.typeName !== undefined && _stringTypes.includes(jvmVar.typeName)) {
                                retCode = await this.evalStringValue(indexedVar);
                            } else {
                                retCode = await this.dumpVariable(indexedVar);
                            }
                        }
                    }
                }
            }
            if (retCode) {
                this.correctVariables([jvmVar]);
            }
            this.cmdLock.release();
            this._logFn(LogType.debug, () => `CMD released "${command}"`);
            return retCode;
        }
        return false;
    }

    public async requestSetVariable(parent: IJvmVariable, name: string, value: string) {
        const command = 'requestSetVariable';
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        if (acquired) {
            let retCode = true;
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            if (this.isDataCommandAllowed()) {
                if (parent.vars) {
                    const jvmVar = parent.vars.find((child) => child.name === name);
                    if (jvmVar) {
                        retCode = await this.setVariable(jvmVar, value);
                    }
                }
            }
            this.cmdLock.release();
            this._logFn(LogType.debug, () => `CMD released "${command}"`);
            return retCode;
        }
        return false;
    }

    /**
     * Request scopes
     * @param frameId 
     */
    public async requestScopes(frameId: number) {
        let retScopes: IJvmVariable[] | undefined;
        const command = 'requestScopes';
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        if (acquired) {
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            if (await this.setFrame(frameId)) {
                const stackFrame = this.getFrame(frameId);
                if (stackFrame) {
                    if (stackFrame.scopes.length === 0) {
                        await this.getLocals(stackFrame);
                        await this.dumpThis(stackFrame);
                        this.correctVariables(stackFrame.scopes);
                    }
                    retScopes = stackFrame.scopes;
                }
            }
            this.cmdLock.release();
            this._logFn(LogType.debug, () => `CMD released "${command}"`);
        }
        return retScopes;
    }

	/*
	 * Set breakpoint in file with given line.
	 */
	public async setBreakPoint(className: string, place: string | number) {
        const command = 'setBreakPoint';
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        if (acquired) {
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            let bpKey = this.buildBpKey(className, place);
            let bp = this._breakpoints.get(bpKey);
            if (!bp) {
                bp = {
                    className,
                    place,
                    breakId: ++this._breakpointLastId,
                };
                this._breakpoints.set(bpKey, bp);
            }
            if (!bp.sent) {
                bp.sent = await this.postBreakPointCmd(SetBreakCommand, bp.className, bp.place);
            }
            this.cmdLock.release();
            this._logFn(LogType.debug, () => `CMD released "${command}"`);
            return bp;
        }
        return undefined;
	}

    /**
     * Clear BP
     * @param id 
     */
	public async clearBreakPointByID(id: number) {
        const command = 'clearBreakPointByID';
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        if (acquired) {
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            for (const [bpKey, bp] of this._breakpoints) {
                if (bp.breakId === id) {
                    this._breakpoints.delete(bpKey);
                    return this.postBreakPointCmd(ClearBreakCommand, bp.className, bp.place).
                                then((isOk) => {
                                    this.cmdLock.release();
                                    this._logFn(LogType.debug, () => `CMD released "${command}"`);
                                    return isOk;
                                });
                }
            }
            this.cmdLock.release();
            this._logFn(LogType.debug, () => `CMD released "${command}"`);
        }
        return false;
	}

    /******************************************************************************************/
    // private
    /******************************************************************************************/

    private isRunning() {
        return this._attached && this._running;
    }
    
    private isPaused() {
        return this._attached && !this._running;
    }

    private isDataCommandAllowed() {
        return this._requestRun === 0 && this.isPaused();
    }
    
    private setRunning(state: boolean) {
        this._running = state;
        if (state) {
            this._threadMap = undefined;
            this._stoppedThreadId = 0;
            this._lastThreadId = 0;
            this._lastFrameId = 0;
            this._vars = new Map<number, IJvmVariable>();
        }
    }

    private onUnexpectedLine(line: string | undefined): void {
        if (line) {
            this._logFn(LogType.debug, () => `unexpected: ${line.trimRight()}`);

            for (const exitEvent of _exitEvents) {
                const matchedEvent = line.match(exitEvent.rgx);
                if (matchedEvent) {
                    this.sendEvent(exitEvent.reason);
                    const tail = line.replace(matchedEvent[0], "");
                    return this.onUnexpectedLine(tail);
                }
            }

            for (const stopEvent of _stopEvents) {
                const matchedEvent = line.match(stopEvent.rgx);
                if (matchedEvent) {
                    this.setRunning(false);
                    this._isPausePressed = false;
                    const matchedStoppedThread = line.match(_rgxStoppedThread.rgx);
                    if (matchedStoppedThread) {
                        const threadName = matchedStoppedThread[_rgxStoppedThread.threadName];
                        this._stoppedThreads.push({
                            name: threadName,
                            reason: stopEvent.reason,
                        });
                    } else {
                        // wait for stopped thread name
                        this._stoppedThreads.push({
                            name: "",
                            reason: stopEvent.reason,
                        });
                    }
                    const tail = line.replace(matchedEvent[0], "");
                    return this.onUnexpectedLine(tail);
                }
            }

            const pausedMatch = line.match(_pauseEvent.rgx);
            if (pausedMatch) {
                this._isPausePressed = true;
                const tail = line.replace(pausedMatch[0], "");
                return this.onUnexpectedLine(tail);
            }

            const waitThreadName = this._stoppedThreads.find(th => th.name === "");
            if (waitThreadName) {
                const matchedStoppedThread = line.match(_rgxStoppedThread.rgx);
                if (matchedStoppedThread) {
                    waitThreadName.name = matchedStoppedThread[_rgxStoppedThread.threadName];
                    const tail = line.replace(matchedStoppedThread[0], "");
                    return this.onUnexpectedLine(tail);
                }
            }

            [_rgxBreakPoint.rgxSetDef, _rgxBreakPoint.rgxSet].forEach(rgx => {
                const matchedEvent = line.match(rgx);
                if (matchedEvent) {
                    const bpkey = matchedEvent[1];
                    const bp = this._breakpoints.get(bpkey);
                    if (bp) {
                        bp.verified = true;
                        this.sendEvent(JvmRuntimeEvents.breakpointValidated, bp.breakId, true);
                    }
                    const tail = line.replace(matchedEvent[0], "");
                    return this.onUnexpectedLine(tail);
                }
            });

            const promptId = this.testIfThreadPrompt(line);
            if ( promptId === JvmPrompt.promptIsStoppedThread) {
                this.setRunning(false);
                this.populateThreadsInfo().
                    then((isOk) => {
                        if (isOk) {
                            for(const stopped of this._stoppedThreads) {
                                const id = this.findThreadId(stopped.name);
                                if (id) {
                                    // send message for each stopped thread
                                    this.setThread(id).then(() => {
                                        this.sendEvent(stopped.reason, id);
                                        this._stoppedThreadId = id;
                                    });
                                }
                            }
                            this._stoppedThreads = [];  // info is sent, clear this
                        }
                    });
            } else if (promptId === JvmPrompt.promptIsDefault) {
                if (this._isPausePressed) {
                    this._isPausePressed = false;
                    this.setRunning(false);
                    this.populateThreadsInfo().
                        then((isOk) => {
                            if (isOk) {
                                const mainThreads = this.mainThreads();
                                if (mainThreads) {
                                    for(const thread of mainThreads) {
                                        this.setThread(thread.id).then(() => {
                                            this.sendEvent(JvmRuntimeEvents.stopOnPause, thread.id);
                                        });
                                        break;
                                    }
                                }
                            }
                        });
                }
            } else if (promptId > 0) {
                if (this._lastThreadId !== promptId) {
                    this._lastThreadId = promptId;
                    this.adjustLastFrame();
                }
            }
        }
    }

	/**
	 * Post command to attach, wait results
	 */
	private async attachJDB() {
		if (this._attached) {
			return false;
		}
		if (this._args === undefined) {
			return false;
		}
		const command = `jdb -attach ${this._args.port?this._args.port:5005}`;
		return this._queue.postCommand(command, (cmd, line) => {
			if (cmd === command) {
				if (line === undefined) {
                    this._logFn(LogType.debug, () => `attaching: aborted`);
					return ListenerResponse.stop;
                }
                this._logFn(LogType.debug, () => `attaching: ${line.trimRight()}`);
                const matchedPrompt = line.match(_rgxThreadPrompt.rgx);
				if (matchedPrompt) {
                    this._attached = true;
                    this.setRunning(false); // stopped because 'suspend=y'
                    this._logFn(LogType.debug, () => `attaching: completed`);
					return ListenerResponse.stop;
				} else if (line.match(_rgxAttachFailed.rgx)) {
                    this.clearSession();
                    this._logFn(LogType.debug, () => `attaching: failed`);
					return ListenerResponse.stop;
				}
				return ListenerResponse.needMoreLines;
            }
            this._logFn(LogType.debug, () => `attaching: not attaching?`);
			return ListenerResponse.stop;
		});
    }

    /**
     * Find thread with given name in given threadMap. Side effect: name and state may be filled for found thread if it doesn't have them
     * @param threadName 
     * @param threadMap 
     * @returns found thread id or undefined
     */
    private findThreadId(threadName: string, threadMap?: Map<string, IJvmThread[]>) {
        threadMap = threadMap || this._threadMap;
        if (threadMap) {
            for(const [group, threads] of threadMap) {
                for(const thread of threads) {
                    if (thread.name) {
                        if (threadName === thread.name) {
                            return thread.id;
                        }
                    } else if (thread.description.startsWith(threadName + " ")) {
                        thread.name = threadName;
                        thread.state = thread.description.slice(threadName.length + 1).trim();
                        return thread.id;
                    }
                }
            }
        }
        return undefined;
    }

    /**
     * 
     */
	private async populateThreadsInfo() {
        if (!this.isDataCommandAllowed()) {
            return false;
        }
		const command = 'threads';
		let   threadGroupName = "";
        const threadMap = new Map<string, IJvmThread[]>();
        this._logFn(LogType.debug, () => `POSTING ${command}`);
		return this._queue.postCommand(command, (cmd, line) => {
			if (cmd === command) {
				if (line === undefined) {
                    this._logFn(LogType.debug, () => `threads: aborted`);
					return ListenerResponse.stop;
                } 
                this._logFn(LogType.debug, () => `${cmd}: ${line.trimRight()}`);
				const rgxGroup = _rgxGroup.rgx;
				const matchedGroup = rgxGroup.exec(line);
				if (matchedGroup) {
					threadGroupName = matchedGroup[_rgxGroup.groupName];
					return ListenerResponse.needMoreLines;    // need more lines
				}
				const rgxThread = _rgxThread.rgx;
				let matchedThread = rgxThread.exec(line);
				if (matchedThread) {
                    let threadGroup = threadMap.get(threadGroupName);
                    if (threadGroup === undefined) {
                        threadGroup = [];
                        threadMap.set(threadGroupName, threadGroup);
                    }
                    threadGroup.push({
                        id: Number.parseInt(matchedThread[_rgxThread.id], 16),
                        place: matchedThread[_rgxThread.place],
                        description: matchedThread[_rgxThread.description],
                        stack: [],
                    });
					return ListenerResponse.needMoreLines;    // need more lines
				}
				// try to match thread prompt
				if (this.testIfThreadPrompt(line, threadMap) !== JvmPrompt.promptIsNotAPrompt) {
                    // request completed, no more lines required
                    this._threadMap = threadMap;
                    this._logFn(LogType.debug, () => `---threads: completed`);
                    return ListenerResponse.stop;   // command 'threads' completed
				}
				return ListenerResponse.needMoreLines;	// need more lines
			}
			return ListenerResponse.stop;
		}).then(async (isSent) => {
            if (!isSent || !this.isDataCommandAllowed()) {
                return false;
            }
            if (this._threadMap) {
                const mainGroup = this._threadMap.get("main");
                if (mainGroup) {
                    let frameId = 0;
                    for(const threadInfo of mainGroup) {
                        if (!this.isDataCommandAllowed()) {
                            return false;
                        }
                        const command = `where ${threadInfo.id}`;
                        this._logFn(LogType.debug, () => `POSTING ${command}`);
                        const wherePosted = await this._queue.postCommand(command, (cmd, line) => {
                            if (cmd === command) {
                                if (line === undefined) {
                                    this._logFn(LogType.debug, () => `---where: aborted`);
                                    return ListenerResponse.stop;
                                }
                                this._logFn(LogType.debug, () => `${cmd}: ${line.trimRight()}`);
                                const matchedStack = line.match(_rgxStack.rgx);
                                if (matchedStack) {
                                    const stackFrame: IJvmStack = {
                                        frameId: ++frameId,
                                        level: +matchedStack[_rgxStack.level],
                                        place: matchedStack[_rgxStack.place],
                                        file: matchedStack[_rgxStack.fileline],
                                        line: 0,
                                        thread: threadInfo,
                                        scopes: []
                                    }
                                    const matchFileLine = matchedStack[_rgxStack.fileline].match(_rgxStack.rgxFileLine);
                                    if (matchFileLine) {
                                        stackFrame.file = matchFileLine[_rgxStack.file];
                                        stackFrame.line = +matchFileLine[_rgxStack.line];
                                    }
                                    threadInfo.stack.push(stackFrame);
                                    return ListenerResponse.needMoreLines;
                                }
                                // try to match thread prompt
                                if (this.testIfThreadPrompt(line) !== JvmPrompt.promptIsNotAPrompt) {
                                    if (this._lastThreadId !== threadInfo.id) {
                                        this._lastThreadId = threadInfo.id;
                                        this._lastFrameId = 0;
                                        if (threadInfo.stack.length) {
                                            this._lastFrameId = threadInfo.stack[0].frameId;
                                        }
                                    }
                                    // request completed, no more lines required
                                    this._logFn(LogType.debug, () => `---where: completed`);
                                    return ListenerResponse.stop;
                                }
                                return ListenerResponse.needMoreLines;
                            }
                            this._logFn(LogType.debug, () => `---where: not a where command?`);
                            return ListenerResponse.stop;
                        });
                        if (!wherePosted) {
                            return false;
                        }
                    }
                }
            }
            return true;
        });
    }
    
    private async setThread(id: number) {
        if (this._lastThreadId === id) {
            return true;
        }
        // this is not data command, so test isPaused() only
        if (this.isPaused()) {
            const command = `thread ${id}`;
            this._logFn(LogType.debug, () => `POSTING ${command}`);
            return this._queue.postCommand(command, (cmd, line) => {
                if (cmd === command) {
                    if (line === undefined) {
                        this._logFn(LogType.debug, () => `${cmd}: aborted`);
                        return ListenerResponse.stop;
                    }
                    this._logFn(LogType.debug, () => `${cmd}: ${line.trimRight()}`);
                    // try to match thread prompt
                    if (this.testIfThreadPrompt(line) !== JvmPrompt.promptIsNotAPrompt) {
                        if (this._lastThreadId !== id) {
                            this._lastThreadId = id;
                            this.adjustLastFrame();
                        }
                        // request completed, no more lines required
                        this._logFn(LogType.debug, () => `---${cmd}: completed`);
                        return ListenerResponse.stop;
                    }
                    return ListenerResponse.needMoreLines;
                }
                this._logFn(LogType.debug, () => `${cmd}: not a "${cmd}" command?`);
                return ListenerResponse.stop;
            });
        }
        return false;
    }

    private adjustLastFrame() {
        this._lastFrameId = 0;
        if (this._threadMap) {
            for (const [group, threads] of this._threadMap) {
                for (const thread of threads) {
                    if (thread.id === this._lastThreadId) {
                        if (thread.stack.length) {
                            this._lastFrameId = thread.stack[0].frameId;
                        }
                        break;
                    }
                }
            }
        }
    }

    /**
	 * Test if line is thread prompt or just default prompt
	 * @param line 
	 * @returns 0 if line isn't prompt, -1 if it is default prompt, -2 if it is stopped thread prompt, > 0 if it is thread prompt
	 */
	private testIfThreadPrompt(line: string, threadMap?: Map<string, IJvmThread[]>) {
        if (line.match(_rgxDefPrompt.rgx)) {
			return JvmPrompt.promptIsDefault;
        }
        const matchPrompt = line.match(_rgxThreadPrompt.rgx);
        if (matchPrompt) {
            const threadName = matchPrompt[_rgxThreadPrompt.threadName];
            threadMap = threadMap || this._threadMap;
            if (threadMap) {
                const threadId = this.findThreadId(threadName, threadMap);
                if (threadId) {
                    return threadId;
                }
            }
            for (const stopped of  this._stoppedThreads) {
                if (stopped.name === threadName) {
                    return JvmPrompt.promptIsStoppedThread;
                }
            }
            return JvmPrompt.promptIsUnknownThread;
        }
        // this._logFn(LogType.debug, () => `not a prompt ${[...Buffer.from(line)]}`);
		return JvmPrompt.promptIsNotAPrompt;
	}

	private clearSession() {
        this._attached = false;
        this._running = false;
		this.sendEvent(JvmRuntimeEvents.end);
	}

    private async runByCommand(command: string, threadID?: number) {
        if (threadID && this._lastThreadId !== threadID) {
            if (!await this.setThread(threadID)) {
                return false;
            }
        }
        if (this.isPaused()) {
            this._logFn(LogType.debug, () => `POSTING ${command}`);
            return this._queue.postCommand(command, (cmd, line) => {
                    this._logFn(LogType.debug, () => `COMPLETED ${command}`);
                    this.setRunning(true);
                    return ListenerResponse.stop;
                }, LockQueueAction.normal);
        }
        return false;
    }
    
	private mainThreads() {
		if (this._threadMap) {
			return this._threadMap.get("main");
		}
		return undefined;
	}

    private correctVariables(initVars: IJvmVariable[]) {
        const allVars: IJvmVariable[] = [...initVars];
        // convert string to escaped string
        for (let i = 0; i < allVars.length; ++i) {
            const currentVar = allVars[i];
            if (currentVar !== undefined) {
                switch (currentVar.type) {
                    case JvmVarType.char:
                        if (currentVar.arraySize === undefined && currentVar.value) {
                            currentVar.value = convertStringToJavaEscaped(currentVar.value);
                        }
                }
                if (currentVar.vars !== undefined) {
                    allVars.push(...currentVar.vars);
                }
            }
        }
    }

    private getVarFullName(jvmVar: IJvmVariable) {
        let fullName = jvmVar.name;
        let parentId = jvmVar.parentId;
        while(parentId) {
            const parent = this._vars.get(parentId);
            parentId = undefined;
            if (parent && parent.type !== JvmVarType.scope) {
                fullName = parent.name + (fullName.startsWith("[") ? "" : ".") + fullName;
                parentId = parent.parentId;
            }
        }
        return fullName;
    }

    private parseLine(line: string, data: IParserData) {
        if (data.state === ParserState.stringEncountered) {
            if (data.quotas === undefined) {
                // first call after fetching
                if (data.currentVar && data.currentVar.value) {
                    if (data.currentVar.type === JvmVarType.string) {
                        // count quotas in original string + add two more (at the begin and at the end)
                        data.quotas = (data.currentVar.value.split("\"").length - 1) + 2;
                    }
                }
            }
            if (data.quotas !== undefined) {
                data.quotas -= line.split("\"").length - 1;
                if (data.quotas > 0) {
                    return ParserRequest.nextLine;
                }
            }
            // COMPLETED
            data.quotas = undefined;
            data.state = ParserState.normal;
            // close currentVar if it is inside other variable
            if (data.inside && data.currentVar.parentId) {
                const parent = this._vars.get(data.currentVar.parentId);
                if (parent) {
                    data.currentVar = parent;
                } else {
                    data.state = ParserState.error;
                }
            }
            return ParserRequest.nextLine;
        }
        if (data.state === ParserState.normal) {
            if (data.currentVar.type === JvmVarType.scope) {
                // locals, root
                const scopeMatch = line.match(_rgxParse.rgxScope);
                if (scopeMatch) {
                    data.inside = true;
                    while (data.currentVar.parentId) {
                        // go to root
                        const prevScope = this._vars.get(data.currentVar.parentId);
                        if (prevScope) {
                            data.currentVar = prevScope;
                        } else {
                            // unexpected error
                            data.state = ParserState.error;
                            return ParserRequest.nextLine;
                        }
                    }
                    // add new scope to root
                    const newScope: IJvmVariable = {
                        name: scopeMatch[1],
                        varId: this._vars.size + 1,
                        type: JvmVarType.scope,
                        parentId: data.currentVar.varId,
                    };
                    this._vars.set(newScope.varId, newScope);
                    data.currentVar.vars = data.currentVar.vars || [];
                    data.currentVar.vars.push(newScope);
                    data.currentVar = newScope;
                    return ParserRequest.nextLine;
                }
            } else {
                const varObjStartMatch = line.match(_rgxParse.rgxVariableObjectStart);
                if (varObjStartMatch) {
                    data.inside = true;
                    return ParserRequest.nextLine;
                } else {
                    const varObjEndMatch = line.match(_rgxParse.rgxVariableObjectEnd);
                    if (varObjEndMatch) {
                        data.inside = undefined;
                        data.state = ParserState.stopped;
                        return ParserRequest.nextLine;
                    }
                }
            }
            const varStringMatch = line.match(_rgxParse.rgxVariableString);
            if (varStringMatch) {
                if (data.inside) {
                    let innerVar: IJvmVariable | undefined = {
                        name: varStringMatch[1],
                        varId: this._vars.size + 1,
                        parentId: data.currentVar.varId
                    }
                    const dotPos = innerVar.name.lastIndexOf(".");
                    if (dotPos > 0) {
                        innerVar.name = innerVar.name.substr(dotPos + 1);
                    }
                    this._vars.set(innerVar.varId, innerVar);
                    data.currentVar.vars = data.currentVar.vars || [];
                    data.currentVar.vars.push(innerVar);
                    // change currentVar, we will close it after getting string value
                    data.currentVar = innerVar;
                }
                data.state = ParserState.stringEncountered;
                return ParserRequest.fetchAllAndContinueParsing;
            } else {
                const varMatch = line.match(_rgxParse.rgxVariable);
                if (varMatch) {
                    let varToFill = data.currentVar;
                    if (data.inside) {
                        varToFill = {
                            name: varMatch[1],
                            value: varMatch[2],
                            varId: this._vars.size + 1,
                            parentId: data.currentVar.varId,
                        }
                        const dotPos = varToFill.name.lastIndexOf(".");
                        if (dotPos > 0) {
                            varToFill.name = varToFill.name.substr(dotPos + 1);
                        }
                        this._vars.set(varToFill.varId, varToFill);
                        data.currentVar.vars = data.currentVar.vars || [];
                        data.currentVar.vars.push(varToFill);
                        // do not change currentVar, we fill it and close right now
                    }
                    if (this.testIfCharNeedRequest(varToFill)) {
                        data.needRequest = data.needRequest || [];
                        varToFill.type = JvmVarType.char;
                        data.needRequest.push(varToFill);
                    } else {
                        if (this.fillVarTypeByValue(varToFill)) {
                            if (varToFill.arraySize === undefined && 
                                varToFill.typeName !== undefined) {
                                if (_typesRequiredUnboxing.includes(varToFill.typeName)) {
                                    data.needRequest = data.needRequest || [];
                                    data.needRequest.push(varToFill);
                                }
                            }
                        }
                    }
                }
            }
        }
        return ParserRequest.nextLine;
    }

    private testIfCharNeedRequest(jvmVar: IJvmVariable) {
        return jvmVar.value === undefined || jvmVar.value.length === 0 || jvmVar.value === '?';
    }

    private fillVarTypeByValue(jvmVar: IJvmVariable) {
        if (!jvmVar.value) {
            return false;
        }
        const matchedInstance = jvmVar.value.match(_rgxParse.rgxIsJvmInstanceOf);
        if (matchedInstance) {
            if (matchedInstance[2]) {
                jvmVar.arraySize = +matchedInstance[2];
            }
            jvmVar.typeName = matchedInstance[1];
            jvmVar.type = JvmVarType.object;
            for (const testType of _typeFromNames) {
                if (testType.typeNames.includes(jvmVar.typeName)) {
                    jvmVar.type = testType.type;
                    break;
                }
            }
        } else {
            for (const testType of _typeFromNames) {
                if (testType.rgxValue && jvmVar.value.match(testType.rgxValue)) {
                    jvmVar.type = testType.type;
                    break;
                }
            }
            if (jvmVar.type === undefined && jvmVar.value.length === 1) {
                jvmVar.type = JvmVarType.char;
            }
        }
        return jvmVar.type !== undefined;
    }

    private async dumpVariableOrLocals(data: IParserData) {
        if (!this.isDataCommandAllowed()) {
            return false;
        }
        const buffer: string[] = [];
        let timer: NodeJS.Timer | undefined;
        const dropCommand = new DropCommand();
        let command = 'locals';
        if (data.currentVar.type !== JvmVarType.scope) {
            const varFullName = this.getVarFullName(data.currentVar);
            command = `dump ${varFullName}`;
        }
        this._logFn(LogType.debug, () => `POSTING ${command}`);
        let parserLastRequest = ParserRequest.nextLine;
        
        const retCode = await this._queue.postCommand(command, (cmd, line) => {
            this._logFn(LogType.debug, () => `${command}: ${line?line.trimRight():""}`);
            if (command === cmd) {
                if (line === undefined) {
                    return ListenerResponse.stop;
                }
                if (parserLastRequest === ParserRequest.fetchAllAndContinueParsing) {
                    buffer.push(line);
                    if (timer) {
                        clearTimeout(timer);
                    }
                    timer = setTimeout(() => {
                        this._logFn(LogType.debug, () => `TIMEOUT ${command}`);
                        dropCommand.doDropCommand();
                    }, this.waitFetch);
                } else {
                    parserLastRequest = this.parseLine(line, data);
                    if (parserLastRequest === ParserRequest.nextLine) {
                        // test if prompt only for normal parsing state
                        if (this.testIfThreadPrompt(line.trim()) > JvmPrompt.promptIsNotAPrompt) {
                            return ListenerResponse.stop;
                        }
                    } else if (parserLastRequest === ParserRequest.fetchAllAndContinueParsing) {
                        // pass this line again
                        buffer.push(line);
                    }
                }
                return ListenerResponse.needMoreLines;
            }
            return ListenerResponse.stop;
        }, LockQueueAction.normal, dropCommand);

        if (!retCode) {
            this._logFn(LogType.debug, () => `ABORTED ${command}`);
            return retCode;
        }

        // continue parsing after fetch all lines
        for (let i = 0; i < buffer.length; ++i) {
            if (data.state === ParserState.stringEncountered) {
                let evaluated = true;
                if (data.currentVar !== undefined) {
                    if (data.currentVar.value === undefined) {
                        evaluated = await this.evalStringValue(data.currentVar);
                    }
                }
                if (!evaluated) {
                    this._logFn(LogType.debug, () => `ABORTED ${command}`);
                    return false;            
                }
            }
            if (this.parseLine(buffer[i], data) === ParserRequest.fetchAllAndContinueParsing) {
                // parser expects current line again
                --i;
            }
        }

        // get char values
        if (data.needRequest !== undefined) {
            for (const jvmVar of data.needRequest) {
                let evaluated = true;
                if (jvmVar.typeName !== undefined) {
                    if (_primitiveBoxedTypes.includes(jvmVar.typeName)) {
                        evaluated = await this.evalJvmVariable(jvmVar);
                    } else if (_charBoxedTypes.includes(jvmVar.typeName)) {
                        evaluated = await this.evalCharValue(jvmVar, true);
                    }
                } else if (jvmVar.type === JvmVarType.char) {
                    evaluated = await this.evalCharValue(jvmVar);
                }
                if (!evaluated) {
                    this._logFn(LogType.debug, () => `ABORTED ${command}`);
                    return false;
                }
            }
        }

        this._logFn(LogType.debug, () => `COMPLETED ${command}`);
        return true;
    }

    private async dumpVariable(jvmVar: IJvmVariable) {
        const parserData: IParserData = {
            state: ParserState.normal,
            currentVar: jvmVar,
        };
        return await this.dumpVariableOrLocals(parserData);
    }

    private async dumpThis(jvmStack: IJvmStack) {
        // add new scope to root
        const jvmThis: IJvmVariable = {
            name: 'this',
            varId: this._vars.size + 1,
        };
        this._vars.set(jvmThis.varId, jvmThis);
        const parserData: IParserData = {
            state: ParserState.normal,
            currentVar: jvmThis,
        };
        return await this.evalJvmVariable(jvmThis).
            then((isEvaluated) => {
                if (isEvaluated && jvmThis.value) {
                    return this.dumpVariableOrLocals(parserData)
                }
                return false;
            }).then((isDumped) => {
                if (isDumped) {
                    jvmStack.scopes.push(jvmThis);
                }
                return isDumped;
            });
    }

    private async getLocals(jvmStack: IJvmStack) {
        const rootScope: IJvmVariable = {
            name: '',
            type: JvmVarType.scope,
            varId: this._vars.size + 1,
        };
        this._vars.set(rootScope.varId, rootScope);
        const parserData: IParserData = {
            state: ParserState.normal,
            currentVar: rootScope,
        };
        return await this.dumpVariableOrLocals(parserData).
            then((isOk) => {
                if (isOk) {
                    jvmStack.scopes = rootScope.vars || [];
                }
                return isOk;
            });
    }

    private async evalPrimitiveArray(jvmVar: IJvmVariable, from: number, count: number) {
        if (!this.isDataCommandAllowed()) {
            return false;
        }
        const varFullName = this.getVarFullName(jvmVar);
        const evalExpression = `java.util.Arrays.toString(java.util.Arrays.copyOfRange(${varFullName},${from},${from + count}))`;
        const command = `eval ${evalExpression}`;
        const rgxResultStart = new RegExp(`^\\s*${RgxStrFromStr(evalExpression)}\\s*=\\s*\"\\[`);
        let   resultArray: string | undefined;
        let   tmpArray: string | undefined;
        const retValue = await this._queue.postCommand(command, (cmd, line) => {
            this._logFn(LogType.debug, () => `eval array: ${line?line.trimRight():""}`);
            if (cmd === command) {
                if (line === undefined) {
                    return ListenerResponse.stop;
                }
                if (resultArray === undefined) {
                    if (tmpArray === undefined) {
                        const startMatched = line.match(rgxResultStart);
                        if (startMatched) {
                            tmpArray = line.substr(startMatched[0].length);
                        }
                    }
                    else {
                        tmpArray += line;
                    }
                    if (tmpArray !== undefined) {
                        const endPos = tmpArray.lastIndexOf("]\"");
                        if (endPos > 0) {
                            tmpArray = tmpArray.substr(0, endPos);
                            resultArray = tmpArray;
                            tmpArray = undefined;
                            return ListenerResponse.needMoreLines;
                        }
                    }
                }
                return this.waitPromptForShortCommand(line);
            }
            return ListenerResponse.stop;
        });

        if (retValue && resultArray) {
            resultArray = resultArray.replace(/(\r)?\n/g, "");
            const values = resultArray.split(", ");
            if (values.length) {
                jvmVar.vars = jvmVar.vars || [];
                for (let i = 0; i < values.length; ++i) {
                    let innerVar: IJvmVariable = {
                        name: `[${from + i}]`,
                        value: values[i],
                        type: jvmVar.type,
                        typeName: jvmVar.typeName,
                        varId: this._vars.size + 1,
                        parentId: jvmVar.varId,
                    };
                    this._vars.set(innerVar.varId, innerVar);
                    jvmVar.vars.push(innerVar);
                    if (innerVar.type === JvmVarType.char && this.testIfCharNeedRequest(innerVar)) {
                        if (!await this.evalCharValue(innerVar)) {
                            return false;
                        }
                    }
                }
            }
        }
        return retValue;
    }

    private async evalCharValue(jvmVar: IJvmVariable, requireUnboxing?: boolean) {
        if (!this.isDataCommandAllowed()) {
            return false;
        }
        const varFullName = this.getVarFullName(jvmVar);
        const evalExpression = `java.lang.Integer.valueOf(${varFullName}${requireUnboxing?".value":""})`;
        const command = `eval ${evalExpression}`;
        const rgxResult = new RegExp(`^\\s*${RgxStrFromStr(evalExpression)}\\s*=\\s*\"(\\d+)\"`);
        jvmVar.value = undefined;
        const retValue = await this._queue.postCommand(command, (cmd, line) => {
            this._logFn(LogType.debug, () => `eval char: ${line?line.trimRight():""}`);
            if (cmd === command) {
                if (line === undefined) {
                    return ListenerResponse.stop;
                }
                if (jvmVar.value === undefined) {
                    let trimmed = line.trim();
                    const matched = trimmed.match(rgxResult);
                    if (matched) {
                        const code = +matched[1];
                        jvmVar.value = convertCodeToJavaEscaped(code);
                        jvmVar.type = JvmVarType.char;
                    }
                }
                return this.waitPromptForShortCommand(line);
            }
            return ListenerResponse.stop;
        });
        return retValue;
    }

    private async evalJvmVariable(jvmVar: IJvmVariable) {
        if (!this.isDataCommandAllowed()) {
            return false;
        }
        const varFullName = this.getVarFullName(jvmVar);
        const command = `eval ${varFullName}`;
        const rgxResult = new RegExp(`^\\s*${RgxStrFromStr(varFullName)}\\s*=\\s*\"(.*)\"\\s*$`);
        jvmVar.value = undefined;
        const retValue = await this._queue.postCommand(command, (cmd, line) => {
            this._logFn(LogType.debug, () => `eval variable: ${line?line.trimRight():""}`);
            if (cmd === command) {
                if (line === undefined) {
                    return ListenerResponse.stop;
                }
                if (jvmVar.value === undefined) {
                    const matched = line.match(rgxResult);
                    if (matched) {
                        jvmVar.value = matched[1];
                    }
                }
                return this.waitPromptForShortCommand(line);
            }
            return ListenerResponse.stop;
        });
        return retValue;
    }

    private fixSetValue(jvmVar: IJvmVariable, value: string) : string | undefined {
        if (jvmVar.arraySize !== undefined) {
            return undefined;
        }
        switch(jvmVar.type) {
            case JvmVarType.boolean:
                switch(value.toLowerCase()) {
                    case 'true':
                    case 'false':
                        break;
                    default:
                        return undefined;
                }
                break;
            case JvmVarType.char:
                if (value.length === 1){
                    value = convertStringToJavaEscaped(value);
                } else if (!value.match(_rgxFix.rgxUnicode)) {
                    return undefined;
                }
                value = `'${value}'`;
                break;
            case JvmVarType.number:
                const numberMatch = value.match(_rgxFix.rgxNumber);
                if (!numberMatch) {
                    return undefined;
                }
                if (numberMatch[1]) {
                    value = "0" + value;
                }
                break;
            case JvmVarType.object:
            case JvmVarType.scope:
                return undefined;
            case JvmVarType.string:
                const unEscapedValue = unescapeJavaString(value);
                value = makeStringReadyToSet(unEscapedValue);
                break;
        }
        return value;
    }

    private async postCommandAndFetchAllLines(command: string, retLines: string[]) {
        if (!this.isDataCommandAllowed()) {
            return false;
        }
        let timer: NodeJS.Timer | undefined;
        const dropCommand = new DropCommand();
        this._logFn(LogType.debug, () => `POSTING ${command}`);
        return await this._queue.postCommand(command, (cmd, line) => {
            this._logFn(LogType.debug, () => `fetching: ${line?line.trimRight():""}`);
            if (command === cmd) {
                if (line === undefined) {
                    return ListenerResponse.stop;
                }
                retLines.push(line);
                if (timer) {
                    clearTimeout(timer);
                }
                timer = setTimeout(() => {
                    this._logFn(LogType.debug, () => `TIMEOUT ${command}`);
                    dropCommand.doDropCommand();
                }, this.waitFetch);
                return ListenerResponse.needMoreLines;
            }
            return ListenerResponse.stop;
        }, LockQueueAction.normal, dropCommand);
    }

    private setValueResultParser(line: string, data: ISetVariableParser) {
        data.echo = data.echo || "";
        if (data.echo !== data.command) {
            data.echo += line.trim();
        } else if (line.startsWith(data.resultStart)) {
            data.result = true;
        } else if (!data.result){
            data.error = data.error || "";
            data.error += line;
        }
    }

    private async setVariable(jvmVar: IJvmVariable, value: string) {
        if (!this.isDataCommandAllowed()) {
            return false;
        }
        const setValue = this.fixSetValue(jvmVar, value);
        if (!setValue) {
            return false;
        }
        const varFullName = this.getVarFullName(jvmVar);
        const expression = `${varFullName} = ${setValue}`;
        const command = `set ${expression}`;
        let   retValue = false;
        const maxVarNameLength = 32;
        const resultStart = varFullName.length < maxVarNameLength? ` ${varFullName} =` : ` ${varFullName.substr(0, maxVarNameLength)}`;
        const parserData: ISetVariableParser = {
            command,
            resultStart,
        };
        if (jvmVar.type === JvmVarType.string) {
            const lines: string[] = [];
            retValue = await this.postCommandAndFetchAllLines(command, lines);
            if (retValue) {
                for (const line of lines) {
                    this.setValueResultParser(line, parserData);
                }
            }
        } else {
            retValue = await this._queue.postCommand(command, (cmd, line) => {
                this._logFn(LogType.debug, () => `set value: ${line?line.trimRight():""}`);
                if (cmd === command) {
                    if (line === undefined) {
                        return ListenerResponse.stop;
                    }
                    this.setValueResultParser(line, parserData);
                    return this.waitPromptForShortCommand(line);
                }
                return ListenerResponse.stop;
            });
        }
        if (parserData.error) {
            this._logFn(LogType.warning, () => String(parserData.error), true);
            return false;
        }
        return retValue;
    }

    /**
     * Evaluate string as bytes array and parse
     */
    private async evalStringValue(jvmVar: IJvmVariable) {
        if (!this.isDataCommandAllowed()) {
            return false;
        }
        const varFullName = this.getVarFullName(jvmVar);
        const evalExpression = `java.util.Arrays.toString(${varFullName}.getBytes())`;
        const command = `eval ${evalExpression}`;
        const rgxResultStart = new RegExp(`^\\s*${RgxStrFromStr(evalExpression)}\\s*=\\s*\"\\[`);
        let   resultArray: string | undefined;
        const retValue = await this._queue.postCommand(command, (cmd, line) => {
            this._logFn(LogType.debug, () => `eval string: ${line?line.trimRight():""}`);
            if (cmd === command) {
                if (line === undefined) {
                    return ListenerResponse.stop;
                }
                if (jvmVar.value === undefined) {
                    let trimmed = line.trim();
                    if (resultArray === undefined) {
                        const startMatched = trimmed.match(rgxResultStart);
                        if (startMatched) {
                            resultArray = trimmed.substr(startMatched[0].length);
                        } else {
                            const primitiveMatched = trimmed.match(_rgxParse.rgxPrimitive);
                            if (primitiveMatched) {
                                jvmVar.value = primitiveMatched[1];
                                jvmVar.type = JvmVarType.char;
                                return ListenerResponse.needMoreLines;
                            }
                        }
                    }
                    else {
                        resultArray += trimmed;
                    }
                    if (resultArray !== undefined) {
                        const endPos = resultArray.lastIndexOf("]");
                        if (endPos > 0) {
                            resultArray = resultArray.substr(0, endPos);
                            jvmVar.value = resultArray.split(",").map(code => String.fromCharCode(+code)).join('');
                            jvmVar.type = JvmVarType.string;
                            resultArray = undefined;
                            return ListenerResponse.needMoreLines;
                        }
                    }
                }
                return this.waitPromptForShortCommand(line);
            }
            return ListenerResponse.stop;
        });
        return retValue;
    }

    private getFrame(frameId: number) {
        const mainThreads = this.mainThreads();
        if (mainThreads) {
            for (const thread of mainThreads) {
                const foundFrame = thread.stack.find((frame) => frame.frameId === frameId);
                if (foundFrame) {
                    return foundFrame;
                }
            }
        }
        return undefined;
    }

    /**
     * Call this while Paused only
     * @param line 
     */
    private waitPromptForShortCommand(line: string | undefined) {
        if (line === undefined) {
            return ListenerResponse.stop;
        }
        // try to match thread prompt
        if (this.testIfThreadPrompt(line.trim()) !== JvmPrompt.promptIsNotAPrompt) {
            return ListenerResponse.stop;
        }
        return ListenerResponse.needMoreLines;
    }

    private async setFrame(frameId: number) {
        if (this._lastFrameId === frameId) {
            return true;
        }
        const stackFrame = this.getFrame(frameId);
        if (stackFrame) {
            if (this._lastFrameId) {
                const prevFrame = stackFrame.thread.stack.find((frame) => frame.frameId === this._lastFrameId);
                if (prevFrame) {
                    let cmd = `up ${stackFrame.level - prevFrame.level}`;
                    if (prevFrame.level > stackFrame.level) {
                        cmd = `down ${prevFrame.level - stackFrame.level}`;
                    } 
                    this._logFn(LogType.debug, () => `POSTING ${cmd}`);
                    const posted = this.isDataCommandAllowed() && await this._queue.postCommand(cmd, (command, line) => {
                            this._logFn(LogType.debug, () => `${command}: ${String(line).trimRight()}`);
                            return this.waitPromptForShortCommand(line);
                            });
                    if (!posted) {
                        return false;
                    }
                    this._lastFrameId = frameId;
                }
            }
            if (this._lastFrameId !== frameId) {
                const posted = await this.setThread(stackFrame.thread.id);
                if (!posted) {
                    return false;
                }
                if (stackFrame.level > 1) {
                    let cmd = `up ${stackFrame.level - 1}`;
                    this._logFn(LogType.debug, () => `POSTING ${cmd}`);
                    const posted = this.isDataCommandAllowed() && await this._queue.postCommand(cmd, (command, line) => {
                            this._logFn(LogType.debug, () => `${command}: ${String(line).trimRight()}`);
                            return this.waitPromptForShortCommand(line);
                          });
                    if (!posted) {
                        return false;
                    }
                }
                this._lastFrameId = frameId;
            }
        }
        return this._lastFrameId === frameId;
    }
    
    private async sendAllBreakPoints() {
        for (const [bpKey, bp] of this._breakpoints) {
            if (!bp.sent) {
                bp.sent = await this.postBreakPointCmd(SetBreakCommand, bp.className, bp.place);
            }
        }
        return true;
    }

    private buildBpKey(className: string, place: string | number) {
        if (typeof place === "number") {
            return `${className}:${place}`;
        } else if (typeof place === "string") {
            return `${className}.${place}`;
        }
        return "";
    }
    
    /**
     * post command to setup breakpoint
     * @param className 
     * @param place 
     */
    private async postBreakPointCmd(isSetCommand: boolean, className: string, place: string | number) {
        if (!this._attached) {
            return false;
        }
        const bpKey = this.buildBpKey(className, place);
        if (!bpKey) {
            return false;
        }
        let command = 'clear ';
        if (isSetCommand) {
            command = 'stop ';
            if (typeof place === "number") {
                command += 'at ';
            } else if (typeof place === "string") {
                command += 'in ';
            }
        }
        command += bpKey;

        this._logFn(LogType.debug, () => `POSTING ${command}`);
        // differnet ways - if paused or not
        if (this.isPaused()) {
            return this._queue.postCommand(command, (cmd, line) => {
                this._logFn(LogType.debug, () => `${command}: ${String(line).trimRight()}`);
                if (line) {
                    const matchedEvent = line.match(_rgxBreakPoint.rgxSet);
                    if (matchedEvent) {
                        const bp = this._breakpoints.get(bpKey);
                        if (bp) {
                            bp.verified = true;
                            this.sendEvent(JvmRuntimeEvents.breakpointValidated, bp.breakId, true);
                        }
                    }
                }
                return this.waitPromptForShortCommand(line);
            }, LockQueueAction.normal);
        } else {
            return this._queue.postCommand(command, undefined);
        }
    }
    
	private sendEvent(event: string, ... args: any[]) {
		setImmediate(_ => {
			this.emit(event, ...args);
		});
	}
}