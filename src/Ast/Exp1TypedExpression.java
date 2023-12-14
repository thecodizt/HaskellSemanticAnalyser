package ast;

public class Exp1TypedExpression implements ASTNode {
    private ASTNode c;
    private ASTNode a;

    public Exp1TypedExpression(ASTNode c, ASTNode a) {
        super();
        this.c = c;
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("Expression: ");
        c.print();
        System.out.println("Type : ");
        a.print();
    }
}