package ast;

public class OpExpression implements ASTNode {
    private ASTNode l;
    private ASTNode r;
    private String op;

    public OpExpression(ASTNode l, String op, ASTNode r) {
        super();
        this.l = l;
        this.r = r;
        this.op = op;
    }

    @Override
    public void print() {
        System.out.println("Operation Expression: ");
        l.print();
        System.out.println(op);
        r.print();
    }
}