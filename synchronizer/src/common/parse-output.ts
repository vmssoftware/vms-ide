import { VmsPathConverter } from "../vms/vms-path-converter";

const cxxMsgPos = /^(\.*)\^/;
const cxxMsg = /^(%CXX-(\S)-(\S*)),\s(.*)$/;
const cxxPlace = /^at line number (\d.*) in file (.*)$/;

interface IDiagnostics {
    file: string;
    line: number;
    pos: number;
    severity: "error" | "information";
    message: string;
    type: string;
}

type IPartialDiagnostics = Partial<IDiagnostics>;

export function parseOutput(output: string) {
    const lines = output.split("\n").map((s) => s.trimRight());
    const result = lines.reduce((problems, line, idx) => {
        const matched = line.match(cxxMsg);
        if (matched) {
            const diagnostic: IPartialDiagnostics = {};
            switch (matched[2]) {
                case "E":
                    diagnostic.severity = "error";
                    break;
                default:
                    diagnostic.severity = "information";
            }
            diagnostic.type = matched[3];
            diagnostic.message = matched[4];
            if (idx > 0) {
                const prevLine = lines[idx - 1];
                const prevMathed = prevLine.match(cxxMsgPos);
                if (prevMathed) {
                    diagnostic.pos = prevMathed[0].length;
                }
            }
            if (idx + 1 < lines.length) {
                const nextLine = lines[idx + 1];
                const nextLineMathed = nextLine.match(cxxPlace);
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
    }, [] as IPartialDiagnostics[]);
    return result;
}
