import { ISource, sourceType } from "./source";

export class SourceHelper {
    public async getSource(type: sourceType): Promise<ISource | undefined> {
        const sync = require("./synchronizer").Synchronizer.acquire();
        if (sync) {
            return sync.requestSource(type);
        }
        return undefined;
    }
}
