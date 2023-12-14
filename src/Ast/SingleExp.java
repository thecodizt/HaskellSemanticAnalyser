package ast;

public class SingleExp implements ASTNode {
    private ASTNode lc;

    public SingleExp(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Single Expression: ");
        lc.print();
    }
}