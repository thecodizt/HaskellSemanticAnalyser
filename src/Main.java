import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.*;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage: java Main <input_file>");
            return;
        }

        ANTLRFileStream input = new ANTLRFileStream(args[0]);
        ANTLRInputStream ip = new ANTLRInputStream(input.toString());

        HaskellLexer lexer = new HaskellLexer(ip);
        Token token;

        List<Token> tokenList = new ArrayList<>(); // Store tokens in a list

        // Consume tokens and store them
        while ((token = lexer.nextToken()).getType() != -1) {
            tokenList.add(token);
        }

        // Create a new input stream using the stored tokens
        CommonTokenStream tokenStream = new CommonTokenStream(new ListTokenSource(tokenList));
        HaskellParser parser = new HaskellParser(tokenStream);

        SymbolTable symbolTable = new SymbolTable(); // Create symbol table

        // Process tokens from the stored token stream
        for (int i = 0; i < tokenList.size(); i++) {
            token = tokenList.get(i);
            String tokenType = lexer.getVocabulary().getSymbolicName(token.getType());
            String tokenText = token.getText();

            // Logic to add identifiers to the symbol table
            if ("ID".equals(tokenType)) {
                symbolTable.addSymbol(tokenText, tokenType);
            }

            System.out.println("L " + token.getLine() + ":" + token.getStartIndex() +
                    " <" + tokenType + ", " + tokenText + ">");
        }

        symbolTable.displayTable(); // Display the symbol table
        
        System.out.println("PARSE TREE: \n\n");
        // Start parsing from the stored token stream
        parser.start();
    }
}
