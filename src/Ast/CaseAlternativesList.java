package ast;

public class CaseAlternativesList implements ASTNode {
    private ASTNode c;
    private ASTNode a;

    public CaseAlternativesList(ASTNode c, ASTNode a) {
        super();
        this.c = c;
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("CASE Node: ");
        c.print();
        System.out.println("Alternate Node: ");
        a.print();
    }
}