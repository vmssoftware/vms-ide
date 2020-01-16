import {
    LoggingDebugSession,
    StoppedEvent,
    InitializedEvent,
    OutputEvent,
    TerminatedEvent,
    Logger,
    logger,
    BreakpointEvent,
    Thread,
    StackFrame,
    Source,
    Handles,
    Scope
} from "vscode-debugadapter";
import { DebugProtocol } from 'vscode-debugprotocol';
import * as nls from "vscode-nls";

import { LogFunction, Lock, Delay, ftpPathSeparator, LogType } from "../common/main";
import { SshShellServer } from "../vms_jvm_debug/ssh-shell-server";
import { CmdQueue } from "../vms_jvm_debug/cmd-queue";
import { IPythonLaunchRequestArguments } from "./debugConfig";
import { ListenerResponse } from "../vms_jvm_debug/communication";
import { commands, workspace } from "vscode";
import { ensureSettings } from "../synchronizer/ensure-settings";
import { VmsPathConverter } from "../synchronizer/vms/vms-path-converter";
import { PythonShellRuntime, PythonRuntimeEvents, IPythonVariable } from "./runtime";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export enum EStartResult {
    unknown,
    started,
    portIsBusy,
    error,
};

export class PythonDebugSession extends LoggingDebugSession {

    private _logFn: LogFunction;

    private _scope?: string;

    private _serverShellServer: SshShellServer;
    private _serverQueue: CmdQueue;
    private _tracerShellServer: SshShellServer;
    private _tracerQueue: CmdQueue;

    private _configurationDone = new Lock(true, "configurationDone");

    private _runtime: PythonShellRuntime;

    private _variableHandles = new Handles<IPythonVariable>();
    
    constructor(logFn?: LogFunction) {
        super("vms-python-debugger.txt");
        this._logFn = logFn || (() => { });
        this.setDebuggerLinesStartAt1(true);
        this.setDebuggerColumnsStartAt1(true);

        this._serverShellServer = new SshShellServer(this._logFn);
        this._serverQueue = new CmdQueue(this._serverShellServer);

        this._tracerShellServer = new SshShellServer(this._logFn);
        this._tracerQueue = new CmdQueue(this._tracerShellServer);
        this._tracerQueue.onUnexpectedLine((line) => this.userOutput(line));

        this._runtime = new PythonShellRuntime(this._serverQueue, this._logFn);
        
        // setup event handlers
        
        this._runtime.on(PythonRuntimeEvents.stopOnEntry, (threadId) => {
            this.sendStoppedEvent('entry', threadId);
        });
        
        this._runtime.on(PythonRuntimeEvents.stopOnStep, (threadId) => {
            this.sendStoppedEvent('step', threadId);
        });
        
        this._runtime.on(PythonRuntimeEvents.stopOnBreakpoint, (threadId) => {
            this.sendStoppedEvent('breakpont', threadId);
        });
        
        this._runtime.on(PythonRuntimeEvents.stopOnException, (threadId) => {
            this.sendStoppedEvent('exception', threadId);
        });
        
        this._runtime.on(PythonRuntimeEvents.stopOnBreakpointError, (threadId) => {
            this.sendStoppedEvent('breakpoint error', threadId);
        });
        
        this._runtime.on(PythonRuntimeEvents.stopOnPause, (threadId) => {
            this.sendStoppedEvent('pause', threadId);
        });
        
        this._runtime.on(PythonRuntimeEvents.stopOnDataChange, (threadId) => {
            this.sendStoppedEvent('data change', threadId);
        });
        
        this._runtime.on(PythonRuntimeEvents.stopOnDataAccess, (threadId) => {
            this.sendStoppedEvent('data access', threadId);
        });
        
        this._runtime.on(PythonRuntimeEvents.breakpointValidated, (file: string, line: number) => {
            // for (const [file, ids] of this._breakPoints) {
            //     const line = ids.get(id);
            //     if (line) {
            //         this.sendEvent(new BreakpointEvent('changed', <DebugProtocol.Breakpoint>{ id, verified, line }));
            //         return;
            //     }
            // }
            // // for function breakpoint
            // this.sendEvent(new BreakpointEvent('changed', <DebugProtocol.Breakpoint>{ id, verified }));
        });

        this._runtime.on(PythonRuntimeEvents.output, async (text, filePath?, line?, column?) => {
            const e: DebugProtocol.OutputEvent = new OutputEvent(`${text}\n`);
            if (filePath) {
                e.body.line = this.convertDebuggerLineToClient(line);
                e.body.column = this.convertDebuggerColumnToClient(column);
            }
            this.sendEvent(e);
        });
        
        this._runtime.on(PythonRuntimeEvents.end, () => {
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
        supportsConditionalBreakpoints: true,
        /** The debug adapter supports breakpoints that break execution after a specified number of hits. */
        supportsHitConditionalBreakpoints: true,
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
        response.body = Object.assign(response.body, this._capabilities);

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

    private userOutput(line?: string) {
        if (line) {
            const e: DebugProtocol.OutputEvent = new OutputEvent(line, 'stdout');
            this.sendEvent(e);
        }
    }

    private userErrorOutput(line?: string) {
        if (line) {
            const e: DebugProtocol.OutputEvent = new OutputEvent(line, 'stderr');
            this.sendEvent(e);
        }
    }

    protected disconnectRequest(response: DebugProtocol.DisconnectResponse, args: DebugProtocol.DisconnectArguments): void {
        this._serverShellServer.dispose();
        this._tracerShellServer.dispose();
        response.success = true;
        this.sendResponse(response);
        this.sendEvent(new TerminatedEvent());
    }

    protected terminateRequest(response: DebugProtocol.TerminateResponse, args: DebugProtocol.TerminateArguments): void {
        this._serverShellServer.dispose();
        this._tracerShellServer.dispose();
        response.success = true;
        this.sendResponse(response);
        this.sendEvent(new TerminatedEvent());
    }

    protected async launchRequest(response: DebugProtocol.LaunchResponse, args: IPythonLaunchRequestArguments) {

        // make sure to 'Stop' the buffered logging if 'trace' is not set
        logger.setup(Logger.LogLevel.Stop, false);

        response.success = true;
        this.sendResponse(response);

        this._scope = args.scope;

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
        result = result && await this._serverShellServer.create(this._scope);
        result = result && await this._tracerShellServer.create(this._scope);

        if (!result) {
            this.sendEvent(new TerminatedEvent());
        } else {
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
            let cdCommand = await this.cdRemoteRoot(this._scope);
            this._serverQueue.postCommand(cdCommand, (cmd, line) => {
                if (line === undefined || line.includes("\0")) {
                    return ListenerResponse.stop;
                }
                return ListenerResponse.needMoreLines;
            }).then(async () => {
                while (listeningPort <= listeningPortMax) {
                    let result = await this.tryRunServer(listeningPort);
                    if (result === EStartResult.started) {
                        this._tracerQueue.postCommand(cdCommand, (cmd, line) => {
                            if (line === undefined || line.includes("\0")) {
                                return ListenerResponse.stop;
                            }
                            return ListenerResponse.needMoreLines;
                        }).then(async () => {
                            let relPath = workspace.asRelativePath(args.script);
                            this.runTracer(listeningPort, relPath, args.arguments);
                        });
                        return this._runtime.start();
                    } else if (result === EStartResult.portIsBusy) {
                        this._logFn(LogType.information, () => localize("port.busy", "Port {0} is busy.", String(listeningPort)));
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
    
    protected threadsRequest(response: DebugProtocol.ThreadsResponse): void {
        this._runtime.threadsRequest().then(async (threads) => {
            const respThreads: DebugProtocol.Thread[] = [];
            if (threads && threads.length > 0) {
                for (const thread of threads) {
                    respThreads.push(new Thread(thread.id, String(thread.id)));
                };
                response.success = true;
            }
            response.body = {
                threads: respThreads
            };
            // this._variableHandles.reset();
            this.sendResponse(response);
        });
    }

    protected stackTraceRequest(response: DebugProtocol.StackTraceResponse, args: DebugProtocol.StackTraceArguments): void {
        const startFrame = typeof args.startFrame === 'number' ? args.startFrame : 0;
        const maxLevels = typeof args.levels === 'number' ? args.levels : 1000;
        const endFrame = startFrame + maxLevels;

        this._runtime.framesRequest(args.threadId, startFrame, endFrame).then((frames) => {
            
            response.body = {
                stackFrames: frames.map((frame, index) =>
                    new StackFrame(startFrame + index, String(startFrame + index), new Source(frame.file), this.convertDebuggerLineToClient(frame.line))),
                totalFrames: this._runtime.threadsCollected().find(x => x.id == args.threadId)?.framesNum
            };
            response.success = true;
            this.sendResponse(response);
        });
    }

    protected scopesRequest(response: DebugProtocol.ScopesResponse, args: DebugProtocol.ScopesArguments): void {
        response.body = {
            scopes: []
        };
        const localScope: IPythonVariable = {
            name: 'locals',
            varId: 1,
        }
        response.body.scopes.push({
            name: localScope.name,
            variablesReference: this._variableHandles.create(localScope),
            expensive: localScope.vars !== undefined && localScope.vars.length > 8
        });
        response.success = true;
        this.sendResponse(response);
    }

    protected async variablesRequest(response: DebugProtocol.VariablesResponse, args: DebugProtocol.VariablesArguments) {

        // const variables = new Array<DebugProtocol.Variable>();
        // const parentVar = this._variableHandles.get(args.variablesReference);

        const innerVar: DebugProtocol.Variable = {
            name: 'test',
            value: '1',
            variablesReference: 0,
        };
        response.body = {
            variables: [innerVar]
        };
        response.success = true;
        this.sendResponse(response);
    }

    protected async continueRequest(response: DebugProtocol.ContinueResponse, args: DebugProtocol.ContinueArguments) {
        response.body = {
            allThreadsContinued: true,
        };
        response.success = await this._runtime.continueRequest();
        this.sendResponse(response);
    }

    protected async nextRequest(response: DebugProtocol.NextResponse, args: DebugProtocol.NextArguments) {
        response.success = await this._runtime.nextRequest();
        this.sendResponse(response);
    }

    protected async stepInRequest(response: DebugProtocol.StepInResponse, args: DebugProtocol.StepInArguments) {
        response.success = await this._runtime.stepInRequest();
        this.sendResponse(response);
    }

    protected async stepOutRequest(response: DebugProtocol.StepOutResponse, args: DebugProtocol.StepOutArguments) {
        response.success = await this._runtime.stepOutRequest();
        this.sendResponse(response);
    }

    protected async pauseRequest(response: DebugProtocol.PauseResponse, args: DebugProtocol.PauseArguments) {
        response.success = await this._runtime.pauseRequest();
        this.sendResponse(response);
    }

    ///
    ///     private
    ///

    private async tryRunServer(port: number) {

        const rgxListening = /listening port (\d+)/;
        const rgxPortError = /port (\d+) is busy/;
        const rgxMsg = /^((%|-)(\S+)-(\S)-(\S*)),\s(.*)/;

        let result = EStartResult.unknown;
        let runCommand = `python server.py -p ${port}`;
        const lines: string[] = [];
        return this._serverQueue.postCommand(runCommand, (cmd, line) => {
            if (!line) {
                result = EStartResult.error;
                return ListenerResponse.stop;   // go out, general error
            }
            lines.push(line);
            if (result === EStartResult.unknown) {
                if (line.match(rgxListening)) {
                    result = EStartResult.started;
                    return ListenerResponse.stop;   // go out, no prompt required
                }
                if (line.match(rgxPortError)) {
                    result = EStartResult.portIsBusy;
                    return ListenerResponse.needMoreLines;    // wait a prompt
                }
                if (line.match(rgxMsg)) {
                    result = EStartResult.error;
                    this._logFn(LogType.information, () => lines.join(''));
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
            return EStartResult.error;
        });
    }

    private async runTracer(port: number, script: string, args?: string) {
        let result = EStartResult.unknown;
        let runCommand = `python tracer.py -p ${port} ${script}${args?' ' + args : ''}`;
        return this._tracerQueue.postCommand(runCommand, (cmd, line) => {
            if (!line) {
                result = EStartResult.error;
                return ListenerResponse.stop;   // go out, general error
            }
            result = EStartResult.started;
            return ListenerResponse.stop;       // go out, no prompt required
        }).then(() => {
            return result;
        }).catch(() => {
            return EStartResult.error;
        });
    }

    public async cdRemoteRoot(scope?: string) {
        if (!scope) {
            scope = await commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const ensured = await ensureSettings(scope);
            if (ensured) {
                const vmsPath = new VmsPathConverter(ensured.projectSection.root + ftpPathSeparator);
                return `set def ${vmsPath.directory}`;
            }
        }
        return "";
    }
}