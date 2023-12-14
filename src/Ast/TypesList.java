package ast;

public class TypesList implements ASTNode {
    private ASTNode c;
    private ASTNode a;

    public TypesList(ASTNode c, ASTNode a) {
        super();
        this.c = c;
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("Type: ");
        c.print();
        System.out.println("Types: ");
        a.print();
    }
}