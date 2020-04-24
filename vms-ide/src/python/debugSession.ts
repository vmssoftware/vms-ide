import * as path from 'path';
import {
    BreakpointEvent,
    Handles,
    InitializedEvent,
    Logger,
    LoggingDebugSession,
    OutputEvent,
    Source,
    StackFrame,
    StoppedEvent,
    TerminatedEvent,
    Thread,
    logger,
} from "vscode-debugadapter";
import { DebugProtocol } from 'vscode-debugprotocol';
import * as nls from "vscode-nls";

import { LogFunction, Lock, Delay, ftpPathSeparator, LogType } from "../common/main";
import { SshShellServer } from "../vms_jvm_debug/ssh-shell-server";
import { CmdQueue } from "../vms_jvm_debug/cmd-queue";
import { IPythonLaunchRequestArguments } from "./debugConfig";
import { ListenerResponse } from "../vms_jvm_debug/communication";
import { commands, workspace, WorkspaceFolder, extensions } from "vscode";
import { ensureSettings } from "../synchronizer/ensure-settings";
import { VmsPathConverter } from "../synchronizer/vms/vms-path-converter";
import { 
    EPythonConst,
    IPythonFrame,
    IPythonVariable,
    PythonRuntimeEvents,
    PythonShellRuntime,
    rgxEsc,
} from "./runtime";
import { GetSshHelperType } from '../ext-api/ext-api';
import { FsSource } from '../synchronizer/sync/fs-source';
import { SftpSource } from '../synchronizer/sync/sftp-source';
import { Synchronizer } from '../synchronizer/sync/synchronizer';
import { middleSepRg } from '../synchronizer/common/find-files';

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

interface GotoTarget {
    /** Unique identifier for a goto target. This is used in the goto request. */
    id: number;
    /** The name of the goto target (shown in the UI). */
    label: string;
    /** The line of the goto target. */
    line: number;
    /** An optional column of the goto target. */
    column?: number;
    /** An optional end line of the range covered by the goto target. */
    endLine?: number;
    /** An optional end column of the range covered by the goto target. */
    endColumn?: number;
    /** Optional memory reference for the instruction pointer value represented by this target. */
    instructionPointerReference?: string;
}

export enum EStartResult {
    unknown,
    started,
    portIsBusy,
    error,
};

interface IBreakPoint {
    id: number;
    verified: boolean;
    sent: boolean;
    real_line: number;
};

export class PythonDebugSession extends LoggingDebugSession {

    private _logFn: LogFunction;

    private _workspace?: WorkspaceFolder;

    private _serverShellServer: SshShellServer;
    private _serverQueue: CmdQueue;
    private _tracerShellServer: SshShellServer;
    private _tracerQueue: CmdQueue;

    private _configurationDone = new Lock(true, "configurationDone");

    private _runtime: PythonShellRuntime;

    private _variableHandles = new Handles<IPythonVariable>();
    private _frameHandles = new Handles<IPythonFrame>();
    private _breakPoints = new Map<string, Map<number, IBreakPoint>>();  // file->line->BP
    private _nextBp = 0;

    private _gotoHandles = new Handles<GotoTarget>();

    private _rootMap = new Map<string, string>();
    
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
            for (let [file, bplines] of this._breakPoints) {
                for (let [line, ibp] of bplines) {
                    if (!ibp.sent) {
                        this._runtime.setBreakPoint(file, ibp.real_line).then((ok) => {
                            ibp.sent = ok;
                        });
                    }
                }
            }
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
        
        this._runtime.on(PythonRuntimeEvents.breakpointValidated, (file: string, line: number, line_real?: number) => {
            let lines = this._breakPoints.get(file);
            if (lines === undefined) {
                file = file.toLowerCase();
                for (let [key, value] of this._breakPoints.entries()) {
                    if (key.toLowerCase() == file) {
                        lines = value;
                        break;
                    }
                }
            }
            if (lines) {
                const breakpoint = lines.get(line);
                if (breakpoint) {
                    breakpoint.verified = true;
                    breakpoint.real_line = line_real? line_real: line;
                    this.sendEvent(new BreakpointEvent('changed', <DebugProtocol.Breakpoint>{ 
                        id: breakpoint.id,
                        verified: breakpoint.verified,
                        line: breakpoint.real_line
                    }));
                }
            }
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
        supportsGotoTargetsRequest: true,
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
        supportsEvaluateForHovers: false,
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
        supportsFunctionBreakpoints: false,
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
            line = line.replace(rgxEsc, '');
            if (line) {
                const e: DebugProtocol.OutputEvent = new OutputEvent(line, 'stdout');
                this.sendEvent(e);
            }
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
        //logger.setup(Logger.LogLevel.Verbose, false);

        this._rootMap = new Map<string, string>();
        const config = workspace.getConfiguration("vmssoftware.vms_python_debug", null);
        const root = config.get<object>("roots");
        if (root) {
            for(const [key, value] of Object.entries(root)) {
                if (typeof(key) === "string" && typeof(value) === "string") {
                    this._rootMap.set(key, value);
                }
            }
        }

        response.success = true;
        this.sendResponse(response);

        this._workspace = args.workspace;

        // wait until configuration has finished (and configurationDoneRequest has been called)
        // let reallyDone = false;
        let tasks = [
            Promise.race([
                Delay(1000).then(() => true),
                this._configurationDone.acquire().then(() => { 
                    // reallyDone = true;
                    this._configurationDone.release();
                    return true;
                 }),
            ]),
            this._serverShellServer.create(this._workspace.name),
            this._tracerShellServer.create(this._workspace.name),
            this.testScripts()
        ];

        let result = (await Promise.all(tasks)).reduce((acc, x) => acc && x, true );

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
            let cdCommand = await this.changeDirCmd(this._workspace.name);
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
            this.sendResponse(response);
        });
    }

    protected frameSource(frame: IPythonFrame) {
        let framePath = frame.file;
        if (framePath.startsWith('/')) {
            for (const [key, value] of this._rootMap) {
                if (framePath.toLowerCase().startsWith(key.toLowerCase())) {
                    framePath = value + framePath.substring(key.length);
                    break;
                }
            }
        } else {
            if (this._workspace) {
                framePath = path.join(this._workspace.uri.fsPath, framePath);
            }
        }
        return new Source(frame.file, framePath);
    }

    protected stackTraceRequest(response: DebugProtocol.StackTraceResponse, args: DebugProtocol.StackTraceArguments): void {
        const startFrame = typeof args.startFrame === 'number' ? args.startFrame : 0;
        const maxLevels = typeof args.levels === 'number' ? args.levels : 1000;
        const endFrame = startFrame + maxLevels;

        this._runtime.framesRequest(args.threadId, startFrame, endFrame).then((frames) => {
            response.body = {
                stackFrames: frames.map((frame) => {
                    const idx = this._frameHandles.create(frame);
                    return new StackFrame(idx, frame.function, this.frameSource(frame), this.convertDebuggerLineToClient(frame.line));
                }),
                totalFrames: this._runtime.threadsCollected()?.find(x => x.id == args.threadId)?.framesNum
            };
            response.success = true;
            this.sendResponse(response);
        });
    }

    protected scopesRequest(response: DebugProtocol.ScopesResponse, args: DebugProtocol.ScopesArguments): void {
        response.body = {
            scopes: []
        };
        const frame = this._frameHandles.get(args.frameId);
        const localScope: IPythonVariable = {
            ident: frame.ident,
            frame: frame.frame,
            name: '',                   // used in variable request, leave it empty
            type: EPythonConst.locals,
        };
        response.body.scopes.push({
            name: EPythonConst.locals,
            variablesReference: this._variableHandles.create(localScope),
            expensive: true
        });
        response.success = true;
        this.sendResponse(response);
    }

    public static buildFullName(path: string | undefined, name: string) {
        return (path ? path + (name.startsWith('[') ? '' : '.') : '') + name;
    }

    public static encodeNames(variable: IPythonVariable): string {
        if (variable.parent) {
            let encodedName = this.encodeNames(variable.parent);
            if (variable.parent.type == 'dict') {
                let idx = variable.name.substring(1, variable.name.length - 1);
                let buf = Buffer.from(idx, 'utf-8');
                let encoded = buf.toString('base64');
                return encodedName + '[' + encoded + ']';
            }
            return this.buildFullName(encodedName, variable.name);
        }
        return variable.name;
    }

    protected async variablesRequest(response: DebugProtocol.VariablesResponse, args: DebugProtocol.VariablesArguments) {

        let variables: DebugProtocol.Variable[] = [];
        let parentVar = this._variableHandles.get(args.variablesReference);
        if (parentVar !== undefined) {
            // build full name like <path.name> or <path[name]> or just <name>
            let encodedName = PythonDebugSession.encodeNames(parentVar);
            let vars = await this._runtime.variableRequest(
                parentVar.ident,
                parentVar.frame,
                encodedName,
                args.start,
                args.count,
                args.format?.hex);
            for(let localVar of vars) {
                if (!localVar.name.startsWith("__")) {
                    localVar.parent = parentVar;
                    const innerVar: DebugProtocol.Variable = {
                        name: localVar.name,
                        type: localVar.type,
                        value: '',
                        variablesReference: 0,
                    };
                    if (localVar.value !== undefined) {
                        innerVar.value = localVar.value;
                    } else {
                        innerVar.variablesReference = this._variableHandles.create(localVar);
                        if (localVar.size !== undefined) {
                            innerVar.indexedVariables = localVar.size;
                            innerVar.value = `${innerVar.type}[${innerVar.indexedVariables}]`;
                        }
                    }
                    variables.push(innerVar);
                }
            }
        }
        response.body = {
            variables
        };
        response.success = true;
        this.sendResponse(response);
    }

    protected async setVariableRequest(response: DebugProtocol.SetVariableResponse, args: DebugProtocol.SetVariableArguments) {
        const parent = this._variableHandles.get(args.variablesReference);

        response.body = {
            value: args.value,
        };

        // encodeNames requires 'parent' and 'name' only
        let tmpVar: IPythonVariable = {
            frame: parent.frame,
            ident: parent.ident,
            name: args.name,
            type: '',
            parent: parent,
        };
        let encodedName = PythonDebugSession.encodeNames(tmpVar);
        let result = await this._runtime.requestSetVariable(parent.ident, parent.frame, encodedName, args.value);
        if (result.success && result.type) {
            response.success = result.success;
            response.body.type = result.type;
            if (result.value !== undefined) {
                response.body.variablesReference = 0;
                response.body.value = result.value;
            } else {
                tmpVar.type = result.type;
                response.body.variablesReference = this._variableHandles.create(tmpVar);
                if (result.size !== undefined) {
                    response.body.indexedVariables = result.size;
                    response.body.value = `${result.type}[${result.size}]`;
                } else {
                    response.body.value = '';
                }
            }
        } else {
            response.success = false;
            response.body.value = args.value;
        }

        this.sendResponse(response);
    }

    protected async setBreakPointsRequest(response: DebugProtocol.SetBreakpointsResponse, args: DebugProtocol.SetBreakpointsArguments) {
        response.body = {
            breakpoints: []
        };
        // set and verify breakpoint locations
        if (args.breakpoints && args.source.path) {
            let fileName = workspace.asRelativePath(args.source.path);
            for (const [key, value] of this._rootMap) {
                if (fileName.toLowerCase().startsWith(value.toLowerCase())) {
                    fileName = (key + fileName.substring(value.length)).replace(middleSepRg, ftpPathSeparator);
                    break;
                }
            }
            let lines = this._breakPoints.get(fileName);
            if (lines === undefined) {
                fileName = fileName.toLowerCase();
                for (let [key, value] of this._breakPoints.entries()) {
                    if (key.toLowerCase() == fileName) {
                        lines = value;
                        break;
                    }
                }
            }
            const newLines = new Map<number, IBreakPoint>();
            for (const sourceBp of args.breakpoints) {
                const oldBp = lines?.get(sourceBp.line);
                if (oldBp === undefined) {
                    const ibp: IBreakPoint = {
                        id: ++this._nextBp,
                        verified: false,
                        sent: false,
                        real_line: sourceBp.line
                    };
                    newLines.set(sourceBp.line, ibp);
                    if (await this._runtime.setBreakPoint(fileName, sourceBp.line)) {
                        ibp.sent = true;
                    }
                } else {
                    newLines.set(sourceBp.line, oldBp);
                }
            }
            if (lines) {
                for(let [line, bp] of lines) {
                    if (!newLines.has(line)) {
                        await this._runtime.resetBreakPoint(fileName, bp.real_line);
                    }
                }
            }
            // always replace
            this._breakPoints.set(fileName, newLines);
            for (let [line, bp] of newLines) {
                response.body.breakpoints.push({
                    id: bp.id,
                    line: bp.real_line,
                    verified: bp.verified
                });
            }
        }
        response.success = true;
        this.sendResponse(response);
    }

    protected async evaluateRequest(response: DebugProtocol.EvaluateResponse, args: DebugProtocol.EvaluateArguments) {
        switch (args.context) {
            case 'repl':
                if (this._runtime.isRunning()) {
                    this._tracerQueue.postCommand(args.expression);
                    response.body = {
                        result: ``,
                        variablesReference: 0
                    };
                } else if (this._runtime.isPaused()) {
                    // we woun't filter anything, use it on your own risk
                    this._serverQueue.postCommand(args.expression);
                    response.body = {
                        result: ``,
                        variablesReference: 0
                    };
                }
                break;
            case 'hover':
                break;
            case 'watch':
                break;
        }
        this.sendResponse(response);
    }

    private onStartRunning() {
        this._variableHandles.reset();
        this._frameHandles.reset();
        this._gotoHandles.reset();
    }

    protected async continueRequest(response: DebugProtocol.ContinueResponse, args: DebugProtocol.ContinueArguments) {
        this.onStartRunning();
        response.body = {
            allThreadsContinued: true,
        };
        response.success = await this._runtime.continueRequest();
        this.sendResponse(response);
    }

    protected async nextRequest(response: DebugProtocol.NextResponse, args: DebugProtocol.NextArguments) {
        this.onStartRunning();
        response.success = await this._runtime.nextRequest(args.threadId);
        this.sendResponse(response);
    }

    protected async stepInRequest(response: DebugProtocol.StepInResponse, args: DebugProtocol.StepInArguments) {
        this.onStartRunning();
        response.success = await this._runtime.stepInRequest(args.threadId);
        this.sendResponse(response);
    }

    protected async stepOutRequest(response: DebugProtocol.StepOutResponse, args: DebugProtocol.StepOutArguments) {
        this.onStartRunning();
        response.success = await this._runtime.stepOutRequest(args.threadId);
        this.sendResponse(response);
    }

    protected async pauseRequest(response: DebugProtocol.PauseResponse, args: DebugProtocol.PauseArguments) {
        response.success = await this._runtime.pauseRequest();
        this.sendResponse(response);
    }

    protected async gotoRequest(response: DebugProtocol.GotoResponse, args: DebugProtocol.GotoArguments, request?: DebugProtocol.Request) {
        response.success = false;
        let target = this._gotoHandles.get(args.targetId);
        if (target) {
            await this._runtime.requestGoto(args.threadId, target.line);
            response.success = true;
            this.sendResponse(response);
            // emulate step
            this.onStartRunning();
            this.sendStoppedEvent('step', args.threadId);
        } else {
            response.success = false;
            this.sendResponse(response);
        }
    }

    protected async gotoTargetsRequest(response: DebugProtocol.GotoTargetsResponse, args: DebugProtocol.GotoTargetsArguments, request?: DebugProtocol.Request) {
        if (args.source.path) {
            let localPath = workspace.asRelativePath(args.source.path)
            for (const [key, value] of this._rootMap) {
                if (localPath.toLowerCase().startsWith(value.toLowerCase())) {
                    localPath = (key + localPath.substring(value.length)).replace(middleSepRg, ftpPathSeparator);
                    break;
                }
            }
            response.success = await this._runtime.requestGotoTargets(localPath, args.line);
            const gtt: GotoTarget = {
                id: 0,
                label: `go to line ${args.line}`,
                line: args.line,
            };
            gtt.id = this._gotoHandles.create(gtt);
            response.body = {
                targets: [gtt]
            }
            this.sendResponse(response);
        }
    }

    // protected async exceptionInfoRequest(response: DebugProtocol.ExceptionInfoResponse, args: DebugProtocol.ExceptionInfoArguments, request?: DebugProtocol.Request) {
    //     let {success, info} = await this._runtime.exceptionRequest(args.threadId);
    //     response.success = success;
    //     if (success) {
    //         response.body = {
    //             /** ID of the exception that was thrown. */
    //             exceptionId: info,
    //             /** Descriptive text for the exception provided by the debug adapter. */
    //             // description?: string,
    //             /** Mode that caused the exception notification to be raised. */
    //             breakMode: "unhandled",
    //             /** Detailed information about the exception. */
    //             // details?: ExceptionDetails,
    //         }
    //     }
    //     this.sendResponse(response);
    // }

    ///
    ///     private
    ///

    private async testScripts() {
        const myPath = extensions.getExtension("VMSSoftwareInc.vms-ide")?.extensionPath;
        if (myPath) {
            const localPath = path.join(myPath, 'python');
            // synchronize
            const ensured = await ensureSettings(this._workspace?.name);
            const sshHelperType = GetSshHelperType();
            if (ensured && sshHelperType) {
                const sshHelper = new sshHelperType(this._logFn);
                const sftp = await sshHelper.getDefaultSftp(this._workspace?.name);
                if (sftp) {
                    let   retCode = false;
                    const localSource = new FsSource(localPath, this._logFn);
                    const remoteSource = await Synchronizer.acquire(this._logFn).requestSource(ensured, "remote");
                    if (remoteSource) {
                        await remoteSource.ensureDirectory(ensured.projectSection.outdir);
                        remoteSource.root = ensured.projectSection.root + ftpPathSeparator + ensured.projectSection.outdir;
                        const files = ['server.py', 'tracer.py'];
                        retCode = true;
                        for (const file of files) {
                            let [localDate, remoteDate] = await Promise.all([localSource.getDate(file), remoteSource.getDate(file)]);
                            if (localDate !== undefined && remoteDate !== undefined) {
                                // allow plus/minus two seconds
                                if (Math.abs(localDate.valueOf() - remoteDate.valueOf()) < 2000) {
                                    continue;
                                }
                            }
                            localDate = localDate || new Date();
                            retCode = retCode && await Synchronizer.pipeFileAndSetDate(sshHelper, localSource, remoteSource, file, localDate, this._logFn);
                        }
                    }
                    return retCode;
                }
            }
        }
        return false;
    }

    private async tryRunServer(port: number) {

        const rgxListening = /listening port (\d+)/;
        const rgxPortError = /port (\d+) is busy/;
        const rgxMsg = /^((%|-)(\S+)-(\S)-(\S*)),\s(.*)/;

        let result = EStartResult.unknown;
        let scriptPath = '';
        const ensured = await ensureSettings(this._workspace?.name);
        if (ensured) {
            // scriptPath = `[.${ensured.projectSection.outdir}]`;
            scriptPath = ensured.projectSection.outdir + ftpPathSeparator;
        }
        // TODO: move command to the settings
        let runCommand = `python ${scriptPath}server.py -p ${port}`;
        const lines: string[] = [];
        return this._serverQueue.postCommand(runCommand, (cmd, line) => {
            if (!line) {
                result = EStartResult.error;
                return ListenerResponse.stop;   // go out, general error
            }
            lines.push(line);
            if (result === EStartResult.unknown) {
                if (line.trim().match(rgxListening)) {
                    result = EStartResult.started;
                    return ListenerResponse.stop;   // go out, no prompt required
                }
                if (line.trim().match(rgxPortError)) {
                    result = EStartResult.portIsBusy;
                    return ListenerResponse.needMoreLines;    // wait a prompt
                }
                if (line.trim().match(rgxMsg)) {
                    result = EStartResult.error;
                    this._logFn(LogType.warning, () => lines.join(''), true);
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
        let scriptPath = '';
        const ensured = await ensureSettings(this._workspace?.name);
        if (ensured) {
            // scriptPath = `[.${ensured.projectSection.outdir}]`;
            scriptPath = ensured.projectSection.outdir + ftpPathSeparator;
        }
        const config = workspace.getConfiguration("vmssoftware.vms_python_debug", null);
        const insensitive = config.get<boolean>("insensitive");
        const developerMode = config.get<boolean>("developer");
        let runCommand = `python ${scriptPath}tracer.py -p ${port}${insensitive?' -i':''}${developerMode?' -d':''} ${script}${args?' '+args:''}`;
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

    public async changeDirCmd(scope?: string) {
        if (!scope) {
            scope = await commands.executeCommand("vmssoftware.synchronizer.getCurrentScope");
        }
        if (scope && typeof scope === "string") {
            const ensured = await ensureSettings(scope);
            if (ensured) {
                const vmsPath = new VmsPathConverter(ensured.projectSection.root + ftpPathSeparator);
                return `set default ${vmsPath.directory}`;
            }
        }
        return "";
    }
}