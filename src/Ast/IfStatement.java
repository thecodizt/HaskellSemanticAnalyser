package ast;

public class IfStatement implements ASTNode {
    private ASTNode e;
    private ASTNode y;
    private ASTNode n;

    public IfStatement(ASTNode e, ASTNode y, ASTNode n) {
        super();
        this.e = e;
        this.y = y;
        this.n = n;
    }

    @Override
    public void print() {
        System.out.println("IF Expression: ");
        e.print();
        System.out.println("THEN Expression: ");
        y.print();
        System.out.println("ELSE Expression: ");
        n.print();
    }
}