
export interface IPathConverter {

    fullPath: string;
    directory: string;
    file: string;

    /**
     * immutable, must return new converter
     * @param relPath relative fs path
     */
    from(relPath: string): IPathConverter;
}
