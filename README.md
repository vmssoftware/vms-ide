**VMS IDE** is an extension that enables you to quickly and easily develop comprehensive applications for OpenVMS systems. It provides a set of tools for developing, building, and debugging OpenVMS projects.

## Features

* Source code **synchronization** between the local machine and OpenVMS system.
* **SSH connection** setup to remote OpenVMS system.
* **Projects Explorer** as a simple and convenient way to manage OpenVMS projects.
* **Debugger** for OpenVMS and JVM projects. Also experimental debugger for Python is added.
* **Highlighting** for *MMS*, *CLD*, *MSG*, *Pascal*, *Basic*, *Fortran* and *Cobol* files.
* **Light-weight IntelliSense** for *CLD*, *MSG*, *Pascal*, *Basic*, *Fortran* and *Cobol* source.
* Supported languages: **C**, **C++**, **Fortran**, **Cobol**, **Pascal**, **Basic**, **Bliss**, **Java**, **Kotlin**, **Scala**, **Python**.

## Getting started

* [How to](https://wiki.vmssoftware.com/VMS_IDE_how_to)

## Configuration Storage Options

| Name | Description | Comment |
| --- | --- | --- |
| `FS` | Save settings in local JSON file | Recommended |
| `VFS` | Save setting in VS Code virtual file system | |
| `VCS` | Manage settings using VS Code provided API | |

## Commands

| Command name | Description |
| --- | --- |
| `VMS-IDE: Build on VMS` | Build project on OpenVMS with its dependencies |
| `VMS-IDE: Build project` | Build the selected project on OpenVMS (`Ctrl+Alt+F7`)|
| `VMS-IDE: Change CR/LF for all source files` | Change CR/LF to LF for all source files |
| `VMS-IDE: Clean project` | Clean the project, delete files from output folder |
| `VMS-IDE: Create/Update MMS` | Create default MMS |
| `VMS-IDE: Download system headers` | Download system headers from VMS |
| `VMS-IDE: Edit VMS project settings` | Edit project settings |
| `VMS-IDE: Edit ssh-helper settings` | Edit SSH connection settings |
| `VMS-IDE: Force built status` | Force built status |
| `VMS-IDE: Force synchronized status` | Force synchronized status |
| `VMS-IDE: Prepare to debug` | Prepare project for debugging |
| `VMS-IDE: Quick upload` | Execute quick uploading |
| `VMS-IDE: Rebuild on VMS` | Rebuild project on OpenVMS with its dependencies |
| `VMS-IDE: Rebuild project` | Rebuild the selected project on OpenVMS |
| `VMS-IDE: Reparse Basic project` | Reparse Basic project |
| `VMS-IDE: Reparse Fortran project` | Reparse Fortran project |
| `VMS-IDE: Reparse Pascal project` | Reparse Pascal project |
| `VMS-IDE: Synchronize project files with VMS` | Synchronize project files with VMS |
| `VMS-IDE: Synchronize project with dependencies with VMS` | Synchronize project with dependencies with VMS |
| `VMS-IDE: Terminal` | Open VMS terminal (`Ctrl+F6`)|
| `VMS-IDE: Upload files via Zip` | Upload project files using Zip |
| `VMS-IDE: Upload project with dependencies via Zip` | Upload project with dependencies using Zip |
| `VMS-IDE: Upload files` | Upload project files |
| `VMS-IDE: Upload project with dependencies` | Upload project with dependencies |


## Settings

| Section name | Name | Type | Description |
| --- | --- | --- | --- |
| `vmssoftware.config-helper.settings.using` | Config-helper › Settings: Using	| `FS`, `VFS` or `VCS` | [Place](#configuration-storage-options) where extension settings will be kept |
| `vmssoftware.config-helper.settings.debug` | Config-helper › Settings: Debug | string |  Debug output to, 'console' or folder |
| `vmssoftware.config-helper.settings.addCalleeInfo` | Config-helper › Settings: Add Callee Info| boolean | Whether or not to add callee info to debug output |

