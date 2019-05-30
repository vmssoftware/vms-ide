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
import {activate as Task2CmdExtension} from "./task2cmd/extension";
import {activate as ZipExtension} from "./zip/extension";
import {activate as JvmDebugExtension} from "./vms_jvm_debug/extension";

import {deactivate as deSshHelperExtension} from "./ssh-helper/extension";
import {deactivate as deSynchronizerExtension} from "./synchronizer/extension";
import {deactivate as deDebuggerExtension} from "./vms_debug/extension";
import {deactivate as deCldExtension} from "./cld/extension";
import {deactivate as deMsgExtension} from "./msg/extension";
import {deactivate as deTask2CmdExtension} from "./task2cmd/extension";
import {deactivate as deZipExtension} from "./zip/extension";
import {deactivate as deJvmDebugExtension} from "./vms_jvm_debug/extension";

export async function activate(context: ExtensionContext) {

    SetConfigHelperApi(await ConfigHelperExtension(context));
    SetSshHelper(await SshHelperExtension(context));
    SetSyncApi(await SynchronizerExtension(context));
    await DebuggerExtension(context);
    await CldExtension(context);
    await MsgExtension(context);
    await Task2CmdExtension(context);
    await JvmDebugExtension(context);
    SetZipApi(await ZipExtension(context));
}

export async function deactivate() {
    await deJvmDebugExtension();
    await deZipExtension();
    await deTask2CmdExtension();
    await deMsgExtension();
    await deCldExtension();
    await deDebuggerExtension();
    await deSynchronizerExtension();
    await deSshHelperExtension();
}
