import { HoverProvider, TextDocument, Position, CancellationToken, Hover, Range, Uri, workspace } from "vscode";
import { SymbolKind, Facade, SymbolInfo } from "../context/Facade";
import { symbolDescriptionFromEnum } from '../context/Symbol';
import { Basic } from '../extension';
import * as path from 'path';


export class BasicHoverProvider implements HoverProvider 
{
    constructor(private backend: Facade) { }

    public async provideHover(document: TextDocument, position: Position, token: CancellationToken)//: ProviderResult<Hover>
    {
        let showParseData = false;
        let positionInfo = "";
        let data : string = "";
        let info = this.backend.symbolInfoAtPosition(document.fileName, position.character + 1, position.line + 1);
        
        if (!info) 
        {
            return undefined;
        }

        if(info.definitionBlock)
        {
            data = info.definitionBlock.text;

            if(info.type)
            {
                data = info.type + " " + data;
            }
            
            showParseData = true;
        }
        
        if(info.definition)
        {
            if (info.definition.range) 
            {
                positionInfo += ` at ${info.definition.range.start.row}:${info.definition.range.start.column}`;
            }
        }

        const description = symbolDescriptionFromEnum(info.kind);
        return new Hover([
            "**" + description + "**\ndefined in: " + path.basename(info.source) + positionInfo,
            { language: Basic.language, value: (showParseData ? data : info.definition? info.definition.text : data) }
        ]);
    }
}