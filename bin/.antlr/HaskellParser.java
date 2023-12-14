// Generated from d:/Dev/Sem7/CD/Lab/HaskellEnv1/HaskellM1/bin/Haskell.g4 by ANTLR 4.13.1

    import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AS=1, CASE=2, DEFAULT=3, DO=4, ELSE=5, HIDING=6, IF=7, IMPORT=8, IN=9, 
		INFIX=10, INFIXL=11, INFIXR=12, LET=13, MODULE=14, OF=15, QUALIFIED=16, 
		THEN=17, WHERE=18, WILDCARD=19, FORALL=20, FOREIGN=21, EXPORT=22, SAFE=23, 
		INTERRUPTIBLE=24, UNSAFE=25, MDO=26, FAMILY=27, ROLE=28, STDCALL=29, CCALL=30, 
		CAPI=31, CPPCALL=32, JSCALL=33, REC=34, GROUP=35, BY=36, USING=37, PATTERN=38, 
		STOCK=39, ANYCLASS=40, VIA=41, TRUE=42, FALSE=43, DATA=44, TYPE=45, CLASS=46, 
		INSTANCE=47, NEWTYPE=48, DERIVING=49, PLUS=50, MINUS=51, MULT=52, DIV=53, 
		MOD=54, EQUALS=55, NOT_EQUALS=56, LESS_THAN=57, GREATER_THAN=58, LESS_THAN_EQUAL=59, 
		GREATER_THAN_EQUAL=60, AND=61, OR=62, NOT=63, BITWISE_AND=64, VBAR=65, 
		XOR=66, ASSIGN=67, DOT=68, COLON=69, CONCAT=70, DOLLAR=71, LBRACKET=72, 
		RBRACKET=73, RANGE=74, BACKSLASH=75, LPAREN=76, RPAREN=77, COMMA=78, BACKTICK=79, 
		SEMICOLON=80, LFLOWER=81, RFLOWER=82, DOUBLEARROW=83, RARROW=84, DOUBLE_COLON=85, 
		BIND_RIGHT=86, BANG=87, HASH=88, QUESTION=89, AT=90, CARET=91, TILDE=92, 
		DEFINE=93, WS=94, NEWLINE=95, TAB=96, COMMENT=97, MULTI_LINE_COMMENT=98, 
		UID=99, ID=100, INTEGER=101, FLOAT=102, CHAR=103, STRING=104, ARROW=105;
	public static final int
		RULE_start = 0, RULE_declaration = 1, RULE_gendeclaration = 2, RULE_pat = 3, 
		RULE_pats = 4, RULE_funlhs = 5, RULE_rhs = 6, RULE_expression = 7, RULE_if_statement = 8, 
		RULE_case_statement = 9, RULE_case_alternatives = 10, RULE_case_alternative = 11, 
		RULE_do_block = 12, RULE_stmts = 13, RULE_stmt = 14, RULE_gdrhs = 15, 
		RULE_gd = 16, RULE_exp1 = 17, RULE_types = 18, RULE_type = 19, RULE_atype = 20, 
		RULE_let_statement = 21, RULE_function_application = 22, RULE_args = 23, 
		RULE_op = 24, RULE_literal = 25, RULE_type_list = 26, RULE_list_comprehensions = 27, 
		RULE_gens = 28, RULE_gen = 29, RULE_exps = 30, RULE_declarations = 31, 
		RULE_decl = 32, RULE_gendecl = 33, RULE_qvcon = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declaration", "gendeclaration", "pat", "pats", "funlhs", "rhs", 
			"expression", "if_statement", "case_statement", "case_alternatives", 
			"case_alternative", "do_block", "stmts", "stmt", "gdrhs", "gd", "exp1", 
			"types", "type", "atype", "let_statement", "function_application", "args", 
			"op", "literal", "type_list", "list_comprehensions", "gens", "gen", "exps", 
			"declarations", "decl", "gendecl", "qvcon"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'case'", "'default'", "'do'", "'else'", "'hiding'", "'if'", 
			"'import'", "'in'", "'infix'", "'infixl'", "'infixr'", "'let'", "'module'", 
			"'of'", "'qualified'", "'then'", "'where'", "'_'", "'forall'", "'foreign'", 
			"'export'", "'safe'", "'interruptible'", "'unsafe'", "'mdo'", "'family'", 
			"'role'", "'stdcall'", "'ccall'", "'capi'", "'cplusplus'", "'javascript'", 
			"'rec'", "'group'", "'by'", "'using'", "'pattern'", "'stock'", "'anyclass'", 
			"'via'", "'True'", "'False'", "'data'", "'type'", "'class'", "'instance'", 
			"'newtype'", "'deriving'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", 
			"'/='", "'<'", "'>'", "'<='", "'>='", "'&&'", "'||'", "'not'", "'&'", 
			"'|'", "'xor'", "'='", "'.'", "':'", "'++'", "'$'", "'['", "']'", "'..'", 
			"'\\'", "'('", "')'", "','", "'`'", "';'", "'{'", "'}'", "'=>'", "'<-'", 
			"'::'", "'>>='", "'!'", "'#'", "'?'", "'@'", "'^'", "'~'", "':='", null, 
			null, null, null, null, null, null, null, null, null, null, "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AS", "CASE", "DEFAULT", "DO", "ELSE", "HIDING", "IF", "IMPORT", 
			"IN", "INFIX", "INFIXL", "INFIXR", "LET", "MODULE", "OF", "QUALIFIED", 
			"THEN", "WHERE", "WILDCARD", "FORALL", "FOREIGN", "EXPORT", "SAFE", "INTERRUPTIBLE", 
			"UNSAFE", "MDO", "FAMILY", "ROLE", "STDCALL", "CCALL", "CAPI", "CPPCALL", 
			"JSCALL", "REC", "GROUP", "BY", "USING", "PATTERN", "STOCK", "ANYCLASS", 
			"VIA", "TRUE", "FALSE", "DATA", "TYPE", "CLASS", "INSTANCE", "NEWTYPE", 
			"DERIVING", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUALS", "NOT_EQUALS", 
			"LESS_THAN", "GREATER_THAN", "LESS_THAN_EQUAL", "GREATER_THAN_EQUAL", 
			"AND", "OR", "NOT", "BITWISE_AND", "VBAR", "XOR", "ASSIGN", "DOT", "COLON", 
			"CONCAT", "DOLLAR", "LBRACKET", "RBRACKET", "RANGE", "BACKSLASH", "LPAREN", 
			"RPAREN", "COMMA", "BACKTICK", "SEMICOLON", "LFLOWER", "RFLOWER", "DOUBLEARROW", 
			"RARROW", "DOUBLE_COLON", "BIND_RIGHT", "BANG", "HASH", "QUESTION", "AT", 
			"CARET", "TILDE", "DEFINE", "WS", "NEWLINE", "TAB", "COMMENT", "MULTI_LINE_COMMENT", 
			"UID", "ID", "INTEGER", "FLOAT", "CHAR", "STRING", "ARROW"
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
	public String getGrammarFileName() { return "Haskell.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HaskellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ASTNode node;
		public DeclarationContext t1;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((StartContext)_localctx).t1 = declaration();
			((StartContext)_localctx).node =  ((StartContext)_localctx).t1.node; _localctx.node.print();
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
	public static class DeclarationContext extends ParserRuleContext {
		public ASTNode node;
		public GendeclarationContext a;
		public FunlhsContext b;
		public RhsContext c;
		public PatContext d;
		public RhsContext e;
		public TerminalNode SEMICOLON() { return getToken(HaskellParser.SEMICOLON, 0); }
		public GendeclarationContext gendeclaration() {
			return getRuleContext(GendeclarationContext.class,0);
		}
		public FunlhsContext funlhs() {
			return getRuleContext(FunlhsContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				((DeclarationContext)_localctx).a = gendeclaration();
				setState(74);
				match(SEMICOLON);
				((DeclarationContext)_localctx).node =  new DeclarationStm(((DeclarationContext)_localctx).a.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((DeclarationContext)_localctx).b = funlhs();
				setState(78);
				((DeclarationContext)_localctx).c = rhs();
				((DeclarationContext)_localctx).node =  new FunctionDeclarationStm(((DeclarationContext)_localctx).b.node, ((DeclarationContext)_localctx).c.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				((DeclarationContext)_localctx).d = pat();
				setState(82);
				((DeclarationContext)_localctx).e = rhs();
				((DeclarationContext)_localctx).node =  new PatternDeclarationStm(((DeclarationContext)_localctx).d.node, ((DeclarationContext)_localctx).e.node);
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
	public static class GendeclarationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TypesContext a;
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(HaskellParser.DOUBLE_COLON, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public GendeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gendeclaration; }
	}

	public final GendeclarationContext gendeclaration() throws RecognitionException {
		GendeclarationContext _localctx = new GendeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_gendeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((GendeclarationContext)_localctx).ID = match(ID);
			setState(88);
			match(DOUBLE_COLON);
			setState(89);
			((GendeclarationContext)_localctx).a = types();
			((GendeclarationContext)_localctx).node =  new GeneralDeclaration((((GendeclarationContext)_localctx).ID!=null?((GendeclarationContext)_localctx).ID.getText():null), ((GendeclarationContext)_localctx).a.node);
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
	public static class PatContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public Token UID;
		public LiteralContext literal;
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public TerminalNode UID() { return getToken(HaskellParser.UID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pat; }
	}

	public final PatContext pat() throws RecognitionException {
		PatContext _localctx = new PatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pat);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((PatContext)_localctx).ID = match(ID);
				((PatContext)_localctx).node =  new IdPat((((PatContext)_localctx).ID!=null?((PatContext)_localctx).ID.getText():null));
				}
				break;
			case UID:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				((PatContext)_localctx).UID = match(UID);
				((PatContext)_localctx).node =  new UIdPat((((PatContext)_localctx).UID!=null?((PatContext)_localctx).UID.getText():null));
				}
				break;
			case TRUE:
			case FALSE:
			case INTEGER:
			case FLOAT:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				((PatContext)_localctx).literal = literal();
				((PatContext)_localctx).node =  ((PatContext)_localctx).literal.node;
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
	public static class PatsContext extends ParserRuleContext {
		public ASTNode node;
		public PatContext pat;
		public PatsContext pats;
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public PatsContext pats() {
			return getRuleContext(PatsContext.class,0);
		}
		public PatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pats; }
	}

	public final PatsContext pats() throws RecognitionException {
		PatsContext _localctx = new PatsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pats);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				((PatsContext)_localctx).pat = pat();
				setState(102);
				((PatsContext)_localctx).pats = pats();
				((PatsContext)_localctx).node =  new PatsList(((PatsContext)_localctx).pat.node, ((PatsContext)_localctx).pats.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				((PatsContext)_localctx).pat = pat();
				((PatsContext)_localctx).node =  new SinglePat(((PatsContext)_localctx).pat.node);
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
	public static class FunlhsContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public PatsContext pats;
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public PatsContext pats() {
			return getRuleContext(PatsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HaskellParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HaskellParser.RPAREN, 0); }
		public FunlhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funlhs; }
	}

	public final FunlhsContext funlhs() throws RecognitionException {
		FunlhsContext _localctx = new FunlhsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funlhs);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((FunlhsContext)_localctx).ID = match(ID);
				setState(111);
				((FunlhsContext)_localctx).pats = pats();
				((FunlhsContext)_localctx).node =  new FunLhsClass((((FunlhsContext)_localctx).ID!=null?((FunlhsContext)_localctx).ID.getText():null), ((FunlhsContext)_localctx).pats.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				((FunlhsContext)_localctx).ID = match(ID);
				setState(115);
				match(LPAREN);
				setState(116);
				((FunlhsContext)_localctx).pats = pats();
				setState(117);
				match(RPAREN);
				((FunlhsContext)_localctx).node =  new ParenFunLhs((((FunlhsContext)_localctx).ID!=null?((FunlhsContext)_localctx).ID.getText():null), ((FunlhsContext)_localctx).pats.node);
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
	public static class RhsContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext a;
		public List_comprehensionsContext b;
		public Function_applicationContext c;
		public ExpressionContext d;
		public GdrhsContext e;
		public TerminalNode ASSIGN() { return getToken(HaskellParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List_comprehensionsContext list_comprehensions() {
			return getRuleContext(List_comprehensionsContext.class,0);
		}
		public Function_applicationContext function_application() {
			return getRuleContext(Function_applicationContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(HaskellParser.RARROW, 0); }
		public GdrhsContext gdrhs() {
			return getRuleContext(GdrhsContext.class,0);
		}
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rhs);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(ASSIGN);
				setState(123);
				((RhsContext)_localctx).a = expression(0);
				((RhsContext)_localctx).node =  new AssignRhs(((RhsContext)_localctx).a.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(ASSIGN);
				setState(127);
				((RhsContext)_localctx).b = list_comprehensions();
				((RhsContext)_localctx).node =  new ListComprehensionRhs(((RhsContext)_localctx).b.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(ASSIGN);
				setState(131);
				((RhsContext)_localctx).c = function_application();
				((RhsContext)_localctx).node =  new FunctionApplicationRhs(((RhsContext)_localctx).c.node);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(RARROW);
				setState(135);
				((RhsContext)_localctx).d = expression(0);
				((RhsContext)_localctx).node =  new ArrowRhs(((RhsContext)_localctx).d.node);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				((RhsContext)_localctx).e = gdrhs();
				((RhsContext)_localctx).node =  new GdrhsRhs(((RhsContext)_localctx).e.node);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext x;
		public If_statementContext if_statement;
		public Case_statementContext case_statement;
		public Let_statementContext let_statement;
		public Do_blockContext do_block;
		public Token ID;
		public LiteralContext literal;
		public Function_applicationContext function_application;
		public List_comprehensionsContext list_comprehensions;
		public ExpressionContext zz;
		public OpContext y;
		public ExpressionContext z;
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Case_statementContext case_statement() {
			return getRuleContext(Case_statementContext.class,0);
		}
		public Let_statementContext let_statement() {
			return getRuleContext(Let_statementContext.class,0);
		}
		public Do_blockContext do_block() {
			return getRuleContext(Do_blockContext.class,0);
		}
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Function_applicationContext function_application() {
			return getRuleContext(Function_applicationContext.class,0);
		}
		public List_comprehensionsContext list_comprehensions() {
			return getRuleContext(List_comprehensionsContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(HaskellParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(144);
				((ExpressionContext)_localctx).if_statement = if_statement();
				((ExpressionContext)_localctx).node =  new IfExpression(((ExpressionContext)_localctx).if_statement.node);
				}
				break;
			case 2:
				{
				setState(147);
				((ExpressionContext)_localctx).case_statement = case_statement();
				((ExpressionContext)_localctx).node =  new CaseExpression(((ExpressionContext)_localctx).case_statement.node);
				}
				break;
			case 3:
				{
				setState(150);
				((ExpressionContext)_localctx).let_statement = let_statement();
				((ExpressionContext)_localctx).node =  new LetExpression(((ExpressionContext)_localctx).let_statement.node);
				}
				break;
			case 4:
				{
				setState(153);
				((ExpressionContext)_localctx).do_block = do_block();
				((ExpressionContext)_localctx).node =  new DoBlockExpression(((ExpressionContext)_localctx).do_block.node);
				}
				break;
			case 5:
				{
				setState(156);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).node =  new IdExpression((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 6:
				{
				setState(158);
				((ExpressionContext)_localctx).literal = literal();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).literal.node;
				}
				break;
			case 7:
				{
				setState(161);
				((ExpressionContext)_localctx).function_application = function_application();
				((ExpressionContext)_localctx).node =  new FunctionApplicationExpression(((ExpressionContext)_localctx).function_application.node);
				}
				break;
			case 8:
				{
				setState(164);
				((ExpressionContext)_localctx).list_comprehensions = list_comprehensions();
				((ExpressionContext)_localctx).node =  new ListComprehensionExpression(((ExpressionContext)_localctx).list_comprehensions.node);
				}
				break;
			case 9:
				{
				setState(167);
				match(MINUS);
				setState(168);
				((ExpressionContext)_localctx).zz = expression(1);
				((ExpressionContext)_localctx).node =  new MinusExpression(((ExpressionContext)_localctx).zz.node);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					_localctx.x = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(173);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(174);
					((ExpressionContext)_localctx).y = op();
					setState(175);
					((ExpressionContext)_localctx).z = expression(3);
					((ExpressionContext)_localctx).node =  new OpExpression(((ExpressionContext)_localctx).x.node, ((ExpressionContext)_localctx).y.value, ((ExpressionContext)_localctx).z.node);
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class If_statementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext a;
		public ExpressionContext b;
		public ExpressionContext c;
		public TerminalNode IF() { return getToken(HaskellParser.IF, 0); }
		public TerminalNode THEN() { return getToken(HaskellParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(HaskellParser.ELSE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(IF);
			setState(184);
			((If_statementContext)_localctx).a = expression(0);
			setState(185);
			match(THEN);
			setState(186);
			((If_statementContext)_localctx).b = expression(0);
			setState(187);
			match(ELSE);
			setState(188);
			((If_statementContext)_localctx).c = expression(0);
			((If_statementContext)_localctx).node =  new IfStatement(((If_statementContext)_localctx).a.node, ((If_statementContext)_localctx).b.node, ((If_statementContext)_localctx).c.node);
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
	public static class Case_statementContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public Case_alternativesContext case_alternatives;
		public TerminalNode CASE() { return getToken(HaskellParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(HaskellParser.OF, 0); }
		public Case_alternativesContext case_alternatives() {
			return getRuleContext(Case_alternativesContext.class,0);
		}
		public Case_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_statement; }
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_case_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(CASE);
			setState(192);
			((Case_statementContext)_localctx).expression = expression(0);
			setState(193);
			match(OF);
			setState(194);
			((Case_statementContext)_localctx).case_alternatives = case_alternatives();
			((Case_statementContext)_localctx).node =  new CaseStatement(((Case_statementContext)_localctx).expression.node, ((Case_statementContext)_localctx).case_alternatives.node);
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
	public static class Case_alternativesContext extends ParserRuleContext {
		public ASTNode node;
		public Case_alternativeContext case_alternative;
		public Case_alternativesContext case_alternatives;
		public Case_alternativeContext case_alternative() {
			return getRuleContext(Case_alternativeContext.class,0);
		}
		public Case_alternativesContext case_alternatives() {
			return getRuleContext(Case_alternativesContext.class,0);
		}
		public Case_alternativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_alternatives; }
	}

	public final Case_alternativesContext case_alternatives() throws RecognitionException {
		Case_alternativesContext _localctx = new Case_alternativesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_case_alternatives);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				((Case_alternativesContext)_localctx).case_alternative = case_alternative();
				setState(198);
				((Case_alternativesContext)_localctx).case_alternatives = case_alternatives();
				((Case_alternativesContext)_localctx).node =  new CaseAlternativesList(((Case_alternativesContext)_localctx).case_alternative.node, ((Case_alternativesContext)_localctx).case_alternatives.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				((Case_alternativesContext)_localctx).case_alternative = case_alternative();
				((Case_alternativesContext)_localctx).node =  new SingleCaseAlternative(((Case_alternativesContext)_localctx).case_alternative.node);
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
	public static class Case_alternativeContext extends ParserRuleContext {
		public ASTNode node;
		public PatContext pat;
		public ExpressionContext expression;
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(HaskellParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Case_alternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_alternative; }
	}

	public final Case_alternativeContext case_alternative() throws RecognitionException {
		Case_alternativeContext _localctx = new Case_alternativeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_case_alternative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			((Case_alternativeContext)_localctx).pat = pat();
			setState(207);
			match(ARROW);
			setState(208);
			((Case_alternativeContext)_localctx).expression = expression(0);
			((Case_alternativeContext)_localctx).node =  new CaseAlternative(((Case_alternativeContext)_localctx).pat.node, ((Case_alternativeContext)_localctx).expression.node);
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
	public static class Do_blockContext extends ParserRuleContext {
		public ASTNode node;
		public StmtsContext stmts;
		public TerminalNode DO() { return getToken(HaskellParser.DO, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public Do_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_block; }
	}

	public final Do_blockContext do_block() throws RecognitionException {
		Do_blockContext _localctx = new Do_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_do_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(DO);
			setState(212);
			((Do_blockContext)_localctx).stmts = stmts();
			((Do_blockContext)_localctx).node =  new DoBlock(((Do_blockContext)_localctx).stmts.node);
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
	public static class StmtsContext extends ParserRuleContext {
		public ASTNode node;
		public StmtContext stmt;
		public StmtsContext stmts;
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stmts);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				((StmtsContext)_localctx).stmt = stmt();
				setState(216);
				((StmtsContext)_localctx).stmts = stmts();
				((StmtsContext)_localctx).node =  new StmtsList(((StmtsContext)_localctx).stmt.node, ((StmtsContext)_localctx).stmts.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((StmtsContext)_localctx).stmt = stmt();
				((StmtsContext)_localctx).node =  new SingleStmt(((StmtsContext)_localctx).stmt.node);
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
	public static class StmtContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext a;
		public PatContext b;
		public ExpressionContext c;
		public PatContext d;
		public ExpressionContext e;
		public PatContext f;
		public ExpressionContext g;
		public TypesContext h;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(HaskellParser.ARROW, 0); }
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HaskellParser.ASSIGN, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(HaskellParser.DOUBLE_COLON, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				((StmtContext)_localctx).a = expression(0);
				((StmtContext)_localctx).node =  new ExpressionStmt(((StmtContext)_localctx).a.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				((StmtContext)_localctx).b = pat();
				setState(228);
				match(ARROW);
				setState(229);
				((StmtContext)_localctx).c = expression(0);
				((StmtContext)_localctx).node =  new PatArrowExpressionStmt(((StmtContext)_localctx).b.node, ((StmtContext)_localctx).c.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				((StmtContext)_localctx).d = pat();
				setState(233);
				match(ASSIGN);
				setState(234);
				((StmtContext)_localctx).e = expression(0);
				((StmtContext)_localctx).node =  new PatAssignExpressionStmt(((StmtContext)_localctx).d.node, ((StmtContext)_localctx).e.node);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				((StmtContext)_localctx).f = pat();
				setState(238);
				match(ASSIGN);
				setState(239);
				((StmtContext)_localctx).g = expression(0);
				setState(240);
				match(DOUBLE_COLON);
				setState(241);
				((StmtContext)_localctx).h = types();
				((StmtContext)_localctx).node =  new PatAssignTypedExpressionStmt(((StmtContext)_localctx).f.node, ((StmtContext)_localctx).g.node, ((StmtContext)_localctx).h.node);
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
	public static class GdrhsContext extends ParserRuleContext {
		public ASTNode node;
		public GdContext gd;
		public ExpressionContext expression;
		public GdrhsContext gdrhs;
		public GdContext gd() {
			return getRuleContext(GdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(HaskellParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GdrhsContext gdrhs() {
			return getRuleContext(GdrhsContext.class,0);
		}
		public GdrhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gdrhs; }
	}

	public final GdrhsContext gdrhs() throws RecognitionException {
		GdrhsContext _localctx = new GdrhsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_gdrhs);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VBAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				((GdrhsContext)_localctx).gd = gd();
				setState(247);
				match(ASSIGN);
				setState(248);
				((GdrhsContext)_localctx).expression = expression(0);
				setState(249);
				((GdrhsContext)_localctx).gdrhs = gdrhs();
				((GdrhsContext)_localctx).node =  new GdrhsList(((GdrhsContext)_localctx).gd.node, ((GdrhsContext)_localctx).expression.node, ((GdrhsContext)_localctx).gdrhs.node);
				}
				break;
			case EOF:
			case IN:
			case TRUE:
			case FALSE:
			case UID:
			case ID:
			case INTEGER:
			case FLOAT:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				((GdrhsContext)_localctx).node =  new EmptyGdrhs();
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
	public static class GdContext extends ParserRuleContext {
		public ASTNode node;
		public Exp1Context exp1;
		public TerminalNode VBAR() { return getToken(HaskellParser.VBAR, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public GdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gd; }
	}

	public final GdContext gd() throws RecognitionException {
		GdContext _localctx = new GdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_gd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(VBAR);
			setState(256);
			((GdContext)_localctx).exp1 = exp1();
			((GdContext)_localctx).node =  new GdExpression(((GdContext)_localctx).exp1.node);
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
	public static class Exp1Context extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TypeContext type;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOUBLE_COLON() { return getToken(HaskellParser.DOUBLE_COLON, 0); }
		public TerminalNode DOUBLEARROW() { return getToken(HaskellParser.DOUBLEARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Exp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp1; }
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp1);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				((Exp1Context)_localctx).expression = expression(0);
				setState(260);
				match(DOUBLE_COLON);
				setState(261);
				match(DOUBLEARROW);
				setState(262);
				((Exp1Context)_localctx).type = type();
				((Exp1Context)_localctx).node =  new Exp1TypedExpression(((Exp1Context)_localctx).expression.node, ((Exp1Context)_localctx).type.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				((Exp1Context)_localctx).expression = expression(0);
				((Exp1Context)_localctx).node =  new Exp1Expression(((Exp1Context)_localctx).expression.node);
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
	public static class TypesContext extends ParserRuleContext {
		public ASTNode node;
		public TypeContext type;
		public TypesContext types;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(HaskellParser.ARROW, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_types);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				((TypesContext)_localctx).type = type();
				setState(271);
				match(ARROW);
				setState(272);
				((TypesContext)_localctx).types = types();
				((TypesContext)_localctx).node =  new TypesList(((TypesContext)_localctx).type.node, ((TypesContext)_localctx).types.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				((TypesContext)_localctx).type = type();
				((TypesContext)_localctx).node =  new SingleType(((TypesContext)_localctx).type.node);
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
	public static class TypeContext extends ParserRuleContext {
		public ASTNode node;
		public TypeContext type;
		public AtypeContext atype;
		public TerminalNode ARROW() { return getToken(HaskellParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AtypeContext atype() {
			return getRuleContext(AtypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(ARROW);
				setState(281);
				((TypeContext)_localctx).type = type();
				((TypeContext)_localctx).node =  new ArrowType(((TypeContext)_localctx).type.node);
				}
				break;
			case LBRACKET:
			case LPAREN:
			case UID:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				((TypeContext)_localctx).atype = atype();
				((TypeContext)_localctx).node =  new AtypeType(((TypeContext)_localctx).atype.node);
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
	public static class AtypeContext extends ParserRuleContext {
		public ASTNode node;
		public Token UID;
		public Token ID;
		public TypesContext types;
		public Type_listContext type_list;
		public AtypeContext atype;
		public TerminalNode UID() { return getToken(HaskellParser.UID, 0); }
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HaskellParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HaskellParser.RPAREN, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(HaskellParser.LBRACKET, 0); }
		public AtypeContext atype() {
			return getRuleContext(AtypeContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(HaskellParser.RBRACKET, 0); }
		public AtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atype; }
	}

	public final AtypeContext atype() throws RecognitionException {
		AtypeContext _localctx = new AtypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atype);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				((AtypeContext)_localctx).UID = match(UID);
				((AtypeContext)_localctx).node =  new UidAtype((((AtypeContext)_localctx).UID!=null?((AtypeContext)_localctx).UID.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				((AtypeContext)_localctx).ID = match(ID);
				((AtypeContext)_localctx).node =  new IdAtype((((AtypeContext)_localctx).ID!=null?((AtypeContext)_localctx).ID.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				((AtypeContext)_localctx).UID = match(UID);
				setState(294);
				match(LPAREN);
				setState(295);
				match(RPAREN);
				((AtypeContext)_localctx).node =  new UidParenAtype((((AtypeContext)_localctx).UID!=null?((AtypeContext)_localctx).UID.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(LPAREN);
				setState(298);
				((AtypeContext)_localctx).types = types();
				setState(299);
				match(RPAREN);
				((AtypeContext)_localctx).node =  new ParenTypesAtype(((AtypeContext)_localctx).types.node);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				match(LPAREN);
				setState(303);
				((AtypeContext)_localctx).type_list = type_list();
				setState(304);
				match(RPAREN);
				((AtypeContext)_localctx).node =  new ParenTypeListAtype(((AtypeContext)_localctx).type_list.node);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				match(LBRACKET);
				setState(308);
				((AtypeContext)_localctx).atype = atype();
				setState(309);
				match(RBRACKET);
				((AtypeContext)_localctx).node =  new BracketAtype(((AtypeContext)_localctx).atype.node);
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
	public static class Let_statementContext extends ParserRuleContext {
		public ASTNode node;
		public DeclarationsContext a;
		public ExpressionContext b;
		public TerminalNode LET() { return getToken(HaskellParser.LET, 0); }
		public TerminalNode IN() { return getToken(HaskellParser.IN, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Let_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_statement; }
	}

	public final Let_statementContext let_statement() throws RecognitionException {
		Let_statementContext _localctx = new Let_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_let_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(LET);
			setState(315);
			((Let_statementContext)_localctx).a = declarations();
			setState(316);
			match(IN);
			setState(317);
			((Let_statementContext)_localctx).b = expression(0);

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
	public static class Function_applicationContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ArgsContext args;
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HaskellParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HaskellParser.RPAREN, 0); }
		public Function_applicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_application; }
	}

	public final Function_applicationContext function_application() throws RecognitionException {
		Function_applicationContext _localctx = new Function_applicationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_application);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				((Function_applicationContext)_localctx).ID = match(ID);
				setState(321);
				((Function_applicationContext)_localctx).args = args();
				((Function_applicationContext)_localctx).node =  new IdFunctionApplication((((Function_applicationContext)_localctx).ID!=null?((Function_applicationContext)_localctx).ID.getText():null), ((Function_applicationContext)_localctx).args.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				((Function_applicationContext)_localctx).ID = match(ID);
				setState(325);
				match(LPAREN);
				setState(326);
				((Function_applicationContext)_localctx).args = args();
				setState(327);
				match(RPAREN);
				((Function_applicationContext)_localctx).node =  new IdParenFunctionApplication((((Function_applicationContext)_localctx).ID!=null?((Function_applicationContext)_localctx).ID.getText():null), ((Function_applicationContext)_localctx).args.node);
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
	public static class ArgsContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public ArgsContext args;
		public Function_applicationContext f;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(HaskellParser.COMMA, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Function_applicationContext function_application() {
			return getRuleContext(Function_applicationContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_args);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				((ArgsContext)_localctx).expression = expression(0);
				setState(333);
				match(COMMA);
				setState(334);
				((ArgsContext)_localctx).args = args();
				((ArgsContext)_localctx).node =  new ArgsList(((ArgsContext)_localctx).expression.node, ((ArgsContext)_localctx).args.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				((ArgsContext)_localctx).expression = expression(0);
				((ArgsContext)_localctx).node =  new SingleArg(((ArgsContext)_localctx).expression.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				((ArgsContext)_localctx).f = function_application();
				((ArgsContext)_localctx).node =  new FunctionApplicationArg(((ArgsContext)_localctx).f.node);
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
	public static class OpContext extends ParserRuleContext {
		public String value;
		public Token BACKTICK;
		public Token ID;
		public Token UID;
		public TerminalNode PLUS() { return getToken(HaskellParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(HaskellParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(HaskellParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(HaskellParser.DIV, 0); }
		public TerminalNode EQUALS() { return getToken(HaskellParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(HaskellParser.NOT_EQUALS, 0); }
		public TerminalNode LESS_THAN() { return getToken(HaskellParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(HaskellParser.GREATER_THAN, 0); }
		public TerminalNode LESS_THAN_EQUAL() { return getToken(HaskellParser.LESS_THAN_EQUAL, 0); }
		public TerminalNode GREATER_THAN_EQUAL() { return getToken(HaskellParser.GREATER_THAN_EQUAL, 0); }
		public TerminalNode AND() { return getToken(HaskellParser.AND, 0); }
		public TerminalNode OR() { return getToken(HaskellParser.OR, 0); }
		public TerminalNode COLON() { return getToken(HaskellParser.COLON, 0); }
		public TerminalNode CONCAT() { return getToken(HaskellParser.CONCAT, 0); }
		public TerminalNode RARROW() { return getToken(HaskellParser.RARROW, 0); }
		public List<TerminalNode> BACKTICK() { return getTokens(HaskellParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(HaskellParser.BACKTICK, i);
		}
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public TerminalNode UID() { return getToken(HaskellParser.UID, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_op);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(PLUS);
				((OpContext)_localctx).value = "+";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(MINUS);
				((OpContext)_localctx).value = "-";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(MULT);
				((OpContext)_localctx).value = "*";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(DIV);
				((OpContext)_localctx).value = "/";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				match(EQUALS);
				((OpContext)_localctx).value = "==";
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(355);
				match(NOT_EQUALS);
				((OpContext)_localctx).value = "/=";
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(357);
				match(LESS_THAN);
				((OpContext)_localctx).value = "<";
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(359);
				match(GREATER_THAN);
				((OpContext)_localctx).value = ">";
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(361);
				match(LESS_THAN_EQUAL);
				((OpContext)_localctx).value = "<=";
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(363);
				match(GREATER_THAN_EQUAL);
				((OpContext)_localctx).value = ">=";
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(365);
				match(AND);
				((OpContext)_localctx).value = "&&";
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(367);
				match(OR);
				((OpContext)_localctx).value = "||";
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(369);
				match(COLON);
				((OpContext)_localctx).value = ":";
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(371);
				match(CONCAT);
				((OpContext)_localctx).value = "++";
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(373);
				match(RARROW);
				((OpContext)_localctx).value = "->";
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(375);
				((OpContext)_localctx).BACKTICK = match(BACKTICK);
				setState(376);
				((OpContext)_localctx).ID = match(ID);
				setState(377);
				((OpContext)_localctx).BACKTICK = match(BACKTICK);
				((OpContext)_localctx).value = (((OpContext)_localctx).BACKTICK!=null?((OpContext)_localctx).BACKTICK.getText():null) + (((OpContext)_localctx).ID!=null?((OpContext)_localctx).ID.getText():null) + (((OpContext)_localctx).BACKTICK!=null?((OpContext)_localctx).BACKTICK.getText():null);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(379);
				((OpContext)_localctx).BACKTICK = match(BACKTICK);
				setState(380);
				((OpContext)_localctx).UID = match(UID);
				setState(381);
				((OpContext)_localctx).BACKTICK = match(BACKTICK);
				((OpContext)_localctx).value = (((OpContext)_localctx).BACKTICK!=null?((OpContext)_localctx).BACKTICK.getText():null) + (((OpContext)_localctx).UID!=null?((OpContext)_localctx).UID.getText():null) + (((OpContext)_localctx).BACKTICK!=null?((OpContext)_localctx).BACKTICK.getText():null);
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
	public static class LiteralContext extends ParserRuleContext {
		public ASTNode node;
		public Token INTEGER;
		public Token FLOAT;
		public Token CHAR;
		public Token STRING;
		public TerminalNode INTEGER() { return getToken(HaskellParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(HaskellParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(HaskellParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(HaskellParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(HaskellParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(HaskellParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				((LiteralContext)_localctx).INTEGER = match(INTEGER);
				((LiteralContext)_localctx).node =  new IntegerLiteral(Integer.parseInt((((LiteralContext)_localctx).INTEGER!=null?((LiteralContext)_localctx).INTEGER.getText():null)));
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				((LiteralContext)_localctx).FLOAT = match(FLOAT);
				((LiteralContext)_localctx).node =  new FloatLiteral(Float.parseFloat((((LiteralContext)_localctx).FLOAT!=null?((LiteralContext)_localctx).FLOAT.getText():null)));
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				((LiteralContext)_localctx).CHAR = match(CHAR);
				((LiteralContext)_localctx).node =  new CharLiteral((((LiteralContext)_localctx).CHAR!=null?((LiteralContext)_localctx).CHAR.getText():null));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				((LiteralContext)_localctx).STRING = match(STRING);
				((LiteralContext)_localctx).node =  new StringLiteral((((LiteralContext)_localctx).STRING!=null?((LiteralContext)_localctx).STRING.getText():null));
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				match(TRUE);
				((LiteralContext)_localctx).node =  new BooleanLiteral(true);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(395);
				match(FALSE);
				((LiteralContext)_localctx).node =  new BooleanLiteral(false);
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
	public static class Type_listContext extends ParserRuleContext {
		public ASTNode node;
		public TypeContext type;
		public Type_listContext type_list;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(HaskellParser.COMMA, 0); }
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_list; }
	}

	public final Type_listContext type_list() throws RecognitionException {
		Type_listContext _localctx = new Type_listContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type_list);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				((Type_listContext)_localctx).type = type();
				setState(400);
				match(COMMA);
				setState(401);
				((Type_listContext)_localctx).type_list = type_list();
				((Type_listContext)_localctx).node =  new TypeList(((Type_listContext)_localctx).type.node, ((Type_listContext)_localctx).type_list.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				((Type_listContext)_localctx).type = type();
				((Type_listContext)_localctx).node =  new SingleTypeList(((Type_listContext)_localctx).type.node);
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
	public static class List_comprehensionsContext extends ParserRuleContext {
		public ASTNode node;
		public ExpsContext exps;
		public ExpressionContext expression;
		public TerminalNode LPAREN() { return getToken(HaskellParser.LPAREN, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HaskellParser.RPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(HaskellParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(HaskellParser.RBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(HaskellParser.RANGE, 0); }
		public List_comprehensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_comprehensions; }
	}

	public final List_comprehensionsContext list_comprehensions() throws RecognitionException {
		List_comprehensionsContext _localctx = new List_comprehensionsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_list_comprehensions);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(LPAREN);
				setState(410);
				((List_comprehensionsContext)_localctx).exps = exps();
				setState(411);
				match(RPAREN);
				((List_comprehensionsContext)_localctx).node =  new ParenExpsList(((List_comprehensionsContext)_localctx).exps.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(LBRACKET);
				setState(415);
				((List_comprehensionsContext)_localctx).exps = exps();
				setState(416);
				match(RBRACKET);
				((List_comprehensionsContext)_localctx).node =  new BracketExpsList(((List_comprehensionsContext)_localctx).exps.node);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(LBRACKET);
				setState(420);
				((List_comprehensionsContext)_localctx).expression = expression(0);
				setState(421);
				match(RANGE);
				setState(422);
				match(RBRACKET);
				((List_comprehensionsContext)_localctx).node =  new BracketRange(((List_comprehensionsContext)_localctx).expression.node);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				match(LBRACKET);
				setState(426);
				match(RBRACKET);
				((List_comprehensionsContext)_localctx).node =  new EmptyBracketList();
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
	public static class GensContext extends ParserRuleContext {
		public ASTNode node;
		public GenContext gen;
		public GensContext gens;
		public GenContext gen() {
			return getRuleContext(GenContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(HaskellParser.COMMA, 0); }
		public GensContext gens() {
			return getRuleContext(GensContext.class,0);
		}
		public GensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gens; }
	}

	public final GensContext gens() throws RecognitionException {
		GensContext _localctx = new GensContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_gens);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				((GensContext)_localctx).gen = gen();
				setState(431);
				match(COMMA);
				setState(432);
				((GensContext)_localctx).gens = gens();
				((GensContext)_localctx).node =  new GensList(((GensContext)_localctx).gen.node, ((GensContext)_localctx).gens.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				((GensContext)_localctx).gen = gen();
				((GensContext)_localctx).node =  new SingleGen(((GensContext)_localctx).gen.node);
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
	public static class GenContext extends ParserRuleContext {
		public ASTNode node;
		public PatContext a;
		public ExpressionContext b;
		public ExpressionContext d;
		public TerminalNode ARROW() { return getToken(HaskellParser.ARROW, 0); }
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen; }
	}

	public final GenContext gen() throws RecognitionException {
		GenContext _localctx = new GenContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_gen);
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				((GenContext)_localctx).a = pat();
				setState(441);
				match(ARROW);
				setState(442);
				((GenContext)_localctx).b = expression(0);
				((GenContext)_localctx).node =  new GenClass(((GenContext)_localctx).a.node, ((GenContext)_localctx).b.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				((GenContext)_localctx).d = expression(0);
				((GenContext)_localctx).node =  new GenExpression(((GenContext)_localctx).d.node);
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
	public static class ExpsContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public ExpsContext exps;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(HaskellParser.COMMA, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exps);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				((ExpsContext)_localctx).expression = expression(0);
				setState(451);
				match(COMMA);
				setState(452);
				((ExpsContext)_localctx).exps = exps();
				((ExpsContext)_localctx).node =  new ExpsList(((ExpsContext)_localctx).expression.node, ((ExpsContext)_localctx).exps.node);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				((ExpsContext)_localctx).expression = expression(0);
				((ExpsContext)_localctx).node =  new SingleExp(((ExpsContext)_localctx).expression.node);
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
	public static class DeclarationsContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declarations);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				decl();
				setState(461);
				declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				decl();
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
	public static class DeclContext extends ParserRuleContext {
		public GendeclContext gendecl() {
			return getRuleContext(GendeclContext.class,0);
		}
		public FunlhsContext funlhs() {
			return getRuleContext(FunlhsContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_decl);
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				gendecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				funlhs();
				setState(468);
				rhs();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				pat();
				setState(471);
				rhs();
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
	public static class GendeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(HaskellParser.DOUBLE_COLON, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public GendeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gendecl; }
	}

	public final GendeclContext gendecl() throws RecognitionException {
		GendeclContext _localctx = new GendeclContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_gendecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(ID);
			setState(476);
			match(DOUBLE_COLON);
			setState(477);
			types();
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
	public static class QvconContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public TerminalNode UID() { return getToken(HaskellParser.UID, 0); }
		public QvconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qvcon; }
	}

	public final QvconContext qvcon() throws RecognitionException {
		QvconContext _localctx = new QvconContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_qvcon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !(_la==UID || _la==ID) ) {
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
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001i\u01e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001V\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003d\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004m\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005y\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008e"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ac"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00b3\b\u0007\n\u0007\f\u0007\u00b6\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00cd\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00df\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00f5\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00fe\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u010d\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0117\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0120\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0139\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u014b\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0158\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0180\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u018e\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0198\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01ad\b\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01b7\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01c1\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01cb\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01d1\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u01da\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0000\u0001\u000e#\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BD\u0000\u0001\u0001\u0000cd\u0201\u0000F\u0001\u0000"+
		"\u0000\u0000\u0002U\u0001\u0000\u0000\u0000\u0004W\u0001\u0000\u0000\u0000"+
		"\u0006c\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000\nx\u0001\u0000"+
		"\u0000\u0000\f\u008d\u0001\u0000\u0000\u0000\u000e\u00ab\u0001\u0000\u0000"+
		"\u0000\u0010\u00b7\u0001\u0000\u0000\u0000\u0012\u00bf\u0001\u0000\u0000"+
		"\u0000\u0014\u00cc\u0001\u0000\u0000\u0000\u0016\u00ce\u0001\u0000\u0000"+
		"\u0000\u0018\u00d3\u0001\u0000\u0000\u0000\u001a\u00de\u0001\u0000\u0000"+
		"\u0000\u001c\u00f4\u0001\u0000\u0000\u0000\u001e\u00fd\u0001\u0000\u0000"+
		"\u0000 \u00ff\u0001\u0000\u0000\u0000\"\u010c\u0001\u0000\u0000\u0000"+
		"$\u0116\u0001\u0000\u0000\u0000&\u011f\u0001\u0000\u0000\u0000(\u0138"+
		"\u0001\u0000\u0000\u0000*\u013a\u0001\u0000\u0000\u0000,\u014a\u0001\u0000"+
		"\u0000\u0000.\u0157\u0001\u0000\u0000\u00000\u017f\u0001\u0000\u0000\u0000"+
		"2\u018d\u0001\u0000\u0000\u00004\u0197\u0001\u0000\u0000\u00006\u01ac"+
		"\u0001\u0000\u0000\u00008\u01b6\u0001\u0000\u0000\u0000:\u01c0\u0001\u0000"+
		"\u0000\u0000<\u01ca\u0001\u0000\u0000\u0000>\u01d0\u0001\u0000\u0000\u0000"+
		"@\u01d9\u0001\u0000\u0000\u0000B\u01db\u0001\u0000\u0000\u0000D\u01df"+
		"\u0001\u0000\u0000\u0000FG\u0003\u0002\u0001\u0000GH\u0006\u0000\uffff"+
		"\uffff\u0000H\u0001\u0001\u0000\u0000\u0000IJ\u0003\u0004\u0002\u0000"+
		"JK\u0005P\u0000\u0000KL\u0006\u0001\uffff\uffff\u0000LV\u0001\u0000\u0000"+
		"\u0000MN\u0003\n\u0005\u0000NO\u0003\f\u0006\u0000OP\u0006\u0001\uffff"+
		"\uffff\u0000PV\u0001\u0000\u0000\u0000QR\u0003\u0006\u0003\u0000RS\u0003"+
		"\f\u0006\u0000ST\u0006\u0001\uffff\uffff\u0000TV\u0001\u0000\u0000\u0000"+
		"UI\u0001\u0000\u0000\u0000UM\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000"+
		"\u0000V\u0003\u0001\u0000\u0000\u0000WX\u0005d\u0000\u0000XY\u0005U\u0000"+
		"\u0000YZ\u0003$\u0012\u0000Z[\u0006\u0002\uffff\uffff\u0000[\u0005\u0001"+
		"\u0000\u0000\u0000\\]\u0005d\u0000\u0000]d\u0006\u0003\uffff\uffff\u0000"+
		"^_\u0005c\u0000\u0000_d\u0006\u0003\uffff\uffff\u0000`a\u00032\u0019\u0000"+
		"ab\u0006\u0003\uffff\uffff\u0000bd\u0001\u0000\u0000\u0000c\\\u0001\u0000"+
		"\u0000\u0000c^\u0001\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000d\u0007"+
		"\u0001\u0000\u0000\u0000ef\u0003\u0006\u0003\u0000fg\u0003\b\u0004\u0000"+
		"gh\u0006\u0004\uffff\uffff\u0000hm\u0001\u0000\u0000\u0000ij\u0003\u0006"+
		"\u0003\u0000jk\u0006\u0004\uffff\uffff\u0000km\u0001\u0000\u0000\u0000"+
		"le\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000m\t\u0001\u0000\u0000"+
		"\u0000no\u0005d\u0000\u0000op\u0003\b\u0004\u0000pq\u0006\u0005\uffff"+
		"\uffff\u0000qy\u0001\u0000\u0000\u0000rs\u0005d\u0000\u0000st\u0005L\u0000"+
		"\u0000tu\u0003\b\u0004\u0000uv\u0005M\u0000\u0000vw\u0006\u0005\uffff"+
		"\uffff\u0000wy\u0001\u0000\u0000\u0000xn\u0001\u0000\u0000\u0000xr\u0001"+
		"\u0000\u0000\u0000y\u000b\u0001\u0000\u0000\u0000z{\u0005C\u0000\u0000"+
		"{|\u0003\u000e\u0007\u0000|}\u0006\u0006\uffff\uffff\u0000}\u008e\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005C\u0000\u0000\u007f\u0080\u00036\u001b"+
		"\u0000\u0080\u0081\u0006\u0006\uffff\uffff\u0000\u0081\u008e\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005C\u0000\u0000\u0083\u0084\u0003,\u0016\u0000"+
		"\u0084\u0085\u0006\u0006\uffff\uffff\u0000\u0085\u008e\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005T\u0000\u0000\u0087\u0088\u0003\u000e\u0007\u0000"+
		"\u0088\u0089\u0006\u0006\uffff\uffff\u0000\u0089\u008e\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0003\u001e\u000f\u0000\u008b\u008c\u0006\u0006\uffff"+
		"\uffff\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008dz\u0001\u0000\u0000"+
		"\u0000\u008d~\u0001\u0000\u0000\u0000\u008d\u0082\u0001\u0000\u0000\u0000"+
		"\u008d\u0086\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000"+
		"\u008e\r\u0001\u0000\u0000\u0000\u008f\u0090\u0006\u0007\uffff\uffff\u0000"+
		"\u0090\u0091\u0003\u0010\b\u0000\u0091\u0092\u0006\u0007\uffff\uffff\u0000"+
		"\u0092\u00ac\u0001\u0000\u0000\u0000\u0093\u0094\u0003\u0012\t\u0000\u0094"+
		"\u0095\u0006\u0007\uffff\uffff\u0000\u0095\u00ac\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0003*\u0015\u0000\u0097\u0098\u0006\u0007\uffff\uffff\u0000"+
		"\u0098\u00ac\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0018\f\u0000\u009a"+
		"\u009b\u0006\u0007\uffff\uffff\u0000\u009b\u00ac\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005d\u0000\u0000\u009d\u00ac\u0006\u0007\uffff\uffff\u0000"+
		"\u009e\u009f\u00032\u0019\u0000\u009f\u00a0\u0006\u0007\uffff\uffff\u0000"+
		"\u00a0\u00ac\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003,\u0016\u0000\u00a2"+
		"\u00a3\u0006\u0007\uffff\uffff\u0000\u00a3\u00ac\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u00036\u001b\u0000\u00a5\u00a6\u0006\u0007\uffff\uffff\u0000"+
		"\u00a6\u00ac\u0001\u0000\u0000\u0000\u00a7\u00a8\u00053\u0000\u0000\u00a8"+
		"\u00a9\u0003\u000e\u0007\u0001\u00a9\u00aa\u0006\u0007\uffff\uffff\u0000"+
		"\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u008f\u0001\u0000\u0000\u0000"+
		"\u00ab\u0093\u0001\u0000\u0000\u0000\u00ab\u0096\u0001\u0000\u0000\u0000"+
		"\u00ab\u0099\u0001\u0000\u0000\u0000\u00ab\u009c\u0001\u0000\u0000\u0000"+
		"\u00ab\u009e\u0001\u0000\u0000\u0000\u00ab\u00a1\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a4\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ac\u00b4\u0001\u0000\u0000\u0000\u00ad\u00ae\n\u0002\u0000\u0000\u00ae"+
		"\u00af\u00030\u0018\u0000\u00af\u00b0\u0003\u000e\u0007\u0003\u00b0\u00b1"+
		"\u0006\u0007\uffff\uffff\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u000f\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0007\u0000\u0000\u00b8\u00b9\u0003\u000e\u0007\u0000\u00b9"+
		"\u00ba\u0005\u0011\u0000\u0000\u00ba\u00bb\u0003\u000e\u0007\u0000\u00bb"+
		"\u00bc\u0005\u0005\u0000\u0000\u00bc\u00bd\u0003\u000e\u0007\u0000\u00bd"+
		"\u00be\u0006\b\uffff\uffff\u0000\u00be\u0011\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0005\u0002\u0000\u0000\u00c0\u00c1\u0003\u000e\u0007\u0000\u00c1"+
		"\u00c2\u0005\u000f\u0000\u0000\u00c2\u00c3\u0003\u0014\n\u0000\u00c3\u00c4"+
		"\u0006\t\uffff\uffff\u0000\u00c4\u0013\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0003\u0016\u000b\u0000\u00c6\u00c7\u0003\u0014\n\u0000\u00c7\u00c8\u0006"+
		"\n\uffff\uffff\u0000\u00c8\u00cd\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003"+
		"\u0016\u000b\u0000\u00ca\u00cb\u0006\n\uffff\uffff\u0000\u00cb\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cc\u00c5\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cd\u0015\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003"+
		"\u0006\u0003\u0000\u00cf\u00d0\u0005i\u0000\u0000\u00d0\u00d1\u0003\u000e"+
		"\u0007\u0000\u00d1\u00d2\u0006\u000b\uffff\uffff\u0000\u00d2\u0017\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005\u0004\u0000\u0000\u00d4\u00d5\u0003"+
		"\u001a\r\u0000\u00d5\u00d6\u0006\f\uffff\uffff\u0000\u00d6\u0019\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0003\u001c\u000e\u0000\u00d8\u00d9\u0003"+
		"\u001a\r\u0000\u00d9\u00da\u0006\r\uffff\uffff\u0000\u00da\u00df\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0003\u001c\u000e\u0000\u00dc\u00dd\u0006"+
		"\r\uffff\uffff\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00d7\u0001"+
		"\u0000\u0000\u0000\u00de\u00db\u0001\u0000\u0000\u0000\u00df\u001b\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0003\u000e\u0007\u0000\u00e1\u00e2\u0006"+
		"\u000e\uffff\uffff\u0000\u00e2\u00f5\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0003\u0006\u0003\u0000\u00e4\u00e5\u0005i\u0000\u0000\u00e5\u00e6\u0003"+
		"\u000e\u0007\u0000\u00e6\u00e7\u0006\u000e\uffff\uffff\u0000\u00e7\u00f5"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003\u0006\u0003\u0000\u00e9\u00ea"+
		"\u0005C\u0000\u0000\u00ea\u00eb\u0003\u000e\u0007\u0000\u00eb\u00ec\u0006"+
		"\u000e\uffff\uffff\u0000\u00ec\u00f5\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0003\u0006\u0003\u0000\u00ee\u00ef\u0005C\u0000\u0000\u00ef\u00f0\u0003"+
		"\u000e\u0007\u0000\u00f0\u00f1\u0005U\u0000\u0000\u00f1\u00f2\u0003$\u0012"+
		"\u0000\u00f2\u00f3\u0006\u000e\uffff\uffff\u0000\u00f3\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f4\u00e0\u0001\u0000\u0000\u0000\u00f4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00f4\u00e8\u0001\u0000\u0000\u0000\u00f4\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f5\u001d\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003 \u0010"+
		"\u0000\u00f7\u00f8\u0005C\u0000\u0000\u00f8\u00f9\u0003\u000e\u0007\u0000"+
		"\u00f9\u00fa\u0003\u001e\u000f\u0000\u00fa\u00fb\u0006\u000f\uffff\uffff"+
		"\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fe\u0006\u000f\uffff"+
		"\uffff\u0000\u00fd\u00f6\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fe\u001f\u0001\u0000\u0000\u0000\u00ff\u0100\u0005A\u0000"+
		"\u0000\u0100\u0101\u0003\"\u0011\u0000\u0101\u0102\u0006\u0010\uffff\uffff"+
		"\u0000\u0102!\u0001\u0000\u0000\u0000\u0103\u0104\u0003\u000e\u0007\u0000"+
		"\u0104\u0105\u0005U\u0000\u0000\u0105\u0106\u0005S\u0000\u0000\u0106\u0107"+
		"\u0003&\u0013\u0000\u0107\u0108\u0006\u0011\uffff\uffff\u0000\u0108\u010d"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0003\u000e\u0007\u0000\u010a\u010b"+
		"\u0006\u0011\uffff\uffff\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c"+
		"\u0103\u0001\u0000\u0000\u0000\u010c\u0109\u0001\u0000\u0000\u0000\u010d"+
		"#\u0001\u0000\u0000\u0000\u010e\u010f\u0003&\u0013\u0000\u010f\u0110\u0005"+
		"i\u0000\u0000\u0110\u0111\u0003$\u0012\u0000\u0111\u0112\u0006\u0012\uffff"+
		"\uffff\u0000\u0112\u0117\u0001\u0000\u0000\u0000\u0113\u0114\u0003&\u0013"+
		"\u0000\u0114\u0115\u0006\u0012\uffff\uffff\u0000\u0115\u0117\u0001\u0000"+
		"\u0000\u0000\u0116\u010e\u0001\u0000\u0000\u0000\u0116\u0113\u0001\u0000"+
		"\u0000\u0000\u0117%\u0001\u0000\u0000\u0000\u0118\u0119\u0005i\u0000\u0000"+
		"\u0119\u011a\u0003&\u0013\u0000\u011a\u011b\u0006\u0013\uffff\uffff\u0000"+
		"\u011b\u0120\u0001\u0000\u0000\u0000\u011c\u011d\u0003(\u0014\u0000\u011d"+
		"\u011e\u0006\u0013\uffff\uffff\u0000\u011e\u0120\u0001\u0000\u0000\u0000"+
		"\u011f\u0118\u0001\u0000\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000"+
		"\u0120\'\u0001\u0000\u0000\u0000\u0121\u0122\u0005c\u0000\u0000\u0122"+
		"\u0139\u0006\u0014\uffff\uffff\u0000\u0123\u0124\u0005d\u0000\u0000\u0124"+
		"\u0139\u0006\u0014\uffff\uffff\u0000\u0125\u0126\u0005c\u0000\u0000\u0126"+
		"\u0127\u0005L\u0000\u0000\u0127\u0128\u0005M\u0000\u0000\u0128\u0139\u0006"+
		"\u0014\uffff\uffff\u0000\u0129\u012a\u0005L\u0000\u0000\u012a\u012b\u0003"+
		"$\u0012\u0000\u012b\u012c\u0005M\u0000\u0000\u012c\u012d\u0006\u0014\uffff"+
		"\uffff\u0000\u012d\u0139\u0001\u0000\u0000\u0000\u012e\u012f\u0005L\u0000"+
		"\u0000\u012f\u0130\u00034\u001a\u0000\u0130\u0131\u0005M\u0000\u0000\u0131"+
		"\u0132\u0006\u0014\uffff\uffff\u0000\u0132\u0139\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0005H\u0000\u0000\u0134\u0135\u0003(\u0014\u0000\u0135\u0136"+
		"\u0005I\u0000\u0000\u0136\u0137\u0006\u0014\uffff\uffff\u0000\u0137\u0139"+
		"\u0001\u0000\u0000\u0000\u0138\u0121\u0001\u0000\u0000\u0000\u0138\u0123"+
		"\u0001\u0000\u0000\u0000\u0138\u0125\u0001\u0000\u0000\u0000\u0138\u0129"+
		"\u0001\u0000\u0000\u0000\u0138\u012e\u0001\u0000\u0000\u0000\u0138\u0133"+
		"\u0001\u0000\u0000\u0000\u0139)\u0001\u0000\u0000\u0000\u013a\u013b\u0005"+
		"\r\u0000\u0000\u013b\u013c\u0003>\u001f\u0000\u013c\u013d\u0005\t\u0000"+
		"\u0000\u013d\u013e\u0003\u000e\u0007\u0000\u013e\u013f\u0006\u0015\uffff"+
		"\uffff\u0000\u013f+\u0001\u0000\u0000\u0000\u0140\u0141\u0005d\u0000\u0000"+
		"\u0141\u0142\u0003.\u0017\u0000\u0142\u0143\u0006\u0016\uffff\uffff\u0000"+
		"\u0143\u014b\u0001\u0000\u0000\u0000\u0144\u0145\u0005d\u0000\u0000\u0145"+
		"\u0146\u0005L\u0000\u0000\u0146\u0147\u0003.\u0017\u0000\u0147\u0148\u0005"+
		"M\u0000\u0000\u0148\u0149\u0006\u0016\uffff\uffff\u0000\u0149\u014b\u0001"+
		"\u0000\u0000\u0000\u014a\u0140\u0001\u0000\u0000\u0000\u014a\u0144\u0001"+
		"\u0000\u0000\u0000\u014b-\u0001\u0000\u0000\u0000\u014c\u014d\u0003\u000e"+
		"\u0007\u0000\u014d\u014e\u0005N\u0000\u0000\u014e\u014f\u0003.\u0017\u0000"+
		"\u014f\u0150\u0006\u0017\uffff\uffff\u0000\u0150\u0158\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0003\u000e\u0007\u0000\u0152\u0153\u0006\u0017\uffff"+
		"\uffff\u0000\u0153\u0158\u0001\u0000\u0000\u0000\u0154\u0155\u0003,\u0016"+
		"\u0000\u0155\u0156\u0006\u0017\uffff\uffff\u0000\u0156\u0158\u0001\u0000"+
		"\u0000\u0000\u0157\u014c\u0001\u0000\u0000\u0000\u0157\u0151\u0001\u0000"+
		"\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0158/\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u00052\u0000\u0000\u015a\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u015b\u015c\u00053\u0000\u0000\u015c\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u015d\u015e\u00054\u0000\u0000\u015e\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u015f\u0160\u00055\u0000\u0000\u0160\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u0161\u0162\u00057\u0000\u0000\u0162\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u0163\u0164\u00058\u0000\u0000\u0164\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u0165\u0166\u00059\u0000\u0000\u0166\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u0167\u0168\u0005:\u0000\u0000\u0168\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u0169\u016a\u0005;\u0000\u0000\u016a\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u016b\u016c\u0005<\u0000\u0000\u016c\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u016d\u016e\u0005=\u0000\u0000\u016e\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u016f\u0170\u0005>\u0000\u0000\u0170\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u0171\u0172\u0005E\u0000\u0000\u0172\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u0173\u0174\u0005F\u0000\u0000\u0174\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u0175\u0176\u0005T\u0000\u0000\u0176\u0180\u0006\u0018\uffff\uffff"+
		"\u0000\u0177\u0178\u0005O\u0000\u0000\u0178\u0179\u0005d\u0000\u0000\u0179"+
		"\u017a\u0005O\u0000\u0000\u017a\u0180\u0006\u0018\uffff\uffff\u0000\u017b"+
		"\u017c\u0005O\u0000\u0000\u017c\u017d\u0005c\u0000\u0000\u017d\u017e\u0005"+
		"O\u0000\u0000\u017e\u0180\u0006\u0018\uffff\uffff\u0000\u017f\u0159\u0001"+
		"\u0000\u0000\u0000\u017f\u015b\u0001\u0000\u0000\u0000\u017f\u015d\u0001"+
		"\u0000\u0000\u0000\u017f\u015f\u0001\u0000\u0000\u0000\u017f\u0161\u0001"+
		"\u0000\u0000\u0000\u017f\u0163\u0001\u0000\u0000\u0000\u017f\u0165\u0001"+
		"\u0000\u0000\u0000\u017f\u0167\u0001\u0000\u0000\u0000\u017f\u0169\u0001"+
		"\u0000\u0000\u0000\u017f\u016b\u0001\u0000\u0000\u0000\u017f\u016d\u0001"+
		"\u0000\u0000\u0000\u017f\u016f\u0001\u0000\u0000\u0000\u017f\u0171\u0001"+
		"\u0000\u0000\u0000\u017f\u0173\u0001\u0000\u0000\u0000\u017f\u0175\u0001"+
		"\u0000\u0000\u0000\u017f\u0177\u0001\u0000\u0000\u0000\u017f\u017b\u0001"+
		"\u0000\u0000\u0000\u01801\u0001\u0000\u0000\u0000\u0181\u0182\u0005e\u0000"+
		"\u0000\u0182\u018e\u0006\u0019\uffff\uffff\u0000\u0183\u0184\u0005f\u0000"+
		"\u0000\u0184\u018e\u0006\u0019\uffff\uffff\u0000\u0185\u0186\u0005g\u0000"+
		"\u0000\u0186\u018e\u0006\u0019\uffff\uffff\u0000\u0187\u0188\u0005h\u0000"+
		"\u0000\u0188\u018e\u0006\u0019\uffff\uffff\u0000\u0189\u018a\u0005*\u0000"+
		"\u0000\u018a\u018e\u0006\u0019\uffff\uffff\u0000\u018b\u018c\u0005+\u0000"+
		"\u0000\u018c\u018e\u0006\u0019\uffff\uffff\u0000\u018d\u0181\u0001\u0000"+
		"\u0000\u0000\u018d\u0183\u0001\u0000\u0000\u0000\u018d\u0185\u0001\u0000"+
		"\u0000\u0000\u018d\u0187\u0001\u0000\u0000\u0000\u018d\u0189\u0001\u0000"+
		"\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e3\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0003&\u0013\u0000\u0190\u0191\u0005N\u0000\u0000\u0191"+
		"\u0192\u00034\u001a\u0000\u0192\u0193\u0006\u001a\uffff\uffff\u0000\u0193"+
		"\u0198\u0001\u0000\u0000\u0000\u0194\u0195\u0003&\u0013\u0000\u0195\u0196"+
		"\u0006\u001a\uffff\uffff\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197"+
		"\u018f\u0001\u0000\u0000\u0000\u0197\u0194\u0001\u0000\u0000\u0000\u0198"+
		"5\u0001\u0000\u0000\u0000\u0199\u019a\u0005L\u0000\u0000\u019a\u019b\u0003"+
		"<\u001e\u0000\u019b\u019c\u0005M\u0000\u0000\u019c\u019d\u0006\u001b\uffff"+
		"\uffff\u0000\u019d\u01ad\u0001\u0000\u0000\u0000\u019e\u019f\u0005H\u0000"+
		"\u0000\u019f\u01a0\u0003<\u001e\u0000\u01a0\u01a1\u0005I\u0000\u0000\u01a1"+
		"\u01a2\u0006\u001b\uffff\uffff\u0000\u01a2\u01ad\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a4\u0005H\u0000\u0000\u01a4\u01a5\u0003\u000e\u0007\u0000\u01a5"+
		"\u01a6\u0005J\u0000\u0000\u01a6\u01a7\u0005I\u0000\u0000\u01a7\u01a8\u0006"+
		"\u001b\uffff\uffff\u0000\u01a8\u01ad\u0001\u0000\u0000\u0000\u01a9\u01aa"+
		"\u0005H\u0000\u0000\u01aa\u01ab\u0005I\u0000\u0000\u01ab\u01ad\u0006\u001b"+
		"\uffff\uffff\u0000\u01ac\u0199\u0001\u0000\u0000\u0000\u01ac\u019e\u0001"+
		"\u0000\u0000\u0000\u01ac\u01a3\u0001\u0000\u0000\u0000\u01ac\u01a9\u0001"+
		"\u0000\u0000\u0000\u01ad7\u0001\u0000\u0000\u0000\u01ae\u01af\u0003:\u001d"+
		"\u0000\u01af\u01b0\u0005N\u0000\u0000\u01b0\u01b1\u00038\u001c\u0000\u01b1"+
		"\u01b2\u0006\u001c\uffff\uffff\u0000\u01b2\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u0003:\u001d\u0000\u01b4\u01b5\u0006\u001c\uffff\uffff\u0000"+
		"\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b3\u0001\u0000\u0000\u0000\u01b79\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0003\u0006\u0003\u0000\u01b9\u01ba\u0005i\u0000\u0000\u01ba\u01bb"+
		"\u0003\u000e\u0007\u0000\u01bb\u01bc\u0006\u001d\uffff\uffff\u0000\u01bc"+
		"\u01c1\u0001\u0000\u0000\u0000\u01bd\u01be\u0003\u000e\u0007\u0000\u01be"+
		"\u01bf\u0006\u001d\uffff\uffff\u0000\u01bf\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c0\u01b8\u0001\u0000\u0000\u0000\u01c0\u01bd\u0001\u0000\u0000\u0000"+
		"\u01c1;\u0001\u0000\u0000\u0000\u01c2\u01c3\u0003\u000e\u0007\u0000\u01c3"+
		"\u01c4\u0005N\u0000\u0000\u01c4\u01c5\u0003<\u001e\u0000\u01c5\u01c6\u0006"+
		"\u001e\uffff\uffff\u0000\u01c6\u01cb\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0003\u000e\u0007\u0000\u01c8\u01c9\u0006\u001e\uffff\uffff\u0000\u01c9"+
		"\u01cb\u0001\u0000\u0000\u0000\u01ca\u01c2\u0001\u0000\u0000\u0000\u01ca"+
		"\u01c7\u0001\u0000\u0000\u0000\u01cb=\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0003@ \u0000\u01cd\u01ce\u0003>\u001f\u0000\u01ce\u01d1\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d1\u0003@ \u0000\u01d0\u01cc\u0001\u0000\u0000\u0000"+
		"\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1?\u0001\u0000\u0000\u0000\u01d2"+
		"\u01da\u0003B!\u0000\u01d3\u01d4\u0003\n\u0005\u0000\u01d4\u01d5\u0003"+
		"\f\u0006\u0000\u01d5\u01da\u0001\u0000\u0000\u0000\u01d6\u01d7\u0003\u0006"+
		"\u0003\u0000\u01d7\u01d8\u0003\f\u0006\u0000\u01d8\u01da\u0001\u0000\u0000"+
		"\u0000\u01d9\u01d2\u0001\u0000\u0000\u0000\u01d9\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d9\u01d6\u0001\u0000\u0000\u0000\u01daA\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\u0005d\u0000\u0000\u01dc\u01dd\u0005U\u0000\u0000\u01dd\u01de"+
		"\u0003$\u0012\u0000\u01deC\u0001\u0000\u0000\u0000\u01df\u01e0\u0007\u0000"+
		"\u0000\u0000\u01e0E\u0001\u0000\u0000\u0000\u001aUclx\u008d\u00ab\u00b4"+
		"\u00cc\u00de\u00f4\u00fd\u010c\u0116\u011f\u0138\u014a\u0157\u017f\u018d"+
		"\u0197\u01ac\u01b6\u01c0\u01ca\u01d0\u01d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}