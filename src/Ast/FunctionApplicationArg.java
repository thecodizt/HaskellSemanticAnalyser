package ast;

public class FunctionApplicationArg implements ASTNode {
    private ASTNode lc;

    public FunctionApplicationArg(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Function Application Argument: ");
        lc.print();
    }
}