type SimplyFn = () => void;

export class AsyncTaskQueue {

    protected tasks: SimplyFn[] = [];
    protected isRunning: boolean = false;
    protected isStopped: boolean = false;

    public get numTasks(): number {
        return this.tasks.length;
    }

    /**
     * Enqueue task to execute
     * @param task
     * @param asap to set task in first position
     */
    public enqueue(task: SimplyFn, asap: boolean = false): void {
        if (asap) {
            this.tasks.unshift(task);
        } else {
            this.tasks.push(task);
        }
        this.start();
    }

    public start(): void {
        this.isStopped = false;
        if (!this.isRunning) {
            this.execute();
        }
    }

    public stop(): void {
        this.isStopped = true;
    }

    private execute(): void {

        // If there is more than one task in the queue and this is not stopped.
        if (!this.isStopped && this.tasks.length > 0) {

            // Set status to running
            this.isRunning = true;

            // Get the first task
            const task: SimplyFn = this.tasks.shift()!;

            // Run the task decoupled and start the next
            Promise.resolve().then(async () => {
                await task();
                this.execute();
            });

        } else {
            // If there is no more tasks or if this is no longer running
            // Set status to not running
            this.isRunning = false;
        }
    }
}
