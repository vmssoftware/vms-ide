import { TextDocument, Position, CancellationToken, Range, Location, Uri, ProviderResult, DefinitionProvider } from 'vscode';
import { FacadeImpl } from './Facade';

export class DefinitionProviderImpl implements DefinitionProvider {
    constructor(private backend: FacadeImpl) { 
    }
    public provideDefinition(document: TextDocument, position: Position, token: CancellationToken): ProviderResult<Location> {
        let info = this.backend.symbolInfoAtPosition(document.fileName, position.character, position.line);
        if (info && info.definition) {
            let range = new Range(
                info.definition.range.start.row, info.definition.range.start.col,
                info.definition.range.end.row, info.definition.range.end.col
            );
            return new Location(Uri.file(info.source), range);
        }
        return undefined;
    }
}
