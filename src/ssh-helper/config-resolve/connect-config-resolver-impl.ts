import { inspect } from "util";

import { Lock } from "../../common/main";
import { LogFunction, LogType } from "../../common/main";

import { IConnectConfig, IConnectConfigResolver, ResolverState } from "../api";
import { ISettingsFiller } from "./settings-filler";

import * as nls from "vscode-nls";
nls.config({messageFormat: nls.MessageFormat.both});
const localize = nls.loadMessageBundle();

class SettingsCacheNode {

    public lock: Lock = new Lock();         // locked until feedback
    public timer?: NodeJS.Timer;

    public settings?: IConnectConfig;
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
export class ConnectConfigResolverImpl implements IConnectConfigResolver<IConnectConfig> {

    /**
     * Build key string
     * @param settings
     */
    public static buildCacheString(settings: IConnectConfig): string {
        return JSON.stringify(settings);
    }

    /**
     * Remove bad entries
     */
    public static clearCache(logFn?: LogFunction): boolean {
        if (logFn) {
            logFn(LogType.debug, () => `clearCache: ${settingsCache.size}`);
        }
        for (const [key, node] of settingsCache) {
            if (node.canClear) {
                if (logFn) {
                    logFn(LogType.debug, () => localize("debug.clearcache", "clearCache: delete {0}", key));
                    logFn(LogType.debug, () => inspect(node));
                }
                // as a precaution
                node.lock.release();
                settingsCache.delete(key);
            }
        }
        return true;
    }

    /**
     * Remove ALL entries
     */
    public static killCache(logFn?: LogFunction): boolean {
        if (logFn) {
            logFn(LogType.debug, () => `killCache: ${settingsCache.size}`);
        }
        for (const [key, node] of settingsCache) {
            if (logFn) {
                logFn(LogType.debug, () => localize("debug.killcache", "killCache: delete {0}", key));
                logFn(LogType.debug, () => inspect(node));
            }
            // as a precaution
            node.lock.release();
        }
        settingsCache.clear();
        return true;
    }

    /**
     * Receive feedback from one who used settings.
     * @param settings previous unresolved settings
     * @param accepted true if resolved settings was accepted
     */
    public static feedBack(settings: IConnectConfig, accepted: boolean, logFn?: LogFunction): void {
        const cacheStr = ConnectConfigResolverImpl.buildCacheString(settings);
        if (logFn) {
            logFn(LogType.debug, () => localize("debug.feedback", "feedBack: element {0} accepted={1}", cacheStr, accepted));
        }
        const node = settingsCache.get(cacheStr);
        if (node) {
            if (node.accepted === undefined) {
                node.accepted = accepted;
                if (logFn) {
                    logFn(LogType.debug, () => localize("debug.feedback.lock", "feedback: lock released {0}", cacheStr));
                }
                node.lock.release();
            } else {
                if (logFn) {
                    logFn(LogType.debug, () => localize("debug.feedback.already", "feedback: already acc={0} {1}", node.accepted, cacheStr));
                }
            }
            if (node.timer) {
                clearTimeout(node.timer);
                delete node.timer;
            }
        } else {
            if (logFn) {
                logFn(LogType.debug, () => localize("debug.feedback.no", "feedBack: no node {0}", cacheStr));
            }
        }
    }

    public logFn: LogFunction;

    /**
     * PasswordResolver
     * @param settingsFillers fillers, the order is important
     * @param timeout timeout for feedback, in ms. when timeout elapsed 'node.lock' will be released and 'node.accepted' flag will be set to false
     */
    constructor(public settingsFillers?: ISettingsFiller[], public timeout?: number, logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
    }

    public clearCache(): boolean {
        return ConnectConfigResolverImpl.clearCache(this.logFn);
    }

    public killCache(): boolean {
        return ConnectConfigResolverImpl.killCache(this.logFn);
    }

    public feedBack(settings: IConnectConfig, accepted: boolean): void {
        const prefilledSettings = Object.assign({}, settings);
        // pre-fill settings in order to get correct cache string
        if (this.settingsFillers) {
            for (const filler of this.settingsFillers) {
                filler.testSettings(prefilledSettings);
            }
        }
        ConnectConfigResolverImpl.feedBack(prefilledSettings, accepted, this.logFn);
    }

    /**
     * Resolve settings
     * @param settings settings to resolve, immutable
     * @returns new resolved settings, or undefined if unaccepted
     */
    public async resolveConnectConfig(settings: IConnectConfig): Promise<IConnectConfig | undefined> {

        let retConfig: IConnectConfig | undefined;

        const prefilledSettings = Object.assign({}, settings);
        // pre-fill settings in order to get correct cache string
        if (this.settingsFillers) {
            for (const filler of this.settingsFillers) {
                filler.testSettings(prefilledSettings);
            }
        }

        const cacheStr = ConnectConfigResolverImpl.buildCacheString(prefilledSettings);
        this.logFn(LogType.debug, () => localize("debug.resolve.start", "resolveConnectConfig: try {0}", cacheStr));
        let node = settingsCache.get(cacheStr);
        if (!node) {
            this.logFn(LogType.debug, () => localize("debug.resolve.create_node", "resolveConnectConfig: create node {0}", cacheStr));
            node = new SettingsCacheNode();
            settingsCache.set(cacheStr, node);
        }
        // acquire lock before testing accepted or not
        await node.lock.acquire();
        this.logFn(LogType.debug, () => localize("debug.resolve.lock", "resolveConnectConfig: lock acquired {0}", cacheStr));
        if (node.accepted === undefined) {
            // no one has resolved before
            this.logFn(LogType.debug, () => localize("debug.resolve.first", "resolveConnectConfig: first call {0}", cacheStr));
            node.settings = prefilledSettings;
            if (this.settingsFillers) {
                for (const filler of this.settingsFillers) {
                    if (!filler.testSettings(node.settings)) {
                        // not for this filler implementation
                        continue;
                    }
                    const filled = await filler.fillSetting(node.settings);
                    if (filled) {
                        this.logFn(LogType.debug, () => localize("debug.resolve.filled", "resolveConnectConfig: filled ok {0}", cacheStr));
                        retConfig = node.settings;
                    } else {
                        // mark unaccepted, no feedback needed
                        this.logFn(LogType.debug, () => localize("debug.resolve.didnt", "resolveConnectConfig: didn't filled {0}", cacheStr));
                        node.accepted = false;
                        this.logFn(LogType.debug, () => localize("debug.resolve.unlock.nofeedback", "resolveConnectConfig: lock released (no feedback needed) {0}", cacheStr));
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
                        this.logFn(LogType.debug, () => localize("debug.resolve.timeout", "resolveConnectConfig: lock released by timeout {0}", cacheStr));
                        node.lock.release();
                        node.accepted = false;
                        delete node.timer;
                    }
                }, this.timeout);
            }
        } else {
            // non-first call, test if settings was accepted or not in first call
            const accepted = node.accepted;
            this.logFn(LogType.debug, () => localize("debug.resolve.second", "resolveConnectConfig: second and other calls {0}", cacheStr));
            this.logFn(LogType.debug, () => localize("debug.resolve.state", "resolveConnectConfig: acc={0} {1}", accepted, cacheStr));
            if (node.accepted) {
                retConfig = node.settings;
            }
            // release lock, feedback already provided
            this.logFn(LogType.debug, () => localize("debug.resolve.unlock.already", "resolveConnectConfig: lock released {0}", cacheStr));
            node.lock.release();
        }

        // return config
        this.logFn(LogType.debug, () => localize("debug.resolve.ret", "resolveConnectConfig: config returned {0}", cacheStr));
        return retConfig;
    }

    public testConnectConfig(settings: IConnectConfig): { settings?: IConnectConfig; state: ResolverState; } {
        const prefilledSettings = Object.assign({}, settings);
        // pre-fill settings in order to get correct cache string
        if (this.settingsFillers) {
            for (const filler of this.settingsFillers) {
                filler.testSettings(prefilledSettings);
            }
        }
        const cacheStr = ConnectConfigResolverImpl.buildCacheString(prefilledSettings);
        this.logFn(LogType.debug, () => localize("debug.resolve.start.test", "resolveConnectConfig: try {0}", cacheStr));
        const node = settingsCache.get(cacheStr);
        if (!node) {
            return { settings: prefilledSettings,  state: ResolverState.absent};
        } else {
            if (node.accepted === true) {
                return { settings: node.settings, state: ResolverState.accepted };
            }
            if (node.accepted === false) {
                return { settings: node.settings, state: ResolverState.rejected };
            }
            return { settings: node.settings, state: ResolverState.asked };
        }
    }
}
