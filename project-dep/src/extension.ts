
import * as vscode from "vscode";

import { ProjDepProvider } from "./project-dep";
import { ProjDescrProvider } from "./project-descr";

export function activate(context: vscode.ExtensionContext) {

    const projectDependenciesProvider = new ProjDepProvider();
    const projectDescriptionProvider = new ProjDescrProvider();

    vscode.window.registerTreeDataProvider("vmssoftware.project-dep.projectDependencies", projectDependenciesProvider);
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.select", (element) => projectDependenciesProvider.select(element));
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.add", (element) => projectDependenciesProvider.add(element));
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.remove", (element) => projectDependenciesProvider.remove(element));
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.refresh", () => projectDependenciesProvider.refresh());

    vscode.window.registerTreeDataProvider("vmssoftware.project-dep.projectDescription", projectDescriptionProvider);
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.select", (projectName) => projectDescriptionProvider.select(projectName));
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.refresh", () => projectDescriptionProvider.refresh());
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.edit", () => projectDescriptionProvider.edit());
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.changeBuildType", () => projectDescriptionProvider.changeBuildType());
}
