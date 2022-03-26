// Generated from fupl.g4 by ANTLR 4.8
 import java.util.*; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fuplParser}.
 */
public interface fuplListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fuplParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(fuplParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(fuplParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#declvar}.
	 * @param ctx the parse tree
	 */
	void enterDeclvar(fuplParser.DeclvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#declvar}.
	 * @param ctx the parse tree
	 */
	void exitDeclvar(fuplParser.DeclvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(fuplParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(fuplParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(fuplParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(fuplParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(fuplParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(fuplParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(fuplParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(fuplParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#fazer}.
	 * @param ctx the parse tree
	 */
	void enterFazer(fuplParser.FazerContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#fazer}.
	 * @param ctx the parse tree
	 */
	void exitFazer(fuplParser.FazerContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(fuplParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(fuplParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(fuplParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(fuplParser.SaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(fuplParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(fuplParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(fuplParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(fuplParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(fuplParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(fuplParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#op_aritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOp_aritmetico(fuplParser.Op_aritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#op_aritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOp_aritmetico(fuplParser.Op_aritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link fuplParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(fuplParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link fuplParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(fuplParser.TextoContext ctx);
}