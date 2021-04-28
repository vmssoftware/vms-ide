
const rgx = /(?:%|-)(?:\w+)-(?:W|E|F)-(?:\w+), (.*)/;
/**
 * 
 * @param result 
 * @returns error string or indefined
 */
export function ParseExecResult(result: string[] | undefined): string[] {
    if (!result) {
        return ["No result"];
    }
    let errors: string[] = [];
    for (let line of result) {
        let match = line.match(rgx);
        if (match && match[1]) {
            errors.push(match[1]);
        }
    }
    return errors;
}