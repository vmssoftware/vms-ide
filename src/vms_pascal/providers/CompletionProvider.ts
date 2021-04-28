
import { TextDocument, Position, CancellationToken, CompletionItem, ProviderResult, CompletionList } from 'vscode';
import { Facade } from '../context/Facade';
import { translateCompletionKind } from '../context/Symbol';

// Determines the sort order in the completion list. One value for each SymbolKind.
const sortKeys = [
    "99", // Other
];

// Descriptions for each symbol kind.
const details = [
    "Other",
];

export class PascalCompletionItemProvider 
{
    constructor(private backend: Facade) { }

    public provideCompletionItems(document: TextDocument, position: Position, token: CancellationToken): ProviderResult<CompletionList> 
    {
        let candidates = this.backend.getCodeCompletionCandidates(document.fileName, position.character, position.line + 1);
        let completionList: CompletionItem[] = [];

        candidates.forEach(info => {
            let item = new CompletionItem(info.name.toLowerCase(), translateCompletionKind(info.kind));
            item.sortText = sortKeys[info.kind] + info.name;
            item.detail = (info.description !== undefined) ? info.description : details[info.kind];
            completionList.push(item);
        });

        return new CompletionList(completionList, false);
    }
}
