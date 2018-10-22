import { EventEmitter } from "vscode";
import { Event } from "vscode";

// import * as nls from 'vscode-nls';
// let _localize = nls.loadMessageBundle();

/**
 * Waiting _wait_msec before firing the event. If a new fire() was called while waiting, the timeout starts again.
 * Only last event will be fired, all previous data will be discarded.
 */
export class WaitFireEventEmitter<T> {

    public event: Event<T>;

    private fireSoonHandle: NodeJS.Timer | undefined;
    private emitter = new EventEmitter<T>();

    constructor(private waitMsec: number) {
        this.event = this.emitter.event;
    }

    public fire(data?: T) {
        this._fireSoon(data);
    }

    public dispose(): void {
        if (this.fireSoonHandle) {
            clearTimeout(this.fireSoonHandle);
            this.fireSoonHandle = undefined;
        }
        this.emitter.dispose();
    }

    private _fireSoon(e: T | undefined): void {
        if (this.fireSoonHandle) {
            clearTimeout(this.fireSoonHandle);
        }
        this.fireSoonHandle = setTimeout(() => {
            this.emitter.fire(e);
        }, this.waitMsec);
    }
}
/**
 * Example
 */
// let w = new WaitFireEventEmitter<number>(1000);
// w.event((n) => {
//     //will appear 1000 millseconds after last fire()
//     console.log(`fired ${n}`);
// });
// w.fire(1);
