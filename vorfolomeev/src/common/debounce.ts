/**
 * Collects all calls and fire only one if during _msec were no more calls
 * Only the last then() or awaitwill continue to work!!!
 */

export let _log_this_file = console.log;
//_log_this_file = function() {};

export class Debouncer {

    constructor(protected _msec: number) {
        
    }

    protected _timer: NodeJS.Timer | undefined = undefined;

    async debounce() {
        _log_this_file('debounce: start');
        if (this._timer) {
            _log_this_file('debounce: timer exists - clear timer');
            clearTimeout(this._timer);
        }
        _log_this_file('debounce: creating promise');
        return new Promise((resolve, reject) => {
            _log_this_file('debounce: creating timer');
            this._timer = setTimeout(() => {
                _log_this_file('debounce: timer fired');
                this._timer = undefined;
                resolve();
            }, this._msec);
        });
    }
}

