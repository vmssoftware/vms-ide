export function test_enclosing_quotes(str: string) {
    let first_char = str[0];
    if (first_char === '"' || first_char === "'") {
        for(let i = 1; i < str.length; ++i) {
            if (str[i] == '\\') {
                ++i;
            } else if (str[i] == first_char) {
                return { enclosed: true, quote_pos: i } ;
            }
        }
    }
    return { enclosed: false, quote_pos: -1 } ;
}