import * as nls from "vscode-nls";
import { EventEmitter } from "events";
import { LogFunction, LogType, Subscribe, Lock} from "../common/main";
import { ICmdQueue, ListenerResponse } from "./communication";
import { RgxFromStr, RgxStrFromStr } from "../common/rgx-from-str";
import { DropCommand } from "./drop";
import { setTimeout } from "timers";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

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
const _rgxSendBp = { 
    rgxFail: /Unable to set breakpoint/,
    rgxDefer: /It will be set after the class is loaded/,
    rgxSet: /Set breakpoint/,
};

const _rgxSetBreakPointEvent: RegExp[] = [ 
    /Set deferred breakpoint (\S+)/,
    /Set breakpoint (\S+)/,
];

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

	// since we want to send breakpoint events, we will assign an id to every event
	// so that the frontend can match events with breakpoints.
	private _breakpointId = 0;
	private _breakpoints: Map<string, JvmBreakpoint> = new Map<string, JvmBreakpoint>();

	private _logFn: LogFunction;

	private _args: IJvmLaunch | undefined;

	private _threadMap: Map<string, IJvmThread[]> | undefined;
	
	private _attached = false;
    private _running = false;
    
    private _stoppedThreads: JvmStoppedThread[] = [];
    private _stoppedThreadId?: number;

    private _lastThreadId = 0;
    private _lastFrameId = 0;
    private _isPausePressed = false;
    private _vars = new Map<number, IJvmVariable>();

    private readonly waitFetch = 500;

	constructor(private _queue: ICmdQueue, logFn?: LogFunction) {
		super();
        // tslint:disable-next-line:no-empty
        this._logFn = logFn || (() => {});
        
        this._queue.onUnexpectedLine((line) => {
            this.onUnexpectedLine(line);
        });
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

    public isRunning() {
        return this._attached && this._running;
    }
    
    public isPaused() {
        return this._attached && !this._running;
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

            for (const setBreakPointEvent of _rgxSetBreakPointEvent) {
                const matchedEvent = line.match(setBreakPointEvent);
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
            }

            const promptId = this.testIfThreadPrompt(line);
            // if ( promptId === JvmPrompt.promptIsUnknownThread) {
            //     this.setRunning(false);
            //     this.populateThreadsInfo().
            //         then(() => {
            //             if (this._threadInPrompt) {
            //                 const id = this.findThreadId(this._threadInPrompt);
            //                 if (id) {
            //                     // send message for each stopped thread
            //                     this.setThread(id).then(() => {
            //                         this.sendEvent(JvmRuntimeEvents.stopOnPause, id);
            //                     });
            //                 }
            //             }
            //             this._stoppedThreads = [];  // info is sent, clear this
            //         });
            // } else 
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
    public findThreadId(threadName: string, threadMap?: Map<string, IJvmThread[]>) {
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
        if (!this.isPaused()) {
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
            if (!isSent || !this.isPaused()) {
                return false;
            }
            if (this._threadMap) {
                const mainGroup = this._threadMap.get("main");
                if (mainGroup) {
                    let frameId = 0;
                    for(const threadInfo of mainGroup) {
                        const command = `where ${threadInfo.id}`;
                        this._logFn(LogType.debug, () => `POSTING ${command}`);
                        return await this._queue.postCommand(command, (cmd, line) => {
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
                    }                   
                }
            }
            return true;
        });
    }
    
    public async setThread(id: number) {
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


	public async command(command: string) {
        this._logFn(LogType.debug, () => `POSTING ${command}`);
		this._queue.postCommand(command, undefined);
	}


	private clearSession() {
        this._attached = false;
        this._running = false;
		this.sendEvent(JvmRuntimeEvents.end);
	}

	/**
	 * Start executing the given program.
	 */
	public async start(args: IJvmLaunch) {
		this._args = args;
        return this.attachJDB().
            then(() => {
                if (this.isPaused()) {
                    return this.sendAllBreakPoints();
                }
                return false;
            }).
            then(() => {
                return this.cont();
            });
    }
    
	/**
	 * Pause execution
	 */
	public async pause() {
        if (this.isRunning()) {
            const command = 'suspend';
            this._logFn(LogType.debug, () => `POSTING ${command}`);
            return await this._queue.postCommand(command, undefined);
        }
        return false;
	}

    protected async runByCommand(command: string, threadID?: number) {
        if (this.isPaused()) {
            if (threadID && this._lastThreadId !== threadID) {
                if (!(await this.setThread(threadID))) {
                    return false;
                }
            }
            this._logFn(LogType.debug, () => `POSTING ${command}`);
            this.setRunning(true);
            if (await this._queue.postCommand(command, undefined, true)) {
                return true;
            } else {
                this.setRunning(false);
            }
        }
        return false;
    }
    /**
	 * Continue execution
	 */
	public async cont(threadID?: number) {
        return this.runByCommand('cont', threadID);
	}

	/**
	 * Step into
	 */
	public async step(threadID?: number) {
        return this.runByCommand('step', threadID);
	}

	/**
	 * Step over
	 */
	public async next(threadID?: number) {
        let command = 'next';
        if (threadID && this._stoppedThreadId !== threadID) {
            command = 'step';   //if thread changes we cannot post 'next' because it runs whole program
        }
        return this.runByCommand(command, threadID);
	}
    
	/**
	 * Step out
	 */
	public async stepOut(threadID?: number) {
        return this.runByCommand('step up', threadID);
    }
    
	public async threads() {
		if (this.isPaused()) {
			if (!this._threadMap) {
                this._logFn(LogType.debug, () => `populating threads on demand`);
				if (!(await this.populateThreadsInfo())) {
                    return undefined;
                }
			}
			return this.mainThreads();
		}
		return undefined;
	}

	private mainThreads() {
		if (this._threadMap) {
			return this._threadMap.get("main");
		}
		return undefined;
	}

	/**
	 * 
	 */
	public stack(threadId: number, startFrame: number, endFrame: number) {
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

    protected async doCommandAndFetchResultUntilTimeOut(cmd: string, timeout: number) {
        const buffer: string[] = [];
        if (!this.isPaused()) {
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
                    this._logFn(LogType.debug, () => `DROPPED ${cmd}`);
                    dropCommand.doDropCommand();
                }, timeout);
                return ListenerResponse.needMoreLines;
            }
            return ListenerResponse.stop;
        }, false, dropCommand);
        return buffer;
    }

    protected getVarFullName(name: string, parentId: number | undefined) {
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

    public async dumpVariable(jvmVar: IJvmVariable, start?: number, count?: number) {

        let fullName = this.getVarFullName(jvmVar.name, jvmVar.parentId);

        const arraySize = getJvmVarArraySize(jvmVar);

        if (arraySize < 0) {
            return await this.getVariableValue(jvmVar, fullName);
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
                    return false;
                }
            }
        }

        return true;
    }

    protected async getVariableValue(jvmVar: IJvmVariable, jvmVarFullName: string) {

        if (!this.isPaused()) {
            return false;
        }

        let varName = jvmVarFullName;
        const cmd = `dump ${varName}`;
        const buffer = await this.doCommandAndFetchResultUntilTimeOut(cmd, this.waitFetch);
        const retVar = await this.parseDumpBuffer(buffer, jvmVar.varId);
        if (retVar) {
            if (retVar.vars) {
                jvmVar.vars = retVar.vars;
            } else {
                jvmVar.value = retVar.value;
            }
            return true;
        }
        return false;
    }

    /**
     * Parse buffer
     * @param buffer 
     * @param parentId 
     * @returns parsed variable
     */
    protected async parseDumpBuffer(buffer: string[], parentId?: number) {

        const retVar: IJvmVariable = {
            name: "",
            varId: 0,
            parentId: parentId,
        };

        const rgxScope = /^(.+?):\s*$/;
        const rgxVariable = /^\s*(\S+?)\s*[:=]\s*(.*?)\s*$/;
        const rgxVariableString = /^\s*(\S+?)\s*[:=]\s*\"/;
        const rgxVariableObjectStart = /^\s*(\S+?)\s*[:=]\s*\{\s*$/;
        const rgxVariableObjectEnd = /^\s*\}\s*$/;

        const rgxLocals = /^\s*locals\s*$/;
        const rgxDump = /^\s*dump (.*)\s*$/;

        if (buffer.length) {
            const firstLine = buffer[0];
            const localsMatch = firstLine.match(rgxLocals);
            const dumpMatch = firstLine.match(rgxDump);
            let currentScope: IJvmVariable | undefined;

            for (let i = 1; i < buffer.length - 1; ++i) {
                const line = buffer[i];
                if (localsMatch) {
                    const scopeMatch = line.match(rgxScope);
                    if (scopeMatch) {
                        currentScope = {
                            name: scopeMatch[1],
                            varId: this._vars.size + 1
                        };
                        this._vars.set(currentScope.varId, currentScope);
                        retVar.vars = retVar.vars || [];
                        retVar.vars.push(currentScope);
                        continue;
                    }
                } else if (dumpMatch) {
                    const varObjStartMatch = line.match(rgxVariableObjectStart);
                    if (varObjStartMatch) {
                        currentScope = retVar;
                        continue;
                    } else {
                        const varObjEndMatch = line.match(rgxVariableObjectEnd);
                        if (varObjEndMatch) {
                            currentScope = undefined;
                            continue;
                        }
                    }
                }
                let innerVar: IJvmVariable | undefined;
                const varStringMatch = line.match(rgxVariableString);
                if (varStringMatch) {
                    if (dumpMatch && varStringMatch[1] === dumpMatch[1]) {
                        // put all lines to value (without retrieving)
                        retVar.value = await this.getStringValue(dumpMatch[1], buffer);
                        return retVar;
                    } else {
                        innerVar = {
                            name: varStringMatch[1],
                            varId: this._vars.size + 1
                        }
                        const dotPos = innerVar.name.lastIndexOf(".");
                        if (dotPos > 0) {
                            innerVar.name = innerVar.name.substr(dotPos + 1);
                        }
                        // retrieve obly this value via 'dump'
                        innerVar.value = await this.getStringValue(this.getVarFullName(innerVar.name, parentId));
                        if (innerVar.value !== undefined) {
                            let testString = buffer[i].substr(varStringMatch[0].length);
                            let testPos = 0;
                            let varPos = 0;
                            let resultStr = "";
                            while (varPos < innerVar.value.length) {
                                if (testPos >= testString.length) {
                                    ++i;
                                    testString += buffer[i];
                                }
                                if (testString[testPos] === innerVar.value[varPos]) {
                                    resultStr += testString[testPos];
                                    ++testPos;
                                    ++varPos;
                                } else if (testString[testPos] == "\r" || testString[testPos] == "\n" ) {
                                    ++testPos;
                                } else if (innerVar.value[varPos] == "\r" || innerVar.value[varPos] == "\n" ) {
                                    ++varPos;
                                } else {
                                    resultStr += innerVar.value[varPos];    // it is error probably
                                    ++varPos;
                                }
                            }
                            innerVar.value = resultStr;
                        } else {
                            return undefined;  // panic escape
                        }
                    }
                } else {
                    const varMatch = line.match(rgxVariable);
                    if (varMatch) {
                        if (dumpMatch && varMatch[1] === dumpMatch[1]) {
                            retVar.value = varMatch[2];
                            return retVar;
                        }
                        innerVar = {
                            name: varMatch[1],
                            value: varMatch[2],
                            varId: this._vars.size + 1
                        }
                        const dotPos = innerVar.name.lastIndexOf(".");
                        if (dotPos > 0) {
                            innerVar.name = innerVar.name.substr(dotPos + 1);
                        }
                    }
                }
                if (innerVar && currentScope) {
                    innerVar.parentId = parentId;
                    this._vars.set(innerVar.varId, innerVar);
                    currentScope.vars = currentScope.vars || [];
                    currentScope.vars.push(innerVar);
                }
            }
        }

        return retVar;
    }

    protected fillStringValueFromBuffer(varFullName: string,buffer: string[]) {
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
    protected async getStringValue(varFullName: string, buffer?: string[]) {
        buffer = buffer || await this.doCommandAndFetchResultUntilTimeOut(`dump ${varFullName}`, this.waitFetch);
        return this.fillStringValueFromBuffer(varFullName, buffer);
    }

    public async getScopes(frameId: number) {
        if (!this.isPaused()) {
            return undefined;
        }
        if (await this.setFrame(frameId)) {
            const stackFrame = this.getFrame(frameId);
            if (stackFrame) {
                if (stackFrame.scopes.length === 0) {
                    const buffer = await this.doCommandAndFetchResultUntilTimeOut(`locals`, this.waitFetch);
                    const retVar = await this.parseDumpBuffer(buffer);
                    if (retVar && retVar.vars) {
                        stackFrame.scopes = retVar.vars;
                    }
                }
                return stackFrame.scopes;
            }
        }
        return undefined;
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

    private waitPromptForShortCommand(command: string, line: string | undefined) {
        // this._logFn(LogType.debug, () => `${command}: ${String(line).trimRight()}`);
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
        if (!(await this.threads())) {
            return false;
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
                    if (!this.isPaused() || !(await this._queue.postCommand(cmd, (command, line) => {
                        this._logFn(LogType.debug, () => `${command}: ${String(line).trimRight()}`);
                        return this.waitPromptForShortCommand(command, line);
                        }))) {
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
                    if (!this.isPaused() || !(await this._queue.postCommand(cmd, (command, line) => {
                        this._logFn(LogType.debug, () => `${command}: ${String(line).trimRight()}`);
                        return this.waitPromptForShortCommand(command, line);
                        }))) {
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
                bp.sent = await this.postSetBreakPoint(bp.className, bp.place);
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

	/*
	 * Set breakpoint in file with given line.
	 */
	public async setBreakPoint(className: string, place: string | number) {
        let bpKey = this.buildBpKey(className, place);
        let bp = this._breakpoints.get(bpKey);
        if (!bp) {
            bp = {
                className,
                place,
                breakId: ++this._breakpointId,
            };
            this._breakpoints.set(bpKey, bp);
        }
        if (!bp.sent) {
            bp.sent = await this.postSetBreakPoint(bp.className, bp.place);
        }
        return bp;
	}

	/*
	 * Clear breakpoint for class and place.
	 */
	public async clearBreakPoint(className: string, place: string | number) {
        let bpKey = this.buildBpKey(className, place);
        this._breakpoints.delete(bpKey);
        this.postClearBreakPoint(className, place);
	}

	public async clearBreakPointByID(id: number) {
        for (const [bpKey, bp] of this._breakpoints) {
            if (bp.breakId === id) {
                this._breakpoints.delete(bpKey);
                this.postClearBreakPoint(bp.className, bp.place);
                break;
            }
        }
	}

	/*
	 * Clear all breakpoints for class.
	 */
	public async clearBreakpointsForClass(className: string) {
        const cleared: string[] = [];
        for (const [bpKey, bp] of this._breakpoints) {
            if (bp.className === className) {
                await this.postClearBreakPoint(className, bp.place);
                cleared.push(bpKey);
            }
        }
        for (const bpKey of cleared) {
            this._breakpoints.delete(bpKey);
        }
    }
    
    /**
     * post command to setup breakpoint
     * @param className 
     * @param place 
     */
    private async postSetBreakPoint(className: string, place: string | number) {
        if (!this._attached) {
            return false;
        }
        let command = 'stop';
        if (typeof place === "number") {
            command += ` at ${className}:${place}`;
        } else if (typeof place === "string") {
            command += ` in ${className}.${place}`;
        } else {
            return false;
        }
        this._logFn(LogType.debug, () => `POSTING ${command}`);
        return this._queue.postCommand(command, undefined);
    }
    
    /**
     * post command to clear breakpoint
     * @param className 
     * @param place 
     */
    private async postClearBreakPoint(className: string, place: string | number) {
        if (!this._attached) {
            return false;
        }
        let command = 'clear';
        if (typeof place === "number") {
            command += ` ${className}:${place}`;
        } else if (typeof place === "string") {
            command += ` ${className}.${place}`;
        } else {
            return false;
        }
        this._logFn(LogType.debug, () => `POSTING ${command}`);
        return this._queue.postCommand(command, undefined);
    }

	// private methods

	private sendEvent(event: string, ... args: any[]) {
		setImmediate(_ => {
			this.emit(event, ...args);
		});
	}
}