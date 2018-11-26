import { commands } from "vscode";

export enum CommandContext {
    isSyncronizing = "vmssoftware.synchronizer.isSync",
    isBuilding = "vmssoftware.synchronizer.isBuld",
    isSaving = "vmssoftware.synchronizer.isSaving",
    isCrLf = "vmssoftware.synchronizer.isCrLf",
}

export function setContext(context: CommandContext, state: boolean) {
    commands.executeCommand("setContext", context, state);
}
