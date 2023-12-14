package ast;

public class PatAssignTypedExpressionStmt implements ASTNode {
    private ASTNode a;
    private ASTNode b;
    private ASTNode c;

    public PatAssignTypedExpressionStmt(ASTNode a, ASTNode b,ASTNode c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void print() {
        System.out.println("Pat: ");
        a.print();
        System.out.println("Expression: ");
        b.print();
        System.out.println("Types: ");
        c.print();
    }
}