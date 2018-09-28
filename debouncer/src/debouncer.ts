/**
 * Collects all calls and fire only one if during _msec were no more calls
 * Only the last then() or awaitwill continue to work!!!
 */

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export class Debouncer {

    protected timer: NodeJS.Timer | undefined = undefined;

    constructor(protected msec: number) {

    }

    public async debounce() {
        logFn("debounce: start");
        if (this.timer) {
            logFn("debounce: timer exists - clear timer");
            clearTimeout(this.timer);
        }
        logFn("debounce: creating promise");
        return new Promise((resolve) => {
            logFn("debounce: creating timer");
            this.timer = setTimeout(() => {
                logFn("debounce: timer fired");
                this.timer = undefined;
                resolve();
            }, this.msec);
        });
    }
}
