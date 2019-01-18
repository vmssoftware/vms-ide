import { ftpPathSeparator, LogFunction, LogType } from "@vorfol/common";
import * as path from "path";
import { ProjectState } from "./dep-tree/proj-state";
import { IEnsured } from "./ensure-settings";
import { GetSshHelperType } from "./ext-api/get-ssh-helper";
import { GetZipHelperType } from "./ext-api/get-zip-helper";
import { FsSource } from "./sync/fs-source";
import { Synchronizer } from "./sync/synchronizer";
import { VmsPathConverter } from "./vms/vms-path-converter";

export class UploadZip {

    public logFn: LogFunction;
    constructor(log?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = log || (() => {});
    }

    public async perform(ensured: IEnsured) {
        if (ensured.scope &&
            ensured.configHelper.workspaceFolder) {
            const ZipApiType = await GetZipHelperType();
            if (!ZipApiType) {
                return false;
            }
            const zipApi = new ZipApiType(this.logFn);
            const localPath = ensured.configHelper.workspaceFolder.uri.fsPath;
            const zipFileName = ensured.projectSection.projectName + ".zip";
            const zipFilePath = path.join(localPath, zipFileName);
            const zipFinished = zipApi.start(zipFilePath);
            if (!zipFinished) {
                return false;
            }
            const localSource = new FsSource(localPath, this.logFn);
            const fileNames = [
                ensured.projectSection.builders,
                ensured.projectSection.headers,
                ensured.projectSection.resource,
                ensured.projectSection.source].join(",");
            const fileEntries = await localSource.findFiles(fileNames, ensured.projectSection.exclude);
            for (const fileEntry of fileEntries) {
                const fileName = path.join(localPath, fileEntry.filename);
                zipApi.addFile(fileName, fileEntry.filename);
            }
            zipApi.stop();
            if (await zipFinished) {
                // 1. upload zipFileName
                if (await Synchronizer.acquire(this.logFn).uploadFiles(ensured, [zipFileName])) {
                    // 2. unzip
                    const sshHelperType = await GetSshHelperType();
                    if (!sshHelperType) {
                        return false;
                    }
                    const sshHelper = new sshHelperType(this.logFn);
                    const shell = await sshHelper.getDefaultVmsShell(ensured.scope);
                    if (!shell) {
                        return false;
                    }
                    // set default directory for shell - project root
                    const converter = new VmsPathConverter(ensured.projectSection.root + ftpPathSeparator);
                    const cd = `set def ${converter.directory}`;
                    const answer = await shell.execCmd(cd);
                    if (!answer || answer.length === 0) {
                        return false;
                    }
                    const unzipResult = await shell.execCmd("unzip -oo " + zipFileName);
                    if (!unzipResult || unzipResult.length === 0) {
                        return false;
                    }
                    // 3. force set synchronized
                    ProjectState.acquire().setSynchronized(ensured.scope, true);
                    return true;
                }
            }
        }
        return false;
    }
}
