import fs from "fs";
import util from "util";
import { ExtensionContext, workspace } from "vscode";

const fsReadFile = util.promisify(fs.readFile);

const command = "VMS.stopSync";
let enablerSection: string | undefined;
let enablerName: string | undefined;

function findOutEnabler(context: ExtensionContext) {
    const packageFile = context.asAbsolutePath("package.json");
    fsReadFile(packageFile).then((buffer) => {
        const content = buffer.toString("utf8");
        const packageData = JSON.parse(content);
        const menu: any[] = packageData.contributes.menus.commandPalette;
        for (const cmd of menu) {
            if (cmd.command === command) {
                const when = cmd.when;
                const [_, section, ...enablerPath] = when.split(".");
                enablerSection = section;
                enablerName = enablerPath.join(".");
                break;
            }
        }
    }).catch(() => {
        enablerName = undefined;
    });
}

export function setStopCommand(context: ExtensionContext, enable: boolean) {
    if (enablerName === undefined ||
        enablerSection === undefined) {
        findOutEnabler(context);
    }
    if (enablerSection !== undefined &&
        enablerName !== undefined) {
        const configuration = workspace.getConfiguration(enablerSection);
        configuration.update(enablerName, enable, false); // save to workspace
    }
}
