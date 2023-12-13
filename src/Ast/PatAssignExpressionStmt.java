package ast;

public class PatAssignExpressionStmt implements ASTNode {
    private ASTNode a;
    private ASTNode b;

    public PatAssignExpressionStmt(ASTNode a, ASTNode b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void print() {
        System.out.println("Pat Assign: ");
        a.print();
        System.out.println("Expression: ");
        b.print();
    }
}