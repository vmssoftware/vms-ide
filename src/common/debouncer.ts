import { LogFunction, LogType } from "./log-type";

/**
 * Collects all calls and fire only one if during _msec were no more calls
 * Only the last then() or await will continue to work!!!
 */

export class Debouncer {

    protected timer: NodeJS.Timeout | undefined = undefined;

    constructor(protected msec: number, public debugLog?: LogFunction) {

    }

    public async debounce() {
        if (this.debugLog) {
            this.debugLog(LogType.debug, () => "debounce: start");
        }
        if (this.timer) {
            if (this.debugLog) {
                this.debugLog(LogType.debug, () => "debounce: timer exists - clear timer");
            }
            clearTimeout(this.timer);
        }
        if (this.debugLog) {
            this.debugLog(LogType.debug, () => "debounce: creating promise");
        }
        return new Promise<void>((resolve) => {
            if (this.debugLog) {
                this.debugLog(LogType.debug, () => "debounce: creating timer");
            }
            this.timer = setTimeout(() => {
                if (this.debugLog) {
                    this.debugLog(LogType.debug, () => "debounce: timer fired");
                }
                this.timer = undefined;
                resolve();
            }, this.msec);
        });
    }
}
