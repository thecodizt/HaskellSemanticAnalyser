package ast;

public class BracketAtype implements ASTNode {
    private ASTNode lc;

    public BracketAtype(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Expression: ");
        lc.print();
    }
}