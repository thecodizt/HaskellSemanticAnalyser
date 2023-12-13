package ast;

public class SingleStmt implements ASTNode {
    private ASTNode st;

    public SinglePat(ASTNode st) {
        this.st = st;
    }

    @Override
    public void print() {
        System.out.println("Identifier Pattern: ");
        pat.print();
    }
}