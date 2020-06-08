import { Readable, Writable } from "stream";

export async function readWholeStream(stream: Readable | undefined) {
    return new Promise<string>((resolve) => {
        if (stream) {
            const chunks: Buffer[] = [];
            stream.on('data', chunk => Buffer.isBuffer(chunk) ? chunks.push(chunk) : undefined);
            stream.on('error', () => resolve(""));
            stream.on('end', () => resolve(Buffer.concat(chunks).toString('utf8')));
        } else {
            resolve("");
        }
    });
}

export async function writeWholeStream(stream: Writable | undefined, data: Buffer | string) {
    if (typeof data === "string") {
        data = Buffer.from(data, "utf-8");
    }
    return new Promise<boolean>(async (resolve) => {
        if (stream) {
            stream.write(data);
            stream.end();
        } else {
            resolve(false);
        }
    });
}
