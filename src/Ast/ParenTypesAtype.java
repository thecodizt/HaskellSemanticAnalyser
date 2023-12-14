package ast;

public class ParenTypesAtype implements ASTNode {
    private ASTNode lc;

    public ParenTypesAtype(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Expression: ");
        lc.print();
    }
}