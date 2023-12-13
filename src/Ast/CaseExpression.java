package ast;

public class CaseExpression implements ASTNode {
    private ASTNode lc;

    public CaseExpression(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Case Expression: ");
        lc.print();
    }
}