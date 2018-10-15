import { ConnectConfig } from "ssh2";
import { inspect } from "util";
import { Lock } from "./../common/lock";
import { IConnectConfigResolver } from "./connect-config-resolver";
import { ISettingsFiller } from "./settings-filler";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

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
     * PasswordResolver
     * @param settingsFillers fillers
     * @param timeout timeout for feedback, in ms. else lock will be released and accepted set to false
     */
    constructor(protected settingsFillers?: ISettingsFiller[], protected timeout = 30000) {
    }

    /**
     * Resolve settings
     * @param settings settings to resolve, immutable
     * @returns new resolved settings, or undefined if unaccepted
     */
    public async resolveConnectConfig(settings: ConnectConfig): Promise<ConnectConfig | undefined> {

        let retConfig: ConnectConfig | undefined;

        const cacheStr = this.buildCacheString(settings);
        if (logFn) {
            logFn(`resolveConnectConfig: try ${cacheStr}`);
        }
        let node = settingsCache.get(cacheStr);
        if (!node) {
            if (logFn) {
                logFn(`resolveConnectConfig: create node ${cacheStr}`);
            }
            node = new SettingsCacheNode();
            settingsCache.set(cacheStr, node);
        }
        // acquire lock before testing accepted or not
        await node.lock.acquire();
        if (logFn) {
            logFn(`resolveConnectConfig: lock acquired ${cacheStr}`);
        }
        if (node.accepted === undefined) {
            // no one has resolved before
            if (logFn) {
                logFn(`resolveConnectConfig: first call ${cacheStr}`);
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
                        if (logFn) {
                            logFn(`resolveConnectConfig: filled ok ${cacheStr}`);
                        }
                        retConfig = node.settings;
                    } else {
                        // mark unaccepted, no feedback needed
                        if (logFn) {
                            logFn(`resolveConnectConfig: didn't filled ${cacheStr}`);
                        }
                        node.accepted = false;
                        if (logFn) {
                            logFn(`resolveConnectConfig: lock released (no feedback needed) ${cacheStr}`);
                        }
                        node.lock.release();
                    }
                    break;
                }
            } else {
                retConfig = node.settings;  // return it if there are no fillers
            }

            if (retConfig !== undefined) {
                // setup timer before return settings to the fisrt callee
                node.timer = setTimeout(() => {
                    if (node) {
                        if (logFn) { logFn(`resolveConnectConfig: lock released by timeout ${cacheStr}`); }
                        node.lock.release();
                        node.accepted = false;
                        delete node.timer;
                    }
                }, this.timeout);
            }
        } else {
            // non-first call, test if settings was accepted or not in first call
            if (logFn) {
                logFn(`resolveConnectConfig: second and other calls ${cacheStr}`);
                logFn(`resolveConnectConfig: acc=${node.accepted} ${cacheStr}`);
            }
            if (node.accepted) {
                retConfig = node.settings;
            }
            // release lock, feedback already provided
            if (logFn) {
                logFn(`resolveConnectConfig: lock released ${cacheStr}`);
            }
            node.lock.release();
        }

        // return config
        if (logFn) {
            logFn(`resolveConnectConfig: config returned ${cacheStr}`);
        }
        return retConfig;
    }

    /**
     * Receive feedback from one who used settings.
     * @param settings previous unresolved settings
     * @param accepted true if resolved settings was accepted
     */
    public feedBack(settings: ConnectConfig, accepted: boolean): void {
        const cacheStr = this.buildCacheString(settings);
        if (logFn) { logFn(`feedBack: element ${cacheStr} accepted=${accepted}`); }
        const node = settingsCache.get(cacheStr);
        if (node) {
            if (node.accepted === undefined) {
                node.accepted = accepted;
                if (logFn) { logFn(`feedback: lock released ${cacheStr}`); }
                node.lock.release();
            } else {
                if (logFn) { logFn(`feedback: already acc=${node.accepted} ${cacheStr}`); }
            }
            if (node.timer) {
                clearTimeout(node.timer);
                delete node.timer;
            }
        } else {
            if (logFn) { logFn(`feedBack: no node ${cacheStr}`); }
        }
    }

    /**
     * Remove bad entries
     */
    public clearCache(): boolean {
        if (logFn) { logFn(`clearCache: ${settingsCache.size}`); }
        for (const [key, node] of settingsCache) {
            if (node.canClear) {
                if (logFn) { logFn(`clearCache: delete ${key}`, inspect(node)); }
                // as a precaution
                node.lock.release();
                settingsCache.delete(key);
            }
        }
        return true;
    }

    /**
     * Build key string
     * @param settings
     */
    public buildCacheString(settings: ConnectConfig): string {
        return JSON.stringify(settings);
    }

}
