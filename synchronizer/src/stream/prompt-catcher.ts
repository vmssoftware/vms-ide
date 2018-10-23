import { ICanCreateWriteStream } from "./can-create-stream";

/**
 * Must care about errors self
 * Emits readyEvent(content) in any case: if ok - the content will contain the command answer, if it fails - the content will be undefined
 */
export interface IPromptCatcher extends ICanCreateWriteStream {
    readyEvent: string | symbol;
    prompt: string;
}
