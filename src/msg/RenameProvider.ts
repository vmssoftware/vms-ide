import { TextDocument, Position, CancellationToken, Range, Location, Uri, ProviderResult, WorkspaceEdit, RenameProvider } from 'vscode';
import { MsgFacade, SymbolKind, SymbolInfo } from './Facade';

export class MsgRenameProvider implements RenameProvider {
    constructor(private backend: MsgFacade) { }

    public prepareRename(document: TextDocument, position: Position, token: CancellationToken): ProviderResult<Range | { range: Range, placeholder: string }> {
        let info = this.backend.symbolInfoAtPosition(document.fileName, position.character, position.line + 1);

        if (info && info.definition) {
            return new Range(
                info.definition.range.start.row - 1, 
                info.definition.range.start.column, 
                info.definition.range.end.row - 1,
                info.definition.range.end.column);
        }

        return undefined;
    }

    public provideRenameEdits(document: TextDocument, position: Position, newName: string,
        token: CancellationToken): ProviderResult<WorkspaceEdit> {
            const occurences = this.backend.getSymbolOccurences(document.fileName, position.character, position.line + 1);
            if (occurences.length) {
                const result = new WorkspaceEdit();
                for (let symbol of occurences) {
                    if (symbol.definition) {
                        let range = new Range(
                            symbol.definition.range.start.row - 1, symbol.definition.range.start.column,
                            symbol.definition.range.end.row - 1, symbol.definition.range.end.column
                        );
                        result.replace(Uri.file(symbol.source), range, newName);
                    }
                }
                return result;
            }
            return undefined;
    }
}
