
export interface ITransport {
    writeFile(relPath: string, buffer: Buffer): Promise<boolean>;
    getModTime(relPath: string): Promise<Date>;
    setModTime(relPath: string, date: Date): Promise<boolean>;
}
