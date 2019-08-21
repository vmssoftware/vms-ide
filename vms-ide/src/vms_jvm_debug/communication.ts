import { LockQueueAction } from "../common/lock";

export enum ListenerResponse {
    needMoreLines,
    stop
}

/** If server doesn't know about client */
export interface ICmdClient {
    /**
     * Used to subscribe on clients commands
     * @param cmdListener 
     */
    onCommand(cmdListener: (line: string) => void ): { dispose: () => void};
    /**
     * Used to send line to the client. Undefined line means server is closed 
     * @param line 
     */
    lineReceived(line: string | undefined): boolean;
}

/** If client doesn't know about server */
export interface ICmdServer {
    /**
     * Used to subscribe on server answers. Undefined line means server is closed 
     * @param listener 
     */
    onLineReceived(listener: (line: string | undefined) => void ): { dispose: () => void};
    /**
     * Used to subscribe on server errors
     * @param listener 
     */
    onStderrLineReceived(listener: (line: string | undefined) => void ): { dispose: () => void};
    /**
     * Used to send command to the server
     * @param line 
     */
    sendCommand(line: string): Promise<boolean>;
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
                listener?: (cmd: string, line: string | undefined) => ListenerResponse,
                action?: LockQueueAction,
                dropCommand?: IDropCommand): Promise<boolean>;

    /**
     * To receive lines when no command is sent
     * @param unexpectedLineListener 
     */
    onUnexpectedLine(unexpectedLineListener: (line: string | undefined) => void ): void;
}
