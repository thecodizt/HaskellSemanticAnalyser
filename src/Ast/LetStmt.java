package ast;

public class LetStmt implements ASTNode {
    private ASTNode exp;

    public LetStmt(ASTNode exp) {
        this.exp = exp;
    }

    @Override
    public void print() {
        System.out.println("Declarations: ");
        exp.print();
    }
}