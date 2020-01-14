import {
    LoggingDebugSession,
    StoppedEvent,
    InitializedEvent,
    OutputEvent,
    TerminatedEvent
} from "vscode-debugadapter";
import { DebugProtocol } from 'vscode-debugprotocol';

import { LogFunction, Lock } from "../common/main";
import { SshShellServer } from "../vms_jvm_debug/ssh-shell-server";
import { CmdQueue } from "../vms_jvm_debug/cmd-queue";

export class PythonDebugSession extends LoggingDebugSession {

    private _logFn: LogFunction;

    private _serverShellServer: SshShellServer;
    private _tracerShellServer: SshShellServer;
    private _tracerQueue: CmdQueue;

    private _configurationDone = new Lock(true, "configurationDone");
    
    constructor(logFn?: LogFunction) {
        super("vms-python-debugger.txt");
        this._logFn = logFn || (() => { });
        this.setDebuggerLinesStartAt1(true);
        this.setDebuggerColumnsStartAt1(true);

        this._serverShellServer = new SshShellServer(this._logFn);
        this._tracerShellServer = new SshShellServer(this._logFn);
        this._tracerQueue = new CmdQueue(this._serverShellServer);

        // TODO: create and setup runtime
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

    private userOutput(line: string) {
        const e: DebugProtocol.OutputEvent = new OutputEvent(line, 'stdout');
        this.sendEvent(e);
    }

    private userErrorOutput(line: string) {
        const e: DebugProtocol.OutputEvent = new OutputEvent(line, 'stderr');
        this.sendEvent(e);
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

}