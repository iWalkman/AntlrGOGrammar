// Generated from /Users/Konstantin/IdeaProjects/ANTLR/Go.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GoParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(GoParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoParser#printlnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnStatement(GoParser.PrintlnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(GoParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(GoParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(GoParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(GoParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(GoParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(GoParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(GoParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(GoParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoParser#assighmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssighmentExpression(GoParser.AssighmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GoParser.ExpressionContext ctx);
}