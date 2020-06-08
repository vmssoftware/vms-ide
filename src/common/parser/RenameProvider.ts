import { TextDocument, Position, CancellationToken, Range, Uri, ProviderResult, WorkspaceEdit, RenameProvider } from 'vscode';
import { FacadeImpl } from './Facade';

export class RenameProviderImpl implements RenameProvider {
    constructor(private backend: FacadeImpl) {
    }
    public provideRenameEdits(document: TextDocument, position: Position, newName: string, token: CancellationToken): ProviderResult<WorkspaceEdit> {
        const occurences = this.backend.getOccurencesUnderCursor(document.fileName, position.character, position.line);
        if (occurences.length) {
            const result = new WorkspaceEdit();
            for (let occurance of occurences) {
                if (occurance.text && occurance.range) {
                    let range = new Range(
                        occurance.range.start.row, occurance.range.start.col,
                        occurance.range.end.row, occurance.range.end.col
                    );
                    let replaceName = newName;
                    if (occurance.quotas) {
                        replaceName = occurance.quotas + newName + occurance.quotas[occurance.quotas.length - 1];
                    }
                    result.replace(Uri.file(occurance.source), range, replaceName);
                }
            }
            return result;
        }
        return undefined;
    }
}
