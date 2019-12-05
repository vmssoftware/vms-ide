// Generated from c:\Users\akulikovskiy\ts_projects\vms_ide\vms-ide\src\vms_pascal\parser\pascal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, STAR=3, POWER=4, SLASH=5, ASSIGN=6, COMMA=7, SEMI=8, 
		COLON=9, EQUAL=10, NOT_EQUAL=11, LT_=12, LE_=13, GE_=14, GT_=15, LPAREN=16, 
		RPAREN=17, LBRACK=18, LBRACK2=19, RBRACK=20, RBRACK2=21, POINTER_=22, 
		ATP=23, DOT=24, DOTDOT=25, LCURLY=26, RCURLY=27, DOWN_LINE=28, P_IMMED=29, 
		P_REF=30, P_DESCR=31, P_STDESCR=32, P_INCLUDE=33, P_DICTIONARY=34, P_TITLE=35, 
		P_SUBTITLE=36, P_IF=37, P_THEN=38, P_ELIF=39, P_ELSE=40, P_ENDIF=41, P_DEFINED=42, 
		P_ERROR=43, P_WARN=44, P_INFO=45, P_MESSAGE=46, P_ARCH_NAME=47, P_SYSTEM_NAME=48, 
		P_SYSTEM_VERSION=49, P_DATE=50, P_TIME=51, P_COMPILER_VERSION=52, P_LINE=53, 
		P_FILE=54, P_ROUTINE=55, P_MODULE=56, P_IDENT=57, ALIGN=58, ALIGNED=59, 
		UNALIGNED=60, AT=61, AUTOMATIC=62, COMMON=63, STATIC=64, PSECT=65, ASYNCHRONOUS=66, 
		CHECK=67, FLOAT=68, ENUMERATION_SIZE=69, PEN_CHECKING_STYLE=70, HiDDEN=71, 
		IDENT=72, INITIALIZE=73, KEY=74, LIST=75, OPTIMIZE=76, NOOPTIMIZE=77, 
		CLASS_A=78, CLASS_NCA=79, CLASS_S=80, IMMEDIATE=81, REFERENCE=82, POS=83, 
		READONLY=84, BIT=85, BYTE=86, WORD=87, LONG=88, QUAD=89, OCTA=90, TRUNCATE=91, 
		UNBOUND=92, UNSAFE=93, LOCAL=94, GLOBAL=95, EXTERNAL=96, EXTERN=97, FORTRAN=98, 
		FORWARD=99, WEAK_GLOBAL=100, WEAK_EXTERNAL=101, VOLATILE=102, WRITEONLY=103, 
		AND=104, ARRAY=105, BEGIN=106, CASE=107, CONST=108, DIV=109, DO=110, DOWNTO=111, 
		ELSE=112, END=113, FILE=114, FOR=115, FUNCTION=116, GOTO=117, IF=118, 
		IN=119, LABEL=120, MOD=121, NIL=122, NOT=123, OF=124, OR=125, PACKED=126, 
		PROCEDURE=127, PROGRAM=128, RECORD=129, REPEAT=130, SET=131, THEN=132, 
		TO=133, TYPE=134, UNTIL=135, VAR=136, WHILE=137, WITH=138, INHERIT=139, 
		ENVIRONMENT=140, AND_THEN=141, BREAK=142, CONTINUE=143, MODULE=144, OR_ELSE=145, 
		OTHERWISE=146, REM=147, RETURN=148, VALUE=149, VARYING=150, CHAR=151, 
		CHR=152, FALSE=153, STRING=154, TEXT=155, TRUE=156, ZERO=157, WHITESPACE_=158, 
		WS=159, COMMENT_1=160, COMMENT_2=161, IDENTIFIER=162, STRING_LITERAL=163, 
		NUM_INT=164, NUM_REAL=165, BASE_NUMBER=166, BIN_NUMBER=167, HEX_NUMBER=168, 
		OCT_NUMBER=169;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_inheritAttr = 2, RULE_inherit = 3, 
		RULE_invironmentAttr = 4, RULE_identifier = 5, RULE_attributePart = 6, 
		RULE_attributeType = 7, RULE_attributeVar = 8, RULE_attributeDef = 9, 
		RULE_preReservedWords = 10, RULE_attribute = 11, RULE_directives = 12, 
		RULE_blockDeclarations = 13, RULE_block = 14, RULE_blockIn = 15, RULE_labelDeclarationPart = 16, 
		RULE_label = 17, RULE_constantDefinitionPart = 18, RULE_constantDefinition = 19, 
		RULE_constantName = 20, RULE_constantChr = 21, RULE_constant = 22, RULE_unsignedNumber = 23, 
		RULE_unsignedInteger = 24, RULE_unsignedReal = 25, RULE_sign = 26, RULE_bool = 27, 
		RULE_string = 28, RULE_valueDefinitionPart = 29, RULE_variableName = 30, 
		RULE_typeDefinitionPart = 31, RULE_typeDefinition = 32, RULE_functionType = 33, 
		RULE_procedureType = 34, RULE_type = 35, RULE_simpleType = 36, RULE_enumType = 37, 
		RULE_subrangeType = 38, RULE_typeIdentifier = 39, RULE_structuredType = 40, 
		RULE_unpackedStructuredType = 41, RULE_stringtype = 42, RULE_varyingType = 43, 
		RULE_arrayType = 44, RULE_typeList = 45, RULE_indexType = 46, RULE_componentType = 47, 
		RULE_recordType = 48, RULE_fieldList = 49, RULE_fixedPart = 50, RULE_recordSection = 51, 
		RULE_variantPart = 52, RULE_tag = 53, RULE_variant = 54, RULE_setType = 55, 
		RULE_baseType = 56, RULE_fileType = 57, RULE_textType = 58, RULE_pointerType = 59, 
		RULE_schemaType = 60, RULE_schemaList = 61, RULE_schemaName = 62, RULE_prototypeType = 63, 
		RULE_prototypeList = 64, RULE_constructorValue = 65, RULE_constructorArray = 66, 
		RULE_typeName = 67, RULE_componentValue = 68, RULE_constructorRecord = 69, 
		RULE_initializerList = 70, RULE_initializerItem = 71, RULE_tagValue = 72, 
		RULE_constructorSet = 73, RULE_constructorNonStdArray = 74, RULE_componentValueN = 75, 
		RULE_constructorNonStdRecord = 76, RULE_variableDeclarationPart = 77, 
		RULE_variableDeclaration = 78, RULE_variablePreDeclaration = 79, RULE_variablePreDeclarationValue = 80, 
		RULE_variablePreDeclarationAssign = 81, RULE_toBeginEndDoDeclarationPart = 82, 
		RULE_procedureAndFunctionDeclarationPart = 83, RULE_procedureOrFunctionDeclaration = 84, 
		RULE_procedureDeclaration = 85, RULE_formalParameterList = 86, RULE_formalParameterSection = 87, 
		RULE_parameterGroup = 88, RULE_assignExpression = 89, RULE_identifierList = 90, 
		RULE_constList = 91, RULE_functionDeclaration = 92, RULE_resultType = 93, 
		RULE_statement = 94, RULE_unlabelledStatement = 95, RULE_simpleStatement = 96, 
		RULE_assignmentStatement = 97, RULE_variable = 98, RULE_expression = 99, 
		RULE_relationaloperator = 100, RULE_simpleExpression = 101, RULE_additiveoperator = 102, 
		RULE_term = 103, RULE_multiplicativeoperator = 104, RULE_signedFactor = 105, 
		RULE_factor = 106, RULE_unsignedConstant = 107, RULE_functionDesignator = 108, 
		RULE_parameterList = 109, RULE_attibuteFuncParam = 110, RULE_set = 111, 
		RULE_elementList = 112, RULE_element = 113, RULE_procedureStatement = 114, 
		RULE_actualParameter = 115, RULE_parameterwidth = 116, RULE_gotoStatement = 117, 
		RULE_breakStatement = 118, RULE_continueStatement = 119, RULE_returnStatement = 120, 
		RULE_stringExpression = 121, RULE_emptyStatement = 122, RULE_structuredStatement = 123, 
		RULE_compoundStatement = 124, RULE_openCompoundStatement = 125, RULE_statements = 126, 
		RULE_conditionalStatement = 127, RULE_ifStatement = 128, RULE_caseStatement = 129, 
		RULE_caseListElement = 130, RULE_repetetiveStatement = 131, RULE_whileStatement = 132, 
		RULE_repeatStatement = 133, RULE_forStatement = 134, RULE_forList = 135, 
		RULE_initialValue = 136, RULE_finalValue = 137, RULE_withStatement = 138, 
		RULE_recordVariableList = 139, RULE_includeDirective = 140, RULE_dictionaryDirective = 141, 
		RULE_titleDirective = 142, RULE_pDefinedDirective = 143, RULE_messageDirective = 144, 
		RULE_infoFuncDirective = 145, RULE_pIfDirective = 146, RULE_pIfToken = 147;
	public static final String[] ruleNames = {
		"program", "programHeading", "inheritAttr", "inherit", "invironmentAttr", 
		"identifier", "attributePart", "attributeType", "attributeVar", "attributeDef", 
		"preReservedWords", "attribute", "directives", "blockDeclarations", "block", 
		"blockIn", "labelDeclarationPart", "label", "constantDefinitionPart", 
		"constantDefinition", "constantName", "constantChr", "constant", "unsignedNumber", 
		"unsignedInteger", "unsignedReal", "sign", "bool", "string", "valueDefinitionPart", 
		"variableName", "typeDefinitionPart", "typeDefinition", "functionType", 
		"procedureType", "type", "simpleType", "enumType", "subrangeType", "typeIdentifier", 
		"structuredType", "unpackedStructuredType", "stringtype", "varyingType", 
		"arrayType", "typeList", "indexType", "componentType", "recordType", "fieldList", 
		"fixedPart", "recordSection", "variantPart", "tag", "variant", "setType", 
		"baseType", "fileType", "textType", "pointerType", "schemaType", "schemaList", 
		"schemaName", "prototypeType", "prototypeList", "constructorValue", "constructorArray", 
		"typeName", "componentValue", "constructorRecord", "initializerList", 
		"initializerItem", "tagValue", "constructorSet", "constructorNonStdArray", 
		"componentValueN", "constructorNonStdRecord", "variableDeclarationPart", 
		"variableDeclaration", "variablePreDeclaration", "variablePreDeclarationValue", 
		"variablePreDeclarationAssign", "toBeginEndDoDeclarationPart", "procedureAndFunctionDeclarationPart", 
		"procedureOrFunctionDeclaration", "procedureDeclaration", "formalParameterList", 
		"formalParameterSection", "parameterGroup", "assignExpression", "identifierList", 
		"constList", "functionDeclaration", "resultType", "statement", "unlabelledStatement", 
		"simpleStatement", "assignmentStatement", "variable", "expression", "relationaloperator", 
		"simpleExpression", "additiveoperator", "term", "multiplicativeoperator", 
		"signedFactor", "factor", "unsignedConstant", "functionDesignator", "parameterList", 
		"attibuteFuncParam", "set", "elementList", "element", "procedureStatement", 
		"actualParameter", "parameterwidth", "gotoStatement", "breakStatement", 
		"continueStatement", "returnStatement", "stringExpression", "emptyStatement", 
		"structuredStatement", "compoundStatement", "openCompoundStatement", "statements", 
		"conditionalStatement", "ifStatement", "caseStatement", "caseListElement", 
		"repetetiveStatement", "whileStatement", "repeatStatement", "forStatement", 
		"forList", "initialValue", "finalValue", "withStatement", "recordVariableList", 
		"includeDirective", "dictionaryDirective", "titleDirective", "pDefinedDirective", 
		"messageDirective", "infoFuncDirective", "pIfDirective", "pIfToken"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'**'", "'/'", "':='", "','", "';'", "':'", 
		"'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", "'(.'", 
		"']'", "'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "STAR", "POWER", "SLASH", "ASSIGN", "COMMA", "SEMI", 
		"COLON", "EQUAL", "NOT_EQUAL", "LT_", "LE_", "GE_", "GT_", "LPAREN", "RPAREN", 
		"LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER_", "ATP", "DOT", "DOTDOT", 
		"LCURLY", "RCURLY", "DOWN_LINE", "P_IMMED", "P_REF", "P_DESCR", "P_STDESCR", 
		"P_INCLUDE", "P_DICTIONARY", "P_TITLE", "P_SUBTITLE", "P_IF", "P_THEN", 
		"P_ELIF", "P_ELSE", "P_ENDIF", "P_DEFINED", "P_ERROR", "P_WARN", "P_INFO", 
		"P_MESSAGE", "P_ARCH_NAME", "P_SYSTEM_NAME", "P_SYSTEM_VERSION", "P_DATE", 
		"P_TIME", "P_COMPILER_VERSION", "P_LINE", "P_FILE", "P_ROUTINE", "P_MODULE", 
		"P_IDENT", "ALIGN", "ALIGNED", "UNALIGNED", "AT", "AUTOMATIC", "COMMON", 
		"STATIC", "PSECT", "ASYNCHRONOUS", "CHECK", "FLOAT", "ENUMERATION_SIZE", 
		"PEN_CHECKING_STYLE", "HiDDEN", "IDENT", "INITIALIZE", "KEY", "LIST", 
		"OPTIMIZE", "NOOPTIMIZE", "CLASS_A", "CLASS_NCA", "CLASS_S", "IMMEDIATE", 
		"REFERENCE", "POS", "READONLY", "BIT", "BYTE", "WORD", "LONG", "QUAD", 
		"OCTA", "TRUNCATE", "UNBOUND", "UNSAFE", "LOCAL", "GLOBAL", "EXTERNAL", 
		"EXTERN", "FORTRAN", "FORWARD", "WEAK_GLOBAL", "WEAK_EXTERNAL", "VOLATILE", 
		"WRITEONLY", "AND", "ARRAY", "BEGIN", "CASE", "CONST", "DIV", "DO", "DOWNTO", 
		"ELSE", "END", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", "LABEL", 
		"MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", "PROGRAM", "RECORD", 
		"REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", "WITH", 
		"INHERIT", "ENVIRONMENT", "AND_THEN", "BREAK", "CONTINUE", "MODULE", "OR_ELSE", 
		"OTHERWISE", "REM", "RETURN", "VALUE", "VARYING", "CHAR", "CHR", "FALSE", 
		"STRING", "TEXT", "TRUE", "ZERO", "WHITESPACE_", "WS", "COMMENT_1", "COMMENT_2", 
		"IDENTIFIER", "STRING_LITERAL", "NUM_INT", "NUM_REAL", "BASE_NUMBER", 
		"BIN_NUMBER", "HEX_NUMBER", "OCT_NUMBER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(pascalParser.DOT, 0); }
		public List<DirectivesContext> directives() {
			return getRuleContexts(DirectivesContext.class);
		}
		public DirectivesContext directives(int i) {
			return getRuleContext(DirectivesContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT))) != 0)) {
				{
				{
				setState(296);
				directives();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			programHeading();
			setState(303);
			block();
			setState(304);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramHeadingContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(pascalParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public InheritAttrContext inheritAttr() {
			return getRuleContext(InheritAttrContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public TerminalNode MODULE() { return getToken(pascalParser.MODULE, 0); }
		public InvironmentAttrContext invironmentAttr() {
			return getRuleContext(InvironmentAttrContext.class,0);
		}
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeading);
		int _la;
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(306);
					inheritAttr();
					}
				}

				setState(309);
				match(PROGRAM);
				setState(310);
				identifier();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(311);
					match(LPAREN);
					setState(312);
					identifierList();
					setState(313);
					match(RPAREN);
					}
				}

				setState(317);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(319);
					invironmentAttr();
					}
				}

				setState(322);
				match(MODULE);
				setState(323);
				identifier();
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(324);
					match(LPAREN);
					setState(325);
					identifierList();
					setState(326);
					match(RPAREN);
					}
				}

				setState(330);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritAttrContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public InheritContext inherit() {
			return getRuleContext(InheritContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public InheritAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritAttr; }
	}

	public final InheritAttrContext inheritAttr() throws RecognitionException {
		InheritAttrContext _localctx = new InheritAttrContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inheritAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(LBRACK);
			setState(335);
			inherit();
			setState(336);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritContext extends ParserRuleContext {
		public TerminalNode INHERIT() { return getToken(pascalParser.INHERIT, 0); }
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public InheritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherit; }
	}

	public final InheritContext inherit() throws RecognitionException {
		InheritContext _localctx = new InheritContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inherit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(INHERIT);
			setState(339);
			match(LPAREN);
			setState(340);
			string();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(341);
				match(COMMA);
				setState(342);
				string();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvironmentAttrContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public TerminalNode ENVIRONMENT() { return getToken(pascalParser.ENVIRONMENT, 0); }
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(pascalParser.COMMA, 0); }
		public InheritContext inherit() {
			return getRuleContext(InheritContext.class,0);
		}
		public InvironmentAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invironmentAttr; }
	}

	public final InvironmentAttrContext invironmentAttr() throws RecognitionException {
		InvironmentAttrContext _localctx = new InvironmentAttrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_invironmentAttr);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(LBRACK);
				setState(351);
				match(ENVIRONMENT);
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(352);
					match(LPAREN);
					setState(353);
					string();
					setState(354);
					match(RPAREN);
					}
				}

				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(358);
					match(COMMA);
					setState(359);
					inherit();
					}
				}

				setState(362);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(LBRACK);
				setState(364);
				inherit();
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(365);
					match(COMMA);
					setState(366);
					match(ENVIRONMENT);
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LPAREN) {
						{
						setState(367);
						match(LPAREN);
						setState(368);
						string();
						setState(369);
						match(RPAREN);
						}
					}

					}
				}

				setState(375);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(pascalParser.IDENTIFIER, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public PreReservedWordsContext preReservedWords() {
			return getRuleContext(PreReservedWordsContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifier);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(IDENTIFIER);
				}
				break;
			case ALIGN:
			case ALIGNED:
			case UNALIGNED:
			case AT:
			case AUTOMATIC:
			case COMMON:
			case STATIC:
			case PSECT:
			case ASYNCHRONOUS:
			case CHECK:
			case FLOAT:
			case ENUMERATION_SIZE:
			case PEN_CHECKING_STYLE:
			case HiDDEN:
			case IDENT:
			case INITIALIZE:
			case KEY:
			case LIST:
			case OPTIMIZE:
			case NOOPTIMIZE:
			case CLASS_A:
			case CLASS_NCA:
			case CLASS_S:
			case IMMEDIATE:
			case REFERENCE:
			case POS:
			case READONLY:
			case BIT:
			case BYTE:
			case WORD:
			case LONG:
			case QUAD:
			case OCTA:
			case TRUNCATE:
			case UNBOUND:
			case UNSAFE:
			case LOCAL:
			case GLOBAL:
			case EXTERNAL:
			case WEAK_GLOBAL:
			case WEAK_EXTERNAL:
			case VOLATILE:
			case WRITEONLY:
			case VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				attribute();
				}
				break;
			case CONTINUE:
			case CHAR:
			case CHR:
			case FALSE:
			case STRING:
			case TEXT:
			case TRUE:
			case ZERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				preReservedWords();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributePartContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public List<AttributeDefContext> attributeDef() {
			return getRuleContexts(AttributeDefContext.class);
		}
		public AttributeDefContext attributeDef(int i) {
			return getRuleContext(AttributeDefContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public AttributePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributePart; }
	}

	public final AttributePartContext attributePart() throws RecognitionException {
		AttributePartContext _localctx = new AttributePartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attributePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(384);
				match(LBRACK);
				setState(385);
				attributeDef();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(386);
					match(COMMA);
					setState(387);
					attributeDef();
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(393);
				match(RBRACK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeTypeContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public List<AttributeDefContext> attributeDef() {
			return getRuleContexts(AttributeDefContext.class);
		}
		public AttributeDefContext attributeDef(int i) {
			return getRuleContext(AttributeDefContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public AttributeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeType; }
	}

	public final AttributeTypeContext attributeType() throws RecognitionException {
		AttributeTypeContext _localctx = new AttributeTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attributeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(397);
				match(LBRACK);
				setState(398);
				attributeDef();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(399);
					match(COMMA);
					setState(400);
					attributeDef();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				match(RBRACK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeVarContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public List<AttributeDefContext> attributeDef() {
			return getRuleContexts(AttributeDefContext.class);
		}
		public AttributeDefContext attributeDef(int i) {
			return getRuleContext(AttributeDefContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public AttributeVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeVar; }
	}

	public final AttributeVarContext attributeVar() throws RecognitionException {
		AttributeVarContext _localctx = new AttributeVarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attributeVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(410);
				match(LBRACK);
				setState(411);
				attributeDef();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(412);
					match(COMMA);
					setState(413);
					attributeDef();
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				match(RBRACK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeDefContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public AttributeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDef; }
	}

	public final AttributeDefContext attributeDef() throws RecognitionException {
		AttributeDefContext _localctx = new AttributeDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attributeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			attribute();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(424);
				match(LPAREN);
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(425);
					constant();
					}
					break;
				case 2:
					{
					setState(426);
					identifier();
					}
					break;
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(429);
					match(COMMA);
					setState(432);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(430);
						constant();
						}
						break;
					case 2:
						{
						setState(431);
						identifier();
						}
						break;
					}
					}
					}
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(439);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreReservedWordsContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public TerminalNode STRING() { return getToken(pascalParser.STRING, 0); }
		public TerminalNode CHR() { return getToken(pascalParser.CHR, 0); }
		public TerminalNode CHAR() { return getToken(pascalParser.CHAR, 0); }
		public TerminalNode TRUE() { return getToken(pascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pascalParser.FALSE, 0); }
		public TerminalNode CONTINUE() { return getToken(pascalParser.CONTINUE, 0); }
		public TerminalNode ZERO() { return getToken(pascalParser.ZERO, 0); }
		public PreReservedWordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preReservedWords; }
	}

	public final PreReservedWordsContext preReservedWords() throws RecognitionException {
		PreReservedWordsContext _localctx = new PreReservedWordsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_preReservedWords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ALIGN() { return getToken(pascalParser.ALIGN, 0); }
		public TerminalNode ALIGNED() { return getToken(pascalParser.ALIGNED, 0); }
		public TerminalNode UNALIGNED() { return getToken(pascalParser.UNALIGNED, 0); }
		public TerminalNode AT() { return getToken(pascalParser.AT, 0); }
		public TerminalNode AUTOMATIC() { return getToken(pascalParser.AUTOMATIC, 0); }
		public TerminalNode COMMON() { return getToken(pascalParser.COMMON, 0); }
		public TerminalNode STATIC() { return getToken(pascalParser.STATIC, 0); }
		public TerminalNode PSECT() { return getToken(pascalParser.PSECT, 0); }
		public TerminalNode ASYNCHRONOUS() { return getToken(pascalParser.ASYNCHRONOUS, 0); }
		public TerminalNode CHECK() { return getToken(pascalParser.CHECK, 0); }
		public TerminalNode FLOAT() { return getToken(pascalParser.FLOAT, 0); }
		public TerminalNode ENUMERATION_SIZE() { return getToken(pascalParser.ENUMERATION_SIZE, 0); }
		public TerminalNode PEN_CHECKING_STYLE() { return getToken(pascalParser.PEN_CHECKING_STYLE, 0); }
		public TerminalNode HiDDEN() { return getToken(pascalParser.HiDDEN, 0); }
		public TerminalNode IDENT() { return getToken(pascalParser.IDENT, 0); }
		public TerminalNode INITIALIZE() { return getToken(pascalParser.INITIALIZE, 0); }
		public TerminalNode KEY() { return getToken(pascalParser.KEY, 0); }
		public TerminalNode LIST() { return getToken(pascalParser.LIST, 0); }
		public TerminalNode OPTIMIZE() { return getToken(pascalParser.OPTIMIZE, 0); }
		public TerminalNode NOOPTIMIZE() { return getToken(pascalParser.NOOPTIMIZE, 0); }
		public TerminalNode CLASS_A() { return getToken(pascalParser.CLASS_A, 0); }
		public TerminalNode CLASS_NCA() { return getToken(pascalParser.CLASS_NCA, 0); }
		public TerminalNode CLASS_S() { return getToken(pascalParser.CLASS_S, 0); }
		public TerminalNode IMMEDIATE() { return getToken(pascalParser.IMMEDIATE, 0); }
		public TerminalNode REFERENCE() { return getToken(pascalParser.REFERENCE, 0); }
		public TerminalNode POS() { return getToken(pascalParser.POS, 0); }
		public TerminalNode READONLY() { return getToken(pascalParser.READONLY, 0); }
		public TerminalNode BIT() { return getToken(pascalParser.BIT, 0); }
		public TerminalNode BYTE() { return getToken(pascalParser.BYTE, 0); }
		public TerminalNode WORD() { return getToken(pascalParser.WORD, 0); }
		public TerminalNode LONG() { return getToken(pascalParser.LONG, 0); }
		public TerminalNode QUAD() { return getToken(pascalParser.QUAD, 0); }
		public TerminalNode OCTA() { return getToken(pascalParser.OCTA, 0); }
		public TerminalNode TRUNCATE() { return getToken(pascalParser.TRUNCATE, 0); }
		public TerminalNode UNBOUND() { return getToken(pascalParser.UNBOUND, 0); }
		public TerminalNode UNSAFE() { return getToken(pascalParser.UNSAFE, 0); }
		public TerminalNode VALUE() { return getToken(pascalParser.VALUE, 0); }
		public TerminalNode LOCAL() { return getToken(pascalParser.LOCAL, 0); }
		public TerminalNode GLOBAL() { return getToken(pascalParser.GLOBAL, 0); }
		public TerminalNode EXTERNAL() { return getToken(pascalParser.EXTERNAL, 0); }
		public TerminalNode WEAK_GLOBAL() { return getToken(pascalParser.WEAK_GLOBAL, 0); }
		public TerminalNode WEAK_EXTERNAL() { return getToken(pascalParser.WEAK_EXTERNAL, 0); }
		public TerminalNode VOLATILE() { return getToken(pascalParser.VOLATILE, 0); }
		public TerminalNode WRITEONLY() { return getToken(pascalParser.WRITEONLY, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectivesContext extends ParserRuleContext {
		public IncludeDirectiveContext includeDirective() {
			return getRuleContext(IncludeDirectiveContext.class,0);
		}
		public DictionaryDirectiveContext dictionaryDirective() {
			return getRuleContext(DictionaryDirectiveContext.class,0);
		}
		public TitleDirectiveContext titleDirective() {
			return getRuleContext(TitleDirectiveContext.class,0);
		}
		public PDefinedDirectiveContext pDefinedDirective() {
			return getRuleContext(PDefinedDirectiveContext.class,0);
		}
		public MessageDirectiveContext messageDirective() {
			return getRuleContext(MessageDirectiveContext.class,0);
		}
		public InfoFuncDirectiveContext infoFuncDirective() {
			return getRuleContext(InfoFuncDirectiveContext.class,0);
		}
		public PIfDirectiveContext pIfDirective() {
			return getRuleContext(PIfDirectiveContext.class,0);
		}
		public DirectivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directives; }
	}

	public final DirectivesContext directives() throws RecognitionException {
		DirectivesContext _localctx = new DirectivesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_directives);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_INCLUDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				includeDirective();
				}
				break;
			case P_DICTIONARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				dictionaryDirective();
				}
				break;
			case P_TITLE:
			case P_SUBTITLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				titleDirective();
				}
				break;
			case P_DEFINED:
				enterOuterAlt(_localctx, 4);
				{
				setState(450);
				pDefinedDirective();
				}
				break;
			case P_ERROR:
			case P_WARN:
			case P_INFO:
			case P_MESSAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				messageDirective();
				}
				break;
			case P_ARCH_NAME:
			case P_SYSTEM_NAME:
			case P_SYSTEM_VERSION:
			case P_DATE:
			case P_TIME:
			case P_COMPILER_VERSION:
			case P_LINE:
			case P_FILE:
			case P_ROUTINE:
			case P_MODULE:
			case P_IDENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(452);
				infoFuncDirective();
				}
				break;
			case P_IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(453);
				pIfDirective();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockDeclarationsContext extends ParserRuleContext {
		public List<DirectivesContext> directives() {
			return getRuleContexts(DirectivesContext.class);
		}
		public DirectivesContext directives(int i) {
			return getRuleContext(DirectivesContext.class,i);
		}
		public List<LabelDeclarationPartContext> labelDeclarationPart() {
			return getRuleContexts(LabelDeclarationPartContext.class);
		}
		public LabelDeclarationPartContext labelDeclarationPart(int i) {
			return getRuleContext(LabelDeclarationPartContext.class,i);
		}
		public List<ConstantDefinitionPartContext> constantDefinitionPart() {
			return getRuleContexts(ConstantDefinitionPartContext.class);
		}
		public ConstantDefinitionPartContext constantDefinitionPart(int i) {
			return getRuleContext(ConstantDefinitionPartContext.class,i);
		}
		public List<TypeDefinitionPartContext> typeDefinitionPart() {
			return getRuleContexts(TypeDefinitionPartContext.class);
		}
		public TypeDefinitionPartContext typeDefinitionPart(int i) {
			return getRuleContext(TypeDefinitionPartContext.class,i);
		}
		public List<ValueDefinitionPartContext> valueDefinitionPart() {
			return getRuleContexts(ValueDefinitionPartContext.class);
		}
		public ValueDefinitionPartContext valueDefinitionPart(int i) {
			return getRuleContext(ValueDefinitionPartContext.class,i);
		}
		public List<VariableDeclarationPartContext> variableDeclarationPart() {
			return getRuleContexts(VariableDeclarationPartContext.class);
		}
		public VariableDeclarationPartContext variableDeclarationPart(int i) {
			return getRuleContext(VariableDeclarationPartContext.class,i);
		}
		public List<ProcedureAndFunctionDeclarationPartContext> procedureAndFunctionDeclarationPart() {
			return getRuleContexts(ProcedureAndFunctionDeclarationPartContext.class);
		}
		public ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart(int i) {
			return getRuleContext(ProcedureAndFunctionDeclarationPartContext.class,i);
		}
		public BlockDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockDeclarations; }
	}

	public final BlockDeclarationsContext blockDeclarations() throws RecognitionException {
		BlockDeclarationsContext _localctx = new BlockDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_blockDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (CONST - 108)) | (1L << (FUNCTION - 108)) | (1L << (LABEL - 108)) | (1L << (PROCEDURE - 108)) | (1L << (TYPE - 108)) | (1L << (VAR - 108)) | (1L << (VALUE - 108)))) != 0)) {
				{
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(456);
					directives();
					}
					break;
				case 2:
					{
					setState(457);
					labelDeclarationPart();
					}
					break;
				case 3:
					{
					setState(458);
					constantDefinitionPart();
					}
					break;
				case 4:
					{
					setState(459);
					typeDefinitionPart();
					}
					break;
				case 5:
					{
					setState(460);
					valueDefinitionPart();
					}
					break;
				case 6:
					{
					setState(461);
					variableDeclarationPart();
					}
					break;
				case 7:
					{
					setState(462);
					procedureAndFunctionDeclarationPart();
					}
					break;
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockDeclarationsContext blockDeclarations() {
			return getRuleContext(BlockDeclarationsContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public ToBeginEndDoDeclarationPartContext toBeginEndDoDeclarationPart() {
			return getRuleContext(ToBeginEndDoDeclarationPartContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			blockDeclarations();
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(469);
				compoundStatement();
				}
				break;
			case END:
			case TO:
				{
				{
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(470);
					toBeginEndDoDeclarationPart();
					}
				}

				setState(473);
				match(END);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockInContext extends ParserRuleContext {
		public BlockDeclarationsContext blockDeclarations() {
			return getRuleContext(BlockDeclarationsContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public BlockInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockIn; }
	}

	public final BlockInContext blockIn() throws RecognitionException {
		BlockInContext _localctx = new BlockInContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blockIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			blockDeclarations();
			setState(477);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelDeclarationPartContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(pascalParser.LABEL, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public LabelDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDeclarationPart; }
	}

	public final LabelDeclarationPartContext labelDeclarationPart() throws RecognitionException {
		LabelDeclarationPartContext _localctx = new LabelDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_labelDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(LABEL);
			setState(480);
			label();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(481);
				match(COMMA);
				setState(482);
				label();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_label);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				unsignedInteger();
				}
				break;
			case ALIGN:
			case ALIGNED:
			case UNALIGNED:
			case AT:
			case AUTOMATIC:
			case COMMON:
			case STATIC:
			case PSECT:
			case ASYNCHRONOUS:
			case CHECK:
			case FLOAT:
			case ENUMERATION_SIZE:
			case PEN_CHECKING_STYLE:
			case HiDDEN:
			case IDENT:
			case INITIALIZE:
			case KEY:
			case LIST:
			case OPTIMIZE:
			case NOOPTIMIZE:
			case CLASS_A:
			case CLASS_NCA:
			case CLASS_S:
			case IMMEDIATE:
			case REFERENCE:
			case POS:
			case READONLY:
			case BIT:
			case BYTE:
			case WORD:
			case LONG:
			case QUAD:
			case OCTA:
			case TRUNCATE:
			case UNBOUND:
			case UNSAFE:
			case LOCAL:
			case GLOBAL:
			case EXTERNAL:
			case WEAK_GLOBAL:
			case WEAK_EXTERNAL:
			case VOLATILE:
			case WRITEONLY:
			case CONTINUE:
			case VALUE:
			case CHAR:
			case CHR:
			case FALSE:
			case STRING:
			case TEXT:
			case TRUE:
			case ZERO:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDefinitionPartContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(pascalParser.CONST, 0); }
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public ConstantDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionPart; }
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constantDefinitionPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(CONST);
			setState(498); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(495);
					constantDefinition();
					setState(496);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(500); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDefinitionContext extends ParserRuleContext {
		public ConstantNameContext constantName() {
			return getRuleContext(ConstantNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			constantName();
			setState(503);
			match(EQUAL);
			setState(504);
			attributePart();
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(505);
				constant();
				}
				break;
			case 2:
				{
				setState(506);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantName; }
	}

	public final ConstantNameContext constantName() throws RecognitionException {
		ConstantNameContext _localctx = new ConstantNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_constantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantChrContext extends ParserRuleContext {
		public TerminalNode CHR() { return getToken(pascalParser.CHR, 0); }
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantChrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantChr; }
	}

	public final ConstantChrContext constantChr() throws RecognitionException {
		ConstantChrContext _localctx = new ConstantChrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constantChr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(CHR);
			setState(512);
			match(LPAREN);
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				{
				setState(513);
				unsignedInteger();
				}
				break;
			case ALIGN:
			case ALIGNED:
			case UNALIGNED:
			case AT:
			case AUTOMATIC:
			case COMMON:
			case STATIC:
			case PSECT:
			case ASYNCHRONOUS:
			case CHECK:
			case FLOAT:
			case ENUMERATION_SIZE:
			case PEN_CHECKING_STYLE:
			case HiDDEN:
			case IDENT:
			case INITIALIZE:
			case KEY:
			case LIST:
			case OPTIMIZE:
			case NOOPTIMIZE:
			case CLASS_A:
			case CLASS_NCA:
			case CLASS_S:
			case IMMEDIATE:
			case REFERENCE:
			case POS:
			case READONLY:
			case BIT:
			case BYTE:
			case WORD:
			case LONG:
			case QUAD:
			case OCTA:
			case TRUNCATE:
			case UNBOUND:
			case UNSAFE:
			case LOCAL:
			case GLOBAL:
			case EXTERNAL:
			case WEAK_GLOBAL:
			case WEAK_EXTERNAL:
			case VOLATILE:
			case WRITEONLY:
			case CONTINUE:
			case VALUE:
			case CHAR:
			case CHR:
			case FALSE:
			case STRING:
			case TEXT:
			case TRUE:
			case ZERO:
			case IDENTIFIER:
				{
				setState(514);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(517);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constant);
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				sign();
				setState(521);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524);
				sign();
				setState(525);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(527);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(528);
				constantChr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(529);
				bool();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedRealContext unsignedReal() {
			return getRuleContext(UnsignedRealContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unsignedNumber);
		try {
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				unsignedReal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(pascalParser.NUM_INT, 0); }
		public TerminalNode BASE_NUMBER() { return getToken(pascalParser.BASE_NUMBER, 0); }
		public TerminalNode BIN_NUMBER() { return getToken(pascalParser.BIN_NUMBER, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(pascalParser.HEX_NUMBER, 0); }
		public TerminalNode OCT_NUMBER() { return getToken(pascalParser.OCT_NUMBER, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unsignedInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_la = _input.LA(1);
			if ( !(((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (NUM_INT - 164)) | (1L << (BASE_NUMBER - 164)) | (1L << (BIN_NUMBER - 164)) | (1L << (HEX_NUMBER - 164)) | (1L << (OCT_NUMBER - 164)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedRealContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(pascalParser.NUM_REAL, 0); }
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(NUM_REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(pascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pascalParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(pascalParser.STRING_LITERAL, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(pascalParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(pascalParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(pascalParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(pascalParser.RPAREN, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(pascalParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(pascalParser.NUM_INT, i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(STRING_LITERAL);
			setState(556);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(545);
					match(LPAREN);
					setState(548);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ALIGN:
					case ALIGNED:
					case UNALIGNED:
					case AT:
					case AUTOMATIC:
					case COMMON:
					case STATIC:
					case PSECT:
					case ASYNCHRONOUS:
					case CHECK:
					case FLOAT:
					case ENUMERATION_SIZE:
					case PEN_CHECKING_STYLE:
					case HiDDEN:
					case IDENT:
					case INITIALIZE:
					case KEY:
					case LIST:
					case OPTIMIZE:
					case NOOPTIMIZE:
					case CLASS_A:
					case CLASS_NCA:
					case CLASS_S:
					case IMMEDIATE:
					case REFERENCE:
					case POS:
					case READONLY:
					case BIT:
					case BYTE:
					case WORD:
					case LONG:
					case QUAD:
					case OCTA:
					case TRUNCATE:
					case UNBOUND:
					case UNSAFE:
					case LOCAL:
					case GLOBAL:
					case EXTERNAL:
					case WEAK_GLOBAL:
					case WEAK_EXTERNAL:
					case VOLATILE:
					case WRITEONLY:
					case CONTINUE:
					case VALUE:
					case CHAR:
					case CHR:
					case FALSE:
					case STRING:
					case TEXT:
					case TRUE:
					case ZERO:
					case IDENTIFIER:
						{
						setState(546);
						identifier();
						}
						break;
					case NUM_INT:
						{
						setState(547);
						match(NUM_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(550);
					match(RPAREN);
					setState(552);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(551);
						string();
						}
						break;
					}
					}
					} 
				}
				setState(558);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueDefinitionPartContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(pascalParser.VALUE, 0); }
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(pascalParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(pascalParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public ValueDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDefinitionPart; }
	}

	public final ValueDefinitionPartContext valueDefinitionPart() throws RecognitionException {
		ValueDefinitionPartContext _localctx = new ValueDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_valueDefinitionPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(VALUE);
			setState(560);
			variableName();
			setState(561);
			match(ASSIGN);
			setState(562);
			expression();
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					match(SEMI);
					setState(564);
					variableName();
					setState(565);
					match(ASSIGN);
					setState(566);
					expression();
					}
					} 
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(573);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionPartContext extends ParserRuleContext {
		public AttributeTypeContext attributeType() {
			return getRuleContext(AttributeTypeContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(pascalParser.TYPE, 0); }
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public TypeDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionPart; }
	}

	public final TypeDefinitionPartContext typeDefinitionPart() throws RecognitionException {
		TypeDefinitionPartContext _localctx = new TypeDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeDefinitionPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			attributeType();
			setState(578);
			match(TYPE);
			setState(582); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(579);
					typeDefinition();
					setState(580);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(584); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ProcedureTypeContext procedureType() {
			return getRuleContext(ProcedureTypeContext.class,0);
		}
		public VariablePreDeclarationValueContext variablePreDeclarationValue() {
			return getRuleContext(VariablePreDeclarationValueContext.class,0);
		}
		public SchemaTypeContext schemaType() {
			return getRuleContext(SchemaTypeContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeDefinition);
		int _la;
		try {
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				typeName();
				setState(587);
				match(EQUAL);
				setState(588);
				attributePart();
				setState(592);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case LPAREN:
				case LBRACK:
				case LBRACK2:
				case POINTER_:
				case ATP:
				case P_INCLUDE:
				case P_DICTIONARY:
				case P_TITLE:
				case P_SUBTITLE:
				case P_IF:
				case P_DEFINED:
				case P_ERROR:
				case P_WARN:
				case P_INFO:
				case P_MESSAGE:
				case P_ARCH_NAME:
				case P_SYSTEM_NAME:
				case P_SYSTEM_VERSION:
				case P_DATE:
				case P_TIME:
				case P_COMPILER_VERSION:
				case P_LINE:
				case P_FILE:
				case P_ROUTINE:
				case P_MODULE:
				case P_IDENT:
				case ALIGN:
				case ALIGNED:
				case UNALIGNED:
				case AT:
				case AUTOMATIC:
				case COMMON:
				case STATIC:
				case PSECT:
				case ASYNCHRONOUS:
				case CHECK:
				case FLOAT:
				case ENUMERATION_SIZE:
				case PEN_CHECKING_STYLE:
				case HiDDEN:
				case IDENT:
				case INITIALIZE:
				case KEY:
				case LIST:
				case OPTIMIZE:
				case NOOPTIMIZE:
				case CLASS_A:
				case CLASS_NCA:
				case CLASS_S:
				case IMMEDIATE:
				case REFERENCE:
				case POS:
				case READONLY:
				case BIT:
				case BYTE:
				case WORD:
				case LONG:
				case QUAD:
				case OCTA:
				case TRUNCATE:
				case UNBOUND:
				case UNSAFE:
				case LOCAL:
				case GLOBAL:
				case EXTERNAL:
				case WEAK_GLOBAL:
				case WEAK_EXTERNAL:
				case VOLATILE:
				case WRITEONLY:
				case ARRAY:
				case FILE:
				case NIL:
				case NOT:
				case PACKED:
				case RECORD:
				case SET:
				case CONTINUE:
				case VALUE:
				case VARYING:
				case CHAR:
				case CHR:
				case FALSE:
				case STRING:
				case TEXT:
				case TRUE:
				case ZERO:
				case IDENTIFIER:
				case STRING_LITERAL:
				case NUM_INT:
				case NUM_REAL:
				case BASE_NUMBER:
				case BIN_NUMBER:
				case HEX_NUMBER:
				case OCT_NUMBER:
					{
					setState(589);
					type();
					}
					break;
				case FUNCTION:
					{
					setState(590);
					functionType();
					}
					break;
				case PROCEDURE:
					{
					setState(591);
					procedureType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE) {
					{
					setState(594);
					variablePreDeclarationValue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				schemaType();
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE) {
					{
					setState(598);
					variablePreDeclarationValue();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(pascalParser.FUNCTION, 0); }
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(FUNCTION);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(604);
				formalParameterList();
				}
			}

			setState(607);
			match(COLON);
			setState(608);
			resultType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureTypeContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(pascalParser.PROCEDURE, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureType; }
	}

	public final ProcedureTypeContext procedureType() throws RecognitionException {
		ProcedureTypeContext _localctx = new ProcedureTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_procedureType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(PROCEDURE);
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(611);
				formalParameterList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public StructuredTypeContext structuredType() {
			return getRuleContext(StructuredTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_type);
		try {
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				structuredType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				pointerType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeContext extends ParserRuleContext {
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public SubrangeTypeContext subrangeType() {
			return getRuleContext(SubrangeTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public StringtypeContext stringtype() {
			return getRuleContext(StringtypeContext.class,0);
		}
		public PrototypeTypeContext prototypeType() {
			return getRuleContext(PrototypeTypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_simpleType);
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				enumType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(622);
				stringtype();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(623);
				prototypeType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_enumType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(LPAREN);
			setState(627);
			identifierList();
			setState(628);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubrangeTypeContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(pascalParser.DOTDOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public SubrangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrangeType; }
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subrangeType);
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				constant();
				setState(631);
				match(DOTDOT);
				setState(632);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				expression();
				setState(635);
				match(DOTDOT);
				setState(636);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				expression();
				setState(639);
				match(DOTDOT);
				setState(640);
				expression();
				setState(641);
				match(COLON);
				setState(642);
				typeIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredTypeContext extends ParserRuleContext {
		public TerminalNode PACKED() { return getToken(pascalParser.PACKED, 0); }
		public UnpackedStructuredTypeContext unpackedStructuredType() {
			return getRuleContext(UnpackedStructuredTypeContext.class,0);
		}
		public StructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredType; }
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_structuredType);
		try {
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKED:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				match(PACKED);
				setState(649);
				unpackedStructuredType();
				}
				break;
			case LBRACK:
			case ARRAY:
			case FILE:
			case RECORD:
			case SET:
			case VARYING:
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				unpackedStructuredType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnpackedStructuredTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public FileTypeContext fileType() {
			return getRuleContext(FileTypeContext.class,0);
		}
		public TextTypeContext textType() {
			return getRuleContext(TextTypeContext.class,0);
		}
		public VaryingTypeContext varyingType() {
			return getRuleContext(VaryingTypeContext.class,0);
		}
		public UnpackedStructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpackedStructuredType; }
	}

	public final UnpackedStructuredTypeContext unpackedStructuredType() throws RecognitionException {
		UnpackedStructuredTypeContext _localctx = new UnpackedStructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unpackedStructuredType);
		try {
			setState(659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(656);
				fileType();
				}
				break;
			case LBRACK:
			case TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(657);
				textType();
				}
				break;
			case VARYING:
				enterOuterAlt(_localctx, 6);
				{
				setState(658);
				varyingType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringtypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(pascalParser.STRING, 0); }
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringtype; }
	}

	public final StringtypeContext stringtype() throws RecognitionException {
		StringtypeContext _localctx = new StringtypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(STRING);
			setState(662);
			match(LPAREN);
			setState(665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALIGN:
			case ALIGNED:
			case UNALIGNED:
			case AT:
			case AUTOMATIC:
			case COMMON:
			case STATIC:
			case PSECT:
			case ASYNCHRONOUS:
			case CHECK:
			case FLOAT:
			case ENUMERATION_SIZE:
			case PEN_CHECKING_STYLE:
			case HiDDEN:
			case IDENT:
			case INITIALIZE:
			case KEY:
			case LIST:
			case OPTIMIZE:
			case NOOPTIMIZE:
			case CLASS_A:
			case CLASS_NCA:
			case CLASS_S:
			case IMMEDIATE:
			case REFERENCE:
			case POS:
			case READONLY:
			case BIT:
			case BYTE:
			case WORD:
			case LONG:
			case QUAD:
			case OCTA:
			case TRUNCATE:
			case UNBOUND:
			case UNSAFE:
			case LOCAL:
			case GLOBAL:
			case EXTERNAL:
			case WEAK_GLOBAL:
			case WEAK_EXTERNAL:
			case VOLATILE:
			case WRITEONLY:
			case CONTINUE:
			case VALUE:
			case CHAR:
			case CHR:
			case FALSE:
			case STRING:
			case TEXT:
			case TRUE:
			case ZERO:
			case IDENTIFIER:
				{
				setState(663);
				identifier();
				}
				break;
			case NUM_INT:
			case NUM_REAL:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				{
				setState(664);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(667);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VaryingTypeContext extends ParserRuleContext {
		public TerminalNode VARYING() { return getToken(pascalParser.VARYING, 0); }
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(pascalParser.CHAR, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VaryingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varyingType; }
	}

	public final VaryingTypeContext varyingType() throws RecognitionException {
		VaryingTypeContext _localctx = new VaryingTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_varyingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(VARYING);
			setState(670);
			match(LBRACK);
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(671);
				constant();
				}
				break;
			case 2:
				{
				setState(672);
				identifier();
				}
				break;
			case 3:
				{
				setState(673);
				expression();
				}
				break;
			}
			setState(676);
			match(RBRACK);
			setState(677);
			match(OF);
			setState(678);
			attributePart();
			setState(679);
			match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(pascalParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public TerminalNode LBRACK2() { return getToken(pascalParser.LBRACK2, 0); }
		public TerminalNode RBRACK2() { return getToken(pascalParser.RBRACK2, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_arrayType);
		try {
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(ARRAY);
				setState(682);
				match(LBRACK);
				setState(683);
				typeList();
				setState(684);
				match(RBRACK);
				setState(685);
				match(OF);
				setState(686);
				componentType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				match(ARRAY);
				setState(689);
				match(LBRACK2);
				setState(690);
				typeList();
				setState(691);
				match(RBRACK2);
				setState(692);
				match(OF);
				setState(693);
				componentType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<IndexTypeContext> indexType() {
			return getRuleContexts(IndexTypeContext.class);
		}
		public IndexTypeContext indexType(int i) {
			return getRuleContext(IndexTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			indexType();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(698);
				match(COMMA);
				setState(699);
				indexType();
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexTypeContext extends ParserRuleContext {
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			attributePart();
			setState(706);
			simpleType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentTypeContext extends ParserRuleContext {
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ComponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType; }
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			attributePart();
			setState(709);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordTypeContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(pascalParser.RECORD, 0); }
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(RECORD);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)) | (1L << (CASE - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)))) != 0)) {
				{
				setState(712);
				fieldList();
				}
			}

			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(715);
				match(SEMI);
				}
			}

			setState(718);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldListContext extends ParserRuleContext {
		public FixedPartContext fixedPart() {
			return getRuleContext(FixedPartContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public VariantPartContext variantPart() {
			return getRuleContext(VariantPartContext.class,0);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fieldList);
		try {
			setState(726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALIGN:
			case ALIGNED:
			case UNALIGNED:
			case AT:
			case AUTOMATIC:
			case COMMON:
			case STATIC:
			case PSECT:
			case ASYNCHRONOUS:
			case CHECK:
			case FLOAT:
			case ENUMERATION_SIZE:
			case PEN_CHECKING_STYLE:
			case HiDDEN:
			case IDENT:
			case INITIALIZE:
			case KEY:
			case LIST:
			case OPTIMIZE:
			case NOOPTIMIZE:
			case CLASS_A:
			case CLASS_NCA:
			case CLASS_S:
			case IMMEDIATE:
			case REFERENCE:
			case POS:
			case READONLY:
			case BIT:
			case BYTE:
			case WORD:
			case LONG:
			case QUAD:
			case OCTA:
			case TRUNCATE:
			case UNBOUND:
			case UNSAFE:
			case LOCAL:
			case GLOBAL:
			case EXTERNAL:
			case WEAK_GLOBAL:
			case WEAK_EXTERNAL:
			case VOLATILE:
			case WRITEONLY:
			case CONTINUE:
			case VALUE:
			case CHAR:
			case CHR:
			case FALSE:
			case STRING:
			case TEXT:
			case TRUE:
			case ZERO:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				fixedPart();
				setState(723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(721);
					match(SEMI);
					setState(722);
					variantPart();
					}
					break;
				}
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				variantPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixedPartContext extends ParserRuleContext {
		public List<RecordSectionContext> recordSection() {
			return getRuleContexts(RecordSectionContext.class);
		}
		public RecordSectionContext recordSection(int i) {
			return getRuleContext(RecordSectionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public FixedPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedPart; }
	}

	public final FixedPartContext fixedPart() throws RecognitionException {
		FixedPartContext _localctx = new FixedPartContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_fixedPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			recordSection();
			setState(733);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(729);
					match(SEMI);
					setState(730);
					recordSection();
					}
					} 
				}
				setState(735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(736);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordSectionContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public RecordSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordSection; }
	}

	public final RecordSectionContext recordSection() throws RecognitionException {
		RecordSectionContext _localctx = new RecordSectionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_recordSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			identifierList();
			setState(740);
			match(COLON);
			setState(741);
			attributePart();
			setState(742);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantPartContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(pascalParser.CASE, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public List<VariantContext> variant() {
			return getRuleContexts(VariantContext.class);
		}
		public VariantContext variant(int i) {
			return getRuleContext(VariantContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public TerminalNode OTHERWISE() { return getToken(pascalParser.OTHERWISE, 0); }
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public VariantPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantPart; }
	}

	public final VariantPartContext variantPart() throws RecognitionException {
		VariantPartContext _localctx = new VariantPartContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_variantPart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(CASE);
			setState(745);
			tag();
			setState(746);
			match(OF);
			setState(747);
			variant();
			setState(752);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(748);
					match(SEMI);
					setState(749);
					variant();
					}
					} 
				}
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(755);
					match(SEMI);
					}
				}

				setState(758);
				match(OTHERWISE);
				setState(759);
				match(LPAREN);
				setState(760);
				fieldList();
				setState(761);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagContext extends ParserRuleContext {
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tag);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(765);
					identifier();
					setState(766);
					match(COLON);
					}
					break;
				}
				setState(770);
				attributePart();
				setState(771);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				typeIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public VariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant; }
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			constList();
			setState(777);
			match(COLON);
			setState(778);
			match(LPAREN);
			setState(779);
			fieldList();
			setState(780);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTypeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(pascalParser.SET, 0); }
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(SET);
			setState(783);
			match(OF);
			setState(784);
			attributePart();
			setState(785);
			baseType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			simpleType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileTypeContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(pascalParser.FILE, 0); }
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FileTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileType; }
	}

	public final FileTypeContext fileType() throws RecognitionException {
		FileTypeContext _localctx = new FileTypeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_fileType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(FILE);
			setState(790);
			match(OF);
			setState(791);
			attributePart();
			setState(792);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextTypeContext extends ParserRuleContext {
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public TextTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textType; }
	}

	public final TextTypeContext textType() throws RecognitionException {
		TextTypeContext _localctx = new TextTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_textType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			attributePart();
			setState(795);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerTypeContext extends ParserRuleContext {
		public List<AttributePartContext> attributePart() {
			return getRuleContexts(AttributePartContext.class);
		}
		public AttributePartContext attributePart(int i) {
			return getRuleContext(AttributePartContext.class,i);
		}
		public TerminalNode POINTER_() { return getToken(pascalParser.POINTER_, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			attributePart();
			setState(798);
			match(POINTER_);
			setState(799);
			attributePart();
			setState(800);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaTypeContext extends ParserRuleContext {
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public List<SchemaListContext> schemaList() {
			return getRuleContexts(SchemaListContext.class);
		}
		public SchemaListContext schemaList(int i) {
			return getRuleContext(SchemaListContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public SchemaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaType; }
	}

	public final SchemaTypeContext schemaType() throws RecognitionException {
		SchemaTypeContext _localctx = new SchemaTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_schemaType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			schemaName();
			setState(803);
			match(LPAREN);
			setState(804);
			schemaList();
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(805);
				match(SEMI);
				setState(806);
				schemaList();
				}
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(812);
			match(RPAREN);
			setState(813);
			match(EQUAL);
			setState(814);
			attributePart();
			setState(815);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public SchemaListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaList; }
	}

	public final SchemaListContext schemaList() throws RecognitionException {
		SchemaListContext _localctx = new SchemaListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_schemaList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(817);
			identifier();
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(818);
				match(COMMA);
				setState(819);
				identifier();
				}
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(825);
			match(COLON);
			setState(826);
			attributePart();
			setState(827);
			type();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(pascalParser.STRING, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_schemaName);
		try {
			setState(831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrototypeTypeContext extends ParserRuleContext {
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public List<PrototypeListContext> prototypeList() {
			return getRuleContexts(PrototypeListContext.class);
		}
		public PrototypeListContext prototypeList(int i) {
			return getRuleContext(PrototypeListContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public PrototypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototypeType; }
	}

	public final PrototypeTypeContext prototypeType() throws RecognitionException {
		PrototypeTypeContext _localctx = new PrototypeTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_prototypeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			schemaName();
			setState(834);
			match(LPAREN);
			setState(835);
			prototypeList();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(836);
				match(SEMI);
				setState(837);
				prototypeList();
				}
				}
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(843);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrototypeListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public PrototypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prototypeList; }
	}

	public final PrototypeListContext prototypeList() throws RecognitionException {
		PrototypeListContext _localctx = new PrototypeListContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_prototypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			expression();
			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(846);
				match(COMMA);
				setState(847);
				expression();
				}
				}
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorValueContext extends ParserRuleContext {
		public ConstructorArrayContext constructorArray() {
			return getRuleContext(ConstructorArrayContext.class,0);
		}
		public ConstructorRecordContext constructorRecord() {
			return getRuleContext(ConstructorRecordContext.class,0);
		}
		public ConstructorSetContext constructorSet() {
			return getRuleContext(ConstructorSetContext.class,0);
		}
		public ConstructorNonStdArrayContext constructorNonStdArray() {
			return getRuleContext(ConstructorNonStdArrayContext.class,0);
		}
		public ConstructorNonStdRecordContext constructorNonStdRecord() {
			return getRuleContext(ConstructorNonStdRecordContext.class,0);
		}
		public ConstructorValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorValue; }
	}

	public final ConstructorValueContext constructorValue() throws RecognitionException {
		ConstructorValueContext _localctx = new ConstructorValueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_constructorValue);
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				constructorArray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				constructorRecord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(855);
				constructorSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(856);
				constructorNonStdArray();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(857);
				constructorNonStdRecord();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorArrayContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<InitializerListContext> initializerList() {
			return getRuleContexts(InitializerListContext.class);
		}
		public InitializerListContext initializerList(int i) {
			return getRuleContext(InitializerListContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(pascalParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(pascalParser.COLON, i);
		}
		public List<ComponentValueContext> componentValue() {
			return getRuleContexts(ComponentValueContext.class);
		}
		public ComponentValueContext componentValue(int i) {
			return getRuleContext(ComponentValueContext.class,i);
		}
		public TerminalNode OTHERWISE() { return getToken(pascalParser.OTHERWISE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public List<ConstructorArrayContext> constructorArray() {
			return getRuleContexts(ConstructorArrayContext.class);
		}
		public ConstructorArrayContext constructorArray(int i) {
			return getRuleContext(ConstructorArrayContext.class,i);
		}
		public ConstructorArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorArray; }
	}

	public final ConstructorArrayContext constructorArray() throws RecognitionException {
		ConstructorArrayContext _localctx = new ConstructorArrayContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_constructorArray);
		int _la;
		try {
			int _alt;
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)))) != 0)) {
					{
					setState(860);
					typeName();
					}
				}

				setState(863);
				match(LBRACK);
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)) | (1L << (STRING_LITERAL - 143)) | (1L << (NUM_INT - 143)) | (1L << (NUM_REAL - 143)) | (1L << (BASE_NUMBER - 143)) | (1L << (BIN_NUMBER - 143)) | (1L << (HEX_NUMBER - 143)) | (1L << (OCT_NUMBER - 143)))) != 0)) {
					{
					setState(864);
					initializerList();
					setState(865);
					match(COLON);
					setState(866);
					componentValue();
					setState(874);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(867);
							match(SEMI);
							setState(868);
							initializerList();
							setState(869);
							match(COLON);
							setState(870);
							componentValue();
							}
							} 
						}
						setState(876);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					}
					}
				}

				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(880);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(879);
						match(SEMI);
						}
					}

					setState(882);
					match(OTHERWISE);
					setState(883);
					componentValue();
					setState(885);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(884);
						match(SEMI);
						}
					}

					}
				}

				setState(889);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)))) != 0)) {
					{
					setState(890);
					typeName();
					}
				}

				setState(893);
				match(LBRACK);
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)) | (1L << (STRING_LITERAL - 143)) | (1L << (NUM_INT - 143)) | (1L << (NUM_REAL - 143)) | (1L << (BASE_NUMBER - 143)) | (1L << (BIN_NUMBER - 143)) | (1L << (HEX_NUMBER - 143)) | (1L << (OCT_NUMBER - 143)))) != 0)) {
					{
					setState(894);
					initializerList();
					setState(895);
					match(COLON);
					setState(896);
					constructorArray();
					setState(904);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(897);
							match(SEMI);
							setState(898);
							initializerList();
							setState(899);
							match(COLON);
							setState(900);
							constructorArray();
							}
							} 
						}
						setState(906);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
					}
					}
				}

				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(910);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(909);
						match(SEMI);
						}
					}

					setState(912);
					match(OTHERWISE);
					setState(913);
					constructorArray();
					setState(915);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(914);
						match(SEMI);
						}
					}

					}
				}

				setState(919);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComponentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentValue; }
	}

	public final ComponentValueContext componentValue() throws RecognitionException {
		ComponentValueContext _localctx = new ComponentValueContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_componentValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorRecordContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(pascalParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(pascalParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(pascalParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(pascalParser.RBRACK, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<InitializerListContext> initializerList() {
			return getRuleContexts(InitializerListContext.class);
		}
		public InitializerListContext initializerList(int i) {
			return getRuleContext(InitializerListContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(pascalParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(pascalParser.COLON, i);
		}
		public List<ComponentValueContext> componentValue() {
			return getRuleContexts(ComponentValueContext.class);
		}
		public ComponentValueContext componentValue(int i) {
			return getRuleContext(ComponentValueContext.class,i);
		}
		public TerminalNode CASE() { return getToken(pascalParser.CASE, 0); }
		public TagValueContext tagValue() {
			return getRuleContext(TagValueContext.class,0);
		}
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public TerminalNode OTHERWISE() { return getToken(pascalParser.OTHERWISE, 0); }
		public TerminalNode ZERO() { return getToken(pascalParser.ZERO, 0); }
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ConstructorRecordContext> constructorRecord() {
			return getRuleContexts(ConstructorRecordContext.class);
		}
		public ConstructorRecordContext constructorRecord(int i) {
			return getRuleContext(ConstructorRecordContext.class,i);
		}
		public ConstructorRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorRecord; }
	}

	public final ConstructorRecordContext constructorRecord() throws RecognitionException {
		ConstructorRecordContext _localctx = new ConstructorRecordContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_constructorRecord);
		int _la;
		try {
			int _alt;
			setState(1044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)))) != 0)) {
					{
					setState(926);
					typeName();
					}
				}

				setState(929);
				match(LBRACK);
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)) | (1L << (STRING_LITERAL - 143)) | (1L << (NUM_INT - 143)) | (1L << (NUM_REAL - 143)) | (1L << (BASE_NUMBER - 143)) | (1L << (BIN_NUMBER - 143)) | (1L << (HEX_NUMBER - 143)) | (1L << (OCT_NUMBER - 143)))) != 0)) {
					{
					setState(930);
					initializerList();
					setState(931);
					match(COLON);
					setState(932);
					componentValue();
					setState(940);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(933);
							match(SEMI);
							setState(934);
							initializerList();
							setState(935);
							match(COLON);
							setState(936);
							componentValue();
							}
							} 
						}
						setState(942);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
					}
					}
				}

				setState(972);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(945);
						match(SEMI);
						}
					}

					setState(948);
					match(CASE);
					setState(952);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(949);
						identifier();
						setState(950);
						match(COLON);
						}
						break;
					}
					setState(954);
					tagValue();
					setState(955);
					match(OF);
					setState(956);
					match(LBRACK);
					{
					setState(957);
					initializerList();
					setState(958);
					match(COLON);
					setState(959);
					componentValue();
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(960);
						match(SEMI);
						setState(961);
						initializerList();
						setState(962);
						match(COLON);
						setState(963);
						componentValue();
						}
						}
						setState(969);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(970);
					match(RBRACK);
					}
					break;
				}
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(975);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(974);
						match(SEMI);
						}
					}

					setState(977);
					match(OTHERWISE);
					setState(978);
					match(ZERO);
					setState(980);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(979);
						match(SEMI);
						}
					}

					}
				}

				setState(984);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)))) != 0)) {
					{
					setState(985);
					typeName();
					}
				}

				setState(988);
				match(LBRACK);
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)) | (1L << (STRING_LITERAL - 143)) | (1L << (NUM_INT - 143)) | (1L << (NUM_REAL - 143)) | (1L << (BASE_NUMBER - 143)) | (1L << (BIN_NUMBER - 143)) | (1L << (HEX_NUMBER - 143)) | (1L << (OCT_NUMBER - 143)))) != 0)) {
					{
					setState(989);
					initializerList();
					setState(990);
					match(COLON);
					setState(991);
					constructorRecord();
					setState(999);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(992);
							match(SEMI);
							setState(993);
							initializerList();
							setState(994);
							match(COLON);
							setState(995);
							constructorRecord();
							}
							} 
						}
						setState(1001);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
					}
					}
				}

				setState(1031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(1005);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1004);
						match(SEMI);
						}
					}

					setState(1007);
					match(CASE);
					setState(1011);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						setState(1008);
						identifier();
						setState(1009);
						match(COLON);
						}
						break;
					}
					setState(1013);
					tagValue();
					setState(1014);
					match(OF);
					setState(1015);
					match(LBRACK);
					{
					setState(1016);
					initializerList();
					setState(1017);
					match(COLON);
					setState(1018);
					constructorRecord();
					setState(1026);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1019);
						match(SEMI);
						setState(1020);
						initializerList();
						setState(1021);
						match(COLON);
						setState(1022);
						constructorRecord();
						}
						}
						setState(1028);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(1029);
					match(RBRACK);
					}
					break;
				}
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(1034);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1033);
						match(SEMI);
						}
					}

					setState(1036);
					match(OTHERWISE);
					setState(1037);
					match(ZERO);
					setState(1039);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1038);
						match(SEMI);
						}
					}

					}
				}

				setState(1043);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerItemContext> initializerItem() {
			return getRuleContexts(InitializerItemContext.class);
		}
		public InitializerItemContext initializerItem(int i) {
			return getRuleContext(InitializerItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_initializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			initializerItem();
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1047);
				match(COMMA);
				setState(1048);
				initializerItem();
				}
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(pascalParser.NUM_INT, 0); }
		public SubrangeTypeContext subrangeType() {
			return getRuleContext(SubrangeTypeContext.class,0);
		}
		public InitializerItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerItem; }
	}

	public final InitializerItemContext initializerItem() throws RecognitionException {
		InitializerItemContext _localctx = new InitializerItemContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_initializerItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1054);
				identifier();
				}
				break;
			case 2:
				{
				setState(1055);
				match(NUM_INT);
				}
				break;
			case 3:
				{
				setState(1056);
				subrangeType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TagValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagValue; }
	}

	public final TagValueContext tagValue() throws RecognitionException {
		TagValueContext _localctx = new TagValueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tagValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorSetContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<ComponentValueContext> componentValue() {
			return getRuleContexts(ComponentValueContext.class);
		}
		public ComponentValueContext componentValue(int i) {
			return getRuleContext(ComponentValueContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public ConstructorSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorSet; }
	}

	public final ConstructorSetContext constructorSet() throws RecognitionException {
		ConstructorSetContext _localctx = new ConstructorSetContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_constructorSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)))) != 0)) {
				{
				setState(1061);
				typeName();
				}
			}

			setState(1064);
			match(LBRACK);
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)) | (1L << (STRING_LITERAL - 143)) | (1L << (NUM_INT - 143)) | (1L << (NUM_REAL - 143)) | (1L << (BASE_NUMBER - 143)) | (1L << (BIN_NUMBER - 143)) | (1L << (HEX_NUMBER - 143)) | (1L << (OCT_NUMBER - 143)))) != 0)) {
				{
				setState(1065);
				componentValue();
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1066);
					match(SEMI);
					setState(1067);
					componentValue();
					}
					}
					setState(1072);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1075);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorNonStdArrayContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<ComponentValueNContext> componentValueN() {
			return getRuleContexts(ComponentValueNContext.class);
		}
		public ComponentValueNContext componentValueN(int i) {
			return getRuleContext(ComponentValueNContext.class,i);
		}
		public TerminalNode REPEAT() { return getToken(pascalParser.REPEAT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public List<ConstructorNonStdArrayContext> constructorNonStdArray() {
			return getRuleContexts(ConstructorNonStdArrayContext.class);
		}
		public ConstructorNonStdArrayContext constructorNonStdArray(int i) {
			return getRuleContext(ConstructorNonStdArrayContext.class,i);
		}
		public ConstructorNonStdArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorNonStdArray; }
	}

	public final ConstructorNonStdArrayContext constructorNonStdArray() throws RecognitionException {
		ConstructorNonStdArrayContext _localctx = new ConstructorNonStdArrayContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_constructorNonStdArray);
		int _la;
		try {
			setState(1121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)))) != 0)) {
					{
					setState(1077);
					typeName();
					}
				}

				setState(1080);
				match(LPAREN);
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)) | (1L << (STRING_LITERAL - 143)) | (1L << (NUM_INT - 143)) | (1L << (NUM_REAL - 143)) | (1L << (BASE_NUMBER - 143)) | (1L << (BIN_NUMBER - 143)) | (1L << (HEX_NUMBER - 143)) | (1L << (OCT_NUMBER - 143)))) != 0)) {
					{
					setState(1081);
					componentValueN();
					setState(1086);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1082);
						match(COMMA);
						setState(1083);
						componentValueN();
						}
						}
						setState(1088);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==REPEAT) {
					{
					setState(1092);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1091);
						match(SEMI);
						}
					}

					setState(1094);
					match(REPEAT);
					setState(1095);
					componentValueN();
					}
				}

				setState(1098);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)))) != 0)) {
					{
					setState(1099);
					typeName();
					}
				}

				setState(1102);
				match(LPAREN);
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)))) != 0)) {
					{
					setState(1103);
					constructorNonStdArray();
					setState(1108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1104);
						match(COMMA);
						setState(1105);
						constructorNonStdArray();
						}
						}
						setState(1110);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==REPEAT) {
					{
					setState(1114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1113);
						match(SEMI);
						}
					}

					setState(1116);
					match(REPEAT);
					setState(1117);
					constructorNonStdArray();
					}
				}

				setState(1120);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentValueNContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(pascalParser.NUM_INT, 0); }
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public ComponentValueNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentValueN; }
	}

	public final ComponentValueNContext componentValueN() throws RecognitionException {
		ComponentValueNContext _localctx = new ComponentValueNContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_componentValueN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1123);
				match(NUM_INT);
				setState(1124);
				match(OF);
				}
				break;
			}
			setState(1127);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorNonStdRecordContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<ComponentValueNContext> componentValueN() {
			return getRuleContexts(ComponentValueNContext.class);
		}
		public ComponentValueNContext componentValueN(int i) {
			return getRuleContext(ComponentValueNContext.class,i);
		}
		public TagValueContext tagValue() {
			return getRuleContext(TagValueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public List<ConstructorNonStdRecordContext> constructorNonStdRecord() {
			return getRuleContexts(ConstructorNonStdRecordContext.class);
		}
		public ConstructorNonStdRecordContext constructorNonStdRecord(int i) {
			return getRuleContext(ConstructorNonStdRecordContext.class,i);
		}
		public ConstructorNonStdRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorNonStdRecord; }
	}

	public final ConstructorNonStdRecordContext constructorNonStdRecord() throws RecognitionException {
		ConstructorNonStdRecordContext _localctx = new ConstructorNonStdRecordContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_constructorNonStdRecord);
		int _la;
		try {
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)))) != 0)) {
					{
					setState(1129);
					typeName();
					}
				}

				setState(1132);
				match(LPAREN);
				setState(1141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1133);
					componentValueN();
					setState(1138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1134);
						match(COMMA);
						setState(1135);
						componentValueN();
						}
						}
						setState(1140);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << SEMI) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)) | (1L << (STRING_LITERAL - 143)) | (1L << (NUM_INT - 143)) | (1L << (NUM_REAL - 143)) | (1L << (BASE_NUMBER - 143)) | (1L << (BIN_NUMBER - 143)) | (1L << (HEX_NUMBER - 143)) | (1L << (OCT_NUMBER - 143)))) != 0)) {
					{
					setState(1144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1143);
						match(SEMI);
						}
					}

					setState(1146);
					tagValue();
					setState(1147);
					match(COMMA);
					setState(1148);
					componentValueN();
					setState(1153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1149);
						match(SEMI);
						setState(1150);
						componentValueN();
						}
						}
						setState(1155);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1158);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)))) != 0)) {
					{
					setState(1159);
					typeName();
					}
				}

				setState(1162);
				match(LPAREN);
				setState(1171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1163);
					constructorNonStdRecord();
					setState(1168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1164);
						match(COMMA);
						setState(1165);
						constructorNonStdRecord();
						}
						}
						setState(1170);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << SEMI) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)) | (1L << (STRING_LITERAL - 143)) | (1L << (NUM_INT - 143)) | (1L << (NUM_REAL - 143)) | (1L << (BASE_NUMBER - 143)) | (1L << (BIN_NUMBER - 143)) | (1L << (HEX_NUMBER - 143)) | (1L << (OCT_NUMBER - 143)))) != 0)) {
					{
					setState(1174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1173);
						match(SEMI);
						}
					}

					setState(1176);
					tagValue();
					setState(1177);
					match(COMMA);
					setState(1178);
					constructorNonStdRecord();
					setState(1183);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1179);
						match(SEMI);
						setState(1180);
						constructorNonStdRecord();
						}
						}
						setState(1185);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1188);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public AttributeVarContext attributeVar() {
			return getRuleContext(AttributeVarContext.class,0);
		}
		public TerminalNode VAR() { return getToken(pascalParser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			attributeVar();
			setState(1192);
			match(VAR);
			setState(1193);
			variableDeclaration();
			setState(1198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1194);
					match(SEMI);
					setState(1195);
					variableDeclaration();
					}
					} 
				}
				setState(1200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
			}
			setState(1201);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariablePreDeclarationContext variablePreDeclaration() {
			return getRuleContext(VariablePreDeclarationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			identifierList();
			setState(1204);
			match(COLON);
			setState(1205);
			attributePart();
			setState(1206);
			type();
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==VALUE) {
				{
				setState(1207);
				variablePreDeclaration();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablePreDeclarationContext extends ParserRuleContext {
		public VariablePreDeclarationValueContext variablePreDeclarationValue() {
			return getRuleContext(VariablePreDeclarationValueContext.class,0);
		}
		public VariablePreDeclarationAssignContext variablePreDeclarationAssign() {
			return getRuleContext(VariablePreDeclarationAssignContext.class,0);
		}
		public VariablePreDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablePreDeclaration; }
	}

	public final VariablePreDeclarationContext variablePreDeclaration() throws RecognitionException {
		VariablePreDeclarationContext _localctx = new VariablePreDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_variablePreDeclaration);
		try {
			setState(1212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1210);
				variablePreDeclarationValue();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1211);
				variablePreDeclarationAssign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablePreDeclarationValueContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(pascalParser.VALUE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public TerminalNode ZERO() { return getToken(pascalParser.ZERO, 0); }
		public ConstructorValueContext constructorValue() {
			return getRuleContext(ConstructorValueContext.class,0);
		}
		public VariablePreDeclarationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablePreDeclarationValue; }
	}

	public final VariablePreDeclarationValueContext variablePreDeclarationValue() throws RecognitionException {
		VariablePreDeclarationValueContext _localctx = new VariablePreDeclarationValueContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_variablePreDeclarationValue);
		try {
			setState(1222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1214);
				match(VALUE);
				setState(1215);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1216);
				match(VALUE);
				setState(1217);
				signedFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1218);
				match(VALUE);
				setState(1219);
				match(ZERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1220);
				match(VALUE);
				setState(1221);
				constructorValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablePreDeclarationAssignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public TerminalNode ZERO() { return getToken(pascalParser.ZERO, 0); }
		public ConstructorValueContext constructorValue() {
			return getRuleContext(ConstructorValueContext.class,0);
		}
		public VariablePreDeclarationAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablePreDeclarationAssign; }
	}

	public final VariablePreDeclarationAssignContext variablePreDeclarationAssign() throws RecognitionException {
		VariablePreDeclarationAssignContext _localctx = new VariablePreDeclarationAssignContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_variablePreDeclarationAssign);
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1224);
				match(ASSIGN);
				setState(1225);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				match(ASSIGN);
				setState(1227);
				signedFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1228);
				match(ASSIGN);
				setState(1229);
				match(ZERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1230);
				match(ASSIGN);
				setState(1231);
				constructorValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToBeginEndDoDeclarationPartContext extends ParserRuleContext {
		public List<TerminalNode> TO() { return getTokens(pascalParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(pascalParser.TO, i);
		}
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public List<TerminalNode> DO() { return getTokens(pascalParser.DO); }
		public TerminalNode DO(int i) {
			return getToken(pascalParser.DO, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public List<CompoundStatementContext> compoundStatement() {
			return getRuleContexts(CompoundStatementContext.class);
		}
		public CompoundStatementContext compoundStatement(int i) {
			return getRuleContext(CompoundStatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ToBeginEndDoDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toBeginEndDoDeclarationPart; }
	}

	public final ToBeginEndDoDeclarationPartContext toBeginEndDoDeclarationPart() throws RecognitionException {
		ToBeginEndDoDeclarationPartContext _localctx = new ToBeginEndDoDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_toBeginEndDoDeclarationPart);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1234);
				match(TO);
				setState(1235);
				match(BEGIN);
				setState(1236);
				match(DO);
				setState(1239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1237);
					compoundStatement();
					}
					break;
				case 2:
					{
					setState(1238);
					statement();
					}
					break;
				}
				setState(1241);
				match(SEMI);
				setState(1242);
				match(TO);
				setState(1243);
				match(END);
				setState(1244);
				match(DO);
				setState(1247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1245);
					compoundStatement();
					}
					break;
				case 2:
					{
					setState(1246);
					statement();
					}
					break;
				}
				setState(1249);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1251);
				match(TO);
				setState(1252);
				match(BEGIN);
				setState(1253);
				match(DO);
				setState(1256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1254);
					compoundStatement();
					}
					break;
				case 2:
					{
					setState(1255);
					statement();
					}
					break;
				}
				setState(1258);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1260);
				match(TO);
				setState(1261);
				match(END);
				setState(1262);
				match(DO);
				setState(1265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1263);
					compoundStatement();
					}
					break;
				case 2:
					{
					setState(1264);
					statement();
					}
					break;
				}
				setState(1267);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureAndFunctionDeclarationPartContext extends ParserRuleContext {
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() {
			return getRuleContext(ProcedureOrFunctionDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public BlockInContext blockIn() {
			return getRuleContext(BlockInContext.class,0);
		}
		public TerminalNode EXTERN() { return getToken(pascalParser.EXTERN, 0); }
		public TerminalNode EXTERNAL() { return getToken(pascalParser.EXTERNAL, 0); }
		public TerminalNode FORTRAN() { return getToken(pascalParser.FORTRAN, 0); }
		public TerminalNode FORWARD() { return getToken(pascalParser.FORWARD, 0); }
		public ProcedureAndFunctionDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionDeclarationPart; }
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			attributePart();
			setState(1272);
			procedureOrFunctionDeclaration();
			setState(1278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
			case P_INCLUDE:
			case P_DICTIONARY:
			case P_TITLE:
			case P_SUBTITLE:
			case P_IF:
			case P_DEFINED:
			case P_ERROR:
			case P_WARN:
			case P_INFO:
			case P_MESSAGE:
			case P_ARCH_NAME:
			case P_SYSTEM_NAME:
			case P_SYSTEM_VERSION:
			case P_DATE:
			case P_TIME:
			case P_COMPILER_VERSION:
			case P_LINE:
			case P_FILE:
			case P_ROUTINE:
			case P_MODULE:
			case P_IDENT:
			case BEGIN:
			case CONST:
			case FUNCTION:
			case LABEL:
			case PROCEDURE:
			case TYPE:
			case VAR:
			case VALUE:
				{
				setState(1273);
				blockIn();
				}
				break;
			case EXTERN:
				{
				setState(1274);
				match(EXTERN);
				}
				break;
			case EXTERNAL:
				{
				setState(1275);
				match(EXTERNAL);
				}
				break;
			case FORTRAN:
				{
				setState(1276);
				match(FORTRAN);
				}
				break;
			case FORWARD:
				{
				setState(1277);
				match(FORWARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1280);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureOrFunctionDeclarationContext extends ParserRuleContext {
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ProcedureOrFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureOrFunctionDeclaration; }
	}

	public final ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() throws RecognitionException {
		ProcedureOrFunctionDeclarationContext _localctx = new ProcedureOrFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_procedureOrFunctionDeclaration);
		try {
			setState(1284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1282);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1283);
				functionDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(pascalParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			match(PROCEDURE);
			setState(1287);
			identifier();
			setState(1289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1288);
				formalParameterList();
				}
			}

			setState(1291);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public List<AttibuteFuncParamContext> attibuteFuncParam() {
			return getRuleContexts(AttibuteFuncParamContext.class);
		}
		public AttibuteFuncParamContext attibuteFuncParam(int i) {
			return getRuleContext(AttibuteFuncParamContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			match(LPAREN);
			setState(1295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
				{
				setState(1294);
				attibuteFuncParam();
				}
			}

			setState(1297);
			formalParameterSection();
			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1298);
				match(SEMI);
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1299);
					attibuteFuncParam();
					}
				}

				setState(1302);
				formalParameterSection();
				}
				}
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1308);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode VAR() { return getToken(pascalParser.VAR, 0); }
		public List<AttributePartContext> attributePart() {
			return getRuleContexts(AttributePartContext.class);
		}
		public AttributePartContext attributePart(int i) {
			return getRuleContext(AttributePartContext.class,i);
		}
		public TerminalNode FUNCTION() { return getToken(pascalParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TerminalNode PROCEDURE() { return getToken(pascalParser.PROCEDURE, 0); }
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_formalParameterSection);
		int _la;
		try {
			setState(1332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				parameterGroup();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1311);
				match(VAR);
				setState(1312);
				parameterGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1313);
				attributePart();
				setState(1314);
				match(FUNCTION);
				setState(1315);
				identifier();
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1316);
					formalParameterList();
					}
				}

				setState(1319);
				match(COLON);
				setState(1320);
				attributePart();
				setState(1321);
				resultType();
				setState(1322);
				assignExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1324);
				attributePart();
				setState(1325);
				match(PROCEDURE);
				setState(1326);
				identifier();
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1327);
					formalParameterList();
					}
				}

				setState(1330);
				assignExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterGroupContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			identifierList();
			setState(1335);
			match(COLON);
			setState(1336);
			attributePart();
			setState(1337);
			type();
			setState(1338);
			assignExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignExpressionContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttibuteFuncParamContext attibuteFuncParam() {
			return getRuleContext(AttibuteFuncParamContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_assignExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1340);
				match(ASSIGN);
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1341);
					attibuteFuncParam();
					}
				}

				setState(1344);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			identifier();
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1348);
				match(COMMA);
				setState(1349);
				identifier();
				}
				}
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> DOTDOT() { return getTokens(pascalParser.DOTDOT); }
		public TerminalNode DOTDOT(int i) {
			return getToken(pascalParser.DOTDOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public List<FunctionDesignatorContext> functionDesignator() {
			return getRuleContexts(FunctionDesignatorContext.class);
		}
		public FunctionDesignatorContext functionDesignator(int i) {
			return getRuleContext(FunctionDesignatorContext.class,i);
		}
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constList);
		int _la;
		try {
			setState(1371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1355);
				constant();
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==DOTDOT) {
					{
					{
					setState(1356);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==DOTDOT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1357);
					constant();
					}
					}
					setState(1362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1363);
				functionDesignator();
				setState(1368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==DOTDOT) {
					{
					{
					setState(1364);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==DOTDOT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1365);
					functionDesignator();
					}
					}
					setState(1370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(pascalParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			match(FUNCTION);
			setState(1374);
			identifier();
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1375);
				formalParameterList();
				}
			}

			setState(1378);
			match(COLON);
			setState(1379);
			attributePart();
			setState(1380);
			resultType();
			setState(1381);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public UnlabelledStatementContext unlabelledStatement() {
			return getRuleContext(UnlabelledStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_statement);
		try {
			setState(1390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1385);
				label();
				setState(1386);
				match(COLON);
				setState(1387);
				unlabelledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1389);
				unlabelledStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlabelledStatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public UnlabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabelledStatement; }
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_unlabelledStatement);
		try {
			setState(1394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
			case ATP:
			case P_INCLUDE:
			case P_DICTIONARY:
			case P_TITLE:
			case P_SUBTITLE:
			case P_IF:
			case P_ELIF:
			case P_ELSE:
			case P_ENDIF:
			case P_DEFINED:
			case P_ERROR:
			case P_WARN:
			case P_INFO:
			case P_MESSAGE:
			case P_ARCH_NAME:
			case P_SYSTEM_NAME:
			case P_SYSTEM_VERSION:
			case P_DATE:
			case P_TIME:
			case P_COMPILER_VERSION:
			case P_LINE:
			case P_FILE:
			case P_ROUTINE:
			case P_MODULE:
			case P_IDENT:
			case ALIGN:
			case ALIGNED:
			case UNALIGNED:
			case AT:
			case AUTOMATIC:
			case COMMON:
			case STATIC:
			case PSECT:
			case ASYNCHRONOUS:
			case CHECK:
			case FLOAT:
			case ENUMERATION_SIZE:
			case PEN_CHECKING_STYLE:
			case HiDDEN:
			case IDENT:
			case INITIALIZE:
			case KEY:
			case LIST:
			case OPTIMIZE:
			case NOOPTIMIZE:
			case CLASS_A:
			case CLASS_NCA:
			case CLASS_S:
			case IMMEDIATE:
			case REFERENCE:
			case POS:
			case READONLY:
			case BIT:
			case BYTE:
			case WORD:
			case LONG:
			case QUAD:
			case OCTA:
			case TRUNCATE:
			case UNBOUND:
			case UNSAFE:
			case LOCAL:
			case GLOBAL:
			case EXTERNAL:
			case WEAK_GLOBAL:
			case WEAK_EXTERNAL:
			case VOLATILE:
			case WRITEONLY:
			case ELSE:
			case END:
			case GOTO:
			case UNTIL:
			case BREAK:
			case CONTINUE:
			case OTHERWISE:
			case RETURN:
			case VALUE:
			case CHAR:
			case CHR:
			case FALSE:
			case STRING:
			case TEXT:
			case TRUE:
			case ZERO:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1392);
				simpleStatement();
				}
				break;
			case BEGIN:
			case CASE:
			case FOR:
			case IF:
			case REPEAT:
			case WHILE:
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1393);
				structuredStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_simpleStatement);
		try {
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1397);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1398);
				gotoStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1399);
				breakStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1400);
				continueStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1401);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1402);
				directives();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1403);
				emptyStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			variable();
			setState(1407);
			match(ASSIGN);
			setState(1408);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ATP() { return getToken(pascalParser.ATP, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(pascalParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(pascalParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(pascalParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(pascalParser.RBRACK, i);
		}
		public List<TerminalNode> LBRACK2() { return getTokens(pascalParser.LBRACK2); }
		public TerminalNode LBRACK2(int i) {
			return getToken(pascalParser.LBRACK2, i);
		}
		public List<TerminalNode> RBRACK2() { return getTokens(pascalParser.RBRACK2); }
		public TerminalNode RBRACK2(int i) {
			return getToken(pascalParser.RBRACK2, i);
		}
		public List<TerminalNode> DOT() { return getTokens(pascalParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(pascalParser.DOT, i);
		}
		public List<TerminalNode> POINTER_() { return getTokens(pascalParser.POINTER_); }
		public TerminalNode POINTER_(int i) {
			return getToken(pascalParser.POINTER_, i);
		}
		public List<TerminalNode> COLON() { return getTokens(pascalParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(pascalParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATP:
				{
				setState(1410);
				match(ATP);
				setState(1411);
				identifier();
				}
				break;
			case ALIGN:
			case ALIGNED:
			case UNALIGNED:
			case AT:
			case AUTOMATIC:
			case COMMON:
			case STATIC:
			case PSECT:
			case ASYNCHRONOUS:
			case CHECK:
			case FLOAT:
			case ENUMERATION_SIZE:
			case PEN_CHECKING_STYLE:
			case HiDDEN:
			case IDENT:
			case INITIALIZE:
			case KEY:
			case LIST:
			case OPTIMIZE:
			case NOOPTIMIZE:
			case CLASS_A:
			case CLASS_NCA:
			case CLASS_S:
			case IMMEDIATE:
			case REFERENCE:
			case POS:
			case READONLY:
			case BIT:
			case BYTE:
			case WORD:
			case LONG:
			case QUAD:
			case OCTA:
			case TRUNCATE:
			case UNBOUND:
			case UNSAFE:
			case LOCAL:
			case GLOBAL:
			case EXTERNAL:
			case WEAK_GLOBAL:
			case WEAK_EXTERNAL:
			case VOLATILE:
			case WRITEONLY:
			case CONTINUE:
			case VALUE:
			case CHAR:
			case CHR:
			case FALSE:
			case STRING:
			case TEXT:
			case TRUE:
			case ZERO:
			case IDENTIFIER:
				{
				setState(1412);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1440);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRACK:
						{
						setState(1415);
						match(LBRACK);
						setState(1416);
						expression();
						setState(1421);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1417);
							match(COMMA);
							setState(1418);
							expression();
							}
							}
							setState(1423);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1424);
						match(RBRACK);
						}
						break;
					case LBRACK2:
						{
						setState(1426);
						match(LBRACK2);
						setState(1427);
						expression();
						setState(1432);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1428);
							match(COMMA);
							setState(1429);
							expression();
							}
							}
							setState(1434);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1435);
						match(RBRACK2);
						}
						break;
					case DOT:
						{
						setState(1437);
						match(DOT);
						setState(1438);
						identifier();
						}
						break;
					case POINTER_:
						{
						setState(1439);
						match(POINTER_);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1445);
				match(COLON);
				setState(1446);
				match(COLON);
				setState(1447);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(pascalParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(pascalParser.COLON, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			simpleExpression();
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1451);
				relationaloperator();
				setState(1452);
				expression();
				}
				break;
			}
			setState(1459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1456);
				match(COLON);
				setState(1457);
				match(COLON);
				setState(1458);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationaloperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(pascalParser.NOT_EQUAL, 0); }
		public TerminalNode LT_() { return getToken(pascalParser.LT_, 0); }
		public TerminalNode LE_() { return getToken(pascalParser.LE_, 0); }
		public TerminalNode GE_() { return getToken(pascalParser.GE_, 0); }
		public TerminalNode GT_() { return getToken(pascalParser.GT_, 0); }
		public TerminalNode IN() { return getToken(pascalParser.IN, 0); }
		public TerminalNode NOT() { return getToken(pascalParser.NOT, 0); }
		public RelationaloperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationaloperator; }
	}

	public final RelationaloperatorContext relationaloperator() throws RecognitionException {
		RelationaloperatorContext _localctx = new RelationaloperatorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_relationaloperator);
		try {
			setState(1470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1461);
				match(EQUAL);
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1462);
				match(NOT_EQUAL);
				}
				break;
			case LT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1463);
				match(LT_);
				}
				break;
			case LE_:
				enterOuterAlt(_localctx, 4);
				{
				setState(1464);
				match(LE_);
				}
				break;
			case GE_:
				enterOuterAlt(_localctx, 5);
				{
				setState(1465);
				match(GE_);
				}
				break;
			case GT_:
				enterOuterAlt(_localctx, 6);
				{
				setState(1466);
				match(GT_);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(1467);
				match(IN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1468);
				match(NOT);
				setState(1469);
				match(IN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AdditiveoperatorContext additiveoperator() {
			return getRuleContext(AdditiveoperatorContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_simpleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			term();
			setState(1476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1473);
				additiveoperator();
				setState(1474);
				simpleExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveoperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(pascalParser.OR, 0); }
		public TerminalNode AND() { return getToken(pascalParser.AND, 0); }
		public TerminalNode AND_THEN() { return getToken(pascalParser.AND_THEN, 0); }
		public TerminalNode OR_ELSE() { return getToken(pascalParser.OR_ELSE, 0); }
		public AdditiveoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveoperator; }
	}

	public final AdditiveoperatorContext additiveoperator() throws RecognitionException {
		AdditiveoperatorContext _localctx = new AdditiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (AND - 104)) | (1L << (OR - 104)) | (1L << (AND_THEN - 104)) | (1L << (OR_ELSE - 104)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public MultiplicativeoperatorContext multiplicativeoperator() {
			return getRuleContext(MultiplicativeoperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			signedFactor();
			setState(1484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1481);
				multiplicativeoperator();
				setState(1482);
				term();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeoperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(pascalParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(pascalParser.SLASH, 0); }
		public TerminalNode POWER() { return getToken(pascalParser.POWER, 0); }
		public TerminalNode DIV() { return getToken(pascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(pascalParser.MOD, 0); }
		public TerminalNode REM() { return getToken(pascalParser.REM, 0); }
		public TerminalNode AND() { return getToken(pascalParser.AND, 0); }
		public MultiplicativeoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeoperator; }
	}

	public final MultiplicativeoperatorContext multiplicativeoperator() throws RecognitionException {
		MultiplicativeoperatorContext _localctx = new MultiplicativeoperatorContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << POWER) | (1L << SLASH))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (AND - 104)) | (1L << (DIV - 104)) | (1L << (MOD - 104)) | (1L << (REM - 104)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1488);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1491);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode NOT() { return getToken(pascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public DirectivesContext directives() {
			return getRuleContext(DirectivesContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_factor);
		try {
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494);
				match(LPAREN);
				setState(1495);
				expression();
				setState(1496);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1498);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1499);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1500);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1501);
				match(NOT);
				setState(1502);
				factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1503);
				bool();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1504);
				directives();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NIL() { return getToken(pascalParser.NIL, 0); }
		public TerminalNode ZERO() { return getToken(pascalParser.ZERO, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_unsignedConstant);
		try {
			setState(1513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1507);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				constantChr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1509);
				string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1510);
				match(NIL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1511);
				match(ZERO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1512);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			identifier();
			setState(1516);
			match(LPAREN);
			setState(1517);
			parameterList();
			setState(1518);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<AttibuteFuncParamContext> attibuteFuncParam() {
			return getRuleContexts(AttibuteFuncParamContext.class);
		}
		public AttibuteFuncParamContext attibuteFuncParam(int i) {
			return getRuleContext(AttibuteFuncParamContext.class,i);
		}
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
				{
				setState(1520);
				attibuteFuncParam();
				}
			}

			setState(1524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)) | (1L << (STRING_LITERAL - 143)) | (1L << (NUM_INT - 143)) | (1L << (NUM_REAL - 143)) | (1L << (BASE_NUMBER - 143)) | (1L << (BIN_NUMBER - 143)) | (1L << (HEX_NUMBER - 143)) | (1L << (OCT_NUMBER - 143)))) != 0)) {
				{
				setState(1523);
				actualParameter();
				}
			}

			setState(1535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1526);
				match(COMMA);
				setState(1528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1527);
					attibuteFuncParam();
					}
				}

				setState(1531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)) | (1L << (STRING_LITERAL - 143)) | (1L << (NUM_INT - 143)) | (1L << (NUM_REAL - 143)) | (1L << (BASE_NUMBER - 143)) | (1L << (BIN_NUMBER - 143)) | (1L << (HEX_NUMBER - 143)) | (1L << (OCT_NUMBER - 143)))) != 0)) {
					{
					setState(1530);
					actualParameter();
					}
				}

				}
				}
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttibuteFuncParamContext extends ParserRuleContext {
		public TerminalNode P_IMMED() { return getToken(pascalParser.P_IMMED, 0); }
		public TerminalNode P_REF() { return getToken(pascalParser.P_REF, 0); }
		public TerminalNode P_DESCR() { return getToken(pascalParser.P_DESCR, 0); }
		public TerminalNode P_STDESCR() { return getToken(pascalParser.P_STDESCR, 0); }
		public AttibuteFuncParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attibuteFuncParam; }
	}

	public final AttibuteFuncParamContext attibuteFuncParam() throws RecognitionException {
		AttibuteFuncParamContext _localctx = new AttibuteFuncParamContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_attibuteFuncParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public TerminalNode LBRACK2() { return getToken(pascalParser.LBRACK2, 0); }
		public TerminalNode RBRACK2() { return getToken(pascalParser.RBRACK2, 0); }
		public ConstructorValueContext constructorValue() {
			return getRuleContext(ConstructorValueContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_set);
		try {
			setState(1549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1540);
				match(LBRACK);
				setState(1541);
				elementList();
				setState(1542);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1544);
				match(LBRACK2);
				setState(1545);
				elementList();
				setState(1546);
				match(RBRACK2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1548);
				constructorValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_elementList);
		int _la;
		try {
			setState(1560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case LPAREN:
			case LBRACK:
			case LBRACK2:
			case ATP:
			case P_INCLUDE:
			case P_DICTIONARY:
			case P_TITLE:
			case P_SUBTITLE:
			case P_IF:
			case P_DEFINED:
			case P_ERROR:
			case P_WARN:
			case P_INFO:
			case P_MESSAGE:
			case P_ARCH_NAME:
			case P_SYSTEM_NAME:
			case P_SYSTEM_VERSION:
			case P_DATE:
			case P_TIME:
			case P_COMPILER_VERSION:
			case P_LINE:
			case P_FILE:
			case P_ROUTINE:
			case P_MODULE:
			case P_IDENT:
			case ALIGN:
			case ALIGNED:
			case UNALIGNED:
			case AT:
			case AUTOMATIC:
			case COMMON:
			case STATIC:
			case PSECT:
			case ASYNCHRONOUS:
			case CHECK:
			case FLOAT:
			case ENUMERATION_SIZE:
			case PEN_CHECKING_STYLE:
			case HiDDEN:
			case IDENT:
			case INITIALIZE:
			case KEY:
			case LIST:
			case OPTIMIZE:
			case NOOPTIMIZE:
			case CLASS_A:
			case CLASS_NCA:
			case CLASS_S:
			case IMMEDIATE:
			case REFERENCE:
			case POS:
			case READONLY:
			case BIT:
			case BYTE:
			case WORD:
			case LONG:
			case QUAD:
			case OCTA:
			case TRUNCATE:
			case UNBOUND:
			case UNSAFE:
			case LOCAL:
			case GLOBAL:
			case EXTERNAL:
			case WEAK_GLOBAL:
			case WEAK_EXTERNAL:
			case VOLATILE:
			case WRITEONLY:
			case NIL:
			case NOT:
			case CONTINUE:
			case VALUE:
			case CHAR:
			case CHR:
			case FALSE:
			case STRING:
			case TEXT:
			case TRUE:
			case ZERO:
			case IDENTIFIER:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1551);
				element();
				setState(1556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1552);
					match(COMMA);
					setState(1553);
					element();
					}
					}
					setState(1558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RBRACK:
			case RBRACK2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(pascalParser.DOTDOT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			expression();
			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(1563);
				match(DOTDOT);
				setState(1564);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			identifier();
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1568);
				match(LPAREN);
				setState(1569);
				parameterList();
				setState(1570);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ParameterwidthContext> parameterwidth() {
			return getRuleContexts(ParameterwidthContext.class);
		}
		public ParameterwidthContext parameterwidth(int i) {
			return getRuleContext(ParameterwidthContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public AttibuteFuncParamContext attibuteFuncParam() {
			return getRuleContext(AttibuteFuncParamContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_actualParameter);
		int _la;
		try {
			setState(1594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1574);
				expression();
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(1575);
					parameterwidth();
					}
					}
					setState(1580);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1581);
				identifier();
				setState(1582);
				match(ASSIGN);
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1583);
					identifier();
					}
					break;
				case 2:
					{
					setState(1584);
					expression();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1587);
				identifier();
				setState(1588);
				match(ASSIGN);
				{
				setState(1589);
				attibuteFuncParam();
				setState(1590);
				match(LPAREN);
				setState(1591);
				expression();
				setState(1592);
				match(RPAREN);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterwidthContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterwidth; }
	}

	public final ParameterwidthContext parameterwidth() throws RecognitionException {
		ParameterwidthContext _localctx = new ParameterwidthContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			match(COLON);
			setState(1597);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(pascalParser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			match(GOTO);
			setState(1600);
			label();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(pascalParser.BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(pascalParser.CONTINUE, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			match(CONTINUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(pascalParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			match(RETURN);
			setState(1607);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringExpressionContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(pascalParser.STRING_LITERAL, 0); }
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public RepetetiveStatementContext repetetiveStatement() {
			return getRuleContext(RepetetiveStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_structuredStatement);
		try {
			setState(1617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1613);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1614);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1615);
				repetetiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1616);
				withStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			match(BEGIN);
			setState(1620);
			statements();
			setState(1621);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenCompoundStatementContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public OpenCompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openCompoundStatement; }
	}

	public final OpenCompoundStatementContext openCompoundStatement() throws RecognitionException {
		OpenCompoundStatementContext _localctx = new OpenCompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_openCompoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			statements();
			setState(1624);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			statement();
			setState(1631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1627);
					match(SEMI);
					setState(1628);
					statement();
					}
					} 
				}
				setState(1633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,193,_ctx);
			}
			setState(1635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1634);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_conditionalStatement);
		try {
			setState(1639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1637);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1638);
				caseStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(pascalParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public TerminalNode ELSE() { return getToken(pascalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			match(IF);
			setState(1642);
			expression();
			setState(1643);
			match(THEN);
			setState(1644);
			statement();
			setState(1646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1645);
				match(SEMI);
				}
				break;
			}
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1648);
				match(ELSE);
				setState(1649);
				statement();
				setState(1651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1650);
					match(SEMI);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(pascalParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public List<CaseListElementContext> caseListElement() {
			return getRuleContexts(CaseListElementContext.class);
		}
		public CaseListElementContext caseListElement(int i) {
			return getRuleContext(CaseListElementContext.class,i);
		}
		public TerminalNode OTHERWISE() { return getToken(pascalParser.OTHERWISE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			match(CASE);
			setState(1656);
			expression();
			setState(1657);
			match(OF);
			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)))) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (CONTINUE - 143)) | (1L << (VALUE - 143)) | (1L << (CHAR - 143)) | (1L << (CHR - 143)) | (1L << (FALSE - 143)) | (1L << (STRING - 143)) | (1L << (TEXT - 143)) | (1L << (TRUE - 143)) | (1L << (ZERO - 143)) | (1L << (IDENTIFIER - 143)) | (1L << (STRING_LITERAL - 143)) | (1L << (NUM_INT - 143)) | (1L << (NUM_REAL - 143)) | (1L << (BASE_NUMBER - 143)) | (1L << (BIN_NUMBER - 143)) | (1L << (HEX_NUMBER - 143)) | (1L << (OCT_NUMBER - 143)))) != 0)) {
				{
				setState(1658);
				caseListElement();
				setState(1663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1659);
						match(SEMI);
						setState(1660);
						caseListElement();
						}
						} 
					}
					setState(1665);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
				}
				}
			}

			setState(1673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1668);
					match(SEMI);
					}
				}

				setState(1671);
				match(OTHERWISE);
				setState(1672);
				statements();
				}
				break;
			}
			setState(1676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1675);
				match(SEMI);
				}
			}

			setState(1678);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseListElementContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseListElement; }
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680);
			constList();
			setState(1681);
			match(COLON);
			setState(1682);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepetetiveStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepetetiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetetiveStatement; }
	}

	public final RepetetiveStatementContext repetetiveStatement() throws RecognitionException {
		RepetetiveStatementContext _localctx = new RepetetiveStatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_repetetiveStatement);
		try {
			setState(1687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1684);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1685);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1686);
				forStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(pascalParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(pascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			match(WHILE);
			setState(1690);
			expression();
			setState(1691);
			match(DO);
			setState(1692);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(pascalParser.REPEAT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(pascalParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(REPEAT);
			setState(1695);
			statements();
			setState(1696);
			match(UNTIL);
			setState(1697);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(pascalParser.FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public TerminalNode DO() { return getToken(pascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode IN() { return getToken(pascalParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_forStatement);
		try {
			setState(1713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1699);
				match(FOR);
				setState(1700);
				identifier();
				setState(1701);
				match(ASSIGN);
				setState(1702);
				forList();
				setState(1703);
				match(DO);
				setState(1704);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1706);
				match(FOR);
				setState(1707);
				identifier();
				setState(1708);
				match(IN);
				setState(1709);
				expression();
				setState(1710);
				match(DO);
				setState(1711);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForListContext extends ParserRuleContext {
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(pascalParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(pascalParser.DOWNTO, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715);
			initialValue();
			setState(1716);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1717);
			finalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(pascalParser.WITH, 0); }
		public RecordVariableListContext recordVariableList() {
			return getRuleContext(RecordVariableListContext.class,0);
		}
		public TerminalNode DO() { return getToken(pascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			match(WITH);
			setState(1724);
			recordVariableList();
			setState(1725);
			match(DO);
			setState(1726);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordVariableListContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public List<PrototypeTypeContext> prototypeType() {
			return getRuleContexts(PrototypeTypeContext.class);
		}
		public PrototypeTypeContext prototypeType(int i) {
			return getRuleContext(PrototypeTypeContext.class,i);
		}
		public RecordVariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariableList; }
	}

	public final RecordVariableListContext recordVariableList() throws RecognitionException {
		RecordVariableListContext _localctx = new RecordVariableListContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_recordVariableList);
		int _la;
		try {
			setState(1744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1728);
				variable();
				setState(1733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1729);
					match(COMMA);
					setState(1730);
					variable();
					}
					}
					setState(1735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1736);
				prototypeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1737);
					match(COMMA);
					setState(1738);
					prototypeType();
					}
					}
					setState(1743);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeDirectiveContext extends ParserRuleContext {
		public TerminalNode P_INCLUDE() { return getToken(pascalParser.P_INCLUDE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(pascalParser.STRING_LITERAL, 0); }
		public IncludeDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeDirective; }
	}

	public final IncludeDirectiveContext includeDirective() throws RecognitionException {
		IncludeDirectiveContext _localctx = new IncludeDirectiveContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_includeDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			match(P_INCLUDE);
			setState(1747);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryDirectiveContext extends ParserRuleContext {
		public TerminalNode P_DICTIONARY() { return getToken(pascalParser.P_DICTIONARY, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(pascalParser.STRING_LITERAL, 0); }
		public DictionaryDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryDirective; }
	}

	public final DictionaryDirectiveContext dictionaryDirective() throws RecognitionException {
		DictionaryDirectiveContext _localctx = new DictionaryDirectiveContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_dictionaryDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			match(P_DICTIONARY);
			setState(1750);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TitleDirectiveContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(pascalParser.STRING_LITERAL, 0); }
		public TerminalNode P_TITLE() { return getToken(pascalParser.P_TITLE, 0); }
		public TerminalNode P_SUBTITLE() { return getToken(pascalParser.P_SUBTITLE, 0); }
		public TitleDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titleDirective; }
	}

	public final TitleDirectiveContext titleDirective() throws RecognitionException {
		TitleDirectiveContext _localctx = new TitleDirectiveContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_titleDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			_la = _input.LA(1);
			if ( !(_la==P_TITLE || _la==P_SUBTITLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1753);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PDefinedDirectiveContext extends ParserRuleContext {
		public TerminalNode P_DEFINED() { return getToken(pascalParser.P_DEFINED, 0); }
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public PDefinedDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pDefinedDirective; }
	}

	public final PDefinedDirectiveContext pDefinedDirective() throws RecognitionException {
		PDefinedDirectiveContext _localctx = new PDefinedDirectiveContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_pDefinedDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			match(P_DEFINED);
			setState(1756);
			match(LPAREN);
			setState(1757);
			identifier();
			setState(1758);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageDirectiveContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public List<StringExpressionContext> stringExpression() {
			return getRuleContexts(StringExpressionContext.class);
		}
		public StringExpressionContext stringExpression(int i) {
			return getRuleContext(StringExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public TerminalNode P_ERROR() { return getToken(pascalParser.P_ERROR, 0); }
		public TerminalNode P_WARN() { return getToken(pascalParser.P_WARN, 0); }
		public TerminalNode P_INFO() { return getToken(pascalParser.P_INFO, 0); }
		public TerminalNode P_MESSAGE() { return getToken(pascalParser.P_MESSAGE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public MessageDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageDirective; }
	}

	public final MessageDirectiveContext messageDirective() throws RecognitionException {
		MessageDirectiveContext _localctx = new MessageDirectiveContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_messageDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1761);
			match(LPAREN);
			setState(1762);
			stringExpression();
			setState(1767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1763);
				match(COMMA);
				setState(1764);
				stringExpression();
				}
				}
				setState(1769);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1770);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfoFuncDirectiveContext extends ParserRuleContext {
		public TerminalNode P_ARCH_NAME() { return getToken(pascalParser.P_ARCH_NAME, 0); }
		public TerminalNode P_SYSTEM_NAME() { return getToken(pascalParser.P_SYSTEM_NAME, 0); }
		public TerminalNode P_SYSTEM_VERSION() { return getToken(pascalParser.P_SYSTEM_VERSION, 0); }
		public TerminalNode P_DATE() { return getToken(pascalParser.P_DATE, 0); }
		public TerminalNode P_TIME() { return getToken(pascalParser.P_TIME, 0); }
		public TerminalNode P_COMPILER_VERSION() { return getToken(pascalParser.P_COMPILER_VERSION, 0); }
		public TerminalNode P_LINE() { return getToken(pascalParser.P_LINE, 0); }
		public TerminalNode P_FILE() { return getToken(pascalParser.P_FILE, 0); }
		public TerminalNode P_ROUTINE() { return getToken(pascalParser.P_ROUTINE, 0); }
		public TerminalNode P_MODULE() { return getToken(pascalParser.P_MODULE, 0); }
		public TerminalNode P_IDENT() { return getToken(pascalParser.P_IDENT, 0); }
		public InfoFuncDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infoFuncDirective; }
	}

	public final InfoFuncDirectiveContext infoFuncDirective() throws RecognitionException {
		InfoFuncDirectiveContext _localctx = new InfoFuncDirectiveContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_infoFuncDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PIfDirectiveContext extends ParserRuleContext {
		public TerminalNode P_IF() { return getToken(pascalParser.P_IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> P_THEN() { return getTokens(pascalParser.P_THEN); }
		public TerminalNode P_THEN(int i) {
			return getToken(pascalParser.P_THEN, i);
		}
		public List<PIfTokenContext> pIfToken() {
			return getRuleContexts(PIfTokenContext.class);
		}
		public PIfTokenContext pIfToken(int i) {
			return getRuleContext(PIfTokenContext.class,i);
		}
		public TerminalNode P_ENDIF() { return getToken(pascalParser.P_ENDIF, 0); }
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public List<TerminalNode> P_ELIF() { return getTokens(pascalParser.P_ELIF); }
		public TerminalNode P_ELIF(int i) {
			return getToken(pascalParser.P_ELIF, i);
		}
		public TerminalNode P_ELSE() { return getToken(pascalParser.P_ELSE, 0); }
		public PIfDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pIfDirective; }
	}

	public final PIfDirectiveContext pIfDirective() throws RecognitionException {
		PIfDirectiveContext _localctx = new PIfDirectiveContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_pIfDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			match(P_IF);
			setState(1775);
			expression();
			setState(1776);
			match(P_THEN);
			setState(1777);
			pIfToken();
			setState(1779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1778);
				match(SEMI);
				}
			}

			setState(1790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==P_ELIF) {
				{
				{
				setState(1781);
				match(P_ELIF);
				setState(1782);
				expression();
				setState(1783);
				match(P_THEN);
				setState(1784);
				pIfToken();
				setState(1786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1785);
					match(SEMI);
					}
				}

				}
				}
				setState(1792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==P_ELSE) {
				{
				setState(1793);
				match(P_ELSE);
				setState(1794);
				pIfToken();
				setState(1796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1795);
					match(SEMI);
					}
				}

				}
			}

			setState(1800);
			match(P_ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PIfTokenContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockDeclarationsContext blockDeclarations() {
			return getRuleContext(BlockDeclarationsContext.class,0);
		}
		public PIfTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pIfToken; }
	}

	public final PIfTokenContext pIfToken() throws RecognitionException {
		PIfTokenContext _localctx = new PIfTokenContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_pIfToken);
		try {
			setState(1805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1802);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1803);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1804);
				blockDeclarations();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ab\u0712\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\3\2\7\2\u012c\n\2\f\2"+
		"\16\2\u012f\13\2\3\2\3\2\3\2\3\2\3\3\5\3\u0136\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\u013e\n\3\3\3\3\3\3\3\5\3\u0143\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\u014b\n\3\3\3\3\3\5\3\u014f\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\7\5\u015a\n\5\f\5\16\5\u015d\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0167\n\6\3\6\3\6\5\6\u016b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0176\n\6\5\6\u0178\n\6\3\6\3\6\5\6\u017c\n\6\3\7\3\7\3\7\5\7\u0181"+
		"\n\7\3\b\3\b\3\b\3\b\7\b\u0187\n\b\f\b\16\b\u018a\13\b\3\b\3\b\5\b\u018e"+
		"\n\b\3\t\3\t\3\t\3\t\7\t\u0194\n\t\f\t\16\t\u0197\13\t\3\t\3\t\5\t\u019b"+
		"\n\t\3\n\3\n\3\n\3\n\7\n\u01a1\n\n\f\n\16\n\u01a4\13\n\3\n\3\n\5\n\u01a8"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u01ae\n\13\3\13\3\13\3\13\5\13\u01b3\n\13"+
		"\7\13\u01b5\n\13\f\13\16\13\u01b8\13\13\3\13\3\13\5\13\u01bc\n\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01c9\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u01d2\n\17\f\17\16\17\u01d5\13\17\3"+
		"\20\3\20\3\20\5\20\u01da\n\20\3\20\5\20\u01dd\n\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\7\22\u01e6\n\22\f\22\16\22\u01e9\13\22\3\22\3\22\3\23"+
		"\3\23\5\23\u01ef\n\23\3\24\3\24\3\24\3\24\6\24\u01f5\n\24\r\24\16\24\u01f6"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u01fe\n\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\5\27\u0206\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0215\n\30\3\31\3\31\5\31\u0219\n\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0227\n\36\3\36\3\36"+
		"\5\36\u022b\n\36\7\36\u022d\n\36\f\36\16\36\u0230\13\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u023b\n\37\f\37\16\37\u023e\13\37"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\6!\u0249\n!\r!\16!\u024a\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u0253\n\"\3\"\5\"\u0256\n\"\3\"\3\"\5\"\u025a\n\"\5\"\u025c"+
		"\n\"\3#\3#\5#\u0260\n#\3#\3#\3#\3$\3$\5$\u0267\n$\3%\3%\3%\5%\u026c\n"+
		"%\3&\3&\3&\3&\3&\5&\u0273\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\5(\u0287\n(\3)\3)\3*\3*\3*\5*\u028e\n*\3+\3+\3+\3+\3"+
		"+\3+\5+\u0296\n+\3,\3,\3,\3,\5,\u029c\n,\3,\3,\3-\3-\3-\3-\3-\5-\u02a5"+
		"\n-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02ba"+
		"\n.\3/\3/\3/\7/\u02bf\n/\f/\16/\u02c2\13/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\5\62\u02cc\n\62\3\62\5\62\u02cf\n\62\3\62\3\62\3\63\3\63\3"+
		"\63\5\63\u02d6\n\63\3\63\5\63\u02d9\n\63\3\64\3\64\3\64\7\64\u02de\n\64"+
		"\f\64\16\64\u02e1\13\64\3\64\5\64\u02e4\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u02f1\n\66\f\66\16\66\u02f4\13\66"+
		"\3\66\5\66\u02f7\n\66\3\66\3\66\3\66\3\66\3\66\5\66\u02fe\n\66\3\67\3"+
		"\67\3\67\5\67\u0303\n\67\3\67\3\67\3\67\3\67\5\67\u0309\n\67\38\38\38"+
		"\38\38\38\39\39\39\39\39\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3=\3="+
		"\3>\3>\3>\3>\3>\7>\u032a\n>\f>\16>\u032d\13>\3>\3>\3>\3>\3>\3?\3?\3?\7"+
		"?\u0337\n?\f?\16?\u033a\13?\3?\3?\3?\3?\3@\3@\5@\u0342\n@\3A\3A\3A\3A"+
		"\3A\7A\u0349\nA\fA\16A\u034c\13A\3A\3A\3B\3B\3B\7B\u0353\nB\fB\16B\u0356"+
		"\13B\3C\3C\3C\3C\3C\5C\u035d\nC\3D\5D\u0360\nD\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\7D\u036b\nD\fD\16D\u036e\13D\5D\u0370\nD\3D\5D\u0373\nD\3D\3D\3D"+
		"\5D\u0378\nD\5D\u037a\nD\3D\3D\5D\u037e\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D"+
		"\7D\u0389\nD\fD\16D\u038c\13D\5D\u038e\nD\3D\5D\u0391\nD\3D\3D\3D\5D\u0396"+
		"\nD\5D\u0398\nD\3D\5D\u039b\nD\3E\3E\3F\3F\3G\5G\u03a2\nG\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\7G\u03ad\nG\fG\16G\u03b0\13G\5G\u03b2\nG\3G\5G\u03b5\n"+
		"G\3G\3G\3G\3G\5G\u03bb\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u03c8\n"+
		"G\fG\16G\u03cb\13G\3G\3G\5G\u03cf\nG\3G\5G\u03d2\nG\3G\3G\3G\5G\u03d7"+
		"\nG\5G\u03d9\nG\3G\3G\5G\u03dd\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u03e8"+
		"\nG\fG\16G\u03eb\13G\5G\u03ed\nG\3G\5G\u03f0\nG\3G\3G\3G\3G\5G\u03f6\n"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u0403\nG\fG\16G\u0406\13G\3G\3G"+
		"\5G\u040a\nG\3G\5G\u040d\nG\3G\3G\3G\5G\u0412\nG\5G\u0414\nG\3G\5G\u0417"+
		"\nG\3H\3H\3H\7H\u041c\nH\fH\16H\u041f\13H\3I\3I\3I\5I\u0424\nI\3J\3J\3"+
		"K\5K\u0429\nK\3K\3K\3K\3K\7K\u042f\nK\fK\16K\u0432\13K\5K\u0434\nK\3K"+
		"\3K\3L\5L\u0439\nL\3L\3L\3L\3L\7L\u043f\nL\fL\16L\u0442\13L\5L\u0444\n"+
		"L\3L\5L\u0447\nL\3L\3L\5L\u044b\nL\3L\3L\5L\u044f\nL\3L\3L\3L\3L\7L\u0455"+
		"\nL\fL\16L\u0458\13L\5L\u045a\nL\3L\5L\u045d\nL\3L\3L\5L\u0461\nL\3L\5"+
		"L\u0464\nL\3M\3M\5M\u0468\nM\3M\3M\3N\5N\u046d\nN\3N\3N\3N\3N\7N\u0473"+
		"\nN\fN\16N\u0476\13N\5N\u0478\nN\3N\5N\u047b\nN\3N\3N\3N\3N\3N\7N\u0482"+
		"\nN\fN\16N\u0485\13N\5N\u0487\nN\3N\3N\5N\u048b\nN\3N\3N\3N\3N\7N\u0491"+
		"\nN\fN\16N\u0494\13N\5N\u0496\nN\3N\5N\u0499\nN\3N\3N\3N\3N\3N\7N\u04a0"+
		"\nN\fN\16N\u04a3\13N\5N\u04a5\nN\3N\5N\u04a8\nN\3O\3O\3O\3O\3O\7O\u04af"+
		"\nO\fO\16O\u04b2\13O\3O\3O\3P\3P\3P\3P\3P\5P\u04bb\nP\3Q\3Q\5Q\u04bf\n"+
		"Q\3R\3R\3R\3R\3R\3R\3R\3R\5R\u04c9\nR\3S\3S\3S\3S\3S\3S\3S\3S\5S\u04d3"+
		"\nS\3T\3T\3T\3T\3T\5T\u04da\nT\3T\3T\3T\3T\3T\3T\5T\u04e2\nT\3T\3T\3T"+
		"\3T\3T\3T\3T\5T\u04eb\nT\3T\3T\3T\3T\3T\3T\3T\5T\u04f4\nT\3T\3T\5T\u04f8"+
		"\nT\3U\3U\3U\3U\3U\3U\3U\5U\u0501\nU\3U\3U\3V\3V\5V\u0507\nV\3W\3W\3W"+
		"\5W\u050c\nW\3W\3W\3X\3X\5X\u0512\nX\3X\3X\3X\5X\u0517\nX\3X\7X\u051a"+
		"\nX\fX\16X\u051d\13X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0528\nY\3Y\3Y\3Y\3"+
		"Y\3Y\3Y\3Y\3Y\3Y\5Y\u0533\nY\3Y\3Y\5Y\u0537\nY\3Z\3Z\3Z\3Z\3Z\3Z\3[\3"+
		"[\5[\u0541\n[\3[\5[\u0544\n[\3\\\3\\\3\\\7\\\u0549\n\\\f\\\16\\\u054c"+
		"\13\\\3]\3]\3]\7]\u0551\n]\f]\16]\u0554\13]\3]\3]\3]\7]\u0559\n]\f]\16"+
		"]\u055c\13]\5]\u055e\n]\3^\3^\3^\5^\u0563\n^\3^\3^\3^\3^\3^\3_\3_\3`\3"+
		"`\3`\3`\3`\5`\u0571\n`\3a\3a\5a\u0575\na\3b\3b\3b\3b\3b\3b\3b\3b\5b\u057f"+
		"\nb\3c\3c\3c\3c\3d\3d\3d\5d\u0588\nd\3d\3d\3d\3d\7d\u058e\nd\fd\16d\u0591"+
		"\13d\3d\3d\3d\3d\3d\3d\7d\u0599\nd\fd\16d\u059c\13d\3d\3d\3d\3d\3d\7d"+
		"\u05a3\nd\fd\16d\u05a6\13d\3d\3d\3d\5d\u05ab\nd\3e\3e\3e\3e\5e\u05b1\n"+
		"e\3e\3e\3e\5e\u05b6\ne\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u05c1\nf\3g\3g\3"+
		"g\3g\5g\u05c7\ng\3h\3h\3i\3i\3i\3i\5i\u05cf\ni\3j\3j\3k\5k\u05d4\nk\3"+
		"k\3k\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u05e4\nl\3m\3m\3m\3m\3m\3"+
		"m\5m\u05ec\nm\3n\3n\3n\3n\3n\3o\5o\u05f4\no\3o\5o\u05f7\no\3o\3o\5o\u05fb"+
		"\no\3o\5o\u05fe\no\7o\u0600\no\fo\16o\u0603\13o\3p\3p\3q\3q\3q\3q\3q\3"+
		"q\3q\3q\3q\5q\u0610\nq\3r\3r\3r\7r\u0615\nr\fr\16r\u0618\13r\3r\5r\u061b"+
		"\nr\3s\3s\3s\5s\u0620\ns\3t\3t\3t\3t\3t\5t\u0627\nt\3u\3u\7u\u062b\nu"+
		"\fu\16u\u062e\13u\3u\3u\3u\3u\5u\u0634\nu\3u\3u\3u\3u\3u\3u\3u\5u\u063d"+
		"\nu\3v\3v\3v\3w\3w\3w\3x\3x\3y\3y\3z\3z\3z\3{\3{\3|\3|\3}\3}\3}\3}\5}"+
		"\u0654\n}\3~\3~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\7\u0080"+
		"\u0660\n\u0080\f\u0080\16\u0080\u0663\13\u0080\3\u0080\5\u0080\u0666\n"+
		"\u0080\3\u0081\3\u0081\5\u0081\u066a\n\u0081\3\u0082\3\u0082\3\u0082\3"+
		"\u0082\3\u0082\5\u0082\u0671\n\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0676"+
		"\n\u0082\5\u0082\u0678\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\7\u0083\u0680\n\u0083\f\u0083\16\u0083\u0683\13\u0083\5\u0083"+
		"\u0685\n\u0083\3\u0083\5\u0083\u0688\n\u0083\3\u0083\3\u0083\5\u0083\u068c"+
		"\n\u0083\3\u0083\5\u0083\u068f\n\u0083\3\u0083\3\u0083\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\5\u0085\u069a\n\u0085\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u06b4\n\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\7\u008d\u06c6\n\u008d"+
		"\f\u008d\16\u008d\u06c9\13\u008d\3\u008d\3\u008d\3\u008d\7\u008d\u06ce"+
		"\n\u008d\f\u008d\16\u008d\u06d1\13\u008d\5\u008d\u06d3\n\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\7\u0092\u06e8\n\u0092\f\u0092\16\u0092\u06eb\13\u0092\3\u0092\3\u0092"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u06f6"+
		"\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u06fd\n\u0094"+
		"\7\u0094\u06ff\n\u0094\f\u0094\16\u0094\u0702\13\u0094\3\u0094\3\u0094"+
		"\3\u0094\5\u0094\u0707\n\u0094\5\u0094\u0709\n\u0094\3\u0094\3\u0094\3"+
		"\u0095\3\u0095\3\u0095\5\u0095\u0710\n\u0095\3\u0095\2\2\u0096\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\2\17\4\2\u0091\u0091\u0099\u009f\5\2<bfi\u0097"+
		"\u0097\4\2\u00a6\u00a6\u00a8\u00ab\3\2\3\4\4\2\u009b\u009b\u009e\u009e"+
		"\4\2\t\t\33\33\7\2\3\4jj\177\177\u008f\u008f\u0093\u0093\7\2\5\7jjoo{"+
		"{\u0095\u0095\3\2\37\"\4\2qq\u0087\u0087\3\2%&\3\2-\60\3\2\61;\2\u079d"+
		"\2\u012d\3\2\2\2\4\u014e\3\2\2\2\6\u0150\3\2\2\2\b\u0154\3\2\2\2\n\u017b"+
		"\3\2\2\2\f\u0180\3\2\2\2\16\u018d\3\2\2\2\20\u019a\3\2\2\2\22\u01a7\3"+
		"\2\2\2\24\u01a9\3\2\2\2\26\u01bd\3\2\2\2\30\u01bf\3\2\2\2\32\u01c8\3\2"+
		"\2\2\34\u01d3\3\2\2\2\36\u01d6\3\2\2\2 \u01de\3\2\2\2\"\u01e1\3\2\2\2"+
		"$\u01ee\3\2\2\2&\u01f0\3\2\2\2(\u01f8\3\2\2\2*\u01ff\3\2\2\2,\u0201\3"+
		"\2\2\2.\u0214\3\2\2\2\60\u0218\3\2\2\2\62\u021a\3\2\2\2\64\u021c\3\2\2"+
		"\2\66\u021e\3\2\2\28\u0220\3\2\2\2:\u0222\3\2\2\2<\u0231\3\2\2\2>\u0241"+
		"\3\2\2\2@\u0243\3\2\2\2B\u025b\3\2\2\2D\u025d\3\2\2\2F\u0264\3\2\2\2H"+
		"\u026b\3\2\2\2J\u0272\3\2\2\2L\u0274\3\2\2\2N\u0286\3\2\2\2P\u0288\3\2"+
		"\2\2R\u028d\3\2\2\2T\u0295\3\2\2\2V\u0297\3\2\2\2X\u029f\3\2\2\2Z\u02b9"+
		"\3\2\2\2\\\u02bb\3\2\2\2^\u02c3\3\2\2\2`\u02c6\3\2\2\2b\u02c9\3\2\2\2"+
		"d\u02d8\3\2\2\2f\u02da\3\2\2\2h\u02e5\3\2\2\2j\u02ea\3\2\2\2l\u0308\3"+
		"\2\2\2n\u030a\3\2\2\2p\u0310\3\2\2\2r\u0315\3\2\2\2t\u0317\3\2\2\2v\u031c"+
		"\3\2\2\2x\u031f\3\2\2\2z\u0324\3\2\2\2|\u0333\3\2\2\2~\u0341\3\2\2\2\u0080"+
		"\u0343\3\2\2\2\u0082\u034f\3\2\2\2\u0084\u035c\3\2\2\2\u0086\u039a\3\2"+
		"\2\2\u0088\u039c\3\2\2\2\u008a\u039e\3\2\2\2\u008c\u0416\3\2\2\2\u008e"+
		"\u0418\3\2\2\2\u0090\u0423\3\2\2\2\u0092\u0425\3\2\2\2\u0094\u0428\3\2"+
		"\2\2\u0096\u0463\3\2\2\2\u0098\u0467\3\2\2\2\u009a\u04a7\3\2\2\2\u009c"+
		"\u04a9\3\2\2\2\u009e\u04b5\3\2\2\2\u00a0\u04be\3\2\2\2\u00a2\u04c8\3\2"+
		"\2\2\u00a4\u04d2\3\2\2\2\u00a6\u04f7\3\2\2\2\u00a8\u04f9\3\2\2\2\u00aa"+
		"\u0506\3\2\2\2\u00ac\u0508\3\2\2\2\u00ae\u050f\3\2\2\2\u00b0\u0536\3\2"+
		"\2\2\u00b2\u0538\3\2\2\2\u00b4\u0543\3\2\2\2\u00b6\u0545\3\2\2\2\u00b8"+
		"\u055d\3\2\2\2\u00ba\u055f\3\2\2\2\u00bc\u0569\3\2\2\2\u00be\u0570\3\2"+
		"\2\2\u00c0\u0574\3\2\2\2\u00c2\u057e\3\2\2\2\u00c4\u0580\3\2\2\2\u00c6"+
		"\u0587\3\2\2\2\u00c8\u05ac\3\2\2\2\u00ca\u05c0\3\2\2\2\u00cc\u05c2\3\2"+
		"\2\2\u00ce\u05c8\3\2\2\2\u00d0\u05ca\3\2\2\2\u00d2\u05d0\3\2\2\2\u00d4"+
		"\u05d3\3\2\2\2\u00d6\u05e3\3\2\2\2\u00d8\u05eb\3\2\2\2\u00da\u05ed\3\2"+
		"\2\2\u00dc\u05f3\3\2\2\2\u00de\u0604\3\2\2\2\u00e0\u060f\3\2\2\2\u00e2"+
		"\u061a\3\2\2\2\u00e4\u061c\3\2\2\2\u00e6\u0621\3\2\2\2\u00e8\u063c\3\2"+
		"\2\2\u00ea\u063e\3\2\2\2\u00ec\u0641\3\2\2\2\u00ee\u0644\3\2\2\2\u00f0"+
		"\u0646\3\2\2\2\u00f2\u0648\3\2\2\2\u00f4\u064b\3\2\2\2\u00f6\u064d\3\2"+
		"\2\2\u00f8\u0653\3\2\2\2\u00fa\u0655\3\2\2\2\u00fc\u0659\3\2\2\2\u00fe"+
		"\u065c\3\2\2\2\u0100\u0669\3\2\2\2\u0102\u066b\3\2\2\2\u0104\u0679\3\2"+
		"\2\2\u0106\u0692\3\2\2\2\u0108\u0699\3\2\2\2\u010a\u069b\3\2\2\2\u010c"+
		"\u06a0\3\2\2\2\u010e\u06b3\3\2\2\2\u0110\u06b5\3\2\2\2\u0112\u06b9\3\2"+
		"\2\2\u0114\u06bb\3\2\2\2\u0116\u06bd\3\2\2\2\u0118\u06d2\3\2\2\2\u011a"+
		"\u06d4\3\2\2\2\u011c\u06d7\3\2\2\2\u011e\u06da\3\2\2\2\u0120\u06dd\3\2"+
		"\2\2\u0122\u06e2\3\2\2\2\u0124\u06ee\3\2\2\2\u0126\u06f0\3\2\2\2\u0128"+
		"\u070f\3\2\2\2\u012a\u012c\5\32\16\2\u012b\u012a\3\2\2\2\u012c\u012f\3"+
		"\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0131\5\4\3\2\u0131\u0132\5\36\20\2\u0132\u0133\7"+
		"\32\2\2\u0133\3\3\2\2\2\u0134\u0136\5\6\4\2\u0135\u0134\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\u0082\2\2\u0138\u013d"+
		"\5\f\7\2\u0139\u013a\7\22\2\2\u013a\u013b\5\u00b6\\\2\u013b\u013c\7\23"+
		"\2\2\u013c\u013e\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\7\n\2\2\u0140\u014f\3\2\2\2\u0141\u0143\5\n"+
		"\6\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\7\u0092\2\2\u0145\u014a\5\f\7\2\u0146\u0147\7\22\2\2\u0147\u0148"+
		"\5\u00b6\\\2\u0148\u0149\7\23\2\2\u0149\u014b\3\2\2\2\u014a\u0146\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\n\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u0135\3\2\2\2\u014e\u0142\3\2\2\2\u014f\5\3\2\2\2"+
		"\u0150\u0151\7\24\2\2\u0151\u0152\5\b\5\2\u0152\u0153\7\26\2\2\u0153\7"+
		"\3\2\2\2\u0154\u0155\7\u008d\2\2\u0155\u0156\7\22\2\2\u0156\u015b\5:\36"+
		"\2\u0157\u0158\7\t\2\2\u0158\u015a\5:\36\2\u0159\u0157\3\2\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u015f\7\23\2\2\u015f\t\3\2\2\2\u0160\u0161\7\24\2"+
		"\2\u0161\u0166\7\u008e\2\2\u0162\u0163\7\22\2\2\u0163\u0164\5:\36\2\u0164"+
		"\u0165\7\23\2\2\u0165\u0167\3\2\2\2\u0166\u0162\3\2\2\2\u0166\u0167\3"+
		"\2\2\2\u0167\u016a\3\2\2\2\u0168\u0169\7\t\2\2\u0169\u016b\5\b\5\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u017c\7\26"+
		"\2\2\u016d\u016e\7\24\2\2\u016e\u0177\5\b\5\2\u016f\u0170\7\t\2\2\u0170"+
		"\u0175\7\u008e\2\2\u0171\u0172\7\22\2\2\u0172\u0173\5:\36\2\u0173\u0174"+
		"\7\23\2\2\u0174\u0176\3\2\2\2\u0175\u0171\3\2\2\2\u0175\u0176\3\2\2\2"+
		"\u0176\u0178\3\2\2\2\u0177\u016f\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u017a\7\26\2\2\u017a\u017c\3\2\2\2\u017b\u0160\3\2\2\2"+
		"\u017b\u016d\3\2\2\2\u017c\13\3\2\2\2\u017d\u0181\7\u00a4\2\2\u017e\u0181"+
		"\5\30\r\2\u017f\u0181\5\26\f\2\u0180\u017d\3\2\2\2\u0180\u017e\3\2\2\2"+
		"\u0180\u017f\3\2\2\2\u0181\r\3\2\2\2\u0182\u0183\7\24\2\2\u0183\u0188"+
		"\5\24\13\2\u0184\u0185\7\t\2\2\u0185\u0187\5\24\13\2\u0186\u0184\3\2\2"+
		"\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018b"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7\26\2\2\u018c\u018e\3\2\2\2"+
		"\u018d\u0182\3\2\2\2\u018d\u018e\3\2\2\2\u018e\17\3\2\2\2\u018f\u0190"+
		"\7\24\2\2\u0190\u0195\5\24\13\2\u0191\u0192\7\t\2\2\u0192\u0194\5\24\13"+
		"\2\u0193\u0191\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7\26\2\2"+
		"\u0199\u019b\3\2\2\2\u019a\u018f\3\2\2\2\u019a\u019b\3\2\2\2\u019b\21"+
		"\3\2\2\2\u019c\u019d\7\24\2\2\u019d\u01a2\5\24\13\2\u019e\u019f\7\t\2"+
		"\2\u019f\u01a1\5\24\13\2\u01a0\u019e\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a5\u01a6\7\26\2\2\u01a6\u01a8\3\2\2\2\u01a7\u019c\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\23\3\2\2\2\u01a9\u01bb\5\30\r\2\u01aa\u01ad\7\22"+
		"\2\2\u01ab\u01ae\5.\30\2\u01ac\u01ae\5\f\7\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ac\3\2\2\2\u01ae\u01b6\3\2\2\2\u01af\u01b2\7\t\2\2\u01b0\u01b3\5."+
		"\30\2\u01b1\u01b3\5\f\7\2\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3"+
		"\u01b5\3\2\2\2\u01b4\u01af\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2"+
		"\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9"+
		"\u01ba\7\23\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01aa\3\2\2\2\u01bb\u01bc\3"+
		"\2\2\2\u01bc\25\3\2\2\2\u01bd\u01be\t\2\2\2\u01be\27\3\2\2\2\u01bf\u01c0"+
		"\t\3\2\2\u01c0\31\3\2\2\2\u01c1\u01c9\5\u011a\u008e\2\u01c2\u01c9\5\u011c"+
		"\u008f\2\u01c3\u01c9\5\u011e\u0090\2\u01c4\u01c9\5\u0120\u0091\2\u01c5"+
		"\u01c9\5\u0122\u0092\2\u01c6\u01c9\5\u0124\u0093\2\u01c7\u01c9\5\u0126"+
		"\u0094\2\u01c8\u01c1\3\2\2\2\u01c8\u01c2\3\2\2\2\u01c8\u01c3\3\2\2\2\u01c8"+
		"\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2"+
		"\2\2\u01c9\33\3\2\2\2\u01ca\u01d2\5\32\16\2\u01cb\u01d2\5\"\22\2\u01cc"+
		"\u01d2\5&\24\2\u01cd\u01d2\5@!\2\u01ce\u01d2\5<\37\2\u01cf\u01d2\5\u009c"+
		"O\2\u01d0\u01d2\5\u00a8U\2\u01d1\u01ca\3\2\2\2\u01d1\u01cb\3\2\2\2\u01d1"+
		"\u01cc\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\35\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01dc\5\34\17"+
		"\2\u01d7\u01dd\5\u00fa~\2\u01d8\u01da\5\u00a6T\2\u01d9\u01d8\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\7s\2\2\u01dc\u01d7\3\2"+
		"\2\2\u01dc\u01d9\3\2\2\2\u01dd\37\3\2\2\2\u01de\u01df\5\34\17\2\u01df"+
		"\u01e0\5\u00fa~\2\u01e0!\3\2\2\2\u01e1\u01e2\7z\2\2\u01e2\u01e7\5$\23"+
		"\2\u01e3\u01e4\7\t\2\2\u01e4\u01e6\5$\23\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9"+
		"\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01ea\u01eb\7\n\2\2\u01eb#\3\2\2\2\u01ec\u01ef\5\62\32"+
		"\2\u01ed\u01ef\5\f\7\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef%"+
		"\3\2\2\2\u01f0\u01f4\7n\2\2\u01f1\u01f2\5(\25\2\u01f2\u01f3\7\n\2\2\u01f3"+
		"\u01f5\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7\'\3\2\2\2\u01f8\u01f9\5*\26\2\u01f9\u01fa"+
		"\7\f\2\2\u01fa\u01fd\5\16\b\2\u01fb\u01fe\5.\30\2\u01fc\u01fe\5\u00c8"+
		"e\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe)\3\2\2\2\u01ff\u0200"+
		"\5\f\7\2\u0200+\3\2\2\2\u0201\u0202\7\u009a\2\2\u0202\u0205\7\22\2\2\u0203"+
		"\u0206\5\62\32\2\u0204\u0206\5\f\7\2\u0205\u0203\3\2\2\2\u0205\u0204\3"+
		"\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\7\23\2\2\u0208-\3\2\2\2\u0209\u0215"+
		"\5\60\31\2\u020a\u020b\5\66\34\2\u020b\u020c\5\60\31\2\u020c\u0215\3\2"+
		"\2\2\u020d\u0215\5\f\7\2\u020e\u020f\5\66\34\2\u020f\u0210\5\f\7\2\u0210"+
		"\u0215\3\2\2\2\u0211\u0215\5:\36\2\u0212\u0215\5,\27\2\u0213\u0215\58"+
		"\35\2\u0214\u0209\3\2\2\2\u0214\u020a\3\2\2\2\u0214\u020d\3\2\2\2\u0214"+
		"\u020e\3\2\2\2\u0214\u0211\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0213\3\2"+
		"\2\2\u0215/\3\2\2\2\u0216\u0219\5\62\32\2\u0217\u0219\5\64\33\2\u0218"+
		"\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219\61\3\2\2\2\u021a\u021b\t\4\2"+
		"\2\u021b\63\3\2\2\2\u021c\u021d\7\u00a7\2\2\u021d\65\3\2\2\2\u021e\u021f"+
		"\t\5\2\2\u021f\67\3\2\2\2\u0220\u0221\t\6\2\2\u02219\3\2\2\2\u0222\u022e"+
		"\7\u00a5\2\2\u0223\u0226\7\22\2\2\u0224\u0227\5\f\7\2\u0225\u0227\7\u00a6"+
		"\2\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022a\7\23\2\2\u0229\u022b\5:\36\2\u022a\u0229\3\2\2\2\u022a\u022b\3"+
		"\2\2\2\u022b\u022d\3\2\2\2\u022c\u0223\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f;\3\2\2\2\u0230\u022e\3\2\2\2"+
		"\u0231\u0232\7\u0097\2\2\u0232\u0233\5> \2\u0233\u0234\7\b\2\2\u0234\u023c"+
		"\5\u00c8e\2\u0235\u0236\7\n\2\2\u0236\u0237\5> \2\u0237\u0238\7\b\2\2"+
		"\u0238\u0239\5\u00c8e\2\u0239\u023b\3\2\2\2\u023a\u0235\3\2\2\2\u023b"+
		"\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2"+
		"\2\2\u023e\u023c\3\2\2\2\u023f\u0240\7\n\2\2\u0240=\3\2\2\2\u0241\u0242"+
		"\5\f\7\2\u0242?\3\2\2\2\u0243\u0244\5\20\t\2\u0244\u0248\7\u0088\2\2\u0245"+
		"\u0246\5B\"\2\u0246\u0247\7\n\2\2\u0247\u0249\3\2\2\2\u0248\u0245\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"A\3\2\2\2\u024c\u024d\5\u0088E\2\u024d\u024e\7\f\2\2\u024e\u0252\5\16"+
		"\b\2\u024f\u0253\5H%\2\u0250\u0253\5D#\2\u0251\u0253\5F$\2\u0252\u024f"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0251\3\2\2\2\u0253\u0255\3\2\2\2\u0254"+
		"\u0256\5\u00a2R\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u025c"+
		"\3\2\2\2\u0257\u0259\5z>\2\u0258\u025a\5\u00a2R\2\u0259\u0258\3\2\2\2"+
		"\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b\u024c\3\2\2\2\u025b\u0257"+
		"\3\2\2\2\u025cC\3\2\2\2\u025d\u025f\7v\2\2\u025e\u0260\5\u00aeX\2\u025f"+
		"\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\7\13"+
		"\2\2\u0262\u0263\5\u00bc_\2\u0263E\3\2\2\2\u0264\u0266\7\u0081\2\2\u0265"+
		"\u0267\5\u00aeX\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267G\3\2\2"+
		"\2\u0268\u026c\5J&\2\u0269\u026c\5R*\2\u026a\u026c\5x=\2\u026b\u0268\3"+
		"\2\2\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026cI\3\2\2\2\u026d\u0273"+
		"\5L\'\2\u026e\u0273\5N(\2\u026f\u0273\5P)\2\u0270\u0273\5V,\2\u0271\u0273"+
		"\5\u0080A\2\u0272\u026d\3\2\2\2\u0272\u026e\3\2\2\2\u0272\u026f\3\2\2"+
		"\2\u0272\u0270\3\2\2\2\u0272\u0271\3\2\2\2\u0273K\3\2\2\2\u0274\u0275"+
		"\7\22\2\2\u0275\u0276\5\u00b6\\\2\u0276\u0277\7\23\2\2\u0277M\3\2\2\2"+
		"\u0278\u0279\5.\30\2\u0279\u027a\7\33\2\2\u027a\u027b\5.\30\2\u027b\u0287"+
		"\3\2\2\2\u027c\u027d\5\u00c8e\2\u027d\u027e\7\33\2\2\u027e\u027f\5\u00c8"+
		"e\2\u027f\u0287\3\2\2\2\u0280\u0281\5\u00c8e\2\u0281\u0282\7\33\2\2\u0282"+
		"\u0283\5\u00c8e\2\u0283\u0284\7\13\2\2\u0284\u0285\5P)\2\u0285\u0287\3"+
		"\2\2\2\u0286\u0278\3\2\2\2\u0286\u027c\3\2\2\2\u0286\u0280\3\2\2\2\u0287"+
		"O\3\2\2\2\u0288\u0289\5\f\7\2\u0289Q\3\2\2\2\u028a\u028b\7\u0080\2\2\u028b"+
		"\u028e\5T+\2\u028c\u028e\5T+\2\u028d\u028a\3\2\2\2\u028d\u028c\3\2\2\2"+
		"\u028eS\3\2\2\2\u028f\u0296\5Z.\2\u0290\u0296\5b\62\2\u0291\u0296\5p9"+
		"\2\u0292\u0296\5t;\2\u0293\u0296\5v<\2\u0294\u0296\5X-\2\u0295\u028f\3"+
		"\2\2\2\u0295\u0290\3\2\2\2\u0295\u0291\3\2\2\2\u0295\u0292\3\2\2\2\u0295"+
		"\u0293\3\2\2\2\u0295\u0294\3\2\2\2\u0296U\3\2\2\2\u0297\u0298\7\u009c"+
		"\2\2\u0298\u029b\7\22\2\2\u0299\u029c\5\f\7\2\u029a\u029c\5\60\31\2\u029b"+
		"\u0299\3\2\2\2\u029b\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\7\23"+
		"\2\2\u029eW\3\2\2\2\u029f\u02a0\7\u0098\2\2\u02a0\u02a4\7\24\2\2\u02a1"+
		"\u02a5\5.\30\2\u02a2\u02a5\5\f\7\2\u02a3\u02a5\5\u00c8e\2\u02a4\u02a1"+
		"\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a7\7\26\2\2\u02a7\u02a8\7~\2\2\u02a8\u02a9\5\16\b\2\u02a9\u02aa\7"+
		"\u0099\2\2\u02aaY\3\2\2\2\u02ab\u02ac\7k\2\2\u02ac\u02ad\7\24\2\2\u02ad"+
		"\u02ae\5\\/\2\u02ae\u02af\7\26\2\2\u02af\u02b0\7~\2\2\u02b0\u02b1\5`\61"+
		"\2\u02b1\u02ba\3\2\2\2\u02b2\u02b3\7k\2\2\u02b3\u02b4\7\25\2\2\u02b4\u02b5"+
		"\5\\/\2\u02b5\u02b6\7\27\2\2\u02b6\u02b7\7~\2\2\u02b7\u02b8\5`\61\2\u02b8"+
		"\u02ba\3\2\2\2\u02b9\u02ab\3\2\2\2\u02b9\u02b2\3\2\2\2\u02ba[\3\2\2\2"+
		"\u02bb\u02c0\5^\60\2\u02bc\u02bd\7\t\2\2\u02bd\u02bf\5^\60\2\u02be\u02bc"+
		"\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"]\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\5\16\b\2\u02c4\u02c5\5J&\2\u02c5"+
		"_\3\2\2\2\u02c6\u02c7\5\16\b\2\u02c7\u02c8\5H%\2\u02c8a\3\2\2\2\u02c9"+
		"\u02cb\7\u0083\2\2\u02ca\u02cc\5d\63\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc"+
		"\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02cf\7\n\2\2\u02ce\u02cd\3\2\2\2\u02ce"+
		"\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\7s\2\2\u02d1c\3\2\2\2\u02d2"+
		"\u02d5\5f\64\2\u02d3\u02d4\7\n\2\2\u02d4\u02d6\5j\66\2\u02d5\u02d3\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d9\5j\66\2\u02d8"+
		"\u02d2\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9e\3\2\2\2\u02da\u02df\5h\65\2"+
		"\u02db\u02dc\7\n\2\2\u02dc\u02de\5h\65\2\u02dd\u02db\3\2\2\2\u02de\u02e1"+
		"\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1"+
		"\u02df\3\2\2\2\u02e2\u02e4\7\n\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2"+
		"\2\2\u02e4g\3\2\2\2\u02e5\u02e6\5\u00b6\\\2\u02e6\u02e7\7\13\2\2\u02e7"+
		"\u02e8\5\16\b\2\u02e8\u02e9\5H%\2\u02e9i\3\2\2\2\u02ea\u02eb\7m\2\2\u02eb"+
		"\u02ec\5l\67\2\u02ec\u02ed\7~\2\2\u02ed\u02f2\5n8\2\u02ee\u02ef\7\n\2"+
		"\2\u02ef\u02f1\5n8\2\u02f0\u02ee\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0"+
		"\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02fd\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5"+
		"\u02f7\7\n\2\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2"+
		"\2\2\u02f8\u02f9\7\u0094\2\2\u02f9\u02fa\7\22\2\2\u02fa\u02fb\5d\63\2"+
		"\u02fb\u02fc\7\23\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02f6\3\2\2\2\u02fd\u02fe"+
		"\3\2\2\2\u02fek\3\2\2\2\u02ff\u0300\5\f\7\2\u0300\u0301\7\13\2\2\u0301"+
		"\u0303\3\2\2\2\u0302\u02ff\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\3\2"+
		"\2\2\u0304\u0305\5\16\b\2\u0305\u0306\5P)\2\u0306\u0309\3\2\2\2\u0307"+
		"\u0309\5P)\2\u0308\u0302\3\2\2\2\u0308\u0307\3\2\2\2\u0309m\3\2\2\2\u030a"+
		"\u030b\5\u00b8]\2\u030b\u030c\7\13\2\2\u030c\u030d\7\22\2\2\u030d\u030e"+
		"\5d\63\2\u030e\u030f\7\23\2\2\u030fo\3\2\2\2\u0310\u0311\7\u0085\2\2\u0311"+
		"\u0312\7~\2\2\u0312\u0313\5\16\b\2\u0313\u0314\5r:\2\u0314q\3\2\2\2\u0315"+
		"\u0316\5J&\2\u0316s\3\2\2\2\u0317\u0318\7t\2\2\u0318\u0319\7~\2\2\u0319"+
		"\u031a\5\16\b\2\u031a\u031b\5H%\2\u031bu\3\2\2\2\u031c\u031d\5\16\b\2"+
		"\u031d\u031e\7\u009d\2\2\u031ew\3\2\2\2\u031f\u0320\5\16\b\2\u0320\u0321"+
		"\7\30\2\2\u0321\u0322\5\16\b\2\u0322\u0323\5H%\2\u0323y\3\2\2\2\u0324"+
		"\u0325\5~@\2\u0325\u0326\7\22\2\2\u0326\u032b\5|?\2\u0327\u0328\7\n\2"+
		"\2\u0328\u032a\5|?\2\u0329\u0327\3\2\2\2\u032a\u032d\3\2\2\2\u032b\u0329"+
		"\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032e\3\2\2\2\u032d\u032b\3\2\2\2\u032e"+
		"\u032f\7\23\2\2\u032f\u0330\7\f\2\2\u0330\u0331\5\16\b\2\u0331\u0332\5"+
		"H%\2\u0332{\3\2\2\2\u0333\u0338\5\f\7\2\u0334\u0335\7\t\2\2\u0335\u0337"+
		"\5\f\7\2\u0336\u0334\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033c\7\13"+
		"\2\2\u033c\u033d\5\16\b\2\u033d\u033e\5H%\2\u033e}\3\2\2\2\u033f\u0342"+
		"\5\f\7\2\u0340\u0342\7\u009c\2\2\u0341\u033f\3\2\2\2\u0341\u0340\3\2\2"+
		"\2\u0342\177\3\2\2\2\u0343\u0344\5~@\2\u0344\u0345\7\22\2\2\u0345\u034a"+
		"\5\u0082B\2\u0346\u0347\7\n\2\2\u0347\u0349\5\u0082B\2\u0348\u0346\3\2"+
		"\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u034d\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034e\7\23\2\2\u034e\u0081\3"+
		"\2\2\2\u034f\u0354\5\u00c8e\2\u0350\u0351\7\t\2\2\u0351\u0353\5\u00c8"+
		"e\2\u0352\u0350\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355\u0083\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u035d\5\u0086"+
		"D\2\u0358\u035d\5\u008cG\2\u0359\u035d\5\u0094K\2\u035a\u035d\5\u0096"+
		"L\2\u035b\u035d\5\u009aN\2\u035c\u0357\3\2\2\2\u035c\u0358\3\2\2\2\u035c"+
		"\u0359\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035b\3\2\2\2\u035d\u0085\3\2"+
		"\2\2\u035e\u0360\5\u0088E\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u036f\7\24\2\2\u0362\u0363\5\u008eH\2\u0363\u0364"+
		"\7\13\2\2\u0364\u036c\5\u008aF\2\u0365\u0366\7\n\2\2\u0366\u0367\5\u008e"+
		"H\2\u0367\u0368\7\13\2\2\u0368\u0369\5\u008aF\2\u0369\u036b\3\2\2\2\u036a"+
		"\u0365\3\2\2\2\u036b\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2"+
		"\2\2\u036d\u0370\3\2\2\2\u036e\u036c\3\2\2\2\u036f\u0362\3\2\2\2\u036f"+
		"\u0370\3\2\2\2\u0370\u0379\3\2\2\2\u0371\u0373\7\n\2\2\u0372\u0371\3\2"+
		"\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\7\u0094\2\2\u0375"+
		"\u0377\5\u008aF\2\u0376\u0378\7\n\2\2\u0377\u0376\3\2\2\2\u0377\u0378"+
		"\3\2\2\2\u0378\u037a\3\2\2\2\u0379\u0372\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u039b\7\26\2\2\u037c\u037e\5\u0088E\2\u037d\u037c"+
		"\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u038d\7\24\2\2"+
		"\u0380\u0381\5\u008eH\2\u0381\u0382\7\13\2\2\u0382\u038a\5\u0086D\2\u0383"+
		"\u0384\7\n\2\2\u0384\u0385\5\u008eH\2\u0385\u0386\7\13\2\2\u0386\u0387"+
		"\5\u0086D\2\u0387\u0389\3\2\2\2\u0388\u0383\3\2\2\2\u0389\u038c\3\2\2"+
		"\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038e\3\2\2\2\u038c\u038a"+
		"\3\2\2\2\u038d\u0380\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0397\3\2\2\2\u038f"+
		"\u0391\7\n\2\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\3\2"+
		"\2\2\u0392\u0393\7\u0094\2\2\u0393\u0395\5\u0086D\2\u0394\u0396\7\n\2"+
		"\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2\2\2\u0397\u0390"+
		"\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\7\26\2\2"+
		"\u039a\u035f\3\2\2\2\u039a\u037d\3\2\2\2\u039b\u0087\3\2\2\2\u039c\u039d"+
		"\5\f\7\2\u039d\u0089\3\2\2\2\u039e\u039f\5\u00c8e\2\u039f\u008b\3\2\2"+
		"\2\u03a0\u03a2\5\u0088E\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u03b1\7\24\2\2\u03a4\u03a5\5\u008eH\2\u03a5\u03a6"+
		"\7\13\2\2\u03a6\u03ae\5\u008aF\2\u03a7\u03a8\7\n\2\2\u03a8\u03a9\5\u008e"+
		"H\2\u03a9\u03aa\7\13\2\2\u03aa\u03ab\5\u008aF\2\u03ab\u03ad\3\2\2\2\u03ac"+
		"\u03a7\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2"+
		"\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1\u03a4\3\2\2\2\u03b1"+
		"\u03b2\3\2\2\2\u03b2\u03ce\3\2\2\2\u03b3\u03b5\7\n\2\2\u03b4\u03b3\3\2"+
		"\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03ba\7m\2\2\u03b7"+
		"\u03b8\5\f\7\2\u03b8\u03b9\7\13\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b7\3"+
		"\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03bd\5\u0092J\2"+
		"\u03bd\u03be\7~\2\2\u03be\u03bf\7\24\2\2\u03bf\u03c0\5\u008eH\2\u03c0"+
		"\u03c1\7\13\2\2\u03c1\u03c9\5\u008aF\2\u03c2\u03c3\7\n\2\2\u03c3\u03c4"+
		"\5\u008eH\2\u03c4\u03c5\7\13\2\2\u03c5\u03c6\5\u008aF\2\u03c6\u03c8\3"+
		"\2\2\2\u03c7\u03c2\3\2\2\2\u03c8\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9"+
		"\u03ca\3\2\2\2\u03ca\u03cc\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc\u03cd\7\26"+
		"\2\2\u03cd\u03cf\3\2\2\2\u03ce\u03b4\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf"+
		"\u03d8\3\2\2\2\u03d0\u03d2\7\n\2\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2"+
		"\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\7\u0094\2\2\u03d4\u03d6\7\u009f\2"+
		"\2\u03d5\u03d7\7\n\2\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9"+
		"\3\2\2\2\u03d8\u03d1\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"\u0417\7\26\2\2\u03db\u03dd\5\u0088E\2\u03dc\u03db\3\2\2\2\u03dc\u03dd"+
		"\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03ec\7\24\2\2\u03df\u03e0\5\u008e"+
		"H\2\u03e0\u03e1\7\13\2\2\u03e1\u03e9\5\u008cG\2\u03e2\u03e3\7\n\2\2\u03e3"+
		"\u03e4\5\u008eH\2\u03e4\u03e5\7\13\2\2\u03e5\u03e6\5\u008cG\2\u03e6\u03e8"+
		"\3\2\2\2\u03e7\u03e2\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03df\3\2"+
		"\2\2\u03ec\u03ed\3\2\2\2\u03ed\u0409\3\2\2\2\u03ee\u03f0\7\n\2\2\u03ef"+
		"\u03ee\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f5\7m"+
		"\2\2\u03f2\u03f3\5\f\7\2\u03f3\u03f4\7\13\2\2\u03f4\u03f6\3\2\2\2\u03f5"+
		"\u03f2\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\5\u0092"+
		"J\2\u03f8\u03f9\7~\2\2\u03f9\u03fa\7\24\2\2\u03fa\u03fb\5\u008eH\2\u03fb"+
		"\u03fc\7\13\2\2\u03fc\u0404\5\u008cG\2\u03fd\u03fe\7\n\2\2\u03fe\u03ff"+
		"\5\u008eH\2\u03ff\u0400\7\13\2\2\u0400\u0401\5\u008cG\2\u0401\u0403\3"+
		"\2\2\2\u0402\u03fd\3\2\2\2\u0403\u0406\3\2\2\2\u0404\u0402\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0407\3\2\2\2\u0406\u0404\3\2\2\2\u0407\u0408\7\26"+
		"\2\2\u0408\u040a\3\2\2\2\u0409\u03ef\3\2\2\2\u0409\u040a\3\2\2\2\u040a"+
		"\u0413\3\2\2\2\u040b\u040d\7\n\2\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2"+
		"\2\2\u040d\u040e\3\2\2\2\u040e\u040f\7\u0094\2\2\u040f\u0411\7\u009f\2"+
		"\2\u0410\u0412\7\n\2\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0414"+
		"\3\2\2\2\u0413\u040c\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"\u0417\7\26\2\2\u0416\u03a1\3\2\2\2\u0416\u03dc\3\2\2\2\u0417\u008d\3"+
		"\2\2\2\u0418\u041d\5\u0090I\2\u0419\u041a\7\t\2\2\u041a\u041c\5\u0090"+
		"I\2\u041b\u0419\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041d"+
		"\u041e\3\2\2\2\u041e\u008f\3\2\2\2\u041f\u041d\3\2\2\2\u0420\u0424\5\f"+
		"\7\2\u0421\u0424\7\u00a6\2\2\u0422\u0424\5N(\2\u0423\u0420\3\2\2\2\u0423"+
		"\u0421\3\2\2\2\u0423\u0422\3\2\2\2\u0424\u0091\3\2\2\2\u0425\u0426\5\u00c8"+
		"e\2\u0426\u0093\3\2\2\2\u0427\u0429\5\u0088E\2\u0428\u0427\3\2\2\2\u0428"+
		"\u0429\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u0433\7\24\2\2\u042b\u0430\5"+
		"\u008aF\2\u042c\u042d\7\n\2\2\u042d\u042f\5\u008aF\2\u042e\u042c\3\2\2"+
		"\2\u042f\u0432\3\2\2\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0434"+
		"\3\2\2\2\u0432\u0430\3\2\2\2\u0433\u042b\3\2\2\2\u0433\u0434\3\2\2\2\u0434"+
		"\u0435\3\2\2\2\u0435\u0436\7\26\2\2\u0436\u0095\3\2\2\2\u0437\u0439\5"+
		"\u0088E\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2\2"+
		"\u043a\u0443\7\22\2\2\u043b\u0440\5\u0098M\2\u043c\u043d\7\t\2\2\u043d"+
		"\u043f\5\u0098M\2\u043e\u043c\3\2\2\2\u043f\u0442\3\2\2\2\u0440\u043e"+
		"\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2\2\2\u0443"+
		"\u043b\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u044a\3\2\2\2\u0445\u0447\7\n"+
		"\2\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448"+
		"\u0449\7\u0084\2\2\u0449\u044b\5\u0098M\2\u044a\u0446\3\2\2\2\u044a\u044b"+
		"\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u0464\7\23\2\2\u044d\u044f\5\u0088"+
		"E\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450\3\2\2\2\u0450"+
		"\u0459\7\22\2\2\u0451\u0456\5\u0096L\2\u0452\u0453\7\t\2\2\u0453\u0455"+
		"\5\u0096L\2\u0454\u0452\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0454\3\2\2"+
		"\2\u0456\u0457\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456\3\2\2\2\u0459\u0451"+
		"\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u0460\3\2\2\2\u045b\u045d\7\n\2\2\u045c"+
		"\u045b\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u045f\7\u0084"+
		"\2\2\u045f\u0461\5\u0096L\2\u0460\u045c\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"\u0462\3\2\2\2\u0462\u0464\7\23\2\2\u0463\u0438\3\2\2\2\u0463\u044e\3"+
		"\2\2\2\u0464\u0097\3\2\2\2\u0465\u0466\7\u00a6\2\2\u0466\u0468\7~\2\2"+
		"\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a"+
		"\5\u00c8e\2\u046a\u0099\3\2\2\2\u046b\u046d\5\u0088E\2\u046c\u046b\3\2"+
		"\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0477\7\22\2\2\u046f"+
		"\u0474\5\u0098M\2\u0470\u0471\7\t\2\2\u0471\u0473\5\u0098M\2\u0472\u0470"+
		"\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"\u0478\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u046f\3\2\2\2\u0477\u0478\3\2"+
		"\2\2\u0478\u0486\3\2\2\2\u0479\u047b\7\n\2\2\u047a\u0479\3\2\2\2\u047a"+
		"\u047b\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d\5\u0092J\2\u047d\u047e"+
		"\7\t\2\2\u047e\u0483\5\u0098M\2\u047f\u0480\7\n\2\2\u0480\u0482\5\u0098"+
		"M\2\u0481\u047f\3\2\2\2\u0482\u0485\3\2\2\2\u0483\u0481\3\2\2\2\u0483"+
		"\u0484\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0483\3\2\2\2\u0486\u047a\3\2"+
		"\2\2\u0486\u0487\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u04a8\7\23\2\2\u0489"+
		"\u048b\5\u0088E\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c"+
		"\3\2\2\2\u048c\u0495\7\22\2\2\u048d\u0492\5\u009aN\2\u048e\u048f\7\t\2"+
		"\2\u048f\u0491\5\u009aN\2\u0490\u048e\3\2\2\2\u0491\u0494\3\2\2\2\u0492"+
		"\u0490\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0496\3\2\2\2\u0494\u0492\3\2"+
		"\2\2\u0495\u048d\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u04a4\3\2\2\2\u0497"+
		"\u0499\7\n\2\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2"+
		"\2\2\u049a\u049b\5\u0092J\2\u049b\u049c\7\t\2\2\u049c\u04a1\5\u009aN\2"+
		"\u049d\u049e\7\n\2\2\u049e\u04a0\5\u009aN\2\u049f\u049d\3\2\2\2\u04a0"+
		"\u04a3\3\2\2\2\u04a1\u049f\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a5\3\2"+
		"\2\2\u04a3\u04a1\3\2\2\2\u04a4\u0498\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5"+
		"\u04a6\3\2\2\2\u04a6\u04a8\7\23\2\2\u04a7\u046c\3\2\2\2\u04a7\u048a\3"+
		"\2\2\2\u04a8\u009b\3\2\2\2\u04a9\u04aa\5\22\n\2\u04aa\u04ab\7\u008a\2"+
		"\2\u04ab\u04b0\5\u009eP\2\u04ac\u04ad\7\n\2\2\u04ad\u04af\5\u009eP\2\u04ae"+
		"\u04ac\3\2\2\2\u04af\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2"+
		"\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04b4\7\n\2\2\u04b4"+
		"\u009d\3\2\2\2\u04b5\u04b6\5\u00b6\\\2\u04b6\u04b7\7\13\2\2\u04b7\u04b8"+
		"\5\16\b\2\u04b8\u04ba\5H%\2\u04b9\u04bb\5\u00a0Q\2\u04ba\u04b9\3\2\2\2"+
		"\u04ba\u04bb\3\2\2\2\u04bb\u009f\3\2\2\2\u04bc\u04bf\5\u00a2R\2\u04bd"+
		"\u04bf\5\u00a4S\2\u04be\u04bc\3\2\2\2\u04be\u04bd\3\2\2\2\u04bf\u00a1"+
		"\3\2\2\2\u04c0\u04c1\7\u0097\2\2\u04c1\u04c9\5\f\7\2\u04c2\u04c3\7\u0097"+
		"\2\2\u04c3\u04c9\5\u00d4k\2\u04c4\u04c5\7\u0097\2\2\u04c5\u04c9\7\u009f"+
		"\2\2\u04c6\u04c7\7\u0097\2\2\u04c7\u04c9\5\u0084C\2\u04c8\u04c0\3\2\2"+
		"\2\u04c8\u04c2\3\2\2\2\u04c8\u04c4\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u00a3"+
		"\3\2\2\2\u04ca\u04cb\7\b\2\2\u04cb\u04d3\5\f\7\2\u04cc\u04cd\7\b\2\2\u04cd"+
		"\u04d3\5\u00d4k\2\u04ce\u04cf\7\b\2\2\u04cf\u04d3\7\u009f\2\2\u04d0\u04d1"+
		"\7\b\2\2\u04d1\u04d3\5\u0084C\2\u04d2\u04ca\3\2\2\2\u04d2\u04cc\3\2\2"+
		"\2\u04d2\u04ce\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d3\u00a5\3\2\2\2\u04d4\u04d5"+
		"\7\u0087\2\2\u04d5\u04d6\7l\2\2\u04d6\u04d9\7p\2\2\u04d7\u04da\5\u00fa"+
		"~\2\u04d8\u04da\5\u00be`\2\u04d9\u04d7\3\2\2\2\u04d9\u04d8\3\2\2\2\u04da"+
		"\u04db\3\2\2\2\u04db\u04dc\7\n\2\2\u04dc\u04dd\7\u0087\2\2\u04dd\u04de"+
		"\7s\2\2\u04de\u04e1\7p\2\2\u04df\u04e2\5\u00fa~\2\u04e0\u04e2\5\u00be"+
		"`\2\u04e1\u04df\3\2\2\2\u04e1\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u04e4\7\n\2\2\u04e4\u04f8\3\2\2\2\u04e5\u04e6\7\u0087\2\2\u04e6\u04e7"+
		"\7l\2\2\u04e7\u04ea\7p\2\2\u04e8\u04eb\5\u00fa~\2\u04e9\u04eb\5\u00be"+
		"`\2\u04ea\u04e8\3\2\2\2\u04ea\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec"+
		"\u04ed\7\n\2\2\u04ed\u04f8\3\2\2\2\u04ee\u04ef\7\u0087\2\2\u04ef\u04f0"+
		"\7s\2\2\u04f0\u04f3\7p\2\2\u04f1\u04f4\5\u00fa~\2\u04f2\u04f4\5\u00be"+
		"`\2\u04f3\u04f1\3\2\2\2\u04f3\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5"+
		"\u04f6\7\n\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04d4\3\2\2\2\u04f7\u04e5\3\2"+
		"\2\2\u04f7\u04ee\3\2\2\2\u04f8\u00a7\3\2\2\2\u04f9\u04fa\5\16\b\2\u04fa"+
		"\u0500\5\u00aaV\2\u04fb\u0501\5 \21\2\u04fc\u0501\7c\2\2\u04fd\u0501\7"+
		"b\2\2\u04fe\u0501\7d\2\2\u04ff\u0501\7e\2\2\u0500\u04fb\3\2\2\2\u0500"+
		"\u04fc\3\2\2\2\u0500\u04fd\3\2\2\2\u0500\u04fe\3\2\2\2\u0500\u04ff\3\2"+
		"\2\2\u0501\u0502\3\2\2\2\u0502\u0503\7\n\2\2\u0503\u00a9\3\2\2\2\u0504"+
		"\u0507\5\u00acW\2\u0505\u0507\5\u00ba^\2\u0506\u0504\3\2\2\2\u0506\u0505"+
		"\3\2\2\2\u0507\u00ab\3\2\2\2\u0508\u0509\7\u0081\2\2\u0509\u050b\5\f\7"+
		"\2\u050a\u050c\5\u00aeX\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c"+
		"\u050d\3\2\2\2\u050d\u050e\7\n\2\2\u050e\u00ad\3\2\2\2\u050f\u0511\7\22"+
		"\2\2\u0510\u0512\5\u00dep\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512"+
		"\u0513\3\2\2\2\u0513\u051b\5\u00b0Y\2\u0514\u0516\7\n\2\2\u0515\u0517"+
		"\5\u00dep\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518\3\2\2"+
		"\2\u0518\u051a\5\u00b0Y\2\u0519\u0514\3\2\2\2\u051a\u051d\3\2\2\2\u051b"+
		"\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2\2\2\u051d\u051b\3\2"+
		"\2\2\u051e\u051f\7\23\2\2\u051f\u00af\3\2\2\2\u0520\u0537\5\u00b2Z\2\u0521"+
		"\u0522\7\u008a\2\2\u0522\u0537\5\u00b2Z\2\u0523\u0524\5\16\b\2\u0524\u0525"+
		"\7v\2\2\u0525\u0527\5\f\7\2\u0526\u0528\5\u00aeX\2\u0527\u0526\3\2\2\2"+
		"\u0527\u0528\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\7\13\2\2\u052a\u052b"+
		"\5\16\b\2\u052b\u052c\5\u00bc_\2\u052c\u052d\5\u00b4[\2\u052d\u0537\3"+
		"\2\2\2\u052e\u052f\5\16\b\2\u052f\u0530\7\u0081\2\2\u0530\u0532\5\f\7"+
		"\2\u0531\u0533\5\u00aeX\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533"+
		"\u0534\3\2\2\2\u0534\u0535\5\u00b4[\2\u0535\u0537\3\2\2\2\u0536\u0520"+
		"\3\2\2\2\u0536\u0521\3\2\2\2\u0536\u0523\3\2\2\2\u0536\u052e\3\2\2\2\u0537"+
		"\u00b1\3\2\2\2\u0538\u0539\5\u00b6\\\2\u0539\u053a\7\13\2\2\u053a\u053b"+
		"\5\16\b\2\u053b\u053c\5H%\2\u053c\u053d\5\u00b4[\2\u053d\u00b3\3\2\2\2"+
		"\u053e\u0540\7\b\2\2\u053f\u0541\5\u00dep\2\u0540\u053f\3\2\2\2\u0540"+
		"\u0541\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0544\5\u00c8e\2\u0543\u053e"+
		"\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u00b5\3\2\2\2\u0545\u054a\5\f\7\2\u0546"+
		"\u0547\7\t\2\2\u0547\u0549\5\f\7\2\u0548\u0546\3\2\2\2\u0549\u054c\3\2"+
		"\2\2\u054a\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u00b7\3\2\2\2\u054c"+
		"\u054a\3\2\2\2\u054d\u0552\5.\30\2\u054e\u054f\t\7\2\2\u054f\u0551\5."+
		"\30\2\u0550\u054e\3\2\2\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2\2\2\u0552"+
		"\u0553\3\2\2\2\u0553\u055e\3\2\2\2\u0554\u0552\3\2\2\2\u0555\u055a\5\u00da"+
		"n\2\u0556\u0557\t\7\2\2\u0557\u0559\5\u00dan\2\u0558\u0556\3\2\2\2\u0559"+
		"\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055e\3\2"+
		"\2\2\u055c\u055a\3\2\2\2\u055d\u054d\3\2\2\2\u055d\u0555\3\2\2\2\u055e"+
		"\u00b9\3\2\2\2\u055f\u0560\7v\2\2\u0560\u0562\5\f\7\2\u0561\u0563\5\u00ae"+
		"X\2\u0562\u0561\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564\3\2\2\2\u0564"+
		"\u0565\7\13\2\2\u0565\u0566\5\16\b\2\u0566\u0567\5\u00bc_\2\u0567\u0568"+
		"\7\n\2\2\u0568\u00bb\3\2\2\2\u0569\u056a\5P)\2\u056a\u00bd\3\2\2\2\u056b"+
		"\u056c\5$\23\2\u056c\u056d\7\13\2\2\u056d\u056e\5\u00c0a\2\u056e\u0571"+
		"\3\2\2\2\u056f\u0571\5\u00c0a\2\u0570\u056b\3\2\2\2\u0570\u056f\3\2\2"+
		"\2\u0571\u00bf\3\2\2\2\u0572\u0575\5\u00c2b\2\u0573\u0575\5\u00f8}\2\u0574"+
		"\u0572\3\2\2\2\u0574\u0573\3\2\2\2\u0575\u00c1\3\2\2\2\u0576\u057f\5\u00c4"+
		"c\2\u0577\u057f\5\u00e6t\2\u0578\u057f\5\u00ecw\2\u0579\u057f\5\u00ee"+
		"x\2\u057a\u057f\5\u00f0y\2\u057b\u057f\5\u00f2z\2\u057c\u057f\5\32\16"+
		"\2\u057d\u057f\5\u00f6|\2\u057e\u0576\3\2\2\2\u057e\u0577\3\2\2\2\u057e"+
		"\u0578\3\2\2\2\u057e\u0579\3\2\2\2\u057e\u057a\3\2\2\2\u057e\u057b\3\2"+
		"\2\2\u057e\u057c\3\2\2\2\u057e\u057d\3\2\2\2\u057f\u00c3\3\2\2\2\u0580"+
		"\u0581\5\u00c6d\2\u0581\u0582\7\b\2\2\u0582\u0583\5\u00c8e\2\u0583\u00c5"+
		"\3\2\2\2\u0584\u0585\7\31\2\2\u0585\u0588\5\f\7\2\u0586\u0588\5\f\7\2"+
		"\u0587\u0584\3\2\2\2\u0587\u0586\3\2\2\2\u0588\u05a4\3\2\2\2\u0589\u058a"+
		"\7\24\2\2\u058a\u058f\5\u00c8e\2\u058b\u058c\7\t\2\2\u058c\u058e\5\u00c8"+
		"e\2\u058d\u058b\3\2\2\2\u058e\u0591\3\2\2\2\u058f\u058d\3\2\2\2\u058f"+
		"\u0590\3\2\2\2\u0590\u0592\3\2\2\2\u0591\u058f\3\2\2\2\u0592\u0593\7\26"+
		"\2\2\u0593\u05a3\3\2\2\2\u0594\u0595\7\25\2\2\u0595\u059a\5\u00c8e\2\u0596"+
		"\u0597\7\t\2\2\u0597\u0599\5\u00c8e\2\u0598\u0596\3\2\2\2\u0599\u059c"+
		"\3\2\2\2\u059a\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059d\3\2\2\2\u059c"+
		"\u059a\3\2\2\2\u059d\u059e\7\27\2\2\u059e\u05a3\3\2\2\2\u059f\u05a0\7"+
		"\32\2\2\u05a0\u05a3\5\f\7\2\u05a1\u05a3\7\30\2\2\u05a2\u0589\3\2\2\2\u05a2"+
		"\u0594\3\2\2\2\u05a2\u059f\3\2\2\2\u05a2\u05a1\3\2\2\2\u05a3\u05a6\3\2"+
		"\2\2\u05a4\u05a2\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05aa\3\2\2\2\u05a6"+
		"\u05a4\3\2\2\2\u05a7\u05a8\7\13\2\2\u05a8\u05a9\7\13\2\2\u05a9\u05ab\5"+
		"\f\7\2\u05aa\u05a7\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u00c7\3\2\2\2\u05ac"+
		"\u05b0\5\u00ccg\2\u05ad\u05ae\5\u00caf\2\u05ae\u05af\5\u00c8e\2\u05af"+
		"\u05b1\3\2\2\2\u05b0\u05ad\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b5\3\2"+
		"\2\2\u05b2\u05b3\7\13\2\2\u05b3\u05b4\7\13\2\2\u05b4\u05b6\5\f\7\2\u05b5"+
		"\u05b2\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u00c9\3\2\2\2\u05b7\u05c1\7\f"+
		"\2\2\u05b8\u05c1\7\r\2\2\u05b9\u05c1\7\16\2\2\u05ba\u05c1\7\17\2\2\u05bb"+
		"\u05c1\7\20\2\2\u05bc\u05c1\7\21\2\2\u05bd\u05c1\7y\2\2\u05be\u05bf\7"+
		"}\2\2\u05bf\u05c1\7y\2\2\u05c0\u05b7\3\2\2\2\u05c0\u05b8\3\2\2\2\u05c0"+
		"\u05b9\3\2\2\2\u05c0\u05ba\3\2\2\2\u05c0\u05bb\3\2\2\2\u05c0\u05bc\3\2"+
		"\2\2\u05c0\u05bd\3\2\2\2\u05c0\u05be\3\2\2\2\u05c1\u00cb\3\2\2\2\u05c2"+
		"\u05c6\5\u00d0i\2\u05c3\u05c4\5\u00ceh\2\u05c4\u05c5\5\u00ccg\2\u05c5"+
		"\u05c7\3\2\2\2\u05c6\u05c3\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u00cd\3\2"+
		"\2\2\u05c8\u05c9\t\b\2\2\u05c9\u00cf\3\2\2\2\u05ca\u05ce\5\u00d4k\2\u05cb"+
		"\u05cc\5\u00d2j\2\u05cc\u05cd\5\u00d0i\2\u05cd\u05cf\3\2\2\2\u05ce\u05cb"+
		"\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u00d1\3\2\2\2\u05d0\u05d1\t\t\2\2\u05d1"+
		"\u00d3\3\2\2\2\u05d2\u05d4\t\5\2\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2"+
		"\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\5\u00d6l\2\u05d6\u00d5\3\2\2\2\u05d7"+
		"\u05e4\5\u00c6d\2\u05d8\u05d9\7\22\2\2\u05d9\u05da\5\u00c8e\2\u05da\u05db"+
		"\7\23\2\2\u05db\u05e4\3\2\2\2\u05dc\u05e4\5\u00dan\2\u05dd\u05e4\5\u00d8"+
		"m\2\u05de\u05e4\5\u00e0q\2\u05df\u05e0\7}\2\2\u05e0\u05e4\5\u00d6l\2\u05e1"+
		"\u05e4\58\35\2\u05e2\u05e4\5\32\16\2\u05e3\u05d7\3\2\2\2\u05e3\u05d8\3"+
		"\2\2\2\u05e3\u05dc\3\2\2\2\u05e3\u05dd\3\2\2\2\u05e3\u05de\3\2\2\2\u05e3"+
		"\u05df\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e2\3\2\2\2\u05e4\u00d7\3\2"+
		"\2\2\u05e5\u05ec\5\60\31\2\u05e6\u05ec\5,\27\2\u05e7\u05ec\5:\36\2\u05e8"+
		"\u05ec\7|\2\2\u05e9\u05ec\7\u009f\2\2\u05ea\u05ec\5:\36\2\u05eb\u05e5"+
		"\3\2\2\2\u05eb\u05e6\3\2\2\2\u05eb\u05e7\3\2\2\2\u05eb\u05e8\3\2\2\2\u05eb"+
		"\u05e9\3\2\2\2\u05eb\u05ea\3\2\2\2\u05ec\u00d9\3\2\2\2\u05ed\u05ee\5\f"+
		"\7\2\u05ee\u05ef\7\22\2\2\u05ef\u05f0\5\u00dco\2\u05f0\u05f1\7\23\2\2"+
		"\u05f1\u00db\3\2\2\2\u05f2\u05f4\5\u00dep\2\u05f3\u05f2\3\2\2\2\u05f3"+
		"\u05f4\3\2\2\2\u05f4\u05f6\3\2\2\2\u05f5\u05f7\5\u00e8u\2\u05f6\u05f5"+
		"\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u0601\3\2\2\2\u05f8\u05fa\7\t\2\2\u05f9"+
		"\u05fb\5\u00dep\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fd"+
		"\3\2\2\2\u05fc\u05fe\5\u00e8u\2\u05fd\u05fc\3\2\2\2\u05fd\u05fe\3\2\2"+
		"\2\u05fe\u0600\3\2\2\2\u05ff\u05f8\3\2\2\2\u0600\u0603\3\2\2\2\u0601\u05ff"+
		"\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u00dd\3\2\2\2\u0603\u0601\3\2\2\2\u0604"+
		"\u0605\t\n\2\2\u0605\u00df\3\2\2\2\u0606\u0607\7\24\2\2\u0607\u0608\5"+
		"\u00e2r\2\u0608\u0609\7\26\2\2\u0609\u0610\3\2\2\2\u060a\u060b\7\25\2"+
		"\2\u060b\u060c\5\u00e2r\2\u060c\u060d\7\27\2\2\u060d\u0610\3\2\2\2\u060e"+
		"\u0610\5\u0084C\2\u060f\u0606\3\2\2\2\u060f\u060a\3\2\2\2\u060f\u060e"+
		"\3\2\2\2\u0610\u00e1\3\2\2\2\u0611\u0616\5\u00e4s\2\u0612\u0613\7\t\2"+
		"\2\u0613\u0615\5\u00e4s\2\u0614\u0612\3\2\2\2\u0615\u0618\3\2\2\2\u0616"+
		"\u0614\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u061b\3\2\2\2\u0618\u0616\3\2"+
		"\2\2\u0619\u061b\3\2\2\2\u061a\u0611\3\2\2\2\u061a\u0619\3\2\2\2\u061b"+
		"\u00e3\3\2\2\2\u061c\u061f\5\u00c8e\2\u061d\u061e\7\33\2\2\u061e\u0620"+
		"\5\u00c8e\2\u061f\u061d\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u00e5\3\2\2"+
		"\2\u0621\u0626\5\f\7\2\u0622\u0623\7\22\2\2\u0623\u0624\5\u00dco\2\u0624"+
		"\u0625\7\23\2\2\u0625\u0627\3\2\2\2\u0626\u0622\3\2\2\2\u0626\u0627\3"+
		"\2\2\2\u0627\u00e7\3\2\2\2\u0628\u062c\5\u00c8e\2\u0629\u062b\5\u00ea"+
		"v\2\u062a\u0629\3\2\2\2\u062b\u062e\3\2\2\2\u062c\u062a\3\2\2\2\u062c"+
		"\u062d\3\2\2\2\u062d\u063d\3\2\2\2\u062e\u062c\3\2\2\2\u062f\u0630\5\f"+
		"\7\2\u0630\u0633\7\b\2\2\u0631\u0634\5\f\7\2\u0632\u0634\5\u00c8e\2\u0633"+
		"\u0631\3\2\2\2\u0633\u0632\3\2\2\2\u0634\u063d\3\2\2\2\u0635\u0636\5\f"+
		"\7\2\u0636\u0637\7\b\2\2\u0637\u0638\5\u00dep\2\u0638\u0639\7\22\2\2\u0639"+
		"\u063a\5\u00c8e\2\u063a\u063b\7\23\2\2\u063b\u063d\3\2\2\2\u063c\u0628"+
		"\3\2\2\2\u063c\u062f\3\2\2\2\u063c\u0635\3\2\2\2\u063d\u00e9\3\2\2\2\u063e"+
		"\u063f\7\13\2\2\u063f\u0640\5\u00c8e\2\u0640\u00eb\3\2\2\2\u0641\u0642"+
		"\7w\2\2\u0642\u0643\5$\23\2\u0643\u00ed\3\2\2\2\u0644\u0645\7\u0090\2"+
		"\2\u0645\u00ef\3\2\2\2\u0646\u0647\7\u0091\2\2\u0647\u00f1\3\2\2\2\u0648"+
		"\u0649\7\u0096\2\2\u0649\u064a\5\u00c8e\2\u064a\u00f3\3\2\2\2\u064b\u064c"+
		"\7\u00a5\2\2\u064c\u00f5\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u00f7\3\2\2"+
		"\2\u064f\u0654\5\u00fa~\2\u0650\u0654\5\u0100\u0081\2\u0651\u0654\5\u0108"+
		"\u0085\2\u0652\u0654\5\u0116\u008c\2\u0653\u064f\3\2\2\2\u0653\u0650\3"+
		"\2\2\2\u0653\u0651\3\2\2\2\u0653\u0652\3\2\2\2\u0654\u00f9\3\2\2\2\u0655"+
		"\u0656\7l\2\2\u0656\u0657\5\u00fe\u0080\2\u0657\u0658\7s\2\2\u0658\u00fb"+
		"\3\2\2\2\u0659\u065a\5\u00fe\u0080\2\u065a\u065b\7s\2\2\u065b\u00fd\3"+
		"\2\2\2\u065c\u0661\5\u00be`\2\u065d\u065e\7\n\2\2\u065e\u0660\5\u00be"+
		"`\2\u065f\u065d\3\2\2\2\u0660\u0663\3\2\2\2\u0661\u065f\3\2\2\2\u0661"+
		"\u0662\3\2\2\2\u0662\u0665\3\2\2\2\u0663\u0661\3\2\2\2\u0664\u0666\7\n"+
		"\2\2\u0665\u0664\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u00ff\3\2\2\2\u0667"+
		"\u066a\5\u0102\u0082\2\u0668\u066a\5\u0104\u0083\2\u0669\u0667\3\2\2\2"+
		"\u0669\u0668\3\2\2\2\u066a\u0101\3\2\2\2\u066b\u066c\7x\2\2\u066c\u066d"+
		"\5\u00c8e\2\u066d\u066e\7\u0086\2\2\u066e\u0670\5\u00be`\2\u066f\u0671"+
		"\7\n\2\2\u0670\u066f\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0677\3\2\2\2\u0672"+
		"\u0673\7r\2\2\u0673\u0675\5\u00be`\2\u0674\u0676\7\n\2\2\u0675\u0674\3"+
		"\2\2\2\u0675\u0676\3\2\2\2\u0676\u0678\3\2\2\2\u0677\u0672\3\2\2\2\u0677"+
		"\u0678\3\2\2\2\u0678\u0103\3\2\2\2\u0679\u067a\7m\2\2\u067a\u067b\5\u00c8"+
		"e\2\u067b\u0684\7~\2\2\u067c\u0681\5\u0106\u0084\2\u067d\u067e\7\n\2\2"+
		"\u067e\u0680\5\u0106\u0084\2\u067f\u067d\3\2\2\2\u0680\u0683\3\2\2\2\u0681"+
		"\u067f\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0685\3\2\2\2\u0683\u0681\3\2"+
		"\2\2\u0684\u067c\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u068b\3\2\2\2\u0686"+
		"\u0688\7\n\2\2\u0687\u0686\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u0689\3\2"+
		"\2\2\u0689\u068a\7\u0094\2\2\u068a\u068c\5\u00fe\u0080\2\u068b\u0687\3"+
		"\2\2\2\u068b\u068c\3\2\2\2\u068c\u068e\3\2\2\2\u068d\u068f\7\n\2\2\u068e"+
		"\u068d\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0691\7s"+
		"\2\2\u0691\u0105\3\2\2\2\u0692\u0693\5\u00b8]\2\u0693\u0694\7\13\2\2\u0694"+
		"\u0695\5\u00be`\2\u0695\u0107\3\2\2\2\u0696\u069a\5\u010a\u0086\2\u0697"+
		"\u069a\5\u010c\u0087\2\u0698\u069a\5\u010e\u0088\2\u0699\u0696\3\2\2\2"+
		"\u0699\u0697\3\2\2\2\u0699\u0698\3\2\2\2\u069a\u0109\3\2\2\2\u069b\u069c"+
		"\7\u008b\2\2\u069c\u069d\5\u00c8e\2\u069d\u069e\7p\2\2\u069e\u069f\5\u00be"+
		"`\2\u069f\u010b\3\2\2\2\u06a0\u06a1\7\u0084\2\2\u06a1\u06a2\5\u00fe\u0080"+
		"\2\u06a2\u06a3\7\u0089\2\2\u06a3\u06a4\5\u00c8e\2\u06a4\u010d\3\2\2\2"+
		"\u06a5\u06a6\7u\2\2\u06a6\u06a7\5\f\7\2\u06a7\u06a8\7\b\2\2\u06a8\u06a9"+
		"\5\u0110\u0089\2\u06a9\u06aa\7p\2\2\u06aa\u06ab\5\u00be`\2\u06ab\u06b4"+
		"\3\2\2\2\u06ac\u06ad\7u\2\2\u06ad\u06ae\5\f\7\2\u06ae\u06af\7y\2\2\u06af"+
		"\u06b0\5\u00c8e\2\u06b0\u06b1\7p\2\2\u06b1\u06b2\5\u00be`\2\u06b2\u06b4"+
		"\3\2\2\2\u06b3\u06a5\3\2\2\2\u06b3\u06ac\3\2\2\2\u06b4\u010f\3\2\2\2\u06b5"+
		"\u06b6\5\u0112\u008a\2\u06b6\u06b7\t\13\2\2\u06b7\u06b8\5\u0114\u008b"+
		"\2\u06b8\u0111\3\2\2\2\u06b9\u06ba\5\u00c8e\2\u06ba\u0113\3\2\2\2\u06bb"+
		"\u06bc\5\u00c8e\2\u06bc\u0115\3\2\2\2\u06bd\u06be\7\u008c\2\2\u06be\u06bf"+
		"\5\u0118\u008d\2\u06bf\u06c0\7p\2\2\u06c0\u06c1\5\u00be`\2\u06c1\u0117"+
		"\3\2\2\2\u06c2\u06c7\5\u00c6d\2\u06c3\u06c4\7\t\2\2\u06c4\u06c6\5\u00c6"+
		"d\2\u06c5\u06c3\3\2\2\2\u06c6\u06c9\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c7"+
		"\u06c8\3\2\2\2\u06c8\u06d3\3\2\2\2\u06c9\u06c7\3\2\2\2\u06ca\u06d3\5\u0080"+
		"A\2\u06cb\u06cc\7\t\2\2\u06cc\u06ce\5\u0080A\2\u06cd\u06cb\3\2\2\2\u06ce"+
		"\u06d1\3\2\2\2\u06cf\u06cd\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d3\3\2"+
		"\2\2\u06d1\u06cf\3\2\2\2\u06d2\u06c2\3\2\2\2\u06d2\u06ca\3\2\2\2\u06d2"+
		"\u06cf\3\2\2\2\u06d3\u0119\3\2\2\2\u06d4\u06d5\7#\2\2\u06d5\u06d6\7\u00a5"+
		"\2\2\u06d6\u011b\3\2\2\2\u06d7\u06d8\7$\2\2\u06d8\u06d9\7\u00a5\2\2\u06d9"+
		"\u011d\3\2\2\2\u06da\u06db\t\f\2\2\u06db\u06dc\7\u00a5\2\2\u06dc\u011f"+
		"\3\2\2\2\u06dd\u06de\7,\2\2\u06de\u06df\7\22\2\2\u06df\u06e0\5\f\7\2\u06e0"+
		"\u06e1\7\23\2\2\u06e1\u0121\3\2\2\2\u06e2\u06e3\t\r\2\2\u06e3\u06e4\7"+
		"\22\2\2\u06e4\u06e9\5\u00f4{\2\u06e5\u06e6\7\t\2\2\u06e6\u06e8\5\u00f4"+
		"{\2\u06e7\u06e5\3\2\2\2\u06e8\u06eb\3\2\2\2\u06e9\u06e7\3\2\2\2\u06e9"+
		"\u06ea\3\2\2\2\u06ea\u06ec\3\2\2\2\u06eb\u06e9\3\2\2\2\u06ec\u06ed\7\23"+
		"\2\2\u06ed\u0123\3\2\2\2\u06ee\u06ef\t\16\2\2\u06ef\u0125\3\2\2\2\u06f0"+
		"\u06f1\7\'\2\2\u06f1\u06f2\5\u00c8e\2\u06f2\u06f3\7(\2\2\u06f3\u06f5\5"+
		"\u0128\u0095\2\u06f4\u06f6\7\n\2\2\u06f5\u06f4\3\2\2\2\u06f5\u06f6\3\2"+
		"\2\2\u06f6\u0700\3\2\2\2\u06f7\u06f8\7)\2\2\u06f8\u06f9\5\u00c8e\2\u06f9"+
		"\u06fa\7(\2\2\u06fa\u06fc\5\u0128\u0095\2\u06fb\u06fd\7\n\2\2\u06fc\u06fb"+
		"\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u06ff\3\2\2\2\u06fe\u06f7\3\2\2\2\u06ff"+
		"\u0702\3\2\2\2\u0700\u06fe\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0708\3\2"+
		"\2\2\u0702\u0700\3\2\2\2\u0703\u0704\7*\2\2\u0704\u0706\5\u0128\u0095"+
		"\2\u0705\u0707\7\n\2\2\u0706\u0705\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0709"+
		"\3\2\2\2\u0708\u0703\3\2\2\2\u0708\u0709\3\2\2\2\u0709\u070a\3\2\2\2\u070a"+
		"\u070b\7+\2\2\u070b\u0127\3\2\2\2\u070c\u0710\5\u00be`\2\u070d\u0710\5"+
		"\u00c8e\2\u070e\u0710\5\34\17\2\u070f\u070c\3\2\2\2\u070f\u070d\3\2\2"+
		"\2\u070f\u070e\3\2\2\2\u0710\u0129\3\2\2\2\u00da\u012d\u0135\u013d\u0142"+
		"\u014a\u014e\u015b\u0166\u016a\u0175\u0177\u017b\u0180\u0188\u018d\u0195"+
		"\u019a\u01a2\u01a7\u01ad\u01b2\u01b6\u01bb\u01c8\u01d1\u01d3\u01d9\u01dc"+
		"\u01e7\u01ee\u01f6\u01fd\u0205\u0214\u0218\u0226\u022a\u022e\u023c\u024a"+
		"\u0252\u0255\u0259\u025b\u025f\u0266\u026b\u0272\u0286\u028d\u0295\u029b"+
		"\u02a4\u02b9\u02c0\u02cb\u02ce\u02d5\u02d8\u02df\u02e3\u02f2\u02f6\u02fd"+
		"\u0302\u0308\u032b\u0338\u0341\u034a\u0354\u035c\u035f\u036c\u036f\u0372"+
		"\u0377\u0379\u037d\u038a\u038d\u0390\u0395\u0397\u039a\u03a1\u03ae\u03b1"+
		"\u03b4\u03ba\u03c9\u03ce\u03d1\u03d6\u03d8\u03dc\u03e9\u03ec\u03ef\u03f5"+
		"\u0404\u0409\u040c\u0411\u0413\u0416\u041d\u0423\u0428\u0430\u0433\u0438"+
		"\u0440\u0443\u0446\u044a\u044e\u0456\u0459\u045c\u0460\u0463\u0467\u046c"+
		"\u0474\u0477\u047a\u0483\u0486\u048a\u0492\u0495\u0498\u04a1\u04a4\u04a7"+
		"\u04b0\u04ba\u04be\u04c8\u04d2\u04d9\u04e1\u04ea\u04f3\u04f7\u0500\u0506"+
		"\u050b\u0511\u0516\u051b\u0527\u0532\u0536\u0540\u0543\u054a\u0552\u055a"+
		"\u055d\u0562\u0570\u0574\u057e\u0587\u058f\u059a\u05a2\u05a4\u05aa\u05b0"+
		"\u05b5\u05c0\u05c6\u05ce\u05d3\u05e3\u05eb\u05f3\u05f6\u05fa\u05fd\u0601"+
		"\u060f\u0616\u061a\u061f\u0626\u062c\u0633\u063c\u0653\u0661\u0665\u0669"+
		"\u0670\u0675\u0677\u0681\u0684\u0687\u068b\u068e\u0699\u06b3\u06c7\u06cf"+
		"\u06d2\u06e9\u06f5\u06fc\u0700\u0706\u0708\u070f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}