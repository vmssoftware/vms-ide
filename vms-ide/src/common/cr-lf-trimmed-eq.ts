const regexpt = /[\x13\x10]/g;

export function CrLfTrimmedEqIgnoreCase(one: string, two: string): boolean {
    if (one === two) {
        return true;
    }
    return one.replace(regexpt, "").trim().toUpperCase() === two.replace(regexpt, "").trim().toUpperCase();
}
