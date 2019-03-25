import { commands } from "vscode";

export enum CommandContext {
    isSingleRoot = "vmssoftware.isSingleRoot",
    isTestEnabled = "vmssoftware.config-helper.test:enabled",
}

export function setContext(context: CommandContext, state: boolean) {
    commands.executeCommand("setContext", context, state);
}
