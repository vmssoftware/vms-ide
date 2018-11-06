
import { LogFunction, LogType } from "@vorfol/common";

import { EnsureSettings } from "./ensure-settings";
import { Perform } from "./performer";
import { Synchronizer } from "./sync/synchronizer";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

export async function StopSyncProject() {
    Synchronizer.acquire().disableRemote();
    return true;
}

export async function SyncProject(logFn?: LogFunction) {
    return Perform("save.all", logFn)
            .then((saved) => {
                if (saved) {
                    return Perform("syncronize", logFn);
                }
                return saved;
            });
}
