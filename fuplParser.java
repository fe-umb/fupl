// Generated from fupl.g4 by ANTLR 4.8
 import java.util.*; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fuplParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ID=15, ASDUPLA=16, OP_SOMAC=17, 
		OP_ARITMETICO2=18, NUM=19, OPREL=20, PV=21, AC=22, FC=23, AP=24, FP=25, 
		Op_atrib=26, WS=27;
	public static final int
		RULE_inicio = 0, RULE_declvar = 1, RULE_tipo = 2, RULE_cmd = 3, RULE_cond = 4, 
		RULE_enquanto = 5, RULE_fazer = 6, RULE_comp = 7, RULE_saida = 8, RULE_entrada = 9, 
		RULE_atrib = 10, RULE_expressao = 11, RULE_op_aritmetico = 12, RULE_texto = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declvar", "tipo", "cmd", "cond", "enquanto", "fazer", "comp", 
			"saida", "entrada", "atrib", "expressao", "op_aritmetico", "texto"
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

	@Override
	public String getGrammarFileName() { return "fupl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Variavel x = new Variavel();
		ControleVariavel cv = new ControleVariavel();
		String saida = "";
		int escopo;
		int tipo;
		int tmp = 0;
		String nid, idO;
		Scanner entrada = new Scanner(System.in);

	public fuplParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public List<DeclvarContext> declvar() {
			return getRuleContexts(DeclvarContext.class);
		}
		public DeclvarContext declvar(int i) {
			return getRuleContext(DeclvarContext.class,i);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{

					 escopo = 0;
					 saida += "public class Saida{\n\t";
					
			setState(29);
			declvar();
			setState(30);
			match(T__0);

									  escopo = 1;
									  saida += "\n\tpublic static void main(String args[]){\n\n\t\tScanner entrada = new Scanner(System.in);\n\t\t";
									 
			setState(32);
			declvar();
			setState(33);
			cmd();
			setState(34);
			match(T__1);

										   saida += "\n\t}\n}"; 
										   System.out.println(saida);
										  
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

	public static class DeclvarContext extends ParserRuleContext {
		public Token ID;
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(fuplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(fuplParser.ID, i);
		}
		public List<TerminalNode> PV() { return getTokens(fuplParser.PV); }
		public TerminalNode PV(int i) {
			return getToken(fuplParser.PV, i);
		}
		public DeclvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterDeclvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitDeclvar(this);
		}
	}

	public final DeclvarContext declvar() throws RecognitionException {
		DeclvarContext _localctx = new DeclvarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(37);
				tipo();
				setState(38);
				((DeclvarContext)_localctx).ID = match(ID);

								   x = new Variavel((((DeclvarContext)_localctx).ID!=null?((DeclvarContext)_localctx).ID.getText():null), tipo, escopo);
								   boolean ret = cv.adiciona(x);
								   if(!ret){
										    System.out.println("\nFeUmb adverte: variável " + (((DeclvarContext)_localctx).ID!=null?((DeclvarContext)_localctx).ID.getText():null) + " já foi declarada!");
											System.exit(0);
										   }
								  
				setState(40);
				match(PV);
				 saida += (((DeclvarContext)_localctx).ID!=null?((DeclvarContext)_localctx).ID.getText():null) + ";\n\t\t";
				}
				}
				setState(47);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(48);
				match(T__2);
				tipo = 0; saida += "int ";
				}
				break;
			case T__3:
				{
				setState(50);
				match(T__3);
				tipo = 1; saida += "char ";
				}
				break;
			case T__4:
				{
				setState(52);
				match(T__4);
				tipo = 2; saida += "double ";
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CmdContext extends ParserRuleContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public List<EnquantoContext> enquanto() {
			return getRuleContexts(EnquantoContext.class);
		}
		public EnquantoContext enquanto(int i) {
			return getRuleContext(EnquantoContext.class,i);
		}
		public List<FazerContext> fazer() {
			return getRuleContexts(FazerContext.class);
		}
		public FazerContext fazer(int i) {
			return getRuleContext(FazerContext.class,i);
		}
		public List<SaidaContext> saida() {
			return getRuleContexts(SaidaContext.class);
		}
		public SaidaContext saida(int i) {
			return getRuleContext(SaidaContext.class,i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public List<EntradaContext> entrada() {
			return getRuleContexts(EntradaContext.class);
		}
		public EntradaContext entrada(int i) {
			return getRuleContext(EntradaContext.class,i);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << ID) | (1L << NUM))) != 0)) {
				{
				setState(63);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(56);
					cond();
					}
					break;
				case 2:
					{
					setState(57);
					atrib();
					}
					break;
				case 3:
					{
					setState(58);
					enquanto();
					}
					break;
				case 4:
					{
					setState(59);
					fazer();
					}
					break;
				case 5:
					{
					setState(60);
					saida();
					}
					break;
				case 6:
					{
					setState(61);
					texto();
					}
					break;
				case 7:
					{
					setState(62);
					entrada();
					}
					break;
				}
				}
				setState(67);
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

	public static class CondContext extends ParserRuleContext {
		public CompContext comp;
		public TerminalNode AP() { return getToken(fuplParser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(fuplParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(fuplParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(fuplParser.AC, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> FC() { return getTokens(fuplParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(fuplParser.FC, i);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__5);
			saida += "\n\t\tif ";
			setState(70);
			match(AP);
			saida += "(";
			setState(72);
			((CondContext)_localctx).comp = comp();
			saida += (((CondContext)_localctx).comp!=null?_input.getText(((CondContext)_localctx).comp.start,((CondContext)_localctx).comp.stop):null);
			setState(74);
			match(FP);
			saida += ")"; 
			setState(76);
			match(AC);
			saida += "{\n\t\t\t"; 
			setState(78);
			cmd();
			setState(79);
			match(FC);
			saida += "\n\t\t}";
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(81);
				match(T__6);
				saida += " else "; 
				setState(83);
				match(AC);
				saida += "{\n\t\t\t";
				setState(85);
				cmd();
				setState(86);
				match(FC);
				saida += "\n\t\t}"; 
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

	public static class EnquantoContext extends ParserRuleContext {
		public CompContext comp;
		public TerminalNode AP() { return getToken(fuplParser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(fuplParser.FP, 0); }
		public TerminalNode AC() { return getToken(fuplParser.AC, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public TerminalNode FC() { return getToken(fuplParser.FC, 0); }
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__7);
			saida += "\n\t\twhile ";
			setState(93);
			match(AP);
			saida += "(";
			setState(95);
			((EnquantoContext)_localctx).comp = comp();
			saida += (((EnquantoContext)_localctx).comp!=null?_input.getText(((EnquantoContext)_localctx).comp.start,((EnquantoContext)_localctx).comp.stop):null);
			setState(97);
			match(FP);
			saida += ")";
			setState(99);
			match(AC);
			saida += " {\n\t\t\t";
			setState(101);
			cmd();
			setState(102);
			match(FC);
			saida+="\n\t\t}";
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

	public static class FazerContext extends ParserRuleContext {
		public CompContext comp;
		public TerminalNode AC() { return getToken(fuplParser.AC, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public TerminalNode FC() { return getToken(fuplParser.FC, 0); }
		public TerminalNode AP() { return getToken(fuplParser.AP, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode FP() { return getToken(fuplParser.FP, 0); }
		public TerminalNode PV() { return getToken(fuplParser.PV, 0); }
		public FazerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fazer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterFazer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitFazer(this);
		}
	}

	public final FazerContext fazer() throws RecognitionException {
		FazerContext _localctx = new FazerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fazer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__8);
			saida += "\n\t\tdo ";
			setState(107);
			match(AC);
			saida += "{\n\t\t\t";
			setState(109);
			cmd();
			setState(110);
			match(FC);
			saida += "\n\t\t}";
			setState(112);
			match(T__9);
			saida += " while ";
			setState(114);
			match(AP);
			saida += "(";
			setState(116);
			((FazerContext)_localctx).comp = comp();
			saida += (((FazerContext)_localctx).comp!=null?_input.getText(((FazerContext)_localctx).comp.start,((FazerContext)_localctx).comp.stop):null);
			setState(118);
			match(FP);
			saida += ")";
			setState(120);
			match(PV);
			saida += ";";
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

	public static class CompContext extends ParserRuleContext {
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(fuplParser.OPREL, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			texto();
			setState(124);
			match(OPREL);
			setState(125);
			texto();
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

	public static class SaidaContext extends ParserRuleContext {
		public TextoContext texto;
		public Token ID;
		public TerminalNode AP() { return getToken(fuplParser.AP, 0); }
		public TerminalNode PV() { return getToken(fuplParser.PV, 0); }
		public List<TerminalNode> ASDUPLA() { return getTokens(fuplParser.ASDUPLA); }
		public TerminalNode ASDUPLA(int i) {
			return getToken(fuplParser.ASDUPLA, i);
		}
		public List<TextoContext> texto() {
			return getRuleContexts(TextoContext.class);
		}
		public TextoContext texto(int i) {
			return getRuleContext(TextoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(fuplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(fuplParser.ID, i);
		}
		public TerminalNode FP() { return getToken(fuplParser.FP, 0); }
		public List<TerminalNode> OP_SOMAC() { return getTokens(fuplParser.OP_SOMAC); }
		public TerminalNode OP_SOMAC(int i) {
			return getToken(fuplParser.OP_SOMAC, i);
		}
		public SaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitSaida(this);
		}
	}

	public final SaidaContext saida() throws RecognitionException {
		SaidaContext _localctx = new SaidaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_saida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__10);
			saida += "\nSystem.out.println";
			setState(129);
			match(AP);
			saida += "(";
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASDUPLA:
				{
				setState(131);
				match(ASDUPLA);
				setState(132);
				((SaidaContext)_localctx).texto = texto();
				saida += (((SaidaContext)_localctx).texto!=null?_input.getText(((SaidaContext)_localctx).texto.start,((SaidaContext)_localctx).texto.stop):null);
				setState(134);
				match(ASDUPLA);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_SOMAC) {
					{
					{
					setState(135);
					match(OP_SOMAC);
					saida += "+";
					setState(144);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(137);
						((SaidaContext)_localctx).ID = match(ID);
						saida += (((SaidaContext)_localctx).ID!=null?((SaidaContext)_localctx).ID.getText():null);
						}
						break;
					case ASDUPLA:
						{
						setState(139);
						match(ASDUPLA);
						setState(140);
						((SaidaContext)_localctx).texto = texto();
						saida += (((SaidaContext)_localctx).texto!=null?_input.getText(((SaidaContext)_localctx).texto.start,((SaidaContext)_localctx).texto.stop):null);
						setState(142);
						match(ASDUPLA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ID:
				{
				setState(151);
				((SaidaContext)_localctx).ID = match(ID);
				saida += (((SaidaContext)_localctx).ID!=null?((SaidaContext)_localctx).ID.getText():null);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_SOMAC) {
					{
					{
					setState(153);
					match(OP_SOMAC);
					saida += "+";
					setState(162);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(155);
						((SaidaContext)_localctx).ID = match(ID);
						saida += (((SaidaContext)_localctx).ID!=null?((SaidaContext)_localctx).ID.getText():null);
						}
						break;
					case ASDUPLA:
						{
						setState(157);
						match(ASDUPLA);
						setState(158);
						((SaidaContext)_localctx).texto = texto();
						saida += (((SaidaContext)_localctx).texto!=null?_input.getText(((SaidaContext)_localctx).texto.start,((SaidaContext)_localctx).texto.stop):null);
						setState(160);
						match(ASDUPLA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(FP);
				saida += ");";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(173);
			match(PV);
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

	public static class EntradaContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(fuplParser.ID, 0); }
		public TerminalNode FP() { return getToken(fuplParser.FP, 0); }
		public TerminalNode PV() { return getToken(fuplParser.PV, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitEntrada(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__11);
			setState(176);
			((EntradaContext)_localctx).ID = match(ID);
			setState(177);
			match(FP);
			saida += "\n\t\t" + (((EntradaContext)_localctx).ID!=null?((EntradaContext)_localctx).ID.getText():null) + " = entrada.next";

																				String nid = (((EntradaContext)_localctx).ID!=null?((EntradaContext)_localctx).ID.getText():null);
																				x = cv.busca(nid);
																				if(x == null){
																							  System.out.println("\nFeUmb adverte: variável " + (((EntradaContext)_localctx).ID!=null?((EntradaContext)_localctx).ID.getText():null) + " não foi declarada!");
																							  System.exit(0);
																			   } else {
																					   tmp = x.getTipo();
																					  }
																				if(tmp == 0){
																							 {saida += "Int()";}
																							} else if(tmp == 1){
																											    {saida+="().charAt(0)";}
																											   } else if(tmp == 2){
																																   {saida += "Double()";}}
																																  
			setState(180);
			match(PV);
			saida+=";";
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

	public static class AtribContext extends ParserRuleContext {
		public Token ID;
		public Token NUM;
		public Op_aritmeticoContext op_aritmetico;
		public List<TerminalNode> ID() { return getTokens(fuplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(fuplParser.ID, i);
		}
		public TerminalNode Op_atrib() { return getToken(fuplParser.Op_atrib, 0); }
		public TerminalNode PV() { return getToken(fuplParser.PV, 0); }
		public List<TerminalNode> NUM() { return getTokens(fuplParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(fuplParser.NUM, i);
		}
		public List<Op_aritmeticoContext> op_aritmetico() {
			return getRuleContexts(Op_aritmeticoContext.class);
		}
		public Op_aritmeticoContext op_aritmetico(int i) {
			return getRuleContext(Op_aritmeticoContext.class,i);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((AtribContext)_localctx).ID = match(ID);

					   String nid = (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null);
					   idO = nid;
					   x = cv.busca(nid);
					   if(x == null){
									 System.out.println("\nFeUmb adverte: variável "+ (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null) + " não foi declarada!");
									 System.exit(0);
									} else {
											tmp = x.getTipo();
											saida += nid;
										  ;}
					  
			setState(185);
			match(Op_atrib);
			saida += " = ";
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(187);
				((AtribContext)_localctx).ID = match(ID);

														  nid = (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null);
														  x = cv.busca(nid);
														  if(x == null){
																		System.out.println("\nFeUmb adverte: variável " + (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null) + " não foi declarada!");
																		System.exit(0);
																	   } else {
																			   if(x.getTipo() == tmp){
																									  saida += x.getNome() + "\n";
																									 } else {
																											 System.out.println("\nFeUmb adverte: variáveis " + (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null) + " e "
																											 + idO + " são diferentes!");
																											 System.exit(0);
																											}
																			 ;}
														 
				}
				break;
			case NUM:
				{
				setState(189);
				((AtribContext)_localctx).NUM = match(NUM);

																  if(tmp == 0){
																			   saida += (((AtribContext)_localctx).NUM!=null?((AtribContext)_localctx).NUM.getText():null);
																				if(((AtribContext)_localctx).NUM.toString().contains(".")){
																												  System.out.println("\nFeUmb adverte: número " + (((AtribContext)_localctx).NUM!=null?((AtribContext)_localctx).NUM.getText():null) + " e variável "
																												  + idO + " são de tipos diferentes!");
																												  System.exit(0);
																												 }
																			} else {
																					saida += (((AtribContext)_localctx).NUM!=null?((AtribContext)_localctx).NUM.getText():null);
																				   }
																 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << OP_ARITMETICO2))) != 0)) {
				{
				{
				setState(193);
				((AtribContext)_localctx).op_aritmetico = op_aritmetico();
				saida += (((AtribContext)_localctx).op_aritmetico!=null?_input.getText(((AtribContext)_localctx).op_aritmetico.start,((AtribContext)_localctx).op_aritmetico.stop):null);
				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(195);
					((AtribContext)_localctx).ID = match(ID);

																		  nid = (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null);
																		  x = cv.busca(nid);
																		  if(x == null){
																						System.out.println("\nFeUmb adverte: variável " + (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null) + " não foi declarada!");
																						System.exit(0);
																					   } else {
																							   if(x.getTipo() == tmp){
																													  saida += x.getNome();
																													 } else {
																															 System.out.println("\nFeUmb adverte: variáveis " + (((AtribContext)_localctx).ID!=null?((AtribContext)_localctx).ID.getText():null) + " e "
																															 + idO + " sao diferentes!");
																															 System.exit(0);
																															}
																							 ;}
																		 
					}
					break;
				case NUM:
					{
					setState(197);
					((AtribContext)_localctx).NUM = match(NUM);

																				  int tiponum;
																				  if(tmp == 0){
																							   saida += (((AtribContext)_localctx).NUM!=null?((AtribContext)_localctx).NUM.getText():null);
																							   if(((AtribContext)_localctx).NUM.toString().contains(".")){
																																 System.out.println("\nFeUmb adverte: número " + (((AtribContext)_localctx).NUM!=null?((AtribContext)_localctx).NUM.getText():null) + " e variável "
																																 + idO + " são de tipos diferentes!");
																																} else {
																																		saida += (((AtribContext)_localctx).NUM!=null?((AtribContext)_localctx).NUM.getText():null);
																																	   }
																							  } else {
																									  saida += (((AtribContext)_localctx).NUM!=null?((AtribContext)_localctx).NUM.getText():null);
																									 }
																				 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			saida += ";";
			setState(207);
			match(PV);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode PV() { return getToken(fuplParser.PV, 0); }
		public List<TerminalNode> ID() { return getTokens(fuplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(fuplParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(fuplParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(fuplParser.NUM, i);
		}
		public List<Op_aritmeticoContext> op_aritmetico() {
			return getRuleContexts(Op_aritmeticoContext.class);
		}
		public Op_aritmeticoContext op_aritmetico(int i) {
			return getRuleContext(Op_aritmeticoContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(209);
				((ExpressaoContext)_localctx).ID = match(ID);

								String nid = (((ExpressaoContext)_localctx).ID!=null?((ExpressaoContext)_localctx).ID.getText():null);
								x = cv.busca(nid);
								if(x == null){
											  System.out.println("\nFeUmb adverte: variável " + (((ExpressaoContext)_localctx).ID!=null?((ExpressaoContext)_localctx).ID.getText():null) + " não foi declarada!");
											  System.exit(0);
											 } else {
													 tmp = x.getTipo();
												   ;}
							   
				}
				break;
			case NUM:
				{
				setState(211);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << OP_ARITMETICO2))) != 0)) {
				{
				{
				setState(214);
				op_aritmetico();
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(215);
					((ExpressaoContext)_localctx).ID = match(ID);

																nid = (((ExpressaoContext)_localctx).ID!=null?((ExpressaoContext)_localctx).ID.getText():null);
																x = cv.busca(nid);
																if(x == null){
																			  System.out.println("\nFeUmb adverte: variável " + (((ExpressaoContext)_localctx).ID!=null?((ExpressaoContext)_localctx).ID.getText():null) + " não foi declarada!");
																			  System.exit(0);
																			 } else {
																					 if(x.getTipo() != tmp){
																											System.out.println("\nFeUmb adverte: variáveis " + (((ExpressaoContext)_localctx).ID!=null?((ExpressaoContext)_localctx).ID.getText():null) + " e "
																											+ x.getNome() + " são de tipos diferentes!");
																											System.exit(0);
																										   }
																				   ;}
															   
					}
					break;
				case NUM:
					{
					setState(217);
					match(NUM);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(PV);
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

	public static class Op_aritmeticoContext extends ParserRuleContext {
		public TerminalNode OP_ARITMETICO2() { return getToken(fuplParser.OP_ARITMETICO2, 0); }
		public Op_aritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_aritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterOp_aritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitOp_aritmetico(this);
		}
	}

	public final Op_aritmeticoContext op_aritmetico() throws RecognitionException {
		Op_aritmeticoContext _localctx = new Op_aritmeticoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op_aritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << OP_ARITMETICO2))) != 0)) ) {
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

	public static class TextoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(fuplParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(fuplParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(fuplParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(fuplParser.NUM, i);
		}
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fuplListener ) ((fuplListener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_texto);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(229);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==NUM) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(232); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00ed\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5B\n\5\f\5\16\5E\13"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0093\n\n\7\n\u0095\n\n\f\n\16\n\u0098"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a5\n\n\7\n\u00a7"+
		"\n\n\f\n\16\n\u00aa\13\n\3\n\3\n\5\n\u00ae\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c2\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ca\n\f\7\f\u00cc\n\f\f\f\16\f\u00cf"+
		"\13\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00d7\n\r\3\r\3\r\3\r\3\r\5\r\u00dd"+
		"\n\r\7\r\u00df\n\r\f\r\16\r\u00e2\13\r\3\r\3\r\3\16\3\16\3\17\6\17\u00e9"+
		"\n\17\r\17\16\17\u00ea\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\4\4\2\17\20\24\24\4\2\21\21\25\25\2\u00f5\2\36\3\2\2\2\4/\3\2\2\2\6"+
		"8\3\2\2\2\bC\3\2\2\2\nF\3\2\2\2\f]\3\2\2\2\16k\3\2\2\2\20}\3\2\2\2\22"+
		"\u0081\3\2\2\2\24\u00b1\3\2\2\2\26\u00b9\3\2\2\2\30\u00d6\3\2\2\2\32\u00e5"+
		"\3\2\2\2\34\u00e8\3\2\2\2\36\37\b\2\1\2\37 \5\4\3\2 !\7\3\2\2!\"\b\2\1"+
		"\2\"#\5\4\3\2#$\5\b\5\2$%\7\4\2\2%&\b\2\1\2&\3\3\2\2\2\'(\5\6\4\2()\7"+
		"\21\2\2)*\b\3\1\2*+\7\27\2\2+,\b\3\1\2,.\3\2\2\2-\'\3\2\2\2.\61\3\2\2"+
		"\2/-\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\61/\3\2\2\2\62\63\7\5\2\2\639\b"+
		"\4\1\2\64\65\7\6\2\2\659\b\4\1\2\66\67\7\7\2\2\679\b\4\1\28\62\3\2\2\2"+
		"8\64\3\2\2\28\66\3\2\2\29\7\3\2\2\2:B\5\n\6\2;B\5\26\f\2<B\5\f\7\2=B\5"+
		"\16\b\2>B\5\22\n\2?B\5\34\17\2@B\5\24\13\2A:\3\2\2\2A;\3\2\2\2A<\3\2\2"+
		"\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2"+
		"\2D\t\3\2\2\2EC\3\2\2\2FG\7\b\2\2GH\b\6\1\2HI\7\32\2\2IJ\b\6\1\2JK\5\20"+
		"\t\2KL\b\6\1\2LM\7\33\2\2MN\b\6\1\2NO\7\30\2\2OP\b\6\1\2PQ\5\b\5\2QR\7"+
		"\31\2\2R[\b\6\1\2ST\7\t\2\2TU\b\6\1\2UV\7\30\2\2VW\b\6\1\2WX\5\b\5\2X"+
		"Y\7\31\2\2YZ\b\6\1\2Z\\\3\2\2\2[S\3\2\2\2[\\\3\2\2\2\\\13\3\2\2\2]^\7"+
		"\n\2\2^_\b\7\1\2_`\7\32\2\2`a\b\7\1\2ab\5\20\t\2bc\b\7\1\2cd\7\33\2\2"+
		"de\b\7\1\2ef\7\30\2\2fg\b\7\1\2gh\5\b\5\2hi\7\31\2\2ij\b\7\1\2j\r\3\2"+
		"\2\2kl\7\13\2\2lm\b\b\1\2mn\7\30\2\2no\b\b\1\2op\5\b\5\2pq\7\31\2\2qr"+
		"\b\b\1\2rs\7\f\2\2st\b\b\1\2tu\7\32\2\2uv\b\b\1\2vw\5\20\t\2wx\b\b\1\2"+
		"xy\7\33\2\2yz\b\b\1\2z{\7\27\2\2{|\b\b\1\2|\17\3\2\2\2}~\5\34\17\2~\177"+
		"\7\26\2\2\177\u0080\5\34\17\2\u0080\21\3\2\2\2\u0081\u0082\7\r\2\2\u0082"+
		"\u0083\b\n\1\2\u0083\u0084\7\32\2\2\u0084\u00ad\b\n\1\2\u0085\u0086\7"+
		"\22\2\2\u0086\u0087\5\34\17\2\u0087\u0088\b\n\1\2\u0088\u0096\7\22\2\2"+
		"\u0089\u008a\7\23\2\2\u008a\u0092\b\n\1\2\u008b\u008c\7\21\2\2\u008c\u0093"+
		"\b\n\1\2\u008d\u008e\7\22\2\2\u008e\u008f\5\34\17\2\u008f\u0090\b\n\1"+
		"\2\u0090\u0091\7\22\2\2\u0091\u0093\3\2\2\2\u0092\u008b\3\2\2\2\u0092"+
		"\u008d\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0089\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00ae\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\7\21\2\2\u009a\u00a8\b\n\1\2\u009b\u009c\7"+
		"\23\2\2\u009c\u00a4\b\n\1\2\u009d\u009e\7\21\2\2\u009e\u00a5\b\n\1\2\u009f"+
		"\u00a0\7\22\2\2\u00a0\u00a1\5\34\17\2\u00a1\u00a2\b\n\1\2\u00a2\u00a3"+
		"\7\22\2\2\u00a3\u00a5\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4\u009f\3\2\2\2"+
		"\u00a5\u00a7\3\2\2\2\u00a6\u009b\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ac\7\33\2\2\u00ac\u00ae\b\n\1\2\u00ad\u0085\3\2\2\2\u00ad\u0099\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\27\2\2\u00b0\23\3\2\2\2\u00b1"+
		"\u00b2\7\16\2\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\7\33\2\2\u00b4\u00b5"+
		"\b\13\1\2\u00b5\u00b6\b\13\1\2\u00b6\u00b7\7\27\2\2\u00b7\u00b8\b\13\1"+
		"\2\u00b8\25\3\2\2\2\u00b9\u00ba\7\21\2\2\u00ba\u00bb\b\f\1\2\u00bb\u00bc"+
		"\7\34\2\2\u00bc\u00c1\b\f\1\2\u00bd\u00be\7\21\2\2\u00be\u00c2\b\f\1\2"+
		"\u00bf\u00c0\7\25\2\2\u00c0\u00c2\b\f\1\2\u00c1\u00bd\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\u00cd\3\2\2\2\u00c3\u00c4\5\32\16\2\u00c4\u00c9\b\f\1\2"+
		"\u00c5\u00c6\7\21\2\2\u00c6\u00ca\b\f\1\2\u00c7\u00c8\7\25\2\2\u00c8\u00ca"+
		"\b\f\1\2\u00c9\u00c5\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c3\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2"+
		"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\b\f\1\2\u00d1"+
		"\u00d2\7\27\2\2\u00d2\27\3\2\2\2\u00d3\u00d4\7\21\2\2\u00d4\u00d7\b\r"+
		"\1\2\u00d5\u00d7\7\25\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00e0\3\2\2\2\u00d8\u00dc\5\32\16\2\u00d9\u00da\7\21\2\2\u00da\u00dd"+
		"\b\r\1\2\u00db\u00dd\7\25\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00df\3\2\2\2\u00de\u00d8\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e4\7\27\2\2\u00e4\31\3\2\2\2\u00e5\u00e6\t\2\2\2\u00e6\33\3\2\2\2"+
		"\u00e7\u00e9\t\3\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\35\3\2\2\2\23/8AC[\u0092\u0096\u00a4"+
		"\u00a8\u00ad\u00c1\u00c9\u00cd\u00d6\u00dc\u00e0\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}