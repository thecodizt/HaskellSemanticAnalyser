package ast;

public class IfExpression implements ASTNode {
    private ASTNode lc;

    public IfExpression(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("If Expression: ");
        lc.print();
    }
}