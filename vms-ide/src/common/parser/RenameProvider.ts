import { TextDocument, Position, CancellationToken, Range, Uri, ProviderResult, WorkspaceEdit, RenameProvider } from 'vscode';
import { FacadeImpl } from './Facade';

export class RenameProviderImpl<T> implements RenameProvider {
    constructor(private backend: FacadeImpl<T>) {
    }
    public provideRenameEdits(document: TextDocument, position: Position, newName: string, token: CancellationToken): ProviderResult<WorkspaceEdit> {
        const occurences = this.backend.getSymbolOccurences(document.fileName, position.character, position.line);
        if (occurences.length) {
            const result = new WorkspaceEdit();
            for (let occurance of occurences) {
                let range = new Range(
                    occurance.range.start.row, occurance.range.start.column,
                    occurance.range.end.row, occurance.range.end.column
                );
                result.replace(document.uri, range, newName);
            }
            return result;
        }
        return undefined;
    }
}
