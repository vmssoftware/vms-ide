import { TextDocument, Position, CancellationToken, Range, Location, Uri, ProviderResult, DefinitionProvider } from 'vscode';
import { MsgFacade } from './Facade';

export class MsgDefinitionProvider implements DefinitionProvider {
    constructor(private backend: MsgFacade) { }

    public provideDefinition(document: TextDocument, position: Position, token: CancellationToken): ProviderResult<Location> {
        let info = this.backend.symbolInfoAtPosition(document.fileName, position.character, position.line + 1);

        if (!info) {
            return undefined;
        }

        if (info.definition) {
            let range = new Range(
                info.definition.range.start.row - 1, info.definition.range.start.column,
                info.definition.range.end.row - 1, info.definition.range.end.column
            );
            return new Location(Uri.file(info.source), range);
        } else {
            // Empty for built-in entities.
            let position = new Position(0, 0);
            return new Location(Uri.parse(""), position);
        }
    }
}
