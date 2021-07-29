
import { LogFunction, LogType } from "../../common/main";
import { CSAResult, IConfigData, IConfigStorage } from "./config";

/**
 * ConfigStorageImpl
 */
export class ConfigStorageImpl implements IConfigStorage {

    public logFn: LogFunction;

    protected jsonData: any = {};
    protected content?: string;

    public GetContent() {
        return this.content;
    }

    public SetContent(newContent?: string) {
        this.content = newContent;
    }

    constructor(logFn?: LogFunction) {
        // tslint:disable-next-line:no-empty
        this.logFn = logFn || (() => {});
    }

    public fillStart(): Promise<CSAResult> {
        return new Promise<CSAResult>((resolve) => {
            try {
                this.jsonData = JSON.parse(this.content!);
                this.logFn(LogType.debug, () => "JSON.parse => ok");
                resolve(CSAResult.ok);
            }
            catch(err) {
                this.logFn(LogType.debug, () => `${err}`);
                resolve(CSAResult.prepare_failed);
            }
        });
    }

    public fillData(section: string, data: IConfigData): Promise<CSAResult> {
        return new Promise((resolve) => {
            if (this.jsonData && this.jsonData[section]) {
                const jsonSection = this.jsonData[section];
                for (const key in data) {
                    if (jsonSection[key] !== undefined) {
                        data[key] = jsonSection[key];
                    }
                }
                this.logFn(LogType.debug, () => "fillData => ok " + section);
                resolve(CSAResult.ok);
            } else {
                this.logFn(LogType.debug, () => "fillData => fail " + section);
                resolve(CSAResult.some_data_failed);
            }
        });
    }

    public fillEnd(): Promise<CSAResult> {
        return new Promise((resolve) => {
            this.logFn(LogType.debug, () => "fillEnd");
            resolve(CSAResult.ok);
        });
    }

    public storeStart(): Promise<CSAResult> {
        return new Promise((resolve) => {
            this.logFn(LogType.debug, () => "storeStart");
            this.jsonData = {};
            resolve(CSAResult.ok);
        });
    }

    public storeData(section: string, data: IConfigData): Promise<CSAResult> {
        return new Promise((resolve) => {
            // TODO: test if section was added before?
            this.logFn(LogType.debug, () => "storeData " + section);
            this.jsonData[section] = data;
            resolve(CSAResult.ok);
        });
    }

    public storeEnd(): Promise<CSAResult> {
        return new Promise<CSAResult>((resolve) => {
            this.logFn(LogType.debug, () => "storeEnd =");
            try {
                    this.content = JSON.stringify(this.jsonData, null, 4);
                    this.logFn(LogType.debug, () => "storeEnd => ok");
                    resolve(CSAResult.ok);
                } catch (err) {
                    this.logFn(LogType.debug, () => "storeEnd => failed");
                    resolve(CSAResult.end_failed);
                }
        });
    }
}
