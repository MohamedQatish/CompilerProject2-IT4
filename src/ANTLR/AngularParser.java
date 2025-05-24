package ANTLR;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;


public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MULTILINECOMMENT=1, SINGLELINECOMMENT=2, AT=3, BACKTICK=4, CLASS=5, EXPORT=6, 
		LET=7, COMPONENT=8, SELECTOR=9, STANDALONE=10, IMPORTS=11, TEMPLATE=12, 
		STYLES=13, SEMICOLON=14, OPENBRACKET=15, CLOSEBRACKET=16, OPENPAREN=17, 
		CLOSEPAREN=18, OPENBRACE=19, CLOSEBRACE=20, COMMA=21, ASSIGN=22, QUESTIONMARK=23, 
		QUESTIONMARKDOT=24, COLON=25, ELLIPSIS=26, DOT=27, PLUSPLUS=28, MINUSMINUS=29, 
		PLUS=30, MINUS=31, BITNOT=32, NOT=33, MULTIPLY=34, DIVIDE=35, MODULUS=36, 
		NULLCOALESCE=37, HASHTAG=38, RIGHTSHIFTARITHMETIC=39, LEFTSHIFTARITHMETIC=40, 
		RIGHTSHIFTLOGICAL=41, LESSTHAN=42, MORETHAN=43, LESSTHANEQUALS=44, GREATERTHANEQUALS=45, 
		EQUALS=46, NOTEQUALS=47, IDENTITYEQUALS=48, IDENTITYNOTEQUALS=49, BITAND=50, 
		BITXOR=51, BITOR=52, AND=53, OR=54, MULTIPLYASSIGN=55, DIVIDEASSIGN=56, 
		MODULUSASSIGN=57, PLUSASSIGN=58, MINUSASSIGN=59, LEFTSHIFTARITHMETICASSIGN=60, 
		RIGHTSHIFTARITHMETICASSIGN=61, RIGHTSHIFTLOGICALASSIGN=62, BITANDASSIGN=63, 
		BITXORASSIGN=64, BITORASSIGN=65, NULLISHCOALESCINGASSIGN=66, ARROW=67, 
		REACTCREATEELEMENT=68, BREAK=69, DO=70, INSTANCEOF=71, TYPEOF=72, CASE=73, 
		ELSE=74, ELSEIF=75, NEW=76, VAR=77, CATCH=78, FINALLY=79, RETURN=80, VOID=81, 
		CONTINUE=82, FOR=83, SWITCH=84, WHILE=85, DEBUGGER=86, FUNCTION=87, THIS=88, 
		WITH=89, DEFAULT=90, IF=91, THROW=92, DELETE=93, IN=94, TRY=95, AS=96, 
		FROM=97, OF=98, NULLLITERAL=99, BOOLEANLITERAL=100, STRINGLITERAL=101, 
		ENUM=102, EXTENDS=103, SUPER=104, CONST=105, IMPORT=106, IMPLEMENTS=107, 
		STRICTLET=108, PRIVATE=109, PUBLIC=110, INTERFACE=111, PACKAGE=112, PROTECTED=113, 
		STATIC=114, MAP=115, DECIMALLITERAL=116, IDENTIFIER=117, TAGNAME=118, 
		ID=119, NUMBER=120, WS=121, NGIFDIRECTIVE=122, NGFORDIRECTIVE=123, NGMODULE=124, 
		INJECTABLE=125, PIPE=126, QUT=127, OPEN_MUSTACHE=128, CLOSE_MUSTACHE=129, 
		CLOSE_TAG=130, HEXCOLOR=131, OBJECTLITERAL=132;
	public static final int
		RULE_program = 0, RULE_eos = 1, RULE_importStatement = 2, RULE_importFromBlock = 3, 
		RULE_moduleItems = 4, RULE_statment = 5, RULE_expressionStatement = 6, 
		RULE_returnStatement = 7, RULE_functionDeclaration = 8, RULE_exportStatement = 9, 
		RULE_variableStatement = 10, RULE_varModifier = 11, RULE_variableDeclaration = 12, 
		RULE_assignable = 13, RULE_singleExpression = 14, RULE_singleExpressionCss = 15, 
		RULE_forstatment = 16, RULE_functionCall = 17, RULE_directive = 18, RULE_ifStatement = 19, 
		RULE_statementBlock = 20, RULE_componentDeclaration = 21, RULE_componentAttributes = 22, 
		RULE_componentAttribute = 23, RULE_selectorDeclaration = 24, RULE_standaloneDeclaration = 25, 
		RULE_importsDeclaration = 26, RULE_templateDeclaration = 27, RULE_stylesDeclaration = 28, 
		RULE_classDeclaration = 29, RULE_classBody = 30, RULE_templateStatement = 31, 
		RULE_htmlElements = 32, RULE_htmlElement = 33, RULE_htmlContent = 34, 
		RULE_htmlAttribute = 35, RULE_mustacheExpression = 36, RULE_htmlAttributeValue = 37, 
		RULE_arrayLiteral = 38, RULE_indexarray = 39, RULE_arrayCss = 40, RULE_objectLiteral = 41, 
		RULE_propertyAssignment = 42, RULE_literal = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "eos", "importStatement", "importFromBlock", "moduleItems", 
			"statment", "expressionStatement", "returnStatement", "functionDeclaration", 
			"exportStatement", "variableStatement", "varModifier", "variableDeclaration", 
			"assignable", "singleExpression", "singleExpressionCss", "forstatment", 
			"functionCall", "directive", "ifStatement", "statementBlock", "componentDeclaration", 
			"componentAttributes", "componentAttribute", "selectorDeclaration", "standaloneDeclaration", 
			"importsDeclaration", "templateDeclaration", "stylesDeclaration", "classDeclaration", 
			"classBody", "templateStatement", "htmlElements", "htmlElement", "htmlContent", 
			"htmlAttribute", "mustacheExpression", "htmlAttributeValue", "arrayLiteral", 
			"indexarray", "arrayCss", "objectLiteral", "propertyAssignment", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'@'", "'`'", "'class'", "'export'", null, "'Component'", 
			"'selector'", "'standalone'", "'imports'", "'template'", "'styles'", 
			"';'", "'['", "']'", "'('", "')'", "'{'", "'}'", "','", "'='", "'?'", 
			"'?.'", "':'", "'...'", "'.'", "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", 
			"'*'", "'/'", "'%'", "'??'", "'#'", "'>>'", "'<<'", "'>>>'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", 
			"'&&'", "'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", 
			"'>>>='", "'&='", "'^='", "'|='", "'??='", "'=>'", "'React.createElement'", 
			"'break'", "'do'", "'instanceof'", "'typeof'", "'case'", "'else'", "'else if'", 
			"'new'", "'var'", "'catch'", "'finally'", "'return'", "'void'", "'continue'", 
			"'for'", "'switch'", "'while'", "'debugger'", "'function'", "'this'", 
			"'with'", "'default'", "'if'", "'throw'", "'delete'", "'in'", "'try'", 
			"'as'", "'from'", "'of'", "'null'", null, null, "'enum'", "'extends'", 
			"'super'", "'const'", "'import'", "'implements'", null, "'private'", 
			"'public'", "'interface'", "'package'", "'protected'", "'static'", "'map'", 
			null, null, null, null, null, null, "'*ngIf'", "'*ngFor'", "'NgModule'", 
			"'Injectable'", "'Pipe'", "'\"'", "'{{'", "'}}'", "'</'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MULTILINECOMMENT", "SINGLELINECOMMENT", "AT", "BACKTICK", "CLASS", 
			"EXPORT", "LET", "COMPONENT", "SELECTOR", "STANDALONE", "IMPORTS", "TEMPLATE", 
			"STYLES", "SEMICOLON", "OPENBRACKET", "CLOSEBRACKET", "OPENPAREN", "CLOSEPAREN", 
			"OPENBRACE", "CLOSEBRACE", "COMMA", "ASSIGN", "QUESTIONMARK", "QUESTIONMARKDOT", 
			"COLON", "ELLIPSIS", "DOT", "PLUSPLUS", "MINUSMINUS", "PLUS", "MINUS", 
			"BITNOT", "NOT", "MULTIPLY", "DIVIDE", "MODULUS", "NULLCOALESCE", "HASHTAG", 
			"RIGHTSHIFTARITHMETIC", "LEFTSHIFTARITHMETIC", "RIGHTSHIFTLOGICAL", "LESSTHAN", 
			"MORETHAN", "LESSTHANEQUALS", "GREATERTHANEQUALS", "EQUALS", "NOTEQUALS", 
			"IDENTITYEQUALS", "IDENTITYNOTEQUALS", "BITAND", "BITXOR", "BITOR", "AND", 
			"OR", "MULTIPLYASSIGN", "DIVIDEASSIGN", "MODULUSASSIGN", "PLUSASSIGN", 
			"MINUSASSIGN", "LEFTSHIFTARITHMETICASSIGN", "RIGHTSHIFTARITHMETICASSIGN", 
			"RIGHTSHIFTLOGICALASSIGN", "BITANDASSIGN", "BITXORASSIGN", "BITORASSIGN", 
			"NULLISHCOALESCINGASSIGN", "ARROW", "REACTCREATEELEMENT", "BREAK", "DO", 
			"INSTANCEOF", "TYPEOF", "CASE", "ELSE", "ELSEIF", "NEW", "VAR", "CATCH", 
			"FINALLY", "RETURN", "VOID", "CONTINUE", "FOR", "SWITCH", "WHILE", "DEBUGGER", 
			"FUNCTION", "THIS", "WITH", "DEFAULT", "IF", "THROW", "DELETE", "IN", 
			"TRY", "AS", "FROM", "OF", "NULLLITERAL", "BOOLEANLITERAL", "STRINGLITERAL", 
			"ENUM", "EXTENDS", "SUPER", "CONST", "IMPORT", "IMPLEMENTS", "STRICTLET", 
			"PRIVATE", "PUBLIC", "INTERFACE", "PACKAGE", "PROTECTED", "STATIC", "MAP", 
			"DECIMALLITERAL", "IDENTIFIER", "TAGNAME", "ID", "NUMBER", "WS", "NGIFDIRECTIVE", 
			"NGFORDIRECTIVE", "NGMODULE", "INJECTABLE", "PIPE", "QUT", "OPEN_MUSTACHE", 
			"CLOSE_MUSTACHE", "CLOSE_TAG", "HEXCOLOR", "OBJECTLITERAL"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			importStatement();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181417192L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 56296919785277513L) != 0)) {
				{
				{
				setState(89);
				statment();
				}
				}
				setState(94);
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


	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(95);
				match(SEMICOLON);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public List<TerminalNode> IMPORT() { return getTokens(AngularParser.IMPORT); }
		public TerminalNode IMPORT(int i) {
			return getToken(AngularParser.IMPORT, i);
		}
		public List<ImportFromBlockContext> importFromBlock() {
			return getRuleContexts(ImportFromBlockContext.class);
		}
		public ImportFromBlockContext importFromBlock(int i) {
			return getRuleContext(ImportFromBlockContext.class,i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(98);
				match(IMPORT);
				setState(99);
				importFromBlock();
				}
				}
				setState(104);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromBlockContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(AngularParser.STRINGLITERAL, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ModuleItemsContext moduleItems() {
			return getRuleContext(ModuleItemsContext.class,0);
		}
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportFromBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportFromBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportFromBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importFromBlock);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(STRINGLITERAL);
				setState(106);
				eos();
				}
				break;
			case OPENBRACE:
			case FROM:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(107);
					match(IDENTIFIER);
					}
				}

				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENBRACE) {
					{
					setState(110);
					moduleItems();
					}
				}

				setState(113);
				match(FROM);
				setState(114);
				match(STRINGLITERAL);
				setState(115);
				eos();
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


	public static class ModuleItemsContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AngularParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AngularParser.CLOSEBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public ModuleItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModuleItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModuleItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModuleItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleItemsContext moduleItems() throws RecognitionException {
		ModuleItemsContext _localctx = new ModuleItemsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moduleItems);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(OPENBRACE);
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(119);
					match(IDENTIFIER);
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(120);
						match(COMMA);
						setState(121);
						match(IDENTIFIER);
						}
						}
						setState(126);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(129);
				match(CLOSEBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(OPENBRACE);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMPONENT) {
					{
					setState(131);
					match(COMPONENT);
					}
				}

				setState(134);
				match(CLOSEBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatmentContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statment);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				componentDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				classDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				variableStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			singleExpression(0);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(145);
				match(COMMA);
				setState(146);
				singleExpression(0);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(RETURN);
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(155);
				singleExpression(0);
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(156);
						match(COMMA);
						setState(157);
						singleExpression(0);
						}
						} 
					}
					setState(162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			}
			setState(165);
			eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPENPAREN() { return getToken(AngularParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(AngularParser.CLOSEPAREN, 0); }
		public TerminalNode OPENBRACE() { return getToken(AngularParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AngularParser.CLOSEBRACE, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(167);
				match(EXPORT);
				}
			}

			setState(170);
			match(IDENTIFIER);
			setState(171);
			match(OPENPAREN);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181416960L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2533515312234761L) != 0)) {
				{
				{
				setState(172);
				singleExpression(0);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				singleExpression(0);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(CLOSEPAREN);
			setState(186);
			match(OPENBRACE);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181417192L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 56296919785277513L) != 0)) {
				{
				{
				setState(187);
				statment();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(CLOSEBRACE);
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(194);
				exportStatement();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(EXPORT);
			setState(198);
			match(IDENTIFIER);
			setState(199);
			eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT || _la==LET || _la==VAR || _la==CONST) {
				{
				setState(201);
				varModifier();
				}
			}

			setState(204);
			variableDeclaration();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(205);
				match(COMMA);
				setState(206);
				variableDeclaration();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			eos();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varModifier);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXPORT) {
					{
					setState(214);
					match(EXPORT);
					}
				}

				setState(217);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXPORT) {
					{
					setState(218);
					match(EXPORT);
					}
				}

				setState(221);
				match(LET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXPORT) {
					{
					setState(222);
					match(EXPORT);
					}
				}

				setState(225);
				match(CONST);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public AssignableContext assignable() {
			return getRuleContext(AssignableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			assignable();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(229);
				match(ASSIGN);
				setState(230);
				singleExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignableContext extends ParserRuleContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OBJECTLITERAL() { return getToken(AngularParser.OBJECTLITERAL, 0); }
		public AssignableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignableContext assignable() throws RecognitionException {
		AssignableContext _localctx = new AssignableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignable);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				arrayLiteral();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(IDENTIFIER);
				}
				break;
			case OBJECTLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(OBJECTLITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IndexarrayContext indexarray() {
			return getRuleContext(IndexarrayContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ForstatmentContext forstatment() {
			return getRuleContext(ForstatmentContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public MustacheExpressionContext mustacheExpression() {
			return getRuleContext(MustacheExpressionContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public TerminalNode OPENPAREN() { return getToken(AngularParser.OPENPAREN, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CLOSEPAREN() { return getToken(AngularParser.CLOSEPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode MAP() { return getToken(AngularParser.MAP, 0); }
		public TerminalNode OPENBRACE() { return getToken(AngularParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AngularParser.CLOSEBRACE, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public SingleExpressionCssContext singleExpressionCss() {
			return getRuleContext(SingleExpressionCssContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode MULTIPLY() { return getToken(AngularParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode AND() { return getToken(AngularParser.AND, 0); }
		public TerminalNode QUESTIONMARK() { return getToken(AngularParser.QUESTIONMARK, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode PLUSPLUS() { return getToken(AngularParser.PLUSPLUS, 0); }
		public TerminalNode MINUSMINUS() { return getToken(AngularParser.MINUSMINUS, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(239);
				literal();
				}
				break;
			case 2:
				{
				setState(240);
				indexarray();
				}
				break;
			case 3:
				{
				setState(241);
				arrayLiteral();
				}
				break;
			case 4:
				{
				setState(242);
				forstatment();
				}
				break;
			case 5:
				{
				setState(243);
				objectLiteral();
				}
				break;
			case 6:
				{
				setState(244);
				mustacheExpression();
				}
				break;
			case 7:
				{
				setState(245);
				returnStatement();
				}
				break;
			case 8:
				{
				setState(246);
				htmlElements();
				}
				break;
			case 9:
				{
				setState(247);
				match(OPENPAREN);
				setState(248);
				singleExpression(0);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(249);
					match(COMMA);
					setState(250);
					singleExpression(0);
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(CLOSEPAREN);
				}
				break;
			case 10:
				{
				setState(258);
				match(IDENTIFIER);
				}
				break;
			case 11:
				{
				setState(259);
				match(MAP);
				}
				break;
			case 12:
				{
				setState(260);
				match(OPENBRACE);
				setState(261);
				singleExpression(0);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPENPAREN) {
					{
					setState(262);
					match(OPENPAREN);
					setState(263);
					match(CLOSEPAREN);
					}
				}

				setState(266);
				match(CLOSEBRACE);
				}
				break;
			case 13:
				{
				setState(268);
				match(THIS);
				}
				break;
			case 14:
				{
				setState(269);
				singleExpressionCss();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(272);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(273);
						match(DOT);
						setState(274);
						singleExpression(20);
						}
						break;
					case 2:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(275);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(276);
						match(MULTIPLY);
						setState(277);
						singleExpression(19);
						}
						break;
					case 3:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(278);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(279);
						match(DIVIDE);
						setState(280);
						singleExpression(18);
						}
						break;
					case 4:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(281);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(282);
						match(PLUS);
						setState(283);
						singleExpression(17);
						}
						break;
					case 5:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(284);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(285);
						match(MINUS);
						setState(286);
						singleExpression(16);
						}
						break;
					case 6:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(287);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(288);
						match(COLON);
						setState(289);
						singleExpression(15);
						}
						break;
					case 7:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(290);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(291);
						match(AND);
						setState(292);
						singleExpression(14);
						}
						break;
					case 8:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(293);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(294);
						match(QUESTIONMARK);
						setState(295);
						singleExpression(0);
						setState(296);
						match(COLON);
						setState(297);
						singleExpression(13);
						}
						break;
					case 9:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(299);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(300);
						match(ASSIGN);
						setState(301);
						singleExpression(12);
						}
						break;
					case 10:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(302);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(303);
						singleExpression(11);
						}
						break;
					case 11:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(304);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(305);
						match(PLUSPLUS);
						}
						break;
					case 12:
						{
						_localctx = new SingleExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(306);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(307);
						match(MINUSMINUS);
						}
						break;
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleExpressionCssContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public SingleExpressionCssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpressionCss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSingleExpressionCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSingleExpressionCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSingleExpressionCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionCssContext singleExpressionCss() throws RecognitionException {
		SingleExpressionCssContext _localctx = new SingleExpressionCssContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_singleExpressionCss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(313);
				match(DOT);
				}
			}

			setState(316);
			match(IDENTIFIER);
			setState(317);
			objectLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForstatmentContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode OPENPAREN() { return getToken(AngularParser.OPENPAREN, 0); }
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(AngularParser.CLOSEPAREN, 0); }
		public TerminalNode OPENBRACE() { return getToken(AngularParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AngularParser.CLOSEBRACE, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode MORETHAN() { return getToken(AngularParser.MORETHAN, 0); }
		public TerminalNode LESSTHAN() { return getToken(AngularParser.LESSTHAN, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ForstatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForstatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForstatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForstatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatmentContext forstatment() throws RecognitionException {
		ForstatmentContext _localctx = new ForstatmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forstatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(FOR);
			setState(320);
			match(OPENPAREN);
			setState(321);
			variableStatement();
			setState(322);
			match(IDENTIFIER);
			setState(323);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13194143727616L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(324);
			singleExpression(0);
			setState(325);
			match(SEMICOLON);
			setState(326);
			singleExpression(0);
			setState(327);
			match(CLOSEPAREN);
			setState(328);
			match(OPENBRACE);
			setState(329);
			singleExpression(0);
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(330);
				eos();
				}
				break;
			}
			setState(333);
			match(CLOSEBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPENPAREN() { return getToken(AngularParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(AngularParser.CLOSEPAREN, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(IDENTIFIER);
			setState(336);
			match(OPENPAREN);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181416960L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2533515312234761L) != 0)) {
				{
				setState(337);
				singleExpression(0);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(338);
					match(COMMA);
					setState(339);
					singleExpression(0);
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(347);
			match(CLOSEPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode NGIFDIRECTIVE() { return getToken(AngularParser.NGIFDIRECTIVE, 0); }
		public TerminalNode NGFORDIRECTIVE() { return getToken(AngularParser.NGFORDIRECTIVE, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !(_la==NGIFDIRECTIVE || _la==NGFORDIRECTIVE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode OPENPAREN() { return getToken(AngularParser.OPENPAREN, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode CLOSEPAREN() { return getToken(AngularParser.CLOSEPAREN, 0); }
		public List<StatementBlockContext> statementBlock() {
			return getRuleContexts(StatementBlockContext.class);
		}
		public StatementBlockContext statementBlock(int i) {
			return getRuleContext(StatementBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(IF);
			setState(352);
			match(OPENPAREN);
			setState(353);
			singleExpression(0);
			setState(354);
			match(CLOSEPAREN);
			setState(355);
			statementBlock();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(356);
				match(ELSE);
				setState(357);
				statementBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementBlockContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AngularParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AngularParser.CLOSEBRACE, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(OPENBRACE);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181417192L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 56296919785277513L) != 0)) {
				{
				{
				setState(361);
				statment();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(CLOSEBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode OPENPAREN() { return getToken(AngularParser.OPENPAREN, 0); }
		public ComponentAttributesContext componentAttributes() {
			return getRuleContext(ComponentAttributesContext.class,0);
		}
		public TerminalNode CLOSEPAREN() { return getToken(AngularParser.CLOSEPAREN, 0); }
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(AT);
			setState(370);
			match(COMPONENT);
			setState(371);
			match(OPENPAREN);
			setState(372);
			componentAttributes();
			setState(373);
			match(CLOSEPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentAttributesContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AngularParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AngularParser.CLOSEBRACE, 0); }
		public List<ComponentAttributeContext> componentAttribute() {
			return getRuleContexts(ComponentAttributeContext.class);
		}
		public ComponentAttributeContext componentAttribute(int i) {
			return getRuleContext(ComponentAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ComponentAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentAttributesContext componentAttributes() throws RecognitionException {
		ComponentAttributesContext _localctx = new ComponentAttributesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_componentAttributes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(OPENBRACE);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134233600L) != 0) || _la==IDENTIFIER) {
				{
				setState(376);
				componentAttribute();
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(377);
						match(COMMA);
						setState(378);
						componentAttribute();
						}
						} 
					}
					setState(383);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(384);
					match(COMMA);
					}
				}

				}
			}

			setState(389);
			match(CLOSEBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentAttributeContext extends ParserRuleContext {
		public SelectorDeclarationContext selectorDeclaration() {
			return getRuleContext(SelectorDeclarationContext.class,0);
		}
		public StandaloneDeclarationContext standaloneDeclaration() {
			return getRuleContext(StandaloneDeclarationContext.class,0);
		}
		public ImportsDeclarationContext importsDeclaration() {
			return getRuleContext(ImportsDeclarationContext.class,0);
		}
		public TemplateDeclarationContext templateDeclaration() {
			return getRuleContext(TemplateDeclarationContext.class,0);
		}
		public StylesDeclarationContext stylesDeclaration() {
			return getRuleContext(StylesDeclarationContext.class,0);
		}
		public SingleExpressionCssContext singleExpressionCss() {
			return getRuleContext(SingleExpressionCssContext.class,0);
		}
		public ComponentAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentAttributeContext componentAttribute() throws RecognitionException {
		ComponentAttributeContext _localctx = new ComponentAttributeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_componentAttribute);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				selectorDeclaration();
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				standaloneDeclaration();
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				importsDeclaration();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				templateDeclaration();
				}
				break;
			case STYLES:
				enterOuterAlt(_localctx, 5);
				{
				setState(395);
				stylesDeclaration();
				}
				break;
			case DOT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(396);
				singleExpressionCss();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorDeclarationContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(AngularParser.STRINGLITERAL, 0); }
		public SelectorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorDeclarationContext selectorDeclaration() throws RecognitionException {
		SelectorDeclarationContext _localctx = new SelectorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_selectorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(SELECTOR);
			setState(400);
			match(COLON);
			setState(401);
			match(STRINGLITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StandaloneDeclarationContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode BOOLEANLITERAL() { return getToken(AngularParser.BOOLEANLITERAL, 0); }
		public StandaloneDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandaloneDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandaloneDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandaloneDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneDeclarationContext standaloneDeclaration() throws RecognitionException {
		StandaloneDeclarationContext _localctx = new StandaloneDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_standaloneDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(STANDALONE);
			setState(404);
			match(COLON);
			setState(405);
			match(BOOLEANLITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ImportsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsDeclarationContext importsDeclaration() throws RecognitionException {
		ImportsDeclarationContext _localctx = new ImportsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_importsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(IMPORTS);
			setState(408);
			match(COLON);
			setState(409);
			arrayLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateDeclarationContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public TemplateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDeclarationContext templateDeclaration() throws RecognitionException {
		TemplateDeclarationContext _localctx = new TemplateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_templateDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(TEMPLATE);
			setState(412);
			match(COLON);
			setState(413);
			match(BACKTICK);
			setState(414);
			htmlElements();
			setState(415);
			match(BACKTICK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StylesDeclarationContext extends ParserRuleContext {
		public TerminalNode STYLES() { return getToken(AngularParser.STYLES, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public StylesDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesDeclarationContext stylesDeclaration() throws RecognitionException {
		StylesDeclarationContext _localctx = new StylesDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stylesDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(STYLES);
			setState(418);
			match(COLON);
			setState(419);
			arrayLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(421);
				match(EXPORT);
				}
			}

			setState(424);
			match(CLASS);
			setState(425);
			match(IDENTIFIER);
			setState(426);
			classBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AngularParser.OPENBRACE, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CLOSEBRACE() { return getToken(AngularParser.CLOSEBRACE, 0); }
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classBody);
		int _la;
		try {
			int _alt;
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(OPENBRACE);
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(429);
						singleExpression(0);
						}
						} 
					}
					setState(434);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			case EXPORT:
			case CLOSEBRACE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EXPORT || _la==IDENTIFIER) {
					{
					{
					setState(435);
					functionDeclaration();
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(441);
				match(CLOSEBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateStatementContext extends ParserRuleContext {
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TemplateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStatementContext templateStatement() throws RecognitionException {
		TemplateStatementContext _localctx = new TemplateStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_templateStatement);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				htmlElements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				singleExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementsContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_htmlElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(449); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(448);
					htmlElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(451); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(AngularParser.LESSTHAN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> MORETHAN() { return getTokens(AngularParser.MORETHAN); }
		public TerminalNode MORETHAN(int i) {
			return getToken(AngularParser.MORETHAN, i);
		}
		public TerminalNode CLOSE_TAG() { return getToken(AngularParser.CLOSE_TAG, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(AngularParser.DIVIDE, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_htmlElement);
		int _la;
		try {
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				match(LESSTHAN);
				setState(454);
				match(IDENTIFIER);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 163872L) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 97L) != 0)) {
					{
					{
					setState(455);
					htmlAttribute();
					}
					}
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(461);
				match(MORETHAN);
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(462);
					htmlContent();
					}
					break;
				}
				setState(465);
				match(CLOSE_TAG);
				setState(466);
				match(IDENTIFIER);
				setState(467);
				match(MORETHAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(LESSTHAN);
				setState(469);
				match(IDENTIFIER);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 163872L) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 97L) != 0)) {
					{
					{
					setState(470);
					htmlAttribute();
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(476);
				match(DIVIDE);
				setState(477);
				match(MORETHAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181416960L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2533515312234761L) != 0)) {
				{
				setState(482);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(480);
					htmlElement();
					}
					break;
				case 2:
					{
					setState(481);
					singleExpression(0);
					}
					break;
				}
				}
				setState(486);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public HtmlAttributeValueContext htmlAttributeValue() {
			return getRuleContext(HtmlAttributeValueContext.class,0);
		}
		public TerminalNode OPENBRACKET() { return getToken(AngularParser.OPENBRACKET, 0); }
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(AngularParser.CLOSEBRACKET, 0); }
		public TerminalNode OPENPAREN() { return getToken(AngularParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(AngularParser.CLOSEPAREN, 0); }
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_htmlAttribute);
		int _la;
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				match(IDENTIFIER);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(488);
					match(ASSIGN);
					setState(489);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				match(OPENBRACKET);
				setState(493);
				match(CLASS);
				setState(494);
				match(DOT);
				setState(495);
				match(IDENTIFIER);
				setState(496);
				match(CLOSEBRACKET);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(497);
					match(ASSIGN);
					setState(498);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				match(OPENPAREN);
				setState(502);
				match(IDENTIFIER);
				setState(503);
				match(CLOSEPAREN);
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(504);
					match(ASSIGN);
					setState(505);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(508);
				directive();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(509);
					match(ASSIGN);
					setState(510);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
				match(CLASS);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(514);
					match(ASSIGN);
					setState(515);
					htmlAttributeValue();
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(518);
				match(OPENBRACKET);
				setState(519);
				match(IDENTIFIER);
				setState(520);
				match(CLOSEBRACKET);
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(521);
					match(ASSIGN);
					setState(522);
					htmlAttributeValue();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class MustacheExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_MUSTACHE() { return getToken(AngularParser.OPEN_MUSTACHE, 0); }
		public TerminalNode CLOSE_MUSTACHE() { return getToken(AngularParser.CLOSE_MUSTACHE, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public MustacheExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mustacheExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMustacheExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMustacheExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMustacheExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MustacheExpressionContext mustacheExpression() throws RecognitionException {
		MustacheExpressionContext _localctx = new MustacheExpressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mustacheExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(OPEN_MUSTACHE);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181416960L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2533515312234761L) != 0)) {
				{
				setState(528);
				singleExpression(0);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(529);
					match(COMMA);
					setState(530);
					singleExpression(0);
					}
					}
					setState(535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(538);
			match(CLOSE_MUSTACHE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeValueContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(AngularParser.STRINGLITERAL, 0); }
		public TerminalNode OPENBRACE() { return getToken(AngularParser.OPENBRACE, 0); }
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode CLOSEBRACE() { return getToken(AngularParser.CLOSEBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public HtmlAttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeValueContext htmlAttributeValue() throws RecognitionException {
		HtmlAttributeValueContext _localctx = new HtmlAttributeValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_htmlAttributeValue);
		int _la;
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(STRINGLITERAL);
				}
				break;
			case OPENBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(OPENBRACE);
				setState(542);
				singleExpression(0);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(543);
					match(COMMA);
					setState(544);
					singleExpression(0);
					}
					}
					setState(549);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(550);
				match(CLOSEBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(AngularParser.OPENBRACKET, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(AngularParser.CLOSEBRACKET, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(OPENBRACKET);
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(555);
				match(BACKTICK);
				}
				break;
			}
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181416960L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2533515312234761L) != 0)) {
				{
				setState(558);
				singleExpression(0);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(559);
					match(COMMA);
					setState(560);
					singleExpression(0);
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BACKTICK) {
				{
				setState(568);
				match(BACKTICK);
				}
			}

			setState(571);
			match(CLOSEBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IndexarrayContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode OPENBRACKET() { return getToken(AngularParser.OPENBRACKET, 0); }
		public TerminalNode DECIMALLITERAL() { return getToken(AngularParser.DECIMALLITERAL, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(AngularParser.CLOSEBRACKET, 0); }
		public IndexarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIndexarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIndexarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIndexarray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexarrayContext indexarray() throws RecognitionException {
		IndexarrayContext _localctx = new IndexarrayContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_indexarray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(IDENTIFIER);
			setState(574);
			match(OPENBRACKET);
			setState(575);
			match(DECIMALLITERAL);
			setState(576);
			match(CLOSEBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCssContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(AngularParser.OPENBRACKET, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(AngularParser.CLOSEBRACKET, 0); }
		public List<SingleExpressionCssContext> singleExpressionCss() {
			return getRuleContexts(SingleExpressionCssContext.class);
		}
		public SingleExpressionCssContext singleExpressionCss(int i) {
			return getRuleContext(SingleExpressionCssContext.class,i);
		}
		public ArrayCssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCssContext arrayCss() throws RecognitionException {
		ArrayCssContext _localctx = new ArrayCssContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayCss);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(OPENBRACKET);
			setState(579);
			match(BACKTICK);
			setState(583);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(580);
					singleExpressionCss();
					}
					} 
				}
				setState(585);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(586);
			match(BACKTICK);
			setState(587);
			match(CLOSEBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OPENBRACE() { return getToken(AngularParser.OPENBRACE, 0); }
		public TerminalNode CLOSEBRACE() { return getToken(AngularParser.CLOSEBRACE, 0); }
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AngularParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AngularParser.SEMICOLON, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(OPENBRACE);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398181416960L) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 2533515312234761L) != 0)) {
				{
				setState(590);
				propertyAssignment();
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(591);
					match(COMMA);
					setState(592);
					propertyAssignment();
					}
					}
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMICOLON) {
					{
					{
					setState(598);
					match(SEMICOLON);
					setState(599);
					propertyAssignment();
					}
					}
					setState(604);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(607);
			match(CLOSEBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAssignmentContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(AngularParser.SEMICOLON, 0); }
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			singleExpression(0);
			setState(610);
			match(COLON);
			setState(611);
			singleExpression(0);
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(612);
				match(SEMICOLON);
				}
				break;
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


	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NULLLITERAL() { return getToken(AngularParser.NULLLITERAL, 0); }
		public TerminalNode BOOLEANLITERAL() { return getToken(AngularParser.BOOLEANLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(AngularParser.STRINGLITERAL, 0); }
		public TerminalNode DECIMALLITERAL() { return getToken(AngularParser.DECIMALLITERAL, 0); }
		public TerminalNode HEXCOLOR() { return getToken(AngularParser.HEXCOLOR, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 4295098375L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0084\u026a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000"+
		"\u0001\u0000\u0005\u0000[\b\u0000\n\u0000\f\u0000^\t\u0000\u0001\u0001"+
		"\u0003\u0001a\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002e\b\u0002\n\u0002"+
		"\f\u0002h\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003m\b\u0003"+
		"\u0001\u0003\u0003\u0003p\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003u\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004{\b\u0004\n\u0004\f\u0004~\t\u0004\u0003\u0004\u0080\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0085\b\u0004\u0001\u0004"+
		"\u0003\u0004\u0088\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u008f\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u0094\b\u0006\n\u0006\f\u0006\u0097\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u009f"+
		"\b\u0007\n\u0007\f\u0007\u00a2\t\u0007\u0003\u0007\u00a4\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0003\b\u00a9\b\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00ae\b\b\n\b\f\b\u00b1\t\b\u0001\b\u0001\b\u0005\b\u00b5\b\b\n\b\f"+
		"\b\u00b8\t\b\u0001\b\u0001\b\u0001\b\u0005\b\u00bd\b\b\n\b\f\b\u00c0\t"+
		"\b\u0001\b\u0001\b\u0003\b\u00c4\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0003\n\u00cb\b\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d0\b\n\n\n\f\n"+
		"\u00d3\t\n\u0001\n\u0001\n\u0001\u000b\u0003\u000b\u00d8\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00dc\b\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00e0\b\u000b\u0001\u000b\u0003\u000b\u00e3\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00e8\b\f\u0001\r\u0001\r\u0001\r\u0003\r\u00ed\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00fc\b\u000e\n\u000e\f\u000e\u00ff\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0109\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u010f\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0135\b\u000e\n"+
		"\u000e\f\u000e\u0138\t\u000e\u0001\u000f\u0003\u000f\u013b\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u014c\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u0155\b\u0011\n\u0011\f\u0011\u0158\t\u0011\u0003\u0011\u015a\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0167\b\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u016b\b\u0014"+
		"\n\u0014\f\u0014\u016e\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u017c\b\u0016\n\u0016\f\u0016"+
		"\u017f\t\u0016\u0001\u0016\u0003\u0016\u0182\b\u0016\u0003\u0016\u0184"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u018e\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0003\u001d\u01a7\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u01af\b\u001e\n\u001e\f\u001e\u01b2\t\u001e\u0001\u001e\u0005\u001e"+
		"\u01b5\b\u001e\n\u001e\f\u001e\u01b8\t\u001e\u0001\u001e\u0003\u001e\u01bb"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u01bf\b\u001f\u0001 \u0004"+
		" \u01c2\b \u000b \f \u01c3\u0001!\u0001!\u0001!\u0005!\u01c9\b!\n!\f!"+
		"\u01cc\t!\u0001!\u0001!\u0003!\u01d0\b!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0005!\u01d8\b!\n!\f!\u01db\t!\u0001!\u0001!\u0003!\u01df\b!"+
		"\u0001\"\u0001\"\u0005\"\u01e3\b\"\n\"\f\"\u01e6\t\"\u0001#\u0001#\u0001"+
		"#\u0003#\u01eb\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u01f4\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u01fb\b#\u0001#\u0001"+
		"#\u0001#\u0003#\u0200\b#\u0001#\u0001#\u0001#\u0003#\u0205\b#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u020c\b#\u0003#\u020e\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0005$\u0214\b$\n$\f$\u0217\t$\u0003$\u0219\b$\u0001$\u0001$"+
		"\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u0222\b%\n%\f%\u0225\t%\u0001"+
		"%\u0001%\u0003%\u0229\b%\u0001&\u0001&\u0003&\u022d\b&\u0001&\u0001&\u0001"+
		"&\u0005&\u0232\b&\n&\f&\u0235\t&\u0003&\u0237\b&\u0001&\u0003&\u023a\b"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001("+
		"\u0001(\u0005(\u0246\b(\n(\f(\u0249\t(\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0005)\u0252\b)\n)\f)\u0255\t)\u0001)\u0001)\u0005)\u0259"+
		"\b)\n)\f)\u025c\t)\u0003)\u025e\b)\u0001)\u0001)\u0001*\u0001*\u0001*"+
		"\u0001*\u0003*\u0266\b*\u0001+\u0001+\u0001+\u0001\u0247\u0001\u001c,"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u0003\u0002\u0000\u0016"+
		"\u0016*+\u0001\u0000z{\u0003\u0000cett\u0083\u0083\u02aa\u0000X\u0001"+
		"\u0000\u0000\u0000\u0002`\u0001\u0000\u0000\u0000\u0004f\u0001\u0000\u0000"+
		"\u0000\u0006t\u0001\u0000\u0000\u0000\b\u0087\u0001\u0000\u0000\u0000"+
		"\n\u008e\u0001\u0000\u0000\u0000\f\u0090\u0001\u0000\u0000\u0000\u000e"+
		"\u009a\u0001\u0000\u0000\u0000\u0010\u00a8\u0001\u0000\u0000\u0000\u0012"+
		"\u00c5\u0001\u0000\u0000\u0000\u0014\u00ca\u0001\u0000\u0000\u0000\u0016"+
		"\u00e2\u0001\u0000\u0000\u0000\u0018\u00e4\u0001\u0000\u0000\u0000\u001a"+
		"\u00ec\u0001\u0000\u0000\u0000\u001c\u010e\u0001\u0000\u0000\u0000\u001e"+
		"\u013a\u0001\u0000\u0000\u0000 \u013f\u0001\u0000\u0000\u0000\"\u014f"+
		"\u0001\u0000\u0000\u0000$\u015d\u0001\u0000\u0000\u0000&\u015f\u0001\u0000"+
		"\u0000\u0000(\u0168\u0001\u0000\u0000\u0000*\u0171\u0001\u0000\u0000\u0000"+
		",\u0177\u0001\u0000\u0000\u0000.\u018d\u0001\u0000\u0000\u00000\u018f"+
		"\u0001\u0000\u0000\u00002\u0193\u0001\u0000\u0000\u00004\u0197\u0001\u0000"+
		"\u0000\u00006\u019b\u0001\u0000\u0000\u00008\u01a1\u0001\u0000\u0000\u0000"+
		":\u01a6\u0001\u0000\u0000\u0000<\u01ba\u0001\u0000\u0000\u0000>\u01be"+
		"\u0001\u0000\u0000\u0000@\u01c1\u0001\u0000\u0000\u0000B\u01de\u0001\u0000"+
		"\u0000\u0000D\u01e4\u0001\u0000\u0000\u0000F\u020d\u0001\u0000\u0000\u0000"+
		"H\u020f\u0001\u0000\u0000\u0000J\u0228\u0001\u0000\u0000\u0000L\u022a"+
		"\u0001\u0000\u0000\u0000N\u023d\u0001\u0000\u0000\u0000P\u0242\u0001\u0000"+
		"\u0000\u0000R\u024d\u0001\u0000\u0000\u0000T\u0261\u0001\u0000\u0000\u0000"+
		"V\u0267\u0001\u0000\u0000\u0000X\\\u0003\u0004\u0002\u0000Y[\u0003\n\u0005"+
		"\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0001\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000_a\u0005\u000e\u0000\u0000`_\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000a\u0003\u0001\u0000\u0000\u0000bc\u0005"+
		"j\u0000\u0000ce\u0003\u0006\u0003\u0000db\u0001\u0000\u0000\u0000eh\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"g\u0005\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005e\u0000"+
		"\u0000ju\u0003\u0002\u0001\u0000km\u0005u\u0000\u0000lk\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000np\u0003\b\u0004"+
		"\u0000on\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qr\u0005a\u0000\u0000rs\u0005e\u0000\u0000su\u0003\u0002\u0001"+
		"\u0000ti\u0001\u0000\u0000\u0000tl\u0001\u0000\u0000\u0000u\u0007\u0001"+
		"\u0000\u0000\u0000v\u007f\u0005\u0013\u0000\u0000w|\u0005u\u0000\u0000"+
		"xy\u0005\u0015\u0000\u0000y{\u0005u\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"w\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0088\u0005\u0014\u0000\u0000\u0082\u0084"+
		"\u0005\u0013\u0000\u0000\u0083\u0085\u0005\b\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001"+
		"\u0000\u0000\u0000\u0086\u0088\u0005\u0014\u0000\u0000\u0087v\u0001\u0000"+
		"\u0000\u0000\u0087\u0082\u0001\u0000\u0000\u0000\u0088\t\u0001\u0000\u0000"+
		"\u0000\u0089\u008f\u0003\u0010\b\u0000\u008a\u008f\u0003*\u0015\u0000"+
		"\u008b\u008f\u0003:\u001d\u0000\u008c\u008f\u0003\f\u0006\u0000\u008d"+
		"\u008f\u0003\u0014\n\u0000\u008e\u0089\u0001\u0000\u0000\u0000\u008e\u008a"+
		"\u0001\u0000\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u000b"+
		"\u0001\u0000\u0000\u0000\u0090\u0095\u0003\u001c\u000e\u0000\u0091\u0092"+
		"\u0005\u0015\u0000\u0000\u0092\u0094\u0003\u001c\u000e\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0003\u0002\u0001\u0000\u0099\r\u0001\u0000\u0000\u0000\u009a\u00a3\u0005"+
		"P\u0000\u0000\u009b\u00a0\u0003\u001c\u000e\u0000\u009c\u009d\u0005\u0015"+
		"\u0000\u0000\u009d\u009f\u0003\u001c\u000e\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u009b\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0003\u0002\u0001\u0000\u00a6\u000f\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a9\u0005\u0006\u0000\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005u\u0000\u0000\u00ab\u00af\u0005\u0011\u0000"+
		"\u0000\u00ac\u00ae\u0003\u001c\u000e\u0000\u00ad\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0015\u0000"+
		"\u0000\u00b3\u00b5\u0003\u001c\u000e\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0012\u0000"+
		"\u0000\u00ba\u00be\u0005\u0013\u0000\u0000\u00bb\u00bd\u0003\n\u0005\u0000"+
		"\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c3\u0005\u0014\u0000\u0000\u00c2\u00c4\u0003\u0012\t\u0000\u00c3"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4"+
		"\u0011\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0006\u0000\u0000\u00c6"+
		"\u00c7\u0005u\u0000\u0000\u00c7\u00c8\u0003\u0002\u0001\u0000\u00c8\u0013"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cb\u0003\u0016\u000b\u0000\u00ca\u00c9"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u00d1\u0003\u0018\f\u0000\u00cd\u00ce\u0005"+
		"\u0015\u0000\u0000\u00ce\u00d0\u0003\u0018\f\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\u0002"+
		"\u0001\u0000\u00d5\u0015\u0001\u0000\u0000\u0000\u00d6\u00d8\u0005\u0006"+
		"\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00e3\u0005M\u0000"+
		"\u0000\u00da\u00dc\u0005\u0006\u0000\u0000\u00db\u00da\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e3\u0005\u0007\u0000\u0000\u00de\u00e0\u0005\u0006\u0000"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0005i\u0000\u0000"+
		"\u00e2\u00d7\u0001\u0000\u0000\u0000\u00e2\u00db\u0001\u0000\u0000\u0000"+
		"\u00e2\u00df\u0001\u0000\u0000\u0000\u00e3\u0017\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e7\u0003\u001a\r\u0000\u00e5\u00e6\u0005\u0016\u0000\u0000\u00e6"+
		"\u00e8\u0003\u001c\u000e\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e8\u0019\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ed\u0003L&\u0000\u00ea\u00ed\u0005u\u0000\u0000\u00eb\u00ed\u0005"+
		"\u0084\u0000\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u001b\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0006\u000e\uffff\uffff\u0000\u00ef\u010f"+
		"\u0003V+\u0000\u00f0\u010f\u0003N\'\u0000\u00f1\u010f\u0003L&\u0000\u00f2"+
		"\u010f\u0003 \u0010\u0000\u00f3\u010f\u0003R)\u0000\u00f4\u010f\u0003"+
		"H$\u0000\u00f5\u010f\u0003\u000e\u0007\u0000\u00f6\u010f\u0003@ \u0000"+
		"\u00f7\u00f8\u0005\u0011\u0000\u0000\u00f8\u00fd\u0003\u001c\u000e\u0000"+
		"\u00f9\u00fa\u0005\u0015\u0000\u0000\u00fa\u00fc\u0003\u001c\u000e\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0005\u0012\u0000\u0000\u0101\u010f\u0001\u0000\u0000\u0000"+
		"\u0102\u010f\u0005u\u0000\u0000\u0103\u010f\u0005s\u0000\u0000\u0104\u0105"+
		"\u0005\u0013\u0000\u0000\u0105\u0108\u0003\u001c\u000e\u0000\u0106\u0107"+
		"\u0005\u0011\u0000\u0000\u0107\u0109\u0005\u0012\u0000\u0000\u0108\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0014\u0000\u0000\u010b\u010f"+
		"\u0001\u0000\u0000\u0000\u010c\u010f\u0005X\u0000\u0000\u010d\u010f\u0003"+
		"\u001e\u000f\u0000\u010e\u00ee\u0001\u0000\u0000\u0000\u010e\u00f0\u0001"+
		"\u0000\u0000\u0000\u010e\u00f1\u0001\u0000\u0000\u0000\u010e\u00f2\u0001"+
		"\u0000\u0000\u0000\u010e\u00f3\u0001\u0000\u0000\u0000\u010e\u00f4\u0001"+
		"\u0000\u0000\u0000\u010e\u00f5\u0001\u0000\u0000\u0000\u010e\u00f6\u0001"+
		"\u0000\u0000\u0000\u010e\u00f7\u0001\u0000\u0000\u0000\u010e\u0102\u0001"+
		"\u0000\u0000\u0000\u010e\u0103\u0001\u0000\u0000\u0000\u010e\u0104\u0001"+
		"\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0136\u0001\u0000\u0000\u0000\u0110\u0111\n\u0013"+
		"\u0000\u0000\u0111\u0112\u0005\u001b\u0000\u0000\u0112\u0135\u0003\u001c"+
		"\u000e\u0014\u0113\u0114\n\u0012\u0000\u0000\u0114\u0115\u0005\"\u0000"+
		"\u0000\u0115\u0135\u0003\u001c\u000e\u0013\u0116\u0117\n\u0011\u0000\u0000"+
		"\u0117\u0118\u0005#\u0000\u0000\u0118\u0135\u0003\u001c\u000e\u0012\u0119"+
		"\u011a\n\u0010\u0000\u0000\u011a\u011b\u0005\u001e\u0000\u0000\u011b\u0135"+
		"\u0003\u001c\u000e\u0011\u011c\u011d\n\u000f\u0000\u0000\u011d\u011e\u0005"+
		"\u001f\u0000\u0000\u011e\u0135\u0003\u001c\u000e\u0010\u011f\u0120\n\u000e"+
		"\u0000\u0000\u0120\u0121\u0005\u0019\u0000\u0000\u0121\u0135\u0003\u001c"+
		"\u000e\u000f\u0122\u0123\n\r\u0000\u0000\u0123\u0124\u00055\u0000\u0000"+
		"\u0124\u0135\u0003\u001c\u000e\u000e\u0125\u0126\n\f\u0000\u0000\u0126"+
		"\u0127\u0005\u0017\u0000\u0000\u0127\u0128\u0003\u001c\u000e\u0000\u0128"+
		"\u0129\u0005\u0019\u0000\u0000\u0129\u012a\u0003\u001c\u000e\r\u012a\u0135"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\n\u000b\u0000\u0000\u012c\u012d\u0005"+
		"\u0016\u0000\u0000\u012d\u0135\u0003\u001c\u000e\f\u012e\u012f\n\n\u0000"+
		"\u0000\u012f\u0135\u0003\u001c\u000e\u000b\u0130\u0131\n\u0005\u0000\u0000"+
		"\u0131\u0135\u0005\u001c\u0000\u0000\u0132\u0133\n\u0003\u0000\u0000\u0133"+
		"\u0135\u0005\u001d\u0000\u0000\u0134\u0110\u0001\u0000\u0000\u0000\u0134"+
		"\u0113\u0001\u0000\u0000\u0000\u0134\u0116\u0001\u0000\u0000\u0000\u0134"+
		"\u0119\u0001\u0000\u0000\u0000\u0134\u011c\u0001\u0000\u0000\u0000\u0134"+
		"\u011f\u0001\u0000\u0000\u0000\u0134\u0122\u0001\u0000\u0000\u0000\u0134"+
		"\u0125\u0001\u0000\u0000\u0000\u0134\u012b\u0001\u0000\u0000\u0000\u0134"+
		"\u012e\u0001\u0000\u0000\u0000\u0134\u0130\u0001\u0000\u0000\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137"+
		"\u001d\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139"+
		"\u013b\u0005\u001b\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a"+
		"\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0005u\u0000\u0000\u013d\u013e\u0003R)\u0000\u013e\u001f\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0005S\u0000\u0000\u0140\u0141\u0005\u0011"+
		"\u0000\u0000\u0141\u0142\u0003\u0014\n\u0000\u0142\u0143\u0005u\u0000"+
		"\u0000\u0143\u0144\u0007\u0000\u0000\u0000\u0144\u0145\u0003\u001c\u000e"+
		"\u0000\u0145\u0146\u0005\u000e\u0000\u0000\u0146\u0147\u0003\u001c\u000e"+
		"\u0000\u0147\u0148\u0005\u0012\u0000\u0000\u0148\u0149\u0005\u0013\u0000"+
		"\u0000\u0149\u014b\u0003\u001c\u000e\u0000\u014a\u014c\u0003\u0002\u0001"+
		"\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0005\u0014\u0000"+
		"\u0000\u014e!\u0001\u0000\u0000\u0000\u014f\u0150\u0005u\u0000\u0000\u0150"+
		"\u0159\u0005\u0011\u0000\u0000\u0151\u0156\u0003\u001c\u000e\u0000\u0152"+
		"\u0153\u0005\u0015\u0000\u0000\u0153\u0155\u0003\u001c\u000e\u0000\u0154"+
		"\u0152\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156"+
		"\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157"+
		"\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159"+
		"\u0151\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0012\u0000\u0000\u015c"+
		"#\u0001\u0000\u0000\u0000\u015d\u015e\u0007\u0001\u0000\u0000\u015e%\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0005[\u0000\u0000\u0160\u0161\u0005\u0011"+
		"\u0000\u0000\u0161\u0162\u0003\u001c\u000e\u0000\u0162\u0163\u0005\u0012"+
		"\u0000\u0000\u0163\u0166\u0003(\u0014\u0000\u0164\u0165\u0005J\u0000\u0000"+
		"\u0165\u0167\u0003(\u0014\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0001\u0000\u0000\u0000\u0167\'\u0001\u0000\u0000\u0000\u0168\u016c"+
		"\u0005\u0013\u0000\u0000\u0169\u016b\u0003\n\u0005\u0000\u016a\u0169\u0001"+
		"\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016f\u0001"+
		"\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0170\u0005"+
		"\u0014\u0000\u0000\u0170)\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u0003"+
		"\u0000\u0000\u0172\u0173\u0005\b\u0000\u0000\u0173\u0174\u0005\u0011\u0000"+
		"\u0000\u0174\u0175\u0003,\u0016\u0000\u0175\u0176\u0005\u0012\u0000\u0000"+
		"\u0176+\u0001\u0000\u0000\u0000\u0177\u0183\u0005\u0013\u0000\u0000\u0178"+
		"\u017d\u0003.\u0017\u0000\u0179\u017a\u0005\u0015\u0000\u0000\u017a\u017c"+
		"\u0003.\u0017\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017f\u0001"+
		"\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001"+
		"\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001"+
		"\u0000\u0000\u0000\u0180\u0182\u0005\u0015\u0000\u0000\u0181\u0180\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001"+
		"\u0000\u0000\u0000\u0183\u0178\u0001\u0000\u0000\u0000\u0183\u0184\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005"+
		"\u0014\u0000\u0000\u0186-\u0001\u0000\u0000\u0000\u0187\u018e\u00030\u0018"+
		"\u0000\u0188\u018e\u00032\u0019\u0000\u0189\u018e\u00034\u001a\u0000\u018a"+
		"\u018e\u00036\u001b\u0000\u018b\u018e\u00038\u001c\u0000\u018c\u018e\u0003"+
		"\u001e\u000f\u0000\u018d\u0187\u0001\u0000\u0000\u0000\u018d\u0188\u0001"+
		"\u0000\u0000\u0000\u018d\u0189\u0001\u0000\u0000\u0000\u018d\u018a\u0001"+
		"\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018c\u0001"+
		"\u0000\u0000\u0000\u018e/\u0001\u0000\u0000\u0000\u018f\u0190\u0005\t"+
		"\u0000\u0000\u0190\u0191\u0005\u0019\u0000\u0000\u0191\u0192\u0005e\u0000"+
		"\u0000\u01921\u0001\u0000\u0000\u0000\u0193\u0194\u0005\n\u0000\u0000"+
		"\u0194\u0195\u0005\u0019\u0000\u0000\u0195\u0196\u0005d\u0000\u0000\u0196"+
		"3\u0001\u0000\u0000\u0000\u0197\u0198\u0005\u000b\u0000\u0000\u0198\u0199"+
		"\u0005\u0019\u0000\u0000\u0199\u019a\u0003L&\u0000\u019a5\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0005\f\u0000\u0000\u019c\u019d\u0005\u0019\u0000"+
		"\u0000\u019d\u019e\u0005\u0004\u0000\u0000\u019e\u019f\u0003@ \u0000\u019f"+
		"\u01a0\u0005\u0004\u0000\u0000\u01a07\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0005\r\u0000\u0000\u01a2\u01a3\u0005\u0019\u0000\u0000\u01a3\u01a4\u0003"+
		"L&\u0000\u01a49\u0001\u0000\u0000\u0000\u01a5\u01a7\u0005\u0006\u0000"+
		"\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005\u0005\u0000"+
		"\u0000\u01a9\u01aa\u0005u\u0000\u0000\u01aa\u01ab\u0003<\u001e\u0000\u01ab"+
		";\u0001\u0000\u0000\u0000\u01ac\u01b0\u0005\u0013\u0000\u0000\u01ad\u01af"+
		"\u0003\u001c\u000e\u0000\u01ae\u01ad\u0001\u0000\u0000\u0000\u01af\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b1\u01bb\u0001\u0000\u0000\u0000\u01b2\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b5\u0003\u0010\b\u0000\u01b4\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b9\u01bb\u0005"+
		"\u0014\u0000\u0000\u01ba\u01ac\u0001\u0000\u0000\u0000\u01ba\u01b6\u0001"+
		"\u0000\u0000\u0000\u01bb=\u0001\u0000\u0000\u0000\u01bc\u01bf\u0003@ "+
		"\u0000\u01bd\u01bf\u0003\u001c\u000e\u0000\u01be\u01bc\u0001\u0000\u0000"+
		"\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf?\u0001\u0000\u0000\u0000"+
		"\u01c0\u01c2\u0003B!\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c4A\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005"+
		"*\u0000\u0000\u01c6\u01ca\u0005u\u0000\u0000\u01c7\u01c9\u0003F#\u0000"+
		"\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000\u0000\u0000"+
		"\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cd\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cf\u0005+\u0000\u0000\u01ce\u01d0\u0003D\"\u0000\u01cf\u01ce"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005\u0082\u0000\u0000\u01d2\u01d3"+
		"\u0005u\u0000\u0000\u01d3\u01df\u0005+\u0000\u0000\u01d4\u01d5\u0005*"+
		"\u0000\u0000\u01d5\u01d9\u0005u\u0000\u0000\u01d6\u01d8\u0003F#\u0000"+
		"\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000"+
		"\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000"+
		"\u01da\u01dc\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000"+
		"\u01dc\u01dd\u0005#\u0000\u0000\u01dd\u01df\u0005+\u0000\u0000\u01de\u01c5"+
		"\u0001\u0000\u0000\u0000\u01de\u01d4\u0001\u0000\u0000\u0000\u01dfC\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e3\u0003B!\u0000\u01e1\u01e3\u0003\u001c\u000e"+
		"\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5E\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01ea\u0005u\u0000\u0000\u01e8"+
		"\u01e9\u0005\u0016\u0000\u0000\u01e9\u01eb\u0003J%\u0000\u01ea\u01e8\u0001"+
		"\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u020e\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u0005\u000f\u0000\u0000\u01ed\u01ee\u0005"+
		"\u0005\u0000\u0000\u01ee\u01ef\u0005\u001b\u0000\u0000\u01ef\u01f0\u0005"+
		"u\u0000\u0000\u01f0\u01f3\u0005\u0010\u0000\u0000\u01f1\u01f2\u0005\u0016"+
		"\u0000\u0000\u01f2\u01f4\u0003J%\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u020e\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f6\u0005\u0011\u0000\u0000\u01f6\u01f7\u0005u\u0000\u0000\u01f7"+
		"\u01fa\u0005\u0012\u0000\u0000\u01f8\u01f9\u0005\u0016\u0000\u0000\u01f9"+
		"\u01fb\u0003J%\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fb\u020e\u0001\u0000\u0000\u0000\u01fc\u01ff\u0003"+
		"$\u0012\u0000\u01fd\u01fe\u0005\u0016\u0000\u0000\u01fe\u0200\u0003J%"+
		"\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000"+
		"\u0000\u0200\u020e\u0001\u0000\u0000\u0000\u0201\u0204\u0005\u0005\u0000"+
		"\u0000\u0202\u0203\u0005\u0016\u0000\u0000\u0203\u0205\u0003J%\u0000\u0204"+
		"\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205"+
		"\u020e\u0001\u0000\u0000\u0000\u0206\u0207\u0005\u000f\u0000\u0000\u0207"+
		"\u0208\u0005u\u0000\u0000\u0208\u020b\u0005\u0010\u0000\u0000\u0209\u020a"+
		"\u0005\u0016\u0000\u0000\u020a\u020c\u0003J%\u0000\u020b\u0209\u0001\u0000"+
		"\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020e\u0001\u0000"+
		"\u0000\u0000\u020d\u01e7\u0001\u0000\u0000\u0000\u020d\u01ec\u0001\u0000"+
		"\u0000\u0000\u020d\u01f5\u0001\u0000\u0000\u0000\u020d\u01fc\u0001\u0000"+
		"\u0000\u0000\u020d\u0201\u0001\u0000\u0000\u0000\u020d\u0206\u0001\u0000"+
		"\u0000\u0000\u020eG\u0001\u0000\u0000\u0000\u020f\u0218\u0005\u0080\u0000"+
		"\u0000\u0210\u0215\u0003\u001c\u000e\u0000\u0211\u0212\u0005\u0015\u0000"+
		"\u0000\u0212\u0214\u0003\u001c\u000e\u0000\u0213\u0211\u0001\u0000\u0000"+
		"\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000\u0000"+
		"\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218\u0210\u0001\u0000\u0000"+
		"\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0005\u0081\u0000\u0000\u021bI\u0001\u0000\u0000\u0000"+
		"\u021c\u0229\u0005e\u0000\u0000\u021d\u021e\u0005\u0013\u0000\u0000\u021e"+
		"\u0223\u0003\u001c\u000e\u0000\u021f\u0220\u0005\u0015\u0000\u0000\u0220"+
		"\u0222\u0003\u001c\u000e\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222"+
		"\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223"+
		"\u0224\u0001\u0000\u0000\u0000\u0224\u0226\u0001\u0000\u0000\u0000\u0225"+
		"\u0223\u0001\u0000\u0000\u0000\u0226\u0227\u0005\u0014\u0000\u0000\u0227"+
		"\u0229\u0001\u0000\u0000\u0000\u0228\u021c\u0001\u0000\u0000\u0000\u0228"+
		"\u021d\u0001\u0000\u0000\u0000\u0229K\u0001\u0000\u0000\u0000\u022a\u022c"+
		"\u0005\u000f\u0000\u0000\u022b\u022d\u0005\u0004\u0000\u0000\u022c\u022b"+
		"\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u0236"+
		"\u0001\u0000\u0000\u0000\u022e\u0233\u0003\u001c\u000e\u0000\u022f\u0230"+
		"\u0005\u0015\u0000\u0000\u0230\u0232\u0003\u001c\u000e\u0000\u0231\u022f"+
		"\u0001\u0000\u0000\u0000\u0232\u0235\u0001\u0000\u0000\u0000\u0233\u0231"+
		"\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0237"+
		"\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u022e"+
		"\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0239"+
		"\u0001\u0000\u0000\u0000\u0238\u023a\u0005\u0004\u0000\u0000\u0239\u0238"+
		"\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b"+
		"\u0001\u0000\u0000\u0000\u023b\u023c\u0005\u0010\u0000\u0000\u023cM\u0001"+
		"\u0000\u0000\u0000\u023d\u023e\u0005u\u0000\u0000\u023e\u023f\u0005\u000f"+
		"\u0000\u0000\u023f\u0240\u0005t\u0000\u0000\u0240\u0241\u0005\u0010\u0000"+
		"\u0000\u0241O\u0001\u0000\u0000\u0000\u0242\u0243\u0005\u000f\u0000\u0000"+
		"\u0243\u0247\u0005\u0004\u0000\u0000\u0244\u0246\u0003\u001e\u000f\u0000"+
		"\u0245\u0244\u0001\u0000\u0000\u0000\u0246\u0249\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000"+
		"\u0248\u024a\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000"+
		"\u024a\u024b\u0005\u0004\u0000\u0000\u024b\u024c\u0005\u0010\u0000\u0000"+
		"\u024cQ\u0001\u0000\u0000\u0000\u024d\u025d\u0005\u0013\u0000\u0000\u024e"+
		"\u0253\u0003T*\u0000\u024f\u0250\u0005\u0015\u0000\u0000\u0250\u0252\u0003"+
		"T*\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0255\u0001\u0000\u0000"+
		"\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000"+
		"\u0000\u0254\u025a\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000"+
		"\u0000\u0256\u0257\u0005\u000e\u0000\u0000\u0257\u0259\u0003T*\u0000\u0258"+
		"\u0256\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000\u0000\u025a"+
		"\u0258\u0001\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b"+
		"\u025e\u0001\u0000\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025d"+
		"\u024e\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e"+
		"\u025f\u0001\u0000\u0000\u0000\u025f\u0260\u0005\u0014\u0000\u0000\u0260"+
		"S\u0001\u0000\u0000\u0000\u0261\u0262\u0003\u001c\u000e\u0000\u0262\u0263"+
		"\u0005\u0019\u0000\u0000\u0263\u0265\u0003\u001c\u000e\u0000\u0264\u0266"+
		"\u0005\u000e\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0265\u0266"+
		"\u0001\u0000\u0000\u0000\u0266U\u0001\u0000\u0000\u0000\u0267\u0268\u0007"+
		"\u0002\u0000\u0000\u0268W\u0001\u0000\u0000\u0000J\\`flot|\u007f\u0084"+
		"\u0087\u008e\u0095\u00a0\u00a3\u00a8\u00af\u00b6\u00be\u00c3\u00ca\u00d1"+
		"\u00d7\u00db\u00df\u00e2\u00e7\u00ec\u00fd\u0108\u010e\u0134\u0136\u013a"+
		"\u014b\u0156\u0159\u0166\u016c\u017d\u0181\u0183\u018d\u01a6\u01b0\u01b6"+
		"\u01ba\u01be\u01c3\u01ca\u01cf\u01d9\u01de\u01e2\u01e4\u01ea\u01f3\u01fa"+
		"\u01ff\u0204\u020b\u020d\u0215\u0218\u0223\u0228\u022c\u0233\u0236\u0239"+
		"\u0247\u0253\u025a\u025d\u0265";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}