import { LogResult, LogType } from "./log-type";

export function logConsoleFn(type: LogType, message: LogResult) {
    switch (type) {
        case LogType.error:
            // tslint:disable-next-line:no-console
            console.error(message());
            break;
        case LogType.warning:
            // tslint:disable-next-line:no-console
            console.warn(message());
            break;
        case LogType.informtion:
            // tslint:disable-next-line:no-console
            console.info(message());
            break;
        case LogType.debug:
            // tslint:disable-next-line:no-console
            console.log(message());
            break;
    }
}
