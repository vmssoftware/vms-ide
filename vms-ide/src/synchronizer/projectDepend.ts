import { Event } from "vscode";

let _projectDependenciesChanged: Event<void> | undefined;

export function projectDependenciesChanged(): Event<void> | undefined {
    return _projectDependenciesChanged;
}

export function setProjectDependenciesChanged(value: Event<void> | undefined) {
    _projectDependenciesChanged = value;
}