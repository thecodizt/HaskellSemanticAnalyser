package ast;

public class BracketExpsList implements ASTNode {
    private ASTNode lc;

    public BracketExpsList(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Bracket Expression List: ");
        lc.print();
    }
}