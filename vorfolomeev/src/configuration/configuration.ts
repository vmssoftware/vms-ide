import { Uri } from "vscode";
import { Event } from "vscode";
import { Disposable } from "vscode";

/** Configuration
 * 
 */
export interface Configuration extends Disposable {
    
    add(section: string, object: any) : boolean;

    get(section: string) : Promise<any>;

    remove(section: string) : boolean;

    load() : Promise<boolean>;
    
    save() : Promise<boolean>;
    
    edit() : Promise<boolean>;
}

/** Serializer 
 * 
*/
export interface Serializer extends Disposable {
    
    load(obj: any) : Promise<any>;

    save(obj: any) : Promise<boolean>;

    getUri() : Uri;

    readonly onDidChangeOutside: Event<null>;
}

/** Editor 
 * 
*/
export interface Editor extends Disposable {
    
    invoke(uri: Uri): Promise<boolean>;
}

/** Serialize helper
 * 
 */
export interface SerializeHelper extends Disposable {
    
    getSerializer() : Serializer;

    getEditor() : Editor;
}


