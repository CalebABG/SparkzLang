import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromStream(Main.class.getResourceAsStream("transpiler_examples/test1.sparkz"));

            SparkzLexer lexer = new SparkzLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            SparkzParser parser = new SparkzParser(tokens);

            ParseTree tree = parser.sparkz();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new SparkzParserBaseListener(), tree);

            System.out.println(tree.toStringTree(parser));
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
