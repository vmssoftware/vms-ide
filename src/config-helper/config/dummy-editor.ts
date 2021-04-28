import { IConfigEditor } from "./config";

/**
 * Dummy Editor implementation
 */
export class DummyEditor implements IConfigEditor {
    public invoke(): Promise<boolean> {
        return Promise.resolve(false);
    }
}
