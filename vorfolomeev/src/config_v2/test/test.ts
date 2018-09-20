import { ConfigHelper } from "../config_v2";
import { FS_Config_Helper } from "../fs-config-helper";
import { UserPasswordSection } from "../sections/user-password";
import { FilterSection } from "../sections/filter";
import { HostCollection } from "../sections/host-collection";

export let _log_this_file = console.log;
//_log_this_file = function() {};

export async function Test()  {
    
    let helper : ConfigHelper = FS_Config_Helper.getConfigHelper();

    let cfg = helper.getConfig();

    let userpass = new UserPasswordSection();
    cfg.add(userpass);

    let filter = new FilterSection();
    cfg.add(filter);

    let collection = new HostCollection();
    cfg.add(collection);

    setTimeout(async () => {
        let userpass_get = await cfg.get(UserPasswordSection._section);
        _log_this_file('userpass_get === userpass: ' + (userpass_get === userpass));
        let filetr_get = await cfg.get(FilterSection._section);
        _log_this_file('filetr_get === filter: ' + (filetr_get === filter));
        let collection_get = await cfg.get(HostCollection._section);
        _log_this_file('collection_get === collection: ' + (collection_get === collection));

        userpass.password = "password";
        userpass.username += "+";

        let save_result = await cfg.save();
        _log_this_file('after save ' + save_result);

        userpass_get = await cfg.get(UserPasswordSection._section);
        _log_this_file('userpass_get === userpass: ' + (userpass_get === userpass));
        filetr_get = await cfg.get(FilterSection._section);
        _log_this_file('filetr_get === filter: ' + (filetr_get === filter));
        collection_get = await cfg.get(HostCollection._section);
        _log_this_file('collection_get === collection: ' + (collection_get === collection));

    }, 1000);
    
    return true;
}

