/*---------------------------------------------------------
 * Copyright (C) VMS Corporation. All rights reserved.
 *--------------------------------------------------------*/

import { LogFunction } from "../../common/main";
import { basename } from "path";
const { Subject } = require("await-notify");
import { WorkspaceFolder } from "vscode";
import {
    Breakpoint, BreakpointEvent,
    Handles,
    InitializedEvent, logger, Logger, LoggingDebugSession, OutputEvent,
    Scope, Source, StackFrame, StoppedEvent, TerminatedEvent, Thread,
} from "vscode-debugadapter";
import { DebugProtocol } from "vscode-debugprotocol";
import { DebugCmdVMS } from "../command/debug_commands";
import { ModeWork, ShellSession, TypeDataMessage, TypeTerminal } from "../net/shell-session";
import { DebugVariable, ReflectKind } from "../parsers/debug_variable_info";
import { Queue } from "../queue/queues";
import { VMSBreakpoint, VMSRuntime } from "./vms_runtime";


/**
 * This interface describes the vms-debug specific launch attributes
 * (which are not part of the Debug Adapter Protocol).
 * The schema for these attributes lives in the package.json of the vms-debug extension.
 * The interface should always match this schema.
 */
interface LaunchRequestArguments extends DebugProtocol.LaunchRequestArguments
{
	// An absolute path to the "program" to debug.
	program: string;
	// arguments of program
	arguments: string;
	// Automatically stop target after launch. If not specified, target does not stop.
	stopOnEntry?: boolean;
	// enable logging the Debug Adapter Protocol
	trace?: boolean;
}

export class VMSDebugSession extends LoggingDebugSession
{
	// we don't support multiple threads, so we can use a hardcoded ID for the default thread
	private static THREAD_ID = 1;

	// a VMS runtime (or debugger)
	private runtime: VMSRuntime;
	private launchProgram = false;

	private variableHandles = new Handles<DebugVariable>();

	private configurationDone = new Subject();

	private commandWait = new Subject();

	private responseStackTrace =  new Queue<DebugProtocol.StackTraceResponse>();

	/**
	 * Creates a new debug adapter that is used for one debug session.
	 * We configure the default implementation of a debug adapter here.
	 */
	public constructor(public folder: WorkspaceFolder | undefined, shell : ShellSession, shellDbg : ShellSession, public logFn?: LogFunction)
	{
		super("vms-debug.txt");

		// this debugger uses zero-based lines and columns
		this.setDebuggerLinesStartAt1(false);
		this.setDebuggerColumnsStartAt1(false);

		this.runtime = new VMSRuntime(folder, shell, shellDbg, logFn);

		// response event handlers
		this.runtime.on(DebugCmdVMS.dbgStack, (stack : any) =>
		{
			let response = this.responseStackTrace.pop();

			response.body = {
				stackFrames: stack.frames.map((f:any) => new StackFrame(f.index, f.name, this.createSource(f.file), this.convertDebuggerLineToClient(f.line))),
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
		this.runtime.on('restart', () =>
		{
			this.sendEvent(new TerminatedEvent(true));
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
		if (this.launchProgram === false)
		{
			this.launchProgram = true;
			// make sure to 'Stop' the buffered logging if 'trace' is not set
			logger.setup(args.trace ? Logger.LogLevel.Verbose : Logger.LogLevel.Stop, false);
			// wait until configuration has finished (and configurationDoneRequest has been called)
			await this.configurationDone.wait(1000);

			this.sendResponse(response);

			// start the program in the runtime
			await this.runtime.start(args.program, args.arguments, !!args.stopOnEntry);

			setTimeout(() => 
			{
				this.launchProgram = false;
			}, 3000);
		}
		else
		{
			this.sendResponse(response);
		}
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
			//const globals = await this.runtime.getVariables("global");

			this.addFullyQualifiedName(locals);
			//this.addFullyQualifiedName(globals);

			let localVariables = {
				name: "Local",
				nameFull: "",
				addr: "",
				type: "",
				kind: 0,
				value: "",
				info: "",
				prefix: "",
				len: 0,
				children: locals,
				unreadable: "",
				fullyQualifiedName: "",
			};
			// let globalVariables = {
			// 	name: "Global",
			//	nameFull: "",
			// 	addr: "",
			// 	type: "",
			// 	kind: 0,
			// 	value: "",
			//  info: "",
			// 	len: 0,
			// 	children: globals,
			// 	unreadable: "",
			// 	fullyQualifiedName: "",
			// };

			scopes.push(new Scope("Local", this.variableHandles.create(localVariables), false));
			//scopes.push(new Scope("Global", this.variableHandles.create(globalVariables), true));
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
					name: v.name,
					value: result,
					type: v.type,
					evaluateName: vari.fullyQualifiedName + v.name,
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
					v.fullyQualifiedName = vari.fullyQualifiedName + this.runtime.getVariablePeriod() + v.name;
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

	protected async setVariableRequest(response: DebugProtocol.SetVariableResponse, args: DebugProtocol.SetVariableArguments): Promise<void>
	{
		let variable = this.variableHandles.get(args.variablesReference);
		let fullName : string = args.name;

		//Check variables for possible to change
		for(let item of variable.children)
		{
			if(item.name === args.name)
			{
				if((item.children.length > 0 || item.addr === undefined || item.addr === "") && item.kind !== ReflectKind.Atomic)
				{
					this.sendResponse(response);
					return;
				}				
				break;
			}
		}

		if(variable.kind === ReflectKind.Array)
		{
			fullName = variable.fullyQualifiedName + args.name;
		}
		else if(variable.kind === ReflectKind.Struct)
		{
			fullName = variable.fullyQualifiedName + this.runtime.getVariablePeriod() + args.name;
		}
		else if(variable.kind === ReflectKind.Pointer)
		{
			if(variable.type.includes("atomic type"))
			{
				fullName = this.runtime.getPointerDereferencing() + variable.fullyQualifiedName;
			}
			else
			{
				fullName = variable.fullyQualifiedName + this.runtime.getPointerPeriod() + args.name;
			}
		}
		else
		{
			for(let item of variable.children)
			{
				if(item.name === args.name)
				{
					if(item.kind === ReflectKind.String)
					{
						if(item.prefix)
						{
							fullName = this.runtime.getPointerDereferencing() + args.name + item.prefix;
						}
						else
						{
							fullName = this.runtime.getPointerDereferencing() + args.name;
						}
					}
					else
					{
						fullName = args.name;
					}
					break;
				}
			}
		}

		let result = await this.runtime.setVariableValue(fullName, args.value);

		if(result)
		{
			response.body =
			{
				value: args.value
			};
		}		
		this.sendResponse(response);
	}

	protected async evaluateRequest(response: DebugProtocol.EvaluateResponse, args: DebugProtocol.EvaluateArguments): Promise<void>
	{
		if(args.context === "hover")//request value of selected a variable
		{
			const variable = await this.runtime.getVariable(args.expression);

			variable.map((v, i) =>
			{
				response.body = this.convertDebugVariableToProtocolVariable(v, 0);
			});
		}
		else if(args.context === "repl")//data from debug console
		{
			this.runtime.sendDataToProgram(args.expression);

			await this.commandWait.wait(1000);

			response.body =
			{
				result: "\r",
				variablesReference: 0
			};
		}
		else if(args.context === "watch")//set watch
		{
			if(args.expression.includes("\\"))
			{
				let items = args.expression.split("\\");
				args.expression = items[items.length - 1];
			}

			let varName : string = args.expression;
			let params : string = "";
			let indexSymbol = args.expression.indexOf("(");

			if(indexSymbol !== -1)
			{
				varName = args.expression.substr(0, indexSymbol).trim();
				params = args.expression.substr(indexSymbol).trim();
			}

			this.runtime.setWatchVariable(varName, params);
			const variable = await this.runtime.getVariable(varName);

			variable.map((v, i) =>
			{
				response.body = this.convertDebugVariableToProtocolVariable(v, 0);
			});
		}

		this.sendResponse(response);
	}


	//buttons events
	protected continueRequest(response: DebugProtocol.ContinueResponse, args: DebugProtocol.ContinueArguments): void
	{
		this.sendResponse(response);//first response
		this.runtime.continueExec();//second command
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
		this.sendResponse(response);//disconnect or restart event
		this.runtime.exit(args.restart);
	}

	//---- helpers

	private createSource(filePath: string): Source
	{
		return new Source(basename(filePath), this.convertDebuggerPathToClient(filePath), undefined, undefined, 'vms-adapter-data');
	}


	public receiveDataShell(typeTerminal: TypeTerminal, mode: ModeWork, type: TypeDataMessage, data: string)
	{
		this.runtime.receiveData(typeTerminal, mode, type, data);
	}

	public closeDebugSession()
	{
		this.sendEvent(new TerminatedEvent());
	}

	private convertDebugVariableToProtocolVariable(v: DebugVariable, i: number): { result: string; variablesReference: number; }
	{
		let info : string;

		if(v.info && v.info !== "")
		{
			info = v.info;
		}
		else
		{
			info = v.type;
		}

		if (v.kind === ReflectKind.Pointer)
		{
			if (v.addr === "")
			{
				return {
					result: "null <" + info + ">",
					variablesReference: 0
				};
			}
			else
			{
				return {
					result: v.addr ? `(${v.addr}) <${info}>` : `<${info}>`,
					variablesReference: v.children.length > 0 ? this.variableHandles.create(v) : 0
				};
			}
		}
		else if (v.kind === ReflectKind.Array || v.kind === ReflectKind.Struct)
		{
			return {
				result: "<" + info + ">",
				variablesReference: this.variableHandles.create(v)
			};
		}
		else if (v.kind === ReflectKind.String)
		{
			if(!v.value)
			{
				if(v.addr === "")
				{
					v.value = "null" + " <" + v.type + ">";
				}
				else
				{
					v.value = `(${v.addr})` + " <" + v.type + ">";
				}
			}

			return {
				result: v.unreadable ? ("<" + v.unreadable + ">") : (v.value),
				variablesReference: 0
			};
		}
		else
		{
			return {
				result: v.value || ("<" + info + ">"),
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
		let varPeriod = this.runtime.getVariablePeriod();
		let ptrPeriod = this.runtime.getPointerPeriod();

		variable.children.forEach(child =>
		{
			if(variable.kind === ReflectKind.Array)
			{
				child.fullyQualifiedName = variable.fullyQualifiedName + child.name;
			}
			else if(variable.kind === ReflectKind.Struct)
			{
				child.fullyQualifiedName = variable.fullyQualifiedName + varPeriod + child.name;
			}
			else if(variable.kind === ReflectKind.Pointer)
			{
				child.fullyQualifiedName = variable.fullyQualifiedName + ptrPeriod + child.name;
			}

			this.addChildQualifiedName(child);
		});
	}
}
