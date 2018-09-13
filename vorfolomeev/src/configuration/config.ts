import { Uri } from "vscode";
import { Event } from "vscode";
import { Disposable } from "vscode";

/** Configuration
 * 
 */
export interface Configuration extends Disposable {
    
    add(section: string, object: any) : boolean;

    get(section: string) : Thenable<any>;

    remove(section: string) : boolean;

    load() : Thenable<boolean>;
    
    save() : Thenable<boolean>;
    
    edit() : Thenable<boolean>;
}

/** Serializer 
 * 
*/
export interface Serializer extends Disposable {
    
    load(obj: any) : Thenable<any>;

    save(obj: any) : Thenable<boolean>;

    getUri() : Uri;

    readonly onDidChangeOutside: Event<null>;
}

/** Editor 
 * 
*/
export interface Editor extends Disposable {
    
    invoke(uri: Uri): Thenable<boolean>;
}

/** Serialize helper
 * 
 */
export interface SerializeHelper extends Disposable {
    
    getSerializer() : Serializer;

    getEditor() : Editor;
}


