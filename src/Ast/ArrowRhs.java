package ast;

public class ArrowRhs implements ASTNode {
    private ASTNode lc;

    public ArrowRhs(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Arrow RHS: ");
        lc.print();
    }
}