package ast;

public class BracketRange implements ASTNode {
    private ASTNode lc;

    public BracketRange(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Bracket Range: ");
        lc.print();
    }
}