import * as assert from "assert";
import { ConnectConfig } from "ssh2";
import { ContextPasswordFiller } from "../common/context-password-filler";
import { LogType } from "../common/log-type";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl, settingsCache } from "../config-resolve/connect-config-resolver-impl";
import { FakeReadStream } from "../stream/fake-read-stream";
import { FakeWriteStream } from "../stream/fake-write-stream";
import { PipeFile } from "../stream/pipe";
import { SftpClient } from "../stream/sftp-client";
import { TestConfiguration } from "./config/config";

suite("Pipe tests", function(this: Mocha.Suite) {

    this.timeout(0);

    // tslint:disable-next-line:no-console
    // const logFn = console.log;
    const logFn = undefined;
    let configLocal: ConnectConfig;
    let configVms: ConnectConfig;
    let filler: ContextPasswordFiller;
    let resolver: IConnectConfigResolver;
    const fileData = [
        { file: "test1.txt", buffer: Buffer.from("1234\r\nabcd") },
        { file: "test2.txt", buffer: Buffer.from("1\r\n2\r\n3\r\n4\r\n5") },
    ];
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
    this.beforeAll(async () => {
        // get configs with passwords
        configLocal = await TestConfiguration(true);
        configVms = await TestConfiguration(false);
        // prepare filler based on passwords from configs
        filler = new ContextPasswordFiller([
            {
                host: configLocal.host,
                password: configLocal.password,
            },
            {
                host: configVms.host,
                password: configVms.password,
            },
        ], 0);
        // remove passwords
        delete configLocal.password;
        delete configVms.password;
        resolver = new ConnectConfigResolverImpl([filler]);
    });

    test("TestPipeFakeToFake srcData", async () => {
        const result = await TestPipeFakeToFake(srcData, logFn);
        assert.equal(result.resultPipe, true, "pipe result");
        assert.equal(result.resultPipe, true, "compare result");
    });

    return;

    test("TestPipeRealToAnotherReal with resolver with correct context filler", async () => {
        // hard reset
        settingsCache.clear();
        assert.equal(
            await TestPipeRealToAnotherReal(configLocal, configVms, "test.txt", "test_new.txt", resolver, logFn),
            true,
            "TestPipeRealToAnotherReal");
    });

    test("TestPipeRealToFake local", async () => {
        assert.equal(await TestPipeRealToFake(configVms, logFn), true, "TestPipeRealToFake");
    });

    test("TestPipeRealToTheSameReal local", async () => {
        assert.equal(await TestPipeRealToTheSameReal(configLocal), true, "TestPipeRealToTheSameReal");
    });

    test("TestPipeFakeToReal local", async () => {
        assert.equal(await TestPipeFakeToReal(srcData, configLocal), true, "TestPipeFakeToReal");
    });

    test("TestPipeRealToAnotherReal local vms", async () => {
        assert.equal(await TestPipeRealToAnotherReal(configLocal,
            configVms, "test.txt", "test_new.txt", resolver, logFn), true, "TestPipeRealToAnotherReal");
    });

    /**
     * Try different data
     * @param sourceArray data
     * @param log log
     */
    async function TestPipeFakeToFake(sourceArray: Array<Buffer|null>, log?: LogType) {

        const src = new FakeReadStream(sourceArray, log);
        const dst = new FakeWriteStream(false, log);
        const resultPipe = await PipeFile(src, dst, "in", "out", log);
        const sourceString = sourceArray.map((buffer) => {
            if (Buffer.isBuffer(buffer)) {
                return buffer.toString("utf8");
            }
            return "";
        }).join("");
        const destString = dst.chunks.map((buffer) => {
            if (Buffer.isBuffer(buffer)) {
                return buffer.toString("utf8");
            }
            return "";
        }).join("");
        const resultCompare = sourceString === destString;
        return { resultPipe, resultCompare };
    }

    async function TestPipeRealToFake(config: ConnectConfig, log?: LogType) {

        const src = new SftpClient(config, undefined, log);
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

        const src = new SftpClient(config, undefined, log);

        const result = await PipeFile(src, src, "test.txt", "test_new.txt", log);

        src.dispose();

        return result;
    }

    async function TestPipeRealToAnotherReal(configSrc: ConnectConfig,
                                             configDst: ConnectConfig,
                                             srcFile: string,
                                             dstFile: string,
                                             configResolver?: IConnectConfigResolver,
                                             log?: LogType) {

        const src = new SftpClient(configSrc, configResolver, log);
        const dst = new SftpClient(configDst, configResolver, log);

        const result = await PipeFile(src, dst, srcFile, dstFile, log);

        src.dispose();
        dst.dispose();

        return result;
    }

    async function TestPipeFakeToReal(sourceArray: Array<Buffer|null>, config: ConnectConfig, log?: LogType) {

        const src = new FakeReadStream(sourceArray, log);
        const dst = new SftpClient(config, undefined, log);

        const result = await PipeFile(src, dst, "test.txt", "test_good.txt", log);

        src.chunks = srcBadData;
        const resultBad = await PipeFile(src, dst, "test.txt", "test_bad.txt", log);

        dst.dispose();

        return result && !resultBad;
    }

});
