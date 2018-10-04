
export interface ITransport {
    writeFile(relPath: string, buffer: Buffer): Promise<boolean>;
    getModTime(relPath: string): Promise<Date|undefined>;
    setModTime(relPath: string, date: Date): Promise<boolean>;
    waitComplete(): Promise<boolean>;
    dispose(): Promise<boolean>;
}
