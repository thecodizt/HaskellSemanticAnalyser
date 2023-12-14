package ast;

public class SinglePat implements ASTNode {
    private ASTNode pat;

    public SinglePat(ASTNode pat) {
        super();
        this.pat = pat;
    }

    @Override
    public void print() {
        System.out.println("Statement: ");
        pat.print();
    }
}