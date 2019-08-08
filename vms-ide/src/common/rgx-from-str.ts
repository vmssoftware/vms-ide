
export function RgxFromStr(str: string, mode = "g") {
    return new RegExp(RgxStrFromStr(str), mode);
}

export function RgxStrFromStr(str: string) {
    return str.replace(/[.*+?^${}()|[\]\\]/g, "\\$&");
}