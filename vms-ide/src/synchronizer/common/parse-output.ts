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
    external: boolean;
}

type IPartialDiagnostics = Partial<IDiagnostics>;

interface IParseRgx {
    rgxMain: RegExp;                // main match
    rgxSkip: RegExp[];              // consume and skip
    facilityPos: number;            // next 4 values are positions in rgxMain for appropriate matches
    severityPos: number;
    typePos: number;
    messagePos: number;
    lineNumLength: number;          // length of line number value in source line (starts with)
    rgxDoSearchPrev: RegExp[];      // if mathed, search it in previous line to get position of matched[1]
    rgxLinePresent: RegExp[];       // if mathed, do not search anything in previous line (it as absent)
    rgxDoSearchNextForPath: RegExp; // try to find target file name
    rgxMsgPos?: RegExp;             // pattern for searching position in previous line
    rgxMsgFileSintax?: RegExp;      // pattern for search file name in current line
}

const rgxMsg = /^((%|-)(\S+)-(\S)-(\S*)),\s(.*)$/;

const rgxMsgCompiler = /^((%|-)(CXX|CC|COBOL|BLS32|BASIC|F90|PASCAL)-(\S)-(\S*)),\s(.*)$/;
const rgxPlaceCompiler = /^at line number (\d+) in file (.*)$/;
const rgxPlaceCompiler_TLB = /^at line number (\d+) in module (\S+) of text library (.*)$/;
const rgxMsgPosCompiler = /^(\.*)\^/;
const rgxMsgInfoMessages = [
    /\d+ (catastrophic )?error(s?) detected in the compilation of/,
    /Compilation terminated/,
];
const typesToSkip = new Set<string>([
    "ENDNOOBJ",
    "ENDDIAGS"
]);

const parseRgxMSG: IParseRgx = {
    rgxMain: /^((%|-)(MESSAGE)-(\S)-(\S*)),\s(.*)$/,
    rgxSkip: [ ],
    facilityPos: 3,
    severityPos: 4,
    typePos: 5,
    messagePos: 6,
    lineNumLength: 40,
    rgxDoSearchPrev: [
        /%MESSAGE-F-SYNTAX, error parsing '(\S+)'/i,
    ],
    rgxLinePresent: [],
    rgxDoSearchNextForPath: /%MMS-F-ABORT, For target ([^,]*),/,
};

const parseRgxCLD: IParseRgx = {
    rgxMain: /^((%|-)(CDU)-(\S)-(\S*)),\s(.*)$/,
    rgxSkip: [ ],
    facilityPos: 3,
    severityPos: 4,
    typePos: 5,
    messagePos: 6,
    lineNumLength: 10,
    rgxDoSearchPrev: [
        /%CDU-E-INVITEM, Invalid item \"(.*?)\"/,
        /%CDU-E-INVTYPE, Built-in type ([a-z$_][a-z$_0-9]*) is not defined/i,
    ],
    rgxLinePresent: [
        /%CDU-[EFWIS]-(?:\w+), Line (\d+):/
    ],
    rgxDoSearchNextForPath: /%MMS-F-ABORT, For target ([^,]*),/,
};

const rgxMsgMMS = /^((%|-)(MMS)-(\S)-(\S*)),\s(.*)$/;
const rgxMsgFileSintax = /(.*) in file (.*), line (\d+)\.$/;

const mmsExt = ".MMS";

const lineStartRgx = [
    rgxMsg,
    rgxPlaceCompiler,
    rgxPlaceCompiler_TLB,
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
        let [consume, from]  = findCompilerErrors(i);
        if (!consume) {
            [consume, from] = findJVMErrors(i);
        }
        if (!consume) {
            [consume, from] = findMmsErrors(i);
        }
        if (!consume) {
            [consume, from] = findErrors(i, parseRgxCLD);
        }
        if (!consume) {
            [consume, from] = findErrors(i, parseRgxMSG);
        }
        if (consume) {
            lines.splice(from, consume);
            i = from;
        } else {
            i++;
        }
    }

    return { problems, lines } ;

    function findJVMErrors(idx: number) {

        const rgxMsgJVM = /^(\S+?):(\d+):((\d+):)? (\S+?): (.*?)(: (.*))?$/;
        const rgxPosJVM = /^\s*\^/;
        // const rgxSymbJVM = /^\s*symbol:\s*(.*?)$/;
        // const rgxLocJVM = /^\s*location:\s*(.*?)$/;

        let consume = 0;
        let from = idx;
        const line = lines[idx];
        const matched = line.match(rgxMsgJVM);
        if (matched) {
            consume += 3;
            const diagnostic: IPartialDiagnostics = {
                facility:   "jvm",
                file:       matched[1],
                line:      +matched[2],
                pos:        1,
                message:    matched[6],
                severity:   VmsSeverity.error,
            };
            if (matched[3]) {
                diagnostic.pos = +matched[4];
            } else if (idx + 2 < lines.length){
                const posLine = lines[idx+2];
                const posMatched = posLine.match(rgxPosJVM);
                if (posMatched && posMatched[0]) {
                    diagnostic.pos = posMatched[0].length;
                }
            }
            // if (idx + consume + 1 < lines.length) {
            //     const lineT = lines[idx + consume];
            //     if (lineT.match(rgxSymbJVM)) {
            //         consume ++;
            //     }
            // }
            // if (idx + consume + 1 < lines.length) {
            //     const lineT = lines[idx + consume];
            //     if (lineT.match(rgxLocJVM)) {
            //         consume ++;
            //     }
            // }
            while (idx + consume + 1 < lines.length) {
                const lineT = lines[idx + consume];
                if (!lineT.length || line[0] === ' ') {
                    consume ++;
                } else {
                    break;
                }
            }
            problems.push(diagnostic);
        }
        return [consume, from];
    }

    /**
     * returns consumed lines
     */
    function findCompilerErrors(idx: number) {
        let consume = 0;
        let from = idx;
        const line = lines[idx];
        const matched = line.match(rgxMsgCompiler);
        if (matched) {
            consume++;
            if (rgxMsgInfoMessages.some((rgx) => rgx.test(matched[6]))) {
                // skip summary information
                return [consume, from];
            }
            const additionalDiagnostics: IPartialDiagnostics[] = [];
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
            if (typesToSkip.has(diagnostic.type)) {
                // eat this line
                return [consume, from];
            }
            // get position from previous line, as "..............^"
            if (idx > 0) {
                const prevLine = lines[idx - 1];
                const prevMathed = prevLine.match(rgxMsgPosCompiler);
                if (prevMathed) {
                    diagnostic.pos = prevMathed[0].length;
                    from -= 2;
                    consume += 2;
                }
            }
            // get file and line
            const continueLine = `-${diagnostic.facility}-([FEWIS])-(\\S+), (.*)`;
            const rgxContinueLine = new RegExp(continueLine);
            while (idx + 1 < lines.length) {
                const nextLine = lines[idx + 1];
                const continueMatched = nextLine.match(rgxContinueLine);
                if (continueMatched) {
                    const addDiags: IPartialDiagnostics = {
                        facility: diagnostic.facility,
                        severity: VmsSeverity.information,
                    };
                    const trySeverity = continueMatched[1];
                    if (isVmsSeverity(trySeverity)) {
                        addDiags.severity = trySeverity;
                    }
                    addDiags.type = continueMatched[2];
                    addDiags.message = continueMatched[3];
                    additionalDiagnostics.push(addDiags);
                    ++idx;
                    ++consume;
                    continue;
                }
                const nextLineMathed = nextLine.match(rgxPlaceCompiler);
                if (nextLineMathed) {
                    diagnostic.line = parseInt(nextLineMathed[1], 10);
                    diagnostic.file = nextLineMathed[2];
                    const converter = VmsPathConverter.fromVms(diagnostic.file);
                    diagnostic.file = converter.initial;
                    ++idx;
                    ++consume;
                    break;
                } else {
                    const nextLineMathed_TLB = nextLine.match(rgxPlaceCompiler_TLB);
                    if (nextLineMathed_TLB) {
                        diagnostic.line = parseInt(nextLineMathed_TLB[1], 10);
                        diagnostic.file = nextLineMathed_TLB[2];
                        const converter = VmsPathConverter.fromVms(diagnostic.file);
                        diagnostic.file = converter.initial;
                        diagnostic.external = true;
                        ++idx;
                        ++consume;
                        break;
                    }
                    if (lineStartRgx.some((rgx) => rgx.test(nextLine)))  {
                        break;
                    }
                    diagnostic.message += nextLine;
                    ++idx;
                    ++consume;
                }
            }
            for (const addDiag of additionalDiagnostics) {
                addDiag.file = diagnostic.file;
                addDiag.line = diagnostic.line;
                addDiag.pos = diagnostic.pos;
                addDiag.external = diagnostic.external;
                problems.push(addDiag);
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
                if (matchFile[3]) {
                    diagnostic.line = +matchFile[3];
                    diagnostic.pos = 1;
                }
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

    /**
     * Designed for CLD and MSG
     * @param idx starting line
     * @param parseRgx parse parameters
     */
    function findErrors(idx: number, parseRgx: IParseRgx) {
        let consume = 0;
        let from = idx;
        const line = lines[idx];
        //
        const matched = line.match(parseRgx.rgxMain);
        if (matched) {
            consume++;
            if (parseRgx.rgxSkip.some((rgx) => rgx.test(matched[parseRgx.messagePos]))) {
                return [consume, from];
            }
            const diagnostic: IPartialDiagnostics = {
                facility: matched[parseRgx.facilityPos],
                severity: VmsSeverity.information,
            };
            const trySeverity = matched[parseRgx.severityPos];
            if (isVmsSeverity(trySeverity)) {
                diagnostic.severity = trySeverity;
            }
            diagnostic.type = matched[parseRgx.typePos];
            diagnostic.message = matched[parseRgx.messagePos];
            for (const rgx of parseRgx.rgxLinePresent) {
                const lineMatch = line.match(rgx);
                if (lineMatch && lineMatch[1]) {
                    diagnostic.line = parseInt(lineMatch[1], 10);
                    diagnostic.pos = 1; // we have no source line to find error position
                    break;
                }
            }
            if (typeof diagnostic.line === "undefined" && idx > 0) {
                // assume prevoius line contains source line with error, so consume it
                from -= 1;
                consume += 1;
                const prevLine = lines[idx - 1];
                // assume first N symbols are line number
                diagnostic.line = parseInt(prevLine.slice(0, parseRgx.lineNumLength), 10);
                diagnostic.pos = 1;
                // test if it is known error, so we can get position
                for (const rgx of parseRgx.rgxDoSearchPrev) {
                    const knownMatch = line.match(rgx);
                    if (knownMatch && knownMatch[1]) {
                        const errPos = prevLine.toLowerCase().indexOf(knownMatch[1].toLowerCase());
                        if (errPos >= 0) {
                            diagnostic.pos = errPos - parseRgx.lineNumLength + 1;
                            break;
                        }
                    }
                }
            }
            // get file, do not consume
            idx++;
            while (idx < lines.length) {
                const nextLine = lines[idx];
                const nextLineMathed = nextLine.match(parseRgx.rgxDoSearchNextForPath);
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

}
