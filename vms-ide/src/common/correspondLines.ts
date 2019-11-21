
export interface IListMatch {
    srcLine?: number,
    lstLine: number,
    content?: string,
};

export function findCorrespondingLines(source: string, listing: string) {

    // two (8-char) zones
    // (((spaces+depthNum1)?+spaces+depthNum2?)?+\t)?(spaces+lineNum+space) for compiled lines
    // (((spaces+depthNum1)?+spaces+depthNum2?)+X)?(spaces+lineNum+space) for skipped lines
    const sourceRgx = /^(?:\s*\d*\s*\d*)?[\tX]( {1}\d{6}| {2}\d{5}| {3}\d{4}| {4}\d{3}| {5}\d{2}| {6}\d{1}) (.*)$/;

    let strTst = `       X   8678 #ifdef STD_INSPIRED`;
    let mathTst = strTst.match(sourceRgx);

    let listLines = listing.split(/[\r]?\n/g);
    let filteredListLines: IListMatch[] = listLines.map(x => {
        let matched = x.match(sourceRgx);
        if (matched) {
            return {
                lstLine: +matched[1],
                content: matched[2]
            } as IListMatch;
        }
        return {
            lstLine: -1,
        } as IListMatch;
    }).
    filter(x => x.lstLine !== -1 && x.content).
    reduce((acc, x) => {
        let add = true;
        if (acc.length > 0) {
            if (acc[acc.length - 1].lstLine == x.lstLine) {
                if (acc[acc.length - 1].content) {
                    if (x.content) {
                        acc[acc.length - 1].content += x.content;
                    }
                } else if (x.content) {
                    acc[acc.length - 1].content = x.content;
                }
                add = false;
            }
        }
        if (add) {
            acc.push(x);
        }
        return acc;
    }, [] as IListMatch[]);

    let srcLines = source.split(/[\r]?\n/g);

    let srcLine = 0;
    let filteredLstLine = 0;
    let matchedLines: IListMatch[] = [];
    while (srcLine < srcLines.length && filteredLstLine < filteredListLines.length) {
        let depth = 0;
        let found = false;
        while (!found && srcLine + depth < srcLines.length && filteredLstLine + depth < filteredListLines.length) {
            for(let i = 0; i <= depth / 2; ++i) {
                if (srcLines[srcLine + i] === filteredListLines[filteredLstLine + depth - i].content) {
                    srcLine = srcLine + i;
                    filteredLstLine = filteredLstLine + depth - i;
                    found = true;
                    break;
                }
                if (filteredListLines[filteredLstLine + i].content === srcLines[srcLine + depth - i]) {
                    srcLine = srcLine + depth - i;
                    filteredLstLine = filteredLstLine + i;
                    found = true;
                    break;
                }
            }
            ++depth;
        }
        if (found) {
            matchedLines.push({
                srcLine,
                lstLine: filteredListLines[filteredLstLine].lstLine,
                content: filteredListLines[filteredLstLine].content
            });
            ++srcLine;
            ++filteredLstLine;
        } else {
            break;
        }
    }

    return matchedLines;
}