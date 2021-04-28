import { 
    CancellationToken,
    Location,
    Position,
    ProviderResult,
    Range,
    ReferenceContext,
    ReferenceProvider,
    TextDocument,
} from 'vscode';
import { CldFacade } from './Facade';

export class CldReferenceProvider implements ReferenceProvider {
    constructor(private backend: CldFacade) { }

    provideReferences(document: TextDocument, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult<Location[]> {
        const occurences = this.backend.getSymbolOccurences(document.fileName, position.character, position.line + 1);
        const result: Location[] = [];
        if (occurences.length > 0 ) {
            // const master = occurences[0];
            // if (master.definition && 
            //     master.definition.range.start.row === position.line + 1 &&
            //     master.definition.range.start.column <= position.character &&
            //     master.definition.range.end.column > position.character) {
            //     // we point to the master
                for (let symbol of occurences) {
                    if (symbol.definition) {
                        let range = new Range(
                            symbol.definition.range.start.row - 1, symbol.definition.range.start.column,
                            symbol.definition.range.end.row - 1, symbol.definition.range.end.column
                        );
                        const loc: Location = {
                            range,
                            uri: document.uri,
                        };
                        result.push(loc);
                    }
                }
            // }
        }
        return result;
    }
}
