import { EventEmitter } from "events";
import { Lock } from "../common/lock";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

/**
 * Waitable operation executor
 * @param operationName name of operation
 * @param continueEmitter who emits "continue" event
 * @param continueEvent emitted when we may continue
 * @param failEmitter who emits "failed" event
 * @param failEvent emitted when operation failed
 * @param operation function, must return true if we should wait "continue" event.
 *                  also must reset complete lock if all ok
 * @returns when operation is done or failed
 */
export async function WaitableOperation(operationName: string,
                                        continueEmitter: EventEmitter,
                                        continueEvent: string | symbol,
                                        failEmitter: EventEmitter,
                                        failEvent: string | symbol,
                                        operation: (complete: Lock) => boolean) {

    let shouldWait = false;
    const operationDone = new Lock(true);
    const mayContinue = new Lock(true);

    const onFailed = () => {
        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`${operationName} failed`);
        // release all locks
        mayContinue.release();
        operationDone.release();
        // doesn't need wait anymore
        shouldWait = false;
    };

    const onContinue = () => {
        // tslint:disable-next-line:no-unused-expression
        logFn && logFn(`${operationName} may continue`);
        mayContinue.release();
    };

    failEmitter.on(failEvent, onFailed);

    do {
        shouldWait = operation(operationDone);
        if (shouldWait) {
            // tslint:disable-next-line:no-unused-expression
            logFn && logFn(`${operationName} should wait`);
            continueEmitter.on(continueEvent, onContinue);
            await mayContinue.acquire();   // wait until "continue" or failed
            continueEmitter.off(continueEvent, onContinue);
        }
    } while (shouldWait);

    await operationDone.acquire();  // wait until completed or failed

    failEmitter.removeListener(failEvent, onFailed);
}
