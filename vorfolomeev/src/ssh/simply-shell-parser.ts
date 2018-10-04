import { IShellParser } from "./shell-parser";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export class SimplyShellParser implements IShellParser {

    public stdout: string;
    public stderr: string;

    constructor(public ending: string) {
        this.stdout = "";
        this.stderr = "";
    }

    public onData(data: string): boolean {
        logFn(data);
        this.stdout += data;
        const retCode = this.stdout.endsWith(this.ending);  // because ending may start in previous data
        return retCode;
    }

    public onDataErr(data: string): boolean {
        logFn(data);
        this.stderr += data;
        return false;   // no error can invoke another command
    }
}
