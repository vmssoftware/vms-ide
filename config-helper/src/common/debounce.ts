/**
 * Collects all calls and fire only one if during _msec were no more calls
 * Only the last then() or awaitwill continue to work!!!
 */

export let _log_ = console.log;
_log_ = function() {};

export class Debouncer {

    constructor(protected _msec: number) {
        
    }

    protected _timer: NodeJS.Timer | undefined = undefined;

    async debounce() {
        _log_('debounce: start');
        if (this._timer) {
            _log_('debounce: timer exists - clear timer');
            clearTimeout(this._timer);
        }
        _log_('debounce: creating promise');
        return new Promise((resolve) => {
            _log_('debounce: creating timer');
            this._timer = setTimeout(() => {
                _log_('debounce: timer fired');
                this._timer = undefined;
                resolve();
            }, this._msec);
        });
    }
}

