// Generated from satisfaction.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link satisfactionParser}.
 */
public interface satisfactionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link satisfactionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull satisfactionParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link satisfactionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull satisfactionParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link satisfactionParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull satisfactionParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link satisfactionParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull satisfactionParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link satisfactionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull satisfactionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link satisfactionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull satisfactionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link satisfactionParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(@NotNull satisfactionParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link satisfactionParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(@NotNull satisfactionParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link satisfactionParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(@NotNull satisfactionParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link satisfactionParser#orExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(@NotNull satisfactionParser.OrExpressionContext ctx);
}