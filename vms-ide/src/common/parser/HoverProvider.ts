import { HoverProvider, TextDocument, Position, CancellationToken, Hover } from "vscode";
import { FacadeImpl } from "./Facade";
import * as path from 'path';

export class HoverProviderImpl implements HoverProvider {
    constructor(private backend: FacadeImpl) {
    }
    public async provideHover(document: TextDocument, position: Position, token: CancellationToken) {
        let info = this.backend.symbolInfoAtPosition(document.fileName, position.character, position.line);
        if (info) {
            let defStr = `defined`;
            if (info.source) {
                defStr = ` in ${path.basename(info.source)}`;
            }
            if (info.definition) {
                defStr += ` at ${info.definition.range.start.row + 1}:${info.definition.range.start.column + 1}`;
            }
            return new Hover([
                `**${info.kindString}** ${defStr}`,
                info.description
            ]);
        }
        return undefined;
    }
}
