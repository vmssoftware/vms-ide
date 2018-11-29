import { ensureSettings } from "../ensure-settings";
import { ISource, sourceType } from "./source";

export class SourceHelper {
    public async getSource(scope: string, type: sourceType): Promise<ISource | undefined> {
        const sync = require("./synchronizer").Synchronizer.acquire();
        const ensured = ensureSettings(scope);
        if (sync && ensured) {
            return sync.requestSource(ensured, type);
        }
        return undefined;
    }
}
