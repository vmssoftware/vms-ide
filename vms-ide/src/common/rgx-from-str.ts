
export function RgxFromStr(str: string, mode = "g") {
    return new RegExp(RgxStrFromStr(str), mode);
}

export function RgxStrFromStr(str: string) {
    return str.replace(/[.*+?^${}()|[\]\\]/g, "\\$&");
}

export function removeTemplate(str: string) {
    let depth = 0;
    let result = "";
    for(let i = 0; i < str.length; ++i) {
        switch (str[i] ) {
            case '<':
                ++depth;
                break;
            case '>':
                if (depth) {
                    --depth;
                }
                break;
            default:
                if (!depth) {
                    result += str[i];
                }
        }
    }
    return result;
}