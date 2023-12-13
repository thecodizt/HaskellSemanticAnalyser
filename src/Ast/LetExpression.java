package ast;

public class LetExpression implements ASTNode {
    private ASTNode lc;

    public LetExpression(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Let Expression: ");
        lc.print();
    }
}