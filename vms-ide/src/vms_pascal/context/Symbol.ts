import * as nls from "vscode-nls";
import * as vscode from 'vscode';
import { SymbolKind } from './Facade';

 nls.config({ messageFormat: nls.MessageFormat.both });
// const localize = nls.loadMessageBundle();

/**
 * Provides a textual expression for a native symbol kind.
 */
export function symbolDescriptionFromEnum(kind: SymbolKind): string 
{
    // Could be localized.
    switch (kind) 
    {
        case SymbolKind.Syntax:
            return "Syntax";
        case SymbolKind.Type:
            return "Type";
        case SymbolKind.TypeRef:
            return "Type reference";
        case SymbolKind.BuiltInType:
            return "Built-In Type";
        case SymbolKind.BuiltInFunc:
                return "Built-In Function";   
        case SymbolKind.Parameter:
            return "Parameter";
        case SymbolKind.Qualifier:
            return "Qualifier";
        case SymbolKind.Keyword:
            return "Keyword";
        case SymbolKind.Label:
            return "Label";
        case SymbolKind.Entity:
            return "Entity";
        case SymbolKind.Routine:
            return "Routine";
        case SymbolKind.RoutineDcl:
            return "Routine";
        case SymbolKind.RoutineHeader:
            return "Routine";    
        case SymbolKind.VariableDcl:
            return "Variable";
        case SymbolKind.TypeDcl:
            return "Type";
        case SymbolKind.TypeBlockDcl:
            return "Type";
        case SymbolKind.ConstBlockDcl:
            return "Constant";  
        default:
            return "Unknown type";
    }
}

/**
 * Converts the native symbol kind to a vscode symbol kind.
 */
export function translateSymbolKind(kind: SymbolKind): vscode.SymbolKind 
{
    switch (kind) 
    {
        case SymbolKind.Syntax:
            return vscode.SymbolKind.Class;
        case SymbolKind.Type:
            return vscode.SymbolKind.Class;
        case SymbolKind.BuiltInType:
            return vscode.SymbolKind.Class;
        case SymbolKind.BuiltInFunc:
                return vscode.SymbolKind.Function;
        case SymbolKind.TypeRef:
            return vscode.SymbolKind.Variable;
        case SymbolKind.Parameter:
            return vscode.SymbolKind.Method;
        case SymbolKind.Qualifier:
            return vscode.SymbolKind.Method;
        case SymbolKind.Keyword:
            return vscode.SymbolKind.Method;
        case SymbolKind.Label:
            return vscode.SymbolKind.Method;
        case SymbolKind.Entity:
            return vscode.SymbolKind.Variable;
        case SymbolKind.Routine:
            return vscode.SymbolKind.Variable;
        default:
            return vscode.SymbolKind.Null;
    }
}

/**
 * Converts the native symbol kind to a vscode symbol kind.
 */
export function translateCompletionKind(kind: SymbolKind): vscode.CompletionItemKind 
{
    switch (kind) 
    {
        case SymbolKind.Syntax:
            return vscode.CompletionItemKind.Class;
        case SymbolKind.Type:
            return vscode.CompletionItemKind.Class;
        case SymbolKind.BuiltInType:
            return vscode.CompletionItemKind.Class;
        case SymbolKind.BuiltInFunc:
                return vscode.CompletionItemKind.Function;
        case SymbolKind.TypeRef:
            return vscode.CompletionItemKind.Variable;
        case SymbolKind.Parameter:
            return vscode.CompletionItemKind.Method;
        case SymbolKind.Qualifier:
            return vscode.CompletionItemKind.Method;
        case SymbolKind.Keyword:
            return vscode.CompletionItemKind.Method;
        case SymbolKind.Label:
            return vscode.CompletionItemKind.Method;
        case SymbolKind.Entity:
            return vscode.CompletionItemKind.Variable;
        case SymbolKind.Routine:
            return vscode.CompletionItemKind.Variable;
        default:
            return vscode.CompletionItemKind.Text;
    }
}

export const BuiltInValueTypes: string[] = 
[
    "integer",
    "real",
    "char",
    "boolean",
    "string",
];

export interface IBuildInFunc 
{
    name: string;
    prototype: string;
    description: string;
    arguments: string;
    result: string;
}

export const BuiltInFunctions: IBuildInFunc[] = 
[
    {   
        name: "ABS",
        prototype: "function ABS(x: arithmetic): arithmetic;",
        description: "The ABS function returns a value that is the absolute value of the parameter.",
        arguments: "The parameter x can be of any arithmetic type.",
        result: "Value of the same data type as the specified parameter."
    },
    {   
        name: "ADD_ATOMIC",
        prototype: "function ADD_ATOMIC(e, v: integer): integer",
        description: "The ADD_ATOMIC function adds the value of an expression to the value of a variable, stores the newly computed value in the variable.",
        arguments: "The type of the expression e must be assignment compatible with that of the variable v. The variable v must be an INTEGER, UNSIGNED, INTEGER64, or UNSIGNED variable.",
        result: "returns the previous value of the variable"
    },
    {   
        name: "ADD_INTERLOCKED",
        prototype: "function ADD_INTERLOCKED(e, v: integer): integer",
        description: "The ADD_INTERLOCKED function adds the value of an expression to the value of a variable, stores the newly computed value in the variable, and returns an integer value: –1 if the new value is negative, 0 if it is zero, and 1 if it is positive.",
        arguments: "The type of the expression e must be assignment compatible with that of the variable v.The variable v must be an integer or an unsigned subrange; v must haven an allocation size of two bytes and must be aligned on a word boundary.",
        result: "returns a integer value"
    },
    {   
        name: "ADDRESS",
        prototype: "function ADDRESS( x: ^type): ^type",
        description: "The ADDRESS function returns a pointer value that is the address of the parameter.",
        arguments: "The parameter x can be a variable of any type except a component of a packed structured type.",
        result: "returns a pointer value"
    },
    {   
        name: "AND_ATOMIC",
        prototype: "function AND_ATOMIC(e, v: integer): integer",
        description: "The AND_ATOMIC function logically ANDs the value of an expression to the value of a variable, stores the newly computed value in the variable",
        arguments: "The type of the expression e must be assignment compatible with that of the variable v. The variable v must be an INTEGER, UNSIGNED, INTEGER64, or UNSIGNED64 variable",
        result: "returns the previous value of the variable"
    },
    {   
        name: "ARCTAN",
        prototype: "function ARCTAN(x: real): real",
        description: "The ARCTAN function returns a real value that expresses in radians the arctangent of the specified parameter.",
        arguments: "The parameter x can be an integer or REAL type.",
        result: "returns a real value"
    },
    {   
        name: "ARGUMENT",
        prototype: "function ARGUMENT(parameter-name, n)",
        description: "The ARGUMENT function specifies an argument in a variable-length parameter list that was created using the LIST attribute.",
        arguments: "The parameter-name argument specifies the name of a parameter declared with the LIST attribute. The parameter n specifies a positive integer value that identifies the argument. The first argument in a list is always 1.",
        result: ""
    },
    {   
        name: "ARGUMENT_LIST_LENGTH",
        prototype: "function ARGUMENT_LIST_LENGTH(parameter-name): integer",
        description: "The ARGUMENT_LIST_LENGTH function returns an integer value representing the number of arguments in a variable-length parameter list that was created using the LIST attribute.",
        arguments: "The parameter-name argument specifies the name of the parameter declared with the LIST attribute.",
        result: "returns an integer value"
    },
    {   
        name: "ASSERT",
        prototype: " procedure ASSERT(expression [[, string]])",
        description: "The ASSERT procedure signals a run-time error if the value of its parameter is FALSE.",
        arguments: "The parameter expression is a Boolean expression that is normally true. The optional string parameter is output as part of the error message.",
        result: ""
    },
    {   
        name: "BARRIER",
        prototype: "procedure BARRIER",
        description: "The BARRIER procedure causes a memory barrier instruction to be emitted to synchronize pending memory updates in a multi-processor environment.",
        arguments: "",
        result: ""
    },
    {   
        name: "BIN",
        prototype: "function BIN( x[[, length[[, digits]] ]] )",
        description: "The BIN function returns a character-string value that is the binary equivalent of the specified parameter.",
        arguments: "The parameter x is the expression to be converted. This parameter must have a size that is known at compile time; it cannot be VARYING OF CHAR, a conformant parameter, or a schema type. Two optional integer parameters specify the length of the resulting string and the minimum number of significant digits to be returned.",
        result: "returns a character-string value"
    },
    {   
        name: "BIT_OFFSET",
        prototype: "function BIT_OFFSET( t, f )",
        description: "The BIT_OFFSET function returns an integer value that represents the bit position of a field in a record.",
        arguments: "The parameter t can be of any record type or variable, and the parameter f can be any field contained in that record.",
        result: "returns an integer valu"
    },
    {   
        name: "BITNEXT",
        prototype: "function BITNEXT( x )",
        description: "The BITNEXT function returns an integer value that indicates the number of bits that would be allocated for one component of the specified type in a packed array or if the specified variable appeared as a cell in a packed array.",
        arguments: "The parameter x can be a variable or any type identifier.",
        result: "returns an integer value"
    },
    {
        name: "BITSIZE",
        prototype: "function BITSIZE( x )",
        description: "The BITSIZE function returns an integer value that indicates the number of bits that would be allocated for one field of the specified type in a packed record or if the specified variable appeared as a field in a packed record.",
        arguments: "The parameter x can be a variable or any type identifier.",
        result: "returns an integer value"
    },
    {
        name: "BYTE_OFFSET",
        prototype: "function function BYTE_OFFSET( t, f )",
        description: "The BYTE_OFFSET function returns an integer value that represents the byte position of a field in a record.",
        arguments: "The parameter t can be of any record type or variable, and the parameter f can be any field contained in that record.",
        result: "returns an integer value"
    },
    {
        name: "C_STR",
        prototype: "function C_STR(e)",
        description: "The C_STR function takes a compile-time string expression and returns a C_STR_T pointer to a static string literal with a terminating null character.",
        arguments: "The C_STR function can also accept a Pascal variable of either PACKED ARRAY OF CHAR, VARYING OF CHAR, or STRING.",
        result: "returns a C_STR_T pointer to a static string literal"
    },
    {
        name: "CARD",
        prototype: "function CARD( s )",
        description: "The CARD function returns an integer value indicating the number of components that are currently elements of the set expression.",
        arguments: "returns an integer value",
        result: "The parameter s must be a set expression."
    },
    {
        name: "CHR",
        prototype: "function CHR( x )",
        description: "The CHR function returns a char value whose ordinal value in the ASCII character set is the parameter, provided such a character exists.",
        arguments: "The parameter x must be integer or unsigned and have a value from 0 to 255.",
        result: "returns a char value"
    },
    {
        name: "CLEAR_INTERLOCKED",
        prototype: "function CLEAR_INTERLOCKED( b )",
        description: "The CLEAR_INTERLOCKED function assigns the value FALSE to the\
        parameter and returns the original Boolean value of the parameter.",
        arguments: "The parameter b must be a variable of type BOOLEAN. The variable does not\
        have to be aligned; therefore, it can be a field of a packed record.",
        result: "returns the original Boolean value"
    },
    {
        name: "CLOCK",
        prototype: "function CLOCK",
        description: "The CLOCK function returns an integer value indicating the amount of central\
        processor time (in milliseconds) used by the current process.",
        arguments: "",
        result: "returns an integer value"
    },
    {
        name: "COS",
        prototype: "function COS( x )",
        description: "The COS function returns a real value that represents the cosine of the\
        specified parameter.",
        arguments: "The parameter x can be an integer or REAL type, and is expressed in radians.",
        result: "returns a real value"
    },
    {
        name: "CREATE_DIRECTORY",
        prototype: "procedure CREATE_DIRECTORY( file-name [[, error-return]] )",
        description: "The CREATE_DIRECTORY procedure creates a new directory or\
        subdirectory.",
        arguments: "The file-name parameter must be a directory name, and optionally\
         can contain a device name. The error-return parameter is optional, and will\
         return an error recovery code if specified.",
        result: ""
    },
    {
        name: "DATE",
        prototype: "function DATE( t )",
        description: "The DATE and TIME functions provide a standard way of returning\
         a character-string value that indicates the calendar date and time.\
         The return value is compatible with all string types.",
        arguments: "The parameter t is a variable of the predeclared type TIMESTAMP.",
        result: "The return value is compatible with all string types"
    },
    {
        name: "TIME",
        prototype: "function TIME( t )",
        description: "The DATE and TIME functions provide a standard way of returning\
         a character-string value that indicates the calendar date and time.\
         The return value is compatible with all string types.",
        arguments: "The parameter t is a variable of the predeclared type TIMESTAMP.",
        result: "The return value is compatible with all string types"
    },
    {
        name: "DATE( str )",
        prototype: "procedures DATE( str )",
        description: "The DATE procedures write the date and the time to their parameters.",
        arguments: "The parameter str must be of type PACKED ARRAY[1..11] OF CHAR.",
        result: ""
    },
    {
        name: "TIME( str )",
        prototype: "procedures TIME( str )",
        description: "The TIME procedures write the date and the time to their parameters.",
        arguments: "The parameter str must be of type PACKED ARRAY[1..11] OF CHAR.",
        result: ""
    },
    {
        name: "DBLE",
        prototype: "function DBLE( x )",
        description: "The DBLE function converts the parameter and returns its DOUBLE equivalent.",
        arguments: "The parameter x must be of an arithmetic type.",
        result: "DOUBLE"
    },
    {
        name: "DEC",
        prototype: "function DEC( x[[, length[[, digits]] ]] )",
        description: "The DEC function returns a character-string value that is the decimal\
        equivalent of the specified parameter. The return value is compatible with all\
        other string types.",
        arguments: "The parameter x is the expression to be converted. Two optional integer parameters specify the length of the resulting string\
        and the minimum number of significant digits to be returned.",
        result: "string"
    },
    {
        name: "DELETE_FILE",
        prototype: "procedure DELETE_FILE( file-name [[, error-return]] )",
        description: "The DELETE_FILE procedure deletes one or more files.",
        arguments: "The file-name specification can contain an explicit device and directory name,\
        plus it must contain a file name, a file type or extension, and a version number. \
        The error return parameter returns an error recovery code if specified.",
        result: ""
    },
    {
        name: "DISPOSE",
        prototype: "procedure DISPOSE( p [[, t1,...,tn]] )",
        description: "The DISPOSE procedure deallocates memory for a dynamic variable.",
        arguments: "The parameter p is a pointer expression. The t parameters are constant\
        expressions that match the corresponding t parameter used in the call to the\
        NEW procedure that allocated the memory.",
        result: ""
    },
    {
        name: "EQ",
        prototype: "function EQ( str1, str2 )",
        description: "The EQ function returns a Boolean value that specifies if the parameters are\
        equal according to the ASCII values of the strings’ characters.",
        arguments: "The parameters str1 and str2 must be character-string expressions.",
        result: "returns a Boolean value"
    },
    {
        name: "ESTABLISH",
        prototype: "procedure ESTABLISH( function-identifier )",
        description: "The ESTABLISH procedure specifies a condition handler that executes if your\
        program generates operating-system events.",
        arguments: "The function-identifier parameter must be the name of a function that has the\
        ASYNCHRONOUS attribute and must return an integer value.",
        result: ""
    },
    {
        name: "EXP",
        prototype: "function EXP( x )",
        description: "The EXP function returns a real value that represents the exponent of the\
        specified parameter.",
        arguments: "The parameter x can be an integer or REAL type.",
        result: "returns a real value"
    },
    {
        name: "EXPO",
        prototype: "function EXPO( x )",
        description: "The EXPO function returns the integer exponent of the floating-point\
        representation of the parameter.",
        arguments: "The parameter x can be of any real type.",
        result: "returns the integer exponent"
    },
    {
        name: "FIND_FIRST_BIT_CLEAR",
        prototype: "function FIND_FIRST_BIT_CLEAR( vector [[, start-index]] )",
        description: "The FIND_FIRST_BIT_CLEAR function locates the first bit in a Boolean array\
        whose value is 0 and returns an integer value that specifies the index into the array.",
        arguments: "The vector parameter is a variable of type PACKED ARRAY OF BOOLEAN\
        with an integer index type. The optional start-index parameter must be an\
        integer expression that indexes the element at the point at which the search starts.",
        result: "returns an integer value"
    },
    {
        name: "FIND_FIRST_BIT_SET",
        prototype: "function FIND_FIRST_BIT_SET( vector [[, start-index]] )",
        description: "The FIND_FIRST_BIT_SET function locates the first bit in a Boolean array\
        whose value is 1 and returns an integer value that specifies the index into the\
        array.",
        arguments: "The vector parameter is a variable of type PACKED ARRAY OF BOOLEAN\
        with an integer index type. The optional start-index parameter must be an\
        expression of an integer type that indexes the element at the point at which\
        the search starts.",
        result: "returns an integer value"
    },
    {
        name: "FIND_MEMBER",
        prototype: "function FIND_MEMBER( string, char-set )",
        description: "The FIND_MEMBER function locates the first character in a string that is a\
        member of a specified set and returns an integer value indicating the position\
        of the character in the string; the function returns 0 if the characters in the\
        string were not members of the set.",
        arguments: "The string parameter is a string value, and char-set is a value of type SET OF CHAR.",
        result: "returns an integer value"
    },
    {
        name: "FIND_NONMEMBER",
        prototype: "function FIND_NONMEMBER( string, char-set )",
        description: "The FIND_NONMEMBER function locates the first character in a string that\
        is not a member of a specified set and returns an integer value indicating the\
        position of the character in the string; the function returns 0 if the characters\
        in the string were all members of the set.",
        arguments: "The string parameter is a string value, and char-set is a value of type SET OF CHAR.",
        result: "returns an integer value"
    },
    {
        name: "GE",
        prototype: "function GE( str1, str2 )",
        description: "function The GE function returns a Boolean value that specifies if the first parameter is\
        greater than or equal to the second parameter, according to the ASCII values\
        of the strings’ characters.",
        arguments: "The parameters str1 and str2 must be character-string expressions.",
        result: "returns a Boolean value"
    },
    {
        name: "GETTIMESTAMP",
        prototype: "procedure GETTIMESTAMP( t [[, str]] )",
        description: "The GETTIMESTAMP procedure initializes its parameter for use with the\
        DATE and TIME functions.",
        arguments: "The parameter t is a variable of the TIMESTAMP type, which is a predeclared\
        record type. The parameter str is a string type that represents a date or both a date and\
        time.",
        result: ""
    },
    {
        name: "GT",
        prototype: "function GT( str1, str2 )",
        description: "The GT function returns a Boolean value that specifies if the first parameter\
        is greater than the second parameter, according to the ASCII values of the\
        strings’ characters.",
        arguments: "The parameters str1 and str2 must be character-string expressions.",
        result: "returns a Boolean value"
    },
    {
        name: "HALT",
        prototype: "procedure HALT",
        description: "The HALT procedure uses operating system resources to stop execution of your\
        program unless you have written a condition handler (using the ESTABLISH\
        procedure) that enables continued execution.",
        arguments: "",
        result: ""
    },
    {
        name: "HEX",
        prototype: "function HEX( x[[, length[[, digits]] ]] )",
        description: "The HEX function returns a character-string value that is the hexadecimal\
        equivalent of the specified parameter. The return value is compatible with all\
        other string types.",
        arguments: "The parameter x is the expression to be converted. Two optional integer parameters specify the length of the resulting string\
        and the minimum number of significant digits to be returned.",
        result: "returns a character-string value"
    },
    {
        name: "IADDRESS",
        prototype: "function IADDRESS( x )",
        description: "The IADDRESS function returns an INTEGER_ADDRESS value that refers\
        to the address of either a constant or VOLATILE variable, or parameter, or a\
        routine.",
        arguments: "The parameter x can be of any type except a component of a packed structured\
        type.",
        result: "returns an INTEGER_ADDRESS value"
    },
    {
        name: "IADDRESS64",
        prototype: "function IADDRESS64( x )",
        description: "The IADDRESS64 function returns an INTEGER64 value that refers to the\
        address of either a constant or VOLATILE variable, or parameter, or a routine.",
        arguments: "The parameter x can be of any type except a component of a packed structured\
        type.",
        result: "returns an INTEGER64 value"
    },
    {
        name: "IN_RANGE",
        prototype: "function IN_RANGE(expression,lower-expression,upper-expression)",
        description: "The IN_RANGE function determines if a value is in the defined subrange.",
        arguments: "The parameters must be expressions of the same ordinal type. The function",
        result: "returns TRUE if x has a value that is in the range specified by lower-expression\
        and upper_expression; otherwise, the function returns FALSE."
    },
    {
        name: "INDEX",
        prototype: "function INDEX( string, substring )",
        description: "The INDEX function searches a string for a specified substring and returns an\
        integer value that either indicates the location of the substring or the status of\
        the search.",
        arguments: "INDEX requires two character-string expressions as parameters: a string to be\
        searched and a substring to be found.",
        result: "returns an integer value"
    },
    {
        name: "INT",
        prototype: "function INT( x )",
        description: "The INT function converts the parameter and returns its INTEGER equivalent.",
        arguments: "The parameter x must be of an ordinal type.",
        result: "returns its INTEGER equivalent"
    },
    {
        name: "INT64",
        prototype: "function INT64(x)",
        description: "The INT64 function converts the parameter and returns its INTEGER64\
        equivalent.",
        arguments: "The parameter x must be of an ordinal type.",
        result: "returns its INTEGER64 equivalent"
    },
    {
        name: "LE",
        prototype: "function LE( str1, str2 )",
        description: "The LE function returns a Boolean value that specifies if the first parameter is\
        less than or equal to the second parameter, according to the ASCII values of\
        the strings’ characters.",
        arguments: "The parameters str1 and str2 must be character-string expressions.",
        result: "returns a Boolean value"
    },
    {
        name: "LENGTH",
        prototype: "function LENGTH( str )",
        description: "The LENGTH function returns an integer value that is the length of a specified\
        string expression.",
        arguments: "The str parameter must be a character-string expression.",
        result: "returns an integer value"
    },
    {
        name: "LN",
        prototype: "function LN( x )",
        description: "The LN function returns a real value that represents the natural logarithm of\
        the specified parameter.",
        arguments: "The parameter x can be an integer or REAL type. The value of x must be\
        greater than zero.",
        result: "returns a real value"
    },
    {
        name: "LOWE",
        prototype: "function LOWER( x [[, n]] )",
        description: "The LOWER function returns the lower bound for ordinal types, SET base\
        types, and array indexes.",
        arguments: "The parameter x is a type identifier or variable of an ordinal, SET, or ARRAY\
        type. The parameter n is an integer constant that denotes a dimension of x, if\
        x is an array.",
        result: "returns the lower bound for ordinal types"
    },
    {
        name: "LSHIFT",
        prototype: "function LSHIFT( expression,expression )",
        description: "The LSHIFT predeclared function returns a value of the same type as its first\
        parameter. The return value represents the value of the first parameter after\
        the bits have been shifted to the left.",
        arguments: "The parameters are two integer or unsigned values. The first parameter\
        represents a value to shift; the second represents the number of bits to shift\
        the first value to the left. LSHIFT inserts zero bits on the right as the bits\
        shift left.",
        result: "returns a value of the same type as its first\
        parameter."
    },
    {
        name: "LT",
        prototype: "function LT( str1, str2 )",
        description: "The LT function returns a Boolean value that specifies if the first parameter is\
        less than the second parameter, according to the ASCII values of the strings’\
        characters.",
        arguments: "The parameters str1 and str2 must be character-string expressions.",
        result: "returns a Boolean value"
    },
    {
        name: "MALLOC_C_STR",
        prototype: "function MALLOC_C_STR(e)",
        description: "The MALLOC_C_STR function takes a Pascal string expression, calls the C\
        routine malloc( ) to allocate memory, initializes the memory with the string\
        expression, and then terminates the string with a null-character.",
        arguments: "The type of the expression e must be a Pascal string expression.",
        result: "result is a C_STR_T pointer to the null-terminted string."
    },
    {
        name: "MAX",
        prototype: "function MAX( x1,...,xn )",
        description: "The MAX function returns a value (the same type as that of the parameters)\
        that is the maximum value of a specified list of parameters.",
        arguments: "The parameters can be any arithmetic type, but they must all be of the same\
        type.",
        result: "returns a value (the same type as that of the parameters)"
    },
    {
        name: "MFPR",
        prototype: "function MFPR( ipr-register-expression )",
        description: "The MFPR function returns an unsigned value that is the value of a\
        VAX internal processor register.",
        arguments: "The ipr-register-expression parameter is an expression compatible with the\
        UNSIGNED type.",
        result: "returns an unsigned value"
    },
    {
        name: "MIN",
        prototype: "function MIN( x1,...,xn )",
        description: "The MIN function returns a value (of the same type as that of the parameters)\
        that is the minimum value of a specified list of parameters.",
        arguments: "The parameters can be any arithmetic type, but must all be of the same type.",
        result: "returns a value (of the same type as that of the parameters)"
    },
    {
        name: "MTPR;",
        prototype: "procedure MTPR( ipr-register-expression, source-expression );",
        description: "The MTPR procedure assigns a value into a VAX internal processor register.",
        arguments: "The ipr-register-expression and source-expression parameters are expressions\
        compatible with the unsigned type.",
        result: ""
    },
    {
        name: "NE",
        prototype: "function NE( str1, str2 )",
        description: "The NE function returns a Boolean value that specifies if the parameters are\
        not equal according to the ASCII values of the strings’ characters.",
        arguments: "The parameters str1 and str2 must be character-string expressions.",
        result: "returns a Boolean value"
    },
    {
        name: "NEW",
        prototype: "procedure NEW( p [[, {t1,...,tn | d1,...,dn } ]] )",
        description: "The NEW procedure allocates memory for the dynamic variable to which a\
        pointer variable refers.",
        arguments: "The parameter p is a pointer variable.The parameters t1,...,tn are constant expressions of an ordinal type that\
        represent nested tag-field values, where t1 is the outermost variant.The parameters d1,...,dn are compile-time or run-time ordinal values that must\
        be the same type as the formal discriminants of the object.",
        result: ""
    },
    {
        name: "NEXT",
        prototype: "function NEXT( x )",
        description: "The NEXT function returns an integer value that indicates the number of\
        bytes that would be allocated for one component of the specified type in an\
        unpacked array, or if the specified variable appeared as the cell in an unpacked\
        array.",
        arguments: "The parameter x can be a type identifier or variable.",
        result: "returns an integer value"
    },
    {
        name: "OCT",
        prototype: "function OCT( x[[, length[[, digits]] ]] )",
        description: "The OCT function returns a character-string value that is the octal equivalent\
        of the specified parameter. The return value is compatible with all other string\
        types.",
        arguments: "The parameter x is the expression to be converted.Two optional integer parameters specify the length of the resulting string\
        and the minimum number of significant digits to be returned.",
        result: "returns a character-string value"
    },
    {
        name: "ODD",
        prototype: "function ODD( x )",
        description: "The ODD function returns a Boolean value that indicates if the parameter\
        is odd.",
        arguments: "The parameter x must be integer or unsigned.",
        result: "This function returns TRUE if\
        the value of x is odd and FALSE if the value of x is even."
    },
    {
        name: "OR_ATOMIC",
        prototype: "function OR_ATOMIC( e, v )",
        description: "The OR_ATOMIC function logically ORs the value of an expression to the value\
        of a variable, stores the newly computed value in the variable, and returns the\
        previous value of the variable.",
        arguments: "The type of the expression e must be assignment compatible with that of the\
        variable v. The variable v must be an INTEGER, UNSIGNED, INTEGER64, or\
        UNSIGNED64 variable and must be allocated on a natural boundary (such as,\
        longword for INTEGER and UNSIGNED and quadword for INTEGER64 and\
        UNSIGNED64). The result of OR_ATOMIC is the same type as the variable v.",
        result: "returns the previous value of the variable"
    },
    {
        name: "ORD",
        prototype: "function ORD( x )",
        description: "The ORD function returns an integer value that is the position of the\
        parameter in the ordered sequence of values of the parameter’s type.",
        arguments: "The parameter x must be of an ordinal type.",
        result: "returns an integer value"
    },
    {
        name: "PACK",
        prototype: "procedure PACK( a, i, z )",
        description: "The PACK procedure copies components of an unpacked array variable to a\
        packed array variable.",
        arguments: "The parameter a is an unpacked array. The parameter i is a value to indicate\
        the starting value of the index of a. The parameter z is a packed array of the\
        same component type as a.",
        result: ""
    },
    {
        name: "PAD",
        prototype: "function PAD( str, fill, size )",
        description: "The PAD function returns a character-string value, of the specified size, that\
        contains padded fill characters. The return value is compatible with all other\
        string types.",
        arguments: "The parameter str is a character-string value to be padded; the parameter fill\
        is a value of type CHAR to be used as the fill character; and the parameter size\
        is an integer value indicating the size of the final string.",
        result: "returns a character-string value"
    },
    {
        name: "PAS_STR",
        prototype: "function PAS_STR(e)",
        description: "The PAS_STR function returns a Pascal string value from a C_STR_T value.",
        arguments: "The type of the expression e must be C_STR_T.",
        result: "returns a Pascal string value"
    },
    {
        name: "PAS_STRCPY",
        prototype: "function PAS_STRCPY(v, e)",
        description: "The PAS_STRCPY function copies a Pascal string expression into memory\
        pointed to by C_STR_T.",
        arguments: "The type of the variable v must be C_STR_T. The type of the expression e must\
        be a Pascal string expression.",
        result: "returns a C_STR_T value"
    },
    {
        name: "PRED",
        prototype: "function PRED( x )",
        description: "The PRED function returns the value preceding the parameter according to the\
        parameter’s data type.",
        arguments: "The parameter x can be of any ordinal type; however, there must be a\
        predecessor value for x in the type.",
        result: "returns the value preceding the parameter according to the\
        parameter’s data type"
    },
    {
        name: "PRESENT",
        prototype: "function PRESENT( parameter-name )",
        description: "The PRESENT function returns a Boolean value that indicates whether the\
        actual argument list of a routine contains an argument that corresponds to a\
        formal parameter.",
        arguments: "The parameter-name parameter is the name of a formal parameter with the\
        TRUNCATE attribute.",
        result: "returns a Boolean value"
    },
    {
        name: "QUAD",
        prototype: "function QUAD( x )",
        description: "The QUAD function converts the parameter and returns its QUADRUPLE\
        equivalent.",
        arguments: "The parameter x must be an arithmetic type.",
        result: "returns its QUADRUPLE"
    },
    {
        name: "RANDOM",
        prototype: "function RANDOM[[( expression )]]",
        description: "The RANDOM function returns a randomly computed real value in the range\
        [0.0,1.0) based on a seed that is initially set to the value 7774755. The seed\
        used by the RANDOM function can be modified with the SEED function.",
        arguments: "If present, the optional expression parameter is ignored.",
        result: "returns a randomly computed real value"
    },
    {
        name: "READV",
        prototype: "procedure READV( str, {variable-identifier[[ : radix-specifier ]]},... [[, ERROR := error-recovery ]] )",
        description: "The READV procedure reads characters from a character-string expression and\
        assigns them to parameters in the READV call. The behavior of READV is\
        similar to that of READLN; the character string is similar to a one-line file.",
        arguments: "The str parameter is the string to be read.",
        result: ""
    },
    {
        name: "RENAME_FILE",
        prototype: "procedure RENAME_FILE( old-file-name, new-file-name [[, error-return]] )",
        description: "The RENAME_FILE procedure renames a file.",
        arguments: "The parameter old-file-name specifies the names of one or more files whose\
        specifications are to be changed. The new-file-name parameter provides the\
        new file specification to be applied. The error-return parameter contains an\
        error recovery code if specified.",
        result: ""
    },
    {
        name: "REVERT",
        prototype: "procedure REVERT",
        description: "The REVERT procedure cancels a condition handler activated by the\
        ESTABLISH procedure. This procedure does not have a parameter list.",
        arguments: "",
        result: ""
    },
    {
        name: "ROUND",
        prototype: "function ROUND( x )",
        description: "The ROUND function converts the value of the parameter by rounding the\
        fractional part of the value, and returns its integer equivalent.",
        arguments: "The parameter x must be of type REAL, SINGLE, DOUBLE, or QUADRUPLE.",
        result: "returns its integer equivalent"
    },
    {
        name: "ROUND64",
        prototype: "function ROUND64( x )",
        description: "The ROUND64 function converts the value of the parameter by rounding the\
        fractional part of the value, and returns its INTEGER64 equivalent.",
        arguments: "The parameter x must be of type REAL, SINGLE, DOUBLE, or QUADRUPLE.",
        result: "returns its INTEGER64 equivalent"
    },
    {
        name: "RSHIFT",
        prototype: "function RSHIFT(expression, expression)",
        description: "The RSHIFT predeclared function returns a value of the same type as its first\
        parameter. The value represents the value of the first parameter after the bits\
        have been shifted to the right.",
        arguments: "The expression parameters are two integer or unsigned values. The first\
        parameter represents a value to shift; the second represents the number of bits\
        to shift the first value. The RSHIFT function inserts zero bits on the left as\
        the bits shift right.",
        result: "returns a value of the same type as its first\
        parameter"
    },
    {
        name: "SEED",
        prototype: "function SEED(expression)",
        description: "The SEED function has a single integer parameter that sets the random\
        number generator seed for the RANDOM function. The function returns an\
        integer that represents the previous seed value.",
        arguments: "The expression parameter is an integer.",
        result: "integer"
    },
    {
        name: "SET_INTERLOCKED",
        prototype: "function SET_INTERLOCKED( b )",
        description: "The SET_INTERLOCKED function assigns the value TRUE to the parameter\
        and returns its original Boolean value.",
        arguments: "The parameter b must be a variable of type BOOLEAN.",
        result: "returns its original Boolean value."
    },
    {
        name: "SIN",
        prototype: "function SIN( x )",
        description: "The SIN function returns a real value that represents the sine of the specified\
        parameter.",
        arguments: "The parameter x can be an integer or REAL type, and is expressed in radians.",
        result: "returns a real value"
    },
    {
        name: "SIZE",
        prototype: "function SIZE( x[[,t1,...,tn]] )",
        description: "The SIZE function returns an integer value that indicates the possible or\
        actual number of bytes that are allocated for a specified data type or variable.",
        arguments: "The parameter x can be a type identifier or variable. In addition, you can supply additional parameters t1 through tn that\
        correspond to the case labels of the record. The function returns an integer\
        value that indicates the number of bytes that would be allocated by the NEW\
        procedure for a dynamic variable of the specified variant.",
        result: "returns an integer value"
    },
    {
        name: "SNGL",
        prototype: "function SNGL( x )",
        description: "The SNGL function converts the parameter and returns its real equivalent.",
        arguments: "The parameter x must be an arithmetic type.",
        result: "returns its real equivalent"
    },
    {
        name: "SQR",
        prototype: "function SQR( x )",
        description: "The SQR function returns a value (of the same type of the parameter) that\
        represents the square of the specified parameter.",
        arguments: "The parameter x can be any arithmetic type.",
        result: "returns a value (of the same type of the parameter)"
    },
    {
        name: "SQRT",
        prototype: "function SQRT( x )",
        description: "The SQRT function returns a real value that represents the square root of the\
        specified parameter.",
        arguments: "The parameter x can be an INTEGER, UNSIGNED,or REAL type. If the\
        value of x is less than zero, an error occurs.",
        result: "returns a real value"
    },
    {
        name: "STATUSV",
        prototype: "function STATUSV",
        description: "The STATUSV function returns an integer value that specifies the status of the\
        last READV or WRITEV procedure completed.",
        arguments: "",
        result: "returns an integer value"
    },
    {
        name: "SUBSTR",
        prototype: "function SUBSTR( str, start, length )",
        description: "The SUBSTR function returns a substring (from a string specified as a\
            parameter) that is of the specified starting point and length. The return value\
            is compatible with all other string types.",
        arguments: "The parameter str is a character-string value; the parameter start is an integer\
        value indicating the starting position of the substring. The parameter length is\
        an integer value that indicates the length of the substring.",
        result: "The return value\
        is compatible with all other string types"
    },
    {
        name: "SUCC",
        prototype: "function SUCC( x )",
        description: "The SUCC function returns the value that succeeds the parameter according to\
        the parameter’s data type.",
        arguments: "The parameter x can be of any ordinal type; however, there must be a successor\
        value for x in the type.",
        result: "returns the value that succeeds the parameter according to\
        the parameter’s data type"
    },
    {
        name: "SYSCLOCK",
        prototype: "function SYSCLOCK",
        description: "The SYSCLOCK function returns an integer value for the number of\
        milliseconds of system time used by the current process. The result is the\
        same as that returned by the CLOCK function.",
        arguments: "",
        result: "returns an integer value"
    },
    {
        name: "TRUNC",
        prototype: "function TRUNC( x )",
        description: "The TRUNC function converts the value of the parameter by truncating the\
        fractional part of the value and returns its integer equivalent.",
        arguments: "The parameter x must be of type REAL, SINGLE, DOUBLE, or\
        QUADRUPLE.",
        result: "returns its integer equivalent"
    },
    {
        name: "TRUNC64",
        prototype: "function TRUNC64( x )",
        description: "The TRUNC64 function converts the value of the parameter by truncating the\
        fractional part of the value and returns its INTEGER64 equivalent.",
        arguments: "The parameter x must be of type REAL, SINGLE, DOUBLE, or QUADRUPLE.",
        result: "returns its INTEGER64 equivalent."
    },
    {
        name: "UAND",
        prototype: "function UAND( u1, u2 )",
        description: "The UAND function returns an unsigned value that represents a binary logical\
        AND operation on each corresponding pair of bits of the specified parameters.",
        arguments: "The parameters u1 and u2 must be of type UNSIGNED",
        result: "returns an unsigned value"
    },
    {
        name: "UDEC",
        prototype: "function UDEC( x[[, length[[, digits]] ]] )",
        description: "The UDEC function returns a character-string value that is the unsigned\
        decimal equivalent of the specified parameter. The return value is compatible\
        with all other string types.",
        arguments: "The parameter x is the expression to be converted. The UDEC function\
        can take a parameter of any type except VARYING of CHAR, conformant\
        parameters, or schema types. Two optional integer parameters specify the length of the resulting string\
        and the minimum number of significant digits to be returned.",
        result: "return value is compatible\
        with all other string types"
    },
    {
        name: "UINT",
        prototype: "function UINT(x)",
        description: "The UINT function converts the value of the parameter and returns its\
        unsigned equivalent.",
        arguments: "The parameter x must be of an ordinal type.",
        result: "returns its    unsigned equivalent."
    },
    {
        name: "UINT64",
        prototype: "function UINT64(x)",
        description: "The UINT64 function converts the value of the parameter and returns its\
        UNSIGNED64 equivalent.",
        arguments: "The parameter x must be of an ordinal type.",
        result: "returns its\
        UNSIGNED64 equivalent"
    },
    {
        name: "UNDEFINED",
        prototype: "function UNDEFINED( x )",
        description: "The UNDEFINED function returns a Boolean value that specifies whether the\
        parameter contains an undefined (invalid) operand.",
        arguments: "The parameter x must be a variable of type REAL, SINGLE, DOUBLE, or\
        QUADRUPLE.",
        result: "returns a Boolean value"
    },
    {
        name: "UNOT",
        prototype: "function UNOT( u )",
        description: "The UNOT function returns an unsigned value that represents a binary logical\
        NOT operation on each bit of the specified parameter.",
        arguments: "The u parameter must be an unsigned expression.",
        result: "returns an unsigned value"
    },
    {
        name: "UNPACK",
        prototype: "function UNPACK( z, a, i )",
        description: "The UNPACK procedure copies components of a packed array to an unpacked\
        array variable.",
        arguments: "The parameter z is a packed array. The parameter a is an unpacked array\
        variable. The parameter i is the starting value of the index of a.",
        result: ""
    },
    {
        name: "UOR",
        prototype: "function UOR( u1, u2 )",
        description: "The UOR function returns an unsigned value of a binary logical OR operation\
        on the corresponding pair of bits of two specified parameters.",
        arguments: "The u1 and u2 parameters must be unsigned.",
        result: "returns an unsigned value"
    },
    {
        name: "UPPER",
        prototype: "function UPPER( x [[, n]] )",
        description: "The UPPER function returns the upper bound for ordinal types, SET base\
        types, and array indexes.",
        arguments: "The parameter x is a type identifier or variable of an ordinal, SET, or ARRAY\
        type. The parameter n is an integer constant that denotes a dimension of x, if\
        x is an array.",
        result: "returns the upper bound"
    },
    {
        name: "UROUND",
        prototype: "function UROUND( x )",
        description: "The UROUND function converts the value of the parameter by rounding the\
        fractional part of the value and returns its unsigned equivalent.",
        arguments: "The parameter x must be of type REAL, SINGLE, DOUBLE, or QUADRUPLE.",
        result: "returns its unsigned equivalent"
    },
    {
        name: "UROUND64",
        prototype: "function UROUND64( x )",
        description: "The UROUND64 function converts the value of the parameter by rounding the\
        fractional part of the value and returns its UNSIGNED64 equivalent.",
        arguments: "The parameter x must be of type REAL, SINGLE, DOUBLE, or QUADRUPLE.",
        result: "returns its UNSIGNED64 equivalent"
    },
    {
        name: "UTRUNC",
        prototype: "function UTRUNC( x )",
        description: "The UTRUNC function converts the value of the parameter by truncating the\
        fractional part of the value and returns its unsigned equivalent.",
        arguments: "The parameter x must be of type REAL, SINGLE, DOUBLE, or QUADRUPLE.",
        result: "returns its unsigned equivalent"
    },
    {
        name: "UTRUNC64",
        prototype: "function UTRUNC64( x )",
        description: "The UTRUNC64 function converts the value of the parameter by truncating\
        the fractional part of the value and returns its UNSIGNED64 equivalent.",
        arguments: "The parameter x must be of type REAL, SINGLE, DOUBLE, or QUADRUPLE.",
        result: "returns its UNSIGNED64 equivalent"
    },
    {
        name: "UXOR",
        prototype: "function UXOR( u1, u2 )",
        description: "The UXOR function returns an unsigned value of a binary logical exclusive-OR\
        operation on the corresponding pair of bits of two specified parameters.",
        arguments: "The u1 and u2 parameters must be unsigned.",
        result: "returns an unsigned value"
    },
    {
        name: "WALLCLOCK",
        prototype: "function WALLCLOCK",
        description: "The WALLCLOCK function returns an integer value representing the number\
        of seconds since the boot time for the system.",
        arguments: "",
        result: "returns an integer value"
    },
    {
        name: "WRITEV",
        prototype: "procedure WRITEV( str, parameter-list [[, ERROR := error-recovery]] )",
        description: "The WRITEV procedure writes characters to a character-string variable of type\
        VARYING OF CHAR or discriminated STRING, by converting the values of\
        the parameters in the procedure call to textual representations. The behavior\
        of WRITEV is similar to that of the WRITELN function; the character-string\
        parameter is similar to a one-line file.",
        arguments: "The str parameter is the string to be written to.\
        The parameter-list parameter is the variables to be assigned to str. The error-recovery parameter is the action to be taken if an error occurs during\
        execution of the routine.",
        result: ""
    },
    {
        name: "XOR",
        prototype: "function XOR( p1, p2 )",
        description: "The XOR function returns a value (of the same type as the parameters) of a\
        binary logical exclusive-OR operation on two specified parameters.",
        arguments: "The p1 and p2 parameters must be of the same type and must be of either the\
        BOOLEAN or SET types.",
        result: "returns a value (of the same type as the parameters)"
    },
    {
        name: "ZERO",
        prototype: "function ZERO",
        description: "The ZERO function returns data, whose type depends on the context of the\
        function call, that sets any variable (except a file variable) to its binary zero.",
        arguments: "",
        result: "returns data"
    }
];