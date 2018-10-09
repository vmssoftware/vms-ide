import { ConnectConfig } from "ssh2";
import { window } from "vscode";
import { IConnectConfigResolver } from "./connect-config-resolver";

import * as nls from "vscode-nls";
import { AsyncTaskQueue } from "../common/async-task-queue";
const localize = nls.loadMessageBundle();

// tslint:disable-next-line:no-console
export let logFn = console.log;
// tslint:disable-next-line:no-empty
logFn = () => {};

export class PasswordCacheNode {
    public promise: Promise<ConnectConfig | undefined> | undefined;
    public settings: ConnectConfig  = {};
    public accepted: boolean = false;
    public cancelled: boolean = false;
    public resolved: boolean = false;
}

// tslint:disable-next-line:max-classes-per-file
export class AsyncPasswordChecker implements IConnectConfigResolver {

    protected cache: Map<string, PasswordCacheNode> = new Map<string, PasswordCacheNode>();
    protected taskQueue: AsyncTaskQueue = new AsyncTaskQueue();

    // remove failed settings only
    public clearCache(): boolean {
        logFn(`clearCache: ${this.cache.size} elements in cache`);
        for (const [key, node] of this.cache) {
            // tslint:disable-next-line:max-line-length
            logFn(`clearCache: element ${key}: resolved=${node.resolved}, cancelled=${node.cancelled}, accepted=${node.accepted}`);
            if (node.resolved && (node.cancelled || !node.accepted)) {
                logFn(`clearCache: element ${key} deleted`);
                this.cache.delete(key);
            }
        }
        return true;
    }

    // mark unaccepted settings as failed
    public feedBack(settings: ConnectConfig, accepted: boolean): void {
        const cacheStr = this.buildCacheString(settings);
        logFn(`feedBack: element ${cacheStr} accepted=${accepted}`);
        const node = this.cache.get(cacheStr);
        if (node) {
            node.accepted = accepted;
            if (!accepted) {
                logFn(`feedBack: element ${cacheStr} promise=resolve(undefined)`);
                node.promise = Promise.resolve(undefined);
            }
        }
    }

    // let user enter missed password
    public resolveConnectConfig(settings: ConnectConfig): Promise<ConnectConfig|undefined> {
        const cacheStr = this.buildCacheString(settings);
        logFn(`resolveConnectConfig: try ${cacheStr}`);
        let node = this.cache.get(cacheStr);
        if (!node) {
            logFn(`resolveConnectConfig: new node for ${cacheStr}`);
            node = new PasswordCacheNode();
            node.settings = Object.assign({}, settings);
            this.cache.set(cacheStr, node);
        }
        if (!node.promise) {
            logFn(`resolveConnectConfig: new promise for ${cacheStr}`);
            node.promise = new Promise<ConnectConfig|undefined>((resolve) => {
                // taskQueue.add =>
                    this.taskQueue.enqueue( async () => {
                    if (!node) {
                        logFn(`resolveConnectConfig: suddenly node undefined for ${cacheStr}`);
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
                        // get password from user via "await", to prevent continue of taskQueue
                        const prompt = localize("user_password.prompt", "Enter password for {0}@{1}:{2}",
                        settings.username, settings.host, settings.port);
                        try {
                            const value = await window.showInputBox( { password: true, prompt });
                            logFn(`resolveConnectConfig: password entered for ${cacheStr}`);
                            if (value) {
                                logFn(`resolveConnectConfig: password is not empty ${cacheStr}`);
                                node.settings.password = value;
                                node.resolved = true;
                                resolve(node.settings);
                                return;
                            } else {
                                logFn(`resolveConnectConfig: password is empty ${cacheStr}`);
                                node.resolved = true;
                                resolve(undefined);
                                return;
                            }
                        } catch (err) {
                            logFn(`resolveConnectConfig: cancelled ${cacheStr}`);
                            node.cancelled = true;
                            node.resolved = true;
                            logFn(`resolveConnectConfig: resolved ${cacheStr}`);
                            resolve(undefined);
                            return;
                        }
                    } else {
                        logFn(`resolveConnectConfig: suddenly settings has no host and username ${cacheStr}`);
                        node.resolved = true;
                        logFn(`resolveConnectConfig: resolved ${cacheStr}`);
                        resolve(undefined);
                        return;
                    }
                });
                // taskQueue = end
            });
        }
        logFn(`resolveConnectConfig: return promise ${cacheStr}`);
        return node.promise;
    }

    // build key string
    public buildCacheString(settings: ConnectConfig): string {
        return `${settings.username}@${settings.host}:${settings.port}`;
    }
}
