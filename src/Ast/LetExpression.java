package ast;

public class LetExpression implements ASTNode {
    private ASTNode lc;

    public LetExpression(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Let Expression: ");
        lc.print();
    }
}