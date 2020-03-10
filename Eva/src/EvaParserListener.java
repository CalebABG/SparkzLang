// Generated from C:/Users/flame/Documents/GitHub/Eva-ElegantMarkup/Eva/src\EvaParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EvaParser}.
 */
public interface EvaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EvaParser#eva}.
	 * @param ctx the parse tree
	 */
	void enterEva(EvaParser.EvaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#eva}.
	 * @param ctx the parse tree
	 */
	void exitEva(EvaParser.EvaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalElementDeclaration}
	 * labeled alternative in {@link EvaParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalElementDeclaration(EvaParser.NormalElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalElementDeclaration}
	 * labeled alternative in {@link EvaParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalElementDeclaration(EvaParser.NormalElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compactElementDeclaration}
	 * labeled alternative in {@link EvaParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompactElementDeclaration(EvaParser.CompactElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compactElementDeclaration}
	 * labeled alternative in {@link EvaParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompactElementDeclaration(EvaParser.CompactElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compactElementContentDeclaration}
	 * labeled alternative in {@link EvaParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompactElementContentDeclaration(EvaParser.CompactElementContentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compactElementContentDeclaration}
	 * labeled alternative in {@link EvaParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompactElementContentDeclaration(EvaParser.CompactElementContentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementNormalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementNormalDeclaration(EvaParser.ElementNormalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementNormalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementNormalDeclaration(EvaParser.ElementNormalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementCompactDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementCompactDeclaration(EvaParser.ElementCompactDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementCompactDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementCompactDeclaration(EvaParser.ElementCompactDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementCompactContentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementCompactContentDeclaration(EvaParser.ElementCompactContentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementCompactContentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementCompactContentDeclaration(EvaParser.ElementCompactContentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementCompactStringDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementCompactStringDeclaration(EvaParser.ElementCompactStringDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementCompactStringDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementCompactStringDeclaration(EvaParser.ElementCompactStringDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementCompactContent}.
	 * @param ctx the parse tree
	 */
	void enterElementCompactContent(EvaParser.ElementCompactContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementCompactContent}.
	 * @param ctx the parse tree
	 */
	void exitElementCompactContent(EvaParser.ElementCompactContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementBodyContent}.
	 * @param ctx the parse tree
	 */
	void enterElementBodyContent(EvaParser.ElementBodyContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementBodyContent}.
	 * @param ctx the parse tree
	 */
	void exitElementBodyContent(EvaParser.ElementBodyContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementBodyText}.
	 * @param ctx the parse tree
	 */
	void enterElementBodyText(EvaParser.ElementBodyTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementBodyText}.
	 * @param ctx the parse tree
	 */
	void exitElementBodyText(EvaParser.ElementBodyTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementBodyProperty}.
	 * @param ctx the parse tree
	 */
	void enterElementBodyProperty(EvaParser.ElementBodyPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementBodyProperty}.
	 * @param ctx the parse tree
	 */
	void exitElementBodyProperty(EvaParser.ElementBodyPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementBody}.
	 * @param ctx the parse tree
	 */
	void enterElementBody(EvaParser.ElementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementBody}.
	 * @param ctx the parse tree
	 */
	void exitElementBody(EvaParser.ElementBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementAttributeListDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementAttributeListDeclaration(EvaParser.ElementAttributeListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementAttributeListDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementAttributeListDeclaration(EvaParser.ElementAttributeListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementAttributes}.
	 * @param ctx the parse tree
	 */
	void enterElementAttributes(EvaParser.ElementAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementAttributes}.
	 * @param ctx the parse tree
	 */
	void exitElementAttributes(EvaParser.ElementAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementAttribute}.
	 * @param ctx the parse tree
	 */
	void enterElementAttribute(EvaParser.ElementAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementAttribute}.
	 * @param ctx the parse tree
	 */
	void exitElementAttribute(EvaParser.ElementAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterElementAttributeName(EvaParser.ElementAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitElementAttributeName(EvaParser.ElementAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterElementAttributeValue(EvaParser.ElementAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitElementAttributeValue(EvaParser.ElementAttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#elementName}.
	 * @param ctx the parse tree
	 */
	void enterElementName(EvaParser.ElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#elementName}.
	 * @param ctx the parse tree
	 */
	void exitElementName(EvaParser.ElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(EvaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(EvaParser.StringContext ctx);
}