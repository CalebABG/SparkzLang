// Generated from C:/Users/flame/Documents/GitHub/SparkzLang/Sparkz/src\SparkzParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SparkzParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SparkzParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SparkzParser#sparkz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparkz(SparkzParser.SparkzContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalElement}
	 * labeled alternative in {@link SparkzParser#elementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(SparkzParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compactElement}
	 * labeled alternative in {@link SparkzParser#elementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompactElement(SparkzParser.CompactElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compactExtElement}
	 * labeled alternative in {@link SparkzParser#elementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompactExtElement(SparkzParser.CompactExtElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementCompactDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCompactDeclaration(SparkzParser.ElementCompactDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementCompactContentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCompactContentDeclaration(SparkzParser.ElementCompactContentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementCompactStringDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCompactStringDeclaration(SparkzParser.ElementCompactStringDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementCompactContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementCompactContent(SparkzParser.ElementCompactContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementNormalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementNormalDeclaration(SparkzParser.ElementNormalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementBody(SparkzParser.ElementBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementBodyContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementBodyContent(SparkzParser.ElementBodyContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementBodyPropertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementBodyPropertyDeclaration(SparkzParser.ElementBodyPropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementAttributeListDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttributeListDeclaration(SparkzParser.ElementAttributeListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttributes(SparkzParser.ElementAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttribute(SparkzParser.ElementAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementAttributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttributeName(SparkzParser.ElementAttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementAttributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAttributeValue(SparkzParser.ElementAttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#elementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementName(SparkzParser.ElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkzParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SparkzParser.StringContext ctx);
}