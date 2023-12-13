package ast;

public class GenExpression implements ASTNode {
    private ASTNode lc;

    public GenExpression(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Gen Expression: ");
        lc.print();
    }
}