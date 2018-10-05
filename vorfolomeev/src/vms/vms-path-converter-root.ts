import * as path from "path";
import { IPathConverter } from "../ssh/path-converter";
import { VmsPathConverter } from "./vms-path-converter";

export class VmsPathConverterRoot extends VmsPathConverter {

    private root: string | undefined;

    constructor(fsPath?: string, root?: string) {
        if (fsPath && root) {
            fsPath = path.join(root, fsPath);
        }
        super(fsPath);
        this.root = root;
    }

    public from(relPath: string): IPathConverter {
        return new VmsPathConverterRoot(relPath, this.root);
    }
}
