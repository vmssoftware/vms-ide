import { commands } from "vscode";

export enum CommandContext {
    isInAction = "vmssoftware.synchronizer.isInAction",
    // isSyncronizing = "vmssoftware.synchronizer.isSync",
    // isBuilding = "vmssoftware.synchronizer.isBuild",
    // isSaving = "vmssoftware.synchronizer.isSaving",
    // isCrLf = "vmssoftware.synchronizer.isCrLf",
    // isEdit = "vmssoftware.synchronizer.isEdit",
    // isHeaders = "vmssoftware.synchronizer.isHeaders",
}

export function setContext(context: CommandContext, state: boolean) {
    commands.executeCommand("setContext", context, state);
}
