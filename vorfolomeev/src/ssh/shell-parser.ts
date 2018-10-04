
export interface IShellParser {
    /**
     * Parse data from ssh shell
     * @param data
     * @returns true when ready to another command
     */
    onData(data: string): boolean;

    /**
     * Parse data from ssh shell stderr
     * @param data
     * @returns true when discard all and ready to another command
     */
    onDataErr(data: string): boolean;
}
