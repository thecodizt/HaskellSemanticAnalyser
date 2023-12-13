package ast;

public class Exp1Expression implements ASTNode {
    private ASTNode lc;

    public Exp1Expression(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Expression: ");
        lc.print();
    }
}