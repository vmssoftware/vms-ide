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
import { ShellSession, ModeWork, TypeDataMessage } from '../net/shell-session';
import { DebugCmdVMS } from '../command/debug_commands';
import { Queue } from '../queue/queues';
import { LogFunction } from '@vorfol/common';
import { WorkspaceFolder } from 'vscode';
import { DebugVariable, ReflectKind } from '../parsers/debug_variable_info';
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
	private runtime: VMSRuntime;

	private variableHandles = new Handles<DebugVariable>();

	private configurationDone = new Subject();

	private responseStackTrace =  new Queue<DebugProtocol.StackTraceResponse>();

	/**
	 * Creates a new debug adapter that is used for one debug session.
	 * We configure the default implementation of a debug adapter here.
	 */
	public constructor(public folder: WorkspaceFolder | undefined, shell : ShellSession, public logFn?: LogFunction)
	{
		super("vms-debug.txt");

		// this debugger uses zero-based lines and columns
		this.setDebuggerLinesStartAt1(false);
		this.setDebuggerColumnsStartAt1(false);

		this.runtime = new VMSRuntime(folder, shell, logFn);

		// response event handlers
		this.runtime.on(DebugCmdVMS.dbgStack, (stack : any) =>
		{
			let response = this.responseStackTrace.pop();

			response.body = {
				stackFrames: stack.frames.map(f => new StackFrame(f.index, f.name, this.createSource(f.file), this.convertDebuggerLineToClient(f.line))),
				totalFrames: stack.count
			};
			this.sendResponse(response);
		});

		// setup event handlers
		this.runtime.on('stopOnEntry', () =>
		{
			this.sendEvent(new StoppedEvent('entry', VMSDebugSession.THREAD_ID));
		});
		this.runtime.on('stopOnStep', () =>
		{
			this.sendEvent(new StoppedEvent('step', VMSDebugSession.THREAD_ID));
		});
		this.runtime.on('stopOnBreakpoint', () =>
		{
			this.sendEvent(new StoppedEvent('breakpoint', VMSDebugSession.THREAD_ID));
		});
		this.runtime.on('stopOnException', () =>
		{
			this.sendEvent(new StoppedEvent('exception', VMSDebugSession.THREAD_ID));
		});
		this.runtime.on('output', (text, filePath, line, column) =>
		{
			const e: DebugProtocol.OutputEvent = new OutputEvent(`${text}\n`);
			e.body.source = this.createSource(filePath);
			e.body.line = this.convertDebuggerLineToClient(line);
			e.body.column = this.convertDebuggerColumnToClient(column);
			this.sendEvent(e);
		});
		this.runtime.on('end', () =>
		{
			this.sendEvent(new TerminatedEvent());
		});

		// breakpoints event handlers
		this.runtime.on('breakpointValidated', (bp: VMSBreakpoint) =>
		{
			this.sendEvent(new BreakpointEvent('changed', <DebugProtocol.Breakpoint>{ verified: bp.verified, id: bp.id }));
		});
		this.runtime.on('breakpointRemoved', (bp: VMSBreakpoint | undefined) =>
		{
			if (bp)
			{
				const mbp = <DebugProtocol.Breakpoint> new Breakpoint(false);
				mbp.id= bp.id;
				this.sendEvent(new BreakpointEvent('removed', mbp));
			}
		});
		this.runtime.on('breakpointAdd', (bp: VMSBreakpoint | undefined, path : string) =>
		{
			if (bp)
			{
				const bpm = <DebugProtocol.Breakpoint> new Breakpoint(bp.verified, this.convertDebuggerLineToClient(bp.line), undefined, this.createSource(path));
				bpm.id= bp.id;
				this.sendEvent(new BreakpointEvent('new', bpm));
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
		this.configurationDone.notify();
	}

	protected async launchRequest(response: DebugProtocol.LaunchResponse, args: LaunchRequestArguments)
	{
		// make sure to 'Stop' the buffered logging if 'trace' is not set
		logger.setup(args.trace ? Logger.LogLevel.Verbose : Logger.LogLevel.Stop, false);

		// wait until configuration has finished (and configurationDoneRequest has been called)
		await this.configurationDone.wait(1000);

		// start the program in the runtime
		await this.runtime.start(args.program, !!args.stopOnEntry);

		this.sendResponse(response);
	}

	protected async setBreakPointsRequest(response: DebugProtocol.SetBreakpointsResponse, args: DebugProtocol.SetBreakpointsArguments) : Promise<void>
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
		let bps = await this.runtime.setBreakPoints(path, debugLines);

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
		this.responseStackTrace.push(response);

		const startFrame = typeof args.startFrame === 'number' ? args.startFrame : 0;
		const maxLevels = typeof args.levels === 'number' ? args.levels : 1000;
		const endFrame = startFrame + maxLevels;

		this.runtime.stack(startFrame, endFrame);
	}

	protected async scopesRequest(response: DebugProtocol.ScopesResponse, args: DebugProtocol.ScopesArguments): Promise<void>//call 2
	{
		const frameReference = args.frameId;
		const scopes = new Array<Scope>();

		if(frameReference === 0)
		{
			this.variableHandles = new Handles<DebugVariable>(); //clean  old data

			const locals = await this.runtime.getVariables("local");
			const globals = await this.runtime.getVariables("global");

			this.addFullyQualifiedName(locals);
			this.addFullyQualifiedName(globals);

			let localVariables = {
				name: "Local",
				addr: 0,
				type: "",
				kind: 0,
				value: "",
				len: 0,
				children: locals,
				unreadable: "",
				fullyQualifiedName: "",
			};
			let globalVariables = {
				name: "Global",
				addr: 0,
				type: "",
				kind: 0,
				value: "",
				len: 0,
				children: globals,
				unreadable: "",
				fullyQualifiedName: "",
			};

			scopes.push(new Scope("Local", this.variableHandles.create(localVariables), false));
			scopes.push(new Scope("Global", this.variableHandles.create(globalVariables), true));
		}

		response.body =
		{
			scopes: scopes
		};
		this.sendResponse(response);
	}

	protected variablesRequest(response: DebugProtocol.VariablesResponse, args: DebugProtocol.VariablesArguments): void//call 3
	{
		let variables;
		const vari = this.variableHandles.get(args.variablesReference);

		if (vari.kind === ReflectKind.Array)
		{
			variables = vari.children.map((v, i) =>
			{
				let { result, variablesReference } = this.convertDebugVariableToProtocolVariable(v, i);

				return {
					name: "[" + i + "]",
					value: result,
					type: v.type,
					evaluateName: vari.fullyQualifiedName + "[" + i + "]",
					variablesReference
				};
			});
		}
		else if (vari.kind === ReflectKind.Map)
		{
			variables = [];

			for (let i = 0; i < vari.children.length; i += 2)
			{
				if (i + 1 >= vari.children.length)
				{
					break;
				}

				let mapKey = this.convertDebugVariableToProtocolVariable(vari.children[i], i);
				let mapValue = this.convertDebugVariableToProtocolVariable(vari.children[i + 1], i + 1);

				variables.push({
					name: mapKey.result,
					value: mapValue.result,
					type: vari.children[i + 1].type,
					evaluateName: vari.fullyQualifiedName + "[" + mapKey.result + "]",
					variablesReference: mapValue.variablesReference
				});
			}
		}
		else
		{
			variables = vari.children.map((v, i) =>
			{
				let { result, variablesReference } = this.convertDebugVariableToProtocolVariable(v, i);

				if (v.fullyQualifiedName === undefined)
				{
					v.fullyQualifiedName = vari.fullyQualifiedName + "." + v.name;
				}

				return {
					name: v.name,
					value: result,
					type: v.type,
					evaluateName: v.fullyQualifiedName,
					variablesReference
				};
			});
		}

		response.body =
		{
			variables: variables
		};
		this.sendResponse(response);
	}

	protected setVariableRequest(response: DebugProtocol.SetVariableResponse, args: DebugProtocol.SetVariableArguments): void
	{
		let variable = this.variableHandles.get(args.variablesReference);
		let fullName : string = args.name;

		if(variable.kind === ReflectKind.Array)
		{
			fullName = variable.fullyQualifiedName + args.name;
		}
		else if(variable.kind === ReflectKind.Struct)
		{
			fullName = variable.fullyQualifiedName + "." + args.name;
		}

		this.runtime.setVariableValue(fullName, args.value);

		response.body =
		{
			value: args.value
		};
		this.sendResponse(response);
	}

	protected async evaluateRequest(response: DebugProtocol.EvaluateResponse, args: DebugProtocol.EvaluateArguments): Promise<void>
	{
		if(args.context === "hover")//request value of selected a variable
		{
			const variable = await this.runtime.getVariable(args.expression);

			this.addFullyQualifiedName(variable);

			variable.map((v, i) =>
			{
				response.body = this.convertDebugVariableToProtocolVariable(v, 0);
			});
		}
		else if(args.context === "repl")//data from debug console
		{
			this.runtime.sendDataToProgram(args.expression);

			response.body =
			{
				result: "\r",
				variablesReference: 0
			};
		}

		this.sendResponse(response);
	}


	//buttons events
	protected continueRequest(response: DebugProtocol.ContinueResponse, args: DebugProtocol.ContinueArguments): void
	{
		this.sendResponse(response);//first response
		this.runtime.continue();//second command
	}

	protected nextRequest(response: DebugProtocol.NextResponse, args: DebugProtocol.NextArguments): void
	{
		this.sendResponse(response);
		this.runtime.stepOver();
	}

	protected stepInRequest(response: DebugProtocol.StepInResponse, args: DebugProtocol.StepInArguments): void
	{
		this.sendResponse(response);
		this.runtime.stepInto();
	}

	protected stepOutRequest(response: DebugProtocol.StepOutResponse, args: DebugProtocol.StepOutArguments): void
	{
		this.sendResponse(response);
		this.runtime.stepOut();
	}

	protected pauseRequest(response: DebugProtocol.PauseResponse, args: DebugProtocol.PauseArguments): void
	{
		this.sendResponse(response);
		this.runtime.stop();
	}

	protected disconnectRequest(response: DebugProtocol.DisconnectResponse, args: DebugProtocol.DisconnectArguments): void
	{
		this.runtime.exit(args.restart);
		this.sendResponse(response);//disconnect or restart event
	}

	//---- helpers

	private createSource(filePath: string): Source
	{
		return new Source(basename(filePath), this.convertDebuggerPathToClient(filePath), undefined, undefined, 'vms-adapter-data');
	}


	public receiveDataShell(mode: ModeWork, type: TypeDataMessage, data: string)
	{
		this.runtime.receiveData(mode, type, data);
	}

	public closeDebugSession()
	{
		this.sendEvent(new TerminatedEvent());
	}

	private convertDebugVariableToProtocolVariable(v: DebugVariable, i: number): { result: string; variablesReference: number; }
	{
		if (v.kind === ReflectKind.Pointer)
		{
			if (v.children[0].addr === 0)
			{
				return {
					result: "nil <" + v.type + ">",
					variablesReference: 0
				};
			}
			else if (v.children[0].type === "void")
			{
				return {
					result: "void",
					variablesReference: 0
				};
			}
			else
			{
				if (v.children[0].children.length > 0)
				{
					v.children[0].fullyQualifiedName = v.fullyQualifiedName;
					v.children[0].children.forEach(child => {
						child.fullyQualifiedName = v.fullyQualifiedName + "." + child.name;
					});
				}

				return {
					result: `<${v.type}>(0x${v.children[0].addr.toString(16)})`,
					variablesReference: v.children.length > 0 ? this.variableHandles.create(v) : 0
				};
			}
		}
		else if (v.kind === ReflectKind.Array || v.kind === ReflectKind.Struct)
		{
			return {
				result: "<" + v.type + ">",
				variablesReference: this.variableHandles.create(v)
			};
		}
		else if (v.kind === ReflectKind.String)
		{
			let val = v.value;
			let byteLength = Buffer.byteLength(val || "");

			if (v.value && byteLength < v.len)
			{
				val += `...+${v.len - byteLength} more`;
			}

			return {
				result: v.unreadable ? ("<" + v.unreadable + ">") : ('"' + val + '"'),
				variablesReference: 0
			};
		}
		else
		{
			return {
				result: v.value || ("<" + v.type + ">"),
				variablesReference: v.children.length > 0 ? this.variableHandles.create(v) : 0
			};
		}
	}

	private addFullyQualifiedName(variables: DebugVariable[])
	{
		variables.forEach(local =>
		{
			local.fullyQualifiedName = local.name;
			this.addChildQualifiedName(local);
		});
	}

	private addChildQualifiedName(variable: DebugVariable)
	{
		variable.children.forEach(child =>
		{
			if(variable.kind === ReflectKind.Array)
			{
				child.fullyQualifiedName = variable.fullyQualifiedName + child.name;
			}
			else if(variable.kind === ReflectKind.Struct)
			{
				child.fullyQualifiedName = variable.fullyQualifiedName + "." + child.name;
			}

			this.addChildQualifiedName(child);
		});
	}
}
