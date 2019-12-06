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
		RULE_program = 0, RULE_programHeading = 1, RULE_identifier = 2, RULE_attributePart = 3, 
		RULE_attributeProgram = 4, RULE_attributeModule = 5, RULE_attributeType = 6, 
		RULE_attributeVar = 7, RULE_attributeDef = 8, RULE_preReservedWords = 9, 
		RULE_attribute = 10, RULE_directives = 11, RULE_blockDeclarations = 12, 
		RULE_block = 13, RULE_blockIn = 14, RULE_labelDeclarationPart = 15, RULE_label = 16, 
		RULE_constantDefinitionPart = 17, RULE_constantDefinition = 18, RULE_constantName = 19, 
		RULE_constantChr = 20, RULE_constant = 21, RULE_unsignedNumber = 22, RULE_unsignedInteger = 23, 
		RULE_unsignedReal = 24, RULE_sign = 25, RULE_bool = 26, RULE_string = 27, 
		RULE_valueDefinitionPart = 28, RULE_variableName = 29, RULE_typeDefinitionPart = 30, 
		RULE_typeDefinition = 31, RULE_functionType = 32, RULE_procedureType = 33, 
		RULE_type = 34, RULE_simpleType = 35, RULE_enumType = 36, RULE_subrangeType = 37, 
		RULE_typeIdentifier = 38, RULE_structuredType = 39, RULE_unpackedStructuredType = 40, 
		RULE_stringtype = 41, RULE_varyingType = 42, RULE_arrayType = 43, RULE_typeList = 44, 
		RULE_indexType = 45, RULE_componentType = 46, RULE_recordType = 47, RULE_fieldList = 48, 
		RULE_fixedPart = 49, RULE_recordSection = 50, RULE_variantPart = 51, RULE_tag = 52, 
		RULE_variant = 53, RULE_setType = 54, RULE_baseType = 55, RULE_fileType = 56, 
		RULE_textType = 57, RULE_pointerType = 58, RULE_schemaType = 59, RULE_schemaList = 60, 
		RULE_schemaName = 61, RULE_prototypeType = 62, RULE_prototypeList = 63, 
		RULE_constructorValue = 64, RULE_constructorArray = 65, RULE_typeName = 66, 
		RULE_componentValue = 67, RULE_constructorRecord = 68, RULE_initializerList = 69, 
		RULE_initializerItem = 70, RULE_tagValue = 71, RULE_constructorSet = 72, 
		RULE_constructorNonStdArray = 73, RULE_componentValueN = 74, RULE_constructorNonStdRecord = 75, 
		RULE_variableDeclarationPart = 76, RULE_variableDeclaration = 77, RULE_variablePreDeclaration = 78, 
		RULE_variablePreDeclarationValue = 79, RULE_variablePreDeclarationAssign = 80, 
		RULE_toBeginEndDoDeclarationPart = 81, RULE_procedureAndFunctionDeclarationPart = 82, 
		RULE_procedureOrFunctionDeclaration = 83, RULE_procedureDeclaration = 84, 
		RULE_formalParameterList = 85, RULE_formalParameterSection = 86, RULE_parameterGroup = 87, 
		RULE_assignExpression = 88, RULE_identifierList = 89, RULE_constList = 90, 
		RULE_functionDeclaration = 91, RULE_resultType = 92, RULE_statement = 93, 
		RULE_unlabelledStatement = 94, RULE_simpleStatement = 95, RULE_assignmentStatement = 96, 
		RULE_variable = 97, RULE_expression = 98, RULE_relationaloperator = 99, 
		RULE_simpleExpression = 100, RULE_additiveoperator = 101, RULE_term = 102, 
		RULE_multiplicativeoperator = 103, RULE_signedFactor = 104, RULE_factor = 105, 
		RULE_unsignedConstant = 106, RULE_functionDesignator = 107, RULE_parameterList = 108, 
		RULE_attibuteFuncParam = 109, RULE_set = 110, RULE_elementList = 111, 
		RULE_element = 112, RULE_procedureStatement = 113, RULE_actualParameter = 114, 
		RULE_parameterwidth = 115, RULE_gotoStatement = 116, RULE_breakStatement = 117, 
		RULE_continueStatement = 118, RULE_returnStatement = 119, RULE_stringExpression = 120, 
		RULE_emptyStatement = 121, RULE_structuredStatement = 122, RULE_compoundStatement = 123, 
		RULE_openCompoundStatement = 124, RULE_statements = 125, RULE_conditionalStatement = 126, 
		RULE_ifStatement = 127, RULE_caseStatement = 128, RULE_caseListElement = 129, 
		RULE_repetetiveStatement = 130, RULE_whileStatement = 131, RULE_repeatStatement = 132, 
		RULE_forStatement = 133, RULE_forList = 134, RULE_initialValue = 135, 
		RULE_finalValue = 136, RULE_withStatement = 137, RULE_recordVariableList = 138, 
		RULE_includeDirective = 139, RULE_dictionaryDirective = 140, RULE_titleDirective = 141, 
		RULE_pDefinedDirective = 142, RULE_messageDirective = 143, RULE_infoFuncDirective = 144, 
		RULE_pIfDirective = 145, RULE_pIfToken = 146;
	public static final String[] ruleNames = {
		"program", "programHeading", "identifier", "attributePart", "attributeProgram", 
		"attributeModule", "attributeType", "attributeVar", "attributeDef", "preReservedWords", 
		"attribute", "directives", "blockDeclarations", "block", "blockIn", "labelDeclarationPart", 
		"label", "constantDefinitionPart", "constantDefinition", "constantName", 
		"constantChr", "constant", "unsignedNumber", "unsignedInteger", "unsignedReal", 
		"sign", "bool", "string", "valueDefinitionPart", "variableName", "typeDefinitionPart", 
		"typeDefinition", "functionType", "procedureType", "type", "simpleType", 
		"enumType", "subrangeType", "typeIdentifier", "structuredType", "unpackedStructuredType", 
		"stringtype", "varyingType", "arrayType", "typeList", "indexType", "componentType", 
		"recordType", "fieldList", "fixedPart", "recordSection", "variantPart", 
		"tag", "variant", "setType", "baseType", "fileType", "textType", "pointerType", 
		"schemaType", "schemaList", "schemaName", "prototypeType", "prototypeList", 
		"constructorValue", "constructorArray", "typeName", "componentValue", 
		"constructorRecord", "initializerList", "initializerItem", "tagValue", 
		"constructorSet", "constructorNonStdArray", "componentValueN", "constructorNonStdRecord", 
		"variableDeclarationPart", "variableDeclaration", "variablePreDeclaration", 
		"variablePreDeclarationValue", "variablePreDeclarationAssign", "toBeginEndDoDeclarationPart", 
		"procedureAndFunctionDeclarationPart", "procedureOrFunctionDeclaration", 
		"procedureDeclaration", "formalParameterList", "formalParameterSection", 
		"parameterGroup", "assignExpression", "identifierList", "constList", "functionDeclaration", 
		"resultType", "statement", "unlabelledStatement", "simpleStatement", "assignmentStatement", 
		"variable", "expression", "relationaloperator", "simpleExpression", "additiveoperator", 
		"term", "multiplicativeoperator", "signedFactor", "factor", "unsignedConstant", 
		"functionDesignator", "parameterList", "attibuteFuncParam", "set", "elementList", 
		"element", "procedureStatement", "actualParameter", "parameterwidth", 
		"gotoStatement", "breakStatement", "continueStatement", "returnStatement", 
		"stringExpression", "emptyStatement", "structuredStatement", "compoundStatement", 
		"openCompoundStatement", "statements", "conditionalStatement", "ifStatement", 
		"caseStatement", "caseListElement", "repetetiveStatement", "whileStatement", 
		"repeatStatement", "forStatement", "forList", "initialValue", "finalValue", 
		"withStatement", "recordVariableList", "includeDirective", "dictionaryDirective", 
		"titleDirective", "pDefinedDirective", "messageDirective", "infoFuncDirective", 
		"pIfDirective", "pIfToken"
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
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT))) != 0)) {
				{
				{
				setState(294);
				directives();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			programHeading();
			setState(301);
			block();
			setState(302);
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
		public AttributeProgramContext attributeProgram() {
			return getRuleContext(AttributeProgramContext.class,0);
		}
		public TerminalNode PROGRAM() { return getToken(pascalParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public AttributeModuleContext attributeModule() {
			return getRuleContext(AttributeModuleContext.class,0);
		}
		public TerminalNode MODULE() { return getToken(pascalParser.MODULE, 0); }
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
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				attributeProgram();
				setState(305);
				match(PROGRAM);
				setState(306);
				identifier();
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(307);
					match(LPAREN);
					setState(308);
					identifierList();
					setState(309);
					match(RPAREN);
					}
				}

				setState(313);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				attributeModule();
				setState(316);
				match(MODULE);
				setState(317);
				identifier();
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(318);
					match(LPAREN);
					setState(319);
					identifierList();
					setState(320);
					match(RPAREN);
					}
				}

				setState(324);
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
		enterRule(_localctx, 4, RULE_identifier);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				attribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				preReservedWords();
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
		enterRule(_localctx, 6, RULE_attributePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(333);
				match(LBRACK);
				setState(334);
				attributeDef();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(335);
					match(COMMA);
					setState(336);
					attributeDef();
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342);
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

	public static class AttributeProgramContext extends ParserRuleContext {
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
		public AttributeProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeProgram; }
	}

	public final AttributeProgramContext attributeProgram() throws RecognitionException {
		AttributeProgramContext _localctx = new AttributeProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attributeProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(346);
				match(LBRACK);
				setState(347);
				attributeDef();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(348);
					match(COMMA);
					setState(349);
					attributeDef();
					}
					}
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(355);
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

	public static class AttributeModuleContext extends ParserRuleContext {
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
		public AttributeModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeModule; }
	}

	public final AttributeModuleContext attributeModule() throws RecognitionException {
		AttributeModuleContext _localctx = new AttributeModuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attributeModule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(359);
				match(LBRACK);
				setState(360);
				attributeDef();
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(361);
					match(COMMA);
					setState(362);
					attributeDef();
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(368);
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
		enterRule(_localctx, 12, RULE_attributeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(372);
				match(LBRACK);
				setState(373);
				attributeDef();
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(374);
					match(COMMA);
					setState(375);
					attributeDef();
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
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
		enterRule(_localctx, 14, RULE_attributeVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(385);
				match(LBRACK);
				setState(386);
				attributeDef();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(387);
					match(COMMA);
					setState(388);
					attributeDef();
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(394);
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
		enterRule(_localctx, 16, RULE_attributeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			attribute();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(399);
				match(LPAREN);
				setState(402);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(400);
					constant();
					}
					break;
				case 2:
					{
					setState(401);
					identifier();
					}
					break;
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(404);
					match(COMMA);
					setState(407);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(405);
						constant();
						}
						break;
					case 2:
						{
						setState(406);
						identifier();
						}
						break;
					}
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(414);
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
		public TerminalNode AND_THEN() { return getToken(pascalParser.AND_THEN, 0); }
		public TerminalNode BREAK() { return getToken(pascalParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(pascalParser.CONTINUE, 0); }
		public TerminalNode MODULE() { return getToken(pascalParser.MODULE, 0); }
		public TerminalNode OR_ELSE() { return getToken(pascalParser.OR_ELSE, 0); }
		public TerminalNode OTHERWISE() { return getToken(pascalParser.OTHERWISE, 0); }
		public TerminalNode REM() { return getToken(pascalParser.REM, 0); }
		public TerminalNode RETURN() { return getToken(pascalParser.RETURN, 0); }
		public TerminalNode VALUE() { return getToken(pascalParser.VALUE, 0); }
		public TerminalNode VARYING() { return getToken(pascalParser.VARYING, 0); }
		public TerminalNode TEXT() { return getToken(pascalParser.TEXT, 0); }
		public TerminalNode STRING() { return getToken(pascalParser.STRING, 0); }
		public TerminalNode CHR() { return getToken(pascalParser.CHR, 0); }
		public TerminalNode CHAR() { return getToken(pascalParser.CHAR, 0); }
		public TerminalNode TRUE() { return getToken(pascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pascalParser.FALSE, 0); }
		public TerminalNode ZERO() { return getToken(pascalParser.ZERO, 0); }
		public PreReservedWordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preReservedWords; }
	}

	public final PreReservedWordsContext preReservedWords() throws RecognitionException {
		PreReservedWordsContext _localctx = new PreReservedWordsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_preReservedWords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !(((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (AND_THEN - 141)) | (1L << (BREAK - 141)) | (1L << (CONTINUE - 141)) | (1L << (MODULE - 141)) | (1L << (OR_ELSE - 141)) | (1L << (OTHERWISE - 141)) | (1L << (REM - 141)) | (1L << (RETURN - 141)) | (1L << (VALUE - 141)) | (1L << (VARYING - 141)) | (1L << (CHAR - 141)) | (1L << (CHR - 141)) | (1L << (FALSE - 141)) | (1L << (STRING - 141)) | (1L << (TEXT - 141)) | (1L << (TRUE - 141)) | (1L << (ZERO - 141)))) != 0)) ) {
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
		public TerminalNode INHERIT() { return getToken(pascalParser.INHERIT, 0); }
		public TerminalNode ENVIRONMENT() { return getToken(pascalParser.ENVIRONMENT, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (VALUE - 139)))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_directives);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_INCLUDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				includeDirective();
				}
				break;
			case P_DICTIONARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				dictionaryDirective();
				}
				break;
			case P_TITLE:
			case P_SUBTITLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				titleDirective();
				}
				break;
			case P_DEFINED:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				pDefinedDirective();
				}
				break;
			case P_ERROR:
			case P_WARN:
			case P_INFO:
			case P_MESSAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
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
				setState(427);
				infoFuncDirective();
				}
				break;
			case P_IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(428);
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
		enterRule(_localctx, 24, RULE_blockDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (CONST - 108)) | (1L << (FUNCTION - 108)) | (1L << (LABEL - 108)) | (1L << (PROCEDURE - 108)) | (1L << (TYPE - 108)) | (1L << (VAR - 108)) | (1L << (VALUE - 108)))) != 0)) {
				{
				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(431);
					directives();
					}
					break;
				case 2:
					{
					setState(432);
					labelDeclarationPart();
					}
					break;
				case 3:
					{
					setState(433);
					constantDefinitionPart();
					}
					break;
				case 4:
					{
					setState(434);
					typeDefinitionPart();
					}
					break;
				case 5:
					{
					setState(435);
					valueDefinitionPart();
					}
					break;
				case 6:
					{
					setState(436);
					variableDeclarationPart();
					}
					break;
				case 7:
					{
					setState(437);
					procedureAndFunctionDeclarationPart();
					}
					break;
				}
				}
				setState(442);
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
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			blockDeclarations();
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(444);
				compoundStatement();
				}
				break;
			case END:
			case TO:
				{
				{
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(445);
					toBeginEndDoDeclarationPart();
					}
				}

				setState(448);
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
		enterRule(_localctx, 28, RULE_blockIn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			blockDeclarations();
			setState(452);
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
		enterRule(_localctx, 30, RULE_labelDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(LABEL);
			setState(455);
			label();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(456);
				match(COMMA);
				setState(457);
				label();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
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
		enterRule(_localctx, 32, RULE_label);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
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
			case INHERIT:
			case ENVIRONMENT:
			case AND_THEN:
			case BREAK:
			case CONTINUE:
			case MODULE:
			case OR_ELSE:
			case OTHERWISE:
			case REM:
			case RETURN:
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
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
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
		public List<IncludeDirectiveContext> includeDirective() {
			return getRuleContexts(IncludeDirectiveContext.class);
		}
		public IncludeDirectiveContext includeDirective(int i) {
			return getRuleContext(IncludeDirectiveContext.class,i);
		}
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
		enterRule(_localctx, 34, RULE_constantDefinitionPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(CONST);
			setState(474); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(474);
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
					case INHERIT:
					case ENVIRONMENT:
					case AND_THEN:
					case BREAK:
					case CONTINUE:
					case MODULE:
					case OR_ELSE:
					case OTHERWISE:
					case REM:
					case RETURN:
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
						{
						{
						setState(470);
						constantDefinition();
						setState(471);
						match(SEMI);
						}
						}
						break;
					case P_INCLUDE:
						{
						setState(473);
						includeDirective();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(476); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 36, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			constantName();
			setState(479);
			match(EQUAL);
			setState(480);
			attributePart();
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(481);
				constant();
				}
				break;
			case 2:
				{
				setState(482);
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
		enterRule(_localctx, 38, RULE_constantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
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
		enterRule(_localctx, 40, RULE_constantChr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(CHR);
			setState(488);
			match(LPAREN);
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				{
				setState(489);
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
			case INHERIT:
			case ENVIRONMENT:
			case AND_THEN:
			case BREAK:
			case CONTINUE:
			case MODULE:
			case OR_ELSE:
			case OTHERWISE:
			case REM:
			case RETURN:
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
				{
				setState(490);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(493);
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
		enterRule(_localctx, 42, RULE_constant);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				sign();
				setState(497);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(500);
				sign();
				setState(501);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(503);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(504);
				constantChr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(505);
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
		enterRule(_localctx, 44, RULE_unsignedNumber);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
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
		enterRule(_localctx, 46, RULE_unsignedInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
		enterRule(_localctx, 48, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
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
		enterRule(_localctx, 50, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
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
		enterRule(_localctx, 52, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
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
		enterRule(_localctx, 54, RULE_string);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(STRING_LITERAL);
			setState(532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(521);
					match(LPAREN);
					setState(524);
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
					case INHERIT:
					case ENVIRONMENT:
					case AND_THEN:
					case BREAK:
					case CONTINUE:
					case MODULE:
					case OR_ELSE:
					case OTHERWISE:
					case REM:
					case RETURN:
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
						{
						setState(522);
						identifier();
						}
						break;
					case NUM_INT:
						{
						setState(523);
						match(NUM_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(526);
					match(RPAREN);
					setState(528);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(527);
						string();
						}
						break;
					}
					}
					} 
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 56, RULE_valueDefinitionPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(VALUE);
			setState(536);
			variableName();
			setState(537);
			match(ASSIGN);
			setState(538);
			expression();
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(539);
					match(SEMI);
					setState(540);
					variableName();
					setState(541);
					match(ASSIGN);
					setState(542);
					expression();
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(549);
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
		enterRule(_localctx, 58, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
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
		public List<IncludeDirectiveContext> includeDirective() {
			return getRuleContexts(IncludeDirectiveContext.class);
		}
		public IncludeDirectiveContext includeDirective(int i) {
			return getRuleContext(IncludeDirectiveContext.class,i);
		}
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
		enterRule(_localctx, 60, RULE_typeDefinitionPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			attributeType();
			setState(554);
			match(TYPE);
			setState(559); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(559);
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
					case INHERIT:
					case ENVIRONMENT:
					case AND_THEN:
					case BREAK:
					case CONTINUE:
					case MODULE:
					case OR_ELSE:
					case OTHERWISE:
					case REM:
					case RETURN:
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
						{
						{
						setState(555);
						typeDefinition();
						setState(556);
						match(SEMI);
						}
						}
						break;
					case P_INCLUDE:
						{
						setState(558);
						includeDirective();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(561); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 62, RULE_typeDefinition);
		int _la;
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				typeName();
				setState(564);
				match(EQUAL);
				setState(565);
				attributePart();
				setState(569);
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
				case INHERIT:
				case ENVIRONMENT:
				case AND_THEN:
				case BREAK:
				case CONTINUE:
				case MODULE:
				case OR_ELSE:
				case OTHERWISE:
				case REM:
				case RETURN:
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
					setState(566);
					type();
					}
					break;
				case FUNCTION:
					{
					setState(567);
					functionType();
					}
					break;
				case PROCEDURE:
					{
					setState(568);
					procedureType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE) {
					{
					setState(571);
					variablePreDeclarationValue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				schemaType();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE) {
					{
					setState(575);
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
		enterRule(_localctx, 64, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(FUNCTION);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(581);
				formalParameterList();
				}
			}

			setState(584);
			match(COLON);
			setState(585);
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
		enterRule(_localctx, 66, RULE_procedureType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(PROCEDURE);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(588);
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
		enterRule(_localctx, 68, RULE_type);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				structuredType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
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
		enterRule(_localctx, 70, RULE_simpleType);
		try {
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				enumType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(599);
				stringtype();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(600);
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
		enterRule(_localctx, 72, RULE_enumType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(LPAREN);
			setState(604);
			identifierList();
			setState(605);
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
		enterRule(_localctx, 74, RULE_subrangeType);
		try {
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				constant();
				setState(608);
				match(DOTDOT);
				setState(609);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				expression();
				setState(612);
				match(DOTDOT);
				setState(613);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(615);
				expression();
				setState(616);
				match(DOTDOT);
				setState(617);
				expression();
				setState(618);
				match(COLON);
				setState(619);
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
		enterRule(_localctx, 76, RULE_typeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
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
		enterRule(_localctx, 78, RULE_structuredType);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKED:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(PACKED);
				setState(626);
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
				setState(627);
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
		enterRule(_localctx, 80, RULE_unpackedStructuredType);
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(633);
				fileType();
				}
				break;
			case LBRACK:
			case TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(634);
				textType();
				}
				break;
			case VARYING:
				enterOuterAlt(_localctx, 6);
				{
				setState(635);
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
		enterRule(_localctx, 82, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(STRING);
			setState(639);
			match(LPAREN);
			setState(642);
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
			case INHERIT:
			case ENVIRONMENT:
			case AND_THEN:
			case BREAK:
			case CONTINUE:
			case MODULE:
			case OR_ELSE:
			case OTHERWISE:
			case REM:
			case RETURN:
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
				{
				setState(640);
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
				setState(641);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(644);
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
		enterRule(_localctx, 84, RULE_varyingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(VARYING);
			setState(647);
			match(LBRACK);
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(648);
				constant();
				}
				break;
			case 2:
				{
				setState(649);
				identifier();
				}
				break;
			case 3:
				{
				setState(650);
				expression();
				}
				break;
			}
			setState(653);
			match(RBRACK);
			setState(654);
			match(OF);
			setState(655);
			attributePart();
			setState(656);
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
		enterRule(_localctx, 86, RULE_arrayType);
		try {
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(ARRAY);
				setState(659);
				match(LBRACK);
				setState(660);
				typeList();
				setState(661);
				match(RBRACK);
				setState(662);
				match(OF);
				setState(663);
				componentType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				match(ARRAY);
				setState(666);
				match(LBRACK2);
				setState(667);
				typeList();
				setState(668);
				match(RBRACK2);
				setState(669);
				match(OF);
				setState(670);
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
		enterRule(_localctx, 88, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			indexType();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(675);
				match(COMMA);
				setState(676);
				indexType();
				}
				}
				setState(681);
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
		enterRule(_localctx, 90, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			attributePart();
			setState(683);
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
		enterRule(_localctx, 92, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			attributePart();
			setState(686);
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
		enterRule(_localctx, 94, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(RECORD);
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)) | (1L << (CASE - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
				{
				setState(689);
				fieldList();
				}
			}

			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(692);
				match(SEMI);
				}
			}

			setState(695);
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
		enterRule(_localctx, 96, RULE_fieldList);
		try {
			setState(703);
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
			case INHERIT:
			case ENVIRONMENT:
			case AND_THEN:
			case BREAK:
			case CONTINUE:
			case MODULE:
			case OR_ELSE:
			case OTHERWISE:
			case REM:
			case RETURN:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				fixedPart();
				setState(700);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(698);
					match(SEMI);
					setState(699);
					variantPart();
					}
					break;
				}
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
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
		enterRule(_localctx, 98, RULE_fixedPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			recordSection();
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(706);
					match(SEMI);
					setState(707);
					recordSection();
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(713);
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
		public VariablePreDeclarationContext variablePreDeclaration() {
			return getRuleContext(VariablePreDeclarationContext.class,0);
		}
		public RecordSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordSection; }
	}

	public final RecordSectionContext recordSection() throws RecognitionException {
		RecordSectionContext _localctx = new RecordSectionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_recordSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			identifierList();
			setState(717);
			match(COLON);
			setState(718);
			attributePart();
			setState(719);
			type();
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==VALUE) {
				{
				setState(720);
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
		enterRule(_localctx, 102, RULE_variantPart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(CASE);
			setState(724);
			tag();
			setState(725);
			match(OF);
			setState(726);
			variant();
			setState(731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(727);
					match(SEMI);
					setState(728);
					variant();
					}
					} 
				}
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(734);
					match(SEMI);
					}
				}

				setState(737);
				match(OTHERWISE);
				setState(738);
				match(LPAREN);
				setState(739);
				fieldList();
				setState(740);
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
		enterRule(_localctx, 104, RULE_tag);
		try {
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(744);
					identifier();
					setState(745);
					match(COLON);
					}
					break;
				}
				setState(749);
				attributePart();
				setState(750);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
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
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public VariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant; }
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_variant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			constList();
			setState(756);
			match(COLON);
			setState(757);
			match(LPAREN);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)) | (1L << (CASE - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
				{
				setState(758);
				fieldList();
				}
			}

			setState(761);
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
		enterRule(_localctx, 108, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(SET);
			setState(764);
			match(OF);
			setState(765);
			attributePart();
			setState(766);
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
		enterRule(_localctx, 110, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
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
		enterRule(_localctx, 112, RULE_fileType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(FILE);
			setState(771);
			match(OF);
			setState(772);
			attributePart();
			setState(773);
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
		enterRule(_localctx, 114, RULE_textType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			attributePart();
			setState(776);
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
		enterRule(_localctx, 116, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			attributePart();
			setState(779);
			match(POINTER_);
			setState(780);
			attributePart();
			setState(781);
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
		enterRule(_localctx, 118, RULE_schemaType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			schemaName();
			setState(784);
			match(LPAREN);
			setState(785);
			schemaList();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(786);
				match(SEMI);
				setState(787);
				schemaList();
				}
				}
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(793);
			match(RPAREN);
			setState(794);
			match(EQUAL);
			setState(795);
			attributePart();
			setState(796);
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
		enterRule(_localctx, 120, RULE_schemaList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(798);
			identifier();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(799);
				match(COMMA);
				setState(800);
				identifier();
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
			match(COLON);
			setState(807);
			attributePart();
			setState(808);
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
		enterRule(_localctx, 122, RULE_schemaName);
		try {
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
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
		enterRule(_localctx, 124, RULE_prototypeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			schemaName();
			setState(815);
			match(LPAREN);
			setState(816);
			prototypeList();
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(817);
				match(SEMI);
				setState(818);
				prototypeList();
				}
				}
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(824);
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
		enterRule(_localctx, 126, RULE_prototypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			expression();
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(827);
				match(COMMA);
				setState(828);
				expression();
				}
				}
				setState(833);
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
		enterRule(_localctx, 128, RULE_constructorValue);
		try {
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				constructorArray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				constructorRecord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				constructorSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(837);
				constructorNonStdArray();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(838);
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
		enterRule(_localctx, 130, RULE_constructorArray);
		int _la;
		try {
			int _alt;
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(841);
					typeName();
					}
				}

				setState(844);
				match(LBRACK);
				setState(858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(845);
					initializerList();
					setState(846);
					match(COLON);
					setState(847);
					componentValue();
					setState(855);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(848);
							match(SEMI);
							setState(849);
							initializerList();
							setState(850);
							match(COLON);
							setState(851);
							componentValue();
							}
							} 
						}
						setState(857);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					}
					}
					break;
				}
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(861);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(860);
						match(SEMI);
						}
					}

					setState(863);
					match(OTHERWISE);
					setState(864);
					componentValue();
					setState(866);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(865);
						match(SEMI);
						}
					}

					}
				}

				setState(870);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(871);
					typeName();
					}
				}

				setState(874);
				match(LBRACK);
				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(875);
					initializerList();
					setState(876);
					match(COLON);
					setState(877);
					constructorArray();
					setState(885);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(878);
							match(SEMI);
							setState(879);
							initializerList();
							setState(880);
							match(COLON);
							setState(881);
							constructorArray();
							}
							} 
						}
						setState(887);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
					}
					}
					break;
				}
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(891);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(890);
						match(SEMI);
						}
					}

					setState(893);
					match(OTHERWISE);
					setState(894);
					constructorArray();
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(895);
						match(SEMI);
						}
					}

					}
				}

				setState(900);
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
		enterRule(_localctx, 132, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
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
		enterRule(_localctx, 134, RULE_componentValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
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
		enterRule(_localctx, 136, RULE_constructorRecord);
		int _la;
		try {
			int _alt;
			setState(1025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(907);
					typeName();
					}
				}

				setState(910);
				match(LBRACK);
				setState(924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(911);
					initializerList();
					setState(912);
					match(COLON);
					setState(913);
					componentValue();
					setState(921);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(914);
							match(SEMI);
							setState(915);
							initializerList();
							setState(916);
							match(COLON);
							setState(917);
							componentValue();
							}
							} 
						}
						setState(923);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
					}
					}
					break;
				}
				setState(953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(926);
						match(SEMI);
						}
					}

					setState(929);
					match(CASE);
					setState(933);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(930);
						identifier();
						setState(931);
						match(COLON);
						}
						break;
					}
					setState(935);
					tagValue();
					setState(936);
					match(OF);
					setState(937);
					match(LBRACK);
					{
					setState(938);
					initializerList();
					setState(939);
					match(COLON);
					setState(940);
					componentValue();
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(941);
						match(SEMI);
						setState(942);
						initializerList();
						setState(943);
						match(COLON);
						setState(944);
						componentValue();
						}
						}
						setState(950);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(951);
					match(RBRACK);
					}
					break;
				}
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(956);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(955);
						match(SEMI);
						}
					}

					setState(958);
					match(OTHERWISE);
					setState(959);
					match(ZERO);
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(960);
						match(SEMI);
						}
					}

					}
				}

				setState(965);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(966);
					typeName();
					}
				}

				setState(969);
				match(LBRACK);
				setState(983);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(970);
					initializerList();
					setState(971);
					match(COLON);
					setState(972);
					constructorRecord();
					setState(980);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(973);
							match(SEMI);
							setState(974);
							initializerList();
							setState(975);
							match(COLON);
							setState(976);
							constructorRecord();
							}
							} 
						}
						setState(982);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
					}
					}
					break;
				}
				setState(1012);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(985);
						match(SEMI);
						}
					}

					setState(988);
					match(CASE);
					setState(992);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						setState(989);
						identifier();
						setState(990);
						match(COLON);
						}
						break;
					}
					setState(994);
					tagValue();
					setState(995);
					match(OF);
					setState(996);
					match(LBRACK);
					{
					setState(997);
					initializerList();
					setState(998);
					match(COLON);
					setState(999);
					constructorRecord();
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1000);
						match(SEMI);
						setState(1001);
						initializerList();
						setState(1002);
						match(COLON);
						setState(1003);
						constructorRecord();
						}
						}
						setState(1009);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(1010);
					match(RBRACK);
					}
					break;
				}
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(1015);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1014);
						match(SEMI);
						}
					}

					setState(1017);
					match(OTHERWISE);
					setState(1018);
					match(ZERO);
					setState(1020);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1019);
						match(SEMI);
						}
					}

					}
				}

				setState(1024);
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
		enterRule(_localctx, 138, RULE_initializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			initializerItem();
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1028);
				match(COMMA);
				setState(1029);
				initializerItem();
				}
				}
				setState(1034);
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
		enterRule(_localctx, 140, RULE_initializerItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1035);
				identifier();
				}
				break;
			case 2:
				{
				setState(1036);
				match(NUM_INT);
				}
				break;
			case 3:
				{
				setState(1037);
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
		enterRule(_localctx, 142, RULE_tagValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
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
		enterRule(_localctx, 144, RULE_constructorSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
				{
				setState(1042);
				typeName();
				}
			}

			setState(1045);
			match(LBRACK);
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
				{
				setState(1046);
				componentValue();
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1047);
					match(SEMI);
					setState(1048);
					componentValue();
					}
					}
					setState(1053);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1056);
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
		enterRule(_localctx, 146, RULE_constructorNonStdArray);
		int _la;
		try {
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1058);
					typeName();
					}
				}

				setState(1061);
				match(LPAREN);
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
					{
					setState(1062);
					componentValueN();
					setState(1067);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1063);
						match(COMMA);
						setState(1064);
						componentValueN();
						}
						}
						setState(1069);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==REPEAT) {
					{
					setState(1073);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1072);
						match(SEMI);
						}
					}

					setState(1075);
					match(REPEAT);
					setState(1076);
					componentValueN();
					}
				}

				setState(1079);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1080);
					typeName();
					}
				}

				setState(1083);
				match(LPAREN);
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1084);
					constructorNonStdArray();
					setState(1089);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1085);
						match(COMMA);
						setState(1086);
						constructorNonStdArray();
						}
						}
						setState(1091);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==REPEAT) {
					{
					setState(1095);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1094);
						match(SEMI);
						}
					}

					setState(1097);
					match(REPEAT);
					setState(1098);
					constructorNonStdArray();
					}
				}

				setState(1101);
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
		enterRule(_localctx, 148, RULE_componentValueN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1104);
				match(NUM_INT);
				setState(1105);
				match(OF);
				}
				break;
			}
			setState(1108);
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
		enterRule(_localctx, 150, RULE_constructorNonStdRecord);
		int _la;
		try {
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1110);
					typeName();
					}
				}

				setState(1113);
				match(LPAREN);
				setState(1122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1114);
					componentValueN();
					setState(1119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1115);
						match(COMMA);
						setState(1116);
						componentValueN();
						}
						}
						setState(1121);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << SEMI) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
					{
					setState(1125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1124);
						match(SEMI);
						}
					}

					setState(1127);
					tagValue();
					setState(1128);
					match(COMMA);
					setState(1129);
					componentValueN();
					setState(1134);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1130);
						match(SEMI);
						setState(1131);
						componentValueN();
						}
						}
						setState(1136);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1139);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1140);
					typeName();
					}
				}

				setState(1143);
				match(LPAREN);
				setState(1152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1144);
					constructorNonStdRecord();
					setState(1149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1145);
						match(COMMA);
						setState(1146);
						constructorNonStdRecord();
						}
						}
						setState(1151);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << SEMI) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
					{
					setState(1155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1154);
						match(SEMI);
						}
					}

					setState(1157);
					tagValue();
					setState(1158);
					match(COMMA);
					setState(1159);
					constructorNonStdRecord();
					setState(1164);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1160);
						match(SEMI);
						setState(1161);
						constructorNonStdRecord();
						}
						}
						setState(1166);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1169);
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
		public List<IncludeDirectiveContext> includeDirective() {
			return getRuleContexts(IncludeDirectiveContext.class);
		}
		public IncludeDirectiveContext includeDirective(int i) {
			return getRuleContext(IncludeDirectiveContext.class,i);
		}
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
		enterRule(_localctx, 152, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			attributeVar();
			setState(1173);
			match(VAR);
			setState(1178); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1178);
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
					case INHERIT:
					case ENVIRONMENT:
					case AND_THEN:
					case BREAK:
					case CONTINUE:
					case MODULE:
					case OR_ELSE:
					case OTHERWISE:
					case REM:
					case RETURN:
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
						{
						{
						setState(1174);
						variableDeclaration();
						setState(1175);
						match(SEMI);
						}
						}
						break;
					case P_INCLUDE:
						{
						setState(1177);
						includeDirective();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1180); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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
		enterRule(_localctx, 154, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			identifierList();
			setState(1183);
			match(COLON);
			setState(1184);
			attributePart();
			setState(1185);
			type();
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==VALUE) {
				{
				setState(1186);
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
		enterRule(_localctx, 156, RULE_variablePreDeclaration);
		try {
			setState(1191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1189);
				variablePreDeclarationValue();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariablePreDeclarationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablePreDeclarationValue; }
	}

	public final VariablePreDeclarationValueContext variablePreDeclarationValue() throws RecognitionException {
		VariablePreDeclarationValueContext _localctx = new VariablePreDeclarationValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_variablePreDeclarationValue);
		try {
			setState(1203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1193);
				match(VALUE);
				setState(1194);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1195);
				match(VALUE);
				setState(1196);
				signedFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1197);
				match(VALUE);
				setState(1198);
				match(ZERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1199);
				match(VALUE);
				setState(1200);
				constructorValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1201);
				match(VALUE);
				setState(1202);
				expression();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariablePreDeclarationAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablePreDeclarationAssign; }
	}

	public final VariablePreDeclarationAssignContext variablePreDeclarationAssign() throws RecognitionException {
		VariablePreDeclarationAssignContext _localctx = new VariablePreDeclarationAssignContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_variablePreDeclarationAssign);
		try {
			setState(1215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				match(ASSIGN);
				setState(1206);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				match(ASSIGN);
				setState(1208);
				signedFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1209);
				match(ASSIGN);
				setState(1210);
				match(ZERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1211);
				match(ASSIGN);
				setState(1212);
				constructorValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1213);
				match(ASSIGN);
				setState(1214);
				expression();
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
		enterRule(_localctx, 162, RULE_toBeginEndDoDeclarationPart);
		try {
			setState(1252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				match(TO);
				setState(1218);
				match(BEGIN);
				setState(1219);
				match(DO);
				setState(1222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1220);
					compoundStatement();
					}
					break;
				case 2:
					{
					setState(1221);
					statement();
					}
					break;
				}
				setState(1224);
				match(SEMI);
				setState(1225);
				match(TO);
				setState(1226);
				match(END);
				setState(1227);
				match(DO);
				setState(1230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1228);
					compoundStatement();
					}
					break;
				case 2:
					{
					setState(1229);
					statement();
					}
					break;
				}
				setState(1232);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1234);
				match(TO);
				setState(1235);
				match(BEGIN);
				setState(1236);
				match(DO);
				setState(1239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
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
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1243);
				match(TO);
				setState(1244);
				match(END);
				setState(1245);
				match(DO);
				setState(1248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1246);
					compoundStatement();
					}
					break;
				case 2:
					{
					setState(1247);
					statement();
					}
					break;
				}
				setState(1250);
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
		enterRule(_localctx, 164, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			attributePart();
			setState(1255);
			procedureOrFunctionDeclaration();
			setState(1261);
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
				setState(1256);
				blockIn();
				}
				break;
			case EXTERN:
				{
				setState(1257);
				match(EXTERN);
				}
				break;
			case EXTERNAL:
				{
				setState(1258);
				match(EXTERNAL);
				}
				break;
			case FORTRAN:
				{
				setState(1259);
				match(FORTRAN);
				}
				break;
			case FORWARD:
				{
				setState(1260);
				match(FORWARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1263);
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
		enterRule(_localctx, 166, RULE_procedureOrFunctionDeclaration);
		try {
			setState(1267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1265);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1266);
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
		enterRule(_localctx, 168, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			match(PROCEDURE);
			setState(1270);
			identifier();
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1271);
				formalParameterList();
				}
			}

			setState(1274);
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
		enterRule(_localctx, 170, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(LPAREN);
			setState(1278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
				{
				setState(1277);
				attibuteFuncParam();
				}
			}

			setState(1280);
			formalParameterSection();
			setState(1288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1281);
				match(SEMI);
				setState(1283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1282);
					attibuteFuncParam();
					}
				}

				setState(1285);
				formalParameterSection();
				}
				}
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1291);
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
		enterRule(_localctx, 172, RULE_formalParameterSection);
		int _la;
		try {
			setState(1315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				parameterGroup();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1294);
				match(VAR);
				setState(1295);
				parameterGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1296);
				attributePart();
				setState(1297);
				match(FUNCTION);
				setState(1298);
				identifier();
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1299);
					formalParameterList();
					}
				}

				setState(1302);
				match(COLON);
				setState(1303);
				attributePart();
				setState(1304);
				resultType();
				setState(1305);
				assignExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1307);
				attributePart();
				setState(1308);
				match(PROCEDURE);
				setState(1309);
				identifier();
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1310);
					formalParameterList();
					}
				}

				setState(1313);
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
		enterRule(_localctx, 174, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			identifierList();
			setState(1318);
			match(COLON);
			setState(1319);
			attributePart();
			setState(1320);
			type();
			setState(1321);
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
		enterRule(_localctx, 176, RULE_assignExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1323);
				match(ASSIGN);
				setState(1325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1324);
					attibuteFuncParam();
					}
				}

				setState(1327);
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
		enterRule(_localctx, 178, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			identifier();
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1331);
				match(COMMA);
				setState(1332);
				identifier();
				}
				}
				setState(1337);
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
		enterRule(_localctx, 180, RULE_constList);
		int _la;
		try {
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1338);
				constant();
				setState(1343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==DOTDOT) {
					{
					{
					setState(1339);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==DOTDOT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1340);
					constant();
					}
					}
					setState(1345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				functionDesignator();
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==DOTDOT) {
					{
					{
					setState(1347);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==DOTDOT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1348);
					functionDesignator();
					}
					}
					setState(1353);
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
		enterRule(_localctx, 182, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(FUNCTION);
			setState(1357);
			identifier();
			setState(1359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1358);
				formalParameterList();
				}
			}

			setState(1361);
			match(COLON);
			setState(1362);
			attributePart();
			setState(1363);
			resultType();
			setState(1364);
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
		enterRule(_localctx, 184, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
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
		enterRule(_localctx, 186, RULE_statement);
		try {
			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1368);
				label();
				setState(1369);
				match(COLON);
				setState(1370);
				unlabelledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1372);
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
		enterRule(_localctx, 188, RULE_unlabelledStatement);
		try {
			setState(1377);
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
			case INHERIT:
			case ENVIRONMENT:
			case AND_THEN:
			case BREAK:
			case CONTINUE:
			case MODULE:
			case OR_ELSE:
			case OTHERWISE:
			case REM:
			case RETURN:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(1375);
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
				setState(1376);
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
		enterRule(_localctx, 190, RULE_simpleStatement);
		try {
			setState(1387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1379);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1380);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1381);
				gotoStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1382);
				breakStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1383);
				continueStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1384);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1385);
				directives();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1386);
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
		enterRule(_localctx, 192, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			variable();
			setState(1390);
			match(ASSIGN);
			setState(1391);
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
		enterRule(_localctx, 194, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATP:
				{
				setState(1393);
				match(ATP);
				setState(1394);
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
			case INHERIT:
			case ENVIRONMENT:
			case AND_THEN:
			case BREAK:
			case CONTINUE:
			case MODULE:
			case OR_ELSE:
			case OTHERWISE:
			case REM:
			case RETURN:
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
				{
				setState(1395);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1423);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRACK:
						{
						setState(1398);
						match(LBRACK);
						setState(1399);
						expression();
						setState(1404);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1400);
							match(COMMA);
							setState(1401);
							expression();
							}
							}
							setState(1406);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1407);
						match(RBRACK);
						}
						break;
					case LBRACK2:
						{
						setState(1409);
						match(LBRACK2);
						setState(1410);
						expression();
						setState(1415);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1411);
							match(COMMA);
							setState(1412);
							expression();
							}
							}
							setState(1417);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1418);
						match(RBRACK2);
						}
						break;
					case DOT:
						{
						setState(1420);
						match(DOT);
						setState(1421);
						identifier();
						}
						break;
					case POINTER_:
						{
						setState(1422);
						match(POINTER_);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			}
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1428);
				match(COLON);
				setState(1429);
				match(COLON);
				setState(1430);
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
		enterRule(_localctx, 196, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			simpleExpression();
			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1434);
				relationaloperator();
				setState(1435);
				expression();
				}
				break;
			}
			setState(1442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1439);
				match(COLON);
				setState(1440);
				match(COLON);
				setState(1441);
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
		enterRule(_localctx, 198, RULE_relationaloperator);
		try {
			setState(1453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1444);
				match(EQUAL);
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1445);
				match(NOT_EQUAL);
				}
				break;
			case LT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1446);
				match(LT_);
				}
				break;
			case LE_:
				enterOuterAlt(_localctx, 4);
				{
				setState(1447);
				match(LE_);
				}
				break;
			case GE_:
				enterOuterAlt(_localctx, 5);
				{
				setState(1448);
				match(GE_);
				}
				break;
			case GT_:
				enterOuterAlt(_localctx, 6);
				{
				setState(1449);
				match(GT_);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(1450);
				match(IN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1451);
				match(NOT);
				setState(1452);
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
		enterRule(_localctx, 200, RULE_simpleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			term();
			setState(1459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1456);
				additiveoperator();
				setState(1457);
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
		enterRule(_localctx, 202, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
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
		enterRule(_localctx, 204, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			signedFactor();
			setState(1467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1464);
				multiplicativeoperator();
				setState(1465);
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
		enterRule(_localctx, 206, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
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
		enterRule(_localctx, 208, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1471);
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

			setState(1474);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 210, RULE_factor);
		try {
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1476);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1477);
				match(LPAREN);
				setState(1478);
				expression();
				setState(1479);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1481);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1482);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1483);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1484);
				identifier();
				setState(1485);
				set();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1487);
				match(NOT);
				setState(1488);
				factor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1489);
				bool();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1490);
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
		enterRule(_localctx, 212, RULE_unsignedConstant);
		try {
			setState(1498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493);
				unsignedNumber();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494);
				constantChr();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1495);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1496);
				match(NIL);
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 5);
				{
				setState(1497);
				match(ZERO);
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
		enterRule(_localctx, 214, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			identifier();
			setState(1501);
			match(LPAREN);
			setState(1502);
			parameterList();
			setState(1503);
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
		enterRule(_localctx, 216, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
				{
				setState(1505);
				attibuteFuncParam();
				}
			}

			setState(1509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
				{
				setState(1508);
				actualParameter();
				}
			}

			setState(1520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1511);
				match(COMMA);
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1512);
					attibuteFuncParam();
					}
				}

				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
					{
					setState(1515);
					actualParameter();
					}
				}

				}
				}
				setState(1522);
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
		enterRule(_localctx, 218, RULE_attibuteFuncParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
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
		enterRule(_localctx, 220, RULE_set);
		try {
			setState(1534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1525);
				match(LBRACK);
				setState(1526);
				elementList();
				setState(1527);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1529);
				match(LBRACK2);
				setState(1530);
				elementList();
				setState(1531);
				match(RBRACK2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1533);
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
		enterRule(_localctx, 222, RULE_elementList);
		int _la;
		try {
			setState(1545);
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
			case INHERIT:
			case ENVIRONMENT:
			case AND_THEN:
			case BREAK:
			case CONTINUE:
			case MODULE:
			case OR_ELSE:
			case OTHERWISE:
			case REM:
			case RETURN:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(1536);
				element();
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1537);
					match(COMMA);
					setState(1538);
					element();
					}
					}
					setState(1543);
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
		enterRule(_localctx, 224, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			expression();
			setState(1550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(1548);
				match(DOTDOT);
				setState(1549);
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
		enterRule(_localctx, 226, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			identifier();
			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1553);
				match(LPAREN);
				setState(1554);
				parameterList();
				setState(1555);
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
		enterRule(_localctx, 228, RULE_actualParameter);
		int _la;
		try {
			setState(1582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1559);
				expression();
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(1560);
					parameterwidth();
					}
					}
					setState(1565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
				identifier();
				setState(1567);
				match(ASSIGN);
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1568);
					attibuteFuncParam();
					}
				}

				setState(1573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1571);
					identifier();
					}
					break;
				case 2:
					{
					setState(1572);
					expression();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1575);
				identifier();
				setState(1576);
				match(ASSIGN);
				{
				setState(1577);
				attibuteFuncParam();
				setState(1578);
				match(LPAREN);
				setState(1579);
				expression();
				setState(1580);
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
		enterRule(_localctx, 230, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			match(COLON);
			setState(1585);
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
		enterRule(_localctx, 232, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			match(GOTO);
			setState(1588);
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
		enterRule(_localctx, 234, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
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
		enterRule(_localctx, 236, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
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
		enterRule(_localctx, 238, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(RETURN);
			setState(1595);
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
		enterRule(_localctx, 240, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
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
		enterRule(_localctx, 242, RULE_emptyStatement);
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
		enterRule(_localctx, 244, RULE_structuredStatement);
		try {
			setState(1605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1601);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1602);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1603);
				repetetiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1604);
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
		enterRule(_localctx, 246, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			match(BEGIN);
			setState(1608);
			statements();
			setState(1609);
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
		enterRule(_localctx, 248, RULE_openCompoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
			statements();
			setState(1612);
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
		enterRule(_localctx, 250, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			statement();
			setState(1619);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1615);
					match(SEMI);
					setState(1616);
					statement();
					}
					} 
				}
				setState(1621);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			}
			setState(1623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1622);
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
		enterRule(_localctx, 252, RULE_conditionalStatement);
		try {
			setState(1627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1625);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1626);
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
		enterRule(_localctx, 254, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			match(IF);
			setState(1630);
			expression();
			setState(1631);
			match(THEN);
			setState(1632);
			statement();
			setState(1634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1633);
				match(SEMI);
				}
				break;
			}
			setState(1641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1636);
				match(ELSE);
				setState(1637);
				statement();
				setState(1639);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1638);
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
		enterRule(_localctx, 256, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			match(CASE);
			setState(1644);
			expression();
			setState(1645);
			match(OF);
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1646);
				caseListElement();
				setState(1651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1647);
						match(SEMI);
						setState(1648);
						caseListElement();
						}
						} 
					}
					setState(1653);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				}
				}
				break;
			}
			setState(1661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1656);
					match(SEMI);
					}
				}

				setState(1659);
				match(OTHERWISE);
				setState(1660);
				statements();
				}
				break;
			}
			setState(1664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1663);
				match(SEMI);
				}
			}

			setState(1666);
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
		enterRule(_localctx, 258, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			constList();
			setState(1669);
			match(COLON);
			setState(1670);
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
		enterRule(_localctx, 260, RULE_repetetiveStatement);
		try {
			setState(1675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1672);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1673);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1674);
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
		enterRule(_localctx, 262, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			match(WHILE);
			setState(1678);
			expression();
			setState(1679);
			match(DO);
			setState(1680);
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
		enterRule(_localctx, 264, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1682);
			match(REPEAT);
			setState(1683);
			statements();
			setState(1684);
			match(UNTIL);
			setState(1685);
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
		enterRule(_localctx, 266, RULE_forStatement);
		try {
			setState(1701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1687);
				match(FOR);
				setState(1688);
				identifier();
				setState(1689);
				match(ASSIGN);
				setState(1690);
				forList();
				setState(1691);
				match(DO);
				setState(1692);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1694);
				match(FOR);
				setState(1695);
				identifier();
				setState(1696);
				match(IN);
				setState(1697);
				expression();
				setState(1698);
				match(DO);
				setState(1699);
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
		enterRule(_localctx, 268, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			initialValue();
			setState(1704);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1705);
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
		enterRule(_localctx, 270, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
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
		enterRule(_localctx, 272, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
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
		enterRule(_localctx, 274, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			match(WITH);
			setState(1712);
			recordVariableList();
			setState(1713);
			match(DO);
			setState(1714);
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
		enterRule(_localctx, 276, RULE_recordVariableList);
		int _la;
		try {
			setState(1732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1716);
				variable();
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1717);
					match(COMMA);
					setState(1718);
					variable();
					}
					}
					setState(1723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1724);
				prototypeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1725);
					match(COMMA);
					setState(1726);
					prototypeType();
					}
					}
					setState(1731);
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
		enterRule(_localctx, 278, RULE_includeDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			match(P_INCLUDE);
			setState(1735);
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
		enterRule(_localctx, 280, RULE_dictionaryDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			match(P_DICTIONARY);
			setState(1738);
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
		enterRule(_localctx, 282, RULE_titleDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			_la = _input.LA(1);
			if ( !(_la==P_TITLE || _la==P_SUBTITLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1741);
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
		enterRule(_localctx, 284, RULE_pDefinedDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			match(P_DEFINED);
			setState(1744);
			match(LPAREN);
			setState(1745);
			identifier();
			setState(1746);
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
		enterRule(_localctx, 286, RULE_messageDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1749);
			match(LPAREN);
			setState(1750);
			stringExpression();
			setState(1755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1751);
				match(COMMA);
				setState(1752);
				stringExpression();
				}
				}
				setState(1757);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 288, RULE_infoFuncDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
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
		enterRule(_localctx, 290, RULE_pIfDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			match(P_IF);
			setState(1763);
			expression();
			setState(1764);
			match(P_THEN);
			setState(1765);
			pIfToken();
			setState(1767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1766);
				match(SEMI);
				}
			}

			setState(1778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==P_ELIF) {
				{
				{
				setState(1769);
				match(P_ELIF);
				setState(1770);
				expression();
				setState(1771);
				match(P_THEN);
				setState(1772);
				pIfToken();
				setState(1774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1773);
					match(SEMI);
					}
				}

				}
				}
				setState(1780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==P_ELSE) {
				{
				setState(1781);
				match(P_ELSE);
				setState(1782);
				pIfToken();
				setState(1784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1783);
					match(SEMI);
					}
				}

				}
			}

			setState(1788);
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
		enterRule(_localctx, 292, RULE_pIfToken);
		try {
			setState(1793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1790);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1791);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1792);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ab\u0706\4\2\t"+
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
		"\4\u0093\t\u0093\4\u0094\t\u0094\3\2\7\2\u012a\n\2\f\2\16\2\u012d\13\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u013a\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0145\n\3\3\3\3\3\5\3\u0149\n\3\3\4\3\4\3"+
		"\4\5\4\u014e\n\4\3\5\3\5\3\5\3\5\7\5\u0154\n\5\f\5\16\5\u0157\13\5\3\5"+
		"\3\5\5\5\u015b\n\5\3\6\3\6\3\6\3\6\7\6\u0161\n\6\f\6\16\6\u0164\13\6\3"+
		"\6\3\6\5\6\u0168\n\6\3\7\3\7\3\7\3\7\7\7\u016e\n\7\f\7\16\7\u0171\13\7"+
		"\3\7\3\7\5\7\u0175\n\7\3\b\3\b\3\b\3\b\7\b\u017b\n\b\f\b\16\b\u017e\13"+
		"\b\3\b\3\b\5\b\u0182\n\b\3\t\3\t\3\t\3\t\7\t\u0188\n\t\f\t\16\t\u018b"+
		"\13\t\3\t\3\t\5\t\u018f\n\t\3\n\3\n\3\n\3\n\5\n\u0195\n\n\3\n\3\n\3\n"+
		"\5\n\u019a\n\n\7\n\u019c\n\n\f\n\16\n\u019f\13\n\3\n\3\n\5\n\u01a3\n\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01b0\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u01b9\n\16\f\16\16\16\u01bc\13\16\3\17"+
		"\3\17\3\17\5\17\u01c1\n\17\3\17\5\17\u01c4\n\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\7\21\u01cd\n\21\f\21\16\21\u01d0\13\21\3\21\3\21\3\22\3"+
		"\22\5\22\u01d6\n\22\3\23\3\23\3\23\3\23\3\23\6\23\u01dd\n\23\r\23\16\23"+
		"\u01de\3\24\3\24\3\24\3\24\3\24\5\24\u01e6\n\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\5\26\u01ee\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u01fd\n\27\3\30\3\30\5\30\u0201\n\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u020f\n\35"+
		"\3\35\3\35\5\35\u0213\n\35\7\35\u0215\n\35\f\35\16\35\u0218\13\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0223\n\36\f\36\16\36\u0226"+
		"\13\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \6 \u0232\n \r \16 \u0233"+
		"\3!\3!\3!\3!\3!\3!\5!\u023c\n!\3!\5!\u023f\n!\3!\3!\5!\u0243\n!\5!\u0245"+
		"\n!\3\"\3\"\5\"\u0249\n\"\3\"\3\"\3\"\3#\3#\5#\u0250\n#\3$\3$\3$\5$\u0255"+
		"\n$\3%\3%\3%\3%\3%\5%\u025c\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0270\n\'\3(\3(\3)\3)\3)\5)\u0277\n)"+
		"\3*\3*\3*\3*\3*\3*\5*\u027f\n*\3+\3+\3+\3+\5+\u0285\n+\3+\3+\3,\3,\3,"+
		"\3,\3,\5,\u028e\n,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\5-\u02a3\n-\3.\3.\3.\7.\u02a8\n.\f.\16.\u02ab\13.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\5\61\u02b5\n\61\3\61\5\61\u02b8\n\61\3\61\3\61\3"+
		"\62\3\62\3\62\5\62\u02bf\n\62\3\62\5\62\u02c2\n\62\3\63\3\63\3\63\7\63"+
		"\u02c7\n\63\f\63\16\63\u02ca\13\63\3\63\5\63\u02cd\n\63\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u02d4\n\64\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u02dc\n"+
		"\65\f\65\16\65\u02df\13\65\3\65\5\65\u02e2\n\65\3\65\3\65\3\65\3\65\3"+
		"\65\5\65\u02e9\n\65\3\66\3\66\3\66\5\66\u02ee\n\66\3\66\3\66\3\66\3\66"+
		"\5\66\u02f4\n\66\3\67\3\67\3\67\3\67\5\67\u02fa\n\67\3\67\3\67\38\38\3"+
		"8\38\38\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\7"+
		"=\u0317\n=\f=\16=\u031a\13=\3=\3=\3=\3=\3=\3>\3>\3>\7>\u0324\n>\f>\16"+
		">\u0327\13>\3>\3>\3>\3>\3?\3?\5?\u032f\n?\3@\3@\3@\3@\3@\7@\u0336\n@\f"+
		"@\16@\u0339\13@\3@\3@\3A\3A\3A\7A\u0340\nA\fA\16A\u0343\13A\3B\3B\3B\3"+
		"B\3B\5B\u034a\nB\3C\5C\u034d\nC\3C\3C\3C\3C\3C\3C\3C\3C\3C\7C\u0358\n"+
		"C\fC\16C\u035b\13C\5C\u035d\nC\3C\5C\u0360\nC\3C\3C\3C\5C\u0365\nC\5C"+
		"\u0367\nC\3C\3C\5C\u036b\nC\3C\3C\3C\3C\3C\3C\3C\3C\3C\7C\u0376\nC\fC"+
		"\16C\u0379\13C\5C\u037b\nC\3C\5C\u037e\nC\3C\3C\3C\5C\u0383\nC\5C\u0385"+
		"\nC\3C\5C\u0388\nC\3D\3D\3E\3E\3F\5F\u038f\nF\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\7F\u039a\nF\fF\16F\u039d\13F\5F\u039f\nF\3F\5F\u03a2\nF\3F\3F\3F\3"+
		"F\5F\u03a8\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\7F\u03b5\nF\fF\16F\u03b8"+
		"\13F\3F\3F\5F\u03bc\nF\3F\5F\u03bf\nF\3F\3F\3F\5F\u03c4\nF\5F\u03c6\n"+
		"F\3F\3F\5F\u03ca\nF\3F\3F\3F\3F\3F\3F\3F\3F\3F\7F\u03d5\nF\fF\16F\u03d8"+
		"\13F\5F\u03da\nF\3F\5F\u03dd\nF\3F\3F\3F\3F\5F\u03e3\nF\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\7F\u03f0\nF\fF\16F\u03f3\13F\3F\3F\5F\u03f7\nF\3F"+
		"\5F\u03fa\nF\3F\3F\3F\5F\u03ff\nF\5F\u0401\nF\3F\5F\u0404\nF\3G\3G\3G"+
		"\7G\u0409\nG\fG\16G\u040c\13G\3H\3H\3H\5H\u0411\nH\3I\3I\3J\5J\u0416\n"+
		"J\3J\3J\3J\3J\7J\u041c\nJ\fJ\16J\u041f\13J\5J\u0421\nJ\3J\3J\3K\5K\u0426"+
		"\nK\3K\3K\3K\3K\7K\u042c\nK\fK\16K\u042f\13K\5K\u0431\nK\3K\5K\u0434\n"+
		"K\3K\3K\5K\u0438\nK\3K\3K\5K\u043c\nK\3K\3K\3K\3K\7K\u0442\nK\fK\16K\u0445"+
		"\13K\5K\u0447\nK\3K\5K\u044a\nK\3K\3K\5K\u044e\nK\3K\5K\u0451\nK\3L\3"+
		"L\5L\u0455\nL\3L\3L\3M\5M\u045a\nM\3M\3M\3M\3M\7M\u0460\nM\fM\16M\u0463"+
		"\13M\5M\u0465\nM\3M\5M\u0468\nM\3M\3M\3M\3M\3M\7M\u046f\nM\fM\16M\u0472"+
		"\13M\5M\u0474\nM\3M\3M\5M\u0478\nM\3M\3M\3M\3M\7M\u047e\nM\fM\16M\u0481"+
		"\13M\5M\u0483\nM\3M\5M\u0486\nM\3M\3M\3M\3M\3M\7M\u048d\nM\fM\16M\u0490"+
		"\13M\5M\u0492\nM\3M\5M\u0495\nM\3N\3N\3N\3N\3N\3N\6N\u049d\nN\rN\16N\u049e"+
		"\3O\3O\3O\3O\3O\5O\u04a6\nO\3P\3P\5P\u04aa\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\5Q\u04b6\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u04c2\nR\3S\3S\3S"+
		"\3S\3S\5S\u04c9\nS\3S\3S\3S\3S\3S\3S\5S\u04d1\nS\3S\3S\3S\3S\3S\3S\3S"+
		"\5S\u04da\nS\3S\3S\3S\3S\3S\3S\3S\5S\u04e3\nS\3S\3S\5S\u04e7\nS\3T\3T"+
		"\3T\3T\3T\3T\3T\5T\u04f0\nT\3T\3T\3U\3U\5U\u04f6\nU\3V\3V\3V\5V\u04fb"+
		"\nV\3V\3V\3W\3W\5W\u0501\nW\3W\3W\3W\5W\u0506\nW\3W\7W\u0509\nW\fW\16"+
		"W\u050c\13W\3W\3W\3X\3X\3X\3X\3X\3X\3X\5X\u0517\nX\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\5X\u0522\nX\3X\3X\5X\u0526\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\5Z\u0530"+
		"\nZ\3Z\5Z\u0533\nZ\3[\3[\3[\7[\u0538\n[\f[\16[\u053b\13[\3\\\3\\\3\\\7"+
		"\\\u0540\n\\\f\\\16\\\u0543\13\\\3\\\3\\\3\\\7\\\u0548\n\\\f\\\16\\\u054b"+
		"\13\\\5\\\u054d\n\\\3]\3]\3]\5]\u0552\n]\3]\3]\3]\3]\3]\3^\3^\3_\3_\3"+
		"_\3_\3_\5_\u0560\n_\3`\3`\5`\u0564\n`\3a\3a\3a\3a\3a\3a\3a\3a\5a\u056e"+
		"\na\3b\3b\3b\3b\3c\3c\3c\5c\u0577\nc\3c\3c\3c\3c\7c\u057d\nc\fc\16c\u0580"+
		"\13c\3c\3c\3c\3c\3c\3c\7c\u0588\nc\fc\16c\u058b\13c\3c\3c\3c\3c\3c\7c"+
		"\u0592\nc\fc\16c\u0595\13c\3c\3c\3c\5c\u059a\nc\3d\3d\3d\3d\5d\u05a0\n"+
		"d\3d\3d\3d\5d\u05a5\nd\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u05b0\ne\3f\3f\3"+
		"f\3f\5f\u05b6\nf\3g\3g\3h\3h\3h\3h\5h\u05be\nh\3i\3i\3j\5j\u05c3\nj\3"+
		"j\3j\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u05d6\nk\3l\3l\3"+
		"l\3l\3l\5l\u05dd\nl\3m\3m\3m\3m\3m\3n\5n\u05e5\nn\3n\5n\u05e8\nn\3n\3"+
		"n\5n\u05ec\nn\3n\5n\u05ef\nn\7n\u05f1\nn\fn\16n\u05f4\13n\3o\3o\3p\3p"+
		"\3p\3p\3p\3p\3p\3p\3p\5p\u0601\np\3q\3q\3q\7q\u0606\nq\fq\16q\u0609\13"+
		"q\3q\5q\u060c\nq\3r\3r\3r\5r\u0611\nr\3s\3s\3s\3s\3s\5s\u0618\ns\3t\3"+
		"t\7t\u061c\nt\ft\16t\u061f\13t\3t\3t\3t\5t\u0624\nt\3t\3t\5t\u0628\nt"+
		"\3t\3t\3t\3t\3t\3t\3t\5t\u0631\nt\3u\3u\3u\3v\3v\3v\3w\3w\3x\3x\3y\3y"+
		"\3y\3z\3z\3{\3{\3|\3|\3|\3|\5|\u0648\n|\3}\3}\3}\3}\3~\3~\3~\3\177\3\177"+
		"\3\177\7\177\u0654\n\177\f\177\16\177\u0657\13\177\3\177\5\177\u065a\n"+
		"\177\3\u0080\3\u0080\5\u0080\u065e\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\5\u0081\u0665\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u066a\n"+
		"\u0081\5\u0081\u066c\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3"+
		"\u0082\7\u0082\u0674\n\u0082\f\u0082\16\u0082\u0677\13\u0082\5\u0082\u0679"+
		"\n\u0082\3\u0082\5\u0082\u067c\n\u0082\3\u0082\3\u0082\5\u0082\u0680\n"+
		"\u0082\3\u0082\5\u0082\u0683\n\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3"+
		"\u0083\3\u0083\3\u0084\3\u0084\3\u0084\5\u0084\u068e\n\u0084\3\u0085\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u06a8\n\u0087\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\7\u008c\u06ba\n\u008c"+
		"\f\u008c\16\u008c\u06bd\13\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u06c2"+
		"\n\u008c\f\u008c\16\u008c\u06c5\13\u008c\5\u008c\u06c7\n\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\7\u0091\u06dc\n\u0091\f\u0091\16\u0091\u06df\13\u0091\3\u0091\3\u0091"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u06ea"+
		"\n\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u06f1\n\u0093"+
		"\7\u0093\u06f3\n\u0093\f\u0093\16\u0093\u06f6\13\u0093\3\u0093\3\u0093"+
		"\3\u0093\5\u0093\u06fb\n\u0093\5\u0093\u06fd\n\u0093\3\u0093\3\u0093\3"+
		"\u0094\3\u0094\3\u0094\5\u0094\u0704\n\u0094\3\u0094\2\2\u0095\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\2\17\3\2\u008f\u009f\6\2<bfi\u008d\u008e\u0097\u0097"+
		"\4\2\u00a6\u00a6\u00a8\u00ab\3\2\3\4\4\2\u009b\u009b\u009e\u009e\4\2\t"+
		"\t\33\33\7\2\3\4jj\177\177\u008f\u008f\u0093\u0093\7\2\5\7jjoo{{\u0095"+
		"\u0095\3\2\37\"\4\2qq\u0087\u0087\3\2%&\3\2-\60\3\2\61;\2\u0796\2\u012b"+
		"\3\2\2\2\4\u0148\3\2\2\2\6\u014d\3\2\2\2\b\u015a\3\2\2\2\n\u0167\3\2\2"+
		"\2\f\u0174\3\2\2\2\16\u0181\3\2\2\2\20\u018e\3\2\2\2\22\u0190\3\2\2\2"+
		"\24\u01a4\3\2\2\2\26\u01a6\3\2\2\2\30\u01af\3\2\2\2\32\u01ba\3\2\2\2\34"+
		"\u01bd\3\2\2\2\36\u01c5\3\2\2\2 \u01c8\3\2\2\2\"\u01d5\3\2\2\2$\u01d7"+
		"\3\2\2\2&\u01e0\3\2\2\2(\u01e7\3\2\2\2*\u01e9\3\2\2\2,\u01fc\3\2\2\2."+
		"\u0200\3\2\2\2\60\u0202\3\2\2\2\62\u0204\3\2\2\2\64\u0206\3\2\2\2\66\u0208"+
		"\3\2\2\28\u020a\3\2\2\2:\u0219\3\2\2\2<\u0229\3\2\2\2>\u022b\3\2\2\2@"+
		"\u0244\3\2\2\2B\u0246\3\2\2\2D\u024d\3\2\2\2F\u0254\3\2\2\2H\u025b\3\2"+
		"\2\2J\u025d\3\2\2\2L\u026f\3\2\2\2N\u0271\3\2\2\2P\u0276\3\2\2\2R\u027e"+
		"\3\2\2\2T\u0280\3\2\2\2V\u0288\3\2\2\2X\u02a2\3\2\2\2Z\u02a4\3\2\2\2\\"+
		"\u02ac\3\2\2\2^\u02af\3\2\2\2`\u02b2\3\2\2\2b\u02c1\3\2\2\2d\u02c3\3\2"+
		"\2\2f\u02ce\3\2\2\2h\u02d5\3\2\2\2j\u02f3\3\2\2\2l\u02f5\3\2\2\2n\u02fd"+
		"\3\2\2\2p\u0302\3\2\2\2r\u0304\3\2\2\2t\u0309\3\2\2\2v\u030c\3\2\2\2x"+
		"\u0311\3\2\2\2z\u0320\3\2\2\2|\u032e\3\2\2\2~\u0330\3\2\2\2\u0080\u033c"+
		"\3\2\2\2\u0082\u0349\3\2\2\2\u0084\u0387\3\2\2\2\u0086\u0389\3\2\2\2\u0088"+
		"\u038b\3\2\2\2\u008a\u0403\3\2\2\2\u008c\u0405\3\2\2\2\u008e\u0410\3\2"+
		"\2\2\u0090\u0412\3\2\2\2\u0092\u0415\3\2\2\2\u0094\u0450\3\2\2\2\u0096"+
		"\u0454\3\2\2\2\u0098\u0494\3\2\2\2\u009a\u0496\3\2\2\2\u009c\u04a0\3\2"+
		"\2\2\u009e\u04a9\3\2\2\2\u00a0\u04b5\3\2\2\2\u00a2\u04c1\3\2\2\2\u00a4"+
		"\u04e6\3\2\2\2\u00a6\u04e8\3\2\2\2\u00a8\u04f5\3\2\2\2\u00aa\u04f7\3\2"+
		"\2\2\u00ac\u04fe\3\2\2\2\u00ae\u0525\3\2\2\2\u00b0\u0527\3\2\2\2\u00b2"+
		"\u0532\3\2\2\2\u00b4\u0534\3\2\2\2\u00b6\u054c\3\2\2\2\u00b8\u054e\3\2"+
		"\2\2\u00ba\u0558\3\2\2\2\u00bc\u055f\3\2\2\2\u00be\u0563\3\2\2\2\u00c0"+
		"\u056d\3\2\2\2\u00c2\u056f\3\2\2\2\u00c4\u0576\3\2\2\2\u00c6\u059b\3\2"+
		"\2\2\u00c8\u05af\3\2\2\2\u00ca\u05b1\3\2\2\2\u00cc\u05b7\3\2\2\2\u00ce"+
		"\u05b9\3\2\2\2\u00d0\u05bf\3\2\2\2\u00d2\u05c2\3\2\2\2\u00d4\u05d5\3\2"+
		"\2\2\u00d6\u05dc\3\2\2\2\u00d8\u05de\3\2\2\2\u00da\u05e4\3\2\2\2\u00dc"+
		"\u05f5\3\2\2\2\u00de\u0600\3\2\2\2\u00e0\u060b\3\2\2\2\u00e2\u060d\3\2"+
		"\2\2\u00e4\u0612\3\2\2\2\u00e6\u0630\3\2\2\2\u00e8\u0632\3\2\2\2\u00ea"+
		"\u0635\3\2\2\2\u00ec\u0638\3\2\2\2\u00ee\u063a\3\2\2\2\u00f0\u063c\3\2"+
		"\2\2\u00f2\u063f\3\2\2\2\u00f4\u0641\3\2\2\2\u00f6\u0647\3\2\2\2\u00f8"+
		"\u0649\3\2\2\2\u00fa\u064d\3\2\2\2\u00fc\u0650\3\2\2\2\u00fe\u065d\3\2"+
		"\2\2\u0100\u065f\3\2\2\2\u0102\u066d\3\2\2\2\u0104\u0686\3\2\2\2\u0106"+
		"\u068d\3\2\2\2\u0108\u068f\3\2\2\2\u010a\u0694\3\2\2\2\u010c\u06a7\3\2"+
		"\2\2\u010e\u06a9\3\2\2\2\u0110\u06ad\3\2\2\2\u0112\u06af\3\2\2\2\u0114"+
		"\u06b1\3\2\2\2\u0116\u06c6\3\2\2\2\u0118\u06c8\3\2\2\2\u011a\u06cb\3\2"+
		"\2\2\u011c\u06ce\3\2\2\2\u011e\u06d1\3\2\2\2\u0120\u06d6\3\2\2\2\u0122"+
		"\u06e2\3\2\2\2\u0124\u06e4\3\2\2\2\u0126\u0703\3\2\2\2\u0128\u012a\5\30"+
		"\r\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\5\4"+
		"\3\2\u012f\u0130\5\34\17\2\u0130\u0131\7\32\2\2\u0131\3\3\2\2\2\u0132"+
		"\u0133\5\n\6\2\u0133\u0134\7\u0082\2\2\u0134\u0139\5\6\4\2\u0135\u0136"+
		"\7\22\2\2\u0136\u0137\5\u00b4[\2\u0137\u0138\7\23\2\2\u0138\u013a\3\2"+
		"\2\2\u0139\u0135\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\7\n\2\2\u013c\u0149\3\2\2\2\u013d\u013e\5\f\7\2\u013e\u013f\7\u0092"+
		"\2\2\u013f\u0144\5\6\4\2\u0140\u0141\7\22\2\2\u0141\u0142\5\u00b4[\2\u0142"+
		"\u0143\7\23\2\2\u0143\u0145\3\2\2\2\u0144\u0140\3\2\2\2\u0144\u0145\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\n\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0132\3\2\2\2\u0148\u013d\3\2\2\2\u0149\5\3\2\2\2\u014a\u014e\7\u00a4"+
		"\2\2\u014b\u014e\5\26\f\2\u014c\u014e\5\24\13\2\u014d\u014a\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e\7\3\2\2\2\u014f\u0150\7\24\2"+
		"\2\u0150\u0155\5\22\n\2\u0151\u0152\7\t\2\2\u0152\u0154\5\22\n\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\26\2\2\u0159"+
		"\u015b\3\2\2\2\u015a\u014f\3\2\2\2\u015a\u015b\3\2\2\2\u015b\t\3\2\2\2"+
		"\u015c\u015d\7\24\2\2\u015d\u0162\5\22\n\2\u015e\u015f\7\t\2\2\u015f\u0161"+
		"\5\22\n\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2"+
		"\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166"+
		"\7\26\2\2\u0166\u0168\3\2\2\2\u0167\u015c\3\2\2\2\u0167\u0168\3\2\2\2"+
		"\u0168\13\3\2\2\2\u0169\u016a\7\24\2\2\u016a\u016f\5\22\n\2\u016b\u016c"+
		"\7\t\2\2\u016c\u016e\5\22\n\2\u016d\u016b\3\2\2\2\u016e\u0171\3\2\2\2"+
		"\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0172\u0173\7\26\2\2\u0173\u0175\3\2\2\2\u0174\u0169\3\2\2\2"+
		"\u0174\u0175\3\2\2\2\u0175\r\3\2\2\2\u0176\u0177\7\24\2\2\u0177\u017c"+
		"\5\22\n\2\u0178\u0179\7\t\2\2\u0179\u017b\5\22\n\2\u017a\u0178\3\2\2\2"+
		"\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7\26\2\2\u0180\u0182\3\2\2\2"+
		"\u0181\u0176\3\2\2\2\u0181\u0182\3\2\2\2\u0182\17\3\2\2\2\u0183\u0184"+
		"\7\24\2\2\u0184\u0189\5\22\n\2\u0185\u0186\7\t\2\2\u0186\u0188\5\22\n"+
		"\2\u0187\u0185\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018d\7\26\2\2"+
		"\u018d\u018f\3\2\2\2\u018e\u0183\3\2\2\2\u018e\u018f\3\2\2\2\u018f\21"+
		"\3\2\2\2\u0190\u01a2\5\26\f\2\u0191\u0194\7\22\2\2\u0192\u0195\5,\27\2"+
		"\u0193\u0195\5\6\4\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195\u019d"+
		"\3\2\2\2\u0196\u0199\7\t\2\2\u0197\u019a\5,\27\2\u0198\u019a\5\6\4\2\u0199"+
		"\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0196\3\2"+
		"\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\23\2\2\u01a1\u01a3\3"+
		"\2\2\2\u01a2\u0191\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\23\3\2\2\2\u01a4"+
		"\u01a5\t\2\2\2\u01a5\25\3\2\2\2\u01a6\u01a7\t\3\2\2\u01a7\27\3\2\2\2\u01a8"+
		"\u01b0\5\u0118\u008d\2\u01a9\u01b0\5\u011a\u008e\2\u01aa\u01b0\5\u011c"+
		"\u008f\2\u01ab\u01b0\5\u011e\u0090\2\u01ac\u01b0\5\u0120\u0091\2\u01ad"+
		"\u01b0\5\u0122\u0092\2\u01ae\u01b0\5\u0124\u0093\2\u01af\u01a8\3\2\2\2"+
		"\u01af\u01a9\3\2\2\2\u01af\u01aa\3\2\2\2\u01af\u01ab\3\2\2\2\u01af\u01ac"+
		"\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\31\3\2\2\2\u01b1"+
		"\u01b9\5\30\r\2\u01b2\u01b9\5 \21\2\u01b3\u01b9\5$\23\2\u01b4\u01b9\5"+
		"> \2\u01b5\u01b9\5:\36\2\u01b6\u01b9\5\u009aN\2\u01b7\u01b9\5\u00a6T\2"+
		"\u01b8\u01b1\3\2\2\2\u01b8\u01b2\3\2\2\2\u01b8\u01b3\3\2\2\2\u01b8\u01b4"+
		"\3\2\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\33\3\2\2"+
		"\2\u01bc\u01ba\3\2\2\2\u01bd\u01c3\5\32\16\2\u01be\u01c4\5\u00f8}\2\u01bf"+
		"\u01c1\5\u00a4S\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c4\7s\2\2\u01c3\u01be\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c4"+
		"\35\3\2\2\2\u01c5\u01c6\5\32\16\2\u01c6\u01c7\5\u00f8}\2\u01c7\37\3\2"+
		"\2\2\u01c8\u01c9\7z\2\2\u01c9\u01ce\5\"\22\2\u01ca\u01cb\7\t\2\2\u01cb"+
		"\u01cd\5\"\22\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3"+
		"\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1"+
		"\u01d2\7\n\2\2\u01d2!\3\2\2\2\u01d3\u01d6\5\60\31\2\u01d4\u01d6\5\6\4"+
		"\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6#\3\2\2\2\u01d7\u01dc"+
		"\7n\2\2\u01d8\u01d9\5&\24\2\u01d9\u01da\7\n\2\2\u01da\u01dd\3\2\2\2\u01db"+
		"\u01dd\5\u0118\u008d\2\u01dc\u01d8\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df%\3\2\2\2\u01e0"+
		"\u01e1\5(\25\2\u01e1\u01e2\7\f\2\2\u01e2\u01e5\5\b\5\2\u01e3\u01e6\5,"+
		"\27\2\u01e4\u01e6\5\u00c6d\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4\3\2\2\2\u01e6"+
		"\'\3\2\2\2\u01e7\u01e8\5\6\4\2\u01e8)\3\2\2\2\u01e9\u01ea\7\u009a\2\2"+
		"\u01ea\u01ed\7\22\2\2\u01eb\u01ee\5\60\31\2\u01ec\u01ee\5\6\4\2\u01ed"+
		"\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\7\23"+
		"\2\2\u01f0+\3\2\2\2\u01f1\u01fd\5.\30\2\u01f2\u01f3\5\64\33\2\u01f3\u01f4"+
		"\5.\30\2\u01f4\u01fd\3\2\2\2\u01f5\u01fd\5\6\4\2\u01f6\u01f7\5\64\33\2"+
		"\u01f7\u01f8\5\6\4\2\u01f8\u01fd\3\2\2\2\u01f9\u01fd\58\35\2\u01fa\u01fd"+
		"\5*\26\2\u01fb\u01fd\5\66\34\2\u01fc\u01f1\3\2\2\2\u01fc\u01f2\3\2\2\2"+
		"\u01fc\u01f5\3\2\2\2\u01fc\u01f6\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fc\u01fa"+
		"\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd-\3\2\2\2\u01fe\u0201\5\60\31\2\u01ff"+
		"\u0201\5\62\32\2\u0200\u01fe\3\2\2\2\u0200\u01ff\3\2\2\2\u0201/\3\2\2"+
		"\2\u0202\u0203\t\4\2\2\u0203\61\3\2\2\2\u0204\u0205\7\u00a7\2\2\u0205"+
		"\63\3\2\2\2\u0206\u0207\t\5\2\2\u0207\65\3\2\2\2\u0208\u0209\t\6\2\2\u0209"+
		"\67\3\2\2\2\u020a\u0216\7\u00a5\2\2\u020b\u020e\7\22\2\2\u020c\u020f\5"+
		"\6\4\2\u020d\u020f\7\u00a6\2\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2"+
		"\u020f\u0210\3\2\2\2\u0210\u0212\7\23\2\2\u0211\u0213\58\35\2\u0212\u0211"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u020b\3\2\2\2\u0215"+
		"\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u02179\3\2\2\2"+
		"\u0218\u0216\3\2\2\2\u0219\u021a\7\u0097\2\2\u021a\u021b\5<\37\2\u021b"+
		"\u021c\7\b\2\2\u021c\u0224\5\u00c6d\2\u021d\u021e\7\n\2\2\u021e\u021f"+
		"\5<\37\2\u021f\u0220\7\b\2\2\u0220\u0221\5\u00c6d\2\u0221\u0223\3\2\2"+
		"\2\u0222\u021d\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\7\n\2\2\u0228"+
		";\3\2\2\2\u0229\u022a\5\6\4\2\u022a=\3\2\2\2\u022b\u022c\5\16\b\2\u022c"+
		"\u0231\7\u0088\2\2\u022d\u022e\5@!\2\u022e\u022f\7\n\2\2\u022f\u0232\3"+
		"\2\2\2\u0230\u0232\5\u0118\u008d\2\u0231\u022d\3\2\2\2\u0231\u0230\3\2"+
		"\2\2\u0232\u0233\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"?\3\2\2\2\u0235\u0236\5\u0086D\2\u0236\u0237\7\f\2\2\u0237\u023b\5\b\5"+
		"\2\u0238\u023c\5F$\2\u0239\u023c\5B\"\2\u023a\u023c\5D#\2\u023b\u0238"+
		"\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023c\u023e\3\2\2\2\u023d"+
		"\u023f\5\u00a0Q\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0245"+
		"\3\2\2\2\u0240\u0242\5x=\2\u0241\u0243\5\u00a0Q\2\u0242\u0241\3\2\2\2"+
		"\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0235\3\2\2\2\u0244\u0240"+
		"\3\2\2\2\u0245A\3\2\2\2\u0246\u0248\7v\2\2\u0247\u0249\5\u00acW\2\u0248"+
		"\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\7\13"+
		"\2\2\u024b\u024c\5\u00ba^\2\u024cC\3\2\2\2\u024d\u024f\7\u0081\2\2\u024e"+
		"\u0250\5\u00acW\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250E\3\2\2"+
		"\2\u0251\u0255\5H%\2\u0252\u0255\5P)\2\u0253\u0255\5v<\2\u0254\u0251\3"+
		"\2\2\2\u0254\u0252\3\2\2\2\u0254\u0253\3\2\2\2\u0255G\3\2\2\2\u0256\u025c"+
		"\5J&\2\u0257\u025c\5L\'\2\u0258\u025c\5N(\2\u0259\u025c\5T+\2\u025a\u025c"+
		"\5~@\2\u025b\u0256\3\2\2\2\u025b\u0257\3\2\2\2\u025b\u0258\3\2\2\2\u025b"+
		"\u0259\3\2\2\2\u025b\u025a\3\2\2\2\u025cI\3\2\2\2\u025d\u025e\7\22\2\2"+
		"\u025e\u025f\5\u00b4[\2\u025f\u0260\7\23\2\2\u0260K\3\2\2\2\u0261\u0262"+
		"\5,\27\2\u0262\u0263\7\33\2\2\u0263\u0264\5,\27\2\u0264\u0270\3\2\2\2"+
		"\u0265\u0266\5\u00c6d\2\u0266\u0267\7\33\2\2\u0267\u0268\5\u00c6d\2\u0268"+
		"\u0270\3\2\2\2\u0269\u026a\5\u00c6d\2\u026a\u026b\7\33\2\2\u026b\u026c"+
		"\5\u00c6d\2\u026c\u026d\7\13\2\2\u026d\u026e\5N(\2\u026e\u0270\3\2\2\2"+
		"\u026f\u0261\3\2\2\2\u026f\u0265\3\2\2\2\u026f\u0269\3\2\2\2\u0270M\3"+
		"\2\2\2\u0271\u0272\5\6\4\2\u0272O\3\2\2\2\u0273\u0274\7\u0080\2\2\u0274"+
		"\u0277\5R*\2\u0275\u0277\5R*\2\u0276\u0273\3\2\2\2\u0276\u0275\3\2\2\2"+
		"\u0277Q\3\2\2\2\u0278\u027f\5X-\2\u0279\u027f\5`\61\2\u027a\u027f\5n8"+
		"\2\u027b\u027f\5r:\2\u027c\u027f\5t;\2\u027d\u027f\5V,\2\u027e\u0278\3"+
		"\2\2\2\u027e\u0279\3\2\2\2\u027e\u027a\3\2\2\2\u027e\u027b\3\2\2\2\u027e"+
		"\u027c\3\2\2\2\u027e\u027d\3\2\2\2\u027fS\3\2\2\2\u0280\u0281\7\u009c"+
		"\2\2\u0281\u0284\7\22\2\2\u0282\u0285\5\6\4\2\u0283\u0285\5.\30\2\u0284"+
		"\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\7\23"+
		"\2\2\u0287U\3\2\2\2\u0288\u0289\7\u0098\2\2\u0289\u028d\7\24\2\2\u028a"+
		"\u028e\5,\27\2\u028b\u028e\5\6\4\2\u028c\u028e\5\u00c6d\2\u028d\u028a"+
		"\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0290\7\26\2\2\u0290\u0291\7~\2\2\u0291\u0292\5\b\5\2\u0292\u0293\7\u0099"+
		"\2\2\u0293W\3\2\2\2\u0294\u0295\7k\2\2\u0295\u0296\7\24\2\2\u0296\u0297"+
		"\5Z.\2\u0297\u0298\7\26\2\2\u0298\u0299\7~\2\2\u0299\u029a\5^\60\2\u029a"+
		"\u02a3\3\2\2\2\u029b\u029c\7k\2\2\u029c\u029d\7\25\2\2\u029d\u029e\5Z"+
		".\2\u029e\u029f\7\27\2\2\u029f\u02a0\7~\2\2\u02a0\u02a1\5^\60\2\u02a1"+
		"\u02a3\3\2\2\2\u02a2\u0294\3\2\2\2\u02a2\u029b\3\2\2\2\u02a3Y\3\2\2\2"+
		"\u02a4\u02a9\5\\/\2\u02a5\u02a6\7\t\2\2\u02a6\u02a8\5\\/\2\u02a7\u02a5"+
		"\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa"+
		"[\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\5\b\5\2\u02ad\u02ae\5H%\2\u02ae"+
		"]\3\2\2\2\u02af\u02b0\5\b\5\2\u02b0\u02b1\5F$\2\u02b1_\3\2\2\2\u02b2\u02b4"+
		"\7\u0083\2\2\u02b3\u02b5\5b\62\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2"+
		"\2\u02b5\u02b7\3\2\2\2\u02b6\u02b8\7\n\2\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8"+
		"\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\7s\2\2\u02baa\3\2\2\2\u02bb\u02be"+
		"\5d\63\2\u02bc\u02bd\7\n\2\2\u02bd\u02bf\5h\65\2\u02be\u02bc\3\2\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02c2\5h\65\2\u02c1\u02bb\3\2"+
		"\2\2\u02c1\u02c0\3\2\2\2\u02c2c\3\2\2\2\u02c3\u02c8\5f\64\2\u02c4\u02c5"+
		"\7\n\2\2\u02c5\u02c7\5f\64\2\u02c6\u02c4\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8"+
		"\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2"+
		"\2\2\u02cb\u02cd\7\n\2\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"e\3\2\2\2\u02ce\u02cf\5\u00b4[\2\u02cf\u02d0\7\13\2\2\u02d0\u02d1\5\b"+
		"\5\2\u02d1\u02d3\5F$\2\u02d2\u02d4\5\u009eP\2\u02d3\u02d2\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4g\3\2\2\2\u02d5\u02d6\7m\2\2\u02d6\u02d7\5j\66\2\u02d7"+
		"\u02d8\7~\2\2\u02d8\u02dd\5l\67\2\u02d9\u02da\7\n\2\2\u02da\u02dc\5l\67"+
		"\2\u02db\u02d9\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de"+
		"\3\2\2\2\u02de\u02e8\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e2\7\n\2\2\u02e1"+
		"\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\7\u0094"+
		"\2\2\u02e4\u02e5\7\22\2\2\u02e5\u02e6\5b\62\2\u02e6\u02e7\7\23\2\2\u02e7"+
		"\u02e9\3\2\2\2\u02e8\u02e1\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9i\3\2\2\2"+
		"\u02ea\u02eb\5\6\4\2\u02eb\u02ec\7\13\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02ea"+
		"\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\5\b\5\2\u02f0"+
		"\u02f1\5N(\2\u02f1\u02f4\3\2\2\2\u02f2\u02f4\5N(\2\u02f3\u02ed\3\2\2\2"+
		"\u02f3\u02f2\3\2\2\2\u02f4k\3\2\2\2\u02f5\u02f6\5\u00b6\\\2\u02f6\u02f7"+
		"\7\13\2\2\u02f7\u02f9\7\22\2\2\u02f8\u02fa\5b\62\2\u02f9\u02f8\3\2\2\2"+
		"\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\7\23\2\2\u02fcm\3"+
		"\2\2\2\u02fd\u02fe\7\u0085\2\2\u02fe\u02ff\7~\2\2\u02ff\u0300\5\b\5\2"+
		"\u0300\u0301\5p9\2\u0301o\3\2\2\2\u0302\u0303\5H%\2\u0303q\3\2\2\2\u0304"+
		"\u0305\7t\2\2\u0305\u0306\7~\2\2\u0306\u0307\5\b\5\2\u0307\u0308\5F$\2"+
		"\u0308s\3\2\2\2\u0309\u030a\5\b\5\2\u030a\u030b\7\u009d\2\2\u030bu\3\2"+
		"\2\2\u030c\u030d\5\b\5\2\u030d\u030e\7\30\2\2\u030e\u030f\5\b\5\2\u030f"+
		"\u0310\5F$\2\u0310w\3\2\2\2\u0311\u0312\5|?\2\u0312\u0313\7\22\2\2\u0313"+
		"\u0318\5z>\2\u0314\u0315\7\n\2\2\u0315\u0317\5z>\2\u0316\u0314\3\2\2\2"+
		"\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031b"+
		"\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u031c\7\23\2\2\u031c\u031d\7\f\2\2"+
		"\u031d\u031e\5\b\5\2\u031e\u031f\5F$\2\u031fy\3\2\2\2\u0320\u0325\5\6"+
		"\4\2\u0321\u0322\7\t\2\2\u0322\u0324\5\6\4\2\u0323\u0321\3\2\2\2\u0324"+
		"\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2"+
		"\2\2\u0327\u0325\3\2\2\2\u0328\u0329\7\13\2\2\u0329\u032a\5\b\5\2\u032a"+
		"\u032b\5F$\2\u032b{\3\2\2\2\u032c\u032f\5\6\4\2\u032d\u032f\7\u009c\2"+
		"\2\u032e\u032c\3\2\2\2\u032e\u032d\3\2\2\2\u032f}\3\2\2\2\u0330\u0331"+
		"\5|?\2\u0331\u0332\7\22\2\2\u0332\u0337\5\u0080A\2\u0333\u0334\7\n\2\2"+
		"\u0334\u0336\5\u0080A\2\u0335\u0333\3\2\2\2\u0336\u0339\3\2\2\2\u0337"+
		"\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033a\3\2\2\2\u0339\u0337\3\2"+
		"\2\2\u033a\u033b\7\23\2\2\u033b\177\3\2\2\2\u033c\u0341\5\u00c6d\2\u033d"+
		"\u033e\7\t\2\2\u033e\u0340\5\u00c6d\2\u033f\u033d\3\2\2\2\u0340\u0343"+
		"\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0081\3\2\2\2\u0343"+
		"\u0341\3\2\2\2\u0344\u034a\5\u0084C\2\u0345\u034a\5\u008aF\2\u0346\u034a"+
		"\5\u0092J\2\u0347\u034a\5\u0094K\2\u0348\u034a\5\u0098M\2\u0349\u0344"+
		"\3\2\2\2\u0349\u0345\3\2\2\2\u0349\u0346\3\2\2\2\u0349\u0347\3\2\2\2\u0349"+
		"\u0348\3\2\2\2\u034a\u0083\3\2\2\2\u034b\u034d\5\u0086D\2\u034c\u034b"+
		"\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u035c\7\24\2\2"+
		"\u034f\u0350\5\u008cG\2\u0350\u0351\7\13\2\2\u0351\u0359\5\u0088E\2\u0352"+
		"\u0353\7\n\2\2\u0353\u0354\5\u008cG\2\u0354\u0355\7\13\2\2\u0355\u0356"+
		"\5\u0088E\2\u0356\u0358\3\2\2\2\u0357\u0352\3\2\2\2\u0358\u035b\3\2\2"+
		"\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359"+
		"\3\2\2\2\u035c\u034f\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0366\3\2\2\2\u035e"+
		"\u0360\7\n\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2"+
		"\2\2\u0361\u0362\7\u0094\2\2\u0362\u0364\5\u0088E\2\u0363\u0365\7\n\2"+
		"\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0367\3\2\2\2\u0366\u035f"+
		"\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0388\7\26\2\2"+
		"\u0369\u036b\5\u0086D\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u036c\3\2\2\2\u036c\u037a\7\24\2\2\u036d\u036e\5\u008cG\2\u036e\u036f"+
		"\7\13\2\2\u036f\u0377\5\u0084C\2\u0370\u0371\7\n\2\2\u0371\u0372\5\u008c"+
		"G\2\u0372\u0373\7\13\2\2\u0373\u0374\5\u0084C\2\u0374\u0376\3\2\2\2\u0375"+
		"\u0370\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2"+
		"\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u036d\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u0384\3\2\2\2\u037c\u037e\7\n\2\2\u037d\u037c\3\2"+
		"\2\2\u037d\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\7\u0094\2\2\u0380"+
		"\u0382\5\u0084C\2\u0381\u0383\7\n\2\2\u0382\u0381\3\2\2\2\u0382\u0383"+
		"\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u037d\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"\u0386\3\2\2\2\u0386\u0388\7\26\2\2\u0387\u034c\3\2\2\2\u0387\u036a\3"+
		"\2\2\2\u0388\u0085\3\2\2\2\u0389\u038a\5\6\4\2\u038a\u0087\3\2\2\2\u038b"+
		"\u038c\5\u00c6d\2\u038c\u0089\3\2\2\2\u038d\u038f\5\u0086D\2\u038e\u038d"+
		"\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u039e\7\24\2\2"+
		"\u0391\u0392\5\u008cG\2\u0392\u0393\7\13\2\2\u0393\u039b\5\u0088E\2\u0394"+
		"\u0395\7\n\2\2\u0395\u0396\5\u008cG\2\u0396\u0397\7\13\2\2\u0397\u0398"+
		"\5\u0088E\2\u0398\u039a\3\2\2\2\u0399\u0394\3\2\2\2\u039a\u039d\3\2\2"+
		"\2\u039b\u0399\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u039f\3\2\2\2\u039d\u039b"+
		"\3\2\2\2\u039e\u0391\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03bb\3\2\2\2\u03a0"+
		"\u03a2\7\n\2\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a3\3\2"+
		"\2\2\u03a3\u03a7\7m\2\2\u03a4\u03a5\5\6\4\2\u03a5\u03a6\7\13\2\2\u03a6"+
		"\u03a8\3\2\2\2\u03a7\u03a4\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\3\2"+
		"\2\2\u03a9\u03aa\5\u0090I\2\u03aa\u03ab\7~\2\2\u03ab\u03ac\7\24\2\2\u03ac"+
		"\u03ad\5\u008cG\2\u03ad\u03ae\7\13\2\2\u03ae\u03b6\5\u0088E\2\u03af\u03b0"+
		"\7\n\2\2\u03b0\u03b1\5\u008cG\2\u03b1\u03b2\7\13\2\2\u03b2\u03b3\5\u0088"+
		"E\2\u03b3\u03b5\3\2\2\2\u03b4\u03af\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b9\3\2\2\2\u03b8\u03b6\3\2"+
		"\2\2\u03b9\u03ba\7\26\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03a1\3\2\2\2\u03bb"+
		"\u03bc\3\2\2\2\u03bc\u03c5\3\2\2\2\u03bd\u03bf\7\n\2\2\u03be\u03bd\3\2"+
		"\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\7\u0094\2\2\u03c1"+
		"\u03c3\7\u009f\2\2\u03c2\u03c4\7\n\2\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4"+
		"\3\2\2\2\u03c4\u03c6\3\2\2\2\u03c5\u03be\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6"+
		"\u03c7\3\2\2\2\u03c7\u0404\7\26\2\2\u03c8\u03ca\5\u0086D\2\u03c9\u03c8"+
		"\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03d9\7\24\2\2"+
		"\u03cc\u03cd\5\u008cG\2\u03cd\u03ce\7\13\2\2\u03ce\u03d6\5\u008aF\2\u03cf"+
		"\u03d0\7\n\2\2\u03d0\u03d1\5\u008cG\2\u03d1\u03d2\7\13\2\2\u03d2\u03d3"+
		"\5\u008aF\2\u03d3\u03d5\3\2\2\2\u03d4\u03cf\3\2\2\2\u03d5\u03d8\3\2\2"+
		"\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6"+
		"\3\2\2\2\u03d9\u03cc\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03f6\3\2\2\2\u03db"+
		"\u03dd\7\n\2\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2"+
		"\2\2\u03de\u03e2\7m\2\2\u03df\u03e0\5\6\4\2\u03e0\u03e1\7\13\2\2\u03e1"+
		"\u03e3\3\2\2\2\u03e2\u03df\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2"+
		"\2\2\u03e4\u03e5\5\u0090I\2\u03e5\u03e6\7~\2\2\u03e6\u03e7\7\24\2\2\u03e7"+
		"\u03e8\5\u008cG\2\u03e8\u03e9\7\13\2\2\u03e9\u03f1\5\u008aF\2\u03ea\u03eb"+
		"\7\n\2\2\u03eb\u03ec\5\u008cG\2\u03ec\u03ed\7\13\2\2\u03ed\u03ee\5\u008a"+
		"F\2\u03ee\u03f0\3\2\2\2\u03ef\u03ea\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1"+
		"\u03ef\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03f1\3\2"+
		"\2\2\u03f4\u03f5\7\26\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03dc\3\2\2\2\u03f6"+
		"\u03f7\3\2\2\2\u03f7\u0400\3\2\2\2\u03f8\u03fa\7\n\2\2\u03f9\u03f8\3\2"+
		"\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\7\u0094\2\2\u03fc"+
		"\u03fe\7\u009f\2\2\u03fd\u03ff\7\n\2\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff"+
		"\3\2\2\2\u03ff\u0401\3\2\2\2\u0400\u03f9\3\2\2\2\u0400\u0401\3\2\2\2\u0401"+
		"\u0402\3\2\2\2\u0402\u0404\7\26\2\2\u0403\u038e\3\2\2\2\u0403\u03c9\3"+
		"\2\2\2\u0404\u008b\3\2\2\2\u0405\u040a\5\u008eH\2\u0406\u0407\7\t\2\2"+
		"\u0407\u0409\5\u008eH\2\u0408\u0406\3\2\2\2\u0409\u040c\3\2\2\2\u040a"+
		"\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u008d\3\2\2\2\u040c\u040a\3\2"+
		"\2\2\u040d\u0411\5\6\4\2\u040e\u0411\7\u00a6\2\2\u040f\u0411\5L\'\2\u0410"+
		"\u040d\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u040f\3\2\2\2\u0411\u008f\3\2"+
		"\2\2\u0412\u0413\5\u00c6d\2\u0413\u0091\3\2\2\2\u0414\u0416\5\u0086D\2"+
		"\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0420"+
		"\7\24\2\2\u0418\u041d\5\u0088E\2\u0419\u041a\7\n\2\2\u041a\u041c\5\u0088"+
		"E\2\u041b\u0419\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041d"+
		"\u041e\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u0420\u0418\3\2"+
		"\2\2\u0420\u0421\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\7\26\2\2\u0423"+
		"\u0093\3\2\2\2\u0424\u0426\5\u0086D\2\u0425\u0424\3\2\2\2\u0425\u0426"+
		"\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0430\7\22\2\2\u0428\u042d\5\u0096"+
		"L\2\u0429\u042a\7\t\2\2\u042a\u042c\5\u0096L\2\u042b\u0429\3\2\2\2\u042c"+
		"\u042f\3\2\2\2\u042d\u042b\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u0431\3\2"+
		"\2\2\u042f\u042d\3\2\2\2\u0430\u0428\3\2\2\2\u0430\u0431\3\2\2\2\u0431"+
		"\u0437\3\2\2\2\u0432\u0434\7\n\2\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2"+
		"\2\2\u0434\u0435\3\2\2\2\u0435\u0436\7\u0084\2\2\u0436\u0438\5\u0096L"+
		"\2\u0437\u0433\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u0451"+
		"\7\23\2\2\u043a\u043c\5\u0086D\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2"+
		"\2\u043c\u043d\3\2\2\2\u043d\u0446\7\22\2\2\u043e\u0443\5\u0094K\2\u043f"+
		"\u0440\7\t\2\2\u0440\u0442\5\u0094K\2\u0441\u043f\3\2\2\2\u0442\u0445"+
		"\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0447\3\2\2\2\u0445"+
		"\u0443\3\2\2\2\u0446\u043e\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u044d\3\2"+
		"\2\2\u0448\u044a\7\n\2\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a"+
		"\u044b\3\2\2\2\u044b\u044c\7\u0084\2\2\u044c\u044e\5\u0094K\2\u044d\u0449"+
		"\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0451\7\23\2\2"+
		"\u0450\u0425\3\2\2\2\u0450\u043b\3\2\2\2\u0451\u0095\3\2\2\2\u0452\u0453"+
		"\7\u00a6\2\2\u0453\u0455\7~\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2"+
		"\2\u0455\u0456\3\2\2\2\u0456\u0457\5\u00c6d\2\u0457\u0097\3\2\2\2\u0458"+
		"\u045a\5\u0086D\2\u0459\u0458\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b"+
		"\3\2\2\2\u045b\u0464\7\22\2\2\u045c\u0461\5\u0096L\2\u045d\u045e\7\t\2"+
		"\2\u045e\u0460\5\u0096L\2\u045f\u045d\3\2\2\2\u0460\u0463\3\2\2\2\u0461"+
		"\u045f\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2"+
		"\2\2\u0464\u045c\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0473\3\2\2\2\u0466"+
		"\u0468\7\n\2\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2"+
		"\2\2\u0469\u046a\5\u0090I\2\u046a\u046b\7\t\2\2\u046b\u0470\5\u0096L\2"+
		"\u046c\u046d\7\n\2\2\u046d\u046f\5\u0096L\2\u046e\u046c\3\2\2\2\u046f"+
		"\u0472\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0474\3\2"+
		"\2\2\u0472\u0470\3\2\2\2\u0473\u0467\3\2\2\2\u0473\u0474\3\2\2\2\u0474"+
		"\u0475\3\2\2\2\u0475\u0495\7\23\2\2\u0476\u0478\5\u0086D\2\u0477\u0476"+
		"\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u0482\7\22\2\2"+
		"\u047a\u047f\5\u0098M\2\u047b\u047c\7\t\2\2\u047c\u047e\5\u0098M\2\u047d"+
		"\u047b\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2"+
		"\2\2\u0480\u0483\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u047a\3\2\2\2\u0482"+
		"\u0483\3\2\2\2\u0483\u0491\3\2\2\2\u0484\u0486\7\n\2\2\u0485\u0484\3\2"+
		"\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\5\u0090I\2\u0488"+
		"\u0489\7\t\2\2\u0489\u048e\5\u0098M\2\u048a\u048b\7\n\2\2\u048b\u048d"+
		"\5\u0098M\2\u048c\u048a\3\2\2\2\u048d\u0490\3\2\2\2\u048e\u048c\3\2\2"+
		"\2\u048e\u048f\3\2\2\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0491\u0485"+
		"\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0495\7\23\2\2"+
		"\u0494\u0459\3\2\2\2\u0494\u0477\3\2\2\2\u0495\u0099\3\2\2\2\u0496\u0497"+
		"\5\20\t\2\u0497\u049c\7\u008a\2\2\u0498\u0499\5\u009cO\2\u0499\u049a\7"+
		"\n\2\2\u049a\u049d\3\2\2\2\u049b\u049d\5\u0118\u008d\2\u049c\u0498\3\2"+
		"\2\2\u049c\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049c\3\2\2\2\u049e"+
		"\u049f\3\2\2\2\u049f\u009b\3\2\2\2\u04a0\u04a1\5\u00b4[\2\u04a1\u04a2"+
		"\7\13\2\2\u04a2\u04a3\5\b\5\2\u04a3\u04a5\5F$\2\u04a4\u04a6\5\u009eP\2"+
		"\u04a5\u04a4\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u009d\3\2\2\2\u04a7\u04aa"+
		"\5\u00a0Q\2\u04a8\u04aa\5\u00a2R\2\u04a9\u04a7\3\2\2\2\u04a9\u04a8\3\2"+
		"\2\2\u04aa\u009f\3\2\2\2\u04ab\u04ac\7\u0097\2\2\u04ac\u04b6\5\6\4\2\u04ad"+
		"\u04ae\7\u0097\2\2\u04ae\u04b6\5\u00d2j\2\u04af\u04b0\7\u0097\2\2\u04b0"+
		"\u04b6\7\u009f\2\2\u04b1\u04b2\7\u0097\2\2\u04b2\u04b6\5\u0082B\2\u04b3"+
		"\u04b4\7\u0097\2\2\u04b4\u04b6\5\u00c6d\2\u04b5\u04ab\3\2\2\2\u04b5\u04ad"+
		"\3\2\2\2\u04b5\u04af\3\2\2\2\u04b5\u04b1\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b6"+
		"\u00a1\3\2\2\2\u04b7\u04b8\7\b\2\2\u04b8\u04c2\5\6\4\2\u04b9\u04ba\7\b"+
		"\2\2\u04ba\u04c2\5\u00d2j\2\u04bb\u04bc\7\b\2\2\u04bc\u04c2\7\u009f\2"+
		"\2\u04bd\u04be\7\b\2\2\u04be\u04c2\5\u0082B\2\u04bf\u04c0\7\b\2\2\u04c0"+
		"\u04c2\5\u00c6d\2\u04c1\u04b7\3\2\2\2\u04c1\u04b9\3\2\2\2\u04c1\u04bb"+
		"\3\2\2\2\u04c1\u04bd\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c2\u00a3\3\2\2\2\u04c3"+
		"\u04c4\7\u0087\2\2\u04c4\u04c5\7l\2\2\u04c5\u04c8\7p\2\2\u04c6\u04c9\5"+
		"\u00f8}\2\u04c7\u04c9\5\u00bc_\2\u04c8\u04c6\3\2\2\2\u04c8\u04c7\3\2\2"+
		"\2\u04c9\u04ca\3\2\2\2\u04ca\u04cb\7\n\2\2\u04cb\u04cc\7\u0087\2\2\u04cc"+
		"\u04cd\7s\2\2\u04cd\u04d0\7p\2\2\u04ce\u04d1\5\u00f8}\2\u04cf\u04d1\5"+
		"\u00bc_\2\u04d0\u04ce\3\2\2\2\u04d0\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2"+
		"\u04d2\u04d3\7\n\2\2\u04d3\u04e7\3\2\2\2\u04d4\u04d5\7\u0087\2\2\u04d5"+
		"\u04d6\7l\2\2\u04d6\u04d9\7p\2\2\u04d7\u04da\5\u00f8}\2\u04d8\u04da\5"+
		"\u00bc_\2\u04d9\u04d7\3\2\2\2\u04d9\u04d8\3\2\2\2\u04da\u04db\3\2\2\2"+
		"\u04db\u04dc\7\n\2\2\u04dc\u04e7\3\2\2\2\u04dd\u04de\7\u0087\2\2\u04de"+
		"\u04df\7s\2\2\u04df\u04e2\7p\2\2\u04e0\u04e3\5\u00f8}\2\u04e1\u04e3\5"+
		"\u00bc_\2\u04e2\u04e0\3\2\2\2\u04e2\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2"+
		"\u04e4\u04e5\7\n\2\2\u04e5\u04e7\3\2\2\2\u04e6\u04c3\3\2\2\2\u04e6\u04d4"+
		"\3\2\2\2\u04e6\u04dd\3\2\2\2\u04e7\u00a5\3\2\2\2\u04e8\u04e9\5\b\5\2\u04e9"+
		"\u04ef\5\u00a8U\2\u04ea\u04f0\5\36\20\2\u04eb\u04f0\7c\2\2\u04ec\u04f0"+
		"\7b\2\2\u04ed\u04f0\7d\2\2\u04ee\u04f0\7e\2\2\u04ef\u04ea\3\2\2\2\u04ef"+
		"\u04eb\3\2\2\2\u04ef\u04ec\3\2\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04ee\3\2"+
		"\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\7\n\2\2\u04f2\u00a7\3\2\2\2\u04f3"+
		"\u04f6\5\u00aaV\2\u04f4\u04f6\5\u00b8]\2\u04f5\u04f3\3\2\2\2\u04f5\u04f4"+
		"\3\2\2\2\u04f6\u00a9\3\2\2\2\u04f7\u04f8\7\u0081\2\2\u04f8\u04fa\5\6\4"+
		"\2\u04f9\u04fb\5\u00acW\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb"+
		"\u04fc\3\2\2\2\u04fc\u04fd\7\n\2\2\u04fd\u00ab\3\2\2\2\u04fe\u0500\7\22"+
		"\2\2\u04ff\u0501\5\u00dco\2\u0500\u04ff\3\2\2\2\u0500\u0501\3\2\2\2\u0501"+
		"\u0502\3\2\2\2\u0502\u050a\5\u00aeX\2\u0503\u0505\7\n\2\2\u0504\u0506"+
		"\5\u00dco\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2"+
		"\2\u0507\u0509\5\u00aeX\2\u0508\u0503\3\2\2\2\u0509\u050c\3\2\2\2\u050a"+
		"\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050d\3\2\2\2\u050c\u050a\3\2"+
		"\2\2\u050d\u050e\7\23\2\2\u050e\u00ad\3\2\2\2\u050f\u0526\5\u00b0Y\2\u0510"+
		"\u0511\7\u008a\2\2\u0511\u0526\5\u00b0Y\2\u0512\u0513\5\b\5\2\u0513\u0514"+
		"\7v\2\2\u0514\u0516\5\6\4\2\u0515\u0517\5\u00acW\2\u0516\u0515\3\2\2\2"+
		"\u0516\u0517\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\7\13\2\2\u0519\u051a"+
		"\5\b\5\2\u051a\u051b\5\u00ba^\2\u051b\u051c\5\u00b2Z\2\u051c\u0526\3\2"+
		"\2\2\u051d\u051e\5\b\5\2\u051e\u051f\7\u0081\2\2\u051f\u0521\5\6\4\2\u0520"+
		"\u0522\5\u00acW\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523"+
		"\3\2\2\2\u0523\u0524\5\u00b2Z\2\u0524\u0526\3\2\2\2\u0525\u050f\3\2\2"+
		"\2\u0525\u0510\3\2\2\2\u0525\u0512\3\2\2\2\u0525\u051d\3\2\2\2\u0526\u00af"+
		"\3\2\2\2\u0527\u0528\5\u00b4[\2\u0528\u0529\7\13\2\2\u0529\u052a\5\b\5"+
		"\2\u052a\u052b\5F$\2\u052b\u052c\5\u00b2Z\2\u052c\u00b1\3\2\2\2\u052d"+
		"\u052f\7\b\2\2\u052e\u0530\5\u00dco\2\u052f\u052e\3\2\2\2\u052f\u0530"+
		"\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0533\5\u00c6d\2\u0532\u052d\3\2\2"+
		"\2\u0532\u0533\3\2\2\2\u0533\u00b3\3\2\2\2\u0534\u0539\5\6\4\2\u0535\u0536"+
		"\7\t\2\2\u0536\u0538\5\6\4\2\u0537\u0535\3\2\2\2\u0538\u053b\3\2\2\2\u0539"+
		"\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u00b5\3\2\2\2\u053b\u0539\3\2"+
		"\2\2\u053c\u0541\5,\27\2\u053d\u053e\t\7\2\2\u053e\u0540\5,\27\2\u053f"+
		"\u053d\3\2\2\2\u0540\u0543\3\2\2\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2"+
		"\2\2\u0542\u054d\3\2\2\2\u0543\u0541\3\2\2\2\u0544\u0549\5\u00d8m\2\u0545"+
		"\u0546\t\7\2\2\u0546\u0548\5\u00d8m\2\u0547\u0545\3\2\2\2\u0548\u054b"+
		"\3\2\2\2\u0549\u0547\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054d\3\2\2\2\u054b"+
		"\u0549\3\2\2\2\u054c\u053c\3\2\2\2\u054c\u0544\3\2\2\2\u054d\u00b7\3\2"+
		"\2\2\u054e\u054f\7v\2\2\u054f\u0551\5\6\4\2\u0550\u0552\5\u00acW\2\u0551"+
		"\u0550\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0554\7\13"+
		"\2\2\u0554\u0555\5\b\5\2\u0555\u0556\5\u00ba^\2\u0556\u0557\7\n\2\2\u0557"+
		"\u00b9\3\2\2\2\u0558\u0559\5N(\2\u0559\u00bb\3\2\2\2\u055a\u055b\5\"\22"+
		"\2\u055b\u055c\7\13\2\2\u055c\u055d\5\u00be`\2\u055d\u0560\3\2\2\2\u055e"+
		"\u0560\5\u00be`\2\u055f\u055a\3\2\2\2\u055f\u055e\3\2\2\2\u0560\u00bd"+
		"\3\2\2\2\u0561\u0564\5\u00c0a\2\u0562\u0564\5\u00f6|\2\u0563\u0561\3\2"+
		"\2\2\u0563\u0562\3\2\2\2\u0564\u00bf\3\2\2\2\u0565\u056e\5\u00c2b\2\u0566"+
		"\u056e\5\u00e4s\2\u0567\u056e\5\u00eav\2\u0568\u056e\5\u00ecw\2\u0569"+
		"\u056e\5\u00eex\2\u056a\u056e\5\u00f0y\2\u056b\u056e\5\30\r\2\u056c\u056e"+
		"\5\u00f4{\2\u056d\u0565\3\2\2\2\u056d\u0566\3\2\2\2\u056d\u0567\3\2\2"+
		"\2\u056d\u0568\3\2\2\2\u056d\u0569\3\2\2\2\u056d\u056a\3\2\2\2\u056d\u056b"+
		"\3\2\2\2\u056d\u056c\3\2\2\2\u056e\u00c1\3\2\2\2\u056f\u0570\5\u00c4c"+
		"\2\u0570\u0571\7\b\2\2\u0571\u0572\5\u00c6d\2\u0572\u00c3\3\2\2\2\u0573"+
		"\u0574\7\31\2\2\u0574\u0577\5\6\4\2\u0575\u0577\5\6\4\2\u0576\u0573\3"+
		"\2\2\2\u0576\u0575\3\2\2\2\u0577\u0593\3\2\2\2\u0578\u0579\7\24\2\2\u0579"+
		"\u057e\5\u00c6d\2\u057a\u057b\7\t\2\2\u057b\u057d\5\u00c6d\2\u057c\u057a"+
		"\3\2\2\2\u057d\u0580\3\2\2\2\u057e\u057c\3\2\2\2\u057e\u057f\3\2\2\2\u057f"+
		"\u0581\3\2\2\2\u0580\u057e\3\2\2\2\u0581\u0582\7\26\2\2\u0582\u0592\3"+
		"\2\2\2\u0583\u0584\7\25\2\2\u0584\u0589\5\u00c6d\2\u0585\u0586\7\t\2\2"+
		"\u0586\u0588\5\u00c6d\2\u0587\u0585\3\2\2\2\u0588\u058b\3\2\2\2\u0589"+
		"\u0587\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058c\3\2\2\2\u058b\u0589\3\2"+
		"\2\2\u058c\u058d\7\27\2\2\u058d\u0592\3\2\2\2\u058e\u058f\7\32\2\2\u058f"+
		"\u0592\5\6\4\2\u0590\u0592\7\30\2\2\u0591\u0578\3\2\2\2\u0591\u0583\3"+
		"\2\2\2\u0591\u058e\3\2\2\2\u0591\u0590\3\2\2\2\u0592\u0595\3\2\2\2\u0593"+
		"\u0591\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0599\3\2\2\2\u0595\u0593\3\2"+
		"\2\2\u0596\u0597\7\13\2\2\u0597\u0598\7\13\2\2\u0598\u059a\5\6\4\2\u0599"+
		"\u0596\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u00c5\3\2\2\2\u059b\u059f\5\u00ca"+
		"f\2\u059c\u059d\5\u00c8e\2\u059d\u059e\5\u00c6d\2\u059e\u05a0\3\2\2\2"+
		"\u059f\u059c\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a4\3\2\2\2\u05a1\u05a2"+
		"\7\13\2\2\u05a2\u05a3\7\13\2\2\u05a3\u05a5\5\6\4\2\u05a4\u05a1\3\2\2\2"+
		"\u05a4\u05a5\3\2\2\2\u05a5\u00c7\3\2\2\2\u05a6\u05b0\7\f\2\2\u05a7\u05b0"+
		"\7\r\2\2\u05a8\u05b0\7\16\2\2\u05a9\u05b0\7\17\2\2\u05aa\u05b0\7\20\2"+
		"\2\u05ab\u05b0\7\21\2\2\u05ac\u05b0\7y\2\2\u05ad\u05ae\7}\2\2\u05ae\u05b0"+
		"\7y\2\2\u05af\u05a6\3\2\2\2\u05af\u05a7\3\2\2\2\u05af\u05a8\3\2\2\2\u05af"+
		"\u05a9\3\2\2\2\u05af\u05aa\3\2\2\2\u05af\u05ab\3\2\2\2\u05af\u05ac\3\2"+
		"\2\2\u05af\u05ad\3\2\2\2\u05b0\u00c9\3\2\2\2\u05b1\u05b5\5\u00ceh\2\u05b2"+
		"\u05b3\5\u00ccg\2\u05b3\u05b4\5\u00caf\2\u05b4\u05b6\3\2\2\2\u05b5\u05b2"+
		"\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u00cb\3\2\2\2\u05b7\u05b8\t\b\2\2\u05b8"+
		"\u00cd\3\2\2\2\u05b9\u05bd\5\u00d2j\2\u05ba\u05bb\5\u00d0i\2\u05bb\u05bc"+
		"\5\u00ceh\2\u05bc\u05be\3\2\2\2\u05bd\u05ba\3\2\2\2\u05bd\u05be\3\2\2"+
		"\2\u05be\u00cf\3\2\2\2\u05bf\u05c0\t\t\2\2\u05c0\u00d1\3\2\2\2\u05c1\u05c3"+
		"\t\5\2\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4"+
		"\u05c5\5\u00d4k\2\u05c5\u00d3\3\2\2\2\u05c6\u05d6\5\u00c4c\2\u05c7\u05c8"+
		"\7\22\2\2\u05c8\u05c9\5\u00c6d\2\u05c9\u05ca\7\23\2\2\u05ca\u05d6\3\2"+
		"\2\2\u05cb\u05d6\5\u00d8m\2\u05cc\u05d6\5\u00d6l\2\u05cd\u05d6\5\u00de"+
		"p\2\u05ce\u05cf\5\6\4\2\u05cf\u05d0\5\u00dep\2\u05d0\u05d6\3\2\2\2\u05d1"+
		"\u05d2\7}\2\2\u05d2\u05d6\5\u00d4k\2\u05d3\u05d6\5\66\34\2\u05d4\u05d6"+
		"\5\30\r\2\u05d5\u05c6\3\2\2\2\u05d5\u05c7\3\2\2\2\u05d5\u05cb\3\2\2\2"+
		"\u05d5\u05cc\3\2\2\2\u05d5\u05cd\3\2\2\2\u05d5\u05ce\3\2\2\2\u05d5\u05d1"+
		"\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d4\3\2\2\2\u05d6\u00d5\3\2\2\2\u05d7"+
		"\u05dd\5.\30\2\u05d8\u05dd\5*\26\2\u05d9\u05dd\58\35\2\u05da\u05dd\7|"+
		"\2\2\u05db\u05dd\7\u009f\2\2\u05dc\u05d7\3\2\2\2\u05dc\u05d8\3\2\2\2\u05dc"+
		"\u05d9\3\2\2\2\u05dc\u05da\3\2\2\2\u05dc\u05db\3\2\2\2\u05dd\u00d7\3\2"+
		"\2\2\u05de\u05df\5\6\4\2\u05df\u05e0\7\22\2\2\u05e0\u05e1\5\u00dan\2\u05e1"+
		"\u05e2\7\23\2\2\u05e2\u00d9\3\2\2\2\u05e3\u05e5\5\u00dco\2\u05e4\u05e3"+
		"\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e7\3\2\2\2\u05e6\u05e8\5\u00e6t"+
		"\2\u05e7\u05e6\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05f2\3\2\2\2\u05e9\u05eb"+
		"\7\t\2\2\u05ea\u05ec\5\u00dco\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3\2\2"+
		"\2\u05ec\u05ee\3\2\2\2\u05ed\u05ef\5\u00e6t\2\u05ee\u05ed\3\2\2\2\u05ee"+
		"\u05ef\3\2\2\2\u05ef\u05f1\3\2\2\2\u05f0\u05e9\3\2\2\2\u05f1\u05f4\3\2"+
		"\2\2\u05f2\u05f0\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u00db\3\2\2\2\u05f4"+
		"\u05f2\3\2\2\2\u05f5\u05f6\t\n\2\2\u05f6\u00dd\3\2\2\2\u05f7\u05f8\7\24"+
		"\2\2\u05f8\u05f9\5\u00e0q\2\u05f9\u05fa\7\26\2\2\u05fa\u0601\3\2\2\2\u05fb"+
		"\u05fc\7\25\2\2\u05fc\u05fd\5\u00e0q\2\u05fd\u05fe\7\27\2\2\u05fe\u0601"+
		"\3\2\2\2\u05ff\u0601\5\u0082B\2\u0600\u05f7\3\2\2\2\u0600\u05fb\3\2\2"+
		"\2\u0600\u05ff\3\2\2\2\u0601\u00df\3\2\2\2\u0602\u0607\5\u00e2r\2\u0603"+
		"\u0604\7\t\2\2\u0604\u0606\5\u00e2r\2\u0605\u0603\3\2\2\2\u0606\u0609"+
		"\3\2\2\2\u0607\u0605\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060c\3\2\2\2\u0609"+
		"\u0607\3\2\2\2\u060a\u060c\3\2\2\2\u060b\u0602\3\2\2\2\u060b\u060a\3\2"+
		"\2\2\u060c\u00e1\3\2\2\2\u060d\u0610\5\u00c6d\2\u060e\u060f\7\33\2\2\u060f"+
		"\u0611\5\u00c6d\2\u0610\u060e\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u00e3"+
		"\3\2\2\2\u0612\u0617\5\6\4\2\u0613\u0614\7\22\2\2\u0614\u0615\5\u00da"+
		"n\2\u0615\u0616\7\23\2\2\u0616\u0618\3\2\2\2\u0617\u0613\3\2\2\2\u0617"+
		"\u0618\3\2\2\2\u0618\u00e5\3\2\2\2\u0619\u061d\5\u00c6d\2\u061a\u061c"+
		"\5\u00e8u\2\u061b\u061a\3\2\2\2\u061c\u061f\3\2\2\2\u061d\u061b\3\2\2"+
		"\2\u061d\u061e\3\2\2\2\u061e\u0631\3\2\2\2\u061f\u061d\3\2\2\2\u0620\u0621"+
		"\5\6\4\2\u0621\u0623\7\b\2\2\u0622\u0624\5\u00dco\2\u0623\u0622\3\2\2"+
		"\2\u0623\u0624\3\2\2\2\u0624\u0627\3\2\2\2\u0625\u0628\5\6\4\2\u0626\u0628"+
		"\5\u00c6d\2\u0627\u0625\3\2\2\2\u0627\u0626\3\2\2\2\u0628\u0631\3\2\2"+
		"\2\u0629\u062a\5\6\4\2\u062a\u062b\7\b\2\2\u062b\u062c\5\u00dco\2\u062c"+
		"\u062d\7\22\2\2\u062d\u062e\5\u00c6d\2\u062e\u062f\7\23\2\2\u062f\u0631"+
		"\3\2\2\2\u0630\u0619\3\2\2\2\u0630\u0620\3\2\2\2\u0630\u0629\3\2\2\2\u0631"+
		"\u00e7\3\2\2\2\u0632\u0633\7\13\2\2\u0633\u0634\5\u00c6d\2\u0634\u00e9"+
		"\3\2\2\2\u0635\u0636\7w\2\2\u0636\u0637\5\"\22\2\u0637\u00eb\3\2\2\2\u0638"+
		"\u0639\7\u0090\2\2\u0639\u00ed\3\2\2\2\u063a\u063b\7\u0091\2\2\u063b\u00ef"+
		"\3\2\2\2\u063c\u063d\7\u0096\2\2\u063d\u063e\5\u00c6d\2\u063e\u00f1\3"+
		"\2\2\2\u063f\u0640\7\u00a5\2\2\u0640\u00f3\3\2\2\2\u0641\u0642\3\2\2\2"+
		"\u0642\u00f5\3\2\2\2\u0643\u0648\5\u00f8}\2\u0644\u0648\5\u00fe\u0080"+
		"\2\u0645\u0648\5\u0106\u0084\2\u0646\u0648\5\u0114\u008b\2\u0647\u0643"+
		"\3\2\2\2\u0647\u0644\3\2\2\2\u0647\u0645\3\2\2\2\u0647\u0646\3\2\2\2\u0648"+
		"\u00f7\3\2\2\2\u0649\u064a\7l\2\2\u064a\u064b\5\u00fc\177\2\u064b\u064c"+
		"\7s\2\2\u064c\u00f9\3\2\2\2\u064d\u064e\5\u00fc\177\2\u064e\u064f\7s\2"+
		"\2\u064f\u00fb\3\2\2\2\u0650\u0655\5\u00bc_\2\u0651\u0652\7\n\2\2\u0652"+
		"\u0654\5\u00bc_\2\u0653\u0651\3\2\2\2\u0654\u0657\3\2\2\2\u0655\u0653"+
		"\3\2\2\2\u0655\u0656\3\2\2\2\u0656\u0659\3\2\2\2\u0657\u0655\3\2\2\2\u0658"+
		"\u065a\7\n\2\2\u0659\u0658\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u00fd\3\2"+
		"\2\2\u065b\u065e\5\u0100\u0081\2\u065c\u065e\5\u0102\u0082\2\u065d\u065b"+
		"\3\2\2\2\u065d\u065c\3\2\2\2\u065e\u00ff\3\2\2\2\u065f\u0660\7x\2\2\u0660"+
		"\u0661\5\u00c6d\2\u0661\u0662\7\u0086\2\2\u0662\u0664\5\u00bc_\2\u0663"+
		"\u0665\7\n\2\2\u0664\u0663\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u066b\3\2"+
		"\2\2\u0666\u0667\7r\2\2\u0667\u0669\5\u00bc_\2\u0668\u066a\7\n\2\2\u0669"+
		"\u0668\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u066c\3\2\2\2\u066b\u0666\3\2"+
		"\2\2\u066b\u066c\3\2\2\2\u066c\u0101\3\2\2\2\u066d\u066e\7m\2\2\u066e"+
		"\u066f\5\u00c6d\2\u066f\u0678\7~\2\2\u0670\u0675\5\u0104\u0083\2\u0671"+
		"\u0672\7\n\2\2\u0672\u0674\5\u0104\u0083\2\u0673\u0671\3\2\2\2\u0674\u0677"+
		"\3\2\2\2\u0675\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0679\3\2\2\2\u0677"+
		"\u0675\3\2\2\2\u0678\u0670\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067f\3\2"+
		"\2\2\u067a\u067c\7\n\2\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2\2\u067c"+
		"\u067d\3\2\2\2\u067d\u067e\7\u0094\2\2\u067e\u0680\5\u00fc\177\2\u067f"+
		"\u067b\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0682\3\2\2\2\u0681\u0683\7\n"+
		"\2\2\u0682\u0681\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u0684\3\2\2\2\u0684"+
		"\u0685\7s\2\2\u0685\u0103\3\2\2\2\u0686\u0687\5\u00b6\\\2\u0687\u0688"+
		"\7\13\2\2\u0688\u0689\5\u00bc_\2\u0689\u0105\3\2\2\2\u068a\u068e\5\u0108"+
		"\u0085\2\u068b\u068e\5\u010a\u0086\2\u068c\u068e\5\u010c\u0087\2\u068d"+
		"\u068a\3\2\2\2\u068d\u068b\3\2\2\2\u068d\u068c\3\2\2\2\u068e\u0107\3\2"+
		"\2\2\u068f\u0690\7\u008b\2\2\u0690\u0691\5\u00c6d\2\u0691\u0692\7p\2\2"+
		"\u0692\u0693\5\u00bc_\2\u0693\u0109\3\2\2\2\u0694\u0695\7\u0084\2\2\u0695"+
		"\u0696\5\u00fc\177\2\u0696\u0697\7\u0089\2\2\u0697\u0698\5\u00c6d\2\u0698"+
		"\u010b\3\2\2\2\u0699\u069a\7u\2\2\u069a\u069b\5\6\4\2\u069b\u069c\7\b"+
		"\2\2\u069c\u069d\5\u010e\u0088\2\u069d\u069e\7p\2\2\u069e\u069f\5\u00bc"+
		"_\2\u069f\u06a8\3\2\2\2\u06a0\u06a1\7u\2\2\u06a1\u06a2\5\6\4\2\u06a2\u06a3"+
		"\7y\2\2\u06a3\u06a4\5\u00c6d\2\u06a4\u06a5\7p\2\2\u06a5\u06a6\5\u00bc"+
		"_\2\u06a6\u06a8\3\2\2\2\u06a7\u0699\3\2\2\2\u06a7\u06a0\3\2\2\2\u06a8"+
		"\u010d\3\2\2\2\u06a9\u06aa\5\u0110\u0089\2\u06aa\u06ab\t\13\2\2\u06ab"+
		"\u06ac\5\u0112\u008a\2\u06ac\u010f\3\2\2\2\u06ad\u06ae\5\u00c6d\2\u06ae"+
		"\u0111\3\2\2\2\u06af\u06b0\5\u00c6d\2\u06b0\u0113\3\2\2\2\u06b1\u06b2"+
		"\7\u008c\2\2\u06b2\u06b3\5\u0116\u008c\2\u06b3\u06b4\7p\2\2\u06b4\u06b5"+
		"\5\u00bc_\2\u06b5\u0115\3\2\2\2\u06b6\u06bb\5\u00c4c\2\u06b7\u06b8\7\t"+
		"\2\2\u06b8\u06ba\5\u00c4c\2\u06b9\u06b7\3\2\2\2\u06ba\u06bd\3\2\2\2\u06bb"+
		"\u06b9\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06c7\3\2\2\2\u06bd\u06bb\3\2"+
		"\2\2\u06be\u06c7\5~@\2\u06bf\u06c0\7\t\2\2\u06c0\u06c2\5~@\2\u06c1\u06bf"+
		"\3\2\2\2\u06c2\u06c5\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4"+
		"\u06c7\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c6\u06b6\3\2\2\2\u06c6\u06be\3\2"+
		"\2\2\u06c6\u06c3\3\2\2\2\u06c7\u0117\3\2\2\2\u06c8\u06c9\7#\2\2\u06c9"+
		"\u06ca\7\u00a5\2\2\u06ca\u0119\3\2\2\2\u06cb\u06cc\7$\2\2\u06cc\u06cd"+
		"\7\u00a5\2\2\u06cd\u011b\3\2\2\2\u06ce\u06cf\t\f\2\2\u06cf\u06d0\7\u00a5"+
		"\2\2\u06d0\u011d\3\2\2\2\u06d1\u06d2\7,\2\2\u06d2\u06d3\7\22\2\2\u06d3"+
		"\u06d4\5\6\4\2\u06d4\u06d5\7\23\2\2\u06d5\u011f\3\2\2\2\u06d6\u06d7\t"+
		"\r\2\2\u06d7\u06d8\7\22\2\2\u06d8\u06dd\5\u00f2z\2\u06d9\u06da\7\t\2\2"+
		"\u06da\u06dc\5\u00f2z\2\u06db\u06d9\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd"+
		"\u06db\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e0\3\2\2\2\u06df\u06dd\3\2"+
		"\2\2\u06e0\u06e1\7\23\2\2\u06e1\u0121\3\2\2\2\u06e2\u06e3\t\16\2\2\u06e3"+
		"\u0123\3\2\2\2\u06e4\u06e5\7\'\2\2\u06e5\u06e6\5\u00c6d\2\u06e6\u06e7"+
		"\7(\2\2\u06e7\u06e9\5\u0126\u0094\2\u06e8\u06ea\7\n\2\2\u06e9\u06e8\3"+
		"\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06f4\3\2\2\2\u06eb\u06ec\7)\2\2\u06ec"+
		"\u06ed\5\u00c6d\2\u06ed\u06ee\7(\2\2\u06ee\u06f0\5\u0126\u0094\2\u06ef"+
		"\u06f1\7\n\2\2\u06f0\u06ef\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06f3\3\2"+
		"\2\2\u06f2\u06eb\3\2\2\2\u06f3\u06f6\3\2\2\2\u06f4\u06f2\3\2\2\2\u06f4"+
		"\u06f5\3\2\2\2\u06f5\u06fc\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f7\u06f8\7*"+
		"\2\2\u06f8\u06fa\5\u0126\u0094\2\u06f9\u06fb\7\n\2\2\u06fa\u06f9\3\2\2"+
		"\2\u06fa\u06fb\3\2\2\2\u06fb\u06fd\3\2\2\2\u06fc\u06f7\3\2\2\2\u06fc\u06fd"+
		"\3\2\2\2\u06fd\u06fe\3\2\2\2\u06fe\u06ff\7+\2\2\u06ff\u0125\3\2\2\2\u0700"+
		"\u0704\5\u00bc_\2\u0701\u0704\5\u00c6d\2\u0702\u0704\5\32\16\2\u0703\u0700"+
		"\3\2\2\2\u0703\u0701\3\2\2\2\u0703\u0702\3\2\2\2\u0704\u0127\3\2\2\2\u00dc"+
		"\u012b\u0139\u0144\u0148\u014d\u0155\u015a\u0162\u0167\u016f\u0174\u017c"+
		"\u0181\u0189\u018e\u0194\u0199\u019d\u01a2\u01af\u01b8\u01ba\u01c0\u01c3"+
		"\u01ce\u01d5\u01dc\u01de\u01e5\u01ed\u01fc\u0200\u020e\u0212\u0216\u0224"+
		"\u0231\u0233\u023b\u023e\u0242\u0244\u0248\u024f\u0254\u025b\u026f\u0276"+
		"\u027e\u0284\u028d\u02a2\u02a9\u02b4\u02b7\u02be\u02c1\u02c8\u02cc\u02d3"+
		"\u02dd\u02e1\u02e8\u02ed\u02f3\u02f9\u0318\u0325\u032e\u0337\u0341\u0349"+
		"\u034c\u0359\u035c\u035f\u0364\u0366\u036a\u0377\u037a\u037d\u0382\u0384"+
		"\u0387\u038e\u039b\u039e\u03a1\u03a7\u03b6\u03bb\u03be\u03c3\u03c5\u03c9"+
		"\u03d6\u03d9\u03dc\u03e2\u03f1\u03f6\u03f9\u03fe\u0400\u0403\u040a\u0410"+
		"\u0415\u041d\u0420\u0425\u042d\u0430\u0433\u0437\u043b\u0443\u0446\u0449"+
		"\u044d\u0450\u0454\u0459\u0461\u0464\u0467\u0470\u0473\u0477\u047f\u0482"+
		"\u0485\u048e\u0491\u0494\u049c\u049e\u04a5\u04a9\u04b5\u04c1\u04c8\u04d0"+
		"\u04d9\u04e2\u04e6\u04ef\u04f5\u04fa\u0500\u0505\u050a\u0516\u0521\u0525"+
		"\u052f\u0532\u0539\u0541\u0549\u054c\u0551\u055f\u0563\u056d\u0576\u057e"+
		"\u0589\u0591\u0593\u0599\u059f\u05a4\u05af\u05b5\u05bd\u05c2\u05d5\u05dc"+
		"\u05e4\u05e7\u05eb\u05ee\u05f2\u0600\u0607\u060b\u0610\u0617\u061d\u0623"+
		"\u0627\u0630\u0647\u0655\u0659\u065d\u0664\u0669\u066b\u0675\u0678\u067b"+
		"\u067f\u0682\u068d\u06a7\u06bb\u06c3\u06c6\u06dd\u06e9\u06f0\u06f4\u06fa"+
		"\u06fc\u0703";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}