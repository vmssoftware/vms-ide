import * as nls from "vscode-nls";
import * as path from "path";
import * as fs from "fs-extra";

import { LogFunction, LogType, ftpPathSeparator } from "@vorfol/common";
import { ensureSettings } from "./ensure-settings";
import { GetSshHelperType } from "./ext-api/get-ssh-helper";
import { window, workspace, OpenDialogOptions } from "vscode";
import { Synchronizer } from "./sync/synchronizer";
import { VmsPathConverter } from "./vms/vms-path-converter";
import { setContext, CommandContext } from "./command-context";
import { TestExecResult } from "./common/TestExecResult";

nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export async function DownloadHeaders(scope: string, logFn: LogFunction, params: string) {
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
        for (let file of allHeaders) {
            // TODO: how to leave extension empty?!
            let fileOut = file;
            if (!file.includes(".")) {
                fileOut = file + ".";
            }
            result = await shell.execCmd(`library/extract=${file}/output=${fileOut} sys$library:${chosen}`);
            if (!TestExecResult(result)) {
                logFn(LogType.error, () => localize("file.extracted", "Extract failed: {0}", file));
            } else {
                logFn(LogType.information, () => localize("file.extracted", "Extracted: {0}", file));
            }
            if (synchronizer.stopIssued) {
                break;
            }
        }
        // 2. download it
        if (!synchronizer.stopIssued) {
            const outFolder = ensured.projectSection.outdir + ftpPathSeparator + libName;
            const downloadList = allHeaders.map((file) => outFolder + ftpPathSeparator + file);
            const downloaded = await synchronizer.downloadFiles(ensured, downloadList);
            if (downloaded) {
                // 3. move to chosen folder
                const formFolder = path.join(currentFolder.uri.fsPath, ensured.projectSection.outdir, libName);
                const toFolder = path.join(openUris[0].fsPath, libName);
                fs.move( formFolder, toFolder, {overwrite: true});
                // for (const file of allHeaders) {
                //     fs.move( path.join(formFolder, file), path.join(toFolder, file), {overwrite: true})
                //         .catch((error) => {
                //             logFn(LogType.error, () => String(error));
                //         })
                // }
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