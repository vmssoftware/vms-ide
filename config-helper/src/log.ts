import * as fs from "fs";
import * as path from "path";

import { LogFunction, LogResult, LogType } from "@vorfol/common";
import { window, workspace } from "vscode";

export function createLogFunction(channelName: string): LogFunction {
    const channel = window.createOutputChannel(channelName);

    const config = workspace.getConfiguration("vmssoftware.config-helper");
    const debug = config.get<string>("debug");
    const addCaleeInfo = config.get<boolean>("addCalleeInfo");

    // tslint:disable-next-line:no-empty
    let fnDebugOut: ((s: string) => void) | undefined;
    if (debug !== undefined) {
        if (debug.toLowerCase() === "console") {
            // tslint:disable-next-line:no-console
            fnDebugOut = console.log;
        } else {
            fs.stat(debug, (err, stat) => {
                if (!err && stat) {
                    if (stat.isDirectory()) {
                        const now = new Date();
                        const parts = [
                            now.getFullYear(),
                            now.getMonth(),
                            now.getDate(),
                        ];
                        const logFileName = path.join(debug, parts.join("_") + ".log");
                        const stream = fs.createWriteStream(logFileName, {
                            flags: "a",
                        });
                        fnDebugOut = (s: string) => {
                            try {
                                stream.write(s);
                                stream.write("\n");
                            } catch (err) {
                                fnDebugOut = undefined;
                            }
                        };
                        fnDebugOut(`\nStart debug LOG for "${channelName}" : ${now.toLocaleString()}\n`);
                    }
                }
            });
        }
    }

    let strQueue: string[] = [];

    return function logVsCode(type: LogType, message: LogResult, show?: boolean, addStackLevel?: number ) {
        switch (type) {
            case LogType.debug:
                if (debug) {
                    // user chose do not ignore debug messages
                    let place: string | undefined;
                    if (addCaleeInfo) {
                        const err = new Error();
                        if (err.stack) {
                            addStackLevel = addStackLevel ? addStackLevel + 2 : 2;
                            const lines = err.stack.split("at ");
                            if (lines.length > addStackLevel) {
                                // TODO: format it any how...
                                place = lines[addStackLevel].trim();
                            }
                        }
                    }
                    if (fnDebugOut) {
                        for (const str of strQueue) {
                            fnDebugOut(str);
                        }
                        strQueue = [];
                        if (place) {
                            fnDebugOut(place);
                        }
                        fnDebugOut(message());
                    } else {
                        // we are waiting for file is opened
                        if (place) {
                            strQueue.push(place);
                        }
                        strQueue.push(message());
                    }
                }
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
