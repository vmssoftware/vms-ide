"use strict";
exports.__esModule = true;
var vscode = require("vscode");
var dep_tree_1 = require("./dep-tree");
var ProjDepProvider = /** @class */ (function () {
    function ProjDepProvider() {
        this.didChangeTreeEmitter = new vscode.EventEmitter();
        this.projects = new dep_tree_1.DepTree();
        this.onDidChangeTreeData = this.didChangeTreeEmitter.event;
        if (vscode.workspace.workspaceFolders) {
            for (var _i = 0, _a = vscode.workspace.workspaceFolders; _i < _a.length; _i++) {
                var folder = _a[_i];
                this.projects.add(folder.name);
            }
        }
        this.load();
    }
    ProjDepProvider.prototype.getChildren = function (element) {
        var ret = [];
        if (!element) {
            for (var _i = 0, _a = this.projects.root.children.keys(); _i < _a.length; _i++) {
                var childName = _a[_i];
                ret.push({
                    name: childName
                });
            }
        }
        else {
            var node = this.projects.root.children.get(element.name);
            if (node) {
                for (var _b = 0, _c = node.children.keys(); _b < _c.length; _b++) {
                    var childName = _c[_b];
                    ret.push({
                        name: childName,
                        parent: element.name
                    });
                }
            }
        }
        return ret;
    };
    ProjDepProvider.prototype.getTreeItem = function (element) {
        var node = this.projects.root.children.get(element.name);
        if (node) {
            var item = new vscode.TreeItem(element.name, node.children.size > 0 ? vscode.TreeItemCollapsibleState.Collapsed : vscode.TreeItemCollapsibleState.None);
            item.contextValue = element.parent ? "depends" : "folder";
            item.command = {
                arguments: [element],
                command: "vmssoftware.project-dep.projectDependencies.select",
                title: ""
            };
            return item;
        }
        else {
            return new vscode.TreeItem("undefined", vscode.TreeItemCollapsibleState.None);
        }
    };
    ProjDepProvider.prototype.select = function (node) {
        this.selected = node;
        vscode.commands.executeCommand("vmssoftware.project-dep.projectDescription.select", node.name);
    };
    ProjDepProvider.prototype.add = function (node) {
        if (this.selected && !this.selected.parent && this.selected !== node) {
            this.projects.add(node.name, this.selected.name);
            this.didChangeTreeEmitter.fire();
            this.save();
        }
    };
    ProjDepProvider.prototype.remove = function (node) {
        if (node.parent) {
            var parentNode = this.projects.root.children.get(node.parent);
            if (parentNode) {
                parentNode.children["delete"](node.name);
            }
            this.didChangeTreeEmitter.fire();
            this.save();
        }
    };
    ProjDepProvider.prototype.refresh = function () {
        this.projects = new dep_tree_1.DepTree();
        if (vscode.workspace.workspaceFolders) {
            for (var _i = 0, _a = vscode.workspace.workspaceFolders; _i < _a.length; _i++) {
                var folder = _a[_i];
                this.projects.add(folder.name);
            }
        }
        this.load();
        this.didChangeTreeEmitter.fire();
    };
    ProjDepProvider.prototype.load = function () {
        var config = vscode.workspace.getConfiguration("vmssoftware.project-dep", null);
        var dependencies = config.get("dependencies");
        if (Array.isArray(dependencies)) {
            for (var _i = 0, dependencies_1 = dependencies; _i < dependencies_1.length; _i++) {
                var folder = dependencies_1[_i];
                if (typeof folder.folder === "string" && Array.isArray(folder.depends)) {
                    for (var _a = 0, _b = folder.depends; _a < _b.length; _a++) {
                        var depend = _b[_a];
                        this.projects.add(depend, folder.folder);
                    }
                }
            }
        }
    };
    ProjDepProvider.prototype.save = function () {
        var dependencies = [];
        for (var _i = 0, _a = this.projects.root.children; _i < _a.length; _i++) {
            var _b = _a[_i], name_1 = _b[0], node = _b[1];
            if (node.children.size > 0) {
                dependencies.push({
                    depends: new (Array.bind.apply(Array, [void 0].concat(node.children.keys())))(),
                    folder: name_1
                });
            }
        }
        var config = vscode.workspace.getConfiguration("vmssoftware.project-dep", null);
        config.update("dependencies", dependencies, false);
    };
    return ProjDepProvider;
}());
exports.ProjDepProvider = ProjDepProvider;
