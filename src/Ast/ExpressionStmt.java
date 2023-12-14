package ast;

public class ExpressionStmt implements ASTNode {
    private ASTNode exp;

    public ExpressionStmt(ASTNode exp) {
        super();
        this.exp = exp;
    }

    @Override
    public void print() {
        System.out.println("Expressions: ");
        exp.print();
    }
}