import { LogResult, LogType } from "@vorfol/common";
import { window } from "vscode";

export function createLogFunction(channelName: string) {
    const channel = window.createOutputChannel(channelName);
    return function logVsCode(type: LogType, message: LogResult, show?: boolean ) {
        switch (type) {
            case LogType.debug:
                // tslint:disable-next-line:no-console
                // console.log(message());
                break;
            default:
                channel.appendLine(message());
                if (show) {
                    channel.show();
                }
                break;
        }
    };
}
