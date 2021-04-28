export function binarySearch<T>(array: T[], predicate: (el: T) => number) {
    var m = 0;
    var n = array.length - 1;
    while (m <= n) {
        var k = (n + m) >> 1;
        var cmp = predicate(array[k]);
        if (cmp > 0) {
            m = k + 1;
        } else if(cmp < 0) {
            n = k - 1;
        } else {
            return k;
        }
    }
    return -m - 1;
}