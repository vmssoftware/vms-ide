import { EventEmitter } from "events";
import { LogFunction } from "./log-type";
import { Subscribe } from "./subscribe";

/**
 * Waiting _wait_msec before firing the event. If a new fire() was called while waiting, the timeout starts again.
 * Only last event will be fired, all previous data will be discarded.
 */
export class WaitFireEventEmitter<T> {

    private fireSoonHandle?: NodeJS.Timer;
    private emitter = new EventEmitter();
    private event = Symbol();

    constructor(private waitMsec: number, public debugLog?: LogFunction) {
    }

    public fire(data?: T) {
        this.fireSoon(data);
    }

    public dispose(): void {
        if (this.fireSoonHandle) {
            clearTimeout(this.fireSoonHandle);
            this.fireSoonHandle = undefined;
        }
    }

    public Subscribe(listener: (...args: any[]) => void) {
        return Subscribe(this.emitter, this.event, listener);
    }

    private fireSoon(data?: T ): void {
        if (this.fireSoonHandle) {
            clearTimeout(this.fireSoonHandle);
        }
        this.fireSoonHandle = setTimeout(() => {
            this.emitter.emit(this.event, data);
        }, this.waitMsec);
    }
}
