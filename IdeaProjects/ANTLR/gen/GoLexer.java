// Generated from /Users/Konstantin/IdeaProjects/ANTLR/Go.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TypeName=7, PrintLn=8, 
		OpenParen=9, CloseParen=10, Minus=11, ComplexLitteral=12, IntegerLiteral=13, 
		StringLiteral=14, Point=15, FloatLitteral=16, Plus=17, Multiply=18, Modulo=19, 
		Bitwiseand=20, Palochka=21, LessThan=22, LessOrEqual=23, Equals=24, GreaterOrEqual=25, 
		GreaterThan=26, NotEquals=27, Id=28, Letter=29, Digit=30, VosklichatelniyZnak=31, 
		Prisvaivanie=32, Kovicka=33, I=34, Whitespace=35, NewLine=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TypeName", "PrintLn", 
		"OpenParen", "CloseParen", "Minus", "ComplexLitteral", "IntegerLiteral", 
		"StringLiteral", "Point", "FloatLitteral", "Plus", "Multiply", "Modulo", 
		"Bitwiseand", "Palochka", "LessThan", "LessOrEqual", "Equals", "GreaterOrEqual", 
		"GreaterThan", "NotEquals", "Id", "Letter", "Digit", "VosklichatelniyZnak", 
		"Prisvaivanie", "Kovicka", "I", "Whitespace", "NewLine"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'type'", "'struct'", "'{'", "'}'", "'func'", null, "'fmt.Println'", 
		"'('", "')'", "'-'", null, null, null, "'.'", null, "'+'", "'*'", "'%'", 
		"'&'", "'|'", "'<'", "'<='", "'=='", "'>='", "'>'", "'!='", null, null, 
		null, "'!'", "'='", "'\"'", "'i'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "TypeName", "PrintLn", "OpenParen", 
		"CloseParen", "Minus", "ComplexLitteral", "IntegerLiteral", "StringLiteral", 
		"Point", "FloatLitteral", "Plus", "Multiply", "Modulo", "Bitwiseand", 
		"Palochka", "LessThan", "LessOrEqual", "Equals", "GreaterOrEqual", "GreaterThan", 
		"NotEquals", "Id", "Letter", "Digit", "VosklichatelniyZnak", "Prisvaivanie", 
		"Kovicka", "I", "Whitespace", "NewLine"
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


	public GoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Go.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00f9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"x\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\5\r\u008e\n\r\3\r\3\r\5\r\u0092\n\r\3\r\3\r\5\r\u0096"+
		"\n\r\3\r\3\r\3\16\5\16\u009b\n\16\3\16\6\16\u009e\n\16\r\16\16\16\u009f"+
		"\3\17\3\17\7\17\u00a4\n\17\f\17\16\17\u00a7\13\17\3\17\3\17\3\20\3\20"+
		"\3\21\5\21\u00ae\n\21\3\21\6\21\u00b1\n\21\r\21\16\21\u00b2\3\21\3\21"+
		"\6\21\u00b7\n\21\r\21\16\21\u00b8\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u00d8\n\35\f\35\16\35\u00db"+
		"\13\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\6$\u00ea\n$\r"+
		"$\16$\u00eb\3$\3$\3%\3%\3%\7%\u00f3\n%\f%\16%\u00f6\13%\3%\3%\2\2&\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&\3\2\7\3\2$$\5\2C\\aac|\3\2\62;\5\2\13\13\"\"))\4\2\f\f\17"+
		"\17\u0109\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7R\3\2\2\2\tY\3\2\2\2\13"+
		"[\3\2\2\2\r]\3\2\2\2\17w\3\2\2\2\21y\3\2\2\2\23\u0085\3\2\2\2\25\u0087"+
		"\3\2\2\2\27\u0089\3\2\2\2\31\u0091\3\2\2\2\33\u009a\3\2\2\2\35\u00a1\3"+
		"\2\2\2\37\u00aa\3\2\2\2!\u00ad\3\2\2\2#\u00ba\3\2\2\2%\u00bc\3\2\2\2\'"+
		"\u00be\3\2\2\2)\u00c0\3\2\2\2+\u00c2\3\2\2\2-\u00c4\3\2\2\2/\u00c6\3\2"+
		"\2\2\61\u00c9\3\2\2\2\63\u00cc\3\2\2\2\65\u00cf\3\2\2\2\67\u00d1\3\2\2"+
		"\29\u00d4\3\2\2\2;\u00dc\3\2\2\2=\u00de\3\2\2\2?\u00e0\3\2\2\2A\u00e2"+
		"\3\2\2\2C\u00e4\3\2\2\2E\u00e6\3\2\2\2G\u00e9\3\2\2\2I\u00f4\3\2\2\2K"+
		"L\7.\2\2L\4\3\2\2\2MN\7v\2\2NO\7{\2\2OP\7r\2\2PQ\7g\2\2Q\6\3\2\2\2RS\7"+
		"u\2\2ST\7v\2\2TU\7t\2\2UV\7w\2\2VW\7e\2\2WX\7v\2\2X\b\3\2\2\2YZ\7}\2\2"+
		"Z\n\3\2\2\2[\\\7\177\2\2\\\f\3\2\2\2]^\7h\2\2^_\7w\2\2_`\7p\2\2`a\7e\2"+
		"\2a\16\3\2\2\2bc\7k\2\2cd\7p\2\2dx\7v\2\2ef\7h\2\2fg\7n\2\2gh\7q\2\2h"+
		"i\7c\2\2ix\7v\2\2jk\7e\2\2kl\7q\2\2lm\7o\2\2mn\7r\2\2no\7n\2\2op\7g\2"+
		"\2px\7z\2\2qr\7u\2\2rs\7v\2\2st\7t\2\2tu\7k\2\2uv\7p\2\2vx\7i\2\2wb\3"+
		"\2\2\2we\3\2\2\2wj\3\2\2\2wq\3\2\2\2x\20\3\2\2\2yz\7h\2\2z{\7o\2\2{|\7"+
		"v\2\2|}\7\60\2\2}~\7R\2\2~\177\7t\2\2\177\u0080\7k\2\2\u0080\u0081\7p"+
		"\2\2\u0081\u0082\7v\2\2\u0082\u0083\7n\2\2\u0083\u0084\7p\2\2\u0084\22"+
		"\3\2\2\2\u0085\u0086\7*\2\2\u0086\24\3\2\2\2\u0087\u0088\7+\2\2\u0088"+
		"\26\3\2\2\2\u0089\u008a\7/\2\2\u008a\30\3\2\2\2\u008b\u008e\5\33\16\2"+
		"\u008c\u008e\5!\21\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\7-\2\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0096\5\33\16\2\u0094\u0096\5"+
		"!\21\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\7k\2\2\u0098\32\3\2\2\2\u0099\u009b\5\27\f\2\u009a\u0099\3\2\2"+
		"\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\5=\37\2\u009d\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\34\3\2\2\2\u00a1\u00a5\7$\2\2\u00a2\u00a4\n\2\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7$\2\2\u00a9\36\3\2\2\2\u00aa"+
		"\u00ab\7\60\2\2\u00ab \3\2\2\2\u00ac\u00ae\5\27\f\2\u00ad\u00ac\3\2\2"+
		"\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00b1\5=\37\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\7\60\2\2\u00b5\u00b7\5=\37\2\u00b6\u00b5\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\"\3\2\2\2\u00ba\u00bb\7-\2\2\u00bb$\3\2\2\2\u00bc\u00bd\7,\2\2\u00bd"+
		"&\3\2\2\2\u00be\u00bf\7\'\2\2\u00bf(\3\2\2\2\u00c0\u00c1\7(\2\2\u00c1"+
		"*\3\2\2\2\u00c2\u00c3\7~\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7>\2\2\u00c5."+
		"\3\2\2\2\u00c6\u00c7\7>\2\2\u00c7\u00c8\7?\2\2\u00c8\60\3\2\2\2\u00c9"+
		"\u00ca\7?\2\2\u00ca\u00cb\7?\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7@\2\2\u00cd"+
		"\u00ce\7?\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0\66\3\2\2\2\u00d1"+
		"\u00d2\7#\2\2\u00d2\u00d3\7?\2\2\u00d38\3\2\2\2\u00d4\u00d9\5;\36\2\u00d5"+
		"\u00d8\5;\36\2\u00d6\u00d8\5=\37\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2"+
		"\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		":\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\t\3\2\2\u00dd<\3\2\2\2\u00de"+
		"\u00df\t\4\2\2\u00df>\3\2\2\2\u00e0\u00e1\7#\2\2\u00e1@\3\2\2\2\u00e2"+
		"\u00e3\7?\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5D\3\2\2\2\u00e6\u00e7"+
		"\7k\2\2\u00e7F\3\2\2\2\u00e8\u00ea\t\5\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\b$\2\2\u00eeH\3\2\2\2\u00ef\u00f3\t\6\2\2\u00f0\u00f1\7\17\2\2"+
		"\u00f1\u00f3\7\f\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00f8\b%\2\2\u00f8J\3\2\2\2\22\2w\u008d\u0091\u0095"+
		"\u009a\u009f\u00a5\u00ad\u00b2\u00b8\u00d7\u00d9\u00eb\u00f2\u00f4\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}