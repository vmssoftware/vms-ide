
/** File in project
 * 
 */
export interface ProjectFile {

    /** Relative path from project root
     * 
    */
    Path() : string;
}

export interface Handle {

}

export interface FileStatus {

    size?: number;
    acc_time?: number;
    mod_time?: number;
    crc32?: number;
}

/** Remote system
 * 
 */
export interface RemoteSystem {

    /** Open file
     * @file file to open
     * @mode "r", "w"
     * @returns handle to opened file
     */
    OpenFile(file : ProjectFile, mode: string) : Thenable<Handle>;

    /** Close file
     * 
    */
    CloseFile(handle : Handle) : Thenable<boolean>;

    /** Read file
     * @handle handle to previously opened file
     * @bytes bytes to read
     * @returns buffer (full file content)
     */
    ReadFile(handle: Handle, bytes: number) : Thenable<Buffer>;

    /** Write to file
     * @handle handle to previously opened file
     * @buffer buffer to write
     * @returns read bytes
     */
    WriteFile(handle: Handle, buffer: Buffer) : Thenable<number>;

    /** Seek in file
     * @pos new position
     * @returns current position after SeekFile
     */
    SeekFile(handle: Handle, pos: number) : Thenable<number>;

    /** Get file stats
     * @file 
     * @status stats to fill
     * @returns filled stats
     */
    FileStatus(file: ProjectFile, status: FileStatus) : Thenable<FileStatus>;

    /** Enumerate all project files
     * @options include, exclude etc.
     * @returns iterator
     */
    EnumFiles(options?: any) : Iterator<ProjectFile>;
}
