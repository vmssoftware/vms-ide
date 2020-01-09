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
        let data : string = "";
        let info = this.backend.symbolInfoAtPosition(document.fileName, position.character + 1, position.line + 1);
        
        if (!info) 
        {
            return undefined;
        }

        if(info.info)
        {
            if(info.info.source === "")
            {
                data = " " + info.name + ": " + info.info.name;
            }
            else
            {
                if(info.info.definition)
                {
                    let startRow = info.info.definition.range.start.row-1;
                    let endRow = info.info.definition!.range.end.row;
                    let range = new Range(startRow, 0, endRow, 0);

                    if(document.fileName !== info.source)
                    {
                        document = await workspace.openTextDocument(Uri.file(info.source));
                    }

                    let textData = document.getText(range).trim();
                    let textDataL = textData.toLowerCase();

                    if(textDataL.includes("implicit"))
                    {
                        data = " " + info.name + ": " + textData;
                    }
                }
            }

            info.kind = SymbolKind.VariableDcl;
            showParseData = true;
        }
        else if(info.kind === SymbolKind.RoutineDcl ||
             info.kind === SymbolKind.TypeBlockDcl ||
             info.kind === SymbolKind.ConstBlockDcl ||
             info.kind === SymbolKind.RoutineHeader)
        {
            if(info.definition)
            {
                let startRow = info.definition.range.start.row-1;
                let endRow = info.definition.range.end.row;
                let range = new Range(startRow, 0, endRow, 0);

                data = " " + document.getText(range).trim();
            }
        }
        else
        {
            if(info.definition)
            {
                let startRow = info.definition.range.start.row-1;
                let endRow = info.definition.range.end.row;
                let range = new Range(startRow, 0, endRow, 0);

                if(document.fileName !== info.source)
                {
                    document = await workspace.openTextDocument(Uri.file(info.source));
                }

                data = document.getText(range);

                const matcheVariable = /^\s*([a-zA-Z0-9$_]+\s*([\(\/]\s*[a-zA-Z0-9$_]+(\s*,\s*[a-zA-Z0-9$_]+\s*)*\s*[\)\/]|\s*\*?\(\s*\*\s*\)|\s*\*\s*\d+|\s*\=(\>)?\s*.+|\(.+\))?)\s*(\,|\!)/;
                let matches : RegExpMatchArray | null;
                
                data = data.substr(info.definition.range.start.column);

                if(data.includes(",") || data.includes("!"))
                {
                    matches = data.match(matcheVariable);

                    if(matches && matches.length > 1)
                    {
                        data = matches[1];
                    }
                }

                if(info.type)
                {
                    data = info.type + " " + data;
                }
                
                showParseData = true;
            }
        }

        let positionInfo = "";
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