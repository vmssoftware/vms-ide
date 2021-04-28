import { EventEmitter } from "events";

export interface IUnSubscribe {
    unsubscribe: () => void;
}

export function Subscribe(emitter: EventEmitter, event: string | symbol, listener: (...args: any[]) => void)
        : IUnSubscribe {
    emitter.on(event, listener);
    return { unsubscribe: () => {
        emitter.removeListener(event, listener);
    }};
}
