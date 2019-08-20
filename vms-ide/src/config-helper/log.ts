import * as fs from "fs";
import * as path from "path";
import { window, workspace, OutputChannel } from "vscode";

import { LogFunction, LogResult, LogType } from "../common/main";

let strQueue: string[] = [];
let fnDebugToFile: ((s: string) => void) | undefined;
let waitFnCreated = false;
let dir = "";

function debugToFile(s: string) {
    if (fnDebugToFile) {
        fnDebugToFile(s);
        return;
    }
    strQueue.push(s);
    if (waitFnCreated) {
        return;
    }
    waitFnCreated = true;
    fs.stat(dir, (err, stat) => {
        if (!err && stat) {
            if (stat.isDirectory()) {
                const now = new Date();
                const parts = [
                    now.getFullYear().toString(10),
                    (now.getMonth() + 1).toString(10).padStart(2, "0"),
                    now.getDate().toString(10).padStart(2, "0"),
                ];
                const logFileName = path.join(dir, parts.join("_") + ".log");
                const stream = fs.createWriteStream(logFileName, {
                    flags: "a",
                });
                fnDebugToFile = (str: string) => {
                    try {
                        stream.write(str);
                        stream.write("\n");
                    } catch (err) {
                        // tslint:disable-next-line:no-console
                        console.log(err);
                        fnDebugToFile = undefined;
                    }
                };
                for (const str of strQueue) {
                    fnDebugToFile(str);
                }
                strQueue = [];
            }
        }
        waitFnCreated = false;
    });
}

const _channels = new Map<string, OutputChannel>();

export function createLogFunction(channelName: string): LogFunction {

    let channel = _channels.get(channelName);
    if (channel === undefined) {
        channel = window.createOutputChannel(channelName);
        _channels.set(channelName, channel);
    }

    const config = workspace.getConfiguration("vmssoftware.config-helper.settings", null);
    const debug = config.get<string>("debug");
    const addCaleeInfo = config.get<boolean>("addCalleeInfo");

    let fnDebugOut: ((s: string) => void);
    if (debug !== undefined) {
        if (debug.toLowerCase() === "console") {
            // tslint:disable-next-line:no-console
            fnDebugOut = console.log;
        } else {
            dir = debug;
            fnDebugOut = debugToFile;
            fnDebugOut(`\nStart debug LOG for "${channelName}" : ${new Date().toLocaleString()}\n`);
        }
    }

    return function logVsCode(type: LogType, message: LogResult, show?: boolean, addStackLevel?: number ) {
        // show messages to user
        if (show) {
            if (type === LogType.error) {
                window.showErrorMessage(message());
            } else if (type === LogType.warning) {
                window.showInformationMessage(message());
            }
        }
        switch (type) {
            case LogType.error:
            case LogType.warning:
                // pass to channel
            case LogType.information:
                if (channel) {
                    channel.appendLine(message());
                    if (show) {
                        channel.show();
                    }
                }
                // pass to file
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
                    if (place) {
                        fnDebugOut(place);
                    }
                    fnDebugOut(message());
                }
                break;
        }
    };

}
