import * as path from "path";
import { IPathConverter } from "../ssh/path-converter";
import { VmsPathConverter } from "./vms-path-converter";

export class VmsPathConverterRoot extends VmsPathConverter {

    private root: string | undefined;

    /**
     * Note: root is first
     * @param root
     * @param fsPath
     */
    constructor(root?: string, fsPath?: string) {
        let fullPath = root || "";
        // ensure directory
        if (!fullPath.endsWith(path.sep)) {
            fullPath += path.sep;
        }
        if (fsPath && fsPath.length) {
            if (fsPath.startsWith(path.sep)) {
                fsPath = fsPath.slice(1);
            }
            fullPath += fsPath;
        }
        super(fullPath);
        this.root = root;
    }

    public from(relPath: string): VmsPathConverterRoot {
        return new VmsPathConverterRoot(this.root, relPath);
    }
}
