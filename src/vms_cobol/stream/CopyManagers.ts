import { ICopyManager } from "./cobolInputStream";
import { CopyManagerImpl } from "./CopyManagerImpl";

const _copyManagers = new Map<string, ICopyManager>();

export function GetCopyManager(scopeName: string, scopePath?: string): ICopyManager | undefined {
    let copyManager = _copyManagers.get(scopeName);
    if (!copyManager && scopePath) {
        copyManager = new CopyManagerImpl(scopePath);
        _copyManagers.set(scopeName, copyManager);
    }
    return copyManager;
}