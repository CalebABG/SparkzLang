// Generated from C:/Users/Caleb/IdeaProjects/Eva(Elegant HTML Lang)/Eva/src\Evat.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EvatParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, TAG_NAME=2, TAG_ATTRIBUTE=3, SL_COMMENT=4, ML_COMMENT=5, ATSYM=6, 
		HASHSYM=7, QUESTIONSYM=8, PERCSYM=9, TILDE=10, OPEN_PAREN=11, CLOSE_PAREN=12, 
		COMMA=13, COLON=14, SEMI_COLON=15, OPEN_BRACK=16, CLOSE_BRACK=17, OPEN_BRACE=18, 
		CLOSE_BRACE=19, EQUALSYM=20, GTSYM=21, LTSYM=22, PLUS=23, TIMES=24, DIV=25, 
		MINUS=26, SINGLE_QUOTE_STRING=27, DOUBLE_QUOTE_STRING=28, WS=29;
	public static final int
		RULE_eva = 0, RULE_tagDeclar = 1, RULE_tagContentCompact = 2, RULE_tagContent = 3, 
		RULE_tagAttributeDeclaration = 4, RULE_tagAttributes = 5, RULE_tagAttribute = 6, 
		RULE_tagAttributeValue = 7, RULE_tagScope = 8, RULE_tagAttributeName = 9, 
		RULE_tagText = 10, RULE_string = 11, RULE_evaComment = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"eva", "tagDeclar", "tagContentCompact", "tagContent", "tagAttributeDeclaration", 
			"tagAttributes", "tagAttribute", "tagAttributeValue", "tagScope", "tagAttributeName", 
			"tagText", "string", "evaComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'text'", null, null, null, null, "'@'", "'#'", "'?'", "'%'", "'~'", 
			"'('", "')'", "','", "':'", "';'", "'['", "']'", "'{'", "'}'", "'='", 
			"'>'", "'<'", "'+'", "'*'", "'/'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "TAG_NAME", "TAG_ATTRIBUTE", "SL_COMMENT", "ML_COMMENT", 
			"ATSYM", "HASHSYM", "QUESTIONSYM", "PERCSYM", "TILDE", "OPEN_PAREN", 
			"CLOSE_PAREN", "COMMA", "COLON", "SEMI_COLON", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BRACE", "CLOSE_BRACE", "EQUALSYM", "GTSYM", "LTSYM", "PLUS", "TIMES", 
			"DIV", "MINUS", "SINGLE_QUOTE_STRING", "DOUBLE_QUOTE_STRING", "WS"
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
	public String getGrammarFileName() { return "Evat.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EvatParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EvaContext extends ParserRuleContext {
		public List<TagDeclarContext> tagDeclar() {
			return getRuleContexts(TagDeclarContext.class);
		}
		public TagDeclarContext tagDeclar(int i) {
			return getRuleContext(TagDeclarContext.class,i);
		}
		public List<EvaCommentContext> evaComment() {
			return getRuleContexts(EvaCommentContext.class);
		}
		public EvaCommentContext evaComment(int i) {
			return getRuleContext(EvaCommentContext.class,i);
		}
		public EvaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterEva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitEva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitEva(this);
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
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TAG_NAME) | (1L << ML_COMMENT) | (1L << SINGLE_QUOTE_STRING) | (1L << DOUBLE_QUOTE_STRING))) != 0)) {
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_NAME:
				case SINGLE_QUOTE_STRING:
				case DOUBLE_QUOTE_STRING:
					{
					setState(26);
					tagDeclar();
					}
					break;
				case ML_COMMENT:
					{
					setState(27);
					evaComment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32);
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

	public static class TagDeclarContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(EvatParser.TAG_NAME, 0); }
		public TagScopeContext tagScope() {
			return getRuleContext(TagScopeContext.class,0);
		}
		public TagAttributeDeclarationContext tagAttributeDeclaration() {
			return getRuleContext(TagAttributeDeclarationContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(EvatParser.SEMI_COLON, 0); }
		public TerminalNode COLON() { return getToken(EvatParser.COLON, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode GTSYM() { return getToken(EvatParser.GTSYM, 0); }
		public TagContentCompactContext tagContentCompact() {
			return getRuleContext(TagContentCompactContext.class,0);
		}
		public TagDeclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagDeclar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterTagDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitTagDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitTagDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagDeclarContext tagDeclar() throws RecognitionException {
		TagDeclarContext _localctx = new TagDeclarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tagDeclar);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(TAG_NAME);
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(34);
					tagAttributeDeclaration();
					}
				}

				setState(37);
				tagScope();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(TAG_NAME);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(39);
					tagAttributeDeclaration();
					}
				}

				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(42);
					match(COLON);
					setState(43);
					string();
					}
				}

				setState(46);
				match(SEMI_COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(TAG_NAME);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(48);
					tagAttributeDeclaration();
					}
				}

				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(51);
					match(COLON);
					setState(52);
					string();
					}
				}

				setState(55);
				match(GTSYM);
				setState(56);
				tagContentCompact();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				string();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(58);
					tagAttributeDeclaration();
					}
				}

				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(61);
					tagScope();
					}
					break;
				case 2:
					{
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_BRACE) {
						{
						setState(62);
						tagScope();
						}
					}

					setState(65);
					match(SEMI_COLON);
					}
					break;
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

	public static class TagContentCompactContext extends ParserRuleContext {
		public TagDeclarContext tagDeclar() {
			return getRuleContext(TagDeclarContext.class,0);
		}
		public TagContentCompactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagContentCompact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterTagContentCompact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitTagContentCompact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitTagContentCompact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContentCompactContext tagContentCompact() throws RecognitionException {
		TagContentCompactContext _localctx = new TagContentCompactContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tagContentCompact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			tagDeclar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagContentContext extends ParserRuleContext {
		public List<TagDeclarContext> tagDeclar() {
			return getRuleContexts(TagDeclarContext.class);
		}
		public TagDeclarContext tagDeclar(int i) {
			return getRuleContext(TagDeclarContext.class,i);
		}
		public List<EvaCommentContext> evaComment() {
			return getRuleContexts(EvaCommentContext.class);
		}
		public EvaCommentContext evaComment(int i) {
			return getRuleContext(EvaCommentContext.class,i);
		}
		public List<TagTextContext> tagText() {
			return getRuleContexts(TagTextContext.class);
		}
		public TagTextContext tagText(int i) {
			return getRuleContext(TagTextContext.class,i);
		}
		public TagContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterTagContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitTagContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitTagContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContentContext tagContent() throws RecognitionException {
		TagContentContext _localctx = new TagContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tagContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TAG_NAME) | (1L << ML_COMMENT) | (1L << SINGLE_QUOTE_STRING) | (1L << DOUBLE_QUOTE_STRING))) != 0)) {
				{
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_NAME:
				case SINGLE_QUOTE_STRING:
				case DOUBLE_QUOTE_STRING:
					{
					setState(72);
					tagDeclar();
					}
					break;
				case ML_COMMENT:
					{
					setState(73);
					evaComment();
					}
					break;
				case T__0:
					{
					setState(74);
					tagText();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79);
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

	public static class TagAttributeDeclarationContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(EvatParser.OPEN_PAREN, 0); }
		public TagAttributesContext tagAttributes() {
			return getRuleContext(TagAttributesContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(EvatParser.CLOSE_PAREN, 0); }
		public TagAttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAttributeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterTagAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitTagAttributeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitTagAttributeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttributeDeclarationContext tagAttributeDeclaration() throws RecognitionException {
		TagAttributeDeclarationContext _localctx = new TagAttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tagAttributeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(OPEN_PAREN);
			setState(81);
			tagAttributes();
			setState(82);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagAttributesContext extends ParserRuleContext {
		public List<TagAttributeContext> tagAttribute() {
			return getRuleContexts(TagAttributeContext.class);
		}
		public TagAttributeContext tagAttribute(int i) {
			return getRuleContext(TagAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EvatParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EvatParser.COMMA, i);
		}
		public TagAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterTagAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitTagAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitTagAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttributesContext tagAttributes() throws RecognitionException {
		TagAttributesContext _localctx = new TagAttributesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tagAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			tagAttribute();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				tagAttribute();
				}
				}
				setState(91);
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
		public TerminalNode EQUALSYM() { return getToken(EvatParser.EQUALSYM, 0); }
		public TagAttributeValueContext tagAttributeValue() {
			return getRuleContext(TagAttributeValueContext.class,0);
		}
		public TagAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterTagAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitTagAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitTagAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttributeContext tagAttribute() throws RecognitionException {
		TagAttributeContext _localctx = new TagAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tagAttribute);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				tagAttributeName();
				setState(93);
				match(EQUALSYM);
				setState(94);
				tagAttributeValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				tagAttributeName();
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

	public static class TagAttributeValueContext extends ParserRuleContext {
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(EvatParser.DOUBLE_QUOTE_STRING, 0); }
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(EvatParser.SINGLE_QUOTE_STRING, 0); }
		public TagAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterTagAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitTagAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitTagAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttributeValueContext tagAttributeValue() throws RecognitionException {
		TagAttributeValueContext _localctx = new TagAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tagAttributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE_STRING || _la==DOUBLE_QUOTE_STRING) ) {
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

	public static class TagScopeContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(EvatParser.OPEN_BRACE, 0); }
		public TagContentContext tagContent() {
			return getRuleContext(TagContentContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(EvatParser.CLOSE_BRACE, 0); }
		public TagScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterTagScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitTagScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitTagScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagScopeContext tagScope() throws RecognitionException {
		TagScopeContext _localctx = new TagScopeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tagScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(OPEN_BRACE);
			setState(102);
			tagContent();
			setState(103);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TAG_ATTRIBUTE() { return getToken(EvatParser.TAG_ATTRIBUTE, 0); }
		public TagAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterTagAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitTagAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitTagAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttributeNameContext tagAttributeName() throws RecognitionException {
		TagAttributeNameContext _localctx = new TagAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tagAttributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(TAG_ATTRIBUTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagTextContext extends ParserRuleContext {
		public TerminalNode EQUALSYM() { return getToken(EvatParser.EQUALSYM, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TagTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterTagText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitTagText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitTagText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagTextContext tagText() throws RecognitionException {
		TagTextContext _localctx = new TagTextContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tagText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__0);
			setState(108);
			match(EQUALSYM);
			setState(109);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode SINGLE_QUOTE_STRING() { return getToken(EvatParser.SINGLE_QUOTE_STRING, 0); }
		public TerminalNode DOUBLE_QUOTE_STRING() { return getToken(EvatParser.DOUBLE_QUOTE_STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTE_STRING || _la==DOUBLE_QUOTE_STRING) ) {
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

	public static class EvaCommentContext extends ParserRuleContext {
		public TerminalNode ML_COMMENT() { return getToken(EvatParser.ML_COMMENT, 0); }
		public EvaCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).enterEvaComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EvatListener ) ((EvatListener)listener).exitEvaComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EvatVisitor ) return ((EvatVisitor<? extends T>)visitor).visitEvaComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvaCommentContext evaComment() throws RecognitionException {
		EvaCommentContext _localctx = new EvaCommentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_evaComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ML_COMMENT);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37v\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\3\3\3\5"+
		"\3&\n\3\3\3\3\3\3\3\5\3+\n\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\5\3\64\n\3\3"+
		"\3\3\3\5\38\n\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\3\3\3\5\3B\n\3\3\3\5\3E\n\3"+
		"\5\3G\n\3\3\4\3\4\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\35\36\2z\2 \3\2\2\2\4"+
		"F\3\2\2\2\6H\3\2\2\2\bO\3\2\2\2\nR\3\2\2\2\fV\3\2\2\2\16c\3\2\2\2\20e"+
		"\3\2\2\2\22g\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30q\3\2\2\2\32s\3\2\2\2\34"+
		"\37\5\4\3\2\35\37\5\32\16\2\36\34\3\2\2\2\36\35\3\2\2\2\37\"\3\2\2\2 "+
		"\36\3\2\2\2 !\3\2\2\2!\3\3\2\2\2\" \3\2\2\2#%\7\4\2\2$&\5\n\6\2%$\3\2"+
		"\2\2%&\3\2\2\2&\'\3\2\2\2\'G\5\22\n\2(*\7\4\2\2)+\5\n\6\2*)\3\2\2\2*+"+
		"\3\2\2\2+.\3\2\2\2,-\7\20\2\2-/\5\30\r\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2"+
		"\2\60G\7\21\2\2\61\63\7\4\2\2\62\64\5\n\6\2\63\62\3\2\2\2\63\64\3\2\2"+
		"\2\64\67\3\2\2\2\65\66\7\20\2\2\668\5\30\r\2\67\65\3\2\2\2\678\3\2\2\2"+
		"89\3\2\2\29:\7\27\2\2:G\5\6\4\2;=\5\30\r\2<>\5\n\6\2=<\3\2\2\2=>\3\2\2"+
		"\2>D\3\2\2\2?E\5\22\n\2@B\5\22\n\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CE\7\21"+
		"\2\2D?\3\2\2\2DA\3\2\2\2EG\3\2\2\2F#\3\2\2\2F(\3\2\2\2F\61\3\2\2\2F;\3"+
		"\2\2\2G\5\3\2\2\2HI\5\4\3\2I\7\3\2\2\2JN\5\4\3\2KN\5\32\16\2LN\5\26\f"+
		"\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\t\3\2"+
		"\2\2QO\3\2\2\2RS\7\r\2\2ST\5\f\7\2TU\7\16\2\2U\13\3\2\2\2V[\5\16\b\2W"+
		"X\7\17\2\2XZ\5\16\b\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\r\3\2"+
		"\2\2][\3\2\2\2^_\5\24\13\2_`\7\26\2\2`a\5\20\t\2ad\3\2\2\2bd\5\24\13\2"+
		"c^\3\2\2\2cb\3\2\2\2d\17\3\2\2\2ef\t\2\2\2f\21\3\2\2\2gh\7\24\2\2hi\5"+
		"\b\5\2ij\7\25\2\2j\23\3\2\2\2kl\7\5\2\2l\25\3\2\2\2mn\7\3\2\2no\7\26\2"+
		"\2op\5\30\r\2p\27\3\2\2\2qr\t\2\2\2r\31\3\2\2\2st\7\7\2\2t\33\3\2\2\2"+
		"\21\36 %*.\63\67=ADFMO[c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}