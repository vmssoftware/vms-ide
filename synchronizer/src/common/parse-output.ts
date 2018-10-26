import { VmsPathConverter } from "../vms/vms-path-converter";

const rgxCrLF = /([\r\n]*)/g;
const rgxMsgPos = /^(\.*)\^/;
const rgxMsg = /^(%(\S+)-(\S)-(\S*)),\s(.*)$/;
const rgxPlace = /^at line number (\d.*) in file (.*)$/;

interface IDiagnostics {
    file: string;
    line: number;
    pos: number;
    severity: "error" | "information";
    message: string;
    type: string;
}

type IPartialDiagnostics = Partial<IDiagnostics>;

export function parseCxxOutput(output: string) {
    const lines = output.split("\n").map((s) => s.replace(rgxCrLF, ""));
    const result = lines.reduce((problems, line, idx) => {
        const matched = line.match(rgxMsg);
        if (matched) {
            const diagnostic: IPartialDiagnostics = {};
            switch (matched[3]) {
                case "F":
                case "E":
                    diagnostic.severity = "error";
                    break;
                default:
                    diagnostic.severity = "information";
            }
            diagnostic.type = matched[4];
            diagnostic.message = matched[5];
            if (idx > 0) {
                const prevLine = lines[idx - 1];
                const prevMathed = prevLine.match(rgxMsgPos);
                if (prevMathed) {
                    diagnostic.pos = prevMathed[0].length;
                }
            }
            let nextLineIdx = idx + 1;
            while (nextLineIdx < lines.length) {
                const nextLine = lines[nextLineIdx];
                const nextLineMathed = nextLine.match(rgxPlace);
                if (nextLineMathed) {
                    diagnostic.line = parseInt(nextLineMathed[1], 10);
                    diagnostic.file = nextLineMathed[2];
                    const converter = VmsPathConverter.fromVms(diagnostic.file);
                    diagnostic.file = converter.initial;
                    break;
                }
                if (nextLine.startsWith("%")) { // another error line
                    break;
                }
                diagnostic.message += " " + nextLine.trim();
                ++nextLineIdx;
            }
            problems.push(diagnostic);
        }
        return problems;
    }, [] as IPartialDiagnostics[]);
    return result;
}
