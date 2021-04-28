import { ExtensionContext } from "vscode";

export let contextSaved: ExtensionContext | undefined;

export function setExtensionContext(context: ExtensionContext) {
    contextSaved = context;
}
