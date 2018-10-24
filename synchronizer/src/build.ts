import fs from "fs";
import util from "util";
import { ExtensionContext, Uri, window, workspace } from "vscode";

import { LogType } from "./common/log-type";
import { IConfig } from "./config/config";
import { ProjectSection } from "./config/sections/project";
import { EnsureSettings } from "./ensure-settings";
import { ToOutputChannel } from "./output-channel";
import { FsSource } from "./sync/fs-source";

const createNewMmsString = "Create new MMS";  // TODO: localize

const fsReadFile = util.promisify(fs.readFile);

const defMmsFileName = "res/default.mms";

export async function BuildProject(context: ExtensionContext, config: IConfig, debugLog?: LogType) {
    // get current config
    await EnsureSettings(config);
    const projectSection = await config.get(ProjectSection.section);
    // get current values
    const project = projectSection ? projectSection.store() : undefined;
    if (ProjectSection.is(project) &&
        workspace.workspaceFolders &&
        workspace.workspaceFolders.length > 0) {
        // get list of builders
        const localSource = new FsSource(workspace.workspaceFolders[0].uri.fsPath, debugLog);
        const items = await localSource.findFiles(project.builders, project.exclude);
        const selectItems = items.map((file) => file.filename);
        selectItems.push(createNewMmsString);
        // select one
        const buildSelection = await window.showQuickPick(selectItems, { ignoreFocusOut: true, canPickMany: false});
        // create one if selected
        if (buildSelection === createNewMmsString) {
            const defMmsPath = context.asAbsolutePath(defMmsFileName);
            const content = await fsReadFile(defMmsPath).then((buff) => buff.toString("utf8")).catch(() => "! new MMS");
            return workspace.openTextDocument({language: "mms",  content})
                .then((doc) => {
                    return window.showTextDocument(doc)
                        .then(() => true);
                });
        }
        ToOutputChannel(`Select ${buildSelection}`);
        return true;
    } else {
        ToOutputChannel(`Cannot resolve configuration or current workspace folder`);
        return false;
    }
}
