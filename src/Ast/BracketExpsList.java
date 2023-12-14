package ast;

public class BracketExpsList implements ASTNode {
    private ASTNode lc;

    public BracketExpsList(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Bracket Expression List: ");
        lc.print();
    }
}