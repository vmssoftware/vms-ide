import { ICmdClient } from "./communication";
import { EventEmitter } from "vscode";

export class SimpleCmdClient implements ICmdClient {

    constructor(private emitter: EventEmitter<string>) {
        ;
    }

    onCommand(cmdListener: (line: string) => void): { dispose: () => void; } {
        // no cammands allowed
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