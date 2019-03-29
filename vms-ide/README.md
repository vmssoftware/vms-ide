# Description

Combined extension "vms-ide".

## Features

The extension allows to upload/download project to/from OpenVMS machine, keep source files in fresh, build and debug program.

## Commands

| Command name | Description |
| --- | --- |
| `extension.vms-debug.terminal` | Open VMS terminal |
| `vmssoftware.ssh-helper.editSettings` | Edit connection settings |
| `vmssoftware.synchronizer.stopSync` | Stop syncronization |
| `vmssoftware.synchronizer.createMMS` | Create default MMS |
| `vmssoftware.synchronizer.buildProject` | Build project on VMS with its dependencies |
| `vmssoftware.synchronizer.reBuildProject` | Re-build project on VMS with its dependencies |
| `vmssoftware.synchronizer.buildOnlyProject` | Build only this project |
| `vmssoftware.synchronizer.reBuildOnlyProject` | Re-build only this project |
| `vmssoftware.synchronizer.cleanProject` | Clean project, delete files from output folder |
| `vmssoftware.synchronizer.syncProject` | Syncronize project files with VMS |
| `vmssoftware.synchronizer.editProject` | Edit project settings |
| `vmssoftware.synchronizer.changeCRLF` | Change CR/LF to LF for all source files |
| `vmssoftware.synchronizer.forceSynchronized` | Force synchronized status |
| `vmssoftware.synchronizer.forceBuilt` | Force built status |
| `vmssoftware.synchronizer.uploadZip` | Upload project files using Zip |
| `vmssoftware.synchronizer.downloadHeaders` | Download system headers from VMS |

## Settings

| Section name | Name | Type | Description |
| --- | --- | --- | --- |
| `vmssoftware.config-helper.settings.using` | Config-helper › Settings: Using	| `FS`, `VFS` or `VCS` | [Place](#Place) where extension settings will be kept |
| `vmssoftware.config-helper.settings.test` | Test | string | For testing purposes, do not change |
| `vmssoftware.config-helper.settings.debug` | Config-helper › Settings: Debug | string |  Debug output to, 'console' or folder |
| `vmssoftware.config-helper.settings.addCalleeInfo` | Config-helper › Settings: Add Callee Info| boolean | Whether or not to add callee info to debug output |
| `vmssoftware.ssh-helper.connection.host` | Ssh-helper › Connection: Host | string |	Host name, IP address or label in [host-collection](#Host-collection) |
| `vmssoftware.ssh-helper.connection.port` | Ssh-helper › Connection: Port | number | Port |
| `vmssoftware.ssh-helper.connection.username` | Ssh-helper › Connection: Username | string | User name |
| `vmssoftware.ssh-helper.connection.password` | Ssh-helper › Connection: Password | string | Password |
| `vmssoftware.ssh-helper.connection.keyFile` | Ssh-helper › Connection: Key File | string | Path to SSH key file or leave it empty to use password authentication. |
| `vmssoftware.ssh-helper.timeouts.cmdTimeout` | Ssh-helper › Timeouts: Cmd Timeout | number | Timeout for shell commands answer (not implemented yet). |
| `vmssoftware.ssh-helper.timeouts.feedbackTimeout` | Ssh-helper › Timeouts: Feedback Timeout | number | Timeout for connection feedback. If connection doesn't feedback in this period, connection settings will be refused. |
| `vmssoftware.ssh-helper.timeouts.welcomeTimeout` | Ssh-helper › Timeouts: Welcome Timeout | number | Timeout for shell welcome banner parsing. |
| `vmssoftware.ssh-helper.host-collection.hosts` | Ssh-helper › Host-collection: Hosts | object | [Host-collection](#Host-collection)	|
| `vmssoftware.project-dep.buildType` | Project-dep: Build Type | `DEBUG` or `RELEASE` | Type of build |
| `vmssoftware.project-dep.dependencies` | Project-dep: Dependencies | object | Project dependencies, do not edit directly |
| `vmssoftware.synchronizer.project.break` | Synchronizer › Project: Break | string | Debugger break key |
| `vmssoftware.synchronizer.project.builders` | Synchronizer › Project: Builders | string |	Mask of files which can build project on VMS host. |
| `vmssoftware.synchronizer.project.exclude` | Synchronizer › Project: Exclude | string | Exclude pattern, files or folder to skip. |
| `vmssoftware.synchronizer.project.headers` | Synchronizer › Project: Headers | string | Mask of header files |
| `vmssoftware.synchronizer.project.listing` | Synchronizer › Project: Listing | string | Listing pattern, files will be downloaded after successful build. |
| `vmssoftware.synchronizer.project.outdir` | Synchronizer › Project: Outdir | string | Output directory, just single folder name |
| `vmssoftware.synchronizer.project.projectName` | Synchronizer › Project: Project Name | string | Name of the target project |
| `vmssoftware.synchronizer.project.projectType` | Synchronizer › Project: Project Type | `executable`, `library` or `shareable` | Type of the target |
| `vmssoftware.synchronizer.project.resource` | Synchronizer › Project: Resource | string | Resource pattern, files required to running program |
| `vmssoftware.synchronizer.project.root` | Synchronizer › Project: Root | string | Project root folder in the VMS host (in posix format).  |
| `vmssoftware.synchronizer.project.source` | Synchronizer › Project: Source | string | Source pattern, files required for building project |
| `vmssoftware.synchronizer.synchronize.downloadNewFiles`| Synchronizer › Synchronize: Download New Files | `overwrite`, `skip` or `edit` | Action if remote file is newer, see [download action](#download-actions). |
| `vmssoftware.synchronizer.synchronize.keepAlive` | Synchronizer › Synchronize: Keep Alive | boolean | Do or don't dispose connection after each action. |
| `vmssoftware.synchronizer.synchronize.setTimeAttempts` | Synchronizer › Synchronize: Set Time Attempts | number | Number of unsuccessful set file date&time attempts before return error. |
| `vmssoftware.synchronizer.synchronize.setTimeByShell` | Synchronizer › Synchronize: Set Time By Shell | boolean | Do set file time by shell or by SFTP |
| `vmssoftware.synchronizer.synchronize.unzipCmd` | Synchronizer › Synchronize: Unzip Cmd | string | Command to unzip archive on VMS side |
| `vmssoftware.synchronizer.synchronize.preferZip` | Synchronizer › Synchronize: Prefer Zip | boolean | Prefer ZIP to upload source |
| `vmssoftware.synchronizer.synchronize.purge` | Synchronizer › Synchronize: Purge | boolean | Execute PURGE command after uploding |
-----------------------------------------------------------------------------------------------------------

### Place

* `FS` - save settings in local JSON files.
* `VFS` - save setting in VS Code virtual file system.
* `VCS` - manage settings using VS Code provided API.

### Host-collection

Array of host connections settings with unique labels. Each has to have a host name or an ip address and an user name. Additionally they may have a port number, a password or a path to the key file.

### Download actions

| Action | Description |
| --- | --- |
| `overwrite` | Overwrite local files. |
| `skip` | Skip such files but produse some useful output. |
| `edit` | Download remote file in memory and open edit-merge window. User have to save merged file himself. |

-----------------------------------------------------------------------------------------------------------
