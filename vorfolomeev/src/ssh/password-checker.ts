import { ConnectConfig } from "ssh2";
import { inspect } from "util";
import { IAskPassword } from "../common/ask-password";
import { Lock } from "../common/lock";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";

export type LogType = (message?: any, ...optionalParams: any[]) => void;
export let logFn: LogType | undefined;

class SettingsCacheNode {

    public lock: Lock = new Lock();
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
export class PasswordResolver implements IConnectConfigResolver {

    /**
     * PasswordResolver
     * @param askPass password dialog
     * @param timeout timeout for feedback, in ms. else lock will be released and accepted set to false
     */
    constructor(protected askPass: IAskPassword, protected timeout = 30000) {
    }

    /**
     * Resolve settings
     * @param settings
     */
    public resolveConnectConfig(settings: ConnectConfig): Promise<ConnectConfig | undefined> {
        return new Promise<ConnectConfig|undefined>(async (resolveSettings) => {
            const cacheStr = this.buildCacheString(settings);
            if (logFn) { logFn(`resolveConnectConfig: try ${cacheStr}`); }
            let node = settingsCache.get(cacheStr);
            if (!node) {
                if (logFn) { logFn(`resolveConnectConfig: create node ${cacheStr}`); }
                node = new SettingsCacheNode();
                settingsCache.set(cacheStr, node);
            }
            await node.lock.acquire();
            if (logFn) { logFn(`resolveConnectConfig: lock acquired ${cacheStr}`); }
            if (node.accepted === undefined) {
                // no one has got password before
                if (logFn) { logFn(`resolveConnectConfig: first call ${cacheStr}`); }
                if (this.testSettings(settings)) {
                    // ask password
                    const prompt = `Enter password for ${cacheStr} `;
                    // node: IAskPassword must provide lock itself, to prevent different nodes dialogs intersection
                    const password = await this.askPass.askPassword(prompt);
                    if (logFn) { logFn(`resolveConnectConfig: password provided ${cacheStr}`); }
                    node.settings = Object.assign({}, settings);
                    node.settings.password = password;
                    if (logFn) { logFn(`resolveConnectConfig: resolve settings ${cacheStr}`); }
                    resolveSettings(node.settings);
                    // setup timer
                    node.timer = setTimeout(() => {
                        if (node) {
                            if (logFn) { logFn(`resolveConnectConfig: lock released by timeout ${cacheStr}`); }
                            node.lock.release();
                            node.accepted = false;
                            delete node.timer;
                        }
                    }, this.timeout);
                } else {
                    // mark unaccepted for next calls
                    if (logFn) { logFn(`resolveConnectConfig: incorrect settings ${cacheStr}`); }
                    node.accepted = false;
                    if (logFn) { logFn(`resolveConnectConfig: resolve undefined ${cacheStr}`); }
                    resolveSettings(undefined);
                    if (logFn) { logFn(`resolveConnectConfig: lock released ${cacheStr}`); }
                    node.lock.release();
                }
            } else {
                if (logFn) {
                    logFn(`resolveConnectConfig: second and other calls ${cacheStr}`);
                    logFn(`resolveConnectConfig: acc=${node.accepted} ${cacheStr}`);
                }
                if (node.accepted) {
                    resolveSettings(node.settings);
                } else {
                    resolveSettings(undefined);
                }
                if (logFn) { logFn(`resolveConnectConfig: lock released ${cacheStr}`); }
                node.lock.release();
            }
        });
    }

    /**
     * Receive feedback from one who used settings
     * @param settings
     * @param accepted
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
        return `${settings.username}@${settings.host}:${settings.port}`;
    }

    public testSettings(settings: ConnectConfig): boolean {
        // just test if settings has host and username, and are not empty
        if (typeof settings.host === "string" &&
            settings.host &&
            typeof settings.username === "string" &&
            settings.username) {
            // do not allow zero port
            settings.port = settings.port || 22;
            return true;
        }
        return false;
    }
}
