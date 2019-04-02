import micromatch from "micromatch";

import { LogFunction, LogType } from "../../common/main";

import { ftpPathSeparator, IFileEntry, IReadDirectory } from "../../common/main";
import { IProgress } from "../sync/source";

export const leadingSepRg = /^[/\\]+/g;
export const middleSepRg = /[/\\]+/g;
export const trailingSepRg = /[/\\]+$/g;

export function collectSplittedByCommas(acc: string[], pattern: string): string[] {
    acc.push(...pattern.split(","));
    return acc;
}

interface ISepFileDir {
    files: IFileEntry[];
    dirs: IFileEntry[];
}

export const DirectoryToken = "Directory";
export const FilesToken = "Files";
export const AcceptedToken = "Accepted";

/**
 * Recursive find files
 * @param canReadDir see interface
 * @param rootDir start directory
 * @param include glob patterns separeted by commas
 * @param exclude glob patterns separeted by commas
 * @param debugLog log
 * @returns FileEntry[] with full names
 */
export async function findFiles(canReadDir: IReadDirectory,
                                rootDir: string,
                                include?: string,
                                exclude?: string,
                                debugLog?: LogFunction,
                                progress?: IProgress) {
    include = include || "*";
    const options: micromatch.Options = {
        basename: true,
        nocase: true,
        nodupes: true,
        unixify: false,
    };
    const unbraceInclude = micromatch.braces(include);
    const splitInclude = unbraceInclude.reduce(collectSplittedByCommas, []);
    if (exclude) {
        const unbraceExclude = micromatch.braces(exclude);
        const splitExclude = unbraceExclude.reduce(collectSplittedByCommas, []);
        options.ignore = splitExclude;
    }
    rootDir = rootDir.trim().replace(trailingSepRg, "").replace(middleSepRg, ftpPathSeparator);
    return walk("");

    function separateFilesAndDirsAndMatch(acc: ISepFileDir, fileEntry: IFileEntry): ISepFileDir {
        if (fileEntry.isDirectory) {
            const list = micromatch([fileEntry.filename], "*", options);
            if (list.length) {
                acc.dirs.push(fileEntry);
            }
        } else if (fileEntry.isFile) {
            const list = micromatch([fileEntry.filename], splitInclude, options);
            if (list.length) {
                acc.files.push(fileEntry);
            }
        }
        return acc;
    }

    /**
     * Recursive walk
     * @param walkDir start dir
     */
    async function walk(walkDir: string) {
        const readDir = rootDir + (walkDir? ftpPathSeparator + walkDir: "");
        const fileEntries = await canReadDir.readDirectory(readDir);
        const cancel = progress ? progress.addProgress(DirectoryToken, 1) : false;
        if (!cancel && fileEntries) {
            const separated = fileEntries.map(addWalkDir).reduce(separateFilesAndDirsAndMatch, {files: [], dirs: []});
            if (progress ? !progress.addProgress(FilesToken, fileEntries.length)
                        && !progress.addProgress(AcceptedToken, separated.files.length)
                        : true) {
                for (const dir of separated.dirs) {
                    const inside = await walk(dir.filename);
                    separated.files.push(...inside);
                }
            }
            return separated.files;
        }
        return [];

        function addWalkDir(fileEntry: IFileEntry) {
            if (walkDir) {
                fileEntry.filename = walkDir + ftpPathSeparator + fileEntry.filename;
            }
            return fileEntry;
        }
    }
}
