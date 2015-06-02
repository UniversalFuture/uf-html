package com.uf_html;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by tobe on 6/1/2015.
 */
public class UFHtml extends UFHtmlBaseListener {
    public String[] selfClosedElements = new String[]{
            "area", "base", "br", "col", "command", "embed", "hr", "img", "input", "keygen", "link", "meta", "param",
            "source", "track", "wbr"
    };
    public HashMap<String, String> directives = new HashMap<String, String>();
    public PrintStream output;

    String retVal, retTagName = "";
    Double retDbl = 0.0;

    public UFHtml(PrintStream output) {
        this.output = output;
    }

    @Override
    public void enterDocument(@NotNull UFHtmlParser.DocumentContext ctx) {
        super.enterDocument(ctx);
    }

    @Override
    public void exitDocument(@NotNull UFHtmlParser.DocumentContext ctx) {
        super.exitDocument(ctx);
    }

    @Override
    public void enterDirective(@NotNull UFHtmlParser.DirectiveContext ctx) {
        super.enterDirective(ctx);
    }

    @Override
    public void exitDirective(@NotNull UFHtmlParser.DirectiveContext ctx) {
        super.exitDirective(ctx);
    }

    @Override
    public void enterDirective_single(@NotNull UFHtmlParser.Directive_singleContext ctx) {
        String key = ctx.key.getText();
        directives.put(key, "on");
    }

    @Override
    public void enterDirective_double(@NotNull UFHtmlParser.Directive_doubleContext ctx) {
        String key = ctx.key.getText();
        String value = ctx.value.getText();
        directives.put(key, value);
    }

    @Override
    public void enterElement(@NotNull UFHtmlParser.ElementContext ctx) {
        super.enterElement(ctx);
    }

    @Override
    public void exitElement(@NotNull UFHtmlParser.ElementContext ctx) {
        output.print(String.format("<%s", !retTagName.isEmpty() ? retTagName : "div"));
        for (String key: ctx.attributes.keySet()) {
            output.print(String.format(" %s=\"%s\"", key, ctx.attributes.get(key).replaceAll("\"", "")));
        }
        if (ctx.exclamation != null | Arrays.asList(selfClosedElements).contains(retTagName)) {
            output.print(" />");
        }
        output.println();
        retTagName = "";
    }

    @Override
    public void enterAttr_set(@NotNull UFHtmlParser.Attr_setContext ctx) {
        super.enterAttr_set(ctx);
    }

    @Override
    public void exitAttr_set(@NotNull UFHtmlParser.Attr_setContext ctx) {
        super.exitAttr_set(ctx);
    }

    @Override
    public void enterAttrs(@NotNull UFHtmlParser.AttrsContext ctx) {
        super.enterAttrs(ctx);
    }

    @Override
    public void exitAttrs(@NotNull UFHtmlParser.AttrsContext ctx) {
        super.exitAttrs(ctx);
    }

    @Override
    public void enterElementType(@NotNull UFHtmlParser.ElementTypeContext ctx) {
        retTagName = ctx.tagName != null ? ctx.tagName.getText() : "div";
    }

    @Override
    public void exitElementType(@NotNull UFHtmlParser.ElementTypeContext ctx) {
    }

    @Override
    public void enterEmptyElement(@NotNull UFHtmlParser.EmptyElementContext ctx) {
        super.enterEmptyElement(ctx);
    }

    @Override
    public void exitEmptyElement(@NotNull UFHtmlParser.EmptyElementContext ctx) {
        super.exitEmptyElement(ctx);
    }

    @Override
    public void enterFullElement(@NotNull UFHtmlParser.FullElementContext ctx) {
        super.enterFullElement(ctx);
    }

    @Override
    public void exitFullElement(@NotNull UFHtmlParser.FullElementContext ctx) {
        super.exitFullElement(ctx);
    }

    @Override
    public void enterInner_Text(@NotNull UFHtmlParser.Inner_TextContext ctx) {
        super.enterInner_Text(ctx);
    }

    @Override
    public void exitInner_Text(@NotNull UFHtmlParser.Inner_TextContext ctx) {
        super.exitInner_Text(ctx);
    }

    @Override
    public void enterEveryRule(@NotNull ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(@NotNull ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(@NotNull ErrorNode node) {
        super.visitErrorNode(node);
    }
}
