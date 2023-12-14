package ast;

public class LetStatement implements ASTNode {
    private ASTNode c;
    private ASTNode a;

    public LetStatement(ASTNode c, ASTNode a) {
        super();
        this.c = c;
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("Declarations: ");
        c.print();
        System.out.println("Expressions: ");
        a.print();
    }
}