package ast;

public class IfStatement implements ASTNode {
    private ASTNode c;
    private ASTNode a;

    public IfStatement(ASTNode c, ASTNode a) {
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