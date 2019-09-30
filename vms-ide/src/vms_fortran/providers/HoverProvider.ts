import { HoverProvider, TextDocument, Position, CancellationToken, Hover, Range, Uri, workspace } from "vscode";
import { SymbolKind, Facade } from "../context/Facade";
import { symbolDescriptionFromEnum } from '../context/Symbol';
import { Fortran } from '../extension';
import * as path from 'path';


export class FortranHoverProvider implements HoverProvider 
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
                data = info.name + ": " + info.info.name;                
            }
            else
            {
                if(info.info.definition)
                {
                    let startRow = info.info.definition.range.start.row-1;
                    let endRow = info.info.definition!.range.end.row;
                    let range = new Range(startRow, 0, endRow, 0);

                    data = info.name + ": " + document.getText(range).trim();
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

                data = document.getText(range).trim();
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

                const matcherTypeData = /^\s*\d*?\s*([a-zA-Z]+(\s*\*\s*\d+|\s*\(\s*\S+\s*\)|\s*\*\s*\(\s*(\d+|\*)\s*\))?)/;
                const matcherTypeDataColon = /^\s*\d*?\s*(.*\:\:)\s+/;
                const matcheVariable = /^\s*([a-zA-Z0-9$_]+\s*([\(\/]\s*[a-zA-Z0-9$_]+(\s*,\s*[a-zA-Z0-9$_]+\s*)*\s*[\)\/]|\s*\(\s*\*\s*\)|\s*\*\s*\d+|\s*\=(\>)?\s*.+)?)\s*(\,|\!)/;
                let type : string = "";
                let matches : RegExpMatchArray | null;

                if(data.includes("::"))
                {
                    matches = data.match(matcherTypeDataColon);
                }
                else
                {
                    matches = data.match(matcherTypeData);
                }                

                if(matches && matches.length > 1)
                {
                    type = matches[1];
                }
                
                data = data.substr(info.definition.range.start.column);

                // if(data.includes("/"))
                // {
                //     data = data.substr(0, data.indexOf("/"));
                // }
                // else 
                if(data.includes(",") || data.includes("!"))
                {
                    matches = data.match(matcheVariable);  

                    if(matches && matches.length > 1)
                    {
                        data = matches[1];
                    }
                } 
                
                data = type + " " + /*info.definition.text +*/ data;
                
                showParseData = true;
            }
        }

        const description = symbolDescriptionFromEnum(info.kind);
        return new Hover([
            "**" + description + "**\ndefined in: " + path.basename(info.source),
            { language: Fortran.language, value: (showParseData ? data : info.definition? info.definition.text : data) }
        ]);
    }
}

//^implisit(([a-z]+)\((([a-z])(\-[a-z])?)(\,([a-z])(\-[a-z])?)*\))+
//^implisit\s*(.+)