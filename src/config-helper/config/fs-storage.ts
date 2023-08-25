import fs, { exists } from "fs";
import path from "path";
import util from "util";

import { LogFunction, LogType } from "../../common/main";
import { CSAResult, IConfigData, IConfigStorage } from "./config";
import { ConfigStorageImpl } from "./storage-impl";

const fsExist = util.promisify(fs.exists);
const fsReadFile = util.promisify(fs.readFile);
const fsWriteFile = util.promisify(fs.writeFile);
const fsMkDir = util.promisify(fs.mkdir);

/**
 * FSConfigStorage
 */
export class FSConfigStorage extends ConfigStorageImpl {

    constructor(protected fileName: string, logFn?: LogFunction) {
        super(logFn);
    }

    public fillStart(): Promise<CSAResult> {
        return fsReadFile(this.fileName)
            .then((data) => {
                this.content = data.toString("utf8");
                return super.fillStart();
            }).catch((err) => {
                this.logFn(LogType.debug, () => `${err}`);
                return CSAResult.prepare_failed;
            });
    }

    public storeEnd(): Promise<CSAResult> {
        return super.storeEnd()
            .then((result) => {
                if (result === CSAResult.ok) {
                    const dir = path.dirname(this.fileName);
                    return fsExist(dir).then((ok) => {
                        if (!ok) {
                            return fsMkDir(dir);
                        }
                    }).then(() => {
                        return fsWriteFile(this.fileName, this.content ? this.content : "")
                            .then(() => {
                                this.logFn(LogType.debug, () => "fsWriteFile => ok");
                                return CSAResult.ok;
                            });
                    }).catch((err) => {
                        this.logFn(LogType.debug, () => `fsWriteFile => fail ${err}`);
                        return CSAResult.end_failed;
                    });
                }
                return result;
        });
    }

}
