
/** File in project
 *
 */
export interface IProjectFile {

    /** Relative path from project root
     *
     */
    Path(): string;
}

// tslint:disable-next-line:no-empty-interface
export interface IHandle {

}

export interface IFileStatus {

    size?: number;
    acc_time?: number;
    mod_time?: number;
    crc32?: number;
}

/** Remote system
 *
 */
export interface IRemoteSystem {

    /** Open file
     * @file file to open
     * @mode "r", "w"
     * @returns handle to opened file
     */
    OpenFile(file: IProjectFile, mode: string): Promise<IHandle>;

    /** Close file
     *
     */
    CloseFile(handle: IHandle): Promise<boolean>;

    /** Read file
     * @handle handle to previously opened file
     * @bytes bytes to read
     * @returns buffer (full file content)
     */
    ReadFile(handle: IHandle, bytes: number): Promise<Buffer>;

    /** Write to file
     * @handle handle to previously opened file
     * @buffer buffer to write
     * @returns read bytes
     */
    WriteFile(handle: IHandle, buffer: Buffer): Promise<number>;

    /** Seek in file
     * @pos new position
     * @returns current position after SeekFile
     */
    SeekFile(handle: IHandle, pos: number): Promise<number>;

    /** Get file stats
     * @file
     * @status stats to fill
     * @returns filled stats
     */
    FileStatus(file: IProjectFile, status: IFileStatus): Promise<IFileStatus>;

    /** Enumerate all project files
     * @options include, exclude etc.
     * @returns iterator
     */
    EnumFiles(options?: any): Iterator<IProjectFile>;
}
