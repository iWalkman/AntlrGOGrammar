// Generated from /Users/Konstantin/IdeaProjects/ANTLR/Go.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GoParser extends Parser {
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
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_printlnStatement = 2, RULE_typeDeclaration = 3, 
		RULE_varDeclaration = 4, RULE_methodDeclaration = 5, RULE_primaryExpression = 6, 
		RULE_unaryExpression = 7, RULE_multiplicativeExpression = 8, RULE_additiveExpression = 9, 
		RULE_comparisonExpression = 10, RULE_assighmentExpression = 11, RULE_expression = 12;
	public static final String[] ruleNames = {
		"file", "statement", "printlnStatement", "typeDeclaration", "varDeclaration", 
		"methodDeclaration", "primaryExpression", "unaryExpression", "multiplicativeExpression", 
		"additiveExpression", "comparisonExpression", "assighmentExpression", 
		"expression"
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

	@Override
	public String getGrammarFileName() { return "Go.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GoParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					statement();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(33);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << PrintLn) | (1L << ComplexLitteral) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << FloatLitteral) | (1L << Id) | (1L << VosklichatelniyZnak))) != 0)) {
				{
				setState(32);
				statement();
				}
			}

			setState(35);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnStatementContext printlnStatement() {
			return getRuleContext(PrintlnStatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(41);
			switch (_input.LA(1)) {
			case ComplexLitteral:
			case IntegerLiteral:
			case StringLiteral:
			case FloatLitteral:
			case Id:
			case VosklichatelniyZnak:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				expression();
				}
				break;
			case PrintLn:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				printlnStatement();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				typeDeclaration();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				methodDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PrintlnStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrintlnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printlnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterPrintlnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitPrintlnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitPrintlnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnStatementContext printlnStatement() throws RecognitionException {
		PrintlnStatementContext _localctx = new PrintlnStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_printlnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(PrintLn);
			setState(44);
			match(OpenParen);
			setState(53);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ComplexLitteral) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << FloatLitteral) | (1L << Id) | (1L << VosklichatelniyZnak))) != 0)) {
				{
				setState(45);
				expression();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(46);
					match(T__0);
					setState(47);
					expression();
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(55);
			match(CloseParen);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(GoParser.Id, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__1);
			setState(58);
			match(Id);
			setState(59);
			match(T__2);
			setState(60);
			match(T__3);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==Id) {
				{
				setState(63);
				switch (_input.LA(1)) {
				case Id:
					{
					setState(61);
					varDeclaration();
					}
					break;
				case T__5:
					{
					setState(62);
					methodDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__4);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(GoParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(GoParser.Id, i);
		}
		public TerminalNode TypeName() { return getToken(GoParser.TypeName, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(Id);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(71);
				match(T__0);
				setState(72);
				match(Id);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(TypeName);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(GoParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(GoParser.Id, i);
		}
		public List<TerminalNode> TypeName() { return getTokens(GoParser.TypeName); }
		public TerminalNode TypeName(int i) {
			return getToken(GoParser.TypeName, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__5);
			setState(81);
			match(OpenParen);
			setState(92);
			_la = _input.LA(1);
			if (_la==Id) {
				{
				setState(82);
				match(Id);
				setState(83);
				match(TypeName);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(84);
					match(T__0);
					setState(85);
					match(Id);
					setState(86);
					match(TypeName);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(94);
			match(CloseParen);
			setState(95);
			match(Id);
			setState(96);
			match(OpenParen);
			setState(97);
			match(CloseParen);
			setState(98);
			match(T__3);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					statement();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(106);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << PrintLn) | (1L << ComplexLitteral) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << FloatLitteral) | (1L << Id) | (1L << VosklichatelniyZnak))) != 0)) {
				{
				setState(105);
				statement();
				}
			}

			setState(108);
			match(T__4);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(GoParser.Id, 0); }
		public TerminalNode ComplexLitteral() { return getToken(GoParser.ComplexLitteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(GoParser.IntegerLiteral, 0); }
		public TerminalNode FloatLitteral() { return getToken(GoParser.FloatLitteral, 0); }
		public TerminalNode StringLiteral() { return getToken(GoParser.StringLiteral, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ComplexLitteral) | (1L << IntegerLiteral) | (1L << StringLiteral) | (1L << FloatLitteral) | (1L << Id))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryExpression);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case ComplexLitteral:
			case IntegerLiteral:
			case StringLiteral:
			case FloatLitteral:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				primaryExpression();
				}
				break;
			case VosklichatelniyZnak:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(VosklichatelniyZnak);
				setState(114);
				primaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(118);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(120);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(121);
						match(Multiply);
						setState(122);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(123);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(124);
						match(Modulo);
						setState(125);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(126);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(127);
						match(Bitwiseand);
						setState(128);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(137);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(138);
						match(Minus);
						setState(139);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(140);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(141);
						match(Palochka);
						setState(142);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		return comparisonExpression(0);
	}

	private ComparisonExpressionContext comparisonExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, _parentState);
		ComparisonExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_comparisonExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(149);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ComparisonExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(151);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(152);
						match(LessThan);
						setState(153);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(154);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(155);
						match(LessOrEqual);
						setState(156);
						additiveExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(157);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(158);
						match(Equals);
						setState(159);
						additiveExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new ComparisonExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(160);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(161);
						match(GreaterOrEqual);
						setState(162);
						additiveExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(163);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(164);
						match(GreaterThan);
						setState(165);
						additiveExpression(0);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
						setState(166);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(167);
						match(NotEquals);
						setState(168);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssighmentExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public TerminalNode Id() { return getToken(GoParser.Id, 0); }
		public AssighmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assighmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterAssighmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitAssighmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitAssighmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssighmentExpressionContext assighmentExpression() throws RecognitionException {
		AssighmentExpressionContext _localctx = new AssighmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assighmentExpression);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				comparisonExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(Id);
				setState(176);
				match(Prisvaivanie);
				setState(177);
				comparisonExpression(0);
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssighmentExpressionContext assighmentExpression() {
			return getRuleContext(AssighmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GoListener ) ((GoListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoVisitor ) return ((GoVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			assighmentExpression();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 9:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 10:
			return comparisonExpression_sempred((ComparisonExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean comparisonExpression_sempred(ComparisonExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\5\2$\n"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f\4"+
		"\16\4\66\13\4\5\48\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5B\n\5\f\5\16"+
		"\5E\13\5\3\5\3\5\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\5\7_\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\7\5\7m\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\t\5\tv\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0084"+
		"\n\n\f\n\16\n\u0087\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0092\n\13\f\13\16\13\u0095\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ac\n\f\f"+
		"\f\16\f\u00af\13\f\3\r\3\r\3\r\3\r\5\r\u00b5\n\r\3\16\3\16\3\16\2\5\22"+
		"\24\26\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\5\2\16\20\22\22\36\36\u00c6"+
		"\2\37\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\b;\3\2\2\2\nH\3\2\2\2\fR\3\2\2\2\16"+
		"p\3\2\2\2\20u\3\2\2\2\22w\3\2\2\2\24\u0088\3\2\2\2\26\u0096\3\2\2\2\30"+
		"\u00b4\3\2\2\2\32\u00b6\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!\3\2\2"+
		"\2\37\35\3\2\2\2\37 \3\2\2\2 #\3\2\2\2!\37\3\2\2\2\"$\5\4\3\2#\"\3\2\2"+
		"\2#$\3\2\2\2$%\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\',\5\32\16\2(,\5\6\4\2),\5"+
		"\b\5\2*,\5\f\7\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-"+
		".\7\n\2\2.\67\7\13\2\2/\64\5\32\16\2\60\61\7\3\2\2\61\63\5\32\16\2\62"+
		"\60\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\67/\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\f\2\2:\7\3\2\2\2;<\7\4"+
		"\2\2<=\7\36\2\2=>\7\5\2\2>C\7\6\2\2?B\5\n\6\2@B\5\f\7\2A?\3\2\2\2A@\3"+
		"\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\7\2\2G\t"+
		"\3\2\2\2HM\7\36\2\2IJ\7\3\2\2JL\7\36\2\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\t\2\2Q\13\3\2\2\2RS\7\b\2\2S^\7\13"+
		"\2\2TU\7\36\2\2U[\7\t\2\2VW\7\3\2\2WX\7\36\2\2XZ\7\t\2\2YV\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2][\3\2\2\2^T\3\2\2\2^_\3\2\2\2_"+
		"`\3\2\2\2`a\7\f\2\2ab\7\36\2\2bc\7\13\2\2cd\7\f\2\2dh\7\6\2\2eg\5\4\3"+
		"\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2km\5\4\3"+
		"\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7\7\2\2o\r\3\2\2\2pq\t\2\2\2q\17\3"+
		"\2\2\2rv\5\16\b\2st\7!\2\2tv\5\16\b\2ur\3\2\2\2us\3\2\2\2v\21\3\2\2\2"+
		"wx\b\n\1\2xy\5\20\t\2y\u0085\3\2\2\2z{\f\5\2\2{|\7\24\2\2|\u0084\5\20"+
		"\t\2}~\f\4\2\2~\177\7\25\2\2\177\u0084\5\20\t\2\u0080\u0081\f\3\2\2\u0081"+
		"\u0082\7\26\2\2\u0082\u0084\5\20\t\2\u0083z\3\2\2\2\u0083}\3\2\2\2\u0083"+
		"\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\23\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\13\1\2\u0089\u008a"+
		"\5\22\n\2\u008a\u0093\3\2\2\2\u008b\u008c\f\4\2\2\u008c\u008d\7\r\2\2"+
		"\u008d\u0092\5\22\n\2\u008e\u008f\f\3\2\2\u008f\u0090\7\27\2\2\u0090\u0092"+
		"\5\22\n\2\u0091\u008b\3\2\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\25\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0097\b\f\1\2\u0097\u0098\5\24\13\2\u0098\u00ad\3\2\2\2"+
		"\u0099\u009a\f\b\2\2\u009a\u009b\7\30\2\2\u009b\u00ac\5\24\13\2\u009c"+
		"\u009d\f\7\2\2\u009d\u009e\7\31\2\2\u009e\u00ac\5\24\13\2\u009f\u00a0"+
		"\f\6\2\2\u00a0\u00a1\7\32\2\2\u00a1\u00ac\5\24\13\2\u00a2\u00a3\f\5\2"+
		"\2\u00a3\u00a4\7\33\2\2\u00a4\u00ac\5\24\13\2\u00a5\u00a6\f\4\2\2\u00a6"+
		"\u00a7\7\34\2\2\u00a7\u00ac\5\24\13\2\u00a8\u00a9\f\3\2\2\u00a9\u00aa"+
		"\7\35\2\2\u00aa\u00ac\5\24\13\2\u00ab\u0099\3\2\2\2\u00ab\u009c\3\2\2"+
		"\2\u00ab\u009f\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a8"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\27\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b5\5\26\f\2\u00b1\u00b2\7\36"+
		"\2\2\u00b2\u00b3\7\"\2\2\u00b3\u00b5\5\26\f\2\u00b4\u00b0\3\2\2\2\u00b4"+
		"\u00b1\3\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\5\30\r\2\u00b7\33\3\2\2\2"+
		"\26\37#+\64\67ACM[^hlu\u0083\u0085\u0091\u0093\u00ab\u00ad\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}