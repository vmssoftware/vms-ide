import { TextDocument, Position, CancellationToken, Range, Uri, ProviderResult, WorkspaceEdit, RenameProvider } from 'vscode';
import { Facade } from '../context/Facade';

export class PascalRenameProvider implements RenameProvider 
{
    constructor(private backend: Facade) { }

    public provideRenameEdits(document: TextDocument, position: Position, newName: string,
        token: CancellationToken): ProviderResult<WorkspaceEdit> 
    {
        const occurences = this.backend.getSymbolOccurences(document.fileName, position.character, position.line + 1);

        if (occurences.length) 
        {
            const result = new WorkspaceEdit();

            for (let symbol of occurences) 
            {
                if (symbol.definition) 
                {
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
