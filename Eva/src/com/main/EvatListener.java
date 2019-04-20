// Generated from Evat.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EvatParser}.
 */
public interface EvatListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EvatParser#eva}.
	 * @param ctx the parse tree
	 */
	void enterEva(EvatParser.EvaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#eva}.
	 * @param ctx the parse tree
	 */
	void exitEva(EvatParser.EvaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvatParser#tagDeclar}.
	 * @param ctx the parse tree
	 */
	void enterTagDeclar(EvatParser.TagDeclarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#tagDeclar}.
	 * @param ctx the parse tree
	 */
	void exitTagDeclar(EvatParser.TagDeclarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvatParser#tagContentCompact}.
	 * @param ctx the parse tree
	 */
	void enterTagContentCompact(EvatParser.TagContentCompactContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#tagContentCompact}.
	 * @param ctx the parse tree
	 */
	void exitTagContentCompact(EvatParser.TagContentCompactContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvatParser#tagContent}.
	 * @param ctx the parse tree
	 */
	void enterTagContent(EvatParser.TagContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#tagContent}.
	 * @param ctx the parse tree
	 */
	void exitTagContent(EvatParser.TagContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvatParser#tagAttributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTagAttributeDeclaration(EvatParser.TagAttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#tagAttributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTagAttributeDeclaration(EvatParser.TagAttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvatParser#tagAttributes}.
	 * @param ctx the parse tree
	 */
	void enterTagAttributes(EvatParser.TagAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#tagAttributes}.
	 * @param ctx the parse tree
	 */
	void exitTagAttributes(EvatParser.TagAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvatParser#tagAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTagAttribute(EvatParser.TagAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#tagAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTagAttribute(EvatParser.TagAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvatParser#tagScope}.
	 * @param ctx the parse tree
	 */
	void enterTagScope(EvatParser.TagScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#tagScope}.
	 * @param ctx the parse tree
	 */
	void exitTagScope(EvatParser.TagScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvatParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(EvatParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(EvatParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvatParser#tagAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterTagAttributeName(EvatParser.TagAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#tagAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitTagAttributeName(EvatParser.TagAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvatParser#tagText}.
	 * @param ctx the parse tree
	 */
	void enterTagText(EvatParser.TagTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#tagText}.
	 * @param ctx the parse tree
	 */
	void exitTagText(EvatParser.TagTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvatParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(EvatParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(EvatParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvatParser#evaComment}.
	 * @param ctx the parse tree
	 */
	void enterEvaComment(EvatParser.EvaCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvatParser#evaComment}.
	 * @param ctx the parse tree
	 */
	void exitEvaComment(EvatParser.EvaCommentContext ctx);
}