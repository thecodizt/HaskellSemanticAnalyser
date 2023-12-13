package ast;

public class GdrhsRhs implements ASTNode {
    private ASTNode lc;

    public GdrhsRhs(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("GDRHS: ");
        lc.print();
    }
}