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
		"program", "programHeading", "identifier", "attributePart", "attributeProgram", 
		"attributeModule", "attributeType", "attributeVar", "attributeConst", 
		"attributeDef", "preReservedWords", "attribute", "directives", "blockDeclarations", 
		"block", "blockIn", "labelDeclarationPart", "label", "constantDefinitionPart", 
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
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				attributeProgram();
				setState(307);
				match(PROGRAM);
				setState(308);
				identifier();
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(309);
					match(LPAREN);
					setState(310);
					identifierList();
					setState(311);
					match(RPAREN);
					}
				}

				setState(315);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				attributeModule();
				setState(318);
				match(MODULE);
				setState(319);
				identifier();
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(320);
					match(LPAREN);
					setState(321);
					identifierList();
					setState(322);
					match(RPAREN);
					}
				}

				setState(326);
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
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				attribute();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
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
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(335);
				match(LBRACK);
				setState(336);
				attributeDef();
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(337);
					match(COMMA);
					setState(338);
					attributeDef();
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
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
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(348);
				match(LBRACK);
				setState(349);
				attributeDef();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(350);
					match(COMMA);
					setState(351);
					attributeDef();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(357);
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
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(361);
				match(LBRACK);
				setState(362);
				attributeDef();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(363);
					match(COMMA);
					setState(364);
					attributeDef();
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
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
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(374);
				match(LBRACK);
				setState(375);
				attributeDef();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(376);
					match(COMMA);
					setState(377);
					attributeDef();
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
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
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(387);
				match(LBRACK);
				setState(388);
				attributeDef();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(389);
					match(COMMA);
					setState(390);
					attributeDef();
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(396);
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
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(400);
				match(LBRACK);
				setState(401);
				attributeDef();
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(402);
					match(COMMA);
					setState(403);
					attributeDef();
					}
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(409);
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
			setState(413);
			attribute();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(414);
				match(LPAREN);
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(415);
					constant();
					}
					break;
				case 2:
					{
					setState(416);
					identifier();
					}
					break;
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(419);
					match(COMMA);
					setState(422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(420);
						constant();
						}
						break;
					case 2:
						{
						setState(421);
						identifier();
						}
						break;
					}
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(429);
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
			setState(433);
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
			setState(435);
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
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case P_INCLUDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				includeDirective();
				}
				break;
			case P_DICTIONARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				dictionaryDirective();
				}
				break;
			case P_TITLE:
			case P_SUBTITLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				titleDirective();
				}
				break;
			case P_DEFINED:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				pDefinedDirective();
				}
				break;
			case P_ERROR:
			case P_WARN:
			case P_INFO:
			case P_MESSAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
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
				setState(442);
				infoFuncDirective();
				}
				break;
			case P_IF:
				enterOuterAlt(_localctx, 7);
				{
				setState(443);
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
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (CONST - 108)) | (1L << (FUNCTION - 108)) | (1L << (LABEL - 108)) | (1L << (PROCEDURE - 108)) | (1L << (TYPE - 108)) | (1L << (VAR - 108)) | (1L << (VALUE - 108)))) != 0)) {
				{
				setState(453);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(446);
					directives();
					}
					break;
				case 2:
					{
					setState(447);
					labelDeclarationPart();
					}
					break;
				case 3:
					{
					setState(448);
					constantDefinitionPart();
					}
					break;
				case 4:
					{
					setState(449);
					typeDefinitionPart();
					}
					break;
				case 5:
					{
					setState(450);
					valueDefinitionPart();
					}
					break;
				case 6:
					{
					setState(451);
					variableDeclarationPart();
					}
					break;
				case 7:
					{
					setState(452);
					procedureAndFunctionDeclarationPart();
					}
					break;
				}
				}
				setState(457);
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
			setState(458);
			blockDeclarations();
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(459);
				compoundStatement();
				}
				break;
			case END:
			case TO:
				{
				{
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(460);
					toBeginEndDoDeclarationPart();
					}
				}

				setState(463);
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
			setState(466);
			blockDeclarations();
			setState(467);
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
			setState(469);
			match(LABEL);
			setState(470);
			label();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(471);
				match(COMMA);
				setState(472);
				label();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
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
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
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
				setState(481);
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
			setState(484);
			attributeConst();
			setState(485);
			match(CONST);
			setState(490); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(490);
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
						setState(486);
						constantDefinition();
						setState(487);
						match(SEMI);
						}
						}
						break;
					case P_INCLUDE:
						{
						setState(489);
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
				setState(492); 
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
			setState(494);
			constantName();
			setState(495);
			match(EQUAL);
			setState(496);
			attributePart();
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(497);
				constant();
				}
				break;
			case 2:
				{
				setState(498);
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
			setState(501);
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
			setState(503);
			match(CHR);
			setState(504);
			match(LPAREN);
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				{
				setState(505);
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
				setState(506);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(509);
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
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				sign();
				setState(513);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(516);
				sign();
				setState(517);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(519);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(520);
				constantChr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(521);
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
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
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
			setState(528);
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
			setState(530);
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
			setState(532);
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
			setState(534);
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
			setState(536);
			match(STRING_LITERAL);
			setState(548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(537);
					match(LPAREN);
					setState(540);
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
						setState(538);
						identifier();
						}
						break;
					case NUM_INT:
						{
						setState(539);
						match(NUM_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(542);
					match(RPAREN);
					setState(544);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(543);
						string();
						}
						break;
					}
					}
					} 
				}
				setState(550);
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
			setState(551);
			match(VALUE);
			setState(552);
			variableName();
			setState(553);
			match(ASSIGN);
			setState(554);
			expression();
			setState(562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(555);
					match(SEMI);
					setState(556);
					variableName();
					setState(557);
					match(ASSIGN);
					setState(558);
					expression();
					}
					} 
				}
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(565);
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
			setState(567);
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
			setState(569);
			attributeType();
			setState(570);
			match(TYPE);
			setState(575); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(575);
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
						setState(571);
						typeDefinition();
						setState(572);
						match(SEMI);
						}
						}
						break;
					case P_INCLUDE:
						{
						setState(574);
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
				setState(577); 
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
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				typeName();
				setState(580);
				match(EQUAL);
				setState(581);
				attributePart();
				setState(585);
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
					setState(582);
					type();
					}
					break;
				case FUNCTION:
					{
					setState(583);
					functionType();
					}
					break;
				case PROCEDURE:
					{
					setState(584);
					procedureType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE) {
					{
					setState(587);
					variablePreDeclarationValue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				schemaType();
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALUE) {
					{
					setState(591);
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
			setState(596);
			match(FUNCTION);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(597);
				formalParameterList();
				}
			}

			setState(600);
			match(COLON);
			setState(601);
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
			setState(603);
			match(PROCEDURE);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(604);
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
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				structuredType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
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
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				enumType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(615);
				stringtype();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(616);
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
			setState(619);
			match(LPAREN);
			setState(620);
			identifierList();
			setState(621);
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
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				constant();
				setState(624);
				match(DOTDOT);
				setState(625);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				expression();
				setState(628);
				match(DOTDOT);
				setState(629);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				expression();
				setState(632);
				match(DOTDOT);
				setState(633);
				expression();
				setState(634);
				match(COLON);
				setState(635);
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
			setState(639);
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
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKED:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				match(PACKED);
				setState(642);
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
				setState(643);
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
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(648);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(649);
				fileType();
				}
				break;
			case LBRACK:
			case TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(650);
				textType();
				}
				break;
			case VARYING:
				enterOuterAlt(_localctx, 6);
				{
				setState(651);
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
			setState(654);
			match(STRING);
			setState(655);
			match(LPAREN);
			setState(658);
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
				setState(656);
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
				setState(657);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(660);
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
			setState(662);
			match(VARYING);
			setState(663);
			match(LBRACK);
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(664);
				constant();
				}
				break;
			case 2:
				{
				setState(665);
				identifier();
				}
				break;
			case 3:
				{
				setState(666);
				expression();
				}
				break;
			}
			setState(669);
			match(RBRACK);
			setState(670);
			match(OF);
			setState(671);
			attributePart();
			setState(672);
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
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				match(ARRAY);
				setState(675);
				match(LBRACK);
				setState(676);
				typeList();
				setState(677);
				match(RBRACK);
				setState(678);
				match(OF);
				setState(679);
				componentType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				match(ARRAY);
				setState(682);
				match(LBRACK2);
				setState(683);
				typeList();
				setState(684);
				match(RBRACK2);
				setState(685);
				match(OF);
				setState(686);
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
			setState(690);
			indexType();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(691);
				match(COMMA);
				setState(692);
				indexType();
				}
				}
				setState(697);
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
			setState(698);
			attributePart();
			setState(699);
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
			setState(701);
			attributePart();
			setState(702);
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
			setState(704);
			match(RECORD);
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)) | (1L << (CASE - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
				{
				setState(705);
				fieldList();
				}
			}

			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(708);
				match(SEMI);
				}
			}

			setState(711);
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
			setState(719);
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
				setState(713);
				fixedPart();
				setState(716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(714);
					match(SEMI);
					setState(715);
					variantPart();
					}
					break;
				}
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
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
			setState(721);
			recordSection();
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(722);
					match(SEMI);
					setState(723);
					recordSection();
					}
					} 
				}
				setState(728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(729);
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
		enterRule(_localctx, 102, RULE_recordSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			identifierList();
			setState(733);
			match(COLON);
			setState(734);
			attributePart();
			setState(735);
			type();
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==VALUE) {
				{
				setState(736);
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
		enterRule(_localctx, 104, RULE_variantPart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(CASE);
			setState(740);
			tag();
			setState(741);
			match(OF);
			setState(742);
			variant();
			setState(747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(743);
					match(SEMI);
					setState(744);
					variant();
					}
					} 
				}
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(750);
					match(SEMI);
					}
				}

				setState(753);
				match(OTHERWISE);
				setState(754);
				match(LPAREN);
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)) | (1L << (CASE - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(755);
					fieldList();
					}
				}

				setState(758);
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
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(761);
					identifier();
					setState(762);
					match(COLON);
					}
					break;
				}
				setState(766);
				attributePart();
				setState(767);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
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
		enterRule(_localctx, 108, RULE_variant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			constList();
			setState(773);
			match(COLON);
			setState(774);
			match(LPAREN);
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)) | (1L << (CASE - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
				{
				setState(775);
				fieldList();
				}
			}

			setState(778);
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
			setState(780);
			match(SET);
			setState(781);
			match(OF);
			setState(782);
			attributePart();
			setState(783);
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
			setState(785);
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
			setState(787);
			match(FILE);
			setState(788);
			match(OF);
			setState(789);
			attributePart();
			setState(790);
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
			setState(792);
			attributePart();
			setState(793);
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
			setState(795);
			attributePart();
			setState(796);
			match(POINTER_);
			setState(797);
			attributePart();
			setState(798);
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
			setState(800);
			schemaName();
			setState(801);
			match(LPAREN);
			setState(802);
			schemaList();
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(803);
				match(SEMI);
				setState(804);
				schemaList();
				}
				}
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(810);
			match(RPAREN);
			setState(811);
			match(EQUAL);
			setState(812);
			attributePart();
			setState(813);
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
			setState(815);
			identifier();
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(816);
				match(COMMA);
				setState(817);
				identifier();
				}
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(823);
			match(COLON);
			setState(824);
			attributePart();
			setState(825);
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
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
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
			setState(831);
			schemaName();
			setState(832);
			match(LPAREN);
			setState(833);
			prototypeList();
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(834);
				match(SEMI);
				setState(835);
				prototypeList();
				}
				}
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(841);
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
			setState(843);
			expression();
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(844);
				match(COMMA);
				setState(845);
				expression();
				}
				}
				setState(850);
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
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				constructorArray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				constructorRecord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(853);
				constructorSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				constructorNonStdArray();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(855);
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
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(858);
					typeName();
					}
				}

				setState(861);
				match(LBRACK);
				setState(875);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(862);
					initializerList();
					setState(863);
					match(COLON);
					setState(864);
					componentValue();
					setState(872);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(865);
							match(SEMI);
							setState(866);
							initializerList();
							setState(867);
							match(COLON);
							setState(868);
							componentValue();
							}
							} 
						}
						setState(874);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
					}
					}
					break;
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(877);
						match(SEMI);
						}
					}

					setState(880);
					match(OTHERWISE);
					setState(881);
					componentValue();
					setState(883);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(882);
						match(SEMI);
						}
					}

					}
				}

				setState(887);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(888);
					typeName();
					}
				}

				setState(891);
				match(LBRACK);
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(892);
					initializerList();
					setState(893);
					match(COLON);
					setState(894);
					constructorArray();
					setState(902);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(895);
							match(SEMI);
							setState(896);
							initializerList();
							setState(897);
							match(COLON);
							setState(898);
							constructorArray();
							}
							} 
						}
						setState(904);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
					}
					}
					break;
				}
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(908);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(907);
						match(SEMI);
						}
					}

					setState(910);
					match(OTHERWISE);
					setState(911);
					constructorArray();
					setState(913);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(912);
						match(SEMI);
						}
					}

					}
				}

				setState(917);
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
			setState(920);
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
			setState(922);
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
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(924);
					typeName();
					}
				}

				setState(927);
				match(LBRACK);
				setState(941);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(928);
					initializerList();
					setState(929);
					match(COLON);
					setState(930);
					componentValue();
					setState(938);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(931);
							match(SEMI);
							setState(932);
							initializerList();
							setState(933);
							match(COLON);
							setState(934);
							componentValue();
							}
							} 
						}
						setState(940);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
					}
					}
					break;
				}
				setState(970);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(944);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(943);
						match(SEMI);
						}
					}

					setState(946);
					match(CASE);
					setState(950);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						setState(947);
						identifier();
						setState(948);
						match(COLON);
						}
						break;
					}
					setState(952);
					tagValue();
					setState(953);
					match(OF);
					setState(954);
					match(LBRACK);
					{
					setState(955);
					initializerList();
					setState(956);
					match(COLON);
					setState(957);
					componentValue();
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(958);
						match(SEMI);
						setState(959);
						initializerList();
						setState(960);
						match(COLON);
						setState(961);
						componentValue();
						}
						}
						setState(967);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(968);
					match(RBRACK);
					}
					break;
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(972);
						match(SEMI);
						}
					}

					setState(975);
					match(OTHERWISE);
					setState(976);
					match(ZERO);
					setState(978);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(977);
						match(SEMI);
						}
					}

					}
				}

				setState(982);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(983);
					typeName();
					}
				}

				setState(986);
				match(LBRACK);
				setState(1000);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(987);
					initializerList();
					setState(988);
					match(COLON);
					setState(989);
					constructorRecord();
					setState(997);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(990);
							match(SEMI);
							setState(991);
							initializerList();
							setState(992);
							match(COLON);
							setState(993);
							constructorRecord();
							}
							} 
						}
						setState(999);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
					}
					}
					break;
				}
				setState(1029);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1003);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1002);
						match(SEMI);
						}
					}

					setState(1005);
					match(CASE);
					setState(1009);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						setState(1006);
						identifier();
						setState(1007);
						match(COLON);
						}
						break;
					}
					setState(1011);
					tagValue();
					setState(1012);
					match(OF);
					setState(1013);
					match(LBRACK);
					{
					setState(1014);
					initializerList();
					setState(1015);
					match(COLON);
					setState(1016);
					constructorRecord();
					setState(1024);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1017);
						match(SEMI);
						setState(1018);
						initializerList();
						setState(1019);
						match(COLON);
						setState(1020);
						constructorRecord();
						}
						}
						setState(1026);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(1027);
					match(RBRACK);
					}
					break;
				}
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(1032);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1031);
						match(SEMI);
						}
					}

					setState(1034);
					match(OTHERWISE);
					setState(1035);
					match(ZERO);
					setState(1037);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1036);
						match(SEMI);
						}
					}

					}
				}

				setState(1041);
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
			setState(1044);
			initializerItem();
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1045);
				match(COMMA);
				setState(1046);
				initializerItem();
				}
				}
				setState(1051);
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
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(1052);
				identifier();
				}
				break;
			case 2:
				{
				setState(1053);
				match(NUM_INT);
				}
				break;
			case 3:
				{
				setState(1054);
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
			setState(1057);
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
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
				{
				setState(1059);
				typeName();
				}
			}

			setState(1062);
			match(LBRACK);
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
				{
				setState(1063);
				componentValue();
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(1064);
					match(SEMI);
					setState(1065);
					componentValue();
					}
					}
					setState(1070);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1073);
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
			setState(1119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1075);
					typeName();
					}
				}

				setState(1078);
				match(LPAREN);
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
					{
					setState(1079);
					componentValueN();
					setState(1084);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1080);
						match(COMMA);
						setState(1081);
						componentValueN();
						}
						}
						setState(1086);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==REPEAT) {
					{
					setState(1090);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1089);
						match(SEMI);
						}
					}

					setState(1092);
					match(REPEAT);
					setState(1093);
					componentValueN();
					}
				}

				setState(1096);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1097);
					typeName();
					}
				}

				setState(1100);
				match(LPAREN);
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1101);
					constructorNonStdArray();
					setState(1106);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1102);
						match(COMMA);
						setState(1103);
						constructorNonStdArray();
						}
						}
						setState(1108);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==REPEAT) {
					{
					setState(1112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1111);
						match(SEMI);
						}
					}

					setState(1114);
					match(REPEAT);
					setState(1115);
					constructorNonStdArray();
					}
				}

				setState(1118);
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
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1121);
				match(NUM_INT);
				setState(1122);
				match(OF);
				}
				break;
			}
			setState(1125);
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
			setState(1187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1127);
					typeName();
					}
				}

				setState(1130);
				match(LPAREN);
				setState(1139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1131);
					componentValueN();
					setState(1136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1132);
						match(COMMA);
						setState(1133);
						componentValueN();
						}
						}
						setState(1138);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << SEMI) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
					{
					setState(1142);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1141);
						match(SEMI);
						}
					}

					setState(1144);
					tagValue();
					setState(1145);
					match(COMMA);
					setState(1146);
					componentValueN();
					setState(1151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1147);
						match(SEMI);
						setState(1148);
						componentValueN();
						}
						}
						setState(1153);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1156);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (ALIGN - 58)) | (1L << (ALIGNED - 58)) | (1L << (UNALIGNED - 58)) | (1L << (AT - 58)) | (1L << (AUTOMATIC - 58)) | (1L << (COMMON - 58)) | (1L << (STATIC - 58)) | (1L << (PSECT - 58)) | (1L << (ASYNCHRONOUS - 58)) | (1L << (CHECK - 58)) | (1L << (FLOAT - 58)) | (1L << (ENUMERATION_SIZE - 58)) | (1L << (PEN_CHECKING_STYLE - 58)) | (1L << (HiDDEN - 58)) | (1L << (IDENT - 58)) | (1L << (INITIALIZE - 58)) | (1L << (KEY - 58)) | (1L << (LIST - 58)) | (1L << (OPTIMIZE - 58)) | (1L << (NOOPTIMIZE - 58)) | (1L << (CLASS_A - 58)) | (1L << (CLASS_NCA - 58)) | (1L << (CLASS_S - 58)) | (1L << (IMMEDIATE - 58)) | (1L << (REFERENCE - 58)) | (1L << (POS - 58)) | (1L << (READONLY - 58)) | (1L << (BIT - 58)) | (1L << (BYTE - 58)) | (1L << (WORD - 58)) | (1L << (LONG - 58)) | (1L << (QUAD - 58)) | (1L << (OCTA - 58)) | (1L << (TRUNCATE - 58)) | (1L << (UNBOUND - 58)) | (1L << (UNSAFE - 58)) | (1L << (LOCAL - 58)) | (1L << (GLOBAL - 58)) | (1L << (EXTERNAL - 58)) | (1L << (WEAK_GLOBAL - 58)) | (1L << (WEAK_EXTERNAL - 58)) | (1L << (VOLATILE - 58)) | (1L << (WRITEONLY - 58)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)))) != 0)) {
					{
					setState(1157);
					typeName();
					}
				}

				setState(1160);
				match(LPAREN);
				setState(1169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1161);
					constructorNonStdRecord();
					setState(1166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1162);
						match(COMMA);
						setState(1163);
						constructorNonStdRecord();
						}
						}
						setState(1168);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << SEMI) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
					{
					setState(1172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1171);
						match(SEMI);
						}
					}

					setState(1174);
					tagValue();
					setState(1175);
					match(COMMA);
					setState(1176);
					constructorNonStdRecord();
					setState(1181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1177);
						match(SEMI);
						setState(1178);
						constructorNonStdRecord();
						}
						}
						setState(1183);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1186);
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
		enterRule(_localctx, 154, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			attributeVar();
			setState(1190);
			match(VAR);
			setState(1195); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1195);
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
						setState(1191);
						variableDeclaration();
						setState(1192);
						match(SEMI);
						}
						}
						break;
					case P_INCLUDE:
						{
						setState(1194);
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
				setState(1197); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
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
		enterRule(_localctx, 156, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			identifierList();
			setState(1200);
			match(COLON);
			setState(1201);
			attributePart();
			setState(1202);
			type();
			setState(1204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==VALUE) {
				{
				setState(1203);
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
			setState(1208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1206);
				variablePreDeclarationValue();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
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
		enterRule(_localctx, 160, RULE_variablePreDeclarationValue);
		try {
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1210);
				match(VALUE);
				setState(1211);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1212);
				match(VALUE);
				setState(1213);
				signedFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1214);
				match(VALUE);
				setState(1215);
				match(ZERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1216);
				match(VALUE);
				setState(1217);
				constructorValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1218);
				match(VALUE);
				setState(1219);
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
		enterRule(_localctx, 162, RULE_variablePreDeclarationAssign);
		try {
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				match(ASSIGN);
				setState(1223);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
				match(ASSIGN);
				setState(1225);
				signedFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1226);
				match(ASSIGN);
				setState(1227);
				match(ZERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1228);
				match(ASSIGN);
				setState(1229);
				constructorValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1230);
				match(ASSIGN);
				setState(1231);
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
		enterRule(_localctx, 164, RULE_toBeginEndDoDeclarationPart);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
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
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
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
				setState(1412);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1445);
				match(COLON);
				setState(1446);
				match(COLON);
				setState(1447);
				identifier();
				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINTER_ || _la==DOT) {
					{
					setState(1451);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(1448);
						match(DOT);
						setState(1449);
						identifier();
						}
						break;
					case POINTER_:
						{
						setState(1450);
						match(POINTER_);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1455);
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
		enterRule(_localctx, 198, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			simpleExpression();
			setState(1462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1459);
				relationaloperator();
				setState(1460);
				expression();
				}
				break;
			}
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1464);
				match(COLON);
				setState(1465);
				match(COLON);
				setState(1466);
				identifier();
				setState(1472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINTER_ || _la==DOT) {
					{
					setState(1470);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(1467);
						match(DOT);
						setState(1468);
						identifier();
						}
						break;
					case POINTER_:
						{
						setState(1469);
						match(POINTER_);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1474);
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
		enterRule(_localctx, 200, RULE_relationaloperator);
		try {
			setState(1486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1477);
				match(EQUAL);
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1478);
				match(NOT_EQUAL);
				}
				break;
			case LT_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1479);
				match(LT_);
				}
				break;
			case LE_:
				enterOuterAlt(_localctx, 4);
				{
				setState(1480);
				match(LE_);
				}
				break;
			case GE_:
				enterOuterAlt(_localctx, 5);
				{
				setState(1481);
				match(GE_);
				}
				break;
			case GT_:
				enterOuterAlt(_localctx, 6);
				{
				setState(1482);
				match(GT_);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(1483);
				match(IN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1484);
				match(NOT);
				setState(1485);
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
			setState(1488);
			term();
			setState(1492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1489);
				additiveoperator();
				setState(1490);
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
			setState(1494);
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
			setState(1496);
			signedFactor();
			setState(1500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1497);
				multiplicativeoperator();
				setState(1498);
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
			setState(1502);
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
			setState(1505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1504);
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

			setState(1507);
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
		enterRule(_localctx, 212, RULE_factor);
		try {
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1509);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				match(LPAREN);
				setState(1511);
				expression();
				setState(1512);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1514);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1515);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1516);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1517);
				identifier();
				setState(1518);
				set();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1520);
				match(NOT);
				setState(1521);
				factor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1522);
				bool();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1523);
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
			setState(1531);
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
				setState(1526);
				unsignedNumber();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1527);
				constantChr();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1528);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1529);
				match(NIL);
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 5);
				{
				setState(1530);
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
		enterRule(_localctx, 216, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			identifier();
			setState(1534);
			match(LPAREN);
			setState(1535);
			parameterList();
			setState(1536);
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
			setState(1539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
				{
				setState(1538);
				attibuteFuncParam();
				}
			}

			setState(1542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
				{
				setState(1541);
				actualParameter();
				}
			}

			setState(1553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1544);
				match(COMMA);
				setState(1546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1545);
					attibuteFuncParam();
					}
				}

				setState(1549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP) | (1L << P_INCLUDE) | (1L << P_DICTIONARY) | (1L << P_TITLE) | (1L << P_SUBTITLE) | (1L << P_IF) | (1L << P_DEFINED) | (1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE) | (1L << P_ARCH_NAME) | (1L << P_SYSTEM_NAME) | (1L << P_SYSTEM_VERSION) | (1L << P_DATE) | (1L << P_TIME) | (1L << P_COMPILER_VERSION) | (1L << P_LINE) | (1L << P_FILE) | (1L << P_ROUTINE) | (1L << P_MODULE) | (1L << P_IDENT) | (1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STATIC - 64)) | (1L << (PSECT - 64)) | (1L << (ASYNCHRONOUS - 64)) | (1L << (CHECK - 64)) | (1L << (FLOAT - 64)) | (1L << (ENUMERATION_SIZE - 64)) | (1L << (PEN_CHECKING_STYLE - 64)) | (1L << (HiDDEN - 64)) | (1L << (IDENT - 64)) | (1L << (INITIALIZE - 64)) | (1L << (KEY - 64)) | (1L << (LIST - 64)) | (1L << (OPTIMIZE - 64)) | (1L << (NOOPTIMIZE - 64)) | (1L << (CLASS_A - 64)) | (1L << (CLASS_NCA - 64)) | (1L << (CLASS_S - 64)) | (1L << (IMMEDIATE - 64)) | (1L << (REFERENCE - 64)) | (1L << (POS - 64)) | (1L << (READONLY - 64)) | (1L << (BIT - 64)) | (1L << (BYTE - 64)) | (1L << (WORD - 64)) | (1L << (LONG - 64)) | (1L << (QUAD - 64)) | (1L << (OCTA - 64)) | (1L << (TRUNCATE - 64)) | (1L << (UNBOUND - 64)) | (1L << (UNSAFE - 64)) | (1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (NIL - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (INHERIT - 139)) | (1L << (ENVIRONMENT - 139)) | (1L << (AND_THEN - 139)) | (1L << (BREAK - 139)) | (1L << (CONTINUE - 139)) | (1L << (MODULE - 139)) | (1L << (OR_ELSE - 139)) | (1L << (OTHERWISE - 139)) | (1L << (REM - 139)) | (1L << (RETURN - 139)) | (1L << (VALUE - 139)) | (1L << (VARYING - 139)) | (1L << (CHAR - 139)) | (1L << (CHR - 139)) | (1L << (FALSE - 139)) | (1L << (STRING - 139)) | (1L << (TEXT - 139)) | (1L << (TRUE - 139)) | (1L << (ZERO - 139)) | (1L << (IDENTIFIER - 139)) | (1L << (STRING_LITERAL - 139)) | (1L << (NUM_INT - 139)) | (1L << (NUM_REAL - 139)) | (1L << (BASE_NUMBER - 139)) | (1L << (BIN_NUMBER - 139)) | (1L << (HEX_NUMBER - 139)) | (1L << (OCT_NUMBER - 139)))) != 0)) {
					{
					setState(1548);
					actualParameter();
					}
				}

				}
				}
				setState(1555);
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
			setState(1556);
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
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558);
				match(LBRACK);
				setState(1559);
				elementList();
				setState(1560);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1562);
				match(LBRACK2);
				setState(1563);
				elementList();
				setState(1564);
				match(RBRACK2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1566);
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
			setState(1578);
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
				setState(1569);
				element();
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1570);
					match(COMMA);
					setState(1571);
					element();
					}
					}
					setState(1576);
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
			setState(1580);
			expression();
			setState(1583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(1581);
				match(DOTDOT);
				setState(1582);
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
			setState(1585);
			identifier();
			setState(1590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1586);
				match(LPAREN);
				setState(1587);
				parameterList();
				setState(1588);
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
			setState(1615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1592);
				expression();
				setState(1596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(1593);
					parameterwidth();
					}
					}
					setState(1598);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1599);
				identifier();
				setState(1600);
				match(ASSIGN);
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_IMMED) | (1L << P_REF) | (1L << P_DESCR) | (1L << P_STDESCR))) != 0)) {
					{
					setState(1601);
					attibuteFuncParam();
					}
				}

				setState(1606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1604);
					identifier();
					}
					break;
				case 2:
					{
					setState(1605);
					expression();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1608);
				identifier();
				setState(1609);
				match(ASSIGN);
				{
				setState(1610);
				attibuteFuncParam();
				setState(1611);
				match(LPAREN);
				setState(1612);
				expression();
				setState(1613);
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
			setState(1617);
			match(COLON);
			setState(1618);
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
			setState(1620);
			match(GOTO);
			setState(1621);
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
			setState(1623);
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
			setState(1625);
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
			setState(1627);
			match(RETURN);
			setState(1628);
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
			setState(1630);
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
			setState(1638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1635);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1636);
				repetetiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1637);
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
			setState(1640);
			match(BEGIN);
			setState(1641);
			statements();
			setState(1642);
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
			setState(1644);
			statements();
			setState(1645);
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
			setState(1647);
			statement();
			setState(1652);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1648);
					match(SEMI);
					setState(1649);
					statement();
					}
					} 
				}
				setState(1654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			}
			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1655);
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
			setState(1660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1658);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
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
			setState(1662);
			match(IF);
			setState(1663);
			expression();
			setState(1664);
			match(THEN);
			setState(1665);
			statement();
			setState(1667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1666);
				match(SEMI);
				}
				break;
			}
			setState(1674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1669);
				match(ELSE);
				setState(1670);
				statement();
				setState(1672);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1671);
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
			setState(1676);
			match(CASE);
			setState(1677);
			expression();
			setState(1678);
			match(OF);
			setState(1687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1679);
				caseListElement();
				setState(1684);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1680);
						match(SEMI);
						setState(1681);
						caseListElement();
						}
						} 
					}
					setState(1686);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
				}
				}
				break;
			}
			setState(1694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1689);
					match(SEMI);
					}
				}

				setState(1692);
				match(OTHERWISE);
				setState(1693);
				statements();
				}
				break;
			}
			setState(1697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1696);
				match(SEMI);
				}
			}

			setState(1699);
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
			setState(1701);
			constList();
			setState(1702);
			match(COLON);
			setState(1703);
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
			setState(1708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1705);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1706);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1707);
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
			setState(1710);
			match(WHILE);
			setState(1711);
			expression();
			setState(1712);
			match(DO);
			setState(1713);
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
			setState(1715);
			match(REPEAT);
			setState(1716);
			statements();
			setState(1717);
			match(UNTIL);
			setState(1718);
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
			setState(1734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1720);
				match(FOR);
				setState(1721);
				identifier();
				setState(1722);
				match(ASSIGN);
				setState(1723);
				forList();
				setState(1724);
				match(DO);
				setState(1725);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1727);
				match(FOR);
				setState(1728);
				identifier();
				setState(1729);
				match(IN);
				setState(1730);
				expression();
				setState(1731);
				match(DO);
				setState(1732);
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
			setState(1736);
			initialValue();
			setState(1737);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1738);
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
			setState(1740);
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
			setState(1742);
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
			setState(1744);
			match(WITH);
			setState(1745);
			recordVariableList();
			setState(1746);
			match(DO);
			setState(1747);
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
			setState(1765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1749);
				variable();
				setState(1754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1750);
					match(COMMA);
					setState(1751);
					variable();
					}
					}
					setState(1756);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1757);
				prototypeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1758);
					match(COMMA);
					setState(1759);
					prototypeType();
					}
					}
					setState(1764);
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
			setState(1767);
			match(P_INCLUDE);
			setState(1768);
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
			setState(1770);
			match(P_DICTIONARY);
			setState(1771);
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
			setState(1773);
			_la = _input.LA(1);
			if ( !(_la==P_TITLE || _la==P_SUBTITLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1774);
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
			setState(1776);
			match(P_DEFINED);
			setState(1777);
			match(LPAREN);
			setState(1778);
			identifier();
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
			setState(1781);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << P_ERROR) | (1L << P_WARN) | (1L << P_INFO) | (1L << P_MESSAGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1782);
			match(LPAREN);
			setState(1783);
			stringExpression();
			setState(1788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1784);
				match(COMMA);
				setState(1785);
				stringExpression();
				}
				}
				setState(1790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1791);
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
			setState(1793);
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
			setState(1795);
			match(P_IF);
			setState(1796);
			expression();
			setState(1797);
			match(P_THEN);
			setState(1798);
			pIfToken();
			setState(1800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1799);
				match(SEMI);
				}
			}

			setState(1811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==P_ELIF) {
				{
				{
				setState(1802);
				match(P_ELIF);
				setState(1803);
				expression();
				setState(1804);
				match(P_THEN);
				setState(1805);
				pIfToken();
				setState(1807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1806);
					match(SEMI);
					}
				}

				}
				}
				setState(1813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==P_ELSE) {
				{
				setState(1814);
				match(P_ELSE);
				setState(1815);
				pIfToken();
				setState(1817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(1816);
					match(SEMI);
					}
				}

				}
			}

			setState(1821);
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
			setState(1826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1823);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1824);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1825);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ab\u0727\4\2\t"+
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
		"\16\2\u012f\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u013c"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0147\n\3\3\3\3\3\5\3\u014b"+
		"\n\3\3\4\3\4\3\4\5\4\u0150\n\4\3\5\3\5\3\5\3\5\7\5\u0156\n\5\f\5\16\5"+
		"\u0159\13\5\3\5\3\5\5\5\u015d\n\5\3\6\3\6\3\6\3\6\7\6\u0163\n\6\f\6\16"+
		"\6\u0166\13\6\3\6\3\6\5\6\u016a\n\6\3\7\3\7\3\7\3\7\7\7\u0170\n\7\f\7"+
		"\16\7\u0173\13\7\3\7\3\7\5\7\u0177\n\7\3\b\3\b\3\b\3\b\7\b\u017d\n\b\f"+
		"\b\16\b\u0180\13\b\3\b\3\b\5\b\u0184\n\b\3\t\3\t\3\t\3\t\7\t\u018a\n\t"+
		"\f\t\16\t\u018d\13\t\3\t\3\t\5\t\u0191\n\t\3\n\3\n\3\n\3\n\7\n\u0197\n"+
		"\n\f\n\16\n\u019a\13\n\3\n\3\n\5\n\u019e\n\n\3\13\3\13\3\13\3\13\5\13"+
		"\u01a4\n\13\3\13\3\13\3\13\5\13\u01a9\n\13\7\13\u01ab\n\13\f\13\16\13"+
		"\u01ae\13\13\3\13\3\13\5\13\u01b2\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u01bf\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u01c8\n\17\f\17\16\17\u01cb\13\17\3\20\3\20\3\20\5\20\u01d0\n\20"+
		"\3\20\5\20\u01d3\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u01dc\n"+
		"\22\f\22\16\22\u01df\13\22\3\22\3\22\3\23\3\23\5\23\u01e5\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\6\24\u01ed\n\24\r\24\16\24\u01ee\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u01f6\n\25\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u01fe\n"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5"+
		"\30\u020d\n\30\3\31\3\31\5\31\u0211\n\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u021f\n\36\3\36\3\36\5\36\u0223\n"+
		"\36\7\36\u0225\n\36\f\36\16\36\u0228\13\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\7\37\u0233\n\37\f\37\16\37\u0236\13\37\3\37\3\37\3"+
		" \3 \3!\3!\3!\3!\3!\3!\6!\u0242\n!\r!\16!\u0243\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\5\"\u024c\n\"\3\"\5\"\u024f\n\"\3\"\3\"\5\"\u0253\n\"\5\"\u0255\n\""+
		"\3#\3#\5#\u0259\n#\3#\3#\3#\3$\3$\5$\u0260\n$\3%\3%\3%\5%\u0265\n%\3&"+
		"\3&\3&\3&\3&\5&\u026c\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\5(\u0280\n(\3)\3)\3*\3*\3*\5*\u0287\n*\3+\3+\3+\3+\3+\3"+
		"+\5+\u028f\n+\3,\3,\3,\3,\5,\u0295\n,\3,\3,\3-\3-\3-\3-\3-\5-\u029e\n"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02b3\n"+
		".\3/\3/\3/\7/\u02b8\n/\f/\16/\u02bb\13/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\5\62\u02c5\n\62\3\62\5\62\u02c8\n\62\3\62\3\62\3\63\3\63\3"+
		"\63\5\63\u02cf\n\63\3\63\5\63\u02d2\n\63\3\64\3\64\3\64\7\64\u02d7\n\64"+
		"\f\64\16\64\u02da\13\64\3\64\5\64\u02dd\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u02e4\n\65\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u02ec\n\66\f\66\16"+
		"\66\u02ef\13\66\3\66\5\66\u02f2\n\66\3\66\3\66\3\66\5\66\u02f7\n\66\3"+
		"\66\5\66\u02fa\n\66\3\67\3\67\3\67\5\67\u02ff\n\67\3\67\3\67\3\67\3\67"+
		"\5\67\u0305\n\67\38\38\38\38\58\u030b\n8\38\38\39\39\39\39\39\3:\3:\3"+
		";\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\7>\u0328\n>\f>\16"+
		">\u032b\13>\3>\3>\3>\3>\3>\3?\3?\3?\7?\u0335\n?\f?\16?\u0338\13?\3?\3"+
		"?\3?\3?\3@\3@\5@\u0340\n@\3A\3A\3A\3A\3A\7A\u0347\nA\fA\16A\u034a\13A"+
		"\3A\3A\3B\3B\3B\7B\u0351\nB\fB\16B\u0354\13B\3C\3C\3C\3C\3C\5C\u035b\n"+
		"C\3D\5D\u035e\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u0369\nD\fD\16D\u036c\13"+
		"D\5D\u036e\nD\3D\5D\u0371\nD\3D\3D\3D\5D\u0376\nD\5D\u0378\nD\3D\3D\5"+
		"D\u037c\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u0387\nD\fD\16D\u038a\13D\5D"+
		"\u038c\nD\3D\5D\u038f\nD\3D\3D\3D\5D\u0394\nD\5D\u0396\nD\3D\5D\u0399"+
		"\nD\3E\3E\3F\3F\3G\5G\u03a0\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u03ab\nG"+
		"\fG\16G\u03ae\13G\5G\u03b0\nG\3G\5G\u03b3\nG\3G\3G\3G\3G\5G\u03b9\nG\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u03c6\nG\fG\16G\u03c9\13G\3G\3G\5G"+
		"\u03cd\nG\3G\5G\u03d0\nG\3G\3G\3G\5G\u03d5\nG\5G\u03d7\nG\3G\3G\5G\u03db"+
		"\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u03e6\nG\fG\16G\u03e9\13G\5G\u03eb\n"+
		"G\3G\5G\u03ee\nG\3G\3G\3G\3G\5G\u03f4\nG\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\7G\u0401\nG\fG\16G\u0404\13G\3G\3G\5G\u0408\nG\3G\5G\u040b\nG\3G"+
		"\3G\3G\5G\u0410\nG\5G\u0412\nG\3G\5G\u0415\nG\3H\3H\3H\7H\u041a\nH\fH"+
		"\16H\u041d\13H\3I\3I\3I\5I\u0422\nI\3J\3J\3K\5K\u0427\nK\3K\3K\3K\3K\7"+
		"K\u042d\nK\fK\16K\u0430\13K\5K\u0432\nK\3K\3K\3L\5L\u0437\nL\3L\3L\3L"+
		"\3L\7L\u043d\nL\fL\16L\u0440\13L\5L\u0442\nL\3L\5L\u0445\nL\3L\3L\5L\u0449"+
		"\nL\3L\3L\5L\u044d\nL\3L\3L\3L\3L\7L\u0453\nL\fL\16L\u0456\13L\5L\u0458"+
		"\nL\3L\5L\u045b\nL\3L\3L\5L\u045f\nL\3L\5L\u0462\nL\3M\3M\5M\u0466\nM"+
		"\3M\3M\3N\5N\u046b\nN\3N\3N\3N\3N\7N\u0471\nN\fN\16N\u0474\13N\5N\u0476"+
		"\nN\3N\5N\u0479\nN\3N\3N\3N\3N\3N\7N\u0480\nN\fN\16N\u0483\13N\5N\u0485"+
		"\nN\3N\3N\5N\u0489\nN\3N\3N\3N\3N\7N\u048f\nN\fN\16N\u0492\13N\5N\u0494"+
		"\nN\3N\5N\u0497\nN\3N\3N\3N\3N\3N\7N\u049e\nN\fN\16N\u04a1\13N\5N\u04a3"+
		"\nN\3N\5N\u04a6\nN\3O\3O\3O\3O\3O\3O\6O\u04ae\nO\rO\16O\u04af\3P\3P\3"+
		"P\3P\3P\5P\u04b7\nP\3Q\3Q\5Q\u04bb\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5"+
		"R\u04c7\nR\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u04d3\nS\3T\3T\3T\3T\3T\5"+
		"T\u04da\nT\3T\3T\3T\3T\3T\3T\5T\u04e2\nT\3T\3T\3T\3T\3T\3T\3T\5T\u04eb"+
		"\nT\3T\3T\3T\3T\3T\3T\3T\5T\u04f4\nT\3T\3T\5T\u04f8\nT\3U\3U\3U\3U\3U"+
		"\3U\3U\5U\u0501\nU\3U\3U\3V\3V\5V\u0507\nV\3W\3W\3W\5W\u050c\nW\3W\3W"+
		"\3X\3X\5X\u0512\nX\3X\3X\3X\5X\u0517\nX\3X\7X\u051a\nX\fX\16X\u051d\13"+
		"X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0528\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5"+
		"Y\u0533\nY\3Y\3Y\5Y\u0537\nY\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\5[\u0541\n[\3[\5"+
		"[\u0544\n[\3\\\3\\\3\\\7\\\u0549\n\\\f\\\16\\\u054c\13\\\3]\3]\3]\7]\u0551"+
		"\n]\f]\16]\u0554\13]\3]\3]\3]\7]\u0559\n]\f]\16]\u055c\13]\5]\u055e\n"+
		"]\3^\3^\3^\5^\u0563\n^\3^\3^\3^\3^\3^\3_\3_\3`\3`\3`\3`\3`\5`\u0571\n"+
		"`\3a\3a\5a\u0575\na\3b\3b\3b\3b\3b\3b\3b\3b\5b\u057f\nb\3c\3c\3c\3c\3"+
		"d\3d\3d\5d\u0588\nd\3d\3d\3d\3d\7d\u058e\nd\fd\16d\u0591\13d\3d\3d\3d"+
		"\3d\3d\3d\7d\u0599\nd\fd\16d\u059c\13d\3d\3d\3d\3d\3d\7d\u05a3\nd\fd\16"+
		"d\u05a6\13d\3d\3d\3d\3d\3d\3d\7d\u05ae\nd\fd\16d\u05b1\13d\5d\u05b3\n"+
		"d\3e\3e\3e\3e\5e\u05b9\ne\3e\3e\3e\3e\3e\3e\7e\u05c1\ne\fe\16e\u05c4\13"+
		"e\5e\u05c6\ne\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u05d1\nf\3g\3g\3g\3g\5g\u05d7"+
		"\ng\3h\3h\3i\3i\3i\3i\5i\u05df\ni\3j\3j\3k\5k\u05e4\nk\3k\3k\3l\3l\3l"+
		"\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u05f7\nl\3m\3m\3m\3m\3m\5m\u05fe"+
		"\nm\3n\3n\3n\3n\3n\3o\5o\u0606\no\3o\5o\u0609\no\3o\3o\5o\u060d\no\3o"+
		"\5o\u0610\no\7o\u0612\no\fo\16o\u0615\13o\3p\3p\3q\3q\3q\3q\3q\3q\3q\3"+
		"q\3q\5q\u0622\nq\3r\3r\3r\7r\u0627\nr\fr\16r\u062a\13r\3r\5r\u062d\nr"+
		"\3s\3s\3s\5s\u0632\ns\3t\3t\3t\3t\3t\5t\u0639\nt\3u\3u\7u\u063d\nu\fu"+
		"\16u\u0640\13u\3u\3u\3u\5u\u0645\nu\3u\3u\5u\u0649\nu\3u\3u\3u\3u\3u\3"+
		"u\3u\5u\u0652\nu\3v\3v\3v\3w\3w\3w\3x\3x\3y\3y\3z\3z\3z\3{\3{\3|\3|\3"+
		"}\3}\3}\3}\5}\u0669\n}\3~\3~\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3"+
		"\u0080\7\u0080\u0675\n\u0080\f\u0080\16\u0080\u0678\13\u0080\3\u0080\5"+
		"\u0080\u067b\n\u0080\3\u0081\3\u0081\5\u0081\u067f\n\u0081\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\5\u0082\u0686\n\u0082\3\u0082\3\u0082\3\u0082"+
		"\5\u0082\u068b\n\u0082\5\u0082\u068d\n\u0082\3\u0083\3\u0083\3\u0083\3"+
		"\u0083\3\u0083\3\u0083\7\u0083\u0695\n\u0083\f\u0083\16\u0083\u0698\13"+
		"\u0083\5\u0083\u069a\n\u0083\3\u0083\5\u0083\u069d\n\u0083\3\u0083\3\u0083"+
		"\5\u0083\u06a1\n\u0083\3\u0083\5\u0083\u06a4\n\u0083\3\u0083\3\u0083\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\5\u0085\u06af\n"+
		"\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u06c9"+
		"\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\7\u008d"+
		"\u06db\n\u008d\f\u008d\16\u008d\u06de\13\u008d\3\u008d\3\u008d\3\u008d"+
		"\7\u008d\u06e3\n\u008d\f\u008d\16\u008d\u06e6\13\u008d\5\u008d\u06e8\n"+
		"\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0092\7\u0092\u06fd\n\u0092\f\u0092\16\u0092\u0700\13\u0092"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\5\u0094\u070b\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094"+
		"\u0712\n\u0094\7\u0094\u0714\n\u0094\f\u0094\16\u0094\u0717\13\u0094\3"+
		"\u0094\3\u0094\3\u0094\5\u0094\u071c\n\u0094\5\u0094\u071e\n\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0095\5\u0095\u0725\n\u0095\3\u0095\2\2\u0096"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c"+
		"\u011e\u0120\u0122\u0124\u0126\u0128\2\17\3\2\u008f\u009f\6\2<bfi\u008d"+
		"\u008e\u0097\u0097\4\2\u00a6\u00a6\u00a8\u00ab\3\2\3\4\4\2\u009b\u009b"+
		"\u009e\u009e\4\2\t\t\33\33\7\2\3\4jj\177\177\u008f\u008f\u0093\u0093\7"+
		"\2\5\7jjoo{{\u0095\u0095\3\2\37\"\4\2qq\u0087\u0087\3\2%&\3\2-\60\3\2"+
		"\61;\2\u07bd\2\u012d\3\2\2\2\4\u014a\3\2\2\2\6\u014f\3\2\2\2\b\u015c\3"+
		"\2\2\2\n\u0169\3\2\2\2\f\u0176\3\2\2\2\16\u0183\3\2\2\2\20\u0190\3\2\2"+
		"\2\22\u019d\3\2\2\2\24\u019f\3\2\2\2\26\u01b3\3\2\2\2\30\u01b5\3\2\2\2"+
		"\32\u01be\3\2\2\2\34\u01c9\3\2\2\2\36\u01cc\3\2\2\2 \u01d4\3\2\2\2\"\u01d7"+
		"\3\2\2\2$\u01e4\3\2\2\2&\u01e6\3\2\2\2(\u01f0\3\2\2\2*\u01f7\3\2\2\2,"+
		"\u01f9\3\2\2\2.\u020c\3\2\2\2\60\u0210\3\2\2\2\62\u0212\3\2\2\2\64\u0214"+
		"\3\2\2\2\66\u0216\3\2\2\28\u0218\3\2\2\2:\u021a\3\2\2\2<\u0229\3\2\2\2"+
		">\u0239\3\2\2\2@\u023b\3\2\2\2B\u0254\3\2\2\2D\u0256\3\2\2\2F\u025d\3"+
		"\2\2\2H\u0264\3\2\2\2J\u026b\3\2\2\2L\u026d\3\2\2\2N\u027f\3\2\2\2P\u0281"+
		"\3\2\2\2R\u0286\3\2\2\2T\u028e\3\2\2\2V\u0290\3\2\2\2X\u0298\3\2\2\2Z"+
		"\u02b2\3\2\2\2\\\u02b4\3\2\2\2^\u02bc\3\2\2\2`\u02bf\3\2\2\2b\u02c2\3"+
		"\2\2\2d\u02d1\3\2\2\2f\u02d3\3\2\2\2h\u02de\3\2\2\2j\u02e5\3\2\2\2l\u0304"+
		"\3\2\2\2n\u0306\3\2\2\2p\u030e\3\2\2\2r\u0313\3\2\2\2t\u0315\3\2\2\2v"+
		"\u031a\3\2\2\2x\u031d\3\2\2\2z\u0322\3\2\2\2|\u0331\3\2\2\2~\u033f\3\2"+
		"\2\2\u0080\u0341\3\2\2\2\u0082\u034d\3\2\2\2\u0084\u035a\3\2\2\2\u0086"+
		"\u0398\3\2\2\2\u0088\u039a\3\2\2\2\u008a\u039c\3\2\2\2\u008c\u0414\3\2"+
		"\2\2\u008e\u0416\3\2\2\2\u0090\u0421\3\2\2\2\u0092\u0423\3\2\2\2\u0094"+
		"\u0426\3\2\2\2\u0096\u0461\3\2\2\2\u0098\u0465\3\2\2\2\u009a\u04a5\3\2"+
		"\2\2\u009c\u04a7\3\2\2\2\u009e\u04b1\3\2\2\2\u00a0\u04ba\3\2\2\2\u00a2"+
		"\u04c6\3\2\2\2\u00a4\u04d2\3\2\2\2\u00a6\u04f7\3\2\2\2\u00a8\u04f9\3\2"+
		"\2\2\u00aa\u0506\3\2\2\2\u00ac\u0508\3\2\2\2\u00ae\u050f\3\2\2\2\u00b0"+
		"\u0536\3\2\2\2\u00b2\u0538\3\2\2\2\u00b4\u0543\3\2\2\2\u00b6\u0545\3\2"+
		"\2\2\u00b8\u055d\3\2\2\2\u00ba\u055f\3\2\2\2\u00bc\u0569\3\2\2\2\u00be"+
		"\u0570\3\2\2\2\u00c0\u0574\3\2\2\2\u00c2\u057e\3\2\2\2\u00c4\u0580\3\2"+
		"\2\2\u00c6\u0587\3\2\2\2\u00c8\u05b4\3\2\2\2\u00ca\u05d0\3\2\2\2\u00cc"+
		"\u05d2\3\2\2\2\u00ce\u05d8\3\2\2\2\u00d0\u05da\3\2\2\2\u00d2\u05e0\3\2"+
		"\2\2\u00d4\u05e3\3\2\2\2\u00d6\u05f6\3\2\2\2\u00d8\u05fd\3\2\2\2\u00da"+
		"\u05ff\3\2\2\2\u00dc\u0605\3\2\2\2\u00de\u0616\3\2\2\2\u00e0\u0621\3\2"+
		"\2\2\u00e2\u062c\3\2\2\2\u00e4\u062e\3\2\2\2\u00e6\u0633\3\2\2\2\u00e8"+
		"\u0651\3\2\2\2\u00ea\u0653\3\2\2\2\u00ec\u0656\3\2\2\2\u00ee\u0659\3\2"+
		"\2\2\u00f0\u065b\3\2\2\2\u00f2\u065d\3\2\2\2\u00f4\u0660\3\2\2\2\u00f6"+
		"\u0662\3\2\2\2\u00f8\u0668\3\2\2\2\u00fa\u066a\3\2\2\2\u00fc\u066e\3\2"+
		"\2\2\u00fe\u0671\3\2\2\2\u0100\u067e\3\2\2\2\u0102\u0680\3\2\2\2\u0104"+
		"\u068e\3\2\2\2\u0106\u06a7\3\2\2\2\u0108\u06ae\3\2\2\2\u010a\u06b0\3\2"+
		"\2\2\u010c\u06b5\3\2\2\2\u010e\u06c8\3\2\2\2\u0110\u06ca\3\2\2\2\u0112"+
		"\u06ce\3\2\2\2\u0114\u06d0\3\2\2\2\u0116\u06d2\3\2\2\2\u0118\u06e7\3\2"+
		"\2\2\u011a\u06e9\3\2\2\2\u011c\u06ec\3\2\2\2\u011e\u06ef\3\2\2\2\u0120"+
		"\u06f2\3\2\2\2\u0122\u06f7\3\2\2\2\u0124\u0703\3\2\2\2\u0126\u0705\3\2"+
		"\2\2\u0128\u0724\3\2\2\2\u012a\u012c\5\32\16\2\u012b\u012a\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u0130\u0131\5\4\3\2\u0131\u0132\5\36\20\2\u0132"+
		"\u0133\7\32\2\2\u0133\3\3\2\2\2\u0134\u0135\5\n\6\2\u0135\u0136\7\u0082"+
		"\2\2\u0136\u013b\5\6\4\2\u0137\u0138\7\22\2\2\u0138\u0139\5\u00b6\\\2"+
		"\u0139\u013a\7\23\2\2\u013a\u013c\3\2\2\2\u013b\u0137\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\n\2\2\u013e\u014b\3\2\2\2\u013f"+
		"\u0140\5\f\7\2\u0140\u0141\7\u0092\2\2\u0141\u0146\5\6\4\2\u0142\u0143"+
		"\7\22\2\2\u0143\u0144\5\u00b6\\\2\u0144\u0145\7\23\2\2\u0145\u0147\3\2"+
		"\2\2\u0146\u0142\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\7\n\2\2\u0149\u014b\3\2\2\2\u014a\u0134\3\2\2\2\u014a\u013f\3\2"+
		"\2\2\u014b\5\3\2\2\2\u014c\u0150\7\u00a4\2\2\u014d\u0150\5\30\r\2\u014e"+
		"\u0150\5\26\f\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3"+
		"\2\2\2\u0150\7\3\2\2\2\u0151\u0152\7\24\2\2\u0152\u0157\5\24\13\2\u0153"+
		"\u0154\7\t\2\2\u0154\u0156\5\24\13\2\u0155\u0153\3\2\2\2\u0156\u0159\3"+
		"\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015b\7\26\2\2\u015b\u015d\3\2\2\2\u015c\u0151\3"+
		"\2\2\2\u015c\u015d\3\2\2\2\u015d\t\3\2\2\2\u015e\u015f\7\24\2\2\u015f"+
		"\u0164\5\24\13\2\u0160\u0161\7\t\2\2\u0161\u0163\5\24\13\2\u0162\u0160"+
		"\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7\26\2\2\u0168\u016a\3"+
		"\2\2\2\u0169\u015e\3\2\2\2\u0169\u016a\3\2\2\2\u016a\13\3\2\2\2\u016b"+
		"\u016c\7\24\2\2\u016c\u0171\5\24\13\2\u016d\u016e\7\t\2\2\u016e\u0170"+
		"\5\24\13\2\u016f\u016d\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2\2\2"+
		"\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175"+
		"\7\26\2\2\u0175\u0177\3\2\2\2\u0176\u016b\3\2\2\2\u0176\u0177\3\2\2\2"+
		"\u0177\r\3\2\2\2\u0178\u0179\7\24\2\2\u0179\u017e\5\24\13\2\u017a\u017b"+
		"\7\t\2\2\u017b\u017d\5\24\13\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2"+
		"\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0181\u0182\7\26\2\2\u0182\u0184\3\2\2\2\u0183\u0178\3\2\2\2"+
		"\u0183\u0184\3\2\2\2\u0184\17\3\2\2\2\u0185\u0186\7\24\2\2\u0186\u018b"+
		"\5\24\13\2\u0187\u0188\7\t\2\2\u0188\u018a\5\24\13\2\u0189\u0187\3\2\2"+
		"\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\26\2\2\u018f\u0191\3\2\2\2"+
		"\u0190\u0185\3\2\2\2\u0190\u0191\3\2\2\2\u0191\21\3\2\2\2\u0192\u0193"+
		"\7\24\2\2\u0193\u0198\5\24\13\2\u0194\u0195\7\t\2\2\u0195\u0197\5\24\13"+
		"\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\7\26\2\2"+
		"\u019c\u019e\3\2\2\2\u019d\u0192\3\2\2\2\u019d\u019e\3\2\2\2\u019e\23"+
		"\3\2\2\2\u019f\u01b1\5\30\r\2\u01a0\u01a3\7\22\2\2\u01a1\u01a4\5.\30\2"+
		"\u01a2\u01a4\5\6\4\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01ac"+
		"\3\2\2\2\u01a5\u01a8\7\t\2\2\u01a6\u01a9\5.\30\2\u01a7\u01a9\5\6\4\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a5\3\2"+
		"\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01af\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\7\23\2\2\u01b0\u01b2\3"+
		"\2\2\2\u01b1\u01a0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\25\3\2\2\2\u01b3"+
		"\u01b4\t\2\2\2\u01b4\27\3\2\2\2\u01b5\u01b6\t\3\2\2\u01b6\31\3\2\2\2\u01b7"+
		"\u01bf\5\u011a\u008e\2\u01b8\u01bf\5\u011c\u008f\2\u01b9\u01bf\5\u011e"+
		"\u0090\2\u01ba\u01bf\5\u0120\u0091\2\u01bb\u01bf\5\u0122\u0092\2\u01bc"+
		"\u01bf\5\u0124\u0093\2\u01bd\u01bf\5\u0126\u0094\2\u01be\u01b7\3\2\2\2"+
		"\u01be\u01b8\3\2\2\2\u01be\u01b9\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bb"+
		"\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf\33\3\2\2\2\u01c0"+
		"\u01c8\5\32\16\2\u01c1\u01c8\5\"\22\2\u01c2\u01c8\5&\24\2\u01c3\u01c8"+
		"\5@!\2\u01c4\u01c8\5<\37\2\u01c5\u01c8\5\u009cO\2\u01c6\u01c8\5\u00a8"+
		"U\2\u01c7\u01c0\3\2\2\2\u01c7\u01c1\3\2\2\2\u01c7\u01c2\3\2\2\2\u01c7"+
		"\u01c3\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2"+
		"\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\35\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01d2\5\34\17\2\u01cd\u01d3\5\u00fa"+
		"~\2\u01ce\u01d0\5\u00a6T\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d3\7s\2\2\u01d2\u01cd\3\2\2\2\u01d2\u01cf\3\2"+
		"\2\2\u01d3\37\3\2\2\2\u01d4\u01d5\5\34\17\2\u01d5\u01d6\5\u00fa~\2\u01d6"+
		"!\3\2\2\2\u01d7\u01d8\7z\2\2\u01d8\u01dd\5$\23\2\u01d9\u01da\7\t\2\2\u01da"+
		"\u01dc\5$\23\2\u01db\u01d9\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0"+
		"\u01e1\7\n\2\2\u01e1#\3\2\2\2\u01e2\u01e5\5\62\32\2\u01e3\u01e5\5\6\4"+
		"\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5%\3\2\2\2\u01e6\u01e7"+
		"\5\22\n\2\u01e7\u01ec\7n\2\2\u01e8\u01e9\5(\25\2\u01e9\u01ea\7\n\2\2\u01ea"+
		"\u01ed\3\2\2\2\u01eb\u01ed\5\u011a\u008e\2\u01ec\u01e8\3\2\2\2\u01ec\u01eb"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\'\3\2\2\2\u01f0\u01f1\5*\26\2\u01f1\u01f2\7\f\2\2\u01f2\u01f5\5\b\5\2"+
		"\u01f3\u01f6\5.\30\2\u01f4\u01f6\5\u00c8e\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f6)\3\2\2\2\u01f7\u01f8\5\6\4\2\u01f8+\3\2\2\2\u01f9"+
		"\u01fa\7\u009a\2\2\u01fa\u01fd\7\22\2\2\u01fb\u01fe\5\62\32\2\u01fc\u01fe"+
		"\5\6\4\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0200\7\23\2\2\u0200-\3\2\2\2\u0201\u020d\5\60\31\2\u0202\u0203\5\66"+
		"\34\2\u0203\u0204\5\60\31\2\u0204\u020d\3\2\2\2\u0205\u020d\5\6\4\2\u0206"+
		"\u0207\5\66\34\2\u0207\u0208\5\6\4\2\u0208\u020d\3\2\2\2\u0209\u020d\5"+
		":\36\2\u020a\u020d\5,\27\2\u020b\u020d\58\35\2\u020c\u0201\3\2\2\2\u020c"+
		"\u0202\3\2\2\2\u020c\u0205\3\2\2\2\u020c\u0206\3\2\2\2\u020c\u0209\3\2"+
		"\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d/\3\2\2\2\u020e\u0211"+
		"\5\62\32\2\u020f\u0211\5\64\33\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2"+
		"\2\u0211\61\3\2\2\2\u0212\u0213\t\4\2\2\u0213\63\3\2\2\2\u0214\u0215\7"+
		"\u00a7\2\2\u0215\65\3\2\2\2\u0216\u0217\t\5\2\2\u0217\67\3\2\2\2\u0218"+
		"\u0219\t\6\2\2\u02199\3\2\2\2\u021a\u0226\7\u00a5\2\2\u021b\u021e\7\22"+
		"\2\2\u021c\u021f\5\6\4\2\u021d\u021f\7\u00a6\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\7\23\2\2\u0221\u0223\5"+
		":\36\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224"+
		"\u021b\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2"+
		"\2\2\u0227;\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022a\7\u0097\2\2\u022a"+
		"\u022b\5> \2\u022b\u022c\7\b\2\2\u022c\u0234\5\u00c8e\2\u022d\u022e\7"+
		"\n\2\2\u022e\u022f\5> \2\u022f\u0230\7\b\2\2\u0230\u0231\5\u00c8e\2\u0231"+
		"\u0233\3\2\2\2\u0232\u022d\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237"+
		"\u0238\7\n\2\2\u0238=\3\2\2\2\u0239\u023a\5\6\4\2\u023a?\3\2\2\2\u023b"+
		"\u023c\5\16\b\2\u023c\u0241\7\u0088\2\2\u023d\u023e\5B\"\2\u023e\u023f"+
		"\7\n\2\2\u023f\u0242\3\2\2\2\u0240\u0242\5\u011a\u008e\2\u0241\u023d\3"+
		"\2\2\2\u0241\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0241\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244A\3\2\2\2\u0245\u0246\5\u0088E\2\u0246\u0247\7\f\2"+
		"\2\u0247\u024b\5\b\5\2\u0248\u024c\5H%\2\u0249\u024c\5D#\2\u024a\u024c"+
		"\5F$\2\u024b\u0248\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024a\3\2\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u024f\5\u00a2R\2\u024e\u024d\3\2\2\2\u024e\u024f"+
		"\3\2\2\2\u024f\u0255\3\2\2\2\u0250\u0252\5z>\2\u0251\u0253\5\u00a2R\2"+
		"\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0245"+
		"\3\2\2\2\u0254\u0250\3\2\2\2\u0255C\3\2\2\2\u0256\u0258\7v\2\2\u0257\u0259"+
		"\5\u00aeX\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2"+
		"\2\u025a\u025b\7\13\2\2\u025b\u025c\5\u00bc_\2\u025cE\3\2\2\2\u025d\u025f"+
		"\7\u0081\2\2\u025e\u0260\5\u00aeX\2\u025f\u025e\3\2\2\2\u025f\u0260\3"+
		"\2\2\2\u0260G\3\2\2\2\u0261\u0265\5J&\2\u0262\u0265\5R*\2\u0263\u0265"+
		"\5x=\2\u0264\u0261\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0263\3\2\2\2\u0265"+
		"I\3\2\2\2\u0266\u026c\5L\'\2\u0267\u026c\5N(\2\u0268\u026c\5P)\2\u0269"+
		"\u026c\5V,\2\u026a\u026c\5\u0080A\2\u026b\u0266\3\2\2\2\u026b\u0267\3"+
		"\2\2\2\u026b\u0268\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026c"+
		"K\3\2\2\2\u026d\u026e\7\22\2\2\u026e\u026f\5\u00b6\\\2\u026f\u0270\7\23"+
		"\2\2\u0270M\3\2\2\2\u0271\u0272\5.\30\2\u0272\u0273\7\33\2\2\u0273\u0274"+
		"\5.\30\2\u0274\u0280\3\2\2\2\u0275\u0276\5\u00c8e\2\u0276\u0277\7\33\2"+
		"\2\u0277\u0278\5\u00c8e\2\u0278\u0280\3\2\2\2\u0279\u027a\5\u00c8e\2\u027a"+
		"\u027b\7\33\2\2\u027b\u027c\5\u00c8e\2\u027c\u027d\7\13\2\2\u027d\u027e"+
		"\5P)\2\u027e\u0280\3\2\2\2\u027f\u0271\3\2\2\2\u027f\u0275\3\2\2\2\u027f"+
		"\u0279\3\2\2\2\u0280O\3\2\2\2\u0281\u0282\5\6\4\2\u0282Q\3\2\2\2\u0283"+
		"\u0284\7\u0080\2\2\u0284\u0287\5T+\2\u0285\u0287\5T+\2\u0286\u0283\3\2"+
		"\2\2\u0286\u0285\3\2\2\2\u0287S\3\2\2\2\u0288\u028f\5Z.\2\u0289\u028f"+
		"\5b\62\2\u028a\u028f\5p9\2\u028b\u028f\5t;\2\u028c\u028f\5v<\2\u028d\u028f"+
		"\5X-\2\u028e\u0288\3\2\2\2\u028e\u0289\3\2\2\2\u028e\u028a\3\2\2\2\u028e"+
		"\u028b\3\2\2\2\u028e\u028c\3\2\2\2\u028e\u028d\3\2\2\2\u028fU\3\2\2\2"+
		"\u0290\u0291\7\u009c\2\2\u0291\u0294\7\22\2\2\u0292\u0295\5\6\4\2\u0293"+
		"\u0295\5\60\31\2\u0294\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295\u0296\3"+
		"\2\2\2\u0296\u0297\7\23\2\2\u0297W\3\2\2\2\u0298\u0299\7\u0098\2\2\u0299"+
		"\u029d\7\24\2\2\u029a\u029e\5.\30\2\u029b\u029e\5\6\4\2\u029c\u029e\5"+
		"\u00c8e\2\u029d\u029a\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029c\3\2\2\2"+
		"\u029e\u029f\3\2\2\2\u029f\u02a0\7\26\2\2\u02a0\u02a1\7~\2\2\u02a1\u02a2"+
		"\5\b\5\2\u02a2\u02a3\7\u0099\2\2\u02a3Y\3\2\2\2\u02a4\u02a5\7k\2\2\u02a5"+
		"\u02a6\7\24\2\2\u02a6\u02a7\5\\/\2\u02a7\u02a8\7\26\2\2\u02a8\u02a9\7"+
		"~\2\2\u02a9\u02aa\5`\61\2\u02aa\u02b3\3\2\2\2\u02ab\u02ac\7k\2\2\u02ac"+
		"\u02ad\7\25\2\2\u02ad\u02ae\5\\/\2\u02ae\u02af\7\27\2\2\u02af\u02b0\7"+
		"~\2\2\u02b0\u02b1\5`\61\2\u02b1\u02b3\3\2\2\2\u02b2\u02a4\3\2\2\2\u02b2"+
		"\u02ab\3\2\2\2\u02b3[\3\2\2\2\u02b4\u02b9\5^\60\2\u02b5\u02b6\7\t\2\2"+
		"\u02b6\u02b8\5^\60\2\u02b7\u02b5\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7"+
		"\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba]\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc"+
		"\u02bd\5\b\5\2\u02bd\u02be\5J&\2\u02be_\3\2\2\2\u02bf\u02c0\5\b\5\2\u02c0"+
		"\u02c1\5H%\2\u02c1a\3\2\2\2\u02c2\u02c4\7\u0083\2\2\u02c3\u02c5\5d\63"+
		"\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c8"+
		"\7\n\2\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02ca\7s\2\2\u02cac\3\2\2\2\u02cb\u02ce\5f\64\2\u02cc\u02cd\7\n\2\2\u02cd"+
		"\u02cf\5j\66\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d2\3\2"+
		"\2\2\u02d0\u02d2\5j\66\2\u02d1\u02cb\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2"+
		"e\3\2\2\2\u02d3\u02d8\5h\65\2\u02d4\u02d5\7\n\2\2\u02d5\u02d7\5h\65\2"+
		"\u02d6\u02d4\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9"+
		"\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dd\7\n\2\2\u02dc"+
		"\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02ddg\3\2\2\2\u02de\u02df\5\u00b6"+
		"\\\2\u02df\u02e0\7\13\2\2\u02e0\u02e1\5\b\5\2\u02e1\u02e3\5H%\2\u02e2"+
		"\u02e4\5\u00a0Q\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4i\3\2\2"+
		"\2\u02e5\u02e6\7m\2\2\u02e6\u02e7\5l\67\2\u02e7\u02e8\7~\2\2\u02e8\u02ed"+
		"\5n8\2\u02e9\u02ea\7\n\2\2\u02ea\u02ec\5n8\2\u02eb\u02e9\3\2\2\2\u02ec"+
		"\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f9\3\2"+
		"\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f2\7\n\2\2\u02f1\u02f0\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\7\u0094\2\2\u02f4\u02f6"+
		"\7\22\2\2\u02f5\u02f7\5d\63\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2"+
		"\u02f7\u02f8\3\2\2\2\u02f8\u02fa\7\23\2\2\u02f9\u02f1\3\2\2\2\u02f9\u02fa"+
		"\3\2\2\2\u02fak\3\2\2\2\u02fb\u02fc\5\6\4\2\u02fc\u02fd\7\13\2\2\u02fd"+
		"\u02ff\3\2\2\2\u02fe\u02fb\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2"+
		"\2\2\u0300\u0301\5\b\5\2\u0301\u0302\5P)\2\u0302\u0305\3\2\2\2\u0303\u0305"+
		"\5P)\2\u0304\u02fe\3\2\2\2\u0304\u0303\3\2\2\2\u0305m\3\2\2\2\u0306\u0307"+
		"\5\u00b8]\2\u0307\u0308\7\13\2\2\u0308\u030a\7\22\2\2\u0309\u030b\5d\63"+
		"\2\u030a\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d"+
		"\7\23\2\2\u030do\3\2\2\2\u030e\u030f\7\u0085\2\2\u030f\u0310\7~\2\2\u0310"+
		"\u0311\5\b\5\2\u0311\u0312\5r:\2\u0312q\3\2\2\2\u0313\u0314\5J&\2\u0314"+
		"s\3\2\2\2\u0315\u0316\7t\2\2\u0316\u0317\7~\2\2\u0317\u0318\5\b\5\2\u0318"+
		"\u0319\5H%\2\u0319u\3\2\2\2\u031a\u031b\5\b\5\2\u031b\u031c\7\u009d\2"+
		"\2\u031cw\3\2\2\2\u031d\u031e\5\b\5\2\u031e\u031f\7\30\2\2\u031f\u0320"+
		"\5\b\5\2\u0320\u0321\5H%\2\u0321y\3\2\2\2\u0322\u0323\5~@\2\u0323\u0324"+
		"\7\22\2\2\u0324\u0329\5|?\2\u0325\u0326\7\n\2\2\u0326\u0328\5|?\2\u0327"+
		"\u0325\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2"+
		"\2\2\u032a\u032c\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032d\7\23\2\2\u032d"+
		"\u032e\7\f\2\2\u032e\u032f\5\b\5\2\u032f\u0330\5H%\2\u0330{\3\2\2\2\u0331"+
		"\u0336\5\6\4\2\u0332\u0333\7\t\2\2\u0333\u0335\5\6\4\2\u0334\u0332\3\2"+
		"\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337"+
		"\u0339\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033a\7\13\2\2\u033a\u033b\5"+
		"\b\5\2\u033b\u033c\5H%\2\u033c}\3\2\2\2\u033d\u0340\5\6\4\2\u033e\u0340"+
		"\7\u009c\2\2\u033f\u033d\3\2\2\2\u033f\u033e\3\2\2\2\u0340\177\3\2\2\2"+
		"\u0341\u0342\5~@\2\u0342\u0343\7\22\2\2\u0343\u0348\5\u0082B\2\u0344\u0345"+
		"\7\n\2\2\u0345\u0347\5\u0082B\2\u0346\u0344\3\2\2\2\u0347\u034a\3\2\2"+
		"\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034b\3\2\2\2\u034a\u0348"+
		"\3\2\2\2\u034b\u034c\7\23\2\2\u034c\u0081\3\2\2\2\u034d\u0352\5\u00c8"+
		"e\2\u034e\u034f\7\t\2\2\u034f\u0351\5\u00c8e\2\u0350\u034e\3\2\2\2\u0351"+
		"\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0083\3\2"+
		"\2\2\u0354\u0352\3\2\2\2\u0355\u035b\5\u0086D\2\u0356\u035b\5\u008cG\2"+
		"\u0357\u035b\5\u0094K\2\u0358\u035b\5\u0096L\2\u0359\u035b\5\u009aN\2"+
		"\u035a\u0355\3\2\2\2\u035a\u0356\3\2\2\2\u035a\u0357\3\2\2\2\u035a\u0358"+
		"\3\2\2\2\u035a\u0359\3\2\2\2\u035b\u0085\3\2\2\2\u035c\u035e\5\u0088E"+
		"\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u036d"+
		"\7\24\2\2\u0360\u0361\5\u008eH\2\u0361\u0362\7\13\2\2\u0362\u036a\5\u008a"+
		"F\2\u0363\u0364\7\n\2\2\u0364\u0365\5\u008eH\2\u0365\u0366\7\13\2\2\u0366"+
		"\u0367\5\u008aF\2\u0367\u0369\3\2\2\2\u0368\u0363\3\2\2\2\u0369\u036c"+
		"\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036e\3\2\2\2\u036c"+
		"\u036a\3\2\2\2\u036d\u0360\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0377\3\2"+
		"\2\2\u036f\u0371\7\n\2\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"\u0372\3\2\2\2\u0372\u0373\7\u0094\2\2\u0373\u0375\5\u008aF\2\u0374\u0376"+
		"\7\n\2\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377"+
		"\u0370\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u0399\7\26"+
		"\2\2\u037a\u037c\5\u0088E\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u038b\7\24\2\2\u037e\u037f\5\u008eH\2\u037f\u0380"+
		"\7\13\2\2\u0380\u0388\5\u0086D\2\u0381\u0382\7\n\2\2\u0382\u0383\5\u008e"+
		"H\2\u0383\u0384\7\13\2\2\u0384\u0385\5\u0086D\2\u0385\u0387\3\2\2\2\u0386"+
		"\u0381\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2"+
		"\2\2\u0389\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038b\u037e\3\2\2\2\u038b"+
		"\u038c\3\2\2\2\u038c\u0395\3\2\2\2\u038d\u038f\7\n\2\2\u038e\u038d\3\2"+
		"\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\7\u0094\2\2\u0391"+
		"\u0393\5\u0086D\2\u0392\u0394\7\n\2\2\u0393\u0392\3\2\2\2\u0393\u0394"+
		"\3\2\2\2\u0394\u0396\3\2\2\2\u0395\u038e\3\2\2\2\u0395\u0396\3\2\2\2\u0396"+
		"\u0397\3\2\2\2\u0397\u0399\7\26\2\2\u0398\u035d\3\2\2\2\u0398\u037b\3"+
		"\2\2\2\u0399\u0087\3\2\2\2\u039a\u039b\5\6\4\2\u039b\u0089\3\2\2\2\u039c"+
		"\u039d\5\u00c8e\2\u039d\u008b\3\2\2\2\u039e\u03a0\5\u0088E\2\u039f\u039e"+
		"\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03af\7\24\2\2"+
		"\u03a2\u03a3\5\u008eH\2\u03a3\u03a4\7\13\2\2\u03a4\u03ac\5\u008aF\2\u03a5"+
		"\u03a6\7\n\2\2\u03a6\u03a7\5\u008eH\2\u03a7\u03a8\7\13\2\2\u03a8\u03a9"+
		"\5\u008aF\2\u03a9\u03ab\3\2\2\2\u03aa\u03a5\3\2\2\2\u03ab\u03ae\3\2\2"+
		"\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac"+
		"\3\2\2\2\u03af\u03a2\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03cc\3\2\2\2\u03b1"+
		"\u03b3\7\n\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3\2"+
		"\2\2\u03b4\u03b8\7m\2\2\u03b5\u03b6\5\6\4\2\u03b6\u03b7\7\13\2\2\u03b7"+
		"\u03b9\3\2\2\2\u03b8\u03b5\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03ba\3\2"+
		"\2\2\u03ba\u03bb\5\u0092J\2\u03bb\u03bc\7~\2\2\u03bc\u03bd\7\24\2\2\u03bd"+
		"\u03be\5\u008eH\2\u03be\u03bf\7\13\2\2\u03bf\u03c7\5\u008aF\2\u03c0\u03c1"+
		"\7\n\2\2\u03c1\u03c2\5\u008eH\2\u03c2\u03c3\7\13\2\2\u03c3\u03c4\5\u008a"+
		"F\2\u03c4\u03c6\3\2\2\2\u03c5\u03c0\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7"+
		"\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03c7\3\2"+
		"\2\2\u03ca\u03cb\7\26\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03b2\3\2\2\2\u03cc"+
		"\u03cd\3\2\2\2\u03cd\u03d6\3\2\2\2\u03ce\u03d0\7\n\2\2\u03cf\u03ce\3\2"+
		"\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d2\7\u0094\2\2\u03d2"+
		"\u03d4\7\u009f\2\2\u03d3\u03d5\7\n\2\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5"+
		"\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03cf\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7"+
		"\u03d8\3\2\2\2\u03d8\u0415\7\26\2\2\u03d9\u03db\5\u0088E\2\u03da\u03d9"+
		"\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03ea\7\24\2\2"+
		"\u03dd\u03de\5\u008eH\2\u03de\u03df\7\13\2\2\u03df\u03e7\5\u008cG\2\u03e0"+
		"\u03e1\7\n\2\2\u03e1\u03e2\5\u008eH\2\u03e2\u03e3\7\13\2\2\u03e3\u03e4"+
		"\5\u008cG\2\u03e4\u03e6\3\2\2\2\u03e5\u03e0\3\2\2\2\u03e6\u03e9\3\2\2"+
		"\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7"+
		"\3\2\2\2\u03ea\u03dd\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u0407\3\2\2\2\u03ec"+
		"\u03ee\7\n\2\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3\2"+
		"\2\2\u03ef\u03f3\7m\2\2\u03f0\u03f1\5\6\4\2\u03f1\u03f2\7\13\2\2\u03f2"+
		"\u03f4\3\2\2\2\u03f3\u03f0\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2"+
		"\2\2\u03f5\u03f6\5\u0092J\2\u03f6\u03f7\7~\2\2\u03f7\u03f8\7\24\2\2\u03f8"+
		"\u03f9\5\u008eH\2\u03f9\u03fa\7\13\2\2\u03fa\u0402\5\u008cG\2\u03fb\u03fc"+
		"\7\n\2\2\u03fc\u03fd\5\u008eH\2\u03fd\u03fe\7\13\2\2\u03fe\u03ff\5\u008c"+
		"G\2\u03ff\u0401\3\2\2\2\u0400\u03fb\3\2\2\2\u0401\u0404\3\2\2\2\u0402"+
		"\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\3\2\2\2\u0404\u0402\3\2"+
		"\2\2\u0405\u0406\7\26\2\2\u0406\u0408\3\2\2\2\u0407\u03ed\3\2\2\2\u0407"+
		"\u0408\3\2\2\2\u0408\u0411\3\2\2\2\u0409\u040b\7\n\2\2\u040a\u0409\3\2"+
		"\2\2\u040a\u040b\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\7\u0094\2\2\u040d"+
		"\u040f\7\u009f\2\2\u040e\u0410\7\n\2\2\u040f\u040e\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410\u0412\3\2\2\2\u0411\u040a\3\2\2\2\u0411\u0412\3\2\2\2\u0412"+
		"\u0413\3\2\2\2\u0413\u0415\7\26\2\2\u0414\u039f\3\2\2\2\u0414\u03da\3"+
		"\2\2\2\u0415\u008d\3\2\2\2\u0416\u041b\5\u0090I\2\u0417\u0418\7\t\2\2"+
		"\u0418\u041a\5\u0090I\2\u0419\u0417\3\2\2\2\u041a\u041d\3\2\2\2\u041b"+
		"\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u008f\3\2\2\2\u041d\u041b\3\2"+
		"\2\2\u041e\u0422\5\6\4\2\u041f\u0422\7\u00a6\2\2\u0420\u0422\5N(\2\u0421"+
		"\u041e\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0420\3\2\2\2\u0422\u0091\3\2"+
		"\2\2\u0423\u0424\5\u00c8e\2\u0424\u0093\3\2\2\2\u0425\u0427\5\u0088E\2"+
		"\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0431"+
		"\7\24\2\2\u0429\u042e\5\u008aF\2\u042a\u042b\7\n\2\2\u042b\u042d\5\u008a"+
		"F\2\u042c\u042a\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042e"+
		"\u042f\3\2\2\2\u042f\u0432\3\2\2\2\u0430\u042e\3\2\2\2\u0431\u0429\3\2"+
		"\2\2\u0431\u0432\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434\7\26\2\2\u0434"+
		"\u0095\3\2\2\2\u0435\u0437\5\u0088E\2\u0436\u0435\3\2\2\2\u0436\u0437"+
		"\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0441\7\22\2\2\u0439\u043e\5\u0098"+
		"M\2\u043a\u043b\7\t\2\2\u043b\u043d\5\u0098M\2\u043c\u043a\3\2\2\2\u043d"+
		"\u0440\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0442\3\2"+
		"\2\2\u0440\u043e\3\2\2\2\u0441\u0439\3\2\2\2\u0441\u0442\3\2\2\2\u0442"+
		"\u0448\3\2\2\2\u0443\u0445\7\n\2\2\u0444\u0443\3\2\2\2\u0444\u0445\3\2"+
		"\2\2\u0445\u0446\3\2\2\2\u0446\u0447\7\u0084\2\2\u0447\u0449\5\u0098M"+
		"\2\u0448\u0444\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u0462"+
		"\7\23\2\2\u044b\u044d\5\u0088E\2\u044c\u044b\3\2\2\2\u044c\u044d\3\2\2"+
		"\2\u044d\u044e\3\2\2\2\u044e\u0457\7\22\2\2\u044f\u0454\5\u0096L\2\u0450"+
		"\u0451\7\t\2\2\u0451\u0453\5\u0096L\2\u0452\u0450\3\2\2\2\u0453\u0456"+
		"\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0458\3\2\2\2\u0456"+
		"\u0454\3\2\2\2\u0457\u044f\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u045e\3\2"+
		"\2\2\u0459\u045b\7\n\2\2\u045a\u0459\3\2\2\2\u045a\u045b\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u045d\7\u0084\2\2\u045d\u045f\5\u0096L\2\u045e\u045a"+
		"\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460\3\2\2\2\u0460\u0462\7\23\2\2"+
		"\u0461\u0436\3\2\2\2\u0461\u044c\3\2\2\2\u0462\u0097\3\2\2\2\u0463\u0464"+
		"\7\u00a6\2\2\u0464\u0466\7~\2\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2"+
		"\2\u0466\u0467\3\2\2\2\u0467\u0468\5\u00c8e\2\u0468\u0099\3\2\2\2\u0469"+
		"\u046b\5\u0088E\2\u046a\u0469\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046c"+
		"\3\2\2\2\u046c\u0475\7\22\2\2\u046d\u0472\5\u0098M\2\u046e\u046f\7\t\2"+
		"\2\u046f\u0471\5\u0098M\2\u0470\u046e\3\2\2\2\u0471\u0474\3\2\2\2\u0472"+
		"\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2"+
		"\2\2\u0475\u046d\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0484\3\2\2\2\u0477"+
		"\u0479\7\n\2\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\3\2"+
		"\2\2\u047a\u047b\5\u0092J\2\u047b\u047c\7\t\2\2\u047c\u0481\5\u0098M\2"+
		"\u047d\u047e\7\n\2\2\u047e\u0480\5\u0098M\2\u047f\u047d\3\2\2\2\u0480"+
		"\u0483\3\2\2\2\u0481\u047f\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0485\3\2"+
		"\2\2\u0483\u0481\3\2\2\2\u0484\u0478\3\2\2\2\u0484\u0485\3\2\2\2\u0485"+
		"\u0486\3\2\2\2\u0486\u04a6\7\23\2\2\u0487\u0489\5\u0088E\2\u0488\u0487"+
		"\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u0493\7\22\2\2"+
		"\u048b\u0490\5\u009aN\2\u048c\u048d\7\t\2\2\u048d\u048f\5\u009aN\2\u048e"+
		"\u048c\3\2\2\2\u048f\u0492\3\2\2\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2"+
		"\2\2\u0491\u0494\3\2\2\2\u0492\u0490\3\2\2\2\u0493\u048b\3\2\2\2\u0493"+
		"\u0494\3\2\2\2\u0494\u04a2\3\2\2\2\u0495\u0497\7\n\2\2\u0496\u0495\3\2"+
		"\2\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0499\5\u0092J\2\u0499"+
		"\u049a\7\t\2\2\u049a\u049f\5\u009aN\2\u049b\u049c\7\n\2\2\u049c\u049e"+
		"\5\u009aN\2\u049d\u049b\3\2\2\2\u049e\u04a1\3\2\2\2\u049f\u049d\3\2\2"+
		"\2\u049f\u04a0\3\2\2\2\u04a0\u04a3\3\2\2\2\u04a1\u049f\3\2\2\2\u04a2\u0496"+
		"\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a6\7\23\2\2"+
		"\u04a5\u046a\3\2\2\2\u04a5\u0488\3\2\2\2\u04a6\u009b\3\2\2\2\u04a7\u04a8"+
		"\5\20\t\2\u04a8\u04ad\7\u008a\2\2\u04a9\u04aa\5\u009eP\2\u04aa\u04ab\7"+
		"\n\2\2\u04ab\u04ae\3\2\2\2\u04ac\u04ae\5\u011a\u008e\2\u04ad\u04a9\3\2"+
		"\2\2\u04ad\u04ac\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04ad\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u009d\3\2\2\2\u04b1\u04b2\5\u00b6\\\2\u04b2\u04b3"+
		"\7\13\2\2\u04b3\u04b4\5\b\5\2\u04b4\u04b6\5H%\2\u04b5\u04b7\5\u00a0Q\2"+
		"\u04b6\u04b5\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u009f\3\2\2\2\u04b8\u04bb"+
		"\5\u00a2R\2\u04b9\u04bb\5\u00a4S\2\u04ba\u04b8\3\2\2\2\u04ba\u04b9\3\2"+
		"\2\2\u04bb\u00a1\3\2\2\2\u04bc\u04bd\7\u0097\2\2\u04bd\u04c7\5\6\4\2\u04be"+
		"\u04bf\7\u0097\2\2\u04bf\u04c7\5\u00d4k\2\u04c0\u04c1\7\u0097\2\2\u04c1"+
		"\u04c7\7\u009f\2\2\u04c2\u04c3\7\u0097\2\2\u04c3\u04c7\5\u0084C\2\u04c4"+
		"\u04c5\7\u0097\2\2\u04c5\u04c7\5\u00c8e\2\u04c6\u04bc\3\2\2\2\u04c6\u04be"+
		"\3\2\2\2\u04c6\u04c0\3\2\2\2\u04c6\u04c2\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c7"+
		"\u00a3\3\2\2\2\u04c8\u04c9\7\b\2\2\u04c9\u04d3\5\6\4\2\u04ca\u04cb\7\b"+
		"\2\2\u04cb\u04d3\5\u00d4k\2\u04cc\u04cd\7\b\2\2\u04cd\u04d3\7\u009f\2"+
		"\2\u04ce\u04cf\7\b\2\2\u04cf\u04d3\5\u0084C\2\u04d0\u04d1\7\b\2\2\u04d1"+
		"\u04d3\5\u00c8e\2\u04d2\u04c8\3\2\2\2\u04d2\u04ca\3\2\2\2\u04d2\u04cc"+
		"\3\2\2\2\u04d2\u04ce\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d3\u00a5\3\2\2\2\u04d4"+
		"\u04d5\7\u0087\2\2\u04d5\u04d6\7l\2\2\u04d6\u04d9\7p\2\2\u04d7\u04da\5"+
		"\u00fa~\2\u04d8\u04da\5\u00be`\2\u04d9\u04d7\3\2\2\2\u04d9\u04d8\3\2\2"+
		"\2\u04da\u04db\3\2\2\2\u04db\u04dc\7\n\2\2\u04dc\u04dd\7\u0087\2\2\u04dd"+
		"\u04de\7s\2\2\u04de\u04e1\7p\2\2\u04df\u04e2\5\u00fa~\2\u04e0\u04e2\5"+
		"\u00be`\2\u04e1\u04df\3\2\2\2\u04e1\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2"+
		"\u04e3\u04e4\7\n\2\2\u04e4\u04f8\3\2\2\2\u04e5\u04e6\7\u0087\2\2\u04e6"+
		"\u04e7\7l\2\2\u04e7\u04ea\7p\2\2\u04e8\u04eb\5\u00fa~\2\u04e9\u04eb\5"+
		"\u00be`\2\u04ea\u04e8\3\2\2\2\u04ea\u04e9\3\2\2\2\u04eb\u04ec\3\2\2\2"+
		"\u04ec\u04ed\7\n\2\2\u04ed\u04f8\3\2\2\2\u04ee\u04ef\7\u0087\2\2\u04ef"+
		"\u04f0\7s\2\2\u04f0\u04f3\7p\2\2\u04f1\u04f4\5\u00fa~\2\u04f2\u04f4\5"+
		"\u00be`\2\u04f3\u04f1\3\2\2\2\u04f3\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2"+
		"\u04f5\u04f6\7\n\2\2\u04f6\u04f8\3\2\2\2\u04f7\u04d4\3\2\2\2\u04f7\u04e5"+
		"\3\2\2\2\u04f7\u04ee\3\2\2\2\u04f8\u00a7\3\2\2\2\u04f9\u04fa\5\b\5\2\u04fa"+
		"\u0500\5\u00aaV\2\u04fb\u0501\5 \21\2\u04fc\u0501\7c\2\2\u04fd\u0501\7"+
		"b\2\2\u04fe\u0501\7d\2\2\u04ff\u0501\7e\2\2\u0500\u04fb\3\2\2\2\u0500"+
		"\u04fc\3\2\2\2\u0500\u04fd\3\2\2\2\u0500\u04fe\3\2\2\2\u0500\u04ff\3\2"+
		"\2\2\u0501\u0502\3\2\2\2\u0502\u0503\7\n\2\2\u0503\u00a9\3\2\2\2\u0504"+
		"\u0507\5\u00acW\2\u0505\u0507\5\u00ba^\2\u0506\u0504\3\2\2\2\u0506\u0505"+
		"\3\2\2\2\u0507\u00ab\3\2\2\2\u0508\u0509\7\u0081\2\2\u0509\u050b\5\6\4"+
		"\2\u050a\u050c\5\u00aeX\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c"+
		"\u050d\3\2\2\2\u050d\u050e\7\n\2\2\u050e\u00ad\3\2\2\2\u050f\u0511\7\22"+
		"\2\2\u0510\u0512\5\u00dep\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512"+
		"\u0513\3\2\2\2\u0513\u051b\5\u00b0Y\2\u0514\u0516\7\n\2\2\u0515\u0517"+
		"\5\u00dep\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518\3\2\2"+
		"\2\u0518\u051a\5\u00b0Y\2\u0519\u0514\3\2\2\2\u051a\u051d\3\2\2\2\u051b"+
		"\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2\2\2\u051d\u051b\3\2"+
		"\2\2\u051e\u051f\7\23\2\2\u051f\u00af\3\2\2\2\u0520\u0537\5\u00b2Z\2\u0521"+
		"\u0522\7\u008a\2\2\u0522\u0537\5\u00b2Z\2\u0523\u0524\5\b\5\2\u0524\u0525"+
		"\7v\2\2\u0525\u0527\5\6\4\2\u0526\u0528\5\u00aeX\2\u0527\u0526\3\2\2\2"+
		"\u0527\u0528\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\7\13\2\2\u052a\u052b"+
		"\5\b\5\2\u052b\u052c\5\u00bc_\2\u052c\u052d\5\u00b4[\2\u052d\u0537\3\2"+
		"\2\2\u052e\u052f\5\b\5\2\u052f\u0530\7\u0081\2\2\u0530\u0532\5\6\4\2\u0531"+
		"\u0533\5\u00aeX\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534"+
		"\3\2\2\2\u0534\u0535\5\u00b4[\2\u0535\u0537\3\2\2\2\u0536\u0520\3\2\2"+
		"\2\u0536\u0521\3\2\2\2\u0536\u0523\3\2\2\2\u0536\u052e\3\2\2\2\u0537\u00b1"+
		"\3\2\2\2\u0538\u0539\5\u00b6\\\2\u0539\u053a\7\13\2\2\u053a\u053b\5\b"+
		"\5\2\u053b\u053c\5H%\2\u053c\u053d\5\u00b4[\2\u053d\u00b3\3\2\2\2\u053e"+
		"\u0540\7\b\2\2\u053f\u0541\5\u00dep\2\u0540\u053f\3\2\2\2\u0540\u0541"+
		"\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0544\5\u00c8e\2\u0543\u053e\3\2\2"+
		"\2\u0543\u0544\3\2\2\2\u0544\u00b5\3\2\2\2\u0545\u054a\5\6\4\2\u0546\u0547"+
		"\7\t\2\2\u0547\u0549\5\6\4\2\u0548\u0546\3\2\2\2\u0549\u054c\3\2\2\2\u054a"+
		"\u0548\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u00b7\3\2\2\2\u054c\u054a\3\2"+
		"\2\2\u054d\u0552\5.\30\2\u054e\u054f\t\7\2\2\u054f\u0551\5.\30\2\u0550"+
		"\u054e\3\2\2\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2\2\2\u0552\u0553\3\2"+
		"\2\2\u0553\u055e\3\2\2\2\u0554\u0552\3\2\2\2\u0555\u055a\5\u00dan\2\u0556"+
		"\u0557\t\7\2\2\u0557\u0559\5\u00dan\2\u0558\u0556\3\2\2\2\u0559\u055c"+
		"\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055e\3\2\2\2\u055c"+
		"\u055a\3\2\2\2\u055d\u054d\3\2\2\2\u055d\u0555\3\2\2\2\u055e\u00b9\3\2"+
		"\2\2\u055f\u0560\7v\2\2\u0560\u0562\5\6\4\2\u0561\u0563\5\u00aeX\2\u0562"+
		"\u0561\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0565\7\13"+
		"\2\2\u0565\u0566\5\b\5\2\u0566\u0567\5\u00bc_\2\u0567\u0568\7\n\2\2\u0568"+
		"\u00bb\3\2\2\2\u0569\u056a\5P)\2\u056a\u00bd\3\2\2\2\u056b\u056c\5$\23"+
		"\2\u056c\u056d\7\13\2\2\u056d\u056e\5\u00c0a\2\u056e\u0571\3\2\2\2\u056f"+
		"\u0571\5\u00c0a\2\u0570\u056b\3\2\2\2\u0570\u056f\3\2\2\2\u0571\u00bf"+
		"\3\2\2\2\u0572\u0575\5\u00c2b\2\u0573\u0575\5\u00f8}\2\u0574\u0572\3\2"+
		"\2\2\u0574\u0573\3\2\2\2\u0575\u00c1\3\2\2\2\u0576\u057f\5\u00c4c\2\u0577"+
		"\u057f\5\u00e6t\2\u0578\u057f\5\u00ecw\2\u0579\u057f\5\u00eex\2\u057a"+
		"\u057f\5\u00f0y\2\u057b\u057f\5\u00f2z\2\u057c\u057f\5\32\16\2\u057d\u057f"+
		"\5\u00f6|\2\u057e\u0576\3\2\2\2\u057e\u0577\3\2\2\2\u057e\u0578\3\2\2"+
		"\2\u057e\u0579\3\2\2\2\u057e\u057a\3\2\2\2\u057e\u057b\3\2\2\2\u057e\u057c"+
		"\3\2\2\2\u057e\u057d\3\2\2\2\u057f\u00c3\3\2\2\2\u0580\u0581\5\u00c6d"+
		"\2\u0581\u0582\7\b\2\2\u0582\u0583\5\u00c8e\2\u0583\u00c5\3\2\2\2\u0584"+
		"\u0585\7\31\2\2\u0585\u0588\5\6\4\2\u0586\u0588\5\6\4\2\u0587\u0584\3"+
		"\2\2\2\u0587\u0586\3\2\2\2\u0588\u05a4\3\2\2\2\u0589\u058a\7\24\2\2\u058a"+
		"\u058f\5\u00c8e\2\u058b\u058c\7\t\2\2\u058c\u058e\5\u00c8e\2\u058d\u058b"+
		"\3\2\2\2\u058e\u0591\3\2\2\2\u058f\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590"+
		"\u0592\3\2\2\2\u0591\u058f\3\2\2\2\u0592\u0593\7\26\2\2\u0593\u05a3\3"+
		"\2\2\2\u0594\u0595\7\25\2\2\u0595\u059a\5\u00c8e\2\u0596\u0597\7\t\2\2"+
		"\u0597\u0599\5\u00c8e\2\u0598\u0596\3\2\2\2\u0599\u059c\3\2\2\2\u059a"+
		"\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059d\3\2\2\2\u059c\u059a\3\2"+
		"\2\2\u059d\u059e\7\27\2\2\u059e\u05a3\3\2\2\2\u059f\u05a0\7\32\2\2\u05a0"+
		"\u05a3\5\6\4\2\u05a1\u05a3\7\30\2\2\u05a2\u0589\3\2\2\2\u05a2\u0594\3"+
		"\2\2\2\u05a2\u059f\3\2\2\2\u05a2\u05a1\3\2\2\2\u05a3\u05a6\3\2\2\2\u05a4"+
		"\u05a2\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05b2\3\2\2\2\u05a6\u05a4\3\2"+
		"\2\2\u05a7\u05a8\7\13\2\2\u05a8\u05a9\7\13\2\2\u05a9\u05af\5\6\4\2\u05aa"+
		"\u05ab\7\32\2\2\u05ab\u05ae\5\6\4\2\u05ac\u05ae\7\30\2\2\u05ad\u05aa\3"+
		"\2\2\2\u05ad\u05ac\3\2\2\2\u05ae\u05b1\3\2\2\2\u05af\u05ad\3\2\2\2\u05af"+
		"\u05b0\3\2\2\2\u05b0\u05b3\3\2\2\2\u05b1\u05af\3\2\2\2\u05b2\u05a7\3\2"+
		"\2\2\u05b2\u05b3\3\2\2\2\u05b3\u00c7\3\2\2\2\u05b4\u05b8\5\u00ccg\2\u05b5"+
		"\u05b6\5\u00caf\2\u05b6\u05b7\5\u00c8e\2\u05b7\u05b9\3\2\2\2\u05b8\u05b5"+
		"\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05c5\3\2\2\2\u05ba\u05bb\7\13\2\2"+
		"\u05bb\u05bc\7\13\2\2\u05bc\u05c2\5\6\4\2\u05bd\u05be\7\32\2\2\u05be\u05c1"+
		"\5\6\4\2\u05bf\u05c1\7\30\2\2\u05c0\u05bd\3\2\2\2\u05c0\u05bf\3\2\2\2"+
		"\u05c1\u05c4\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c6"+
		"\3\2\2\2\u05c4\u05c2\3\2\2\2\u05c5\u05ba\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6"+
		"\u00c9\3\2\2\2\u05c7\u05d1\7\f\2\2\u05c8\u05d1\7\r\2\2\u05c9\u05d1\7\16"+
		"\2\2\u05ca\u05d1\7\17\2\2\u05cb\u05d1\7\20\2\2\u05cc\u05d1\7\21\2\2\u05cd"+
		"\u05d1\7y\2\2\u05ce\u05cf\7}\2\2\u05cf\u05d1\7y\2\2\u05d0\u05c7\3\2\2"+
		"\2\u05d0\u05c8\3\2\2\2\u05d0\u05c9\3\2\2\2\u05d0\u05ca\3\2\2\2\u05d0\u05cb"+
		"\3\2\2\2\u05d0\u05cc\3\2\2\2\u05d0\u05cd\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d1"+
		"\u00cb\3\2\2\2\u05d2\u05d6\5\u00d0i\2\u05d3\u05d4\5\u00ceh\2\u05d4\u05d5"+
		"\5\u00ccg\2\u05d5\u05d7\3\2\2\2\u05d6\u05d3\3\2\2\2\u05d6\u05d7\3\2\2"+
		"\2\u05d7\u00cd\3\2\2\2\u05d8\u05d9\t\b\2\2\u05d9\u00cf\3\2\2\2\u05da\u05de"+
		"\5\u00d4k\2\u05db\u05dc\5\u00d2j\2\u05dc\u05dd\5\u00d0i\2\u05dd\u05df"+
		"\3\2\2\2\u05de\u05db\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u00d1\3\2\2\2\u05e0"+
		"\u05e1\t\t\2\2\u05e1\u00d3\3\2\2\2\u05e2\u05e4\t\5\2\2\u05e3\u05e2\3\2"+
		"\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\5\u00d6l\2\u05e6"+
		"\u00d5\3\2\2\2\u05e7\u05f7\5\u00c6d\2\u05e8\u05e9\7\22\2\2\u05e9\u05ea"+
		"\5\u00c8e\2\u05ea\u05eb\7\23\2\2\u05eb\u05f7\3\2\2\2\u05ec\u05f7\5\u00da"+
		"n\2\u05ed\u05f7\5\u00d8m\2\u05ee\u05f7\5\u00e0q\2\u05ef\u05f0\5\6\4\2"+
		"\u05f0\u05f1\5\u00e0q\2\u05f1\u05f7\3\2\2\2\u05f2\u05f3\7}\2\2\u05f3\u05f7"+
		"\5\u00d6l\2\u05f4\u05f7\58\35\2\u05f5\u05f7\5\32\16\2\u05f6\u05e7\3\2"+
		"\2\2\u05f6\u05e8\3\2\2\2\u05f6\u05ec\3\2\2\2\u05f6\u05ed\3\2\2\2\u05f6"+
		"\u05ee\3\2\2\2\u05f6\u05ef\3\2\2\2\u05f6\u05f2\3\2\2\2\u05f6\u05f4\3\2"+
		"\2\2\u05f6\u05f5\3\2\2\2\u05f7\u00d7\3\2\2\2\u05f8\u05fe\5\60\31\2\u05f9"+
		"\u05fe\5,\27\2\u05fa\u05fe\5:\36\2\u05fb\u05fe\7|\2\2\u05fc\u05fe\7\u009f"+
		"\2\2\u05fd\u05f8\3\2\2\2\u05fd\u05f9\3\2\2\2\u05fd\u05fa\3\2\2\2\u05fd"+
		"\u05fb\3\2\2\2\u05fd\u05fc\3\2\2\2\u05fe\u00d9\3\2\2\2\u05ff\u0600\5\6"+
		"\4\2\u0600\u0601\7\22\2\2\u0601\u0602\5\u00dco\2\u0602\u0603\7\23\2\2"+
		"\u0603\u00db\3\2\2\2\u0604\u0606\5\u00dep\2\u0605\u0604\3\2\2\2\u0605"+
		"\u0606\3\2\2\2\u0606\u0608\3\2\2\2\u0607\u0609\5\u00e8u\2\u0608\u0607"+
		"\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u0613\3\2\2\2\u060a\u060c\7\t\2\2\u060b"+
		"\u060d\5\u00dep\2\u060c\u060b\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060f"+
		"\3\2\2\2\u060e\u0610\5\u00e8u\2\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2"+
		"\2\u0610\u0612\3\2\2\2\u0611\u060a\3\2\2\2\u0612\u0615\3\2\2\2\u0613\u0611"+
		"\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u00dd\3\2\2\2\u0615\u0613\3\2\2\2\u0616"+
		"\u0617\t\n\2\2\u0617\u00df\3\2\2\2\u0618\u0619\7\24\2\2\u0619\u061a\5"+
		"\u00e2r\2\u061a\u061b\7\26\2\2\u061b\u0622\3\2\2\2\u061c\u061d\7\25\2"+
		"\2\u061d\u061e\5\u00e2r\2\u061e\u061f\7\27\2\2\u061f\u0622\3\2\2\2\u0620"+
		"\u0622\5\u0084C\2\u0621\u0618\3\2\2\2\u0621\u061c\3\2\2\2\u0621\u0620"+
		"\3\2\2\2\u0622\u00e1\3\2\2\2\u0623\u0628\5\u00e4s\2\u0624\u0625\7\t\2"+
		"\2\u0625\u0627\5\u00e4s\2\u0626\u0624\3\2\2\2\u0627\u062a\3\2\2\2\u0628"+
		"\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062d\3\2\2\2\u062a\u0628\3\2"+
		"\2\2\u062b\u062d\3\2\2\2\u062c\u0623\3\2\2\2\u062c\u062b\3\2\2\2\u062d"+
		"\u00e3\3\2\2\2\u062e\u0631\5\u00c8e\2\u062f\u0630\7\33\2\2\u0630\u0632"+
		"\5\u00c8e\2\u0631\u062f\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u00e5\3\2\2"+
		"\2\u0633\u0638\5\6\4\2\u0634\u0635\7\22\2\2\u0635\u0636\5\u00dco\2\u0636"+
		"\u0637\7\23\2\2\u0637\u0639\3\2\2\2\u0638\u0634\3\2\2\2\u0638\u0639\3"+
		"\2\2\2\u0639\u00e7\3\2\2\2\u063a\u063e\5\u00c8e\2\u063b\u063d\5\u00ea"+
		"v\2\u063c\u063b\3\2\2\2\u063d\u0640\3\2\2\2\u063e\u063c\3\2\2\2\u063e"+
		"\u063f\3\2\2\2\u063f\u0652\3\2\2\2\u0640\u063e\3\2\2\2\u0641\u0642\5\6"+
		"\4\2\u0642\u0644\7\b\2\2\u0643\u0645\5\u00dep\2\u0644\u0643\3\2\2\2\u0644"+
		"\u0645\3\2\2\2\u0645\u0648\3\2\2\2\u0646\u0649\5\6\4\2\u0647\u0649\5\u00c8"+
		"e\2\u0648\u0646\3\2\2\2\u0648\u0647\3\2\2\2\u0649\u0652\3\2\2\2\u064a"+
		"\u064b\5\6\4\2\u064b\u064c\7\b\2\2\u064c\u064d\5\u00dep\2\u064d\u064e"+
		"\7\22\2\2\u064e\u064f\5\u00c8e\2\u064f\u0650\7\23\2\2\u0650\u0652\3\2"+
		"\2\2\u0651\u063a\3\2\2\2\u0651\u0641\3\2\2\2\u0651\u064a\3\2\2\2\u0652"+
		"\u00e9\3\2\2\2\u0653\u0654\7\13\2\2\u0654\u0655\5\u00c8e\2\u0655\u00eb"+
		"\3\2\2\2\u0656\u0657\7w\2\2\u0657\u0658\5$\23\2\u0658\u00ed\3\2\2\2\u0659"+
		"\u065a\7\u0090\2\2\u065a\u00ef\3\2\2\2\u065b\u065c\7\u0091\2\2\u065c\u00f1"+
		"\3\2\2\2\u065d\u065e\7\u0096\2\2\u065e\u065f\5\u00c8e\2\u065f\u00f3\3"+
		"\2\2\2\u0660\u0661\7\u00a5\2\2\u0661\u00f5\3\2\2\2\u0662\u0663\3\2\2\2"+
		"\u0663\u00f7\3\2\2\2\u0664\u0669\5\u00fa~\2\u0665\u0669\5\u0100\u0081"+
		"\2\u0666\u0669\5\u0108\u0085\2\u0667\u0669\5\u0116\u008c\2\u0668\u0664"+
		"\3\2\2\2\u0668\u0665\3\2\2\2\u0668\u0666\3\2\2\2\u0668\u0667\3\2\2\2\u0669"+
		"\u00f9\3\2\2\2\u066a\u066b\7l\2\2\u066b\u066c\5\u00fe\u0080\2\u066c\u066d"+
		"\7s\2\2\u066d\u00fb\3\2\2\2\u066e\u066f\5\u00fe\u0080\2\u066f\u0670\7"+
		"s\2\2\u0670\u00fd\3\2\2\2\u0671\u0676\5\u00be`\2\u0672\u0673\7\n\2\2\u0673"+
		"\u0675\5\u00be`\2\u0674\u0672\3\2\2\2\u0675\u0678\3\2\2\2\u0676\u0674"+
		"\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u067a\3\2\2\2\u0678\u0676\3\2\2\2\u0679"+
		"\u067b\7\n\2\2\u067a\u0679\3\2\2\2\u067a\u067b\3\2\2\2\u067b\u00ff\3\2"+
		"\2\2\u067c\u067f\5\u0102\u0082\2\u067d\u067f\5\u0104\u0083\2\u067e\u067c"+
		"\3\2\2\2\u067e\u067d\3\2\2\2\u067f\u0101\3\2\2\2\u0680\u0681\7x\2\2\u0681"+
		"\u0682\5\u00c8e\2\u0682\u0683\7\u0086\2\2\u0683\u0685\5\u00be`\2\u0684"+
		"\u0686\7\n\2\2\u0685\u0684\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u068c\3\2"+
		"\2\2\u0687\u0688\7r\2\2\u0688\u068a\5\u00be`\2\u0689\u068b\7\n\2\2\u068a"+
		"\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068d\3\2\2\2\u068c\u0687\3\2"+
		"\2\2\u068c\u068d\3\2\2\2\u068d\u0103\3\2\2\2\u068e\u068f\7m\2\2\u068f"+
		"\u0690\5\u00c8e\2\u0690\u0699\7~\2\2\u0691\u0696\5\u0106\u0084\2\u0692"+
		"\u0693\7\n\2\2\u0693\u0695\5\u0106\u0084\2\u0694\u0692\3\2\2\2\u0695\u0698"+
		"\3\2\2\2\u0696\u0694\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u069a\3\2\2\2\u0698"+
		"\u0696\3\2\2\2\u0699\u0691\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u06a0\3\2"+
		"\2\2\u069b\u069d\7\n\2\2\u069c\u069b\3\2\2\2\u069c\u069d\3\2\2\2\u069d"+
		"\u069e\3\2\2\2\u069e\u069f\7\u0094\2\2\u069f\u06a1\5\u00fe\u0080\2\u06a0"+
		"\u069c\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a3\3\2\2\2\u06a2\u06a4\7\n"+
		"\2\2\u06a3\u06a2\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5"+
		"\u06a6\7s\2\2\u06a6\u0105\3\2\2\2\u06a7\u06a8\5\u00b8]\2\u06a8\u06a9\7"+
		"\13\2\2\u06a9\u06aa\5\u00be`\2\u06aa\u0107\3\2\2\2\u06ab\u06af\5\u010a"+
		"\u0086\2\u06ac\u06af\5\u010c\u0087\2\u06ad\u06af\5\u010e\u0088\2\u06ae"+
		"\u06ab\3\2\2\2\u06ae\u06ac\3\2\2\2\u06ae\u06ad\3\2\2\2\u06af\u0109\3\2"+
		"\2\2\u06b0\u06b1\7\u008b\2\2\u06b1\u06b2\5\u00c8e\2\u06b2\u06b3\7p\2\2"+
		"\u06b3\u06b4\5\u00be`\2\u06b4\u010b\3\2\2\2\u06b5\u06b6\7\u0084\2\2\u06b6"+
		"\u06b7\5\u00fe\u0080\2\u06b7\u06b8\7\u0089\2\2\u06b8\u06b9\5\u00c8e\2"+
		"\u06b9\u010d\3\2\2\2\u06ba\u06bb\7u\2\2\u06bb\u06bc\5\6\4\2\u06bc\u06bd"+
		"\7\b\2\2\u06bd\u06be\5\u0110\u0089\2\u06be\u06bf\7p\2\2\u06bf\u06c0\5"+
		"\u00be`\2\u06c0\u06c9\3\2\2\2\u06c1\u06c2\7u\2\2\u06c2\u06c3\5\6\4\2\u06c3"+
		"\u06c4\7y\2\2\u06c4\u06c5\5\u00c8e\2\u06c5\u06c6\7p\2\2\u06c6\u06c7\5"+
		"\u00be`\2\u06c7\u06c9\3\2\2\2\u06c8\u06ba\3\2\2\2\u06c8\u06c1\3\2\2\2"+
		"\u06c9\u010f\3\2\2\2\u06ca\u06cb\5\u0112\u008a\2\u06cb\u06cc\t\13\2\2"+
		"\u06cc\u06cd\5\u0114\u008b\2\u06cd\u0111\3\2\2\2\u06ce\u06cf\5\u00c8e"+
		"\2\u06cf\u0113\3\2\2\2\u06d0\u06d1\5\u00c8e\2\u06d1\u0115\3\2\2\2\u06d2"+
		"\u06d3\7\u008c\2\2\u06d3\u06d4\5\u0118\u008d\2\u06d4\u06d5\7p\2\2\u06d5"+
		"\u06d6\5\u00be`\2\u06d6\u0117\3\2\2\2\u06d7\u06dc\5\u00c6d\2\u06d8\u06d9"+
		"\7\t\2\2\u06d9\u06db\5\u00c6d\2\u06da\u06d8\3\2\2\2\u06db\u06de\3\2\2"+
		"\2\u06dc\u06da\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06e8\3\2\2\2\u06de\u06dc"+
		"\3\2\2\2\u06df\u06e8\5\u0080A\2\u06e0\u06e1\7\t\2\2\u06e1\u06e3\5\u0080"+
		"A\2\u06e2\u06e0\3\2\2\2\u06e3\u06e6\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e4"+
		"\u06e5\3\2\2\2\u06e5\u06e8\3\2\2\2\u06e6\u06e4\3\2\2\2\u06e7\u06d7\3\2"+
		"\2\2\u06e7\u06df\3\2\2\2\u06e7\u06e4\3\2\2\2\u06e8\u0119\3\2\2\2\u06e9"+
		"\u06ea\7#\2\2\u06ea\u06eb\7\u00a5\2\2\u06eb\u011b\3\2\2\2\u06ec\u06ed"+
		"\7$\2\2\u06ed\u06ee\7\u00a5\2\2\u06ee\u011d\3\2\2\2\u06ef\u06f0\t\f\2"+
		"\2\u06f0\u06f1\7\u00a5\2\2\u06f1\u011f\3\2\2\2\u06f2\u06f3\7,\2\2\u06f3"+
		"\u06f4\7\22\2\2\u06f4\u06f5\5\6\4\2\u06f5\u06f6\7\23\2\2\u06f6\u0121\3"+
		"\2\2\2\u06f7\u06f8\t\r\2\2\u06f8\u06f9\7\22\2\2\u06f9\u06fe\5\u00f4{\2"+
		"\u06fa\u06fb\7\t\2\2\u06fb\u06fd\5\u00f4{\2\u06fc\u06fa\3\2\2\2\u06fd"+
		"\u0700\3\2\2\2\u06fe\u06fc\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u0701\3\2"+
		"\2\2\u0700\u06fe\3\2\2\2\u0701\u0702\7\23\2\2\u0702\u0123\3\2\2\2\u0703"+
		"\u0704\t\16\2\2\u0704\u0125\3\2\2\2\u0705\u0706\7\'\2\2\u0706\u0707\5"+
		"\u00c8e\2\u0707\u0708\7(\2\2\u0708\u070a\5\u0128\u0095\2\u0709\u070b\7"+
		"\n\2\2\u070a\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u0715\3\2\2\2\u070c"+
		"\u070d\7)\2\2\u070d\u070e\5\u00c8e\2\u070e\u070f\7(\2\2\u070f\u0711\5"+
		"\u0128\u0095\2\u0710\u0712\7\n\2\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2"+
		"\2\2\u0712\u0714\3\2\2\2\u0713\u070c\3\2\2\2\u0714\u0717\3\2\2\2\u0715"+
		"\u0713\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u071d\3\2\2\2\u0717\u0715\3\2"+
		"\2\2\u0718\u0719\7*\2\2\u0719\u071b\5\u0128\u0095\2\u071a\u071c\7\n\2"+
		"\2\u071b\u071a\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071e\3\2\2\2\u071d\u0718"+
		"\3\2\2\2\u071d\u071e\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0720\7+\2\2\u0720"+
		"\u0127\3\2\2\2\u0721\u0725\5\u00be`\2\u0722\u0725\5\u00c8e\2\u0723\u0725"+
		"\5\34\17\2\u0724\u0721\3\2\2\2\u0724\u0722\3\2\2\2\u0724\u0723\3\2\2\2"+
		"\u0725\u0129\3\2\2\2\u00e3\u012d\u013b\u0146\u014a\u014f\u0157\u015c\u0164"+
		"\u0169\u0171\u0176\u017e\u0183\u018b\u0190\u0198\u019d\u01a3\u01a8\u01ac"+
		"\u01b1\u01be\u01c7\u01c9\u01cf\u01d2\u01dd\u01e4\u01ec\u01ee\u01f5\u01fd"+
		"\u020c\u0210\u021e\u0222\u0226\u0234\u0241\u0243\u024b\u024e\u0252\u0254"+
		"\u0258\u025f\u0264\u026b\u027f\u0286\u028e\u0294\u029d\u02b2\u02b9\u02c4"+
		"\u02c7\u02ce\u02d1\u02d8\u02dc\u02e3\u02ed\u02f1\u02f6\u02f9\u02fe\u0304"+
		"\u030a\u0329\u0336\u033f\u0348\u0352\u035a\u035d\u036a\u036d\u0370\u0375"+
		"\u0377\u037b\u0388\u038b\u038e\u0393\u0395\u0398\u039f\u03ac\u03af\u03b2"+
		"\u03b8\u03c7\u03cc\u03cf\u03d4\u03d6\u03da\u03e7\u03ea\u03ed\u03f3\u0402"+
		"\u0407\u040a\u040f\u0411\u0414\u041b\u0421\u0426\u042e\u0431\u0436\u043e"+
		"\u0441\u0444\u0448\u044c\u0454\u0457\u045a\u045e\u0461\u0465\u046a\u0472"+
		"\u0475\u0478\u0481\u0484\u0488\u0490\u0493\u0496\u049f\u04a2\u04a5\u04ad"+
		"\u04af\u04b6\u04ba\u04c6\u04d2\u04d9\u04e1\u04ea\u04f3\u04f7\u0500\u0506"+
		"\u050b\u0511\u0516\u051b\u0527\u0532\u0536\u0540\u0543\u054a\u0552\u055a"+
		"\u055d\u0562\u0570\u0574\u057e\u0587\u058f\u059a\u05a2\u05a4\u05ad\u05af"+
		"\u05b2\u05b8\u05c0\u05c2\u05c5\u05d0\u05d6\u05de\u05e3\u05f6\u05fd\u0605"+
		"\u0608\u060c\u060f\u0613\u0621\u0628\u062c\u0631\u0638\u063e\u0644\u0648"+
		"\u0651\u0668\u0676\u067a\u067e\u0685\u068a\u068c\u0696\u0699\u069c\u06a0"+
		"\u06a3\u06ae\u06c8\u06dc\u06e4\u06e7\u06fe\u070a\u0711\u0715\u071b\u071d"+
		"\u0724";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}