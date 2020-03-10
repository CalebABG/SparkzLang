// Generated from C:/Users/flame/Documents/GitHub/SparkzLang/Sparkz/src\SparkzParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SparkzParser}.
 */
public interface SparkzParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SparkzParser#sparkz}.
	 * @param ctx the parse tree
	 */
	void enterSparkz(SparkzParser.SparkzContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#sparkz}.
	 * @param ctx the parse tree
	 */
	void exitSparkz(SparkzParser.SparkzContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalElement}
	 * labeled alternative in {@link SparkzParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(SparkzParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalElement}
	 * labeled alternative in {@link SparkzParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(SparkzParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compactElement}
	 * labeled alternative in {@link SparkzParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompactElement(SparkzParser.CompactElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compactElement}
	 * labeled alternative in {@link SparkzParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompactElement(SparkzParser.CompactElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compactExtElement}
	 * labeled alternative in {@link SparkzParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompactExtElement(SparkzParser.CompactExtElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compactExtElement}
	 * labeled alternative in {@link SparkzParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompactExtElement(SparkzParser.CompactExtElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementCompactDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementCompactDeclaration(SparkzParser.ElementCompactDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementCompactDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementCompactDeclaration(SparkzParser.ElementCompactDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementCompactContentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementCompactContentDeclaration(SparkzParser.ElementCompactContentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementCompactContentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementCompactContentDeclaration(SparkzParser.ElementCompactContentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementCompactStringDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementCompactStringDeclaration(SparkzParser.ElementCompactStringDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementCompactStringDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementCompactStringDeclaration(SparkzParser.ElementCompactStringDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementCompactContent}.
	 * @param ctx the parse tree
	 */
	void enterElementCompactContent(SparkzParser.ElementCompactContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementCompactContent}.
	 * @param ctx the parse tree
	 */
	void exitElementCompactContent(SparkzParser.ElementCompactContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementNormalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementNormalDeclaration(SparkzParser.ElementNormalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementNormalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementNormalDeclaration(SparkzParser.ElementNormalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementBody}.
	 * @param ctx the parse tree
	 */
	void enterElementBody(SparkzParser.ElementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementBody}.
	 * @param ctx the parse tree
	 */
	void exitElementBody(SparkzParser.ElementBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementBodyContent}.
	 * @param ctx the parse tree
	 */
	void enterElementBodyContent(SparkzParser.ElementBodyContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementBodyContent}.
	 * @param ctx the parse tree
	 */
	void exitElementBodyContent(SparkzParser.ElementBodyContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementBodyText}.
	 * @param ctx the parse tree
	 */
	void enterElementBodyText(SparkzParser.ElementBodyTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementBodyText}.
	 * @param ctx the parse tree
	 */
	void exitElementBodyText(SparkzParser.ElementBodyTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementBodyProperty}.
	 * @param ctx the parse tree
	 */
	void enterElementBodyProperty(SparkzParser.ElementBodyPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementBodyProperty}.
	 * @param ctx the parse tree
	 */
	void exitElementBodyProperty(SparkzParser.ElementBodyPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementAttributeListDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementAttributeListDeclaration(SparkzParser.ElementAttributeListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementAttributeListDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementAttributeListDeclaration(SparkzParser.ElementAttributeListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementAttributes}.
	 * @param ctx the parse tree
	 */
	void enterElementAttributes(SparkzParser.ElementAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementAttributes}.
	 * @param ctx the parse tree
	 */
	void exitElementAttributes(SparkzParser.ElementAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementAttribute}.
	 * @param ctx the parse tree
	 */
	void enterElementAttribute(SparkzParser.ElementAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementAttribute}.
	 * @param ctx the parse tree
	 */
	void exitElementAttribute(SparkzParser.ElementAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterElementAttributeName(SparkzParser.ElementAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitElementAttributeName(SparkzParser.ElementAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterElementAttributeValue(SparkzParser.ElementAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitElementAttributeValue(SparkzParser.ElementAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#elementName}.
	 * @param ctx the parse tree
	 */
	void enterElementName(SparkzParser.ElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#elementName}.
	 * @param ctx the parse tree
	 */
	void exitElementName(SparkzParser.ElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkzParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(SparkzParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkzParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(SparkzParser.StringContext ctx);
}