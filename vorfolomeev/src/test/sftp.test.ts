//
// Note: This example test is leveraging the Mocha test framework.
// Please refer to their documentation on https://mochajs.org/ for help.
//

// The module 'assert' provides assertion methods from node
import * as assert from "assert";
import fs from "fs";
import readline from "readline";
import { Readable, Writable } from "stream";
import { Lock } from "../common/lock";
import { SimpleSftp } from "../simple-ssh/simple-sftp";
import { TestConfiguration } from "./config/config";
import { ContentTest } from "./contents";
import { WriteToBufferCreator } from "./write-to-buffer-creator";

// You can import and use all API from the 'vscode' module
// as well as import your extension to test it
// import * as vscode from 'vscode';
// import * as myExtension from '../extension';

// Defines a Mocha test suite to group tests of similar kind together
suite("SFTP tests", function(this: Mocha.Suite) {

    this.timeout(0);

    test("Pipe to file", async () => {

        const sftp = new SimpleSftp(await TestConfiguration());

        const testFile = { file: "test.tst", content: "1\r\n2\r\n3" };

        const stream = new Readable();
        stream.push(testFile.content);

        const inlineCreator = {
            createReadStream() {
                return stream;
            },
        };

        const result = await PipeFile(inlineCreator, sftp, testFile.file);
        assert.equal(result.errPassed, false, "File must be written");

    });

    test("Pipe from file", async () => {

        const sftp = new SimpleSftp(await TestConfiguration());

        const wsCreator = new WriteToBufferCreator();

        const testFile = { file: "test.tst", content: "1\r\n2\r\n3" };

        const result = await PipeFile(sftp, wsCreator, testFile.file);
        assert.equal(result.errPassed, false, "File must be read");

        const allBuff = Buffer.concat(wsCreator.stream.chunks);
        const strRet = allBuff.toString("utf8");
        assert.equal(ContentTest(strRet, testFile.content), true, "Content is different");

    });

    test("Pipe from 3 files", async () => {

        const sftp = new SimpleSftp(await TestConfiguration());

        const testFiles = [
            { file: "test.tst", content: "1\r\n2\r\n3" },
            { file: "unexisting.tst", content: "" },
            { file: "newfile.tst", content: "abcd\r\n1234" },
        ];

        const all = [];
        for (const tst of testFiles) {
            all.push(Promise.resolve().then(async () => {
                const wsCreator = new WriteToBufferCreator();
                const result = await PipeFile(sftp, wsCreator, testFiles[0].file);
                assert.equal(result.errPassed, false, "File must be read");
                const allBuff = Buffer.concat(wsCreator.stream.chunks);
                const strRet = allBuff.toString("utf8");
                assert.equal(ContentTest(strRet, tst.content), true, `Content is different ${tst.file}`);
            }));
        }

        return Promise.all(all).then((results) => {
            assert.ok(true, "done");
        });
    });

    test("Write file wrong path", async () => {

        const sftp = new SimpleSftp(await TestConfiguration());

        const result = await WriteFile("wrongpath/file.tst", " ", sftp);
        assert.equal(result, false, "Write must be failed");

    });

    test("Write file", async () => {

        const sftp = new SimpleSftp(await TestConfiguration());

        const result = await WriteFile("newfile.tst", "abcd\r\n1234", sftp);
        assert.equal(result, true, "Write failed");

    });

    test("Write file denied", async () => {

        const sftp = new SimpleSftp(await TestConfiguration());

        const result = await WriteFile("denied.tst", " ", sftp);
        assert.equal(result, false, "Write must be failed");

    });

    test("Read 3 files - good, bad, good", async () => {

        const testFiles = [
            { file: "test.tst", content: "1\r\n2\r\n3" },
            { file: "unexisting.tst", content: "" },
            { file: "newfile.tst", content: "abcd\r\n1234" },
        ];

        const sftp = new SimpleSftp(await TestConfiguration());
        const all = [];
        for (const tst of testFiles) {
            all.push(ReadFileViaReadLine(tst.file, sftp).then((result) => {
                assert.equal( ContentTest(result, tst.content), true, `Contents are different ${tst.file}`);
                return true;
            }));
        }

        return Promise.all(all).then((results) => {
            assert.ok(true, "done");
        });

    });

    test("Read unexisting file", async () => {

        const all = [];

        const sftp = new SimpleSftp(await TestConfiguration());

        const content = await ReadFileViaReadLine("not_existing_test.tst", sftp);

        assert.equal(content, "", "not_existing_test.tst must be empty");

    });

    test("Write and then read 2 files in parallel", async () => {

        const sftp = new SimpleSftp(await TestConfiguration());

        const testFiles = [
            { file: "newfile.tst", content: "abcd\r\n1234" },
            { file: "newfile_two.tst", content: "1\r\n2\r\n3\r\n4" },
        ];

        const all = [];
        for (const tst of testFiles) {
            all.push(WriteFile(tst.file, tst.content, sftp).then((result) => {
                assert.equal(result, true, `Write ${tst.file} failed`);
                return ReadFileViaReadLine(tst.file, sftp).then((content) => {
                    assert.equal( ContentTest( content, tst.content), true, `Contents are different ${tst.file}`);
                    return true;
                });
            }));
        }

        return Promise.all(all).then((results) => {
            // done
        });

    });

    test("Read file", async () => {

        const all = [];

        const sftp = new SimpleSftp(await TestConfiguration());

        const content = await ReadFileViaReadLine("test.tst", sftp);

        assert.equal(content.split("\r\n").length, 3, "test.tst must have 3 lines");

    });

    test("Read 2 files in parallel", async () => {

        const sftp = new SimpleSftp(await TestConfiguration());

        const all = [];
        all.push(ReadFileViaReadLine("denied.tst", sftp));
        all.push(ReadFileViaReadLine("test.tst", sftp));

        return Promise.all(all).then((results) => {
            assert.equal(results[0].split("\r\n").length, 2, "denied.tst must have 2 lines");
            assert.equal(results[1].split("\r\n").length, 3, "test.tst must have 3 lines");
        });

    });

    test("Write 2 files in parallel", async () => {

        const sftp = new SimpleSftp(await TestConfiguration());

        const all = [];
        all.push(WriteFile("newfile.tst", "abcd\r\n1234", sftp));
        all.push(WriteFile("newfile_two.tst", "1\r\n2\r\n3\r\r4", sftp));

        return Promise.all(all).then((results) => {
            assert.equal(results[0], true, "newfile.tst failed");
            assert.equal(results[1], true, "newfile_two.tst failed");
        });

    });

    async function ReadFileViaReadLine(filename: string, sftp: SimpleSftp) {

        const readStream = await sftp.createReadStream(filename);
        assert.notEqual(readStream, undefined, "Readstream must be defined");

        const lock = new Lock(true);

        const rl = readline.createInterface(readStream!);
        const lines: string[] = [];
        rl.on("line", (line) => {
            lines.push(line);
        });

        rl.on("close", () => {
            lock.release();
        });

        await lock.acquire();

        return lines.join("\r\n");
    }

    async function WriteFile(filename: string, content: string, sftp: SimpleSftp) {

        const writeStream = await sftp.createWriteStream(filename);
        assert.notEqual(writeStream, undefined, "Writestream must be defined");

        const lock = new Lock(true);

        let error = false;

        const cleaned = sftp.subscribe(sftp.writeStreamCleaned, (lastError) => {
            lock.release();
            if (lastError !== undefined) {
                // cleaned before the end
                error = true;
            }
        });

        writeStream!.write(content, (err) => {
            assert.equal(err, undefined, "Must have no errors");
        });

        writeStream!.end();

        await lock.acquire();

        cleaned.dispose();

        return !error;
    }

    async function PipeFile(source: {createReadStream: (f: string) => Readable | Promise<Readable|undefined>},
                            dest: {createWriteStream: (f: string) => Writable | Promise<Writable|undefined>},
                            file: string) {

        let errPassed = false;

        const srcStream: Readable|undefined = await source.createReadStream(file);
        if (srcStream) {
            const dstStream: Writable|undefined = await dest.createWriteStream(file);
            if (dstStream) {

                const doneSource = new Lock(true);
                const doneDest = new Lock(true);

                srcStream.pipe(dstStream);

                srcStream.once("error", (err) => {
                    if (!errPassed) {
                        setImmediate(() => dstStream.emit("error", err));
                        errPassed = true;
                    }
                    doneSource.release();
                });

                dstStream.once("error", (err) => {
                    if (!errPassed) {
                        setImmediate(() => srcStream.emit("error", err));
                        errPassed = true;
                    }
                    doneDest.release();
                });

                srcStream.once("end", () => {
                    doneSource.release();
                });

                dstStream.once("finish", () => {
                    doneDest.release();
                });

                await doneSource.acquire();
                await doneDest.acquire();

            } else {
                // srcStream close?
                srcStream.emit("error", new Error("no dest"));
            }
        }

        return { file, errPassed};
    }

});
