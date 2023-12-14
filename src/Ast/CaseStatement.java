package ast;

public class CaseStatement implements ASTNode {
    private ASTNode c;
    private ASTNode a;

    public CaseStatement(ASTNode c, ASTNode a) {
        super();
        this.c = c;
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("CASE Expression: ");
        c.print();
        System.out.println("Alternate Expression: ");
        a.print();
    }
}