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
		LABEL=107, MOD=108, MODULE=109, NIL=110, NOT=111, OF=112, OR=113, PACKED=114, 
		PROCEDURE=115, PROGRAM=116, REAL=117, DOUBLE=118, QUADRUPLE=119, RECORD=120, 
		REPEAT=121, SET=122, THEN=123, TO=124, TYPE=125, UNTIL=126, VALUE=127, 
		VAR=128, WHILE=129, WITH=130, ZERO=131, UNIT=132, INTERFACE=133, USES=134, 
		STRING=135, IMPLEMENTATION=136, TRUE=137, FALSE=138, WS=139, COMMENT_1=140, 
		COMMENT_2=141, IDENTIFIER=142, STRING_LITERAL=143, NUM_INT=144, NUM_REAL=145, 
		BASE_NUMBER=146, BIN_NUMBER=147, HEX_NUMBER=148, OCT_NUMBER=149;
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
		RULE_pointerType = 50, RULE_variableDeclarationPart = 51, RULE_variableDeclaration = 52, 
		RULE_variablePreDeclaration = 53, RULE_toBeginEndDoDeclarationPart = 54, 
		RULE_procedureAndFunctionDeclarationPart = 55, RULE_procedureOrFunctionDeclaration = 56, 
		RULE_procedureDeclaration = 57, RULE_formalParameterList = 58, RULE_formalParameterSection = 59, 
		RULE_parameterGroup = 60, RULE_identifierList = 61, RULE_initializerList = 62, 
		RULE_constList = 63, RULE_functionDeclaration = 64, RULE_resultType = 65, 
		RULE_statement = 66, RULE_unlabelledStatement = 67, RULE_simpleStatement = 68, 
		RULE_assignmentStatement = 69, RULE_variable = 70, RULE_expression = 71, 
		RULE_relationaloperator = 72, RULE_simpleExpression = 73, RULE_additiveoperator = 74, 
		RULE_term = 75, RULE_multiplicativeoperator = 76, RULE_signedFactor = 77, 
		RULE_factor = 78, RULE_unsignedConstant = 79, RULE_functionDesignator = 80, 
		RULE_parameterList = 81, RULE_set = 82, RULE_elementList = 83, RULE_element = 84, 
		RULE_procedureStatement = 85, RULE_actualParameter = 86, RULE_parameterwidth = 87, 
		RULE_gotoStatement = 88, RULE_emptyStatement = 89, RULE_empty = 90, RULE_structuredStatement = 91, 
		RULE_compoundStatement = 92, RULE_openCompoundStatement = 93, RULE_statements = 94, 
		RULE_conditionalStatement = 95, RULE_ifStatement = 96, RULE_caseStatement = 97, 
		RULE_caseListElement = 98, RULE_repetetiveStatement = 99, RULE_whileStatement = 100, 
		RULE_repeatStatement = 101, RULE_forStatement = 102, RULE_forList = 103, 
		RULE_initialValue = 104, RULE_finalValue = 105, RULE_withStatement = 106, 
		RULE_recordVariableList = 107;
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
		"baseType", "fileType", "pointerType", "variableDeclarationPart", "variableDeclaration", 
		"variablePreDeclaration", "toBeginEndDoDeclarationPart", "procedureAndFunctionDeclarationPart", 
		"procedureOrFunctionDeclaration", "procedureDeclaration", "formalParameterList", 
		"formalParameterSection", "parameterGroup", "identifierList", "initializerList", 
		"constList", "functionDeclaration", "resultType", "statement", "unlabelledStatement", 
		"simpleStatement", "assignmentStatement", "variable", "expression", "relationaloperator", 
		"simpleExpression", "additiveoperator", "term", "multiplicativeoperator", 
		"signedFactor", "factor", "unsignedConstant", "functionDesignator", "parameterList", 
		"set", "elementList", "element", "procedureStatement", "actualParameter", 
		"parameterwidth", "gotoStatement", "emptyStatement", "empty", "structuredStatement", 
		"compoundStatement", "openCompoundStatement", "statements", "conditionalStatement", 
		"ifStatement", "caseStatement", "caseListElement", "repetetiveStatement", 
		"whileStatement", "repeatStatement", "forStatement", "forList", "initialValue", 
		"finalValue", "withStatement", "recordVariableList"
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
		"NOT", "OF", "OR", "PACKED", "PROCEDURE", "PROGRAM", "REAL", "DOUBLE", 
		"QUADRUPLE", "RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", 
		"VALUE", "VAR", "WHILE", "WITH", "ZERO", "UNIT", "INTERFACE", "USES", 
		"STRING", "IMPLEMENTATION", "TRUE", "FALSE", "WS", "COMMENT_1", "COMMENT_2", 
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
			setState(216);
			programHeading();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERFACE) {
				{
				setState(217);
				match(INTERFACE);
				}
			}

			setState(220);
			block();
			setState(221);
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
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(223);
					inheritAttr();
					}
				}

				setState(226);
				match(PROGRAM);
				setState(227);
				identifier();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(228);
					match(LPAREN);
					setState(229);
					identifierList();
					setState(230);
					match(RPAREN);
					}
				}

				setState(234);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(236);
					invironmentAttr();
					}
				}

				setState(239);
				match(MODULE);
				setState(240);
				identifier();
				setState(241);
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
			setState(245);
			match(LBRACK);
			setState(246);
			inherit();
			setState(247);
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
			setState(249);
			match(INHERIT);
			setState(250);
			match(LPAREN);
			setState(251);
			string();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(252);
				match(COMMA);
				setState(253);
				string();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
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
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(LBRACK);
				setState(262);
				match(ENVIRONMENT);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(263);
					match(LPAREN);
					setState(264);
					string();
					setState(265);
					match(RPAREN);
					}
				}

				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(269);
					match(COMMA);
					setState(270);
					inherit();
					}
				}

				setState(273);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(LBRACK);
				setState(275);
				inherit();
				setState(276);
				match(COMMA);
				setState(277);
				match(ENVIRONMENT);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(278);
					match(LPAREN);
					setState(279);
					string();
					setState(280);
					match(RPAREN);
					}
				}

				setState(284);
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
			setState(288);
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
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(290);
				match(LBRACK);
				setState(291);
				attributeDef();
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(292);
					match(COMMA);
					setState(293);
					attributeDef();
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
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
			setState(303);
			attribute();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(304);
				match(LPAREN);
				{
				setState(305);
				constant();
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(306);
					match(COMMA);
					{
					setState(307);
					constant();
					}
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(313);
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
			setState(317);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON) | (1L << STATIC) | (1L << PSECT) | (1L << ASYNCHRONOUS) | (1L << CHECK) | (1L << FLOAT) | (1L << ENUMERATION_SIZE) | (1L << PEN_CHECKING_STYLE) | (1L << HiDDEN) | (1L << IDENT) | (1L << INITIALIZE) | (1L << KEY) | (1L << LIST) | (1L << OPTIMIZE) | (1L << NOOPTIMIZE) | (1L << CLASS_A) | (1L << CLASS_NCA) | (1L << CLASS_S) | (1L << IMMEDIATE) | (1L << REFERENCE) | (1L << POS) | (1L << READONLY) | (1L << BIT) | (1L << BYTE) | (1L << WORD) | (1L << LONG) | (1L << QUAD) | (1L << OCTA) | (1L << TRUNCATE) | (1L << UNBOUND) | (1L << UNSAFE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LOCAL - 64)) | (1L << (GLOBAL - 64)) | (1L << (EXTERNAL - 64)) | (1L << (WEAK_GLOBAL - 64)) | (1L << (WEAK_EXTERNAL - 64)) | (1L << (VOLATILE - 64)) | (1L << (WRITEONLY - 64)) | (1L << (VALUE - 64)))) != 0)) ) {
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
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (CONST - 82)) | (1L << (FUNCTION - 82)) | (1L << (LABEL - 82)) | (1L << (PROCEDURE - 82)) | (1L << (TYPE - 82)) | (1L << (VAR - 82)) | (1L << (USES - 82)) | (1L << (IMPLEMENTATION - 82)))) != 0)) {
				{
				setState(326);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LABEL:
					{
					setState(319);
					labelDeclarationPart();
					}
					break;
				case CONST:
					{
					setState(320);
					constantDefinitionPart();
					}
					break;
				case TYPE:
					{
					setState(321);
					typeDefinitionPart();
					}
					break;
				case VAR:
					{
					setState(322);
					variableDeclarationPart();
					}
					break;
				case LBRACK:
				case FUNCTION:
				case PROCEDURE:
					{
					setState(323);
					procedureAndFunctionDeclarationPart();
					}
					break;
				case USES:
					{
					setState(324);
					usesUnitsPart();
					}
					break;
				case IMPLEMENTATION:
					{
					setState(325);
					match(IMPLEMENTATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO) {
				{
				{
				setState(331);
				toBeginEndDoDeclarationPart();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(337);
				compoundStatement();
				}
				break;
			case END:
				{
				setState(338);
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
			setState(341);
			match(USES);
			setState(342);
			identifierList();
			setState(343);
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
			setState(345);
			match(LABEL);
			setState(346);
			label();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(347);
				match(COMMA);
				setState(348);
				label();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
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
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case BASE_NUMBER:
			case BIN_NUMBER:
			case HEX_NUMBER:
			case OCT_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				unsignedInteger();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
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
			setState(360);
			match(CONST);
			setState(364); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(361);
				constantDefinition();
				setState(362);
				match(SEMI);
				}
				}
				setState(366); 
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
			setState(368);
			identifier();
			setState(369);
			match(EQUAL);
			setState(370);
			attributePart();
			setState(371);
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
			setState(373);
			match(CHR);
			setState(374);
			match(LPAREN);
			setState(375);
			unsignedInteger();
			setState(376);
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
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constant);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				sign();
				setState(380);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				sign();
				setState(384);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				constantChr();
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
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
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
			setState(394);
			_la = _input.LA(1);
			if ( !(((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (NUM_INT - 144)) | (1L << (BASE_NUMBER - 144)) | (1L << (BIN_NUMBER - 144)) | (1L << (HEX_NUMBER - 144)) | (1L << (OCT_NUMBER - 144)))) != 0)) ) {
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
			setState(396);
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
			setState(398);
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
			setState(400);
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
			setState(402);
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
			setState(404);
			match(TYPE);
			setState(408); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(405);
				typeDefinition();
				setState(406);
				match(SEMI);
				}
				}
				setState(410); 
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
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			identifier();
			setState(413);
			match(EQUAL);
			setState(414);
			attributePart();
			setState(418);
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
				setState(415);
				type();
				}
				break;
			case FUNCTION:
				{
				setState(416);
				functionType();
				}
				break;
			case PROCEDURE:
				{
				setState(417);
				procedureType();
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
			setState(420);
			match(FUNCTION);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(421);
				formalParameterList();
				}
			}

			setState(424);
			match(COLON);
			setState(425);
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
			setState(427);
			match(PROCEDURE);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(428);
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
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				simpleType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				structuredType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
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
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_simpleType);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				enumType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				stringtype();
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
			setState(442);
			match(LPAREN);
			setState(443);
			identifierList();
			setState(444);
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
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				constant();
				setState(447);
				match(DOTDOT);
				setState(448);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				expression();
				setState(451);
				match(DOTDOT);
				setState(452);
				expression();
				setState(453);
				match(COLON);
				setState(454);
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
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
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
				setState(459);
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
				setState(460);
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
				setState(461);
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
				setState(462);
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
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKED:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(PACKED);
				setState(466);
				unpackedStructuredType();
				}
				break;
			case VARYING:
			case ARRAY:
			case FILE:
			case RECORD:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
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
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				fileType();
				}
				break;
			case VARYING:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
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
			setState(477);
			match(STRING);
			setState(478);
			match(LPAREN);
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(479);
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
				setState(480);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
			setState(485);
			match(VARYING);
			setState(486);
			match(LBRACK);
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(487);
				constant();
				}
				break;
			case 2:
				{
				setState(488);
				identifier();
				}
				break;
			case 3:
				{
				setState(489);
				expression();
				}
				break;
			}
			setState(492);
			match(RBRACK);
			setState(493);
			match(OF);
			setState(494);
			attributePart();
			setState(495);
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
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				match(ARRAY);
				setState(498);
				match(LBRACK);
				setState(499);
				typeList();
				setState(500);
				match(RBRACK);
				setState(501);
				match(OF);
				setState(502);
				componentType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(ARRAY);
				setState(505);
				match(LBRACK2);
				setState(506);
				typeList();
				setState(507);
				match(RBRACK2);
				setState(508);
				match(OF);
				setState(509);
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
			setState(513);
			indexType();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(514);
				match(COMMA);
				setState(515);
				indexType();
				}
				}
				setState(520);
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
			setState(521);
			attributePart();
			setState(522);
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
			setState(524);
			attributePart();
			setState(525);
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
			setState(527);
			match(RECORD);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==IDENTIFIER) {
				{
				setState(528);
				fieldList();
				}
			}

			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(531);
				match(SEMI);
				}
			}

			setState(534);
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
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				fixedPart();
				setState(539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(537);
					match(SEMI);
					setState(538);
					variantPart();
					}
					break;
				}
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
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
			setState(544);
			recordSection();
			setState(549);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(545);
					match(SEMI);
					setState(546);
					recordSection();
					}
					} 
				}
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
			setState(552);
			identifierList();
			setState(553);
			match(COLON);
			setState(554);
			attributePart();
			setState(555);
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
		public VariantPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantPart; }
	}

	public final VariantPartContext variantPart() throws RecognitionException {
		VariantPartContext _localctx = new VariantPartContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variantPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(CASE);
			setState(558);
			tag();
			setState(559);
			match(OF);
			setState(560);
			variant();
			setState(565);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(561);
					match(SEMI);
					setState(562);
					variant();
					}
					} 
				}
				setState(567);
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

	public static class TagContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tag);
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				identifier();
				setState(569);
				match(COLON);
				setState(570);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
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
			setState(575);
			constList();
			setState(576);
			match(COLON);
			setState(577);
			match(LPAREN);
			setState(578);
			fieldList();
			setState(579);
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
			setState(581);
			match(SET);
			setState(582);
			match(OF);
			setState(583);
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
			setState(585);
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
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(FILE);
				setState(588);
				match(OF);
				setState(589);
				attributePart();
				setState(590);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				match(FILE);
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

	public static class PointerTypeContext extends ParserRuleContext {
		public List<AttributePartContext> attributePart() {
			return getRuleContexts(AttributePartContext.class);
		}
		public AttributePartContext attributePart(int i) {
			return getRuleContext(AttributePartContext.class,i);
		}
		public TerminalNode POINTER() { return getToken(pascalParser.POINTER, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			attributePart();
			setState(596);
			match(POINTER);
			setState(597);
			attributePart();
			setState(598);
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
		enterRule(_localctx, 102, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(VAR);
			setState(601);
			variableDeclaration();
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(602);
					match(SEMI);
					setState(603);
					variableDeclaration();
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(609);
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
		enterRule(_localctx, 104, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			identifierList();
			setState(612);
			match(COLON);
			setState(613);
			attributePart();
			setState(614);
			type();
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN || _la==VALUE) {
				{
				setState(615);
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
		public List<SignedFactorContext> signedFactor() {
			return getRuleContexts(SignedFactorContext.class);
		}
		public SignedFactorContext signedFactor(int i) {
			return getRuleContext(SignedFactorContext.class,i);
		}
		public TerminalNode ZERO() { return getToken(pascalParser.ZERO, 0); }
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
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
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public VariablePreDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variablePreDeclaration; }
	}

	public final VariablePreDeclarationContext variablePreDeclaration() throws RecognitionException {
		VariablePreDeclarationContext _localctx = new VariablePreDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_variablePreDeclaration);
		int _la;
		try {
			setState(642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(619);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(621);
				signedFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(623);
				match(ZERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(624);
				_la = _input.LA(1);
				if ( !(_la==ASSIGN || _la==VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(625);
				match(LBRACK);
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(626);
					initializerList();
					setState(627);
					match(COLON);
					setState(628);
					signedFactor();
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(629);
						match(SEMI);
						setState(630);
						initializerList();
						setState(631);
						match(COLON);
						setState(632);
						signedFactor();
						}
						}
						setState(638);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(641);
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
		enterRule(_localctx, 108, RULE_toBeginEndDoDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(TO);
			setState(645);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(646);
			match(DO);
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(647);
				compoundStatement();
				}
				break;
			case 2:
				{
				setState(648);
				statement();
				}
				break;
			}
			setState(651);
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
		enterRule(_localctx, 110, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			attributePart();
			setState(654);
			procedureOrFunctionDeclaration();
			setState(660);
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
				setState(655);
				block();
				}
				break;
			case EXTERN:
				{
				setState(656);
				match(EXTERN);
				}
				break;
			case EXTERNAL:
				{
				setState(657);
				match(EXTERNAL);
				}
				break;
			case FORTRAN:
				{
				setState(658);
				match(FORTRAN);
				}
				break;
			case FORWARD:
				{
				setState(659);
				match(FORWARD);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(662);
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
		enterRule(_localctx, 112, RULE_procedureOrFunctionDeclaration);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
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
		enterRule(_localctx, 114, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(PROCEDURE);
			setState(669);
			identifier();
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(670);
				formalParameterList();
				}
			}

			setState(673);
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
		enterRule(_localctx, 116, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(LPAREN);
			setState(676);
			formalParameterSection();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(677);
				match(SEMI);
				setState(678);
				formalParameterSection();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
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
		enterRule(_localctx, 118, RULE_formalParameterSection);
		int _la;
		try {
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				parameterGroup();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				match(VAR);
				setState(688);
				parameterGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(689);
				attributePart();
				setState(690);
				match(FUNCTION);
				setState(691);
				identifier();
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(692);
					formalParameterList();
					}
				}

				setState(695);
				match(COLON);
				setState(696);
				attributePart();
				setState(697);
				resultType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(699);
				attributePart();
				setState(700);
				match(PROCEDURE);
				setState(701);
				identifier();
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(702);
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
		enterRule(_localctx, 120, RULE_parameterGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			identifierList();
			setState(708);
			match(COLON);
			setState(709);
			attributePart();
			setState(710);
			type();
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(711);
				match(ASSIGN);
				setState(712);
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
		enterRule(_localctx, 122, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			identifier();
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(716);
				match(COMMA);
				setState(717);
				identifier();
				}
				}
				setState(722);
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

	public static class InitializerListContext extends ParserRuleContext {
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
			setState(723);
			identifier();
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(724);
				match(COMMA);
				setState(725);
				identifier();
				}
				}
				setState(730);
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
		enterRule(_localctx, 126, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			constant();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(732);
				match(COMMA);
				setState(733);
				constant();
				}
				}
				setState(738);
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
		enterRule(_localctx, 128, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(FUNCTION);
			setState(740);
			identifier();
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(741);
				formalParameterList();
				}
			}

			setState(744);
			match(COLON);
			setState(745);
			attributePart();
			setState(746);
			resultType();
			setState(747);
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
		enterRule(_localctx, 130, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
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
		enterRule(_localctx, 132, RULE_statement);
		try {
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				label();
				setState(752);
				match(COLON);
				setState(753);
				unlabelledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
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
		enterRule(_localctx, 134, RULE_unlabelledStatement);
		try {
			setState(760);
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
				setState(758);
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
				setState(759);
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
		enterRule(_localctx, 136, RULE_simpleStatement);
		try {
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				gotoStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(765);
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
		enterRule(_localctx, 138, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			variable();
			setState(769);
			match(ASSIGN);
			setState(770);
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
		enterRule(_localctx, 140, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATP:
				{
				setState(772);
				match(ATP);
				setState(773);
				identifier();
				}
				break;
			case IDENTIFIER:
				{
				setState(774);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << LBRACK2) | (1L << POINTER) | (1L << DOT))) != 0)) {
				{
				setState(802);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(777);
					match(LBRACK);
					setState(778);
					expression();
					setState(783);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(779);
						match(COMMA);
						setState(780);
						expression();
						}
						}
						setState(785);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(786);
					match(RBRACK);
					}
					break;
				case LBRACK2:
					{
					setState(788);
					match(LBRACK2);
					setState(789);
					expression();
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(790);
						match(COMMA);
						setState(791);
						expression();
						}
						}
						setState(796);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(797);
					match(RBRACK2);
					}
					break;
				case DOT:
					{
					setState(799);
					match(DOT);
					setState(800);
					identifier();
					}
					break;
				case POINTER:
					{
					setState(801);
					match(POINTER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(807);
				match(COLON);
				setState(808);
				match(COLON);
				setState(809);
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
		enterRule(_localctx, 142, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			simpleExpression();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0) || _la==IN) {
				{
				setState(813);
				relationaloperator();
				setState(814);
				expression();
				}
			}

			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(818);
				match(COLON);
				setState(819);
				match(COLON);
				setState(820);
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
		enterRule(_localctx, 144, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
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
		enterRule(_localctx, 146, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			term();
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS || _la==OR) {
				{
				setState(826);
				additiveoperator();
				setState(827);
				simpleExpression();
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
		enterRule(_localctx, 148, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
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
		enterRule(_localctx, 150, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			signedFactor();
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR || _la==SLASH || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (AND - 75)) | (1L << (DIV - 75)) | (1L << (MOD - 75)))) != 0)) {
				{
				setState(834);
				multiplicativeoperator();
				setState(835);
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
		enterRule(_localctx, 152, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
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
		enterRule(_localctx, 154, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(841);
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

			setState(844);
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
		enterRule(_localctx, 156, RULE_factor);
		try {
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				match(LPAREN);
				setState(848);
				expression();
				setState(849);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(851);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(852);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(853);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(854);
				match(NOT);
				setState(855);
				factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(856);
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
		enterRule(_localctx, 158, RULE_unsignedConstant);
		try {
			setState(864);
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
				setState(859);
				unsignedNumber();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				constantChr();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(861);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(862);
				match(NIL);
				}
				break;
			case ZERO:
				enterOuterAlt(_localctx, 5);
				{
				setState(863);
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
		enterRule(_localctx, 160, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			identifier();
			setState(867);
			match(LPAREN);
			setState(868);
			parameterList();
			setState(869);
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
		enterRule(_localctx, 162, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHR - 81)) | (1L << (NIL - 81)) | (1L << (NOT - 81)) | (1L << (ZERO - 81)) | (1L << (TRUE - 81)) | (1L << (FALSE - 81)) | (1L << (IDENTIFIER - 81)) | (1L << (STRING_LITERAL - 81)) | (1L << (NUM_INT - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (NUM_REAL - 145)) | (1L << (BASE_NUMBER - 145)) | (1L << (BIN_NUMBER - 145)) | (1L << (HEX_NUMBER - 145)) | (1L << (OCT_NUMBER - 145)))) != 0)) {
				{
				setState(871);
				actualParameter();
				}
			}

			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(874);
				match(COMMA);
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << LPAREN) | (1L << LBRACK) | (1L << LBRACK2) | (1L << ATP))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (CHR - 81)) | (1L << (NIL - 81)) | (1L << (NOT - 81)) | (1L << (ZERO - 81)) | (1L << (TRUE - 81)) | (1L << (FALSE - 81)) | (1L << (IDENTIFIER - 81)) | (1L << (STRING_LITERAL - 81)) | (1L << (NUM_INT - 81)))) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (NUM_REAL - 145)) | (1L << (BASE_NUMBER - 145)) | (1L << (BIN_NUMBER - 145)) | (1L << (HEX_NUMBER - 145)) | (1L << (OCT_NUMBER - 145)))) != 0)) {
					{
					setState(875);
					actualParameter();
					}
				}

				}
				}
				setState(882);
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
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_set);
		try {
			setState(891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				match(LBRACK);
				setState(884);
				elementList();
				setState(885);
				match(RBRACK);
				}
				break;
			case LBRACK2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				match(LBRACK2);
				setState(888);
				elementList();
				setState(889);
				match(RBRACK2);
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
		enterRule(_localctx, 166, RULE_elementList);
		int _la;
		try {
			setState(902);
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
				setState(893);
				element();
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(894);
					match(COMMA);
					setState(895);
					element();
					}
					}
					setState(900);
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
		enterRule(_localctx, 168, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			expression();
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(905);
				match(DOTDOT);
				setState(906);
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
		enterRule(_localctx, 170, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			identifier();
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(910);
				match(LPAREN);
				setState(911);
				parameterList();
				setState(912);
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
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_actualParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			expression();
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(917);
				parameterwidth();
				}
				}
				setState(922);
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
		enterRule(_localctx, 174, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			match(COLON);
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
		enterRule(_localctx, 176, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(GOTO);
			setState(927);
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
		enterRule(_localctx, 178, RULE_emptyStatement);
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
		enterRule(_localctx, 180, RULE_empty);
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
		enterRule(_localctx, 182, RULE_structuredStatement);
		try {
			setState(937);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(935);
				repetetiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(936);
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
		enterRule(_localctx, 184, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			match(BEGIN);
			setState(940);
			statements();
			setState(941);
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
		enterRule(_localctx, 186, RULE_openCompoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			statements();
			setState(944);
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
		enterRule(_localctx, 188, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			statement();
			setState(951);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(947);
					match(SEMI);
					setState(948);
					statement();
					}
					} 
				}
				setState(953);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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
		enterRule(_localctx, 190, RULE_conditionalStatement);
		try {
			setState(956);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
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
		enterRule(_localctx, 192, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(IF);
			setState(959);
			expression();
			setState(960);
			match(THEN);
			setState(961);
			statement();
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(962);
				match(ELSE);
				setState(963);
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
		enterRule(_localctx, 194, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(CASE);
			setState(967);
			expression();
			setState(968);
			match(OF);
			setState(969);
			caseListElement();
			setState(974);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(970);
					match(SEMI);
					setState(971);
					caseListElement();
					}
					} 
				}
				setState(976);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			}
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(977);
				match(SEMI);
				setState(978);
				match(ELSE);
				setState(979);
				statements();
				}
				break;
			}
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(982);
				match(SEMI);
				}
			}

			setState(985);
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
		enterRule(_localctx, 196, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			constList();
			setState(988);
			match(COLON);
			setState(989);
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
		enterRule(_localctx, 198, RULE_repetetiveStatement);
		try {
			setState(994);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
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
		enterRule(_localctx, 200, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(WHILE);
			setState(997);
			expression();
			setState(998);
			match(DO);
			setState(999);
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
		enterRule(_localctx, 202, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(REPEAT);
			setState(1002);
			statements();
			setState(1003);
			match(UNTIL);
			setState(1004);
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
		enterRule(_localctx, 204, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(FOR);
			setState(1007);
			identifier();
			setState(1008);
			match(ASSIGN);
			setState(1009);
			forList();
			setState(1010);
			match(DO);
			setState(1011);
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
		enterRule(_localctx, 206, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			initialValue();
			setState(1014);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1015);
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
		enterRule(_localctx, 208, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
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
		enterRule(_localctx, 210, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
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
		enterRule(_localctx, 212, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(WITH);
			setState(1022);
			recordVariableList();
			setState(1023);
			match(DO);
			setState(1024);
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
		enterRule(_localctx, 214, RULE_recordVariableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			variable();
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1027);
				match(COMMA);
				setState(1028);
				variable();
				}
				}
				setState(1033);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0097\u040d\4\2\t"+
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
		"k\4l\tl\4m\tm\3\2\3\2\5\2\u00dd\n\2\3\2\3\2\3\2\3\3\5\3\u00e3\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\u00eb\n\3\3\3\3\3\3\3\5\3\u00f0\n\3\3\3\3\3\3"+
		"\3\3\3\5\3\u00f6\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\u0101\n\5"+
		"\f\5\16\5\u0104\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u010e\n\6\3\6"+
		"\3\6\5\6\u0112\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u011d\n\6\3"+
		"\6\3\6\5\6\u0121\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0129\n\b\f\b\16\b\u012c"+
		"\13\b\3\b\3\b\5\b\u0130\n\b\3\t\3\t\3\t\3\t\3\t\7\t\u0137\n\t\f\t\16\t"+
		"\u013a\13\t\3\t\3\t\5\t\u013e\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u0149\n\13\f\13\16\13\u014c\13\13\3\13\7\13\u014f\n\13\f\13"+
		"\16\13\u0152\13\13\3\13\3\13\5\13\u0156\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\7\r\u0160\n\r\f\r\16\r\u0163\13\r\3\r\3\r\3\16\3\16\5\16\u0169"+
		"\n\16\3\17\3\17\3\17\3\17\6\17\u016f\n\17\r\17\16\17\u0170\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\5\22\u0187\n\22\3\23\3\23\5\23\u018b\n\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\6\31\u019b"+
		"\n\31\r\31\16\31\u019c\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01a5\n\32\3"+
		"\33\3\33\5\33\u01a9\n\33\3\33\3\33\3\33\3\34\3\34\5\34\u01b0\n\34\3\35"+
		"\3\35\3\35\5\35\u01b5\n\35\3\36\3\36\3\36\3\36\5\36\u01bb\n\36\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01cb\n \3!\3!\3!\3!\3"+
		"!\5!\u01d2\n!\3\"\3\"\3\"\5\"\u01d7\n\"\3#\3#\3#\3#\3#\5#\u01de\n#\3$"+
		"\3$\3$\3$\5$\u01e4\n$\3$\3$\3%\3%\3%\3%\3%\5%\u01ed\n%\3%\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0202\n&\3\'\3\'\3\'\7\'"+
		"\u0207\n\'\f\'\16\'\u020a\13\'\3(\3(\3(\3)\3)\3)\3*\3*\5*\u0214\n*\3*"+
		"\5*\u0217\n*\3*\3*\3+\3+\3+\5+\u021e\n+\3+\5+\u0221\n+\3,\3,\3,\7,\u0226"+
		"\n,\f,\16,\u0229\13,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\7.\u0236\n.\f.\16"+
		".\u0239\13.\3/\3/\3/\3/\3/\5/\u0240\n/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0254"+
		"\n\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u025f\n\65\f\65"+
		"\16\65\u0262\13\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\5\66\u026b\n\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\7\67\u027d\n\67\f\67\16\67\u0280\13\67\5\67\u0282\n\67\3\67"+
		"\5\67\u0285\n\67\38\38\38\38\38\58\u028c\n8\38\38\39\39\39\39\39\39\3"+
		"9\59\u0297\n9\39\39\3:\3:\5:\u029d\n:\3;\3;\3;\5;\u02a2\n;\3;\3;\3<\3"+
		"<\3<\3<\7<\u02aa\n<\f<\16<\u02ad\13<\3<\3<\3=\3=\3=\3=\3=\3=\3=\5=\u02b8"+
		"\n=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u02c2\n=\5=\u02c4\n=\3>\3>\3>\3>\3>\3>"+
		"\5>\u02cc\n>\3?\3?\3?\7?\u02d1\n?\f?\16?\u02d4\13?\3@\3@\3@\7@\u02d9\n"+
		"@\f@\16@\u02dc\13@\3A\3A\3A\7A\u02e1\nA\fA\16A\u02e4\13A\3B\3B\3B\5B\u02e9"+
		"\nB\3B\3B\3B\3B\3B\3C\3C\3D\3D\3D\3D\3D\5D\u02f7\nD\3E\3E\5E\u02fb\nE"+
		"\3F\3F\3F\3F\5F\u0301\nF\3G\3G\3G\3G\3H\3H\3H\5H\u030a\nH\3H\3H\3H\3H"+
		"\7H\u0310\nH\fH\16H\u0313\13H\3H\3H\3H\3H\3H\3H\7H\u031b\nH\fH\16H\u031e"+
		"\13H\3H\3H\3H\3H\3H\7H\u0325\nH\fH\16H\u0328\13H\3H\3H\3H\5H\u032d\nH"+
		"\3I\3I\3I\3I\5I\u0333\nI\3I\3I\3I\5I\u0338\nI\3J\3J\3K\3K\3K\3K\5K\u0340"+
		"\nK\3L\3L\3M\3M\3M\3M\5M\u0348\nM\3N\3N\3O\5O\u034d\nO\3O\3O\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\5P\u035c\nP\3Q\3Q\3Q\3Q\3Q\5Q\u0363\nQ\3R\3R"+
		"\3R\3R\3R\3S\5S\u036b\nS\3S\3S\5S\u036f\nS\7S\u0371\nS\fS\16S\u0374\13"+
		"S\3T\3T\3T\3T\3T\3T\3T\3T\5T\u037e\nT\3U\3U\3U\7U\u0383\nU\fU\16U\u0386"+
		"\13U\3U\5U\u0389\nU\3V\3V\3V\5V\u038e\nV\3W\3W\3W\3W\3W\5W\u0395\nW\3"+
		"X\3X\7X\u0399\nX\fX\16X\u039c\13X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3\\\3\\\3]\3"+
		"]\3]\3]\5]\u03ac\n]\3^\3^\3^\3^\3_\3_\3_\3`\3`\3`\7`\u03b8\n`\f`\16`\u03bb"+
		"\13`\3a\3a\5a\u03bf\na\3b\3b\3b\3b\3b\3b\5b\u03c7\nb\3c\3c\3c\3c\3c\3"+
		"c\7c\u03cf\nc\fc\16c\u03d2\13c\3c\3c\3c\5c\u03d7\nc\3c\5c\u03da\nc\3c"+
		"\3c\3d\3d\3d\3d\3e\3e\3e\5e\u03e5\ne\3f\3f\3f\3f\3f\3g\3g\3g\3g\3g\3h"+
		"\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3j\3j\3k\3k\3l\3l\3l\3l\3l\3m\3m\3m\7m"+
		"\u0408\nm\fm\16m\u040b\13m\3m\2\2n\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\2\20\5\2\36DIL\u0081\u0081"+
		"\4\2\u0092\u0092\u0094\u0097\3\2\3\4\3\2\u008b\u008c\7\2PPRRbbww\u0089"+
		"\u0089\3\2cf\3\2gl\3\2xy\4\2\7\7\u0081\u0081\4\2OOYY\4\2\13\20``\4\2\3"+
		"\4ss\6\2\5\6MMUUnn\4\2WW~~\2\u042b\2\u00da\3\2\2\2\4\u00f5\3\2\2\2\6\u00f7"+
		"\3\2\2\2\b\u00fb\3\2\2\2\n\u0120\3\2\2\2\f\u0122\3\2\2\2\16\u012f\3\2"+
		"\2\2\20\u0131\3\2\2\2\22\u013f\3\2\2\2\24\u014a\3\2\2\2\26\u0157\3\2\2"+
		"\2\30\u015b\3\2\2\2\32\u0168\3\2\2\2\34\u016a\3\2\2\2\36\u0172\3\2\2\2"+
		" \u0177\3\2\2\2\"\u0186\3\2\2\2$\u018a\3\2\2\2&\u018c\3\2\2\2(\u018e\3"+
		"\2\2\2*\u0190\3\2\2\2,\u0192\3\2\2\2.\u0194\3\2\2\2\60\u0196\3\2\2\2\62"+
		"\u019e\3\2\2\2\64\u01a6\3\2\2\2\66\u01ad\3\2\2\28\u01b4\3\2\2\2:\u01ba"+
		"\3\2\2\2<\u01bc\3\2\2\2>\u01ca\3\2\2\2@\u01d1\3\2\2\2B\u01d6\3\2\2\2D"+
		"\u01dd\3\2\2\2F\u01df\3\2\2\2H\u01e7\3\2\2\2J\u0201\3\2\2\2L\u0203\3\2"+
		"\2\2N\u020b\3\2\2\2P\u020e\3\2\2\2R\u0211\3\2\2\2T\u0220\3\2\2\2V\u0222"+
		"\3\2\2\2X\u022a\3\2\2\2Z\u022f\3\2\2\2\\\u023f\3\2\2\2^\u0241\3\2\2\2"+
		"`\u0247\3\2\2\2b\u024b\3\2\2\2d\u0253\3\2\2\2f\u0255\3\2\2\2h\u025a\3"+
		"\2\2\2j\u0265\3\2\2\2l\u0284\3\2\2\2n\u0286\3\2\2\2p\u028f\3\2\2\2r\u029c"+
		"\3\2\2\2t\u029e\3\2\2\2v\u02a5\3\2\2\2x\u02c3\3\2\2\2z\u02c5\3\2\2\2|"+
		"\u02cd\3\2\2\2~\u02d5\3\2\2\2\u0080\u02dd\3\2\2\2\u0082\u02e5\3\2\2\2"+
		"\u0084\u02ef\3\2\2\2\u0086\u02f6\3\2\2\2\u0088\u02fa\3\2\2\2\u008a\u0300"+
		"\3\2\2\2\u008c\u0302\3\2\2\2\u008e\u0309\3\2\2\2\u0090\u032e\3\2\2\2\u0092"+
		"\u0339\3\2\2\2\u0094\u033b\3\2\2\2\u0096\u0341\3\2\2\2\u0098\u0343\3\2"+
		"\2\2\u009a\u0349\3\2\2\2\u009c\u034c\3\2\2\2\u009e\u035b\3\2\2\2\u00a0"+
		"\u0362\3\2\2\2\u00a2\u0364\3\2\2\2\u00a4\u036a\3\2\2\2\u00a6\u037d\3\2"+
		"\2\2\u00a8\u0388\3\2\2\2\u00aa\u038a\3\2\2\2\u00ac\u038f\3\2\2\2\u00ae"+
		"\u0396\3\2\2\2\u00b0\u039d\3\2\2\2\u00b2\u03a0\3\2\2\2\u00b4\u03a3\3\2"+
		"\2\2\u00b6\u03a5\3\2\2\2\u00b8\u03ab\3\2\2\2\u00ba\u03ad\3\2\2\2\u00bc"+
		"\u03b1\3\2\2\2\u00be\u03b4\3\2\2\2\u00c0\u03be\3\2\2\2\u00c2\u03c0\3\2"+
		"\2\2\u00c4\u03c8\3\2\2\2\u00c6\u03dd\3\2\2\2\u00c8\u03e4\3\2\2\2\u00ca"+
		"\u03e6\3\2\2\2\u00cc\u03eb\3\2\2\2\u00ce\u03f0\3\2\2\2\u00d0\u03f7\3\2"+
		"\2\2\u00d2\u03fb\3\2\2\2\u00d4\u03fd\3\2\2\2\u00d6\u03ff\3\2\2\2\u00d8"+
		"\u0404\3\2\2\2\u00da\u00dc\5\4\3\2\u00db\u00dd\7\u0087\2\2\u00dc\u00db"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\5\24\13\2"+
		"\u00df\u00e0\7\31\2\2\u00e0\3\3\2\2\2\u00e1\u00e3\5\6\4\2\u00e2\u00e1"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7v\2\2\u00e5"+
		"\u00ea\5\f\7\2\u00e6\u00e7\7\21\2\2\u00e7\u00e8\5|?\2\u00e8\u00e9\7\22"+
		"\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\7\t\2\2\u00ed\u00f6\3\2\2\2\u00ee\u00f0\5\n"+
		"\6\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\7o\2\2\u00f2\u00f3\5\f\7\2\u00f3\u00f4\7\t\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00e2\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f6\5\3\2\2\2\u00f7\u00f8"+
		"\7\23\2\2\u00f8\u00f9\5\b\5\2\u00f9\u00fa\7\25\2\2\u00fa\7\3\2\2\2\u00fb"+
		"\u00fc\7a\2\2\u00fc\u00fd\7\21\2\2\u00fd\u0102\5.\30\2\u00fe\u00ff\7\b"+
		"\2\2\u00ff\u0101\5.\30\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u0106\7\22\2\2\u0106\t\3\2\2\2\u0107\u0108\7\23\2\2\u0108\u010d"+
		"\7Z\2\2\u0109\u010a\7\21\2\2\u010a\u010b\5.\30\2\u010b\u010c\7\22\2\2"+
		"\u010c\u010e\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111"+
		"\3\2\2\2\u010f\u0110\7\b\2\2\u0110\u0112\5\b\5\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0121\7\25\2\2\u0114\u0115\7"+
		"\23\2\2\u0115\u0116\5\b\5\2\u0116\u0117\7\b\2\2\u0117\u011c\7Z\2\2\u0118"+
		"\u0119\7\21\2\2\u0119\u011a\5.\30\2\u011a\u011b\7\22\2\2\u011b\u011d\3"+
		"\2\2\2\u011c\u0118\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\7\25\2\2\u011f\u0121\3\2\2\2\u0120\u0107\3\2\2\2\u0120\u0114\3"+
		"\2\2\2\u0121\13\3\2\2\2\u0122\u0123\7\u0090\2\2\u0123\r\3\2\2\2\u0124"+
		"\u0125\7\23\2\2\u0125\u012a\5\20\t\2\u0126\u0127\7\b\2\2\u0127\u0129\5"+
		"\20\t\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\25"+
		"\2\2\u012e\u0130\3\2\2\2\u012f\u0124\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\17\3\2\2\2\u0131\u013d\5\22\n\2\u0132\u0133\7\21\2\2\u0133\u0138\5\""+
		"\22\2\u0134\u0135\7\b\2\2\u0135\u0137\5\"\22\2\u0136\u0134\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\22\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u0132\3\2\2\2\u013d\u013e\3\2\2\2\u013e\21\3\2\2\2\u013f\u0140\t\2\2"+
		"\2\u0140\23\3\2\2\2\u0141\u0149\5\30\r\2\u0142\u0149\5\34\17\2\u0143\u0149"+
		"\5\60\31\2\u0144\u0149\5h\65\2\u0145\u0149\5p9\2\u0146\u0149\5\26\f\2"+
		"\u0147\u0149\7\u008a\2\2\u0148\u0141\3\2\2\2\u0148\u0142\3\2\2\2\u0148"+
		"\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u0150\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014f\5n"+
		"8\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0155\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0156\5\u00ba"+
		"^\2\u0154\u0156\7Y\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\25"+
		"\3\2\2\2\u0157\u0158\7\u0088\2\2\u0158\u0159\5|?\2\u0159\u015a\7\t\2\2"+
		"\u015a\27\3\2\2\2\u015b\u015c\7m\2\2\u015c\u0161\5\32\16\2\u015d\u015e"+
		"\7\b\2\2\u015e\u0160\5\32\16\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0165\7\t\2\2\u0165\31\3\2\2\2\u0166\u0169\5&\24\2\u0167"+
		"\u0169\5\f\7\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169\33\3\2\2"+
		"\2\u016a\u016e\7T\2\2\u016b\u016c\5\36\20\2\u016c\u016d\7\t\2\2\u016d"+
		"\u016f\3\2\2\2\u016e\u016b\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\35\3\2\2\2\u0172\u0173\5\f\7\2\u0173\u0174"+
		"\7\13\2\2\u0174\u0175\5\16\b\2\u0175\u0176\5\"\22\2\u0176\37\3\2\2\2\u0177"+
		"\u0178\7S\2\2\u0178\u0179\7\21\2\2\u0179\u017a\5&\24\2\u017a\u017b\7\22"+
		"\2\2\u017b!\3\2\2\2\u017c\u0187\5$\23\2\u017d\u017e\5*\26\2\u017e\u017f"+
		"\5$\23\2\u017f\u0187\3\2\2\2\u0180\u0187\5\f\7\2\u0181\u0182\5*\26\2\u0182"+
		"\u0183\5\f\7\2\u0183\u0187\3\2\2\2\u0184\u0187\5.\30\2\u0185\u0187\5 "+
		"\21\2\u0186\u017c\3\2\2\2\u0186\u017d\3\2\2\2\u0186\u0180\3\2\2\2\u0186"+
		"\u0181\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187#\3\2\2\2"+
		"\u0188\u018b\5&\24\2\u0189\u018b\5(\25\2\u018a\u0188\3\2\2\2\u018a\u0189"+
		"\3\2\2\2\u018b%\3\2\2\2\u018c\u018d\t\3\2\2\u018d\'\3\2\2\2\u018e\u018f"+
		"\7\u0093\2\2\u018f)\3\2\2\2\u0190\u0191\t\4\2\2\u0191+\3\2\2\2\u0192\u0193"+
		"\t\5\2\2\u0193-\3\2\2\2\u0194\u0195\7\u0091\2\2\u0195/\3\2\2\2\u0196\u019a"+
		"\7\177\2\2\u0197\u0198\5\62\32\2\u0198\u0199\7\t\2\2\u0199\u019b\3\2\2"+
		"\2\u019a\u0197\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d"+
		"\3\2\2\2\u019d\61\3\2\2\2\u019e\u019f\5\f\7\2\u019f\u01a0\7\13\2\2\u01a0"+
		"\u01a4\5\16\b\2\u01a1\u01a5\58\35\2\u01a2\u01a5\5\64\33\2\u01a3\u01a5"+
		"\5\66\34\2\u01a4\u01a1\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2"+
		"\u01a5\63\3\2\2\2\u01a6\u01a8\7]\2\2\u01a7\u01a9\5v<\2\u01a8\u01a7\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\7\n\2\2\u01ab"+
		"\u01ac\5\u0084C\2\u01ac\65\3\2\2\2\u01ad\u01af\7u\2\2\u01ae\u01b0\5v<"+
		"\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\67\3\2\2\2\u01b1\u01b5"+
		"\5:\36\2\u01b2\u01b5\5B\"\2\u01b3\u01b5\5f\64\2\u01b4\u01b1\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b59\3\2\2\2\u01b6\u01bb\5<\37\2"+
		"\u01b7\u01bb\5> \2\u01b8\u01bb\5@!\2\u01b9\u01bb\5F$\2\u01ba\u01b6\3\2"+
		"\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb"+
		";\3\2\2\2\u01bc\u01bd\7\21\2\2\u01bd\u01be\5|?\2\u01be\u01bf\7\22\2\2"+
		"\u01bf=\3\2\2\2\u01c0\u01c1\5\"\22\2\u01c1\u01c2\7\32\2\2\u01c2\u01c3"+
		"\5\"\22\2\u01c3\u01cb\3\2\2\2\u01c4\u01c5\5\u0090I\2\u01c5\u01c6\7\32"+
		"\2\2\u01c6\u01c7\5\u0090I\2\u01c7\u01c8\7\n\2\2\u01c8\u01c9\5@!\2\u01c9"+
		"\u01cb\3\2\2\2\u01ca\u01c0\3\2\2\2\u01ca\u01c4\3\2\2\2\u01cb?\3\2\2\2"+
		"\u01cc\u01d2\5\f\7\2\u01cd\u01d2\t\6\2\2\u01ce\u01d2\t\7\2\2\u01cf\u01d2"+
		"\t\b\2\2\u01d0\u01d2\t\t\2\2\u01d1\u01cc\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d1"+
		"\u01ce\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2A\3\2\2\2"+
		"\u01d3\u01d4\7t\2\2\u01d4\u01d7\5D#\2\u01d5\u01d7\5D#\2\u01d6\u01d3\3"+
		"\2\2\2\u01d6\u01d5\3\2\2\2\u01d7C\3\2\2\2\u01d8\u01de\5J&\2\u01d9\u01de"+
		"\5R*\2\u01da\u01de\5`\61\2\u01db\u01de\5d\63\2\u01dc\u01de\5H%\2\u01dd"+
		"\u01d8\3\2\2\2\u01dd\u01d9\3\2\2\2\u01dd\u01da\3\2\2\2\u01dd\u01db\3\2"+
		"\2\2\u01dd\u01dc\3\2\2\2\u01deE\3\2\2\2\u01df\u01e0\7\u0089\2\2\u01e0"+
		"\u01e3\7\21\2\2\u01e1\u01e4\5\f\7\2\u01e2\u01e4\5$\23\2\u01e3\u01e1\3"+
		"\2\2\2\u01e3\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\7\22\2\2\u01e6"+
		"G\3\2\2\2\u01e7\u01e8\7H\2\2\u01e8\u01ec\7\23\2\2\u01e9\u01ed\5\"\22\2"+
		"\u01ea\u01ed\5\f\7\2\u01eb\u01ed\5\u0090I\2\u01ec\u01e9\3\2\2\2\u01ec"+
		"\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\7\25"+
		"\2\2\u01ef\u01f0\7r\2\2\u01f0\u01f1\5\16\b\2\u01f1\u01f2\7R\2\2\u01f2"+
		"I\3\2\2\2\u01f3\u01f4\7N\2\2\u01f4\u01f5\7\23\2\2\u01f5\u01f6\5L\'\2\u01f6"+
		"\u01f7\7\25\2\2\u01f7\u01f8\7r\2\2\u01f8\u01f9\5P)\2\u01f9\u0202\3\2\2"+
		"\2\u01fa\u01fb\7N\2\2\u01fb\u01fc\7\24\2\2\u01fc\u01fd\5L\'\2\u01fd\u01fe"+
		"\7\26\2\2\u01fe\u01ff\7r\2\2\u01ff\u0200\5P)\2\u0200\u0202\3\2\2\2\u0201"+
		"\u01f3\3\2\2\2\u0201\u01fa\3\2\2\2\u0202K\3\2\2\2\u0203\u0208\5N(\2\u0204"+
		"\u0205\7\b\2\2\u0205\u0207\5N(\2\u0206\u0204\3\2\2\2\u0207\u020a\3\2\2"+
		"\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209M\3\2\2\2\u020a\u0208"+
		"\3\2\2\2\u020b\u020c\5\16\b\2\u020c\u020d\5:\36\2\u020dO\3\2\2\2\u020e"+
		"\u020f\5\16\b\2\u020f\u0210\58\35\2\u0210Q\3\2\2\2\u0211\u0213\7z\2\2"+
		"\u0212\u0214\5T+\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216"+
		"\3\2\2\2\u0215\u0217\7\t\2\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0219\7Y\2\2\u0219S\3\2\2\2\u021a\u021d\5V,\2\u021b"+
		"\u021c\7\t\2\2\u021c\u021e\5Z.\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2"+
		"\2\u021e\u0221\3\2\2\2\u021f\u0221\5Z.\2\u0220\u021a\3\2\2\2\u0220\u021f"+
		"\3\2\2\2\u0221U\3\2\2\2\u0222\u0227\5X-\2\u0223\u0224\7\t\2\2\u0224\u0226"+
		"\5X-\2\u0225\u0223\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228W\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022b\5|?\2\u022b"+
		"\u022c\7\n\2\2\u022c\u022d\5\16\b\2\u022d\u022e\58\35\2\u022eY\3\2\2\2"+
		"\u022f\u0230\7Q\2\2\u0230\u0231\5\\/\2\u0231\u0232\7r\2\2\u0232\u0237"+
		"\5^\60\2\u0233\u0234\7\t\2\2\u0234\u0236\5^\60\2\u0235\u0233\3\2\2\2\u0236"+
		"\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238[\3\2\2\2"+
		"\u0239\u0237\3\2\2\2\u023a\u023b\5\f\7\2\u023b\u023c\7\n\2\2\u023c\u023d"+
		"\5@!\2\u023d\u0240\3\2\2\2\u023e\u0240\5@!\2\u023f\u023a\3\2\2\2\u023f"+
		"\u023e\3\2\2\2\u0240]\3\2\2\2\u0241\u0242\5\u0080A\2\u0242\u0243\7\n\2"+
		"\2\u0243\u0244\7\21\2\2\u0244\u0245\5T+\2\u0245\u0246\7\22\2\2\u0246_"+
		"\3\2\2\2\u0247\u0248\7|\2\2\u0248\u0249\7r\2\2\u0249\u024a\5b\62\2\u024a"+
		"a\3\2\2\2\u024b\u024c\5:\36\2\u024cc\3\2\2\2\u024d\u024e\7[\2\2\u024e"+
		"\u024f\7r\2\2\u024f\u0250\5\16\b\2\u0250\u0251\58\35\2\u0251\u0254\3\2"+
		"\2\2\u0252\u0254\7[\2\2\u0253\u024d\3\2\2\2\u0253\u0252\3\2\2\2\u0254"+
		"e\3\2\2\2\u0255\u0256\5\16\b\2\u0256\u0257\7\27\2\2\u0257\u0258\5\16\b"+
		"\2\u0258\u0259\5@!\2\u0259g\3\2\2\2\u025a\u025b\7\u0082\2\2\u025b\u0260"+
		"\5j\66\2\u025c\u025d\7\t\2\2\u025d\u025f\5j\66\2\u025e\u025c\3\2\2\2\u025f"+
		"\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2"+
		"\2\2\u0262\u0260\3\2\2\2\u0263\u0264\7\t\2\2\u0264i\3\2\2\2\u0265\u0266"+
		"\5|?\2\u0266\u0267\7\n\2\2\u0267\u0268\5\16\b\2\u0268\u026a\58\35\2\u0269"+
		"\u026b\5l\67\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026bk\3\2\2\2"+
		"\u026c\u026d\t\n\2\2\u026d\u0285\5\f\7\2\u026e\u026f\t\n\2\2\u026f\u0285"+
		"\5\u009cO\2\u0270\u0271\t\n\2\2\u0271\u0285\7\u0085\2\2\u0272\u0273\t"+
		"\n\2\2\u0273\u0281\7\23\2\2\u0274\u0275\5~@\2\u0275\u0276\7\n\2\2\u0276"+
		"\u027e\5\u009cO\2\u0277\u0278\7\t\2\2\u0278\u0279\5~@\2\u0279\u027a\7"+
		"\n\2\2\u027a\u027b\5\u009cO\2\u027b\u027d\3\2\2\2\u027c\u0277\3\2\2\2"+
		"\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0282"+
		"\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0274\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u0283\3\2\2\2\u0283\u0285\7\25\2\2\u0284\u026c\3\2\2\2\u0284\u026e\3"+
		"\2\2\2\u0284\u0270\3\2\2\2\u0284\u0272\3\2\2\2\u0285m\3\2\2\2\u0286\u0287"+
		"\7~\2\2\u0287\u0288\t\13\2\2\u0288\u028b\7V\2\2\u0289\u028c\5\u00ba^\2"+
		"\u028a\u028c\5\u0086D\2\u028b\u0289\3\2\2\2\u028b\u028a\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028e\7\t\2\2\u028eo\3\2\2\2\u028f\u0290\5\16\b\2"+
		"\u0290\u0296\5r:\2\u0291\u0297\5\24\13\2\u0292\u0297\7E\2\2\u0293\u0297"+
		"\7D\2\2\u0294\u0297\7F\2\2\u0295\u0297\7G\2\2\u0296\u0291\3\2\2\2\u0296"+
		"\u0292\3\2\2\2\u0296\u0293\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0295\3\2"+
		"\2\2\u0297\u0298\3\2\2\2\u0298\u0299\7\t\2\2\u0299q\3\2\2\2\u029a\u029d"+
		"\5t;\2\u029b\u029d\5\u0082B\2\u029c\u029a\3\2\2\2\u029c\u029b\3\2\2\2"+
		"\u029ds\3\2\2\2\u029e\u029f\7u\2\2\u029f\u02a1\5\f\7\2\u02a0\u02a2\5v"+
		"<\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u02a4\7\t\2\2\u02a4u\3\2\2\2\u02a5\u02a6\7\21\2\2\u02a6\u02ab\5x=\2\u02a7"+
		"\u02a8\7\t\2\2\u02a8\u02aa\5x=\2\u02a9\u02a7\3\2\2\2\u02aa\u02ad\3\2\2"+
		"\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\3\2\2\2\u02ad\u02ab"+
		"\3\2\2\2\u02ae\u02af\7\22\2\2\u02afw\3\2\2\2\u02b0\u02c4\5z>\2\u02b1\u02b2"+
		"\7\u0082\2\2\u02b2\u02c4\5z>\2\u02b3\u02b4\5\16\b\2\u02b4\u02b5\7]\2\2"+
		"\u02b5\u02b7\5\f\7\2\u02b6\u02b8\5v<\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8"+
		"\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\7\n\2\2\u02ba\u02bb\5\16\b\2"+
		"\u02bb\u02bc\5\u0084C\2\u02bc\u02c4\3\2\2\2\u02bd\u02be\5\16\b\2\u02be"+
		"\u02bf\7u\2\2\u02bf\u02c1\5\f\7\2\u02c0\u02c2\5v<\2\u02c1\u02c0\3\2\2"+
		"\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3\u02b0\3\2\2\2\u02c3\u02b1"+
		"\3\2\2\2\u02c3\u02b3\3\2\2\2\u02c3\u02bd\3\2\2\2\u02c4y\3\2\2\2\u02c5"+
		"\u02c6\5|?\2\u02c6\u02c7\7\n\2\2\u02c7\u02c8\5\16\b\2\u02c8\u02cb\58\35"+
		"\2\u02c9\u02ca\7\7\2\2\u02ca\u02cc\5\u0090I\2\u02cb\u02c9\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cc{\3\2\2\2\u02cd\u02d2\5\f\7\2\u02ce\u02cf\7\b\2\2"+
		"\u02cf\u02d1\5\f\7\2\u02d0\u02ce\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0"+
		"\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3}\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5"+
		"\u02da\5\f\7\2\u02d6\u02d7\7\b\2\2\u02d7\u02d9\5\f\7\2\u02d8\u02d6\3\2"+
		"\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\177\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02e2\5\"\22\2\u02de\u02df\7\b"+
		"\2\2\u02df\u02e1\5\"\22\2\u02e0\u02de\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2"+
		"\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u0081\3\2\2\2\u02e4\u02e2\3\2"+
		"\2\2\u02e5\u02e6\7]\2\2\u02e6\u02e8\5\f\7\2\u02e7\u02e9\5v<\2\u02e8\u02e7"+
		"\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\7\n\2\2\u02eb"+
		"\u02ec\5\16\b\2\u02ec\u02ed\5\u0084C\2\u02ed\u02ee\7\t\2\2\u02ee\u0083"+
		"\3\2\2\2\u02ef\u02f0\5@!\2\u02f0\u0085\3\2\2\2\u02f1\u02f2\5\32\16\2\u02f2"+
		"\u02f3\7\n\2\2\u02f3\u02f4\5\u0088E\2\u02f4\u02f7\3\2\2\2\u02f5\u02f7"+
		"\5\u0088E\2\u02f6\u02f1\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7\u0087\3\2\2"+
		"\2\u02f8\u02fb\5\u008aF\2\u02f9\u02fb\5\u00b8]\2\u02fa\u02f8\3\2\2\2\u02fa"+
		"\u02f9\3\2\2\2\u02fb\u0089\3\2\2\2\u02fc\u0301\5\u008cG\2\u02fd\u0301"+
		"\5\u00acW\2\u02fe\u0301\5\u00b2Z\2\u02ff\u0301\5\u00b4[\2\u0300\u02fc"+
		"\3\2\2\2\u0300\u02fd\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u02ff\3\2\2\2\u0301"+
		"\u008b\3\2\2\2\u0302\u0303\5\u008eH\2\u0303\u0304\7\7\2\2\u0304\u0305"+
		"\5\u0090I\2\u0305\u008d\3\2\2\2\u0306\u0307\7\30\2\2\u0307\u030a\5\f\7"+
		"\2\u0308\u030a\5\f\7\2\u0309\u0306\3\2\2\2\u0309\u0308\3\2\2\2\u030a\u0326"+
		"\3\2\2\2\u030b\u030c\7\23\2\2\u030c\u0311\5\u0090I\2\u030d\u030e\7\b\2"+
		"\2\u030e\u0310\5\u0090I\2\u030f\u030d\3\2\2\2\u0310\u0313\3\2\2\2\u0311"+
		"\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313\u0311\3\2"+
		"\2\2\u0314\u0315\7\25\2\2\u0315\u0325\3\2\2\2\u0316\u0317\7\24\2\2\u0317"+
		"\u031c\5\u0090I\2\u0318\u0319\7\b\2\2\u0319\u031b\5\u0090I\2\u031a\u0318"+
		"\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d"+
		"\u031f\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0320\7\26\2\2\u0320\u0325\3"+
		"\2\2\2\u0321\u0322\7\31\2\2\u0322\u0325\5\f\7\2\u0323\u0325\7\27\2\2\u0324"+
		"\u030b\3\2\2\2\u0324\u0316\3\2\2\2\u0324\u0321\3\2\2\2\u0324\u0323\3\2"+
		"\2\2\u0325\u0328\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u032c\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u032a\7\n\2\2\u032a\u032b\7\n"+
		"\2\2\u032b\u032d\5\f\7\2\u032c\u0329\3\2\2\2\u032c\u032d\3\2\2\2\u032d"+
		"\u008f\3\2\2\2\u032e\u0332\5\u0094K\2\u032f\u0330\5\u0092J\2\u0330\u0331"+
		"\5\u0090I\2\u0331\u0333\3\2\2\2\u0332\u032f\3\2\2\2\u0332\u0333\3\2\2"+
		"\2\u0333\u0337\3\2\2\2\u0334\u0335\7\n\2\2\u0335\u0336\7\n\2\2\u0336\u0338"+
		"\5\f\7\2\u0337\u0334\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0091\3\2\2\2\u0339"+
		"\u033a\t\f\2\2\u033a\u0093\3\2\2\2\u033b\u033f\5\u0098M\2\u033c\u033d"+
		"\5\u0096L\2\u033d\u033e\5\u0094K\2\u033e\u0340\3\2\2\2\u033f\u033c\3\2"+
		"\2\2\u033f\u0340\3\2\2\2\u0340\u0095\3\2\2\2\u0341\u0342\t\r\2\2\u0342"+
		"\u0097\3\2\2\2\u0343\u0347\5\u009cO\2\u0344\u0345\5\u009aN\2\u0345\u0346"+
		"\5\u0098M\2\u0346\u0348\3\2\2\2\u0347\u0344\3\2\2\2\u0347\u0348\3\2\2"+
		"\2\u0348\u0099\3\2\2\2\u0349\u034a\t\16\2\2\u034a\u009b\3\2\2\2\u034b"+
		"\u034d\t\4\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2"+
		"\2\2\u034e\u034f\5\u009eP\2\u034f\u009d\3\2\2\2\u0350\u035c\5\u008eH\2"+
		"\u0351\u0352\7\21\2\2\u0352\u0353\5\u0090I\2\u0353\u0354\7\22\2\2\u0354"+
		"\u035c\3\2\2\2\u0355\u035c\5\u00a2R\2\u0356\u035c\5\u00a0Q\2\u0357\u035c"+
		"\5\u00a6T\2\u0358\u0359\7q\2\2\u0359\u035c\5\u009eP\2\u035a\u035c\5,\27"+
		"\2\u035b\u0350\3\2\2\2\u035b\u0351\3\2\2\2\u035b\u0355\3\2\2\2\u035b\u0356"+
		"\3\2\2\2\u035b\u0357\3\2\2\2\u035b\u0358\3\2\2\2\u035b\u035a\3\2\2\2\u035c"+
		"\u009f\3\2\2\2\u035d\u0363\5$\23\2\u035e\u0363\5 \21\2\u035f\u0363\5."+
		"\30\2\u0360\u0363\7p\2\2\u0361\u0363\7\u0085\2\2\u0362\u035d\3\2\2\2\u0362"+
		"\u035e\3\2\2\2\u0362\u035f\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0361\3\2"+
		"\2\2\u0363\u00a1\3\2\2\2\u0364\u0365\5\f\7\2\u0365\u0366\7\21\2\2\u0366"+
		"\u0367\5\u00a4S\2\u0367\u0368\7\22\2\2\u0368\u00a3\3\2\2\2\u0369\u036b"+
		"\5\u00aeX\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u0372\3\2\2"+
		"\2\u036c\u036e\7\b\2\2\u036d\u036f\5\u00aeX\2\u036e\u036d\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u0371\3\2\2\2\u0370\u036c\3\2\2\2\u0371\u0374\3\2"+
		"\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u00a5\3\2\2\2\u0374"+
		"\u0372\3\2\2\2\u0375\u0376\7\23\2\2\u0376\u0377\5\u00a8U\2\u0377\u0378"+
		"\7\25\2\2\u0378\u037e\3\2\2\2\u0379\u037a\7\24\2\2\u037a\u037b\5\u00a8"+
		"U\2\u037b\u037c\7\26\2\2\u037c\u037e\3\2\2\2\u037d\u0375\3\2\2\2\u037d"+
		"\u0379\3\2\2\2\u037e\u00a7\3\2\2\2\u037f\u0384\5\u00aaV\2\u0380\u0381"+
		"\7\b\2\2\u0381\u0383\5\u00aaV\2\u0382\u0380\3\2\2\2\u0383\u0386\3\2\2"+
		"\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0389\3\2\2\2\u0386\u0384"+
		"\3\2\2\2\u0387\u0389\3\2\2\2\u0388\u037f\3\2\2\2\u0388\u0387\3\2\2\2\u0389"+
		"\u00a9\3\2\2\2\u038a\u038d\5\u0090I\2\u038b\u038c\7\32\2\2\u038c\u038e"+
		"\5\u0090I\2\u038d\u038b\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u00ab\3\2\2"+
		"\2\u038f\u0394\5\f\7\2\u0390\u0391\7\21\2\2\u0391\u0392\5\u00a4S\2\u0392"+
		"\u0393\7\22\2\2\u0393\u0395\3\2\2\2\u0394\u0390\3\2\2\2\u0394\u0395\3"+
		"\2\2\2\u0395\u00ad\3\2\2\2\u0396\u039a\5\u0090I\2\u0397\u0399\5\u00b0"+
		"Y\2\u0398\u0397\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a"+
		"\u039b\3\2\2\2\u039b\u00af\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039e\7\n"+
		"\2\2\u039e\u039f\5\u0090I\2\u039f\u00b1\3\2\2\2\u03a0\u03a1\7^\2\2\u03a1"+
		"\u03a2\5\32\16\2\u03a2\u00b3\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u00b5\3"+
		"\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u00b7\3\2\2\2\u03a7\u03ac\5\u00ba^\2"+
		"\u03a8\u03ac\5\u00c0a\2\u03a9\u03ac\5\u00c8e\2\u03aa\u03ac\5\u00d6l\2"+
		"\u03ab\u03a7\3\2\2\2\u03ab\u03a8\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03aa"+
		"\3\2\2\2\u03ac\u00b9\3\2\2\2\u03ad\u03ae\7O\2\2\u03ae\u03af\5\u00be`\2"+
		"\u03af\u03b0\7Y\2\2\u03b0\u00bb\3\2\2\2\u03b1\u03b2\5\u00be`\2\u03b2\u03b3"+
		"\7Y\2\2\u03b3\u00bd\3\2\2\2\u03b4\u03b9\5\u0086D\2\u03b5\u03b6\7\t\2\2"+
		"\u03b6\u03b8\5\u0086D\2\u03b7\u03b5\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9"+
		"\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u00bf\3\2\2\2\u03bb\u03b9\3\2"+
		"\2\2\u03bc\u03bf\5\u00c2b\2\u03bd\u03bf\5\u00c4c\2\u03be\u03bc\3\2\2\2"+
		"\u03be\u03bd\3\2\2\2\u03bf\u00c1\3\2\2\2\u03c0\u03c1\7_\2\2\u03c1\u03c2"+
		"\5\u0090I\2\u03c2\u03c3\7}\2\2\u03c3\u03c6\5\u0086D\2\u03c4\u03c5\7X\2"+
		"\2\u03c5\u03c7\5\u0086D\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7"+
		"\u00c3\3\2\2\2\u03c8\u03c9\7Q\2\2\u03c9\u03ca\5\u0090I\2\u03ca\u03cb\7"+
		"r\2\2\u03cb\u03d0\5\u00c6d\2\u03cc\u03cd\7\t\2\2\u03cd\u03cf\5\u00c6d"+
		"\2\u03ce\u03cc\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1"+
		"\3\2\2\2\u03d1\u03d6\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u03d4\7\t\2\2\u03d4"+
		"\u03d5\7X\2\2\u03d5\u03d7\5\u00be`\2\u03d6\u03d3\3\2\2\2\u03d6\u03d7\3"+
		"\2\2\2\u03d7\u03d9\3\2\2\2\u03d8\u03da\7\t\2\2\u03d9\u03d8\3\2\2\2\u03d9"+
		"\u03da\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\7Y\2\2\u03dc\u00c5\3\2"+
		"\2\2\u03dd\u03de\5\u0080A\2\u03de\u03df\7\n\2\2\u03df\u03e0\5\u0086D\2"+
		"\u03e0\u00c7\3\2\2\2\u03e1\u03e5\5\u00caf\2\u03e2\u03e5\5\u00ccg\2\u03e3"+
		"\u03e5\5\u00ceh\2\u03e4\u03e1\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4\u03e3"+
		"\3\2\2\2\u03e5\u00c9\3\2\2\2\u03e6\u03e7\7\u0083\2\2\u03e7\u03e8\5\u0090"+
		"I\2\u03e8\u03e9\7V\2\2\u03e9\u03ea\5\u0086D\2\u03ea\u00cb\3\2\2\2\u03eb"+
		"\u03ec\7{\2\2\u03ec\u03ed\5\u00be`\2\u03ed\u03ee\7\u0080\2\2\u03ee\u03ef"+
		"\5\u0090I\2\u03ef\u00cd\3\2\2\2\u03f0\u03f1\7\\\2\2\u03f1\u03f2\5\f\7"+
		"\2\u03f2\u03f3\7\7\2\2\u03f3\u03f4\5\u00d0i\2\u03f4\u03f5\7V\2\2\u03f5"+
		"\u03f6\5\u0086D\2\u03f6\u00cf\3\2\2\2\u03f7\u03f8\5\u00d2j\2\u03f8\u03f9"+
		"\t\17\2\2\u03f9\u03fa\5\u00d4k\2\u03fa\u00d1\3\2\2\2\u03fb\u03fc\5\u0090"+
		"I\2\u03fc\u00d3\3\2\2\2\u03fd\u03fe\5\u0090I\2\u03fe\u00d5\3\2\2\2\u03ff"+
		"\u0400\7\u0084\2\2\u0400\u0401\5\u00d8m\2\u0401\u0402\7V\2\2\u0402\u0403"+
		"\5\u0086D\2\u0403\u00d7\3\2\2\2\u0404\u0409\5\u008eH\2\u0405\u0406\7\b"+
		"\2\2\u0406\u0408\5\u008eH\2\u0407\u0405\3\2\2\2\u0408\u040b\3\2\2\2\u0409"+
		"\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u00d9\3\2\2\2\u040b\u0409\3\2"+
		"\2\2c\u00dc\u00e2\u00ea\u00ef\u00f5\u0102\u010d\u0111\u011c\u0120\u012a"+
		"\u012f\u0138\u013d\u0148\u014a\u0150\u0155\u0161\u0168\u0170\u0186\u018a"+
		"\u019c\u01a4\u01a8\u01af\u01b4\u01ba\u01ca\u01d1\u01d6\u01dd\u01e3\u01ec"+
		"\u0201\u0208\u0213\u0216\u021d\u0220\u0227\u0237\u023f\u0253\u0260\u026a"+
		"\u027e\u0281\u0284\u028b\u0296\u029c\u02a1\u02ab\u02b7\u02c1\u02c3\u02cb"+
		"\u02d2\u02da\u02e2\u02e8\u02f6\u02fa\u0300\u0309\u0311\u031c\u0324\u0326"+
		"\u032c\u0332\u0337\u033f\u0347\u034c\u035b\u0362\u036a\u036e\u0372\u037d"+
		"\u0384\u0388\u038d\u0394\u039a\u03ab\u03b9\u03be\u03c6\u03d0\u03d6\u03d9"+
		"\u03e4\u0409";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}