// Generated from hui.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link huiParser}.
 */
public interface huiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link huiParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(huiParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link huiParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(huiParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link huiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(huiParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link huiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(huiParser.ExprContext ctx);
}