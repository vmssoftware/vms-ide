
export function RgxFromStr(str: string, mode = "g") {
    return new RegExp(RgxStrFromStr(str), mode);
}

export function RgxStrFromStr(str: string) {
    return str.replace(/[.*+?^${}()|[\]\\]/g, "\\$&");
}

export function maskSpacesInTemplate(str: string, mask?: string) {
    mask = mask || "*";
    let depth = 0;
    let result = "";
    for(let i = 0; i < str.length; ++i) {
        switch (str[i] ) {
            case '<':
                ++depth;
                result += str[i];
                break;
            case '>':
                if (depth) {
                    --depth;
                }
                result += str[i];
                break;
            default:
                if (depth && str[i] === ' ') {
                    result += mask;
                } else {
                    result += str[i];
                }
        }
    }
    return result;
}