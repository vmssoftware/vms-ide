import { LogType } from "./log-type";

/**
 * Collects all calls and fire only one if during _msec were no more calls
 * Only the last then() or awaitwill continue to work!!!
 */

export class Debouncer {

    protected timer: NodeJS.Timer | undefined = undefined;

    constructor(protected msec: number, public debugLog?: LogType) {

    }

    public async debounce() {
        if (this.debugLog) {
            this.debugLog("debounce: start");
        }
        if (this.timer) {
            if (this.debugLog) {
                this.debugLog("debounce: timer exists - clear timer");
            }
            clearTimeout(this.timer);
        }
        if (this.debugLog) {
            this.debugLog("debounce: creating promise");
        }
        return new Promise((resolve) => {
            if (this.debugLog) {
                this.debugLog("debounce: creating timer");
            }
            this.timer = setTimeout(() => {
                if (this.debugLog) {
                    this.debugLog("debounce: timer fired");
                }
                this.timer = undefined;
                resolve();
            }, this.msec);
        });
    }
}
