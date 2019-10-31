import { HoverProvider, TextDocument, Position, CancellationToken, Hover, workspace } from "vscode";
import { FacadeImpl } from "./Facade";
import * as path from 'path';

export class HoverProviderImpl implements HoverProvider {
    constructor(private backend: FacadeImpl) {
    }
    public async provideHover(document: TextDocument, position: Position, token: CancellationToken) {
        let info = this.backend.symbolInfoAtPosition(document.fileName, position.character, position.line);
        if (info) {
            let defStr = "";
            if (info.definition) {
                if (info.definition.source) {
                    defStr = workspace.asRelativePath(info.definition.source);
                }
                if (info.definition.text) {
                    defStr = `defined in ${defStr}`;
                    if (info.definition.range) {
                        defStr += ` at ${info.definition.range.start.row + 1}:${info.definition.range.start.col + 1}`;
                    }
                } else {
                    defStr = `from ${defStr}`;
                }
            } 
            return new Hover([
                `**${info.kindString}** ${defStr}`,
                info.description
            ]);
        }
        return undefined;
    }
}
