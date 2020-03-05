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
		TagAttribute=1, TagNameDeclaration=2, ElementBodyPropertDeclaration=3, 
		TagNameSpecialDeclaration=4, StringLiteral=5, AT=6, POUND=7, LPAREN=8, 
		RPAREN=9, LBRACE=10, RBRACE=11, LBRACK=12, RBRACK=13, SEMI=14, COMMA=15, 
		DOT=16, ASSIGN=17, GT=18, LT=19, BANG=20, TILDE=21, QUESTION=22, COLON=23, 
		EQUAL=24, LE=25, GE=26, NOTEQUAL=27, AND=28, OR=29, INC=30, DEC=31, ADD=32, 
		SUB=33, MUL=34, DIV=35, BITAND=36, BITOR=37, CARET=38, MOD=39, ARROW=40, 
		COLONCOLON=41, WS=42, COMMENT=43, LINE_COMMENT=44;
	public static final int
		RULE_eva = 0, RULE_elementDeclaration = 1, RULE_elementNormalDeclaration = 2, 
		RULE_elementCompactDeclaration = 3, RULE_elementCompactContentDeclaration = 4, 
		RULE_elementCompactStringDeclaration = 5, RULE_elementCompactContent = 6, 
		RULE_elementBodyContent = 7, RULE_elementBodyText = 8, RULE_elementBodyProperty = 9, 
		RULE_tagAttributeDeclaration = 10, RULE_tagAttributeList = 11, RULE_tagAttribute = 12, 
		RULE_tagAttributeValue = 13, RULE_elementBody = 14, RULE_tagAttributeName = 15, 
		RULE_string = 16, RULE_tagName = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"eva", "elementDeclaration", "elementNormalDeclaration", "elementCompactDeclaration", 
			"elementCompactContentDeclaration", "elementCompactStringDeclaration", 
			"elementCompactContent", "elementBodyContent", "elementBodyText", "elementBodyProperty", 
			"tagAttributeDeclaration", "tagAttributeList", "tagAttribute", "tagAttributeValue", 
			"elementBody", "tagAttributeName", "string", "tagName"
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
			null, "TagAttribute", "TagNameDeclaration", "ElementBodyPropertDeclaration", 
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
	public static class CompactElementContentDeclarationContext extends ElementDeclarationContext {
		public ElementCompactContentDeclarationContext elementCompactContentDeclaration() {
			return getRuleContext(ElementCompactContentDeclarationContext.class,0);
		}
		public CompactElementContentDeclarationContext(ElementDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterCompactElementContentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitCompactElementContentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitCompactElementContentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalElementDeclarationContext extends ElementDeclarationContext {
		public ElementNormalDeclarationContext elementNormalDeclaration() {
			return getRuleContext(ElementNormalDeclarationContext.class,0);
		}
		public NormalElementDeclarationContext(ElementDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterNormalElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitNormalElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitNormalElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompactElementDeclarationContext extends ElementDeclarationContext {
		public ElementCompactDeclarationContext elementCompactDeclaration() {
			return getRuleContext(ElementCompactDeclarationContext.class,0);
		}
		public CompactElementDeclarationContext(ElementDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterCompactElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitCompactElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitCompactElementDeclaration(this);
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
				_localctx = new NormalElementDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				elementNormalDeclaration();
				}
				break;
			case 2:
				_localctx = new CompactElementDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				elementCompactDeclaration();
				}
				break;
			case 3:
				_localctx = new CompactElementContentDeclarationContext(_localctx);
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

	public static class ElementNormalDeclarationContext extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public ElementBodyContext elementBody() {
			return getRuleContext(ElementBodyContext.class,0);
		}
		public TagAttributeDeclarationContext tagAttributeDeclaration() {
			return getRuleContext(TagAttributeDeclarationContext.class,0);
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
		enterRule(_localctx, 4, RULE_elementNormalDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			tagName();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(50);
				tagAttributeDeclaration();
				}
			}

			setState(53);
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

	public static class ElementCompactDeclarationContext extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EvaParser.SEMI, 0); }
		public TagAttributeDeclarationContext tagAttributeDeclaration() {
			return getRuleContext(TagAttributeDeclarationContext.class,0);
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
		enterRule(_localctx, 6, RULE_elementCompactDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			tagName();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(56);
				tagAttributeDeclaration();
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(59);
				elementCompactStringDeclaration();
				}
			}

			setState(62);
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
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode GT() { return getToken(EvaParser.GT, 0); }
		public ElementCompactContentContext elementCompactContent() {
			return getRuleContext(ElementCompactContentContext.class,0);
		}
		public TagAttributeDeclarationContext tagAttributeDeclaration() {
			return getRuleContext(TagAttributeDeclarationContext.class,0);
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
		enterRule(_localctx, 8, RULE_elementCompactContentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			tagName();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(65);
				tagAttributeDeclaration();
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(68);
				elementCompactStringDeclaration();
				}
			}

			setState(71);
			match(GT);
			setState(72);
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
		enterRule(_localctx, 10, RULE_elementCompactStringDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(COLON);
			setState(75);
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
		enterRule(_localctx, 12, RULE_elementCompactContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
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
		enterRule(_localctx, 14, RULE_elementBodyContent);
		int _la;
		try {
			int _alt;
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(79);
						elementDeclaration();
						}
						} 
					}
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ElementBodyPropertDeclaration) {
					{
					setState(85);
					elementBodyText();
					}
				}

				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TagNameDeclaration || _la==TagNameSpecialDeclaration) {
					{
					{
					setState(88);
					elementDeclaration();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
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
		enterRule(_localctx, 16, RULE_elementBodyText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			elementBodyProperty();
			setState(98);
			match(ASSIGN);
			setState(99);
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
		enterRule(_localctx, 18, RULE_elementBodyProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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

	public static class TagAttributeDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EvaParser.LPAREN, 0); }
		public TagAttributeListContext tagAttributeList() {
			return getRuleContext(TagAttributeListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EvaParser.RPAREN, 0); }
		public TagAttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAttributeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterTagAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitTagAttributeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitTagAttributeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttributeDeclarationContext tagAttributeDeclaration() throws RecognitionException {
		TagAttributeDeclarationContext _localctx = new TagAttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tagAttributeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(LPAREN);
			setState(104);
			tagAttributeList();
			setState(105);
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

	public static class TagAttributeListContext extends ParserRuleContext {
		public List<TagAttributeContext> tagAttribute() {
			return getRuleContexts(TagAttributeContext.class);
		}
		public TagAttributeContext tagAttribute(int i) {
			return getRuleContext(TagAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EvaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EvaParser.COMMA, i);
		}
		public TagAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterTagAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitTagAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitTagAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttributeListContext tagAttributeList() throws RecognitionException {
		TagAttributeListContext _localctx = new TagAttributeListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tagAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			tagAttribute();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108);
				match(COMMA);
				setState(109);
				tagAttribute();
				}
				}
				setState(114);
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

	public static class TagAttributeContext extends ParserRuleContext {
		public TagAttributeNameContext tagAttributeName() {
			return getRuleContext(TagAttributeNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(EvaParser.ASSIGN, 0); }
		public TagAttributeValueContext tagAttributeValue() {
			return getRuleContext(TagAttributeValueContext.class,0);
		}
		public TagAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterTagAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitTagAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitTagAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttributeContext tagAttribute() throws RecognitionException {
		TagAttributeContext _localctx = new TagAttributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tagAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			tagAttributeName();
			setState(116);
			match(ASSIGN);
			setState(117);
			tagAttributeValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagAttributeValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(EvaParser.StringLiteral, 0); }
		public TagAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterTagAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitTagAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitTagAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttributeValueContext tagAttributeValue() throws RecognitionException {
		TagAttributeValueContext _localctx = new TagAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tagAttributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		enterRule(_localctx, 28, RULE_elementBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(LBRACE);
			setState(122);
			elementBodyContent();
			setState(123);
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

	public static class TagAttributeNameContext extends ParserRuleContext {
		public TerminalNode TagAttribute() { return getToken(EvaParser.TagAttribute, 0); }
		public TagAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterTagAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitTagAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitTagAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttributeNameContext tagAttributeName() throws RecognitionException {
		TagAttributeNameContext _localctx = new TagAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tagAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
		enterRule(_localctx, 32, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode TagNameDeclaration() { return getToken(EvaParser.TagNameDeclaration, 0); }
		public TerminalNode TagNameSpecialDeclaration() { return getToken(EvaParser.TagNameSpecialDeclaration, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvaParserListener ) ((EvaParserListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvaParserVisitor ) return ((EvaParserVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tagName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0086\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\5\3\62\n\3"+
		"\3\4\3\4\5\4\66\n\4\3\4\3\4\3\5\3\5\5\5<\n\5\3\5\5\5?\n\5\3\5\3\5\3\6"+
		"\3\6\5\6E\n\6\3\6\5\6H\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\7\tS\n"+
		"\t\f\t\16\tV\13\t\3\t\5\tY\n\t\3\t\7\t\\\n\t\f\t\16\t_\13\t\3\t\5\tb\n"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\rq\n\r\f\r"+
		"\16\rt\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\3\4\2\4\4\6\6\2\u0080\2)\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b9\3"+
		"\2\2\2\nB\3\2\2\2\fL\3\2\2\2\16O\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24g\3"+
		"\2\2\2\26i\3\2\2\2\30m\3\2\2\2\32u\3\2\2\2\34y\3\2\2\2\36{\3\2\2\2 \177"+
		"\3\2\2\2\"\u0081\3\2\2\2$\u0083\3\2\2\2&(\5\4\3\2\'&\3\2\2\2(+\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3\2\2\2.\62\5\6"+
		"\4\2/\62\5\b\5\2\60\62\5\n\6\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62"+
		"\5\3\2\2\2\63\65\5$\23\2\64\66\5\26\f\2\65\64\3\2\2\2\65\66\3\2\2\2\66"+
		"\67\3\2\2\2\678\5\36\20\28\7\3\2\2\29;\5$\23\2:<\5\26\f\2;:\3\2\2\2;<"+
		"\3\2\2\2<>\3\2\2\2=?\5\f\7\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\20\2\2"+
		"A\t\3\2\2\2BD\5$\23\2CE\5\26\f\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\5\f\7"+
		"\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\24\2\2JK\5\16\b\2K\13\3\2\2\2LM\7"+
		"\31\2\2MN\5\"\22\2N\r\3\2\2\2OP\5\4\3\2P\17\3\2\2\2QS\5\4\3\2RQ\3\2\2"+
		"\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WY\5\22\n\2XW\3\2"+
		"\2\2XY\3\2\2\2Y]\3\2\2\2Z\\\5\4\3\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^b\3\2\2\2_]\3\2\2\2`b\5\22\n\2aT\3\2\2\2a`\3\2\2\2b\21\3\2\2\2"+
		"cd\5\24\13\2de\7\23\2\2ef\5\"\22\2f\23\3\2\2\2gh\7\5\2\2h\25\3\2\2\2i"+
		"j\7\n\2\2jk\5\30\r\2kl\7\13\2\2l\27\3\2\2\2mr\5\32\16\2no\7\21\2\2oq\5"+
		"\32\16\2pn\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\31\3\2\2\2tr\3\2\2\2"+
		"uv\5 \21\2vw\7\23\2\2wx\5\34\17\2x\33\3\2\2\2yz\7\7\2\2z\35\3\2\2\2{|"+
		"\7\f\2\2|}\5\20\t\2}~\7\r\2\2~\37\3\2\2\2\177\u0080\7\3\2\2\u0080!\3\2"+
		"\2\2\u0081\u0082\7\7\2\2\u0082#\3\2\2\2\u0083\u0084\t\2\2\2\u0084%\3\2"+
		"\2\2\16)\61\65;>DGTX]ar";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}