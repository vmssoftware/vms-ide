import { TextDocument, Position, CancellationToken, Range, Uri, ProviderResult, WorkspaceEdit, RenameProvider } from 'vscode';
import { FacadeImpl } from './Facade';

export class RenameProviderImpl implements RenameProvider {
    constructor(private backend: FacadeImpl) {
    }
    public provideRenameEdits(document: TextDocument, position: Position, newName: string, token: CancellationToken): ProviderResult<WorkspaceEdit> {
        const occurences = this.backend.getSymbolOccurences(document.fileName, position.character, position.line);
        if (occurences.length) {
            const result = new WorkspaceEdit();
            for (let occurance of occurences) {
                if (occurance.source === document.fileName &&
                    occurance.text &&
                    occurance.range && 
                    occurance.range.start.row === occurance.range.end.row &&
                    occurance.range.end.col - occurance.range.start.col === occurance.text.length) {
                    let range = new Range(
                        occurance.range.start.row, occurance.range.start.col,
                        occurance.range.end.row, occurance.range.end.col
                    );
                    result.replace(document.uri, range, newName);
                } else {
                    // do not allow any renamings if one fails
                    return undefined;
                }
            }
            return result;
        }
        return undefined;
    }
}
