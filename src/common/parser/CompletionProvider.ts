import { FacadeImpl } from "./Facade";
import { TextDocument, Position, CancellationToken, ProviderResult, CompletionList, CompletionItem } from "vscode";

export class CompletionItemProviderImpl 
{
    constructor(private backend: FacadeImpl) { }

    public provideCompletionItems(document: TextDocument, position: Position, token: CancellationToken): ProviderResult<CompletionList> 
    {
        let candidates = this.backend.getCodeCompletionCandidates(document.fileName, position.character, position.line);
        let completionList: CompletionItem[] = [];

        candidates.forEach(candidate => {
            let item = new CompletionItem(candidate.candidate);
            item.detail = candidate.description;
            completionList.push(item);
        });

        return new CompletionList(completionList, false);
    }
}
