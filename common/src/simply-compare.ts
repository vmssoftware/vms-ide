
/**
 * True if equal
 * @param a
 * @param b
 */
export function isSimplyEq(a: any, b: any): boolean {
    if (a === b) {
        return true;
    }
    if (a === undefined || b === undefined) {
        return false;
    }
    let count = 0;
    for (const key in a) {
        if (a.hasOwnProperty(key)) {
            if ( b.hasOwnProperty(key) && a[key] === b[key] ) {
                ++ count;
                continue;
            }
            return false;
        }
    }
    for (const key in b) {
        if (b.hasOwnProperty(key)) {
            -- count;
        }
    }
    return count === 0;
}
