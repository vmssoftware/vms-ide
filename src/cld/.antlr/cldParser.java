// Generated from d:\vmssoftware.work\vms_ide\vms-ide\src\cld\cld.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cldParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEFINE=1, IDENT=2, MODULE=3, SYNTAX=4, TYPE=5, VERB=6, NODISALLOWS=7, 
		DISALLOW=8, IMAGE=9, NOPARAMETERS=10, PARAMETER=11, DEFAULT=12, LABEL=13, 
		PROMPT=14, VALUE=15, NOCONCATENATE=16, CONCATENATE=17, LIST=18, REQUIRED=19, 
		NOQUALIFIERS=20, QUALIFIER=21, BATCH=22, NONNEGATABLE=23, NEGATABLE=24, 
		PLACEMENT=25, GLOBAL=26, LOCAL=27, POSITIONAL=28, ROUTINE=29, KEYWORD=30, 
		SYNONYM=31, ANY2=32, NEG=33, NOT=34, AND=35, OR=36, NAME=37, COMMA=38, 
		EQUAL=39, P_OPEN=40, P_CLOSE=41, A_OPEN=42, A_CLOSE=43, DOT=44, STRING=45, 
		WHITESPACE=46, NEWLINE=47, COMMENT=48;
	public static final int
		RULE_cldContent = 0, RULE_define = 1, RULE_anyName = 2, RULE_ident = 3, 
		RULE_module = 4, RULE_verbClauseForSyntax = 5, RULE_disallow = 6, RULE_image = 7, 
		RULE_parameter = 8, RULE_parameterClause = 9, RULE_parameterValue = 10, 
		RULE_parameterLabel = 11, RULE_parameterPrompt = 12, RULE_parameterValueClause = 13, 
		RULE_parameterValueClauseType = 14, RULE_qualifier = 15, RULE_qualifierClause = 16, 
		RULE_qualifierValue = 17, RULE_qualifierLabel = 18, RULE_qualifierSyntax = 19, 
		RULE_placementClause = 20, RULE_qualifierValueClause = 21, RULE_qualifierValueClauseType = 22, 
		RULE_routine = 23, RULE_typeClause = 24, RULE_keywordClause = 25, RULE_keywordValue = 26, 
		RULE_keywordLabel = 27, RULE_keywordSyntax = 28, RULE_keywordValueClause = 29, 
		RULE_keywordValueClauseType = 30, RULE_verbClause = 31, RULE_synonym = 32, 
		RULE_expression = 33, RULE_entity = 34;
	public static final String[] ruleNames = {
		"cldContent", "define", "anyName", "ident", "module", "verbClauseForSyntax", 
		"disallow", "image", "parameter", "parameterClause", "parameterValue", 
		"parameterLabel", "parameterPrompt", "parameterValueClause", "parameterValueClauseType", 
		"qualifier", "qualifierClause", "qualifierValue", "qualifierLabel", "qualifierSyntax", 
		"placementClause", "qualifierValueClause", "qualifierValueClauseType", 
		"routine", "typeClause", "keywordClause", "keywordValue", "keywordLabel", 
		"keywordSyntax", "keywordValueClause", "keywordValueClauseType", "verbClause", 
		"synonym", "expression", "entity"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "','", "'='", "'('", "')'", "'<'", "'>'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEFINE", "IDENT", "MODULE", "SYNTAX", "TYPE", "VERB", "NODISALLOWS", 
		"DISALLOW", "IMAGE", "NOPARAMETERS", "PARAMETER", "DEFAULT", "LABEL", 
		"PROMPT", "VALUE", "NOCONCATENATE", "CONCATENATE", "LIST", "REQUIRED", 
		"NOQUALIFIERS", "QUALIFIER", "BATCH", "NONNEGATABLE", "NEGATABLE", "PLACEMENT", 
		"GLOBAL", "LOCAL", "POSITIONAL", "ROUTINE", "KEYWORD", "SYNONYM", "ANY2", 
		"NEG", "NOT", "AND", "OR", "NAME", "COMMA", "EQUAL", "P_OPEN", "P_CLOSE", 
		"A_OPEN", "A_CLOSE", "DOT", "STRING", "WHITESPACE", "NEWLINE", "COMMENT"
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
	public String getGrammarFileName() { return "cld.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cldParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CldContentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(cldParser.EOF, 0); }
		public List<DefineContext> define() {
			return getRuleContexts(DefineContext.class);
		}
		public DefineContext define(int i) {
			return getRuleContext(DefineContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<ModuleContext> module() {
			return getRuleContexts(ModuleContext.class);
		}
		public ModuleContext module(int i) {
			return getRuleContext(ModuleContext.class,i);
		}
		public CldContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cldContent; }
	}

	public final CldContentContext cldContent() throws RecognitionException {
		CldContentContext _localctx = new CldContentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cldContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << IDENT) | (1L << MODULE))) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFINE:
					{
					setState(70);
					define();
					}
					break;
				case IDENT:
					{
					setState(71);
					ident();
					}
					break;
				case MODULE:
					{
					setState(72);
					module();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefineContext extends ParserRuleContext {
		public DefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define; }
	 
		public DefineContext() { }
		public void copyFrom(DefineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefineSyntaxContext extends DefineContext {
		public TerminalNode DEFINE() { return getToken(cldParser.DEFINE, 0); }
		public TerminalNode SYNTAX() { return getToken(cldParser.SYNTAX, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public List<VerbClauseForSyntaxContext> verbClauseForSyntax() {
			return getRuleContexts(VerbClauseForSyntaxContext.class);
		}
		public VerbClauseForSyntaxContext verbClauseForSyntax(int i) {
			return getRuleContext(VerbClauseForSyntaxContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cldParser.COMMA, i);
		}
		public DefineSyntaxContext(DefineContext ctx) { copyFrom(ctx); }
	}
	public static class DefineTypeContext extends DefineContext {
		public TerminalNode DEFINE() { return getToken(cldParser.DEFINE, 0); }
		public TerminalNode TYPE() { return getToken(cldParser.TYPE, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public List<TypeClauseContext> typeClause() {
			return getRuleContexts(TypeClauseContext.class);
		}
		public TypeClauseContext typeClause(int i) {
			return getRuleContext(TypeClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cldParser.COMMA, i);
		}
		public DefineTypeContext(DefineContext ctx) { copyFrom(ctx); }
	}
	public static class DefineVerbContext extends DefineContext {
		public TerminalNode DEFINE() { return getToken(cldParser.DEFINE, 0); }
		public TerminalNode VERB() { return getToken(cldParser.VERB, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public List<VerbClauseContext> verbClause() {
			return getRuleContexts(VerbClauseContext.class);
		}
		public VerbClauseContext verbClause(int i) {
			return getRuleContext(VerbClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cldParser.COMMA, i);
		}
		public DefineVerbContext(DefineContext ctx) { copyFrom(ctx); }
	}

	public final DefineContext define() throws RecognitionException {
		DefineContext _localctx = new DefineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_define);
		int _la;
		try {
			int _alt;
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new DefineSyntaxContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(DEFINE);
				setState(81);
				match(SYNTAX);
				setState(82);
				anyName();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NODISALLOWS) | (1L << DISALLOW) | (1L << IMAGE) | (1L << NOPARAMETERS) | (1L << PARAMETER) | (1L << NOQUALIFIERS) | (1L << QUALIFIER) | (1L << ROUTINE))) != 0)) {
					{
					setState(83);
					verbClauseForSyntax();
					setState(90);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(85);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COMMA) {
								{
								setState(84);
								match(COMMA);
								}
							}

							setState(87);
							verbClauseForSyntax();
							}
							} 
						}
						setState(92);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					}
					}
				}

				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(95);
						match(COMMA);
						}
						break;
					}
					setState(98);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				_localctx = new DefineTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(DEFINE);
				setState(102);
				match(TYPE);
				setState(103);
				anyName();
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEYWORD) {
					{
					setState(104);
					typeClause();
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(106);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COMMA) {
								{
								setState(105);
								match(COMMA);
								}
							}

							setState(108);
							typeClause();
							}
							} 
						}
						setState(113);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					}
				}

				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(116);
						match(COMMA);
						}
						break;
					}
					setState(119);
					match(COMMA);
					}
				}

				}
				break;
			case 3:
				_localctx = new DefineVerbContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(DEFINE);
				setState(123);
				match(VERB);
				setState(124);
				anyName();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NODISALLOWS) | (1L << DISALLOW) | (1L << IMAGE) | (1L << NOPARAMETERS) | (1L << PARAMETER) | (1L << NOQUALIFIERS) | (1L << QUALIFIER) | (1L << ROUTINE) | (1L << SYNONYM))) != 0)) {
					{
					setState(125);
					verbClause();
					setState(132);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(127);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==COMMA) {
								{
								setState(126);
								match(COMMA);
								}
							}

							setState(129);
							verbClause();
							}
							} 
						}
						setState(134);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
					}
					}
				}

				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(137);
						match(COMMA);
						}
						break;
					}
					setState(140);
					match(COMMA);
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

	public static class AnyNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(cldParser.NAME, 0); }
		public TerminalNode AND() { return getToken(cldParser.AND, 0); }
		public TerminalNode ANY2() { return getToken(cldParser.ANY2, 0); }
		public TerminalNode BATCH() { return getToken(cldParser.BATCH, 0); }
		public TerminalNode CONCATENATE() { return getToken(cldParser.CONCATENATE, 0); }
		public TerminalNode DEFAULT() { return getToken(cldParser.DEFAULT, 0); }
		public TerminalNode DEFINE() { return getToken(cldParser.DEFINE, 0); }
		public TerminalNode DISALLOW() { return getToken(cldParser.DISALLOW, 0); }
		public TerminalNode GLOBAL() { return getToken(cldParser.GLOBAL, 0); }
		public TerminalNode IDENT() { return getToken(cldParser.IDENT, 0); }
		public TerminalNode IMAGE() { return getToken(cldParser.IMAGE, 0); }
		public TerminalNode KEYWORD() { return getToken(cldParser.KEYWORD, 0); }
		public TerminalNode LABEL() { return getToken(cldParser.LABEL, 0); }
		public TerminalNode LIST() { return getToken(cldParser.LIST, 0); }
		public TerminalNode LOCAL() { return getToken(cldParser.LOCAL, 0); }
		public TerminalNode MODULE() { return getToken(cldParser.MODULE, 0); }
		public TerminalNode NEG() { return getToken(cldParser.NEG, 0); }
		public TerminalNode NEGATABLE() { return getToken(cldParser.NEGATABLE, 0); }
		public TerminalNode NOCONCATENATE() { return getToken(cldParser.NOCONCATENATE, 0); }
		public TerminalNode NODISALLOWS() { return getToken(cldParser.NODISALLOWS, 0); }
		public TerminalNode NONNEGATABLE() { return getToken(cldParser.NONNEGATABLE, 0); }
		public TerminalNode NOPARAMETERS() { return getToken(cldParser.NOPARAMETERS, 0); }
		public TerminalNode NOQUALIFIERS() { return getToken(cldParser.NOQUALIFIERS, 0); }
		public TerminalNode NOT() { return getToken(cldParser.NOT, 0); }
		public TerminalNode OR() { return getToken(cldParser.OR, 0); }
		public TerminalNode PARAMETER() { return getToken(cldParser.PARAMETER, 0); }
		public TerminalNode PLACEMENT() { return getToken(cldParser.PLACEMENT, 0); }
		public TerminalNode POSITIONAL() { return getToken(cldParser.POSITIONAL, 0); }
		public TerminalNode PROMPT() { return getToken(cldParser.PROMPT, 0); }
		public TerminalNode QUALIFIER() { return getToken(cldParser.QUALIFIER, 0); }
		public TerminalNode REQUIRED() { return getToken(cldParser.REQUIRED, 0); }
		public TerminalNode ROUTINE() { return getToken(cldParser.ROUTINE, 0); }
		public TerminalNode SYNONYM() { return getToken(cldParser.SYNONYM, 0); }
		public TerminalNode SYNTAX() { return getToken(cldParser.SYNTAX, 0); }
		public TerminalNode TYPE() { return getToken(cldParser.TYPE, 0); }
		public TerminalNode VALUE() { return getToken(cldParser.VALUE, 0); }
		public TerminalNode VERB() { return getToken(cldParser.VERB, 0); }
		public AnyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyName; }
	}

	public final AnyNameContext anyName() throws RecognitionException {
		AnyNameContext _localctx = new AnyNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anyName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << IDENT) | (1L << MODULE) | (1L << SYNTAX) | (1L << TYPE) | (1L << VERB) | (1L << NODISALLOWS) | (1L << DISALLOW) | (1L << IMAGE) | (1L << NOPARAMETERS) | (1L << PARAMETER) | (1L << DEFAULT) | (1L << LABEL) | (1L << PROMPT) | (1L << VALUE) | (1L << NOCONCATENATE) | (1L << CONCATENATE) | (1L << LIST) | (1L << REQUIRED) | (1L << NOQUALIFIERS) | (1L << QUALIFIER) | (1L << BATCH) | (1L << NONNEGATABLE) | (1L << NEGATABLE) | (1L << PLACEMENT) | (1L << GLOBAL) | (1L << LOCAL) | (1L << POSITIONAL) | (1L << ROUTINE) | (1L << KEYWORD) | (1L << SYNONYM) | (1L << ANY2) | (1L << NEG) | (1L << NOT) | (1L << AND) | (1L << OR) | (1L << NAME))) != 0)) ) {
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(cldParser.IDENT, 0); }
		public TerminalNode STRING() { return getToken(cldParser.STRING, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IDENT);
			setState(148);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(cldParser.MODULE, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(MODULE);
			setState(151);
			anyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbClauseForSyntaxContext extends ParserRuleContext {
		public DisallowContext disallow() {
			return getRuleContext(DisallowContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public RoutineContext routine() {
			return getRuleContext(RoutineContext.class,0);
		}
		public VerbClauseForSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbClauseForSyntax; }
	}

	public final VerbClauseForSyntaxContext verbClauseForSyntax() throws RecognitionException {
		VerbClauseForSyntaxContext _localctx = new VerbClauseForSyntaxContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_verbClauseForSyntax);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NODISALLOWS:
			case DISALLOW:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				disallow();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				image();
				}
				break;
			case NOPARAMETERS:
			case PARAMETER:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				parameter();
				}
				break;
			case NOQUALIFIERS:
			case QUALIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				qualifier();
				}
				break;
			case ROUTINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				routine();
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

	public static class DisallowContext extends ParserRuleContext {
		public TerminalNode NODISALLOWS() { return getToken(cldParser.NODISALLOWS, 0); }
		public TerminalNode DISALLOW() { return getToken(cldParser.DISALLOW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DisallowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disallow; }
	}

	public final DisallowContext disallow() throws RecognitionException {
		DisallowContext _localctx = new DisallowContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_disallow);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NODISALLOWS:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(NODISALLOWS);
				}
				break;
			case DISALLOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(DISALLOW);
				setState(162);
				expression(0);
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

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(cldParser.IMAGE, 0); }
		public TerminalNode STRING() { return getToken(cldParser.STRING, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(IMAGE);
			setState(166);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode NOPARAMETERS() { return getToken(cldParser.NOPARAMETERS, 0); }
		public TerminalNode PARAMETER() { return getToken(cldParser.PARAMETER, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public List<ParameterClauseContext> parameterClause() {
			return getRuleContexts(ParameterClauseContext.class);
		}
		public ParameterClauseContext parameterClause(int i) {
			return getRuleContext(ParameterClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cldParser.COMMA, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter);
		int _la;
		try {
			int _alt;
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOPARAMETERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(NOPARAMETERS);
				}
				break;
			case PARAMETER:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(PARAMETER);
				setState(170);
				anyName();
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(172);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(171);
							match(COMMA);
							}
						}

						setState(174);
						parameterClause();
						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ParameterClauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(cldParser.DEFAULT, 0); }
		public ParameterLabelContext parameterLabel() {
			return getRuleContext(ParameterLabelContext.class,0);
		}
		public ParameterPromptContext parameterPrompt() {
			return getRuleContext(ParameterPromptContext.class,0);
		}
		public ParameterValueContext parameterValue() {
			return getRuleContext(ParameterValueContext.class,0);
		}
		public ParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterClause; }
	}

	public final ParameterClauseContext parameterClause() throws RecognitionException {
		ParameterClauseContext _localctx = new ParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameterClause);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(DEFAULT);
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				parameterLabel();
				}
				break;
			case PROMPT:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				parameterPrompt();
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				parameterValue();
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

	public static class ParameterValueContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(cldParser.VALUE, 0); }
		public TerminalNode P_OPEN() { return getToken(cldParser.P_OPEN, 0); }
		public List<ParameterValueClauseContext> parameterValueClause() {
			return getRuleContexts(ParameterValueClauseContext.class);
		}
		public ParameterValueClauseContext parameterValueClause(int i) {
			return getRuleContext(ParameterValueClauseContext.class,i);
		}
		public TerminalNode P_CLOSE() { return getToken(cldParser.P_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(cldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cldParser.COMMA, i);
		}
		public ParameterValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValue; }
	}

	public final ParameterValueContext parameterValue() throws RecognitionException {
		ParameterValueContext _localctx = new ParameterValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameterValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(VALUE);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==P_OPEN) {
				{
				setState(189);
				match(P_OPEN);
				setState(190);
				parameterValueClause();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(191);
					match(COMMA);
					setState(192);
					parameterValueClause();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
				match(P_CLOSE);
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

	public static class ParameterLabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(cldParser.LABEL, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public ParameterLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterLabel; }
	}

	public final ParameterLabelContext parameterLabel() throws RecognitionException {
		ParameterLabelContext _localctx = new ParameterLabelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameterLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(LABEL);
			setState(203);
			match(EQUAL);
			setState(204);
			anyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterPromptContext extends ParserRuleContext {
		public TerminalNode PROMPT() { return getToken(cldParser.PROMPT, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(cldParser.STRING, 0); }
		public ParameterPromptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterPrompt; }
	}

	public final ParameterPromptContext parameterPrompt() throws RecognitionException {
		ParameterPromptContext _localctx = new ParameterPromptContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameterPrompt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(PROMPT);
			setState(207);
			match(EQUAL);
			setState(208);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterValueClauseContext extends ParserRuleContext {
		public TerminalNode CONCATENATE() { return getToken(cldParser.CONCATENATE, 0); }
		public TerminalNode NOCONCATENATE() { return getToken(cldParser.NOCONCATENATE, 0); }
		public TerminalNode LIST() { return getToken(cldParser.LIST, 0); }
		public TerminalNode REQUIRED() { return getToken(cldParser.REQUIRED, 0); }
		public TerminalNode DEFAULT() { return getToken(cldParser.DEFAULT, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(cldParser.STRING, 0); }
		public ParameterValueClauseTypeContext parameterValueClauseType() {
			return getRuleContext(ParameterValueClauseTypeContext.class,0);
		}
		public ParameterValueClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValueClause; }
	}

	public final ParameterValueClauseContext parameterValueClause() throws RecognitionException {
		ParameterValueClauseContext _localctx = new ParameterValueClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameterValueClause);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONCATENATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(CONCATENATE);
				}
				break;
			case NOCONCATENATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(NOCONCATENATE);
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(LIST);
				}
				break;
			case REQUIRED:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				match(REQUIRED);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(DEFAULT);
				setState(215);
				match(EQUAL);
				setState(216);
				match(STRING);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				parameterValueClauseType();
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

	public static class ParameterValueClauseTypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(cldParser.TYPE, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public ParameterValueClauseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValueClauseType; }
	}

	public final ParameterValueClauseTypeContext parameterValueClauseType() throws RecognitionException {
		ParameterValueClauseTypeContext _localctx = new ParameterValueClauseTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameterValueClauseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(TYPE);
			setState(221);
			match(EQUAL);
			setState(222);
			anyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifierContext extends ParserRuleContext {
		public TerminalNode NOQUALIFIERS() { return getToken(cldParser.NOQUALIFIERS, 0); }
		public TerminalNode QUALIFIER() { return getToken(cldParser.QUALIFIER, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public List<QualifierClauseContext> qualifierClause() {
			return getRuleContexts(QualifierClauseContext.class);
		}
		public QualifierClauseContext qualifierClause(int i) {
			return getRuleContext(QualifierClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cldParser.COMMA, i);
		}
		public QualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier; }
	}

	public final QualifierContext qualifier() throws RecognitionException {
		QualifierContext _localctx = new QualifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_qualifier);
		int _la;
		try {
			int _alt;
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOQUALIFIERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(NOQUALIFIERS);
				}
				break;
			case QUALIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(QUALIFIER);
				setState(226);
				anyName();
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(227);
							match(COMMA);
							}
						}

						setState(230);
						qualifierClause();
						}
						} 
					}
					setState(235);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class QualifierClauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(cldParser.DEFAULT, 0); }
		public TerminalNode BATCH() { return getToken(cldParser.BATCH, 0); }
		public QualifierLabelContext qualifierLabel() {
			return getRuleContext(QualifierLabelContext.class,0);
		}
		public TerminalNode NEGATABLE() { return getToken(cldParser.NEGATABLE, 0); }
		public TerminalNode NONNEGATABLE() { return getToken(cldParser.NONNEGATABLE, 0); }
		public TerminalNode PLACEMENT() { return getToken(cldParser.PLACEMENT, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public PlacementClauseContext placementClause() {
			return getRuleContext(PlacementClauseContext.class,0);
		}
		public QualifierSyntaxContext qualifierSyntax() {
			return getRuleContext(QualifierSyntaxContext.class,0);
		}
		public QualifierValueContext qualifierValue() {
			return getRuleContext(QualifierValueContext.class,0);
		}
		public QualifierClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifierClause; }
	}

	public final QualifierClauseContext qualifierClause() throws RecognitionException {
		QualifierClauseContext _localctx = new QualifierClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_qualifierClause);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(DEFAULT);
				}
				break;
			case BATCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(BATCH);
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				qualifierLabel();
				}
				break;
			case NEGATABLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(NEGATABLE);
				}
				break;
			case NONNEGATABLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				match(NONNEGATABLE);
				}
				break;
			case PLACEMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				match(PLACEMENT);
				setState(244);
				match(EQUAL);
				setState(245);
				placementClause();
				}
				break;
			case SYNTAX:
				enterOuterAlt(_localctx, 7);
				{
				setState(246);
				qualifierSyntax();
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(247);
				qualifierValue();
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

	public static class QualifierValueContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(cldParser.VALUE, 0); }
		public TerminalNode P_OPEN() { return getToken(cldParser.P_OPEN, 0); }
		public List<QualifierValueClauseContext> qualifierValueClause() {
			return getRuleContexts(QualifierValueClauseContext.class);
		}
		public QualifierValueClauseContext qualifierValueClause(int i) {
			return getRuleContext(QualifierValueClauseContext.class,i);
		}
		public TerminalNode P_CLOSE() { return getToken(cldParser.P_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(cldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cldParser.COMMA, i);
		}
		public QualifierValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifierValue; }
	}

	public final QualifierValueContext qualifierValue() throws RecognitionException {
		QualifierValueContext _localctx = new QualifierValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_qualifierValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(VALUE);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==P_OPEN) {
				{
				setState(251);
				match(P_OPEN);
				setState(252);
				qualifierValueClause();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(253);
					match(COMMA);
					setState(254);
					qualifierValueClause();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(P_CLOSE);
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

	public static class QualifierLabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(cldParser.LABEL, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public QualifierLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifierLabel; }
	}

	public final QualifierLabelContext qualifierLabel() throws RecognitionException {
		QualifierLabelContext _localctx = new QualifierLabelContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_qualifierLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(LABEL);
			setState(265);
			match(EQUAL);
			setState(266);
			anyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifierSyntaxContext extends ParserRuleContext {
		public TerminalNode SYNTAX() { return getToken(cldParser.SYNTAX, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public QualifierSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifierSyntax; }
	}

	public final QualifierSyntaxContext qualifierSyntax() throws RecognitionException {
		QualifierSyntaxContext _localctx = new QualifierSyntaxContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_qualifierSyntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(SYNTAX);
			setState(269);
			match(EQUAL);
			setState(270);
			anyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlacementClauseContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(cldParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(cldParser.LOCAL, 0); }
		public TerminalNode POSITIONAL() { return getToken(cldParser.POSITIONAL, 0); }
		public PlacementClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placementClause; }
	}

	public final PlacementClauseContext placementClause() throws RecognitionException {
		PlacementClauseContext _localctx = new PlacementClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_placementClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GLOBAL) | (1L << LOCAL) | (1L << POSITIONAL))) != 0)) ) {
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

	public static class QualifierValueClauseContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(cldParser.LIST, 0); }
		public TerminalNode REQUIRED() { return getToken(cldParser.REQUIRED, 0); }
		public TerminalNode DEFAULT() { return getToken(cldParser.DEFAULT, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(cldParser.STRING, 0); }
		public QualifierValueClauseTypeContext qualifierValueClauseType() {
			return getRuleContext(QualifierValueClauseTypeContext.class,0);
		}
		public QualifierValueClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifierValueClause; }
	}

	public final QualifierValueClauseContext qualifierValueClause() throws RecognitionException {
		QualifierValueClauseContext _localctx = new QualifierValueClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_qualifierValueClause);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(LIST);
				}
				break;
			case REQUIRED:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(REQUIRED);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(DEFAULT);
				setState(277);
				match(EQUAL);
				setState(278);
				match(STRING);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				qualifierValueClauseType();
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

	public static class QualifierValueClauseTypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(cldParser.TYPE, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public QualifierValueClauseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifierValueClauseType; }
	}

	public final QualifierValueClauseTypeContext qualifierValueClauseType() throws RecognitionException {
		QualifierValueClauseTypeContext _localctx = new QualifierValueClauseTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_qualifierValueClauseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(TYPE);
			setState(283);
			match(EQUAL);
			setState(284);
			anyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoutineContext extends ParserRuleContext {
		public TerminalNode ROUTINE() { return getToken(cldParser.ROUTINE, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public RoutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine; }
	}

	public final RoutineContext routine() throws RecognitionException {
		RoutineContext _localctx = new RoutineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_routine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ROUTINE);
			setState(287);
			anyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeClauseContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(cldParser.KEYWORD, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public List<KeywordClauseContext> keywordClause() {
			return getRuleContexts(KeywordClauseContext.class);
		}
		public KeywordClauseContext keywordClause(int i) {
			return getRuleContext(KeywordClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cldParser.COMMA, i);
		}
		public TypeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeClause; }
	}

	public final TypeClauseContext typeClause() throws RecognitionException {
		TypeClauseContext _localctx = new TypeClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(KEYWORD);
			setState(290);
			anyName();
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(291);
						match(COMMA);
						}
					}

					setState(294);
					keywordClause();
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class KeywordClauseContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(cldParser.DEFAULT, 0); }
		public KeywordLabelContext keywordLabel() {
			return getRuleContext(KeywordLabelContext.class,0);
		}
		public TerminalNode NEGATABLE() { return getToken(cldParser.NEGATABLE, 0); }
		public TerminalNode NONNEGATABLE() { return getToken(cldParser.NONNEGATABLE, 0); }
		public KeywordSyntaxContext keywordSyntax() {
			return getRuleContext(KeywordSyntaxContext.class,0);
		}
		public KeywordValueContext keywordValue() {
			return getRuleContext(KeywordValueContext.class,0);
		}
		public KeywordClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordClause; }
	}

	public final KeywordClauseContext keywordClause() throws RecognitionException {
		KeywordClauseContext _localctx = new KeywordClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_keywordClause);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(DEFAULT);
				}
				break;
			case LABEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				keywordLabel();
				}
				break;
			case NEGATABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(NEGATABLE);
				}
				break;
			case NONNEGATABLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(NONNEGATABLE);
				}
				break;
			case SYNTAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				keywordSyntax();
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				keywordValue();
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

	public static class KeywordValueContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(cldParser.VALUE, 0); }
		public TerminalNode P_OPEN() { return getToken(cldParser.P_OPEN, 0); }
		public List<KeywordValueClauseContext> keywordValueClause() {
			return getRuleContexts(KeywordValueClauseContext.class);
		}
		public KeywordValueClauseContext keywordValueClause(int i) {
			return getRuleContext(KeywordValueClauseContext.class,i);
		}
		public TerminalNode P_CLOSE() { return getToken(cldParser.P_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(cldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cldParser.COMMA, i);
		}
		public KeywordValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordValue; }
	}

	public final KeywordValueContext keywordValue() throws RecognitionException {
		KeywordValueContext _localctx = new KeywordValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_keywordValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(VALUE);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==P_OPEN) {
				{
				setState(309);
				match(P_OPEN);
				setState(310);
				keywordValueClause();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(311);
					match(COMMA);
					setState(312);
					keywordValueClause();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				match(P_CLOSE);
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

	public static class KeywordLabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(cldParser.LABEL, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public KeywordLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordLabel; }
	}

	public final KeywordLabelContext keywordLabel() throws RecognitionException {
		KeywordLabelContext _localctx = new KeywordLabelContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_keywordLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(LABEL);
			setState(323);
			match(EQUAL);
			setState(324);
			anyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordSyntaxContext extends ParserRuleContext {
		public TerminalNode SYNTAX() { return getToken(cldParser.SYNTAX, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public KeywordSyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordSyntax; }
	}

	public final KeywordSyntaxContext keywordSyntax() throws RecognitionException {
		KeywordSyntaxContext _localctx = new KeywordSyntaxContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_keywordSyntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(SYNTAX);
			setState(327);
			match(EQUAL);
			setState(328);
			anyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordValueClauseContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(cldParser.LIST, 0); }
		public TerminalNode REQUIRED() { return getToken(cldParser.REQUIRED, 0); }
		public TerminalNode DEFAULT() { return getToken(cldParser.DEFAULT, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(cldParser.STRING, 0); }
		public KeywordValueClauseTypeContext keywordValueClauseType() {
			return getRuleContext(KeywordValueClauseTypeContext.class,0);
		}
		public KeywordValueClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordValueClause; }
	}

	public final KeywordValueClauseContext keywordValueClause() throws RecognitionException {
		KeywordValueClauseContext _localctx = new KeywordValueClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_keywordValueClause);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(LIST);
				}
				break;
			case REQUIRED:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(REQUIRED);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(DEFAULT);
				setState(333);
				match(EQUAL);
				setState(334);
				match(STRING);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				keywordValueClauseType();
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

	public static class KeywordValueClauseTypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(cldParser.TYPE, 0); }
		public TerminalNode EQUAL() { return getToken(cldParser.EQUAL, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public KeywordValueClauseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordValueClauseType; }
	}

	public final KeywordValueClauseTypeContext keywordValueClauseType() throws RecognitionException {
		KeywordValueClauseTypeContext _localctx = new KeywordValueClauseTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_keywordValueClauseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(TYPE);
			setState(339);
			match(EQUAL);
			setState(340);
			anyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbClauseContext extends ParserRuleContext {
		public DisallowContext disallow() {
			return getRuleContext(DisallowContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public RoutineContext routine() {
			return getRuleContext(RoutineContext.class,0);
		}
		public SynonymContext synonym() {
			return getRuleContext(SynonymContext.class,0);
		}
		public VerbClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbClause; }
	}

	public final VerbClauseContext verbClause() throws RecognitionException {
		VerbClauseContext _localctx = new VerbClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_verbClause);
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NODISALLOWS:
			case DISALLOW:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				disallow();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				image();
				}
				break;
			case NOPARAMETERS:
			case PARAMETER:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				parameter();
				}
				break;
			case NOQUALIFIERS:
			case QUALIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				qualifier();
				}
				break;
			case ROUTINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				routine();
				}
				break;
			case SYNONYM:
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				synonym();
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

	public static class SynonymContext extends ParserRuleContext {
		public TerminalNode SYNONYM() { return getToken(cldParser.SYNONYM, 0); }
		public AnyNameContext anyName() {
			return getRuleContext(AnyNameContext.class,0);
		}
		public SynonymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synonym; }
	}

	public final SynonymContext synonym() throws RecognitionException {
		SynonymContext _localctx = new SynonymContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_synonym);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(SYNONYM);
			setState(351);
			anyName();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode NOT() { return getToken(cldParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode P_OPEN() { return getToken(cldParser.P_OPEN, 0); }
		public TerminalNode P_CLOSE() { return getToken(cldParser.P_CLOSE, 0); }
		public TerminalNode ANY2() { return getToken(cldParser.ANY2, 0); }
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cldParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cldParser.COMMA, i);
		}
		public TerminalNode NEG() { return getToken(cldParser.NEG, 0); }
		public TerminalNode AND() { return getToken(cldParser.AND, 0); }
		public TerminalNode OR() { return getToken(cldParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(354);
				match(NOT);
				setState(355);
				expression(7);
				}
				break;
			case 2:
				{
				setState(356);
				match(P_OPEN);
				setState(357);
				expression(0);
				setState(358);
				match(P_CLOSE);
				}
				break;
			case 3:
				{
				setState(360);
				match(ANY2);
				setState(361);
				match(P_OPEN);
				setState(362);
				entity();
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(363);
					match(COMMA);
					setState(364);
					entity();
					}
					}
					setState(367); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(369);
				match(P_CLOSE);
				}
				break;
			case 4:
				{
				setState(371);
				match(NEG);
				setState(372);
				entity();
				}
				break;
			case 5:
				{
				setState(373);
				entity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(382);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(376);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(377);
						match(AND);
						setState(378);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(379);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(380);
						match(OR);
						setState(381);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EntityContext extends ParserRuleContext {
		public AnyNameContext defRoot;
		public List<AnyNameContext> anyName() {
			return getRuleContexts(AnyNameContext.class);
		}
		public AnyNameContext anyName(int i) {
			return getRuleContext(AnyNameContext.class,i);
		}
		public TerminalNode A_OPEN() { return getToken(cldParser.A_OPEN, 0); }
		public TerminalNode A_CLOSE() { return getToken(cldParser.A_CLOSE, 0); }
		public List<TerminalNode> DOT() { return getTokens(cldParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cldParser.DOT, i);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_entity);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==A_OPEN) {
				{
				setState(387);
				match(A_OPEN);
				setState(388);
				((EntityContext)_localctx).defRoot = anyName();
				setState(389);
				match(A_CLOSE);
				}
			}

			setState(393);
			anyName();
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(394);
					match(DOT);
					setState(395);
					anyName();
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0194\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\5\3X\n\3\3\3\7\3[\n\3\f\3\16\3^\13\3\5\3`\n\3\3\3\5"+
		"\3c\n\3\3\3\5\3f\n\3\3\3\3\3\3\3\3\3\3\3\5\3m\n\3\3\3\7\3p\n\3\f\3\16"+
		"\3s\13\3\5\3u\n\3\3\3\5\3x\n\3\3\3\5\3{\n\3\3\3\3\3\3\3\3\3\3\3\5\3\u0082"+
		"\n\3\3\3\7\3\u0085\n\3\f\3\16\3\u0088\13\3\5\3\u008a\n\3\3\3\5\3\u008d"+
		"\n\3\3\3\5\3\u0090\n\3\5\3\u0092\n\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u00a1\n\7\3\b\3\b\3\b\5\b\u00a6\n\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\5\n\u00af\n\n\3\n\7\n\u00b2\n\n\f\n\16\n\u00b5\13\n\5"+
		"\n\u00b7\n\n\3\13\3\13\3\13\3\13\5\13\u00bd\n\13\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00c4\n\f\f\f\16\f\u00c7\13\f\3\f\3\f\5\f\u00cb\n\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00dd"+
		"\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00e7\n\21\3\21\7\21"+
		"\u00ea\n\21\f\21\16\21\u00ed\13\21\5\21\u00ef\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00fb\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u0102\n\23\f\23\16\23\u0105\13\23\3\23\3\23\5\23\u0109\n\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u011b\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\5\32\u0127\n\32\3\32\7\32\u012a\n\32\f\32\16\32\u012d\13\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u0135\n\33\3\34\3\34\3\34\3\34\3\34\7\34\u013c"+
		"\n\34\f\34\16\34\u013f\13\34\3\34\3\34\5\34\u0143\n\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0153\n\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u015f\n!\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\6#\u0170\n#\r#\16#\u0171\3#\3#\3#\3#\3#\5#\u0179"+
		"\n#\3#\3#\3#\3#\3#\3#\7#\u0181\n#\f#\16#\u0184\13#\3$\3$\3$\3$\5$\u018a"+
		"\n$\3$\3$\3$\7$\u018f\n$\f$\16$\u0192\13$\3$\2\3D%\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\4\3\2\3\'\3\2\34\36"+
		"\2\u01bf\2M\3\2\2\2\4\u0091\3\2\2\2\6\u0093\3\2\2\2\b\u0095\3\2\2\2\n"+
		"\u0098\3\2\2\2\f\u00a0\3\2\2\2\16\u00a5\3\2\2\2\20\u00a7\3\2\2\2\22\u00b6"+
		"\3\2\2\2\24\u00bc\3\2\2\2\26\u00be\3\2\2\2\30\u00cc\3\2\2\2\32\u00d0\3"+
		"\2\2\2\34\u00dc\3\2\2\2\36\u00de\3\2\2\2 \u00ee\3\2\2\2\"\u00fa\3\2\2"+
		"\2$\u00fc\3\2\2\2&\u010a\3\2\2\2(\u010e\3\2\2\2*\u0112\3\2\2\2,\u011a"+
		"\3\2\2\2.\u011c\3\2\2\2\60\u0120\3\2\2\2\62\u0123\3\2\2\2\64\u0134\3\2"+
		"\2\2\66\u0136\3\2\2\28\u0144\3\2\2\2:\u0148\3\2\2\2<\u0152\3\2\2\2>\u0154"+
		"\3\2\2\2@\u015e\3\2\2\2B\u0160\3\2\2\2D\u0178\3\2\2\2F\u0189\3\2\2\2H"+
		"L\5\4\3\2IL\5\b\5\2JL\5\n\6\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\2\2\3Q\3\3\2\2\2RS\7\3\2"+
		"\2ST\7\6\2\2T_\5\6\4\2U\\\5\f\7\2VX\7(\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2"+
		"\2Y[\5\f\7\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3"+
		"\2\2\2_U\3\2\2\2_`\3\2\2\2`e\3\2\2\2ac\7(\2\2ba\3\2\2\2bc\3\2\2\2cd\3"+
		"\2\2\2df\7(\2\2eb\3\2\2\2ef\3\2\2\2f\u0092\3\2\2\2gh\7\3\2\2hi\7\7\2\2"+
		"it\5\6\4\2jq\5\62\32\2km\7(\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2np\5\62\32"+
		"\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tj\3\2\2"+
		"\2tu\3\2\2\2uz\3\2\2\2vx\7(\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\7(\2\2"+
		"zw\3\2\2\2z{\3\2\2\2{\u0092\3\2\2\2|}\7\3\2\2}~\7\b\2\2~\u0089\5\6\4\2"+
		"\177\u0086\5@!\2\u0080\u0082\7(\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\5@!\2\u0084\u0081\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\177\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008f"+
		"\3\2\2\2\u008b\u008d\7(\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\7(\2\2\u008f\u008c\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091R\3\2\2\2\u0091g\3\2\2\2\u0091|\3\2\2\2"+
		"\u0092\5\3\2\2\2\u0093\u0094\t\2\2\2\u0094\7\3\2\2\2\u0095\u0096\7\4\2"+
		"\2\u0096\u0097\7/\2\2\u0097\t\3\2\2\2\u0098\u0099\7\5\2\2\u0099\u009a"+
		"\5\6\4\2\u009a\13\3\2\2\2\u009b\u00a1\5\16\b\2\u009c\u00a1\5\20\t\2\u009d"+
		"\u00a1\5\22\n\2\u009e\u00a1\5 \21\2\u009f\u00a1\5\60\31\2\u00a0\u009b"+
		"\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\r\3\2\2\2\u00a2\u00a6\7\t\2\2\u00a3\u00a4\7\n\2\2"+
		"\u00a4\u00a6\5D#\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\17\3"+
		"\2\2\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9\7/\2\2\u00a9\21\3\2\2\2\u00aa"+
		"\u00b7\7\f\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00b3\5\6\4\2\u00ad\u00af\7("+
		"\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b2\5\24\13\2\u00b1\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3"+
		"\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"\u00aa\3\2\2\2\u00b6\u00ab\3\2\2\2\u00b7\23\3\2\2\2\u00b8\u00bd\7\16\2"+
		"\2\u00b9\u00bd\5\30\r\2\u00ba\u00bd\5\32\16\2\u00bb\u00bd\5\26\f\2\u00bc"+
		"\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd\25\3\2\2\2\u00be\u00ca\7\21\2\2\u00bf\u00c0\7*\2\2\u00c0\u00c5"+
		"\5\34\17\2\u00c1\u00c2\7(\2\2\u00c2\u00c4\5\34\17\2\u00c3\u00c1\3\2\2"+
		"\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7+\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00bf\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\27\3\2\2\2\u00cc\u00cd\7\17\2"+
		"\2\u00cd\u00ce\7)\2\2\u00ce\u00cf\5\6\4\2\u00cf\31\3\2\2\2\u00d0\u00d1"+
		"\7\20\2\2\u00d1\u00d2\7)\2\2\u00d2\u00d3\7/\2\2\u00d3\33\3\2\2\2\u00d4"+
		"\u00dd\7\23\2\2\u00d5\u00dd\7\22\2\2\u00d6\u00dd\7\24\2\2\u00d7\u00dd"+
		"\7\25\2\2\u00d8\u00d9\7\16\2\2\u00d9\u00da\7)\2\2\u00da\u00dd\7/\2\2\u00db"+
		"\u00dd\5\36\20\2\u00dc\u00d4\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dc\u00d6\3"+
		"\2\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\35\3\2\2\2\u00de\u00df\7\7\2\2\u00df\u00e0\7)\2\2\u00e0\u00e1\5\6\4\2"+
		"\u00e1\37\3\2\2\2\u00e2\u00ef\7\26\2\2\u00e3\u00e4\7\27\2\2\u00e4\u00eb"+
		"\5\6\4\2\u00e5\u00e7\7(\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\5\"\22\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00e2\3\2\2\2\u00ee\u00e3\3\2\2\2\u00ef!\3\2\2\2"+
		"\u00f0\u00fb\7\16\2\2\u00f1\u00fb\7\30\2\2\u00f2\u00fb\5&\24\2\u00f3\u00fb"+
		"\7\32\2\2\u00f4\u00fb\7\31\2\2\u00f5\u00f6\7\33\2\2\u00f6\u00f7\7)\2\2"+
		"\u00f7\u00fb\5*\26\2\u00f8\u00fb\5(\25\2\u00f9\u00fb\5$\23\2\u00fa\u00f0"+
		"\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fa"+
		"\u00f4\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb#\3\2\2\2\u00fc\u0108\7\21\2\2\u00fd\u00fe\7*\2\2\u00fe\u0103"+
		"\5,\27\2\u00ff\u0100\7(\2\2\u0100\u0102\5,\27\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7+\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u00fd\3\2\2\2\u0108\u0109\3\2\2\2\u0109%\3\2\2\2\u010a\u010b\7\17\2\2"+
		"\u010b\u010c\7)\2\2\u010c\u010d\5\6\4\2\u010d\'\3\2\2\2\u010e\u010f\7"+
		"\6\2\2\u010f\u0110\7)\2\2\u0110\u0111\5\6\4\2\u0111)\3\2\2\2\u0112\u0113"+
		"\t\3\2\2\u0113+\3\2\2\2\u0114\u011b\7\24\2\2\u0115\u011b\7\25\2\2\u0116"+
		"\u0117\7\16\2\2\u0117\u0118\7)\2\2\u0118\u011b\7/\2\2\u0119\u011b\5.\30"+
		"\2\u011a\u0114\3\2\2\2\u011a\u0115\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0119"+
		"\3\2\2\2\u011b-\3\2\2\2\u011c\u011d\7\7\2\2\u011d\u011e\7)\2\2\u011e\u011f"+
		"\5\6\4\2\u011f/\3\2\2\2\u0120\u0121\7\37\2\2\u0121\u0122\5\6\4\2\u0122"+
		"\61\3\2\2\2\u0123\u0124\7 \2\2\u0124\u012b\5\6\4\2\u0125\u0127\7(\2\2"+
		"\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a"+
		"\5\64\33\2\u0129\u0126\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\63\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0135"+
		"\7\16\2\2\u012f\u0135\58\35\2\u0130\u0135\7\32\2\2\u0131\u0135\7\31\2"+
		"\2\u0132\u0135\5:\36\2\u0133\u0135\5\66\34\2\u0134\u012e\3\2\2\2\u0134"+
		"\u012f\3\2\2\2\u0134\u0130\3\2\2\2\u0134\u0131\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0134\u0133\3\2\2\2\u0135\65\3\2\2\2\u0136\u0142\7\21\2\2\u0137\u0138"+
		"\7*\2\2\u0138\u013d\5<\37\2\u0139\u013a\7(\2\2\u013a\u013c\5<\37\2\u013b"+
		"\u0139\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7+\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u0137\3\2\2\2\u0142\u0143\3\2\2\2\u0143\67\3\2\2"+
		"\2\u0144\u0145\7\17\2\2\u0145\u0146\7)\2\2\u0146\u0147\5\6\4\2\u01479"+
		"\3\2\2\2\u0148\u0149\7\6\2\2\u0149\u014a\7)\2\2\u014a\u014b\5\6\4\2\u014b"+
		";\3\2\2\2\u014c\u0153\7\24\2\2\u014d\u0153\7\25\2\2\u014e\u014f\7\16\2"+
		"\2\u014f\u0150\7)\2\2\u0150\u0153\7/\2\2\u0151\u0153\5> \2\u0152\u014c"+
		"\3\2\2\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"=\3\2\2\2\u0154\u0155\7\7\2\2\u0155\u0156\7)\2\2\u0156\u0157\5\6\4\2\u0157"+
		"?\3\2\2\2\u0158\u015f\5\16\b\2\u0159\u015f\5\20\t\2\u015a\u015f\5\22\n"+
		"\2\u015b\u015f\5 \21\2\u015c\u015f\5\60\31\2\u015d\u015f\5B\"\2\u015e"+
		"\u0158\3\2\2\2\u015e\u0159\3\2\2\2\u015e\u015a\3\2\2\2\u015e\u015b\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015fA\3\2\2\2\u0160\u0161"+
		"\7!\2\2\u0161\u0162\5\6\4\2\u0162C\3\2\2\2\u0163\u0164\b#\1\2\u0164\u0165"+
		"\7$\2\2\u0165\u0179\5D#\t\u0166\u0167\7*\2\2\u0167\u0168\5D#\2\u0168\u0169"+
		"\7+\2\2\u0169\u0179\3\2\2\2\u016a\u016b\7\"\2\2\u016b\u016c\7*\2\2\u016c"+
		"\u016f\5F$\2\u016d\u016e\7(\2\2\u016e\u0170\5F$\2\u016f\u016d\3\2\2\2"+
		"\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0174\7+\2\2\u0174\u0179\3\2\2\2\u0175\u0176\7#\2\2\u0176"+
		"\u0179\5F$\2\u0177\u0179\5F$\2\u0178\u0163\3\2\2\2\u0178\u0166\3\2\2\2"+
		"\u0178\u016a\3\2\2\2\u0178\u0175\3\2\2\2\u0178\u0177\3\2\2\2\u0179\u0182"+
		"\3\2\2\2\u017a\u017b\f\b\2\2\u017b\u017c\7%\2\2\u017c\u0181\5D#\t\u017d"+
		"\u017e\f\7\2\2\u017e\u017f\7&\2\2\u017f\u0181\5D#\b\u0180\u017a\3\2\2"+
		"\2\u0180\u017d\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183E\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7,\2\2\u0186\u0187"+
		"\5\6\4\2\u0187\u0188\7-\2\2\u0188\u018a\3\2\2\2\u0189\u0185\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0190\5\6\4\2\u018c\u018d\7."+
		"\2\2\u018d\u018f\5\6\4\2\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191G\3\2\2\2\u0192\u0190\3\2\2\2"+
		"\61KMW\\_belqtwz\u0081\u0086\u0089\u008c\u008f\u0091\u00a0\u00a5\u00ae"+
		"\u00b3\u00b6\u00bc\u00c5\u00ca\u00dc\u00e6\u00eb\u00ee\u00fa\u0103\u0108"+
		"\u011a\u0126\u012b\u0134\u013d\u0142\u0152\u015e\u0171\u0178\u0180\u0182"+
		"\u0189\u0190";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}