import { LockQueueAction } from "../common/lock";

export enum ListenerResponse {
    needMoreLines,
    stop
}

/** If server doesn't know about client */
export interface ICmdClient {
    onCommand(cmdListener: (line: string) => void ): { dispose: () => void};
    /** undefined line means server is closed */
    lineReceived(line: string | undefined): boolean;
}

/** If client doesn't know about server */
export interface ICmdServer {
    sendCommand(line: string): Promise<boolean>;
    /** undefined line means server is closed */
    onLineReceived(listener: (line: string | undefined) => void ): { dispose: () => void};
}

export interface IDropCommand {
    onDropCommand(callback: (reason?: any) => void): void;
}

export interface ICmdQueue {
    /**
     * @param cmd command
     * @param listener must return true if requires more lines, otherwise must returns false if command processed
     * @returns promise which will be resolved when command is processed
     */
    postCommand(cmd: string, 
                listener: ((cmd: string, line: string | undefined) => ListenerResponse)| undefined,
                action?: LockQueueAction,
                dropCommand?: IDropCommand): Promise<boolean>;

    /**
     * To receive lines when no command is sent
     * @param unexpectedLineListener 
     */
    onUnexpectedLine(unexpectedLineListener: (line: string | undefined) => void ): void;
}
