import * as path from 'path';
import * as fs from 'fs';

import { ICopyManager } from "./cobolInputStream";
import { VmsPathConverter } from "../../synchronizer/vms/vms-path-converter";

export class CopyManagerImpl implements ICopyManager {

    private copyContents: Map<string, string[]> = new Map<string, string[]>();

    constructor(private root: string) {

    }

    public clear() {
        this.copyContents.clear();
    }

    getLines(name: string): string[] {
        let lines: string[] | undefined = this.copyContents.get(name);
        if (!lines) {
            try {
                let converter = VmsPathConverter.fromVms(name);
                let filePath = path.join(this.root, converter.initial);
                if (!converter.fileExt) {
                    filePath += ".lib";
                }
                let buffer = fs.readFileSync(filePath);
                let content = buffer.toString("utf8");
                lines = content.split(/\r?\n/g);
                this.copyContents.set(name, lines);
            } catch(e) {
                lines = undefined;
            }
        }
        if (lines) {
            return lines;
        }
        return [];
    }

}