// Generated from Haskell.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AS=1, CASE=2, DEFAULT=3, DO=4, ELSE=5, HIDING=6, IF=7, IMPORT=8, IN=9, 
		INFIX=10, INFIXL=11, INFIXR=12, LET=13, MODULE=14, OF=15, QUALIFIED=16, 
		THEN=17, WHERE=18, WILDCARD=19, FORALL=20, FOREIGN=21, EXPORT=22, SAFE=23, 
		INTERRUPTIBLE=24, UNSAFE=25, MDO=26, FAMILY=27, ROLE=28, STDCALL=29, CCALL=30, 
		CAPI=31, CPPCALL=32, JSCALL=33, REC=34, GROUP=35, BY=36, USING=37, PATTERN=38, 
		STOCK=39, ANYCLASS=40, VIA=41, DATA=42, TYPE=43, CLASS=44, INSTANCE=45, 
		NEWTYPE=46, DERIVING=47, PLUS=48, MINUS=49, MULT=50, DIV=51, MOD=52, EQUALS=53, 
		NOT_EQUALS=54, LESS_THAN=55, GREATER_THAN=56, LESS_THAN_EQUAL=57, GREATER_THAN_EQUAL=58, 
		AND=59, OR=60, NOT=61, BITWISE_AND=62, VBAR=63, XOR=64, ASSIGN=65, DOT=66, 
		COLON=67, CONCAT=68, DOLLAR=69, LBRACKET=70, RBRACKET=71, RANGE=72, BACKSLASH=73, 
		LPAREN=74, RPAREN=75, COMMA=76, BACKTICK=77, SEMICOLON=78, LFLOWER=79, 
		RFLOWER=80, DOUBLEARROW=81, RARROW=82, DOUBLE_COLON=83, BIND_RIGHT=84, 
		BANG=85, HASH=86, QUESTION=87, AT=88, CARET=89, TILDE=90, DEFINE=91, WS=92, 
		NEWLINE=93, TAB=94, COMMENT=95, MULTI_LINE_COMMENT=96, UID=97, ID=98, 
		INTEGER=99, FLOAT=100, CHAR=101, STRING=102, ARROW=103;
	public static final int
		RULE_declarations = 0, RULE_decl = 1, RULE_gendecl = 2, RULE_pat = 3, 
		RULE_pats = 4, RULE_qvcon = 5, RULE_funlhs = 6, RULE_rhs = 7, RULE_expression = 8, 
		RULE_if_statement = 9, RULE_case_statement = 10, RULE_case_alternatives = 11, 
		RULE_case_alternative = 12, RULE_do_block = 13, RULE_stmts = 14, RULE_stmt = 15, 
		RULE_gdrhs = 16, RULE_gd = 17, RULE_exp1 = 18, RULE_types = 19, RULE_type = 20, 
		RULE_atype = 21, RULE_let_statement = 22, RULE_function_application = 23, 
		RULE_args = 24, RULE_op = 25, RULE_literal = 26, RULE_type_list = 27, 
		RULE_list_comprehensions = 28, RULE_gens = 29, RULE_gen = 30, RULE_exps = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"declarations", "decl", "gendecl", "pat", "pats", "qvcon", "funlhs", 
			"rhs", "expression", "if_statement", "case_statement", "case_alternatives", 
			"case_alternative", "do_block", "stmts", "stmt", "gdrhs", "gd", "exp1", 
			"types", "type", "atype", "let_statement", "function_application", "args", 
			"op", "literal", "type_list", "list_comprehensions", "gens", "gen", "exps"
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
			"'via'", "'data'", "'type'", "'class'", "'instance'", "'newtype'", "'deriving'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'/='", "'<'", "'>'", "'<='", 
			"'>='", "'&&'", "'||'", "'not'", "'&'", "'|'", "'xor'", "'='", "'.'", 
			"':'", "'++'", "'$'", "'['", "']'", "'..'", "'\\'", "'('", "')'", "','", 
			"'`'", "';'", "'{'", "'}'", "'=>'", "'<-'", "'::'", "'>>='", "'!'", "'#'", 
			"'?'", "'@'", "'^'", "'~'", "':='", null, null, null, null, null, null, 
			null, null, null, null, null, "'->'"
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
			"VIA", "DATA", "TYPE", "CLASS", "INSTANCE", "NEWTYPE", "DERIVING", "PLUS", 
			"MINUS", "MULT", "DIV", "MOD", "EQUALS", "NOT_EQUALS", "LESS_THAN", "GREATER_THAN", 
			"LESS_THAN_EQUAL", "GREATER_THAN_EQUAL", "AND", "OR", "NOT", "BITWISE_AND", 
			"VBAR", "XOR", "ASSIGN", "DOT", "COLON", "CONCAT", "DOLLAR", "LBRACKET", 
			"RBRACKET", "RANGE", "BACKSLASH", "LPAREN", "RPAREN", "COMMA", "BACKTICK", 
			"SEMICOLON", "LFLOWER", "RFLOWER", "DOUBLEARROW", "RARROW", "DOUBLE_COLON", 
			"BIND_RIGHT", "BANG", "HASH", "QUESTION", "AT", "CARET", "TILDE", "DEFINE", 
			"WS", "NEWLINE", "TAB", "COMMENT", "MULTI_LINE_COMMENT", "UID", "ID", 
			"INTEGER", "FLOAT", "CHAR", "STRING", "ARROW"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_declarations);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				decl();
				setState(65);
				declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				gendecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				funlhs();
				setState(72);
				rhs();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				pat();
				setState(75);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGendecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGendecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitGendecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GendeclContext gendecl() throws RecognitionException {
		GendeclContext _localctx = new GendeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_gendecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
			setState(80);
			match(DOUBLE_COLON);
			setState(81);
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

	public static class PatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public TerminalNode UID() { return getToken(HaskellParser.UID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitPat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatContext pat() throws RecognitionException {
		PatContext _localctx = new PatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pat);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(ID);
				}
				break;
			case UID:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(UID);
				}
				break;
			case INTEGER:
			case FLOAT:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				literal();
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

	public static class PatsContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterPats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitPats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitPats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatsContext pats() throws RecognitionException {
		PatsContext _localctx = new PatsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pats);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				pat();
				setState(89);
				pats();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				pat();
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

	public static class QvconContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public TerminalNode UID() { return getToken(HaskellParser.UID, 0); }
		public QvconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qvcon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterQvcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitQvcon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitQvcon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QvconContext qvcon() throws RecognitionException {
		QvconContext _localctx = new QvconContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_qvcon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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

	public static class FunlhsContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunlhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunlhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitFunlhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunlhsContext funlhs() throws RecognitionException {
		FunlhsContext _localctx = new FunlhsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funlhs);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(ID);
				setState(97);
				pats();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(ID);
				setState(99);
				match(LPAREN);
				setState(100);
				pats();
				setState(101);
				match(RPAREN);
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

	public static class RhsContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterRhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitRhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitRhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rhs);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(ASSIGN);
				setState(106);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(ASSIGN);
				setState(108);
				list_comprehensions();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(ASSIGN);
				setState(110);
				function_application();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(RARROW);
				setState(112);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				gdrhs();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(117);
				if_statement();
				}
				break;
			case 2:
				{
				setState(118);
				case_statement();
				}
				break;
			case 3:
				{
				setState(119);
				let_statement();
				}
				break;
			case 4:
				{
				setState(120);
				do_block();
				}
				break;
			case 5:
				{
				setState(121);
				match(ID);
				}
				break;
			case 6:
				{
				setState(122);
				literal();
				}
				break;
			case 7:
				{
				setState(123);
				function_application();
				}
				break;
			case 8:
				{
				setState(124);
				list_comprehensions();
				}
				break;
			case 9:
				{
				setState(125);
				match(MINUS);
				setState(126);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(129);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(130);
					op();
					setState(131);
					expression(3);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HaskellParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(HaskellParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(HaskellParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IF);
			setState(139);
			expression(0);
			setState(140);
			match(THEN);
			setState(141);
			expression(0);
			setState(142);
			match(ELSE);
			setState(143);
			expression(0);
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

	public static class Case_statementContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitCase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_statementContext case_statement() throws RecognitionException {
		Case_statementContext _localctx = new Case_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_case_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(CASE);
			setState(146);
			expression(0);
			setState(147);
			match(OF);
			setState(148);
			case_alternatives();
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

	public static class Case_alternativesContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCase_alternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCase_alternatives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitCase_alternatives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_alternativesContext case_alternatives() throws RecognitionException {
		Case_alternativesContext _localctx = new Case_alternativesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_case_alternatives);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				case_alternative();
				setState(151);
				case_alternatives();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				case_alternative();
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

	public static class Case_alternativeContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterCase_alternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitCase_alternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitCase_alternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_alternativeContext case_alternative() throws RecognitionException {
		Case_alternativeContext _localctx = new Case_alternativeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_case_alternative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			pat();
			setState(157);
			match(ARROW);
			setState(158);
			expression(0);
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

	public static class Do_blockContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(HaskellParser.DO, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public Do_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterDo_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitDo_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitDo_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_blockContext do_block() throws RecognitionException {
		Do_blockContext _localctx = new Do_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_do_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(DO);
			setState(161);
			stmts();
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

	public static class StmtsContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmts);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				stmt();
				setState(164);
				stmts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				stmt();
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

	public static class StmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(HaskellParser.ARROW, 0); }
		public TerminalNode ASSIGN() { return getToken(HaskellParser.ASSIGN, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(HaskellParser.DOUBLE_COLON, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public TerminalNode LET() { return getToken(HaskellParser.LET, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stmt);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				pat();
				setState(171);
				match(ARROW);
				setState(172);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				pat();
				setState(175);
				match(ASSIGN);
				setState(176);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				pat();
				setState(179);
				match(ASSIGN);
				setState(180);
				expression(0);
				setState(181);
				match(DOUBLE_COLON);
				setState(182);
				types();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(LET);
				setState(185);
				declarations();
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

	public static class GdrhsContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGdrhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGdrhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitGdrhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GdrhsContext gdrhs() throws RecognitionException {
		GdrhsContext _localctx = new GdrhsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_gdrhs);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				gd();
				setState(189);
				match(ASSIGN);
				setState(190);
				expression(0);
				setState(191);
				gdrhs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class GdContext extends ParserRuleContext {
		public TerminalNode VBAR() { return getToken(HaskellParser.VBAR, 0); }
		public Exp1Context exp1() {
			return getRuleContext(Exp1Context.class,0);
		}
		public GdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitGd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GdContext gd() throws RecognitionException {
		GdContext _localctx = new GdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_gd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(VBAR);
			setState(197);
			exp1();
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

	public static class Exp1Context extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp1Context exp1() throws RecognitionException {
		Exp1Context _localctx = new Exp1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp1);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				expression(0);
				setState(200);
				match(DOUBLE_COLON);
				setState(201);
				match(DOUBLEARROW);
				setState(202);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				expression(0);
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

	public static class TypesContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_types);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				type();
				setState(208);
				match(ARROW);
				setState(209);
				types();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				type();
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

	public static class TypeContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ARROW);
				setState(215);
				type();
				}
				break;
			case LBRACKET:
			case LPAREN:
			case UID:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				atype();
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

	public static class AtypeContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterAtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitAtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitAtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtypeContext atype() throws RecognitionException {
		AtypeContext _localctx = new AtypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atype);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(UID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(UID);
				setState(222);
				match(LPAREN);
				setState(223);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(LPAREN);
				setState(225);
				types();
				setState(226);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(228);
				match(LPAREN);
				setState(229);
				type_list();
				setState(230);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(LBRACKET);
				setState(233);
				atype();
				setState(234);
				match(RBRACKET);
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

	public static class Let_statementContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(HaskellParser.LET, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TerminalNode IN() { return getToken(HaskellParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Let_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterLet_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitLet_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitLet_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Let_statementContext let_statement() throws RecognitionException {
		Let_statementContext _localctx = new Let_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_let_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(LET);
			setState(239);
			declarations();
			setState(240);
			match(IN);
			setState(241);
			expression(0);
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

	public static class Function_applicationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HaskellParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(HaskellParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HaskellParser.RPAREN, 0); }
		public QvconContext qvcon() {
			return getRuleContext(QvconContext.class,0);
		}
		public Function_applicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_application; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterFunction_application(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitFunction_application(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitFunction_application(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_applicationContext function_application() throws RecognitionException {
		Function_applicationContext _localctx = new Function_applicationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_application);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(ID);
				setState(244);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(ID);
				setState(246);
				match(LPAREN);
				setState(247);
				args();
				setState(248);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				qvcon();
				setState(251);
				args();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				qvcon();
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

	public static class ArgsContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_args);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				expression(0);
				setState(257);
				match(COMMA);
				setState(258);
				args();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				function_application();
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

	public static class OpContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(PLUS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(MINUS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(MULT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				match(DIV);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(EQUALS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				match(NOT_EQUALS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				match(LESS_THAN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				match(GREATER_THAN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(272);
				match(LESS_THAN_EQUAL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(273);
				match(GREATER_THAN_EQUAL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(274);
				match(AND);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(275);
				match(OR);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(276);
				match(COLON);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(277);
				match(CONCAT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(278);
				match(RARROW);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(279);
				match(BACKTICK);
				setState(280);
				match(ID);
				setState(281);
				match(BACKTICK);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(282);
				match(BACKTICK);
				setState(283);
				match(UID);
				setState(284);
				match(BACKTICK);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(HaskellParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(HaskellParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(HaskellParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(HaskellParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (INTEGER - 99)) | (1L << (FLOAT - 99)) | (1L << (CHAR - 99)) | (1L << (STRING - 99)))) != 0)) ) {
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

	public static class Type_listContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterType_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitType_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitType_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_listContext type_list() throws RecognitionException {
		Type_listContext _localctx = new Type_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type_list);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				type();
				setState(290);
				match(COMMA);
				setState(291);
				type_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				type();
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

	public static class List_comprehensionsContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterList_comprehensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitList_comprehensions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitList_comprehensions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_comprehensionsContext list_comprehensions() throws RecognitionException {
		List_comprehensionsContext _localctx = new List_comprehensionsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_list_comprehensions);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(LPAREN);
				setState(297);
				exps();
				setState(298);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(LBRACKET);
				setState(301);
				exps();
				setState(302);
				match(RBRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(LBRACKET);
				setState(305);
				expression(0);
				setState(306);
				match(RANGE);
				setState(307);
				match(RBRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				match(LBRACKET);
				setState(310);
				match(RBRACKET);
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

	public static class GensContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitGens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GensContext gens() throws RecognitionException {
		GensContext _localctx = new GensContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_gens);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				gen();
				setState(314);
				match(COMMA);
				setState(315);
				gens();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				gen();
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

	public static class GenContext extends ParserRuleContext {
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(HaskellParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LET() { return getToken(HaskellParser.LET, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public GenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterGen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitGen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitGen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenContext gen() throws RecognitionException {
		GenContext _localctx = new GenContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_gen);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				pat();
				setState(321);
				match(ARROW);
				setState(322);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(LET);
				setState(325);
				declarations();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				expression(0);
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

	public static class ExpsContext extends ParserRuleContext {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).enterExps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellListener ) ((HaskellListener)listener).exitExps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellVisitor ) return ((HaskellVisitor<? extends T>)visitor).visitExps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exps);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				expression(0);
				setState(330);
				match(COMMA);
				setState(331);
				exps();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				expression(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
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
		"\u0004\u0001g\u0151\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000E\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001N\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003W\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004]\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"h\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007s\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0080\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u0086\b\b\n\b\f\b\u0089\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009b\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00a8\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00bb\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c3"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ce\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00d5"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00da\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u00ed\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u00ff\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0107\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u011e\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0127\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0138\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u013f\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0148\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u014f\b\u001f\u0001\u001f\u0000\u0001\u0010 "+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>\u0000\u0002\u0001\u0000ab\u0001\u0000cf"+
		"\u0170\u0000D\u0001\u0000\u0000\u0000\u0002M\u0001\u0000\u0000\u0000\u0004"+
		"O\u0001\u0000\u0000\u0000\u0006V\u0001\u0000\u0000\u0000\b\\\u0001\u0000"+
		"\u0000\u0000\n^\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000\u000e"+
		"r\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000\u0000\u0000\u0012\u008a"+
		"\u0001\u0000\u0000\u0000\u0014\u0091\u0001\u0000\u0000\u0000\u0016\u009a"+
		"\u0001\u0000\u0000\u0000\u0018\u009c\u0001\u0000\u0000\u0000\u001a\u00a0"+
		"\u0001\u0000\u0000\u0000\u001c\u00a7\u0001\u0000\u0000\u0000\u001e\u00ba"+
		"\u0001\u0000\u0000\u0000 \u00c2\u0001\u0000\u0000\u0000\"\u00c4\u0001"+
		"\u0000\u0000\u0000$\u00cd\u0001\u0000\u0000\u0000&\u00d4\u0001\u0000\u0000"+
		"\u0000(\u00d9\u0001\u0000\u0000\u0000*\u00ec\u0001\u0000\u0000\u0000,"+
		"\u00ee\u0001\u0000\u0000\u0000.\u00fe\u0001\u0000\u0000\u00000\u0106\u0001"+
		"\u0000\u0000\u00002\u011d\u0001\u0000\u0000\u00004\u011f\u0001\u0000\u0000"+
		"\u00006\u0126\u0001\u0000\u0000\u00008\u0137\u0001\u0000\u0000\u0000:"+
		"\u013e\u0001\u0000\u0000\u0000<\u0147\u0001\u0000\u0000\u0000>\u014e\u0001"+
		"\u0000\u0000\u0000@A\u0003\u0002\u0001\u0000AB\u0003\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CE\u0003\u0002\u0001\u0000D@\u0001\u0000\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000E\u0001\u0001\u0000\u0000\u0000FN\u0003"+
		"\u0004\u0002\u0000GH\u0003\f\u0006\u0000HI\u0003\u000e\u0007\u0000IN\u0001"+
		"\u0000\u0000\u0000JK\u0003\u0006\u0003\u0000KL\u0003\u000e\u0007\u0000"+
		"LN\u0001\u0000\u0000\u0000MF\u0001\u0000\u0000\u0000MG\u0001\u0000\u0000"+
		"\u0000MJ\u0001\u0000\u0000\u0000N\u0003\u0001\u0000\u0000\u0000OP\u0005"+
		"b\u0000\u0000PQ\u0005S\u0000\u0000QR\u0003&\u0013\u0000R\u0005\u0001\u0000"+
		"\u0000\u0000SW\u0005b\u0000\u0000TW\u0005a\u0000\u0000UW\u00034\u001a"+
		"\u0000VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000W\u0007\u0001\u0000\u0000\u0000XY\u0003\u0006\u0003\u0000"+
		"YZ\u0003\b\u0004\u0000Z]\u0001\u0000\u0000\u0000[]\u0003\u0006\u0003\u0000"+
		"\\X\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\t\u0001\u0000"+
		"\u0000\u0000^_\u0007\u0000\u0000\u0000_\u000b\u0001\u0000\u0000\u0000"+
		"`a\u0005b\u0000\u0000ah\u0003\b\u0004\u0000bc\u0005b\u0000\u0000cd\u0005"+
		"J\u0000\u0000de\u0003\b\u0004\u0000ef\u0005K\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000g`\u0001\u0000\u0000\u0000gb\u0001\u0000\u0000\u0000h\r\u0001"+
		"\u0000\u0000\u0000ij\u0005A\u0000\u0000js\u0003\u0010\b\u0000kl\u0005"+
		"A\u0000\u0000ls\u00038\u001c\u0000mn\u0005A\u0000\u0000ns\u0003.\u0017"+
		"\u0000op\u0005R\u0000\u0000ps\u0003\u0010\b\u0000qs\u0003 \u0010\u0000"+
		"ri\u0001\u0000\u0000\u0000rk\u0001\u0000\u0000\u0000rm\u0001\u0000\u0000"+
		"\u0000ro\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u000f\u0001"+
		"\u0000\u0000\u0000tu\u0006\b\uffff\uffff\u0000u\u0080\u0003\u0012\t\u0000"+
		"v\u0080\u0003\u0014\n\u0000w\u0080\u0003,\u0016\u0000x\u0080\u0003\u001a"+
		"\r\u0000y\u0080\u0005b\u0000\u0000z\u0080\u00034\u001a\u0000{\u0080\u0003"+
		".\u0017\u0000|\u0080\u00038\u001c\u0000}~\u00051\u0000\u0000~\u0080\u0003"+
		"\u0010\b\u0001\u007ft\u0001\u0000\u0000\u0000\u007fv\u0001\u0000\u0000"+
		"\u0000\u007fw\u0001\u0000\u0000\u0000\u007fx\u0001\u0000\u0000\u0000\u007f"+
		"y\u0001\u0000\u0000\u0000\u007fz\u0001\u0000\u0000\u0000\u007f{\u0001"+
		"\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0087\u0001\u0000\u0000\u0000\u0081\u0082\n\u0002\u0000\u0000"+
		"\u0082\u0083\u00032\u0019\u0000\u0083\u0084\u0003\u0010\b\u0003\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u0011\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0007\u0000\u0000\u008b"+
		"\u008c\u0003\u0010\b\u0000\u008c\u008d\u0005\u0011\u0000\u0000\u008d\u008e"+
		"\u0003\u0010\b\u0000\u008e\u008f\u0005\u0005\u0000\u0000\u008f\u0090\u0003"+
		"\u0010\b\u0000\u0090\u0013\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0002"+
		"\u0000\u0000\u0092\u0093\u0003\u0010\b\u0000\u0093\u0094\u0005\u000f\u0000"+
		"\u0000\u0094\u0095\u0003\u0016\u000b\u0000\u0095\u0015\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0003\u0018\f\u0000\u0097\u0098\u0003\u0016\u000b\u0000"+
		"\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u0018\f\u0000\u009a"+
		"\u0096\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u0017\u0001\u0000\u0000\u0000\u009c\u009d\u0003\u0006\u0003\u0000\u009d"+
		"\u009e\u0005g\u0000\u0000\u009e\u009f\u0003\u0010\b\u0000\u009f\u0019"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0004\u0000\u0000\u00a1\u00a2"+
		"\u0003\u001c\u000e\u0000\u00a2\u001b\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0003\u001e\u000f\u0000\u00a4\u00a5\u0003\u001c\u000e\u0000\u00a5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a8\u0003\u001e\u000f\u0000\u00a7\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u001d"+
		"\u0001\u0000\u0000\u0000\u00a9\u00bb\u0003\u0010\b\u0000\u00aa\u00ab\u0003"+
		"\u0006\u0003\u0000\u00ab\u00ac\u0005g\u0000\u0000\u00ac\u00ad\u0003\u0010"+
		"\b\u0000\u00ad\u00bb\u0001\u0000\u0000\u0000\u00ae\u00af\u0003\u0006\u0003"+
		"\u0000\u00af\u00b0\u0005A\u0000\u0000\u00b0\u00b1\u0003\u0010\b\u0000"+
		"\u00b1\u00bb\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003\u0006\u0003\u0000"+
		"\u00b3\u00b4\u0005A\u0000\u0000\u00b4\u00b5\u0003\u0010\b\u0000\u00b5"+
		"\u00b6\u0005S\u0000\u0000\u00b6\u00b7\u0003&\u0013\u0000\u00b7\u00bb\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0005\r\u0000\u0000\u00b9\u00bb\u0003\u0000"+
		"\u0000\u0000\u00ba\u00a9\u0001\u0000\u0000\u0000\u00ba\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ba\u00ae\u0001\u0000\u0000\u0000\u00ba\u00b2\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u001f\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0003\"\u0011\u0000\u00bd\u00be\u0005A\u0000"+
		"\u0000\u00be\u00bf\u0003\u0010\b\u0000\u00bf\u00c0\u0003 \u0010\u0000"+
		"\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c2\u00bc\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3!\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005?\u0000\u0000\u00c5\u00c6"+
		"\u0003$\u0012\u0000\u00c6#\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003\u0010"+
		"\b\u0000\u00c8\u00c9\u0005S\u0000\u0000\u00c9\u00ca\u0005Q\u0000\u0000"+
		"\u00ca\u00cb\u0003(\u0014\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0003\u0010\b\u0000\u00cd\u00c7\u0001\u0000\u0000\u0000\u00cd\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ce%\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003"+
		"(\u0014\u0000\u00d0\u00d1\u0005g\u0000\u0000\u00d1\u00d2\u0003&\u0013"+
		"\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d5\u0003(\u0014\u0000"+
		"\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\'\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005g\u0000\u0000\u00d7"+
		"\u00da\u0003(\u0014\u0000\u00d8\u00da\u0003*\u0015\u0000\u00d9\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da)\u0001\u0000"+
		"\u0000\u0000\u00db\u00ed\u0005a\u0000\u0000\u00dc\u00ed\u0005b\u0000\u0000"+
		"\u00dd\u00de\u0005a\u0000\u0000\u00de\u00df\u0005J\u0000\u0000\u00df\u00ed"+
		"\u0005K\u0000\u0000\u00e0\u00e1\u0005J\u0000\u0000\u00e1\u00e2\u0003&"+
		"\u0013\u0000\u00e2\u00e3\u0005K\u0000\u0000\u00e3\u00ed\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0005J\u0000\u0000\u00e5\u00e6\u00036\u001b\u0000\u00e6"+
		"\u00e7\u0005K\u0000\u0000\u00e7\u00ed\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005F\u0000\u0000\u00e9\u00ea\u0003*\u0015\u0000\u00ea\u00eb\u0005G"+
		"\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00db\u0001\u0000"+
		"\u0000\u0000\u00ec\u00dc\u0001\u0000\u0000\u0000\u00ec\u00dd\u0001\u0000"+
		"\u0000\u0000\u00ec\u00e0\u0001\u0000\u0000\u0000\u00ec\u00e4\u0001\u0000"+
		"\u0000\u0000\u00ec\u00e8\u0001\u0000\u0000\u0000\u00ed+\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0005\r\u0000\u0000\u00ef\u00f0\u0003\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0005\t\u0000\u0000\u00f1\u00f2\u0003\u0010\b\u0000\u00f2"+
		"-\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005b\u0000\u0000\u00f4\u00ff\u0003"+
		"0\u0018\u0000\u00f5\u00f6\u0005b\u0000\u0000\u00f6\u00f7\u0005J\u0000"+
		"\u0000\u00f7\u00f8\u00030\u0018\u0000\u00f8\u00f9\u0005K\u0000\u0000\u00f9"+
		"\u00ff\u0001\u0000\u0000\u0000\u00fa\u00fb\u0003\n\u0005\u0000\u00fb\u00fc"+
		"\u00030\u0018\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00ff\u0003"+
		"\n\u0005\u0000\u00fe\u00f3\u0001\u0000\u0000\u0000\u00fe\u00f5\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff/\u0001\u0000\u0000\u0000\u0100\u0101\u0003\u0010\b"+
		"\u0000\u0101\u0102\u0005L\u0000\u0000\u0102\u0103\u00030\u0018\u0000\u0103"+
		"\u0107\u0001\u0000\u0000\u0000\u0104\u0107\u0003\u0010\b\u0000\u0105\u0107"+
		"\u0003.\u0017\u0000\u0106\u0100\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u01071\u0001\u0000"+
		"\u0000\u0000\u0108\u011e\u00050\u0000\u0000\u0109\u011e\u00051\u0000\u0000"+
		"\u010a\u011e\u00052\u0000\u0000\u010b\u011e\u00053\u0000\u0000\u010c\u011e"+
		"\u00055\u0000\u0000\u010d\u011e\u00056\u0000\u0000\u010e\u011e\u00057"+
		"\u0000\u0000\u010f\u011e\u00058\u0000\u0000\u0110\u011e\u00059\u0000\u0000"+
		"\u0111\u011e\u0005:\u0000\u0000\u0112\u011e\u0005;\u0000\u0000\u0113\u011e"+
		"\u0005<\u0000\u0000\u0114\u011e\u0005C\u0000\u0000\u0115\u011e\u0005D"+
		"\u0000\u0000\u0116\u011e\u0005R\u0000\u0000\u0117\u0118\u0005M\u0000\u0000"+
		"\u0118\u0119\u0005b\u0000\u0000\u0119\u011e\u0005M\u0000\u0000\u011a\u011b"+
		"\u0005M\u0000\u0000\u011b\u011c\u0005a\u0000\u0000\u011c\u011e\u0005M"+
		"\u0000\u0000\u011d\u0108\u0001\u0000\u0000\u0000\u011d\u0109\u0001\u0000"+
		"\u0000\u0000\u011d\u010a\u0001\u0000\u0000\u0000\u011d\u010b\u0001\u0000"+
		"\u0000\u0000\u011d\u010c\u0001\u0000\u0000\u0000\u011d\u010d\u0001\u0000"+
		"\u0000\u0000\u011d\u010e\u0001\u0000\u0000\u0000\u011d\u010f\u0001\u0000"+
		"\u0000\u0000\u011d\u0110\u0001\u0000\u0000\u0000\u011d\u0111\u0001\u0000"+
		"\u0000\u0000\u011d\u0112\u0001\u0000\u0000\u0000\u011d\u0113\u0001\u0000"+
		"\u0000\u0000\u011d\u0114\u0001\u0000\u0000\u0000\u011d\u0115\u0001\u0000"+
		"\u0000\u0000\u011d\u0116\u0001\u0000\u0000\u0000\u011d\u0117\u0001\u0000"+
		"\u0000\u0000\u011d\u011a\u0001\u0000\u0000\u0000\u011e3\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0007\u0001\u0000\u0000\u01205\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0003(\u0014\u0000\u0122\u0123\u0005L\u0000\u0000\u0123\u0124"+
		"\u00036\u001b\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0127\u0003"+
		"(\u0014\u0000\u0126\u0121\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000"+
		"\u0000\u0000\u01277\u0001\u0000\u0000\u0000\u0128\u0129\u0005J\u0000\u0000"+
		"\u0129\u012a\u0003>\u001f\u0000\u012a\u012b\u0005K\u0000\u0000\u012b\u0138"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0005F\u0000\u0000\u012d\u012e\u0003"+
		">\u001f\u0000\u012e\u012f\u0005G\u0000\u0000\u012f\u0138\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0005F\u0000\u0000\u0131\u0132\u0003\u0010\b\u0000"+
		"\u0132\u0133\u0005H\u0000\u0000\u0133\u0134\u0005G\u0000\u0000\u0134\u0138"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0005F\u0000\u0000\u0136\u0138\u0005"+
		"G\u0000\u0000\u0137\u0128\u0001\u0000\u0000\u0000\u0137\u012c\u0001\u0000"+
		"\u0000\u0000\u0137\u0130\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000"+
		"\u0000\u0000\u01389\u0001\u0000\u0000\u0000\u0139\u013a\u0003<\u001e\u0000"+
		"\u013a\u013b\u0005L\u0000\u0000\u013b\u013c\u0003:\u001d\u0000\u013c\u013f"+
		"\u0001\u0000\u0000\u0000\u013d\u013f\u0003<\u001e\u0000\u013e\u0139\u0001"+
		"\u0000\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f;\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0003\u0006\u0003\u0000\u0141\u0142\u0005g\u0000"+
		"\u0000\u0142\u0143\u0003\u0010\b\u0000\u0143\u0148\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005\r\u0000\u0000\u0145\u0148\u0003\u0000\u0000\u0000\u0146"+
		"\u0148\u0003\u0010\b\u0000\u0147\u0140\u0001\u0000\u0000\u0000\u0147\u0144"+
		"\u0001\u0000\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148=\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0003\u0010\b\u0000\u014a\u014b\u0005L"+
		"\u0000\u0000\u014b\u014c\u0003>\u001f\u0000\u014c\u014f\u0001\u0000\u0000"+
		"\u0000\u014d\u014f\u0003\u0010\b\u0000\u014e\u0149\u0001\u0000\u0000\u0000"+
		"\u014e\u014d\u0001\u0000\u0000\u0000\u014f?\u0001\u0000\u0000\u0000\u0018"+
		"DMV\\gr\u007f\u0087\u009a\u00a7\u00ba\u00c2\u00cd\u00d4\u00d9\u00ec\u00fe"+
		"\u0106\u011d\u0126\u0137\u013e\u0147\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}