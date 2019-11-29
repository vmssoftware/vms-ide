import * as assert from "assert";
import * as fs from "fs";
import * as vscode from "vscode";
import { findCorrespondingLines } from "../common/correspondLines";

interface IListLine {
    num: number,
    content: string,
};

interface IListMatch {
    srcLine: number,
    lstLine: number,
};

suite("DIFF tests", function(this: Mocha.Suite) {

    this.timeout(0);

    this.beforeAll(async () => {
    });

    /***************************************************************************************/
    /***************************************************************************************/
    /***************************************************************************************/

    test("diff 1", async() => {
        let src = `#pragma module CM_DS "C-M-DS"
 
#include <stdio>
#include <string>
#include <stdlib>

#include <ssdef>
#include <lib$routines>
#include <cli$routines>
#include <descrip>
#include <climsgdef>


#include "cmds.h" 

$DESCRIPTOR(prompt, ">==> ");
$DESCRIPTOR(edit, "EDIT");
$DESCRIPTOR(filespec, "FILESPEC");
$DESCRIPTOR(search_string, "SEARCH_STRING");

$DYNAMIC_D(file_value);
$DYNAMIC_D(search_value);
$DYNAMIC_D(host_value);

int SEND_COMMAND(void)
{
        printf("Send command\\n");
        if (cli$present(&edit) & 1) {
                printf("\\t/EDIT is present\\n");
        }
        if (cli$present(&filespec) & 1) {
                printf("\\tfile is present\\n");
                unsigned short len;
                cli$get_value(&filespec, &file_value, &len);
                printf("\\t\\tfile_value=\\"%.*s\\"\\n", file_value.dsc$w_length, file_value.dsc$a_pointer);
        }
        return 0;
}

int SEARCH_COMMAND(void)
{
        printf("Search command\\n");
        if (cli$present(&search_string) & 1) {
                printf("\\tsearch_string is present\\n");
                cli$get_value(&search_string, &search_value);
                printf("\\t\\tsearch_value=\\"%.*s\\"\\n", search_value.dsc$w_length, search_value.dsc$a_pointer);
        }
        return 0;
}

int EXIT_COMMAND(void)
{
        printf("Exit command\\n");
        // SYS$EXIT(1);
        return 1;
}

int DO_CMDS(void)
{
        lib$get_hostname(&host_value);
        char *host_prompt = (char*)malloc(host_value.dsc$w_length+16);
        strncpy(host_prompt, host_value.dsc$a_pointer, host_value.dsc$w_length);
        strncpy(host_prompt + host_value.dsc$w_length, "> ", 2);
        $DESCRIPTOR(host_prompt_dsc, host_prompt);
        host_prompt_dsc.dsc$w_length = host_value.dsc$w_length + 2;

        unsigned int ret = 0;
        do {
                ret = cli$dcl_parse(0, VS_TABLE_CMD, lib$get_input, lib$get_input, &host_prompt_dsc);
                switch (ret ) 
                {
                        case CLI$_NORMAL:
                                ret = cli$dispatch();
                                break;
                        case CLI$_INVREQTYP:
                                printf("Calling process did not have a CLI to perform this function, or the CLI did not support the request.\\n");
                                ret = 1;
                                break;
                        case CLI$_IVKEYW:
                                printf("Invalid keyword.\\n");
                                ret = 0;
                                break;
                        case CLI$_IVQUAL:
                                printf("Unrecognized qualifier.\\n");
                                ret = 0;
                                break;
                        case CLI$_IVVERB:
                                printf("Invalid or missing verb.\\n");
                                ret = 0;
                                break;
                        case CLI$_NOCOMD:
                                printf("Routine terminated. You entered a null string in response to a prompt from the prompt_routine argument, causing the CLI$DCL_PARSE routine to terminate.\\n");
                                ret = 0;
                                break;
                        case CLI$_ONEVAL:
                                printf("List of values not allowed; enter one only.\\n");
                                ret = 0;
                                break;
                        default:
                                printf("Unrecognized return code.\\n");
                                ret = 1;
                                break;
                }
        } while(ret == 0);
        return 0;
}`;

    let list = `CM_DS                           Source Listing                   4-OCT-2019 00:26:10  VSI C V7.4-001-50L7J              Page 1
C-M-DS                                                           6-MAY-2019 04:42:55  [VORFOLOMEEV.three_ws.executable]c-m-d-s.c;1

	      1 #pragma module CM_DS "C-M-DS"
	      2  
	      3 #include <stdio>
	   1614 #include <string>
	   2065 #include <stdlib>
	   4160 
	   4161 #include <ssdef>
	   8509 #include <lib$routines>
	  13152 #include <cli$routines>
	  13291 #include <descrip>
	  14263 #include <climsgdef>
	  14668 
	  14669 
	  14670 #include "cmds.h" 
	  14698 
	  14699 $DESCRIPTOR(prompt, ">==> ");
	  14700 $DESCRIPTOR(edit, "EDIT");
	  14701 $DESCRIPTOR(filespec, "FILESPEC");
	  14702 $DESCRIPTOR(search_string, "SEARCH_STRING");
	  14703 
	  14704 $DYNAMIC_D(file_value);
	  14705 $DYNAMIC_D(search_value);
	  14706 $DYNAMIC_D(host_value);
	  14707 
	  14708 int SEND_COMMAND(void)
      1	  14709 {
      1	  14710         printf("Send command\\n");
      2	  14711         if (cli$present(&edit) & 1) {
      2	  14712                 printf("\\t/EDIT is present\\n");
      1	  14713         }
      2	  14714         if (cli$present(&filespec) & 1) {
      2	  14715                 printf("\\tfile is present\\n");
      2	  14716                 unsigned short len;
      2	  14717                 cli$get_value(&filespec, &file_value, &len);
      2	  14718                 printf("\\t\\tfile_value=\\"%.*s\\"\\n", file_value.dsc$w_length, file_value.dsc$a_pointer);
      1	  14719         }
      1	  14720         return 0;
      1	  14721 }
	  14722 
	  14723 int SEARCH_COMMAND(void)
      1	  14724 {
      1	  14725         printf("Search command\\n");
      2	  14726         if (cli$present(&search_string) & 1) {
      2	  14727                 printf("\\tsearch_string is present\\n");
      2	  14728                 cli$get_value(&search_string, &search_value);
      2	  14729                 printf("\\t\\tsearch_value=\\"%.*s\\"\\n", search_value.dsc$w_length, search_value.dsc$a_pointer);
      1	  14730         }
      1	  14731         return 0;
      1	  14732 }
	  14733 
	  14734 int EXIT_COMMAND(void)
      1	  14735 {
      1	  14736         printf("Exit command\\n");
      1	  14737         // SYS$EXIT(1);
      1	  14738         return 1;
      1	  14739 }
	  14740 

CM_DS                           Source Listing                   4-OCT-2019 00:26:10  VSI C V7.4-001-50L7J              Page 2
C-M-DS                                                           6-MAY-2019 04:42:55  [VORFOLOMEEV.three_ws.executable]c-m-d-s.c;1

	  14741 int DO_CMDS(void)
      1	  14742 {
      1	  14743         lib$get_hostname(&host_value);
      1	  14744         char *host_prompt = (char*)malloc(host_value.dsc$w_length+16);
      1	  14745         strncpy(host_prompt, host_value.dsc$a_pointer, host_value.dsc$w_length);
      1	  14746         strncpy(host_prompt + host_value.dsc$w_length, "> ", 2);
      1	  14747         $DESCRIPTOR(host_prompt_dsc, host_prompt);
      1	  14748         host_prompt_dsc.dsc$w_length = host_value.dsc$w_length + 2;
      1	  14749 
      1	  14750         unsigned int ret = 0;
      2	  14751         do {
      2	  14752                 ret = cli$dcl_parse(0, VS_TABLE_CMD, lib$get_input, lib$get_input, &host_prompt_dsc);
      2	  14753                 switch (ret ) 
      3	  14754                 {
      3	  14755                         case CLI$_NORMAL:
      3	  14756                                 ret = cli$dispatch();
      3	  14757                                 break;
      3	  14758                         case CLI$_INVREQTYP:
      3	  14759                                 printf("Calling process did not have a CLI to perform this function, or the CLI did 
      3	  14759 not support the request.\\n");
      3	  14760                                 ret = 1;
      3	  14761                                 break;
      3	  14762                         case CLI$_IVKEYW:
      3	  14763                                 printf("Invalid keyword.\\n");
      3	  14764                                 ret = 0;
      3	  14765                                 break;
      3	  14766                         case CLI$_IVQUAL:
      3	  14767                                 printf("Unrecognized qualifier.\\n");
      3	  14768                                 ret = 0;
      3	  14769                                 break;
      3	  14770                         case CLI$_IVVERB:
      3	  14771                                 printf("Invalid or missing verb.\\n");
      3	  14772                                 ret = 0;
      3	  14773                                 break;
      3	  14774                         case CLI$_NOCOMD:
      3	  14775                                 printf("Routine terminated. You entered a null string in response to a prompt from t
      3	  14775 he prompt_routine argument, causing the CLI$DCL_PARSE routine to terminate.\\n");
      3	  14776                                 ret = 0;
      3	  14777                                 break;
      3	  14778                         case CLI$_ONEVAL:
      3	  14779                                 printf("List of values not allowed; enter one only.\\n");
      3	  14780                                 ret = 0;
      3	  14781                                 break;
      3	  14782                         default:
      3	  14783                                 printf("Unrecognized return code.\\n");
      3	  14784                                 ret = 1;
      3	  14785                                 break;
      2	  14786                 }
      1	  14787         } while(ret == 0);
      1	  14788         return 0;
      1	  14789 }


Command Line
------- ----

CC/DEBUG/NOOP/LIST=[.out.DEBUG.obj]c-m-d-s/OBJECT=[.out.DEBUG.obj]c-m-d-s.obj/I

CM_DS                           Source Listing                   4-OCT-2019 00:26:10  VSI C V7.4-001-50L7J              Page 3
C-M-DS                                                           6-MAY-2019 04:42:55  [VORFOLOMEEV.three_ws.executable]c-m-d-s.c;1

NCLUDE_DIRECTORY=(SYS$LIBRARY,STATIC_INC_DIR,SHAREABLE_INC_DIR) c-m-d-s.c

Hardware: /ARCHITECTURE=GENERIC /OPTIMIZE=TUNE=GENERIC

These macros are in effect at the start of the compilation.
----- ------ --- -- ------ -- --- ----- -- --- ------------

 __G_FLOAT=0  __DECC=1  vms=1  VMS=1  __32BITS=1  __PRAGMA_ENVIRONMENT=1 
 __ia64__=1  __CRTL_VER=80400000  __vms_version="V8.4-2  "  CC$gfloat=0 
 __X_FLOAT=1  vms_version="V8.4-2  "  __DATE__="Oct  4 2019" 
 __STDC_VERSION__=199901L  __DECC_MODE_RELAXED=1  __DECC_VER=70490001 
 __VMS=1  VMS_VERSION="V8.4-2  "  __IEEE_FLOAT=1  __VMS_VERSION="V8.4-2  " 
 __TIME__="00:26:10"  __ia64=1  __VMS_VER=80420022  __BIASED_FLT_ROUNDS=2 
 __INITIAL_POINTER_SIZE=0  __STDC__=2  _IEEE_FP=1  __LANGUAGE_C__=1  __vms=1 
 __D_FLOAT=0 

`;
        let matchedLines = findCorrespondingLines(src, list);
        let found100 = matchedLines.find(x => x.srcLine === 100);

        assert.ok(found100 !== undefined, "Cannot found line 100");
        assert.strictEqual(14784, found100!.lstLine, "Must be 14784 in list");

        console.log("done");

    });


    /***************************************************************************************/

});
