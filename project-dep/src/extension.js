"use strict";
exports.__esModule = true;
var vscode = require("vscode");
var project_dep_1 = require("./project-dep");
var project_descr_1 = require("./project-descr");
function activate(context) {
    var projectDependenciesProvider = new project_dep_1.ProjDepProvider();
    var projectDescriptionProvider = new project_descr_1.ProjDescrProvider();
    vscode.window.registerTreeDataProvider("vmssoftware.project-dep.projectDependencies", projectDependenciesProvider);
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.select", function (element) { return projectDependenciesProvider.select(element); });
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.add", function (element) { return projectDependenciesProvider.add(element); });
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.remove", function (element) { return projectDependenciesProvider.remove(element); });
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDependencies.refresh", function () { return projectDependenciesProvider.refresh(); });
    vscode.window.registerTreeDataProvider("vmssoftware.project-dep.projectDescription", projectDescriptionProvider);
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.select", function (projectName) { return projectDescriptionProvider.select(projectName); });
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.refresh", function () { return projectDescriptionProvider.refresh(); });
    vscode.commands.registerCommand("vmssoftware.project-dep.projectDescription.edit", function () { return projectDescriptionProvider.edit(); });
}
exports.activate = activate;
