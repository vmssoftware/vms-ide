import { VmsPathConverter } from "../vms/vms-path-converter";

enum VmsSeverity {
    fatal = "F",
    error = "E",
    warning = "W",
    information = "I",
    success = "S",
}

interface IDiagnostics {
    facility: string;
    file: string;
    line: number;
    pos: number;
    severity: VmsSeverity;
    message: string;
    type: string;
}

type IPartialDiagnostics = Partial<IDiagnostics>;

const rgxMsg = /^((%|-)(\S+)-(\S)-(\S*)),\s(.*)$/;

const rgxMsgCXX = /^((%|-)(CXX|CC)-(\S)-(\S*)),\s(.*)$/;
const rgxPlaceCXX = /^at line number (\d.*) in file (.*)$/;
const rgxMsgPosCXX = /^(\.*)\^/;

const rgxMsgMMS = /^((%|-)(MMS)-(\S)-(\S*)),\s(.*)$/;
const rgxMsgFileSintax = /(.*) in file (.*)$/;
const rgxMsgFileAbort = /For target (.*), (.*)$/;
const mmsExt = ".MMS";

export function consolidateOutputLines(output: string, shellWidth?: number) {
    const lines = output.split("\r\n");
    const retLines = lines.reduce((acc, line, idx, source) => {
        if (line.match(rgxMsg)) {
            acc.push(line);
            return acc;
        }
        if (idx > 0 && source[idx - 1].length === shellWidth) {
            acc[acc.length - 1] += line;
            return acc;
        }
        acc.push(line);
        return acc;
    }, [] as string[]);
    return retLines;
}

export function parseVmsOutput(output: string, shellWidth?: number) {
    const lines = consolidateOutputLines(output, shellWidth);
    const result: IPartialDiagnostics[] = [];
    lines.reduce(findCxxErrors, result);
    lines.reduce(findMmsErrors, result);

    return result;

    function isVmsSeverity(o: any): o is VmsSeverity {
        return Object.values(VmsSeverity).includes(o);
    }

    function findCxxErrors(problems: IPartialDiagnostics[], line: string, idx: number) {
        const matched = line.match(rgxMsgCXX);
        if (matched) {
            const diagnostic: IPartialDiagnostics = {
                facility: matched[3],
                severity: VmsSeverity.information,
            };
            const trySeverity = matched[4];
            if (isVmsSeverity(trySeverity)) {
                diagnostic.severity = trySeverity;
            }
            diagnostic.type = matched[5];
            diagnostic.message = matched[6];
            // get position from previous line, as "..............^"
            if (idx > 0) {
                const prevLine = lines[idx - 1];
                const prevMathed = prevLine.match(rgxMsgPosCXX);
                if (prevMathed) {
                    diagnostic.pos = prevMathed[0].length;
                }
            }
            // get file and line
            if (idx + 1 < lines.length) {
                const nextLine = lines[idx + 1];
                const nextLineMathed = nextLine.match(rgxPlaceCXX);
                if (nextLineMathed) {
                    diagnostic.line = parseInt(nextLineMathed[1], 10);
                    diagnostic.file = nextLineMathed[2];
                    const converter = VmsPathConverter.fromVms(diagnostic.file);
                    diagnostic.file = converter.initial;
                }
            }
            problems.push(diagnostic);
        }
        return problems;
    }

    function findMmsErrors(problems: IPartialDiagnostics[], line: string, idx: number) {
        const matched = line.match(rgxMsgMMS);
        if (matched) {
            const diagnostic: IPartialDiagnostics = {
                facility: matched[3],
                severity: VmsSeverity.information,
            };
            const trySeverity = matched[4];
            if (isVmsSeverity(trySeverity)) {
                diagnostic.severity = trySeverity;
            }
            diagnostic.type = matched[5];
            diagnostic.message = matched[6];
            const matchFile = diagnostic.message.match(rgxMsgFileSintax);
            if (matchFile) {
                diagnostic.file = matchFile[2];
                diagnostic.message = matchFile[1];
            }
            // we don't need file from such messages
            // if (diagnostic.file === undefined) {
            //     matchFile = diagnostic.message.match(rgxMsgFileAbort);
            //     if (matchFile) {
            //         diagnostic.file = matchFile[1];
            //         diagnostic.message = matchFile[2];
            //     }
            // }
            if (diagnostic.file) {
                const converter = VmsPathConverter.fromVms(diagnostic.file);
                if (converter.file.includes(".")) {
                    diagnostic.file = converter.initial;
                } else {
                    diagnostic.file = converter.initial + mmsExt;
                }
            }
            problems.push(diagnostic);
        }
        return problems;
    }
}
