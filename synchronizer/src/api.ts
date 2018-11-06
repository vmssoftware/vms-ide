import { ISource } from "./sync/source";

export interface ISources {
    local?: ISource;
    remote?: ISource;
}

export class Api {
    public async getSources() {
        const sync = require("./sync/synchronizer").Synchronizer.acquire();
        if (sync) {
            return sync.requestSources();
        }
        return undefined;
    }
}
