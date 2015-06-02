package com.uf_html;

import org.antlr.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.util.Scanner;

/**
 * Created by tobe on 6/1/2015.
 */
public class Main {

    public static void main(String[] args) {
        if (args.length >= 1) {
            interpret(args[0]);
        } else {
            showHelp();
        }
    }

    public static void showHelp() {
        System.out.println("UF-HTML v1.0 - T. Osakwe");
        System.out.println("Syntax: uf-html <input file name>");
    }

    public static void interpret(String inputFileName) {
        try
        {
            ANTLRFileStream fs = new ANTLRFileStream(inputFileName);
            UFHtmlLexer lexer = new UFHtmlLexer(fs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            UFHtmlParser parser = new UFHtmlParser(tokens);
            parser.setBuildParseTree(true);
            ParseTree document = parser.document();
            UFHtml compiler  = new UFHtml(System.out);
            ParseTreeWalker.DEFAULT.walk(compiler, document);
        }
        catch (Exception exc)
        {
            System.err.println("Could not open file \"" + inputFileName + "\".");
            exc.printStackTrace(System.err);
        }
    }
}
