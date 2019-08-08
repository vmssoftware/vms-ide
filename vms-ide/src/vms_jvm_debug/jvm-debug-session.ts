import * as nls from "vscode-nls";

import {
    Logger, logger,
    LoggingDebugSession,
    InitializedEvent, TerminatedEvent, StoppedEvent, BreakpointEvent, OutputEvent,
    Thread, StackFrame, Scope, Source, Handles, Breakpoint, Variable
} from 'vscode-debugadapter';

import { DebugProtocol } from 'vscode-debugprotocol';
import * as path from 'path';

import { Lock, Delay, LogFunction, LogType } from '../common/main';

import { JvmShellRuntime, JvmRuntimeEvents, IJvmScope, IJvmVariable, isIJvmScope, isIJvmVariable, isJvmVarNeedReference , getJvmVarArraySize } from './jvm-shell-runtime';
import { IJvmLaunchRequestArguments } from './jvm-config';
import { SshShellServer } from './ssh-shell-server';
import { CmdQueue } from './cmd-queue';
import { JvmProjectHelper } from './jvm-proj-helper';
import { ListenerResponse } from "./communication";

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

    private _variableHandles = new Handles<IJvmScope | IJvmVariable>();

    private _configurationDone = new Lock(true, "configurationDone");

    private _logFn: LogFunction;

    private _breakPoints = new Map<string, Map<number, number>>(); // [file -> id -> line ]
    private _cmdLock = new Lock();

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
        this._runtime.on(JvmRuntimeEvents.stopOnPause, (threadId) => {
            this.sendStoppedEvent('pause', threadId);
        });
        this._runtime.on(JvmRuntimeEvents.breakpointValidated, (id: number, verified: boolean) => {
            for (const [file, ids] of this._breakPoints) {
                const line = ids.get(id);
                if (line) {
                    this.sendEvent(new BreakpointEvent('changed', <DebugProtocol.Breakpoint>{ id, verified, line }));
                    break;
                }
            }
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
            this.sendEvent(new TerminatedEvent());
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
        /** The debug adapter supports function breakpoints. */
        supportsFunctionBreakpoints: false,
        /** The debug adapter supports conditional breakpoints. */
        supportsConditionalBreakpoints: false,
        /** The debug adapter supports breakpoints that break execution after a specified number of hits. */
        supportsHitConditionalBreakpoints: false,
        /** The debug adapter supports a (side effect free) evaluate request for data hovers. */
        supportsEvaluateForHovers: false,
        /** Available filters or options for the setExceptionBreakpoints request. */
        exceptionBreakpointFilters: undefined,
        /** The debug adapter supports stepping back via the 'stepBack' and 'reverseContinue' requests. */
        supportsStepBack: false,
        /** The debug adapter supports setting a variable to a value. */
        supportsSetVariable: false,
        /** The debug adapter supports restarting a frame. */
        supportsRestartFrame: false,
        /** The debug adapter supports the 'gotoTargets' request. */
        supportsGotoTargetsRequest: false,
        /** The debug adapter supports the 'stepInTargets' request. */
        supportsStepInTargetsRequest: true,
        /** The debug adapter supports the 'completions' request. */
        supportsCompletionsRequest: false,
        /** The debug adapter supports the 'modules' request. */
        supportsModulesRequest: false,
        /** The set of additional module information exposed by the debug adapter. */
        additionalModuleColumns: undefined,
        /** Checksum algorithms supported by the debug adapter. */
        supportedChecksumAlgorithms: undefined,
        /** The debug adapter supports the 'restart' request. In this case a client should not implement 'restart' by terminating and relaunching the adapter but by calling the RestartRequest. */
        supportsRestartRequest: false,
        /** The debug adapter supports 'exceptionOptions' on the setExceptionBreakpoints request. */
        supportsExceptionOptions: false,
        /** The debug adapter supports a 'format' attribute on the stackTraceRequest, variablesRequest, and evaluateRequest. */
        supportsValueFormattingOptions: false,
        /** The debug adapter supports the 'exceptionInfo' request. */
        supportsExceptionInfoRequest: false,
        /** The debug adapter supports the 'terminateDebuggee' attribute on the 'disconnect' request. */
        supportTerminateDebuggee: true,
        /** The debug adapter supports the delayed loading of parts of the stack, which requires that both the 'startFrame' and 'levels' arguments and the 'totalFrames' result of the 'StackTrace' request are supported. */
        supportsDelayedStackTraceLoading: true,
        /** The debug adapter supports the 'loadedSources' request. */
        supportsLoadedSourcesRequest: false,
        /** The debug adapter supports logpoints by interpreting the 'logMessage' attribute of the SourceBreakpoint. */
        supportsLogPoints: false,
        /** The debug adapter supports the 'terminateThreads' request. */
        supportsTerminateThreadsRequest: false,
        /** The debug adapter supports the 'setExpression' request. */
        supportsSetExpression: false,
        /** The debug adapter supports the 'terminate' request. */
        supportsTerminateRequest: true,
        /** The debug adapter supports data breakpoints. */
        supportsDataBreakpoints: false
    }

	/**
	 * The 'initialize' request is the first request called by the frontend
	 * to interrogate the features the debug adapter provides.
	 */
    protected initializeRequest(response: DebugProtocol.InitializeResponse, args: DebugProtocol.InitializeRequestArguments): void {

        // build and return the capabilities of this debug adapter:
        response.body = response.body || this._capabilities;

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

        this.sendResponse(response);

        this._scope = args.scope;

        // wait until configuration has finished (and configurationDoneRequest has been called)
        let reallyDone = false;
        const results = await Promise.all([
            Promise.race([
                Delay(1000).then(() => true),
                this._configurationDone.acquire().then(() => { 
                    reallyDone = true;
                    return true;
                 }),
            ]),
            this._jdbShellServer.create(this._scope),
            this._jvmShellServer.create(this._scope),
            JvmProjectHelper.chooseScope(this._scope).then(() => true),
        ]);

        if (!results.reduce((result, current) => result && current, true)) {
            this.sendEvent(new TerminatedEvent());
        } else {
            let listeningPort = 5005;
            let listeningPortMax = 5105;
            const diapason = args.port ? args.port : "5005-5105";
            const matchedMinMax = diapason.match(/^\s*(\d+)\s*-\s*(\d+)\s*$/);
            if (matchedMinMax) {
                listeningPort = +matchedMinMax[1];
                listeningPortMax = +matchedMinMax[2];
            } else {
                const matchedPort = diapason.match(/^\s*(\d+)\s*$/);
                if (matchedPort) {
                    listeningPort = +matchedPort[1];
                    listeningPortMax = listeningPort;
                }
            }
            let cdCommand = await JvmProjectHelper.cdRemoteRoot(this._scope);
            this._jvmQueue.postCommand(cdCommand, (cmd, line) => {
                if (line === undefined || line.includes("\0")) {
                    return ListenerResponse.stop;
                }
                return ListenerResponse.needMoreLines;
            }).then(async () => {
                while (listeningPort <= listeningPortMax) {
                    let result = await this.tryRunJVM(listeningPort, args.class, args.classpath);
                    if (result === jvmStartResult.started) {
                        if (args.stopOnEntry) {
                            await this._runtime.setBreakPoint(await JvmProjectHelper.stopOnEntryClass(args.class, this._scope), "main");
                        }
                        args.port = String(listeningPort);
                        this._jvmQueue.onUnexpectedLine((line) => {
                            if (line) {
                                this._logFn(LogType.information, () => String(line));
                            }
                        });
                        return this._runtime.start(args);
                    } else if (result === jvmStartResult.portIsBusy) {
                        this._logFn(LogType.information, () => localize("jvm.port.busy", "Port {0} is busy.", String(listeningPort)));
                        ++listeningPort;
                    } else {
                        break;
                    }
                }
                this.sendEvent(new TerminatedEvent());
                return false;
            });
        }
    }

    private async tryRunJVM(port: number, jClass: string, jClassPath: string) {

        const rgxListening = /Listening for transport dt_socket at address: (\d+)/;
        const rgxPortError = /ERROR: JDWP Transport dt_socket failed to initialize/;

        let result = jvmStartResult.unknown;
        let runCommand = `java -Xdebug -Xrunjdwp:transport=dt_socket,address=${port},server=y,suspend=y -cp ${jClassPath} ${jClass}`;
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
        this.sendResponse(response);
    }

    protected terminateRequest(response: DebugProtocol.TerminateResponse, args: DebugProtocol.TerminateArguments): void {
        this._jvmShellServer.dispose();
        this._jdbShellServer.dispose();
        this.sendResponse(response);
    }

    protected setBreakPointsRequest(response: DebugProtocol.SetBreakpointsResponse, args: DebugProtocol.SetBreakpointsArguments): void {
        this._cmdLock.acquire().then(async () => {
            response.body = {
                breakpoints: []
            };
            // set and verify breakpoint locations
            const newIds = new Map<number, number>();
            if (args.breakpoints) {
                for (const sourceBp of args.breakpoints) {
                    let [className, lineNumber] = await JvmProjectHelper.getBreakPointByFileLine(args.source.path, sourceBp.line);
                    if (className && lineNumber !== undefined) {
                        const runtimeBp = await this._runtime.setBreakPoint(className, lineNumber);
                        if (newIds.has(runtimeBp.breakId)) {
                            response.body.breakpoints.push({
                                message: "On the same place as one of the previous",
                                id: runtimeBp.breakId,
                                line: lineNumber,
                                verified: runtimeBp.verified? true: false
                            });    
                        } else {
                            response.body.breakpoints.push({
                                id: runtimeBp.breakId,
                                line: lineNumber,
                                verified: runtimeBp.verified? true: false
                            });
                            newIds.set(runtimeBp.breakId, lineNumber);
                        }
                    } else {
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
                        this._runtime.clearBreakPointByID(prevId);
                    }
                }
            }
            if (args.source.path) {
                this._breakPoints.set(args.source.path, newIds);
            }
            this.sendResponse(response);
            this._cmdLock.release();
        });
    }

    protected threadsRequest(response: DebugProtocol.ThreadsResponse): void {
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
                    respThreads.push(new Thread(thread.id, name ? name : String(thread.id)));
                };
            }
            response.body = {
                threads: respThreads
            };
            this._variableHandles.reset();
            this.sendResponse(response);
        });
    }

    protected stackTraceRequest(response: DebugProtocol.StackTraceResponse, args: DebugProtocol.StackTraceArguments): void {
        const startFrame = typeof args.startFrame === 'number' ? args.startFrame : 0;
        const maxLevels = typeof args.levels === 'number' ? args.levels : 1000;
        const endFrame = startFrame + maxLevels;

        const stk = this._runtime.stack(args.threadId, startFrame, endFrame);

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
            this.sendResponse(response);
        });
    }

    protected scopesRequest(response: DebugProtocol.ScopesResponse, args: DebugProtocol.ScopesArguments): void {

        this._runtime.getScopes(args.frameId).then((scopes) => {
            response.body = {
                scopes: []
            };
            if (scopes) {
                for (const scope of scopes) {
                    response.body.scopes.push({
                        name: scope.name,
                        variablesReference: this._variableHandles.create(scope),
                        expensive: scope.vars.length > 8
                    });
                }
            }    
            this.sendResponse(response);    
        });

    }

    protected async variablesRequest(response: DebugProtocol.VariablesResponse, args: DebugProtocol.VariablesArguments) {

        const variables = new Array<DebugProtocol.Variable>();
        const scopeOrVar = this._variableHandles.get(args.variablesReference);

        if (isIJvmVariable(scopeOrVar) && scopeOrVar.vars === undefined) {
            await this._runtime.dumpVariable(scopeOrVar, args.start, args.count);
        }
        if (scopeOrVar.vars) {
            for (const variable of scopeOrVar.vars) {
                const innerVar: DebugProtocol.Variable = {
                    name: variable.name,
                    value: variable.value,
                    variablesReference: 0,
                };
                if (isJvmVarNeedReference(variable)) { 
                    innerVar.variablesReference = this._variableHandles.create(variable);
                    const sizeVar = getJvmVarArraySize(variable);
                    if (sizeVar >= 0) {
                        innerVar.indexedVariables = sizeVar;
                    }
                }
                variables.push(innerVar);
            }
        }
        response.body = {
            variables: variables
        };
        this.sendResponse(response);
    }

    protected continueRequest(response: DebugProtocol.ContinueResponse, args: DebugProtocol.ContinueArguments): void {
        response.body = {
            allThreadsContinued: true,
        };
        this.sendResponse(response);
        if (!this._runtime.continue(args.threadId)) {
            this.sendStoppedEvent('error');
        }
    }

    protected nextRequest(response: DebugProtocol.NextResponse, args: DebugProtocol.NextArguments): void {
        this.sendResponse(response);
        if (!this._runtime.next(args.threadId)) {
            this.sendStoppedEvent('error');
        }
    }

    protected stepInRequest(response: DebugProtocol.StepInResponse, args: DebugProtocol.StepInArguments): void {
        this.sendResponse(response);
        if (!this._runtime.step(args.threadId)) {
            this.sendStoppedEvent('error');
        }
    }

    protected stepOutRequest(response: DebugProtocol.StepOutResponse, args: DebugProtocol.StepOutArguments): void {
        this.sendResponse(response);
        if (!this._runtime.stepOut(args.threadId)) {
            this.sendStoppedEvent('error');
        }
    }

    protected pauseRequest(response: DebugProtocol.PauseResponse, args: DebugProtocol.PauseArguments): void {
        this._runtime.pause();
        this.sendResponse(response);
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
