import { ICanCreateWriteStream } from "./can-create-stream";

export interface IPromptCatcher extends ICanCreateWriteStream {
    readyEvent: string | symbol;
    prompt: string;
}
