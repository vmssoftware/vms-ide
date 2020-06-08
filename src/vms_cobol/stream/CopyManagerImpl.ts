import * as path from 'path';
import * as fs from 'fs';

import { ICopyManager } from "./cobolInputStream";
import { VmsPathConverter } from "../../synchronizer/vms/vms-path-converter";

export class CopyManagerImpl implements ICopyManager {

    /**
     * key is VMS path
     */
    private copyContents: Map<string, string[]> = new Map<string, string[]>();
    private copySource: Map<string, string> = new Map<string, string>();

    constructor(private root: string) {

    }

    getRoot() {
        return this.root;
    }

    public clear(fileName?: string): boolean {
        if (fileName) {
            for (let [name, file] of this.copySource) {
                if (file === fileName) {
                    this.copyContents.delete(name);
                    this.copySource.delete(name);
                    return true;
                }
            }
            return false;
        }
        this.copyContents.clear();
        this.copySource.clear();
        return true;
    }

    getSourcePath(name: string): string | undefined {
        return this.copySource.get(name);
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
                this.copySource.set(name, filePath);
            } catch(e) {
                lines = undefined;
            }
        }
        if (lines) {
            return [...lines];
        }
        return [];
    }

}