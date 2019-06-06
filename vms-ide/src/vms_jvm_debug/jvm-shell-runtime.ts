import * as nls from "vscode-nls";
import { EventEmitter } from "events";
import { LogFunction, LogType, Subscribe, Lock} from "../common/main";
import { GetSshHelperType } from "../ext-api/ext-api";
import { ShellSplitter } from "./shell-splitter";
import { RgxFromStr } from "../common/rgx-from-str";
import { ICmdQueue } from "./communication";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

const jdb_Req_Resp = {
	"suspend": "All threads suspended.",
	"threads": "> ",
};

export enum JvmRuntimeEvents {
    stopOnEntry = 'stopOnEntry',
    stopOnStep = 'stopOnStep',
    stopOnBreakpoint = 'stopOnBreakpoint',
    stopOnException = 'stopOnException',
    breakpointValidated = 'breakpointValidated',
    output = 'output',
    end = 'end',
};

export interface JvmBreakpoint {
	/** unique id */
	id: number;
    className: string;
    place: string | number;
    verified?: boolean;
    sent?: boolean;
};

export interface IJvmStack {
	id: number;
	level: number;
	place: string;
	file: string;
	line: number;
};

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
    port?: number;
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
const _exitEvents: IStopLine[] = [
    {
        rgx: /The application exited/,
        reason: JvmRuntimeEvents.end
    },
    {
        rgx: /The application has been disconnected/,
        reason: JvmRuntimeEvents.end
    }
];

const _rgxStoppedThread = {
    rgx: /\"thread=(.*?)\"/,
    threadName: 1,
};
const _rgxDefPrompt = {
    rgx: /^> $/,
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
    rgx: /\[(\d+)\]\s+(\S+)\s+\((\S+?):(\d+)\)/,
    level: 1,
    place: 2,
    file: 3,
    line: 4,
};
const _rgxSendBp = { 
    rgxFail: /Unable to set breakpoint/,
    rgxDefer: /It will be set after the class is loaded/,
    rgxSet: /Set breakpoint/,
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
        }
    }

    public isRunning() {
        return this._attached && this._running;
    }
    
    public isPaused() {
        return this._attached && !this._running;
    }
    
    private onUnexpectedLine(line: string | undefined) {
        if (this.isRunning()) {
            if (line) {
                this._logFn(LogType.debug, () => `unexpected: ${line.trimRight()}`);

                for (const exitEvent of _exitEvents) {
                    const matchedEvent = line.match(exitEvent.rgx);
                    if (matchedEvent) {
                        this.sendEvent(exitEvent.reason);
                        return;
                    }
                }

                const waitThreadName = this._stoppedThreads.find(th => th.name === "");
                if (waitThreadName) {
                    const matchedStoppedThread = line.match(_rgxStoppedThread.rgx);
                    if (matchedStoppedThread) {
                        waitThreadName.name = matchedStoppedThread[_rgxStoppedThread.threadName];
                        return;
                    }
                }

                for (const stopEvent of _stopEvents) {
                    const matchedEvent = line.match(stopEvent.rgx);
                    if (matchedEvent) {
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
                        return;
                    }
                }

                const promptId = this.testIfThreadPrompt(line);
                if ( promptId === -2) {
                    this.setRunning(false);
                    this.populateThreadsInfo().
                        then(() => {
                            for(const stopped of this._stoppedThreads) {
                                const id = this.findThreadId(stopped.name);
                                if (id) {
                                    // send message for each stopped thread
                                    this.setThread(id).then(() => {
                                        this.sendEvent(stopped.reason, id);
                                    });
                                }
                            }
                            this._stoppedThreads = [];  // info is sent, clear this
                        });
                } else if (promptId === -1) {
                    // TODO: test if we post 'suspend' command
                }
            }
        } else {
            this._logFn(LogType.debug, () => `unexpected paused: ${line?line.trimRight():"{undefined}"}`);
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
					return false;
                }
                this._logFn(LogType.debug, () => `attaching: ${line.trimRight()}`);
                const matchedPrompt = line.match(_rgxThreadPrompt.rgx);
				if (matchedPrompt) {
                    this._attached = true;
                    this.setRunning(false); // stopped because 'suspend=y'
                    this._logFn(LogType.debug, () => `attaching: completed`);
					return false;
				} else if (line.match(_rgxAttachFailed.rgx)) {
                    this.clearSession();
                    this._logFn(LogType.debug, () => `attaching: failed`);
					return false;
				}
				return true;	// need more lines
            }
            this._logFn(LogType.debug, () => `attaching: not attaching?`);
			return false;
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
		return this._queue.postCommand(command, (cmd, line) => {
			if (cmd === command) {
				if (line === undefined) {
                    this._logFn(LogType.debug, () => `threads: aborted`);
					return false;
                } 
                this._logFn(LogType.debug, () => `${cmd}: ${line.trimRight()}`);
				const rgxGroup = _rgxGroup.rgx;
				const matchedGroup = rgxGroup.exec(line);
				if (matchedGroup) {
					threadGroupName = matchedGroup[_rgxGroup.groupName];
					return true;    // need more lines
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
					return true;    // need more lines
				}
				// try to match thread prompt
				if (this.testIfThreadPrompt(line, threadMap)) {
                    // request completed, no more lines required
                    this._threadMap = threadMap;
                    this._logFn(LogType.debug, () => `threads: completed`);
                    return false;   // command 'threads' completed
				}
				return true;	// need more lines
			}
			return false;
		}).then(async (isSent) => {
            if (!isSent) {
                return false;
            }
            if (this._threadMap) {
                const mainGroup = this._threadMap.get("main");
                if (mainGroup) {
                    let stackId = 0;
                    for(const threadInfo of mainGroup) {
                        const command = `where ${threadInfo.id}`;
                        await this._queue.postCommand(command, (cmd, line) => {
                            if (cmd === command) {
                                if (line === undefined) {
                                    this._logFn(LogType.debug, () => `where: aborted`);
                                    return false;
                                }
                                this._logFn(LogType.debug, () => `${cmd}: ${line.trimRight()}`);
                                const rgxStack = _rgxStack.rgx;
                                const matchedStack = rgxStack.exec(line);
                                if (matchedStack) {
                                    threadInfo.stack.push({
                                        id: ++stackId,
                                        level: +matchedStack[_rgxStack.level],
                                        place: matchedStack[_rgxStack.place],
                                        file: matchedStack[_rgxStack.file],
                                        line: +matchedStack[_rgxStack.line],
                                    });
                                    return true;    // need more lines
                                }
                                // try to match thread prompt
                                if (this.testIfThreadPrompt(line)) {
                                    // request completed, no more lines required
                                    this._logFn(LogType.debug, () => `where: completed`);
                                    return false;   // command 'where' completed
                                }
                                return true;	// need more lines
                            }
                            this._logFn(LogType.debug, () => `where: not a where command?`);
                            return false;
                        });
                    }                   
                }
            }
            return true;
        });
    }
    
    public async setThread(id: number) {
        if (this.isPaused()) {
            return this._queue.postCommand(`thread ${id}`, (cmd, line) => {
                this._logFn(LogType.debug, () => `set thread: ${line?line.trimRight():""}`);
                return false;
            });
        }
        return false;
    }

    /**
	 * Test if line is thread prompt or just default prompt
	 * @param line 
	 * @returns 0 if line isn't prompt, -1 if it is default prompt, -2 if it is stopped thread prompt, > 0 if it is thread prompt
	 */
	private testIfThreadPrompt(line: string, threadMap?: Map<string, IJvmThread[]>) {
		if (line.match(_rgxDefPrompt.rgx)) {
			return -1;
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
                    return -2;
                }
            }
        }
		return 0;
	}


	public async command(command: string) {
		this._queue.postCommand(command, (cmd, line) => {
            this._logFn(LogType.debug, () => `command: ${line?line.trimRight():""}`);
            return false;   // no lines expected
        });
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
                return this.continue();
            });
    }
    
	/**
	 * Continue execution
	 */
	public continue(): boolean {
        if (this.isPaused()) {
            this.setRunning(true);
            this._queue.postCommand('cont', (cnd, line) => {
                this._logFn(LogType.debug, () => `cont: ${line?line.trimRight():""}`);
                return false;
            });
            return true;
        }
        return false;
	}

	/**
	 * Step into
	 */
	public step(): boolean {
        if (this.isPaused()) {
            this.setRunning(true);
            this._queue.postCommand('step', (cnd, line) => {
                this._logFn(LogType.debug, () => `step: ${line?line.trimRight():""}`);
                return false;
            });
            return true;
        }
        return false;
	}

	/**
	 * Step over
	 */
	public next(): boolean {
        if (this.isPaused()) {
            this.setRunning(true);
            this._queue.postCommand('next', (cnd, line) => {
                this._logFn(LogType.debug, () => `next: ${line?line.trimRight():""}`);
                return false;
            });
            return true;
        }
        return false;
    }
    
	public async threads() {
		if (this.isPaused()) {
			if (!this._threadMap) {
                this._logFn(LogType.debug, () => `populating threads on demand`);
				await this.populateThreadsInfo();
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
                            id: 1,
                            file: "",
                            line: 1,
                            level: 1,
                            place: "",
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
    
    private async sendAllBreakPoints() {
        for (const [bpKey, bp] of this._breakpoints) {
            if (!bp.sent) {
                await this.postSetBreakPoint(bp.className, bp.place);
                bp.sent = true;
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
        let bps = this._breakpoints.get(bpKey);
        if (!bps) {
            bps = {
                className,
                place,
                id: ++this._breakpointId,
            };
            this._breakpoints.set(bpKey, bps);
        }
        if (!bps.sent) {
            return this.postSetBreakPoint(className, place);
        }
        return true;
	}

	/*
	 * Clear breakpoint for class and place.
	 */
	public async clearBreakPoint(className: string, place: string | number) {
        let bpKey = this.buildBpKey(className, place);
        this._breakpoints.delete(bpKey);
        return this.postClearBreakPoint(className, place);
	}

	/*
	 * Clear all breakpoints for class.
	 */
	public async clearBreakpoints(className: string) {
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
        return this._queue.postCommand(command, (cmd, line) => {
            if (cmd === command) {
                if (line === undefined) {
                    return false;
                }
                if (line.match(_rgxSendBp.rgxDefer)) {
                    // TODO: mark deferred
                    return false;
                } else if (line.match(_rgxSendBp.rgxSet)) {
                    // TODO: mark set
                    return false;
                } else if (line.match(_rgxSendBp.rgxFail)) {
                    // TODO: mark failed
                    return false;
                }
                return true;
            }
            return false;
        });
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
        return this._queue.postCommand(command, (cmd, line) => {
            if (cmd === command) {
                if (line === undefined) {
                    return false;
                }
                // TODO: parse answer
                return false;
            }
            return false;
        });
    }

	// private methods

	private sendEvent(event: string, ... args: any[]) {
		setImmediate(_ => {
			this.emit(event, ...args);
		});
	}
}