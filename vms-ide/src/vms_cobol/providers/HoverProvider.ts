import { HoverProvider, TextDocument, Position, CancellationToken, Hover, Range, Uri, workspace } from "vscode";
import { ContextFacade } from "../../common/parser/Facade";
import { ECobolSymbolKind, symbolDescriptionFromEnum } from '../context/Symbol';
import * as path from 'path';
import { Cobol } from "../extension";


export class CobolHoverProvider implements HoverProvider 
{
    constructor(private backend: ContextFacade<ECobolSymbolKind>) { }

    public async provideHover(document: TextDocument, position: Position, token: CancellationToken)//: ProviderResult<Hover>
    {
        let showParseData = false;
        let data : string = "";
        let info = this.backend.symbolInfoAtPosition(document.fileName, position.character + 1, position.line + 1);
        
        if (!info) 
        {
            return undefined;
        }

        const description = symbolDescriptionFromEnum(info.kind);
        return new Hover([
            "**" + description + "**\ndefined in: " + path.basename(info.source),
            { language: Cobol.language, value: (showParseData ? data : info.definition? info.definition.text : data) }
        ]);
    }
}
