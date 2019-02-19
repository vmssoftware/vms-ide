import * as path from 'path';
import { HoverProvider, TextDocument, Position, CancellationToken, ProviderResult, Hover } from "vscode";
import { MsgFacade } from "./MsgFacade";
import { symbolDescriptionFromEnum } from './Symbol';

export class MsgHoverProvider implements HoverProvider {
    constructor(private backend: MsgFacade) { }

    public provideHover(document: TextDocument, position: Position, token: CancellationToken): ProviderResult<Hover> {
        let info = this.backend.symbolInfoAtPosition(document.fileName, position.character, position.line + 1, true);
        if (!info) {
            return undefined;
        }

        // const description = symbolDescriptionFromEnum(info.kind);
        return new Hover([
            info.description? info.description : info.name,
            { language: "msg", value: info.name }
        ]);
    }
}
