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
using IErrorNode = Antlr4.Runtime.Tree.IErrorNode;
using ITerminalNode = Antlr4.Runtime.Tree.ITerminalNode;
using IToken = Antlr4.Runtime.IToken;
using ParserRuleContext = Antlr4.Runtime.ParserRuleContext;

/// <summary>
/// This class provides an empty implementation of <see cref="IGoListener"/>,
/// which can be extended to create a listener which only needs to handle a subset
/// of the available methods.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.5.3")]
[System.CLSCompliant(false)]
public partial class GoBaseListener : IGoListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.file"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFile([NotNull] GoParser.FileContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.file"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFile([NotNull] GoParser.FileContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterStatement([NotNull] GoParser.StatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.statement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitStatement([NotNull] GoParser.StatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.importStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterImportStatement([NotNull] GoParser.ImportStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.importStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitImportStatement([NotNull] GoParser.ImportStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.shortDeclarationStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterShortDeclarationStatement([NotNull] GoParser.ShortDeclarationStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.shortDeclarationStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitShortDeclarationStatement([NotNull] GoParser.ShortDeclarationStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.returnStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterReturnStatement([NotNull] GoParser.ReturnStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.returnStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitReturnStatement([NotNull] GoParser.ReturnStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.printlnStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterPrintlnStatement([NotNull] GoParser.PrintlnStatementContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.printlnStatement"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitPrintlnStatement([NotNull] GoParser.PrintlnStatementContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.typeDeclaration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterTypeDeclaration([NotNull] GoParser.TypeDeclarationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.typeDeclaration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitTypeDeclaration([NotNull] GoParser.TypeDeclarationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.varDeclaration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterVarDeclaration([NotNull] GoParser.VarDeclarationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.varDeclaration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitVarDeclaration([NotNull] GoParser.VarDeclarationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.methodDeclaration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterMethodDeclaration([NotNull] GoParser.MethodDeclarationContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.methodDeclaration"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitMethodDeclaration([NotNull] GoParser.MethodDeclarationContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.primaryExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterPrimaryExpression([NotNull] GoParser.PrimaryExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.primaryExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitPrimaryExpression([NotNull] GoParser.PrimaryExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.functionCall"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterFunctionCall([NotNull] GoParser.FunctionCallContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.functionCall"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitFunctionCall([NotNull] GoParser.FunctionCallContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.objectConstuctor"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterObjectConstuctor([NotNull] GoParser.ObjectConstuctorContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.objectConstuctor"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitObjectConstuctor([NotNull] GoParser.ObjectConstuctorContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.keyWordParametr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterKeyWordParametr([NotNull] GoParser.KeyWordParametrContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.keyWordParametr"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitKeyWordParametr([NotNull] GoParser.KeyWordParametrContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.structureMemberExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterStructureMemberExpression([NotNull] GoParser.StructureMemberExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.structureMemberExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitStructureMemberExpression([NotNull] GoParser.StructureMemberExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.unaryExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterUnaryExpression([NotNull] GoParser.UnaryExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.unaryExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitUnaryExpression([NotNull] GoParser.UnaryExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.multiplicativeExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterMultiplicativeExpression([NotNull] GoParser.MultiplicativeExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.multiplicativeExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitMultiplicativeExpression([NotNull] GoParser.MultiplicativeExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.additiveExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAdditiveExpression([NotNull] GoParser.AdditiveExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.additiveExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAdditiveExpression([NotNull] GoParser.AdditiveExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.comparisonExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterComparisonExpression([NotNull] GoParser.ComparisonExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.comparisonExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitComparisonExpression([NotNull] GoParser.ComparisonExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.assighmentExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterAssighmentExpression([NotNull] GoParser.AssighmentExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.assighmentExpression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitAssighmentExpression([NotNull] GoParser.AssighmentExpressionContext context) { }
	/// <summary>
	/// Enter a parse tree produced by <see cref="GoParser.expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void EnterExpression([NotNull] GoParser.ExpressionContext context) { }
	/// <summary>
	/// Exit a parse tree produced by <see cref="GoParser.expression"/>.
	/// <para>The default implementation does nothing.</para>
	/// </summary>
	/// <param name="context">The parse tree.</param>
	public virtual void ExitExpression([NotNull] GoParser.ExpressionContext context) { }

	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void EnterEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void ExitEveryRule([NotNull] ParserRuleContext context) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitTerminal([NotNull] ITerminalNode node) { }
	/// <inheritdoc/>
	/// <remarks>The default implementation does nothing.</remarks>
	public virtual void VisitErrorNode([NotNull] IErrorNode node) { }
}