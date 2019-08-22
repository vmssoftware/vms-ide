import { ICmdServer, ICmdQueue, ListenerResponse } from "./communication";
import { Lock } from "../common/main";

export class CmdQueue implements ICmdQueue {
    
    private _ready = new Lock(false);

    constructor(private _server: ICmdServer | undefined) {
    }

    private _unexpectedLineListener: ((line: string | undefined) => void ) | undefined;
    public onUnexpectedLine(unexpectedLineListener: (line: string | undefined) => void) {
        this._unexpectedLineListener = unexpectedLineListener;
        if (this._server) {
            this._server.onLineReceived(this._unexpectedLineListener);
        }
    }

    /**
     * Posts command to the server, wait lines and send them to the listener
     * @param cmd command
     * @param listener must return true if it requires more lines, otherwise must return false if command is processed
     * @returns false if command cannot be sent, true if command is sent and ended
     */
    public async postCommand(cmd: string, listener: ((cmd: string, line: string | undefined) => ListenerResponse)|undefined) {
        if (this._server) {
            await this._ready.acquire();
            const waitSession = new Lock(true);
            const session = this._server.onLineReceived((line: string | undefined) => {
                let result = ListenerResponse.stop;
                if (listener) {
                    result = listener(cmd, line);
                } else if (this._unexpectedLineListener){
                    this._unexpectedLineListener(line); // give this line chance to be parsed
                }
                if (result == ListenerResponse.stop || line === undefined) {
                    session.dispose();
                    if (this._server && this._unexpectedLineListener) {
                        this._server.onLineReceived(this._unexpectedLineListener);
                    }
                    waitSession.release();
                }
                if (line === undefined) {
                    // server was closed
                    this._server = undefined;
                }
            });
            this._server.sendCommand(cmd);
            await waitSession.acquire();
            this._ready.release();
            return true;
        }
        else {
            if (listener) {
                listener(cmd, undefined);
            }
            return false;
        }
    }
}