**VMS IDE** is an extension that enables you to quickly and easily develop comprehensive applications for OpenVMS systems. It provides a set of tools for developing, building, and debugging OpenVMS projects.

## Features

* Source code **synchronization** between the local machine and OpenVMS system.
* **SSH connection** setup to remote OpenVMS system.
* **Projects Explorer** as a simple and convenient way to manage OpenVMS projects.
* **Debugger** for OpenVMS and JVM projects. Also experimental debugger for Python is added.
* **Highlighting** for *MMS*, *CLD*, *MSG*, *Pascal*, *Basic*, *Fortran* and *Cobol* files.
* **Light-weight IntelliSense** for *CLD*, *MSG*, *Pascal*, *Basic*, *Fortran* and *Cobol* source.
* Supported languages: **C**, **C++**, **Fortran**, **Cobol**, **Pascal**, **Basic**, **Bliss**, **Java**, **Kotlin**, **Scala**.

## Getting started

* [Installation](https://wiki.vmssoftware.com/VMS_IDE_Installation)
* [Setting Up a VMS Project](https://wiki.vmssoftware.com/VMS_IDE_Project_Configuration)
* [Working On a VMS Project](https://wiki.vmssoftware.com/VMS_IDE_Developing)

## Configuration Storage Options

| Name | Description | Comment |
| --- | --- | --- |
| `FS` | Save settings in local JSON file | Recommended |
| `VFS` | Save setting in VS Code virtual file system | |
| `VCS` | Manage settings using VS Code provided API | |

## Commands

| Command name | Description |
| --- | --- |
| `VMS-IDE: Edit ssh-helper settings` | Edit SSH connection settings |
| `VMS-IDE: Edit OpenVMS project settings` | Edit project settings |
| `VMS-IDE: Change CR/LF for all source files` | Change CR/LF to LF for all source files |
| `VMS-IDE: Create MMS` | Create default MMS |
| `VMS-IDE: Build on VMS` | Build project on OpenVMS with its dependencies |
| `VMS-IDE: Re-build on VMS` | Rebuild project on OpenVMS with its dependencies |
| `VMS-IDE: Build this project` | Build the selected project on OpenVMS (`Ctrl+Alt+F7`)|
| `VMS-IDE: Re-build this project` | Rebuild the selected project on OpenVMS |
| `VMS-IDE: Clean this project` | Clean the project, delete files from output folder |
| `VMS-IDE: Synchronize project file with VMS` | Synchronize project files with VMS |
| `VMS-IDE: Force synchronized status` | Force synchronized status |
| `VMS-IDE: Force built status` | Force built status |
| `VMS-IDE: Upload all via Zip` | Upload project files using Zip |
| `VMS-IDE: Download system headers` | Download system headers from VMS |
| `VMS-IDE: Terminal` | Open VMS terminal (`Ctrl+F6`)|
| `VMS-IDE: Upload` | Upload project files |
| `VMS-IDE: Quick uploading` | Execute quick uploading |

## Settings

| Section name | Name | Type | Description |
| --- | --- | --- | --- |
| `vmssoftware.config-helper.settings.using` | Config-helper › Settings: Using	| `FS`, `VFS` or `VCS` | [Place](#configuration-storage-options) where extension settings will be kept |
| `vmssoftware.config-helper.settings.test` | Test | string | For testing purposes, do not change |
| `vmssoftware.config-helper.settings.debug` | Config-helper › Settings: Debug | string |  Debug output to, 'console' or folder |
| `vmssoftware.config-helper.settings.addCalleeInfo` | Config-helper › Settings: Add Callee Info| boolean | Whether or not to add callee info to debug output |

