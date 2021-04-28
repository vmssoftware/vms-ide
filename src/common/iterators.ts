
export function minOf(iter: IterableIterator<number>) {
    let min = Number.MAX_SAFE_INTEGER;
    for (const i of iter) {
        if (min > i) {
            min = i;
        }
    }
    return min;
}