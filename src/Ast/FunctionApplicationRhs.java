package ast;

public class FunctionApplicationRhs implements ASTNode {
    private ASTNode lc;

    public FunctionApplicationRhs(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Function application: ");
        lc.print();
    }
}