import { ICmdClient } from "./communication";
import { EventEmitter } from "vscode";

export class SimpleCmdClient implements ICmdClient {

    constructor(private emitter: EventEmitter<string | undefined>) {
        ;
    }

    onCommand(cmdListener: (line: string) => void): { dispose: () => void; } {
        // no commands allowed
        return {
            dispose: () => {
                return;
            }
        };
    }

    onData(dataListener: (line: string) => void): { dispose: () => void; } {
        // no data allowed
        return {
            dispose: () => {
                return;
            }
        };
    }

    lineReceived(line: string | undefined): boolean {
        this.emitter.fire(line);
        return true;
    }
}