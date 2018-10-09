import { AsyncTaskQueue } from "../common/async-task-queue";
import { ISshConnectionSettings, SshConnection } from "./connection";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

type Resolve<T> = ((value?: T | PromiseLike<T> | undefined) => void);

export class QueuedConnection extends SshConnection {

    protected taskQueue: AsyncTaskQueue = new AsyncTaskQueue();

    constructor(settings: ISshConnectionSettings) {
        super(settings);
    }

    public dispose(): Promise<boolean> {
        return Promise.resolve().then(() => {
            this.taskQueue.stop();
            this.disconnect();
            return true;
        });
    }

    /**
     * Wait while queue isn't empty
     */
    public waitComplete(): Promise<boolean> {
        return new Promise<boolean>(async (resolve) => {
            this.taskQueue.enqueue( async () => {
                this.waitCompleteExecutor(resolve);
            });
        });
    }

    private waitCompleteExecutor(resolve: Resolve<boolean>): void {
        if (this.taskQueue.numTasks) {
            logFn(`waitComplete: wait again`);
            this.taskQueue.enqueue(() => {
                this.waitCompleteExecutor(resolve);
            });
        } else {
            logFn(`waitComplete: queue is empty`);
            resolve(true);
        }
    }

}
