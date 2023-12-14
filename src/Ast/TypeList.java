package ast;

public class TypeList implements ASTNode {
    private ASTNode c;
    private ASTNode a;

    public TypeList(ASTNode c, ASTNode a) {
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