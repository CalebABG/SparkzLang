import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Main {
    public static void main(String[] args)
    {
        try
        {
            CharStream input = new UnbufferedCharStream(Main.class.getResourceAsStream("tests/index.eva"));

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
