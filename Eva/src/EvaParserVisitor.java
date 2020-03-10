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
	 * Visit a parse tree produced by {@link EvaParser#elementCompactStringDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCompactStringDeclaration(EvaParser.ElementCompactStringDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementCompactContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCompactContent(EvaParser.ElementCompactContentContext ctx);
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
	 * Visit a parse tree produced by {@link EvaParser#elementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementBody(EvaParser.ElementBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementAttributeListDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttributeListDeclaration(EvaParser.ElementAttributeListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttributes(EvaParser.ElementAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttribute(EvaParser.ElementAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementAttributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttributeName(EvaParser.ElementAttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttributeValue(EvaParser.ElementAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#elementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementName(EvaParser.ElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EvaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(EvaParser.StringContext ctx);
}