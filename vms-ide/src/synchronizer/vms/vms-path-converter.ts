import { ftpPathSeparator } from "../../common/main";

export const splitter = new RegExp(ftpPathSeparator, "g");
export const vmsPathRgx = /(([\w_$\-]+):)?(\[((\.)?([\w_$\-]+)(\.([\w_$\-]+))*)\])?((([\w_$\-]+)(\.([\w_$\-]+)?)?)?(;(\d+))?)?/;
export enum VmsPathPart {
    disk = 2,
    bareDir = 4,
    isRelative = 5,
    fileName = 11,
    fileExt = 12,
}
/**
 * Uses path.sep to determine directory.
 * Do not use other path functions because it incorrect parses path without file (directory only, ends with path.sep)
 */
export class VmsPathConverter {

    public get fullPath(): string {
        return this.directory + this.file;
    }

    public get directory(): string {
        return this.vmsBareDir ? "[" + this.vmsBareDir + "]" : "";
    }

    public get bareDirectory(): string {
        return this.vmsBareDir;
    }

    public get file(): string {
        return this.vmsFileName + this.vmsFileExt;
    }

    public get fileName(): string {
        return this.vmsFileName;
    }

    public get fileExt(): string {
        return this.vmsFileExt;
    }

    public get initial(): string {
        return this.fsPath || "";
    }

    public static fromVms(relPath: string): VmsPathConverter {
        const converter = new VmsPathConverter();
        const match = relPath.match(vmsPathRgx);
        if (match) {
            converter.vmsBareDir = match[VmsPathPart.bareDir] || "";
            converter.vmsFileName = match[VmsPathPart.fileName] || "";
            converter.vmsFileExt = match[VmsPathPart.fileExt] || "";
            if (converter.vmsBareDir) {
                if (!match[VmsPathPart.isRelative]) {
                    converter.fsPath = ftpPathSeparator;
                }
                converter.fsPath += converter.vmsBareDir.split(".").filter((s) => !!s).join(ftpPathSeparator);
                converter.fsPath += ftpPathSeparator;
            }
            converter.fsPath += converter.file;
        }
        return converter;
    }

    private vmsBareDir: string = "";
    private vmsFileName: string = "";
    private vmsFileExt: string = "";

    constructor(private fsPath?: string) {
        if (fsPath) {
            const dirEnd = fsPath.lastIndexOf(ftpPathSeparator);
            if (dirEnd === -1) {
                this.vmsFileName = fsPath;
            } else {
                this.vmsFileName = fsPath.slice(dirEnd + 1);
                this.vmsBareDir = fsPath.slice(0, dirEnd);
                this.vmsBareDir = this.vmsBareDir.replace(splitter, ".");
                if (this.vmsBareDir[0] === ".") {
                    // if starts with "/" then remove "." (so path is absolute)
                    this.vmsBareDir = this.vmsBareDir.slice(1);
                } else {
                    // else add "." (so path is relative)
                    this.vmsBareDir = "." + this.vmsBareDir;
                }
            }
            const ext = this.vmsFileName.lastIndexOf(".");
            if (ext > 0) {
                this.vmsFileExt = this.vmsFileName.slice(ext);
                this.vmsFileName = this.vmsFileName.slice(0, ext);
            }
        } else {
            this.fsPath = "";
        }
    }
}
