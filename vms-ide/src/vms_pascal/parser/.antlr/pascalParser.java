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
		PLUS=1, MINUS=2, STAR=3, SLASH=4, ASSIGN=5, COMMA=6, SEMI=7, COLON=8, 
		EQUAL=9, NOT_EQUAL=10, LT=11, LE=12, GE=13, GT=14, LPAREN=15, RPAREN=16, 
		LBRACK=17, LBRACK2=18, RBRACK=19, RBRACK2=20, POINTER=21, ATP=22, DOT=23, 
		DOTDOT=24, LCURLY=25, RCURLY=26, DOWN_LINE=27, ALIGN=28, ALIGNED=29, UNALIGNED=30, 
		AT=31, AUTOMATIC=32, COMMON=33, STATIC=34, PSECT=35, ASYNCHRONOUS=36, 
		CHECK=37, FLOAT=38, ENUMERATION_SIZE=39, PEN_CHECKING_STYLE=40, HiDDEN=41, 
		IDENT=42, INITIALIZE=43, KEY=44, LIST=45, OPTIMIZE=46, NOOPTIMIZE=47, 
		CLASS_A=48, CLASS_NCA=49, CLASS_S=50, IMMEDIATE=51, REFERENCE=52, POS=53, 
		READONLY=54, BIT=55, BYTE=56, WORD=57, LONG=58, QUAD=59, OCTA=60, TRUNCATE=61, 
		UNBOUND=62, UNSAFE=63, LOCAL=64, GLOBAL=65, EXTERNAL=66, EXTERN=67, FORTRAN=68, 
		FORWARD=69, VARYING=70, WEAK_GLOBAL=71, WEAK_EXTERNAL=72, VOLATILE=73, 
		WRITEONLY=74, AND=75, ARRAY=76, BEGIN=77, BOOLEAN=78, CASE=79, CHAR=80, 
		CHR=81, CONST=82, DIV=83, DO=84, DOWNTO=85, ELSE=86, END=87, ENVIRONMENT=88, 
		FILE=89, FOR=90, FUNCTION=91, GOTO=92, IF=93, IN=94, INHERIT=95, INTEGER=96, 
		INTEGER8=97, INTEGER16=98, INTEGER32=99, INTEGER64=100, UNSIGNED8=101, 
		UNSIGNED16=102, CARDINAL16=103, UNSIGNED32=104, CARDINAL32=105, UNSIGNED64=106, 
		LABEL=107, MOD=108, MODULE=109, NIL=110, NOT=111, OF=112, OR=113, OTHERWISE=114, 
		PACKED=115, PROCEDURE=116, PROGRAM=117, REAL=118, DOUBLE=119, QUADRUPLE=120, 
		RECORD=121, REPEAT=122, SET=123, TEXT=124, THEN=125, TO=126, TYPE=127, 
		UNTIL=128, VALUE=129, VAR=130, WHILE=131, WITH=132, ZERO=133, UNIT=134, 
		INTERFACE=135, USES=136, STRING=137, IMPLEMENTATION=138, TRUE=139, FALSE=140, 
		WS=141, COMMENT_1=142, COMMENT_2=143, IDENTIFIER=144, STRING_LITERAL=145, 
		NUM_INT=146, NUM_REAL=147, BASE_NUMBER=148, BIN_NUMBER=149, HEX_NUMBER=150, 
		OCT_NUMBER=151;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_inheritAttr = 2, RULE_inherit = 3, 
		RULE_invironmentAttr = 4, RULE_identifier = 5, RULE_attributePart = 6, 
		RULE_attributeDef = 7, RULE_attribute = 8, RULE_block = 9, RULE_usesUnitsPart = 10, 
		RULE_labelDeclarationPart = 11, RULE_label = 12, RULE_constantDefinitionPart = 13, 
		RULE_constantDefinition = 14, RULE_constantChr = 15, RULE_constant = 16, 
		RULE_unsignedNumber = 17, RULE_unsignedInteger = 18, RULE_unsignedReal = 19, 
		RULE_sign = 20, RULE_bool = 21, RULE_string = 22, RULE_typeDefinitionPart = 23, 
		RULE_typeDefinition = 24, RULE_functionType = 25, RULE_procedureType = 26, 
		RULE_type = 27, RULE_simpleType = 28, RULE_enumType = 29, RULE_subrangeType = 30, 
		RULE_typeIdentifier = 31, RULE_structuredType = 32, RULE_unpackedStructuredType = 33, 
		RULE_stringtype = 34, RULE_varyingType = 35, RULE_arrayType = 36, RULE_typeList = 37, 
		RULE_indexType = 38, RULE_componentType = 39, RULE_recordType = 40, RULE_fieldList = 41, 
		RULE_fixedPart = 42, RULE_recordSection = 43, RULE_variantPart = 44, RULE_tag = 45, 
		RULE_variant = 46, RULE_setType = 47, RULE_baseType = 48, RULE_fileType = 49, 
		RULE_textType = 50, RULE_pointerType = 51, RULE_schemaType = 52, RULE_schemaList = 53, 
		RULE_schemaName = 54, RULE_prototypeType = 55, RULE_prototypeList = 56, 
		RULE_constructorValue = 57, RULE_constructorArray = 58, RULE_typeName = 59, 
		RULE_componentValue = 60, RULE_constructorRecord = 61, RULE_initializerList = 62, 
		RULE_initializerItem = 63, RULE_tagValue = 64, RULE_constructorSet = 65, 
		RULE_constructorNonStdArray = 66, RULE_componentValueN = 67, RULE_constructorNonStdRecord = 68, 
		RULE_variableDeclarationPart = 69, RULE_variableDeclaration = 70, RULE_variablePreDeclaration = 71, 
		RULE_toBeginEndDoDeclarationPart = 72, RULE_procedureAndFunctionDeclarationPart = 73, 
		RULE_procedureOrFunctionDeclaration = 74, RULE_procedureDeclaration = 75, 
		RULE_formalParameterList = 76, RULE_formalParameterSection = 77, RULE_parameterGroup = 78, 
		RULE_identifierList = 79, RULE_constList = 80, RULE_functionDeclaration = 81, 
		RULE_resultType = 82, RULE_statement = 83, RULE_unlabelledStatement = 84, 
		RULE_simpleStatement = 85, RULE_assignmentStatement = 86, RULE_variable = 87, 
		RULE_expression = 88, RULE_relationaloperator = 89, RULE_simpleExpression = 90, 
		RULE_additiveoperator = 91, RULE_term = 92, RULE_multiplicativeoperator = 93, 
		RULE_signedFactor = 94, RULE_factor = 95, RULE_unsignedConstant = 96, 
		RULE_functionDesignator = 97, RULE_parameterList = 98, RULE_set = 99, 
		RULE_elementList = 100, RULE_element = 101, RULE_procedureStatement = 102, 
		RULE_actualParameter = 103, RULE_parameterwidth = 104, RULE_gotoStatement = 105, 
		RULE_emptyStatement = 106, RULE_empty = 107, RULE_structuredStatement = 108, 
		RULE_compoundStatement = 109, RULE_openCompoundStatement = 110, RULE_statements = 111, 
		RULE_conditionalStatement = 112, RULE_ifStatement = 113, RULE_caseStatement = 114, 
		RULE_caseListElement = 115, RULE_repetetiveStatement = 116, RULE_whileStatement = 117, 
		RULE_repeatStatement = 118, RULE_forStatement = 119, RULE_forList = 120, 
		RULE_initialValue = 121, RULE_finalValue = 122, RULE_withStatement = 123, 
		RULE_recordVariableList = 124;
	public static final String[] ruleNames = {
		"program", "programHeading", "inheritAttr", "inherit", "invironmentAttr", 
		"identifier", "attributePart", "attributeDef", "attribute", "block", "usesUnitsPart", 
		"labelDeclarationPart", "label", "constantDefinitionPart", "constantDefinition", 
		"constantChr", "constant", "unsignedNumber", "unsignedInteger", "unsignedReal", 
		"sign", "bool", "string", "typeDefinitionPart", "typeDefinition", "functionType", 
		"procedureType", "type", "simpleType", "enumType", "subrangeType", "typeIdentifier", 
		"structuredType", "unpackedStructuredType", "stringtype", "varyingType", 
		"arrayType", "typeList", "indexType", "componentType", "recordType", "fieldList", 
		"fixedPart", "recordSection", "variantPart", "tag", "variant", "setType", 
		"baseType", "fileType", "textType", "pointerType", "schemaType", "schemaList", 
		"schemaName", "prototypeType", "prototypeList", "constructorValue", "constructorArray", 
		"typeName", "componentValue", "constructorRecord", "initializerList", 
		"initializerItem", "tagValue", "constructorSet", "constructorNonStdArray", 
		"componentValueN", "constructorNonStdRecord", "variableDeclarationPart", 
		"variableDeclaration", "variablePreDeclaration", "toBeginEndDoDeclarationPart", 
		"procedureAndFunctionDeclarationPart", "procedureOrFunctionDeclaration", 
		"procedureDeclaration", "formalParameterList", "formalParameterSection", 
		"parameterGroup", "identifierList", "constList", "functionDeclaration", 
		"resultType", "statement", "unlabelledStatement", "simpleStatement", "assignmentStatement", 
		"variable", "expression", "relationaloperator", "simpleExpression", "additiveoperator", 
		"term", "multiplicativeoperator", "signedFactor", "factor", "unsignedConstant", 
		"functionDesignator", "parameterList", "set", "elementList", "element", 
		"procedureStatement", "actualParameter", "parameterwidth", "gotoStatement", 
		"emptyStatement", "empty", "structuredStatement", "compoundStatement", 
		"openCompoundStatement", "statements", "conditionalStatement", "ifStatement", 
		"caseStatement", "caseListElement", "repetetiveStatement", "whileStatement", 
		"repeatStatement", "forStatement", "forList", "initialValue", "finalValue", 
		"withStatement", "recordVariableList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "':='", "','", "';'", "':'", "'='", 
		"'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", "'['", "'(.'", "']'", 
		"'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", 
		"EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", 
		"LBRACK2", "RBRACK", "RBRACK2", "POINTER", "ATP", "DOT", "DOTDOT", "LCURLY", 
		"RCURLY", "DOWN_LINE", "ALIGN", "ALIGNED", "UNALIGNED", "AT", "AUTOMATIC", 
		"COMMON", "STATIC", "PSECT", "ASYNCHRONOUS", "CHECK", "FLOAT", "ENUMERATION_SIZE", 
		"PEN_CHECKING_STYLE", "HiDDEN", "IDENT", "INITIALIZE", "KEY", "LIST", 
		"OPTIMIZE", "NOOPTIMIZE", "CLASS_A", "CLASS_NCA", "CLASS_S", "IMMEDIATE", 
		"REFERENCE", "POS", "READONLY", "BIT", "BYTE", "WORD", "LONG", "QUAD", 
		"OCTA", "TRUNCATE", "UNBOUND", "UNSAFE", "LOCAL", "GLOBAL", "EXTERNAL", 
		"EXTERN", "FORTRAN", "FORWARD", "VARYING", "WEAK_GLOBAL", "WEAK_EXTERNAL", 
		"VOLATILE", "WRITEONLY", "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", 
		"CHR", "CONST", "DIV", "DO", "DOWNTO", "ELSE", "END", "ENVIRONMENT", "FILE", 
		"FOR", "FUNCTION", "GOTO", "IF", "IN", "INHERIT", "INTEGER", "INTEGER8", 
		"INTEGER16", "INTEGER32", "INTEGER64", "UNSIGNED8", "UNSIGNED16", "CARDINAL16", 
		"UNSIGNED32", "CARDINAL32", "UNSIGNED64", "LABEL", "MOD", "MODULE", "NIL", 
		"NOT", "OF", "OR", "OTHERWISE", "PACKED", "PROCEDURE", "PROGRAM", "REAL", 
		"DOUBLE", "QUADRUPLE", "RECORD", "REPEAT", "SET", "TEXT", "THEN", "TO", 
		"TYPE", "UNTIL", "VALUE", "VAR", "WHILE", "WITH", "ZERO", "UNIT", "INTERFACE", 
		"USES", "STRING", "IMPLEMENTATION", "TRUE", "FALSE", "WS", "COMMENT_1", 
		"COMMENT_2", "IDENTIFIER", "STRING_LITERAL", "NUM_INT", "NUM_REAL", "BASE_NUMBER", 
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
		public TerminalNode INTERFACE() { return getToken(pascalParser.INTERFACE, 0); }
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
			setState(250);
			programHeading();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERFACE) {
				{
				setState(251);
				match(INTERFACE);
				}
			}

			setState(254);
			block();
			setState(255);
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
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(257);
					inheritAttr();
					}
				}

				setState(260);
				match(PROGRAM);
				setState(261);
				identifier();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(262);
					match(LPAREN);
					setState(263);
					identifierList();
					setState(264);
					match(RPAREN);
					}
				}

				setState(268);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(270);
					invironmentAttr();
					}
				}

				setState(273);
				match(MODULE);
				setState(274);
				identifier();
				setState(275);
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
			setState(279);
			match(LBRACK);
			setState(280);
			inherit();
			setState(281);
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
			setState(283);
			match(INHERIT);
			setState(284);
			match(LPAREN);
			setState(285);
			string();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(286);
				match(COMMA);
				setState(287);
				string();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
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
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(LBRACK);
				setState(296);
				match(ENVIRONMENT);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(297);
					match(LPAREN);
					setState(298);
					string();
					setState(299);
					match(RPAREN);
					}
				}

				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(303);
					match(COMMA);
					setState(304);
					inherit();
					}
				}

				setState(307);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(LBRACK);
				setState(309);
				inherit();
				setState(310);
				match(COMMA);
				setState(311);
				match(ENVIRONMENT);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(312);
					match(LPAREN);
					setState(313);
					string();
					setState(314);
					match(RPAREN);
					}
				}

				setState(318);
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
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
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
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(324);
				match(LBRACK);
				setState(325);
				attributeDef();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(326);
					match(COMMA);
					setState(327);
					attributeDef();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(333);
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
		enterRule(_localctx, 14, RULE_attributeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			attribute();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(338);
				match(LPAREN);
				{
				setState(339);
				constant();
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(340);
					match(COMMA);
					{
					setState(341);
					constant();
					}
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(347);
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
		enterRule(_localctx, 16, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (ALIGN - 28)) | (1L << (ALIGNED - 28)) | (1L << (UNALIGNED - 28)) | (1L << (AT - 28)) | (1L << (AUTOMATIC - 28)) | (1L << (COMMON - 28)) | (1L << (STATIC - 28)) | (1L << (PSECT - 28)) | (1L << (ASYNCHRONOUS - 28)) | (1L << (CHECK - 28)) | (1L << (FLOAT - 28)) | (1L << (ENUMERATION_SIZE - 28)) | (1L << (PEN_CHECKING_STYLE - 28)) | (1L << (HiDDEN - 28)) | (1L << (IDENT - 28)) | (1L << (INITIALIZE - 28)) | (1L << (KEY - 28)) | (1L << (LIST - 28)) | (1L << (OPTIMIZE - 28)) | (1L << (NOOPTIMIZE - 28)) | (1L << (CLASS_A - 28)) | (1L << (CLASS_NCA - 28)) | (1L << (CLASS_S - 28)) | (1L << (IMMEDIATE - 28)) | (1L << (REFERENCE - 28)) | (1L << (POS - 28)) | (1L << (READONLY - 28)) | (1L << (BIT - 28)) | (1L << (BYTE - 28)) | (1L << (WORD - 28)) | (1L << (LONG - 28)) | (1L << (QUAD - 28)) | (1L << (OCTA - 28)) | (1L << (TRUNCATE - 28)) | (1L << (UNBOUND - 28)) | (1L << (UNSAFE - 28)) | (1L << (LOCAL - 28)) | (1L << (GLOBAL - 28)) | (1L << (EXTERNAL - 28)) | (1L << (WEAK_GLOBAL - 28)) | (1L << (WEAK_EXTERNAL - 28)) | (1L << (VOLATILE - 28)) | (1L << (WRITEONLY - 28)))) != 0) || _la==VALUE) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
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
		public List<UsesUnitsPartContext> usesUnitsPart() {
			return getRuleContexts(UsesUnitsPartContext.class);
		}
		public UsesUnitsPartContext usesUnitsPart(int i) {
			return getRuleContext(UsesUnitsPartContext.class,i);
		}
		public List<TerminalNode> IMPLEMENTATION() { return getTokens(pascalParser.IMPLEMENTATION); }
		public TerminalNode IMPLEMENTATION(int i) {
			return getToken(pascalParser.IMPLEMENTATION, i);
		}
		public List<ToBeginEndDoDeclarationPartContext> toBeginEndDoDeclarationPart() {
			return getRuleContexts(ToBeginEndDoDeclarationPartContext.class);
		}
		public ToBeginEndDoDeclarationPartContext toBeginEndDoDeclarationPart(int i) {
			return getRuleContext(ToBeginEndDoDeclarationPartContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (CONST - 82)) | (1L << (FUNCTION - 82)) | (1L << (LABEL - 82)) | (1L << (PROCEDURE - 82)) | (1L << (TYPE - 82)) | (1L << (VAR - 82)) | (1L << (USES - 82)) | (1L << (IMPLEMENTATION - 82)))) != 0)) {
				{
				setState(360);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LABEL:
					{
					setState(353);
					labelDeclarationPart();
					}
					break;
				case CONST:
					{
					setState(354);
					constantDefinitionPart();
					}
					break;
				case TYPE:
					{
					setState(355);
					typeDefinitionPart();
					}
					break;
				case VAR:
					{
					setState(356);
					variableDeclarationPart();
					}
					break;
				case LBRACK:
				case FUNCTION:
				case PROCEDURE:
					{
					setState(357);
					procedureAndFunctionDeclarationPart();
					}
					break;
				case USES:
					{
					setState(358);
					usesUnitsPart();
					}
					break;
				case IMPLEMENTATION:
					{
					setState(359);
					match(IMPLEMENTATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO) {
				{
				{
				setState(365);
				toBeginEndDoDeclarationPart();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(371);
				compoundStatement();
				}
				break;
			case END:
				{
				setState(372);
				match(END);
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

	public static class UsesUnitsPartContext extends ParserRuleContext {
		public TerminalNode USES() { return getToken(pascalParser.USES, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public UsesUnitsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usesUnitsPart; }
	}

	public final UsesUnitsPartContext usesUnitsPart() throws RecognitionException {
		UsesUnitsPartContext _localctx = new UsesUnitsPartContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_usesUnitsPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(USES);
			setState(376);
			identifierList();
			setState(377);
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
		enterRule(_localctx, 22, RULE_labelDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(LABEL);
			setState(380);
			label();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(381);
				match(COMMA);
				setState(382);
				label();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
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
		enterRule(_localctx, 24, RULE_label);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				unsignedInteger();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
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
		enterRule(_localctx, 26, RULE_constantDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(CONST);
			setState(398); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(395);
				constantDefinition();
				setState(396);
				match(SEMI);
				}
				}
				setState(400); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			identifier();
			setState(403);
			match(EQUAL);
			setState(404);
			attributePart();
			setState(405);
			constant();
			}
		}
		catch (RecognitionException re) {
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
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public ConstantChrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantChr; }
	}

	public final ConstantChrContext constantChr() throws RecognitionException {
		ConstantChrContext _localctx = new ConstantChrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constantChr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(CHR);
			setState(408);
			match(LPAREN);
			setState(409);
			unsignedInteger();
			setState(410);
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
		enterRule(_localctx, 32, RULE_constant);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				sign();
				setState(414);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				sign();
				setState(418);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(420);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(421);
				constantChr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(422);
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
		enterRule(_localctx, 34, RULE_unsignedNumber);
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
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
		enterRule(_localctx, 36, RULE_unsignedInteger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (NUM_INT - 146)) | (1L << (BASE_NUMBER - 146)) | (1L << (BIN_NUMBER - 146)) | (1L << (HEX_NUMBER - 146)) | (1L << (OCT_NUMBER - 146)))) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
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
		enterRule(_localctx, 40, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
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
		enterRule(_localctx, 42, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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

	public static class TypeDefinitionPartContext extends ParserRuleContext {
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
		enterRule(_localctx, 46, RULE_typeDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(TYPE);
			setState(443); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(440);
				typeDefinition();
				setState(441);
				match(SEMI);
				}
				}
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==IDENTIFIER );
			}
		}
		catch (RecognitionException re) {
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 48, RULE_typeDefinition);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				identifier();
				setState(448);
				match(EQUAL);
				setState(449);
				attributePart();
				setState(453);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
				case MINUS:
				case LPAREN:
				case LBRACK:
				case LBRACK2:
				case POINTER:
				case ATP:
				case VARYING:
				case ARRAY:
				case BOOLEAN:
				case CHAR:
				case CHR:
				case FILE:
				case INTEGER:
				case INTEGER8:
				case INTEGER16:
				case INTEGER32:
				case INTEGER64:
				case UNSIGNED8:
				case UNSIGNED16:
				case CARDINAL16:
				case UNSIGNED32:
				case CARDINAL32:
				case UNSIGNED64:
				case NIL:
				case NOT:
				case PACKED:
				case REAL:
				case DOUBLE:
				case QUADRUPLE:
				case RECORD:
				case SET:
				case TEXT:
				case ZERO:
				case STRING:
				case TRUE:
				case FALSE:
				case IDENTIFIER:
				case STRING_LITERAL:
				case NUM_INT:
				case NUM_REAL:
				case BASE_NUMBER:
				case BIN_NUMBER:
				case HEX_NUMBER:
				case OCT_NUMBER:
					{
					setState(450);
					type();
					}
					break;
				case FUNCTION:
					{
					setState(451);
					functionType();
					}
					break;
				case PROCEDURE:
					{
					setState(452);
					procedureType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				schemaType();
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
		enterRule(_localctx, 50, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(FUNCTION);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(459);
				formalParameterList();
				}
			}

			setState(462);
			match(COLON);
			setState(463);
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
		enterRule(_localctx, 52, RULE_procedureType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(PROCEDURE);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(466);
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
		enterRule(_localctx, 54, RULE_type);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				structuredType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
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
		enterRule(_localctx, 56, RULE_simpleType);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				enumType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
				stringtype();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(478);
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
		enterRule(_localctx, 58, RULE_enumType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(LPAREN);
			setState(482);
			identifierList();
			setState(483);
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
		enterRule(_localctx, 60, RULE_subrangeType);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				constant();
				setState(486);
				match(DOTDOT);
				setState(487);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				expression();
				setState(490);
				match(DOTDOT);
				setState(491);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				expression();
				setState(494);
				match(DOTDOT);
				setState(495);
				expression();
				setState(496);
				match(COLON);
				setState(497);
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
		public TerminalNode CHAR() { return getToken(pascalParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(pascalParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(pascalParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(pascalParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(pascalParser.STRING, 0); }
		public TerminalNode INTEGER8() { return getToken(pascalParser.INTEGER8, 0); }
		public TerminalNode INTEGER16() { return getToken(pascalParser.INTEGER16, 0); }
		public TerminalNode INTEGER32() { return getToken(pascalParser.INTEGER32, 0); }
		public TerminalNode INTEGER64() { return getToken(pascalParser.INTEGER64, 0); }
		public TerminalNode UNSIGNED8() { return getToken(pascalParser.UNSIGNED8, 0); }
		public TerminalNode UNSIGNED16() { return getToken(pascalParser.UNSIGNED16, 0); }
		public TerminalNode CARDINAL16() { return getToken(pascalParser.CARDINAL16, 0); }
		public TerminalNode UNSIGNED32() { return getToken(pascalParser.UNSIGNED32, 0); }
		public TerminalNode CARDINAL32() { return getToken(pascalParser.CARDINAL32, 0); }
		public TerminalNode UNSIGNED64() { return getToken(pascalParser.UNSIGNED64, 0); }
		public TerminalNode DOUBLE() { return getToken(pascalParser.DOUBLE, 0); }
		public TerminalNode QUADRUPLE() { return getToken(pascalParser.QUADRUPLE, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeIdentifier);
		int _la;
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				identifier();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case INTEGER:
			case REAL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				_la = _input.LA(1);
				if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (BOOLEAN - 78)) | (1L << (CHAR - 78)) | (1L << (INTEGER - 78)) | (1L << (REAL - 78)) | (1L << (STRING - 78)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case INTEGER8:
			case INTEGER16:
			case INTEGER32:
			case INTEGER64:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (INTEGER8 - 97)) | (1L << (INTEGER16 - 97)) | (1L << (INTEGER32 - 97)) | (1L << (INTEGER64 - 97)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case UNSIGNED8:
			case UNSIGNED16:
			case CARDINAL16:
			case UNSIGNED32:
			case CARDINAL32:
			case UNSIGNED64:
				enterOuterAlt(_localctx, 4);
				{
				setState(504);
				_la = _input.LA(1);
				if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (UNSIGNED8 - 101)) | (1L << (UNSIGNED16 - 101)) | (1L << (CARDINAL16 - 101)) | (1L << (UNSIGNED32 - 101)) | (1L << (CARDINAL32 - 101)) | (1L << (UNSIGNED64 - 101)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DOUBLE:
			case QUADRUPLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(505);
				_la = _input.LA(1);
				if ( !(_la==DOUBLE || _la==QUADRUPLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		enterRule(_localctx, 64, RULE_structuredType);
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKED:
				enterOuterAlt(_localctx, 1);
				{
				setState(508);
				match(PACKED);
				setState(509);
				unpackedStructuredType();
				}
				break;
			case LBRACK:
			case VARYING:
			case ARRAY:
			case FILE:
			case RECORD:
			case SET:
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
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
		enterRule(_localctx, 66, RULE_unpackedStructuredType);
		try {
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(516);
				fileType();
				}
				break;
			case LBRACK:
			case TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(517);
				textType();
				}
				break;
			case VARYING:
				enterOuterAlt(_localctx, 6);
				{
				setState(518);
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
		enterRule(_localctx, 68, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(STRING);
			setState(522);
			match(LPAREN);
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(523);
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
				setState(524);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(527);
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
		enterRule(_localctx, 70, RULE_varyingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(VARYING);
			setState(530);
			match(LBRACK);
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(531);
				constant();
				}
				break;
			case 2:
				{
				setState(532);
				identifier();
				}
				break;
			case 3:
				{
				setState(533);
				expression();
				}
				break;
			}
			setState(536);
			match(RBRACK);
			setState(537);
			match(OF);
			setState(538);
			attributePart();
			setState(539);
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
		enterRule(_localctx, 72, RULE_arrayType);
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				match(ARRAY);
				setState(542);
				match(LBRACK);
				setState(543);
				typeList();
				setState(544);
				match(RBRACK);
				setState(545);
				match(OF);
				setState(546);
				componentType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				match(ARRAY);
				setState(549);
				match(LBRACK2);
				setState(550);
				typeList();
				setState(551);
				match(RBRACK2);
				setState(552);
				match(OF);
				setState(553);
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
		enterRule(_localctx, 74, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			indexType();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(558);
				match(COMMA);
				setState(559);
				indexType();
				}
				}
				setState(564);
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
		enterRule(_localctx, 76, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			attributePart();
			setState(566);
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
		enterRule(_localctx, 78, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			attributePart();
			setState(569);
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
		enterRule(_localctx, 80, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(RECORD);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==IDENTIFIER) {
				{
				setState(572);
				fieldList();
				}
			}

			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(575);
				match(SEMI);
				}
			}

			setState(578);
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
		enterRule(_localctx, 82, RULE_fieldList);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				fixedPart();
				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(581);
					match(SEMI);
					setState(582);
					variantPart();
					}
					break;
				}
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
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
		enterRule(_localctx, 84, RULE_fixedPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			recordSection();
			setState(593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(589);
					match(SEMI);
					setState(590);
					recordSection();
					}
					} 
				}
				setState(595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 86, RULE_recordSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			identifierList();
			setState(597);
			match(COLON);
			setState(598);
			attributePart();
			setState(599);
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
		enterRule(_localctx, 88, RULE_variantPart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(CASE);
			setState(602);
			tag();
			setState(603);
			match(OF);
			setState(604);
			variant();
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(605);
					match(SEMI);
					setState(606);
					variant();
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(612);
					match(SEMI);
					}
				}

				setState(615);
				match(OTHERWISE);
				setState(616);
				match(LPAREN);
				setState(617);
				fieldList();
				setState(618);
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
		enterRule(_localctx, 90, RULE_tag);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(622);
					identifier();
					setState(623);
					match(COLON);
					}
					break;
				}
				setState(627);
				attributePart();
				setState(628);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
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
		enterRule(_localctx, 92, RULE_variant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			constList();
			setState(634);
			match(COLON);
			setState(635);
			match(LPAREN);
			setState(636);
			fieldList();
			setState(637);
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
		enterRule(_localctx, 94, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(SET);
			setState(640);
			match(OF);
			setState(641);
			attributePart();
			setState(642);
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
		enterRule(_localctx, 96, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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
		enterRule(_localctx, 98, RULE_fileType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(FILE);
			setState(647);
			match(OF);
			setState(648);
			attributePart();
			setState(649);
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
		enterRule(_localctx, 100, RULE_textType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			attributePart();
			setState(652);
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
		public TerminalNode POINTER() { return getToken(pascalParser.POINTER, 0); }
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
		enterRule(_localctx, 102, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			attributePart();
			setState(655);
			match(POINTER);
			setState(656);
			attributePart();
			setState(657);
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
		enterRule(_localctx, 104, RULE_schemaType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			schemaName();
			setState(660);
			match(LPAREN);
			setState(661);
			schemaList();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(662);
				match(SEMI);
				setState(663);
				schemaList();
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(669);
			match(RPAREN);
			setState(670);
			match(EQUAL);
			setState(671);
			attributePart();
			setState(672);
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
		enterRule(_localctx, 106, RULE_schemaList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(674);
			identifier();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(675);
				match(COMMA);
				setState(676);
				identifier();
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(682);
			match(COLON);
			setState(683);
			attributePart();
			setState(684);
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
		enterRule(_localctx, 108, RULE_schemaName);
		try {
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				identifier();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				match(STRING);
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
		enterRule(_localctx, 110, RULE_prototypeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			schemaName();
			setState(691);
			match(LPAREN);
			setState(692);
			prototypeList();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(693);
				match(SEMI);
				setState(694);
				prototypeList();
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(700);
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
		enterRule(_localctx, 112, RULE_prototypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			expression();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(703);
				match(COMMA);
				setState(704);
				expression();
				}
				}
				setState(709);
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
		enterRule(_localctx, 114, RULE_constructorValue);
		try {
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				constructorArray();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
				constructorRecord();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(712);
				constructorSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(713);
				constructorNonStdArray();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(714);
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
		enterRule(_localctx, 116, RULE_constructorArray);
		int _la;
		try {
			int _alt;
			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(717);
					typeName();
					}
				}

				setState(720);
				match(LBRACK);
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHR - 81)) | (1L << (NIL - 81)) | (1L << (NOT - 81)) | (1L << (ZERO - 81)) | (1L << (TRUE - 81)) | (1L << (FALSE - 81)) | (1L << (IDENTIFIER - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (STRING_LITERAL - 145)) | (1L << (NUM_INT - 145)) | (1L << (NUM_REAL - 145)) | (1L << (BASE_NUMBER - 145)) | (1L << (BIN_NUMBER - 145)) | (1L << (HEX_NUMBER - 145)) | (1L << (OCT_NUMBER - 145)))) != 0)) {
					{
					setState(721);
					initializerList();
					setState(722);
					match(COLON);
					setState(723);
					componentValue();
					setState(731);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(724);
							match(SEMI);
							setState(725);
							initializerList();
							setState(726);
							match(COLON);
							setState(727);
							componentValue();
							}
							} 
						}
						setState(733);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
					}
					}
				}

				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(736);
						match(SEMI);
						}
					}

					setState(739);
					match(OTHERWISE);
					setState(740);
					componentValue();
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(741);
						match(SEMI);
						}
					}

					}
				}

				setState(746);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(747);
					typeName();
					}
				}

				setState(750);
				match(LBRACK);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHR - 81)) | (1L << (NIL - 81)) | (1L << (NOT - 81)) | (1L << (ZERO - 81)) | (1L << (TRUE - 81)) | (1L << (FALSE - 81)) | (1L << (IDENTIFIER - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (STRING_LITERAL - 145)) | (1L << (NUM_INT - 145)) | (1L << (NUM_REAL - 145)) | (1L << (BASE_NUMBER - 145)) | (1L << (BIN_NUMBER - 145)) | (1L << (HEX_NUMBER - 145)) | (1L << (OCT_NUMBER - 145)))) != 0)) {
					{
					setState(751);
					initializerList();
					setState(752);
					match(COLON);
					setState(753);
					constructorArray();
					setState(761);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(754);
							match(SEMI);
							setState(755);
							initializerList();
							setState(756);
							match(COLON);
							setState(757);
							constructorArray();
							}
							} 
						}
						setState(763);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
					}
					}
				}

				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(766);
						match(SEMI);
						}
					}

					setState(769);
					match(OTHERWISE);
					setState(770);
					constructorArray();
					setState(772);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(771);
						match(SEMI);
						}
					}

					}
				}

				setState(776);
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
		enterRule(_localctx, 118, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
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
		enterRule(_localctx, 120, RULE_componentValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
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
		enterRule(_localctx, 122, RULE_constructorRecord);
		int _la;
		try {
			int _alt;
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(783);
					typeName();
					}
				}

				setState(786);
				match(LBRACK);
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHR - 81)) | (1L << (NIL - 81)) | (1L << (NOT - 81)) | (1L << (ZERO - 81)) | (1L << (TRUE - 81)) | (1L << (FALSE - 81)) | (1L << (IDENTIFIER - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (STRING_LITERAL - 145)) | (1L << (NUM_INT - 145)) | (1L << (NUM_REAL - 145)) | (1L << (BASE_NUMBER - 145)) | (1L << (BIN_NUMBER - 145)) | (1L << (HEX_NUMBER - 145)) | (1L << (OCT_NUMBER - 145)))) != 0)) {
					{
					setState(787);
					initializerList();
					setState(788);
					match(COLON);
					setState(789);
					componentValue();
					setState(797);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(790);
							match(SEMI);
							setState(791);
							initializerList();
							setState(792);
							match(COLON);
							setState(793);
							componentValue();
							}
							} 
						}
						setState(799);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
					}
					}
				}

				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(802);
						match(SEMI);
						}
					}

					setState(805);
					match(CASE);
					setState(809);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						setState(806);
						identifier();
						setState(807);
						match(COLON);
						}
						break;
					}
					setState(811);
					tagValue();
					setState(812);
					match(OF);
					setState(813);
					match(LBRACK);
					{
					setState(814);
					initializerList();
					setState(815);
					match(COLON);
					setState(816);
					componentValue();
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(817);
						match(SEMI);
						setState(818);
						initializerList();
						setState(819);
						match(COLON);
						setState(820);
						componentValue();
						}
						}
						setState(826);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(827);
					match(RBRACK);
					}
					break;
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==OTHERWISE) {
					{
					setState(832);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(831);
						match(SEMI);
						}
					}

					setState(834);
					match(OTHERWISE);
					setState(835);
					match(ZERO);
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(836);
						match(SEMI);
						}
					}

					}
				}

				setState(841);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(842);
					typeName();
					}
				}

				setState(845);
				match(LBRACK);
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHR - 81)) | (1L << (NIL - 81)) | (1L << (NOT - 81)) | (1L << (ZERO - 81)) | (1L << (TRUE - 81)) | (1L << (FALSE - 81)) | (1L << (IDENTIFIER - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (STRING_LITERAL - 145)) | (1L << (NUM_INT - 145)) | (1L << (NUM_REAL - 145)) | (1L << (BASE_NUMBER - 145)) | (1L << (BIN_NUMBER - 145)) | (1L << (HEX_NUMBER - 145)) | (1L << (OCT_NUMBER - 145)))) != 0)) {
					{
					setState(846);
					initializerList();
					setState(847);
					match(COLON);
					setState(848);
					constructorRecord();
					setState(856);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(849);
							match(SEMI);
							setState(850);
							initializerList();
							setState(851);
							match(COLON);
							setState(852);
							constructorRecord();
							}
							} 
						}
						setState(858);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
					}
					}
				}

				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(862);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(861);
						match(SEMI);
						}
					}

					setState(864);
					match(CASE);
					setState(868);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(865);
						identifier();
						setState(866);
						match(COLON);
						}
						break;
					}
					setState(870);
					tagValue();
					setState(871);
					match(OF);
					setState(872);
					match(LBRACK);
					{
					setState(873);
					initializerList();
					setState(874);
					match(COLON);
					setState(875);
					constructorRecord();
					setState(883);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(876);
						match(SEMI);
						setState(877);
						initializerList();
						setState(878);
						match(COLON);
						setState(879);
						constructorRecord();
						}
						}
						setState(885);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(886);
					match(RBRACK);
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
					match(ZERO);
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
		enterRule(_localctx, 124, RULE_initializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			initializerItem();
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(904);
				match(COMMA);
				setState(905);
				initializerItem();
				}
				}
				setState(910);
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
		enterRule(_localctx, 126, RULE_initializerItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(911);
				identifier();
				}
				break;
			case 2:
				{
				setState(912);
				match(NUM_INT);
				}
				break;
			case 3:
				{
				setState(913);
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
		enterRule(_localctx, 128, RULE_tagValue);
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
		enterRule(_localctx, 130, RULE_constructorSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(918);
				typeName();
				}
			}

			setState(921);
			match(LBRACK);
			setState(930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHR - 81)) | (1L << (NIL - 81)) | (1L << (NOT - 81)) | (1L << (ZERO - 81)) | (1L << (TRUE - 81)) | (1L << (FALSE - 81)) | (1L << (IDENTIFIER - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (STRING_LITERAL - 145)) | (1L << (NUM_INT - 145)) | (1L << (NUM_REAL - 145)) | (1L << (BASE_NUMBER - 145)) | (1L << (BIN_NUMBER - 145)) | (1L << (HEX_NUMBER - 145)) | (1L << (OCT_NUMBER - 145)))) != 0)) {
				{
				setState(922);
				componentValue();
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI) {
					{
					{
					setState(923);
					match(SEMI);
					setState(924);
					componentValue();
					}
					}
					setState(929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(932);
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
		enterRule(_localctx, 132, RULE_constructorNonStdArray);
		int _la;
		try {
			setState(978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(934);
					typeName();
					}
				}

				setState(937);
				match(LPAREN);
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHR - 81)) | (1L << (NIL - 81)) | (1L << (NOT - 81)) | (1L << (ZERO - 81)) | (1L << (TRUE - 81)) | (1L << (FALSE - 81)) | (1L << (IDENTIFIER - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (STRING_LITERAL - 145)) | (1L << (NUM_INT - 145)) | (1L << (NUM_REAL - 145)) | (1L << (BASE_NUMBER - 145)) | (1L << (BIN_NUMBER - 145)) | (1L << (HEX_NUMBER - 145)) | (1L << (OCT_NUMBER - 145)))) != 0)) {
					{
					setState(938);
					componentValueN();
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(939);
						match(COMMA);
						setState(940);
						componentValueN();
						}
						}
						setState(945);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==REPEAT) {
					{
					setState(949);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(948);
						match(SEMI);
						}
					}

					setState(951);
					match(REPEAT);
					setState(952);
					componentValueN();
					}
				}

				setState(955);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(956);
					typeName();
					}
				}

				setState(959);
				match(LPAREN);
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN || _la==IDENTIFIER) {
					{
					setState(960);
					constructorNonStdArray();
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(961);
						match(COMMA);
						setState(962);
						constructorNonStdArray();
						}
						}
						setState(967);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI || _la==REPEAT) {
					{
					setState(971);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(970);
						match(SEMI);
						}
					}

					setState(973);
					match(REPEAT);
					setState(974);
					constructorNonStdArray();
					}
				}

				setState(977);
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
		enterRule(_localctx, 134, RULE_componentValueN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(980);
				match(NUM_INT);
				setState(981);
				match(OF);
				}
				break;
			}
			setState(984);
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
		enterRule(_localctx, 136, RULE_constructorNonStdRecord);
		int _la;
		try {
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(986);
					typeName();
					}
				}

				setState(989);
				match(LPAREN);
				setState(998);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(990);
					componentValueN();
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(991);
						match(COMMA);
						setState(992);
						componentValueN();
						}
						}
						setState(997);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << SEMI) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHR - 81)) | (1L << (NIL - 81)) | (1L << (NOT - 81)) | (1L << (ZERO - 81)) | (1L << (TRUE - 81)) | (1L << (FALSE - 81)) | (1L << (IDENTIFIER - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (STRING_LITERAL - 145)) | (1L << (NUM_INT - 145)) | (1L << (NUM_REAL - 145)) | (1L << (BASE_NUMBER - 145)) | (1L << (BIN_NUMBER - 145)) | (1L << (HEX_NUMBER - 145)) | (1L << (OCT_NUMBER - 145)))) != 0)) {
					{
					setState(1001);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1000);
						match(SEMI);
						}
					}

					setState(1003);
					tagValue();
					setState(1004);
					match(COMMA);
					setState(1005);
					componentValueN();
					setState(1010);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1006);
						match(SEMI);
						setState(1007);
						componentValueN();
						}
						}
						setState(1012);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1015);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(1016);
					typeName();
					}
				}

				setState(1019);
				match(LPAREN);
				setState(1028);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1020);
					constructorNonStdRecord();
					setState(1025);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1021);
						match(COMMA);
						setState(1022);
						constructorNonStdRecord();
						}
						}
						setState(1027);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << SEMI) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHR - 81)) | (1L << (NIL - 81)) | (1L << (NOT - 81)) | (1L << (ZERO - 81)) | (1L << (TRUE - 81)) | (1L << (FALSE - 81)) | (1L << (IDENTIFIER - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (STRING_LITERAL - 145)) | (1L << (NUM_INT - 145)) | (1L << (NUM_REAL - 145)) | (1L << (BASE_NUMBER - 145)) | (1L << (BIN_NUMBER - 145)) | (1L << (HEX_NUMBER - 145)) | (1L << (OCT_NUMBER - 145)))) != 0)) {
					{
					setState(1031);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1030);
						match(SEMI);
						}
					}

					setState(1033);
					tagValue();
					setState(1034);
					match(COMMA);
					setState(1035);
					constructorNonStdRecord();
					setState(1040);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(1036);
						match(SEMI);
						setState(1037);
						constructorNonStdRecord();
						}
						}
						setState(1042);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1045);
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
		enterRule(_localctx, 138, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(VAR);
			setState(1049);
			variableDeclaration();
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1050);
					match(SEMI);
					setState(1051);
					variableDeclaration();
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(1057);
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
		enterRule(_localctx, 140, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			identifierList();
			setState(1060);
			match(COLON);
			setState(1061);
			attributePart();
			setState(1062);
			type();
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==VALUE) {
				{
				setState(1063);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(pascalParser.VALUE, 0); }
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public TerminalNode ZERO() { return getToken(pascalParser.ZERO, 0); }
		public ConstructorValueContext constructorValue() {
			return getRuleContext(ConstructorValueContext.class,0);
		}
		public VariablePreDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablePreDeclaration; }
	}

	public final VariablePreDeclarationContext variablePreDeclaration() throws RecognitionException {
		VariablePreDeclarationContext _localctx = new VariablePreDeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_variablePreDeclaration);
		int _la;
		try {
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1067);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1069);
				signedFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1070);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1071);
				match(ZERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1072);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1073);
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
		public TerminalNode TO() { return getToken(pascalParser.TO, 0); }
		public TerminalNode DO() { return getToken(pascalParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ToBeginEndDoDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toBeginEndDoDeclarationPart; }
	}

	public final ToBeginEndDoDeclarationPartContext toBeginEndDoDeclarationPart() throws RecognitionException {
		ToBeginEndDoDeclarationPartContext _localctx = new ToBeginEndDoDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_toBeginEndDoDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			match(TO);
			setState(1077);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1078);
			match(DO);
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1079);
				compoundStatement();
				}
				break;
			case 2:
				{
				setState(1080);
				statement();
				}
				break;
			}
			setState(1083);
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

	public static class ProcedureAndFunctionDeclarationPartContext extends ParserRuleContext {
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
		}
		public ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() {
			return getRuleContext(ProcedureOrFunctionDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 146, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			attributePart();
			setState(1086);
			procedureOrFunctionDeclaration();
			setState(1092);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
			case BEGIN:
			case CONST:
			case END:
			case FUNCTION:
			case LABEL:
			case PROCEDURE:
			case TO:
			case TYPE:
			case VAR:
			case USES:
			case IMPLEMENTATION:
				{
				setState(1087);
				block();
				}
				break;
			case EXTERN:
				{
				setState(1088);
				match(EXTERN);
				}
				break;
			case EXTERNAL:
				{
				setState(1089);
				match(EXTERNAL);
				}
				break;
			case FORTRAN:
				{
				setState(1090);
				match(FORTRAN);
				}
				break;
			case FORWARD:
				{
				setState(1091);
				match(FORWARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1094);
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
		enterRule(_localctx, 148, RULE_procedureOrFunctionDeclaration);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1096);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097);
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
		enterRule(_localctx, 150, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			match(PROCEDURE);
			setState(1101);
			identifier();
			setState(1103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1102);
				formalParameterList();
				}
			}

			setState(1105);
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
		enterRule(_localctx, 152, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(LPAREN);
			setState(1108);
			formalParameterSection();
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(1109);
				match(SEMI);
				setState(1110);
				formalParameterSection();
				}
				}
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1116);
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
		enterRule(_localctx, 154, RULE_formalParameterSection);
		int _la;
		try {
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				parameterGroup();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1119);
				match(VAR);
				setState(1120);
				parameterGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1121);
				attributePart();
				setState(1122);
				match(FUNCTION);
				setState(1123);
				identifier();
				setState(1125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1124);
					formalParameterList();
					}
				}

				setState(1127);
				match(COLON);
				setState(1128);
				attributePart();
				setState(1129);
				resultType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1131);
				attributePart();
				setState(1132);
				match(PROCEDURE);
				setState(1133);
				identifier();
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1134);
					formalParameterList();
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
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_parameterGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			identifierList();
			setState(1140);
			match(COLON);
			setState(1141);
			attributePart();
			setState(1142);
			type();
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1143);
				match(ASSIGN);
				setState(1144);
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
		enterRule(_localctx, 158, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			identifier();
			setState(1152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1148);
				match(COMMA);
				setState(1149);
				identifier();
				}
				}
				setState(1154);
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
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			constant();
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==DOTDOT) {
				{
				{
				setState(1156);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==DOTDOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1157);
				constant();
				}
				}
				setState(1162);
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
		enterRule(_localctx, 162, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			match(FUNCTION);
			setState(1164);
			identifier();
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1165);
				formalParameterList();
				}
			}

			setState(1168);
			match(COLON);
			setState(1169);
			attributePart();
			setState(1170);
			resultType();
			setState(1171);
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
		enterRule(_localctx, 164, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
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
		enterRule(_localctx, 166, RULE_statement);
		try {
			setState(1180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1175);
				label();
				setState(1176);
				match(COLON);
				setState(1177);
				unlabelledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179);
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
		enterRule(_localctx, 168, RULE_unlabelledStatement);
		try {
			setState(1184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
			case ATP:
			case ELSE:
			case END:
			case GOTO:
			case UNTIL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
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
				setState(1183);
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
		enterRule(_localctx, 170, RULE_simpleStatement);
		try {
			setState(1190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1186);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1187);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1188);
				gotoStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1189);
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
		enterRule(_localctx, 172, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			variable();
			setState(1193);
			match(ASSIGN);
			setState(1194);
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
		public List<TerminalNode> POINTER() { return getTokens(pascalParser.POINTER); }
		public TerminalNode POINTER(int i) {
			return getToken(pascalParser.POINTER, i);
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
		enterRule(_localctx, 174, RULE_variable);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATP:
				{
				setState(1196);
				match(ATP);
				setState(1197);
				identifier();
				}
				break;
			case IDENTIFIER:
				{
				setState(1198);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1226);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRACK:
						{
						setState(1201);
						match(LBRACK);
						setState(1202);
						expression();
						setState(1207);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1203);
							match(COMMA);
							setState(1204);
							expression();
							}
							}
							setState(1209);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1210);
						match(RBRACK);
						}
						break;
					case LBRACK2:
						{
						setState(1212);
						match(LBRACK2);
						setState(1213);
						expression();
						setState(1218);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1214);
							match(COMMA);
							setState(1215);
							expression();
							}
							}
							setState(1220);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1221);
						match(RBRACK2);
						}
						break;
					case DOT:
						{
						setState(1223);
						match(DOT);
						setState(1224);
						identifier();
						}
						break;
					case POINTER:
						{
						setState(1225);
						match(POINTER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
			}
			setState(1234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1231);
				match(COLON);
				setState(1232);
				match(COLON);
				setState(1233);
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
		enterRule(_localctx, 176, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236);
			simpleExpression();
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0) || _la==IN) {
				{
				setState(1237);
				relationaloperator();
				setState(1238);
				expression();
				}
			}

			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1242);
				match(COLON);
				setState(1243);
				match(COLON);
				setState(1244);
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
		public TerminalNode LT() { return getToken(pascalParser.LT, 0); }
		public TerminalNode LE() { return getToken(pascalParser.LE, 0); }
		public TerminalNode GE() { return getToken(pascalParser.GE, 0); }
		public TerminalNode GT() { return getToken(pascalParser.GT, 0); }
		public TerminalNode IN() { return getToken(pascalParser.IN, 0); }
		public RelationaloperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationaloperator; }
	}

	public final RelationaloperatorContext relationaloperator() throws RecognitionException {
		RelationaloperatorContext _localctx = new RelationaloperatorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0) || _la==IN) ) {
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
		enterRule(_localctx, 180, RULE_simpleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			term();
			setState(1253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1250);
				additiveoperator();
				setState(1251);
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
		public AdditiveoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveoperator; }
	}

	public final AdditiveoperatorContext additiveoperator() throws RecognitionException {
		AdditiveoperatorContext _localctx = new AdditiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS || _la==OR) ) {
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
		enterRule(_localctx, 184, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			signedFactor();
			setState(1261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR || _la==SLASH || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (AND - 75)) | (1L << (DIV - 75)) | (1L << (MOD - 75)))) != 0)) {
				{
				setState(1258);
				multiplicativeoperator();
				setState(1259);
				term();
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

	public static class MultiplicativeoperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(pascalParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(pascalParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(pascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(pascalParser.MOD, 0); }
		public TerminalNode AND() { return getToken(pascalParser.AND, 0); }
		public MultiplicativeoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeoperator; }
	}

	public final MultiplicativeoperatorContext multiplicativeoperator() throws RecognitionException {
		MultiplicativeoperatorContext _localctx = new MultiplicativeoperatorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==SLASH || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (AND - 75)) | (1L << (DIV - 75)) | (1L << (MOD - 75)))) != 0)) ) {
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
		enterRule(_localctx, 188, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1265);
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

			setState(1268);
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
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_factor);
		try {
			setState(1281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1270);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1271);
				match(LPAREN);
				setState(1272);
				expression();
				setState(1273);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1275);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1276);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1277);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1278);
				match(NOT);
				setState(1279);
				factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1280);
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

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode NIL() { return getToken(pascalParser.NIL, 0); }
		public TerminalNode ZERO() { return getToken(pascalParser.ZERO, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(pascalParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(pascalParser.LPAREN, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(pascalParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(pascalParser.RPAREN, i);
		}
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_unsignedConstant);
		try {
			int _alt;
			setState(1300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1283);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1284);
				constantChr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1285);
				string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1286);
				match(NIL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1287);
				match(ZERO);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1288);
				string();
				setState(1297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1289);
						match(LPAREN);
						setState(1290);
						identifier();
						setState(1291);
						match(RPAREN);
						setState(1293);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
						case 1:
							{
							setState(1292);
							string();
							}
							break;
						}
						}
						} 
					}
					setState(1299);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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
		enterRule(_localctx, 194, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			identifier();
			setState(1303);
			match(LPAREN);
			setState(1304);
			parameterList();
			setState(1305);
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
		enterRule(_localctx, 196, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHR - 81)) | (1L << (NIL - 81)) | (1L << (NOT - 81)) | (1L << (ZERO - 81)) | (1L << (TRUE - 81)) | (1L << (FALSE - 81)) | (1L << (IDENTIFIER - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (STRING_LITERAL - 145)) | (1L << (NUM_INT - 145)) | (1L << (NUM_REAL - 145)) | (1L << (BASE_NUMBER - 145)) | (1L << (BIN_NUMBER - 145)) | (1L << (HEX_NUMBER - 145)) | (1L << (OCT_NUMBER - 145)))) != 0)) {
				{
				setState(1307);
				actualParameter();
				}
			}

			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1310);
				match(COMMA);
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHR - 81)) | (1L << (NIL - 81)) | (1L << (NOT - 81)) | (1L << (ZERO - 81)) | (1L << (TRUE - 81)) | (1L << (FALSE - 81)) | (1L << (IDENTIFIER - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (STRING_LITERAL - 145)) | (1L << (NUM_INT - 145)) | (1L << (NUM_REAL - 145)) | (1L << (BASE_NUMBER - 145)) | (1L << (BIN_NUMBER - 145)) | (1L << (HEX_NUMBER - 145)) | (1L << (OCT_NUMBER - 145)))) != 0)) {
					{
					setState(1311);
					actualParameter();
					}
				}

				}
				}
				setState(1318);
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
		enterRule(_localctx, 198, RULE_set);
		try {
			setState(1328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1319);
				match(LBRACK);
				setState(1320);
				elementList();
				setState(1321);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1323);
				match(LBRACK2);
				setState(1324);
				elementList();
				setState(1325);
				match(RBRACK2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1327);
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
		enterRule(_localctx, 200, RULE_elementList);
		int _la;
		try {
			setState(1339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case LPAREN:
			case LBRACK:
			case LBRACK2:
			case ATP:
			case CHR:
			case NIL:
			case NOT:
			case ZERO:
			case TRUE:
			case FALSE:
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
				setState(1330);
				element();
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1331);
					match(COMMA);
					setState(1332);
					element();
					}
					}
					setState(1337);
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
		enterRule(_localctx, 202, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			expression();
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(1342);
				match(DOTDOT);
				setState(1343);
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
		enterRule(_localctx, 204, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			identifier();
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1347);
				match(LPAREN);
				setState(1348);
				parameterList();
				setState(1349);
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
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_actualParameter);
		int _la;
		try {
			setState(1364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1353);
				expression();
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COLON) {
					{
					{
					setState(1354);
					parameterwidth();
					}
					}
					setState(1359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				identifier();
				setState(1361);
				match(ASSIGN);
				setState(1362);
				identifier();
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
		enterRule(_localctx, 208, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			match(COLON);
			setState(1367);
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
		enterRule(_localctx, 210, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			match(GOTO);
			setState(1370);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_emptyStatement);
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

	public static class EmptyContext extends ParserRuleContext {
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_empty);
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
		enterRule(_localctx, 216, RULE_structuredStatement);
		try {
			setState(1380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1376);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1378);
				repetetiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1379);
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
		enterRule(_localctx, 218, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			match(BEGIN);
			setState(1383);
			statements();
			setState(1384);
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
		enterRule(_localctx, 220, RULE_openCompoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			statements();
			setState(1387);
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
		enterRule(_localctx, 222, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1389);
			statement();
			setState(1394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1390);
					match(SEMI);
					setState(1391);
					statement();
					}
					} 
				}
				setState(1396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
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
		enterRule(_localctx, 224, RULE_conditionalStatement);
		try {
			setState(1399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1397);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1398);
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
		public TerminalNode ELSE() { return getToken(pascalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(IF);
			setState(1402);
			expression();
			setState(1403);
			match(THEN);
			setState(1404);
			statement();
			setState(1407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1405);
				match(ELSE);
				setState(1406);
				statement();
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
		public List<CaseListElementContext> caseListElement() {
			return getRuleContexts(CaseListElementContext.class);
		}
		public CaseListElementContext caseListElement(int i) {
			return getRuleContext(CaseListElementContext.class,i);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public TerminalNode ELSE() { return getToken(pascalParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(CASE);
			setState(1410);
			expression();
			setState(1411);
			match(OF);
			setState(1412);
			caseListElement();
			setState(1417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1413);
					match(SEMI);
					setState(1414);
					caseListElement();
					}
					} 
				}
				setState(1419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1420);
				match(SEMI);
				setState(1421);
				match(ELSE);
				setState(1422);
				statements();
				}
				break;
			}
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1425);
				match(SEMI);
				}
			}

			setState(1428);
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
		enterRule(_localctx, 230, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			constList();
			setState(1431);
			match(COLON);
			setState(1432);
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
		enterRule(_localctx, 232, RULE_repetetiveStatement);
		try {
			setState(1437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1434);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1435);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1436);
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
		enterRule(_localctx, 234, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			match(WHILE);
			setState(1440);
			expression();
			setState(1441);
			match(DO);
			setState(1442);
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
		enterRule(_localctx, 236, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(REPEAT);
			setState(1445);
			statements();
			setState(1446);
			match(UNTIL);
			setState(1447);
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
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			match(FOR);
			setState(1450);
			identifier();
			setState(1451);
			match(ASSIGN);
			setState(1452);
			forList();
			setState(1453);
			match(DO);
			setState(1454);
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
		enterRule(_localctx, 240, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			initialValue();
			setState(1457);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1458);
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
		enterRule(_localctx, 242, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
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
		enterRule(_localctx, 244, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
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
		enterRule(_localctx, 246, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			match(WITH);
			setState(1465);
			recordVariableList();
			setState(1466);
			match(DO);
			setState(1467);
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
		public RecordVariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariableList; }
	}

	public final RecordVariableListContext recordVariableList() throws RecognitionException {
		RecordVariableListContext _localctx = new RecordVariableListContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_recordVariableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			variable();
			setState(1474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1470);
				match(COMMA);
				setState(1471);
				variable();
				}
				}
				setState(1476);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0099\u05c8\4\2\t"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\3\2\3\2\5\2\u00ff\n\2\3"+
		"\2\3\2\3\2\3\3\5\3\u0105\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u010d\n\3\3\3"+
		"\3\3\3\3\5\3\u0112\n\3\3\3\3\3\3\3\3\3\5\3\u0118\n\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\7\5\u0123\n\5\f\5\16\5\u0126\13\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u0130\n\6\3\6\3\6\5\6\u0134\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u013f\n\6\3\6\3\6\5\6\u0143\n\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\7\b\u014b\n\b\f\b\16\b\u014e\13\b\3\b\3\b\5\b\u0152\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\7\t\u0159\n\t\f\t\16\t\u015c\13\t\3\t\3\t\5\t\u0160\n\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u016b\n\13\f\13\16\13\u016e"+
		"\13\13\3\13\7\13\u0171\n\13\f\13\16\13\u0174\13\13\3\13\3\13\5\13\u0178"+
		"\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0182\n\r\f\r\16\r\u0185\13"+
		"\r\3\r\3\r\3\16\3\16\5\16\u018b\n\16\3\17\3\17\3\17\3\17\6\17\u0191\n"+
		"\17\r\17\16\17\u0192\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u01aa\n\22"+
		"\3\23\3\23\5\23\u01ae\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\6\31\u01be\n\31\r\31\16\31\u01bf\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u01c8\n\32\3\32\5\32\u01cb\n\32\3\33\3\33\5\33"+
		"\u01cf\n\33\3\33\3\33\3\33\3\34\3\34\5\34\u01d6\n\34\3\35\3\35\3\35\5"+
		"\35\u01db\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u01e2\n\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01f6\n \3!\3!\3!\3"+
		"!\3!\5!\u01fd\n!\3\"\3\"\3\"\5\"\u0202\n\"\3#\3#\3#\3#\3#\3#\5#\u020a"+
		"\n#\3$\3$\3$\3$\5$\u0210\n$\3$\3$\3%\3%\3%\3%\3%\5%\u0219\n%\3%\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u022e\n&\3\'\3\'\3"+
		"\'\7\'\u0233\n\'\f\'\16\'\u0236\13\'\3(\3(\3(\3)\3)\3)\3*\3*\5*\u0240"+
		"\n*\3*\5*\u0243\n*\3*\3*\3+\3+\3+\5+\u024a\n+\3+\5+\u024d\n+\3,\3,\3,"+
		"\7,\u0252\n,\f,\16,\u0255\13,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\7.\u0262"+
		"\n.\f.\16.\u0265\13.\3.\5.\u0268\n.\3.\3.\3.\3.\3.\5.\u026f\n.\3/\3/\3"+
		"/\5/\u0274\n/\3/\3/\3/\3/\5/\u027a\n/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\7\66\u029b\n\66"+
		"\f\66\16\66\u029e\13\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\7\67\u02a8"+
		"\n\67\f\67\16\67\u02ab\13\67\3\67\3\67\3\67\3\67\38\38\58\u02b3\n8\39"+
		"\39\39\39\39\79\u02ba\n9\f9\169\u02bd\139\39\39\3:\3:\3:\7:\u02c4\n:\f"+
		":\16:\u02c7\13:\3;\3;\3;\3;\3;\5;\u02ce\n;\3<\5<\u02d1\n<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\7<\u02dc\n<\f<\16<\u02df\13<\5<\u02e1\n<\3<\5<\u02e4\n"+
		"<\3<\3<\3<\5<\u02e9\n<\5<\u02eb\n<\3<\3<\5<\u02ef\n<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\7<\u02fa\n<\f<\16<\u02fd\13<\5<\u02ff\n<\3<\5<\u0302\n<\3<"+
		"\3<\3<\5<\u0307\n<\5<\u0309\n<\3<\5<\u030c\n<\3=\3=\3>\3>\3?\5?\u0313"+
		"\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u031e\n?\f?\16?\u0321\13?\5?\u0323\n"+
		"?\3?\5?\u0326\n?\3?\3?\3?\3?\5?\u032c\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\7?\u0339\n?\f?\16?\u033c\13?\3?\3?\5?\u0340\n?\3?\5?\u0343\n?\3?"+
		"\3?\3?\5?\u0348\n?\5?\u034a\n?\3?\3?\5?\u034e\n?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\3?\7?\u0359\n?\f?\16?\u035c\13?\5?\u035e\n?\3?\5?\u0361\n?\3?\3?\3"+
		"?\3?\5?\u0367\n?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u0374\n?\f?\16?\u0377"+
		"\13?\3?\3?\5?\u037b\n?\3?\5?\u037e\n?\3?\3?\3?\5?\u0383\n?\5?\u0385\n"+
		"?\3?\5?\u0388\n?\3@\3@\3@\7@\u038d\n@\f@\16@\u0390\13@\3A\3A\3A\5A\u0395"+
		"\nA\3B\3B\3C\5C\u039a\nC\3C\3C\3C\3C\7C\u03a0\nC\fC\16C\u03a3\13C\5C\u03a5"+
		"\nC\3C\3C\3D\5D\u03aa\nD\3D\3D\3D\3D\7D\u03b0\nD\fD\16D\u03b3\13D\5D\u03b5"+
		"\nD\3D\5D\u03b8\nD\3D\3D\5D\u03bc\nD\3D\3D\5D\u03c0\nD\3D\3D\3D\3D\7D"+
		"\u03c6\nD\fD\16D\u03c9\13D\5D\u03cb\nD\3D\5D\u03ce\nD\3D\3D\5D\u03d2\n"+
		"D\3D\5D\u03d5\nD\3E\3E\5E\u03d9\nE\3E\3E\3F\5F\u03de\nF\3F\3F\3F\3F\7"+
		"F\u03e4\nF\fF\16F\u03e7\13F\5F\u03e9\nF\3F\5F\u03ec\nF\3F\3F\3F\3F\3F"+
		"\7F\u03f3\nF\fF\16F\u03f6\13F\5F\u03f8\nF\3F\3F\5F\u03fc\nF\3F\3F\3F\3"+
		"F\7F\u0402\nF\fF\16F\u0405\13F\5F\u0407\nF\3F\5F\u040a\nF\3F\3F\3F\3F"+
		"\3F\7F\u0411\nF\fF\16F\u0414\13F\5F\u0416\nF\3F\5F\u0419\nF\3G\3G\3G\3"+
		"G\7G\u041f\nG\fG\16G\u0422\13G\3G\3G\3H\3H\3H\3H\3H\5H\u042b\nH\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\5I\u0435\nI\3J\3J\3J\3J\3J\5J\u043c\nJ\3J\3J\3K\3K"+
		"\3K\3K\3K\3K\3K\5K\u0447\nK\3K\3K\3L\3L\5L\u044d\nL\3M\3M\3M\5M\u0452"+
		"\nM\3M\3M\3N\3N\3N\3N\7N\u045a\nN\fN\16N\u045d\13N\3N\3N\3O\3O\3O\3O\3"+
		"O\3O\3O\5O\u0468\nO\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0472\nO\5O\u0474\nO\3"+
		"P\3P\3P\3P\3P\3P\5P\u047c\nP\3Q\3Q\3Q\7Q\u0481\nQ\fQ\16Q\u0484\13Q\3R"+
		"\3R\3R\7R\u0489\nR\fR\16R\u048c\13R\3S\3S\3S\5S\u0491\nS\3S\3S\3S\3S\3"+
		"S\3T\3T\3U\3U\3U\3U\3U\5U\u049f\nU\3V\3V\5V\u04a3\nV\3W\3W\3W\3W\5W\u04a9"+
		"\nW\3X\3X\3X\3X\3Y\3Y\3Y\5Y\u04b2\nY\3Y\3Y\3Y\3Y\7Y\u04b8\nY\fY\16Y\u04bb"+
		"\13Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u04c3\nY\fY\16Y\u04c6\13Y\3Y\3Y\3Y\3Y\3Y\7Y"+
		"\u04cd\nY\fY\16Y\u04d0\13Y\3Y\3Y\3Y\5Y\u04d5\nY\3Z\3Z\3Z\3Z\5Z\u04db\n"+
		"Z\3Z\3Z\3Z\5Z\u04e0\nZ\3[\3[\3\\\3\\\3\\\3\\\5\\\u04e8\n\\\3]\3]\3^\3"+
		"^\3^\3^\5^\u04f0\n^\3_\3_\3`\5`\u04f5\n`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\3a\5a\u0504\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0510\nb\7b\u0512"+
		"\nb\fb\16b\u0515\13b\5b\u0517\nb\3c\3c\3c\3c\3c\3d\5d\u051f\nd\3d\3d\5"+
		"d\u0523\nd\7d\u0525\nd\fd\16d\u0528\13d\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e"+
		"\u0533\ne\3f\3f\3f\7f\u0538\nf\ff\16f\u053b\13f\3f\5f\u053e\nf\3g\3g\3"+
		"g\5g\u0543\ng\3h\3h\3h\3h\3h\5h\u054a\nh\3i\3i\7i\u054e\ni\fi\16i\u0551"+
		"\13i\3i\3i\3i\3i\5i\u0557\ni\3j\3j\3j\3k\3k\3k\3l\3l\3m\3m\3n\3n\3n\3"+
		"n\5n\u0567\nn\3o\3o\3o\3o\3p\3p\3p\3q\3q\3q\7q\u0573\nq\fq\16q\u0576\13"+
		"q\3r\3r\5r\u057a\nr\3s\3s\3s\3s\3s\3s\5s\u0582\ns\3t\3t\3t\3t\3t\3t\7"+
		"t\u058a\nt\ft\16t\u058d\13t\3t\3t\3t\5t\u0592\nt\3t\5t\u0595\nt\3t\3t"+
		"\3u\3u\3u\3u\3v\3v\3v\5v\u05a0\nv\3w\3w\3w\3w\3w\3x\3x\3x\3x\3x\3y\3y"+
		"\3y\3y\3y\3y\3y\3z\3z\3z\3z\3{\3{\3|\3|\3}\3}\3}\3}\3}\3~\3~\3~\7~\u05c3"+
		"\n~\f~\16~\u05c6\13~\3~\2\2\177\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\2\21\5\2\36DIL\u0083\u0083\4\2\u0094\u0094\u0096\u0099\3\2\3\4\3\2\u008d"+
		"\u008e\7\2PPRRbbxx\u008b\u008b\3\2cf\3\2gl\3\2yz\4\2\7\7\u0083\u0083\4"+
		"\2OOYY\4\2\b\b\32\32\4\2\13\20``\4\2\3\4ss\6\2\5\6MMUUnn\4\2WW\u0080\u0080"+
		"\2\u0628\2\u00fc\3\2\2\2\4\u0117\3\2\2\2\6\u0119\3\2\2\2\b\u011d\3\2\2"+
		"\2\n\u0142\3\2\2\2\f\u0144\3\2\2\2\16\u0151\3\2\2\2\20\u0153\3\2\2\2\22"+
		"\u0161\3\2\2\2\24\u016c\3\2\2\2\26\u0179\3\2\2\2\30\u017d\3\2\2\2\32\u018a"+
		"\3\2\2\2\34\u018c\3\2\2\2\36\u0194\3\2\2\2 \u0199\3\2\2\2\"\u01a9\3\2"+
		"\2\2$\u01ad\3\2\2\2&\u01af\3\2\2\2(\u01b1\3\2\2\2*\u01b3\3\2\2\2,\u01b5"+
		"\3\2\2\2.\u01b7\3\2\2\2\60\u01b9\3\2\2\2\62\u01ca\3\2\2\2\64\u01cc\3\2"+
		"\2\2\66\u01d3\3\2\2\28\u01da\3\2\2\2:\u01e1\3\2\2\2<\u01e3\3\2\2\2>\u01f5"+
		"\3\2\2\2@\u01fc\3\2\2\2B\u0201\3\2\2\2D\u0209\3\2\2\2F\u020b\3\2\2\2H"+
		"\u0213\3\2\2\2J\u022d\3\2\2\2L\u022f\3\2\2\2N\u0237\3\2\2\2P\u023a\3\2"+
		"\2\2R\u023d\3\2\2\2T\u024c\3\2\2\2V\u024e\3\2\2\2X\u0256\3\2\2\2Z\u025b"+
		"\3\2\2\2\\\u0279\3\2\2\2^\u027b\3\2\2\2`\u0281\3\2\2\2b\u0286\3\2\2\2"+
		"d\u0288\3\2\2\2f\u028d\3\2\2\2h\u0290\3\2\2\2j\u0295\3\2\2\2l\u02a4\3"+
		"\2\2\2n\u02b2\3\2\2\2p\u02b4\3\2\2\2r\u02c0\3\2\2\2t\u02cd\3\2\2\2v\u030b"+
		"\3\2\2\2x\u030d\3\2\2\2z\u030f\3\2\2\2|\u0387\3\2\2\2~\u0389\3\2\2\2\u0080"+
		"\u0394\3\2\2\2\u0082\u0396\3\2\2\2\u0084\u0399\3\2\2\2\u0086\u03d4\3\2"+
		"\2\2\u0088\u03d8\3\2\2\2\u008a\u0418\3\2\2\2\u008c\u041a\3\2\2\2\u008e"+
		"\u0425\3\2\2\2\u0090\u0434\3\2\2\2\u0092\u0436\3\2\2\2\u0094\u043f\3\2"+
		"\2\2\u0096\u044c\3\2\2\2\u0098\u044e\3\2\2\2\u009a\u0455\3\2\2\2\u009c"+
		"\u0473\3\2\2\2\u009e\u0475\3\2\2\2\u00a0\u047d\3\2\2\2\u00a2\u0485\3\2"+
		"\2\2\u00a4\u048d\3\2\2\2\u00a6\u0497\3\2\2\2\u00a8\u049e\3\2\2\2\u00aa"+
		"\u04a2\3\2\2\2\u00ac\u04a8\3\2\2\2\u00ae\u04aa\3\2\2\2\u00b0\u04b1\3\2"+
		"\2\2\u00b2\u04d6\3\2\2\2\u00b4\u04e1\3\2\2\2\u00b6\u04e3\3\2\2\2\u00b8"+
		"\u04e9\3\2\2\2\u00ba\u04eb\3\2\2\2\u00bc\u04f1\3\2\2\2\u00be\u04f4\3\2"+
		"\2\2\u00c0\u0503\3\2\2\2\u00c2\u0516\3\2\2\2\u00c4\u0518\3\2\2\2\u00c6"+
		"\u051e\3\2\2\2\u00c8\u0532\3\2\2\2\u00ca\u053d\3\2\2\2\u00cc\u053f\3\2"+
		"\2\2\u00ce\u0544\3\2\2\2\u00d0\u0556\3\2\2\2\u00d2\u0558\3\2\2\2\u00d4"+
		"\u055b\3\2\2\2\u00d6\u055e\3\2\2\2\u00d8\u0560\3\2\2\2\u00da\u0566\3\2"+
		"\2\2\u00dc\u0568\3\2\2\2\u00de\u056c\3\2\2\2\u00e0\u056f\3\2\2\2\u00e2"+
		"\u0579\3\2\2\2\u00e4\u057b\3\2\2\2\u00e6\u0583\3\2\2\2\u00e8\u0598\3\2"+
		"\2\2\u00ea\u059f\3\2\2\2\u00ec\u05a1\3\2\2\2\u00ee\u05a6\3\2\2\2\u00f0"+
		"\u05ab\3\2\2\2\u00f2\u05b2\3\2\2\2\u00f4\u05b6\3\2\2\2\u00f6\u05b8\3\2"+
		"\2\2\u00f8\u05ba\3\2\2\2\u00fa\u05bf\3\2\2\2\u00fc\u00fe\5\4\3\2\u00fd"+
		"\u00ff\7\u0089\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\5\24\13\2\u0101\u0102\7\31\2\2\u0102\3\3\2\2\2\u0103"+
		"\u0105\5\6\4\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\7w\2\2\u0107\u010c\5\f\7\2\u0108\u0109\7\21\2\2\u0109"+
		"\u010a\5\u00a0Q\2\u010a\u010b\7\22\2\2\u010b\u010d\3\2\2\2\u010c\u0108"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\t\2\2\u010f"+
		"\u0118\3\2\2\2\u0110\u0112\5\n\6\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7o\2\2\u0114\u0115\5\f\7\2\u0115"+
		"\u0116\7\t\2\2\u0116\u0118\3\2\2\2\u0117\u0104\3\2\2\2\u0117\u0111\3\2"+
		"\2\2\u0118\5\3\2\2\2\u0119\u011a\7\23\2\2\u011a\u011b\5\b\5\2\u011b\u011c"+
		"\7\25\2\2\u011c\7\3\2\2\2\u011d\u011e\7a\2\2\u011e\u011f\7\21\2\2\u011f"+
		"\u0124\5.\30\2\u0120\u0121\7\b\2\2\u0121\u0123\5.\30\2\u0122\u0120\3\2"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\22\2\2\u0128\t\3\2\2"+
		"\2\u0129\u012a\7\23\2\2\u012a\u012f\7Z\2\2\u012b\u012c\7\21\2\2\u012c"+
		"\u012d\5.\30\2\u012d\u012e\7\22\2\2\u012e\u0130\3\2\2\2\u012f\u012b\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u0132\7\b\2\2\u0132"+
		"\u0134\5\b\5\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0143\7\25\2\2\u0136\u0137\7\23\2\2\u0137\u0138\5\b\5\2\u0138"+
		"\u0139\7\b\2\2\u0139\u013e\7Z\2\2\u013a\u013b\7\21\2\2\u013b\u013c\5."+
		"\30\2\u013c\u013d\7\22\2\2\u013d\u013f\3\2\2\2\u013e\u013a\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\25\2\2\u0141\u0143\3"+
		"\2\2\2\u0142\u0129\3\2\2\2\u0142\u0136\3\2\2\2\u0143\13\3\2\2\2\u0144"+
		"\u0145\7\u0092\2\2\u0145\r\3\2\2\2\u0146\u0147\7\23\2\2\u0147\u014c\5"+
		"\20\t\2\u0148\u0149\7\b\2\2\u0149\u014b\5\20\t\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7\25\2\2\u0150\u0152\3\2\2\2\u0151"+
		"\u0146\3\2\2\2\u0151\u0152\3\2\2\2\u0152\17\3\2\2\2\u0153\u015f\5\22\n"+
		"\2\u0154\u0155\7\21\2\2\u0155\u015a\5\"\22\2\u0156\u0157\7\b\2\2\u0157"+
		"\u0159\5\"\22\2\u0158\u0156\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3"+
		"\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d"+
		"\u015e\7\22\2\2\u015e\u0160\3\2\2\2\u015f\u0154\3\2\2\2\u015f\u0160\3"+
		"\2\2\2\u0160\21\3\2\2\2\u0161\u0162\t\2\2\2\u0162\23\3\2\2\2\u0163\u016b"+
		"\5\30\r\2\u0164\u016b\5\34\17\2\u0165\u016b\5\60\31\2\u0166\u016b\5\u008c"+
		"G\2\u0167\u016b\5\u0094K\2\u0168\u016b\5\26\f\2\u0169\u016b\7\u008c\2"+
		"\2\u016a\u0163\3\2\2\2\u016a\u0164\3\2\2\2\u016a\u0165\3\2\2\2\u016a\u0166"+
		"\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016b"+
		"\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0172\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016f\u0171\5\u0092J\2\u0170\u016f\3\2\2\2\u0171"+
		"\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0177\3\2"+
		"\2\2\u0174\u0172\3\2\2\2\u0175\u0178\5\u00dco\2\u0176\u0178\7Y\2\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178\25\3\2\2\2\u0179\u017a\7\u008a"+
		"\2\2\u017a\u017b\5\u00a0Q\2\u017b\u017c\7\t\2\2\u017c\27\3\2\2\2\u017d"+
		"\u017e\7m\2\2\u017e\u0183\5\32\16\2\u017f\u0180\7\b\2\2\u0180\u0182\5"+
		"\32\16\2\u0181\u017f\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7\t"+
		"\2\2\u0187\31\3\2\2\2\u0188\u018b\5&\24\2\u0189\u018b\5\f\7\2\u018a\u0188"+
		"\3\2\2\2\u018a\u0189\3\2\2\2\u018b\33\3\2\2\2\u018c\u0190\7T\2\2\u018d"+
		"\u018e\5\36\20\2\u018e\u018f\7\t\2\2\u018f\u0191\3\2\2\2\u0190\u018d\3"+
		"\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\35\3\2\2\2\u0194\u0195\5\f\7\2\u0195\u0196\7\13\2\2\u0196\u0197\5\16"+
		"\b\2\u0197\u0198\5\"\22\2\u0198\37\3\2\2\2\u0199\u019a\7S\2\2\u019a\u019b"+
		"\7\21\2\2\u019b\u019c\5&\24\2\u019c\u019d\7\22\2\2\u019d!\3\2\2\2\u019e"+
		"\u01aa\5$\23\2\u019f\u01a0\5*\26\2\u01a0\u01a1\5$\23\2\u01a1\u01aa\3\2"+
		"\2\2\u01a2\u01aa\5\f\7\2\u01a3\u01a4\5*\26\2\u01a4\u01a5\5\f\7\2\u01a5"+
		"\u01aa\3\2\2\2\u01a6\u01aa\5.\30\2\u01a7\u01aa\5 \21\2\u01a8\u01aa\5,"+
		"\27\2\u01a9\u019e\3\2\2\2\u01a9\u019f\3\2\2\2\u01a9\u01a2\3\2\2\2\u01a9"+
		"\u01a3\3\2\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2"+
		"\2\2\u01aa#\3\2\2\2\u01ab\u01ae\5&\24\2\u01ac\u01ae\5(\25\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae%\3\2\2\2\u01af\u01b0\t\3\2\2\u01b0"+
		"\'\3\2\2\2\u01b1\u01b2\7\u0095\2\2\u01b2)\3\2\2\2\u01b3\u01b4\t\4\2\2"+
		"\u01b4+\3\2\2\2\u01b5\u01b6\t\5\2\2\u01b6-\3\2\2\2\u01b7\u01b8\7\u0093"+
		"\2\2\u01b8/\3\2\2\2\u01b9\u01bd\7\u0081\2\2\u01ba\u01bb\5\62\32\2\u01bb"+
		"\u01bc\7\t\2\2\u01bc\u01be\3\2\2\2\u01bd\u01ba\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\61\3\2\2\2\u01c1\u01c2"+
		"\5\f\7\2\u01c2\u01c3\7\13\2\2\u01c3\u01c7\5\16\b\2\u01c4\u01c8\58\35\2"+
		"\u01c5\u01c8\5\64\33\2\u01c6\u01c8\5\66\34\2\u01c7\u01c4\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01cb\5j"+
		"\66\2\u01ca\u01c1\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\63\3\2\2\2\u01cc\u01ce"+
		"\7]\2\2\u01cd\u01cf\5\u009aN\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2"+
		"\u01cf\u01d0\3\2\2\2\u01d0\u01d1\7\n\2\2\u01d1\u01d2\5\u00a6T\2\u01d2"+
		"\65\3\2\2\2\u01d3\u01d5\7v\2\2\u01d4\u01d6\5\u009aN\2\u01d5\u01d4\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\67\3\2\2\2\u01d7\u01db\5:\36\2\u01d8\u01db"+
		"\5B\"\2\u01d9\u01db\5h\65\2\u01da\u01d7\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01d9\3\2\2\2\u01db9\3\2\2\2\u01dc\u01e2\5<\37\2\u01dd\u01e2\5> \2\u01de"+
		"\u01e2\5@!\2\u01df\u01e2\5F$\2\u01e0\u01e2\5p9\2\u01e1\u01dc\3\2\2\2\u01e1"+
		"\u01dd\3\2\2\2\u01e1\u01de\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e0\3\2"+
		"\2\2\u01e2;\3\2\2\2\u01e3\u01e4\7\21\2\2\u01e4\u01e5\5\u00a0Q\2\u01e5"+
		"\u01e6\7\22\2\2\u01e6=\3\2\2\2\u01e7\u01e8\5\"\22\2\u01e8\u01e9\7\32\2"+
		"\2\u01e9\u01ea\5\"\22\2\u01ea\u01f6\3\2\2\2\u01eb\u01ec\5\u00b2Z\2\u01ec"+
		"\u01ed\7\32\2\2\u01ed\u01ee\5\u00b2Z\2\u01ee\u01f6\3\2\2\2\u01ef\u01f0"+
		"\5\u00b2Z\2\u01f0\u01f1\7\32\2\2\u01f1\u01f2\5\u00b2Z\2\u01f2\u01f3\7"+
		"\n\2\2\u01f3\u01f4\5@!\2\u01f4\u01f6\3\2\2\2\u01f5\u01e7\3\2\2\2\u01f5"+
		"\u01eb\3\2\2\2\u01f5\u01ef\3\2\2\2\u01f6?\3\2\2\2\u01f7\u01fd\5\f\7\2"+
		"\u01f8\u01fd\t\6\2\2\u01f9\u01fd\t\7\2\2\u01fa\u01fd\t\b\2\2\u01fb\u01fd"+
		"\t\t\2\2\u01fc\u01f7\3\2\2\2\u01fc\u01f8\3\2\2\2\u01fc\u01f9\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fdA\3\2\2\2\u01fe\u01ff\7u\2\2\u01ff"+
		"\u0202\5D#\2\u0200\u0202\5D#\2\u0201\u01fe\3\2\2\2\u0201\u0200\3\2\2\2"+
		"\u0202C\3\2\2\2\u0203\u020a\5J&\2\u0204\u020a\5R*\2\u0205\u020a\5`\61"+
		"\2\u0206\u020a\5d\63\2\u0207\u020a\5f\64\2\u0208\u020a\5H%\2\u0209\u0203"+
		"\3\2\2\2\u0209\u0204\3\2\2\2\u0209\u0205\3\2\2\2\u0209\u0206\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020aE\3\2\2\2\u020b\u020c\7\u008b"+
		"\2\2\u020c\u020f\7\21\2\2\u020d\u0210\5\f\7\2\u020e\u0210\5$\23\2\u020f"+
		"\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7\22"+
		"\2\2\u0212G\3\2\2\2\u0213\u0214\7H\2\2\u0214\u0218\7\23\2\2\u0215\u0219"+
		"\5\"\22\2\u0216\u0219\5\f\7\2\u0217\u0219\5\u00b2Z\2\u0218\u0215\3\2\2"+
		"\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b"+
		"\7\25\2\2\u021b\u021c\7r\2\2\u021c\u021d\5\16\b\2\u021d\u021e\7R\2\2\u021e"+
		"I\3\2\2\2\u021f\u0220\7N\2\2\u0220\u0221\7\23\2\2\u0221\u0222\5L\'\2\u0222"+
		"\u0223\7\25\2\2\u0223\u0224\7r\2\2\u0224\u0225\5P)\2\u0225\u022e\3\2\2"+
		"\2\u0226\u0227\7N\2\2\u0227\u0228\7\24\2\2\u0228\u0229\5L\'\2\u0229\u022a"+
		"\7\26\2\2\u022a\u022b\7r\2\2\u022b\u022c\5P)\2\u022c\u022e\3\2\2\2\u022d"+
		"\u021f\3\2\2\2\u022d\u0226\3\2\2\2\u022eK\3\2\2\2\u022f\u0234\5N(\2\u0230"+
		"\u0231\7\b\2\2\u0231\u0233\5N(\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2\2"+
		"\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235M\3\2\2\2\u0236\u0234"+
		"\3\2\2\2\u0237\u0238\5\16\b\2\u0238\u0239\5:\36\2\u0239O\3\2\2\2\u023a"+
		"\u023b\5\16\b\2\u023b\u023c\58\35\2\u023cQ\3\2\2\2\u023d\u023f\7{\2\2"+
		"\u023e\u0240\5T+\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242"+
		"\3\2\2\2\u0241\u0243\7\t\2\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0245\7Y\2\2\u0245S\3\2\2\2\u0246\u0249\5V,\2\u0247"+
		"\u0248\7\t\2\2\u0248\u024a\5Z.\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2"+
		"\2\u024a\u024d\3\2\2\2\u024b\u024d\5Z.\2\u024c\u0246\3\2\2\2\u024c\u024b"+
		"\3\2\2\2\u024dU\3\2\2\2\u024e\u0253\5X-\2\u024f\u0250\7\t\2\2\u0250\u0252"+
		"\5X-\2\u0251\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253"+
		"\u0254\3\2\2\2\u0254W\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0257\5\u00a0"+
		"Q\2\u0257\u0258\7\n\2\2\u0258\u0259\5\16\b\2\u0259\u025a\58\35\2\u025a"+
		"Y\3\2\2\2\u025b\u025c\7Q\2\2\u025c\u025d\5\\/\2\u025d\u025e\7r\2\2\u025e"+
		"\u0263\5^\60\2\u025f\u0260\7\t\2\2\u0260\u0262\5^\60\2\u0261\u025f\3\2"+
		"\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u026e\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0268\7\t\2\2\u0267\u0266\3\2"+
		"\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\7t\2\2\u026a"+
		"\u026b\7\21\2\2\u026b\u026c\5T+\2\u026c\u026d\7\22\2\2\u026d\u026f\3\2"+
		"\2\2\u026e\u0267\3\2\2\2\u026e\u026f\3\2\2\2\u026f[\3\2\2\2\u0270\u0271"+
		"\5\f\7\2\u0271\u0272\7\n\2\2\u0272\u0274\3\2\2\2\u0273\u0270\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\5\16\b\2\u0276\u0277\5"+
		"@!\2\u0277\u027a\3\2\2\2\u0278\u027a\5@!\2\u0279\u0273\3\2\2\2\u0279\u0278"+
		"\3\2\2\2\u027a]\3\2\2\2\u027b\u027c\5\u00a2R\2\u027c\u027d\7\n\2\2\u027d"+
		"\u027e\7\21\2\2\u027e\u027f\5T+\2\u027f\u0280\7\22\2\2\u0280_\3\2\2\2"+
		"\u0281\u0282\7}\2\2\u0282\u0283\7r\2\2\u0283\u0284\5\16\b\2\u0284\u0285"+
		"\5b\62\2\u0285a\3\2\2\2\u0286\u0287\5:\36\2\u0287c\3\2\2\2\u0288\u0289"+
		"\7[\2\2\u0289\u028a\7r\2\2\u028a\u028b\5\16\b\2\u028b\u028c\58\35\2\u028c"+
		"e\3\2\2\2\u028d\u028e\5\16\b\2\u028e\u028f\7~\2\2\u028fg\3\2\2\2\u0290"+
		"\u0291\5\16\b\2\u0291\u0292\7\27\2\2\u0292\u0293\5\16\b\2\u0293\u0294"+
		"\58\35\2\u0294i\3\2\2\2\u0295\u0296\5n8\2\u0296\u0297\7\21\2\2\u0297\u029c"+
		"\5l\67\2\u0298\u0299\7\t\2\2\u0299\u029b\5l\67\2\u029a\u0298\3\2\2\2\u029b"+
		"\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2"+
		"\2\2\u029e\u029c\3\2\2\2\u029f\u02a0\7\22\2\2\u02a0\u02a1\7\13\2\2\u02a1"+
		"\u02a2\5\16\b\2\u02a2\u02a3\58\35\2\u02a3k\3\2\2\2\u02a4\u02a9\5\f\7\2"+
		"\u02a5\u02a6\7\b\2\2\u02a6\u02a8\5\f\7\2\u02a7\u02a5\3\2\2\2\u02a8\u02ab"+
		"\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab"+
		"\u02a9\3\2\2\2\u02ac\u02ad\7\n\2\2\u02ad\u02ae\5\16\b\2\u02ae\u02af\5"+
		"8\35\2\u02afm\3\2\2\2\u02b0\u02b3\5\f\7\2\u02b1\u02b3\7\u008b\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b2\u02b1\3\2\2\2\u02b3o\3\2\2\2\u02b4\u02b5\5n8\2\u02b5"+
		"\u02b6\7\21\2\2\u02b6\u02bb\5r:\2\u02b7\u02b8\7\t\2\2\u02b8\u02ba\5r:"+
		"\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc"+
		"\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\7\22\2\2"+
		"\u02bfq\3\2\2\2\u02c0\u02c5\5\u00b2Z\2\u02c1\u02c2\7\b\2\2\u02c2\u02c4"+
		"\5\u00b2Z\2\u02c3\u02c1\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2"+
		"\2\u02c5\u02c6\3\2\2\2\u02c6s\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02ce"+
		"\5v<\2\u02c9\u02ce\5|?\2\u02ca\u02ce\5\u0084C\2\u02cb\u02ce\5\u0086D\2"+
		"\u02cc\u02ce\5\u008aF\2\u02cd\u02c8\3\2\2\2\u02cd\u02c9\3\2\2\2\u02cd"+
		"\u02ca\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ceu\3\2\2\2"+
		"\u02cf\u02d1\5x=\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2"+
		"\3\2\2\2\u02d2\u02e0\7\23\2\2\u02d3\u02d4\5~@\2\u02d4\u02d5\7\n\2\2\u02d5"+
		"\u02dd\5z>\2\u02d6\u02d7\7\t\2\2\u02d7\u02d8\5~@\2\u02d8\u02d9\7\n\2\2"+
		"\u02d9\u02da\5z>\2\u02da\u02dc\3\2\2\2\u02db\u02d6\3\2\2\2\u02dc\u02df"+
		"\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e1\3\2\2\2\u02df"+
		"\u02dd\3\2\2\2\u02e0\u02d3\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02ea\3\2"+
		"\2\2\u02e2\u02e4\7\t\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e5\3\2\2\2\u02e5\u02e6\7t\2\2\u02e6\u02e8\5z>\2\u02e7\u02e9\7\t\2"+
		"\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02e3"+
		"\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u030c\7\25\2\2"+
		"\u02ed\u02ef\5x=\2\u02ee\u02ed\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0"+
		"\3\2\2\2\u02f0\u02fe\7\23\2\2\u02f1\u02f2\5~@\2\u02f2\u02f3\7\n\2\2\u02f3"+
		"\u02fb\5v<\2\u02f4\u02f5\7\t\2\2\u02f5\u02f6\5~@\2\u02f6\u02f7\7\n\2\2"+
		"\u02f7\u02f8\5v<\2\u02f8\u02fa\3\2\2\2\u02f9\u02f4\3\2\2\2\u02fa\u02fd"+
		"\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd"+
		"\u02fb\3\2\2\2\u02fe\u02f1\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0308\3\2"+
		"\2\2\u0300\u0302\7\t\2\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u0304\7t\2\2\u0304\u0306\5v<\2\u0305\u0307\7\t\2"+
		"\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u0301"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\7\25\2\2"+
		"\u030b\u02d0\3\2\2\2\u030b\u02ee\3\2\2\2\u030cw\3\2\2\2\u030d\u030e\5"+
		"\f\7\2\u030ey\3\2\2\2\u030f\u0310\5\u00b2Z\2\u0310{\3\2\2\2\u0311\u0313"+
		"\5x=\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0322\7\23\2\2\u0315\u0316\5~@\2\u0316\u0317\7\n\2\2\u0317\u031f\5z>"+
		"\2\u0318\u0319\7\t\2\2\u0319\u031a\5~@\2\u031a\u031b\7\n\2\2\u031b\u031c"+
		"\5z>\2\u031c\u031e\3\2\2\2\u031d\u0318\3\2\2\2\u031e\u0321\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2"+
		"\2\2\u0322\u0315\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u033f\3\2\2\2\u0324"+
		"\u0326\7\t\2\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2"+
		"\2\2\u0327\u032b\7Q\2\2\u0328\u0329\5\f\7\2\u0329\u032a\7\n\2\2\u032a"+
		"\u032c\3\2\2\2\u032b\u0328\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2"+
		"\2\2\u032d\u032e\5\u0082B\2\u032e\u032f\7r\2\2\u032f\u0330\7\23\2\2\u0330"+
		"\u0331\5~@\2\u0331\u0332\7\n\2\2\u0332\u033a\5z>\2\u0333\u0334\7\t\2\2"+
		"\u0334\u0335\5~@\2\u0335\u0336\7\n\2\2\u0336\u0337\5z>\2\u0337\u0339\3"+
		"\2\2\2\u0338\u0333\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u033e\7\25"+
		"\2\2\u033e\u0340\3\2\2\2\u033f\u0325\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u0349\3\2\2\2\u0341\u0343\7\t\2\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2"+
		"\2\2\u0343\u0344\3\2\2\2\u0344\u0345\7t\2\2\u0345\u0347\7\u0087\2\2\u0346"+
		"\u0348\7\t\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034a\3\2"+
		"\2\2\u0349\u0342\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b"+
		"\u0388\7\25\2\2\u034c\u034e\5x=\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2"+
		"\2\2\u034e\u034f\3\2\2\2\u034f\u035d\7\23\2\2\u0350\u0351\5~@\2\u0351"+
		"\u0352\7\n\2\2\u0352\u035a\5|?\2\u0353\u0354\7\t\2\2\u0354\u0355\5~@\2"+
		"\u0355\u0356\7\n\2\2\u0356\u0357\5|?\2\u0357\u0359\3\2\2\2\u0358\u0353"+
		"\3\2\2\2\u0359\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"\u035e\3\2\2\2\u035c\u035a\3\2\2\2\u035d\u0350\3\2\2\2\u035d\u035e\3\2"+
		"\2\2\u035e\u037a\3\2\2\2\u035f\u0361\7\t\2\2\u0360\u035f\3\2\2\2\u0360"+
		"\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0366\7Q\2\2\u0363\u0364\5\f"+
		"\7\2\u0364\u0365\7\n\2\2\u0365\u0367\3\2\2\2\u0366\u0363\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\5\u0082B\2\u0369\u036a"+
		"\7r\2\2\u036a\u036b\7\23\2\2\u036b\u036c\5~@\2\u036c\u036d\7\n\2\2\u036d"+
		"\u0375\5|?\2\u036e\u036f\7\t\2\2\u036f\u0370\5~@\2\u0370\u0371\7\n\2\2"+
		"\u0371\u0372\5|?\2\u0372\u0374\3\2\2\2\u0373\u036e\3\2\2\2\u0374\u0377"+
		"\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377"+
		"\u0375\3\2\2\2\u0378\u0379\7\25\2\2\u0379\u037b\3\2\2\2\u037a\u0360\3"+
		"\2\2\2\u037a\u037b\3\2\2\2\u037b\u0384\3\2\2\2\u037c\u037e\7\t\2\2\u037d"+
		"\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\7t"+
		"\2\2\u0380\u0382\7\u0087\2\2\u0381\u0383\7\t\2\2\u0382\u0381\3\2\2\2\u0382"+
		"\u0383\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u037d\3\2\2\2\u0384\u0385\3\2"+
		"\2\2\u0385\u0386\3\2\2\2\u0386\u0388\7\25\2\2\u0387\u0312\3\2\2\2\u0387"+
		"\u034d\3\2\2\2\u0388}\3\2\2\2\u0389\u038e\5\u0080A\2\u038a\u038b\7\b\2"+
		"\2\u038b\u038d\5\u0080A\2\u038c\u038a\3\2\2\2\u038d\u0390\3\2\2\2\u038e"+
		"\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038f\177\3\2\2\2\u0390\u038e\3\2\2"+
		"\2\u0391\u0395\5\f\7\2\u0392\u0395\7\u0094\2\2\u0393\u0395\5> \2\u0394"+
		"\u0391\3\2\2\2\u0394\u0392\3\2\2\2\u0394\u0393\3\2\2\2\u0395\u0081\3\2"+
		"\2\2\u0396\u0397\5\u00b2Z\2\u0397\u0083\3\2\2\2\u0398\u039a\5x=\2\u0399"+
		"\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u03a4\7\23"+
		"\2\2\u039c\u03a1\5z>\2\u039d\u039e\7\t\2\2\u039e\u03a0\5z>\2\u039f\u039d"+
		"\3\2\2\2\u03a0\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a5\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a4\u039c\3\2\2\2\u03a4\u03a5\3\2"+
		"\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a7\7\25\2\2\u03a7\u0085\3\2\2\2\u03a8"+
		"\u03aa\5x=\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03ab\3\2\2"+
		"\2\u03ab\u03b4\7\21\2\2\u03ac\u03b1\5\u0088E\2\u03ad\u03ae\7\b\2\2\u03ae"+
		"\u03b0\5\u0088E\2\u03af\u03ad\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af"+
		"\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4"+
		"\u03ac\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03bb\3\2\2\2\u03b6\u03b8\7\t"+
		"\2\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"\u03ba\7|\2\2\u03ba\u03bc\5\u0088E\2\u03bb\u03b7\3\2\2\2\u03bb\u03bc\3"+
		"\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03d5\7\22\2\2\u03be\u03c0\5x=\2\u03bf"+
		"\u03be\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03ca\7\21"+
		"\2\2\u03c2\u03c7\5\u0086D\2\u03c3\u03c4\7\b\2\2\u03c4\u03c6\5\u0086D\2"+
		"\u03c5\u03c3\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8"+
		"\3\2\2\2\u03c8\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03c2\3\2\2\2\u03ca"+
		"\u03cb\3\2\2\2\u03cb\u03d1\3\2\2\2\u03cc\u03ce\7\t\2\2\u03cd\u03cc\3\2"+
		"\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\7|\2\2\u03d0"+
		"\u03d2\5\u0086D\2\u03d1\u03cd\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3"+
		"\3\2\2\2\u03d3\u03d5\7\22\2\2\u03d4\u03a9\3\2\2\2\u03d4\u03bf\3\2\2\2"+
		"\u03d5\u0087\3\2\2\2\u03d6\u03d7\7\u0094\2\2\u03d7\u03d9\7r\2\2\u03d8"+
		"\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db\5\u00b2"+
		"Z\2\u03db\u0089\3\2\2\2\u03dc\u03de\5x=\2\u03dd\u03dc\3\2\2\2\u03dd\u03de"+
		"\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e8\7\21\2\2\u03e0\u03e5\5\u0088"+
		"E\2\u03e1\u03e2\7\b\2\2\u03e2\u03e4\5\u0088E\2\u03e3\u03e1\3\2\2\2\u03e4"+
		"\u03e7\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e9\3\2"+
		"\2\2\u03e7\u03e5\3\2\2\2\u03e8\u03e0\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9"+
		"\u03f7\3\2\2\2\u03ea\u03ec\7\t\2\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2"+
		"\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\5\u0082B\2\u03ee\u03ef\7\b\2\2\u03ef"+
		"\u03f4\5\u0088E\2\u03f0\u03f1\7\t\2\2\u03f1\u03f3\5\u0088E\2\u03f2\u03f0"+
		"\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5"+
		"\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\u03eb\3\2\2\2\u03f7\u03f8\3\2"+
		"\2\2\u03f8\u03f9\3\2\2\2\u03f9\u0419\7\22\2\2\u03fa\u03fc\5x=\2\u03fb"+
		"\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0406\7\21"+
		"\2\2\u03fe\u0403\5\u008aF\2\u03ff\u0400\7\b\2\2\u0400\u0402\5\u008aF\2"+
		"\u0401\u03ff\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0404"+
		"\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0406\u03fe\3\2\2\2\u0406"+
		"\u0407\3\2\2\2\u0407\u0415\3\2\2\2\u0408\u040a\7\t\2\2\u0409\u0408\3\2"+
		"\2\2\u0409\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\5\u0082B\2\u040c"+
		"\u040d\7\b\2\2\u040d\u0412\5\u008aF\2\u040e\u040f\7\t\2\2\u040f\u0411"+
		"\5\u008aF\2\u0410\u040e\3\2\2\2\u0411\u0414\3\2\2\2\u0412\u0410\3\2\2"+
		"\2\u0412\u0413\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0415\u0409"+
		"\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0419\7\22\2\2"+
		"\u0418\u03dd\3\2\2\2\u0418\u03fb\3\2\2\2\u0419\u008b\3\2\2\2\u041a\u041b"+
		"\7\u0084\2\2\u041b\u0420\5\u008eH\2\u041c\u041d\7\t\2\2\u041d\u041f\5"+
		"\u008eH\2\u041e\u041c\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2"+
		"\u0420\u0421\3\2\2\2\u0421\u0423\3\2\2\2\u0422\u0420\3\2\2\2\u0423\u0424"+
		"\7\t\2\2\u0424\u008d\3\2\2\2\u0425\u0426\5\u00a0Q\2\u0426\u0427\7\n\2"+
		"\2\u0427\u0428\5\16\b\2\u0428\u042a\58\35\2\u0429\u042b\5\u0090I\2\u042a"+
		"\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u008f\3\2\2\2\u042c\u042d\t\n"+
		"\2\2\u042d\u0435\5\f\7\2\u042e\u042f\t\n\2\2\u042f\u0435\5\u00be`\2\u0430"+
		"\u0431\t\n\2\2\u0431\u0435\7\u0087\2\2\u0432\u0433\t\n\2\2\u0433\u0435"+
		"\5t;\2\u0434\u042c\3\2\2\2\u0434\u042e\3\2\2\2\u0434\u0430\3\2\2\2\u0434"+
		"\u0432\3\2\2\2\u0435\u0091\3\2\2\2\u0436\u0437\7\u0080\2\2\u0437\u0438"+
		"\t\13\2\2\u0438\u043b\7V\2\2\u0439\u043c\5\u00dco\2\u043a\u043c\5\u00a8"+
		"U\2\u043b\u0439\3\2\2\2\u043b\u043a\3\2\2\2\u043c\u043d\3\2\2\2\u043d"+
		"\u043e\7\t\2\2\u043e\u0093\3\2\2\2\u043f\u0440\5\16\b\2\u0440\u0446\5"+
		"\u0096L\2\u0441\u0447\5\24\13\2\u0442\u0447\7E\2\2\u0443\u0447\7D\2\2"+
		"\u0444\u0447\7F\2\2\u0445\u0447\7G\2\2\u0446\u0441\3\2\2\2\u0446\u0442"+
		"\3\2\2\2\u0446\u0443\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0445\3\2\2\2\u0447"+
		"\u0448\3\2\2\2\u0448\u0449\7\t\2\2\u0449\u0095\3\2\2\2\u044a\u044d\5\u0098"+
		"M\2\u044b\u044d\5\u00a4S\2\u044c\u044a\3\2\2\2\u044c\u044b\3\2\2\2\u044d"+
		"\u0097\3\2\2\2\u044e\u044f\7v\2\2\u044f\u0451\5\f\7\2\u0450\u0452\5\u009a"+
		"N\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2\2\u0453"+
		"\u0454\7\t\2\2\u0454\u0099\3\2\2\2\u0455\u0456\7\21\2\2\u0456\u045b\5"+
		"\u009cO\2\u0457\u0458\7\t\2\2\u0458\u045a\5\u009cO\2\u0459\u0457\3\2\2"+
		"\2\u045a\u045d\3\2\2\2\u045b\u0459\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045e"+
		"\3\2\2\2\u045d\u045b\3\2\2\2\u045e\u045f\7\22\2\2\u045f\u009b\3\2\2\2"+
		"\u0460\u0474\5\u009eP\2\u0461\u0462\7\u0084\2\2\u0462\u0474\5\u009eP\2"+
		"\u0463\u0464\5\16\b\2\u0464\u0465\7]\2\2\u0465\u0467\5\f\7\2\u0466\u0468"+
		"\5\u009aN\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2"+
		"\2\u0469\u046a\7\n\2\2\u046a\u046b\5\16\b\2\u046b\u046c\5\u00a6T\2\u046c"+
		"\u0474\3\2\2\2\u046d\u046e\5\16\b\2\u046e\u046f\7v\2\2\u046f\u0471\5\f"+
		"\7\2\u0470\u0472\5\u009aN\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472"+
		"\u0474\3\2\2\2\u0473\u0460\3\2\2\2\u0473\u0461\3\2\2\2\u0473\u0463\3\2"+
		"\2\2\u0473\u046d\3\2\2\2\u0474\u009d\3\2\2\2\u0475\u0476\5\u00a0Q\2\u0476"+
		"\u0477\7\n\2\2\u0477\u0478\5\16\b\2\u0478\u047b\58\35\2\u0479\u047a\7"+
		"\7\2\2\u047a\u047c\5\u00b2Z\2\u047b\u0479\3\2\2\2\u047b\u047c\3\2\2\2"+
		"\u047c\u009f\3\2\2\2\u047d\u0482\5\f\7\2\u047e\u047f\7\b\2\2\u047f\u0481"+
		"\5\f\7\2\u0480\u047e\3\2\2\2\u0481\u0484\3\2\2\2\u0482\u0480\3\2\2\2\u0482"+
		"\u0483\3\2\2\2\u0483\u00a1\3\2\2\2\u0484\u0482\3\2\2\2\u0485\u048a\5\""+
		"\22\2\u0486\u0487\t\f\2\2\u0487\u0489\5\"\22\2\u0488\u0486\3\2\2\2\u0489"+
		"\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u00a3\3\2"+
		"\2\2\u048c\u048a\3\2\2\2\u048d\u048e\7]\2\2\u048e\u0490\5\f\7\2\u048f"+
		"\u0491\5\u009aN\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492"+
		"\3\2\2\2\u0492\u0493\7\n\2\2\u0493\u0494\5\16\b\2\u0494\u0495\5\u00a6"+
		"T\2\u0495\u0496\7\t\2\2\u0496\u00a5\3\2\2\2\u0497\u0498\5@!\2\u0498\u00a7"+
		"\3\2\2\2\u0499\u049a\5\32\16\2\u049a\u049b\7\n\2\2\u049b\u049c\5\u00aa"+
		"V\2\u049c\u049f\3\2\2\2\u049d\u049f\5\u00aaV\2\u049e\u0499\3\2\2\2\u049e"+
		"\u049d\3\2\2\2\u049f\u00a9\3\2\2\2\u04a0\u04a3\5\u00acW\2\u04a1\u04a3"+
		"\5\u00dan\2\u04a2\u04a0\3\2\2\2\u04a2\u04a1\3\2\2\2\u04a3\u00ab\3\2\2"+
		"\2\u04a4\u04a9\5\u00aeX\2\u04a5\u04a9\5\u00ceh\2\u04a6\u04a9\5\u00d4k"+
		"\2\u04a7\u04a9\5\u00d6l\2\u04a8\u04a4\3\2\2\2\u04a8\u04a5\3\2\2\2\u04a8"+
		"\u04a6\3\2\2\2\u04a8\u04a7\3\2\2\2\u04a9\u00ad\3\2\2\2\u04aa\u04ab\5\u00b0"+
		"Y\2\u04ab\u04ac\7\7\2\2\u04ac\u04ad\5\u00b2Z\2\u04ad\u00af\3\2\2\2\u04ae"+
		"\u04af\7\30\2\2\u04af\u04b2\5\f\7\2\u04b0\u04b2\5\f\7\2\u04b1\u04ae\3"+
		"\2\2\2\u04b1\u04b0\3\2\2\2\u04b2\u04ce\3\2\2\2\u04b3\u04b4\7\23\2\2\u04b4"+
		"\u04b9\5\u00b2Z\2\u04b5\u04b6\7\b\2\2\u04b6\u04b8\5\u00b2Z\2\u04b7\u04b5"+
		"\3\2\2\2\u04b8\u04bb\3\2\2\2\u04b9\u04b7\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba"+
		"\u04bc\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bc\u04bd\7\25\2\2\u04bd\u04cd\3"+
		"\2\2\2\u04be\u04bf\7\24\2\2\u04bf\u04c4\5\u00b2Z\2\u04c0\u04c1\7\b\2\2"+
		"\u04c1\u04c3\5\u00b2Z\2\u04c2\u04c0\3\2\2\2\u04c3\u04c6\3\2\2\2\u04c4"+
		"\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6\u04c4\3\2"+
		"\2\2\u04c7\u04c8\7\26\2\2\u04c8\u04cd\3\2\2\2\u04c9\u04ca\7\31\2\2\u04ca"+
		"\u04cd\5\f\7\2\u04cb\u04cd\7\27\2\2\u04cc\u04b3\3\2\2\2\u04cc\u04be\3"+
		"\2\2\2\u04cc\u04c9\3\2\2\2\u04cc\u04cb\3\2\2\2\u04cd\u04d0\3\2\2\2\u04ce"+
		"\u04cc\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d4\3\2\2\2\u04d0\u04ce\3\2"+
		"\2\2\u04d1\u04d2\7\n\2\2\u04d2\u04d3\7\n\2\2\u04d3\u04d5\5\f\7\2\u04d4"+
		"\u04d1\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u00b1\3\2\2\2\u04d6\u04da\5\u00b6"+
		"\\\2\u04d7\u04d8\5\u00b4[\2\u04d8\u04d9\5\u00b2Z\2\u04d9\u04db\3\2\2\2"+
		"\u04da\u04d7\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04df\3\2\2\2\u04dc\u04dd"+
		"\7\n\2\2\u04dd\u04de\7\n\2\2\u04de\u04e0\5\f\7\2\u04df\u04dc\3\2\2\2\u04df"+
		"\u04e0\3\2\2\2\u04e0\u00b3\3\2\2\2\u04e1\u04e2\t\r\2\2\u04e2\u00b5\3\2"+
		"\2\2\u04e3\u04e7\5\u00ba^\2\u04e4\u04e5\5\u00b8]\2\u04e5\u04e6\5\u00b6"+
		"\\\2\u04e6\u04e8\3\2\2\2\u04e7\u04e4\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8"+
		"\u00b7\3\2\2\2\u04e9\u04ea\t\16\2\2\u04ea\u00b9\3\2\2\2\u04eb\u04ef\5"+
		"\u00be`\2\u04ec\u04ed\5\u00bc_\2\u04ed\u04ee\5\u00ba^\2\u04ee\u04f0\3"+
		"\2\2\2\u04ef\u04ec\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u00bb\3\2\2\2\u04f1"+
		"\u04f2\t\17\2\2\u04f2\u00bd\3\2\2\2\u04f3\u04f5\t\4\2\2\u04f4\u04f3\3"+
		"\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\5\u00c0a\2"+
		"\u04f7\u00bf\3\2\2\2\u04f8\u0504\5\u00b0Y\2\u04f9\u04fa\7\21\2\2\u04fa"+
		"\u04fb\5\u00b2Z\2\u04fb\u04fc\7\22\2\2\u04fc\u0504\3\2\2\2\u04fd\u0504"+
		"\5\u00c4c\2\u04fe\u0504\5\u00c2b\2\u04ff\u0504\5\u00c8e\2\u0500\u0501"+
		"\7q\2\2\u0501\u0504\5\u00c0a\2\u0502\u0504\5,\27\2\u0503\u04f8\3\2\2\2"+
		"\u0503\u04f9\3\2\2\2\u0503\u04fd\3\2\2\2\u0503\u04fe\3\2\2\2\u0503\u04ff"+
		"\3\2\2\2\u0503\u0500\3\2\2\2\u0503\u0502\3\2\2\2\u0504\u00c1\3\2\2\2\u0505"+
		"\u0517\5$\23\2\u0506\u0517\5 \21\2\u0507\u0517\5.\30\2\u0508\u0517\7p"+
		"\2\2\u0509\u0517\7\u0087\2\2\u050a\u0513\5.\30\2\u050b\u050c\7\21\2\2"+
		"\u050c\u050d\5\f\7\2\u050d\u050f\7\22\2\2\u050e\u0510\5.\30\2\u050f\u050e"+
		"\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0512\3\2\2\2\u0511\u050b\3\2\2\2\u0512"+
		"\u0515\3\2\2\2\u0513\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0517\3\2"+
		"\2\2\u0515\u0513\3\2\2\2\u0516\u0505\3\2\2\2\u0516\u0506\3\2\2\2\u0516"+
		"\u0507\3\2\2\2\u0516\u0508\3\2\2\2\u0516\u0509\3\2\2\2\u0516\u050a\3\2"+
		"\2\2\u0517\u00c3\3\2\2\2\u0518\u0519\5\f\7\2\u0519\u051a\7\21\2\2\u051a"+
		"\u051b\5\u00c6d\2\u051b\u051c\7\22\2\2\u051c\u00c5\3\2\2\2\u051d\u051f"+
		"\5\u00d0i\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0526\3\2\2"+
		"\2\u0520\u0522\7\b\2\2\u0521\u0523\5\u00d0i\2\u0522\u0521\3\2\2\2\u0522"+
		"\u0523\3\2\2\2\u0523\u0525\3\2\2\2\u0524\u0520\3\2\2\2\u0525\u0528\3\2"+
		"\2\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u00c7\3\2\2\2\u0528"+
		"\u0526\3\2\2\2\u0529\u052a\7\23\2\2\u052a\u052b\5\u00caf\2\u052b\u052c"+
		"\7\25\2\2\u052c\u0533\3\2\2\2\u052d\u052e\7\24\2\2\u052e\u052f\5\u00ca"+
		"f\2\u052f\u0530\7\26\2\2\u0530\u0533\3\2\2\2\u0531\u0533\5t;\2\u0532\u0529"+
		"\3\2\2\2\u0532\u052d\3\2\2\2\u0532\u0531\3\2\2\2\u0533\u00c9\3\2\2\2\u0534"+
		"\u0539\5\u00ccg\2\u0535\u0536\7\b\2\2\u0536\u0538\5\u00ccg\2\u0537\u0535"+
		"\3\2\2\2\u0538\u053b\3\2\2\2\u0539\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a"+
		"\u053e\3\2\2\2\u053b\u0539\3\2\2\2\u053c\u053e\3\2\2\2\u053d\u0534\3\2"+
		"\2\2\u053d\u053c\3\2\2\2\u053e\u00cb\3\2\2\2\u053f\u0542\5\u00b2Z\2\u0540"+
		"\u0541\7\32\2\2\u0541\u0543\5\u00b2Z\2\u0542\u0540\3\2\2\2\u0542\u0543"+
		"\3\2\2\2\u0543\u00cd\3\2\2\2\u0544\u0549\5\f\7\2\u0545\u0546\7\21\2\2"+
		"\u0546\u0547\5\u00c6d\2\u0547\u0548\7\22\2\2\u0548\u054a\3\2\2\2\u0549"+
		"\u0545\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u00cf\3\2\2\2\u054b\u054f\5\u00b2"+
		"Z\2\u054c\u054e\5\u00d2j\2\u054d\u054c\3\2\2\2\u054e\u0551\3\2\2\2\u054f"+
		"\u054d\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0557\3\2\2\2\u0551\u054f\3\2"+
		"\2\2\u0552\u0553\5\f\7\2\u0553\u0554\7\7\2\2\u0554\u0555\5\f\7\2\u0555"+
		"\u0557\3\2\2\2\u0556\u054b\3\2\2\2\u0556\u0552\3\2\2\2\u0557\u00d1\3\2"+
		"\2\2\u0558\u0559\7\n\2\2\u0559\u055a\5\u00b2Z\2\u055a\u00d3\3\2\2\2\u055b"+
		"\u055c\7^\2\2\u055c\u055d\5\32\16\2\u055d\u00d5\3\2\2\2\u055e\u055f\3"+
		"\2\2\2\u055f\u00d7\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u00d9\3\2\2\2\u0562"+
		"\u0567\5\u00dco\2\u0563\u0567\5\u00e2r\2\u0564\u0567\5\u00eav\2\u0565"+
		"\u0567\5\u00f8}\2\u0566\u0562\3\2\2\2\u0566\u0563\3\2\2\2\u0566\u0564"+
		"\3\2\2\2\u0566\u0565\3\2\2\2\u0567\u00db\3\2\2\2\u0568\u0569\7O\2\2\u0569"+
		"\u056a\5\u00e0q\2\u056a\u056b\7Y\2\2\u056b\u00dd\3\2\2\2\u056c\u056d\5"+
		"\u00e0q\2\u056d\u056e\7Y\2\2\u056e\u00df\3\2\2\2\u056f\u0574\5\u00a8U"+
		"\2\u0570\u0571\7\t\2\2\u0571\u0573\5\u00a8U\2\u0572\u0570\3\2\2\2\u0573"+
		"\u0576\3\2\2\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u00e1\3\2"+
		"\2\2\u0576\u0574\3\2\2\2\u0577\u057a\5\u00e4s\2\u0578\u057a\5\u00e6t\2"+
		"\u0579\u0577\3\2\2\2\u0579\u0578\3\2\2\2\u057a\u00e3\3\2\2\2\u057b\u057c"+
		"\7_\2\2\u057c\u057d\5\u00b2Z\2\u057d\u057e\7\177\2\2\u057e\u0581\5\u00a8"+
		"U\2\u057f\u0580\7X\2\2\u0580\u0582\5\u00a8U\2\u0581\u057f\3\2\2\2\u0581"+
		"\u0582\3\2\2\2\u0582\u00e5\3\2\2\2\u0583\u0584\7Q\2\2\u0584\u0585\5\u00b2"+
		"Z\2\u0585\u0586\7r\2\2\u0586\u058b\5\u00e8u\2\u0587\u0588\7\t\2\2\u0588"+
		"\u058a\5\u00e8u\2\u0589\u0587\3\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589"+
		"\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u0591\3\2\2\2\u058d\u058b\3\2\2\2\u058e"+
		"\u058f\7\t\2\2\u058f\u0590\7X\2\2\u0590\u0592\5\u00e0q\2\u0591\u058e\3"+
		"\2\2\2\u0591\u0592\3\2\2\2\u0592\u0594\3\2\2\2\u0593\u0595\7\t\2\2\u0594"+
		"\u0593\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\7Y"+
		"\2\2\u0597\u00e7\3\2\2\2\u0598\u0599\5\u00a2R\2\u0599\u059a\7\n\2\2\u059a"+
		"\u059b\5\u00a8U\2\u059b\u00e9\3\2\2\2\u059c\u05a0\5\u00ecw\2\u059d\u05a0"+
		"\5\u00eex\2\u059e\u05a0\5\u00f0y\2\u059f\u059c\3\2\2\2\u059f\u059d\3\2"+
		"\2\2\u059f\u059e\3\2\2\2\u05a0\u00eb\3\2\2\2\u05a1\u05a2\7\u0085\2\2\u05a2"+
		"\u05a3\5\u00b2Z\2\u05a3\u05a4\7V\2\2\u05a4\u05a5\5\u00a8U\2\u05a5\u00ed"+
		"\3\2\2\2\u05a6\u05a7\7|\2\2\u05a7\u05a8\5\u00e0q\2\u05a8\u05a9\7\u0082"+
		"\2\2\u05a9\u05aa\5\u00b2Z\2\u05aa\u00ef\3\2\2\2\u05ab\u05ac\7\\\2\2\u05ac"+
		"\u05ad\5\f\7\2\u05ad\u05ae\7\7\2\2\u05ae\u05af\5\u00f2z\2\u05af\u05b0"+
		"\7V\2\2\u05b0\u05b1\5\u00a8U\2\u05b1\u00f1\3\2\2\2\u05b2\u05b3\5\u00f4"+
		"{\2\u05b3\u05b4\t\20\2\2\u05b4\u05b5\5\u00f6|\2\u05b5\u00f3\3\2\2\2\u05b6"+
		"\u05b7\5\u00b2Z\2\u05b7\u00f5\3\2\2\2\u05b8\u05b9\5\u00b2Z\2\u05b9\u00f7"+
		"\3\2\2\2\u05ba\u05bb\7\u0086\2\2\u05bb\u05bc\5\u00fa~\2\u05bc\u05bd\7"+
		"V\2\2\u05bd\u05be\5\u00a8U\2\u05be\u00f9\3\2\2\2\u05bf\u05c4\5\u00b0Y"+
		"\2\u05c0\u05c1\7\b\2\2\u05c1\u05c3\5\u00b0Y\2\u05c2\u05c0\3\2\2\2\u05c3"+
		"\u05c6\3\2\2\2\u05c4\u05c2\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u00fb\3\2"+
		"\2\2\u05c6\u05c4\3\2\2\2\u00ac\u00fe\u0104\u010c\u0111\u0117\u0124\u012f"+
		"\u0133\u013e\u0142\u014c\u0151\u015a\u015f\u016a\u016c\u0172\u0177\u0183"+
		"\u018a\u0192\u01a9\u01ad\u01bf\u01c7\u01ca\u01ce\u01d5\u01da\u01e1\u01f5"+
		"\u01fc\u0201\u0209\u020f\u0218\u022d\u0234\u023f\u0242\u0249\u024c\u0253"+
		"\u0263\u0267\u026e\u0273\u0279\u029c\u02a9\u02b2\u02bb\u02c5\u02cd\u02d0"+
		"\u02dd\u02e0\u02e3\u02e8\u02ea\u02ee\u02fb\u02fe\u0301\u0306\u0308\u030b"+
		"\u0312\u031f\u0322\u0325\u032b\u033a\u033f\u0342\u0347\u0349\u034d\u035a"+
		"\u035d\u0360\u0366\u0375\u037a\u037d\u0382\u0384\u0387\u038e\u0394\u0399"+
		"\u03a1\u03a4\u03a9\u03b1\u03b4\u03b7\u03bb\u03bf\u03c7\u03ca\u03cd\u03d1"+
		"\u03d4\u03d8\u03dd\u03e5\u03e8\u03eb\u03f4\u03f7\u03fb\u0403\u0406\u0409"+
		"\u0412\u0415\u0418\u0420\u042a\u0434\u043b\u0446\u044c\u0451\u045b\u0467"+
		"\u0471\u0473\u047b\u0482\u048a\u0490\u049e\u04a2\u04a8\u04b1\u04b9\u04c4"+
		"\u04cc\u04ce\u04d4\u04da\u04df\u04e7\u04ef\u04f4\u0503\u050f\u0513\u0516"+
		"\u051e\u0522\u0526\u0532\u0539\u053d\u0542\u0549\u054f\u0556\u0566\u0574"+
		"\u0579\u0581\u058b\u0591\u0594\u059f\u05c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}