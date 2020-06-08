import { IDropCommand } from "./communication";

export class DropCommand implements IDropCommand {

    private _callback?: (reason?: any) => void;

    public onDropCommand(callback: (reason: any) => void): void {
        this._callback = callback;
    }

    public doDropCommand(reason?: any) {
        if (this._callback) {
            this._callback(reason);
        }
    }

}