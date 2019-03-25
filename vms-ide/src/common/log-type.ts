
export enum LogType {
    error,
    warning,
    information,
    debug,
}

export type LogResult= () => string;

export type LogFunction = (type: LogType, message: LogResult, show?: boolean, addStackLevel?: number) => void;
