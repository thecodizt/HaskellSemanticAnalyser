package ast;

public class FunctionApplicationExpression implements ASTNode {
    private ASTNode lc;

    public FunctionApplicationExpression(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Function application Expression: ");
        lc.print();
    }
}