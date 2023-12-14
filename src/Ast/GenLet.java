package ast;

public class GenLet implements ASTNode {
    private ASTNode lc;

    public GenLet(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Expression: ");
        lc.print();
    }
}