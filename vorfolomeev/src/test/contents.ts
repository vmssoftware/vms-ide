export function ContentTest(one: string, two: string): boolean {
    if (one === two) {
        return true;
    }

    const regexpt = /[\x13\x10]/g;

    const oneLinesOnly = one.replace(regexpt, "");
    const twoLinesOnly = two.replace(regexpt, "");

    return oneLinesOnly === twoLinesOnly;
}
