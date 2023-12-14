package ast;

public class GensList implements ASTNode {
    private ASTNode c;
    private ASTNode a;

    public GensList(ASTNode c, ASTNode a) {
        super();
        this.c = c;
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("gen: ");
        c.print();
        System.out.println("gens: ");
        a.print();
    }
}