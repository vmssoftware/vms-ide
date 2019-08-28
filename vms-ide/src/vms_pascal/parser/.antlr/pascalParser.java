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
		ALIGN=1, ALIGNED=2, UNALIGNED=3, AT=4, AUTOMATIC=5, COMMON=6, STATIC=7, 
		PSECT=8, ASYNCHRONOUS=9, CHECK=10, FLOAT=11, ENUMERATION_SIZE=12, PEN_CHECKING_STYLE=13, 
		HiDDEN=14, IDENT=15, INITIALIZE=16, KEY=17, LIST=18, OPTIMIZE=19, NOOPTIMIZE=20, 
		CLASS_A=21, CLASS_NCA=22, CLASS_S=23, IMMEDIATE=24, REFERENCE=25, POS=26, 
		READONLY=27, BIT=28, BYTE=29, WORD=30, LONG=31, QUAD=32, OCTA=33, TRUNCATE=34, 
		UNBOUND=35, UNSAFE=36, LOCAL=37, GLOBAL=38, EXTERNAL=39, WEAK_GLOBAL=40, 
		WEAK_EXTERNAL=41, VOLATILE=42, WRITEONLY=43, DOWN_LINE=44, AND=45, ARRAY=46, 
		BEGIN=47, BOOLEAN=48, CASE=49, CHAR=50, CHR=51, CONST=52, DIV=53, DO=54, 
		DOWNTO=55, ELSE=56, END=57, ENVIRONMENT=58, FILE=59, FOR=60, FUNCTION=61, 
		GOTO=62, IF=63, IN=64, INHERIT=65, INTEGER=66, LABEL=67, MOD=68, NIL=69, 
		NOT=70, OF=71, OR=72, PACKED=73, PROCEDURE=74, PROGRAM=75, REAL=76, RECORD=77, 
		REPEAT=78, SET=79, THEN=80, TO=81, TYPE=82, UNTIL=83, VALUE=84, VAR=85, 
		WHILE=86, WITH=87, ZERO=88, PLUS=89, MINUS=90, STAR=91, SLASH=92, ASSIGN=93, 
		COMMA=94, SEMI=95, COLON=96, EQUAL=97, NOT_EQUAL=98, LT=99, LE=100, GE=101, 
		GT=102, LPAREN=103, RPAREN=104, LBRACK=105, LBRACK2=106, MODULE=107, RBRACK=108, 
		RBRACK2=109, POINTER=110, ATP=111, DOT=112, DOTDOT=113, LCURLY=114, RCURLY=115, 
		UNIT=116, INTERFACE=117, USES=118, STRING=119, IMPLEMENTATION=120, TRUE=121, 
		FALSE=122, WS=123, COMMENT_1=124, COMMENT_2=125, IDENTIFIER=126, STRING_LITERAL=127, 
		NUM_INT=128, NUM_REAL=129;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_inheritAttr = 2, RULE_inherit = 3, 
		RULE_invironmentAttr = 4, RULE_identifier = 5, RULE_attributePart = 6, 
		RULE_attributeDef = 7, RULE_attribute = 8, RULE_block = 9, RULE_usesUnitsPart = 10, 
		RULE_labelDeclarationPart = 11, RULE_label = 12, RULE_constantDefinitionPart = 13, 
		RULE_constantDefinition = 14, RULE_constantChr = 15, RULE_constant = 16, 
		RULE_unsignedNumber = 17, RULE_unsignedInteger = 18, RULE_unsignedReal = 19, 
		RULE_sign = 20, RULE_bool = 21, RULE_string = 22, RULE_typeDefinitionPart = 23, 
		RULE_typeDefinition = 24, RULE_functionType = 25, RULE_procedureType = 26, 
		RULE_type = 27, RULE_simpleType = 28, RULE_scalarType = 29, RULE_subrangeType = 30, 
		RULE_typeIdentifier = 31, RULE_structuredType = 32, RULE_unpackedStructuredType = 33, 
		RULE_stringtype = 34, RULE_arrayType = 35, RULE_typeList = 36, RULE_indexType = 37, 
		RULE_componentType = 38, RULE_recordType = 39, RULE_fieldList = 40, RULE_fixedPart = 41, 
		RULE_recordSection = 42, RULE_variantPart = 43, RULE_tag = 44, RULE_variant = 45, 
		RULE_setType = 46, RULE_baseType = 47, RULE_fileType = 48, RULE_pointerType = 49, 
		RULE_variableDeclarationPart = 50, RULE_variableDeclaration = 51, RULE_variablePreDeclaration = 52, 
		RULE_toBeginEndDoDeclarationPart = 53, RULE_procedureAndFunctionDeclarationPart = 54, 
		RULE_procedureOrFunctionDeclaration = 55, RULE_procedureDeclaration = 56, 
		RULE_formalParameterList = 57, RULE_formalParameterSection = 58, RULE_parameterGroup = 59, 
		RULE_identifierList = 60, RULE_initializerList = 61, RULE_constList = 62, 
		RULE_functionDeclaration = 63, RULE_resultType = 64, RULE_statement = 65, 
		RULE_unlabelledStatement = 66, RULE_simpleStatement = 67, RULE_assignmentStatement = 68, 
		RULE_variable = 69, RULE_expression = 70, RULE_relationaloperator = 71, 
		RULE_simpleExpression = 72, RULE_additiveoperator = 73, RULE_term = 74, 
		RULE_multiplicativeoperator = 75, RULE_signedFactor = 76, RULE_factor = 77, 
		RULE_unsignedConstant = 78, RULE_functionDesignator = 79, RULE_parameterList = 80, 
		RULE_set = 81, RULE_elementList = 82, RULE_element = 83, RULE_procedureStatement = 84, 
		RULE_actualParameter = 85, RULE_parameterwidth = 86, RULE_gotoStatement = 87, 
		RULE_emptyStatement = 88, RULE_empty = 89, RULE_structuredStatement = 90, 
		RULE_compoundStatement = 91, RULE_openCompoundStatement = 92, RULE_statements = 93, 
		RULE_conditionalStatement = 94, RULE_ifStatement = 95, RULE_caseStatement = 96, 
		RULE_caseListElement = 97, RULE_repetetiveStatement = 98, RULE_whileStatement = 99, 
		RULE_repeatStatement = 100, RULE_forStatement = 101, RULE_forList = 102, 
		RULE_initialValue = 103, RULE_finalValue = 104, RULE_withStatement = 105, 
		RULE_recordVariableList = 106;
	public static final String[] ruleNames = {
		"program", "programHeading", "inheritAttr", "inherit", "invironmentAttr", 
		"identifier", "attributePart", "attributeDef", "attribute", "block", "usesUnitsPart", 
		"labelDeclarationPart", "label", "constantDefinitionPart", "constantDefinition", 
		"constantChr", "constant", "unsignedNumber", "unsignedInteger", "unsignedReal", 
		"sign", "bool", "string", "typeDefinitionPart", "typeDefinition", "functionType", 
		"procedureType", "type", "simpleType", "scalarType", "subrangeType", "typeIdentifier", 
		"structuredType", "unpackedStructuredType", "stringtype", "arrayType", 
		"typeList", "indexType", "componentType", "recordType", "fieldList", "fixedPart", 
		"recordSection", "variantPart", "tag", "variant", "setType", "baseType", 
		"fileType", "pointerType", "variableDeclarationPart", "variableDeclaration", 
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'_'", null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "':='", "','", 
		"';'", "':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", 
		"'['", "'(.'", null, "']'", "'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", 
		"'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ALIGN", "ALIGNED", "UNALIGNED", "AT", "AUTOMATIC", "COMMON", "STATIC", 
		"PSECT", "ASYNCHRONOUS", "CHECK", "FLOAT", "ENUMERATION_SIZE", "PEN_CHECKING_STYLE", 
		"HiDDEN", "IDENT", "INITIALIZE", "KEY", "LIST", "OPTIMIZE", "NOOPTIMIZE", 
		"CLASS_A", "CLASS_NCA", "CLASS_S", "IMMEDIATE", "REFERENCE", "POS", "READONLY", 
		"BIT", "BYTE", "WORD", "LONG", "QUAD", "OCTA", "TRUNCATE", "UNBOUND", 
		"UNSAFE", "LOCAL", "GLOBAL", "EXTERNAL", "WEAK_GLOBAL", "WEAK_EXTERNAL", 
		"VOLATILE", "WRITEONLY", "DOWN_LINE", "AND", "ARRAY", "BEGIN", "BOOLEAN", 
		"CASE", "CHAR", "CHR", "CONST", "DIV", "DO", "DOWNTO", "ELSE", "END", 
		"ENVIRONMENT", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", "INHERIT", 
		"INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", 
		"PROGRAM", "REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", 
		"VALUE", "VAR", "WHILE", "WITH", "ZERO", "PLUS", "MINUS", "STAR", "SLASH", 
		"ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", 
		"GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", "MODULE", "RBRACK", 
		"RBRACK2", "POINTER", "ATP", "DOT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", 
		"INTERFACE", "USES", "STRING", "IMPLEMENTATION", "TRUE", "FALSE", "WS", 
		"COMMENT_1", "COMMENT_2", "IDENTIFIER", "STRING_LITERAL", "NUM_INT", "NUM_REAL"
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
			setState(214);
			programHeading();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERFACE) {
				{
				setState(215);
				match(INTERFACE);
				}
			}

			setState(218);
			block();
			setState(219);
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
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(221);
					inheritAttr();
					}
				}

				setState(224);
				match(PROGRAM);
				setState(225);
				identifier();
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(226);
					match(LPAREN);
					setState(227);
					identifierList();
					setState(228);
					match(RPAREN);
					}
				}

				setState(232);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(234);
					invironmentAttr();
					}
				}

				setState(237);
				match(MODULE);
				setState(238);
				identifier();
				setState(239);
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
			setState(243);
			match(LBRACK);
			setState(244);
			inherit();
			setState(245);
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
			setState(247);
			match(INHERIT);
			setState(248);
			match(LPAREN);
			setState(249);
			string();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(250);
				match(COMMA);
				setState(251);
				string();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
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
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(LBRACK);
				setState(260);
				match(ENVIRONMENT);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(261);
					match(LPAREN);
					setState(262);
					string();
					setState(263);
					match(RPAREN);
					}
				}

				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(267);
					match(COMMA);
					setState(268);
					inherit();
					}
				}

				setState(271);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(LBRACK);
				setState(273);
				inherit();
				setState(274);
				match(COMMA);
				setState(275);
				match(ENVIRONMENT);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(276);
					match(LPAREN);
					setState(277);
					string();
					setState(278);
					match(RPAREN);
					}
				}

				setState(282);
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
			setState(286);
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
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(288);
				match(LBRACK);
				setState(289);
				attributeDef();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(290);
					match(COMMA);
					setState(291);
					attributeDef();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
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
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
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
		enterRule(_localctx, 14, RULE_attributeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			attribute();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(302);
				match(LPAREN);
				setState(305);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(303);
					string();
					}
					break;
				case IDENTIFIER:
					{
					setState(304);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(307);
					match(COMMA);
					setState(310);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRING_LITERAL:
						{
						setState(308);
						string();
						}
						break;
					case IDENTIFIER:
						{
						setState(309);
						identifier();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
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
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALIGN) | (1L << ALIGNED) | (1L << UNALIGNED) | (1L << AT) | (1L << AUTOMATIC) | (1L << COMMON) | (1L << STATIC) | (1L << PSECT) | (1L << ASYNCHRONOUS) | (1L << CHECK) | (1L << FLOAT) | (1L << ENUMERATION_SIZE) | (1L << PEN_CHECKING_STYLE) | (1L << HiDDEN) | (1L << IDENT) | (1L << INITIALIZE) | (1L << KEY) | (1L << LIST) | (1L << OPTIMIZE) | (1L << NOOPTIMIZE) | (1L << CLASS_A) | (1L << CLASS_NCA) | (1L << CLASS_S) | (1L << IMMEDIATE) | (1L << REFERENCE) | (1L << POS) | (1L << READONLY) | (1L << BIT) | (1L << BYTE) | (1L << WORD) | (1L << LONG) | (1L << QUAD) | (1L << OCTA) | (1L << TRUNCATE) | (1L << UNBOUND) | (1L << UNSAFE) | (1L << LOCAL) | (1L << GLOBAL) | (1L << EXTERNAL) | (1L << WEAK_GLOBAL) | (1L << WEAK_EXTERNAL) | (1L << VOLATILE) | (1L << WRITEONLY))) != 0) || _la==VALUE) ) {
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
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==FUNCTION || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (LABEL - 67)) | (1L << (PROCEDURE - 67)) | (1L << (TYPE - 67)) | (1L << (VAR - 67)) | (1L << (LBRACK - 67)) | (1L << (USES - 67)) | (1L << (IMPLEMENTATION - 67)))) != 0)) {
				{
				setState(330);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LABEL:
					{
					setState(323);
					labelDeclarationPart();
					}
					break;
				case CONST:
					{
					setState(324);
					constantDefinitionPart();
					}
					break;
				case TYPE:
					{
					setState(325);
					typeDefinitionPart();
					}
					break;
				case VAR:
					{
					setState(326);
					variableDeclarationPart();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
				case LBRACK:
					{
					setState(327);
					procedureAndFunctionDeclarationPart();
					}
					break;
				case USES:
					{
					setState(328);
					usesUnitsPart();
					}
					break;
				case IMPLEMENTATION:
					{
					setState(329);
					match(IMPLEMENTATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO) {
				{
				{
				setState(335);
				toBeginEndDoDeclarationPart();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(341);
				compoundStatement();
				}
				break;
			case END:
				{
				setState(342);
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
			setState(345);
			match(USES);
			setState(346);
			identifierList();
			setState(347);
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
			setState(349);
			match(LABEL);
			setState(350);
			label();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(351);
				match(COMMA);
				setState(352);
				label();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
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
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				unsignedInteger();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
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
			setState(364);
			match(CONST);
			setState(368); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(365);
				constantDefinition();
				setState(366);
				match(SEMI);
				}
				}
				setState(370); 
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
			setState(372);
			identifier();
			setState(373);
			match(EQUAL);
			setState(374);
			attributePart();
			setState(375);
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
			setState(377);
			match(CHR);
			setState(378);
			match(LPAREN);
			setState(379);
			unsignedInteger();
			setState(380);
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
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				sign();
				setState(384);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				sign();
				setState(388);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
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
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
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
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
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
			setState(400);
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
			setState(402);
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
			setState(404);
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
			setState(406);
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
			setState(408);
			match(TYPE);
			setState(412); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(409);
				typeDefinition();
				setState(410);
				match(SEMI);
				}
				}
				setState(414); 
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
			setState(416);
			identifier();
			setState(417);
			match(EQUAL);
			setState(418);
			attributePart();
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOLEAN:
			case CHAR:
			case CHR:
			case FILE:
			case INTEGER:
			case PACKED:
			case REAL:
			case RECORD:
			case SET:
			case PLUS:
			case MINUS:
			case LPAREN:
			case POINTER:
			case STRING:
			case IDENTIFIER:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				{
				setState(419);
				type();
				}
				break;
			case FUNCTION:
				{
				setState(420);
				functionType();
				}
				break;
			case PROCEDURE:
				{
				setState(421);
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
			setState(424);
			match(FUNCTION);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(425);
				formalParameterList();
				}
			}

			setState(428);
			match(COLON);
			setState(429);
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
			setState(431);
			match(PROCEDURE);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(432);
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
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case CHR:
			case INTEGER:
			case REAL:
			case PLUS:
			case MINUS:
			case LPAREN:
			case STRING:
			case IDENTIFIER:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				simpleType();
				}
				break;
			case ARRAY:
			case FILE:
			case PACKED:
			case RECORD:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				structuredType();
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				pointerType();
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
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
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				scalarType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(442);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(443);
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

	public static class ScalarTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_scalarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(LPAREN);
			setState(447);
			identifierList();
			setState(448);
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
		public SubrangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrangeType; }
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_subrangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			constant();
			setState(451);
			match(DOTDOT);
			setState(452);
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

	public static class TypeIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(pascalParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(pascalParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(pascalParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(pascalParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(pascalParser.STRING, 0); }
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
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
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
				setState(455);
				_la = _input.LA(1);
				if ( !(_la==BOOLEAN || _la==CHAR || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (INTEGER - 66)) | (1L << (REAL - 66)) | (1L << (STRING - 66)))) != 0)) ) {
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
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKED:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(PACKED);
				setState(459);
				unpackedStructuredType();
				}
				break;
			case ARRAY:
			case FILE:
			case RECORD:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
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
		public UnpackedStructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpackedStructuredType; }
	}

	public final UnpackedStructuredTypeContext unpackedStructuredType() throws RecognitionException {
		UnpackedStructuredTypeContext _localctx = new UnpackedStructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unpackedStructuredType);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				fileType();
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
			setState(469);
			match(STRING);
			setState(470);
			match(LPAREN);
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(471);
				identifier();
				}
				break;
			case NUM_INT:
			case NUM_REAL:
				{
				setState(472);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(475);
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
		enterRule(_localctx, 70, RULE_arrayType);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				match(ARRAY);
				setState(478);
				match(LBRACK);
				setState(479);
				typeList();
				setState(480);
				match(RBRACK);
				setState(481);
				match(OF);
				setState(482);
				componentType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(ARRAY);
				setState(485);
				match(LBRACK2);
				setState(486);
				typeList();
				setState(487);
				match(RBRACK2);
				setState(488);
				match(OF);
				setState(489);
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
		enterRule(_localctx, 72, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			indexType();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(494);
				match(COMMA);
				setState(495);
				indexType();
				}
				}
				setState(500);
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
		enterRule(_localctx, 74, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
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
		enterRule(_localctx, 76, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
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
		enterRule(_localctx, 78, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(RECORD);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==IDENTIFIER) {
				{
				setState(506);
				fieldList();
				}
			}

			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(509);
				match(SEMI);
				}
			}

			setState(512);
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
		enterRule(_localctx, 80, RULE_fieldList);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				fixedPart();
				setState(517);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(515);
					match(SEMI);
					setState(516);
					variantPart();
					}
					break;
				}
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
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
		enterRule(_localctx, 82, RULE_fixedPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			recordSection();
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(523);
					match(SEMI);
					setState(524);
					recordSection();
					}
					} 
				}
				setState(529);
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
		enterRule(_localctx, 84, RULE_recordSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			identifierList();
			setState(531);
			match(COLON);
			setState(532);
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
		enterRule(_localctx, 86, RULE_variantPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(CASE);
			setState(535);
			tag();
			setState(536);
			match(OF);
			setState(537);
			variant();
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(538);
					match(SEMI);
					setState(539);
					variant();
					}
					} 
				}
				setState(544);
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
		enterRule(_localctx, 88, RULE_tag);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				identifier();
				setState(546);
				match(COLON);
				setState(547);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
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
		enterRule(_localctx, 90, RULE_variant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			constList();
			setState(553);
			match(COLON);
			setState(554);
			match(LPAREN);
			setState(555);
			fieldList();
			setState(556);
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
		enterRule(_localctx, 92, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(SET);
			setState(559);
			match(OF);
			setState(560);
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
		enterRule(_localctx, 94, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
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
		enterRule(_localctx, 96, RULE_fileType);
		try {
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				match(FILE);
				setState(565);
				match(OF);
				setState(566);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
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
		enterRule(_localctx, 98, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(POINTER);
			setState(571);
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
		enterRule(_localctx, 100, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(VAR);
			setState(574);
			variableDeclaration();
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(575);
					match(SEMI);
					setState(576);
					variableDeclaration();
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(582);
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
		enterRule(_localctx, 102, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			identifierList();
			setState(585);
			match(COLON);
			setState(586);
			attributePart();
			setState(587);
			type();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUE) {
				{
				setState(588);
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
		public TerminalNode VALUE() { return getToken(pascalParser.VALUE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
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
		enterRule(_localctx, 104, RULE_variablePreDeclaration);
		int _la;
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(VALUE);
				setState(592);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				match(VALUE);
				setState(594);
				factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				match(VALUE);
				setState(596);
				match(ZERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(597);
				match(VALUE);
				setState(598);
				match(LBRACK);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(599);
					initializerList();
					setState(600);
					match(COLON);
					setState(601);
					factor();
					setState(609);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMI) {
						{
						{
						setState(602);
						match(SEMI);
						setState(603);
						initializerList();
						setState(604);
						match(COLON);
						setState(605);
						factor();
						}
						}
						setState(611);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(614);
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
		enterRule(_localctx, 106, RULE_toBeginEndDoDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(TO);
			setState(618);
			_la = _input.LA(1);
			if ( !(_la==BEGIN || _la==END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(619);
			match(DO);
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(620);
				compoundStatement();
				}
				break;
			case 2:
				{
				setState(621);
				statement();
				}
				break;
			}
			setState(624);
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
		public TerminalNode EXTERNAL() { return getToken(pascalParser.EXTERNAL, 0); }
		public ProcedureAndFunctionDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionDeclarationPart; }
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			attributePart();
			setState(627);
			procedureOrFunctionDeclaration();
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
			case CONST:
			case END:
			case FUNCTION:
			case LABEL:
			case PROCEDURE:
			case TO:
			case TYPE:
			case VAR:
			case LBRACK:
			case USES:
			case IMPLEMENTATION:
				{
				setState(628);
				block();
				}
				break;
			case EXTERNAL:
				{
				setState(629);
				match(EXTERNAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(632);
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
		enterRule(_localctx, 110, RULE_procedureOrFunctionDeclaration);
		try {
			setState(636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(635);
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
		enterRule(_localctx, 112, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(PROCEDURE);
			setState(639);
			identifier();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(640);
				formalParameterList();
				}
			}

			setState(643);
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
		enterRule(_localctx, 114, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(LPAREN);
			setState(646);
			formalParameterSection();
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(647);
				match(SEMI);
				setState(648);
				formalParameterSection();
				}
				}
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(654);
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
		public AttributePartContext attributePart() {
			return getRuleContext(AttributePartContext.class,0);
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
		enterRule(_localctx, 116, RULE_formalParameterSection);
		int _la;
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				parameterGroup();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				match(VAR);
				setState(658);
				parameterGroup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(659);
				attributePart();
				setState(660);
				match(FUNCTION);
				setState(661);
				identifier();
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(662);
					formalParameterList();
					}
				}

				setState(665);
				match(COLON);
				setState(666);
				resultType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(668);
				attributePart();
				setState(669);
				match(PROCEDURE);
				setState(670);
				identifier();
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(671);
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
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			identifierList();
			setState(677);
			match(COLON);
			setState(678);
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
		enterRule(_localctx, 120, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			identifier();
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(681);
				match(COMMA);
				setState(682);
				identifier();
				}
				}
				setState(687);
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
		enterRule(_localctx, 122, RULE_initializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			identifier();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(689);
				match(COMMA);
				setState(690);
				identifier();
				}
				}
				setState(695);
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
		enterRule(_localctx, 124, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			constant();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(697);
				match(COMMA);
				setState(698);
				constant();
				}
				}
				setState(703);
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
		enterRule(_localctx, 126, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(FUNCTION);
			setState(705);
			identifier();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(706);
				formalParameterList();
				}
			}

			setState(709);
			match(COLON);
			setState(710);
			resultType();
			setState(711);
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
		enterRule(_localctx, 128, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
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
		enterRule(_localctx, 130, RULE_statement);
		try {
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				label();
				setState(716);
				match(COLON);
				setState(717);
				unlabelledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
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
		enterRule(_localctx, 132, RULE_unlabelledStatement);
		try {
			setState(724);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
			case END:
			case GOTO:
			case UNTIL:
			case SEMI:
			case ATP:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
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
				setState(723);
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
		enterRule(_localctx, 134, RULE_simpleStatement);
		try {
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(728);
				gotoStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(729);
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
		enterRule(_localctx, 136, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			variable();
			setState(733);
			match(ASSIGN);
			setState(734);
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
		enterRule(_localctx, 138, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATP:
				{
				setState(736);
				match(ATP);
				setState(737);
				identifier();
				}
				break;
			case IDENTIFIER:
				{
				setState(738);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (LBRACK - 105)) | (1L << (LBRACK2 - 105)) | (1L << (POINTER - 105)) | (1L << (DOT - 105)))) != 0)) {
				{
				setState(766);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(741);
					match(LBRACK);
					setState(742);
					expression();
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(743);
						match(COMMA);
						setState(744);
						expression();
						}
						}
						setState(749);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(750);
					match(RBRACK);
					}
					break;
				case LBRACK2:
					{
					setState(752);
					match(LBRACK2);
					setState(753);
					expression();
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(754);
						match(COMMA);
						setState(755);
						expression();
						}
						}
						setState(760);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(761);
					match(RBRACK2);
					}
					break;
				case DOT:
					{
					setState(763);
					match(DOT);
					setState(764);
					identifier();
					}
					break;
				case POINTER:
					{
					setState(765);
					match(POINTER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(770);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			simpleExpression();
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IN - 64)) | (1L << (EQUAL - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)))) != 0)) {
				{
				setState(772);
				relationaloperator();
				setState(773);
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
		enterRule(_localctx, 142, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (IN - 64)) | (1L << (EQUAL - 64)) | (1L << (NOT_EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)))) != 0)) ) {
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
		enterRule(_localctx, 144, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			term();
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (OR - 72)) | (1L << (PLUS - 72)) | (1L << (MINUS - 72)))) != 0)) {
				{
				setState(780);
				additiveoperator();
				setState(781);
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
		enterRule(_localctx, 146, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (OR - 72)) | (1L << (PLUS - 72)) | (1L << (MINUS - 72)))) != 0)) ) {
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
		enterRule(_localctx, 148, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			signedFactor();
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (AND - 45)) | (1L << (DIV - 45)) | (1L << (MOD - 45)) | (1L << (STAR - 45)) | (1L << (SLASH - 45)))) != 0)) {
				{
				setState(788);
				multiplicativeoperator();
				setState(789);
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
		enterRule(_localctx, 150, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_la = _input.LA(1);
			if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (AND - 45)) | (1L << (DIV - 45)) | (1L << (MOD - 45)) | (1L << (STAR - 45)) | (1L << (SLASH - 45)))) != 0)) ) {
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
		enterRule(_localctx, 152, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(795);
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

			setState(798);
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
		enterRule(_localctx, 154, RULE_factor);
		try {
			setState(811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(800);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				match(LPAREN);
				setState(802);
				expression();
				setState(803);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(806);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(807);
				set();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(808);
				match(NOT);
				setState(809);
				factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(810);
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
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_unsignedConstant);
		try {
			setState(817);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				unsignedNumber();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(814);
				constantChr();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(815);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(816);
				match(NIL);
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
		enterRule(_localctx, 158, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			identifier();
			setState(820);
			match(LPAREN);
			setState(821);
			parameterList();
			setState(822);
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
		enterRule(_localctx, 160, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			actualParameter();
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(825);
				match(COMMA);
				setState(826);
				actualParameter();
				}
				}
				setState(831);
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
		enterRule(_localctx, 162, RULE_set);
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				match(LBRACK);
				setState(833);
				elementList();
				setState(834);
				match(RBRACK);
				}
				break;
			case LBRACK2:
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				match(LBRACK2);
				setState(837);
				elementList();
				setState(838);
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
		enterRule(_localctx, 164, RULE_elementList);
		int _la;
		try {
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHR:
			case NIL:
			case NOT:
			case PLUS:
			case MINUS:
			case LPAREN:
			case LBRACK:
			case LBRACK2:
			case ATP:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				element();
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(843);
					match(COMMA);
					setState(844);
					element();
					}
					}
					setState(849);
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
		enterRule(_localctx, 166, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			expression();
			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(854);
				match(DOTDOT);
				setState(855);
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
		enterRule(_localctx, 168, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			identifier();
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(859);
				match(LPAREN);
				setState(860);
				parameterList();
				setState(861);
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
		enterRule(_localctx, 170, RULE_actualParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			expression();
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(866);
				parameterwidth();
				}
				}
				setState(871);
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
		enterRule(_localctx, 172, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(COLON);
			setState(873);
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
		enterRule(_localctx, 174, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(GOTO);
			setState(876);
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
		enterRule(_localctx, 176, RULE_emptyStatement);
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
		enterRule(_localctx, 178, RULE_empty);
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
		enterRule(_localctx, 180, RULE_structuredStatement);
		try {
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(884);
				repetetiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(885);
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
		enterRule(_localctx, 182, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(BEGIN);
			setState(889);
			statements();
			setState(890);
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
		enterRule(_localctx, 184, RULE_openCompoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			statements();
			setState(893);
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
		enterRule(_localctx, 186, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			statement();
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(896);
				match(SEMI);
				setState(897);
				statement();
				}
				}
				setState(902);
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
		enterRule(_localctx, 188, RULE_conditionalStatement);
		try {
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
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
		enterRule(_localctx, 190, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(IF);
			setState(908);
			expression();
			setState(909);
			match(THEN);
			setState(910);
			statement();
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(911);
				match(ELSE);
				setState(912);
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
		enterRule(_localctx, 192, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(CASE);
			setState(916);
			expression();
			setState(917);
			match(OF);
			setState(918);
			caseListElement();
			setState(923);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(919);
					match(SEMI);
					setState(920);
					caseListElement();
					}
					} 
				}
				setState(925);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(926);
				match(SEMI);
				setState(927);
				match(ELSE);
				setState(928);
				statements();
				}
			}

			setState(931);
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
		enterRule(_localctx, 194, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			constList();
			setState(934);
			match(COLON);
			setState(935);
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
		enterRule(_localctx, 196, RULE_repetetiveStatement);
		try {
			setState(940);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(939);
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
		enterRule(_localctx, 198, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			match(WHILE);
			setState(943);
			expression();
			setState(944);
			match(DO);
			setState(945);
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
		enterRule(_localctx, 200, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(REPEAT);
			setState(948);
			statements();
			setState(949);
			match(UNTIL);
			setState(950);
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
		enterRule(_localctx, 202, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(FOR);
			setState(953);
			identifier();
			setState(954);
			match(ASSIGN);
			setState(955);
			forList();
			setState(956);
			match(DO);
			setState(957);
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
		enterRule(_localctx, 204, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			initialValue();
			setState(960);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(961);
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
		enterRule(_localctx, 206, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
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
		enterRule(_localctx, 208, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
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
		enterRule(_localctx, 210, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(WITH);
			setState(968);
			recordVariableList();
			setState(969);
			match(DO);
			setState(970);
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
		enterRule(_localctx, 212, RULE_recordVariableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			variable();
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(973);
				match(COMMA);
				setState(974);
				variable();
				}
				}
				setState(979);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0083\u03d7\4\2\t"+
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
		"k\4l\tl\3\2\3\2\5\2\u00db\n\2\3\2\3\2\3\2\3\3\5\3\u00e1\n\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3\u00e9\n\3\3\3\3\3\3\3\5\3\u00ee\n\3\3\3\3\3\3\3\3\3"+
		"\5\3\u00f4\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\u00ff\n\5\f\5\16"+
		"\5\u0102\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u010c\n\6\3\6\3\6\5"+
		"\6\u0110\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u011b\n\6\3\6\3\6"+
		"\5\6\u011f\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u0127\n\b\f\b\16\b\u012a\13"+
		"\b\3\b\3\b\5\b\u012e\n\b\3\t\3\t\3\t\3\t\5\t\u0134\n\t\3\t\3\t\3\t\5\t"+
		"\u0139\n\t\7\t\u013b\n\t\f\t\16\t\u013e\13\t\3\t\3\t\5\t\u0142\n\t\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u014d\n\13\f\13\16\13\u0150"+
		"\13\13\3\13\7\13\u0153\n\13\f\13\16\13\u0156\13\13\3\13\3\13\5\13\u015a"+
		"\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0164\n\r\f\r\16\r\u0167\13"+
		"\r\3\r\3\r\3\16\3\16\5\16\u016d\n\16\3\17\3\17\3\17\3\17\6\17\u0173\n"+
		"\17\r\17\16\17\u0174\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u018b\n\22\3\23"+
		"\3\23\5\23\u018f\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\6\31\u019f\n\31\r\31\16\31\u01a0\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u01a9\n\32\3\33\3\33\5\33\u01ad\n\33\3\33\3\33\3\33"+
		"\3\34\3\34\5\34\u01b4\n\34\3\35\3\35\3\35\5\35\u01b9\n\35\3\36\3\36\3"+
		"\36\3\36\5\36\u01bf\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\5!\u01cb"+
		"\n!\3\"\3\"\3\"\5\"\u01d0\n\"\3#\3#\3#\3#\5#\u01d6\n#\3$\3$\3$\3$\5$\u01dc"+
		"\n$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01ee\n%\3&\3&"+
		"\3&\7&\u01f3\n&\f&\16&\u01f6\13&\3\'\3\'\3(\3(\3)\3)\5)\u01fe\n)\3)\5"+
		")\u0201\n)\3)\3)\3*\3*\3*\5*\u0208\n*\3*\5*\u020b\n*\3+\3+\3+\7+\u0210"+
		"\n+\f+\16+\u0213\13+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\7-\u021f\n-\f-\16-"+
		"\u0222\13-\3.\3.\3.\3.\3.\5.\u0229\n.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u023b\n\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\7\64\u0244\n\64\f\64\16\64\u0247\13\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\5\65\u0250\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0262\n\66\f\66\16"+
		"\66\u0265\13\66\5\66\u0267\n\66\3\66\5\66\u026a\n\66\3\67\3\67\3\67\3"+
		"\67\3\67\5\67\u0271\n\67\3\67\3\67\38\38\38\38\58\u0279\n8\38\38\39\3"+
		"9\59\u027f\n9\3:\3:\3:\5:\u0284\n:\3:\3:\3;\3;\3;\3;\7;\u028c\n;\f;\16"+
		";\u028f\13;\3;\3;\3<\3<\3<\3<\3<\3<\3<\5<\u029a\n<\3<\3<\3<\3<\3<\3<\3"+
		"<\5<\u02a3\n<\5<\u02a5\n<\3=\3=\3=\3=\3>\3>\3>\7>\u02ae\n>\f>\16>\u02b1"+
		"\13>\3?\3?\3?\7?\u02b6\n?\f?\16?\u02b9\13?\3@\3@\3@\7@\u02be\n@\f@\16"+
		"@\u02c1\13@\3A\3A\3A\5A\u02c6\nA\3A\3A\3A\3A\3B\3B\3C\3C\3C\3C\3C\5C\u02d3"+
		"\nC\3D\3D\5D\u02d7\nD\3E\3E\3E\3E\5E\u02dd\nE\3F\3F\3F\3F\3G\3G\3G\5G"+
		"\u02e6\nG\3G\3G\3G\3G\7G\u02ec\nG\fG\16G\u02ef\13G\3G\3G\3G\3G\3G\3G\7"+
		"G\u02f7\nG\fG\16G\u02fa\13G\3G\3G\3G\3G\3G\7G\u0301\nG\fG\16G\u0304\13"+
		"G\3H\3H\3H\3H\5H\u030a\nH\3I\3I\3J\3J\3J\3J\5J\u0312\nJ\3K\3K\3L\3L\3"+
		"L\3L\5L\u031a\nL\3M\3M\3N\5N\u031f\nN\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\5O\u032e\nO\3P\3P\3P\3P\5P\u0334\nP\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\7"+
		"R\u033e\nR\fR\16R\u0341\13R\3S\3S\3S\3S\3S\3S\3S\3S\5S\u034b\nS\3T\3T"+
		"\3T\7T\u0350\nT\fT\16T\u0353\13T\3T\5T\u0356\nT\3U\3U\3U\5U\u035b\nU\3"+
		"V\3V\3V\3V\3V\5V\u0362\nV\3W\3W\7W\u0366\nW\fW\16W\u0369\13W\3X\3X\3X"+
		"\3Y\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3\\\3\\\5\\\u0379\n\\\3]\3]\3]\3]\3^\3^"+
		"\3^\3_\3_\3_\7_\u0385\n_\f_\16_\u0388\13_\3`\3`\5`\u038c\n`\3a\3a\3a\3"+
		"a\3a\3a\5a\u0394\na\3b\3b\3b\3b\3b\3b\7b\u039c\nb\fb\16b\u039f\13b\3b"+
		"\3b\3b\5b\u03a4\nb\3b\3b\3c\3c\3c\3c\3d\3d\3d\5d\u03af\nd\3e\3e\3e\3e"+
		"\3e\3f\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3i\3i\3j\3j\3k\3k"+
		"\3k\3k\3k\3l\3l\3l\7l\u03d2\nl\fl\16l\u03d5\13l\3l\2\2m\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\2\13\4\2"+
		"\3-VV\3\2[\\\3\2{|\7\2\62\62\64\64DDNNyy\4\2\61\61;;\4\2BBch\4\2JJ[\\"+
		"\6\2//\67\67FF]^\4\299SS\2\u03e7\2\u00d8\3\2\2\2\4\u00f3\3\2\2\2\6\u00f5"+
		"\3\2\2\2\b\u00f9\3\2\2\2\n\u011e\3\2\2\2\f\u0120\3\2\2\2\16\u012d\3\2"+
		"\2\2\20\u012f\3\2\2\2\22\u0143\3\2\2\2\24\u014e\3\2\2\2\26\u015b\3\2\2"+
		"\2\30\u015f\3\2\2\2\32\u016c\3\2\2\2\34\u016e\3\2\2\2\36\u0176\3\2\2\2"+
		" \u017b\3\2\2\2\"\u018a\3\2\2\2$\u018e\3\2\2\2&\u0190\3\2\2\2(\u0192\3"+
		"\2\2\2*\u0194\3\2\2\2,\u0196\3\2\2\2.\u0198\3\2\2\2\60\u019a\3\2\2\2\62"+
		"\u01a2\3\2\2\2\64\u01aa\3\2\2\2\66\u01b1\3\2\2\28\u01b8\3\2\2\2:\u01be"+
		"\3\2\2\2<\u01c0\3\2\2\2>\u01c4\3\2\2\2@\u01ca\3\2\2\2B\u01cf\3\2\2\2D"+
		"\u01d5\3\2\2\2F\u01d7\3\2\2\2H\u01ed\3\2\2\2J\u01ef\3\2\2\2L\u01f7\3\2"+
		"\2\2N\u01f9\3\2\2\2P\u01fb\3\2\2\2R\u020a\3\2\2\2T\u020c\3\2\2\2V\u0214"+
		"\3\2\2\2X\u0218\3\2\2\2Z\u0228\3\2\2\2\\\u022a\3\2\2\2^\u0230\3\2\2\2"+
		"`\u0234\3\2\2\2b\u023a\3\2\2\2d\u023c\3\2\2\2f\u023f\3\2\2\2h\u024a\3"+
		"\2\2\2j\u0269\3\2\2\2l\u026b\3\2\2\2n\u0274\3\2\2\2p\u027e\3\2\2\2r\u0280"+
		"\3\2\2\2t\u0287\3\2\2\2v\u02a4\3\2\2\2x\u02a6\3\2\2\2z\u02aa\3\2\2\2|"+
		"\u02b2\3\2\2\2~\u02ba\3\2\2\2\u0080\u02c2\3\2\2\2\u0082\u02cb\3\2\2\2"+
		"\u0084\u02d2\3\2\2\2\u0086\u02d6\3\2\2\2\u0088\u02dc\3\2\2\2\u008a\u02de"+
		"\3\2\2\2\u008c\u02e5\3\2\2\2\u008e\u0305\3\2\2\2\u0090\u030b\3\2\2\2\u0092"+
		"\u030d\3\2\2\2\u0094\u0313\3\2\2\2\u0096\u0315\3\2\2\2\u0098\u031b\3\2"+
		"\2\2\u009a\u031e\3\2\2\2\u009c\u032d\3\2\2\2\u009e\u0333\3\2\2\2\u00a0"+
		"\u0335\3\2\2\2\u00a2\u033a\3\2\2\2\u00a4\u034a\3\2\2\2\u00a6\u0355\3\2"+
		"\2\2\u00a8\u0357\3\2\2\2\u00aa\u035c\3\2\2\2\u00ac\u0363\3\2\2\2\u00ae"+
		"\u036a\3\2\2\2\u00b0\u036d\3\2\2\2\u00b2\u0370\3\2\2\2\u00b4\u0372\3\2"+
		"\2\2\u00b6\u0378\3\2\2\2\u00b8\u037a\3\2\2\2\u00ba\u037e\3\2\2\2\u00bc"+
		"\u0381\3\2\2\2\u00be\u038b\3\2\2\2\u00c0\u038d\3\2\2\2\u00c2\u0395\3\2"+
		"\2\2\u00c4\u03a7\3\2\2\2\u00c6\u03ae\3\2\2\2\u00c8\u03b0\3\2\2\2\u00ca"+
		"\u03b5\3\2\2\2\u00cc\u03ba\3\2\2\2\u00ce\u03c1\3\2\2\2\u00d0\u03c5\3\2"+
		"\2\2\u00d2\u03c7\3\2\2\2\u00d4\u03c9\3\2\2\2\u00d6\u03ce\3\2\2\2\u00d8"+
		"\u00da\5\4\3\2\u00d9\u00db\7w\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\5\24\13\2\u00dd\u00de\7r\2\2\u00de"+
		"\3\3\2\2\2\u00df\u00e1\5\6\4\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2"+
		"\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7M\2\2\u00e3\u00e8\5\f\7\2\u00e4\u00e5"+
		"\7i\2\2\u00e5\u00e6\5z>\2\u00e6\u00e7\7j\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e4\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7a"+
		"\2\2\u00eb\u00f4\3\2\2\2\u00ec\u00ee\5\n\6\2\u00ed\u00ec\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7m\2\2\u00f0\u00f1\5\f"+
		"\7\2\u00f1\u00f2\7a\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00e0\3\2\2\2\u00f3"+
		"\u00ed\3\2\2\2\u00f4\5\3\2\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\5\b\5\2"+
		"\u00f7\u00f8\7n\2\2\u00f8\7\3\2\2\2\u00f9\u00fa\7C\2\2\u00fa\u00fb\7i"+
		"\2\2\u00fb\u0100\5.\30\2\u00fc\u00fd\7`\2\2\u00fd\u00ff\5.\30\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7j\2\2\u0104"+
		"\t\3\2\2\2\u0105\u0106\7k\2\2\u0106\u010b\7<\2\2\u0107\u0108\7i\2\2\u0108"+
		"\u0109\5.\30\2\u0109\u010a\7j\2\2\u010a\u010c\3\2\2\2\u010b\u0107\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010e\7`\2\2\u010e"+
		"\u0110\5\b\5\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u011f\7n\2\2\u0112\u0113\7k\2\2\u0113\u0114\5\b\5\2\u0114\u0115"+
		"\7`\2\2\u0115\u011a\7<\2\2\u0116\u0117\7i\2\2\u0117\u0118\5.\30\2\u0118"+
		"\u0119\7j\2\2\u0119\u011b\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7n\2\2\u011d\u011f\3\2\2\2\u011e"+
		"\u0105\3\2\2\2\u011e\u0112\3\2\2\2\u011f\13\3\2\2\2\u0120\u0121\7\u0080"+
		"\2\2\u0121\r\3\2\2\2\u0122\u0123\7k\2\2\u0123\u0128\5\20\t\2\u0124\u0125"+
		"\7`\2\2\u0125\u0127\5\20\t\2\u0126\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012c\7n\2\2\u012c\u012e\3\2\2\2\u012d\u0122\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\17\3\2\2\2\u012f\u0141\5\22\n\2\u0130\u0133\7i\2"+
		"\2\u0131\u0134\5.\30\2\u0132\u0134\5\f\7\2\u0133\u0131\3\2\2\2\u0133\u0132"+
		"\3\2\2\2\u0134\u013c\3\2\2\2\u0135\u0138\7`\2\2\u0136\u0139\5.\30\2\u0137"+
		"\u0139\5\f\7\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u0135\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7j"+
		"\2\2\u0140\u0142\3\2\2\2\u0141\u0130\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\21\3\2\2\2\u0143\u0144\t\2\2\2\u0144\23\3\2\2\2\u0145\u014d\5\30\r\2"+
		"\u0146\u014d\5\34\17\2\u0147\u014d\5\60\31\2\u0148\u014d\5f\64\2\u0149"+
		"\u014d\5n8\2\u014a\u014d\5\26\f\2\u014b\u014d\7z\2\2\u014c\u0145\3\2\2"+
		"\2\u014c\u0146\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u0149"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0154\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0151\u0153\5l\67\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0159\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157\u015a\5\u00b8]\2\u0158\u015a\7;\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a\25\3\2\2\2\u015b\u015c\7x\2\2\u015c\u015d\5z>\2\u015d"+
		"\u015e\7a\2\2\u015e\27\3\2\2\2\u015f\u0160\7E\2\2\u0160\u0165\5\32\16"+
		"\2\u0161\u0162\7`\2\2\u0162\u0164\5\32\16\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7a\2\2\u0169\31\3\2\2\2\u016a\u016d"+
		"\5&\24\2\u016b\u016d\5\f\7\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d"+
		"\33\3\2\2\2\u016e\u0172\7\66\2\2\u016f\u0170\5\36\20\2\u0170\u0171\7a"+
		"\2\2\u0171\u0173\3\2\2\2\u0172\u016f\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\35\3\2\2\2\u0176\u0177\5\f\7"+
		"\2\u0177\u0178\7c\2\2\u0178\u0179\5\16\b\2\u0179\u017a\5\"\22\2\u017a"+
		"\37\3\2\2\2\u017b\u017c\7\65\2\2\u017c\u017d\7i\2\2\u017d\u017e\5&\24"+
		"\2\u017e\u017f\7j\2\2\u017f!\3\2\2\2\u0180\u018b\5$\23\2\u0181\u0182\5"+
		"*\26\2\u0182\u0183\5$\23\2\u0183\u018b\3\2\2\2\u0184\u018b\5\f\7\2\u0185"+
		"\u0186\5*\26\2\u0186\u0187\5\f\7\2\u0187\u018b\3\2\2\2\u0188\u018b\5."+
		"\30\2\u0189\u018b\5 \21\2\u018a\u0180\3\2\2\2\u018a\u0181\3\2\2\2\u018a"+
		"\u0184\3\2\2\2\u018a\u0185\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2"+
		"\2\2\u018b#\3\2\2\2\u018c\u018f\5&\24\2\u018d\u018f\5(\25\2\u018e\u018c"+
		"\3\2\2\2\u018e\u018d\3\2\2\2\u018f%\3\2\2\2\u0190\u0191\7\u0082\2\2\u0191"+
		"\'\3\2\2\2\u0192\u0193\7\u0083\2\2\u0193)\3\2\2\2\u0194\u0195\t\3\2\2"+
		"\u0195+\3\2\2\2\u0196\u0197\t\4\2\2\u0197-\3\2\2\2\u0198\u0199\7\u0081"+
		"\2\2\u0199/\3\2\2\2\u019a\u019e\7T\2\2\u019b\u019c\5\62\32\2\u019c\u019d"+
		"\7a\2\2\u019d\u019f\3\2\2\2\u019e\u019b\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\61\3\2\2\2\u01a2\u01a3\5\f\7"+
		"\2\u01a3\u01a4\7c\2\2\u01a4\u01a8\5\16\b\2\u01a5\u01a9\58\35\2\u01a6\u01a9"+
		"\5\64\33\2\u01a7\u01a9\5\66\34\2\u01a8\u01a5\3\2\2\2\u01a8\u01a6\3\2\2"+
		"\2\u01a8\u01a7\3\2\2\2\u01a9\63\3\2\2\2\u01aa\u01ac\7?\2\2\u01ab\u01ad"+
		"\5t;\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01af\7b\2\2\u01af\u01b0\5\u0082B\2\u01b0\65\3\2\2\2\u01b1\u01b3\7L\2"+
		"\2\u01b2\u01b4\5t;\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\67"+
		"\3\2\2\2\u01b5\u01b9\5:\36\2\u01b6\u01b9\5B\"\2\u01b7\u01b9\5d\63\2\u01b8"+
		"\u01b5\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b99\3\2\2\2"+
		"\u01ba\u01bf\5<\37\2\u01bb\u01bf\5> \2\u01bc\u01bf\5@!\2\u01bd\u01bf\5"+
		"F$\2\u01be\u01ba\3\2\2\2\u01be\u01bb\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bd\3\2\2\2\u01bf;\3\2\2\2\u01c0\u01c1\7i\2\2\u01c1\u01c2\5z>\2\u01c2"+
		"\u01c3\7j\2\2\u01c3=\3\2\2\2\u01c4\u01c5\5\"\22\2\u01c5\u01c6\7s\2\2\u01c6"+
		"\u01c7\5\"\22\2\u01c7?\3\2\2\2\u01c8\u01cb\5\f\7\2\u01c9\u01cb\t\5\2\2"+
		"\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cbA\3\2\2\2\u01cc\u01cd\7"+
		"K\2\2\u01cd\u01d0\5D#\2\u01ce\u01d0\5D#\2\u01cf\u01cc\3\2\2\2\u01cf\u01ce"+
		"\3\2\2\2\u01d0C\3\2\2\2\u01d1\u01d6\5H%\2\u01d2\u01d6\5P)\2\u01d3\u01d6"+
		"\5^\60\2\u01d4\u01d6\5b\62\2\u01d5\u01d1\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6E\3\2\2\2\u01d7\u01d8\7y\2\2\u01d8"+
		"\u01db\7i\2\2\u01d9\u01dc\5\f\7\2\u01da\u01dc\5$\23\2\u01db\u01d9\3\2"+
		"\2\2\u01db\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\7j\2\2\u01de"+
		"G\3\2\2\2\u01df\u01e0\7\60\2\2\u01e0\u01e1\7k\2\2\u01e1\u01e2\5J&\2\u01e2"+
		"\u01e3\7n\2\2\u01e3\u01e4\7I\2\2\u01e4\u01e5\5N(\2\u01e5\u01ee\3\2\2\2"+
		"\u01e6\u01e7\7\60\2\2\u01e7\u01e8\7l\2\2\u01e8\u01e9\5J&\2\u01e9\u01ea"+
		"\7o\2\2\u01ea\u01eb\7I\2\2\u01eb\u01ec\5N(\2\u01ec\u01ee\3\2\2\2\u01ed"+
		"\u01df\3\2\2\2\u01ed\u01e6\3\2\2\2\u01eeI\3\2\2\2\u01ef\u01f4\5L\'\2\u01f0"+
		"\u01f1\7`\2\2\u01f1\u01f3\5L\'\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\3\2\2"+
		"\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5K\3\2\2\2\u01f6\u01f4"+
		"\3\2\2\2\u01f7\u01f8\5:\36\2\u01f8M\3\2\2\2\u01f9\u01fa\58\35\2\u01fa"+
		"O\3\2\2\2\u01fb\u01fd\7O\2\2\u01fc\u01fe\5R*\2\u01fd\u01fc\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u0201\7a\2\2\u0200\u01ff\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\7;\2\2\u0203"+
		"Q\3\2\2\2\u0204\u0207\5T+\2\u0205\u0206\7a\2\2\u0206\u0208\5X-\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u020b\5X"+
		"-\2\u020a\u0204\3\2\2\2\u020a\u0209\3\2\2\2\u020bS\3\2\2\2\u020c\u0211"+
		"\5V,\2\u020d\u020e\7a\2\2\u020e\u0210\5V,\2\u020f\u020d\3\2\2\2\u0210"+
		"\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212U\3\2\2\2"+
		"\u0213\u0211\3\2\2\2\u0214\u0215\5z>\2\u0215\u0216\7b\2\2\u0216\u0217"+
		"\58\35\2\u0217W\3\2\2\2\u0218\u0219\7\63\2\2\u0219\u021a\5Z.\2\u021a\u021b"+
		"\7I\2\2\u021b\u0220\5\\/\2\u021c\u021d\7a\2\2\u021d\u021f\5\\/\2\u021e"+
		"\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221Y\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\5\f\7\2\u0224\u0225"+
		"\7b\2\2\u0225\u0226\5@!\2\u0226\u0229\3\2\2\2\u0227\u0229\5@!\2\u0228"+
		"\u0223\3\2\2\2\u0228\u0227\3\2\2\2\u0229[\3\2\2\2\u022a\u022b\5~@\2\u022b"+
		"\u022c\7b\2\2\u022c\u022d\7i\2\2\u022d\u022e\5R*\2\u022e\u022f\7j\2\2"+
		"\u022f]\3\2\2\2\u0230\u0231\7Q\2\2\u0231\u0232\7I\2\2\u0232\u0233\5`\61"+
		"\2\u0233_\3\2\2\2\u0234\u0235\5:\36\2\u0235a\3\2\2\2\u0236\u0237\7=\2"+
		"\2\u0237\u0238\7I\2\2\u0238\u023b\58\35\2\u0239\u023b\7=\2\2\u023a\u0236"+
		"\3\2\2\2\u023a\u0239\3\2\2\2\u023bc\3\2\2\2\u023c\u023d\7p\2\2\u023d\u023e"+
		"\5@!\2\u023ee\3\2\2\2\u023f\u0240\7W\2\2\u0240\u0245\5h\65\2\u0241\u0242"+
		"\7a\2\2\u0242\u0244\5h\65\2\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2"+
		"\2\2\u0248\u0249\7a\2\2\u0249g\3\2\2\2\u024a\u024b\5z>\2\u024b\u024c\7"+
		"b\2\2\u024c\u024d\5\16\b\2\u024d\u024f\58\35\2\u024e\u0250\5j\66\2\u024f"+
		"\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250i\3\2\2\2\u0251\u0252\7V\2\2\u0252"+
		"\u026a\5\f\7\2\u0253\u0254\7V\2\2\u0254\u026a\5\u009cO\2\u0255\u0256\7"+
		"V\2\2\u0256\u026a\7Z\2\2\u0257\u0258\7V\2\2\u0258\u0266\7k\2\2\u0259\u025a"+
		"\5|?\2\u025a\u025b\7b\2\2\u025b\u0263\5\u009cO\2\u025c\u025d\7a\2\2\u025d"+
		"\u025e\5|?\2\u025e\u025f\7b\2\2\u025f\u0260\5\u009cO\2\u0260\u0262\3\2"+
		"\2\2\u0261\u025c\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0259\3\2"+
		"\2\2\u0266\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\7n\2\2\u0269"+
		"\u0251\3\2\2\2\u0269\u0253\3\2\2\2\u0269\u0255\3\2\2\2\u0269\u0257\3\2"+
		"\2\2\u026ak\3\2\2\2\u026b\u026c\7S\2\2\u026c\u026d\t\6\2\2\u026d\u0270"+
		"\78\2\2\u026e\u0271\5\u00b8]\2\u026f\u0271\5\u0084C\2\u0270\u026e\3\2"+
		"\2\2\u0270\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\7a\2\2\u0273"+
		"m\3\2\2\2\u0274\u0275\5\16\b\2\u0275\u0278\5p9\2\u0276\u0279\5\24\13\2"+
		"\u0277\u0279\7)\2\2\u0278\u0276\3\2\2\2\u0278\u0277\3\2\2\2\u0279\u027a"+
		"\3\2\2\2\u027a\u027b\7a\2\2\u027bo\3\2\2\2\u027c\u027f\5r:\2\u027d\u027f"+
		"\5\u0080A\2\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2\u027fq\3\2\2\2\u0280"+
		"\u0281\7L\2\2\u0281\u0283\5\f\7\2\u0282\u0284\5t;\2\u0283\u0282\3\2\2"+
		"\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\7a\2\2\u0286s\3"+
		"\2\2\2\u0287\u0288\7i\2\2\u0288\u028d\5v<\2\u0289\u028a\7a\2\2\u028a\u028c"+
		"\5v<\2\u028b\u0289\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u0290\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291\7j"+
		"\2\2\u0291u\3\2\2\2\u0292\u02a5\5x=\2\u0293\u0294\7W\2\2\u0294\u02a5\5"+
		"x=\2\u0295\u0296\5\16\b\2\u0296\u0297\7?\2\2\u0297\u0299\5\f\7\2\u0298"+
		"\u029a\5t;\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2"+
		"\2\u029b\u029c\7b\2\2\u029c\u029d\5\u0082B\2\u029d\u02a5\3\2\2\2\u029e"+
		"\u029f\5\16\b\2\u029f\u02a0\7L\2\2\u02a0\u02a2\5\f\7\2\u02a1\u02a3\5t"+
		";\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4"+
		"\u0292\3\2\2\2\u02a4\u0293\3\2\2\2\u02a4\u0295\3\2\2\2\u02a4\u029e\3\2"+
		"\2\2\u02a5w\3\2\2\2\u02a6\u02a7\5z>\2\u02a7\u02a8\7b\2\2\u02a8\u02a9\5"+
		"@!\2\u02a9y\3\2\2\2\u02aa\u02af\5\f\7\2\u02ab\u02ac\7`\2\2\u02ac\u02ae"+
		"\5\f\7\2\u02ad\u02ab\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0{\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b7\5\f\7\2"+
		"\u02b3\u02b4\7`\2\2\u02b4\u02b6\5\f\7\2\u02b5\u02b3\3\2\2\2\u02b6\u02b9"+
		"\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8}\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02ba\u02bf\5\"\22\2\u02bb\u02bc\7`\2\2\u02bc\u02be\5\""+
		"\22\2\u02bd\u02bb\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\177\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02c3\7?\2"+
		"\2\u02c3\u02c5\5\f\7\2\u02c4\u02c6\5t;\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6"+
		"\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\7b\2\2\u02c8\u02c9\5\u0082B\2"+
		"\u02c9\u02ca\7a\2\2\u02ca\u0081\3\2\2\2\u02cb\u02cc\5@!\2\u02cc\u0083"+
		"\3\2\2\2\u02cd\u02ce\5\32\16\2\u02ce\u02cf\7b\2\2\u02cf\u02d0\5\u0086"+
		"D\2\u02d0\u02d3\3\2\2\2\u02d1\u02d3\5\u0086D\2\u02d2\u02cd\3\2\2\2\u02d2"+
		"\u02d1\3\2\2\2\u02d3\u0085\3\2\2\2\u02d4\u02d7\5\u0088E\2\u02d5\u02d7"+
		"\5\u00b6\\\2\u02d6\u02d4\3\2\2\2\u02d6\u02d5\3\2\2\2\u02d7\u0087\3\2\2"+
		"\2\u02d8\u02dd\5\u008aF\2\u02d9\u02dd\5\u00aaV\2\u02da\u02dd\5\u00b0Y"+
		"\2\u02db\u02dd\5\u00b2Z\2\u02dc\u02d8\3\2\2\2\u02dc\u02d9\3\2\2\2\u02dc"+
		"\u02da\3\2\2\2\u02dc\u02db\3\2\2\2\u02dd\u0089\3\2\2\2\u02de\u02df\5\u008c"+
		"G\2\u02df\u02e0\7_\2\2\u02e0\u02e1\5\u008eH\2\u02e1\u008b\3\2\2\2\u02e2"+
		"\u02e3\7q\2\2\u02e3\u02e6\5\f\7\2\u02e4\u02e6\5\f\7\2\u02e5\u02e2\3\2"+
		"\2\2\u02e5\u02e4\3\2\2\2\u02e6\u0302\3\2\2\2\u02e7\u02e8\7k\2\2\u02e8"+
		"\u02ed\5\u008eH\2\u02e9\u02ea\7`\2\2\u02ea\u02ec\5\u008eH\2\u02eb\u02e9"+
		"\3\2\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02f0\3\2\2\2\u02ef\u02ed\3\2\2\2\u02f0\u02f1\7n\2\2\u02f1\u0301\3\2"+
		"\2\2\u02f2\u02f3\7l\2\2\u02f3\u02f8\5\u008eH\2\u02f4\u02f5\7`\2\2\u02f5"+
		"\u02f7\5\u008eH\2\u02f6\u02f4\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8\u02f6"+
		"\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fb"+
		"\u02fc\7o\2\2\u02fc\u0301\3\2\2\2\u02fd\u02fe\7r\2\2\u02fe\u0301\5\f\7"+
		"\2\u02ff\u0301\7p\2\2\u0300\u02e7\3\2\2\2\u0300\u02f2\3\2\2\2\u0300\u02fd"+
		"\3\2\2\2\u0300\u02ff\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u008d\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0309\5\u0092"+
		"J\2\u0306\u0307\5\u0090I\2\u0307\u0308\5\u008eH\2\u0308\u030a\3\2\2\2"+
		"\u0309\u0306\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u008f\3\2\2\2\u030b\u030c"+
		"\t\7\2\2\u030c\u0091\3\2\2\2\u030d\u0311\5\u0096L\2\u030e\u030f\5\u0094"+
		"K\2\u030f\u0310\5\u0092J\2\u0310\u0312\3\2\2\2\u0311\u030e\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0093\3\2\2\2\u0313\u0314\t\b\2\2\u0314\u0095\3\2"+
		"\2\2\u0315\u0319\5\u009aN\2\u0316\u0317\5\u0098M\2\u0317\u0318\5\u0096"+
		"L\2\u0318\u031a\3\2\2\2\u0319\u0316\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u0097\3\2\2\2\u031b\u031c\t\t\2\2\u031c\u0099\3\2\2\2\u031d\u031f\t\3"+
		"\2\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"\u0321\5\u009cO\2\u0321\u009b\3\2\2\2\u0322\u032e\5\u008cG\2\u0323\u0324"+
		"\7i\2\2\u0324\u0325\5\u008eH\2\u0325\u0326\7j\2\2\u0326\u032e\3\2\2\2"+
		"\u0327\u032e\5\u00a0Q\2\u0328\u032e\5\u009eP\2\u0329\u032e\5\u00a4S\2"+
		"\u032a\u032b\7H\2\2\u032b\u032e\5\u009cO\2\u032c\u032e\5,\27\2\u032d\u0322"+
		"\3\2\2\2\u032d\u0323\3\2\2\2\u032d\u0327\3\2\2\2\u032d\u0328\3\2\2\2\u032d"+
		"\u0329\3\2\2\2\u032d\u032a\3\2\2\2\u032d\u032c\3\2\2\2\u032e\u009d\3\2"+
		"\2\2\u032f\u0334\5$\23\2\u0330\u0334\5 \21\2\u0331\u0334\5.\30\2\u0332"+
		"\u0334\7G\2\2\u0333\u032f\3\2\2\2\u0333\u0330\3\2\2\2\u0333\u0331\3\2"+
		"\2\2\u0333\u0332\3\2\2\2\u0334\u009f\3\2\2\2\u0335\u0336\5\f\7\2\u0336"+
		"\u0337\7i\2\2\u0337\u0338\5\u00a2R\2\u0338\u0339\7j\2\2\u0339\u00a1\3"+
		"\2\2\2\u033a\u033f\5\u00acW\2\u033b\u033c\7`\2\2\u033c\u033e\5\u00acW"+
		"\2\u033d\u033b\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340"+
		"\3\2\2\2\u0340\u00a3\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0343\7k\2\2\u0343"+
		"\u0344\5\u00a6T\2\u0344\u0345\7n\2\2\u0345\u034b\3\2\2\2\u0346\u0347\7"+
		"l\2\2\u0347\u0348\5\u00a6T\2\u0348\u0349\7o\2\2\u0349\u034b\3\2\2\2\u034a"+
		"\u0342\3\2\2\2\u034a\u0346\3\2\2\2\u034b\u00a5\3\2\2\2\u034c\u0351\5\u00a8"+
		"U\2\u034d\u034e\7`\2\2\u034e\u0350\5\u00a8U\2\u034f\u034d\3\2\2\2\u0350"+
		"\u0353\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0356\3\2"+
		"\2\2\u0353\u0351\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u034c\3\2\2\2\u0355"+
		"\u0354\3\2\2\2\u0356\u00a7\3\2\2\2\u0357\u035a\5\u008eH\2\u0358\u0359"+
		"\7s\2\2\u0359\u035b\5\u008eH\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2"+
		"\u035b\u00a9\3\2\2\2\u035c\u0361\5\f\7\2\u035d\u035e\7i\2\2\u035e\u035f"+
		"\5\u00a2R\2\u035f\u0360\7j\2\2\u0360\u0362\3\2\2\2\u0361\u035d\3\2\2\2"+
		"\u0361\u0362\3\2\2\2\u0362\u00ab\3\2\2\2\u0363\u0367\5\u008eH\2\u0364"+
		"\u0366\5\u00aeX\2\u0365\u0364\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365"+
		"\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u00ad\3\2\2\2\u0369\u0367\3\2\2\2\u036a"+
		"\u036b\7b\2\2\u036b\u036c\5\u008eH\2\u036c\u00af\3\2\2\2\u036d\u036e\7"+
		"@\2\2\u036e\u036f\5\32\16\2\u036f\u00b1\3\2\2\2\u0370\u0371\3\2\2\2\u0371"+
		"\u00b3\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u00b5\3\2\2\2\u0374\u0379\5\u00b8"+
		"]\2\u0375\u0379\5\u00be`\2\u0376\u0379\5\u00c6d\2\u0377\u0379\5\u00d4"+
		"k\2\u0378\u0374\3\2\2\2\u0378\u0375\3\2\2\2\u0378\u0376\3\2\2\2\u0378"+
		"\u0377\3\2\2\2\u0379\u00b7\3\2\2\2\u037a\u037b\7\61\2\2\u037b\u037c\5"+
		"\u00bc_\2\u037c\u037d\7;\2\2\u037d\u00b9\3\2\2\2\u037e\u037f\5\u00bc_"+
		"\2\u037f\u0380\7;\2\2\u0380\u00bb\3\2\2\2\u0381\u0386\5\u0084C\2\u0382"+
		"\u0383\7a\2\2\u0383\u0385\5\u0084C\2\u0384\u0382\3\2\2\2\u0385\u0388\3"+
		"\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u00bd\3\2\2\2\u0388"+
		"\u0386\3\2\2\2\u0389\u038c\5\u00c0a\2\u038a\u038c\5\u00c2b\2\u038b\u0389"+
		"\3\2\2\2\u038b\u038a\3\2\2\2\u038c\u00bf\3\2\2\2\u038d\u038e\7A\2\2\u038e"+
		"\u038f\5\u008eH\2\u038f\u0390\7R\2\2\u0390\u0393\5\u0084C\2\u0391\u0392"+
		"\7:\2\2\u0392\u0394\5\u0084C\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2"+
		"\u0394\u00c1\3\2\2\2\u0395\u0396\7\63\2\2\u0396\u0397\5\u008eH\2\u0397"+
		"\u0398\7I\2\2\u0398\u039d\5\u00c4c\2\u0399\u039a\7a\2\2\u039a\u039c\5"+
		"\u00c4c\2\u039b\u0399\3\2\2\2\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2\2"+
		"\u039d\u039e\3\2\2\2\u039e\u03a3\3\2\2\2\u039f\u039d\3\2\2\2\u03a0\u03a1"+
		"\7a\2\2\u03a1\u03a2\7:\2\2\u03a2\u03a4\5\u00bc_\2\u03a3\u03a0\3\2\2\2"+
		"\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\7;\2\2\u03a6\u00c3"+
		"\3\2\2\2\u03a7\u03a8\5~@\2\u03a8\u03a9\7b\2\2\u03a9\u03aa\5\u0084C\2\u03aa"+
		"\u00c5\3\2\2\2\u03ab\u03af\5\u00c8e\2\u03ac\u03af\5\u00caf\2\u03ad\u03af"+
		"\5\u00ccg\2\u03ae\u03ab\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03ad\3\2\2"+
		"\2\u03af\u00c7\3\2\2\2\u03b0\u03b1\7X\2\2\u03b1\u03b2\5\u008eH\2\u03b2"+
		"\u03b3\78\2\2\u03b3\u03b4\5\u0084C\2\u03b4\u00c9\3\2\2\2\u03b5\u03b6\7"+
		"P\2\2\u03b6\u03b7\5\u00bc_\2\u03b7\u03b8\7U\2\2\u03b8\u03b9\5\u008eH\2"+
		"\u03b9\u00cb\3\2\2\2\u03ba\u03bb\7>\2\2\u03bb\u03bc\5\f\7\2\u03bc\u03bd"+
		"\7_\2\2\u03bd\u03be\5\u00ceh\2\u03be\u03bf\78\2\2\u03bf\u03c0\5\u0084"+
		"C\2\u03c0\u00cd\3\2\2\2\u03c1\u03c2\5\u00d0i\2\u03c2\u03c3\t\n\2\2\u03c3"+
		"\u03c4\5\u00d2j\2\u03c4\u00cf\3\2\2\2\u03c5\u03c6\5\u008eH\2\u03c6\u00d1"+
		"\3\2\2\2\u03c7\u03c8\5\u008eH\2\u03c8\u00d3\3\2\2\2\u03c9\u03ca\7Y\2\2"+
		"\u03ca\u03cb\5\u00d6l\2\u03cb\u03cc\78\2\2\u03cc\u03cd\5\u0084C\2\u03cd"+
		"\u00d5\3\2\2\2\u03ce\u03d3\5\u008cG\2\u03cf\u03d0\7`\2\2\u03d0\u03d2\5"+
		"\u008cG\2\u03d1\u03cf\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1\3\2\2\2"+
		"\u03d3\u03d4\3\2\2\2\u03d4\u00d7\3\2\2\2\u03d5\u03d3\3\2\2\2]\u00da\u00e0"+
		"\u00e8\u00ed\u00f3\u0100\u010b\u010f\u011a\u011e\u0128\u012d\u0133\u0138"+
		"\u013c\u0141\u014c\u014e\u0154\u0159\u0165\u016c\u0174\u018a\u018e\u01a0"+
		"\u01a8\u01ac\u01b3\u01b8\u01be\u01ca\u01cf\u01d5\u01db\u01ed\u01f4\u01fd"+
		"\u0200\u0207\u020a\u0211\u0220\u0228\u023a\u0245\u024f\u0263\u0266\u0269"+
		"\u0270\u0278\u027e\u0283\u028d\u0299\u02a2\u02a4\u02af\u02b7\u02bf\u02c5"+
		"\u02d2\u02d6\u02dc\u02e5\u02ed\u02f8\u0300\u0302\u0309\u0311\u0319\u031e"+
		"\u032d\u0333\u033f\u034a\u0351\u0355\u035a\u0361\u0367\u0378\u0386\u038b"+
		"\u0393\u039d\u03a3\u03ae\u03d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}