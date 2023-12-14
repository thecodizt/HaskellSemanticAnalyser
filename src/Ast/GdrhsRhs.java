package ast;

public class GdrhsRhs implements ASTNode {
    private ASTNode lc;

    public GdrhsRhs(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("GDRHS: ");

        if (lc != null) {
            lc.print();
        } else {
            System.out.println("lc is null");
        }
    }
}