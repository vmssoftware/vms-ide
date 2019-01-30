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

const rgxMsgMessage = /^((%|-)(MESSAGE)-(\S)-(\S*)),\s(.*)$/;
const rgxMsgMessageFSyntax = /%MESSAGE-F-SYNTAX, error parsing '(\S+)'/i;
const rgxMsgMMSAbort = /%MMS-F-ABORT, For target ([^,]*),/;

const rgxMsgMMS = /^((%|-)(MMS)-(\S)-(\S*)),\s(.*)$/;
const rgxMsgFileSintax = /(.*) in file (.*)$/;
const rgxMsgInfoMessages = [
    /\d+ (catastrophic )?error(s?) detected in the compilation of/,
    /Compilation terminated/,
];

const mmsExt = ".MMS";

const lineStartRgx = [
    rgxMsg,
    rgxPlaceCXX,
    rgxMsgCXX,
    rgxMsgMMS,
];

export function consolidateOutputLines(output: string[], shellWidth?: number) {
    const lines = output.filter((s) => !!s);
    const retLines = lines.reduce((acc, line, idx, source) => {
        if (lineStartRgx.some((rgx) => {
            return rgx.test(line);
            }))  {
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

function isVmsSeverity(o: any): o is VmsSeverity {
    return Object.values(VmsSeverity).includes(o);
}

export function parseVmsOutput(output: string[], shellWidth?: number) {
    const lines = consolidateOutputLines(output, shellWidth);
    const problems: IPartialDiagnostics[] = [];

    let i = 0;
    while (i < lines.length) {
        let [consume, from]  = findCxxErrors(i);
        if (!consume) {
            [consume, from] = findMmsErrors(i);
        }
        if (!consume) {
            [consume, from] = findMessageErrors(i);
        }
        if (consume) {
            lines.splice(from, consume);
            i = from;
        } else {
            i++;
        }
    }

    return { problems, lines } ;

    /**
     * returns consumed lines
     */
    function findCxxErrors(idx: number) {
        let consume = 0;
        let from = idx;
        const line = lines[idx];
        const matched = line.match(rgxMsgCXX);
        if (matched) {
            consume++;
            if (rgxMsgInfoMessages.some((rgx) => rgx.test(matched[6]))) {
                // skip summary information
                return [consume, from];
            }
            const diagnostic: IPartialDiagnostics = {
                facility: matched[3],
                severity: VmsSeverity.information,
            };
            const trySeverity = matched[4];
            if (isVmsSeverity(trySeverity)) {
                diagnostic.severity = trySeverity;
            }
            if (// diagnostic.severity === VmsSeverity.information ||
                diagnostic.severity === VmsSeverity.success) {
                    return [consume, from];
            }
            diagnostic.type = matched[5];
            diagnostic.message = matched[6];
            // get position from previous line, as "..............^"
            if (idx > 0) {
                const prevLine = lines[idx - 1];
                const prevMathed = prevLine.match(rgxMsgPosCXX);
                if (prevMathed) {
                    diagnostic.pos = prevMathed[0].length;
                    from -= 2;
                    consume += 2;
                }
            }
            // get file and line
            idx++;
            consume++;
            while (idx < lines.length) {
                const nextLine = lines[idx];
                const nextLineMathed = nextLine.match(rgxPlaceCXX);
                if (nextLineMathed) {
                    diagnostic.line = parseInt(nextLineMathed[1], 10);
                    diagnostic.file = nextLineMathed[2];
                    const converter = VmsPathConverter.fromVms(diagnostic.file);
                    diagnostic.file = converter.initial;
                    break;
                } else {
                    diagnostic.message += nextLine;
                    idx++;
                    consume++;
                }
            }
            problems.push(diagnostic);
        }
        return [consume, from];
    }

    /**
     * returns consumed lines
     */
    function findMessageErrors(idx: number) {
        let consume = 0;
        let from = idx;
        const line = lines[idx];
        const matched = line.match(rgxMsgMessage);
        if (matched) {
            consume++;
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
            if (idx > 0) {
                // assume prevoius line contains source line with error, so consume it
                from -= 1;
                consume += 1;
                const prevLine = lines[idx - 1];
                // assume first 40 symbols are line number
                diagnostic.line = parseInt(prevLine.slice(0, 40), 10);
                diagnostic.pos = 1;
                // test if it is syntax parsing error, so we can get position
                const syntaxMatch = line.match(rgxMsgMessageFSyntax);
                if (syntaxMatch && syntaxMatch[1]) {
                    const parseErrorPos = prevLine.toLowerCase().indexOf(syntaxMatch[1].toLowerCase());
                    if (parseErrorPos >= 0) {
                        diagnostic.pos = parseErrorPos - 40 + 1;    // magic numbers: 40 is length of line number + 1 is starting column
                    }
                }
            }
            // get file, do not consume
            idx++;
            while (idx < lines.length) {
                const nextLine = lines[idx];
                const nextLineMathed = nextLine.match(rgxMsgMMSAbort);
                if (nextLineMathed && nextLineMathed[1]) {
                    const path = nextLineMathed[1];
                    const converter = VmsPathConverter.fromVms(path);
                    diagnostic.file = converter.initial;
                    break;
                } else {
                    idx++;
                }
            }
            problems.push(diagnostic);
        }
        return [consume, from];
    }

    function findMmsErrors(idx: number) {
        let consume = 0;
        const line = lines[idx];
        const matched = line.match(rgxMsgMMS);
        if (matched) {
            consume++;
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
        return [consume, idx];
    }
}
