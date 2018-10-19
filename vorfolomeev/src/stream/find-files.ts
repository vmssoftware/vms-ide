import micromatch, { Options } from "micromatch";

import { LogType } from "../common/log-type";
import { IFileEntry, IReadDirectory } from "./read-directory";

const separator = "/";

function collectSplittedByCommas(acc: string[], pattern: string): string[] {
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
export async function matchDir(canReadDir: IReadDirectory,
                               rootDir: string,
                               include?: string,
                               exclude?: string,
                               debugLog?: LogType) {
    include = include || "*";
    const options: Options = { basename: true, nocase: true };
    const unbraceInclude = micromatch.braces(include);
    const splitInclude = unbraceInclude.reduce(collectSplittedByCommas, []);
    if (exclude) {
        const unbraceExclude = micromatch.braces(exclude);
        const splitExclude = unbraceExclude.reduce(collectSplittedByCommas, []);
        options.ignore = splitExclude;
    }
    return walk(rootDir);

    function separateFilesAndDirs(acc: ISepFileDir, fileEntry: IFileEntry): ISepFileDir {
        if (fileEntry.longname.startsWith("d")) {
            acc.dirs.push(fileEntry);
        } else {
            acc.files.push(fileEntry);
        }
        return acc;
    }

    /**
     * Recursive walk
     * @param walkDir start dir
     */
    async function walk(walkDir: string) {
        walkDir = walkDir.trim();
        const leading = /^[/\\]+/g;
        const middle = /[/\\]+/g;
        const trailing = /[/\\]+$/g;
        walkDir = walkDir.replace(leading, "").replace(trailing, "").replace(middle, separator);
        const fileEntries = await canReadDir.readDirectory(walkDir);
        if (fileEntries) {
            const fullNameList = fileEntries.map(addWalkDir);
            const sep = fullNameList.reduce(separateFilesAndDirs, {files: [], dirs: []});
            const matchedFiles = micromatch(sep.files.map(onlyFileName), splitInclude, options);
            // find wich fileEntries were matched. suppose micromatch didn't break entries order
            const retList: IFileEntry[] = [];
            let matchedIdx = 0;
            for (let readIdx = 0; readIdx < fileEntries.length && matchedIdx < matchedFiles.length; ++readIdx) {
                if (fileEntries[readIdx].filename === matchedFiles[matchedIdx]) {
                    retList.push(fileEntries[readIdx]);
                    matchedIdx++;
                }
            }
            if (debugLog) {
                if (matchedIdx !== matchedFiles.length) {
                    debugLog(`fileEntries were reordered`);
                }
            }
            const matchedDirs = micromatch(sep.dirs.map(onlyFileName), "*", options);
            for (const dir of matchedDirs) {
                const inside = await walk(dir);
                retList.push(...inside);
            }
            return retList;
        }
        return [];

        function addWalkDir(fileEntry: IFileEntry) {
            if (walkDir) {
                fileEntry.filename = walkDir + separator + fileEntry.filename;
            }
            return fileEntry;
        }

        function onlyFileName(fileEntry: IFileEntry) {
            return fileEntry.filename;
        }
    }
}
