// Generated from Haskell.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HaskellParser}.
 */
public interface HaskellListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HaskellParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(HaskellParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(HaskellParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(HaskellParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(HaskellParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gendecl}.
	 * @param ctx the parse tree
	 */
	void enterGendecl(HaskellParser.GendeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gendecl}.
	 * @param ctx the parse tree
	 */
	void exitGendecl(HaskellParser.GendeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterPat(HaskellParser.PatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitPat(HaskellParser.PatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#pats}.
	 * @param ctx the parse tree
	 */
	void enterPats(HaskellParser.PatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#pats}.
	 * @param ctx the parse tree
	 */
	void exitPats(HaskellParser.PatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qvcon}.
	 * @param ctx the parse tree
	 */
	void enterQvcon(HaskellParser.QvconContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qvcon}.
	 * @param ctx the parse tree
	 */
	void exitQvcon(HaskellParser.QvconContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#funlhs}.
	 * @param ctx the parse tree
	 */
	void enterFunlhs(HaskellParser.FunlhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#funlhs}.
	 * @param ctx the parse tree
	 */
	void exitFunlhs(HaskellParser.FunlhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(HaskellParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(HaskellParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HaskellParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HaskellParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(HaskellParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(HaskellParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(HaskellParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(HaskellParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#case_alternatives}.
	 * @param ctx the parse tree
	 */
	void enterCase_alternatives(HaskellParser.Case_alternativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#case_alternatives}.
	 * @param ctx the parse tree
	 */
	void exitCase_alternatives(HaskellParser.Case_alternativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#case_alternative}.
	 * @param ctx the parse tree
	 */
	void enterCase_alternative(HaskellParser.Case_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#case_alternative}.
	 * @param ctx the parse tree
	 */
	void exitCase_alternative(HaskellParser.Case_alternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#do_block}.
	 * @param ctx the parse tree
	 */
	void enterDo_block(HaskellParser.Do_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#do_block}.
	 * @param ctx the parse tree
	 */
	void exitDo_block(HaskellParser.Do_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(HaskellParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(HaskellParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(HaskellParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(HaskellParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gdrhs}.
	 * @param ctx the parse tree
	 */
	void enterGdrhs(HaskellParser.GdrhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gdrhs}.
	 * @param ctx the parse tree
	 */
	void exitGdrhs(HaskellParser.GdrhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gd}.
	 * @param ctx the parse tree
	 */
	void enterGd(HaskellParser.GdContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gd}.
	 * @param ctx the parse tree
	 */
	void exitGd(HaskellParser.GdContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(HaskellParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(HaskellParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(HaskellParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(HaskellParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HaskellParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HaskellParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#atype}.
	 * @param ctx the parse tree
	 */
	void enterAtype(HaskellParser.AtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#atype}.
	 * @param ctx the parse tree
	 */
	void exitAtype(HaskellParser.AtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#let_statement}.
	 * @param ctx the parse tree
	 */
	void enterLet_statement(HaskellParser.Let_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#let_statement}.
	 * @param ctx the parse tree
	 */
	void exitLet_statement(HaskellParser.Let_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#function_application}.
	 * @param ctx the parse tree
	 */
	void enterFunction_application(HaskellParser.Function_applicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#function_application}.
	 * @param ctx the parse tree
	 */
	void exitFunction_application(HaskellParser.Function_applicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(HaskellParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(HaskellParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(HaskellParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(HaskellParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HaskellParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HaskellParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#type_list}.
	 * @param ctx the parse tree
	 */
	void enterType_list(HaskellParser.Type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#type_list}.
	 * @param ctx the parse tree
	 */
	void exitType_list(HaskellParser.Type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#list_comprehensions}.
	 * @param ctx the parse tree
	 */
	void enterList_comprehensions(HaskellParser.List_comprehensionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#list_comprehensions}.
	 * @param ctx the parse tree
	 */
	void exitList_comprehensions(HaskellParser.List_comprehensionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gens}.
	 * @param ctx the parse tree
	 */
	void enterGens(HaskellParser.GensContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gens}.
	 * @param ctx the parse tree
	 */
	void exitGens(HaskellParser.GensContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gen}.
	 * @param ctx the parse tree
	 */
	void enterGen(HaskellParser.GenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gen}.
	 * @param ctx the parse tree
	 */
	void exitGen(HaskellParser.GenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#exps}.
	 * @param ctx the parse tree
	 */
	void enterExps(HaskellParser.ExpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#exps}.
	 * @param ctx the parse tree
	 */
	void exitExps(HaskellParser.ExpsContext ctx);
}