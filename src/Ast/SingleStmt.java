package ast;

public class SingleStmt implements ASTNode {
    private ASTNode st;

    public SingleStmt(ASTNode st) {
        super();
        this.st = st;
    }

    @Override
    public void print() {
        System.out.println("Single Statement: ");
        st.print();
    }
}