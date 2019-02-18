
/**
 * 
 * @param result 
 * @returns false on any errors
 */
export function TestExecResult(result: string[] | undefined) {
    if (!result) 
        return false;
    if (result.some((s) => !!s.match(/(%|-)(\w+)-(W|E|F)-(\w+)/))) {
        return false;
    }
    return true;
}