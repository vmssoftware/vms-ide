
import * as vscode from "vscode";

import { ProjApi } from "./proj-api";
import { ProjectState } from "./proj-state";
import { ProjDepProvider } from "./project-dep";
import { ProjDescrProvider } from "./project-descr";

export function activate(context: vscode.ExtensionContext) {

    const projectDependenciesProvider = new ProjDepProvider();
    const projectDescriptionProvider = new ProjDescrProvider();

    context.subscriptions.push( vscode.window.registerTreeDataProvider("vmssoftware.project-dep.projectDependencies", projectDependenciesProvider) );
    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.select",
        (element) => projectDependenciesProvider.select(element)) );
    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.add",
        (element) => projectDependenciesProvider.add(element)) );
    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.build",
        (element) => projectDependenciesProvider.build(element)) );
    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.clean",
        (element) => projectDependenciesProvider.clean(element)) );
    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.remove",
        (element) => projectDependenciesProvider.remove(element)) );
    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.refresh",
        () => projectDependenciesProvider.refresh()) );

    context.subscriptions.push( vscode.window.registerTreeDataProvider("vmssoftware.project-dep.projectDescription", projectDescriptionProvider) );
    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.select",
        (projectName) => projectDescriptionProvider.select(projectName)) );
    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.refresh",
        () => projectDescriptionProvider.refresh()) );
    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.edit",
        (element) => projectDescriptionProvider.edit(element)) );
    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.changeBuildType",
        () => projectDescriptionProvider.changeBuildType()) );

    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.project-dep.projectState.didSynchronize",
        (folderName: string) => ProjectState.acquire().setSynchronized(folderName)) );
    context.subscriptions.push( vscode.commands.registerCommand("vmssoftware.project-dep.projectState.didBuild",
        (folderName: string, buildType: string) => ProjectState.acquire().setBuilt(folderName, buildType)) );

    return new ProjApi();
}
