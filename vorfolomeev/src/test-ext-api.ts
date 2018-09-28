import { extensions } from "vscode";
import { TestAPI } from "./test-api";

export function testExtApi() {
    let ext = extensions.getExtension<typeof TestAPI>("vorfol.common-test");
    if (ext) {
        let extOk = ext;
        if (ext.isActive) {
            UseApi();
        } else {
            ext.activate().then((value) => {
                UseApi();
            });
        }
        function UseApi() {
            let api = extOk.exports;
            let apiObj = api.createInstance("5");
            console.log(apiObj.nameOf);
            console.log(apiObj.doAction(10));
        }
    }
}
