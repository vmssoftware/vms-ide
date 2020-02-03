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
		RULE_attributeVar = 7, RULE_attributeConst = 8, RULE_attributeDef = 9, 
		RULE_preReservedWords = 10, RULE_attribute = 11, RULE_directives = 12, 
		RULE_blockDeclarations = 13, RULE_block = 14, RULE_blockIn = 15, RULE_labelDeclarationPart = 16, 
		RULE_label = 17, RULE_constantDefinitionPart = 18, RULE_constantDefinition = 19, 
		RULE_constantName = 20, RULE_constantChr = 21, RULE_constant = 22, RULE_unsignedNumber = 23, 
		RULE_unsignedInteger = 24, RULE_unsignedReal = 25, RULE_sign = 26, RULE_bool = 27, 
		RULE_string = 28, RULE_valueDefinitionPart = 29, RULE_variableName = 30, 
		RULE_typeDefinitionPart = 31, RULE_typeDefinition = 32, RULE_functionType = 33, 
		RULE_procedureType = 34, RULE_type = 35, RULE_simpleType = 36, RULE_enumType = 37, 
		RULE_subrangeType = 38, RULE_typeIdentifier = 39, RULE_variableDescription = 40, 
		RULE_structuredType = 41, RULE_unpackedStructuredType = 42, RULE_stringtype = 43, 
		RULE_varyingType = 44, RULE_arrayType = 45, RULE_typeList = 46, RULE_indexType = 47, 
		RULE_componentType = 48, RULE_recordType = 49, RULE_fieldList = 50, RULE_fixedPart = 51, 
		RULE_recordSection = 52, RULE_variantPart = 53, RULE_tag = 54, RULE_variant = 55, 
		RULE_setType = 56, RULE_baseType = 57, RULE_fileType = 58, RULE_textType = 59, 
		RULE_pointerType = 60, RULE_schemaType = 61, RULE_schemaList = 62, RULE_schemaName = 63, 
		RULE_prototypeType = 64, RULE_prototypeList = 65, RULE_constructorValue = 66, 
		RULE_constructorArray = 67, RULE_typeName = 68, RULE_componentValue = 69, 
		RULE_constructorRecord = 70, RULE_initializerList = 71, RULE_initializerItem = 72, 
		RULE_tagValue = 73, RULE_constructorSet = 74, RULE_constructorNonStdArray = 75, 
		RULE_componentValueN = 76, RULE_constructorNonStdRecord = 77, RULE_variableDeclarationPart = 78, 
		RULE_variableDeclaration = 79, RULE_variablePreDeclaration = 80, RULE_variablePreDeclarationValue = 81, 
		RULE_variablePreDeclarationAssign = 82, RULE_toBeginEndDoDeclarationPart = 83, 
		RULE_procedureAndFunctionDeclarationPart = 84, RULE_procedureOrFunctionDeclaration = 85, 
		RULE_procedureDeclaration = 86, RULE_formalParameterList = 87, RULE_formalParameterSection = 88, 
		RULE_parameterGroup = 89, RULE_assignExpression = 90, RULE_identifierList = 91, 
		RULE_constList = 92, RULE_functionDeclaration = 93, RULE_resultType = 94, 
		RULE_statement = 95, RULE_unlabelledStatement = 96, RULE_simpleStatement = 97, 
		RULE_assignmentStatement = 98, RULE_variable = 99, RULE_expression = 100, 
		RULE_relationaloperator = 101, RULE_simpleExpression = 102, RULE_additiveoperator = 103, 
		RULE_term = 104, RULE_multiplicativeoperator = 105, RULE_signedFactor = 106, 
		RULE_factor = 107, RULE_unsignedConstant = 108, RULE_functionDesignator = 109, 
		RULE_parameterList = 110, RULE_attibuteFuncParam = 111, RULE_set = 112, 
		RULE_elementList = 113, RULE_element = 114, RULE_procedureStatement = 115, 
		RULE_actualParameter = 116, RULE_parameterwidth = 117, RULE_gotoStatement = 118, 
		RULE_breakStatement = 119, RULE_continueStatement = 120, RULE_returnStatement = 121, 
		RULE_stringExpression = 122, RULE_emptyStatement = 123, RULE_structuredStatement = 124, 
		RULE_compoundStatement = 125, RULE_openCompoundStatement = 126, RULE_statements = 127, 
		RULE_conditionalStatement = 128, RULE_ifStatement = 129, RULE_caseStatement = 130, 
		RULE_caseListElement = 131, RULE_repetetiveStatement = 132, RULE_whileStatement = 133, 
		RULE_repeatStatement = 134, RULE_forStatement = 135, RULE_forList = 136, 
		RULE_initialValue = 137, RULE_finalValue = 138, RULE_withStatement = 139, 
		RULE_recordVariableList = 140, RULE_includeDirective = 141, RULE_dictionaryDirective = 142, 
		RULE_titleDirective = 143, RULE_pDefinedDirective = 144, RULE_messageDirective = 145, 
		RULE_infoFuncDirective = 146, RULE_pIfDirective = 147, RULE_pIfToken = 148;
	public static final String[] ruleNames = {
		"program", "programHeading", "identifier", "attributePart", "attributeProgram", 
		"attributeModule", "attributeType", "attributeVar", "attributeConst", 
		"attributeDef", "preReservedWords", "attribute", "directives", "blockDeclarations", 
		"block", "blockIn", "labelDeclarationPart", "label", "constantDefinitionPart", 
		"constantDefinition", "constantName", "constantChr", "constant", "unsignedNumber", 
		"unsignedInteger", "unsignedReal", "sign", "bool", "string", "valueDefinitionPart", 
		"variableName", "typeDefinitionPart", "typeDefinition", "functionType", 
		"procedureType", "type", "simpleType", "enumType", "subrangeType", "typeIdentifier", 
		"variableDescription", "structuredType", "unpackedStructuredType", "stringtype", 
		"varyingType", "arrayType", "typeList", "indexType", "componentType", 
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
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT))) != 0)) {
				{
				{
				setState(298);
				directives();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			programHeading();
			setState(305);
			block();
			setState(306);
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
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				attributeProgram();
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
				setState(319);
				attributeModule();
				setState(320);
				match(MODULE);
				setState(321);
				identifier();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(322);
					match(LPAREN);
					setState(323);
					identifierList();
					setState(324);
					match(RPAREN);
					}
				}

				setState(328);
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
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				attribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
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
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(337);
				match(LBRACK);
				setState(338);
				attributeDef();
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(339);
					match(COMMA);
					setState(340);
					attributeDef();
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(346);
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
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(350);
				match(LBRACK);
				setState(351);
				attributeDef();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(352);
					match(COMMA);
					setState(353);
					attributeDef();
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(359);
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
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(363);
				match(LBRACK);
				setState(364);
				attributeDef();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(365);
					match(COMMA);
					setState(366);
					attributeDef();
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
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
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(376);
				match(LBRACK);
				setState(377);
				attributeDef();
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(378);
					match(COMMA);
					setState(379);
					attributeDef();
					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(385);
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
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(389);
				match(LBRACK);
				setState(390);
				attributeDef();
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(391);
					match(COMMA);
					setState(392);
					attributeDef();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398);
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

	public static class AttributeConstContext extends ParserRuleContext {
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
		public AttributeConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeConst; }
	}

	public final AttributeConstContext attributeConst() throws RecognitionException {
		AttributeConstContext _localctx = new AttributeConstContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attributeConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(402);
				match(LBRACK);
				setState(403);
				attributeDef();
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(404);
					match(COMMA);
					setState(405);
					attributeDef();
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(411);
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
			setState(415);
			attribute();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(416);
				match(LPAREN);
				setState(419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(417);
					constant();
					}
					break;
				case 2:
					{
					setState(418);
					identifier();
					}
					break;
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(421);
					match(COMMA);
					setState(424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(422);
						constant();
						}
						break;
					case 2:
						{
						setState(423);
						identifier();
						}
						break;
					}
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(431);
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
		enterRule(_localctx, 20, RULE_preReservedWords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
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
		enterRule(_localctx, 22, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
		enterRule(_localctx, 24, RULE_directives);
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_INCLUDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				includeDirective();
				}
				break;
			case P_DICTIONARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				dictionaryDirective();
				}
				break;
			case P_TITLE:
			case P_SUBTITLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				titleDirective();
				}
				break;
			case P_DEFINED:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				pDefinedDirective();
				}
				break;
			case P_ERROR:
			case P_WARN:
			case P_INFO:
			case P_MESSAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
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
				setState(444);
				infoFuncDirective();
				}
				break;
			case P_IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(445);
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
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (CONST - 108)) | (1L << (FUNCTION - 108)) | (1L << (LABEL - 108)) | (1L << (PROCEDURE - 108)) | (1L << (TYPE - 108)) | (1L << (VAR - 108)) | (1L << (VALUE - 108)))) != 0)) {
				{
				setState(455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(448);
					directives();
					}
					break;
				case 2:
					{
					setState(449);
					labelDeclarationPart();
					}
					break;
				case 3:
					{
					setState(450);
					constantDefinitionPart();
					}
					break;
				case 4:
					{
					setState(451);
					typeDefinitionPart();
					}
					break;
				case 5:
					{
					setState(452);
					valueDefinitionPart();
					}
					break;
				case 6:
					{
					setState(453);
					variableDeclarationPart();
					}
					break;
				case 7:
					{
					setState(454);
					procedureAndFunctionDeclarationPart();
					}
					break;
				}
				}
				setState(459);
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
			setState(460);
			blockDeclarations();
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(461);
				compoundStatement();
				}
				break;
			case END:
			case TO:
				{
				{
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(462);
					toBeginEndDoDeclarationPart();
					}
				}

				setState(465);
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
			setState(468);
			blockDeclarations();
			setState(469);
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
			setState(471);
			match(LABEL);
			setState(472);
			label();
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(473);
				match(COMMA);
				setState(474);
				label();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
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
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
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
				setState(483);
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
		public AttributeConstContext attributeConst() {
			return getRuleContext(AttributeConstContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_constantDefinitionPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			attributeConst();
			setState(487);
			match(CONST);
			setState(492); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(492);
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
						setState(488);
						constantDefinition();
						setState(489);
						match(SEMI);
						}
						}
						break;
					case P_INCLUDE:
						{
						setState(491);
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
				setState(494); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(496);
			constantName();
			setState(497);
			match(EQUAL);
			setState(498);
			attributePart();
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(499);
				constant();
				}
				break;
			case 2:
				{
				setState(500);
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
			setState(503);
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
			setState(505);
			match(CHR);
			setState(506);
			match(LPAREN);
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				{
				setState(507);
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
				setState(508);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(511);
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
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				sign();
				setState(515);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(517);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				sign();
				setState(519);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(521);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(522);
				constantChr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(523);
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
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
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
			setState(530);
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
			setState(532);
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
			setState(534);
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
			setState(536);
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
			setState(538);
			match(STRING_LITERAL);
			setState(550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(539);
					match(LPAREN);
					setState(542);
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
						setState(540);
						identifier();
						}
						break;
					case NUM_INT:
						{
						setState(541);
						match(NUM_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(544);
					match(RPAREN);
					setState(546);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(545);
						string();
						}
						break;
					}
					}
					} 
				}
				setState(552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
			setState(553);
			match(VALUE);
			setState(554);
			variableName();
			setState(555);
			match(ASSIGN);
			setState(556);
			expression();
			setState(564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(557);
					match(SEMI);
					setState(558);
					variableName();
					setState(559);
					match(ASSIGN);
					setState(560);
					expression();
					}
					} 
				}
				setState(566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(567);
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
			setState(569);
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
		enterRule(_localctx, 62, RULE_typeDefinitionPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			attributeType();
			setState(572);
			match(TYPE);
			setState(577); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(577);
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
						setState(573);
						typeDefinition();
						setState(574);
						match(SEMI);
						}
						}
						break;
					case P_INCLUDE:
						{
						setState(576);
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
				setState(579); 
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
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				typeName();
				setState(582);
				match(EQUAL);
				setState(583);
				attributePart();
				setState(587);
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
					setState(584);
					type();
					}
					break;
				case FUNCTION:
					{
					setState(585);
					functionType();
					}
					break;
				case PROCEDURE:
					{
					setState(586);
					procedureType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE) {
					{
					setState(589);
					variablePreDeclarationValue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				schemaType();
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE) {
					{
					setState(593);
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
			setState(598);
			match(FUNCTION);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(599);
				formalParameterList();
				}
			}

			setState(602);
			match(COLON);
			setState(603);
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
			setState(605);
			match(PROCEDURE);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(606);
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
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				structuredType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(611);
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
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				enumType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(617);
				stringtype();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(618);
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
			setState(621);
			match(LPAREN);
			setState(622);
			identifierList();
			setState(623);
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
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				constant();
				setState(626);
				match(DOTDOT);
				setState(627);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				expression();
				setState(630);
				match(DOTDOT);
				setState(631);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(633);
				expression();
				setState(634);
				match(DOTDOT);
				setState(635);
				expression();
				setState(636);
				match(COLON);
				setState(637);
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
			setState(641);
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

	public static class VariableDescriptionContext extends ParserRuleContext {
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
		public VariableDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDescription; }
	}

	public final VariableDescriptionContext variableDescription() throws RecognitionException {
		VariableDescriptionContext _localctx = new VariableDescriptionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			identifierList();
			setState(644);
			match(COLON);
			setState(645);
			attributePart();
			setState(646);
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
		enterRule(_localctx, 82, RULE_structuredType);
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
		enterRule(_localctx, 84, RULE_unpackedStructuredType);
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
		enterRule(_localctx, 86, RULE_stringtype);
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
		enterRule(_localctx, 88, RULE_varyingType);
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
		enterRule(_localctx, 90, RULE_arrayType);
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
		enterRule(_localctx, 92, RULE_typeList);
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
		enterRule(_localctx, 94, RULE_indexType);
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
		enterRule(_localctx, 96, RULE_componentType);
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
		enterRule(_localctx, 98, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(RECORD);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)) | (1L << (CASE - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
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
		enterRule(_localctx, 100, RULE_fieldList);
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
		enterRule(_localctx, 102, RULE_fixedPart);
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
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
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
		enterRule(_localctx, 104, RULE_recordSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			variableDescription();
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==VALUE) {
				{
				setState(740);
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
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public VariantPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantPart; }
	}

	public final VariantPartContext variantPart() throws RecognitionException {
		VariantPartContext _localctx = new VariantPartContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_variantPart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(CASE);
			setState(744);
			tag();
			setState(745);
			match(OF);
			setState(746);
			variant();
			setState(751);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(747);
					match(SEMI);
					setState(748);
					variant();
					}
					} 
				}
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(754);
					match(SEMI);
					}
				}

				setState(757);
				match(OTHERWISE);
				setState(758);
				match(LPAREN);
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)) | (1L << (CASE - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(759);
					fieldList();
					}
				}

				setState(762);
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
		enterRule(_localctx, 108, RULE_tag);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
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
		enterRule(_localctx, 110, RULE_variant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			constList();
			setState(777);
			match(COLON);
			setState(778);
			match(LPAREN);
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)) | (1L << (CASE - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
				{
				setState(779);
				fieldList();
				}
			}

			setState(782);
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
		enterRule(_localctx, 112, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(SET);
			setState(785);
			match(OF);
			setState(786);
			attributePart();
			setState(787);
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
		enterRule(_localctx, 114, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
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
		enterRule(_localctx, 116, RULE_fileType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(FILE);
			setState(792);
			match(OF);
			setState(793);
			attributePart();
			setState(794);
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
		enterRule(_localctx, 118, RULE_textType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			attributePart();
			setState(797);
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
		enterRule(_localctx, 120, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			attributePart();
			setState(800);
			match(POINTER_);
			setState(801);
			attributePart();
			setState(802);
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
		enterRule(_localctx, 122, RULE_schemaType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			schemaName();
			setState(805);
			match(LPAREN);
			setState(806);
			schemaList();
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(807);
				match(SEMI);
				setState(808);
				schemaList();
				}
				}
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(814);
			match(RPAREN);
			setState(815);
			match(EQUAL);
			setState(816);
			attributePart();
			setState(817);
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
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
		}
		public SchemaListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaList; }
	}

	public final SchemaListContext schemaList() throws RecognitionException {
		SchemaListContext _localctx = new SchemaListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_schemaList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			variableDescription();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_schemaName);
		try {
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
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
		enterRule(_localctx, 128, RULE_prototypeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			schemaName();
			setState(826);
			match(LPAREN);
			setState(827);
			prototypeList();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(828);
				match(SEMI);
				setState(829);
				prototypeList();
				}
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(835);
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
		enterRule(_localctx, 130, RULE_prototypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			expression();
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(838);
				match(COMMA);
				setState(839);
				expression();
				}
				}
				setState(844);
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
		enterRule(_localctx, 132, RULE_constructorValue);
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(845);
				constructorArray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				constructorRecord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(847);
				constructorSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(848);
				constructorNonStdArray();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(849);
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
		enterRule(_localctx, 134, RULE_constructorArray);
		int _la;
		try {
			int _alt;
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(852);
					typeName();
					}
				}

				setState(855);
				match(LBRACK);
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(856);
					initializerList();
					setState(857);
					match(COLON);
					setState(858);
					componentValue();
					setState(866);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(859);
							match(SEMI);
							setState(860);
							initializerList();
							setState(861);
							match(COLON);
							setState(862);
							componentValue();
							}
							} 
						}
						setState(868);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
					}
					}
					break;
				}
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(872);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(871);
						match(SEMI);
						}
					}

					setState(874);
					match(OTHERWISE);
					setState(875);
					componentValue();
					setState(877);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(876);
						match(SEMI);
						}
					}

					}
				}

				setState(881);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(882);
					typeName();
					}
				}

				setState(885);
				match(LBRACK);
				setState(899);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(886);
					initializerList();
					setState(887);
					match(COLON);
					setState(888);
					constructorArray();
					setState(896);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(889);
							match(SEMI);
							setState(890);
							initializerList();
							setState(891);
							match(COLON);
							setState(892);
							constructorArray();
							}
							} 
						}
						setState(898);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					}
					}
					break;
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(902);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(901);
						match(SEMI);
						}
					}

					setState(904);
					match(OTHERWISE);
					setState(905);
					constructorArray();
					setState(907);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(906);
						match(SEMI);
						}
					}

					}
				}

				setState(911);
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
		enterRule(_localctx, 136, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
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
		enterRule(_localctx, 138, RULE_componentValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
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
		enterRule(_localctx, 140, RULE_constructorRecord);
		int _la;
		try {
			int _alt;
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(918);
					typeName();
					}
				}

				setState(921);
				match(LBRACK);
				setState(935);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(922);
					initializerList();
					setState(923);
					match(COLON);
					setState(924);
					componentValue();
					setState(932);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(925);
							match(SEMI);
							setState(926);
							initializerList();
							setState(927);
							match(COLON);
							setState(928);
							componentValue();
							}
							} 
						}
						setState(934);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
					}
					}
					break;
				}
				setState(964);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(937);
						match(SEMI);
						}
					}

					setState(940);
					match(CASE);
					setState(944);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						setState(941);
						identifier();
						setState(942);
						match(COLON);
						}
						break;
					}
					setState(946);
					tagValue();
					setState(947);
					match(OF);
					setState(948);
					match(LBRACK);
					{
					setState(949);
					initializerList();
					setState(950);
					match(COLON);
					setState(951);
					componentValue();
					setState(959);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(952);
						match(SEMI);
						setState(953);
						initializerList();
						setState(954);
						match(COLON);
						setState(955);
						componentValue();
						}
						}
						setState(961);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(962);
					match(RBRACK);
					}
					break;
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(966);
						match(SEMI);
						}
					}

					setState(969);
					match(OTHERWISE);
					setState(970);
					match(ZERO);
					setState(972);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(971);
						match(SEMI);
						}
					}

					}
				}

				setState(976);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(977);
					typeName();
					}
				}

				setState(980);
				match(LBRACK);
				setState(994);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(981);
					initializerList();
					setState(982);
					match(COLON);
					setState(983);
					constructorRecord();
					setState(991);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(984);
							match(SEMI);
							setState(985);
							initializerList();
							setState(986);
							match(COLON);
							setState(987);
							constructorRecord();
							}
							} 
						}
						setState(993);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
					}
					}
					break;
				}
				setState(1023);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(996);
						match(SEMI);
						}
					}

					setState(999);
					match(CASE);
					setState(1003);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						setState(1000);
						identifier();
						setState(1001);
						match(COLON);
						}
						break;
					}
					setState(1005);
					tagValue();
					setState(1006);
					match(OF);
					setState(1007);
					match(LBRACK);
					{
					setState(1008);
					initializerList();
					setState(1009);
					match(COLON);
					setState(1010);
					constructorRecord();
					setState(1018);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1011);
						match(SEMI);
						setState(1012);
						initializerList();
						setState(1013);
						match(COLON);
						setState(1014);
						constructorRecord();
						}
						}
						setState(1020);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(1021);
					match(RBRACK);
					}
					break;
				}
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(1026);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1025);
						match(SEMI);
						}
					}

					setState(1028);
					match(OTHERWISE);
					setState(1029);
					match(ZERO);
					setState(1031);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1030);
						match(SEMI);
						}
					}

					}
				}

				setState(1035);
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
		enterRule(_localctx, 142, RULE_initializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			initializerItem();
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1039);
				match(COMMA);
				setState(1040);
				initializerItem();
				}
				}
				setState(1045);
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
		enterRule(_localctx, 144, RULE_initializerItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(1046);
				identifier();
				}
				break;
			case 2:
				{
				setState(1047);
				match(NUM_INT);
				}
				break;
			case 3:
				{
				setState(1048);
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
		enterRule(_localctx, 146, RULE_tagValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
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
		enterRule(_localctx, 148, RULE_constructorSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
				{
				setState(1053);
				typeName();
				}
			}

			setState(1056);
			match(LBRACK);
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
				{
				setState(1057);
				componentValue();
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1058);
					match(SEMI);
					setState(1059);
					componentValue();
					}
					}
					setState(1064);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1067);
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
		enterRule(_localctx, 150, RULE_constructorNonStdArray);
		int _la;
		try {
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1069);
					typeName();
					}
				}

				setState(1072);
				match(LPAREN);
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
					{
					setState(1073);
					componentValueN();
					setState(1078);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1074);
						match(COMMA);
						setState(1075);
						componentValueN();
						}
						}
						setState(1080);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==REPEAT) {
					{
					setState(1084);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1083);
						match(SEMI);
						}
					}

					setState(1086);
					match(REPEAT);
					setState(1087);
					componentValueN();
					}
				}

				setState(1090);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1091);
					typeName();
					}
				}

				setState(1094);
				match(LPAREN);
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1095);
					constructorNonStdArray();
					setState(1100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1096);
						match(COMMA);
						setState(1097);
						constructorNonStdArray();
						}
						}
						setState(1102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==REPEAT) {
					{
					setState(1106);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1105);
						match(SEMI);
						}
					}

					setState(1108);
					match(REPEAT);
					setState(1109);
					constructorNonStdArray();
					}
				}

				setState(1112);
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
		enterRule(_localctx, 152, RULE_componentValueN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1115);
				match(NUM_INT);
				setState(1116);
				match(OF);
				}
				break;
			}
			setState(1119);
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
		enterRule(_localctx, 154, RULE_constructorNonStdRecord);
		int _la;
		try {
			setState(1181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1121);
					typeName();
					}
				}

				setState(1124);
				match(LPAREN);
				setState(1133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1125);
					componentValueN();
					setState(1130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1126);
						match(COMMA);
						setState(1127);
						componentValueN();
						}
						}
						setState(1132);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << SEMI) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
					{
					setState(1136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1135);
						match(SEMI);
						}
					}

					setState(1138);
					tagValue();
					setState(1139);
					match(COMMA);
					setState(1140);
					componentValueN();
					setState(1145);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1141);
						match(SEMI);
						setState(1142);
						componentValueN();
						}
						}
						setState(1147);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1150);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1151);
					typeName();
					}
				}

				setState(1154);
				match(LPAREN);
				setState(1163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1155);
					constructorNonStdRecord();
					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1156);
						match(COMMA);
						setState(1157);
						constructorNonStdRecord();
						}
						}
						setState(1162);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << SEMI) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
					{
					setState(1166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1165);
						match(SEMI);
						}
					}

					setState(1168);
					tagValue();
					setState(1169);
					match(COMMA);
					setState(1170);
					constructorNonStdRecord();
					setState(1175);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1171);
						match(SEMI);
						setState(1172);
						constructorNonStdRecord();
						}
						}
						setState(1177);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1180);
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
		enterRule(_localctx, 156, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			attributeVar();
			setState(1184);
			match(VAR);
			setState(1189); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1189);
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
						setState(1185);
						variableDeclaration();
						setState(1186);
						match(SEMI);
						}
						}
						break;
					case P_INCLUDE:
						{
						setState(1188);
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
				setState(1191); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
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
		enterRule(_localctx, 158, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			variableDescription();
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==VALUE) {
				{
				setState(1194);
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
		enterRule(_localctx, 160, RULE_variablePreDeclaration);
		try {
			setState(1199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1197);
				variablePreDeclarationValue();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1198);
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
		enterRule(_localctx, 162, RULE_variablePreDeclarationValue);
		try {
			setState(1211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1201);
				match(VALUE);
				setState(1202);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1203);
				match(VALUE);
				setState(1204);
				signedFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1205);
				match(VALUE);
				setState(1206);
				match(ZERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1207);
				match(VALUE);
				setState(1208);
				constructorValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1209);
				match(VALUE);
				setState(1210);
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
		enterRule(_localctx, 164, RULE_variablePreDeclarationAssign);
		try {
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				match(ASSIGN);
				setState(1214);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1215);
				match(ASSIGN);
				setState(1216);
				signedFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1217);
				match(ASSIGN);
				setState(1218);
				match(ZERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1219);
				match(ASSIGN);
				setState(1220);
				constructorValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1221);
				match(ASSIGN);
				setState(1222);
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
		enterRule(_localctx, 166, RULE_toBeginEndDoDeclarationPart);
		try {
			setState(1260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				match(TO);
				setState(1226);
				match(BEGIN);
				setState(1227);
				match(DO);
				setState(1230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
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
				setState(1233);
				match(TO);
				setState(1234);
				match(END);
				setState(1235);
				match(DO);
				setState(1238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1236);
					compoundStatement();
					}
					break;
				case 2:
					{
					setState(1237);
					statement();
					}
					break;
				}
				setState(1240);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1242);
				match(TO);
				setState(1243);
				match(BEGIN);
				setState(1244);
				match(DO);
				setState(1247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1251);
				match(TO);
				setState(1252);
				match(END);
				setState(1253);
				match(DO);
				setState(1256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
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
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 168, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			attributePart();
			setState(1263);
			procedureOrFunctionDeclaration();
			setState(1269);
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
				setState(1264);
				blockIn();
				}
				break;
			case EXTERN:
				{
				setState(1265);
				match(EXTERN);
				}
				break;
			case EXTERNAL:
				{
				setState(1266);
				match(EXTERNAL);
				}
				break;
			case FORTRAN:
				{
				setState(1267);
				match(FORTRAN);
				}
				break;
			case FORWARD:
				{
				setState(1268);
				match(FORWARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1271);
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
		enterRule(_localctx, 170, RULE_procedureOrFunctionDeclaration);
		try {
			setState(1275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1273);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1274);
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
		enterRule(_localctx, 172, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			match(PROCEDURE);
			setState(1278);
			identifier();
			setState(1280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1279);
				formalParameterList();
				}
			}

			setState(1282);
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
		enterRule(_localctx, 174, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			match(LPAREN);
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
				{
				setState(1285);
				attibuteFuncParam();
				}
			}

			setState(1288);
			formalParameterSection();
			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1289);
				match(SEMI);
				setState(1291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1290);
					attibuteFuncParam();
					}
				}

				setState(1293);
				formalParameterSection();
				}
				}
				setState(1298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1299);
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
		enterRule(_localctx, 176, RULE_formalParameterSection);
		int _la;
		try {
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1301);
				parameterGroup();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302);
				match(VAR);
				setState(1303);
				parameterGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1304);
				attributePart();
				setState(1305);
				match(FUNCTION);
				setState(1306);
				identifier();
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1307);
					formalParameterList();
					}
				}

				setState(1310);
				match(COLON);
				setState(1311);
				attributePart();
				setState(1312);
				resultType();
				setState(1313);
				assignExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1315);
				attributePart();
				setState(1316);
				match(PROCEDURE);
				setState(1317);
				identifier();
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1318);
					formalParameterList();
					}
				}

				setState(1321);
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
		public VariableDescriptionContext variableDescription() {
			return getRuleContext(VariableDescriptionContext.class,0);
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
		enterRule(_localctx, 178, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			variableDescription();
			setState(1326);
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
		enterRule(_localctx, 180, RULE_assignExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1328);
				match(ASSIGN);
				setState(1330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1329);
					attibuteFuncParam();
					}
				}

				setState(1332);
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
		enterRule(_localctx, 182, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			identifier();
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1336);
				match(COMMA);
				setState(1337);
				identifier();
				}
				}
				setState(1342);
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
		enterRule(_localctx, 184, RULE_constList);
		int _la;
		try {
			setState(1359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1343);
				constant();
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==DOTDOT) {
					{
					{
					setState(1344);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==DOTDOT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1345);
					constant();
					}
					}
					setState(1350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1351);
				functionDesignator();
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || _la==DOTDOT) {
					{
					{
					setState(1352);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==DOTDOT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1353);
					functionDesignator();
					}
					}
					setState(1358);
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
		enterRule(_localctx, 186, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			match(FUNCTION);
			setState(1362);
			identifier();
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1363);
				formalParameterList();
				}
			}

			setState(1366);
			match(COLON);
			setState(1367);
			attributePart();
			setState(1368);
			resultType();
			setState(1369);
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
		enterRule(_localctx, 188, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
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
		enterRule(_localctx, 190, RULE_statement);
		try {
			setState(1378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				label();
				setState(1374);
				match(COLON);
				setState(1375);
				unlabelledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
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
		enterRule(_localctx, 192, RULE_unlabelledStatement);
		try {
			setState(1382);
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
				setState(1380);
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
				setState(1381);
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
		enterRule(_localctx, 194, RULE_simpleStatement);
		try {
			setState(1392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1384);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1385);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1386);
				gotoStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1387);
				breakStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1388);
				continueStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1389);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1390);
				directives();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1391);
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
		enterRule(_localctx, 196, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1394);
			variable();
			setState(1395);
			match(ASSIGN);
			setState(1396);
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
		enterRule(_localctx, 198, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATP:
				{
				setState(1398);
				match(ATP);
				setState(1399);
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
				setState(1400);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1428);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRACK:
						{
						setState(1403);
						match(LBRACK);
						setState(1404);
						expression();
						setState(1409);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1405);
							match(COMMA);
							setState(1406);
							expression();
							}
							}
							setState(1411);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1412);
						match(RBRACK);
						}
						break;
					case LBRACK2:
						{
						setState(1414);
						match(LBRACK2);
						setState(1415);
						expression();
						setState(1420);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1416);
							match(COMMA);
							setState(1417);
							expression();
							}
							}
							setState(1422);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1423);
						match(RBRACK2);
						}
						break;
					case DOT:
						{
						setState(1425);
						match(DOT);
						setState(1426);
						identifier();
						}
						break;
					case POINTER_:
						{
						setState(1427);
						match(POINTER_);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			setState(1444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1433);
				match(COLON);
				setState(1434);
				match(COLON);
				setState(1435);
				identifier();
				setState(1441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINTER_ || _la==DOT) {
					{
					setState(1439);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(1436);
						match(DOT);
						setState(1437);
						identifier();
						}
						break;
					case POINTER_:
						{
						setState(1438);
						match(POINTER_);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1443);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(pascalParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(pascalParser.DOT, i);
		}
		public List<TerminalNode> POINTER_() { return getTokens(pascalParser.POINTER_); }
		public TerminalNode POINTER_(int i) {
			return getToken(pascalParser.POINTER_, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
			simpleExpression();
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1447);
				relationaloperator();
				setState(1448);
				expression();
				}
				break;
			}
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1452);
				match(COLON);
				setState(1453);
				match(COLON);
				setState(1454);
				identifier();
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINTER_ || _la==DOT) {
					{
					setState(1458);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(1455);
						match(DOT);
						setState(1456);
						identifier();
						}
						break;
					case POINTER_:
						{
						setState(1457);
						match(POINTER_);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1462);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		enterRule(_localctx, 202, RULE_relationaloperator);
		try {
			setState(1474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				match(EQUAL);
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466);
				match(NOT_EQUAL);
				}
				break;
			case LT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1467);
				match(LT_);
				}
				break;
			case LE_:
				enterOuterAlt(_localctx, 4);
				{
				setState(1468);
				match(LE_);
				}
				break;
			case GE_:
				enterOuterAlt(_localctx, 5);
				{
				setState(1469);
				match(GE_);
				}
				break;
			case GT_:
				enterOuterAlt(_localctx, 6);
				{
				setState(1470);
				match(GT_);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(1471);
				match(IN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1472);
				match(NOT);
				setState(1473);
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
		enterRule(_localctx, 204, RULE_simpleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			term();
			setState(1480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1477);
				additiveoperator();
				setState(1478);
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
		enterRule(_localctx, 206, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1482);
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
		enterRule(_localctx, 208, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			signedFactor();
			setState(1488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1485);
				multiplicativeoperator();
				setState(1486);
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
		enterRule(_localctx, 210, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
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
		enterRule(_localctx, 212, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1492);
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

			setState(1495);
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
		enterRule(_localctx, 214, RULE_factor);
		try {
			setState(1512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1497);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
				match(LPAREN);
				setState(1499);
				expression();
				setState(1500);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1502);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1503);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1504);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1505);
				identifier();
				setState(1506);
				set();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1508);
				match(NOT);
				setState(1509);
				factor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1510);
				bool();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1511);
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
		enterRule(_localctx, 216, RULE_unsignedConstant);
		try {
			setState(1519);
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
				setState(1514);
				unsignedNumber();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1515);
				constantChr();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1516);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1517);
				match(NIL);
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 5);
				{
				setState(1518);
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
		enterRule(_localctx, 218, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			identifier();
			setState(1522);
			match(LPAREN);
			setState(1523);
			parameterList();
			setState(1524);
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
		enterRule(_localctx, 220, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
				{
				setState(1526);
				attibuteFuncParam();
				}
			}

			setState(1530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
				{
				setState(1529);
				actualParameter();
				}
			}

			setState(1541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1532);
				match(COMMA);
				setState(1534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1533);
					attibuteFuncParam();
					}
				}

				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
					{
					setState(1536);
					actualParameter();
					}
				}

				}
				}
				setState(1543);
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
		enterRule(_localctx, 222, RULE_attibuteFuncParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
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
		enterRule(_localctx, 224, RULE_set);
		try {
			setState(1555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1546);
				match(LBRACK);
				setState(1547);
				elementList();
				setState(1548);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1550);
				match(LBRACK2);
				setState(1551);
				elementList();
				setState(1552);
				match(RBRACK2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1554);
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
		enterRule(_localctx, 226, RULE_elementList);
		int _la;
		try {
			setState(1566);
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
				setState(1557);
				element();
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1558);
					match(COMMA);
					setState(1559);
					element();
					}
					}
					setState(1564);
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
		enterRule(_localctx, 228, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1568);
			expression();
			setState(1571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(1569);
				match(DOTDOT);
				setState(1570);
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
		enterRule(_localctx, 230, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			identifier();
			setState(1578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1574);
				match(LPAREN);
				setState(1575);
				parameterList();
				setState(1576);
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
		enterRule(_localctx, 232, RULE_actualParameter);
		int _la;
		try {
			setState(1603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1580);
				expression();
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(1581);
					parameterwidth();
					}
					}
					setState(1586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1587);
				identifier();
				setState(1588);
				match(ASSIGN);
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1589);
					attibuteFuncParam();
					}
				}

				setState(1594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1592);
					identifier();
					}
					break;
				case 2:
					{
					setState(1593);
					expression();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1596);
				identifier();
				setState(1597);
				match(ASSIGN);
				{
				setState(1598);
				attibuteFuncParam();
				setState(1599);
				match(LPAREN);
				setState(1600);
				expression();
				setState(1601);
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
		enterRule(_localctx, 234, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			match(COLON);
			setState(1606);
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
		enterRule(_localctx, 236, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			match(GOTO);
			setState(1609);
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
		enterRule(_localctx, 238, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
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
		enterRule(_localctx, 240, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
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
		enterRule(_localctx, 242, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
			match(RETURN);
			setState(1616);
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
		enterRule(_localctx, 244, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
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
		enterRule(_localctx, 246, RULE_emptyStatement);
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
		enterRule(_localctx, 248, RULE_structuredStatement);
		try {
			setState(1626);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1622);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1623);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1624);
				repetetiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1625);
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
		enterRule(_localctx, 250, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			match(BEGIN);
			setState(1629);
			statements();
			setState(1630);
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
		enterRule(_localctx, 252, RULE_openCompoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			statements();
			setState(1633);
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
		enterRule(_localctx, 254, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			statement();
			setState(1640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1636);
					match(SEMI);
					setState(1637);
					statement();
					}
					} 
				}
				setState(1642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			setState(1644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1643);
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
		enterRule(_localctx, 256, RULE_conditionalStatement);
		try {
			setState(1648);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1646);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1647);
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
		enterRule(_localctx, 258, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			match(IF);
			setState(1651);
			expression();
			setState(1652);
			match(THEN);
			setState(1653);
			statement();
			setState(1655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1654);
				match(SEMI);
				}
				break;
			}
			setState(1662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1657);
				match(ELSE);
				setState(1658);
				statement();
				setState(1660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1659);
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
		enterRule(_localctx, 260, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			match(CASE);
			setState(1665);
			expression();
			setState(1666);
			match(OF);
			setState(1675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1667);
				caseListElement();
				setState(1672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1668);
						match(SEMI);
						setState(1669);
						caseListElement();
						}
						} 
					}
					setState(1674);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				}
				break;
			}
			setState(1682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1677);
					match(SEMI);
					}
				}

				setState(1680);
				match(OTHERWISE);
				setState(1681);
				statements();
				}
				break;
			}
			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1684);
				match(SEMI);
				}
			}

			setState(1687);
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
		enterRule(_localctx, 262, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			constList();
			setState(1690);
			match(COLON);
			setState(1691);
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
		enterRule(_localctx, 264, RULE_repetetiveStatement);
		try {
			setState(1696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1693);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1694);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1695);
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
		enterRule(_localctx, 266, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			match(WHILE);
			setState(1699);
			expression();
			setState(1700);
			match(DO);
			setState(1701);
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
		enterRule(_localctx, 268, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			match(REPEAT);
			setState(1704);
			statements();
			setState(1705);
			match(UNTIL);
			setState(1706);
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
		enterRule(_localctx, 270, RULE_forStatement);
		try {
			setState(1722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1708);
				match(FOR);
				setState(1709);
				identifier();
				setState(1710);
				match(ASSIGN);
				setState(1711);
				forList();
				setState(1712);
				match(DO);
				setState(1713);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1715);
				match(FOR);
				setState(1716);
				identifier();
				setState(1717);
				match(IN);
				setState(1718);
				expression();
				setState(1719);
				match(DO);
				setState(1720);
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
		enterRule(_localctx, 272, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			initialValue();
			setState(1725);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1726);
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
		enterRule(_localctx, 274, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
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
		enterRule(_localctx, 276, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
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
		enterRule(_localctx, 278, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			match(WITH);
			setState(1733);
			recordVariableList();
			setState(1734);
			match(DO);
			setState(1735);
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
		enterRule(_localctx, 280, RULE_recordVariableList);
		int _la;
		try {
			setState(1753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1737);
				variable();
				setState(1742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1738);
					match(COMMA);
					setState(1739);
					variable();
					}
					}
					setState(1744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1745);
				prototypeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1746);
					match(COMMA);
					setState(1747);
					prototypeType();
					}
					}
					setState(1752);
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
		enterRule(_localctx, 282, RULE_includeDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			match(P_INCLUDE);
			setState(1756);
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
		enterRule(_localctx, 284, RULE_dictionaryDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			match(P_DICTIONARY);
			setState(1759);
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
		enterRule(_localctx, 286, RULE_titleDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
			_la = _input.LA(1);
			if ( !(_la==P_TITLE || _la==P_SUBTITLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1762);
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
		enterRule(_localctx, 288, RULE_pDefinedDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			match(P_DEFINED);
			setState(1765);
			match(LPAREN);
			setState(1766);
			identifier();
			setState(1767);
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
		enterRule(_localctx, 290, RULE_messageDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1770);
			match(LPAREN);
			setState(1771);
			stringExpression();
			setState(1776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1772);
				match(COMMA);
				setState(1773);
				stringExpression();
				}
				}
				setState(1778);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1779);
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
		enterRule(_localctx, 292, RULE_infoFuncDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
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
		enterRule(_localctx, 294, RULE_pIfDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			match(P_IF);
			setState(1784);
			expression();
			setState(1785);
			match(P_THEN);
			setState(1786);
			pIfToken();
			setState(1788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1787);
				match(SEMI);
				}
			}

			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==P_ELIF) {
				{
				{
				setState(1790);
				match(P_ELIF);
				setState(1791);
				expression();
				setState(1792);
				match(P_THEN);
				setState(1793);
				pIfToken();
				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1794);
					match(SEMI);
					}
				}

				}
				}
				setState(1801);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==P_ELSE) {
				{
				setState(1802);
				match(P_ELSE);
				setState(1803);
				pIfToken();
				setState(1805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1804);
					match(SEMI);
					}
				}

				}
			}

			setState(1809);
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
		enterRule(_localctx, 296, RULE_pIfToken);
		try {
			setState(1814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1811);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1812);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1813);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ab\u071b\4\2\t"+
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
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\3\2\7"+
		"\2\u012e\n\2\f\2\16\2\u0131\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3\u013e\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0149\n\3"+
		"\3\3\3\3\5\3\u014d\n\3\3\4\3\4\3\4\5\4\u0152\n\4\3\5\3\5\3\5\3\5\7\5\u0158"+
		"\n\5\f\5\16\5\u015b\13\5\3\5\3\5\5\5\u015f\n\5\3\6\3\6\3\6\3\6\7\6\u0165"+
		"\n\6\f\6\16\6\u0168\13\6\3\6\3\6\5\6\u016c\n\6\3\7\3\7\3\7\3\7\7\7\u0172"+
		"\n\7\f\7\16\7\u0175\13\7\3\7\3\7\5\7\u0179\n\7\3\b\3\b\3\b\3\b\7\b\u017f"+
		"\n\b\f\b\16\b\u0182\13\b\3\b\3\b\5\b\u0186\n\b\3\t\3\t\3\t\3\t\7\t\u018c"+
		"\n\t\f\t\16\t\u018f\13\t\3\t\3\t\5\t\u0193\n\t\3\n\3\n\3\n\3\n\7\n\u0199"+
		"\n\n\f\n\16\n\u019c\13\n\3\n\3\n\5\n\u01a0\n\n\3\13\3\13\3\13\3\13\5\13"+
		"\u01a6\n\13\3\13\3\13\3\13\5\13\u01ab\n\13\7\13\u01ad\n\13\f\13\16\13"+
		"\u01b0\13\13\3\13\3\13\5\13\u01b4\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u01c1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u01ca\n\17\f\17\16\17\u01cd\13\17\3\20\3\20\3\20\5\20\u01d2\n\20"+
		"\3\20\5\20\u01d5\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u01de\n"+
		"\22\f\22\16\22\u01e1\13\22\3\22\3\22\3\23\3\23\5\23\u01e7\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\6\24\u01ef\n\24\r\24\16\24\u01f0\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u01f8\n\25\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u0200\n"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5"+
		"\30\u020f\n\30\3\31\3\31\5\31\u0213\n\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0221\n\36\3\36\3\36\5\36\u0225\n"+
		"\36\7\36\u0227\n\36\f\36\16\36\u022a\13\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\7\37\u0235\n\37\f\37\16\37\u0238\13\37\3\37\3\37\3"+
		" \3 \3!\3!\3!\3!\3!\3!\6!\u0244\n!\r!\16!\u0245\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\5\"\u024e\n\"\3\"\5\"\u0251\n\"\3\"\3\"\5\"\u0255\n\"\5\"\u0257\n\""+
		"\3#\3#\5#\u025b\n#\3#\3#\3#\3$\3$\5$\u0262\n$\3%\3%\3%\5%\u0267\n%\3&"+
		"\3&\3&\3&\3&\5&\u026e\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\5(\u0282\n(\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\5+\u028e\n+\3"+
		",\3,\3,\3,\3,\3,\5,\u0296\n,\3-\3-\3-\3-\5-\u029c\n-\3-\3-\3.\3.\3.\3"+
		".\3.\5.\u02a5\n.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\5/\u02ba\n/\3\60\3\60\3\60\7\60\u02bf\n\60\f\60\16\60\u02c2\13\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\5\63\u02cc\n\63\3\63\5\63\u02cf"+
		"\n\63\3\63\3\63\3\64\3\64\3\64\5\64\u02d6\n\64\3\64\5\64\u02d9\n\64\3"+
		"\65\3\65\3\65\7\65\u02de\n\65\f\65\16\65\u02e1\13\65\3\65\5\65\u02e4\n"+
		"\65\3\66\3\66\5\66\u02e8\n\66\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u02f0"+
		"\n\67\f\67\16\67\u02f3\13\67\3\67\5\67\u02f6\n\67\3\67\3\67\3\67\5\67"+
		"\u02fb\n\67\3\67\5\67\u02fe\n\67\38\38\38\58\u0303\n8\38\38\38\38\58\u0309"+
		"\n8\39\39\39\39\59\u030f\n9\39\39\3:\3:\3:\3:\3:\3;\3;\3<\3<\3<\3<\3<"+
		"\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\7?\u032c\n?\f?\16?\u032f\13?\3"+
		"?\3?\3?\3?\3?\3@\3@\3A\3A\5A\u033a\nA\3B\3B\3B\3B\3B\7B\u0341\nB\fB\16"+
		"B\u0344\13B\3B\3B\3C\3C\3C\7C\u034b\nC\fC\16C\u034e\13C\3D\3D\3D\3D\3"+
		"D\5D\u0355\nD\3E\5E\u0358\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u0363\nE\f"+
		"E\16E\u0366\13E\5E\u0368\nE\3E\5E\u036b\nE\3E\3E\3E\5E\u0370\nE\5E\u0372"+
		"\nE\3E\3E\5E\u0376\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u0381\nE\fE\16E\u0384"+
		"\13E\5E\u0386\nE\3E\5E\u0389\nE\3E\3E\3E\5E\u038e\nE\5E\u0390\nE\3E\5"+
		"E\u0393\nE\3F\3F\3G\3G\3H\5H\u039a\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\7H\u03a5"+
		"\nH\fH\16H\u03a8\13H\5H\u03aa\nH\3H\5H\u03ad\nH\3H\3H\3H\3H\5H\u03b3\n"+
		"H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\7H\u03c0\nH\fH\16H\u03c3\13H\3H\3H"+
		"\5H\u03c7\nH\3H\5H\u03ca\nH\3H\3H\3H\5H\u03cf\nH\5H\u03d1\nH\3H\3H\5H"+
		"\u03d5\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\7H\u03e0\nH\fH\16H\u03e3\13H\5H\u03e5"+
		"\nH\3H\5H\u03e8\nH\3H\3H\3H\3H\5H\u03ee\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H"+
		"\3H\3H\7H\u03fb\nH\fH\16H\u03fe\13H\3H\3H\5H\u0402\nH\3H\5H\u0405\nH\3"+
		"H\3H\3H\5H\u040a\nH\5H\u040c\nH\3H\5H\u040f\nH\3I\3I\3I\7I\u0414\nI\f"+
		"I\16I\u0417\13I\3J\3J\3J\5J\u041c\nJ\3K\3K\3L\5L\u0421\nL\3L\3L\3L\3L"+
		"\7L\u0427\nL\fL\16L\u042a\13L\5L\u042c\nL\3L\3L\3M\5M\u0431\nM\3M\3M\3"+
		"M\3M\7M\u0437\nM\fM\16M\u043a\13M\5M\u043c\nM\3M\5M\u043f\nM\3M\3M\5M"+
		"\u0443\nM\3M\3M\5M\u0447\nM\3M\3M\3M\3M\7M\u044d\nM\fM\16M\u0450\13M\5"+
		"M\u0452\nM\3M\5M\u0455\nM\3M\3M\5M\u0459\nM\3M\5M\u045c\nM\3N\3N\5N\u0460"+
		"\nN\3N\3N\3O\5O\u0465\nO\3O\3O\3O\3O\7O\u046b\nO\fO\16O\u046e\13O\5O\u0470"+
		"\nO\3O\5O\u0473\nO\3O\3O\3O\3O\3O\7O\u047a\nO\fO\16O\u047d\13O\5O\u047f"+
		"\nO\3O\3O\5O\u0483\nO\3O\3O\3O\3O\7O\u0489\nO\fO\16O\u048c\13O\5O\u048e"+
		"\nO\3O\5O\u0491\nO\3O\3O\3O\3O\3O\7O\u0498\nO\fO\16O\u049b\13O\5O\u049d"+
		"\nO\3O\5O\u04a0\nO\3P\3P\3P\3P\3P\3P\6P\u04a8\nP\rP\16P\u04a9\3Q\3Q\5"+
		"Q\u04ae\nQ\3R\3R\5R\u04b2\nR\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u04be\n"+
		"S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u04ca\nT\3U\3U\3U\3U\3U\5U\u04d1\n"+
		"U\3U\3U\3U\3U\3U\3U\5U\u04d9\nU\3U\3U\3U\3U\3U\3U\3U\5U\u04e2\nU\3U\3"+
		"U\3U\3U\3U\3U\3U\5U\u04eb\nU\3U\3U\5U\u04ef\nU\3V\3V\3V\3V\3V\3V\3V\5"+
		"V\u04f8\nV\3V\3V\3W\3W\5W\u04fe\nW\3X\3X\3X\5X\u0503\nX\3X\3X\3Y\3Y\5"+
		"Y\u0509\nY\3Y\3Y\3Y\5Y\u050e\nY\3Y\7Y\u0511\nY\fY\16Y\u0514\13Y\3Y\3Y"+
		"\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u051f\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u052a"+
		"\nZ\3Z\3Z\5Z\u052e\nZ\3[\3[\3[\3\\\3\\\5\\\u0535\n\\\3\\\5\\\u0538\n\\"+
		"\3]\3]\3]\7]\u053d\n]\f]\16]\u0540\13]\3^\3^\3^\7^\u0545\n^\f^\16^\u0548"+
		"\13^\3^\3^\3^\7^\u054d\n^\f^\16^\u0550\13^\5^\u0552\n^\3_\3_\3_\5_\u0557"+
		"\n_\3_\3_\3_\3_\3_\3`\3`\3a\3a\3a\3a\3a\5a\u0565\na\3b\3b\5b\u0569\nb"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0573\nc\3d\3d\3d\3d\3e\3e\3e\5e\u057c\ne"+
		"\3e\3e\3e\3e\7e\u0582\ne\fe\16e\u0585\13e\3e\3e\3e\3e\3e\3e\7e\u058d\n"+
		"e\fe\16e\u0590\13e\3e\3e\3e\3e\3e\7e\u0597\ne\fe\16e\u059a\13e\3e\3e\3"+
		"e\3e\3e\3e\7e\u05a2\ne\fe\16e\u05a5\13e\5e\u05a7\ne\3f\3f\3f\3f\5f\u05ad"+
		"\nf\3f\3f\3f\3f\3f\3f\7f\u05b5\nf\ff\16f\u05b8\13f\5f\u05ba\nf\3g\3g\3"+
		"g\3g\3g\3g\3g\3g\3g\5g\u05c5\ng\3h\3h\3h\3h\5h\u05cb\nh\3i\3i\3j\3j\3"+
		"j\3j\5j\u05d3\nj\3k\3k\3l\5l\u05d8\nl\3l\3l\3m\3m\3m\3m\3m\3m\3m\3m\3"+
		"m\3m\3m\3m\3m\3m\3m\5m\u05eb\nm\3n\3n\3n\3n\3n\5n\u05f2\nn\3o\3o\3o\3"+
		"o\3o\3p\5p\u05fa\np\3p\5p\u05fd\np\3p\3p\5p\u0601\np\3p\5p\u0604\np\7"+
		"p\u0606\np\fp\16p\u0609\13p\3q\3q\3r\3r\3r\3r\3r\3r\3r\3r\3r\5r\u0616"+
		"\nr\3s\3s\3s\7s\u061b\ns\fs\16s\u061e\13s\3s\5s\u0621\ns\3t\3t\3t\5t\u0626"+
		"\nt\3u\3u\3u\3u\3u\5u\u062d\nu\3v\3v\7v\u0631\nv\fv\16v\u0634\13v\3v\3"+
		"v\3v\5v\u0639\nv\3v\3v\5v\u063d\nv\3v\3v\3v\3v\3v\3v\3v\5v\u0646\nv\3"+
		"w\3w\3w\3x\3x\3x\3y\3y\3z\3z\3{\3{\3{\3|\3|\3}\3}\3~\3~\3~\3~\5~\u065d"+
		"\n~\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3"+
		"\u0081\7\u0081\u0669\n\u0081\f\u0081\16\u0081\u066c\13\u0081\3\u0081\5"+
		"\u0081\u066f\n\u0081\3\u0082\3\u0082\5\u0082\u0673\n\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\5\u0083\u067a\n\u0083\3\u0083\3\u0083\3\u0083"+
		"\5\u0083\u067f\n\u0083\5\u0083\u0681\n\u0083\3\u0084\3\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\7\u0084\u0689\n\u0084\f\u0084\16\u0084\u068c\13"+
		"\u0084\5\u0084\u068e\n\u0084\3\u0084\5\u0084\u0691\n\u0084\3\u0084\3\u0084"+
		"\5\u0084\u0695\n\u0084\3\u0084\5\u0084\u0698\n\u0084\3\u0084\3\u0084\3"+
		"\u0085\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\5\u0086\u06a3\n"+
		"\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u06bd"+
		"\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\7\u008e"+
		"\u06cf\n\u008e\f\u008e\16\u008e\u06d2\13\u008e\3\u008e\3\u008e\3\u008e"+
		"\7\u008e\u06d7\n\u008e\f\u008e\16\u008e\u06da\13\u008e\5\u008e\u06dc\n"+
		"\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\7\u0093\u06f1\n\u0093\f\u0093\16\u0093\u06f4\13\u0093"+
		"\3\u0093\3\u0093\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u06ff\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095"+
		"\u0706\n\u0095\7\u0095\u0708\n\u0095\f\u0095\16\u0095\u070b\13\u0095\3"+
		"\u0095\3\u0095\3\u0095\5\u0095\u0710\n\u0095\5\u0095\u0712\n\u0095\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\3\u0096\5\u0096\u0719\n\u0096\3\u0096\2\2\u0097"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\u012a\2\17\3\2\u008f\u009f\6\2<b"+
		"fi\u008d\u008e\u0097\u0097\4\2\u00a6\u00a6\u00a8\u00ab\3\2\3\4\4\2\u009b"+
		"\u009b\u009e\u009e\4\2\t\t\33\33\7\2\3\4jj\177\177\u008f\u008f\u0093\u0093"+
		"\7\2\5\7jjoo{{\u0095\u0095\3\2\37\"\4\2qq\u0087\u0087\3\2%&\3\2-\60\3"+
		"\2\61;\2\u07af\2\u012f\3\2\2\2\4\u014c\3\2\2\2\6\u0151\3\2\2\2\b\u015e"+
		"\3\2\2\2\n\u016b\3\2\2\2\f\u0178\3\2\2\2\16\u0185\3\2\2\2\20\u0192\3\2"+
		"\2\2\22\u019f\3\2\2\2\24\u01a1\3\2\2\2\26\u01b5\3\2\2\2\30\u01b7\3\2\2"+
		"\2\32\u01c0\3\2\2\2\34\u01cb\3\2\2\2\36\u01ce\3\2\2\2 \u01d6\3\2\2\2\""+
		"\u01d9\3\2\2\2$\u01e6\3\2\2\2&\u01e8\3\2\2\2(\u01f2\3\2\2\2*\u01f9\3\2"+
		"\2\2,\u01fb\3\2\2\2.\u020e\3\2\2\2\60\u0212\3\2\2\2\62\u0214\3\2\2\2\64"+
		"\u0216\3\2\2\2\66\u0218\3\2\2\28\u021a\3\2\2\2:\u021c\3\2\2\2<\u022b\3"+
		"\2\2\2>\u023b\3\2\2\2@\u023d\3\2\2\2B\u0256\3\2\2\2D\u0258\3\2\2\2F\u025f"+
		"\3\2\2\2H\u0266\3\2\2\2J\u026d\3\2\2\2L\u026f\3\2\2\2N\u0281\3\2\2\2P"+
		"\u0283\3\2\2\2R\u0285\3\2\2\2T\u028d\3\2\2\2V\u0295\3\2\2\2X\u0297\3\2"+
		"\2\2Z\u029f\3\2\2\2\\\u02b9\3\2\2\2^\u02bb\3\2\2\2`\u02c3\3\2\2\2b\u02c6"+
		"\3\2\2\2d\u02c9\3\2\2\2f\u02d8\3\2\2\2h\u02da\3\2\2\2j\u02e5\3\2\2\2l"+
		"\u02e9\3\2\2\2n\u0308\3\2\2\2p\u030a\3\2\2\2r\u0312\3\2\2\2t\u0317\3\2"+
		"\2\2v\u0319\3\2\2\2x\u031e\3\2\2\2z\u0321\3\2\2\2|\u0326\3\2\2\2~\u0335"+
		"\3\2\2\2\u0080\u0339\3\2\2\2\u0082\u033b\3\2\2\2\u0084\u0347\3\2\2\2\u0086"+
		"\u0354\3\2\2\2\u0088\u0392\3\2\2\2\u008a\u0394\3\2\2\2\u008c\u0396\3\2"+
		"\2\2\u008e\u040e\3\2\2\2\u0090\u0410\3\2\2\2\u0092\u041b\3\2\2\2\u0094"+
		"\u041d\3\2\2\2\u0096\u0420\3\2\2\2\u0098\u045b\3\2\2\2\u009a\u045f\3\2"+
		"\2\2\u009c\u049f\3\2\2\2\u009e\u04a1\3\2\2\2\u00a0\u04ab\3\2\2\2\u00a2"+
		"\u04b1\3\2\2\2\u00a4\u04bd\3\2\2\2\u00a6\u04c9\3\2\2\2\u00a8\u04ee\3\2"+
		"\2\2\u00aa\u04f0\3\2\2\2\u00ac\u04fd\3\2\2\2\u00ae\u04ff\3\2\2\2\u00b0"+
		"\u0506\3\2\2\2\u00b2\u052d\3\2\2\2\u00b4\u052f\3\2\2\2\u00b6\u0537\3\2"+
		"\2\2\u00b8\u0539\3\2\2\2\u00ba\u0551\3\2\2\2\u00bc\u0553\3\2\2\2\u00be"+
		"\u055d\3\2\2\2\u00c0\u0564\3\2\2\2\u00c2\u0568\3\2\2\2\u00c4\u0572\3\2"+
		"\2\2\u00c6\u0574\3\2\2\2\u00c8\u057b\3\2\2\2\u00ca\u05a8\3\2\2\2\u00cc"+
		"\u05c4\3\2\2\2\u00ce\u05c6\3\2\2\2\u00d0\u05cc\3\2\2\2\u00d2\u05ce\3\2"+
		"\2\2\u00d4\u05d4\3\2\2\2\u00d6\u05d7\3\2\2\2\u00d8\u05ea\3\2\2\2\u00da"+
		"\u05f1\3\2\2\2\u00dc\u05f3\3\2\2\2\u00de\u05f9\3\2\2\2\u00e0\u060a\3\2"+
		"\2\2\u00e2\u0615\3\2\2\2\u00e4\u0620\3\2\2\2\u00e6\u0622\3\2\2\2\u00e8"+
		"\u0627\3\2\2\2\u00ea\u0645\3\2\2\2\u00ec\u0647\3\2\2\2\u00ee\u064a\3\2"+
		"\2\2\u00f0\u064d\3\2\2\2\u00f2\u064f\3\2\2\2\u00f4\u0651\3\2\2\2\u00f6"+
		"\u0654\3\2\2\2\u00f8\u0656\3\2\2\2\u00fa\u065c\3\2\2\2\u00fc\u065e\3\2"+
		"\2\2\u00fe\u0662\3\2\2\2\u0100\u0665\3\2\2\2\u0102\u0672\3\2\2\2\u0104"+
		"\u0674\3\2\2\2\u0106\u0682\3\2\2\2\u0108\u069b\3\2\2\2\u010a\u06a2\3\2"+
		"\2\2\u010c\u06a4\3\2\2\2\u010e\u06a9\3\2\2\2\u0110\u06bc\3\2\2\2\u0112"+
		"\u06be\3\2\2\2\u0114\u06c2\3\2\2\2\u0116\u06c4\3\2\2\2\u0118\u06c6\3\2"+
		"\2\2\u011a\u06db\3\2\2\2\u011c\u06dd\3\2\2\2\u011e\u06e0\3\2\2\2\u0120"+
		"\u06e3\3\2\2\2\u0122\u06e6\3\2\2\2\u0124\u06eb\3\2\2\2\u0126\u06f7\3\2"+
		"\2\2\u0128\u06f9\3\2\2\2\u012a\u0718\3\2\2\2\u012c\u012e\5\32\16\2\u012d"+
		"\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\5\4\3\2\u0133"+
		"\u0134\5\36\20\2\u0134\u0135\7\32\2\2\u0135\3\3\2\2\2\u0136\u0137\5\n"+
		"\6\2\u0137\u0138\7\u0082\2\2\u0138\u013d\5\6\4\2\u0139\u013a\7\22\2\2"+
		"\u013a\u013b\5\u00b8]\2\u013b\u013c\7\23\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u0139\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\n"+
		"\2\2\u0140\u014d\3\2\2\2\u0141\u0142\5\f\7\2\u0142\u0143\7\u0092\2\2\u0143"+
		"\u0148\5\6\4\2\u0144\u0145\7\22\2\2\u0145\u0146\5\u00b8]\2\u0146\u0147"+
		"\7\23\2\2\u0147\u0149\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0149\3\2\2\2"+
		"\u0149\u014a\3\2\2\2\u014a\u014b\7\n\2\2\u014b\u014d\3\2\2\2\u014c\u0136"+
		"\3\2\2\2\u014c\u0141\3\2\2\2\u014d\5\3\2\2\2\u014e\u0152\7\u00a4\2\2\u014f"+
		"\u0152\5\30\r\2\u0150\u0152\5\26\f\2\u0151\u014e\3\2\2\2\u0151\u014f\3"+
		"\2\2\2\u0151\u0150\3\2\2\2\u0152\7\3\2\2\2\u0153\u0154\7\24\2\2\u0154"+
		"\u0159\5\24\13\2\u0155\u0156\7\t\2\2\u0156\u0158\5\24\13\2\u0157\u0155"+
		"\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7\26\2\2\u015d\u015f\3"+
		"\2\2\2\u015e\u0153\3\2\2\2\u015e\u015f\3\2\2\2\u015f\t\3\2\2\2\u0160\u0161"+
		"\7\24\2\2\u0161\u0166\5\24\13\2\u0162\u0163\7\t\2\2\u0163\u0165\5\24\13"+
		"\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7\26\2\2"+
		"\u016a\u016c\3\2\2\2\u016b\u0160\3\2\2\2\u016b\u016c\3\2\2\2\u016c\13"+
		"\3\2\2\2\u016d\u016e\7\24\2\2\u016e\u0173\5\24\13\2\u016f\u0170\7\t\2"+
		"\2\u0170\u0172\5\24\13\2\u0171\u016f\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0176\u0177\7\26\2\2\u0177\u0179\3\2\2\2\u0178\u016d\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\r\3\2\2\2\u017a\u017b\7\24\2\2\u017b\u0180\5\24\13"+
		"\2\u017c\u017d\7\t\2\2\u017d\u017f\5\24\13\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7\26\2\2\u0184\u0186\3\2\2\2\u0185"+
		"\u017a\3\2\2\2\u0185\u0186\3\2\2\2\u0186\17\3\2\2\2\u0187\u0188\7\24\2"+
		"\2\u0188\u018d\5\24\13\2\u0189\u018a\7\t\2\2\u018a\u018c\5\24\13\2\u018b"+
		"\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7\26\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0187\3\2\2\2\u0192\u0193\3\2\2\2\u0193\21\3\2\2"+
		"\2\u0194\u0195\7\24\2\2\u0195\u019a\5\24\13\2\u0196\u0197\7\t\2\2\u0197"+
		"\u0199\5\24\13\2\u0198\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3"+
		"\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u019e\7\26\2\2\u019e\u01a0\3\2\2\2\u019f\u0194\3\2\2\2\u019f\u01a0\3"+
		"\2\2\2\u01a0\23\3\2\2\2\u01a1\u01b3\5\30\r\2\u01a2\u01a5\7\22\2\2\u01a3"+
		"\u01a6\5.\30\2\u01a4\u01a6\5\6\4\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2"+
		"\2\2\u01a6\u01ae\3\2\2\2\u01a7\u01aa\7\t\2\2\u01a8\u01ab\5.\30\2\u01a9"+
		"\u01ab\5\6\4\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ad\3\2"+
		"\2\2\u01ac\u01a7\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7\23"+
		"\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01a2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\25\3\2\2\2\u01b5\u01b6\t\2\2\2\u01b6\27\3\2\2\2\u01b7\u01b8\t\3\2\2\u01b8"+
		"\31\3\2\2\2\u01b9\u01c1\5\u011c\u008f\2\u01ba\u01c1\5\u011e\u0090\2\u01bb"+
		"\u01c1\5\u0120\u0091\2\u01bc\u01c1\5\u0122\u0092\2\u01bd\u01c1\5\u0124"+
		"\u0093\2\u01be\u01c1\5\u0126\u0094\2\u01bf\u01c1\5\u0128\u0095\2\u01c0"+
		"\u01b9\3\2\2\2\u01c0\u01ba\3\2\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01bc\3\2"+
		"\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\33\3\2\2\2\u01c2\u01ca\5\32\16\2\u01c3\u01ca\5\"\22\2\u01c4\u01ca\5&"+
		"\24\2\u01c5\u01ca\5@!\2\u01c6\u01ca\5<\37\2\u01c7\u01ca\5\u009eP\2\u01c8"+
		"\u01ca\5\u00aaV\2\u01c9\u01c2\3\2\2\2\u01c9\u01c3\3\2\2\2\u01c9\u01c4"+
		"\3\2\2\2\u01c9\u01c5\3\2\2\2\u01c9\u01c6\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\35\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d4\5\34\17\2\u01cf"+
		"\u01d5\5\u00fc\177\2\u01d0\u01d2\5\u00a8U\2\u01d1\u01d0\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\7s\2\2\u01d4\u01cf\3\2"+
		"\2\2\u01d4\u01d1\3\2\2\2\u01d5\37\3\2\2\2\u01d6\u01d7\5\34\17\2\u01d7"+
		"\u01d8\5\u00fc\177\2\u01d8!\3\2\2\2\u01d9\u01da\7z\2\2\u01da\u01df\5$"+
		"\23\2\u01db\u01dc\7\t\2\2\u01dc\u01de\5$\23\2\u01dd\u01db\3\2\2\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2"+
		"\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7\n\2\2\u01e3#\3\2\2\2\u01e4\u01e7"+
		"\5\62\32\2\u01e5\u01e7\5\6\4\2\u01e6\u01e4\3\2\2\2\u01e6\u01e5\3\2\2\2"+
		"\u01e7%\3\2\2\2\u01e8\u01e9\5\22\n\2\u01e9\u01ee\7n\2\2\u01ea\u01eb\5"+
		"(\25\2\u01eb\u01ec\7\n\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01ef\5\u011c\u008f"+
		"\2\u01ee\u01ea\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\'\3\2\2\2\u01f2\u01f3\5*\26\2\u01f3"+
		"\u01f4\7\f\2\2\u01f4\u01f7\5\b\5\2\u01f5\u01f8\5.\30\2\u01f6\u01f8\5\u00ca"+
		"f\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8)\3\2\2\2\u01f9\u01fa"+
		"\5\6\4\2\u01fa+\3\2\2\2\u01fb\u01fc\7\u009a\2\2\u01fc\u01ff\7\22\2\2\u01fd"+
		"\u0200\5\62\32\2\u01fe\u0200\5\6\4\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe\3"+
		"\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\7\23\2\2\u0202-\3\2\2\2\u0203\u020f"+
		"\5\60\31\2\u0204\u0205\5\66\34\2\u0205\u0206\5\60\31\2\u0206\u020f\3\2"+
		"\2\2\u0207\u020f\5\6\4\2\u0208\u0209\5\66\34\2\u0209\u020a\5\6\4\2\u020a"+
		"\u020f\3\2\2\2\u020b\u020f\5:\36\2\u020c\u020f\5,\27\2\u020d\u020f\58"+
		"\35\2\u020e\u0203\3\2\2\2\u020e\u0204\3\2\2\2\u020e\u0207\3\2\2\2\u020e"+
		"\u0208\3\2\2\2\u020e\u020b\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2"+
		"\2\2\u020f/\3\2\2\2\u0210\u0213\5\62\32\2\u0211\u0213\5\64\33\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213\61\3\2\2\2\u0214\u0215\t\4\2"+
		"\2\u0215\63\3\2\2\2\u0216\u0217\7\u00a7\2\2\u0217\65\3\2\2\2\u0218\u0219"+
		"\t\5\2\2\u0219\67\3\2\2\2\u021a\u021b\t\6\2\2\u021b9\3\2\2\2\u021c\u0228"+
		"\7\u00a5\2\2\u021d\u0220\7\22\2\2\u021e\u0221\5\6\4\2\u021f\u0221\7\u00a6"+
		"\2\2\u0220\u021e\3\2\2\2\u0220\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0224\7\23\2\2\u0223\u0225\5:\36\2\u0224\u0223\3\2\2\2\u0224\u0225\3"+
		"\2\2\2\u0225\u0227\3\2\2\2\u0226\u021d\3\2\2\2\u0227\u022a\3\2\2\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229;\3\2\2\2\u022a\u0228\3\2\2\2"+
		"\u022b\u022c\7\u0097\2\2\u022c\u022d\5> \2\u022d\u022e\7\b\2\2\u022e\u0236"+
		"\5\u00caf\2\u022f\u0230\7\n\2\2\u0230\u0231\5> \2\u0231\u0232\7\b\2\2"+
		"\u0232\u0233\5\u00caf\2\u0233\u0235\3\2\2\2\u0234\u022f\3\2\2\2\u0235"+
		"\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2"+
		"\2\2\u0238\u0236\3\2\2\2\u0239\u023a\7\n\2\2\u023a=\3\2\2\2\u023b\u023c"+
		"\5\6\4\2\u023c?\3\2\2\2\u023d\u023e\5\16\b\2\u023e\u0243\7\u0088\2\2\u023f"+
		"\u0240\5B\"\2\u0240\u0241\7\n\2\2\u0241\u0244\3\2\2\2\u0242\u0244\5\u011c"+
		"\u008f\2\u0243\u023f\3\2\2\2\u0243\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246A\3\2\2\2\u0247\u0248\5\u008a"+
		"F\2\u0248\u0249\7\f\2\2\u0249\u024d\5\b\5\2\u024a\u024e\5H%\2\u024b\u024e"+
		"\5D#\2\u024c\u024e\5F$\2\u024d\u024a\3\2\2\2\u024d\u024b\3\2\2\2\u024d"+
		"\u024c\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u0251\5\u00a4S\2\u0250\u024f"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0257\3\2\2\2\u0252\u0254\5|?\2\u0253"+
		"\u0255\5\u00a4S\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257"+
		"\3\2\2\2\u0256\u0247\3\2\2\2\u0256\u0252\3\2\2\2\u0257C\3\2\2\2\u0258"+
		"\u025a\7v\2\2\u0259\u025b\5\u00b0Y\2\u025a\u0259\3\2\2\2\u025a\u025b\3"+
		"\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\7\13\2\2\u025d\u025e\5\u00be`\2"+
		"\u025eE\3\2\2\2\u025f\u0261\7\u0081\2\2\u0260\u0262\5\u00b0Y\2\u0261\u0260"+
		"\3\2\2\2\u0261\u0262\3\2\2\2\u0262G\3\2\2\2\u0263\u0267\5J&\2\u0264\u0267"+
		"\5T+\2\u0265\u0267\5z>\2\u0266\u0263\3\2\2\2\u0266\u0264\3\2\2\2\u0266"+
		"\u0265\3\2\2\2\u0267I\3\2\2\2\u0268\u026e\5L\'\2\u0269\u026e\5N(\2\u026a"+
		"\u026e\5P)\2\u026b\u026e\5X-\2\u026c\u026e\5\u0082B\2\u026d\u0268\3\2"+
		"\2\2\u026d\u0269\3\2\2\2\u026d\u026a\3\2\2\2\u026d\u026b\3\2\2\2\u026d"+
		"\u026c\3\2\2\2\u026eK\3\2\2\2\u026f\u0270\7\22\2\2\u0270\u0271\5\u00b8"+
		"]\2\u0271\u0272\7\23\2\2\u0272M\3\2\2\2\u0273\u0274\5.\30\2\u0274\u0275"+
		"\7\33\2\2\u0275\u0276\5.\30\2\u0276\u0282\3\2\2\2\u0277\u0278\5\u00ca"+
		"f\2\u0278\u0279\7\33\2\2\u0279\u027a\5\u00caf\2\u027a\u0282\3\2\2\2\u027b"+
		"\u027c\5\u00caf\2\u027c\u027d\7\33\2\2\u027d\u027e\5\u00caf\2\u027e\u027f"+
		"\7\13\2\2\u027f\u0280\5P)\2\u0280\u0282\3\2\2\2\u0281\u0273\3\2\2\2\u0281"+
		"\u0277\3\2\2\2\u0281\u027b\3\2\2\2\u0282O\3\2\2\2\u0283\u0284\5\6\4\2"+
		"\u0284Q\3\2\2\2\u0285\u0286\5\u00b8]\2\u0286\u0287\7\13\2\2\u0287\u0288"+
		"\5\b\5\2\u0288\u0289\5H%\2\u0289S\3\2\2\2\u028a\u028b\7\u0080\2\2\u028b"+
		"\u028e\5V,\2\u028c\u028e\5V,\2\u028d\u028a\3\2\2\2\u028d\u028c\3\2\2\2"+
		"\u028eU\3\2\2\2\u028f\u0296\5\\/\2\u0290\u0296\5d\63\2\u0291\u0296\5r"+
		":\2\u0292\u0296\5v<\2\u0293\u0296\5x=\2\u0294\u0296\5Z.\2\u0295\u028f"+
		"\3\2\2\2\u0295\u0290\3\2\2\2\u0295\u0291\3\2\2\2\u0295\u0292\3\2\2\2\u0295"+
		"\u0293\3\2\2\2\u0295\u0294\3\2\2\2\u0296W\3\2\2\2\u0297\u0298\7\u009c"+
		"\2\2\u0298\u029b\7\22\2\2\u0299\u029c\5\6\4\2\u029a\u029c\5\60\31\2\u029b"+
		"\u0299\3\2\2\2\u029b\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\7\23"+
		"\2\2\u029eY\3\2\2\2\u029f\u02a0\7\u0098\2\2\u02a0\u02a4\7\24\2\2\u02a1"+
		"\u02a5\5.\30\2\u02a2\u02a5\5\6\4\2\u02a3\u02a5\5\u00caf\2\u02a4\u02a1"+
		"\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a7\7\26\2\2\u02a7\u02a8\7~\2\2\u02a8\u02a9\5\b\5\2\u02a9\u02aa\7\u0099"+
		"\2\2\u02aa[\3\2\2\2\u02ab\u02ac\7k\2\2\u02ac\u02ad\7\24\2\2\u02ad\u02ae"+
		"\5^\60\2\u02ae\u02af\7\26\2\2\u02af\u02b0\7~\2\2\u02b0\u02b1\5b\62\2\u02b1"+
		"\u02ba\3\2\2\2\u02b2\u02b3\7k\2\2\u02b3\u02b4\7\25\2\2\u02b4\u02b5\5^"+
		"\60\2\u02b5\u02b6\7\27\2\2\u02b6\u02b7\7~\2\2\u02b7\u02b8\5b\62\2\u02b8"+
		"\u02ba\3\2\2\2\u02b9\u02ab\3\2\2\2\u02b9\u02b2\3\2\2\2\u02ba]\3\2\2\2"+
		"\u02bb\u02c0\5`\61\2\u02bc\u02bd\7\t\2\2\u02bd\u02bf\5`\61\2\u02be\u02bc"+
		"\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"_\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c4\5\b\5\2\u02c4\u02c5\5J&\2\u02c5"+
		"a\3\2\2\2\u02c6\u02c7\5\b\5\2\u02c7\u02c8\5H%\2\u02c8c\3\2\2\2\u02c9\u02cb"+
		"\7\u0083\2\2\u02ca\u02cc\5f\64\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2"+
		"\2\u02cc\u02ce\3\2\2\2\u02cd\u02cf\7\n\2\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\7s\2\2\u02d1e\3\2\2\2\u02d2\u02d5"+
		"\5h\65\2\u02d3\u02d4\7\n\2\2\u02d4\u02d6\5l\67\2\u02d5\u02d3\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d9\5l\67\2\u02d8\u02d2\3\2"+
		"\2\2\u02d8\u02d7\3\2\2\2\u02d9g\3\2\2\2\u02da\u02df\5j\66\2\u02db\u02dc"+
		"\7\n\2\2\u02dc\u02de\5j\66\2\u02dd\u02db\3\2\2\2\u02de\u02e1\3\2\2\2\u02df"+
		"\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2"+
		"\2\2\u02e2\u02e4\7\n\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"i\3\2\2\2\u02e5\u02e7\5R*\2\u02e6\u02e8\5\u00a2R\2\u02e7\u02e6\3\2\2\2"+
		"\u02e7\u02e8\3\2\2\2\u02e8k\3\2\2\2\u02e9\u02ea\7m\2\2\u02ea\u02eb\5n"+
		"8\2\u02eb\u02ec\7~\2\2\u02ec\u02f1\5p9\2\u02ed\u02ee\7\n\2\2\u02ee\u02f0"+
		"\5p9\2\u02ef\u02ed\3\2\2\2\u02f0\u02f3\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02fd\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u02f6\7\n"+
		"\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7"+
		"\u02f8\7\u0094\2\2\u02f8\u02fa\7\22\2\2\u02f9\u02fb\5f\64\2\u02fa\u02f9"+
		"\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\7\23\2\2"+
		"\u02fd\u02f5\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fem\3\2\2\2\u02ff\u0300\5"+
		"\6\4\2\u0300\u0301\7\13\2\2\u0301\u0303\3\2\2\2\u0302\u02ff\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\5\b\5\2\u0305\u0306\5P"+
		")\2\u0306\u0309\3\2\2\2\u0307\u0309\5P)\2\u0308\u0302\3\2\2\2\u0308\u0307"+
		"\3\2\2\2\u0309o\3\2\2\2\u030a\u030b\5\u00ba^\2\u030b\u030c\7\13\2\2\u030c"+
		"\u030e\7\22\2\2\u030d\u030f\5f\64\2\u030e\u030d\3\2\2\2\u030e\u030f\3"+
		"\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\7\23\2\2\u0311q\3\2\2\2\u0312\u0313"+
		"\7\u0085\2\2\u0313\u0314\7~\2\2\u0314\u0315\5\b\5\2\u0315\u0316\5t;\2"+
		"\u0316s\3\2\2\2\u0317\u0318\5J&\2\u0318u\3\2\2\2\u0319\u031a\7t\2\2\u031a"+
		"\u031b\7~\2\2\u031b\u031c\5\b\5\2\u031c\u031d\5H%\2\u031dw\3\2\2\2\u031e"+
		"\u031f\5\b\5\2\u031f\u0320\7\u009d\2\2\u0320y\3\2\2\2\u0321\u0322\5\b"+
		"\5\2\u0322\u0323\7\30\2\2\u0323\u0324\5\b\5\2\u0324\u0325\5H%\2\u0325"+
		"{\3\2\2\2\u0326\u0327\5\u0080A\2\u0327\u0328\7\22\2\2\u0328\u032d\5~@"+
		"\2\u0329\u032a\7\n\2\2\u032a\u032c\5~@\2\u032b\u0329\3\2\2\2\u032c\u032f"+
		"\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0330\3\2\2\2\u032f"+
		"\u032d\3\2\2\2\u0330\u0331\7\23\2\2\u0331\u0332\7\f\2\2\u0332\u0333\5"+
		"\b\5\2\u0333\u0334\5H%\2\u0334}\3\2\2\2\u0335\u0336\5R*\2\u0336\177\3"+
		"\2\2\2\u0337\u033a\5\6\4\2\u0338\u033a\7\u009c\2\2\u0339\u0337\3\2\2\2"+
		"\u0339\u0338\3\2\2\2\u033a\u0081\3\2\2\2\u033b\u033c\5\u0080A\2\u033c"+
		"\u033d\7\22\2\2\u033d\u0342\5\u0084C\2\u033e\u033f\7\n\2\2\u033f\u0341"+
		"\5\u0084C\2\u0340\u033e\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2"+
		"\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u0346"+
		"\7\23\2\2\u0346\u0083\3\2\2\2\u0347\u034c\5\u00caf\2\u0348\u0349\7\t\2"+
		"\2\u0349\u034b\5\u00caf\2\u034a\u0348\3\2\2\2\u034b\u034e\3\2\2\2\u034c"+
		"\u034a\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u0085\3\2\2\2\u034e\u034c\3\2"+
		"\2\2\u034f\u0355\5\u0088E\2\u0350\u0355\5\u008eH\2\u0351\u0355\5\u0096"+
		"L\2\u0352\u0355\5\u0098M\2\u0353\u0355\5\u009cO\2\u0354\u034f\3\2\2\2"+
		"\u0354\u0350\3\2\2\2\u0354\u0351\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0353"+
		"\3\2\2\2\u0355\u0087\3\2\2\2\u0356\u0358\5\u008aF\2\u0357\u0356\3\2\2"+
		"\2\u0357\u0358\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0367\7\24\2\2\u035a"+
		"\u035b\5\u0090I\2\u035b\u035c\7\13\2\2\u035c\u0364\5\u008cG\2\u035d\u035e"+
		"\7\n\2\2\u035e\u035f\5\u0090I\2\u035f\u0360\7\13\2\2\u0360\u0361\5\u008c"+
		"G\2\u0361\u0363\3\2\2\2\u0362\u035d\3\2\2\2\u0363\u0366\3\2\2\2\u0364"+
		"\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2"+
		"\2\2\u0367\u035a\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0371\3\2\2\2\u0369"+
		"\u036b\7\n\2\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2"+
		"\2\2\u036c\u036d\7\u0094\2\2\u036d\u036f\5\u008cG\2\u036e\u0370\7\n\2"+
		"\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0372\3\2\2\2\u0371\u036a"+
		"\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0393\7\26\2\2"+
		"\u0374\u0376\5\u008aF\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377\u0385\7\24\2\2\u0378\u0379\5\u0090I\2\u0379\u037a"+
		"\7\13\2\2\u037a\u0382\5\u0088E\2\u037b\u037c\7\n\2\2\u037c\u037d\5\u0090"+
		"I\2\u037d\u037e\7\13\2\2\u037e\u037f\5\u0088E\2\u037f\u0381\3\2\2\2\u0380"+
		"\u037b\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0382\u0383\3\2"+
		"\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0385\u0378\3\2\2\2\u0385"+
		"\u0386\3\2\2\2\u0386\u038f\3\2\2\2\u0387\u0389\7\n\2\2\u0388\u0387\3\2"+
		"\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\7\u0094\2\2\u038b"+
		"\u038d\5\u0088E\2\u038c\u038e\7\n\2\2\u038d\u038c\3\2\2\2\u038d\u038e"+
		"\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u0388\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u0393\7\26\2\2\u0392\u0357\3\2\2\2\u0392\u0375\3"+
		"\2\2\2\u0393\u0089\3\2\2\2\u0394\u0395\5\6\4\2\u0395\u008b\3\2\2\2\u0396"+
		"\u0397\5\u00caf\2\u0397\u008d\3\2\2\2\u0398\u039a\5\u008aF\2\u0399\u0398"+
		"\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u03a9\7\24\2\2"+
		"\u039c\u039d\5\u0090I\2\u039d\u039e\7\13\2\2\u039e\u03a6\5\u008cG\2\u039f"+
		"\u03a0\7\n\2\2\u03a0\u03a1\5\u0090I\2\u03a1\u03a2\7\13\2\2\u03a2\u03a3"+
		"\5\u008cG\2\u03a3\u03a5\3\2\2\2\u03a4\u039f\3\2\2\2\u03a5\u03a8\3\2\2"+
		"\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a6"+
		"\3\2\2\2\u03a9\u039c\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03c6\3\2\2\2\u03ab"+
		"\u03ad\7\n\2\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\3\2"+
		"\2\2\u03ae\u03b2\7m\2\2\u03af\u03b0\5\6\4\2\u03b0\u03b1\7\13\2\2\u03b1"+
		"\u03b3\3\2\2\2\u03b2\u03af\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3\2"+
		"\2\2\u03b4\u03b5\5\u0094K\2\u03b5\u03b6\7~\2\2\u03b6\u03b7\7\24\2\2\u03b7"+
		"\u03b8\5\u0090I\2\u03b8\u03b9\7\13\2\2\u03b9\u03c1\5\u008cG\2\u03ba\u03bb"+
		"\7\n\2\2\u03bb\u03bc\5\u0090I\2\u03bc\u03bd\7\13\2\2\u03bd\u03be\5\u008c"+
		"G\2\u03be\u03c0\3\2\2\2\u03bf\u03ba\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1"+
		"\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c1\3\2"+
		"\2\2\u03c4\u03c5\7\26\2\2\u03c5\u03c7\3\2\2\2\u03c6\u03ac\3\2\2\2\u03c6"+
		"\u03c7\3\2\2\2\u03c7\u03d0\3\2\2\2\u03c8\u03ca\7\n\2\2\u03c9\u03c8\3\2"+
		"\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\7\u0094\2\2\u03cc"+
		"\u03ce\7\u009f\2\2\u03cd\u03cf\7\n\2\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf"+
		"\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03c9\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d2\3\2\2\2\u03d2\u040f\7\26\2\2\u03d3\u03d5\5\u008aF\2\u03d4\u03d3"+
		"\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03e4\7\24\2\2"+
		"\u03d7\u03d8\5\u0090I\2\u03d8\u03d9\7\13\2\2\u03d9\u03e1\5\u008eH\2\u03da"+
		"\u03db\7\n\2\2\u03db\u03dc\5\u0090I\2\u03dc\u03dd\7\13\2\2\u03dd\u03de"+
		"\5\u008eH\2\u03de\u03e0\3\2\2\2\u03df\u03da\3\2\2\2\u03e0\u03e3\3\2\2"+
		"\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1"+
		"\3\2\2\2\u03e4\u03d7\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u0401\3\2\2\2\u03e6"+
		"\u03e8\7\n\2\2\u03e7\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2"+
		"\2\2\u03e9\u03ed\7m\2\2\u03ea\u03eb\5\6\4\2\u03eb\u03ec\7\13\2\2\u03ec"+
		"\u03ee\3\2\2\2\u03ed\u03ea\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2"+
		"\2\2\u03ef\u03f0\5\u0094K\2\u03f0\u03f1\7~\2\2\u03f1\u03f2\7\24\2\2\u03f2"+
		"\u03f3\5\u0090I\2\u03f3\u03f4\7\13\2\2\u03f4\u03fc\5\u008eH\2\u03f5\u03f6"+
		"\7\n\2\2\u03f6\u03f7\5\u0090I\2\u03f7\u03f8\7\13\2\2\u03f8\u03f9\5\u008e"+
		"H\2\u03f9\u03fb\3\2\2\2\u03fa\u03f5\3\2\2\2\u03fb\u03fe\3\2\2\2\u03fc"+
		"\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff\3\2\2\2\u03fe\u03fc\3\2"+
		"\2\2\u03ff\u0400\7\26\2\2\u0400\u0402\3\2\2\2\u0401\u03e7\3\2\2\2\u0401"+
		"\u0402\3\2\2\2\u0402\u040b\3\2\2\2\u0403\u0405\7\n\2\2\u0404\u0403\3\2"+
		"\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\7\u0094\2\2\u0407"+
		"\u0409\7\u009f\2\2\u0408\u040a\7\n\2\2\u0409\u0408\3\2\2\2\u0409\u040a"+
		"\3\2\2\2\u040a\u040c\3\2\2\2\u040b\u0404\3\2\2\2\u040b\u040c\3\2\2\2\u040c"+
		"\u040d\3\2\2\2\u040d\u040f\7\26\2\2\u040e\u0399\3\2\2\2\u040e\u03d4\3"+
		"\2\2\2\u040f\u008f\3\2\2\2\u0410\u0415\5\u0092J\2\u0411\u0412\7\t\2\2"+
		"\u0412\u0414\5\u0092J\2\u0413\u0411\3\2\2\2\u0414\u0417\3\2\2\2\u0415"+
		"\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0091\3\2\2\2\u0417\u0415\3\2"+
		"\2\2\u0418\u041c\5\6\4\2\u0419\u041c\7\u00a6\2\2\u041a\u041c\5N(\2\u041b"+
		"\u0418\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041a\3\2\2\2\u041c\u0093\3\2"+
		"\2\2\u041d\u041e\5\u00caf\2\u041e\u0095\3\2\2\2\u041f\u0421\5\u008aF\2"+
		"\u0420\u041f\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u042b"+
		"\7\24\2\2\u0423\u0428\5\u008cG\2\u0424\u0425\7\n\2\2\u0425\u0427\5\u008c"+
		"G\2\u0426\u0424\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428"+
		"\u0429\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2\2\u042b\u0423\3\2"+
		"\2\2\u042b\u042c\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u042e\7\26\2\2\u042e"+
		"\u0097\3\2\2\2\u042f\u0431\5\u008aF\2\u0430\u042f\3\2\2\2\u0430\u0431"+
		"\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u043b\7\22\2\2\u0433\u0438\5\u009a"+
		"N\2\u0434\u0435\7\t\2\2\u0435\u0437\5\u009aN\2\u0436\u0434\3\2\2\2\u0437"+
		"\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043c\3\2"+
		"\2\2\u043a\u0438\3\2\2\2\u043b\u0433\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u0442\3\2\2\2\u043d\u043f\7\n\2\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2"+
		"\2\2\u043f\u0440\3\2\2\2\u0440\u0441\7\u0084\2\2\u0441\u0443\5\u009aN"+
		"\2\u0442\u043e\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u045c"+
		"\7\23\2\2\u0445\u0447\5\u008aF\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2"+
		"\2\u0447\u0448\3\2\2\2\u0448\u0451\7\22\2\2\u0449\u044e\5\u0098M\2\u044a"+
		"\u044b\7\t\2\2\u044b\u044d\5\u0098M\2\u044c\u044a\3\2\2\2\u044d\u0450"+
		"\3\2\2\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0452\3\2\2\2\u0450"+
		"\u044e\3\2\2\2\u0451\u0449\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0458\3\2"+
		"\2\2\u0453\u0455\7\n\2\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u0456\3\2\2\2\u0456\u0457\7\u0084\2\2\u0457\u0459\5\u0098M\2\u0458\u0454"+
		"\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c\7\23\2\2"+
		"\u045b\u0430\3\2\2\2\u045b\u0446\3\2\2\2\u045c\u0099\3\2\2\2\u045d\u045e"+
		"\7\u00a6\2\2\u045e\u0460\7~\2\2\u045f\u045d\3\2\2\2\u045f\u0460\3\2\2"+
		"\2\u0460\u0461\3\2\2\2\u0461\u0462\5\u00caf\2\u0462\u009b\3\2\2\2\u0463"+
		"\u0465\5\u008aF\2\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466"+
		"\3\2\2\2\u0466\u046f\7\22\2\2\u0467\u046c\5\u009aN\2\u0468\u0469\7\t\2"+
		"\2\u0469\u046b\5\u009aN\2\u046a\u0468\3\2\2\2\u046b\u046e\3\2\2\2\u046c"+
		"\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046c\3\2"+
		"\2\2\u046f\u0467\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u047e\3\2\2\2\u0471"+
		"\u0473\7\n\2\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474\3\2"+
		"\2\2\u0474\u0475\5\u0094K\2\u0475\u0476\7\t\2\2\u0476\u047b\5\u009aN\2"+
		"\u0477\u0478\7\n\2\2\u0478\u047a\5\u009aN\2\u0479\u0477\3\2\2\2\u047a"+
		"\u047d\3\2\2\2\u047b\u0479\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047f\3\2"+
		"\2\2\u047d\u047b\3\2\2\2\u047e\u0472\3\2\2\2\u047e\u047f\3\2\2\2\u047f"+
		"\u0480\3\2\2\2\u0480\u04a0\7\23\2\2\u0481\u0483\5\u008aF\2\u0482\u0481"+
		"\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u048d\7\22\2\2"+
		"\u0485\u048a\5\u009cO\2\u0486\u0487\7\t\2\2\u0487\u0489\5\u009cO\2\u0488"+
		"\u0486\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2"+
		"\2\2\u048b\u048e\3\2\2\2\u048c\u048a\3\2\2\2\u048d\u0485\3\2\2\2\u048d"+
		"\u048e\3\2\2\2\u048e\u049c\3\2\2\2\u048f\u0491\7\n\2\2\u0490\u048f\3\2"+
		"\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\5\u0094K\2\u0493"+
		"\u0494\7\t\2\2\u0494\u0499\5\u009cO\2\u0495\u0496\7\n\2\2\u0496\u0498"+
		"\5\u009cO\2\u0497\u0495\3\2\2\2\u0498\u049b\3\2\2\2\u0499\u0497\3\2\2"+
		"\2\u0499\u049a\3\2\2\2\u049a\u049d\3\2\2\2\u049b\u0499\3\2\2\2\u049c\u0490"+
		"\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0\7\23\2\2"+
		"\u049f\u0464\3\2\2\2\u049f\u0482\3\2\2\2\u04a0\u009d\3\2\2\2\u04a1\u04a2"+
		"\5\20\t\2\u04a2\u04a7\7\u008a\2\2\u04a3\u04a4\5\u00a0Q\2\u04a4\u04a5\7"+
		"\n\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a8\5\u011c\u008f\2\u04a7\u04a3\3\2"+
		"\2\2\u04a7\u04a6\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9"+
		"\u04aa\3\2\2\2\u04aa\u009f\3\2\2\2\u04ab\u04ad\5R*\2\u04ac\u04ae\5\u00a2"+
		"R\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u00a1\3\2\2\2\u04af"+
		"\u04b2\5\u00a4S\2\u04b0\u04b2\5\u00a6T\2\u04b1\u04af\3\2\2\2\u04b1\u04b0"+
		"\3\2\2\2\u04b2\u00a3\3\2\2\2\u04b3\u04b4\7\u0097\2\2\u04b4\u04be\5\6\4"+
		"\2\u04b5\u04b6\7\u0097\2\2\u04b6\u04be\5\u00d6l\2\u04b7\u04b8\7\u0097"+
		"\2\2\u04b8\u04be\7\u009f\2\2\u04b9\u04ba\7\u0097\2\2\u04ba\u04be\5\u0086"+
		"D\2\u04bb\u04bc\7\u0097\2\2\u04bc\u04be\5\u00caf\2\u04bd\u04b3\3\2\2\2"+
		"\u04bd\u04b5\3\2\2\2\u04bd\u04b7\3\2\2\2\u04bd\u04b9\3\2\2\2\u04bd\u04bb"+
		"\3\2\2\2\u04be\u00a5\3\2\2\2\u04bf\u04c0\7\b\2\2\u04c0\u04ca\5\6\4\2\u04c1"+
		"\u04c2\7\b\2\2\u04c2\u04ca\5\u00d6l\2\u04c3\u04c4\7\b\2\2\u04c4\u04ca"+
		"\7\u009f\2\2\u04c5\u04c6\7\b\2\2\u04c6\u04ca\5\u0086D\2\u04c7\u04c8\7"+
		"\b\2\2\u04c8\u04ca\5\u00caf\2\u04c9\u04bf\3\2\2\2\u04c9\u04c1\3\2\2\2"+
		"\u04c9\u04c3\3\2\2\2\u04c9\u04c5\3\2\2\2\u04c9\u04c7\3\2\2\2\u04ca\u00a7"+
		"\3\2\2\2\u04cb\u04cc\7\u0087\2\2\u04cc\u04cd\7l\2\2\u04cd\u04d0\7p\2\2"+
		"\u04ce\u04d1\5\u00fc\177\2\u04cf\u04d1\5\u00c0a\2\u04d0\u04ce\3\2\2\2"+
		"\u04d0\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\7\n\2\2\u04d3\u04d4"+
		"\7\u0087\2\2\u04d4\u04d5\7s\2\2\u04d5\u04d8\7p\2\2\u04d6\u04d9\5\u00fc"+
		"\177\2\u04d7\u04d9\5\u00c0a\2\u04d8\u04d6\3\2\2\2\u04d8\u04d7\3\2\2\2"+
		"\u04d9\u04da\3\2\2\2\u04da\u04db\7\n\2\2\u04db\u04ef\3\2\2\2\u04dc\u04dd"+
		"\7\u0087\2\2\u04dd\u04de\7l\2\2\u04de\u04e1\7p\2\2\u04df\u04e2\5\u00fc"+
		"\177\2\u04e0\u04e2\5\u00c0a\2\u04e1\u04df\3\2\2\2\u04e1\u04e0\3\2\2\2"+
		"\u04e2\u04e3\3\2\2\2\u04e3\u04e4\7\n\2\2\u04e4\u04ef\3\2\2\2\u04e5\u04e6"+
		"\7\u0087\2\2\u04e6\u04e7\7s\2\2\u04e7\u04ea\7p\2\2\u04e8\u04eb\5\u00fc"+
		"\177\2\u04e9\u04eb\5\u00c0a\2\u04ea\u04e8\3\2\2\2\u04ea\u04e9\3\2\2\2"+
		"\u04eb\u04ec\3\2\2\2\u04ec\u04ed\7\n\2\2\u04ed\u04ef\3\2\2\2\u04ee\u04cb"+
		"\3\2\2\2\u04ee\u04dc\3\2\2\2\u04ee\u04e5\3\2\2\2\u04ef\u00a9\3\2\2\2\u04f0"+
		"\u04f1\5\b\5\2\u04f1\u04f7\5\u00acW\2\u04f2\u04f8\5 \21\2\u04f3\u04f8"+
		"\7c\2\2\u04f4\u04f8\7b\2\2\u04f5\u04f8\7d\2\2\u04f6\u04f8\7e\2\2\u04f7"+
		"\u04f2\3\2\2\2\u04f7\u04f3\3\2\2\2\u04f7\u04f4\3\2\2\2\u04f7\u04f5\3\2"+
		"\2\2\u04f7\u04f6\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\7\n\2\2\u04fa"+
		"\u00ab\3\2\2\2\u04fb\u04fe\5\u00aeX\2\u04fc\u04fe\5\u00bc_\2\u04fd\u04fb"+
		"\3\2\2\2\u04fd\u04fc\3\2\2\2\u04fe\u00ad\3\2\2\2\u04ff\u0500\7\u0081\2"+
		"\2\u0500\u0502\5\6\4\2\u0501\u0503\5\u00b0Y\2\u0502\u0501\3\2\2\2\u0502"+
		"\u0503\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\7\n\2\2\u0505\u00af\3\2"+
		"\2\2\u0506\u0508\7\22\2\2\u0507\u0509\5\u00e0q\2\u0508\u0507\3\2\2\2\u0508"+
		"\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u0512\5\u00b2Z\2\u050b\u050d"+
		"\7\n\2\2\u050c\u050e\5\u00e0q\2\u050d\u050c\3\2\2\2\u050d\u050e\3\2\2"+
		"\2\u050e\u050f\3\2\2\2\u050f\u0511\5\u00b2Z\2\u0510\u050b\3\2\2\2\u0511"+
		"\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0515\3\2"+
		"\2\2\u0514\u0512\3\2\2\2\u0515\u0516\7\23\2\2\u0516\u00b1\3\2\2\2\u0517"+
		"\u052e\5\u00b4[\2\u0518\u0519\7\u008a\2\2\u0519\u052e\5\u00b4[\2\u051a"+
		"\u051b\5\b\5\2\u051b\u051c\7v\2\2\u051c\u051e\5\6\4\2\u051d\u051f\5\u00b0"+
		"Y\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"\u0521\7\13\2\2\u0521\u0522\5\b\5\2\u0522\u0523\5\u00be`\2\u0523\u0524"+
		"\5\u00b6\\\2\u0524\u052e\3\2\2\2\u0525\u0526\5\b\5\2\u0526\u0527\7\u0081"+
		"\2\2\u0527\u0529\5\6\4\2\u0528\u052a\5\u00b0Y\2\u0529\u0528\3\2\2\2\u0529"+
		"\u052a\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\5\u00b6\\\2\u052c\u052e"+
		"\3\2\2\2\u052d\u0517\3\2\2\2\u052d\u0518\3\2\2\2\u052d\u051a\3\2\2\2\u052d"+
		"\u0525\3\2\2\2\u052e\u00b3\3\2\2\2\u052f\u0530\5R*\2\u0530\u0531\5\u00b6"+
		"\\\2\u0531\u00b5\3\2\2\2\u0532\u0534\7\b\2\2\u0533\u0535\5\u00e0q\2\u0534"+
		"\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0536\3\2\2\2\u0536\u0538\5\u00ca"+
		"f\2\u0537\u0532\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u00b7\3\2\2\2\u0539"+
		"\u053e\5\6\4\2\u053a\u053b\7\t\2\2\u053b\u053d\5\6\4\2\u053c\u053a\3\2"+
		"\2\2\u053d\u0540\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f"+
		"\u00b9\3\2\2\2\u0540\u053e\3\2\2\2\u0541\u0546\5.\30\2\u0542\u0543\t\7"+
		"\2\2\u0543\u0545\5.\30\2\u0544\u0542\3\2\2\2\u0545\u0548\3\2\2\2\u0546"+
		"\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0552\3\2\2\2\u0548\u0546\3\2"+
		"\2\2\u0549\u054e\5\u00dco\2\u054a\u054b\t\7\2\2\u054b\u054d\5\u00dco\2"+
		"\u054c\u054a\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054e\u054f"+
		"\3\2\2\2\u054f\u0552\3\2\2\2\u0550\u054e\3\2\2\2\u0551\u0541\3\2\2\2\u0551"+
		"\u0549\3\2\2\2\u0552\u00bb\3\2\2\2\u0553\u0554\7v\2\2\u0554\u0556\5\6"+
		"\4\2\u0555\u0557\5\u00b0Y\2\u0556\u0555\3\2\2\2\u0556\u0557\3\2\2\2\u0557"+
		"\u0558\3\2\2\2\u0558\u0559\7\13\2\2\u0559\u055a\5\b\5\2\u055a\u055b\5"+
		"\u00be`\2\u055b\u055c\7\n\2\2\u055c\u00bd\3\2\2\2\u055d\u055e\5P)\2\u055e"+
		"\u00bf\3\2\2\2\u055f\u0560\5$\23\2\u0560\u0561\7\13\2\2\u0561\u0562\5"+
		"\u00c2b\2\u0562\u0565\3\2\2\2\u0563\u0565\5\u00c2b\2\u0564\u055f\3\2\2"+
		"\2\u0564\u0563\3\2\2\2\u0565\u00c1\3\2\2\2\u0566\u0569\5\u00c4c\2\u0567"+
		"\u0569\5\u00fa~\2\u0568\u0566\3\2\2\2\u0568\u0567\3\2\2\2\u0569\u00c3"+
		"\3\2\2\2\u056a\u0573\5\u00c6d\2\u056b\u0573\5\u00e8u\2\u056c\u0573\5\u00ee"+
		"x\2\u056d\u0573\5\u00f0y\2\u056e\u0573\5\u00f2z\2\u056f\u0573\5\u00f4"+
		"{\2\u0570\u0573\5\32\16\2\u0571\u0573\5\u00f8}\2\u0572\u056a\3\2\2\2\u0572"+
		"\u056b\3\2\2\2\u0572\u056c\3\2\2\2\u0572\u056d\3\2\2\2\u0572\u056e\3\2"+
		"\2\2\u0572\u056f\3\2\2\2\u0572\u0570\3\2\2\2\u0572\u0571\3\2\2\2\u0573"+
		"\u00c5\3\2\2\2\u0574\u0575\5\u00c8e\2\u0575\u0576\7\b\2\2\u0576\u0577"+
		"\5\u00caf\2\u0577\u00c7\3\2\2\2\u0578\u0579\7\31\2\2\u0579\u057c\5\6\4"+
		"\2\u057a\u057c\5\6\4\2\u057b\u0578\3\2\2\2\u057b\u057a\3\2\2\2\u057c\u0598"+
		"\3\2\2\2\u057d\u057e\7\24\2\2\u057e\u0583\5\u00caf\2\u057f\u0580\7\t\2"+
		"\2\u0580\u0582\5\u00caf\2\u0581\u057f\3\2\2\2\u0582\u0585\3\2\2\2\u0583"+
		"\u0581\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\3\2\2\2\u0585\u0583\3\2"+
		"\2\2\u0586\u0587\7\26\2\2\u0587\u0597\3\2\2\2\u0588\u0589\7\25\2\2\u0589"+
		"\u058e\5\u00caf\2\u058a\u058b\7\t\2\2\u058b\u058d\5\u00caf\2\u058c\u058a"+
		"\3\2\2\2\u058d\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f"+
		"\u0591\3\2\2\2\u0590\u058e\3\2\2\2\u0591\u0592\7\27\2\2\u0592\u0597\3"+
		"\2\2\2\u0593\u0594\7\32\2\2\u0594\u0597\5\6\4\2\u0595\u0597\7\30\2\2\u0596"+
		"\u057d\3\2\2\2\u0596\u0588\3\2\2\2\u0596\u0593\3\2\2\2\u0596\u0595\3\2"+
		"\2\2\u0597\u059a\3\2\2\2\u0598\u0596\3\2\2\2\u0598\u0599\3\2\2\2\u0599"+
		"\u05a6\3\2\2\2\u059a\u0598\3\2\2\2\u059b\u059c\7\13\2\2\u059c\u059d\7"+
		"\13\2\2\u059d\u05a3\5\6\4\2\u059e\u059f\7\32\2\2\u059f\u05a2\5\6\4\2\u05a0"+
		"\u05a2\7\30\2\2\u05a1\u059e\3\2\2\2\u05a1\u05a0\3\2\2\2\u05a2\u05a5\3"+
		"\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4\u05a7\3\2\2\2\u05a5"+
		"\u05a3\3\2\2\2\u05a6\u059b\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u00c9\3\2"+
		"\2\2\u05a8\u05ac\5\u00ceh\2\u05a9\u05aa\5\u00ccg\2\u05aa\u05ab\5\u00ca"+
		"f\2\u05ab\u05ad\3\2\2\2\u05ac\u05a9\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad"+
		"\u05b9\3\2\2\2\u05ae\u05af\7\13\2\2\u05af\u05b0\7\13\2\2\u05b0\u05b6\5"+
		"\6\4\2\u05b1\u05b2\7\32\2\2\u05b2\u05b5\5\6\4\2\u05b3\u05b5\7\30\2\2\u05b4"+
		"\u05b1\3\2\2\2\u05b4\u05b3\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6\u05b4\3\2"+
		"\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05ba\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b9"+
		"\u05ae\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u00cb\3\2\2\2\u05bb\u05c5\7\f"+
		"\2\2\u05bc\u05c5\7\r\2\2\u05bd\u05c5\7\16\2\2\u05be\u05c5\7\17\2\2\u05bf"+
		"\u05c5\7\20\2\2\u05c0\u05c5\7\21\2\2\u05c1\u05c5\7y\2\2\u05c2\u05c3\7"+
		"}\2\2\u05c3\u05c5\7y\2\2\u05c4\u05bb\3\2\2\2\u05c4\u05bc\3\2\2\2\u05c4"+
		"\u05bd\3\2\2\2\u05c4\u05be\3\2\2\2\u05c4\u05bf\3\2\2\2\u05c4\u05c0\3\2"+
		"\2\2\u05c4\u05c1\3\2\2\2\u05c4\u05c2\3\2\2\2\u05c5\u00cd\3\2\2\2\u05c6"+
		"\u05ca\5\u00d2j\2\u05c7\u05c8\5\u00d0i\2\u05c8\u05c9\5\u00ceh\2\u05c9"+
		"\u05cb\3\2\2\2\u05ca\u05c7\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u00cf\3\2"+
		"\2\2\u05cc\u05cd\t\b\2\2\u05cd\u00d1\3\2\2\2\u05ce\u05d2\5\u00d6l\2\u05cf"+
		"\u05d0\5\u00d4k\2\u05d0\u05d1\5\u00d2j\2\u05d1\u05d3\3\2\2\2\u05d2\u05cf"+
		"\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u00d3\3\2\2\2\u05d4\u05d5\t\t\2\2\u05d5"+
		"\u00d5\3\2\2\2\u05d6\u05d8\t\5\2\2\u05d7\u05d6\3\2\2\2\u05d7\u05d8\3\2"+
		"\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05da\5\u00d8m\2\u05da\u00d7\3\2\2\2\u05db"+
		"\u05eb\5\u00c8e\2\u05dc\u05dd\7\22\2\2\u05dd\u05de\5\u00caf\2\u05de\u05df"+
		"\7\23\2\2\u05df\u05eb\3\2\2\2\u05e0\u05eb\5\u00dco\2\u05e1\u05eb\5\u00da"+
		"n\2\u05e2\u05eb\5\u00e2r\2\u05e3\u05e4\5\6\4\2\u05e4\u05e5\5\u00e2r\2"+
		"\u05e5\u05eb\3\2\2\2\u05e6\u05e7\7}\2\2\u05e7\u05eb\5\u00d8m\2\u05e8\u05eb"+
		"\58\35\2\u05e9\u05eb\5\32\16\2\u05ea\u05db\3\2\2\2\u05ea\u05dc\3\2\2\2"+
		"\u05ea\u05e0\3\2\2\2\u05ea\u05e1\3\2\2\2\u05ea\u05e2\3\2\2\2\u05ea\u05e3"+
		"\3\2\2\2\u05ea\u05e6\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05e9\3\2\2\2\u05eb"+
		"\u00d9\3\2\2\2\u05ec\u05f2\5\60\31\2\u05ed\u05f2\5,\27\2\u05ee\u05f2\5"+
		":\36\2\u05ef\u05f2\7|\2\2\u05f0\u05f2\7\u009f\2\2\u05f1\u05ec\3\2\2\2"+
		"\u05f1\u05ed\3\2\2\2\u05f1\u05ee\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f0"+
		"\3\2\2\2\u05f2\u00db\3\2\2\2\u05f3\u05f4\5\6\4\2\u05f4\u05f5\7\22\2\2"+
		"\u05f5\u05f6\5\u00dep\2\u05f6\u05f7\7\23\2\2\u05f7\u00dd\3\2\2\2\u05f8"+
		"\u05fa\5\u00e0q\2\u05f9\u05f8\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fc"+
		"\3\2\2\2\u05fb\u05fd\5\u00eav\2\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2"+
		"\2\u05fd\u0607\3\2\2\2\u05fe\u0600\7\t\2\2\u05ff\u0601\5\u00e0q\2\u0600"+
		"\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0603\3\2\2\2\u0602\u0604\5\u00ea"+
		"v\2\u0603\u0602\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0606\3\2\2\2\u0605"+
		"\u05fe\3\2\2\2\u0606\u0609\3\2\2\2\u0607\u0605\3\2\2\2\u0607\u0608\3\2"+
		"\2\2\u0608\u00df\3\2\2\2\u0609\u0607\3\2\2\2\u060a\u060b\t\n\2\2\u060b"+
		"\u00e1\3\2\2\2\u060c\u060d\7\24\2\2\u060d\u060e\5\u00e4s\2\u060e\u060f"+
		"\7\26\2\2\u060f\u0616\3\2\2\2\u0610\u0611\7\25\2\2\u0611\u0612\5\u00e4"+
		"s\2\u0612\u0613\7\27\2\2\u0613\u0616\3\2\2\2\u0614\u0616\5\u0086D\2\u0615"+
		"\u060c\3\2\2\2\u0615\u0610\3\2\2\2\u0615\u0614\3\2\2\2\u0616\u00e3\3\2"+
		"\2\2\u0617\u061c\5\u00e6t\2\u0618\u0619\7\t\2\2\u0619\u061b\5\u00e6t\2"+
		"\u061a\u0618\3\2\2\2\u061b\u061e\3\2\2\2\u061c\u061a\3\2\2\2\u061c\u061d"+
		"\3\2\2\2\u061d\u0621\3\2\2\2\u061e\u061c\3\2\2\2\u061f\u0621\3\2\2\2\u0620"+
		"\u0617\3\2\2\2\u0620\u061f\3\2\2\2\u0621\u00e5\3\2\2\2\u0622\u0625\5\u00ca"+
		"f\2\u0623\u0624\7\33\2\2\u0624\u0626\5\u00caf\2\u0625\u0623\3\2\2\2\u0625"+
		"\u0626\3\2\2\2\u0626\u00e7\3\2\2\2\u0627\u062c\5\6\4\2\u0628\u0629\7\22"+
		"\2\2\u0629\u062a\5\u00dep\2\u062a\u062b\7\23\2\2\u062b\u062d\3\2\2\2\u062c"+
		"\u0628\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u00e9\3\2\2\2\u062e\u0632\5\u00ca"+
		"f\2\u062f\u0631\5\u00ecw\2\u0630\u062f\3\2\2\2\u0631\u0634\3\2\2\2\u0632"+
		"\u0630\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0646\3\2\2\2\u0634\u0632\3\2"+
		"\2\2\u0635\u0636\5\6\4\2\u0636\u0638\7\b\2\2\u0637\u0639\5\u00e0q\2\u0638"+
		"\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063c\3\2\2\2\u063a\u063d\5\6"+
		"\4\2\u063b\u063d\5\u00caf\2\u063c\u063a\3\2\2\2\u063c\u063b\3\2\2\2\u063d"+
		"\u0646\3\2\2\2\u063e\u063f\5\6\4\2\u063f\u0640\7\b\2\2\u0640\u0641\5\u00e0"+
		"q\2\u0641\u0642\7\22\2\2\u0642\u0643\5\u00caf\2\u0643\u0644\7\23\2\2\u0644"+
		"\u0646\3\2\2\2\u0645\u062e\3\2\2\2\u0645\u0635\3\2\2\2\u0645\u063e\3\2"+
		"\2\2\u0646\u00eb\3\2\2\2\u0647\u0648\7\13\2\2\u0648\u0649\5\u00caf\2\u0649"+
		"\u00ed\3\2\2\2\u064a\u064b\7w\2\2\u064b\u064c\5$\23\2\u064c\u00ef\3\2"+
		"\2\2\u064d\u064e\7\u0090\2\2\u064e\u00f1\3\2\2\2\u064f\u0650\7\u0091\2"+
		"\2\u0650\u00f3\3\2\2\2\u0651\u0652\7\u0096\2\2\u0652\u0653\5\u00caf\2"+
		"\u0653\u00f5\3\2\2\2\u0654\u0655\7\u00a5\2\2\u0655\u00f7\3\2\2\2\u0656"+
		"\u0657\3\2\2\2\u0657\u00f9\3\2\2\2\u0658\u065d\5\u00fc\177\2\u0659\u065d"+
		"\5\u0102\u0082\2\u065a\u065d\5\u010a\u0086\2\u065b\u065d\5\u0118\u008d"+
		"\2\u065c\u0658\3\2\2\2\u065c\u0659\3\2\2\2\u065c\u065a\3\2\2\2\u065c\u065b"+
		"\3\2\2\2\u065d\u00fb\3\2\2\2\u065e\u065f\7l\2\2\u065f\u0660\5\u0100\u0081"+
		"\2\u0660\u0661\7s\2\2\u0661\u00fd\3\2\2\2\u0662\u0663\5\u0100\u0081\2"+
		"\u0663\u0664\7s\2\2\u0664\u00ff\3\2\2\2\u0665\u066a\5\u00c0a\2\u0666\u0667"+
		"\7\n\2\2\u0667\u0669\5\u00c0a\2\u0668\u0666\3\2\2\2\u0669\u066c\3\2\2"+
		"\2\u066a\u0668\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066e\3\2\2\2\u066c\u066a"+
		"\3\2\2\2\u066d\u066f\7\n\2\2\u066e\u066d\3\2\2\2\u066e\u066f\3\2\2\2\u066f"+
		"\u0101\3\2\2\2\u0670\u0673\5\u0104\u0083\2\u0671\u0673\5\u0106\u0084\2"+
		"\u0672\u0670\3\2\2\2\u0672\u0671\3\2\2\2\u0673\u0103\3\2\2\2\u0674\u0675"+
		"\7x\2\2\u0675\u0676\5\u00caf\2\u0676\u0677\7\u0086\2\2\u0677\u0679\5\u00c0"+
		"a\2\u0678\u067a\7\n\2\2\u0679\u0678\3\2\2\2\u0679\u067a\3\2\2\2\u067a"+
		"\u0680\3\2\2\2\u067b\u067c\7r\2\2\u067c\u067e\5\u00c0a\2\u067d\u067f\7"+
		"\n\2\2\u067e\u067d\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0681\3\2\2\2\u0680"+
		"\u067b\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0105\3\2\2\2\u0682\u0683\7m"+
		"\2\2\u0683\u0684\5\u00caf\2\u0684\u068d\7~\2\2\u0685\u068a\5\u0108\u0085"+
		"\2\u0686\u0687\7\n\2\2\u0687\u0689\5\u0108\u0085\2\u0688\u0686\3\2\2\2"+
		"\u0689\u068c\3\2\2\2\u068a\u0688\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068e"+
		"\3\2\2\2\u068c\u068a\3\2\2\2\u068d\u0685\3\2\2\2\u068d\u068e\3\2\2\2\u068e"+
		"\u0694\3\2\2\2\u068f\u0691\7\n\2\2\u0690\u068f\3\2\2\2\u0690\u0691\3\2"+
		"\2\2\u0691\u0692\3\2\2\2\u0692\u0693\7\u0094\2\2\u0693\u0695\5\u0100\u0081"+
		"\2\u0694\u0690\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0697\3\2\2\2\u0696\u0698"+
		"\7\n\2\2\u0697\u0696\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u0699\3\2\2\2\u0699"+
		"\u069a\7s\2\2\u069a\u0107\3\2\2\2\u069b\u069c\5\u00ba^\2\u069c\u069d\7"+
		"\13\2\2\u069d\u069e\5\u00c0a\2\u069e\u0109\3\2\2\2\u069f\u06a3\5\u010c"+
		"\u0087\2\u06a0\u06a3\5\u010e\u0088\2\u06a1\u06a3\5\u0110\u0089\2\u06a2"+
		"\u069f\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a2\u06a1\3\2\2\2\u06a3\u010b\3\2"+
		"\2\2\u06a4\u06a5\7\u008b\2\2\u06a5\u06a6\5\u00caf\2\u06a6\u06a7\7p\2\2"+
		"\u06a7\u06a8\5\u00c0a\2\u06a8\u010d\3\2\2\2\u06a9\u06aa\7\u0084\2\2\u06aa"+
		"\u06ab\5\u0100\u0081\2\u06ab\u06ac\7\u0089\2\2\u06ac\u06ad\5\u00caf\2"+
		"\u06ad\u010f\3\2\2\2\u06ae\u06af\7u\2\2\u06af\u06b0\5\6\4\2\u06b0\u06b1"+
		"\7\b\2\2\u06b1\u06b2\5\u0112\u008a\2\u06b2\u06b3\7p\2\2\u06b3\u06b4\5"+
		"\u00c0a\2\u06b4\u06bd\3\2\2\2\u06b5\u06b6\7u\2\2\u06b6\u06b7\5\6\4\2\u06b7"+
		"\u06b8\7y\2\2\u06b8\u06b9\5\u00caf\2\u06b9\u06ba\7p\2\2\u06ba\u06bb\5"+
		"\u00c0a\2\u06bb\u06bd\3\2\2\2\u06bc\u06ae\3\2\2\2\u06bc\u06b5\3\2\2\2"+
		"\u06bd\u0111\3\2\2\2\u06be\u06bf\5\u0114\u008b\2\u06bf\u06c0\t\13\2\2"+
		"\u06c0\u06c1\5\u0116\u008c\2\u06c1\u0113\3\2\2\2\u06c2\u06c3\5\u00caf"+
		"\2\u06c3\u0115\3\2\2\2\u06c4\u06c5\5\u00caf\2\u06c5\u0117\3\2\2\2\u06c6"+
		"\u06c7\7\u008c\2\2\u06c7\u06c8\5\u011a\u008e\2\u06c8\u06c9\7p\2\2\u06c9"+
		"\u06ca\5\u00c0a\2\u06ca\u0119\3\2\2\2\u06cb\u06d0\5\u00c8e\2\u06cc\u06cd"+
		"\7\t\2\2\u06cd\u06cf\5\u00c8e\2\u06ce\u06cc\3\2\2\2\u06cf\u06d2\3\2\2"+
		"\2\u06d0\u06ce\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06dc\3\2\2\2\u06d2\u06d0"+
		"\3\2\2\2\u06d3\u06dc\5\u0082B\2\u06d4\u06d5\7\t\2\2\u06d5\u06d7\5\u0082"+
		"B\2\u06d6\u06d4\3\2\2\2\u06d7\u06da\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d8"+
		"\u06d9\3\2\2\2\u06d9\u06dc\3\2\2\2\u06da\u06d8\3\2\2\2\u06db\u06cb\3\2"+
		"\2\2\u06db\u06d3\3\2\2\2\u06db\u06d8\3\2\2\2\u06dc\u011b\3\2\2\2\u06dd"+
		"\u06de\7#\2\2\u06de\u06df\7\u00a5\2\2\u06df\u011d\3\2\2\2\u06e0\u06e1"+
		"\7$\2\2\u06e1\u06e2\7\u00a5\2\2\u06e2\u011f\3\2\2\2\u06e3\u06e4\t\f\2"+
		"\2\u06e4\u06e5\7\u00a5\2\2\u06e5\u0121\3\2\2\2\u06e6\u06e7\7,\2\2\u06e7"+
		"\u06e8\7\22\2\2\u06e8\u06e9\5\6\4\2\u06e9\u06ea\7\23\2\2\u06ea\u0123\3"+
		"\2\2\2\u06eb\u06ec\t\r\2\2\u06ec\u06ed\7\22\2\2\u06ed\u06f2\5\u00f6|\2"+
		"\u06ee\u06ef\7\t\2\2\u06ef\u06f1\5\u00f6|\2\u06f0\u06ee\3\2\2\2\u06f1"+
		"\u06f4\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f5\3\2"+
		"\2\2\u06f4\u06f2\3\2\2\2\u06f5\u06f6\7\23\2\2\u06f6\u0125\3\2\2\2\u06f7"+
		"\u06f8\t\16\2\2\u06f8\u0127\3\2\2\2\u06f9\u06fa\7\'\2\2\u06fa\u06fb\5"+
		"\u00caf\2\u06fb\u06fc\7(\2\2\u06fc\u06fe\5\u012a\u0096\2\u06fd\u06ff\7"+
		"\n\2\2\u06fe\u06fd\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0709\3\2\2\2\u0700"+
		"\u0701\7)\2\2\u0701\u0702\5\u00caf\2\u0702\u0703\7(\2\2\u0703\u0705\5"+
		"\u012a\u0096\2\u0704\u0706\7\n\2\2\u0705\u0704\3\2\2\2\u0705\u0706\3\2"+
		"\2\2\u0706\u0708\3\2\2\2\u0707\u0700\3\2\2\2\u0708\u070b\3\2\2\2\u0709"+
		"\u0707\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u0711\3\2\2\2\u070b\u0709\3\2"+
		"\2\2\u070c\u070d\7*\2\2\u070d\u070f\5\u012a\u0096\2\u070e\u0710\7\n\2"+
		"\2\u070f\u070e\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0712\3\2\2\2\u0711\u070c"+
		"\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u0714\7+\2\2\u0714"+
		"\u0129\3\2\2\2\u0715\u0719\5\u00c0a\2\u0716\u0719\5\u00caf\2\u0717\u0719"+
		"\5\34\17\2\u0718\u0715\3\2\2\2\u0718\u0716\3\2\2\2\u0718\u0717\3\2\2\2"+
		"\u0719\u012b\3\2\2\2\u00e2\u012f\u013d\u0148\u014c\u0151\u0159\u015e\u0166"+
		"\u016b\u0173\u0178\u0180\u0185\u018d\u0192\u019a\u019f\u01a5\u01aa\u01ae"+
		"\u01b3\u01c0\u01c9\u01cb\u01d1\u01d4\u01df\u01e6\u01ee\u01f0\u01f7\u01ff"+
		"\u020e\u0212\u0220\u0224\u0228\u0236\u0243\u0245\u024d\u0250\u0254\u0256"+
		"\u025a\u0261\u0266\u026d\u0281\u028d\u0295\u029b\u02a4\u02b9\u02c0\u02cb"+
		"\u02ce\u02d5\u02d8\u02df\u02e3\u02e7\u02f1\u02f5\u02fa\u02fd\u0302\u0308"+
		"\u030e\u032d\u0339\u0342\u034c\u0354\u0357\u0364\u0367\u036a\u036f\u0371"+
		"\u0375\u0382\u0385\u0388\u038d\u038f\u0392\u0399\u03a6\u03a9\u03ac\u03b2"+
		"\u03c1\u03c6\u03c9\u03ce\u03d0\u03d4\u03e1\u03e4\u03e7\u03ed\u03fc\u0401"+
		"\u0404\u0409\u040b\u040e\u0415\u041b\u0420\u0428\u042b\u0430\u0438\u043b"+
		"\u043e\u0442\u0446\u044e\u0451\u0454\u0458\u045b\u045f\u0464\u046c\u046f"+
		"\u0472\u047b\u047e\u0482\u048a\u048d\u0490\u0499\u049c\u049f\u04a7\u04a9"+
		"\u04ad\u04b1\u04bd\u04c9\u04d0\u04d8\u04e1\u04ea\u04ee\u04f7\u04fd\u0502"+
		"\u0508\u050d\u0512\u051e\u0529\u052d\u0534\u0537\u053e\u0546\u054e\u0551"+
		"\u0556\u0564\u0568\u0572\u057b\u0583\u058e\u0596\u0598\u05a1\u05a3\u05a6"+
		"\u05ac\u05b4\u05b6\u05b9\u05c4\u05ca\u05d2\u05d7\u05ea\u05f1\u05f9\u05fc"+
		"\u0600\u0603\u0607\u0615\u061c\u0620\u0625\u062c\u0632\u0638\u063c\u0645"+
		"\u065c\u066a\u066e\u0672\u0679\u067e\u0680\u068a\u068d\u0690\u0694\u0697"+
		"\u06a2\u06bc\u06d0\u06d8\u06db\u06f2\u06fe\u0705\u0709\u070f\u0711\u0718";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}