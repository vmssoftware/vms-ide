import { EventEmitter } from "events";
import * as nls from "vscode-nls";

import { LogFunction } from "../common/main";
import { ICmdQueue } from "../vms_jvm_debug/communication";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export enum PythonRuntimeEvents {
    stopOnEntry = 'stopOnEntry',
    stopOnStep = 'stopOnStep',
    stopOnBreakpoint = 'stopOnBreakpoint',
    stopOnBreakpointError = 'stopOnBreakpointError',
    stopOnException = 'stopOnException',
    stopOnPause = 'stopOnPause',
    stopOnDataChange = 'stopOnDataChange',
    stopOnDataAccess = 'stopOnDataAccess',
    breakpointValidated = 'breakpointValidated',
    output = 'output',
    end = 'end',
};

enum PythonServerMessage {
    DEBUG = 'DEBUG',
    PAUSED = 'PAUSED',
    BREAK = 'BREAK',
    BP_CONFIRM = 'BP_CONFIRM',
    BP_WAIT = 'BP_WAIT',
    BP_RESET = 'BP_RESET',
    EXITED = 'EXITED',
    CONTINUED = 'CONTINUED',
    STEPPED = 'STEPPED',
    INFORMATION = 'INFO',
    EXCEPTION = 'EXCEPTION',
    SIGNAL = 'SIGNAL',
    SYNTAX_ERROR = 'SYNTAX_ERROR',
    LOCALS = 'LOCALS',
};

enum PythonServerCommand {
    PAUSE = 'p',
    CONTINUE = 'c',
    STEP = 's',
    INFO = 'i',
    QUIT = 'q',
    HELP = 'h',
};

export class PythonShellRuntime extends EventEmitter {
    
    private _logFn: LogFunction;

    constructor(private _queue: ICmdQueue, logFn?: LogFunction) {
        super();
        // tslint:disable-next-line:no-empty
        this._logFn = logFn || (() => {});
        
        this._queue.onUnexpectedLine((line) => {
            this.onUnexpectedLine(line);
        });
    }

    private onUnexpectedLine(line: string | undefined): void {
        if (line) {
            const trimmed = line.trim();
            if (trimmed) {
                switch(trimmed) {
                    case  PythonServerMessage.PAUSED:
                        this._queue.postCommand(PythonServerCommand.CONTINUE);
                        break;
                    case PythonServerMessage.BREAK:
                        this._queue.postCommand(PythonServerCommand.CONTINUE);
                        break;
                    case PythonServerMessage.EXCEPTION:
                        this._queue.postCommand(PythonServerCommand.CONTINUE);
                        break;
                    case PythonServerMessage.EXITED:
                        this._queue.postCommand(PythonServerCommand.QUIT);
                        this.sendEvent(PythonRuntimeEvents.end);
                        break;
                }
                this.sendEvent(PythonRuntimeEvents.output, trimmed);
            }
        }
    }

    /******************************************************************************************/
    // public
    /******************************************************************************************/

    public async start() {
    }

    /******************************************************************************************/
    // private
    /******************************************************************************************/
    
    private sendEvent(event: string, ... args: any[]) {
        setImmediate(_ => {
            this.emit(event, ...args);
        });
    }
}