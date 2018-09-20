/**
 * 
 * 
 * 
 * DEPRECATED
 * 
 * 
 * 
 */

export interface FilterConfig {
    include: string;
    exclude: string;
}

export class CPP_FilterConfig implements FilterConfig {
    include: string = '**/*.{c,cpp,h}';
    exclude: string = '**/{.vscode,node-modules}/**/*.*';
}

