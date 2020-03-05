// Generated from C:/Users/flame/Documents/GitHub/Eva-ElegantMarkup/Eva/src\EvaLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EvaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TagAttribute=1, TagNameDeclaration=2, ElementBodyPropertDeclaration=3, 
		TagNameSpecialDeclaration=4, StringLiteral=5, ATSYM=6, HASHSYM=7, LPAREN=8, 
		RPAREN=9, LBRACE=10, RBRACE=11, LBRACK=12, RBRACK=13, SEMI=14, COMMA=15, 
		DOT=16, ASSIGN=17, GT=18, LT=19, BANG=20, TILDE=21, QUESTION=22, COLON=23, 
		EQUAL=24, LE=25, GE=26, NOTEQUAL=27, AND=28, OR=29, INC=30, DEC=31, ADD=32, 
		SUB=33, MUL=34, DIV=35, BITAND=36, BITOR=37, CARET=38, MOD=39, ARROW=40, 
		COLONCOLON=41, WS=42, COMMENT=43, LINE_COMMENT=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TagAttribute", "TagNameDeclaration", "ElementBodyPropertDeclaration", 
			"TagNameSpecialDeclaration", "StringLiteral", "ATSYM", "HASHSYM", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "StringCharacters", 
			"StringCharacter", "EscapeSequence", "TagNameStart", "TagNamePart", "Digit", 
			"WS", "COMMENT", "LINE_COMMENT"
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
			"TagNameSpecialDeclaration", "StringLiteral", "ATSYM", "HASHSYM", "LPAREN", 
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


	public EvaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EvaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u010c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\4\3\4\3\4\7\4u\n\4\f\4\16\4x\13"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u0080\n\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\6+\u00d7\n+\r+\16"+
		"+\u00d8\3,\3,\5,\u00dd\n,\3-\3-\3-\3.\5.\u00e3\n.\3/\3/\3/\3/\5/\u00e9"+
		"\n/\3\60\3\60\3\61\6\61\u00ee\n\61\r\61\16\61\u00ef\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\7\62\u00f8\n\62\f\62\16\62\u00fb\13\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\7\63\u0106\n\63\f\63\16\63\u0109\13\63\3\63"+
		"\3\63\3\u00f9\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W\2Y\2[\2]\2_\2a,c-e"+
		".\3\2\n\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvv\t\2C\\c|\u2072\u2191\u2c02"+
		"\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\4\2/\60aa\5\2\u00b9\u00b9\u0302"+
		"\u0371\u2041\u2042\3\2\62;\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0110\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2a"+
		"\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5j\3\2\2\2\7q\3\2\2\2\ty\3\2"+
		"\2\2\13}\3\2\2\2\r\u0083\3\2\2\2\17\u0085\3\2\2\2\21\u0087\3\2\2\2\23"+
		"\u0089\3\2\2\2\25\u008b\3\2\2\2\27\u008d\3\2\2\2\31\u008f\3\2\2\2\33\u0091"+
		"\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2!\u0097\3\2\2\2#\u0099\3\2\2"+
		"\2%\u009b\3\2\2\2\'\u009d\3\2\2\2)\u009f\3\2\2\2+\u00a1\3\2\2\2-\u00a3"+
		"\3\2\2\2/\u00a5\3\2\2\2\61\u00a7\3\2\2\2\63\u00aa\3\2\2\2\65\u00ad\3\2"+
		"\2\2\67\u00b0\3\2\2\29\u00b3\3\2\2\2;\u00b6\3\2\2\2=\u00b9\3\2\2\2?\u00bc"+
		"\3\2\2\2A\u00bf\3\2\2\2C\u00c1\3\2\2\2E\u00c3\3\2\2\2G\u00c5\3\2\2\2I"+
		"\u00c7\3\2\2\2K\u00c9\3\2\2\2M\u00cb\3\2\2\2O\u00cd\3\2\2\2Q\u00cf\3\2"+
		"\2\2S\u00d2\3\2\2\2U\u00d6\3\2\2\2W\u00dc\3\2\2\2Y\u00de\3\2\2\2[\u00e2"+
		"\3\2\2\2]\u00e8\3\2\2\2_\u00ea\3\2\2\2a\u00ed\3\2\2\2c\u00f3\3\2\2\2e"+
		"\u0101\3\2\2\2gh\5\r\7\2hi\5\5\3\2i\4\3\2\2\2jn\5[.\2km\5]/\2lk\3\2\2"+
		"\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\6\3\2\2\2pn\3\2\2\2qr\7<\2\2rv\5[.\2"+
		"su\5]/\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\b\3\2\2\2xv\3\2\2\2"+
		"yz\7b\2\2z{\5\5\3\2{|\7b\2\2|\n\3\2\2\2}\177\7$\2\2~\u0080\5U+\2\177~"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7$\2\2\u0082"+
		"\f\3\2\2\2\u0083\u0084\7B\2\2\u0084\16\3\2\2\2\u0085\u0086\7%\2\2\u0086"+
		"\20\3\2\2\2\u0087\u0088\7*\2\2\u0088\22\3\2\2\2\u0089\u008a\7+\2\2\u008a"+
		"\24\3\2\2\2\u008b\u008c\7}\2\2\u008c\26\3\2\2\2\u008d\u008e\7\177\2\2"+
		"\u008e\30\3\2\2\2\u008f\u0090\7]\2\2\u0090\32\3\2\2\2\u0091\u0092\7_\2"+
		"\2\u0092\34\3\2\2\2\u0093\u0094\7=\2\2\u0094\36\3\2\2\2\u0095\u0096\7"+
		".\2\2\u0096 \3\2\2\2\u0097\u0098\7\60\2\2\u0098\"\3\2\2\2\u0099\u009a"+
		"\7?\2\2\u009a$\3\2\2\2\u009b\u009c\7@\2\2\u009c&\3\2\2\2\u009d\u009e\7"+
		">\2\2\u009e(\3\2\2\2\u009f\u00a0\7#\2\2\u00a0*\3\2\2\2\u00a1\u00a2\7\u0080"+
		"\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7A\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7<\2"+
		"\2\u00a6\60\3\2\2\2\u00a7\u00a8\7?\2\2\u00a8\u00a9\7?\2\2\u00a9\62\3\2"+
		"\2\2\u00aa\u00ab\7>\2\2\u00ab\u00ac\7?\2\2\u00ac\64\3\2\2\2\u00ad\u00ae"+
		"\7@\2\2\u00ae\u00af\7?\2\2\u00af\66\3\2\2\2\u00b0\u00b1\7#\2\2\u00b1\u00b2"+
		"\7?\2\2\u00b28\3\2\2\2\u00b3\u00b4\7(\2\2\u00b4\u00b5\7(\2\2\u00b5:\3"+
		"\2\2\2\u00b6\u00b7\7~\2\2\u00b7\u00b8\7~\2\2\u00b8<\3\2\2\2\u00b9\u00ba"+
		"\7-\2\2\u00ba\u00bb\7-\2\2\u00bb>\3\2\2\2\u00bc\u00bd\7/\2\2\u00bd\u00be"+
		"\7/\2\2\u00be@\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0B\3\2\2\2\u00c1\u00c2\7"+
		"/\2\2\u00c2D\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4F\3\2\2\2\u00c5\u00c6\7\61"+
		"\2\2\u00c6H\3\2\2\2\u00c7\u00c8\7(\2\2\u00c8J\3\2\2\2\u00c9\u00ca\7~\2"+
		"\2\u00caL\3\2\2\2\u00cb\u00cc\7`\2\2\u00ccN\3\2\2\2\u00cd\u00ce\7\'\2"+
		"\2\u00ceP\3\2\2\2\u00cf\u00d0\7/\2\2\u00d0\u00d1\7@\2\2\u00d1R\3\2\2\2"+
		"\u00d2\u00d3\7<\2\2\u00d3\u00d4\7<\2\2\u00d4T\3\2\2\2\u00d5\u00d7\5W,"+
		"\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9V\3\2\2\2\u00da\u00dd\n\2\2\2\u00db\u00dd\5Y-\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00db\3\2\2\2\u00ddX\3\2\2\2\u00de\u00df\7^\2\2\u00df\u00e0"+
		"\t\3\2\2\u00e0Z\3\2\2\2\u00e1\u00e3\t\4\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\\\3\2\2\2\u00e4\u00e9\5[.\2\u00e5\u00e9\t\5\2\2\u00e6\u00e9\5_\60\2\u00e7"+
		"\u00e9\t\6\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e7\3\2\2\2\u00e9^\3\2\2\2\u00ea\u00eb\t\7\2\2\u00eb`\3\2"+
		"\2\2\u00ec\u00ee\t\b\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b\61"+
		"\2\2\u00f2b\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4\u00f5\7,\2\2\u00f5\u00f9"+
		"\3\2\2\2\u00f6\u00f8\13\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fd\7,\2\2\u00fd\u00fe\7\61\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\b\62\2\2\u0100d\3\2\2\2\u0101\u0102\7\61\2\2\u0102\u0103\7\61\2"+
		"\2\u0103\u0107\3\2\2\2\u0104\u0106\n\t\2\2\u0105\u0104\3\2\2\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010b\b\63\2\2\u010bf\3\2\2\2\r\2nv\177\u00d8\u00dc"+
		"\u00e2\u00e8\u00ef\u00f9\u0107\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}