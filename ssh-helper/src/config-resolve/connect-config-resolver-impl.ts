import { ConnectConfig } from "ssh2";
import { inspect } from "util";

import { Lock } from "@vorfol/common";
import { LogType } from "@vorfol/common";

import { IConnectConfigResolver } from "./connect-config-resolver";
import { ISettingsFiller } from "./settings-filler";

import * as nls from "vscode-nls";
const localize = nls.loadMessageBundle();

class SettingsCacheNode {

    public lock: Lock = new Lock();         // locked until feedback
    public timer?: NodeJS.Timer;

    public settings?: ConnectConfig;
    public accepted?: boolean;

    public get canClear(): boolean {
        const ret =
            this.settings !== undefined &&  // user already has entered the password
            this.accepted === false;        // but it was not accepted
        return ret;
    }
}

export const settingsCache: Map<string, SettingsCacheNode> = new Map<string, SettingsCacheNode>();

// tslint:disable-next-line:max-classes-per-file
export class ConnectConfigResolverImpl implements IConnectConfigResolver {

    /**
     * Build key string
     * @param settings
     */
    public static buildCacheString(settings: ConnectConfig): string {
        return JSON.stringify(settings);
    }

    /**
     * Remove bad entries
     */
    public static clearCache(debugLog?: LogType): boolean {
        if (debugLog) {
            debugLog(`clearCache: ${settingsCache.size}`);
        }
        for (const [key, node] of settingsCache) {
            if (node.canClear) {
                if (debugLog) {
                    debugLog(localize("debug.clear", "clearCache: delete {0}", key), inspect(node));
                }
                // as a precaution
                node.lock.release();
                settingsCache.delete(key);
            }
        }
        return true;
    }

    /**
     * Receive feedback from one who used settings.
     * @param settings previous unresolved settings
     * @param accepted true if resolved settings was accepted
     */
    public static feedBack(settings: ConnectConfig, accepted: boolean, debugLog?: LogType): void {
        const cacheStr = ConnectConfigResolverImpl.buildCacheString(settings);
        if (debugLog) {
            debugLog(localize("debug.feedback", "feedBack: element {0} accepted={1}", cacheStr, accepted));
        }
        const node = settingsCache.get(cacheStr);
        if (node) {
            if (node.accepted === undefined) {
                node.accepted = accepted;
                if (debugLog) {
                    debugLog(localize("debug.feedback.lock", "feedback: lock released {0}", cacheStr));
                }
                node.lock.release();
            } else {
                if (debugLog) {
                    debugLog(localize("debug.feedback.already", "feedback: already acc={0} {1}", node.accepted, cacheStr));
                }
            }
            if (node.timer) {
                clearTimeout(node.timer);
                delete node.timer;
            }
        } else {
            if (debugLog) {
                debugLog(localize("debug.feedback.no", "feedBack: no node {0}", cacheStr));
            }
        }
    }

    /**
     * PasswordResolver
     * @param settingsFillers fillers
     * @param timeout timeout for feedback, in ms. else lock will be released and accepted set to false
     */
    constructor(public settingsFillers?: ISettingsFiller[], public timeout?: number, public debugLog?: LogType) {
    }

    public clearCache(): boolean {
        ConnectConfigResolverImpl.clearCache(this.debugLog);
        return true;
    }

    public feedBack(settings: ConnectConfig, accepted: boolean): void {
        ConnectConfigResolverImpl.feedBack(settings, accepted, this.debugLog);
    }

    /**
     * Resolve settings
     * @param settings settings to resolve, immutable
     * @returns new resolved settings, or undefined if unaccepted
     */
    public async resolveConnectConfig(settings: ConnectConfig): Promise<ConnectConfig | undefined> {

        let retConfig: ConnectConfig | undefined;

        const cacheStr = ConnectConfigResolverImpl.buildCacheString(settings);
        if (this.debugLog) {
            this.debugLog(localize("debug.resolve.start", "resolveConnectConfig: try {0}", cacheStr));
        }
        let node = settingsCache.get(cacheStr);
        if (!node) {
            if (this.debugLog) {
                this.debugLog(localize("debug.resolve.create_node", "resolveConnectConfig: create node {0}", cacheStr));
            }
            node = new SettingsCacheNode();
            settingsCache.set(cacheStr, node);
        }
        // acquire lock before testing accepted or not
        await node.lock.acquire();
        if (this.debugLog) {
            this.debugLog(localize("debug.resolve.lock", "resolveConnectConfig: lock acquired {0}", cacheStr));
        }
        if (node.accepted === undefined) {
            // no one has resolved before
            if (this.debugLog) {
                this.debugLog(localize("debug.resolve.first", "resolveConnectConfig: first call {0}", cacheStr));
            }
            node.settings = Object.assign({}, settings);
            if (this.settingsFillers) {
                for (const filler of this.settingsFillers) {
                    if (!filler.testSettings(node.settings)) {
                        // not for this filler implementation
                        continue;
                    }
                    const filled = await filler.fillSetting(node.settings);
                    if (filled) {
                        if (this.debugLog) {
                            this.debugLog(localize("debug.resolve.filled", "resolveConnectConfig: filled ok {0}", cacheStr));
                        }
                        retConfig = node.settings;
                    } else {
                        // mark unaccepted, no feedback needed
                        if (this.debugLog) {
                            this.debugLog(localize("debug.resolve.didnt", "resolveConnectConfig: didn't filled {0}", cacheStr));
                        }
                        node.accepted = false;
                        if (this.debugLog) {
                            this.debugLog(localize("debug.resolve.unlock", "resolveConnectConfig: lock released (no feedback needed) {0}", cacheStr));
                        }
                        node.lock.release();
                    }
                    break;
                }
            } else {
                retConfig = node.settings;  // return it if there are no fillers
            }

            if (this.timeout &&             // only if timeout period is provided
                retConfig !== undefined) {
                // setup timer before return settings to the fisrt callee
                node.timer = setTimeout(() => {
                    if (node) {
                        if (this.debugLog) {
                            this.debugLog(localize("debug.resolve.timeout", "resolveConnectConfig: lock released by timeout {0}", cacheStr));
                        }
                        node.lock.release();
                        node.accepted = false;
                        delete node.timer;
                    }
                }, this.timeout);
            }
        } else {
            // non-first call, test if settings was accepted or not in first call
            if (this.debugLog) {
                this.debugLog(localize("debug.resolve.second", "resolveConnectConfig: second and other calls {0}", cacheStr));
                this.debugLog(localize("debug.resolve.state", "resolveConnectConfig: acc={0} {1}", node.accepted, cacheStr));
            }
            if (node.accepted) {
                retConfig = node.settings;
            }
            // release lock, feedback already provided
            if (this.debugLog) {
                this.debugLog(localize("debug.resolve.unlock", "resolveConnectConfig: lock released {0}", cacheStr));
            }
            node.lock.release();
        }

        // return config
        if (this.debugLog) {
            this.debugLog(localize("debug.resolve.ret", "resolveConnectConfig: config returned {0}", cacheStr));
        }
        return retConfig;
    }

}
