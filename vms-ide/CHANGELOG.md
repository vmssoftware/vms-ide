For detailed information see [ChangeLog](https://wiki.vmssoftware.com/VMS_IDE_Change_Log)

## 1.5.11
* Preparing to debug as a separate procedure.
* Embedded SQL in FORTRAN

## 1.5.9
* Allow the user to set additional compiler qualifiers and defines
* New command for Python debugger to set radix

## 1.5.6
* Fix VMS debugger (resolving source files in different folders with the same basename).

## 1.5.5
* Fix Python debugger (display/set variables).

## 1.5.3
* Add developer mode for Python debugger. This feature allows tracing system files.

## 1.5.0
* Two-terminal debugger

## 1.4.12
* Fix BASIC RMSSTATUS syntax

## 1.4.11
* Fix Python debugger

## 1.4.9
* Added command to ZIP listing files on VMS side.
* Fix PASCAL syntax parser issues.

## 1.4.4
* Unzip command moved from Project settings to SSH settings
* Changed the way how the debugger finds source by module name.
* Absolute path is allowed in root (starts from /)

## 1.4.1
* Python debugger now supports entering data from debug console
* setTimeByShell settings is deleted from SynchronizeSection, supportSetFileTime is added to ConnectionSection

## 1.4.0
* Fix PASCAL syntax parser and highlighting issues.
* Add BASIC highlighting and syntax parser.
* Add experimental Pyhton debugger.
* Fix glob patterns (project settings masks).

## 1.3.6
* Fix PASCAL syntax parser issues.

## 1.3.5
* Fix PASCAL syntax parser issues.

## 1.3.4
* Handle more cases in COBOL Light-weight IntelliSense.
* Parse and skip EXEC SQL statements in COBOL.

## 1.3.3
* Fix time of uploaded files after 'Quick uploading'.

## 1.3.2
* Fix breakpoints.

## 1.3.1
* Light-weight IntelliSense for Fortran and Cobol.

## 1.2.6
* Fixed issue when extension is crashed while opening C project.
* Fixed duplicating algorithms in SSH settings.

## 1.2.3 - 1.2.5
* Function breakpoints. Data breakpoints without UI.

## 1.2.2
* Fix for display/set unicode string in **Java** debugger, collecting fields of java classes.

## 1.2.1
* Fix issues with templates in **Java**.

## 1.2.0
* Support for **Java**, **Kotlin** and **Scala** languages.
* One output channel for all extension messages.

## 1.1.0
* **Pascal** syntax highlighting.
* OpenVMS specific **COBOL** grammar support.

## 1.0.2
* Allow users to skip signature verification in SSH (cause: Visual Studio Code 1.36.1 issue).

## 1.0.1
* Fix: parsing compiler errors that occurred on the same line of source code.
* OpenVMS specific **Pascal** grammar basic support.
* Debugger: skip querying symbols with invalid names.

## 1.0.0
* Stable version

## 0.0.23
* New synchronization setting: **forceLocalTime**
* Grammars for **PASCAL**, **COBOL**, **FORTRAN**, **BLISS** and **BASIC** are included.
* New command is added: "Quick uploading"

## 0.0.22
* New project settings: **addLibraries** and **addIncludes**
* Allow customization of command to start the SSH terminal
* Named build configurations

## 0.0.21
* Small fixes

## 0.0.20
* Increase stability

## 0.0.18
* Fix unclosed connections.
* Fix uploading unsaved files.

## 0.0.17
* Initial release.