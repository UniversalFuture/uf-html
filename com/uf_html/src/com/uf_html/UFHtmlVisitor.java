// Generated from C:/Users/tobe/Source/Repos/uf-html/com/uf_html/src/com/uf_html\UFHtml.g4 by ANTLR 4.5
package com.uf_html;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UFHtmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UFHtmlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UFHtmlParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(@NotNull UFHtmlParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UFHtmlParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(@NotNull UFHtmlParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link UFHtmlParser#directive_single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_single(@NotNull UFHtmlParser.Directive_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UFHtmlParser#directive_double}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective_double(@NotNull UFHtmlParser.Directive_doubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UFHtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(@NotNull UFHtmlParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UFHtmlParser#attr_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_set(@NotNull UFHtmlParser.Attr_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link UFHtmlParser#attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrs(@NotNull UFHtmlParser.AttrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UFHtmlParser#elementType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementType(@NotNull UFHtmlParser.ElementTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UFHtmlParser#emptyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyElement(@NotNull UFHtmlParser.EmptyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UFHtmlParser#fullElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullElement(@NotNull UFHtmlParser.FullElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UFHtmlParser#inner_Text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_Text(@NotNull UFHtmlParser.Inner_TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link UFHtmlParser#tag_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_name(@NotNull UFHtmlParser.Tag_nameContext ctx);
}