// Generated from Haskell.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HaskellParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HaskellVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HaskellParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(HaskellParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(HaskellParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gendecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGendecl(HaskellParser.GendeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPat(HaskellParser.PatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPats(HaskellParser.PatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qvcon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQvcon(HaskellParser.QvconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#funlhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunlhs(HaskellParser.FunlhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(HaskellParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HaskellParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(HaskellParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(HaskellParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#case_alternatives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_alternatives(HaskellParser.Case_alternativesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#case_alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_alternative(HaskellParser.Case_alternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#do_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_block(HaskellParser.Do_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(HaskellParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HaskellParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gdrhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGdrhs(HaskellParser.GdrhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGd(HaskellParser.GdContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#exp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp1(HaskellParser.Exp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(HaskellParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HaskellParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#atype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtype(HaskellParser.AtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#let_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_statement(HaskellParser.Let_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#function_application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_application(HaskellParser.Function_applicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(HaskellParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(HaskellParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(HaskellParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_list(HaskellParser.Type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#list_comprehensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_comprehensions(HaskellParser.List_comprehensionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGens(HaskellParser.GensContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGen(HaskellParser.GenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#exps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExps(HaskellParser.ExpsContext ctx);
}