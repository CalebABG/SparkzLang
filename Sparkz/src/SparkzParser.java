// Generated from C:/Users/flame/Documents/GitHub/SparkzLang/Sparkz/src\SparkzParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkzParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TagNameDeclaration=1, TagNameSpecialDeclaration=2, StringLiteral=3, AT=4, 
		POUND=5, LPAREN=6, RPAREN=7, LBRACE=8, RBRACE=9, LBRACK=10, RBRACK=11, 
		SEMI=12, COMMA=13, DOT=14, ASSIGN=15, GT=16, LT=17, BANG=18, TILDE=19, 
		QUESTION=20, COLON=21, EQUAL=22, LE=23, GE=24, NOTEQUAL=25, AND=26, OR=27, 
		INC=28, DEC=29, ADD=30, SUB=31, MUL=32, DIV=33, BITAND=34, BITOR=35, CARET=36, 
		MOD=37, ARROW=38, COLONCOLON=39, WS=40, COMMENT=41, LINE_COMMENT=42;
	public static final int
		RULE_sparkz = 0, RULE_elementDeclaration = 1, RULE_elementCompactDeclaration = 2, 
		RULE_elementCompactContentDeclaration = 3, RULE_elementCompactStringDeclaration = 4, 
		RULE_elementCompactContent = 5, RULE_elementNormalDeclaration = 6, RULE_elementBody = 7, 
		RULE_elementBodyContent = 8, RULE_elementBodyPropertyDeclaration = 9, 
		RULE_elementAttributeListDeclaration = 10, RULE_elementAttributes = 11, 
		RULE_elementAttribute = 12, RULE_elementAttributeName = 13, RULE_elementAttributeValue = 14, 
		RULE_elementName = 15, RULE_string = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"sparkz", "elementDeclaration", "elementCompactDeclaration", "elementCompactContentDeclaration", 
			"elementCompactStringDeclaration", "elementCompactContent", "elementNormalDeclaration", 
			"elementBody", "elementBodyContent", "elementBodyPropertyDeclaration", 
			"elementAttributeListDeclaration", "elementAttributes", "elementAttribute", 
			"elementAttributeName", "elementAttributeValue", "elementName", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'@'", "'#'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
			"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TagNameDeclaration", "TagNameSpecialDeclaration", "StringLiteral", 
			"AT", "POUND", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", 
			"COLONCOLON", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SparkzParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SparkzParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SparkzContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SparkzParser.EOF, 0); }
		public List<ElementDeclarationContext> elementDeclaration() {
			return getRuleContexts(ElementDeclarationContext.class);
		}
		public ElementDeclarationContext elementDeclaration(int i) {
			return getRuleContext(ElementDeclarationContext.class,i);
		}
		public SparkzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparkz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterSparkz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitSparkz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitSparkz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SparkzContext sparkz() throws RecognitionException {
		SparkzContext _localctx = new SparkzContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sparkz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TagNameDeclaration || _la==TagNameSpecialDeclaration) {
				{
				{
				setState(34);
				elementDeclaration();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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

	public static class ElementDeclarationContext extends ParserRuleContext {
		public ElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDeclaration; }
	 
		public ElementDeclarationContext() { }
		public void copyFrom(ElementDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompactElementContext extends ElementDeclarationContext {
		public ElementCompactDeclarationContext elementCompactDeclaration() {
			return getRuleContext(ElementCompactDeclarationContext.class,0);
		}
		public CompactElementContext(ElementDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterCompactElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitCompactElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitCompactElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalElementContext extends ElementDeclarationContext {
		public ElementNormalDeclarationContext elementNormalDeclaration() {
			return getRuleContext(ElementNormalDeclarationContext.class,0);
		}
		public NormalElementContext(ElementDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompactExtElementContext extends ElementDeclarationContext {
		public ElementCompactContentDeclarationContext elementCompactContentDeclaration() {
			return getRuleContext(ElementCompactContentDeclarationContext.class,0);
		}
		public CompactExtElementContext(ElementDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterCompactExtElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitCompactExtElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitCompactExtElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementDeclarationContext elementDeclaration() throws RecognitionException {
		ElementDeclarationContext _localctx = new ElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_elementDeclaration);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new NormalElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				elementNormalDeclaration();
				}
				break;
			case 2:
				_localctx = new CompactElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				elementCompactDeclaration();
				}
				break;
			case 3:
				_localctx = new CompactExtElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				elementCompactContentDeclaration();
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

	public static class ElementCompactDeclarationContext extends ParserRuleContext {
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SparkzParser.SEMI, 0); }
		public ElementAttributeListDeclarationContext elementAttributeListDeclaration() {
			return getRuleContext(ElementAttributeListDeclarationContext.class,0);
		}
		public ElementCompactStringDeclarationContext elementCompactStringDeclaration() {
			return getRuleContext(ElementCompactStringDeclarationContext.class,0);
		}
		public ElementCompactDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCompactDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementCompactDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementCompactDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementCompactDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementCompactDeclarationContext elementCompactDeclaration() throws RecognitionException {
		ElementCompactDeclarationContext _localctx = new ElementCompactDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_elementCompactDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			elementName();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(48);
				elementAttributeListDeclaration();
				}
			}

			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(51);
				elementCompactStringDeclaration();
				}
			}

			setState(54);
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

	public static class ElementCompactContentDeclarationContext extends ParserRuleContext {
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TerminalNode GT() { return getToken(SparkzParser.GT, 0); }
		public ElementCompactContentContext elementCompactContent() {
			return getRuleContext(ElementCompactContentContext.class,0);
		}
		public ElementAttributeListDeclarationContext elementAttributeListDeclaration() {
			return getRuleContext(ElementAttributeListDeclarationContext.class,0);
		}
		public ElementCompactStringDeclarationContext elementCompactStringDeclaration() {
			return getRuleContext(ElementCompactStringDeclarationContext.class,0);
		}
		public ElementCompactContentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCompactContentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementCompactContentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementCompactContentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementCompactContentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementCompactContentDeclarationContext elementCompactContentDeclaration() throws RecognitionException {
		ElementCompactContentDeclarationContext _localctx = new ElementCompactContentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elementCompactContentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			elementName();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(57);
				elementAttributeListDeclaration();
				}
			}

			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(60);
				elementCompactStringDeclaration();
				}
			}

			setState(63);
			match(GT);
			setState(64);
			elementCompactContent();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementCompactStringDeclarationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(SparkzParser.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ElementCompactStringDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCompactStringDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementCompactStringDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementCompactStringDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementCompactStringDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementCompactStringDeclarationContext elementCompactStringDeclaration() throws RecognitionException {
		ElementCompactStringDeclarationContext _localctx = new ElementCompactStringDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elementCompactStringDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(COLON);
			setState(67);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementCompactContentContext extends ParserRuleContext {
		public ElementDeclarationContext elementDeclaration() {
			return getRuleContext(ElementDeclarationContext.class,0);
		}
		public ElementCompactContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCompactContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementCompactContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementCompactContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementCompactContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementCompactContentContext elementCompactContent() throws RecognitionException {
		ElementCompactContentContext _localctx = new ElementCompactContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementCompactContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			elementDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementNormalDeclarationContext extends ParserRuleContext {
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public ElementBodyContext elementBody() {
			return getRuleContext(ElementBodyContext.class,0);
		}
		public ElementAttributeListDeclarationContext elementAttributeListDeclaration() {
			return getRuleContext(ElementAttributeListDeclarationContext.class,0);
		}
		public ElementNormalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementNormalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementNormalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementNormalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementNormalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementNormalDeclarationContext elementNormalDeclaration() throws RecognitionException {
		ElementNormalDeclarationContext _localctx = new ElementNormalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elementNormalDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			elementName();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(72);
				elementAttributeListDeclaration();
				}
			}

			setState(75);
			elementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SparkzParser.LBRACE, 0); }
		public ElementBodyContentContext elementBodyContent() {
			return getRuleContext(ElementBodyContentContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SparkzParser.RBRACE, 0); }
		public ElementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementBodyContext elementBody() throws RecognitionException {
		ElementBodyContext _localctx = new ElementBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elementBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(LBRACE);
			setState(78);
			elementBodyContent();
			setState(79);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementBodyContentContext extends ParserRuleContext {
		public List<ElementDeclarationContext> elementDeclaration() {
			return getRuleContexts(ElementDeclarationContext.class);
		}
		public ElementDeclarationContext elementDeclaration(int i) {
			return getRuleContext(ElementDeclarationContext.class,i);
		}
		public List<ElementBodyPropertyDeclarationContext> elementBodyPropertyDeclaration() {
			return getRuleContexts(ElementBodyPropertyDeclarationContext.class);
		}
		public ElementBodyPropertyDeclarationContext elementBodyPropertyDeclaration(int i) {
			return getRuleContext(ElementBodyPropertyDeclarationContext.class,i);
		}
		public ElementBodyContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementBodyContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementBodyContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementBodyContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementBodyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementBodyContentContext elementBodyContent() throws RecognitionException {
		ElementBodyContentContext _localctx = new ElementBodyContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elementBodyContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TagNameDeclaration) | (1L << TagNameSpecialDeclaration) | (1L << DOT))) != 0)) {
				{
				setState(83);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TagNameDeclaration:
				case TagNameSpecialDeclaration:
					{
					setState(81);
					elementDeclaration();
					}
					break;
				case DOT:
					{
					setState(82);
					elementBodyPropertyDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(87);
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

	public static class ElementBodyPropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SparkzParser.DOT, 0); }
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SparkzParser.ASSIGN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ElementBodyPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementBodyPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementBodyPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementBodyPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementBodyPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementBodyPropertyDeclarationContext elementBodyPropertyDeclaration() throws RecognitionException {
		ElementBodyPropertyDeclarationContext _localctx = new ElementBodyPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elementBodyPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(DOT);
			setState(89);
			elementName();
			setState(90);
			match(ASSIGN);
			setState(91);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementAttributeListDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SparkzParser.LPAREN, 0); }
		public ElementAttributesContext elementAttributes() {
			return getRuleContext(ElementAttributesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SparkzParser.RPAREN, 0); }
		public ElementAttributeListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttributeListDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementAttributeListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementAttributeListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementAttributeListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributeListDeclarationContext elementAttributeListDeclaration() throws RecognitionException {
		ElementAttributeListDeclarationContext _localctx = new ElementAttributeListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elementAttributeListDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LPAREN);
			setState(94);
			elementAttributes();
			setState(95);
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

	public static class ElementAttributesContext extends ParserRuleContext {
		public List<ElementAttributeContext> elementAttribute() {
			return getRuleContexts(ElementAttributeContext.class);
		}
		public ElementAttributeContext elementAttribute(int i) {
			return getRuleContext(ElementAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SparkzParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SparkzParser.COMMA, i);
		}
		public ElementAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributesContext elementAttributes() throws RecognitionException {
		ElementAttributesContext _localctx = new ElementAttributesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elementAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			elementAttribute();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				elementAttribute();
				}
				}
				setState(104);
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

	public static class ElementAttributeContext extends ParserRuleContext {
		public ElementAttributeNameContext elementAttributeName() {
			return getRuleContext(ElementAttributeNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SparkzParser.ASSIGN, 0); }
		public ElementAttributeValueContext elementAttributeValue() {
			return getRuleContext(ElementAttributeValueContext.class,0);
		}
		public ElementAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributeContext elementAttribute() throws RecognitionException {
		ElementAttributeContext _localctx = new ElementAttributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elementAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			elementAttributeName();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(106);
				match(ASSIGN);
				setState(107);
				elementAttributeValue();
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

	public static class ElementAttributeNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(SparkzParser.AT, 0); }
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public ElementAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributeNameContext elementAttributeName() throws RecognitionException {
		ElementAttributeNameContext _localctx = new ElementAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elementAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(AT);
			setState(111);
			elementName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementAttributeValueContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ElementAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributeValueContext elementAttributeValue() throws RecognitionException {
		ElementAttributeValueContext _localctx = new ElementAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elementAttributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementNameContext extends ParserRuleContext {
		public TerminalNode TagNameDeclaration() { return getToken(SparkzParser.TagNameDeclaration, 0); }
		public TerminalNode TagNameSpecialDeclaration() { return getToken(SparkzParser.TagNameSpecialDeclaration, 0); }
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elementName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==TagNameDeclaration || _la==TagNameSpecialDeclaration) ) {
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
		public TerminalNode StringLiteral() { return getToken(SparkzParser.StringLiteral, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkzParserListener ) ((SparkzParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkzParserVisitor ) return ((SparkzParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,z\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\7\2"+
		"&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\5\4\64\n\4"+
		"\3\4\5\4\67\n\4\3\4\3\4\3\5\3\5\5\5=\n\5\3\5\5\5@\n\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\5\bL\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\7\n"+
		"V\n\n\f\n\16\nY\13\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\7\rg\n\r\f\r\16\rj\13\r\3\16\3\16\3\16\5\16o\n\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"\2\3\3\2\3\4\2t\2\'\3\2\2\2\4/\3\2\2\2\6\61\3\2\2\2\b:"+
		"\3\2\2\2\nD\3\2\2\2\fG\3\2\2\2\16I\3\2\2\2\20O\3\2\2\2\22W\3\2\2\2\24"+
		"Z\3\2\2\2\26_\3\2\2\2\30c\3\2\2\2\32k\3\2\2\2\34p\3\2\2\2\36s\3\2\2\2"+
		" u\3\2\2\2\"w\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2"+
		"\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,\60\5\16\b\2-\60\5\6\4"+
		"\2.\60\5\b\5\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\5\3\2\2\2\61\63\5 \21"+
		"\2\62\64\5\26\f\2\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5\n"+
		"\6\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\16\2\29\7\3\2\2\2:<\5"+
		" \21\2;=\5\26\f\2<;\3\2\2\2<=\3\2\2\2=?\3\2\2\2>@\5\n\6\2?>\3\2\2\2?@"+
		"\3\2\2\2@A\3\2\2\2AB\7\22\2\2BC\5\f\7\2C\t\3\2\2\2DE\7\27\2\2EF\5\"\22"+
		"\2F\13\3\2\2\2GH\5\4\3\2H\r\3\2\2\2IK\5 \21\2JL\5\26\f\2KJ\3\2\2\2KL\3"+
		"\2\2\2LM\3\2\2\2MN\5\20\t\2N\17\3\2\2\2OP\7\n\2\2PQ\5\22\n\2QR\7\13\2"+
		"\2R\21\3\2\2\2SV\5\4\3\2TV\5\24\13\2US\3\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3"+
		"\2\2\2WX\3\2\2\2X\23\3\2\2\2YW\3\2\2\2Z[\7\20\2\2[\\\5 \21\2\\]\7\21\2"+
		"\2]^\5\"\22\2^\25\3\2\2\2_`\7\b\2\2`a\5\30\r\2ab\7\t\2\2b\27\3\2\2\2c"+
		"h\5\32\16\2de\7\17\2\2eg\5\32\16\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2i\31\3\2\2\2jh\3\2\2\2kn\5\34\17\2lm\7\21\2\2mo\5\36\20\2nl\3\2\2"+
		"\2no\3\2\2\2o\33\3\2\2\2pq\7\6\2\2qr\5 \21\2r\35\3\2\2\2st\5\"\22\2t\37"+
		"\3\2\2\2uv\t\2\2\2v!\3\2\2\2wx\7\5\2\2x#\3\2\2\2\r\'/\63\66<?KUWhn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}