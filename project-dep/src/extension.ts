
import * as vscode from "vscode";

import { ProjDepProvider } from "./project-dep";
// import { ProjDescrProvider } from "./project-descr";

export function activate(context: vscode.ExtensionContext) {

    const projectDependenciesProvider = new ProjDepProvider();
    // const projectDescriptionProvider = new ProjDescrProvider();

    vscode.window.registerTreeDataProvider("vmssoftware.project-dep.projectDependencies", projectDependenciesProvider);
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.select", (node) => projectDependenciesProvider.select(node));
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.add", (node) => projectDependenciesProvider.add(node));
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.remove", (node) => projectDependenciesProvider.remove(node));
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.refresh", () => projectDependenciesProvider.refresh());

    // vscode.window.registerTreeDataProvider("vmssoftware.project-dep.projectDescription", projectDescriptionProvider);
    // vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.select", (node) => projectDescriptionProvider.select(node));
    // vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.refresh", () => projectDescriptionProvider.refresh());
    // vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.edit", () => projectDescriptionProvider.edit());
}
