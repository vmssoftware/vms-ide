
export enum LogType {
    error,
    warning,
    informtion,
    debug,
}

export type LogResult= () => string;

export type LogFunction = (type: LogType, message: LogResult) => void;
