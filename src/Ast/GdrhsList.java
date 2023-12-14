package ast;

public class GdrhsList implements ASTNode {
    private ASTNode a;
    private ASTNode b;
    private ASTNode c;

    public GdrhsList(ASTNode a, ASTNode b,ASTNode c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void print() {
        System.out.println("gd: ");
        a.print();
        System.out.println("Expression: ");
        b.print();
        System.out.println("gdrhs: ");
        c.print();
    }
}