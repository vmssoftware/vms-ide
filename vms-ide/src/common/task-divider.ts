
/**
 * Allow task to break its execution and other task can change asyncValue.
 * For example - to cancel current async task
 */
export class TaskDivider<T> {
    constructor(public asyncValue: T) {
    }

    public setValue(newValue: T) {
        this.asyncValue = newValue;
    }

    public async testValue() {
        return new Promise<T>(resolve => {
            setImmediate(() => {
                resolve(this.asyncValue);
            });
        });
    }
}