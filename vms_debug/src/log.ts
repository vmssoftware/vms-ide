import { LogResult, LogType, LogFunction } from "@vorfol/common";
import { GetConfigHelperFromApi } from "./ext-api/get-config-helper";

export function createLogFunction(channelName: string) {
    let logFn: LogFunction | undefined;
    // get function from api
    GetConfigHelperFromApi()
        .then((api) => {
            if (api) {
                logFn = api.createLogFunction(channelName);
            } else {
                // or create default
                logFn = (type: LogType, message: LogResult, show?: boolean ) => console.log(message());
            }
        });
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
