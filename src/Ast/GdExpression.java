package ast;

public class GdExpression implements ASTNode {
    private ASTNode exp;

    public GdExpression(ASTNode exp) {
        super();
        this.exp = exp;
    }

    @Override
    public void print() {
        System.out.println("gdexpression: ");
        exp.print();
    }
}