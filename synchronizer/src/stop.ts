import { commands } from "vscode";

export enum CommandContext {
    isSyncronizing = "open-vms.isSync",
    isBuilding = "open-vms.isBuild",
}

export function setSynchronizing(state: boolean) {
    commands.executeCommand("setContext", CommandContext.isSyncronizing, state);
}

export function setBuilding(state: boolean) {
    commands.executeCommand("setContext", CommandContext.isBuilding, state);
}
