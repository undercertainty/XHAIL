// Generated from Clasp3.g4 by ANTLR 4.2.2

package ac.bristol.bragaglia.xhail.parsers.clasp3;

/**
 * @author stefano
 *
 */
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Clasp3Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, BACKSLASH=24, 
		COLON=25, COMMA=26, DOT=27, DOTDOT=28, SLASH=29, PAREN_LEFT=30, PAREN_RIGHT=31, 
		SPACE=32, DRIVE=33, IDENTIFIER=34, INTEGER=35, FLOAT=36, LETTER=37, NEWLINE=38, 
		QUOTED=39, STRING=40, PLUS=41, MINUS=42;
	public static final String[] tokenNames = {
		"<INVALID>", "'s'", "'s)'", "'CPU Time     : '", "'s Unsat: '", "'SATISFIABLE'", 
		"'Reading from stdin'", "'Reading from '", "'Solving...'", "'Calls        : '", 
		"'s 1st Model: '", "'Models       : '", "'Answer: '", "'Time         : '", 
		"'OPTIMUM FOUND'", "'Optimization : '", "'  Optimum    : no'", "'clasp version 3.'", 
		"'  Optimal    : '", "'  Optimum    : yes'", "'UNKNOWN'", "'UNSATISFIABLE'", 
		"'s (Solving: '", "'Optimization: '", "'\\'", "':'", "','", "'.'", "'..'", 
		"'/'", "'('", "')'", "' '", "DRIVE", "IDENTIFIER", "INTEGER", "FLOAT", 
		"LETTER", "NEWLINE", "QUOTED", "STRING", "'+'", "'-'"
	};
	public static final int
		RULE_output = 0, RULE_version = 1, RULE_source = 2, RULE_path = 3, RULE_folder = 4, 
		RULE_filename = 5, RULE_extension = 6, RULE_solving = 7, RULE_answer = 8, 
		RULE_model = 9, RULE_fact = 10, RULE_atom = 11, RULE_values = 12, RULE_number = 13, 
		RULE_result = 14, RULE_separation = 15, RULE_statistics = 16, RULE_models = 17, 
		RULE_optimum = 18, RULE_optimal = 19, RULE_optimization = 20, RULE_optValues = 21, 
		RULE_calls = 22, RULE_time = 23, RULE_cputime = 24;
	public static final String[] ruleNames = {
		"output", "version", "source", "path", "folder", "filename", "extension", 
		"solving", "answer", "model", "fact", "atom", "values", "number", "result", 
		"separation", "statistics", "models", "optimum", "optimal", "optimization", 
		"optValues", "calls", "time", "cputime"
	};

	@Override
	public String getGrammarFileName() { return "Clasp3.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Clasp3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OutputContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public SeparationContext separation() {
			return getRuleContext(SeparationContext.class,0);
		}
		public SolvingContext solving() {
			return getRuleContext(SolvingContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public AnswerContext answer(int i) {
			return getRuleContext(AnswerContext.class,i);
		}
		public TerminalNode EOF() { return getToken(Clasp3Parser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Clasp3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Clasp3Parser.NEWLINE, i);
		}
		public List<AnswerContext> answer() {
			return getRuleContexts(AnswerContext.class);
		}
		public StatisticsContext statistics() {
			return getRuleContext(StatisticsContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); version();
			setState(51); source();
			setState(53);
			_la = _input.LA(1);
			if (_la==8) {
				{
				setState(52); solving();
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==12) {
				{
				{
				setState(55); answer();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61); result();
			setState(62); separation();
			setState(63); statistics();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(64); match(NEWLINE);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public TerminalNode FLOAT() { return getToken(Clasp3Parser.FLOAT, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitVersion(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(17);
			setState(73); match(FLOAT);
			setState(74); match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceContext extends ParserRuleContext {
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
	 
		public SourceContext() { }
		public void copyFrom(SourceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SourceSTDINContext extends SourceContext {
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public SourceSTDINContext(SourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterSourceSTDIN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitSourceSTDIN(this);
		}
	}
	public static class SourceFileContext extends SourceContext {
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public SourceFileContext(SourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitSourceFile(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_source);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case 6:
				_localctx = new SourceSTDINContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76); match(6);
				setState(77); match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new SourceFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78); match(7);
				setState(79); path();
				setState(80); match(NEWLINE);
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

	public static class PathContext extends ParserRuleContext {
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	 
		public PathContext() { }
		public void copyFrom(PathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PathWindowsContext extends PathContext {
		public List<TerminalNode> BACKSLASH() { return getTokens(Clasp3Parser.BACKSLASH); }
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public List<FolderContext> folder() {
			return getRuleContexts(FolderContext.class);
		}
		public TerminalNode DRIVE() { return getToken(Clasp3Parser.DRIVE, 0); }
		public FolderContext folder(int i) {
			return getRuleContext(FolderContext.class,i);
		}
		public TerminalNode BACKSLASH(int i) {
			return getToken(Clasp3Parser.BACKSLASH, i);
		}
		public PathWindowsContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterPathWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitPathWindows(this);
		}
	}
	public static class PathNIXContext extends PathContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public List<FolderContext> folder() {
			return getRuleContexts(FolderContext.class);
		}
		public List<TerminalNode> SLASH() { return getTokens(Clasp3Parser.SLASH); }
		public FolderContext folder(int i) {
			return getRuleContext(FolderContext.class,i);
		}
		public TerminalNode SLASH(int i) {
			return getToken(Clasp3Parser.SLASH, i);
		}
		public PathNIXContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterPathNIX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitPathNIX(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_path);
		int _la;
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PathWindowsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				_la = _input.LA(1);
				if (_la==DRIVE) {
					{
					setState(84); match(DRIVE);
					}
				}

				setState(87); folder();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BACKSLASH) {
					{
					{
					setState(88); match(BACKSLASH);
					setState(89); folder();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95); filename();
				}
				break;

			case 2:
				_localctx = new PathNIXContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				_la = _input.LA(1);
				if (_la==SLASH) {
					{
					setState(97); match(SLASH);
					}
				}

				setState(100); folder();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLASH) {
					{
					{
					setState(101); match(SLASH);
					setState(102); folder();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108); filename();
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

	public static class FolderContext extends ParserRuleContext {
		public FolderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folder; }
	 
		public FolderContext() { }
		public void copyFrom(FolderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentFolderContext extends FolderContext {
		public TerminalNode DOTDOT() { return getToken(Clasp3Parser.DOTDOT, 0); }
		public ParentFolderContext(FolderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterParentFolder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitParentFolder(this);
		}
	}
	public static class GenericFolderContext extends FolderContext {
		public List<TerminalNode> LETTER() { return getTokens(Clasp3Parser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(Clasp3Parser.LETTER, i);
		}
		public GenericFolderContext(FolderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterGenericFolder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitGenericFolder(this);
		}
	}
	public static class CurrentFolderContext extends FolderContext {
		public TerminalNode DOT() { return getToken(Clasp3Parser.DOT, 0); }
		public CurrentFolderContext(FolderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterCurrentFolder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitCurrentFolder(this);
		}
	}

	public final FolderContext folder() throws RecognitionException {
		FolderContext _localctx = new FolderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_folder);
		try {
			int _alt;
			setState(119);
			switch (_input.LA(1)) {
			case LETTER:
				_localctx = new GenericFolderContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(112); match(LETTER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(115); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				}
				break;
			case DOTDOT:
				_localctx = new ParentFolderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117); match(DOTDOT);
				}
				break;
			case DOT:
				_localctx = new CurrentFolderContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118); match(DOT);
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

	public static class FilenameContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(Clasp3Parser.LETTER); }
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
		}
		public TerminalNode LETTER(int i) {
			return getToken(Clasp3Parser.LETTER, i);
		}
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterFilename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitFilename(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_filename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121); match(LETTER);
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTER );
			setState(127);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(126); extension();
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

	public static class ExtensionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(Clasp3Parser.DOT, 0); }
		public List<TerminalNode> LETTER() { return getTokens(Clasp3Parser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(Clasp3Parser.LETTER, i);
		}
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitExtension(this);
		}
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(DOT);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER) {
				{
				{
				setState(130); match(LETTER);
				}
				}
				setState(135);
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

	public static class SolvingContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public SolvingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solving; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterSolving(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitSolving(this);
		}
	}

	public final SolvingContext solving() throws RecognitionException {
		SolvingContext _localctx = new SolvingContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_solving);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(8);
			setState(137); match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnswerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Clasp3Parser.INTEGER, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(Clasp3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(Clasp3Parser.NEWLINE, i);
		}
		public ModelContext model() {
			return getRuleContext(ModelContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitAnswer(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(12);
			setState(140); match(INTEGER);
			setState(141); match(NEWLINE);
			setState(143);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING) | (1L << MINUS))) != 0)) {
				{
				setState(142); model();
				}
			}

			setState(145); match(NEWLINE);
			setState(148);
			_la = _input.LA(1);
			if (_la==23) {
				{
				setState(146); match(23);
				setState(147); values();
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

	public static class ModelContext extends ParserRuleContext {
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public TerminalNode SPACE(int i) {
			return getToken(Clasp3Parser.SPACE, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(Clasp3Parser.SPACE); }
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); fact();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(151); match(SPACE);
				setState(152); fact();
				}
				}
				setState(157);
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

	public static class FactContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitFact(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomPredicateContext extends AtomContext {
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode PAREN_LEFT() { return getToken(Clasp3Parser.PAREN_LEFT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Clasp3Parser.COMMA); }
		public TerminalNode IDENTIFIER() { return getToken(Clasp3Parser.IDENTIFIER, 0); }
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(Clasp3Parser.COMMA, i);
		}
		public TerminalNode PAREN_RIGHT() { return getToken(Clasp3Parser.PAREN_RIGHT, 0); }
		public AtomPredicateContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterAtomPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitAtomPredicate(this);
		}
	}
	public static class AtomStringContext extends AtomContext {
		public TerminalNode STRING() { return getToken(Clasp3Parser.STRING, 0); }
		public AtomStringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterAtomString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitAtomString(this);
		}
	}
	public static class AtomIntegerContext extends AtomContext {
		public TerminalNode INTEGER() { return getToken(Clasp3Parser.INTEGER, 0); }
		public TerminalNode MINUS() { return getToken(Clasp3Parser.MINUS, 0); }
		public AtomIntegerContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterAtomInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitAtomInteger(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atom);
		int _la;
		try {
			setState(179);
			switch (_input.LA(1)) {
			case INTEGER:
			case MINUS:
				_localctx = new AtomIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(160); match(MINUS);
					}
				}

				setState(163); match(INTEGER);
				}
				break;
			case STRING:
				_localctx = new AtomStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164); match(STRING);
				}
				break;
			case IDENTIFIER:
				_localctx = new AtomPredicateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(165); match(IDENTIFIER);
				setState(177);
				_la = _input.LA(1);
				if (_la==PAREN_LEFT) {
					{
					setState(166); match(PAREN_LEFT);
					setState(167); atom();
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(168); match(COMMA);
						setState(169); atom();
						}
						}
						setState(174);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(175); match(PAREN_RIGHT);
					}
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

	public static class ValuesContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(Clasp3Parser.INTEGER); }
		public TerminalNode SPACE(int i) {
			return getToken(Clasp3Parser.SPACE, i);
		}
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(Clasp3Parser.SPACE); }
		public TerminalNode INTEGER(int i) {
			return getToken(Clasp3Parser.INTEGER, i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitValues(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(INTEGER);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(182); match(SPACE);
				setState(183); match(INTEGER);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189); match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Clasp3Parser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(Clasp3Parser.FLOAT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_result);
		try {
			setState(201);
			switch (_input.LA(1)) {
			case 14:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); match(14);
				setState(194); match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); match(5);
				setState(196); match(NEWLINE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 3);
				{
				setState(197); match(20);
				setState(198); match(NEWLINE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 4);
				{
				setState(199); match(21);
				setState(200); match(NEWLINE);
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

	public static class SeparationContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public SeparationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterSeparation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitSeparation(this);
		}
	}

	public final SeparationContext separation() throws RecognitionException {
		SeparationContext _localctx = new SeparationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_separation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticsContext extends ParserRuleContext {
		public ModelsContext models() {
			return getRuleContext(ModelsContext.class,0);
		}
		public OptimumContext optimum() {
			return getRuleContext(OptimumContext.class,0);
		}
		public CallsContext calls() {
			return getRuleContext(CallsContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public CputimeContext cputime() {
			return getRuleContext(CputimeContext.class,0);
		}
		public OptimizationContext optimization() {
			return getRuleContext(OptimizationContext.class,0);
		}
		public StatisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterStatistics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitStatistics(this);
		}
	}

	public final StatisticsContext statistics() throws RecognitionException {
		StatisticsContext _localctx = new StatisticsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statistics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); models();
			setState(207);
			_la = _input.LA(1);
			if (_la==16 || _la==19) {
				{
				setState(206); optimum();
				}
			}

			setState(210);
			_la = _input.LA(1);
			if (_la==15) {
				{
				setState(209); optimization();
				}
			}

			setState(212); calls();
			setState(213); time();
			setState(214); cputime();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelsContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Clasp3Parser.INTEGER, 0); }
		public TerminalNode SPACE(int i) {
			return getToken(Clasp3Parser.SPACE, i);
		}
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public TerminalNode PLUS() { return getToken(Clasp3Parser.PLUS, 0); }
		public List<TerminalNode> SPACE() { return getTokens(Clasp3Parser.SPACE); }
		public ModelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_models; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterModels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitModels(this);
		}
	}

	public final ModelsContext models() throws RecognitionException {
		ModelsContext _localctx = new ModelsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_models);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); match(11);
			setState(217); match(INTEGER);
			setState(219);
			_la = _input.LA(1);
			if (_la==PLUS) {
				{
				setState(218); match(PLUS);
				}
			}

			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(221); match(SPACE);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptimumContext extends ParserRuleContext {
		public OptimalContext optimal() {
			return getRuleContext(OptimalContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public OptimumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterOptimum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitOptimum(this);
		}
	}

	public final OptimumContext optimum() throws RecognitionException {
		OptimumContext _localctx = new OptimumContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_optimum);
		int _la;
		try {
			setState(236);
			switch (_input.LA(1)) {
			case 19:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); match(19);
				setState(230); match(NEWLINE);
				setState(232);
				_la = _input.LA(1);
				if (_la==18) {
					{
					setState(231); optimal();
					}
				}

				}
				break;
			case 16:
				enterOuterAlt(_localctx, 2);
				{
				setState(234); match(16);
				setState(235); match(NEWLINE);
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

	public static class OptimalContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Clasp3Parser.INTEGER, 0); }
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public OptimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterOptimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitOptimal(this);
		}
	}

	public final OptimalContext optimal() throws RecognitionException {
		OptimalContext _localctx = new OptimalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_optimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(18);
			setState(239); match(INTEGER);
			setState(240); match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptimizationContext extends ParserRuleContext {
		public OptValuesContext optValues() {
			return getRuleContext(OptValuesContext.class,0);
		}
		public OptimizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterOptimization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitOptimization(this);
		}
	}

	public final OptimizationContext optimization() throws RecognitionException {
		OptimizationContext _localctx = new OptimizationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_optimization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); match(15);
			setState(243); optValues();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptValuesContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER() { return getTokens(Clasp3Parser.INTEGER); }
		public TerminalNode SPACE(int i) {
			return getToken(Clasp3Parser.SPACE, i);
		}
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public List<TerminalNode> SPACE() { return getTokens(Clasp3Parser.SPACE); }
		public TerminalNode INTEGER(int i) {
			return getToken(Clasp3Parser.INTEGER, i);
		}
		public OptValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterOptValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitOptValues(this);
		}
	}

	public final OptValuesContext optValues() throws RecognitionException {
		OptValuesContext _localctx = new OptValuesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_optValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(INTEGER);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(246); match(SPACE);
				setState(247); match(INTEGER);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253); match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallsContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(Clasp3Parser.INTEGER, 0); }
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public CallsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterCalls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitCalls(this);
		}
	}

	public final CallsContext calls() throws RecognitionException {
		CallsContext _localctx = new CallsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_calls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); match(9);
			setState(256); match(INTEGER);
			setState(257); match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(Clasp3Parser.NEWLINE, 0); }
		public List<TerminalNode> FLOAT() { return getTokens(Clasp3Parser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(Clasp3Parser.FLOAT, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(13);
			setState(260); match(FLOAT);
			setState(261); match(22);
			setState(262); match(FLOAT);
			setState(263); match(10);
			setState(264); match(FLOAT);
			setState(265); match(4);
			setState(266); match(FLOAT);
			setState(267); match(2);
			setState(268); match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CputimeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(Clasp3Parser.FLOAT, 0); }
		public CputimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cputime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).enterCputime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Clasp3Listener ) ((Clasp3Listener)listener).exitCputime(this);
		}
	}

	public final CputimeContext cputime() throws RecognitionException {
		CputimeContext _localctx = new CputimeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cputime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(3);
			setState(271); match(FLOAT);
			setState(272); match(1);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u0115\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\5\28\n\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2\3"+
		"\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4U\n\4\3\5\5\5X\n\5\3\5\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3\5"+
		"\3\5\3\5\5\5e\n\5\3\5\3\5\3\5\7\5j\n\5\f\5\16\5m\13\5\3\5\3\5\5\5q\n\5"+
		"\3\6\6\6t\n\6\r\6\16\6u\3\6\3\6\5\6z\n\6\3\7\6\7}\n\7\r\7\16\7~\3\7\5"+
		"\7\u0082\n\7\3\b\3\b\7\b\u0086\n\b\f\b\16\b\u0089\13\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\5\n\u0092\n\n\3\n\3\n\3\n\5\n\u0097\n\n\3\13\3\13\3\13\7"+
		"\13\u009c\n\13\f\13\16\13\u009f\13\13\3\f\3\f\3\r\5\r\u00a4\n\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ad\n\r\f\r\16\r\u00b0\13\r\3\r\3\r\5\r\u00b4"+
		"\n\r\5\r\u00b6\n\r\3\16\3\16\3\16\7\16\u00bb\n\16\f\16\16\16\u00be\13"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cc"+
		"\n\20\3\21\3\21\3\22\3\22\5\22\u00d2\n\22\3\22\5\22\u00d5\n\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\5\23\u00de\n\23\3\23\7\23\u00e1\n\23\f\23"+
		"\16\23\u00e4\13\23\3\23\3\23\3\24\3\24\3\24\5\24\u00eb\n\24\3\24\3\24"+
		"\5\24\u00ef\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\7\27"+
		"\u00fb\n\27\f\27\16\27\u00fe\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\3"+
		"\3\2%&\u011d\2\64\3\2\2\2\4J\3\2\2\2\6T\3\2\2\2\bp\3\2\2\2\ny\3\2\2\2"+
		"\f|\3\2\2\2\16\u0083\3\2\2\2\20\u008a\3\2\2\2\22\u008d\3\2\2\2\24\u0098"+
		"\3\2\2\2\26\u00a0\3\2\2\2\30\u00b5\3\2\2\2\32\u00b7\3\2\2\2\34\u00c1\3"+
		"\2\2\2\36\u00cb\3\2\2\2 \u00cd\3\2\2\2\"\u00cf\3\2\2\2$\u00da\3\2\2\2"+
		"&\u00ee\3\2\2\2(\u00f0\3\2\2\2*\u00f4\3\2\2\2,\u00f7\3\2\2\2.\u0101\3"+
		"\2\2\2\60\u0105\3\2\2\2\62\u0110\3\2\2\2\64\65\5\4\3\2\65\67\5\6\4\2\66"+
		"8\5\20\t\2\67\66\3\2\2\2\678\3\2\2\28<\3\2\2\29;\5\22\n\2:9\3\2\2\2;>"+
		"\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\5\36\20\2@A\5 \21\2"+
		"AE\5\"\22\2BD\7(\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2"+
		"GE\3\2\2\2HI\7\2\2\3I\3\3\2\2\2JK\7\23\2\2KL\7&\2\2LM\7(\2\2M\5\3\2\2"+
		"\2NO\7\b\2\2OU\7(\2\2PQ\7\t\2\2QR\5\b\5\2RS\7(\2\2SU\3\2\2\2TN\3\2\2\2"+
		"TP\3\2\2\2U\7\3\2\2\2VX\7#\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y^\5\n\6\2"+
		"Z[\7\32\2\2[]\5\n\6\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2"+
		"\2\2`^\3\2\2\2ab\5\f\7\2bq\3\2\2\2ce\7\37\2\2dc\3\2\2\2de\3\2\2\2ef\3"+
		"\2\2\2fk\5\n\6\2gh\7\37\2\2hj\5\n\6\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl"+
		"\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\5\f\7\2oq\3\2\2\2pW\3\2\2\2pd\3\2\2\2q"+
		"\t\3\2\2\2rt\7\'\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2vz\3\2\2\2"+
		"wz\7\36\2\2xz\7\35\2\2ys\3\2\2\2yw\3\2\2\2yx\3\2\2\2z\13\3\2\2\2{}\7\'"+
		"\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"\u0082\5\16\b\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\r\3\2\2"+
		"\2\u0083\u0087\7\35\2\2\u0084\u0086\7\'\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\17\3\2\2"+
		"\2\u0089\u0087\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008c\7(\2\2\u008c\21"+
		"\3\2\2\2\u008d\u008e\7\16\2\2\u008e\u008f\7%\2\2\u008f\u0091\7(\2\2\u0090"+
		"\u0092\5\24\13\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0096\7(\2\2\u0094\u0095\7\31\2\2\u0095\u0097\5\32\16\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\23\3\2\2\2\u0098\u009d\5\26\f"+
		"\2\u0099\u009a\7\"\2\2\u009a\u009c\5\26\f\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\25\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u00a0\u00a1\5\30\r\2\u00a1\27\3\2\2\2\u00a2\u00a4"+
		"\7,\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00b6\7%\2\2\u00a6\u00b6\7*\2\2\u00a7\u00b3\7$\2\2\u00a8\u00a9\7 \2\2"+
		"\u00a9\u00ae\5\30\r\2\u00aa\u00ab\7\34\2\2\u00ab\u00ad\5\30\r\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7!\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00a8\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00a3\3\2\2\2\u00b5\u00a6\3\2\2\2\u00b5\u00a7\3\2\2\2\u00b6"+
		"\31\3\2\2\2\u00b7\u00bc\7%\2\2\u00b8\u00b9\7\"\2\2\u00b9\u00bb\7%\2\2"+
		"\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7(\2\2\u00c0"+
		"\33\3\2\2\2\u00c1\u00c2\t\2\2\2\u00c2\35\3\2\2\2\u00c3\u00c4\7\20\2\2"+
		"\u00c4\u00cc\7(\2\2\u00c5\u00c6\7\7\2\2\u00c6\u00cc\7(\2\2\u00c7\u00c8"+
		"\7\26\2\2\u00c8\u00cc\7(\2\2\u00c9\u00ca\7\27\2\2\u00ca\u00cc\7(\2\2\u00cb"+
		"\u00c3\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\37\3\2\2\2\u00cd\u00ce\7(\2\2\u00ce!\3\2\2\2\u00cf\u00d1\5"+
		"$\23\2\u00d0\u00d2\5&\24\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d5\5*\26\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\5.\30\2\u00d7\u00d8\5\60\31\2\u00d8"+
		"\u00d9\5\62\32\2\u00d9#\3\2\2\2\u00da\u00db\7\r\2\2\u00db\u00dd\7%\2\2"+
		"\u00dc\u00de\7+\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e2"+
		"\3\2\2\2\u00df\u00e1\7\"\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e6\7(\2\2\u00e6%\3\2\2\2\u00e7\u00e8\7\25\2\2\u00e8\u00ea"+
		"\7(\2\2\u00e9\u00eb\5(\25\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ef\3\2\2\2\u00ec\u00ed\7\22\2\2\u00ed\u00ef\7(\2\2\u00ee\u00e7\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ef\'\3\2\2\2\u00f0\u00f1\7\24\2\2\u00f1\u00f2"+
		"\7%\2\2\u00f2\u00f3\7(\2\2\u00f3)\3\2\2\2\u00f4\u00f5\7\21\2\2\u00f5\u00f6"+
		"\5,\27\2\u00f6+\3\2\2\2\u00f7\u00fc\7%\2\2\u00f8\u00f9\7\"\2\2\u00f9\u00fb"+
		"\7%\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7("+
		"\2\2\u0100-\3\2\2\2\u0101\u0102\7\13\2\2\u0102\u0103\7%\2\2\u0103\u0104"+
		"\7(\2\2\u0104/\3\2\2\2\u0105\u0106\7\17\2\2\u0106\u0107\7&\2\2\u0107\u0108"+
		"\7\30\2\2\u0108\u0109\7&\2\2\u0109\u010a\7\f\2\2\u010a\u010b\7&\2\2\u010b"+
		"\u010c\7\6\2\2\u010c\u010d\7&\2\2\u010d\u010e\7\4\2\2\u010e\u010f\7(\2"+
		"\2\u010f\61\3\2\2\2\u0110\u0111\7\5\2\2\u0111\u0112\7&\2\2\u0112\u0113"+
		"\7\3\2\2\u0113\63\3\2\2\2 \67<ETW^dkpuy~\u0081\u0087\u0091\u0096\u009d"+
		"\u00a3\u00ae\u00b3\u00b5\u00bc\u00cb\u00d1\u00d4\u00dd\u00e2\u00ea\u00ee"+
		"\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}