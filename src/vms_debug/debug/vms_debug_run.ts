/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

const { Subject } = require("await-notify");
import {
    InitializedEvent, Logger,
    logger,
    LoggingDebugSession, StoppedEvent, TerminatedEvent,
    Thread,
} from "@vscode/debugadapter";
import { DebugProtocol } from "@vscode/debugprotocol";
import { LogFunction } from "../../common/main";
import { ModeWork, ShellSession, TypeDataMessage } from "../net/shell-session";
import { VMSRuntimeRun } from "./vms_runtime_run";
import * as vscode from "vscode";
import { EventEmitter, Pseudoterminal, Terminal, window } from "vscode";


//This interface describes the vms-nodebug specific launch attributes
interface LaunchRequestArguments extends DebugProtocol.LaunchRequestArguments
{
	// An absolute path to the "program" to debug.
	program: string;
	// arguments of program
	arguments: string;
	// enable logging the Debug Adapter Protocol
	trace?: boolean;
}

export class VMSNoDebugSession extends LoggingDebugSession
{
	// we don't support multiple threads, so we can use a hardcoded ID for the default thread
	private static THREAD_ID = 2;

	// a VMS runtime (or debugger)
	private runtime: VMSRuntimeRun;
	private configurationDone = new Subject();

    private _writeEmitter = new EventEmitter<string>();
    private _pty?: Pseudoterminal;
    private _terminal?: Terminal;

	// Creates a new debug adapter that is used for one debug session.
	// We configure the default implementation of a debug adapter here.
	public constructor(public folder: vscode.WorkspaceFolder | undefined, shell : ShellSession, public logFn?: LogFunction)
	{
		super("vms-nodebug.txt");

		// this debugger uses zero-based lines and columns
		this.setDebuggerLinesStartAt1(false);
		this.setDebuggerColumnsStartAt1(false);

		this.runtime = new VMSRuntimeRun(folder, shell, logFn);

		// setup event handlers
		this.runtime.on('stopOnException', () =>
		{
			this.sendEvent(new StoppedEvent('exception', VMSNoDebugSession.THREAD_ID));
		});
        this.runtime.on('data', (data) => {
            this._writeEmitter.fire(data);
        });
		this.runtime.on('end', () =>
		{
			this.sendEvent(new TerminatedEvent());
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
		// make VS Code to show a 'step back' button
		response.body.supportsStepBack = false;
		response.body.supportsBreakpointLocationsRequest = false;

		this.sendResponse(response);

		// since this debug adapter can accept configuration requests like 'setBreakpoint' at any time,
		// we request them early by sending an 'initializeRequest' to the frontend.
		// The frontend will end the configuration sequence by calling 'configurationDone' request.
		this.sendEvent(new InitializedEvent());
	}

	// Called at the end of the configuration sequence.
	// Indicates that all breakpoints etc. have been sent to the DA and that the 'launch' can start.
	protected configurationDoneRequest(response: DebugProtocol.ConfigurationDoneResponse, args: DebugProtocol.ConfigurationDoneArguments): void
	{
		super.configurationDoneRequest(response, args);
	}

    private createTerminal(name: string) {
        this._pty = {
            onDidWrite: this._writeEmitter.event,
            open: () => {},
            close: () => {
                this.sendEvent(new TerminatedEvent());
            },
            handleInput: data => {
                this.runtime.sendRawDataToProgram(data);
            },
        };
        this._terminal = window.createTerminal(
            {
                name: name,
                pty: this._pty
            });
        this._terminal.show(true);
    }

	protected async launchRequest(response: DebugProtocol.LaunchResponse, args: LaunchRequestArguments)
	{
		// make sure to 'Stop' the buffered logging if 'trace' is not set
		logger.setup(args.trace ? Logger.LogLevel.Verbose : Logger.LogLevel.Stop, false);

		// wait until configuration has finished (and configurationDoneRequest has been called)
		await this.configurationDone.wait(1000);
		this.sendResponse(response);

        this.createTerminal(args.program);

        // start the program in the runtime
		this.runtime.start(args.program, args.arguments);
	}

	protected async setBreakPointsRequest(response: DebugProtocol.SetBreakpointsResponse, args: DebugProtocol.SetBreakpointsArguments) : Promise<void>
	{
		const actualBreakpoints : DebugProtocol.Breakpoint[] = [];

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
				new Thread(VMSNoDebugSession.THREAD_ID, "thread 2")
			]
		};
		this.sendResponse(response);
	}

	protected evaluateRequest(response: DebugProtocol.EvaluateResponse, args: DebugProtocol.EvaluateArguments): void
	{
		if(args.context === "repl")//data from debug console
		{
			if(this.runtime.sendDataToProgram(args.expression))
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
	protected disconnectRequest(response: DebugProtocol.DisconnectResponse, args: DebugProtocol.DisconnectArguments): void
	{
		this.runtime.exit(args.restart);
		this.sendResponse(response);//disconnect or restart event
	}

	//---- helpers
	public receiveDataShell(mode: ModeWork, type: TypeDataMessage, data: string)
	{
		this.runtime.receiveData(mode, type, data);
	}

	public closeDebugSession()
	{
		this.sendEvent(new TerminatedEvent());
	}
}
