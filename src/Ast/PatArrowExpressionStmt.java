package ast;

public class PatArrowExpressionStmt implements ASTNode {
    private ASTNode a;
    private ASTNode b;

    public PatArrowExpressionStmt(ASTNode a, ASTNode b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void print() {
        System.out.println("Pat Arrow: ");
        a.print();
        System.out.println("Expression: ");
        b.print();
    }
}