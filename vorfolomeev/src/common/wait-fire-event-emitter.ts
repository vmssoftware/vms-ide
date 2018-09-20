import { EventEmitter } from "vscode";
import { Event } from "vscode";

// import * as nls from 'vscode-nls';
// let _localize = nls.loadMessageBundle();

/**
 * Waiting _wait_msec before firing the event. If a new fire() was called while waiting, the timeout starts again.
 * Only last event will be fired, all previous data will be discarded.
 */
export class WaitFireEventEmitter<T> {

    private _emitter = new EventEmitter<T>();

    event: Event<T> = this._emitter.event;
    
    constructor(private _wait_msec: number) {
        
    }

    fire(data?: T) {
        this._fireSoon(data);
    }

    dispose(): void {
        if (this._fireSoonHandle) {
            clearTimeout(this._fireSoonHandle);
            this._fireSoonHandle = undefined;
        }
        this._emitter.dispose();
    } 

    private _fireSoonHandle: NodeJS.Timer | undefined;

    private _fireSoon(e: T | undefined): void {
        if (this._fireSoonHandle) {
            clearTimeout(this._fireSoonHandle);
        }
        this._fireSoonHandle = setTimeout(() => {
            this._emitter.fire(e);
        }, this._wait_msec);
    }
}
