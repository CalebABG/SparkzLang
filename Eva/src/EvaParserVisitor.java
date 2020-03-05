// Generated from C:/Users/flame/Documents/GitHub/Eva-ElegantMarkup/Eva/src\EvaParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EvaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EvaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EvaParser#eva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEva(EvaParser.EvaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalElementDeclaration}
	 * labeled alternative in {@link EvaParser#elementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElementDeclaration(EvaParser.NormalElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compactElementDeclaration}
	 * labeled alternative in {@link EvaParser#elementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompactElementDeclaration(EvaParser.CompactElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compactElementContentDeclaration}
	 * labeled alternative in {@link EvaParser#elementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompactElementContentDeclaration(EvaParser.CompactElementContentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementNormalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementNormalDeclaration(EvaParser.ElementNormalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementCompactDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCompactDeclaration(EvaParser.ElementCompactDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementCompactContentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCompactContentDeclaration(EvaParser.ElementCompactContentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#tagContentCompact}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagContentCompact(EvaParser.TagContentCompactContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementBodyContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementBodyContent(EvaParser.ElementBodyContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementBodyText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementBodyText(EvaParser.ElementBodyTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementBodyProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementBodyProperty(EvaParser.ElementBodyPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#tagAttributeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagAttributeDeclaration(EvaParser.TagAttributeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#tagAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagAttributeList(EvaParser.TagAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#tagAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagAttribute(EvaParser.TagAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#tagAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagAttributeValue(EvaParser.TagAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementBody(EvaParser.ElementBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#tagAttributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagAttributeName(EvaParser.TagAttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(EvaParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(EvaParser.TagNameContext ctx);
}