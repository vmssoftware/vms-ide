import { Readable } from "stream";
import { Lock } from "./lock";

export async function ReadAllStream(stream: Readable) {
    let locker = new Lock(true);
    let result = "";
    stream.on('data', (chunk) => { 
        if (typeof chunk === "string") {
            result += chunk;
        } else if ( Buffer.isBuffer(chunk)) {
            result += chunk.toString('utf8');
        }
    });
    stream.on('end', () => { 
        locker.release();
    });
    await locker.acquire();
    return result;
}
