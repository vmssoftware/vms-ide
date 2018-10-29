//
// Note: This example test is leveraging the Mocha test framework.
// Please refer to their documentation on https://mochajs.org/ for help.
//

// The module 'assert' provides assertion methods from node
import * as assert from "assert";
import { ConnectConfig } from "ssh2";

import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl, settingsCache } from "../config-resolve/connect-config-resolver-impl";
import { ContextPasswordFiller } from "../config-resolve/context-password-filler";

// You can import and use all API from the 'vscode' module
// as well as import your extension to test it
// import * as vscode from 'vscode';
// import * as myExtension from '../extension';

// Defines a Mocha test suite to group tests of similar kind together
suite("Config resolver tests", function(this: Mocha.Suite) {

    return;

    this.timeout(0);

    test("Resolve config without filler", async () => {

        const correctPassword = "PASS";

        const configTest: ConnectConfig = {
            host: "1.2.3.4",
            port: 22,
            username: "anon",
            // tslint:disable-next-line:object-literal-sort-keys
            password: correctPassword,
        };

        // no resolver, so must pass settings as is
        // discard settings if no feedback in one second
        const resolver = new ConnectConfigResolverImpl(undefined, 1000);
        // hard reset
        settingsCache.clear();

        const all = [];

        all.push(pushTest(resolver, configTest, 100, correctPassword, 1));
        all.push(pushTest(resolver, configTest, 100, correctPassword, 2));
        all.push(pushTest(resolver, configTest, 100, correctPassword, 3));

        return Promise.all(all).then((results) => {
            // done
            assert.ok(results[0].cfg !== undefined, "First config is defined");
            assert.ok(results[1].cfg !== undefined, "Second config is defined");
            assert.ok(results[2].cfg !== undefined, "Third config is defined");
            assert.ok(results[0]!.cfg!.password !== undefined, "First config.password is defined");
            assert.ok(results[0]!.cfg!.password === correctPassword, `First config.password is correct`);
            assert.ok(results[1]!.cfg!.password !== undefined, "Second config.password is defined");
            assert.ok(results[1]!.cfg!.password === correctPassword, `Second config.password is correct`);
            assert.ok(results[2]!.cfg!.password !== undefined, "Third config.password is defined");
            assert.ok(results[2]!.cfg!.password === correctPassword, `Third config.password is correct`);
        });
    });

    test("Resolve config without filler, timeouted", async () => {

        const correctPassword = "PASS";

        const configTest: ConnectConfig = {
            host: "1.2.3.4",
            port: 22,
            username: "anon",
            // tslint:disable-next-line:object-literal-sort-keys
            password: correctPassword,
        };

        // no resolver, so must pass settings as is
        // discard settings if no feedback in one second
        const resolver = new ConnectConfigResolverImpl(undefined, 1000);
        // hard reset
        settingsCache.clear();

        const all = [];

        all.push(pushTest(resolver, configTest, 1100, correctPassword, 1));
        all.push(pushTest(resolver, configTest, 100, correctPassword, 2));
        all.push(pushTest(resolver, configTest, 100, correctPassword, 3));

        return Promise.all(all).then((results) => {
            // done
            assert.ok(results[0].cfg !== undefined, "First config is defined");
            assert.ok(results[1].cfg === undefined, "Second config is undefined");
            assert.ok(results[2].cfg === undefined, "Third config is undefined");
            assert.ok(results[0]!.cfg!.password !== undefined, "First config.password is defined");
            assert.ok(results[0]!.cfg!.password === correctPassword, `First config.password is correct`);
        });
    });

    test("Resolve config without filler, incorrect password", async () => {

        const correctPassword = "PASS";
        const incorrectPassword = "PS";

        const configTest: ConnectConfig = {
            host: "1.2.3.4",
            port: 22,
            username: "anon",
            // tslint:disable-next-line:object-literal-sort-keys
            password: incorrectPassword,
        };

        // no resolver, so must pass settings as is
        // discard settings if no feedback in one second
        const resolver = new ConnectConfigResolverImpl(undefined, 1000);
        // hard reset
        settingsCache.clear();

        const all = [];

        all.push(pushTest(resolver, configTest, 100, correctPassword, 1));
        all.push(pushTest(resolver, configTest, 100, correctPassword, 2));
        all.push(pushTest(resolver, configTest, 100, correctPassword, 3));

        return Promise.all(all).then((results) => {
            // done
            assert.ok(results[0].cfg !== undefined, "First config is defined");
            assert.ok(results[1].cfg === undefined, "Second config is undefined");
            assert.ok(results[2].cfg === undefined, "Third config is undefined");
            assert.ok(results[0]!.cfg!.password !== undefined, "First config.password is defined");
            assert.ok(results[0]!.cfg!.password !== correctPassword, `First config.password is incorrect`);
        });
    });

    test("Resolve config with correct filler", async () => {

        const correctPassword = "PASS";

        const configTest: ConnectConfig = {
            host: "1.2.3.4",
            port: 22,
            username: "anon",
        };

        // no resolver, so must pass settings as is
        // discard settings if no feedback in one second
        const filler = new ContextPasswordFiller([
            { host: configTest.host,
              password: correctPassword,
            }], 2000);
        const resolver = new ConnectConfigResolverImpl([filler], 1000);

        // hard reset
        settingsCache.clear();

        const all = [];

        all.push(pushTest(resolver, configTest, 100, correctPassword, 1));
        all.push(pushTest(resolver, configTest, 100, correctPassword, 2));
        all.push(pushTest(resolver, configTest, 100, correctPassword, 3));

        return Promise.all(all).then((results) => {
            // done
            assert.ok(results[0].cfg !== undefined, "First config is defined");
            assert.ok(results[1].cfg !== undefined, "Second config is defined");
            assert.ok(results[2].cfg !== undefined, "Third config is defined");
            assert.ok(results[0]!.cfg!.password !== undefined, "First config.password is defined");
            assert.ok(results[0]!.cfg!.password === correctPassword, `First config.password is correct`);
            assert.ok(results[1]!.cfg!.password !== undefined, "Second config.password is defined");
            assert.ok(results[1]!.cfg!.password === correctPassword, `Second config.password is correct`);
            assert.ok(results[2]!.cfg!.password !== undefined, "Third config.password is defined");
            assert.ok(results[2]!.cfg!.password === correctPassword, `Third config.password is correct`);
        });
    });

    test("Resolve config with incorrect filler", async () => {

        const correctPassword = "PASS";
        const incorrectPassword = "PSS";

        const configTest: ConnectConfig = {
            host: "1.2.3.4",
            port: 22,
            username: "anon",
        };

        // no resolver, so must pass settings as is
        // discard settings if no feedback in one second
        const filler = new ContextPasswordFiller([
            { host: configTest.host,
              password: incorrectPassword,
            }], 2000);
        const resolver = new ConnectConfigResolverImpl([filler], 1000);

        // hard reset
        settingsCache.clear();

        const all = [];

        all.push(pushTest(resolver, configTest, 100, correctPassword, 1));
        all.push(pushTest(resolver, configTest, 100, correctPassword, 2));
        all.push(pushTest(resolver, configTest, 100, correctPassword, 3));

        return Promise.all(all).then((results) => {
            // done
            assert.ok(results[0].cfg !== undefined, "First config is defined");
            assert.ok(results[1].cfg === undefined, "Second config is undefined");
            assert.ok(results[2].cfg === undefined, "Third config is undefined");
            assert.ok(results[0]!.cfg!.password !== undefined, "First config.password is defined");
            assert.ok(results[0]!.cfg!.password !== correctPassword, `First config.password is incorrect`);
        });
    });

    test("Resolve config with empty filler", async () => {

        const correctPassword = "PASS";

        const configTest: ConnectConfig = {
            host: "1.2.3.4",
            port: 22,
            username: "anon",
        };

        // no resolver, so must pass settings as is
        // discard settings if no feedback in one second
        const filler = new ContextPasswordFiller([
            { host: configTest.host,
              password: "",
            }], 2000);
        const resolver = new ConnectConfigResolverImpl([filler], 1000);

        // hard reset
        settingsCache.clear();

        const all = [];

        all.push(pushTest(resolver, configTest, 100, correctPassword, 1));
        all.push(pushTest(resolver, configTest, 100, correctPassword, 2));
        all.push(pushTest(resolver, configTest, 100, correctPassword, 3));

        return Promise.all(all).then((results) => {
            // done
            assert.ok(results[0].cfg === undefined, "First config is undefined");
            assert.ok(results[1].cfg === undefined, "Second config is undefined");
            assert.ok(results[2].cfg === undefined, "Third config is undefined");
        });
    });

    // tslint:disable-next-line:max-line-length
    async function pushTest(resolver: IConnectConfigResolver,
                            config: ConnectConfig,
                            feedbackTimeout: number,
                            correctPassword: string,
                            order: number) {
        return resolver.resolveConnectConfig(config).then(async (cfg) => {
            return { order, cfg, accepted: await AcceptIfPassIsCorrect(cfg, feedbackTimeout, correctPassword)};
        }).then((result) => {
            resolver.feedBack(config, result.accepted);
            return result;
        });
    }

    // tslint:disable-next-line:max-line-length
    function AcceptIfPassIsCorrect(cfg: ConnectConfig | undefined, feedbackTimeout: number, correctPassowrd: string): Promise<boolean> {
        return new Promise<boolean>((resolve) => {
            if (cfg) {
                setTimeout(() => {
                    const accepted = (cfg.password === correctPassowrd);
                    resolve(accepted);
                }, feedbackTimeout);
            } else {
                resolve(false);
            }
        });
    }
});
