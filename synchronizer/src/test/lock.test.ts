import * as assert from "assert";
import { Delay } from "../common/delay";
import { LogType } from "../common/log-type";
import { Lock } from "./../common/lock";

suite("Lock tests", function(this: Mocha.Suite) {

    return;

    this.timeout(0);

    let debugLogFn: LogType | undefined;
    debugLogFn = undefined;
    // tslint:disable-next-line:no-console
    // debugLogFn = console.log;

    this.beforeAll(async () => {
        // prepare
    });

    test("Simple lock test", async () => {
        const lock = new Lock();
        assert.equal(lock.isLocked, false, "Must not be locked");
        await lock.acquire();
        assert.equal(lock.isLocked, true, "Must be locked");
        let testValue = false;
        setTimeout(() => {
            assert.equal(lock.isLocked, true, "Must be locked");
            testValue = true;
            lock.release();
        }, 1000);
        assert.equal(lock.isLocked, true, "Must be locked");
        assert.equal(testValue, false, "Value must be false");
        await lock.acquire();
        assert.equal(lock.isLocked, true, "Must not be locked");
        assert.equal(testValue, true, "Value must be true");
        lock.release();
        assert.equal(lock.isLocked, false, "Must be unlocked");
        assert.ok( true, "must be true");
    });

    test("Simple lock test initial=true", async () => {
        const lock = new Lock(true);
        assert.equal(lock.isLocked, true, "Must be locked");
        let testValue = false;
        setTimeout(() => {
            assert.equal(lock.isLocked, true, "Must be locked");
            testValue = true;
            lock.release();
        }, 1000);
        assert.equal(lock.isLocked, true, "Must be locked");
        assert.equal(testValue, false, "Value must be false");
        await lock.acquire();
        assert.equal(lock.isLocked, true, "Must not be locked");
        assert.equal(testValue, true, "Value must be true");
        lock.release();
        assert.equal(lock.isLocked, false, "Must be unlocked");
        assert.ok( true, "must be true");
    });

    test("Lock test", async () => {
        assert.equal(await TestLock(100, debugLogFn), true, "TestLock failed");
        assert.ok( true, "must be true");
    });

    async function TestLock(num: number, debugLog?: LogType)  {
        const lock = new Lock(false); // , "test", debugLog);
        assert.equal(lock.isLocked, false, "Must be Unlocked");
        const all = [];
        let resource = true;
        for (let i = 0; i < num; ++i) {
            all.push(Promise.resolve().then(async () => {
                if (debugLogFn) {
                    debugLogFn(`enter ${i}`);
                }
                await lock.acquire();
                assert.equal(resource, true, `Resource must be TRUE ${i}`);
                resource = false;
                await Delay(60);
                assert.equal(resource, false, `Resource must be FALSE ${i}`);
                resource = true;
                lock.release();
                if (debugLogFn) {
                    debugLogFn(`exit ${i}`);
                }
            }));
        }
        await Promise.all(all);
        assert.equal(resource, true, "Resource must be TRUE at the end");
        assert.ok( true, "must be true");
        return true;
    }

});
