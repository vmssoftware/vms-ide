import { 
    CancellationToken,
    Location,
    Position,
    ProviderResult,
    Range,
    ReferenceContext,
    ReferenceProvider,
    TextDocument,
    Uri,
} from 'vscode';
import { FacadeImpl } from './Facade';

export class ReferenceProviderImpl implements ReferenceProvider {

    constructor(private backend: FacadeImpl) { 
    }

    public provideReferences(document: TextDocument, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult<Location[]> {
        const occurences = this.backend.getOccurencesUnderCursor(document.fileName, position.character, position.line);
        const result: Location[] = [];
        
        if (occurences.length > 0 ) {
            for (let ocuurance of occurences) {
                if (ocuurance.range) {
                    let range = new Range(
                        ocuurance.range.start.row, ocuurance.range.start.col,
                        ocuurance.range.end.row, ocuurance.range.end.col
                    );
                    const loc: Location = {
                        range,
                        uri: Uri.file(ocuurance.source),
                    };
                    result.push(loc);
                }
            }
        }

        return result;
    }
}
