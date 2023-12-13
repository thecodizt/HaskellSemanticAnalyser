package ast;

public class SinglePat implements ASTNode {
    private ASTNode pat;

    public SinglePat(ASTNode pat) {
        this.pat = pat;
    }

    @Override
    public void print() {
        System.out.println("Identifier Pattern: ");
        pat.print();
    }
}