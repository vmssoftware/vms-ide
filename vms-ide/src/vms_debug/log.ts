import { LogFunction, LogResult, LogType } from "../common/main";

import { GetConfigHelperFromApi } from "../ext-api/ext-api";

export function createLogFunction(channelName: string) {
    let logFn: LogFunction | undefined;
    // get function from api
    const api = GetConfigHelperFromApi();
    if (api) {
        logFn = api.createLogFunction(channelName);
    } else {
        // or create default
        // tslint:disable-next-line:no-console
        logFn = (type: LogType, message: LogResult, show?: boolean ) => console.log(message());
    }
    let queue: Array<{type: LogType, message: LogResult, show?: boolean}> = [];
    return (type: LogType, message: LogResult, show?: boolean ) => {
        if (logFn) {
            // output queued messages
            for(const q of queue) {
                logFn(q.type, q.message, q.show, 1);
            }
            queue = [];
            // output
            logFn(type, message, show, 1);
        } else {
            // save message, but we unfortunately lose information where function was called from
            queue.push({type, message, show});
        }
    };
}
