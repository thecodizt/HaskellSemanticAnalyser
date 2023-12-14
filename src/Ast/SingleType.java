package ast;

public class SingleType implements ASTNode {
    private ASTNode lc;

    public SingleType(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Expression: ");
        lc.print();
    }
}