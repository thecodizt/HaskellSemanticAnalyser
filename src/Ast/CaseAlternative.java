package ast;

public class CaseAlternative implements ASTNode {
    private ASTNode a;
    private ASTNode b;

    public CaseAlternative(ASTNode a, ASTNode b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void print() {
        System.out.println("CASE Alternative: ");
        a.print();
        System.out.println("Alternate Expression: ");
        b.print();
    }
}