
export function RgxFromStr(str: string, mode = "g") {
    return new RegExp(str.replace(/[.*+?^${}()|[\]\\]/g, "\\$&"), mode);
}