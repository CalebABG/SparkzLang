package com.main;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
//        String inputFile = Main.class.getResource("./index.eva").getPath();
//        String inputFile = "C:\\Users\\Caleb\\IdeaProjects\\Eva(Elegant HTML Lang)\\Eva\\src\\index.eva";
//        InputStream is = new FileInputStream(inputFile);
        InputStream is = Main.class.getResourceAsStream("./test.eva");

        ANTLRInputStream input = new ANTLRInputStream(is);
        EvaLexer lexer = new EvaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EvaParser parser = new EvaParser(tokens);
        ParseTree tree = parser.evaDoc(); // parse; start at prog <label id="code.tour.main.6"/>
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new EvaBaseListener(), tree);

        System.out.println(tree.toStringTree(parser)); // print tree as text <label id="code.tour.main.7"/>
    }

}
