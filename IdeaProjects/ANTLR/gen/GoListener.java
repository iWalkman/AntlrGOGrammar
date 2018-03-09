// Generated from /Users/Konstantin/IdeaProjects/ANTLR/Go.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GoParser}.
 */
public interface GoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GoParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(GoParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(GoParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#printlnStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnStatement(GoParser.PrintlnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#printlnStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnStatement(GoParser.PrintlnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(GoParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(GoParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(GoParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(GoParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(GoParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(GoParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(GoParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(GoParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(GoParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(GoParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(GoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(GoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(GoParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(GoParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(GoParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(GoParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#assighmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssighmentExpression(GoParser.AssighmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#assighmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssighmentExpression(GoParser.AssighmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GoParser.ExpressionContext ctx);
}