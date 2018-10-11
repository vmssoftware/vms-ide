
import { EventEmitter } from "events";

export class Lock {

    private locked = false;
    private emitter = new EventEmitter();

    constructor() {
        this.emitter.setMaxListeners(100);
    }

    public acquire(): Promise<void> {
        return new Promise<void>((resolve) => {
            // If nobody has the lock, take it and resolve immediately
            if (!this.locked) {
                // Safe because JS doesn't interrupt you on synchronous operations,
                // so no need for compare-and-swap or anything like that.
                this.locked = true;
                resolve();
            } else {
                // Otherwise, wait until somebody releases the lock and try again
                const tryAcquire = () => {
                    if (!this.locked) {
                        this.locked = true;
                        this.emitter.removeListener("release", tryAcquire);
                        return resolve();
                    }
                };
                this.emitter.on("release", tryAcquire);
            }
        });
    }

    public release() {
        // Release the lock immediately
        this.locked = false;
        setImmediate(() => this.emitter.emit("release"));
    }
}
