// Generated from fupl.g4 by ANTLR 4.8
 import java.util.*; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fuplLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, ASDUPLA=16, OP_SOMAC=17, 
		OP_ARITMETICO2=18, NUM=19, OPREL=20, PV=21, AC=22, FC=23, AP=24, FP=25, 
		Op_atrib=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "ID", "ASDUPLA", "OP_SOMAC", 
			"OP_ARITMETICO2", "NUM", "OPREL", "PV", "AC", "FC", "AP", "FP", "Op_atrib", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim'", "'feumb_natural'", "'feumb_letra'", "'feumb_real'", 
			"'se'", "'senao'", "'enquanto'", "'fazer'", "'durante'", "'imprime'", 
			"'entrada('", "'+'", "'-'", null, "'\"'", "'@'", null, null, null, "';'", 
			"'{'", "'}'", "'('", "')'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "ASDUPLA", "OP_SOMAC", "OP_ARITMETICO2", "NUM", 
			"OPREL", "PV", "AC", "FC", "AP", "FP", "Op_atrib", "WS"
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


		Variavel x = new Variavel();
		ControleVariavel cv = new ControleVariavel();
		String saida = "";
		int escopo;
		int tipo;
		int tmp = 0;
		String nid, idO;
		Scanner entrada = new Scanner(System.in);


	public fuplLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fupl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00d4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20\u00a0\n\20\r\20\16\20\u00a1"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24\u00ab\n\24\r\24\16\24\u00ac\3"+
		"\24\3\24\6\24\u00b1\n\24\r\24\16\24\u00b2\5\24\u00b5\n\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c0\n\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u00cf\n\34\r\34\16"+
		"\34\u00d0\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\35\3\2\7\4\2C\\c|\4\2,,\61\61\3\2\62;\4\2>>@@\5\2\13\f"+
		"\17\17\"\"\2\u00dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\39\3\2\2\2\5@\3\2\2\2\7D\3\2\2\2\tR\3\2\2\2\13^\3\2\2\2\ri\3\2\2\2\17"+
		"l\3\2\2\2\21r\3\2\2\2\23{\3\2\2\2\25\u0081\3\2\2\2\27\u0089\3\2\2\2\31"+
		"\u0091\3\2\2\2\33\u009a\3\2\2\2\35\u009c\3\2\2\2\37\u009f\3\2\2\2!\u00a3"+
		"\3\2\2\2#\u00a5\3\2\2\2%\u00a7\3\2\2\2\'\u00aa\3\2\2\2)\u00bf\3\2\2\2"+
		"+\u00c1\3\2\2\2-\u00c3\3\2\2\2/\u00c5\3\2\2\2\61\u00c7\3\2\2\2\63\u00c9"+
		"\3\2\2\2\65\u00cb\3\2\2\2\67\u00ce\3\2\2\29:\7k\2\2:;\7p\2\2;<\7k\2\2"+
		"<=\7e\2\2=>\7k\2\2>?\7q\2\2?\4\3\2\2\2@A\7h\2\2AB\7k\2\2BC\7o\2\2C\6\3"+
		"\2\2\2DE\7h\2\2EF\7g\2\2FG\7w\2\2GH\7o\2\2HI\7d\2\2IJ\7a\2\2JK\7p\2\2"+
		"KL\7c\2\2LM\7v\2\2MN\7w\2\2NO\7t\2\2OP\7c\2\2PQ\7n\2\2Q\b\3\2\2\2RS\7"+
		"h\2\2ST\7g\2\2TU\7w\2\2UV\7o\2\2VW\7d\2\2WX\7a\2\2XY\7n\2\2YZ\7g\2\2Z"+
		"[\7v\2\2[\\\7t\2\2\\]\7c\2\2]\n\3\2\2\2^_\7h\2\2_`\7g\2\2`a\7w\2\2ab\7"+
		"o\2\2bc\7d\2\2cd\7a\2\2de\7t\2\2ef\7g\2\2fg\7c\2\2gh\7n\2\2h\f\3\2\2\2"+
		"ij\7u\2\2jk\7g\2\2k\16\3\2\2\2lm\7u\2\2mn\7g\2\2no\7p\2\2op\7c\2\2pq\7"+
		"q\2\2q\20\3\2\2\2rs\7g\2\2st\7p\2\2tu\7s\2\2uv\7w\2\2vw\7c\2\2wx\7p\2"+
		"\2xy\7v\2\2yz\7q\2\2z\22\3\2\2\2{|\7h\2\2|}\7c\2\2}~\7|\2\2~\177\7g\2"+
		"\2\177\u0080\7t\2\2\u0080\24\3\2\2\2\u0081\u0082\7f\2\2\u0082\u0083\7"+
		"w\2\2\u0083\u0084\7t\2\2\u0084\u0085\7c\2\2\u0085\u0086\7p\2\2\u0086\u0087"+
		"\7v\2\2\u0087\u0088\7g\2\2\u0088\26\3\2\2\2\u0089\u008a\7k\2\2\u008a\u008b"+
		"\7o\2\2\u008b\u008c\7r\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e"+
		"\u008f\7o\2\2\u008f\u0090\7g\2\2\u0090\30\3\2\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7p\2\2\u0093\u0094\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096\7c\2\2"+
		"\u0096\u0097\7f\2\2\u0097\u0098\7c\2\2\u0098\u0099\7*\2\2\u0099\32\3\2"+
		"\2\2\u009a\u009b\7-\2\2\u009b\34\3\2\2\2\u009c\u009d\7/\2\2\u009d\36\3"+
		"\2\2\2\u009e\u00a0\t\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7$\2\2\u00a4"+
		"\"\3\2\2\2\u00a5\u00a6\7B\2\2\u00a6$\3\2\2\2\u00a7\u00a8\t\3\2\2\u00a8"+
		"&\3\2\2\2\u00a9\u00ab\t\4\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b4\3\2\2\2\u00ae\u00b0"+
		"\7\60\2\2\u00af\u00b1\t\4\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ae"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5(\3\2\2\2\u00b6\u00c0\t\5\2\2\u00b7"+
		"\u00b8\7@\2\2\u00b8\u00c0\7?\2\2\u00b9\u00ba\7>\2\2\u00ba\u00c0\7?\2\2"+
		"\u00bb\u00bc\7?\2\2\u00bc\u00c0\7?\2\2\u00bd\u00be\7#\2\2\u00be\u00c0"+
		"\7?\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf"+
		"\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7=\2\2\u00c2"+
		",\3\2\2\2\u00c3\u00c4\7}\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7\177\2\2\u00c6"+
		"\60\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\62\3\2\2\2\u00c9\u00ca\7+\2\2\u00ca"+
		"\64\3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\66\3\2\2\2\u00cd\u00cf\t\6\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b\34\2\2\u00d38\3\2\2\2\t\2\u00a1"+
		"\u00ac\u00b2\u00b4\u00bf\u00d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}