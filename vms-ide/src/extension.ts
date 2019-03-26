import { commands, env, ExtensionContext, workspace } from "vscode";

const locale = env.language ;
import * as nls from "vscode-nls";
const localize = nls.config({ locale, messageFormat: nls.MessageFormat.both })();

import {activate as ConfigHelperExtension} from "./config-helper/extension";
import { SetConfigHelperApi, SetSshHelper, SetSyncApi } from "./ext-api/ext-api";

import {activate as SshHelperExtension} from "./ssh-helper/extension";
import {activate as SynchronizerExtension} from "./synchronizer/extension";
import {activate as DebuggerExtension} from "./vms_debug/extension";
import {activate as CldExtension} from "./cld/extension";
import {activate as MsgExtension} from "./msg/extension";

import {deactivate as deSshHelperExtension} from "./ssh-helper/extension";
import {deactivate as deSynchronizerExtension} from "./synchronizer/extension";
import {deactivate as deDebuggerExtension} from "./vms_debug/extension";
import {deactivate as deCldExtension} from "./cld/extension";
import {deactivate as deMsgExtension} from "./msg/extension";

export async function activate(context: ExtensionContext) {

    const configHelperApi = await ConfigHelperExtension(context);
    SetConfigHelperApi(configHelperApi);

    const sshHelperApi = await SshHelperExtension(context);
    SetSshHelper(sshHelperApi);

    const synchronizerApi = await SynchronizerExtension(context);
    SetSyncApi(synchronizerApi);

    await DebuggerExtension(context);

    await CldExtension(context);

    await MsgExtension(context);
}

export async function deactivate() {
    await deMsgExtension();
    await deCldExtension();
    await deDebuggerExtension();
    await deSynchronizerExtension();
    await deSshHelperExtension();
}
