import { CharStream, Token } from "antlr4ts";
import { EDiagnosticType, IDiagnosticEntry } from "./Facade";

/**
 * Get char position in line based on tab size
 * @param stream char stream
 * @param index index in char stream of current token
 * @param tabSize desired tab size
 */
export function CalculateTabBasedCharPositionInLine(stream: CharStream | undefined, index: number, tabSize = 4) {
    let pos = 0;
    if (stream) {
        let idx = index - stream.index - 1;
        let nl = false;
        while (!nl && index > 0) {
            switch (stream.LA(idx)) {
                case ' '.charCodeAt(0):
                    ++pos;
                    break;
                case '\t'.charCodeAt(0):
                    pos += tabSize;
                    break;
                case '\n'.charCodeAt(0):
                    nl = true;
                    break;
                default:
                    ++pos;
                    break;
            }
            --index;
            --idx;
        }
    }
    return pos;
}

//------------------------------------------------------------

/**
 * Test if the line has a cobol string literal at the end
 * @param line 
 */
export function isLineEndsWithCobolSiringLiteral(line: string) {
    let inString = false;
    let lastQ = ' ';
    for (let i = 0; i < line.length; ++i) {
        if (inString) {
            if (line[i] === lastQ) {
                if (i + 1 < line.length && line[i+1] === lastQ) {
                    ++i;
                    continue;
                }
                inString = false;
                continue;
            }
        } else {
            switch (line[i]) {
                case "'":
                case '"':
                    inString = true;
                    lastQ = line[i]
                    continue;
            }
        }
    }
    return { inString, lastQ };
}
//------------------------------------------------------------
export function markToken(token: Token, message: string, type = EDiagnosticType.Error ) 
{
    return markText(message, token.charPositionInLine, token.line, (token.text? token.text.length : 0), type);
}
//------------------------------------------------------------
export function markText(message: string, column: number, row: number, length: number, type = EDiagnosticType.Error ) 
{
    const error: IDiagnosticEntry = {
        type,
        message,
        range: 
        { 
            start: { column, row }, 
            end:   { column: column + length, row }
        }
    };

    return error;
}
//------------------------------------------------------------
