import { ITransport } from "./transport";

export class SFTPTransport implements ITransport {

    public writeFile(relPath: string, buffer: Buffer): Promise<boolean> {
        throw new Error("Method not implemented.");
    }

    public getModTime(relPath: string): Promise<Date> {
        throw new Error("Method not implemented.");
    }

    public setModTime(relPath: string, date: Date): Promise<boolean> {
        throw new Error("Method not implemented.");
    }

}
