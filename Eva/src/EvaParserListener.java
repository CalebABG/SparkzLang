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
	 * Enter a parse tree produced by {@link EvaParser#tagContentCompact}.
	 * @param ctx the parse tree
	 */
	void enterTagContentCompact(EvaParser.TagContentCompactContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#tagContentCompact}.
	 * @param ctx the parse tree
	 */
	void exitTagContentCompact(EvaParser.TagContentCompactContext ctx);
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
	 * Enter a parse tree produced by {@link EvaParser#tagAttributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTagAttributeDeclaration(EvaParser.TagAttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#tagAttributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTagAttributeDeclaration(EvaParser.TagAttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#tagAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterTagAttributeList(EvaParser.TagAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#tagAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitTagAttributeList(EvaParser.TagAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#tagAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTagAttribute(EvaParser.TagAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#tagAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTagAttribute(EvaParser.TagAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EvaParser#tagAttributeValue}.
	 * @param ctx the parse tree
	 */
	void enterTagAttributeValue(EvaParser.TagAttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#tagAttributeValue}.
	 * @param ctx the parse tree
	 */
	void exitTagAttributeValue(EvaParser.TagAttributeValueContext ctx);
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
	 * Enter a parse tree produced by {@link EvaParser#tagAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterTagAttributeName(EvaParser.TagAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#tagAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitTagAttributeName(EvaParser.TagAttributeNameContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link EvaParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(EvaParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EvaParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(EvaParser.TagNameContext ctx);
}