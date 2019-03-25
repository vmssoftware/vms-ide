import { TextDocument, Position, CancellationToken, Range, Location, Uri, ProviderResult, DefinitionProvider } from 'vscode';
import { CldFacade } from './Facade';

export class CldDefinitionProvider implements DefinitionProvider {
    constructor(private backend: CldFacade) { }

    public provideDefinition(document: TextDocument, position: Position, token: CancellationToken): ProviderResult<Location> {
        let info = this.backend.symbolInfoAtPosition(document.fileName, position.character, position.line + 1);

        if (!info) {
            return undefined;
        }

        if (info.masterDefinition) {
            let range = new Range(
                info.masterDefinition.range.start.row - 1, info.masterDefinition.range.start.column,
                info.masterDefinition.range.end.row - 1, info.masterDefinition.range.end.column
            );
            return new Location(Uri.file(info.source), range);
        } else {
            // Empty for built-in entities or self-define attempts.
            // let position = new Position(0, 0);
            return new Location(document.uri, position);
        }
    }
}
