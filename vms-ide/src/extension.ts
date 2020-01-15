import { commands, env, ExtensionContext, workspace } from "vscode";

const locale = env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

import {activate as ConfigHelperExtension} from "./config-helper/extension";
import { SetConfigHelperApi, SetSshHelper, SetSyncApi, SetZipApi } from "./ext-api/ext-api";

import {activate as SshHelperExtension} from "./ssh-helper/extension";
import {activate as SynchronizerExtension} from "./synchronizer/extension";
import {activate as DebuggerExtension} from "./vms_debug/extension";
import {activate as CldExtension} from "./cld/extension";
import {activate as MsgExtension} from "./msg/extension";
import {activate as BasicExtension} from "./vms_basic/extension";
import {activate as PascalExtension} from "./vms_pascal/extension";
import {activate as FortranExtension} from "./vms_fortran/extension";
import {activate as Task2CmdExtension} from "./task2cmd/extension";
import {activate as ZipExtension} from "./zip/extension";
import {activate as JvmDebugExtension} from "./vms_jvm_debug/extension";
import {activate as CobolExtension} from "./vms_cobol/extension";
import {activate as PythonDebugExtension} from "./python/extension";

import {deactivate as deSshHelperExtension} from "./ssh-helper/extension";
import {deactivate as deSynchronizerExtension} from "./synchronizer/extension";
import {deactivate as deDebuggerExtension} from "./vms_debug/extension";
import {deactivate as deCldExtension} from "./cld/extension";
import {deactivate as deMsgExtension} from "./msg/extension";
// import {deactivate as deBasicExtension} from "./vms_basic/extension";
import {deactivate as dePascalExtension} from "./vms_pascal/extension";
import {deactivate as deFortranExtension} from "./vms_fortran/extension";
import {deactivate as deTask2CmdExtension} from "./task2cmd/extension";
import {deactivate as deZipExtension} from "./zip/extension";
import {deactivate as deJvmDebugExtension} from "./vms_jvm_debug/extension";
import {deactivate as deCobolExtension} from "./vms_cobol/extension";
import {deactivate as dePythonDebugExtension} from "./python/extension";

export async function activate(context: ExtensionContext) {

    SetConfigHelperApi(ConfigHelperExtension(context));
    SetSshHelper(await SshHelperExtension(context));
    SetSyncApi(await SynchronizerExtension(context));
    DebuggerExtension(context);
    await CldExtension(context);
    await MsgExtension(context);
    //await BasicExtension(context);
    await PascalExtension(context);
    await FortranExtension(context);
    await Task2CmdExtension(context);
    JvmDebugExtension(context);
    await CobolExtension(context);
    SetZipApi(await ZipExtension(context));
    PythonDebugExtension(context);
}

export async function deactivate() {
    dePythonDebugExtension();
    deCobolExtension();
    deJvmDebugExtension();
    deZipExtension();
    deTask2CmdExtension();
    deMsgExtension();
    deCldExtension();
    //await deBasicExtension();
    dePascalExtension();
    deFortranExtension();
    deDebuggerExtension();
    deSynchronizerExtension();
    deSshHelperExtension();
}
