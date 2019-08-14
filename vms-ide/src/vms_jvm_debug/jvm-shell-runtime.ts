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
    command: string,
    state: ParserState,
    isLocals?: boolean,
    fullVarName?: string,
    parentId?: number,
    timeOut?: number,
    tmpVar?: IJvmVariable,
    currentScope?: IJvmVariable,
    innerVar?: IJvmVariable,
    stringFullName?: string,
    stringValue?: string,
    quotas?: number
};

enum ParserRequest {
    nextLine,
    fetchAllAndRetryToParse,
}

enum ParserState {
    normal,
    stopped,
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

export interface IJvmVariable {
    varId: number;
    name: string;
    value?: string;
    parentId?: number;
    vars?: IJvmVariable[];
};

export function isJvmVarNeedReference(jvmVar: IJvmVariable): boolean {
    let need = jvmVar.vars !== undefined && jvmVar.vars.length > 0;
    if (!need && jvmVar.value) {
        need = jvmVar.value.startsWith('instance of ');
    }
    return need;
}

const rgxIsJvmArray = /instance of (\S+?)\[(\d+)\]/;
export function getJvmVarArraySize(jvmVar: IJvmVariable): number {
    if (jvmVar.value) {
        const matched =  jvmVar.value.match(rgxIsJvmArray);
        if (matched) {
            return +matched[2];
        }
    }
    return -1;
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
}

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
            if (this._requestRun === 0 && this.isPaused()) {
                if (!this._threadMap) {
                    this._logFn(LogType.debug, () => `populating threads on demand`);
                    if (!(await this.populateThreadsInfo())) {
                        this.cmdLock.release();
                        this._logFn(LogType.debug, () => `CMD released "${command}"`);
                        return undefined;
                    }
                }
                this.cmdLock.release();
                this._logFn(LogType.debug, () => `CMD released "${command}"`);
                return this.mainThreads();
            }
            this.cmdLock.release();
            this._logFn(LogType.debug, () => `CMD released "${command}"`);
        }
		return undefined;
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
        const command = 'requestVariable';
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        if (acquired) {
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            if (this._requestRun === 0) {
                let fullName = this.getVarFullName(jvmVar.name, jvmVar.parentId);
                const arraySize = getJvmVarArraySize(jvmVar);
                if (arraySize < 0) {
                    return this.getVariableValue(jvmVar, fullName).
                        then((isOk) => {
                            this.cmdLock.release();
                            this._logFn(LogType.debug, () => `CMD released "${command}"`);
                            return isOk;
                        });
                } else {
                    start = start || 0;
                    count = count || arraySize - start;
                    const last = Math.min(start + count, arraySize - 1);
                    for (let i = start; i <= last; ++i) {
                        let innerVar: IJvmVariable = {
                            name: `[${i}]`,
                            value: "",
                            varId: this._vars.size + 1,
                            parentId: jvmVar.varId,
                        };
                        this._vars.set(innerVar.varId, innerVar);
                        jvmVar.vars = jvmVar.vars || [];
                        jvmVar.vars.push(innerVar);
                        if (!(await this.getVariableValue(innerVar, fullName + innerVar.name))) {
                            this.cmdLock.release();
                            this._logFn(LogType.debug, () => `CMD released "${command}"`);
                            return false;
                        }
                    }
                }
            }
            this.cmdLock.release();
            this._logFn(LogType.debug, () => `CMD released "${command}"`);
            return true;
        }
        return false;
    }

    /**
     * Request scopes
     * @param frameId 
     */
    public async requestScopes(frameId: number) {
        const command = 'requestScopes';
        this._logFn(LogType.debug, () => `CMD acquire "${command}"`);
        const acquired = await this.cmdLock.acquire(LockQueueAction.normal);
        if (acquired) {
            this._logFn(LogType.debug, () => `CMD locked "${command}"`);
            if (this._requestRun !== 0 ||  !this.isPaused()) {
                this.cmdLock.release();
                this._logFn(LogType.debug, () => `CMD released "${command}"`);
                return undefined;
            }
            if (await this.setFrame(frameId)) {
                const stackFrame = this.getFrame(frameId);
                if (stackFrame) {
                    if (stackFrame.scopes.length === 0) {
                        const parserData: IParserData = {
                            command: `locals`,
                            state: ParserState.normal,
                            isLocals: true,
                        };
                        if (this.isPaused() && (await this.dumpVariableValue(parserData)) && parserData.tmpVar && parserData.tmpVar.vars) {
                            stackFrame.scopes = parserData.tmpVar.vars.map(v => {
                                v.vars = v.vars || [];  // do not retrieve scope vars if they do not exist
                                return v;               // return from map
                            });
                        }
                    }
                    this.cmdLock.release();
                    this._logFn(LogType.debug, () => `CMD released "${command}"`);
                    return stackFrame.scopes;
                }
            }
            this.cmdLock.release();
            this._logFn(LogType.debug, () => `CMD released "${command}"`);
            return undefined;
        }
        return undefined;
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
        if (this._requestRun !== 0 || !this.isPaused()) {
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
            if (!isSent || this._requestRun !== 0  || !this.isPaused()) {
                return false;
            }
            if (this._threadMap) {
                const mainGroup = this._threadMap.get("main");
                if (mainGroup) {
                    let frameId = 0;
                    for(const threadInfo of mainGroup) {
                        if (this._requestRun !== 0  || !this.isPaused()) {
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
        if (this.isPaused()) {
            if (threadID && this._lastThreadId !== threadID) {
                if (!(await this.setThread(threadID))) {
                    return false;
                }
            }
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

    private async doCommandAndFetchResultUntilTimeOut(cmd: string, timeout: number) {
        const buffer: string[] = [];
        if (this._requestRun !== 0 || !this.isPaused()) {
            return buffer;
        }
        let timer: NodeJS.Timer | undefined;
        const dropCommand = new DropCommand();
        this._logFn(LogType.debug, () => `POSTING ${cmd}`);
        await this._queue.postCommand(cmd, (command, line) => {
            this._logFn(LogType.debug, () => `${command}: ${line?line.trimRight():""}`);
            if (cmd === command) {
                if (line === undefined) {
                    return ListenerResponse.stop;
                }
                buffer.push(line);
                if (timer) {
                    clearTimeout(timer);
                }
                timer = setTimeout(() => {
                    this._logFn(LogType.debug, () => `TIMEOUT ${cmd}`);
                    dropCommand.doDropCommand();
                }, timeout);
                return ListenerResponse.needMoreLines;
            }
            return ListenerResponse.stop;
        }, LockQueueAction.normal, dropCommand);
        return buffer;
    }

    private getVarFullName(name: string, parentId: number | undefined) {
        let fullName = name;
        while(parentId) {
            const parent = this._vars.get(parentId);
            parentId = undefined;
            if (parent) {
                fullName = parent.name + (fullName.startsWith("[") ? "" : ".") + fullName;
                parentId = parent.parentId;
            }
        }
        return fullName;
    }

    private parseLine(line: string, data: IParserData) {
        if (data.tmpVar === undefined) {
            data.tmpVar = {
                name: data.fullVarName || "",
                varId: 0,
                parentId: data.parentId,
            }
        }
        if (data.state === ParserState.stringEncountered) {
            if (data.stringFullName !== undefined) {
                // first call after fetching
                if (data.stringValue) {
                    // count quotas in original string + add two more (at the begin and at the end)
                    data.quotas = (data.stringValue.split("\"").length - 1) + 2;
                    // store value 
                    if (data.innerVar) {
                        data.innerVar.value = data.stringValue;
                    } else {
                        data.tmpVar.value = data.stringValue;
                    }
                    data.stringValue = undefined;
                }
                data.stringFullName = undefined;
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
            return ParserRequest.nextLine;
        }
        if (data.state === ParserState.normal) {
            if (data.isLocals) {
                const scopeMatch = line.match(_rgxParse.rgxScope);
                if (scopeMatch) {
                    data.currentScope = {
                        name: scopeMatch[1],
                        varId: this._vars.size + 1
                    };
                    this._vars.set(data.currentScope.varId, data.currentScope);
                    data.tmpVar.vars = data.tmpVar.vars || [];
                    data.tmpVar.vars.push(data.currentScope);
                    return ParserRequest.nextLine;
                }
            } else {
                const varObjStartMatch = line.match(_rgxParse.rgxVariableObjectStart);
                if (varObjStartMatch) {
                    data.currentScope = data.tmpVar;
                    return ParserRequest.nextLine;
                } else {
                    const varObjEndMatch = line.match(_rgxParse.rgxVariableObjectEnd);
                    if (varObjEndMatch) {
                        data.currentScope = undefined;
                        return ParserRequest.nextLine;
                    }
                }
            }
            const varStringMatch = line.match(_rgxParse.rgxVariableString);
            if (varStringMatch) {
                if (data.fullVarName && varStringMatch[1] === data.fullVarName) {
                    data.stringFullName = data.fullVarName;
                } else {
                    let innerVar: IJvmVariable | undefined = {
                        name: varStringMatch[1],
                        varId: this._vars.size + 1,
                        parentId: data.parentId,
                    }
                    const dotPos = innerVar.name.lastIndexOf(".");
                    if (dotPos > 0) {
                        innerVar.name = innerVar.name.substr(dotPos + 1);
                    }
                    if (data.currentScope) {
                        this._vars.set(innerVar.varId, innerVar);
                        data.currentScope.vars = data.currentScope.vars || [];
                        data.currentScope.vars.push(innerVar);
                    }
                    data.innerVar = innerVar;
                    data.stringFullName = this.getVarFullName(innerVar.name, innerVar.parentId);
                }
                data.state = ParserState.stringEncountered;
                data.stringValue = undefined;
                return ParserRequest.fetchAllAndRetryToParse;
            } else {
                const varMatch = line.match(_rgxParse.rgxVariable);
                if (varMatch) {
                    if (data.fullVarName && varMatch[1] === data.fullVarName) {
                        data.tmpVar.value = varMatch[2];
                        data.state = ParserState.stopped;
                    } else {
                        let innerVar: IJvmVariable | undefined = {
                            name: varMatch[1],
                            value: varMatch[2],
                            varId: this._vars.size + 1,
                            parentId: data.parentId,
                        }
                        const dotPos = innerVar.name.lastIndexOf(".");
                        if (dotPos > 0) {
                            innerVar.name = innerVar.name.substr(dotPos + 1);
                        }
                        if (data.currentScope) {
                            this._vars.set(innerVar.varId, innerVar);
                            data.currentScope.vars = data.currentScope.vars || [];
                            data.currentScope.vars.push(innerVar);
                        }
                    }
                }
            }
        }
        return ParserRequest.nextLine;
    }

    private async dumpVariableValue(data: IParserData) {
        if (this._requestRun !== 0 || !this.isPaused()) {
            return false;
        }
        const buffer: string[] = [];
        let timer: NodeJS.Timer | undefined;
        const dropCommand = new DropCommand();
        this._logFn(LogType.debug, () => `POSTING ${data.command}`);
        let parserLastRequest = ParserRequest.nextLine;
        await this._queue.postCommand(data.command, (command, line) => {
            this._logFn(LogType.debug, () => `${command}: ${line?line.trimRight():""}`);
            if (data.command === command) {
                if (line === undefined) {
                    return ListenerResponse.stop;
                }
                if (parserLastRequest === ParserRequest.fetchAllAndRetryToParse) {
                    buffer.push(line);
                    if (timer) {
                        clearTimeout(timer);
                    }
                    timer = setTimeout(() => {
                        this._logFn(LogType.debug, () => `TIMEOUT ${data.command}`);
                        dropCommand.doDropCommand();
                    }, data.timeOut || this.waitFetch);
                } else {
                    parserLastRequest = this.parseLine(line, data);
                    if (parserLastRequest === ParserRequest.nextLine) {
                        // test if prompt only for normal parsing state
                        if (this.testIfThreadPrompt(line.trim()) > JvmPrompt.promptIsNotAPrompt) {
                            return ListenerResponse.stop;
                        }
                    } else if (parserLastRequest === ParserRequest.fetchAllAndRetryToParse) {
                        // pass this line again
                        buffer.push(line);
                    }
                }
                return ListenerResponse.needMoreLines;
            }
            return ListenerResponse.stop;
        }, LockQueueAction.normal, dropCommand);

        for (let i = 0; this.isPaused() && i < buffer.length; ++i) {
            if (data.state === ParserState.stringEncountered) {
                if (data.stringValue === undefined && data.stringFullName !== undefined) {
                    if (this._requestRun !== 0 || !this.isPaused()) {
                        this._logFn(LogType.debug, () => `ABORTED ${data.command}`);
                        return false;
                    }
                    data.stringValue = await this.dumpStringValue(data.stringFullName);
                }
            }
            if (this.parseLine(buffer[i], data) === ParserRequest.fetchAllAndRetryToParse) {
                // parser expects current line again
                --i;
            }
        }
        this._logFn(LogType.debug, () => `COMPLETED ${data.command}`);
        return true;
    }

    private async getVariableValue(jvmVar: IJvmVariable, jvmVarFullName: string) {

        if (this._requestRun !== 0 || !this.isPaused()) {
            return false;
        }

        const parserData: IParserData = {
            command: `dump ${jvmVarFullName}`,
            state: ParserState.normal,
            fullVarName: jvmVarFullName,
            parentId: jvmVar.varId,
        };

        if ((await this.dumpVariableValue(parserData)) && parserData.tmpVar) {
            if (parserData.tmpVar.vars) {
                jvmVar.vars = parserData.tmpVar.vars;
            } else {
                jvmVar.value = parserData.tmpVar.value;
            }
            return true;
        }
        return false;
    }

    private fillStringValueFromBuffer(varFullName: string,buffer: string[]) {
        const rgxValueStart = new RegExp(`^\\s*${RgxStrFromStr(varFullName)}\\s*=\\s*\"`);
        for (let i = 0; i < buffer.length - 1; ++i) {
            const matched = buffer[i].match(rgxValueStart);
            if (matched) {
                let retString = buffer[i].substring(matched[0].length);     //all chars, without first quota
                for (++i; i < buffer.length - 1; ++i) {
                    retString += buffer[i];                                 //all chars
                }
                // drop all after last quota
                const lastQuota = retString.lastIndexOf("\"");
                if (lastQuota > 0) {
                    retString = retString.substring(0, lastQuota);          // last quota is dropped too
                }
                return retString;
            }
        }
        return undefined;
    }

    /**
     * Construct value from given buffer or retrieve this buffer via 'dump'
     * @param varFullName variable full name
     * @param buffer given buffer
     * @returns string value or undefined
     */
    private async dumpStringValue(varFullName: string) {
        if (this._requestRun !== 0 || !this.isPaused()) {
            return undefined;
        }
        const evalCmd = `java.util.Arrays.toString(${varFullName}.getBytes())`;
        const command = `eval ${evalCmd}`;
        const rgxResultStart = new RegExp(`^\\s*${RgxStrFromStr(evalCmd)}\\s*=\\s*\"\\[`);
        let   resultArray: string | undefined;
        let   resultString: string | undefined;
        await this._queue.postCommand(command, (cmd, line) => {
            this._logFn(LogType.debug, () => `${cmd}: ${line?line.trimRight():""}`);
            if (cmd === command) {
                if (line === undefined) {
                    return ListenerResponse.stop;
                }
                let trimmed = line.trim();
                if (resultArray === undefined) {
                    const startMatched = trimmed.match(rgxResultStart);
                    if (startMatched) {
                        resultArray = trimmed.substr(startMatched[0].length);
                    }
                }
                else {
                    resultArray += trimmed;
                }
                if (resultArray !== undefined) {
                    const endPos = resultArray.lastIndexOf("]");
                    if (endPos > 0) {
                        resultArray = resultArray.substr(0, endPos);
                        resultString = resultArray.split(",").map(code => String.fromCharCode(+code)).join('');
                        resultArray = undefined;
                        return ListenerResponse.needMoreLines;
                    }
                }
                return this.waitPromptForShortCommand(line);
            }
            return ListenerResponse.stop;
        });
        return resultString;
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
                    if (!this.isPaused() || 
                        !(await this._queue.postCommand(cmd, (command, line) => {
                            this._logFn(LogType.debug, () => `${command}: ${String(line).trimRight()}`);
                            return this.waitPromptForShortCommand(line);
                            })
                         )
                        ) {
                        return false;
                    }
                    this._lastFrameId = frameId;
                }
            }
            if (this._lastFrameId !== frameId) {
                if (!this.isPaused() || !(await this.setThread(stackFrame.thread.id))) {
                    return false;
                }
                if (stackFrame.level > 1) {
                    let cmd = `up ${stackFrame.level - 1}`;
                    this._logFn(LogType.debug, () => `POSTING ${cmd}`);
                    if (!this.isPaused() || 
                        !(await this._queue.postCommand(cmd, (command, line) => {
                            this._logFn(LogType.debug, () => `${command}: ${String(line).trimRight()}`);
                            return this.waitPromptForShortCommand(line);
                          })
                         )
                        ) {
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