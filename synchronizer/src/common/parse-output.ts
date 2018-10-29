
const rgxCrLF = /([\r\n]*)/g;
const rgxMsgPos = /^(\.*)\^/;
const rgxMsg = /^((%|-)(\S+)-(\S)-(\S*)),\s(.*)$/;
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

export function parseVmsOutput(output: string) {
    const lines = output.split("\n").map((s) => s.replace(rgxCrLF, ""));
    const result = lines.reduce((problems, line, idx) => {
        const matched = line.match(rgxMsg);
        if (matched) {
            const diagnostic: IPartialDiagnostics = {};
            switch (matched[4]) {
                case "F":
                case "E":
                    diagnostic.severity = "error";
                    break;
                default:
                    diagnostic.severity = "information";
            }
            diagnostic.type = matched[5];
            diagnostic.message = matched[6];
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
                    break;
                }
                if (nextLine.match(rgxMsg)) { // another error line
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
