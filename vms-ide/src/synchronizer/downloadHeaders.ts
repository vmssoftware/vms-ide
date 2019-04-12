import * as fs from "fs-extra";
import * as path from "path";
import * as nls from "vscode-nls";

import { OpenDialogOptions, window, workspace } from "vscode";

import { ftpPathSeparator, LogFunction, LogType } from "../common/main";

import { GetSshHelperType } from "../ext-api/ext-api";
import { CommandContext, setContext } from "./command-context";
import { TestExecResult } from "./common/TestExecResult";
import { ensureSettings } from "./ensure-settings";
import { Synchronizer } from "./sync/synchronizer";
import { VmsPathConverter } from "./vms/vms-path-converter";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export async function DownloadHeaders(scope: string | undefined, logFn: LogFunction) {
    // tslint:disable-next-line:no-empty
    logFn = logFn || (() => {});
    if (!scope) {
        if (workspace.workspaceFolders && workspace.workspaceFolders.length) {
            scope = workspace.workspaceFolders[0].name;
        }
    }
    const ensured = await ensureSettings(scope, logFn);
    if (ensured) {
        if (!ensured.configHelper.workspaceFolder) {
            return false;
        }

        const synchronizer = Synchronizer.acquire(logFn);
        synchronizer.enableRemote();

        const currentFolder = ensured.configHelper.workspaceFolder;
        const sshHelperType = await GetSshHelperType();
        if (!sshHelperType) {
            logFn(LogType.error, () => localize("ssh-helper.failed", "The extension vmssoftware.ssh-helper isn't found."));
            return false;
        }
        const sshHelper = new sshHelperType(logFn);
        sshHelper.clearPasswordCache();
        const shell = await sshHelper.getDefaultVmsShell(ensured.scope);
        if (!shell) {
            logFn(LogType.error, () => localize("shell.failed", "Cannot create remote shell."));
            return false;
        }
        let result = await shell.execCmd("dir sys$library:*.tlb/col=1");
        if (!TestExecResult(result)) {
            logFn(LogType.information, () => localize("no-result", "Cannot execute command to get TLB files"));
            shell.dispose();
            return false;
        }
        const allTlb = result!.filter((line) => line.toLowerCase().includes(".tlb;"));
        if (!allTlb || !allTlb.length) {
            logFn(LogType.information, () => localize("no-tlb", "No *.TLB files found in SYS$LIBRARY"));
        }
        const chosen = await window.showQuickPick(allTlb);
        if (!chosen) {
            shell.dispose();
            return false;
        }
        const libName = VmsPathConverter.fromVms(chosen).fileName;
        result = await shell.execCmd("library/list sys$library:" + chosen);
        if (!TestExecResult(result) || result!.length < 8) {
            logFn(LogType.information, () => "No files in list" );
            shell.dispose();
            return false;
        }
        const allHeaders = result!.slice(8).filter((line) => !!line);
        // const information = allHeaders.join("\n");
        // logFn(LogType.information, () => information);

        const options: OpenDialogOptions = {
            canSelectFolders: true,
            canSelectMany: false,
            defaultUri: currentFolder.uri,
        };
        const openUris = await window.showOpenDialog(options);
        if (!openUris || !openUris.length) {
            shell.dispose();
            return false;
        }

        const converter = new VmsPathConverter(ensured.projectSection.root + ftpPathSeparator);
        let cd = `set def ${converter.directory}`;
        result = await shell.execCmd(cd);
        if (!TestExecResult(result)) {
            logFn(LogType.error, () => localize("cd.failed", "Cannot set default directory."));
            shell.dispose();
            return false;
        }

        // create temporary dir for extracting
        const createDir = `create/dir [.${ensured.projectSection.outdir}.${libName}]`;
        result = await shell.execCmd(createDir);
        if (!TestExecResult(result)) {
            logFn(LogType.error, () => localize("create.failed", "Cannot create output directory."));
            shell.dispose();
            return false;
        }

        cd = `set def [.${ensured.projectSection.outdir}.${libName}]`;
        result = await shell.execCmd(cd);
        if (!TestExecResult(result)) {
            logFn(LogType.error, () => localize("cd.failed", "Cannot set default directory."));
            shell.dispose();
            return false;
        }

        setContext(CommandContext.isSyncronizing, true);
        // 1. extract each file (TODO: how to do it in one command?)
        const outFolder = ensured.projectSection.outdir + ftpPathSeparator + libName;
        const downloadList: string[] = [];
        // let max = 5;
        for (const file of allHeaders) {
            // how to leave extension empty?!
            let fileOut = file;
            if (!file.includes(".")) {  // adding dot to the end of the file prevents LIBRARY to add weird extension
                fileOut = file + ".";   // also BOSTON-like ftp server won't try to download .DIR instead
            }
            result = await shell.execCmd(`library/extract=${file}/output=${fileOut} sys$library:${chosen}`);
            if (!TestExecResult(result)) {
                logFn(LogType.error, () => localize("file.extracted", "Extract failed: {0}", file));
            } else {
                logFn(LogType.information, () => localize("file.extracted", "Extracted: {0}", file));
                // push to download list only good files, and with "." at the end if it needs
                downloadList.push(outFolder + ftpPathSeparator + fileOut);
            }
            if (synchronizer.stopIssued) {
                break;
            }
            // if (!--max) {
            //     break;
            // }
        }
        // 2. download it
        if (!synchronizer.stopIssued) {
            const downloaded = await synchronizer.downloadFiles(ensured, downloadList);
            if (downloaded) {
                // 3. move to chosen folder
                const toFolder = path.join(openUris[0].fsPath, libName);
                // fs.move( formFolder, toFolder, {overwrite: true});
                for (let file of downloadList) {
                    const from = path.join(currentFolder.uri.fsPath, file);
                    // remove DOT-only extension
                    const converterI = new VmsPathConverter(file);
                    if (converterI.fileExt === ".") {
                        file = converterI.fileName;
                    } else {
                        file = converterI.file;
                    }
                    const to = path.join(toFolder, file);
                    fs.move( from, to, {overwrite: true})
                        .catch((error) => {
                            logFn(LogType.error, () => String(error));
                        });
                }
            }
        }
        // 4. clean
        await shell.execCmd(`set default sys$login`);
        if (!TestExecResult(result)) {
            logFn(LogType.error, () => localize("cd.failed", "Cannot set default directory."));
        }
        await shell.execCmd(`set default ${converter.directory}`);
        if (!TestExecResult(result)) {
            logFn(LogType.error, () => localize("cd.failed", "Cannot set default directory."));
        }
        const delTree = `del/tree [.${ensured.projectSection.outdir}.${libName}...]*.*;*`;
        result = await shell.execCmd(delTree);
        if (!TestExecResult(result)) {
            logFn(LogType.information, () => localize("del.failed", "Cannot delete intermediate files: {0}", `[${ensured.projectSection.outdir}.${libName}]`));
        }
        logFn(LogType.information, () => localize("done", "Done."));
        setContext(CommandContext.isSyncronizing, false);
        shell.dispose();
        return true;
    }
    return false;
}
