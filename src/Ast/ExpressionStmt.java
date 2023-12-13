package ast;

public class ExpressionStmt implements ASTNode {
    private ASTNode exp;

    public SinglePat(ASTNode exp) {
        this.exp = exp;
    }

    @Override
    public void print() {
        System.out.println("Expressions: ");
        exp.print();
    }
}