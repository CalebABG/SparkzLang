import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            CharStream input = CharStreams.fromStream(Main.class.getResourceAsStream("tests/index.eva"));

            EvaLexer lexer = new EvaLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            EvaParser parser = new EvaParser(tokens);

            ParseTree tree = parser.eva();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new EvaParserBaseListener(), tree);

            System.out.println(tree.toStringTree(parser));
        }
        catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}
