import { ConnectConfig } from "ssh2";
import { IAskPassword } from "../common/ask-password";
import { IConnectConfigResolver } from "./connect-config-resolver";

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

type Resolve<T> = ((value?: T | PromiseLike<T> | undefined) => void);

class PasswordCacheNode {
    public promise: Promise<ConnectConfig | undefined> | undefined;
    public resolveFeedback: Resolve<boolean> | undefined;
    public settings: ConnectConfig  = {};
    public accepted: boolean = false;
    public cancelled: boolean = false;
    public resolved: boolean = false;
}

const settingsCache: Map<string, PasswordCacheNode> = new Map<string, PasswordCacheNode>();

// tslint:disable-next-line:max-classes-per-file
export class PasswordResolver implements IConnectConfigResolver {

    constructor(protected askPass: IAskPassword) {
        // no
    }

    // remove failed settings only
    public clearCache(): boolean {
        logFn(`clearCache: ${settingsCache.size} elements in cache`);
        for (const [key, node] of settingsCache) {
            logFn(`clearCache: element ${key}: res=${node.resolved}, can=${node.cancelled}, acc=${node.accepted}`);
            if (node.resolved && (node.cancelled || !node.accepted)) {
                logFn(`clearCache: element ${key} deleted`);
                settingsCache.delete(key);
            }
        }
        return true;
    }

    // mark unaccepted settings as failed
    public feedBack(settings: ConnectConfig, accepted: boolean): void {
        const cacheStr = this.buildCacheString(settings);
        logFn(`feedBack: element ${cacheStr} accepted=${accepted}`);
        const node = settingsCache.get(cacheStr);
        if (node) {
            node.accepted = accepted;
            if (node.resolveFeedback) {
                node.resolveFeedback(accepted);
            }
        }
    }

    // let user enter missed password
    public resolveConnectConfig(settings: ConnectConfig): Promise<ConnectConfig | undefined> {
        const cacheStr = this.buildCacheString(settings);
        logFn(`resolveConnectConfig: try ${cacheStr}`);
        let node = settingsCache.get(cacheStr);
        if (!node) {
            // that is the first call with this settings, so create new node and copy settings
            logFn(`resolveConnectConfig: new node for ${cacheStr}`);
            node = new PasswordCacheNode();
            node.settings = Object.assign({}, settings);
            settingsCache.set(cacheStr, node);
        }
        if (!node.promise) {
            // no one trying to acquire password, so do it
            logFn(`resolveConnectConfig: new promise for ${cacheStr}`);

            // build promise for second call (do not wait it now, just create)
            node.promise = new Promise<ConnectConfig | undefined>(async (resolve) => {
                if (node) {
                    // wait feedback from first call
                    const feedback = new Promise<boolean>((resolveFeedback) => {
                        if (node) {
                            // set this feedback resolver to node, it will be resolved later on feedback
                            logFn(`resolveConnectConfig: set feedback promise for ${cacheStr}`);
                            node.resolveFeedback = resolveFeedback;
                        } else {
                            logFn(`resolveConnectConfig: cannot set feedback promise, no node for ${cacheStr}`);
                            resolveFeedback(false);
                        }
                    });
                    // or wait timeout 30 seconds
                    const timeout = new Promise<boolean>((resolveTimeout) => {
                        setTimeout(() => {
                            resolveTimeout(false);
                        }, 30000);
                    });
                    const result = await Promise.race([feedback, timeout]);
                    // test node
                    if (result && node.accepted) {
                        logFn(`resolveConnectConfig: second got for ${cacheStr}`);
                        resolve(node.settings);
                    } else {
                        resolve(undefined);
                    }
                } else {
                    logFn(`resolveConnectConfig: for second call, no node for ${cacheStr}`);
                    resolve(undefined);
                }
            });

            // return promise for first call
            return new Promise<ConnectConfig | undefined>(async (resolve) => {
                if (!node) {
                    logFn(`resolveConnectConfig: no node for ${cacheStr}`);
                    // node.resolved = true; no node, so no resolved state :)
                    resolve(undefined);
                    return;
                }
                if (typeof node.settings.host === "string" &&
                    typeof node.settings.username === "string") {
                    node.settings.port = node.settings.port || 22;
                    // test password provided
                    if (typeof node.settings.password === "string" &&
                        node.settings.password) {
                        // do not need more action
                        logFn(`resolveConnectConfig: password is already set ${cacheStr}`);
                        node.resolved = true;
                        resolve(node.settings);
                        return;
                    }
                    // get password from user via new task in queue
                    if (node) {
                        const prompt = `Enter password for ${cacheStr} `;
                        let password: string | undefined;
                        try {
                            password = await this.askPass.askPassword(prompt);
                            logFn(`resolveConnectConfig: password entered for ${cacheStr}`);
                            if (password) {
                                logFn(`resolveConnectConfig: password is not empty ${cacheStr}`);
                                node.settings.password = password;
                                node.resolved = true;
                                resolve(node.settings);
                            } else {
                                logFn(`resolveConnectConfig: password is empty ${cacheStr}`);
                                node.resolved = true;
                                resolve(undefined);
                            }
                        } catch (err) {
                            logFn(`resolveConnectConfig: cancelled ${cacheStr}`);
                            node.cancelled = true;
                            node.resolved = true;
                            logFn(`resolveConnectConfig: resolved ${cacheStr}`);
                            resolve(undefined);
                        }
                    }
                } else {
                    logFn(`resolveConnectConfig: settings has no host and username ${cacheStr}`);
                    node.resolved = true;
                    logFn(`resolveConnectConfig: resolved ${cacheStr}`);
                    resolve(undefined);
                    return;
                }
            });
        } else {
            // return feedback waiting promise for second and other calls
            logFn(`resolveConnectConfig: return promise ${cacheStr}`);
            return node.promise;
        }
    }

    // build key string
    public buildCacheString(settings: ConnectConfig): string {
        return `${settings.username}@${settings.host}:${settings.port}`;
    }
}
