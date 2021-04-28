import { EventEmitter } from "events";

export class TaskCount {

    private emitter = new EventEmitter();
    private counter = 0;

    public getCount() {
        return this.counter;
    }

    public taskStarted() {
        ++this.counter;
    }

    public waitAllTask(): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            if (this.counter === 0) {
                resolve(true);
            } else {
                // Otherwise, wait until somebody releases the lock and try again
                const testTask = () => {
                    if (this.counter === 0) {
                        this.emitter.removeListener("taskEnded", testTask);
                        this.emitter.setMaxListeners(Math.max(0, this.emitter.getMaxListeners() - 1));
                        return resolve(true);
                    }
                };
                this.emitter.setMaxListeners(this.emitter.getMaxListeners() + 1);
                this.emitter.on("taskEnded", testTask);
            }
        });
    }

    public taskEnded() {
        --this.counter;
        setImmediate(() => this.emitter.emit("taskEnded"));
    }
}