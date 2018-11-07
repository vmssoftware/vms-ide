/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

import {
	Logger, logger,
	LoggingDebugSession,
	InitializedEvent, TerminatedEvent, StoppedEvent, BreakpointEvent, OutputEvent,
	Thread, StackFrame, Scope, Source, Handles, Breakpoint
} from 'vscode-debugadapter';
import { DebugProtocol } from 'vscode-debugprotocol';
import { basename } from 'path';
import { VMSRuntime, VMSBreakpoint } from './vms_runtime';
import { ShellSession, ModeWork } from '../net/shell-session';
import { DebugCmdVMS } from '../command/debug_commands';
import { Queue } from '../queue/queues';
import { LogFunction } from '@vorfol/common';
const { Subject } = require('await-notify');


/**
 * This interface describes the vms-debug specific launch attributes
 * (which are not part of the Debug Adapter Protocol).
 * The schema for these attributes lives in the package.json of the vms-debug extension.
 * The interface should always match this schema.
 */
interface LaunchRequestArguments extends DebugProtocol.LaunchRequestArguments
{
	/** An absolute path to the "program" to debug. */
	program: string;
	/** Automatically stop target after launch. If not specified, target does not stop. */
	stopOnEntry?: boolean;
	/** enable logging the Debug Adapter Protocol */
	trace?: boolean;
}

export class VMSDebugSession extends LoggingDebugSession
{
	// we don't support multiple threads, so we can use a hardcoded ID for the default thread
	private static THREAD_ID = 1;

	// a VMS runtime (or debugger)
	private _runtime: VMSRuntime;

	private _variableHandles = new Handles<string>();

	private _configurationDone = new Subject();

	private responseEvaluate: DebugProtocol.EvaluateResponse;
	private responseStackTrace =  new Queue<DebugProtocol.StackTraceResponse>();

	/**
	 * Creates a new debug adapter that is used for one debug session.
	 * We configure the default implementation of a debug adapter here.
	 */
	public constructor(shell : ShellSession, public logFn?: LogFunction)
	{
		super("vms-debug.txt");

		// this debugger uses zero-based lines and columns
		this.setDebuggerLinesStartAt1(false);
		this.setDebuggerColumnsStartAt1(false);

		this._runtime = new VMSRuntime(shell, logFn);

		// response event handlers
		this._runtime.on(DebugCmdVMS.dbgExamine, (data : string) =>
		{
			let reply: string | undefined = undefined;

			this.responseEvaluate.body =
			{
				result: reply ? reply : `context: '${data}'`,
				variablesReference: 0
			};
			this.sendResponse(this.responseEvaluate);
		});
		this._runtime.on(DebugCmdVMS.dbgStack, (stack : any) =>
		{
			let response = this.responseStackTrace.pop();

			response.body = {
				stackFrames: stack.frames.map(f => new StackFrame(f.index, f.name, this.createSource(f.file), this.convertDebuggerLineToClient(f.line))),
				totalFrames: stack.count
			};
			this.sendResponse(response);
		});

		// setup event handlers
		this._runtime.on('stopOnEntry', () =>
		{
			this.sendEvent(new StoppedEvent('entry', VMSDebugSession.THREAD_ID));
		});
		this._runtime.on('stopOnStep', () =>
		{
			this.sendEvent(new StoppedEvent('step', VMSDebugSession.THREAD_ID));
		});
		this._runtime.on('stopOnBreakpoint', () =>
		{
			this.sendEvent(new StoppedEvent('breakpoint', VMSDebugSession.THREAD_ID));
		});
		this._runtime.on('stopOnException', () =>
		{
			this.sendEvent(new StoppedEvent('exception', VMSDebugSession.THREAD_ID));
		});
		this._runtime.on('output', (text, filePath, line, column) =>
		{
			const e: DebugProtocol.OutputEvent = new OutputEvent(`${text}\n`);
			e.body.source = this.createSource(filePath);
			e.body.line = this.convertDebuggerLineToClient(line);
			e.body.column = this.convertDebuggerColumnToClient(column);
			this.sendEvent(e);
		});
		this._runtime.on('end', () =>
		{
			this.sendEvent(new TerminatedEvent());
		});

		// breakpoints event handlers
		this._runtime.on('breakpointValidated', (bp: VMSBreakpoint) =>
		{
			this.sendEvent(new BreakpointEvent('changed', <DebugProtocol.Breakpoint>{ verified: bp.verified, id: bp.id }));
		});
		this._runtime.on('breakpointRemoved', (bp: VMSBreakpoint | undefined) =>
		{
			if (bp)
			{
				const mbp = <DebugProtocol.Breakpoint> new Breakpoint(false);
				mbp.id= bp.id;
				this.sendEvent(new BreakpointEvent('removed', mbp));
			}
		});
	}

	// The 'initialize' request is the first request called by the frontend
	// to interrogate the features the debug adapter provides.
	protected initializeRequest(response: DebugProtocol.InitializeResponse, args: DebugProtocol.InitializeRequestArguments): void
	{
		// build and return the capabilities of this debug adapter:
		response.body = response.body || {};

		// the adapter implements the configurationDoneRequest.
		response.body.supportsConfigurationDoneRequest = true;
		// make VS Code to use 'evaluate' when hovering over source
		response.body.supportsEvaluateForHovers = true;
		// make VS Code to show a 'step back' button
		response.body.supportsStepBack = false;
		// make VS Code to use 'set variable'
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
	protected configurationDoneRequest(response: DebugProtocol.ConfigurationDoneResponse, args: DebugProtocol.ConfigurationDoneArguments): void
	{
		super.configurationDoneRequest(response, args);

		// notify the launchRequest that configuration has finished
		this._configurationDone.notify();
	}

	protected async launchRequest(response: DebugProtocol.LaunchResponse, args: LaunchRequestArguments)
	{
		// make sure to 'Stop' the buffered logging if 'trace' is not set
		logger.setup(args.trace ? Logger.LogLevel.Verbose : Logger.LogLevel.Stop, false);

		// wait until configuration has finished (and configurationDoneRequest has been called)
		await this._configurationDone.wait(1000);

		// start the program in the runtime
		this._runtime.start(args.program);

		this.sendResponse(response);
	}

	protected setBreakPointsRequest(response: DebugProtocol.SetBreakpointsResponse, args: DebugProtocol.SetBreakpointsArguments): void
	{
		const path = <string>args.source.path;
		const clientLines = args.lines || [];
		let debugLines : number[] = [];
		const actualBreakpoints : DebugProtocol.Breakpoint[] = [];

		for(let item of clientLines)
		{
			debugLines.push(this.convertClientLineToDebugger(item));
		}

		// set and verify breakpoints locations
		let bps = this._runtime.setBreakPoints(path, debugLines);

		if(bps)
		{
			for(let item of bps)
			{
				const bp = <DebugProtocol.Breakpoint> new Breakpoint(item.verified, this.convertDebuggerLineToClient(item.line));
				bp.id = item.id;
				actualBreakpoints.push(bp);
			}
		}

		// send back the actual breakpoint positions
		response.body = {
			breakpoints: actualBreakpoints
		};
		this.sendResponse(response);
	}

	protected threadsRequest(response: DebugProtocol.ThreadsResponse): void
	{
		// runtime supports now threads so just return a default thread.
		response.body = {
			threads: [
				new Thread(VMSDebugSession.THREAD_ID, "thread 1")
			]
		};
		this.sendResponse(response);
	}

	protected stackTraceRequest(response: DebugProtocol.StackTraceResponse, args: DebugProtocol.StackTraceArguments): void//call 1
	{
		const startFrame = typeof args.startFrame === 'number' ? args.startFrame : 0;
		const maxLevels = typeof args.levels === 'number' ? args.levels : 1000;
		const endFrame = startFrame + maxLevels;

		this._runtime.stack(startFrame, endFrame);
		this.responseStackTrace.push(response);
	}

	protected scopesRequest(response: DebugProtocol.ScopesResponse, args: DebugProtocol.ScopesArguments): void//call 2
	{
		const frameReference = args.frameId;
		const scopes = new Array<Scope>();
		scopes.push(new Scope("Local", this._variableHandles.create("local_" + frameReference), false));
		scopes.push(new Scope("Global", this._variableHandles.create("global_" + frameReference), true));

		response.body =
		{
			scopes: scopes
		};
		this.sendResponse(response);
	}

	protected variablesRequest(response: DebugProtocol.VariablesResponse, args: DebugProtocol.VariablesArguments): void//call 3
	{
		const id = this._variableHandles.get(args.variablesReference);
		const variables = this._runtime.getVariables(id);

		response.body =
		{
			variables: variables
		};

		this.sendResponse(response);
	}

	protected setVariableRequest(response: DebugProtocol.SetVariableResponse, args: DebugProtocol.SetVariableArguments): void
	{
		this.sendResponse(response);
	}

	protected evaluateRequest(response: DebugProtocol.EvaluateResponse, args: DebugProtocol.EvaluateArguments): void
	{
		if(args.context === "hover")//request value of selected a variable
		{
			this._runtime.variableValue(args.expression);
			this.responseEvaluate = response;
		}
		else if(args.context === "repl")//data from debug console
		{
			if(this._runtime.sendDataToProgram(args.expression))
			{
				response.body =
				{
					result: "\r",
					variablesReference: 0
				};
			}
			else
			{
				response.body =
				{
					result: "",
					variablesReference: 0
				};
			}

			this.sendResponse(response);
		}
		else
		{
			this.sendResponse(response);
		}
	}


	//buttons events
	protected continueRequest(response: DebugProtocol.ContinueResponse, args: DebugProtocol.ContinueArguments): void
	{
		this.sendResponse(response);//first response
		this._runtime.continue();//second command
	}

	protected nextRequest(response: DebugProtocol.NextResponse, args: DebugProtocol.NextArguments): void
	{
		this.sendResponse(response);
		this._runtime.stepOver();
	}

	protected stepInRequest(response: DebugProtocol.StepInResponse, args: DebugProtocol.StepInArguments): void
	{
		this.sendResponse(response);
		this._runtime.stepInto();
	}

	protected stepOutRequest(response: DebugProtocol.StepOutResponse, args: DebugProtocol.StepOutArguments): void
	{
		this.sendResponse(response);
		this._runtime.stepOut();
	}

	protected pauseRequest(response: DebugProtocol.PauseResponse, args: DebugProtocol.PauseArguments): void
	{
		this.sendResponse(response);
		this._runtime.stop();
	}

	protected disconnectRequest(response: DebugProtocol.DisconnectResponse, args: DebugProtocol.DisconnectArguments): void
	{
		this.sendResponse(response);//disconnect or restart event
		this._runtime.exit();
	}

	//---- helpers

	private createSource(filePath: string): Source
	{
		return new Source(basename(filePath), this.convertDebuggerPathToClient(filePath), undefined, undefined, 'vms-adapter-data');
	}


	public receiveDataShell(data: string, mode: ModeWork)
	{
		this._runtime.receiveData(data, mode);
	}

	public closeDebugSession()
	{
		this.sendEvent(new TerminatedEvent());
	}
}
