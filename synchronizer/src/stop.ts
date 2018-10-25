import { commands } from "vscode";

export enum CommandContext {
    stopEnabled = "open-vms.stopSync:enabled",
}

export function setStopCommand(enable: boolean) {
    commands.executeCommand("setContext", CommandContext.stopEnabled, enable);
}
