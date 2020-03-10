// Generated from C:/Users/flame/Documents/GitHub/Eva-ElegantMarkup/Eva/src\EvaParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EvaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TagNameDeclaration=1, TagAttribute=2, ElementBodyPropertDeclaration=3, 
		TagNameSpecialDeclaration=4, StringLiteral=5, AT=6, POUND=7, LPAREN=8, 
		RPAREN=9, LBRACE=10, RBRACE=11, LBRACK=12, RBRACK=13, SEMI=14, COMMA=15, 
		DOT=16, ASSIGN=17, GT=18, LT=19, BANG=20, TILDE=21, QUESTION=22, COLON=23, 
		EQUAL=24, LE=25, GE=26, NOTEQUAL=27, AND=28, OR=29, INC=30, DEC=31, ADD=32, 
		SUB=33, MUL=34, DIV=35, BITAND=36, BITOR=37, CARET=38, MOD=39, ARROW=40, 
		COLONCOLON=41, WS=42, COMMENT=43, LINE_COMMENT=44;
	public static final int
		RULE_eva = 0, RULE_elementDeclaration = 1, RULE_elementCompactDeclaration = 2, 
		RULE_elementCompactContentDeclaration = 3, RULE_elementCompactStringDeclaration = 4, 
		RULE_elementCompactContent = 5, RULE_elementNormalDeclaration = 6, RULE_elementBody = 7, 
		RULE_elementBodyContent = 8, RULE_elementBodyText = 9, RULE_elementBodyProperty = 10, 
		RULE_elementAttributeListDeclaration = 11, RULE_elementAttributes = 12, 
		RULE_elementAttribute = 13, RULE_elementAttributeName = 14, RULE_elementAttributeValue = 15, 
		RULE_elementName = 16, RULE_string = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"eva", "elementDeclaration", "elementCompactDeclaration", "elementCompactContentDeclaration", 
			"elementCompactStringDeclaration", "elementCompactContent", "elementNormalDeclaration", 
			"elementBody", "elementBodyContent", "elementBodyText", "elementBodyProperty", 
			"elementAttributeListDeclaration", "elementAttributes", "elementAttribute", 
			"elementAttributeName", "elementAttributeValue", "elementName", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'@'", "'#'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
			"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'->'", "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TagNameDeclaration", "TagAttribute", "ElementBodyPropertDeclaration", 
			"TagNameSpecialDeclaration", "StringLiteral", "AT", "POUND", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "WS", 
			"COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "EvaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EvaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EvaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EvaParser.EOF, 0); }
		public List<ElementDeclarationContext> elementDeclaration() {
			return getRuleContexts(ElementDeclarationContext.class);
		}
		public ElementDeclarationContext elementDeclaration(int i) {
			return getRuleContext(ElementDeclarationContext.class,i);
		}
		public EvaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterEva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitEva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitEva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvaContext eva() throws RecognitionException {
		EvaContext _localctx = new EvaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TagNameDeclaration || _la==TagNameSpecialDeclaration) {
				{
				{
				setState(36);
				elementDeclaration();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
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
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterCompactElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitCompactElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitCompactElement(this);
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
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitNormalElement(this);
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
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterCompactExtElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitCompactExtElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitCompactExtElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementDeclarationContext elementDeclaration() throws RecognitionException {
		ElementDeclarationContext _localctx = new ElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_elementDeclaration);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new NormalElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				elementNormalDeclaration();
				}
				break;
			case 2:
				_localctx = new CompactElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				elementCompactDeclaration();
				}
				break;
			case 3:
				_localctx = new CompactExtElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
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
		public TerminalNode SEMI() { return getToken(EvaParser.SEMI, 0); }
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
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementCompactDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementCompactDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementCompactDeclaration(this);
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
			setState(49);
			elementName();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(50);
				elementAttributeListDeclaration();
				}
			}

			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(53);
				elementCompactStringDeclaration();
				}
			}

			setState(56);
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
		public TerminalNode GT() { return getToken(EvaParser.GT, 0); }
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
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementCompactContentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementCompactContentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementCompactContentDeclaration(this);
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
			setState(58);
			elementName();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(59);
				elementAttributeListDeclaration();
				}
			}

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(62);
				elementCompactStringDeclaration();
				}
			}

			setState(65);
			match(GT);
			setState(66);
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
		public TerminalNode COLON() { return getToken(EvaParser.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ElementCompactStringDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCompactStringDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementCompactStringDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementCompactStringDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementCompactStringDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementCompactStringDeclarationContext elementCompactStringDeclaration() throws RecognitionException {
		ElementCompactStringDeclarationContext _localctx = new ElementCompactStringDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elementCompactStringDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(COLON);
			setState(69);
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
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementCompactContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementCompactContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementCompactContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementCompactContentContext elementCompactContent() throws RecognitionException {
		ElementCompactContentContext _localctx = new ElementCompactContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementCompactContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementNormalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementNormalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementNormalDeclaration(this);
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
			setState(73);
			elementName();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(74);
				elementAttributeListDeclaration();
				}
			}

			setState(77);
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
		public TerminalNode LBRACE() { return getToken(EvaParser.LBRACE, 0); }
		public ElementBodyContentContext elementBodyContent() {
			return getRuleContext(ElementBodyContentContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(EvaParser.RBRACE, 0); }
		public ElementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementBodyContext elementBody() throws RecognitionException {
		ElementBodyContext _localctx = new ElementBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elementBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LBRACE);
			setState(80);
			elementBodyContent();
			setState(81);
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
		public ElementBodyTextContext elementBodyText() {
			return getRuleContext(ElementBodyTextContext.class,0);
		}
		public ElementBodyContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementBodyContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementBodyContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementBodyContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementBodyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementBodyContentContext elementBodyContent() throws RecognitionException {
		ElementBodyContentContext _localctx = new ElementBodyContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elementBodyContent);
		int _la;
		try {
			int _alt;
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(83);
						elementDeclaration();
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ElementBodyPropertDeclaration) {
					{
					setState(89);
					elementBodyText();
					}
				}

				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TagNameDeclaration || _la==TagNameSpecialDeclaration) {
					{
					{
					setState(92);
					elementDeclaration();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				elementBodyText();
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

	public static class ElementBodyTextContext extends ParserRuleContext {
		public ElementBodyPropertyContext elementBodyProperty() {
			return getRuleContext(ElementBodyPropertyContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(EvaParser.ASSIGN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ElementBodyTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementBodyText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementBodyText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementBodyText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementBodyText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementBodyTextContext elementBodyText() throws RecognitionException {
		ElementBodyTextContext _localctx = new ElementBodyTextContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elementBodyText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			elementBodyProperty();
			setState(102);
			match(ASSIGN);
			setState(103);
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

	public static class ElementBodyPropertyContext extends ParserRuleContext {
		public TerminalNode ElementBodyPropertDeclaration() { return getToken(EvaParser.ElementBodyPropertDeclaration, 0); }
		public ElementBodyPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementBodyProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementBodyProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementBodyProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementBodyProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementBodyPropertyContext elementBodyProperty() throws RecognitionException {
		ElementBodyPropertyContext _localctx = new ElementBodyPropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elementBodyProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ElementBodyPropertDeclaration);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LPAREN() { return getToken(EvaParser.LPAREN, 0); }
		public ElementAttributesContext elementAttributes() {
			return getRuleContext(ElementAttributesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EvaParser.RPAREN, 0); }
		public ElementAttributeListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttributeListDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementAttributeListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementAttributeListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementAttributeListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributeListDeclarationContext elementAttributeListDeclaration() throws RecognitionException {
		ElementAttributeListDeclarationContext _localctx = new ElementAttributeListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elementAttributeListDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(LPAREN);
			setState(108);
			elementAttributes();
			setState(109);
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
		public List<TerminalNode> COMMA() { return getTokens(EvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EvaParser.COMMA, i);
		}
		public ElementAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributesContext elementAttributes() throws RecognitionException {
		ElementAttributesContext _localctx = new ElementAttributesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elementAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			elementAttribute();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(112);
				match(COMMA);
				setState(113);
				elementAttribute();
				}
				}
				setState(118);
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
		public TerminalNode ASSIGN() { return getToken(EvaParser.ASSIGN, 0); }
		public ElementAttributeValueContext elementAttributeValue() {
			return getRuleContext(ElementAttributeValueContext.class,0);
		}
		public ElementAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributeContext elementAttribute() throws RecognitionException {
		ElementAttributeContext _localctx = new ElementAttributeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elementAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			elementAttributeName();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(120);
				match(ASSIGN);
				setState(121);
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
		public TerminalNode TagAttribute() { return getToken(EvaParser.TagAttribute, 0); }
		public ElementAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributeNameContext elementAttributeName() throws RecognitionException {
		ElementAttributeNameContext _localctx = new ElementAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elementAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(TagAttribute);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode StringLiteral() { return getToken(EvaParser.StringLiteral, 0); }
		public ElementAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementAttributeValueContext elementAttributeValue() throws RecognitionException {
		ElementAttributeValueContext _localctx = new ElementAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elementAttributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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

	public static class ElementNameContext extends ParserRuleContext {
		public TerminalNode TagNameDeclaration() { return getToken(EvaParser.TagNameDeclaration, 0); }
		public TerminalNode TagNameSpecialDeclaration() { return getToken(EvaParser.TagNameSpecialDeclaration, 0); }
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elementName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		public TerminalNode StringLiteral() { return getToken(EvaParser.StringLiteral, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0087\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\5\3\62\n\3"+
		"\3\4\3\4\5\4\66\n\4\3\4\5\49\n\4\3\4\3\4\3\5\3\5\5\5?\n\5\3\5\5\5B\n\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\5\bN\n\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\7\nW\n\n\f\n\16\nZ\13\n\3\n\5\n]\n\n\3\n\7\n`\n\n\f\n\16\nc\13"+
		"\n\3\n\5\nf\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\7\16u\n\16\f\16\16\16x\13\16\3\17\3\17\3\17\5\17}\n\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\3\4\2\3\3\6\6\2\u0082\2)\3\2\2\2\4\61\3\2\2\2\6\63"+
		"\3\2\2\2\b<\3\2\2\2\nF\3\2\2\2\fI\3\2\2\2\16K\3\2\2\2\20Q\3\2\2\2\22e"+
		"\3\2\2\2\24g\3\2\2\2\26k\3\2\2\2\30m\3\2\2\2\32q\3\2\2\2\34y\3\2\2\2\36"+
		"~\3\2\2\2 \u0080\3\2\2\2\"\u0082\3\2\2\2$\u0084\3\2\2\2&(\5\4\3\2\'&\3"+
		"\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3"+
		"\3\2\2\2.\62\5\16\b\2/\62\5\6\4\2\60\62\5\b\5\2\61.\3\2\2\2\61/\3\2\2"+
		"\2\61\60\3\2\2\2\62\5\3\2\2\2\63\65\5\"\22\2\64\66\5\30\r\2\65\64\3\2"+
		"\2\2\65\66\3\2\2\2\668\3\2\2\2\679\5\n\6\28\67\3\2\2\289\3\2\2\29:\3\2"+
		"\2\2:;\7\20\2\2;\7\3\2\2\2<>\5\"\22\2=?\5\30\r\2>=\3\2\2\2>?\3\2\2\2?"+
		"A\3\2\2\2@B\5\n\6\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\24\2\2DE\5\f\7\2"+
		"E\t\3\2\2\2FG\7\31\2\2GH\5$\23\2H\13\3\2\2\2IJ\5\4\3\2J\r\3\2\2\2KM\5"+
		"\"\22\2LN\5\30\r\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\5\20\t\2P\17\3\2\2"+
		"\2QR\7\f\2\2RS\5\22\n\2ST\7\r\2\2T\21\3\2\2\2UW\5\4\3\2VU\3\2\2\2WZ\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[]\5\24\13\2\\[\3\2\2\2"+
		"\\]\3\2\2\2]a\3\2\2\2^`\5\4\3\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2bf\3\2\2\2ca\3\2\2\2df\5\24\13\2eX\3\2\2\2ed\3\2\2\2f\23\3\2\2\2gh\5"+
		"\26\f\2hi\7\23\2\2ij\5$\23\2j\25\3\2\2\2kl\7\5\2\2l\27\3\2\2\2mn\7\n\2"+
		"\2no\5\32\16\2op\7\13\2\2p\31\3\2\2\2qv\5\34\17\2rs\7\21\2\2su\5\34\17"+
		"\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\33\3\2\2\2xv\3\2\2\2y|\5\36"+
		"\20\2z{\7\23\2\2{}\5 \21\2|z\3\2\2\2|}\3\2\2\2}\35\3\2\2\2~\177\7\4\2"+
		"\2\177\37\3\2\2\2\u0080\u0081\7\7\2\2\u0081!\3\2\2\2\u0082\u0083\t\2\2"+
		"\2\u0083#\3\2\2\2\u0084\u0085\7\7\2\2\u0085%\3\2\2\2\17)\61\658>AMX\\"+
		"aev|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}