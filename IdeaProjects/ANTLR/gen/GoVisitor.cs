//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.5.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from /Users/Konstantin/IdeaProjects/ANTLR/Go.g4 by ANTLR 4.5.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="GoParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.5.3")]
[System.CLSCompliant(false)]
public interface IGoVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.file"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFile([NotNull] GoParser.FileContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatement([NotNull] GoParser.StatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.importStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitImportStatement([NotNull] GoParser.ImportStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.shortDeclarationStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitShortDeclarationStatement([NotNull] GoParser.ShortDeclarationStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.returnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitReturnStatement([NotNull] GoParser.ReturnStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.printlnStatement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPrintlnStatement([NotNull] GoParser.PrintlnStatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.typeDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitTypeDeclaration([NotNull] GoParser.TypeDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.varDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVarDeclaration([NotNull] GoParser.VarDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.methodDeclaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMethodDeclaration([NotNull] GoParser.MethodDeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.primaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitPrimaryExpression([NotNull] GoParser.PrimaryExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.functionCall"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFunctionCall([NotNull] GoParser.FunctionCallContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.objectConstuctor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitObjectConstuctor([NotNull] GoParser.ObjectConstuctorContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.keyWordParametr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitKeyWordParametr([NotNull] GoParser.KeyWordParametrContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.structureMemberExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStructureMemberExpression([NotNull] GoParser.StructureMemberExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.unaryExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitUnaryExpression([NotNull] GoParser.UnaryExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.multiplicativeExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitMultiplicativeExpression([NotNull] GoParser.MultiplicativeExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.additiveExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAdditiveExpression([NotNull] GoParser.AdditiveExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.comparisonExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitComparisonExpression([NotNull] GoParser.ComparisonExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.assighmentExpression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAssighmentExpression([NotNull] GoParser.AssighmentExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="GoParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpression([NotNull] GoParser.ExpressionContext context);
}
