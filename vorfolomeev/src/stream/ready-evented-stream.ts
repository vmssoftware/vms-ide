import { EventEmitter } from "events";

export interface IReadyEmitter extends EventEmitter {
    on(event: "ready", listener: (content: string) => void): this;
}
