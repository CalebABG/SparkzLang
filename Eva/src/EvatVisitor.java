// Generated from C:/Users/Caleb/IdeaProjects/Eva(Elegant HTML Lang)/Eva/src\Evat.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EvatParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EvatVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EvatParser#eva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEva(EvatParser.EvaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvatParser#tagDeclar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagDeclar(EvatParser.TagDeclarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvatParser#tagContentCompact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagContentCompact(EvatParser.TagContentCompactContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvatParser#tagContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagContent(EvatParser.TagContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvatParser#tagAttributeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagAttributeDeclaration(EvatParser.TagAttributeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvatParser#tagAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagAttributes(EvatParser.TagAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvatParser#tagAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagAttribute(EvatParser.TagAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvatParser#tagAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagAttributeValue(EvatParser.TagAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvatParser#tagScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagScope(EvatParser.TagScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvatParser#tagAttributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagAttributeName(EvatParser.TagAttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvatParser#tagText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagText(EvatParser.TagTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvatParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(EvatParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvatParser#evaComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaComment(EvatParser.EvaCommentContext ctx);
}