
import { EventEmitter } from "events";
import { Resolve } from "./resolve";

export class Lock {

    private locked = false;
    private cancelled = 0;
    private emitter = new EventEmitter();

    constructor(initialState = false, public name?: string) {
        this.locked = initialState;
    }

    public get isLocked(): boolean {
        return this.locked;
    }

    public acquire(cancelAllPrevious?: boolean): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            // If nobody has the lock, take it and resolve immediately
            if (!this.locked) {
                // Safe because JS doesn't interrupt you on synchronous operations,
                // so no need for compare-and-swap or anything like that.
                this.locked = true;
                resolve(true);
            } else {
                // Otherwise, wait until somebody releases the lock and try again
                if (cancelAllPrevious) {
                    ++this.cancelled;
                }
                const tryAcquire = () => {
                    if (!this.locked || this.cancelled > 0) {
                        if (cancelAllPrevious) {
                            --this.cancelled;
                        }
                        const acquired = (!this.locked) && this.cancelled === 0;
                        this.locked = this.locked || acquired;
                        this.emitter.removeListener("release", tryAcquire);
                        this.emitter.setMaxListeners(Math.max(0, this.emitter.getMaxListeners() - 1));
                        return resolve(acquired);
                    }
                };
                this.emitter.setMaxListeners(this.emitter.getMaxListeners() + 1);
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

export enum LockQueueAction {
    normal,
    toTheTop,
    dropAll,
};

export class LockQueue {

    private queue : Resolve<boolean>[] = [];
    private locked = false;
    private emitter = new EventEmitter();

    constructor(initialState = false, public name?: string) {
        this.locked = initialState;
        this.emitter.on("release", () => {
            const waitResolve = this.queue.shift();
            if (waitResolve) {
                this.locked = true;
                waitResolve(true);
            }
        });
    }

    public get isLocked(): boolean {
        return this.locked;
    }

    public acquire(action?: LockQueueAction): Promise<boolean | undefined> {
        return new Promise<boolean | undefined>((resolve) => {
            if (!this.locked && this.queue.length === 0) {
                this.locked = true;
                resolve(true);
            } else {
                if (action === LockQueueAction.dropAll) {
                    this.queue.forEach((waitResolve) => {
                        waitResolve(false);
                    })
                    this.queue = [resolve];
                } else if (action === LockQueueAction.toTheTop) {
                    this.queue.unshift(resolve);
                } else {
                    this.queue.push(resolve);
                }
            }
        });
    }

    public release() {
        // Release the lock immediately
        this.locked = false;
        setImmediate(() => this.emitter.emit("release"));
    }
}

// class LockPromise {

//     private locked = false;
//     private resolver?: Resolve<void>;
//     private promise?: Promise<void>;

//     constructor(initialState = false, public name?: string, public debugLog?: LogType) {
//         this.locked = initialState;
//     }

//     public get isLocked(): boolean {
//         return this.locked;
//     }

//     public acquire(): Promise<void> {
//         return new Promise<void>(async (resolve) => {
//             // If nobody has the lock, take it and resolve immediately
//             if (!this.locked) {
//                 // Safe because JS doesn't interrupt you on synchronous operations,
//                 // so no need for compare-and-swap or anything like that.
//                 this.locked = true;
//                 resolve();
//                 // if (this.debugLog) {
//                 //     this.debugLog(`acquired immediately`);
//                 // }
//             } else {
//                 // Otherwise, wait until somebody releases the lock and try again
//                 // if (this.debugLog) {
//                 //     this.debugLog(`try acquire`);
//                 // }
//                 let acquired = false;
//                 do {
//                     if (!this.promise) {
//                         // if (this.debugLog) {
//                         //     this.debugLog(`create promise`);
//                         // }
//                         this.promise = new Promise((resolveInner) => {
//                             // if (this.debugLog) {
//                             //     this.debugLog(`hold resolver`);
//                             // }
//                             this.resolver = resolveInner;
//                         });
//                     }
//                     // if (this.debugLog) {
//                     //     this.debugLog(`start awaiting`);
//                     // }
//                     await this.promise;
//                     // if (this.debugLog) {
//                     //     this.debugLog(`end awaiting`);
//                     // }
//                     if (!this.locked) {
//                         // if (this.debugLog) {
//                         //     this.debugLog(`not locked, we are happy => lock and resolve`);
//                         // }
//                         this.locked = true;
//                         resolve();
//                         acquired = true;
//                     } else {
//                         // if (this.debugLog) {
//                         //     this.debugLog(`already somebody locked, looping again`);
//                         // }
//                     }
//                 } while (!acquired);
//             }
//         });
//     }

//     public release() {
//         // Release the lock immediately
//         // if (this.debugLog) {
//         //     this.debugLog(`somebody released`);
//         // }
//         this.locked = false;
//         // if (this.debugLog) {
//         //     this.debugLog(`delete promise`);
//         // }
//         // all waiters have their own promise copy, so delete promise here
//         this.promise = undefined;
//         if (this.resolver) {
//             // if (this.debugLog) {
//             //     this.debugLog(`resolve inner loop`);
//             // }
//             this.resolver();
//             this.resolver = undefined;
//         }
//     }
// }

// export = Lock;  // it is faster
