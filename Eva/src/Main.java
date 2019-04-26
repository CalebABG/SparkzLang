import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(Main.class.getResourceAsStream("./test.eva"));

        EvatLexer lexer = new EvatLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        EvatParser parser = new EvatParser(tokens);

        ParseTree tree = parser.eva();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new EvatBaseListener(), tree);

        System.out.println(tree.toStringTree(parser));
    }

}
