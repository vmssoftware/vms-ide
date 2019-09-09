// Generated from d:\vmssoftware.work\vms-ide\src\vms_cobol\parser\cobol.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cobolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, ALPHA=2, ALPHABET=3, ALSO=4, ARE=5, ARGUMENT_NUMBER=6, 
		ARGUMENT_VALUE=7, ARITHMETIC=8, ASCII=9, AUTHOR=10, C01=11, CARD_READER=12, 
		CHARACTERS=13, CLASS=14, COLLATING=15, COMMA=16, COMMON=17, CONFIGURATION=18, 
		CONSOLE=19, CRT=20, CURRENCY=21, CURSOR=22, DATE_COMPILED=23, DATE_WRITTEN=24, 
		DEBUGGING=25, DECIMAL_POINT=26, DIVISION=27, EBCDIC=28, ENVIRONMENT=29, 
		ENVIRONMENT_NAME=30, ENVIRONMENT_VALUE=31, FILE_CONTROL=32, I64=33, IDENT=34, 
		IDENTIFICATION_DIVISION=35, IN=36, INITIAL=37, INPUT_OUTPUT=38, INSTALLATION=39, 
		IS=40, I_O_CONTROL=41, LINE_PRINTER=42, MEMORY=43, MODE=44, MODULES=45, 
		NATIVE=46, OBJECT_COMPUTER=47, OFF=48, ON=49, OPTIONS=50, PAPER_TAPE_PUNCH=51, 
		PAPER_TAPE_READER=52, PICTURE=53, PROGRAM=54, PROGRAM_ID=55, SECTION=56, 
		SECURITY=57, SEGMENT_LIMIT=58, SEQUENCE=59, SIGN=60, SIZE=61, SOURCE_COMPUTER=62, 
		SPECIAL_NAMES=63, STANDARD=64, STANDARD_1=65, STANDARD_2=66, STATUS=67, 
		SWITCH=68, SYMBOL=69, SYMBOLIC=70, SYSERR=71, SYSIN=72, SYSOUT=73, THROUGH=74, 
		THRU=75, VAX=76, WITH=77, WORDS=78, DOWN_LINE=79, PLUS=80, MINUS=81, STAR=82, 
		SLASH=83, COMMA_=84, SEMI=85, COLON=86, EQUAL=87, LT=88, LE=89, GE=90, 
		GT=91, LPAREN=92, RPAREN=93, LBRACK=94, RBRACK=95, POINTER=96, ATP=97, 
		DOT=98, DOTDOT=99, LCURLY=100, RCURLY=101, STRING_LITERAL=102, NUMERIC_LITERAL=103, 
		HEX_LITERAL=104, USER_DEFINED_WORD=105, EMPTY_A=106, WHITESPACE=107, NEWLINE=108;
	public static final int
		RULE_source = 0, RULE_empty_area = 1, RULE_program = 2, RULE_identification_division = 3, 
		RULE_identification_division_paragraph = 4, RULE_program_id = 5, RULE_program_name = 6, 
		RULE_is_program = 7, RULE_with_ident = 8, RULE_ident_string = 9, RULE_comment_entry = 10, 
		RULE_author = 11, RULE_installation = 12, RULE_date_written = 13, RULE_date_compiled = 14, 
		RULE_security = 15, RULE_options_ = 16, RULE_arithmetic = 17, RULE_environment_division = 18, 
		RULE_configuration_section = 19, RULE_input_output_section = 20, RULE_source_computer = 21, 
		RULE_computer_type = 22, RULE_with_debugging = 23, RULE_object_computer = 24, 
		RULE_memory_size = 25, RULE_memory_size_amount = 26, RULE_memory_size_unit = 27, 
		RULE_program_collating = 28, RULE_alpha_name = 29, RULE_segment_limit = 30, 
		RULE_segment_number = 31, RULE_special_names = 32, RULE_switch_ = 33, 
		RULE_switch_clause_on = 34, RULE_switch_clause_off = 35, RULE_cond_name = 36, 
		RULE_switch_name = 37, RULE_switch_num = 38, RULE_top_of_page_name = 39, 
		RULE_predefined_device = 40, RULE_device_name = 41, RULE_arg_env = 42, 
		RULE_arg_env_name = 43, RULE_file_control = 44, RULE_i_o_control = 45;
	public static final String[] ruleNames = {
		"source", "empty_area", "program", "identification_division", "identification_division_paragraph", 
		"program_id", "program_name", "is_program", "with_ident", "ident_string", 
		"comment_entry", "author", "installation", "date_written", "date_compiled", 
		"security", "options_", "arithmetic", "environment_division", "configuration_section", 
		"input_output_section", "source_computer", "computer_type", "with_debugging", 
		"object_computer", "memory_size", "memory_size_amount", "memory_size_unit", 
		"program_collating", "alpha_name", "segment_limit", "segment_number", 
		"special_names", "switch_", "switch_clause_on", "switch_clause_off", "cond_name", 
		"switch_name", "switch_num", "top_of_page_name", "predefined_device", 
		"device_name", "arg_env", "arg_env_name", "file_control", "i_o_control"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'_'", "'+'", "'-'", "'*'", 
		"'/'", "','", "';'", "':'", "'='", "'<'", "'<='", "'>='", "'>'", "'('", 
		"')'", "'['", "']'", "'^'", "'@'", "'.'", "'..'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LINE_COMMENT", "ALPHA", "ALPHABET", "ALSO", "ARE", "ARGUMENT_NUMBER", 
		"ARGUMENT_VALUE", "ARITHMETIC", "ASCII", "AUTHOR", "C01", "CARD_READER", 
		"CHARACTERS", "CLASS", "COLLATING", "COMMA", "COMMON", "CONFIGURATION", 
		"CONSOLE", "CRT", "CURRENCY", "CURSOR", "DATE_COMPILED", "DATE_WRITTEN", 
		"DEBUGGING", "DECIMAL_POINT", "DIVISION", "EBCDIC", "ENVIRONMENT", "ENVIRONMENT_NAME", 
		"ENVIRONMENT_VALUE", "FILE_CONTROL", "I64", "IDENT", "IDENTIFICATION_DIVISION", 
		"IN", "INITIAL", "INPUT_OUTPUT", "INSTALLATION", "IS", "I_O_CONTROL", 
		"LINE_PRINTER", "MEMORY", "MODE", "MODULES", "NATIVE", "OBJECT_COMPUTER", 
		"OFF", "ON", "OPTIONS", "PAPER_TAPE_PUNCH", "PAPER_TAPE_READER", "PICTURE", 
		"PROGRAM", "PROGRAM_ID", "SECTION", "SECURITY", "SEGMENT_LIMIT", "SEQUENCE", 
		"SIGN", "SIZE", "SOURCE_COMPUTER", "SPECIAL_NAMES", "STANDARD", "STANDARD_1", 
		"STANDARD_2", "STATUS", "SWITCH", "SYMBOL", "SYMBOLIC", "SYSERR", "SYSIN", 
		"SYSOUT", "THROUGH", "THRU", "VAX", "WITH", "WORDS", "DOWN_LINE", "PLUS", 
		"MINUS", "STAR", "SLASH", "COMMA_", "SEMI", "COLON", "EQUAL", "LT", "LE", 
		"GE", "GT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "POINTER", "ATP", 
		"DOT", "DOTDOT", "LCURLY", "RCURLY", "STRING_LITERAL", "NUMERIC_LITERAL", 
		"HEX_LITERAL", "USER_DEFINED_WORD", "EMPTY_A", "WHITESPACE", "NEWLINE"
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
	public String getGrammarFileName() { return "cobol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cobolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(cobolParser.EOF, 0); }
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT || _la==IDENTIFICATION_DIVISION || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(92);
				program();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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

	public static class Empty_areaContext extends ParserRuleContext {
		public List<TerminalNode> WHITESPACE() { return getTokens(cobolParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(cobolParser.WHITESPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<TerminalNode> EMPTY_A() { return getTokens(cobolParser.EMPTY_A); }
		public TerminalNode EMPTY_A(int i) {
			return getToken(cobolParser.EMPTY_A, i);
		}
		public Empty_areaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_area; }
	}

	public final Empty_areaContext empty_area() throws RecognitionException {
		Empty_areaContext _localctx = new Empty_areaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_empty_area);
		try {
			int _alt;
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(100);
						match(WHITESPACE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(103); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(105);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(108); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case EMPTY_A:
				enterOuterAlt(_localctx, 3);
				{
				setState(111); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(110);
						match(EMPTY_A);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(113); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ProgramContext extends ParserRuleContext {
		public Identification_divisionContext identification_division() {
			return getRuleContext(Identification_divisionContext.class,0);
		}
		public Environment_divisionContext environment_division() {
			return getRuleContext(Environment_divisionContext.class,0);
		}
		public Empty_areaContext empty_area() {
			return getRuleContext(Empty_areaContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(cobolParser.LINE_COMMENT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICATION_DIVISION:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				identification_division();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENVIRONMENT) {
					{
					setState(118);
					environment_division();
					}
				}

				}
				break;
			case EMPTY_A:
			case WHITESPACE:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				empty_area();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(LINE_COMMENT);
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

	public static class Identification_divisionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_DIVISION() { return getToken(cobolParser.IDENTIFICATION_DIVISION, 0); }
		public TerminalNode DIVISION() { return getToken(cobolParser.DIVISION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Identification_division_paragraphContext> identification_division_paragraph() {
			return getRuleContexts(Identification_division_paragraphContext.class);
		}
		public Identification_division_paragraphContext identification_division_paragraph(int i) {
			return getRuleContext(Identification_division_paragraphContext.class,i);
		}
		public Identification_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identification_division; }
	}

	public final Identification_divisionContext identification_division() throws RecognitionException {
		Identification_divisionContext _localctx = new Identification_divisionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identification_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IDENTIFICATION_DIVISION);
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				empty_area();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(131);
			match(DIVISION);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(132);
				empty_area();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(DOT);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					empty_area();
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					identification_division_paragraph();
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identification_division_paragraphContext extends ParserRuleContext {
		public Program_idContext program_id() {
			return getRuleContext(Program_idContext.class,0);
		}
		public AuthorContext author() {
			return getRuleContext(AuthorContext.class,0);
		}
		public InstallationContext installation() {
			return getRuleContext(InstallationContext.class,0);
		}
		public Date_writtenContext date_written() {
			return getRuleContext(Date_writtenContext.class,0);
		}
		public Date_compiledContext date_compiled() {
			return getRuleContext(Date_compiledContext.class,0);
		}
		public SecurityContext security() {
			return getRuleContext(SecurityContext.class,0);
		}
		public Options_Context options_() {
			return getRuleContext(Options_Context.class,0);
		}
		public Empty_areaContext empty_area() {
			return getRuleContext(Empty_areaContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(cobolParser.LINE_COMMENT, 0); }
		public Identification_division_paragraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identification_division_paragraph; }
	}

	public final Identification_division_paragraphContext identification_division_paragraph() throws RecognitionException {
		Identification_division_paragraphContext _localctx = new Identification_division_paragraphContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identification_division_paragraph);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				program_id();
				}
				break;
			case AUTHOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				author();
				}
				break;
			case INSTALLATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				installation();
				}
				break;
			case DATE_WRITTEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				date_written();
				}
				break;
			case DATE_COMPILED:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				date_compiled();
				}
				break;
			case SECURITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				security();
				}
				break;
			case OPTIONS:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				options_();
				}
				break;
			case EMPTY_A:
			case WHITESPACE:
			case NEWLINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(158);
				empty_area();
				}
				break;
			case LINE_COMMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(159);
				match(LINE_COMMENT);
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

	public static class Program_idContext extends ParserRuleContext {
		public TerminalNode PROGRAM_ID() { return getToken(cobolParser.PROGRAM_ID, 0); }
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public Program_nameContext program_name() {
			return getRuleContext(Program_nameContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Is_programContext is_program() {
			return getRuleContext(Is_programContext.class,0);
		}
		public With_identContext with_ident() {
			return getRuleContext(With_identContext.class,0);
		}
		public Program_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_id; }
	}

	public final Program_idContext program_id() throws RecognitionException {
		Program_idContext _localctx = new Program_idContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_program_id);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(PROGRAM_ID);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(163);
				empty_area();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(DOT);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(170);
				empty_area();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			program_name();
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					empty_area();
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMON) | (1L << INITIAL) | (1L << IS))) != 0)) {
				{
				setState(183);
				is_program();
				}
			}

			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					empty_area();
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT || _la==WITH) {
				{
				setState(192);
				with_ident();
				}
			}

			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(195);
				empty_area();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
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

	public static class Program_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Program_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_name; }
	}

	public final Program_nameContext program_name() throws RecognitionException {
		Program_nameContext _localctx = new Program_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_program_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(USER_DEFINED_WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Is_programContext extends ParserRuleContext {
		public TerminalNode COMMON() { return getToken(cobolParser.COMMON, 0); }
		public TerminalNode INITIAL() { return getToken(cobolParser.INITIAL, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public TerminalNode PROGRAM() { return getToken(cobolParser.PROGRAM, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Is_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_program; }
	}

	public final Is_programContext is_program() throws RecognitionException {
		Is_programContext _localctx = new Is_programContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_is_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(205);
				match(IS);
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					empty_area();
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(213);
			_la = _input.LA(1);
			if ( !(_la==COMMON || _la==INITIAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(214);
					empty_area();
					}
					}
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(219);
				match(PROGRAM);
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

	public static class With_identContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(cobolParser.IDENT, 0); }
		public Ident_stringContext ident_string() {
			return getRuleContext(Ident_stringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(cobolParser.WITH, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public With_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_ident; }
	}

	public final With_identContext with_ident() throws RecognitionException {
		With_identContext _localctx = new With_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_with_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(223);
				match(WITH);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					empty_area();
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(231);
			match(IDENT);
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(232);
				empty_area();
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(237);
			ident_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ident_stringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(cobolParser.STRING_LITERAL, 0); }
		public Ident_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident_string; }
	}

	public final Ident_stringContext ident_string() throws RecognitionException {
		Ident_stringContext _localctx = new Ident_stringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ident_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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

	public static class Comment_entryContext extends ParserRuleContext {
		public TerminalNode EMPTY_A() { return getToken(cobolParser.EMPTY_A, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public Comment_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_entry; }
	}

	public final Comment_entryContext comment_entry() throws RecognitionException {
		Comment_entryContext _localctx = new Comment_entryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comment_entry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(EMPTY_A);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(242);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AuthorContext extends ParserRuleContext {
		public TerminalNode AUTHOR() { return getToken(cobolParser.AUTHOR, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Comment_entryContext> comment_entry() {
			return getRuleContexts(Comment_entryContext.class);
		}
		public Comment_entryContext comment_entry(int i) {
			return getRuleContext(Comment_entryContext.class,i);
		}
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_author);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(AUTHOR);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(251);
				empty_area();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(DOT);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(258);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(NEWLINE);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					comment_entry();
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstallationContext extends ParserRuleContext {
		public TerminalNode INSTALLATION() { return getToken(cobolParser.INSTALLATION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Comment_entryContext> comment_entry() {
			return getRuleContexts(Comment_entryContext.class);
		}
		public Comment_entryContext comment_entry(int i) {
			return getRuleContext(Comment_entryContext.class,i);
		}
		public InstallationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_installation; }
	}

	public final InstallationContext installation() throws RecognitionException {
		InstallationContext _localctx = new InstallationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_installation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(INSTALLATION);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(272);
				empty_area();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(DOT);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(279);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(NEWLINE);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					comment_entry();
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_writtenContext extends ParserRuleContext {
		public TerminalNode DATE_WRITTEN() { return getToken(cobolParser.DATE_WRITTEN, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Comment_entryContext> comment_entry() {
			return getRuleContexts(Comment_entryContext.class);
		}
		public Comment_entryContext comment_entry(int i) {
			return getRuleContext(Comment_entryContext.class,i);
		}
		public Date_writtenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_written; }
	}

	public final Date_writtenContext date_written() throws RecognitionException {
		Date_writtenContext _localctx = new Date_writtenContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_date_written);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(DATE_WRITTEN);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(293);
				empty_area();
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			match(DOT);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(300);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(NEWLINE);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					comment_entry();
					}
					} 
				}
				setState(312);
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

	public static class Date_compiledContext extends ParserRuleContext {
		public TerminalNode DATE_COMPILED() { return getToken(cobolParser.DATE_COMPILED, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Comment_entryContext> comment_entry() {
			return getRuleContexts(Comment_entryContext.class);
		}
		public Comment_entryContext comment_entry(int i) {
			return getRuleContext(Comment_entryContext.class,i);
		}
		public Date_compiledContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_compiled; }
	}

	public final Date_compiledContext date_compiled() throws RecognitionException {
		Date_compiledContext _localctx = new Date_compiledContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_date_compiled);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(DATE_COMPILED);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(314);
				empty_area();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			match(DOT);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(321);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(NEWLINE);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(328);
					comment_entry();
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecurityContext extends ParserRuleContext {
		public TerminalNode SECURITY() { return getToken(cobolParser.SECURITY, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(cobolParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(cobolParser.NEWLINE, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Comment_entryContext> comment_entry() {
			return getRuleContexts(Comment_entryContext.class);
		}
		public Comment_entryContext comment_entry(int i) {
			return getRuleContext(Comment_entryContext.class,i);
		}
		public SecurityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_security; }
	}

	public final SecurityContext security() throws RecognitionException {
		SecurityContext _localctx = new SecurityContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_security);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(SECURITY);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(335);
				empty_area();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			match(DOT);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE_COMMENT) | (1L << ALPHA) | (1L << ALPHABET) | (1L << ALSO) | (1L << ARE) | (1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ARITHMETIC) | (1L << ASCII) | (1L << AUTHOR) | (1L << C01) | (1L << CARD_READER) | (1L << CHARACTERS) | (1L << CLASS) | (1L << COLLATING) | (1L << COMMA) | (1L << COMMON) | (1L << CONFIGURATION) | (1L << CONSOLE) | (1L << CRT) | (1L << CURRENCY) | (1L << CURSOR) | (1L << DATE_COMPILED) | (1L << DATE_WRITTEN) | (1L << DEBUGGING) | (1L << DECIMAL_POINT) | (1L << DIVISION) | (1L << EBCDIC) | (1L << ENVIRONMENT) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE) | (1L << FILE_CONTROL) | (1L << I64) | (1L << IDENT) | (1L << IDENTIFICATION_DIVISION) | (1L << IN) | (1L << INITIAL) | (1L << INPUT_OUTPUT) | (1L << INSTALLATION) | (1L << IS) | (1L << I_O_CONTROL) | (1L << LINE_PRINTER) | (1L << MEMORY) | (1L << MODE) | (1L << MODULES) | (1L << NATIVE) | (1L << OBJECT_COMPUTER) | (1L << OFF) | (1L << ON) | (1L << OPTIONS) | (1L << PAPER_TAPE_PUNCH) | (1L << PAPER_TAPE_READER) | (1L << PICTURE) | (1L << PROGRAM) | (1L << PROGRAM_ID) | (1L << SECTION) | (1L << SECURITY) | (1L << SEGMENT_LIMIT) | (1L << SEQUENCE) | (1L << SIGN) | (1L << SIZE) | (1L << SOURCE_COMPUTER) | (1L << SPECIAL_NAMES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STANDARD - 64)) | (1L << (STANDARD_1 - 64)) | (1L << (STANDARD_2 - 64)) | (1L << (STATUS - 64)) | (1L << (SWITCH - 64)) | (1L << (SYMBOL - 64)) | (1L << (SYMBOLIC - 64)) | (1L << (SYSERR - 64)) | (1L << (SYSIN - 64)) | (1L << (SYSOUT - 64)) | (1L << (THROUGH - 64)) | (1L << (THRU - 64)) | (1L << (VAX - 64)) | (1L << (WITH - 64)) | (1L << (WORDS - 64)) | (1L << (DOWN_LINE - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (STAR - 64)) | (1L << (SLASH - 64)) | (1L << (COMMA_ - 64)) | (1L << (SEMI - 64)) | (1L << (COLON - 64)) | (1L << (EQUAL - 64)) | (1L << (LT - 64)) | (1L << (LE - 64)) | (1L << (GE - 64)) | (1L << (GT - 64)) | (1L << (LPAREN - 64)) | (1L << (RPAREN - 64)) | (1L << (LBRACK - 64)) | (1L << (RBRACK - 64)) | (1L << (POINTER - 64)) | (1L << (ATP - 64)) | (1L << (DOT - 64)) | (1L << (DOTDOT - 64)) | (1L << (LCURLY - 64)) | (1L << (RCURLY - 64)) | (1L << (STRING_LITERAL - 64)) | (1L << (NUMERIC_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (USER_DEFINED_WORD - 64)) | (1L << (EMPTY_A - 64)) | (1L << (WHITESPACE - 64)))) != 0)) {
				{
				{
				setState(342);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			match(NEWLINE);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(349);
					comment_entry();
					}
					} 
				}
				setState(354);
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

	public static class Options_Context extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(cobolParser.OPTIONS, 0); }
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public Options_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options_; }
	}

	public final Options_Context options_() throws RecognitionException {
		Options_Context _localctx = new Options_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_options_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(OPTIONS);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(356);
				empty_area();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(DOT);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(363);
					empty_area();
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARITHMETIC) {
				{
				setState(369);
				arithmetic();
				}
			}

			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(372);
					empty_area();
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(378);
				match(DOT);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode ARITHMETIC() { return getToken(cobolParser.ARITHMETIC, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public TerminalNode NATIVE() { return getToken(cobolParser.NATIVE, 0); }
		public TerminalNode STANDARD() { return getToken(cobolParser.STANDARD, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(ARITHMETIC);
			setState(383); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(382);
				empty_area();
				}
				}
				setState(385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(387);
				match(IS);
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(388);
					empty_area();
					}
					}
					setState(391); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(395);
			_la = _input.LA(1);
			if ( !(_la==NATIVE || _la==STANDARD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(396);
				empty_area();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
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

	public static class Environment_divisionContext extends ParserRuleContext {
		public TerminalNode ENVIRONMENT() { return getToken(cobolParser.ENVIRONMENT, 0); }
		public TerminalNode DIVISION() { return getToken(cobolParser.DIVISION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Configuration_sectionContext configuration_section() {
			return getRuleContext(Configuration_sectionContext.class,0);
		}
		public Input_output_sectionContext input_output_section() {
			return getRuleContext(Input_output_sectionContext.class,0);
		}
		public Environment_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environment_division; }
	}

	public final Environment_divisionContext environment_division() throws RecognitionException {
		Environment_divisionContext _localctx = new Environment_divisionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_environment_division);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(ENVIRONMENT);
			setState(406); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(405);
				empty_area();
				}
				}
				setState(408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(410);
			match(DIVISION);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(411);
				empty_area();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(DOT);
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(418);
					empty_area();
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONFIGURATION) {
				{
				setState(424);
				configuration_section();
				}
			}

			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INPUT_OUTPUT) {
				{
				setState(427);
				input_output_section();
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

	public static class Configuration_sectionContext extends ParserRuleContext {
		public TerminalNode CONFIGURATION() { return getToken(cobolParser.CONFIGURATION, 0); }
		public TerminalNode SECTION() { return getToken(cobolParser.SECTION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Source_computerContext source_computer() {
			return getRuleContext(Source_computerContext.class,0);
		}
		public Object_computerContext object_computer() {
			return getRuleContext(Object_computerContext.class,0);
		}
		public Special_namesContext special_names() {
			return getRuleContext(Special_namesContext.class,0);
		}
		public Configuration_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configuration_section; }
	}

	public final Configuration_sectionContext configuration_section() throws RecognitionException {
		Configuration_sectionContext _localctx = new Configuration_sectionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_configuration_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(CONFIGURATION);
			setState(432); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(431);
				empty_area();
				}
				}
				setState(434); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(436);
			match(SECTION);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(437);
				empty_area();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			match(DOT);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(444);
					empty_area();
					}
					} 
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SOURCE_COMPUTER) {
				{
				setState(450);
				source_computer();
				}
			}

			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(453);
					empty_area();
					}
					} 
				}
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OBJECT_COMPUTER) {
				{
				setState(459);
				object_computer();
				}
			}

			setState(465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(462);
					empty_area();
					}
					} 
				}
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPECIAL_NAMES) {
				{
				setState(468);
				special_names();
				}
			}

			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(471);
					empty_area();
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_output_sectionContext extends ParserRuleContext {
		public TerminalNode INPUT_OUTPUT() { return getToken(cobolParser.INPUT_OUTPUT, 0); }
		public TerminalNode SECTION() { return getToken(cobolParser.SECTION, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public File_controlContext file_control() {
			return getRuleContext(File_controlContext.class,0);
		}
		public I_o_controlContext i_o_control() {
			return getRuleContext(I_o_controlContext.class,0);
		}
		public Input_output_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_output_section; }
	}

	public final Input_output_sectionContext input_output_section() throws RecognitionException {
		Input_output_sectionContext _localctx = new Input_output_sectionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_input_output_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(INPUT_OUTPUT);
			setState(479); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(478);
				empty_area();
				}
				}
				setState(481); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(483);
			match(SECTION);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(484);
				empty_area();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(DOT);
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(491);
					empty_area();
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILE_CONTROL) {
				{
				setState(497);
				file_control();
				}
			}

			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==I_O_CONTROL) {
				{
				setState(500);
				i_o_control();
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

	public static class Source_computerContext extends ParserRuleContext {
		public TerminalNode SOURCE_COMPUTER() { return getToken(cobolParser.SOURCE_COMPUTER, 0); }
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Computer_typeContext computer_type() {
			return getRuleContext(Computer_typeContext.class,0);
		}
		public With_debuggingContext with_debugging() {
			return getRuleContext(With_debuggingContext.class,0);
		}
		public Source_computerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_computer; }
	}

	public final Source_computerContext source_computer() throws RecognitionException {
		Source_computerContext _localctx = new Source_computerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_source_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(SOURCE_COMPUTER);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(504);
				empty_area();
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
			match(DOT);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					empty_area();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(517);
				computer_type();
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(519); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(518);
						empty_area();
						}
						}
						setState(521); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(523);
					with_debugging();
					}
					break;
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
					{
					{
					setState(527);
					empty_area();
					}
					}
					setState(532);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(533);
				match(DOT);
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

	public static class Computer_typeContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(cobolParser.ALPHA, 0); }
		public TerminalNode I64() { return getToken(cobolParser.I64, 0); }
		public TerminalNode VAX() { return getToken(cobolParser.VAX, 0); }
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Computer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computer_type; }
	}

	public final Computer_typeContext computer_type() throws RecognitionException {
		Computer_typeContext _localctx = new Computer_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_computer_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_la = _input.LA(1);
			if ( !(_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) ) {
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

	public static class With_debuggingContext extends ParserRuleContext {
		public TerminalNode DEBUGGING() { return getToken(cobolParser.DEBUGGING, 0); }
		public TerminalNode MODE() { return getToken(cobolParser.MODE, 0); }
		public TerminalNode WITH() { return getToken(cobolParser.WITH, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public With_debuggingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_debugging; }
	}

	public final With_debuggingContext with_debugging() throws RecognitionException {
		With_debuggingContext _localctx = new With_debuggingContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_with_debugging);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(539);
				match(WITH);
				setState(541); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(540);
					empty_area();
					}
					}
					setState(543); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(547);
			match(DEBUGGING);
			setState(549); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(548);
				empty_area();
				}
				}
				setState(551); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(553);
			match(MODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object_computerContext extends ParserRuleContext {
		public TerminalNode OBJECT_COMPUTER() { return getToken(cobolParser.OBJECT_COMPUTER, 0); }
		public List<TerminalNode> DOT() { return getTokens(cobolParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(cobolParser.DOT, i);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Computer_typeContext computer_type() {
			return getRuleContext(Computer_typeContext.class,0);
		}
		public Memory_sizeContext memory_size() {
			return getRuleContext(Memory_sizeContext.class,0);
		}
		public Program_collatingContext program_collating() {
			return getRuleContext(Program_collatingContext.class,0);
		}
		public Segment_limitContext segment_limit() {
			return getRuleContext(Segment_limitContext.class,0);
		}
		public Object_computerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_computer; }
	}

	public final Object_computerContext object_computer() throws RecognitionException {
		Object_computerContext _localctx = new Object_computerContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_object_computer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(OBJECT_COMPUTER);
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(556);
				empty_area();
				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(562);
			match(DOT);
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					empty_area();
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA || _la==I64 || _la==VAX || _la==USER_DEFINED_WORD) {
				{
				setState(569);
				computer_type();
				setState(577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(571); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(570);
						empty_area();
						}
						}
						setState(573); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(575);
					memory_size();
					}
					break;
				}
				setState(586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(580); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(579);
						empty_area();
						}
						}
						setState(582); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(584);
					program_collating();
					}
					break;
				}
				setState(595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(589); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(588);
						empty_area();
						}
						}
						setState(591); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(593);
					segment_limit();
					}
					break;
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
					{
					{
					setState(597);
					empty_area();
					}
					}
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(603);
				match(DOT);
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

	public static class Memory_sizeContext extends ParserRuleContext {
		public TerminalNode MEMORY() { return getToken(cobolParser.MEMORY, 0); }
		public Memory_size_amountContext memory_size_amount() {
			return getRuleContext(Memory_size_amountContext.class,0);
		}
		public Memory_size_unitContext memory_size_unit() {
			return getRuleContext(Memory_size_unitContext.class,0);
		}
		public TerminalNode SIZE() { return getToken(cobolParser.SIZE, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Memory_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_size; }
	}

	public final Memory_sizeContext memory_size() throws RecognitionException {
		Memory_sizeContext _localctx = new Memory_sizeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_memory_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(MEMORY);
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(609); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(608);
					empty_area();
					}
					}
					setState(611); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(613);
				match(SIZE);
				}
				break;
			}
			setState(618); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(617);
				empty_area();
				}
				}
				setState(620); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(622);
			memory_size_amount();
			setState(624); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(623);
				empty_area();
				}
				}
				setState(626); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(628);
			memory_size_unit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Memory_size_amountContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Memory_size_amountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_size_amount; }
	}

	public final Memory_size_amountContext memory_size_amount() throws RecognitionException {
		Memory_size_amountContext _localctx = new Memory_size_amountContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_memory_size_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Memory_size_unitContext extends ParserRuleContext {
		public TerminalNode WORDS() { return getToken(cobolParser.WORDS, 0); }
		public TerminalNode CHARACTERS() { return getToken(cobolParser.CHARACTERS, 0); }
		public TerminalNode MODULES() { return getToken(cobolParser.MODULES, 0); }
		public Memory_size_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory_size_unit; }
	}

	public final Memory_size_unitContext memory_size_unit() throws RecognitionException {
		Memory_size_unitContext _localctx = new Memory_size_unitContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_memory_size_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( !(_la==CHARACTERS || _la==MODULES || _la==WORDS) ) {
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

	public static class Program_collatingContext extends ParserRuleContext {
		public TerminalNode SEQUENCE() { return getToken(cobolParser.SEQUENCE, 0); }
		public Alpha_nameContext alpha_name() {
			return getRuleContext(Alpha_nameContext.class,0);
		}
		public TerminalNode PROGRAM() { return getToken(cobolParser.PROGRAM, 0); }
		public TerminalNode COLLATING() { return getToken(cobolParser.COLLATING, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Program_collatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_collating; }
	}

	public final Program_collatingContext program_collating() throws RecognitionException {
		Program_collatingContext _localctx = new Program_collatingContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_program_collating);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(634);
				match(PROGRAM);
				setState(636); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(635);
					empty_area();
					}
					}
					setState(638); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATING) {
				{
				setState(642);
				match(COLLATING);
				setState(644); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(643);
					empty_area();
					}
					}
					setState(646); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(650);
			match(SEQUENCE);
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(652); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(651);
					empty_area();
					}
					}
					setState(654); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(656);
				match(IS);
				}
				break;
			}
			setState(661); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(660);
				empty_area();
				}
				}
				setState(663); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(665);
			alpha_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alpha_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Alpha_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha_name; }
	}

	public final Alpha_nameContext alpha_name() throws RecognitionException {
		Alpha_nameContext _localctx = new Alpha_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_alpha_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(USER_DEFINED_WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Segment_limitContext extends ParserRuleContext {
		public TerminalNode SEGMENT_LIMIT() { return getToken(cobolParser.SEGMENT_LIMIT, 0); }
		public Segment_numberContext segment_number() {
			return getRuleContext(Segment_numberContext.class,0);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Segment_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_limit; }
	}

	public final Segment_limitContext segment_limit() throws RecognitionException {
		Segment_limitContext _localctx = new Segment_limitContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_segment_limit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(SEGMENT_LIMIT);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				setState(671); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(670);
					empty_area();
					}
					}
					setState(673); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(675);
				match(IS);
				}
			}

			setState(679);
			segment_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Segment_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Segment_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment_number; }
	}

	public final Segment_numberContext segment_number() throws RecognitionException {
		Segment_numberContext _localctx = new Segment_numberContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_segment_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_namesContext extends ParserRuleContext {
		public TerminalNode SPECIAL_NAMES() { return getToken(cobolParser.SPECIAL_NAMES, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public List<Predefined_deviceContext> predefined_device() {
			return getRuleContexts(Predefined_deviceContext.class);
		}
		public Predefined_deviceContext predefined_device(int i) {
			return getRuleContext(Predefined_deviceContext.class,i);
		}
		public List<Device_nameContext> device_name() {
			return getRuleContexts(Device_nameContext.class);
		}
		public Device_nameContext device_name(int i) {
			return getRuleContext(Device_nameContext.class,i);
		}
		public List<Arg_envContext> arg_env() {
			return getRuleContexts(Arg_envContext.class);
		}
		public Arg_envContext arg_env(int i) {
			return getRuleContext(Arg_envContext.class,i);
		}
		public List<Arg_env_nameContext> arg_env_name() {
			return getRuleContexts(Arg_env_nameContext.class);
		}
		public Arg_env_nameContext arg_env_name(int i) {
			return getRuleContext(Arg_env_nameContext.class,i);
		}
		public TerminalNode C01() { return getToken(cobolParser.C01, 0); }
		public Top_of_page_nameContext top_of_page_name() {
			return getRuleContext(Top_of_page_nameContext.class,0);
		}
		public Switch_Context switch_() {
			return getRuleContext(Switch_Context.class,0);
		}
		public List<TerminalNode> IS() { return getTokens(cobolParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(cobolParser.IS, i);
		}
		public Special_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_names; }
	}

	public final Special_namesContext special_names() throws RecognitionException {
		Special_namesContext _localctx = new Special_namesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_special_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(SPECIAL_NAMES);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(684);
				empty_area();
				}
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(690);
			match(DOT);
			setState(694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(691);
					empty_area();
					}
					} 
				}
				setState(696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (CARD_READER - 12)) | (1L << (CONSOLE - 12)) | (1L << (LINE_PRINTER - 12)) | (1L << (PAPER_TAPE_PUNCH - 12)) | (1L << (PAPER_TAPE_READER - 12)) | (1L << (SYSERR - 12)) | (1L << (SYSIN - 12)) | (1L << (SYSOUT - 12)))) != 0)) {
				{
				{
				setState(697);
				predefined_device();
				setState(699); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(698);
					empty_area();
					}
					}
					setState(701); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(703);
					match(IS);
					setState(705); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(704);
						empty_area();
						}
						}
						setState(707); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					}
				}

				setState(711);
				device_name();
				setState(715);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(712);
						empty_area();
						}
						} 
					}
					setState(717);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				}
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE))) != 0)) {
				{
				{
				setState(723);
				arg_env();
				setState(725); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(724);
					empty_area();
					}
					}
					setState(727); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(729);
					match(IS);
					setState(731); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(730);
						empty_area();
						}
						}
						setState(733); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					}
				}

				setState(737);
				arg_env_name();
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(738);
						empty_area();
						}
						} 
					}
					setState(743);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==C01) {
				{
				setState(749);
				match(C01);
				setState(751); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(750);
					empty_area();
					}
					}
					setState(753); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IS) {
					{
					setState(755);
					match(IS);
					setState(757); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(756);
						empty_area();
						}
						}
						setState(759); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					}
				}

				setState(763);
				top_of_page_name();
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(764);
						empty_area();
						}
						} 
					}
					setState(769);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				}
			}

			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SWITCH) {
				{
				setState(772);
				switch_();
				setState(776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(773);
						empty_area();
						}
						} 
					}
					setState(778);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
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

	public static class Switch_Context extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(cobolParser.SWITCH, 0); }
		public Switch_numContext switch_num() {
			return getRuleContext(Switch_numContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public Switch_nameContext switch_name() {
			return getRuleContext(Switch_nameContext.class,0);
		}
		public Switch_clause_onContext switch_clause_on() {
			return getRuleContext(Switch_clause_onContext.class,0);
		}
		public Switch_clause_offContext switch_clause_off() {
			return getRuleContext(Switch_clause_offContext.class,0);
		}
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Switch_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_; }
	}

	public final Switch_Context switch_() throws RecognitionException {
		Switch_Context _localctx = new Switch_Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_switch_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(SWITCH);
			setState(783); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(782);
				empty_area();
				}
				}
				setState(785); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(787);
			switch_num();
			setState(791);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(788);
					empty_area();
					}
					} 
				}
				setState(793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				{
				setState(794);
				match(IS);
				setState(796); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(795);
					empty_area();
					}
					}
					setState(798); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
				setState(800);
				switch_name();
				setState(802); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(801);
						empty_area();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(804); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				{
				setState(808);
				switch_clause_on();
				setState(816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(810); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(809);
						empty_area();
						}
						}
						setState(812); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(814);
					switch_clause_off();
					}
					break;
				}
				}
				break;
			case OFF:
				{
				setState(818);
				switch_clause_off();
				setState(826);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(820); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(819);
						empty_area();
						}
						}
						setState(822); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
					setState(824);
					switch_clause_on();
					}
					break;
				}
				}
				break;
			case EOF:
			case LINE_COMMENT:
			case IDENTIFICATION_DIVISION:
			case INPUT_OUTPUT:
			case EMPTY_A:
			case WHITESPACE:
			case NEWLINE:
				break;
			default:
				break;
			}
			setState(833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(830);
					empty_area();
					}
					} 
				}
				setState(835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_clause_onContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(cobolParser.ON, 0); }
		public Cond_nameContext cond_name() {
			return getRuleContext(Cond_nameContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public TerminalNode STATUS() { return getToken(cobolParser.STATUS, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Switch_clause_onContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_clause_on; }
	}

	public final Switch_clause_onContext switch_clause_on() throws RecognitionException {
		Switch_clause_onContext _localctx = new Switch_clause_onContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_switch_clause_on);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(ON);
			setState(838); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(837);
				empty_area();
				}
				}
				setState(840); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(842);
				match(STATUS);
				setState(844); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(843);
					empty_area();
					}
					}
					setState(846); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(850);
				match(IS);
				setState(852); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(851);
					empty_area();
					}
					}
					setState(854); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(858);
			cond_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_clause_offContext extends ParserRuleContext {
		public TerminalNode OFF() { return getToken(cobolParser.OFF, 0); }
		public Cond_nameContext cond_name() {
			return getRuleContext(Cond_nameContext.class,0);
		}
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public TerminalNode STATUS() { return getToken(cobolParser.STATUS, 0); }
		public TerminalNode IS() { return getToken(cobolParser.IS, 0); }
		public Switch_clause_offContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_clause_off; }
	}

	public final Switch_clause_offContext switch_clause_off() throws RecognitionException {
		Switch_clause_offContext _localctx = new Switch_clause_offContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_switch_clause_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(OFF);
			setState(862); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(861);
				empty_area();
				}
				}
				setState(864); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATUS) {
				{
				setState(866);
				match(STATUS);
				setState(868); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(867);
					empty_area();
					}
					}
					setState(870); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IS) {
				{
				setState(874);
				match(IS);
				setState(876); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(875);
					empty_area();
					}
					}
					setState(878); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0) );
				}
			}

			setState(882);
			cond_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Cond_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_name; }
	}

	public final Cond_nameContext cond_name() throws RecognitionException {
		Cond_nameContext _localctx = new Cond_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cond_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(USER_DEFINED_WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Switch_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_name; }
	}

	public final Switch_nameContext switch_name() throws RecognitionException {
		Switch_nameContext _localctx = new Switch_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_switch_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(USER_DEFINED_WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_numContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(cobolParser.NUMERIC_LITERAL, 0); }
		public Switch_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_num; }
	}

	public final Switch_numContext switch_num() throws RecognitionException {
		Switch_numContext _localctx = new Switch_numContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_switch_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Top_of_page_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Top_of_page_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_of_page_name; }
	}

	public final Top_of_page_nameContext top_of_page_name() throws RecognitionException {
		Top_of_page_nameContext _localctx = new Top_of_page_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_top_of_page_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(USER_DEFINED_WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Predefined_deviceContext extends ParserRuleContext {
		public TerminalNode CARD_READER() { return getToken(cobolParser.CARD_READER, 0); }
		public TerminalNode PAPER_TAPE_READER() { return getToken(cobolParser.PAPER_TAPE_READER, 0); }
		public TerminalNode CONSOLE() { return getToken(cobolParser.CONSOLE, 0); }
		public TerminalNode LINE_PRINTER() { return getToken(cobolParser.LINE_PRINTER, 0); }
		public TerminalNode PAPER_TAPE_PUNCH() { return getToken(cobolParser.PAPER_TAPE_PUNCH, 0); }
		public TerminalNode SYSIN() { return getToken(cobolParser.SYSIN, 0); }
		public TerminalNode SYSOUT() { return getToken(cobolParser.SYSOUT, 0); }
		public TerminalNode SYSERR() { return getToken(cobolParser.SYSERR, 0); }
		public Predefined_deviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefined_device; }
	}

	public final Predefined_deviceContext predefined_device() throws RecognitionException {
		Predefined_deviceContext _localctx = new Predefined_deviceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_predefined_device);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_la = _input.LA(1);
			if ( !(((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (CARD_READER - 12)) | (1L << (CONSOLE - 12)) | (1L << (LINE_PRINTER - 12)) | (1L << (PAPER_TAPE_PUNCH - 12)) | (1L << (PAPER_TAPE_READER - 12)) | (1L << (SYSERR - 12)) | (1L << (SYSIN - 12)) | (1L << (SYSOUT - 12)))) != 0)) ) {
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

	public static class Device_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Device_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_device_name; }
	}

	public final Device_nameContext device_name() throws RecognitionException {
		Device_nameContext _localctx = new Device_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_device_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(USER_DEFINED_WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_envContext extends ParserRuleContext {
		public TerminalNode ARGUMENT_NUMBER() { return getToken(cobolParser.ARGUMENT_NUMBER, 0); }
		public TerminalNode ARGUMENT_VALUE() { return getToken(cobolParser.ARGUMENT_VALUE, 0); }
		public TerminalNode ENVIRONMENT_NAME() { return getToken(cobolParser.ENVIRONMENT_NAME, 0); }
		public TerminalNode ENVIRONMENT_VALUE() { return getToken(cobolParser.ENVIRONMENT_VALUE, 0); }
		public Arg_envContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_env; }
	}

	public final Arg_envContext arg_env() throws RecognitionException {
		Arg_envContext _localctx = new Arg_envContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_arg_env);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGUMENT_NUMBER) | (1L << ARGUMENT_VALUE) | (1L << ENVIRONMENT_NAME) | (1L << ENVIRONMENT_VALUE))) != 0)) ) {
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

	public static class Arg_env_nameContext extends ParserRuleContext {
		public TerminalNode USER_DEFINED_WORD() { return getToken(cobolParser.USER_DEFINED_WORD, 0); }
		public Arg_env_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_env_name; }
	}

	public final Arg_env_nameContext arg_env_name() throws RecognitionException {
		Arg_env_nameContext _localctx = new Arg_env_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arg_env_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(USER_DEFINED_WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_controlContext extends ParserRuleContext {
		public TerminalNode FILE_CONTROL() { return getToken(cobolParser.FILE_CONTROL, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public File_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_control; }
	}

	public final File_controlContext file_control() throws RecognitionException {
		File_controlContext _localctx = new File_controlContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_file_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(FILE_CONTROL);
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(901);
				empty_area();
				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(907);
			match(DOT);
			setState(911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(908);
					empty_area();
					}
					} 
				}
				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class I_o_controlContext extends ParserRuleContext {
		public TerminalNode I_O_CONTROL() { return getToken(cobolParser.I_O_CONTROL, 0); }
		public TerminalNode DOT() { return getToken(cobolParser.DOT, 0); }
		public List<Empty_areaContext> empty_area() {
			return getRuleContexts(Empty_areaContext.class);
		}
		public Empty_areaContext empty_area(int i) {
			return getRuleContext(Empty_areaContext.class,i);
		}
		public I_o_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i_o_control; }
	}

	public final I_o_controlContext i_o_control() throws RecognitionException {
		I_o_controlContext _localctx = new I_o_controlContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_i_o_control);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(I_O_CONTROL);
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (EMPTY_A - 106)) | (1L << (WHITESPACE - 106)) | (1L << (NEWLINE - 106)))) != 0)) {
				{
				{
				setState(915);
				empty_area();
				}
				}
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(921);
			match(DOT);
			setState(925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(922);
					empty_area();
					}
					} 
				}
				setState(927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3n\u03a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\3\2\3\3\6\3h\n"+
		"\3\r\3\16\3i\3\3\6\3m\n\3\r\3\16\3n\3\3\6\3r\n\3\r\3\16\3s\5\3v\n\3\3"+
		"\4\3\4\5\4z\n\4\3\4\3\4\5\4~\n\4\3\5\3\5\6\5\u0082\n\5\r\5\16\5\u0083"+
		"\3\5\3\5\7\5\u0088\n\5\f\5\16\5\u008b\13\5\3\5\3\5\7\5\u008f\n\5\f\5\16"+
		"\5\u0092\13\5\3\5\7\5\u0095\n\5\f\5\16\5\u0098\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u00a3\n\6\3\7\3\7\7\7\u00a7\n\7\f\7\16\7\u00aa"+
		"\13\7\3\7\3\7\7\7\u00ae\n\7\f\7\16\7\u00b1\13\7\3\7\3\7\7\7\u00b5\n\7"+
		"\f\7\16\7\u00b8\13\7\3\7\5\7\u00bb\n\7\3\7\7\7\u00be\n\7\f\7\16\7\u00c1"+
		"\13\7\3\7\5\7\u00c4\n\7\3\7\7\7\u00c7\n\7\f\7\16\7\u00ca\13\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\6\t\u00d2\n\t\r\t\16\t\u00d3\5\t\u00d6\n\t\3\t\3\t\6"+
		"\t\u00da\n\t\r\t\16\t\u00db\3\t\3\t\5\t\u00e0\n\t\3\n\3\n\6\n\u00e4\n"+
		"\n\r\n\16\n\u00e5\5\n\u00e8\n\n\3\n\3\n\6\n\u00ec\n\n\r\n\16\n\u00ed\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\7\f\u00f6\n\f\f\f\16\f\u00f9\13\f\3\f\3\f\3\r"+
		"\3\r\7\r\u00ff\n\r\f\r\16\r\u0102\13\r\3\r\3\r\7\r\u0106\n\r\f\r\16\r"+
		"\u0109\13\r\3\r\3\r\7\r\u010d\n\r\f\r\16\r\u0110\13\r\3\16\3\16\7\16\u0114"+
		"\n\16\f\16\16\16\u0117\13\16\3\16\3\16\7\16\u011b\n\16\f\16\16\16\u011e"+
		"\13\16\3\16\3\16\7\16\u0122\n\16\f\16\16\16\u0125\13\16\3\17\3\17\7\17"+
		"\u0129\n\17\f\17\16\17\u012c\13\17\3\17\3\17\7\17\u0130\n\17\f\17\16\17"+
		"\u0133\13\17\3\17\3\17\7\17\u0137\n\17\f\17\16\17\u013a\13\17\3\20\3\20"+
		"\7\20\u013e\n\20\f\20\16\20\u0141\13\20\3\20\3\20\7\20\u0145\n\20\f\20"+
		"\16\20\u0148\13\20\3\20\3\20\7\20\u014c\n\20\f\20\16\20\u014f\13\20\3"+
		"\21\3\21\7\21\u0153\n\21\f\21\16\21\u0156\13\21\3\21\3\21\7\21\u015a\n"+
		"\21\f\21\16\21\u015d\13\21\3\21\3\21\7\21\u0161\n\21\f\21\16\21\u0164"+
		"\13\21\3\22\3\22\7\22\u0168\n\22\f\22\16\22\u016b\13\22\3\22\3\22\7\22"+
		"\u016f\n\22\f\22\16\22\u0172\13\22\3\22\5\22\u0175\n\22\3\22\7\22\u0178"+
		"\n\22\f\22\16\22\u017b\13\22\3\22\5\22\u017e\n\22\3\23\3\23\6\23\u0182"+
		"\n\23\r\23\16\23\u0183\3\23\3\23\6\23\u0188\n\23\r\23\16\23\u0189\5\23"+
		"\u018c\n\23\3\23\3\23\7\23\u0190\n\23\f\23\16\23\u0193\13\23\3\23\3\23"+
		"\3\24\3\24\6\24\u0199\n\24\r\24\16\24\u019a\3\24\3\24\7\24\u019f\n\24"+
		"\f\24\16\24\u01a2\13\24\3\24\3\24\7\24\u01a6\n\24\f\24\16\24\u01a9\13"+
		"\24\3\24\5\24\u01ac\n\24\3\24\5\24\u01af\n\24\3\25\3\25\6\25\u01b3\n\25"+
		"\r\25\16\25\u01b4\3\25\3\25\7\25\u01b9\n\25\f\25\16\25\u01bc\13\25\3\25"+
		"\3\25\7\25\u01c0\n\25\f\25\16\25\u01c3\13\25\3\25\5\25\u01c6\n\25\3\25"+
		"\7\25\u01c9\n\25\f\25\16\25\u01cc\13\25\3\25\5\25\u01cf\n\25\3\25\7\25"+
		"\u01d2\n\25\f\25\16\25\u01d5\13\25\3\25\5\25\u01d8\n\25\3\25\7\25\u01db"+
		"\n\25\f\25\16\25\u01de\13\25\3\26\3\26\6\26\u01e2\n\26\r\26\16\26\u01e3"+
		"\3\26\3\26\7\26\u01e8\n\26\f\26\16\26\u01eb\13\26\3\26\3\26\7\26\u01ef"+
		"\n\26\f\26\16\26\u01f2\13\26\3\26\5\26\u01f5\n\26\3\26\5\26\u01f8\n\26"+
		"\3\27\3\27\7\27\u01fc\n\27\f\27\16\27\u01ff\13\27\3\27\3\27\7\27\u0203"+
		"\n\27\f\27\16\27\u0206\13\27\3\27\3\27\6\27\u020a\n\27\r\27\16\27\u020b"+
		"\3\27\3\27\5\27\u0210\n\27\3\27\7\27\u0213\n\27\f\27\16\27\u0216\13\27"+
		"\3\27\3\27\5\27\u021a\n\27\3\30\3\30\3\31\3\31\6\31\u0220\n\31\r\31\16"+
		"\31\u0221\5\31\u0224\n\31\3\31\3\31\6\31\u0228\n\31\r\31\16\31\u0229\3"+
		"\31\3\31\3\32\3\32\7\32\u0230\n\32\f\32\16\32\u0233\13\32\3\32\3\32\7"+
		"\32\u0237\n\32\f\32\16\32\u023a\13\32\3\32\3\32\6\32\u023e\n\32\r\32\16"+
		"\32\u023f\3\32\3\32\5\32\u0244\n\32\3\32\6\32\u0247\n\32\r\32\16\32\u0248"+
		"\3\32\3\32\5\32\u024d\n\32\3\32\6\32\u0250\n\32\r\32\16\32\u0251\3\32"+
		"\3\32\5\32\u0256\n\32\3\32\7\32\u0259\n\32\f\32\16\32\u025c\13\32\3\32"+
		"\3\32\5\32\u0260\n\32\3\33\3\33\6\33\u0264\n\33\r\33\16\33\u0265\3\33"+
		"\3\33\5\33\u026a\n\33\3\33\6\33\u026d\n\33\r\33\16\33\u026e\3\33\3\33"+
		"\6\33\u0273\n\33\r\33\16\33\u0274\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\6\36\u027f\n\36\r\36\16\36\u0280\5\36\u0283\n\36\3\36\3\36\6\36\u0287"+
		"\n\36\r\36\16\36\u0288\5\36\u028b\n\36\3\36\3\36\6\36\u028f\n\36\r\36"+
		"\16\36\u0290\3\36\3\36\5\36\u0295\n\36\3\36\6\36\u0298\n\36\r\36\16\36"+
		"\u0299\3\36\3\36\3\37\3\37\3 \3 \6 \u02a2\n \r \16 \u02a3\3 \3 \5 \u02a8"+
		"\n \3 \3 \3!\3!\3\"\3\"\7\"\u02b0\n\"\f\"\16\"\u02b3\13\"\3\"\3\"\7\""+
		"\u02b7\n\"\f\"\16\"\u02ba\13\"\3\"\3\"\6\"\u02be\n\"\r\"\16\"\u02bf\3"+
		"\"\3\"\6\"\u02c4\n\"\r\"\16\"\u02c5\5\"\u02c8\n\"\3\"\3\"\7\"\u02cc\n"+
		"\"\f\"\16\"\u02cf\13\"\7\"\u02d1\n\"\f\"\16\"\u02d4\13\"\3\"\3\"\6\"\u02d8"+
		"\n\"\r\"\16\"\u02d9\3\"\3\"\6\"\u02de\n\"\r\"\16\"\u02df\5\"\u02e2\n\""+
		"\3\"\3\"\7\"\u02e6\n\"\f\"\16\"\u02e9\13\"\7\"\u02eb\n\"\f\"\16\"\u02ee"+
		"\13\"\3\"\3\"\6\"\u02f2\n\"\r\"\16\"\u02f3\3\"\3\"\6\"\u02f8\n\"\r\"\16"+
		"\"\u02f9\5\"\u02fc\n\"\3\"\3\"\7\"\u0300\n\"\f\"\16\"\u0303\13\"\5\"\u0305"+
		"\n\"\3\"\3\"\7\"\u0309\n\"\f\"\16\"\u030c\13\"\5\"\u030e\n\"\3#\3#\6#"+
		"\u0312\n#\r#\16#\u0313\3#\3#\7#\u0318\n#\f#\16#\u031b\13#\3#\3#\6#\u031f"+
		"\n#\r#\16#\u0320\3#\3#\6#\u0325\n#\r#\16#\u0326\5#\u0329\n#\3#\3#\6#\u032d"+
		"\n#\r#\16#\u032e\3#\3#\5#\u0333\n#\3#\3#\6#\u0337\n#\r#\16#\u0338\3#\3"+
		"#\5#\u033d\n#\5#\u033f\n#\3#\7#\u0342\n#\f#\16#\u0345\13#\3$\3$\6$\u0349"+
		"\n$\r$\16$\u034a\3$\3$\6$\u034f\n$\r$\16$\u0350\5$\u0353\n$\3$\3$\6$\u0357"+
		"\n$\r$\16$\u0358\5$\u035b\n$\3$\3$\3%\3%\6%\u0361\n%\r%\16%\u0362\3%\3"+
		"%\6%\u0367\n%\r%\16%\u0368\5%\u036b\n%\3%\3%\6%\u036f\n%\r%\16%\u0370"+
		"\5%\u0373\n%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\7.\u0389\n.\f.\16.\u038c\13.\3.\3.\7.\u0390\n.\f.\16.\u0393\13.\3"+
		"/\3/\7/\u0397\n/\f/\16/\u039a\13/\3/\3/\7/\u039e\n/\f/\16/\u03a1\13/\3"+
		"/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\\2\t\4\2\23\23\'\'\3\2nn\4\2\60\60BB\6\2\4\4##NNkk"+
		"\5\2\17\17//PP\7\2\16\16\25\25,,\65\66IK\4\2\b\t !\2\u0410\2a\3\2\2\2"+
		"\4u\3\2\2\2\6}\3\2\2\2\b\177\3\2\2\2\n\u00a2\3\2\2\2\f\u00a4\3\2\2\2\16"+
		"\u00cd\3\2\2\2\20\u00d5\3\2\2\2\22\u00e7\3\2\2\2\24\u00f1\3\2\2\2\26\u00f3"+
		"\3\2\2\2\30\u00fc\3\2\2\2\32\u0111\3\2\2\2\34\u0126\3\2\2\2\36\u013b\3"+
		"\2\2\2 \u0150\3\2\2\2\"\u0165\3\2\2\2$\u017f\3\2\2\2&\u0196\3\2\2\2(\u01b0"+
		"\3\2\2\2*\u01df\3\2\2\2,\u01f9\3\2\2\2.\u021b\3\2\2\2\60\u0223\3\2\2\2"+
		"\62\u022d\3\2\2\2\64\u0261\3\2\2\2\66\u0278\3\2\2\28\u027a\3\2\2\2:\u0282"+
		"\3\2\2\2<\u029d\3\2\2\2>\u029f\3\2\2\2@\u02ab\3\2\2\2B\u02ad\3\2\2\2D"+
		"\u030f\3\2\2\2F\u0346\3\2\2\2H\u035e\3\2\2\2J\u0376\3\2\2\2L\u0378\3\2"+
		"\2\2N\u037a\3\2\2\2P\u037c\3\2\2\2R\u037e\3\2\2\2T\u0380\3\2\2\2V\u0382"+
		"\3\2\2\2X\u0384\3\2\2\2Z\u0386\3\2\2\2\\\u0394\3\2\2\2^`\5\6\4\2_^\3\2"+
		"\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\2\2\3e\3\3"+
		"\2\2\2fh\7m\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jv\3\2\2\2km\7"+
		"n\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2ov\3\2\2\2pr\7l\2\2qp\3\2"+
		"\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2ug\3\2\2\2ul\3\2\2\2uq\3\2"+
		"\2\2v\5\3\2\2\2wy\5\b\5\2xz\5&\24\2yx\3\2\2\2yz\3\2\2\2z~\3\2\2\2{~\5"+
		"\4\3\2|~\7\3\2\2}w\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\7\3\2\2\2\177\u0081\7"+
		"%\2\2\u0080\u0082\5\4\3\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0089\7\35"+
		"\2\2\u0086\u0088\5\4\3\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u0090\7d\2\2\u008d\u008f\5\4\3\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0096\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0095\5\n\6\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\t\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0099\u00a3\5\f\7\2\u009a\u00a3\5\30\r\2\u009b\u00a3"+
		"\5\32\16\2\u009c\u00a3\5\34\17\2\u009d\u00a3\5\36\20\2\u009e\u00a3\5 "+
		"\21\2\u009f\u00a3\5\"\22\2\u00a0\u00a3\5\4\3\2\u00a1\u00a3\7\3\2\2\u00a2"+
		"\u0099\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009c\3\2"+
		"\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a8\79\2\2"+
		"\u00a5\u00a7\5\4\3\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00af\7d\2\2\u00ac\u00ae\5\4\3\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b6\5\16\b\2\u00b3\u00b5\5\4\3\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\5\20\t\2\u00ba\u00b9\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bf\3\2\2\2\u00bc\u00be\5\4\3\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\5\22\n\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c7\5\4"+
		"\3\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\7d"+
		"\2\2\u00cc\r\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\17\3\2\2\2\u00cf\u00d1\7"+
		"*\2\2\u00d0\u00d2\5\4\3\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00cf\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00df\t\2\2\2\u00d8"+
		"\u00da\5\4\3\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\78\2\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\21\3\2\2"+
		"\2\u00e1\u00e3\7O\2\2\u00e2\u00e4\5\4\3\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e1\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\7$"+
		"\2\2\u00ea\u00ec\5\4\3\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\5\24"+
		"\13\2\u00f0\23\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\25\3\2\2\2\u00f3\u00f7"+
		"\7l\2\2\u00f4\u00f6\n\3\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fb\7n\2\2\u00fb\27\3\2\2\2\u00fc\u0100\7\f\2\2\u00fd\u00ff"+
		"\5\4\3\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0107\7d"+
		"\2\2\u0104\u0106\n\3\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u010e\7n\2\2\u010b\u010d\5\26\f\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\31\3\2\2"+
		"\2\u0110\u010e\3\2\2\2\u0111\u0115\7)\2\2\u0112\u0114\5\4\3\2\u0113\u0112"+
		"\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011c\7d\2\2\u0119\u011b\n\3"+
		"\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0123\7n"+
		"\2\2\u0120\u0122\5\26\f\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\33\3\2\2\2\u0125\u0123\3\2\2"+
		"\2\u0126\u012a\7\32\2\2\u0127\u0129\5\4\3\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012d\u0131\7d\2\2\u012e\u0130\n\3\2\2\u012f"+
		"\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0138\7n\2\2\u0135"+
		"\u0137\5\26\f\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\35\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013f\7\31\2\2\u013c\u013e\5\4\3\2\u013d\u013c\3\2\2\2\u013e\u0141\3"+
		"\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0146\7d\2\2\u0143\u0145\n\3\2\2\u0144\u0143\3\2"+
		"\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014d\7n\2\2\u014a\u014c\5\26"+
		"\f\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\37\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0154\7;\2\2"+
		"\u0151\u0153\5\4\3\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u015b\7d\2\2\u0158\u015a\n\3\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u0162\7n\2\2\u015f\u0161\5\26\f\2\u0160\u015f\3\2"+
		"\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"!\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0169\7\64\2\2\u0166\u0168\5\4\3\2"+
		"\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0170\7d\2\2\u016d"+
		"\u016f\5\4\3\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0175\5$\23\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0179\3\2"+
		"\2\2\u0176\u0178\5\4\3\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017c\u017e\7d\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"#\3\2\2\2\u017f\u0181\7\n\2\2\u0180\u0182\5\4\3\2\u0181\u0180\3\2\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u018b"+
		"\3\2\2\2\u0185\u0187\7*\2\2\u0186\u0188\5\4\3\2\u0187\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u0185\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u0191\t\4\2\2\u018e\u0190\5\4\3\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2"+
		"\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0194\u0195\7d\2\2\u0195%\3\2\2\2\u0196\u0198\7\37\2\2"+
		"\u0197\u0199\5\4\3\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01a0\7\35\2\2"+
		"\u019d\u019f\5\4\3\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a7\7d\2\2\u01a4\u01a6\5\4\3\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\u01ac\5(\25\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01af\5*\26\2\u01ae\u01ad\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\'\3\2\2\2\u01b0\u01b2\7\24\2\2\u01b1\u01b3\5\4\3"+
		"\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5"+
		"\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01ba\7:\2\2\u01b7\u01b9\5\4\3\2\u01b8"+
		"\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01c1\7d\2\2\u01be"+
		"\u01c0\5\4\3\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01c6\5,\27\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01ca\3\2"+
		"\2\2\u01c7\u01c9\5\4\3\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2"+
		"\2\2\u01cd\u01cf\5\62\32\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d3\3\2\2\2\u01d0\u01d2\5\4\3\2\u01d1\u01d0\3\2\2\2\u01d2\u01d5\3\2"+
		"\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d6\u01d8\5B\"\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2"+
		"\2\2\u01d8\u01dc\3\2\2\2\u01d9\u01db\5\4\3\2\u01da\u01d9\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd)\3\2\2\2"+
		"\u01de\u01dc\3\2\2\2\u01df\u01e1\7(\2\2\u01e0\u01e2\5\4\3\2\u01e1\u01e0"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01e9\7:\2\2\u01e6\u01e8\5\4\3\2\u01e7\u01e6\3\2"+
		"\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u01ec\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01f0\7d\2\2\u01ed\u01ef\5\4"+
		"\3\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f5\5Z"+
		".\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6"+
		"\u01f8\5\\/\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8+\3\2\2\2\u01f9"+
		"\u01fd\7@\2\2\u01fa\u01fc\5\4\3\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2"+
		"\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u0200\u0204\7d\2\2\u0201\u0203\5\4\3\2\u0202\u0201\3\2"+
		"\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0219\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u020f\5.\30\2\u0208\u020a\5\4"+
		"\3\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\5\60\31\2\u020e\u0210\3"+
		"\2\2\2\u020f\u0209\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0214\3\2\2\2\u0211"+
		"\u0213\5\4\3\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217"+
		"\u0218\7d\2\2\u0218\u021a\3\2\2\2\u0219\u0207\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a-\3\2\2\2\u021b\u021c\t\5\2\2\u021c/\3\2\2\2\u021d\u021f\7O"+
		"\2\2\u021e\u0220\5\4\3\2\u021f\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0224\3\2\2\2\u0223\u021d\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\7\33\2\2\u0226"+
		"\u0228\5\4\3\2\u0227\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\7.\2\2\u022c"+
		"\61\3\2\2\2\u022d\u0231\7\61\2\2\u022e\u0230\5\4\3\2\u022f\u022e\3\2\2"+
		"\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234"+
		"\3\2\2\2\u0233\u0231\3\2\2\2\u0234\u0238\7d\2\2\u0235\u0237\5\4\3\2\u0236"+
		"\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239\u025f\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u0243\5.\30\2\u023c"+
		"\u023e\5\4\3\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\5\64\33\2\u0242"+
		"\u0244\3\2\2\2\u0243\u023d\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u024c\3\2"+
		"\2\2\u0245\u0247\5\4\3\2\u0246\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\5:"+
		"\36\2\u024b\u024d\3\2\2\2\u024c\u0246\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u0255\3\2\2\2\u024e\u0250\5\4\3\2\u024f\u024e\3\2\2\2\u0250\u0251\3\2"+
		"\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0254\5> \2\u0254\u0256\3\2\2\2\u0255\u024f\3\2\2\2\u0255\u0256\3\2\2"+
		"\2\u0256\u025a\3\2\2\2\u0257\u0259\5\4\3\2\u0258\u0257\3\2\2\2\u0259\u025c"+
		"\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2\2\2\u025c"+
		"\u025a\3\2\2\2\u025d\u025e\7d\2\2\u025e\u0260\3\2\2\2\u025f\u023b\3\2"+
		"\2\2\u025f\u0260\3\2\2\2\u0260\63\3\2\2\2\u0261\u0269\7-\2\2\u0262\u0264"+
		"\5\4\3\2\u0263\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0263\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\7?\2\2\u0268\u026a\3\2"+
		"\2\2\u0269\u0263\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b"+
		"\u026d\5\4\3\2\u026c\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026c\3\2"+
		"\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\5\66\34\2\u0271"+
		"\u0273\5\4\3\2\u0272\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0272\3\2"+
		"\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\58\35\2\u0277"+
		"\65\3\2\2\2\u0278\u0279\7i\2\2\u0279\67\3\2\2\2\u027a\u027b\t\6\2\2\u027b"+
		"9\3\2\2\2\u027c\u027e\78\2\2\u027d\u027f\5\4\3\2\u027e\u027d\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0283\3\2"+
		"\2\2\u0282\u027c\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u028a\3\2\2\2\u0284"+
		"\u0286\7\21\2\2\u0285\u0287\5\4\3\2\u0286\u0285\3\2\2\2\u0287\u0288\3"+
		"\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028b\3\2\2\2\u028a"+
		"\u0284\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u0294\7="+
		"\2\2\u028d\u028f\5\4\3\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\7*"+
		"\2\2\u0293\u0295\3\2\2\2\u0294\u028e\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0297\3\2\2\2\u0296\u0298\5\4\3\2\u0297\u0296\3\2\2\2\u0298\u0299\3\2"+
		"\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029c\5<\37\2\u029c;\3\2\2\2\u029d\u029e\7k\2\2\u029e=\3\2\2\2\u029f"+
		"\u02a7\7<\2\2\u02a0\u02a2\5\4\3\2\u02a1\u02a0\3\2\2\2\u02a2\u02a3\3\2"+
		"\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a6\7*\2\2\u02a6\u02a8\3\2\2\2\u02a7\u02a1\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\5@!\2\u02aa?\3\2\2\2\u02ab\u02ac"+
		"\7i\2\2\u02acA\3\2\2\2\u02ad\u02b1\7A\2\2\u02ae\u02b0\5\4\3\2\u02af\u02ae"+
		"\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b4\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b8\7d\2\2\u02b5\u02b7\5\4"+
		"\3\2\u02b6\u02b5\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8"+
		"\u02b9\3\2\2\2\u02b9\u02d2\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bd\5R"+
		"*\2\u02bc\u02be\5\4\3\2\u02bd\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c7\3\2\2\2\u02c1\u02c3\7*"+
		"\2\2\u02c2\u02c4\5\4\3\2\u02c3\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"+
		"\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c1\3\2"+
		"\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cd\5T+\2\u02ca\u02cc"+
		"\5\4\3\2\u02cb\u02ca\3\2\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd"+
		"\u02ce\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02bb\3\2"+
		"\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3"+
		"\u02ec\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d7\5V,\2\u02d6\u02d8\5\4\3"+
		"\2\u02d7\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da"+
		"\3\2\2\2\u02da\u02e1\3\2\2\2\u02db\u02dd\7*\2\2\u02dc\u02de\5\4\3\2\u02dd"+
		"\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2"+
		"\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02db\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u02e7\5X-\2\u02e4\u02e6\5\4\3\2\u02e5\u02e4\3\2\2"+
		"\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02eb"+
		"\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02d5\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec"+
		"\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u0304\3\2\2\2\u02ee\u02ec\3\2"+
		"\2\2\u02ef\u02f1\7\r\2\2\u02f0\u02f2\5\4\3\2\u02f1\u02f0\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02fb\3\2"+
		"\2\2\u02f5\u02f7\7*\2\2\u02f6\u02f8\5\4\3\2\u02f7\u02f6\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fc\3\2"+
		"\2\2\u02fb\u02f5\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd"+
		"\u0301\5P)\2\u02fe\u0300\5\4\3\2\u02ff\u02fe\3\2\2\2\u0300\u0303\3\2\2"+
		"\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301"+
		"\3\2\2\2\u0304\u02ef\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u030d\3\2\2\2\u0306"+
		"\u030a\5D#\2\u0307\u0309\5\4\3\2\u0308\u0307\3\2\2\2\u0309\u030c\3\2\2"+
		"\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a"+
		"\3\2\2\2\u030d\u0306\3\2\2\2\u030d\u030e\3\2\2\2\u030eC\3\2\2\2\u030f"+
		"\u0311\7F\2\2\u0310\u0312\5\4\3\2\u0311\u0310\3\2\2\2\u0312\u0313\3\2"+
		"\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315"+
		"\u0319\5N(\2\u0316\u0318\5\4\3\2\u0317\u0316\3\2\2\2\u0318\u031b\3\2\2"+
		"\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u0328\3\2\2\2\u031b\u0319"+
		"\3\2\2\2\u031c\u031e\7*\2\2\u031d\u031f\5\4\3\2\u031e\u031d\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2"+
		"\2\2\u0322\u0324\5L\'\2\u0323\u0325\5\4\3\2\u0324\u0323\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0329\3\2"+
		"\2\2\u0328\u031c\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u033e\3\2\2\2\u032a"+
		"\u0332\5F$\2\u032b\u032d\5\4\3\2\u032c\u032b\3\2\2\2\u032d\u032e\3\2\2"+
		"\2\u032e\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331"+
		"\5H%\2\u0331\u0333\3\2\2\2\u0332\u032c\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"\u033f\3\2\2\2\u0334\u033c\5H%\2\u0335\u0337\5\4\3\2\u0336\u0335\3\2\2"+
		"\2\u0337\u0338\3\2\2\2\u0338\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a"+
		"\3\2\2\2\u033a\u033b\5F$\2\u033b\u033d\3\2\2\2\u033c\u0336\3\2\2\2\u033c"+
		"\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u032a\3\2\2\2\u033e\u0334\3\2"+
		"\2\2\u033e\u033f\3\2\2\2\u033f\u0343\3\2\2\2\u0340\u0342\5\4\3\2\u0341"+
		"\u0340\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2"+
		"\2\2\u0344E\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0348\7\63\2\2\u0347\u0349"+
		"\5\4\3\2\u0348\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u0348\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u0352\3\2\2\2\u034c\u034e\7E\2\2\u034d\u034f\5\4"+
		"\3\2\u034e\u034d\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0353\3\2\2\2\u0352\u034c\3\2\2\2\u0352\u0353\3\2"+
		"\2\2\u0353\u035a\3\2\2\2\u0354\u0356\7*\2\2\u0355\u0357\5\4\3\2\u0356"+
		"\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2"+
		"\2\2\u0359\u035b\3\2\2\2\u035a\u0354\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"\u035c\3\2\2\2\u035c\u035d\5J&\2\u035dG\3\2\2\2\u035e\u0360\7\62\2\2\u035f"+
		"\u0361\5\4\3\2\u0360\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0360\3\2"+
		"\2\2\u0362\u0363\3\2\2\2\u0363\u036a\3\2\2\2\u0364\u0366\7E\2\2\u0365"+
		"\u0367\5\4\3\2\u0366\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0366\3\2"+
		"\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a\u0364\3\2\2\2\u036a"+
		"\u036b\3\2\2\2\u036b\u0372\3\2\2\2\u036c\u036e\7*\2\2\u036d\u036f\5\4"+
		"\3\2\u036e\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u036e\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0373\3\2\2\2\u0372\u036c\3\2\2\2\u0372\u0373\3\2"+
		"\2\2\u0373\u0374\3\2\2\2\u0374\u0375\5J&\2\u0375I\3\2\2\2\u0376\u0377"+
		"\7k\2\2\u0377K\3\2\2\2\u0378\u0379\7k\2\2\u0379M\3\2\2\2\u037a\u037b\7"+
		"i\2\2\u037bO\3\2\2\2\u037c\u037d\7k\2\2\u037dQ\3\2\2\2\u037e\u037f\t\7"+
		"\2\2\u037fS\3\2\2\2\u0380\u0381\7k\2\2\u0381U\3\2\2\2\u0382\u0383\t\b"+
		"\2\2\u0383W\3\2\2\2\u0384\u0385\7k\2\2\u0385Y\3\2\2\2\u0386\u038a\7\""+
		"\2\2\u0387\u0389\5\4\3\2\u0388\u0387\3\2\2\2\u0389\u038c\3\2\2\2\u038a"+
		"\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u038a\3\2"+
		"\2\2\u038d\u0391\7d\2\2\u038e\u0390\5\4\3\2\u038f\u038e\3\2\2\2\u0390"+
		"\u0393\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392[\3\2\2\2"+
		"\u0393\u0391\3\2\2\2\u0394\u0398\7+\2\2\u0395\u0397\5\4\3\2\u0396\u0395"+
		"\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u039b\3\2\2\2\u039a\u0398\3\2\2\2\u039b\u039f\7d\2\2\u039c\u039e\5\4"+
		"\3\2\u039d\u039c\3\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0]\3\2\2\2\u03a1\u039f\3\2\2\2\u0094ainsuy}\u0083\u0089"+
		"\u0090\u0096\u00a2\u00a8\u00af\u00b6\u00ba\u00bf\u00c3\u00c8\u00d3\u00d5"+
		"\u00db\u00df\u00e5\u00e7\u00ed\u00f7\u0100\u0107\u010e\u0115\u011c\u0123"+
		"\u012a\u0131\u0138\u013f\u0146\u014d\u0154\u015b\u0162\u0169\u0170\u0174"+
		"\u0179\u017d\u0183\u0189\u018b\u0191\u019a\u01a0\u01a7\u01ab\u01ae\u01b4"+
		"\u01ba\u01c1\u01c5\u01ca\u01ce\u01d3\u01d7\u01dc\u01e3\u01e9\u01f0\u01f4"+
		"\u01f7\u01fd\u0204\u020b\u020f\u0214\u0219\u0221\u0223\u0229\u0231\u0238"+
		"\u023f\u0243\u0248\u024c\u0251\u0255\u025a\u025f\u0265\u0269\u026e\u0274"+
		"\u0280\u0282\u0288\u028a\u0290\u0294\u0299\u02a3\u02a7\u02b1\u02b8\u02bf"+
		"\u02c5\u02c7\u02cd\u02d2\u02d9\u02df\u02e1\u02e7\u02ec\u02f3\u02f9\u02fb"+
		"\u0301\u0304\u030a\u030d\u0313\u0319\u0320\u0326\u0328\u032e\u0332\u0338"+
		"\u033c\u033e\u0343\u034a\u0350\u0352\u0358\u035a\u0362\u0368\u036a\u0370"+
		"\u0372\u038a\u0391\u0398\u039f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}