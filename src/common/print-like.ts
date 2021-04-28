
export function printLike<T extends any[]>(strings: TemplateStringsArray, ...values: T) {
    return (...p: T) => {
        let str = "";
        for (let i = 0; i < p.length; i++) {
            str += strings[i];
            str += p[i];
        }
        str += strings[strings.length - 1];
        return str;
    };
}
