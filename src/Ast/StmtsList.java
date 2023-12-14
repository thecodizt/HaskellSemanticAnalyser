package ast;

public class StmtsList implements ASTNode {
    private ASTNode lc;
    private ASTNode l;

    public StmtsList(ASTNode lc, ASTNode l) {
        super();
        this.lc = lc;
        this.l = l;
    }

    @Override
    public void print() {
        System.out.println("Statement: ");
        lc.print();
        System.out.println("Statement List: ");
        l.print();
    }
}