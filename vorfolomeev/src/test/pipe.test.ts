import * as assert from "assert";
import { ConnectConfig } from "ssh2";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl, settingsCache } from "../config-resolve/connect-config-resolver-impl";
import { FakeReadStream } from "../stream/fake-read-stream";
import { FakeWriteStream } from "../stream/fake-write-stream";
import { PipeFile } from "../stream/pipe";
import { SftpReadWriteStream } from "../stream/sftp-stream";
import { TestConfiguration } from "./config/config";
import { ContextPasswordFiller } from "./context-password-filler";

type LogType = (message?: any, ...optionalParams: any[]) => void;

suite("Pipe tests", function(this: Mocha.Suite) {

    this.timeout(0);

    test("TestPipeRealToAnotherReal with resolver with correct context filler", async () => {

        const configLocal = await TestConfiguration(true);
        const configVms = await TestConfiguration(false);

        const filler = new ContextPasswordFiller([
            {
                host: configLocal.host,
                password: configLocal.password,
            },
            {
                host: configVms.host,
                password: configVms.password,
            },
        ], 0);

        delete configLocal.password;
        delete configVms.password;

        const resolver = new ConnectConfigResolverImpl([filler]);

        // hard reset
        settingsCache.clear();

        assert.equal(
            await TestPipeRealToAnotherReal(configLocal, configVms, resolver),
            true,
            "TestPipeRealToAnotherReal");

    });

    test("TestPipeFakeToFake", async () => {
        assert.equal(await TestPipeFakeToFake(), true, "TestPipeFakeToFake");
    });

    test("TestPipeRealToFake", async () => {
        const config = await TestConfiguration(false);
        assert.equal(await TestPipeRealToFake(config), true, "TestPipeRealToFake");
    });

    test("TestPipeRealToTheSameReal", async () => {
        const config = await TestConfiguration(false);
        assert.equal(await TestPipeRealToTheSameReal(config), true, "TestPipeRealToTheSameReal");
    });

    test("TestPipeFakeToReal", async () => {
        const config = await TestConfiguration(false);
        assert.equal(await TestPipeFakeToReal(config), true, "TestPipeFakeToReal");
    });

    test("TestPipeRealToAnotherReal", async () => {
        const configLocal = await TestConfiguration(true);
        const configVms = await TestConfiguration(false);
        assert.equal(await TestPipeRealToAnotherReal(configLocal, configVms), true, "TestPipeRealToAnotherReal");
    });

    async function TestPipeFakeToFake(log?: LogType) {

        const srcData = [
            Buffer.from("1234\r\n"),
            Buffer.from("abcd\r\n"),
        ];

        const srcBadData = [
            Buffer.from("1234\r\n"),
            Buffer.from("abcd\r\n"),
            null,
        ];

        const srcBaDestData = [
            Buffer.from("1234\r\n"),
            FakeWriteStream.badChunk,
        ];

        const src = new FakeReadStream(srcData, log);
        const dst = new FakeWriteStream(undefined, log);

        const result = await PipeFile(src, dst, "test.txt", undefined, log);

        assert.equal(result, true, "pipeFile must return true");

        assert.equal(Buffer.concat(dst.chunks).toString("utf8"),
                     Buffer.concat(srcData).toString("utf8"), "Content is different");

        // test bad source
        src.chunks = srcBadData;
        const resultBadSource = await PipeFile(src, dst, "test.txt", undefined, log);

        assert.equal(resultBadSource, false, "pipeFile must return false");

        // test bad dest data
        src.chunks = srcBaDestData;
        const resultBadDestData = await PipeFile(src, dst, "test.txt", undefined, log);

        assert.equal(resultBadDestData, false, "pipeFile must return false");

        // test bad dest
        src.chunks = srcData;
        dst.emulateError = true;
        const resultBadDest = await PipeFile(src, dst, "test.txt", undefined, log);

        assert.equal(resultBadDest, false, "pipeFile must return false");

        return result && !resultBadSource && !resultBadDest;
    }

    async function TestPipeRealToFake(config: ConnectConfig, log?: LogType) {

        const src = new SftpReadWriteStream(config, undefined, log);
        const dst = new FakeWriteStream(undefined, log);

        const result = await PipeFile(src, dst, "test.txt", "test_new.txt", log);
        if (result) {
            const content = Buffer.concat(dst.chunks).toString("utf8");
            if (log) { log(content); }
        }

        dst.emulateError = true;
        const resultBad = await PipeFile(src, dst, "test.txt", "test_new.txt", log);

        src.dispose();

        return result && !resultBad;
    }

    async function TestPipeRealToTheSameReal(config: ConnectConfig, log?: LogType) {

        const src = new SftpReadWriteStream(config, undefined, log);

        const result = await PipeFile(src, src, "test.txt", "test_new.txt", log);

        src.dispose();

        return result;
    }

    async function TestPipeRealToAnotherReal(configSrc: ConnectConfig,
                                             configDst: ConnectConfig,
                                             resolver?: IConnectConfigResolver,
                                             log?: LogType) {

        const src = new SftpReadWriteStream(configSrc, resolver, log);
        const dst = new SftpReadWriteStream(configDst, resolver, log);

        const result = await PipeFile(src, dst, "test.txt", "test_new.txt", log);

        src.dispose();

        return result;
    }

    async function TestPipeFakeToReal(config: ConnectConfig, log?: LogType) {

        const srcData = [
            Buffer.from("1234\r\n"),
            Buffer.from("abcd\r\n"),
        ];

        const srcBadData = [
            Buffer.from("1234\r\n"),
            Buffer.from("abcd\r\n"),
            null,
        ];

        const src = new FakeReadStream(srcData, log);
        const dst = new SftpReadWriteStream(config, undefined, log);

        const result = await PipeFile(src, dst, "test.txt", "test_good.txt", log);

        src.chunks = srcBadData;
        const resultBad = await PipeFile(src, dst, "test.txt", "test_bad.txt", log);

        dst.dispose();

        return result && !resultBad;
    }

});
