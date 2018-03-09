//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.5.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Go.g4 by ANTLR 4.5.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="GoParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.5.3")]
[System.CLSCompliant(false)]
public interface IGoListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.file"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFile([NotNull] GoParser.FileContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.file"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFile([NotNull] GoParser.FileContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStatement([NotNull] GoParser.StatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStatement([NotNull] GoParser.StatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.importStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterImportStatement([NotNull] GoParser.ImportStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.importStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitImportStatement([NotNull] GoParser.ImportStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.shortDeclarationStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterShortDeclarationStatement([NotNull] GoParser.ShortDeclarationStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.shortDeclarationStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitShortDeclarationStatement([NotNull] GoParser.ShortDeclarationStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.returnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterReturnStatement([NotNull] GoParser.ReturnStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.returnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitReturnStatement([NotNull] GoParser.ReturnStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.printlnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPrintlnStatement([NotNull] GoParser.PrintlnStatementContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.printlnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPrintlnStatement([NotNull] GoParser.PrintlnStatementContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.typeDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTypeDeclaration([NotNull] GoParser.TypeDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.typeDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTypeDeclaration([NotNull] GoParser.TypeDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.varDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterVarDeclaration([NotNull] GoParser.VarDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.varDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitVarDeclaration([NotNull] GoParser.VarDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.methodDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMethodDeclaration([NotNull] GoParser.MethodDeclarationContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.methodDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMethodDeclaration([NotNull] GoParser.MethodDeclarationContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.primaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterPrimaryExpression([NotNull] GoParser.PrimaryExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.primaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitPrimaryExpression([NotNull] GoParser.PrimaryExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.functionCall"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunctionCall([NotNull] GoParser.FunctionCallContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.functionCall"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunctionCall([NotNull] GoParser.FunctionCallContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.objectConstuctor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterObjectConstuctor([NotNull] GoParser.ObjectConstuctorContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.objectConstuctor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitObjectConstuctor([NotNull] GoParser.ObjectConstuctorContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.keyWordParametr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterKeyWordParametr([NotNull] GoParser.KeyWordParametrContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.keyWordParametr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitKeyWordParametr([NotNull] GoParser.KeyWordParametrContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.structureMemberExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStructureMemberExpression([NotNull] GoParser.StructureMemberExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.structureMemberExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStructureMemberExpression([NotNull] GoParser.StructureMemberExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.unaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterUnaryExpression([NotNull] GoParser.UnaryExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.unaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitUnaryExpression([NotNull] GoParser.UnaryExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.multiplicativeExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterMultiplicativeExpression([NotNull] GoParser.MultiplicativeExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.multiplicativeExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitMultiplicativeExpression([NotNull] GoParser.MultiplicativeExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.additiveExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAdditiveExpression([NotNull] GoParser.AdditiveExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.additiveExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAdditiveExpression([NotNull] GoParser.AdditiveExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.comparisonExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterComparisonExpression([NotNull] GoParser.ComparisonExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.comparisonExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitComparisonExpression([NotNull] GoParser.ComparisonExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.assighmentExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssighmentExpression([NotNull] GoParser.AssighmentExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.assighmentExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssighmentExpression([NotNull] GoParser.AssighmentExpressionContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExpression([NotNull] GoParser.ExpressionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExpression([NotNull] GoParser.ExpressionContext context);
}
