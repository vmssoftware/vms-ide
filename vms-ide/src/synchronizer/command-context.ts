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

const contextMap = new Map<string, boolean>();

export function setContext(context: CommandContext, state: boolean) {
    contextMap.set(context, state);
    commands.executeCommand("setContext", context, state);
}

export function getContext(context: CommandContext): boolean {
    return !!contextMap.get(context);
}
