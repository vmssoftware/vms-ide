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
import { Facade } from '../context/Facade';

export class FortranReferenceProvider implements ReferenceProvider 
{
    constructor(private backend: Facade) { }

    public provideReferences(document: TextDocument, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult<Location[]> 
    {
        const occurences = this.backend.getSymbolOccurences(document.fileName, position.character, position.line + 1);
        const result: Location[] = [];
        
        if (occurences.length > 0 ) 
        {
            for (let symbol of occurences) 
            {
                if (symbol.definition) 
                {
                    let range = new Range(
                        symbol.definition.range.start.row - 1, symbol.definition.range.start.column,
                        symbol.definition.range.end.row - 1, symbol.definition.range.end.column
                    );

                    const loc: Location = {
                        range,
                        uri: Uri.file(symbol.source),
                    };

                    result.push(loc);
                }
            }
        }
        
        return result;
    }
}
