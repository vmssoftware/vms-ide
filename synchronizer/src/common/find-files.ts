import micromatch from "micromatch";

import { LogType } from "@vorfol/common";

import { ftpPathSeparator, IFileEntry, IReadDirectory } from "@vorfol/common";

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
                                debugLog?: LogType) {
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
    return walk(rootDir);

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
        walkDir = walkDir.trim();
        walkDir = walkDir.replace(leadingSepRg, "").replace(trailingSepRg, "").replace(middleSepRg, ftpPathSeparator);
        const fileEntries = await canReadDir.readDirectory(walkDir);
        if (fileEntries) {
            const separated = fileEntries.map(addWalkDir).reduce(separateFilesAndDirsAndMatch, {files: [], dirs: []});
            for (const dir of separated.dirs) {
                const inside = await walk(dir.filename);
                separated.files.push(...inside);
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
