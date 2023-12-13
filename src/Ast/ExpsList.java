package ast;

public class ExpsList implements ASTNode {
    private ASTNode c;
    private ASTNode a;

    public ExpsList(ASTNode c, ASTNode a) {
        this.c = c;
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("Expressions: ");
        c.print();
        System.out.println("Exps: ");
        a.print();
    }
}