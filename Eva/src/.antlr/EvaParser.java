// Generated from c:\Users\flame\Documents\GitHub\Eva-ElegantMarkup\Eva\src\EvaParser.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
		RULE_elementBody = 10, RULE_elementAttributeListDeclaration = 11, RULE_elementAttributes = 12, 
		RULE_elementAttribute = 13, RULE_elementAttributeName = 14, RULE_elementAttributeValue = 15, 
		RULE_string = 16, RULE_tagName = 17;
	public static final String[] ruleNames = {
		"eva", "elementDeclaration", "elementNormalDeclaration", "elementCompactDeclaration", 
		"elementCompactContentDeclaration", "elementCompactStringDeclaration", 
		"elementCompactContent", "elementBodyContent", "elementBodyText", "elementBodyProperty", 
		"elementBody", "elementAttributeListDeclaration", "elementAttributes", 
		"elementAttribute", "elementAttributeName", "elementAttributeValue", "string", 
		"tagName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'@'", "'#'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", 
		"'::'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TagAttribute", "TagNameDeclaration", "ElementBodyPropertDeclaration", 
		"TagNameSpecialDeclaration", "StringLiteral", "AT", "POUND", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
		"BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "WS", "COMMENT", 
		"LINE_COMMENT"
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
	}
	public static class NormalElementDeclarationContext extends ElementDeclarationContext {
		public ElementNormalDeclarationContext elementNormalDeclaration() {
			return getRuleContext(ElementNormalDeclarationContext.class,0);
		}
		public NormalElementDeclarationContext(ElementDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class CompactElementDeclarationContext extends ElementDeclarationContext {
		public ElementCompactDeclarationContext elementCompactDeclaration() {
			return getRuleContext(ElementCompactDeclarationContext.class,0);
		}
		public CompactElementDeclarationContext(ElementDeclarationContext ctx) { copyFrom(ctx); }
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
		public ElementAttributeListDeclarationContext elementAttributeListDeclaration() {
			return getRuleContext(ElementAttributeListDeclarationContext.class,0);
		}
		public ElementNormalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementNormalDeclaration; }
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
				elementAttributeListDeclaration();
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
				elementAttributeListDeclaration();
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
				elementAttributeListDeclaration();
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ElementCompactStringDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementCompactStringDeclaration; }
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ElementBodyTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementBodyText; }
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

	public static class ElementBodyContext extends ParserRuleContext {
		public ElementBodyContentContext elementBodyContent() {
			return getRuleContext(ElementBodyContentContext.class,0);
		}
		public ElementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementBody; }
	}

	public final ElementBodyContext elementBody() throws RecognitionException {
		ElementBodyContext _localctx = new ElementBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elementBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(LBRACE);
			setState(104);
			elementBodyContent();
			setState(105);
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

	public static class ElementAttributeListDeclarationContext extends ParserRuleContext {
		public ElementAttributesContext elementAttributes() {
			return getRuleContext(ElementAttributesContext.class,0);
		}
		public ElementAttributeListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttributeListDeclaration; }
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
		public ElementAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttributes; }
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
		public ElementAttributeValueContext elementAttributeValue() {
			return getRuleContext(ElementAttributeValueContext.class,0);
		}
		public ElementAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementAttribute; }
	}

	public final ElementAttributeContext elementAttribute() throws RecognitionException {
		ElementAttributeContext _localctx = new ElementAttributeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elementAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			elementAttributeName();
			setState(120);
			match(ASSIGN);
			setState(121);
			elementAttributeValue();
			}
		}
		catch (RecognitionException re) {
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
	}

	public final ElementAttributeNameContext elementAttributeName() throws RecognitionException {
		ElementAttributeNameContext _localctx = new ElementAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elementAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
	}

	public final ElementAttributeValueContext elementAttributeValue() throws RecognitionException {
		ElementAttributeValueContext _localctx = new ElementAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elementAttributeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(EvaParser.StringLiteral, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
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
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\7\16u\n\16\f\16\16\16x\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\3\4\2\4\4\6\6\2\u0080\2)\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2"+
		"\2\b9\3\2\2\2\nB\3\2\2\2\fL\3\2\2\2\16O\3\2\2\2\20a\3\2\2\2\22c\3\2\2"+
		"\2\24g\3\2\2\2\26i\3\2\2\2\30m\3\2\2\2\32q\3\2\2\2\34y\3\2\2\2\36}\3\2"+
		"\2\2 \177\3\2\2\2\"\u0081\3\2\2\2$\u0083\3\2\2\2&(\5\4\3\2\'&\3\2\2\2"+
		"(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\2\2\3-\3\3\2\2"+
		"\2.\62\5\6\4\2/\62\5\b\5\2\60\62\5\n\6\2\61.\3\2\2\2\61/\3\2\2\2\61\60"+
		"\3\2\2\2\62\5\3\2\2\2\63\65\5$\23\2\64\66\5\30\r\2\65\64\3\2\2\2\65\66"+
		"\3\2\2\2\66\67\3\2\2\2\678\5\26\f\28\7\3\2\2\29;\5$\23\2:<\5\30\r\2;:"+
		"\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\f\7\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@"+
		"A\7\20\2\2A\t\3\2\2\2BD\5$\23\2CE\5\30\r\2DC\3\2\2\2DE\3\2\2\2EG\3\2\2"+
		"\2FH\5\f\7\2GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\24\2\2JK\5\16\b\2K\13\3"+
		"\2\2\2LM\7\31\2\2MN\5\"\22\2N\r\3\2\2\2OP\5\4\3\2P\17\3\2\2\2QS\5\4\3"+
		"\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WY\5\22"+
		"\n\2XW\3\2\2\2XY\3\2\2\2Y]\3\2\2\2Z\\\5\4\3\2[Z\3\2\2\2\\_\3\2\2\2][\3"+
		"\2\2\2]^\3\2\2\2^b\3\2\2\2_]\3\2\2\2`b\5\22\n\2aT\3\2\2\2a`\3\2\2\2b\21"+
		"\3\2\2\2cd\5\24\13\2de\7\23\2\2ef\5\"\22\2f\23\3\2\2\2gh\7\5\2\2h\25\3"+
		"\2\2\2ij\7\f\2\2jk\5\20\t\2kl\7\r\2\2l\27\3\2\2\2mn\7\n\2\2no\5\32\16"+
		"\2op\7\13\2\2p\31\3\2\2\2qv\5\34\17\2rs\7\21\2\2su\5\34\17\2tr\3\2\2\2"+
		"ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\33\3\2\2\2xv\3\2\2\2yz\5\36\20\2z{\7\23"+
		"\2\2{|\5 \21\2|\35\3\2\2\2}~\7\3\2\2~\37\3\2\2\2\177\u0080\7\7\2\2\u0080"+
		"!\3\2\2\2\u0081\u0082\7\7\2\2\u0082#\3\2\2\2\u0083\u0084\t\2\2\2\u0084"+
		"%\3\2\2\2\16)\61\65;>DGTX]av";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}