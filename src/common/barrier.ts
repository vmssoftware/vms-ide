
import { EventEmitter } from "events";

export class Barrier {

    private amount = 0;
    private emitter = new EventEmitter();

    constructor(private maxAmount = 1, initalAmount = 0, public name?: string) {
        this.amount = initalAmount;
    }

    public get available(): number {
        return this.maxAmount - this.amount;
    }

    public acquire(): Promise<void> {
        return new Promise<void>((resolve) => {
            // If nobody has the lock, take it and resolve immediately
            if (this.amount < this.maxAmount) {
                // Safe because JS doesn't interrupt you on synchronous operations,
                // so no need for compare-and-swap or anything like that.
                this.amount ++;
                resolve();
            } else {
                // Otherwise, wait until somebody releases the lock and try again
                const tryAcquire = () => {
                    if (this.amount < this.maxAmount) {
                        this.amount ++;
                        this.emitter.removeListener("release", tryAcquire);
                        this.emitter.setMaxListeners(Math.max(0, this.emitter.getMaxListeners() - 1));
                        return resolve();
                    }
                };
                this.emitter.setMaxListeners(this.emitter.getMaxListeners() + 1);
                this.emitter.on("release", tryAcquire);
            }
        });
    }

    public release() {
        // Release the lock immediately
        this.amount --;
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
