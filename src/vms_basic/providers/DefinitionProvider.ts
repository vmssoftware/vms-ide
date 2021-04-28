import { TextDocument, Position, CancellationToken, Range, Location, Uri, ProviderResult, DefinitionProvider } from 'vscode';
import { Facade } from '../context/Facade';

export class BasicDefinitionProvider implements DefinitionProvider
{
    constructor(private backend: Facade) { }

    public provideDefinition(document: TextDocument, position: Position, token: CancellationToken): ProviderResult<Location> 
    {
        let info = this.backend.symbolInfoAtPosition(document.fileName, position.character + 1, position.line + 1);

        if (!info) 
        {
            return undefined;
        }

        if (info.definition) 
        {
            let range = new Range(
                info.definition.range.start.row - 1, info.definition.range.start.column,
                info.definition.range.end.row - 1, info.definition.range.end.column
            );
            return new Location(Uri.file(info.source), range);
        } 
        else 
        {
            // Empty for built-in entities or self-define attempts.
            return new Location(document.uri, position);
        }
    }
}
