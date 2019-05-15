**VMS IDE** is an extension that enables you to quickly and easily develop comprehensive applications for OpenVMS systems. It provides a set of tools for developing, building, and debugging OpenVMS projects.

## Features

* Source code **synchronization** between the local machine and OpenVMS system.
* **SSH connection** setup to remote OpenVMS system.
* **Projects Explorer** as a simple and convenient way to manage OpenVMS projects.
* **Debugger** for OpenVMS projects.
* **Syntax highlighting** for *MMS*, *CLD*, and *MSG* files.
* **Code autocompletion** for *MSG* and *CLD* files.
* Supported languages: **C**, **C++**.
* Support for **Fortran**, **Cobol**, **Pascal**, **Basic**, **Bliss** coming soon.

## Getting started

* [Installation](https://www.vmssoftwaretraining.com/wiki/VMS_IDE_Installation)
* [Setting Up a VMS Project](https://www.vmssoftwaretraining.com/wiki/VMS_IDE_Project_Configuration)
* [Working On a VMS Project](https://www.vmssoftwaretraining.com/wiki/VMS_IDE_Developing)

## Configuration Storage Options

| Name | Description | Comment |
| --- | --- | --- |
| `FS` | Save settings in local JSON file | Recommended |
| `VFS` | Save setting in VS Code virtual file system | |
| `VCS` | Manage settings using VS Code provided API | |

## Commands

| Command name | Description |
| --- | --- |
| `VMS-IDE: Terminal` | Open VMS terminal (`Ctrl+F6`)|
| `VMS-IDE: Edit ssh-helper settings` | Edit SSH connection settings |
| `VMS-IDE: Edit OpenVMS project settings` | Edit project settings |
| `VMS-IDE: Change CR/LF for all source files` | Change CR/LF to LF for all source files |
| `VMS-IDE: Create MMS` | Create default MMS |
| `VMS-IDE: Build on VMS` | Build project on OpenVMS with its dependencies |
| `VMS-IDE: Re-build on VMS` | Rebuild project on OpenVMS with its dependencies |
| `VMS-IDE: Clean project` | Clean project, delete files from output folder |
| `VMS-IDE: Synchronize project file with VMS` | Synchronize project files with VMS |
| `VMS-IDE: Force synchronized status` | Force synchronized status |
| `VMS-IDE: Force built status` | Force built status |
| `VMS-IDE: Upload all via Zip` | Upload project files using Zip |
| `VMS-IDE: Download system headers` | Download system headers from VMS |

## Settings

| Section name | Name | Type | Description |
| --- | --- | --- | --- |
| `vmssoftware.config-helper.settings.using` | Config-helper › Settings: Using	| `FS`, `VFS` or `VCS` | [Place](#configuration-storage-options) where extension settings will be kept |
| `vmssoftware.config-helper.settings.test` | Test | string | For testing purposes, do not change |
| `vmssoftware.config-helper.settings.debug` | Config-helper › Settings: Debug | string |  Debug output to, 'console' or folder |
| `vmssoftware.config-helper.settings.addCalleeInfo` | Config-helper › Settings: Add Callee Info| boolean | Whether or not to add callee info to debug output |
| `vmssoftware.ssh-helper.connection.host` | Ssh-helper › Connection: Host | string |	Host name, IP address or label in host-collection |
| `vmssoftware.ssh-helper.connection.port` | Ssh-helper › Connection: Port | number | Port |
| `vmssoftware.ssh-helper.connection.username` | Ssh-helper › Connection: Username | string | User name |
| `vmssoftware.ssh-helper.connection.password` | Ssh-helper › Connection: Password | string | Password |
| `vmssoftware.ssh-helper.connection.keyFile` | Ssh-helper › Connection: Key File | string | Path to SSH key file or leave it empty to use password authentication. |
| `vmssoftware.ssh-helper.timeouts.cmdTimeout` | Ssh-helper › Timeouts: Cmd Timeout | number | Timeout for shell commands answer (not yet implemented). |
| `vmssoftware.ssh-helper.timeouts.feedbackTimeout` | Ssh-helper › Timeouts: Feedback Timeout | number | Timeout for connection feedback. If connection doesn't respond in this period, connection settings will be refused. |
| `vmssoftware.ssh-helper.timeouts.welcomeTimeout` | Ssh-helper › Timeouts: Welcome Timeout | number | Timeout for shell welcome banner parsing. |
| `vmssoftware.ssh-helper.host-collection.hosts` | Ssh-helper › Host-collection: Hosts | object | Host-collection |
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
| `vmssoftware.synchronizer.synchronize.downloadNewFiles`| Synchronizer › Synchronize: Download New Files | `overwrite`, `skip` or `edit` | Action if remote file is newer, see download action. |
| `vmssoftware.synchronizer.synchronize.keepAlive` | Synchronizer › Synchronize: Keep Alive | boolean | Do or don't dispose connection after each action. |
| `vmssoftware.synchronizer.synchronize.setTimeAttempts` | Synchronizer › Synchronize: Set Time Attempts | number | Number of unsuccessful set file date&time attempts before return error. |
| `vmssoftware.synchronizer.synchronize.setTimeByShell` | Synchronizer › Synchronize: Set Time By Shell | boolean | Do set file time by shell or by SFTP |
| `vmssoftware.synchronizer.synchronize.unzipCmd` | Synchronizer › Synchronize: Unzip Cmd | string | Command to unzip archive on VMS side |
| `vmssoftware.synchronizer.synchronize.preferZip` | Synchronizer › Synchronize: Prefer Zip | boolean | Prefer ZIP to upload source |
| `vmssoftware.synchronizer.synchronize.purge` | Synchronizer › Synchronize: Purge | boolean | Execute PURGE command after uploding |
