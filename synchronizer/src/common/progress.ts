import { Disposable, window } from "vscode";
import { IProgress } from "../sync/source";

export interface IValueOfMax {
    value: number;
    maxValue?: number;
}

export class Progress implements IProgress, Disposable {

    private map: Map<string, IValueOfMax> = new Map<string, IValueOfMax>();

    private prevMessage: Disposable | undefined;

    public getToken(token: string) {
        return this.map.get(token);
    }

    public dispose() {
        if (this.prevMessage) {
            this.prevMessage.dispose();
        }
        this.prevMessage = undefined;
    }

    public addProgress(token: string, addValue: number): boolean {
        let prev = this.map.get(token);
        if (!prev) {
            prev = { value: 0, maxValue: 0};
        }
        prev.value += addValue;
        this.map.set(token, prev);
        this.update();
        return false;   // no canceling at all
    }

    public setProgress(token: string, value: number, maxValue?: number): boolean {
        maxValue = maxValue || 0;
        this.map.set(token, {value, maxValue});
        this.update();
        return false;   // no canceling at all
    }

    private update() {
        // setImmediate(() => {
            const strArr: string[] = [];
            for ( const [key, valueOf] of this.map) {
                if (strArr.length > 0) {
                    strArr.push(", ");
                }
                strArr.push(key);
                strArr.push(": ");
                strArr.push(String(valueOf.value));
                if (valueOf.maxValue) {
                    strArr.push(" of ");
                    strArr.push(String(valueOf.maxValue));
                }
            }
            if (this.prevMessage) {
                this.prevMessage.dispose();
            }
            this.prevMessage = window.setStatusBarMessage(strArr.join(""));
        // });
    }
}
