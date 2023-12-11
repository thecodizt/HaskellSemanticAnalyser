import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
    private Stack<Map<String, String>> stack;

    public SymbolTable() {
        stack = new Stack<>();
        stack.push(new HashMap<>()); // Global scope
    }

    public void enterScope() {
        stack.push(new HashMap<>());
    }

    public void exitScope() {
        if (stack.size() > 1) {
            stack.pop();
        } else {
            System.err.println("Cannot exit global scope");
        }
    }

    public void addSymbol(String name, String type) {
        stack.peek().put(name, type);
    }

    public void displayTable() {
        System.out.println("\n\nSymbol Table:");

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println("\nScope " + (stack.size() - i) + ":");
            Map<String, String> symbols = stack.get(i);

            for (Map.Entry<String, String> entry : symbols.entrySet()) {
                System.out.println("    " + entry.getKey() + " : " + entry.getValue());
            }

            System.out.println();
        }
    }
}