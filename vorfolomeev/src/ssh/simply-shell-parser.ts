import { IShellParser } from "./shell-parser";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

export class SimplyShellParser implements IShellParser {
    public stdout: string;
    public stderr: string;

    constructor(public ending: string) {
        this.stdout = "";
        this.stderr = "";
    }

    public onData(data: string): boolean {
        if (logFn) logFn(data);
        this.stdout += data;
        const retCode = this.stdout.endsWith(this.ending);  // because ending may start in previous data
        return retCode;
    }

    public onDataErr(data: string): boolean {
        if (logFn) logFn(data);
        this.stderr += data;
        return false;   // no error can invoke another command
    }

    public initialize(): void {
        this.stdout = "";
        this.stderr = "";
    }

}
