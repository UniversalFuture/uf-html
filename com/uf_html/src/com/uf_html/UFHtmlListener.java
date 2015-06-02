// Generated from C:/Users/tobe/Source/Repos/uf-html/com/uf_html/src/com/uf_html\UFHtml.g4 by ANTLR 4.5
package com.uf_html;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UFHtmlParser}.
 */
public interface UFHtmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UFHtmlParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(@NotNull UFHtmlParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UFHtmlParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(@NotNull UFHtmlParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UFHtmlParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(@NotNull UFHtmlParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link UFHtmlParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(@NotNull UFHtmlParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link UFHtmlParser#directive_single}.
	 * @param ctx the parse tree
	 */
	void enterDirective_single(@NotNull UFHtmlParser.Directive_singleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UFHtmlParser#directive_single}.
	 * @param ctx the parse tree
	 */
	void exitDirective_single(@NotNull UFHtmlParser.Directive_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UFHtmlParser#directive_double}.
	 * @param ctx the parse tree
	 */
	void enterDirective_double(@NotNull UFHtmlParser.Directive_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UFHtmlParser#directive_double}.
	 * @param ctx the parse tree
	 */
	void exitDirective_double(@NotNull UFHtmlParser.Directive_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UFHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull UFHtmlParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UFHtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull UFHtmlParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UFHtmlParser#attr_set}.
	 * @param ctx the parse tree
	 */
	void enterAttr_set(@NotNull UFHtmlParser.Attr_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link UFHtmlParser#attr_set}.
	 * @param ctx the parse tree
	 */
	void exitAttr_set(@NotNull UFHtmlParser.Attr_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link UFHtmlParser#attrs}.
	 * @param ctx the parse tree
	 */
	void enterAttrs(@NotNull UFHtmlParser.AttrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UFHtmlParser#attrs}.
	 * @param ctx the parse tree
	 */
	void exitAttrs(@NotNull UFHtmlParser.AttrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UFHtmlParser#elementType}.
	 * @param ctx the parse tree
	 */
	void enterElementType(@NotNull UFHtmlParser.ElementTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UFHtmlParser#elementType}.
	 * @param ctx the parse tree
	 */
	void exitElementType(@NotNull UFHtmlParser.ElementTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UFHtmlParser#emptyElement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyElement(@NotNull UFHtmlParser.EmptyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UFHtmlParser#emptyElement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyElement(@NotNull UFHtmlParser.EmptyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UFHtmlParser#fullElement}.
	 * @param ctx the parse tree
	 */
	void enterFullElement(@NotNull UFHtmlParser.FullElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UFHtmlParser#fullElement}.
	 * @param ctx the parse tree
	 */
	void exitFullElement(@NotNull UFHtmlParser.FullElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UFHtmlParser#inner_Text}.
	 * @param ctx the parse tree
	 */
	void enterInner_Text(@NotNull UFHtmlParser.Inner_TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link UFHtmlParser#inner_Text}.
	 * @param ctx the parse tree
	 */
	void exitInner_Text(@NotNull UFHtmlParser.Inner_TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link UFHtmlParser#tag_name}.
	 * @param ctx the parse tree
	 */
	void enterTag_name(@NotNull UFHtmlParser.Tag_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UFHtmlParser#tag_name}.
	 * @param ctx the parse tree
	 */
	void exitTag_name(@NotNull UFHtmlParser.Tag_nameContext ctx);
}