package com.uf_html;

import org.antlr.v4.runtime.misc.NotNull;

import java.io.PrintStream;
import java.util.HashMap;

/**
 * Created by tobe on 6/1/2015.
 */
public class UFHtmlCompiler extends UFHtmlBaseVisitor<String> {
    public String[] selfClosedElements = new String[]{
        "area", "base", "br", "col", "command", "embed", "hr", "img", "input", "keygen", "link", "meta", "param",
        "source", "track", "wbr"
    };
    public HashMap<String, String> directives = new HashMap<String, String>();
    public PrintStream output;

    public UFHtmlCompiler(PrintStream output) {
        this.output = output;
    }

    @Override
    public String visitDirective_single(@NotNull UFHtmlParser.Directive_singleContext ctx) {
        String key = ctx.key.getText();
        directives.put(key, "on");
        return "on";
    }

    @Override
    public String visitDirective_double(@NotNull UFHtmlParser.Directive_doubleContext ctx) {
        String key = ctx.key.getText();
        String value = ctx.value.getText();
        directives.put(key, value);
        return value;
    }

    @Override
    public String visitDocument(@NotNull UFHtmlParser.DocumentContext ctx) {
        return super.visitDocument(ctx);
    }

    @Override
    public String visitTag_name(@NotNull UFHtmlParser.Tag_nameContext ctx) {
        output.println(String.format("Found tag name: %s", ctx.TAG_NAME().getText()));
        return ctx.TAG_NAME().getText();
    }

    @Override
    public String visitInner_Text(@NotNull UFHtmlParser.Inner_TextContext ctx) {
        return super.visitInner_Text(ctx);
    }

    @Override
    public String visitFullElement(@NotNull UFHtmlParser.FullElementContext ctx) {
        return super.visitFullElement(ctx);
    }

    @Override
    public String visitEmptyElement(@NotNull UFHtmlParser.EmptyElementContext ctx) {
        return super.visitEmptyElement(ctx);
    }

    @Override
    public String visitElementType(@NotNull UFHtmlParser.ElementTypeContext ctx) {
        String tagName = ctx.tagName != null ? ctx.tagName.getText() : "div";
        return tagName;
    }

    @Override
    public String visitElement(@NotNull UFHtmlParser.ElementContext ctx) {
        return super.visitElement(ctx);
    }

    @Override
    public String visitDirective(@NotNull UFHtmlParser.DirectiveContext ctx) {
        return super.visitDirective(ctx);
    }
}
