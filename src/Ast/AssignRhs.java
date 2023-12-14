package ast;

public class AssignRhs implements ASTNode {
    private ASTNode exp;

    public AssignRhs(ASTNode exp) {
        super();
        this.exp = exp;
    }

    @Override
    public void print() {
        System.out.println("Assignment expression: ");
        exp.print();
    }
}