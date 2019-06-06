
import {
	Logger, logger,
	LoggingDebugSession,
	InitializedEvent, TerminatedEvent, StoppedEvent, BreakpointEvent, OutputEvent,
	Thread, StackFrame, Scope, Source, Handles, Breakpoint
} from 'vscode-debugadapter';

import { DebugProtocol } from 'vscode-debugprotocol';
import * as path from 'path';

import { Lock, Delay, LogFunction, LogType } from '../common/main';

import { JvmShellRuntime, JvmRuntimeEvents } from './jvm-shell-runtime';
import { IJvmLaunchRequestArguments } from './jvm-config';
import { SshShellServer } from './ssh-shell-server';
import { CmdQueue } from './cmd-queue';
import { ScopeHelpers } from './scope-helpers';
import { ICmdQueue } from './communication';

/**
 * Adapter between VS code and JVM runtime
 */
export class JvmDebugSession extends LoggingDebugSession {

	// a JVM runtime
	private _runtime: JvmShellRuntime;

	private _jdbShellServer: SshShellServer;

	private _jvmQueue: CmdQueue;
	private _jvmShellServer: SshShellServer;

	private _scopeHelpers: ScopeHelpers;

	private _variableHandles = new Handles<string>();

	private _configurationDone = new Lock(true, "configurationDone");

	private logFn: LogFunction;
	
	/**
	 * Creates a new debug adapter that is used for one debug session.
	 * We configure the default implementation of a debug adapter here.
	 */
	public constructor(logFn?: LogFunction) {
		super("vms-jvm-debugger.txt");

		this.logFn = logFn || (() => {});
		
		// this debugger uses zero-based lines and columns
		this.setDebuggerLinesStartAt1(true);
		this.setDebuggerColumnsStartAt1(true);

		this._jdbShellServer = new SshShellServer(this.logFn);
		this._jvmShellServer = new SshShellServer(this.logFn);
		this._jvmQueue = new CmdQueue(this._jvmShellServer);

		this._scopeHelpers = new ScopeHelpers(this.logFn);

		this._runtime = new JvmShellRuntime(new CmdQueue(this._jdbShellServer), this.logFn);

		// setup event handlers
		this._runtime.on(JvmRuntimeEvents.stopOnEntry, (threadId) => {
			this.sendStoppedEvent('entry', threadId);
		});
		this._runtime.on(JvmRuntimeEvents.stopOnStep, (threadId) => {
			this.sendStoppedEvent('step', threadId);
		});
		this._runtime.on(JvmRuntimeEvents.stopOnBreakpoint, (threadId) => {
			this.sendStoppedEvent('breakpont', threadId);
		});
		this._runtime.on(JvmRuntimeEvents.stopOnException, (threadId) => {
			this.sendStoppedEvent('exception', threadId);
		});
		this._runtime.on(JvmRuntimeEvents.breakpointValidated, (id: number, verified: boolean) => {
			this.sendEvent(new BreakpointEvent('changed', <DebugProtocol.Breakpoint>{ id, verified }));
		});
		this._runtime.on(JvmRuntimeEvents.output, (text, filePath?, line?, column?) => {
			const e: DebugProtocol.OutputEvent = new OutputEvent(`${text}\n`);
			if (filePath) {
				e.body.source = this.createSource(filePath);
				e.body.line = this.convertDebuggerLineToClient(line);
				e.body.column = this.convertDebuggerColumnToClient(column);
			}
			this.sendEvent(e);
		});
		this._runtime.on(JvmRuntimeEvents.end, () => {
			this.sendEvent(new TerminatedEvent());
		});
	}

	private sendStoppedEvent(reason: string, threadId?: number) {
		const stop: DebugProtocol.StoppedEvent = new StoppedEvent(reason, threadId);
		stop.body.allThreadsStopped = true;
		this.sendEvent(stop);
	}

	/**
	 * The 'initialize' request is the first request called by the frontend
	 * to interrogate the features the debug adapter provides.
	 */
	protected initializeRequest(response: DebugProtocol.InitializeResponse, args: DebugProtocol.InitializeRequestArguments): void {

		// build and return the capabilities of this debug adapter:
		response.body = response.body || {};

		// the adapter implements the configurationDoneRequest.
		response.body.supportsConfigurationDoneRequest = true;

		// make VS Code to use 'evaluate' when hovering over source
		response.body.supportsEvaluateForHovers = true;

		response.body.supportsSetVariable = true;

		this.sendResponse(response);

		// since this debug adapter can accept configuration requests like 'setBreakpoint' at any time,
		// we request them early by sending an 'initializeRequest' to the frontend.
		// The frontend will end the configuration sequence by calling 'configurationDone' request.
		this.sendEvent(new InitializedEvent());
	}

	/**
	 * Called at the end of the configuration sequence.
	 * Indicates that all breakpoints etc. have been sent to the DA and that the 'launch' can start.
	 */
	protected configurationDoneRequest(response: DebugProtocol.ConfigurationDoneResponse, args: DebugProtocol.ConfigurationDoneArguments): void {
		super.configurationDoneRequest(response, args);

		// notify the launchRequest that configuration has finished
		this._configurationDone.release();
	}

	protected async launchRequest(response: DebugProtocol.LaunchResponse, args: IJvmLaunchRequestArguments) {

		// make sure to 'Stop' the buffered logging if 'trace' is not set
		logger.setup(args.trace ? Logger.LogLevel.Verbose : Logger.LogLevel.Stop, false);

		// wait until configuration has finished (and configurationDoneRequest has been called)
		let reallyDone = false;
		await Promise.all([
			Promise.race([
				Delay(1000),
				this._configurationDone.acquire().then(() => {reallyDone = true}),
			]),
			this._jdbShellServer.create(args.scope),
			this._jvmShellServer.create(args.scope),
			this._scopeHelpers.populate(args.scope),
		]);

		this.logFn(LogType.information, () => `configuration is ${reallyDone? "really" : "not" } done`);

		let listeningOK = false;
		let cdCommand = this._scopeHelpers.cdRemoteRoot();
		this._jvmQueue.postCommand(cdCommand, (cmd, line) => {
			if (line === undefined || line.includes("\0")) {
				return false;
			}
			return true;
		}).then(() => {
			let runCommand = `java -Xdebug -Xrunjdwp:transport=dt_socket,address=${args.port?args.port:5005},server=y,suspend=y`;
			runCommand += ` -cp ${args.classpath}`;
			runCommand += ` ${args.class}`;
			return this._jvmQueue.postCommand(runCommand, (cmd, line) => {
				const rgxListening = /Listening for transport dt_socket at address: (\d+)/;
				const rgxError = /error/i;
				if (!line) {
					return false;
				}
				if (line.match(rgxListening)) {
					listeningOK = true;
					return false;
				}
				if (line.match(rgxError)) {
					return false;
				}
				return true;
			});
		}).then(async () => {
			// start the debug session
			if (listeningOK) {
				if (args.stopOnEntry) {
					await this._runtime.setBreakPoint(this._scopeHelpers.stopOnEntryClass(args.class), "main");
				}
				return this._runtime.start(args);
			} else {
				this.sendEvent(new TerminatedEvent());
				return false;
			}
		});

		this.sendResponse(response);

	}
	protected disconnectRequest(response: DebugProtocol.DisconnectResponse, args: DebugProtocol.DisconnectArguments): void {
		this._jvmShellServer.dispose();
		this._jdbShellServer.dispose();
		this.sendResponse(response);
	}

	protected terminateRequest(response: DebugProtocol.TerminateResponse, args: DebugProtocol.TerminateArguments): void {
		this._jvmShellServer.dispose();
		this._jdbShellServer.dispose();
		this.sendResponse(response);
	}

	protected setBreakPointsRequest(response: DebugProtocol.SetBreakpointsResponse, args: DebugProtocol.SetBreakpointsArguments): void {
		// set and verify breakpoint locations
		if (args.breakpoints) {
			response.body = {
				breakpoints: args.breakpoints.map(bp => {
					return {
						verified: false
					}
				})
			};
		} else {
			// send back the actual breakpoint positions
			response.body = {
				breakpoints: []
			};
		}

		this.sendResponse(response);
	}

	protected threadsRequest(response: DebugProtocol.ThreadsResponse): void {

		this.logFn(LogType.information, () => "begin threadsRequest");

		this._runtime.threads().then((threads) => {
			const respThreads: DebugProtocol.Thread[] = [];
			if (threads) {
				for (const thread of threads) {
					let name = thread.name;
					if (!name) {
						const words = thread.description.split(" ");
						if (words.length) {
							name = words[0];
						}
					}
					respThreads.push(new Thread(thread.id, name? name : String(thread.id)));
				};
			}
			response.body =  {
				threads: respThreads
			};
			this.sendResponse(response);
		});

		this.logFn(LogType.information, () => "end threadsRequest");

	}

	protected stackTraceRequest(response: DebugProtocol.StackTraceResponse, args: DebugProtocol.StackTraceArguments): void {

		this.logFn(LogType.information, () => "begin stackTraceRequest");

		const startFrame = typeof args.startFrame === 'number' ? args.startFrame : 0;
		const maxLevels = typeof args.levels === 'number' ? args.levels : 1000;
		const endFrame = startFrame + maxLevels;

		const stk = this._runtime.stack(args.threadId, startFrame, endFrame);

		response.body = {
			stackFrames: stk.frames.map(f => 
				new StackFrame(f.id, f.place, f.file?this.createSource(f.file):undefined, this.convertDebuggerLineToClient(f.line))),
			totalFrames: stk.totalFrames
		};
		this.sendResponse(response);
	
		this.logFn(LogType.information, () => "end stackTraceRequest");

	}

	protected scopesRequest(response: DebugProtocol.ScopesResponse, args: DebugProtocol.ScopesArguments): void {

		this.logFn(LogType.information, () => "begin scopesRequest");

		const frameReference = args.frameId;
		const scopes = new Array<Scope>();
		scopes.push(new Scope("Local", this._variableHandles.create("local_" + frameReference), false));
		scopes.push(new Scope("Global", this._variableHandles.create("global_" + frameReference), true));

		response.body = {
			scopes: scopes
		};

		setTimeout(() => {
			this.sendResponse(response);
		}, 2000);

		this.logFn(LogType.information, () => "end scopesRequest");

	}

	private counter = 0;

	protected variablesRequest(response: DebugProtocol.VariablesResponse, args: DebugProtocol.VariablesArguments): void {

		this.logFn(LogType.information, () => "begin variablesRequest");

		const variables = new Array<DebugProtocol.Variable>();
		const id = this._variableHandles.get(args.variablesReference);
		if (id !== null) {
			variables.push({
				name: id + "_i",
				type: "integer",
				value: String(++this.counter),
				variablesReference: 0
			});
			variables.push({
				name: id + "_f",
				type: "float",
				value: "3.14",
				variablesReference: 0
			});
			variables.push({
				name: id + "_s",
				type: "string",
				value: "hello world",
				variablesReference: 0
			});
			variables.push({
				name: id + "_o",
				type: "integer",
				value: "Click me!",
				variablesReference: this._variableHandles.create("object_")
			});
		}

		response.body = {
			variables: variables
		};
		this.sendResponse(response);
	
		this.logFn(LogType.information, () => "end variablesRequest");

	}

	protected continueRequest(response: DebugProtocol.ContinueResponse, args: DebugProtocol.ContinueArguments): void {
		response.body = {
			allThreadsContinued: true,
		};
		this.sendResponse(response);
		if (!this._runtime.continue()) {
			this.sendStoppedEvent('error');
		}
	}

	protected nextRequest(response: DebugProtocol.NextResponse, args: DebugProtocol.NextArguments): void {
		response.body = {
			allThreadsContinued: true,
		};
		this.sendResponse(response);
		if (!this._runtime.next()) {
			this.sendStoppedEvent('error');
		}
	}

	protected stepInRequest(response: DebugProtocol.StepInResponse, args: DebugProtocol.StepInArguments): void {
		response.body = {
			allThreadsContinued: true,
		};
		this.sendResponse(response);
		if (!this._runtime.step()) {
			this.sendStoppedEvent('error');
		}
	}

	protected evaluateRequest(response: DebugProtocol.EvaluateResponse, args: DebugProtocol.EvaluateArguments): void {

		let reply: string | undefined = undefined;

		if (args.context === 'repl') {
			this._runtime.command(args.expression);
			reply = "";
		}

		response.body = {
			result: reply ? reply : ``,
			variablesReference: 0
		};
		this.sendResponse(response);
	}

	//---- helpers

	private createSource(filePath: string): Source {
		return new Source(path.basename(filePath), this.convertDebuggerPathToClient(filePath), undefined, undefined, 'jvm-adapter-data');
	}

	protected convertClientPathToDebugger(clientPath: string): string {
		return path.basename(clientPath);
	}

    protected convertDebuggerPathToClient(debuggerPath: string): string {
		return this._scopeHelpers.localFile(debuggerPath);
	}

}
