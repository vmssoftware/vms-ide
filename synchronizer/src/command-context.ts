import { commands } from "vscode";

export enum CommandContext {
    isSyncronizing = "vmssoftware.synchronizer.isSync",
    isBuilding = "vmssoftware.synchronizer.isBuld",
    isSaving = "vmssoftware.synchronizer.isSaving",
}

export function setContext(context: CommandContext, state: boolean) {
    commands.executeCommand("setContext", context, state);
}
