package ast;

public class ArgsList implements ASTNode {
    private ASTNode c;
    private ASTNode a;

    public ArgsList(ASTNode c, ASTNode a) {
        super();
        this.c = c;
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("Expressions: ");
        c.print();
        System.out.println("Arguments: ");
        a.print();
    }
}