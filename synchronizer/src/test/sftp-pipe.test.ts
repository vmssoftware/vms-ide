import * as assert from "assert";
import { ConnectConfig } from "ssh2";
import { ContextPasswordFiller } from "../common/context-password-filler";
import { LogType } from "../common/log-type";
import { IConnectConfigResolver } from "../config-resolve/connect-config-resolver";
import { ConnectConfigResolverImpl, settingsCache } from "../config-resolve/connect-config-resolver-impl";
import { FakeReadStream } from "../stream/fake-read-stream";
import { FakeWriteStreamCreator } from "../stream/fake-write-stream";
import { PipeFile } from "../stream/pipe";
import { SftpClient } from "../stream/sftp-client";
import { TestConfiguration } from "./config/config";

suite("Pipe tests", function(this: Mocha.Suite) {

    return;

    this.timeout(0);

    let debugLogFn: LogType | undefined;
    debugLogFn = undefined;
    // tslint:disable-next-line:no-console
    // debugLogFn = console.log;
    let configLocal: ConnectConfig;
    let configVms: ConnectConfig;
    let filler: ContextPasswordFiller;
    let resolver: IConnectConfigResolver;
    interface IFileTestData {
        file: string;
        fileDest: string;
        buffer: Buffer;
        expectPipe: boolean;
        expectCompare: boolean;
    }
    interface ITestResult {
        fileData: IFileTestData;
        resultPipe: boolean;
        resultCompare: boolean;
    }
    // file and fileDest may exist or not. fileDest will be overwritten
    const fileDatas: IFileTestData[] = [
        {
            buffer: Buffer.from("1\r\n2\r\n3\r\n4\r\n5"),
            expectCompare: true,
            expectPipe: true,
            file: "test1.txt",
            fileDest: "test1_new.txt",
        },
        {
            buffer: Buffer.from("1234\r\nabcd"),
            expectCompare: true,
            expectPipe: true,
            file: "test2.txt",
            fileDest: "test2_new.txt",
        },
        {
            buffer: Buffer.from("1234\r\nabcd\r\n****"),
            expectCompare: true,
            expectPipe: true,
            file: "test3.txt",
            fileDest: "test3_new.txt",
        },
    ];
    // file mustn't exist
    const fileDataMiss: IFileTestData = {
        buffer: Buffer.from("some missed data"),
        expectCompare: false,
        expectPipe: false,
        file: "missed.txt",
        fileDest: "missed_new.txt",
    };
    // fileDest must exist and be read-only
    const fileDataDenied: IFileTestData = {
        buffer: Buffer.from("begin\r\neof"),
        expectCompare: false,
        expectPipe: false,
        file: "denied.txt",
        fileDest: "denied.txt",
    };
    // for unpasswored test
    const fileDataDummy: IFileTestData = {
        buffer: Buffer.from("dummy"),
        expectCompare: false,
        expectPipe: false,
        file: "dummy.txt",
        fileDest: "dummy.txt",
    };
    // for fake-stream tests only
    const srcDatas = [
        Buffer.from("1234\r\n"),
        Buffer.from("abcd\r\n"),
    ];
    const srcBadDatas = [
        Buffer.from("1234\r\n"),
        Buffer.from("abcd\r\n"),
        null,
        Buffer.from("last\r\n"),
    ];
    const srcBadDestDatas = [
        Buffer.from("1234\r\n"),
        FakeWriteStreamCreator.badChunk,
        Buffer.from("last\r\n"),
    ];

    // prepare resolver
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

    // test fake streams

    test("Fake -> Fake good data", async () => {
        const result = await TestPipeFakeToFake(srcDatas, true, true, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("Fake -> Fake bad source data", async () => {
        const result = await TestPipeFakeToFake(srcBadDatas, false, false, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("Fake -> Fake bad dest data", async () => {
        const result = await TestPipeFakeToFake(srcBadDestDatas, false, false, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    // test reading from local FTP
    // at now we don't sure all files exist, so just test missing one

    test("Local -> Fake no password", async () => {
        const result = await TestPipeRealToFakeParr(configLocal, [fileDataDummy], undefined, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("Local -> Fake one missed", async () => {
        const result = await TestPipeRealToFakeParr(configLocal, [fileDataMiss], resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    // test writing to local FTP and reading again

    test("Fake -> Local no password", async () => {
        const result = await TestPipeFakeToRealParrWithTest(configLocal, [fileDataDummy], undefined, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("Fake -> Local +test one", async () => {
        const data = fileDatas.slice(0, 1);
        const result = await TestPipeFakeToRealParrWithTest(configLocal, data, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("Fake -> Local +test several parallel", async () => {
        const result = await TestPipeFakeToRealParrWithTest(configLocal, fileDatas, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("Fake -> Local denied one", async () => {
        const result = await TestPipeFakeToRealParrWithTest(configLocal, [fileDataDenied], resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    // test reading VMS FTP

    // at now we don't sure all files exist, so just test missing one

    test("VMS -> Fake no password", async () => {
        const result = await TestPipeRealToFakeParr(configVms, [fileDataDummy], undefined, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("VMS -> Fake one missed", async () => {
        const result = await TestPipeRealToFakeParr(configVms, [fileDataMiss], resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    // test writing to VMS FTP and reading again

    test("Fake -> VMS no password", async () => {
        const data = fileDatas.slice(0, 1);
        const result = await TestPipeFakeToRealParrWithTest(configVms, [fileDataDummy], undefined, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("Fake -> VMS +test one", async () => {
        const data = fileDatas.slice(0, 1);
        const result = await TestPipeFakeToRealParrWithTest(configVms, data, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("Fake -> VMS +test several parallel", async () => {
        const result = await TestPipeFakeToRealParrWithTest(configVms, fileDatas, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("Fake -> VMS denied one", async () => {
        const result = await TestPipeFakeToRealParrWithTest(configVms, [fileDataDenied], resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    // test pipping from FTP to FTP

    test("Local -> Local +test several parallel", async () => {
        const result = await TestPipeRealToRealParrWithTest(configLocal, configLocal, fileDatas, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("Local -> VMS +test several parallel", async () => {
        const result = await TestPipeRealToRealParrWithTest(configLocal, configVms, fileDatas, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("VMS -> Local +test several parallel", async () => {
        const result = await TestPipeRealToRealParrWithTest(configVms, configLocal, fileDatas, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("VMS -> VMS +test several parallel", async () => {
        const result = await TestPipeRealToRealParrWithTest(configVms, configVms, fileDatas, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    // test pipping from FTP to the same FTP

    test("Local -> same Local +test one", async () => {
        const data = fileDatas.slice(0, 1);
        const result = await TestPipeRealToSameRealParrWithTest(configLocal, data, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("Local -> same Local +test several parallel", async () => {
        const result = await TestPipeRealToSameRealParrWithTest(configLocal, fileDatas, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("VMS -> same VMS +test one", async () => {
        const data = fileDatas.slice(0, 1);
        const result = await TestPipeRealToSameRealParrWithTest(configVms, data, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("VMS -> same VMS +test several parallel", async () => {
        const result = await TestPipeRealToSameRealParrWithTest(configVms, fileDatas, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    // huge test

    test("VMS -> Local +test several parallel +missed +denied", async () => {
        const testDatas = fileDatas.slice(0);
        testDatas.splice(1, 0, fileDataMiss);
        testDatas.splice(3, 0, fileDataDenied);
        const result = await TestPipeRealToRealParrWithTest(configVms, configLocal, testDatas, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    test("Local -> VMS +test several parallel +missed +denied", async () => {
        const testDatas = fileDatas.slice(0);
        testDatas.splice(1, 0, fileDataMiss);
        testDatas.splice(3, 0, fileDataDenied);
        const result = await TestPipeRealToRealParrWithTest(configLocal, configVms, testDatas, resolver, debugLogFn);
        assert.equal(result, true, "must be true");
    });

    /**
     * Try different data
     * @param sourceArray data
     * @param debugLog log
     */
    async function TestPipeFakeToFake(sourceArray: Array<Buffer|null>,
                                      expectedPipe: boolean,
                                      expectCompare: boolean,
                                      debugLog?: LogType) {

        const src = new FakeReadStream(sourceArray, debugLog);
        const dst = new FakeWriteStreamCreator(false, debugLog);
        const resultPipe = await PipeFile(src, dst, "in", "out", debugLog);
        assert.equal(resultPipe, expectedPipe, "pipe result unexpected");
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
        assert.equal(resultCompare, expectCompare, "compare result unexpected");
        return true;
    }

    async function TestPipeRealToFakeParr(config: ConnectConfig,
                                          fileDataArr: IFileTestData[],
                                          configResolver?: IConnectConfigResolver,
                                          debugLog?: LogType) {
        const src = new SftpClient(config, configResolver, debugLog, "*");
        const results: ITestResult[] = [];
        const promises: Array<Promise<boolean>> = [];
        for (const fileData of fileDataArr) {
            promises.push(Promise.resolve().then(async () => {
                const dst = new FakeWriteStreamCreator(false, debugLog);
                const resultPipe = await PipeFile(src, dst, fileData.file, "", debugLog);
                const sourceString = fileData.buffer.toString("utf8");
                const destString = dst.chunks.map((buffer) => {
                    if (Buffer.isBuffer(buffer)) {
                        return buffer.toString("utf8");
                    }
                    return "";
                }).join("");
                const resultCompare = sourceString === destString;
                return {fileData, resultPipe, resultCompare};
            }).then((result) => {
                results.push(result);
                return true;
            }));
        }
        await Promise.all(promises);
        src.dispose();
        assert.equal(results.length, fileDataArr.length, "not all files passed");
        for (const result of results) {
            assert.equal(result.resultPipe, result.fileData.expectPipe,
                `pipe result unexpected ${result.fileData.file}`);
            assert.equal(result.resultCompare, result.fileData.expectCompare,
                `compare result unexpected ${result.fileData.file}`);
        }
        return true;
    }

    /**
     * Note: uses fileData.file to write instead of fileData.fileDest
     * @param config config
     * @param configResolver resolver
     * @param fileDataArr datas
     * @param debugLog log
     */
    async function TestPipeFakeToRealParrWithTest(config: ConnectConfig,
                                                  fileDataArr: IFileTestData[],
                                                  configResolver?: IConnectConfigResolver,
                                                  debugLog?: LogType) {
        const dst = new SftpClient(config, configResolver, debugLog, "*");
        const results: ITestResult[] = [];
        const promises: Array<Promise<boolean>> = [];
        for (const fileData of fileDataArr) {
            promises.push(Promise.resolve().then(async () => {
                const src = new FakeReadStream([fileData.buffer], debugLog);
                const resultPipe = await PipeFile(src, dst, "", fileData.file, debugLog);
                return { fileData, resultPipe, resultCompare: false };
            }).then((result) => {
                results.push(result);
                return true;
            }));
        }
        await Promise.all(promises);
        dst.dispose();
        assert.equal(results.length, fileDataArr.length, "not all files passed");
        for (const result of results) {
            assert.equal(result.resultPipe, result.fileData.expectPipe,
                `pipe result unexpected ${result.fileData.file}`);
        }
        const filesToCheck = fileDataArr.filter((fileData) => {
            return fileData.expectPipe; // don't do read-back test for expected to be failed
        });
        return TestPipeRealToFakeParr(config, filesToCheck, configResolver, debugLog);
    }

    async function TestPipeRealToRealParrWithTest(configSrc: ConnectConfig,
                                                  configDst: ConnectConfig,
                                                  fileDataArr: IFileTestData[],
                                                  configResolver?: IConnectConfigResolver,
                                                  debugLog?: LogType) {
        const src = new SftpClient(configSrc, configResolver, debugLog, "*src*");
        const dst = new SftpClient(configDst, configResolver, debugLog, "*dst*");
        const results: ITestResult[] = [];
        const promises: Array<Promise<boolean>> = [];
        for (const fileData of fileDataArr) {
            promises.push(Promise.resolve().then(async () => {
                const resultPipe = await PipeFile(src, dst, fileData.file, fileData.fileDest, debugLog);
                return { fileData, resultPipe, resultCompare: false };
            }).then((result) => {
                results.push(result);
                return true;
            }));
        }
        await Promise.all(promises);
        src.dispose();
        dst.dispose();
        assert.equal(results.length, fileDataArr.length, "not all files passed");
        for (const result of results) {
            assert.equal(result.resultPipe, result.fileData.expectPipe,
                `pipe result unexpected ${result.fileData.file}`);
        }
        const filesToCheck = fileDataArr.filter((fileData) => {
            return fileData.expectPipe; // don't do read-back test for expected to be failed
        }).slice(0).map((fileData) => {
            const newFileData = Object.assign({}, fileData);
            newFileData.file = fileData.fileDest;
            newFileData.fileDest = fileData.file;
            return newFileData;
        });
        return TestPipeRealToFakeParr(configDst, filesToCheck, configResolver, debugLog);
    }

    async function TestPipeRealToSameRealParrWithTest(configSrc: ConnectConfig,
                                                      fileDataArr: IFileTestData[],
                                                      configResolver?: IConnectConfigResolver,
                                                      debugLog?: LogType) {
        const src = new SftpClient(configSrc, configResolver, debugLog, "*");
        const results: ITestResult[] = [];
        const promises: Array<Promise<boolean>> = [];
        for (const fileData of fileDataArr) {
            promises.push(Promise.resolve().then(async () => {
                const resultPipe = await PipeFile(src, src, fileData.file, fileData.fileDest, debugLog);
                return { fileData, resultPipe, resultCompare: false };
            }).then((result) => {
                results.push(result);
                return true;
            }));
        }
        await Promise.all(promises);
        src.dispose();
        assert.equal(results.length, fileDataArr.length, "not all files passed");
        for (const result of results) {
            assert.equal(result.resultPipe, result.fileData.expectPipe,
                `pipe result unexpected ${result.fileData.file}`);
        }
        const filesToCheck = fileDataArr.filter((fileData) => {
            return fileData.expectPipe; // don't do read-back test for expected to be failed
        }).slice(0).map((fileData) => {
            const newFileData = Object.assign({}, fileData);
            newFileData.file = fileData.fileDest;
            newFileData.fileDest = fileData.file;
            return newFileData;
        });
        return TestPipeRealToFakeParr(configSrc, filesToCheck, configResolver, debugLog);
    }

});
