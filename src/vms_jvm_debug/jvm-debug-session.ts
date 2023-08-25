import * as nls from "vscode-nls";

import {
    Logger, logger,
    LoggingDebugSession,
    InitializedEvent, TerminatedEvent, StoppedEvent, BreakpointEvent, OutputEvent,
    Thread, StackFrame, Scope, Source, Handles, Breakpoint, Variable
} from '@vscode/debugadapter';

import { DebugProtocol } from '@vscode/debugprotocol';
import * as path from 'path';

import { Lock, Delay, LogFunction, LogType } from '../common/main';

import { JvmShellRuntime, JvmRuntimeEvents, IJvmVariable, isJvmVarNeedReference, JvmVarType } from './jvm-shell-runtime';
import { IJvmLaunchRequestArguments } from './jvm-config';
import { SshShellServer } from './ssh-shell-server';
import { CmdQueue } from './cmd-queue';
import { JvmProjectHelper } from './jvm-proj-helper';
import { ListenerResponse } from "./communication";
import { minOf } from "../common/iterators";
import { window, QuickPickItem, EventEmitter, Pseudoterminal, Terminal } from "vscode";
import { JvmProject } from "./jvm-project";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

enum jvmStartResult {
    unknown,
    started,
    portIsBusy,
    error,
};

/**
 * Adapter between VS code and JVM runtime
 */
export class JvmDebugSession extends LoggingDebugSession {

    // a JVM runtime
    private _runtime: JvmShellRuntime;

    private _jdbShellServer: SshShellServer;

    private _jvmQueue: CmdQueue;
    private _jvmShellServer: SshShellServer;

    private _scope?: string;
    // private _scopeHelpers: ScopeHelpers;

    private _variableHandles = new Handles<IJvmVariable>();

    private _configurationDone = new Lock(true, "configurationDone");

    private _logFn: LogFunction;

    private _breakPoints = new Map<string, Map<number, number>>();  // [file -> id -> line ]
    private _functionBreakPoints = new Map<string, number>();       // [name as is -> id ]
    private _stopOnEntryBp = 0;

    private _writeEmitter = new EventEmitter<string>();
    private _pty?: Pseudoterminal;
    private _terminal?: Terminal;

	/**
	 * Creates a new debug adapter that is used for one debug session.
	 * We configure the default implementation of a debug adapter here.
	 */
    public constructor(logFn?: LogFunction) {
        super("vms-jvm-debugger.txt");

        this._logFn = logFn || (() => { });

        // this debugger uses zero-based lines and columns
        this.setDebuggerLinesStartAt1(true);
        this.setDebuggerColumnsStartAt1(true);

        this._jdbShellServer = new SshShellServer(this._logFn);
        this._jvmShellServer = new SshShellServer(this._logFn);
        this._jvmQueue = new CmdQueue(this._jvmShellServer);

        // this._scopeHelpers = new ScopeHelpers(this.logFn);

        this._runtime = new JvmShellRuntime(new CmdQueue(this._jdbShellServer), this._logFn);

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
        this._runtime.on(JvmRuntimeEvents.stopOnBreakpointError, (threadId) => {
            this.sendStoppedEvent('breakpoint error', threadId);
        });
        this._runtime.on(JvmRuntimeEvents.stopOnPause, (threadId) => {
            this.sendStoppedEvent('pause', threadId);
        });
        this._runtime.on(JvmRuntimeEvents.stopOnDataChange, (threadId) => {
            this.sendStoppedEvent('data change', threadId);
        });
        this._runtime.on(JvmRuntimeEvents.stopOnDataAccess, (threadId) => {
            this.sendStoppedEvent('data access', threadId);
        });
        this._runtime.on(JvmRuntimeEvents.breakpointValidated, (id: number, verified: boolean) => {
            for (const [file, ids] of this._breakPoints) {
                const line = ids.get(id);
                if (line) {
                    this.sendEvent(new BreakpointEvent('changed', <DebugProtocol.Breakpoint>{ id, verified, line }));
                    return;
                }
            }
            // for function breakpoint
            this.sendEvent(new BreakpointEvent('changed', <DebugProtocol.Breakpoint>{ id, verified }));
        });
        this._runtime.on(JvmRuntimeEvents.output, async (text, filePath?, line?, column?) => {
            const e: DebugProtocol.OutputEvent = new OutputEvent(`${text}\n`);
            if (filePath) {
                e.body.source = await this.createSource(filePath);
                e.body.line = this.convertDebuggerLineToClient(line);
                e.body.column = this.convertDebuggerColumnToClient(column);
            }
            this.sendEvent(e);
        });
        this._runtime.on(JvmRuntimeEvents.end, () => {
            // give last messages from program a chance to be displayed
            setTimeout(() => {
                this.sendEvent(new TerminatedEvent());
            }, 1000);
        });
    }

    private sendStoppedEvent(reason: string, threadId?: number) {
        const stop: DebugProtocol.StoppedEvent = new StoppedEvent(reason, threadId);
        stop.body.allThreadsStopped = true;
        this.sendEvent(stop);
    }

    private _capabilities: DebugProtocol.Capabilities = {
        /** The debug adapter supports the 'configurationDone' request. */
        supportsConfigurationDoneRequest: true,

        /** The debug adapter supports stepping back via the 'stepBack' and 'reverseContinue' requests. */
        supportsStepBack: false,
        /** The debug adapter supports the 'stepInTargets' request. */
        supportsStepInTargetsRequest: true,
        /** The debug adapter supports the 'gotoTargets' request. */
        supportsGotoTargetsRequest: false,
        /** The debug adapter supports restarting a frame. */
        supportsRestartFrame: false,
        /** The debug adapter supports the 'restart' request. In this case a client should not implement 'restart' by terminating and relaunching the adapter but by calling the RestartRequest. */
        supportsRestartRequest: false,
        /** The debug adapter supports the 'terminate' request. */
        supportsTerminateRequest: true,
        /** The debug adapter supports the 'terminateDebuggee' attribute on the 'disconnect' request. */
        supportTerminateDebuggee: false,
        /** The debug adapter supports the 'terminateThreads' request. */
        supportsTerminateThreadsRequest: false,

        /** The debug adapter supports a (side effect free) evaluate request for data hovers. */
        supportsEvaluateForHovers: true,
        /** The debug adapter supports setting a variable to a value. */
        supportsSetVariable: true,
        /** The debug adapter supports a 'format' attribute on the stackTraceRequest, variablesRequest, and evaluateRequest. */
        supportsValueFormattingOptions: true,

        /** The debug adapter supports the 'completions' request. */
        supportsCompletionsRequest: false,

        /** The debug adapter supports the 'modules' request. */
        supportsModulesRequest: false,
        /** The set of additional module information exposed by the debug adapter. */
        additionalModuleColumns: undefined,

        /** Checksum algorithms supported by the debug adapter. */
        supportedChecksumAlgorithms: undefined,

        /** The debug adapter supports 'exceptionOptions' on the setExceptionBreakpoints request. */
        supportsExceptionOptions: false,
        /** The debug adapter supports the 'exceptionInfo' request. */
        supportsExceptionInfoRequest: false,
        /** The debug adapter supports the delayed loading of parts of the stack, which requires that both the 'startFrame' and 'levels' arguments and the 'totalFrames' result of the 'StackTrace' request are supported. */
        supportsDelayedStackTraceLoading: true,
        /** The debug adapter supports the 'loadedSources' request. */
        supportsLoadedSourcesRequest: false,
        /** The debug adapter supports the 'setExpression' request. */
        supportsSetExpression: false,

        /** The debug adapter supports logpoints by interpreting the 'logMessage' attribute of the SourceBreakpoint. */
        supportsLogPoints: false,
        /** The debug adapter supports conditional breakpoints. */
        supportsConditionalBreakpoints: false,
        /** The debug adapter supports breakpoints that break execution after a specified number of hits. */
        supportsHitConditionalBreakpoints: false,
        /** The debug adapter supports function breakpoints. */
        supportsFunctionBreakpoints: true,
        /** The debug adapter supports data breakpoints. */
        supportsDataBreakpoints: true
    }

	/**
	 * The 'initialize' request is the first request called by the frontend
	 * to interrogate the features the debug adapter provides.
	 */
    protected initializeRequest(response: DebugProtocol.InitializeResponse, args: DebugProtocol.InitializeRequestArguments): void {

        // build and return the capabilities of this debug adapter:
        response.body = Object.assign(response.body || {}, this._capabilities);

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

    private userOutput(line: string) {
        this._writeEmitter.fire(line);
    }

    private userErrorOutput(line: string) {
        this._writeEmitter.fire(line);
    }

    private createTerminal(name: string) {
        this._pty = {
            onDidWrite: this._writeEmitter.event,
            open: () => {},
            close: () => {
                this._jdbShellServer.dispose();
                this._jvmShellServer.dispose();
                this.sendEvent(new TerminatedEvent());
            },
            handleInput: data => {
                if (this._runtime.isRunning()) {
                    this._jvmQueue.sendData(data)
                }
            },
        };
        this._terminal = window.createTerminal(
            {
                name: name,
                pty: this._pty
            });
        this._terminal.show(true);
    }

    protected async launchRequest(response: DebugProtocol.LaunchResponse, args: IJvmLaunchRequestArguments) {

        // make sure to 'Stop' the buffered logging if 'trace' is not set
        logger.setup(args.trace ? Logger.LogLevel.Verbose : Logger.LogLevel.Stop, false);

        response.success = true;
        this.sendResponse(response);

        this._scope = args.scope;

        this.createTerminal(args.class);

        // wait until configuration has finished (and configurationDoneRequest has been called)
        // let reallyDone = false;
        let result = await Promise.race([
                Delay(1000).then(() => true),
                this._configurationDone.acquire().then(() => {
                    // reallyDone = true;
                    this._configurationDone.release();
                    return true;
                 }),
            ]);
        result = result && await this._jdbShellServer.create(this._scope);
        result = result && await this._jvmShellServer.create(this._scope);

        if (!result) {
            this.sendEvent(new TerminatedEvent());
        } else {
            await JvmProjectHelper.chooseScope(this._scope);
            let listeningPort = 5005;
            let listeningPortMax = 5105;
            const portRange = args.port ? args.port : "5005-5105";
            const matchedMinMax = portRange.match(/^\s*(\d+)\s*-\s*(\d+)\s*$/);
            if (matchedMinMax) {
                listeningPort = +matchedMinMax[1];
                listeningPortMax = +matchedMinMax[2];
            } else {
                const matchedPort = portRange.match(/^\s*(\d+)\s*$/);
                if (matchedPort) {
                    listeningPort = +matchedPort[1];
                    listeningPortMax = listeningPort;
                }
            }
            let cdCommand = await JvmProjectHelper.cdRemoteRoot(this._scope);
            await this._jvmQueue.postCommand(cdCommand, (cmd, line) => {
                if (line === undefined || line.includes("\0")) {
                    return ListenerResponse.stop;
                }
                return ListenerResponse.needMoreLines;
            });
            let runComFileCommand = await JvmProjectHelper.runComFile(this._scope);
            await this._jvmQueue.postCommand(runComFileCommand, (cmd, line) => {
                if (line === undefined || line.includes("\0")) {
                    return ListenerResponse.stop;
                }
                return ListenerResponse.needMoreLines;
            });
            let result: jvmStartResult = jvmStartResult.unknown;
            while (listeningPort <= listeningPortMax) {
                result = await this.tryRunJVM(listeningPort, args.class, args.classpath, args.arguments);
                if (result === jvmStartResult.started) {
                    if (args.stopOnEntry) {
                        const bp = await this._runtime.setBreakPoint(await JvmProjectHelper.stopOnEntryClass(args.class, this._scope), "main");
                        if (bp) {
                            this._stopOnEntryBp = bp.breakId;
                        }
                    }
                    args.port = String(listeningPort);
                    this._jvmQueue.onUnexpectedLine((line) => {
                        if (line !== undefined) {
                            this.userOutput(line);
                        }
                    });
                    this._jvmQueue.onErrorLine((line) => {
                        if (line !== undefined) {
                            this.userErrorOutput(line);
                        }
                    });
                    this._runtime.start(args);
                    break;
                } else if (result === jvmStartResult.portIsBusy) {
                    this._logFn(LogType.information, () => localize("jvm.port.busy", "Port {0} is already in use.", String(listeningPort)));
                    ++listeningPort;
                } else {
                    break;
                }
            }
            if (result !== jvmStartResult.started) {
                this.sendEvent(new TerminatedEvent());
            }
        }
    }

    private async tryRunJVM(port: number, jClass: string, jClassPath: string, args?: string) {

        const rgxListening = /Listening for transport dt_socket at address: (\d+)/;
        const rgxPortError = /ERROR: JDWP Transport dt_socket failed to initialize/;

        let result = jvmStartResult.unknown;
        let runCommand = `java -Xdebug -Xrunjdwp:transport=dt_socket,address=${port},server=y,suspend=y -cp ${jClassPath} ${jClass}${args? " " + args : ""}`;
        return this._jvmQueue.postCommand(runCommand, (cmd, line) => {
            if (!line) {
                result = jvmStartResult.error;
                return ListenerResponse.stop;   // go out, general error
            }
            if (result === jvmStartResult.unknown) {
                if (line.match(rgxListening)) {
                    result = jvmStartResult.started;
                    return ListenerResponse.stop;   // go out, no prompt required
                }
                if (line.match(rgxPortError)) {
                    result = jvmStartResult.portIsBusy;
                    return ListenerResponse.needMoreLines;    // wait a prompt
                }
                return ListenerResponse.needMoreLines;        // need more lines
            } else {
                // wait for vms prompt
                if (line.includes("\0")) {
                    return ListenerResponse.stop;
                }
                return ListenerResponse.needMoreLines;
            }
        }).then(() => {
            return result;
        }).catch(() => {
            return jvmStartResult.error;
        });
    }


    protected disconnectRequest(response: DebugProtocol.DisconnectResponse, args: DebugProtocol.DisconnectArguments): void {
        this._jvmShellServer.dispose();
        this._jdbShellServer.dispose();
        response.success = true;
        this.sendResponse(response);
        this.sendEvent(new TerminatedEvent());
    }

    protected terminateRequest(response: DebugProtocol.TerminateResponse, args: DebugProtocol.TerminateArguments): void {
        this._jvmShellServer.dispose();
        this._jdbShellServer.dispose();
        response.success = true;
        this.sendResponse(response);
        this.sendEvent(new TerminatedEvent());
    }

    /**
     * Set DATA breakpoint
     * @param response
     * @param args
     */
    protected setDataBreakpointsRequest(response: DebugProtocol.SetDataBreakpointsResponse, args: DebugProtocol.SetDataBreakpointsArguments) {
        response.body = {
            breakpoints: []
        };

        response.success = false;
        this.sendResponse(response);
    }

    /**
     * Set FUNCTION breakpoint
     * @param response
     * @param args
     */
    protected async setFunctionBreakPointsRequest(response: DebugProtocol.SetFunctionBreakpointsResponse, args: DebugProtocol.SetFunctionBreakpointsArguments) {
        response.body = {
            breakpoints: []
        };

        /** id is a key */
        const newIds = new Map<number, string>();   // id -> name
        for(const bp of args.breakpoints) {
            let added = false;
            const prevId = this._functionBreakPoints.get(bp.name);
            if (prevId) {
                const runtimeBp = await this._runtime.enableBreakPoint(prevId);
                if (runtimeBp) {
                    added = true;
                    newIds.set(runtimeBp.breakId, bp.name);
                    response.body.breakpoints.push({
                        message: `Enabled ${prevId}`,
                        id: runtimeBp.breakId,
                        verified: runtimeBp.verified? true: false
                    });
                }
            } else {
                const fieldInfos = await JvmProjectHelper.findMethods(bp.name);
                if (fieldInfos.length) {
                    const chosen = await window.showQuickPick(fieldInfos.map(method => {
                        return {
                            label: method.class.name + "." + method.name + method.params,
                            method
                        };
                        }));
                    if (chosen) {
                        const fieldInfo = chosen.method;
                        const method = JvmProject.methodForBreakpoint(fieldInfo);
                        const runtimeBp = await this._runtime.setBreakPoint(fieldInfo.class.name, method);
                        if (runtimeBp) {
                            added = true;
                            if (newIds.has(runtimeBp.breakId)) {
                                response.body.breakpoints.push({
                                    message: "On the same place as one of the previous",
                                    id: runtimeBp.breakId,
                                    verified: runtimeBp.verified? true: false
                                });
                            } else {
                                response.body.breakpoints.push({
                                    id: runtimeBp.breakId,
                                    message: fieldInfo.class.name + "." + fieldInfo.name,
                                    source: await this.createSource(fieldInfo.class.file.name),
                                    line: minOf(fieldInfo.lines.values()),
                                    verified: runtimeBp.verified? true: false
                                });
                                newIds.set(runtimeBp.breakId, bp.name);
                            }
                        }
                    }
                }
            }
            if (!added) {
                response.body.breakpoints.push({
                    message: "Cannot find this function",
                    verified: false
                });
            }
        }

        for (const [, id] of this._functionBreakPoints) {
            if (!newIds.has(id)) {
                this._runtime.disableBreakPoint(id);
            }
        }
        this._functionBreakPoints = new Map<string, number>();
        for (const [id, name] of newIds) {
            this._functionBreakPoints.set(name, id);
        }

        response.success = true;
        this.sendResponse(response);
    }

    protected async setBreakPointsRequest(response: DebugProtocol.SetBreakpointsResponse, args: DebugProtocol.SetBreakpointsArguments) {
        response.body = {
            breakpoints: []
        };
        // set and verify breakpoint locations
        const newIds = new Map<number, number>();
        if (args.breakpoints) {
            for (const sourceBp of args.breakpoints) {
                let added = false;
                let [className, lineNumber] = await JvmProjectHelper.getBreakPointByFileLine(args.source.path, sourceBp.line);
                if (className && lineNumber !== undefined) {
                    const runtimeBp = await this._runtime.setBreakPoint(className, lineNumber);
                    if (runtimeBp) {
                        if (newIds.has(runtimeBp.breakId)) {
                            added = true;
                            response.body.breakpoints.push({
                                message: "On the same place as one of the previous",
                                id: runtimeBp.breakId,
                                line: lineNumber,
                                verified: runtimeBp.verified? true: false
                            });
                        } else {
                            added = true;
                            response.body.breakpoints.push({
                                id: runtimeBp.breakId,
                                line: lineNumber,
                                verified: runtimeBp.verified? true: false
                            });
                            newIds.set(runtimeBp.breakId, lineNumber);
                        }
                    }
                }
                if (!added) {
                    response.body.breakpoints.push({
                        message: "No code for this line",
                        verified: false
                    });
                }
            }
        }
        const prevIds = args.source.path?this._breakPoints.get(args.source.path):undefined;
        if (prevIds) {
            for (const [prevId, prevLn] of prevIds) {
                if (!newIds.has(prevId)) {
                    this._runtime.disableBreakPoint(prevId);
                }
            }
        }
        if (args.source.path) {
            this._breakPoints.set(args.source.path, newIds);
        }
        response.success = true;
        this.sendResponse(response);
    }

    protected threadsRequest(response: DebugProtocol.ThreadsResponse): void {
        this._runtime.requestThreads().then(async (threads) => {
            if (this._stopOnEntryBp) {
                await this._runtime.disableBreakPoint(this._stopOnEntryBp);
                this._stopOnEntryBp = 0;
            }
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
                    respThreads.push(new Thread(thread.id, name ? name : String(thread.id)));
                };
            }
            response.body = {
                threads: respThreads
            };
            this._variableHandles.reset();
            response.success = true;
            this.sendResponse(response);
        });
    }

    protected stackTraceRequest(response: DebugProtocol.StackTraceResponse, args: DebugProtocol.StackTraceArguments): void {
        const startFrame = typeof args.startFrame === 'number' ? args.startFrame : 0;
        const maxLevels = typeof args.levels === 'number' ? args.levels : 1000;
        const endFrame = startFrame + maxLevels;

        const stk = this._runtime.requestStack(args.threadId, startFrame, endFrame);

        const wait = [];
        for (const frame of stk.frames) {
            if (frame.file) {
                if (frame.line) {
                    wait.push(this.createSourceByPlace(frame.place).then((source) => {
                        if (!source) {
                            return this.createSource(frame.file);
                        }
                        return source;
                    }));
                } else {
                    wait.push(Promise.resolve(undefined));
                }
            }
        }
        Promise.all(wait).then((sources) => {
            response.body = {
                stackFrames: stk.frames.map((f, i) =>
                    new StackFrame(f.frameId, f.place, sources[i], this.convertDebuggerLineToClient(f.line))),
                totalFrames: stk.totalFrames
            };
            response.success = true;
            this.sendResponse(response);
        });
    }

    protected scopesRequest(response: DebugProtocol.ScopesResponse, args: DebugProtocol.ScopesArguments): void {

        this._runtime.requestScopes(args.frameId).then((scopes) => {
            response.body = {
                scopes: []
            };
            if (scopes) {
                for (const scope of scopes) {
                    response.body.scopes.push({
                        name: scope.name + (scope.value ? `(${scope.value})` : ""),
                        variablesReference: this._variableHandles.create(scope),
                        expensive: scope.vars !== undefined && scope.vars.length > 8
                    });
                }
            }
            response.success = true;
            this.sendResponse(response);
        });
    }

    protected async setVariableRequest(response: DebugProtocol.SetVariableResponse, args: DebugProtocol.SetVariableArguments) {
        const parent = this._variableHandles.get(args.variablesReference);

        response.body = {
            value: args.value,
        };
        ({"success": response.success, "value": response.body.value} = await this._runtime.requestSetVariable(parent, args.name, args.value));

        this.sendResponse(response);
    }

    protected async variablesRequest(response: DebugProtocol.VariablesResponse, args: DebugProtocol.VariablesArguments) {

        const variables = new Array<DebugProtocol.Variable>();
        const jvmVar = this._variableHandles.get(args.variablesReference);

        if (jvmVar.type !== JvmVarType.scope && jvmVar.vars === undefined) {
            await this._runtime.requestVariable(jvmVar, args.start, args.count);
        }
        if (jvmVar.vars) {
            for (const variable of jvmVar.vars) {
                const innerVar: DebugProtocol.Variable = {
                    name: variable.name,
                    value: variable.value? variable.value : "",
                    variablesReference: 0,
                };
                if (variable.type !== undefined) {
                    innerVar.type = JvmVarType[variable.type];
                }
                if (isJvmVarNeedReference(variable)) {
                    innerVar.variablesReference = this._variableHandles.create(variable);
                    if (variable.arraySize !== undefined) {
                        innerVar.indexedVariables = variable.arraySize;
                        if (innerVar.type !== undefined) {
                            innerVar.type += `[${variable.arraySize}]`;
                        }
                    }
                }
                variables.push(innerVar);
            }
        }
        response.body = {
            variables: variables
        };
        response.success = true;
        this.sendResponse(response);
    }

    protected async continueRequest(response: DebugProtocol.ContinueResponse, args: DebugProtocol.ContinueArguments) {
        response.body = {
            allThreadsContinued: true,
        };
        response.success = await this._runtime.cont(args.threadId);
        this.sendResponse(response);
    }

    protected async nextRequest(response: DebugProtocol.NextResponse, args: DebugProtocol.NextArguments) {
        response.success = await this._runtime.next(args.threadId);
        this.sendResponse(response);
    }

    protected async stepInRequest(response: DebugProtocol.StepInResponse, args: DebugProtocol.StepInArguments) {
        response.success = await this._runtime.step(args.threadId);
        this.sendResponse(response);
    }

    protected async stepOutRequest(response: DebugProtocol.StepOutResponse, args: DebugProtocol.StepOutArguments) {
        response.success = await this._runtime.stepOut(args.threadId);
        this.sendResponse(response);
    }

    protected async pauseRequest(response: DebugProtocol.PauseResponse, args: DebugProtocol.PauseArguments) {
        response.success = await this._runtime.pause();
        this.sendResponse(response);
    }

    protected async evaluateRequest(response: DebugProtocol.EvaluateResponse, args: DebugProtocol.EvaluateArguments) {
        switch (args.context) {
            case 'repl':
                if (this._runtime.isDataCommandAllowed()) {
                    response.success = await this._runtime.requestEvaluate(args.expression);
                } else if (this._runtime.isRunning()) {
                    this._jvmQueue.postCommand(args.expression);
                }
                response.body = {
                    result: ``,
                    variablesReference: 0
                };
                break;
            case 'hover':
                break;
            case 'watch':
                break;
        }
        this.sendResponse(response);
    }

    //---- helpers

    private async createSource(filePath: string) {
        return new Source(path.basename(filePath), await JvmProjectHelper.localFile(filePath, this._scope), undefined, undefined, 'jvm-adapter-data');
    }

    private async createSourceByPlace(stackPlace: string) {
        const filePath = await JvmProjectHelper.localFileByPlace(stackPlace, this._scope);
        if (filePath) {
            return new Source(path.basename(filePath), filePath, undefined, undefined, 'jvm-adapter-data');
        }
        return undefined;
    }

}
