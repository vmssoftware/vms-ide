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

type Resolve<T> = ((value?: T | PromiseLike<T> | undefined) => void);

class PasswordCacheNode {
    public promise: Promise<ConnectConfig | undefined> | undefined;
    public feedBack: Resolve<boolean> | undefined;
    public settings: ConnectConfig  = {};
    public accepted: boolean = false;
    public cancelled: boolean = false;
    public resolved: boolean = false;
}

// tslint:disable-next-line:max-classes-per-file
export class AsyncPasswordChecker implements IConnectConfigResolver {

    public static GetInstance(): AsyncPasswordChecker {
        if (!this.instance) {
            this.instance = new AsyncPasswordChecker();
        }
        return this.instance;
    }

    private static instance: AsyncPasswordChecker | undefined;

    protected cache: Map<string, PasswordCacheNode> = new Map<string, PasswordCacheNode>();
    protected taskQueue: AsyncTaskQueue = new AsyncTaskQueue();

    private constructor() {
        // no
    }

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
            if (node.feedBack) {
                node.feedBack(accepted);
            }
        }
    }

    // let user enter missed password
    public resolveConnectConfig(settings: ConnectConfig): Promise<ConnectConfig | undefined> {
        const cacheStr = this.buildCacheString(settings);
        logFn(`resolveConnectConfig: try ${cacheStr}`);
        let node = this.cache.get(cacheStr);
        if (!node) {
            // create new node and copy settings
            logFn(`resolveConnectConfig: new node for ${cacheStr}`);
            node = new PasswordCacheNode();
            node.settings = Object.assign({}, settings);
            this.cache.set(cacheStr, node);
        }
        if (!node.promise) {
            logFn(`resolveConnectConfig: new promise for ${cacheStr}`);

            // build promise for all next calls
            node.promise = new Promise<ConnectConfig | undefined>(async (resolve) => {
                if (node) {
                    // wait feedback
                    await new Promise<boolean>((feedbackGot) => {
                        if (node) {
                            node.feedBack = feedbackGot;
                        }
                    });
                    // test node
                    if (node.accepted) {
                        resolve(node.settings);
                    } else {
                        resolve(undefined);
                    }
                }
            });

            return new Promise<ConnectConfig | undefined>((resolve) => {
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
                    // get password from user via new task in queue
                    this.taskQueue.enqueue(() => {
                        return new Promise<boolean>(async (taskResolve) => {
                            if (!node) {
                                resolve(undefined);
                                taskResolve(false);
                                return;
                            }
                            const prompt = localize("user_password.prompt", "Enter password for {0}@{1}:{2}",
                                node.settings.username, node.settings.host, node.settings.port);
                            try {
                                const value = await window.showInputBox( { password: true, prompt });
                                logFn(`resolveConnectConfig: password entered for ${cacheStr}`);
                                if (value) {
                                    logFn(`resolveConnectConfig: password is not empty ${cacheStr}`);
                                    node.settings.password = value;
                                    node.resolved = true;
                                    resolve(node.settings);
                                    taskResolve(true);
                                } else {
                                    logFn(`resolveConnectConfig: password is empty ${cacheStr}`);
                                    node.resolved = true;
                                    resolve(undefined);
                                    taskResolve(true);
                                    return;
                                }
                            } catch (err) {
                                logFn(`resolveConnectConfig: cancelled ${cacheStr}`);
                                node.cancelled = true;
                                node.resolved = true;
                                logFn(`resolveConnectConfig: resolved ${cacheStr}`);
                                resolve(undefined);
                                taskResolve(true);
                                return;
                            }
                        });
                    });

                } else {
                    logFn(`resolveConnectConfig: suddenly settings has no host and username ${cacheStr}`);
                    node.resolved = true;
                    logFn(`resolveConnectConfig: resolved ${cacheStr}`);
                    resolve(undefined);
                    return;
                }
            });
        } else {
            logFn(`resolveConnectConfig: return promise ${cacheStr}`);
            return node.promise;
        }
    }

    // build key string
    public buildCacheString(settings: ConnectConfig): string {
        return `${settings.username}@${settings.host}:${settings.port}`;
    }
}
