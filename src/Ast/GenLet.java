package ast;

public class GenLet implements ASTNode {
    private ASTNode lc;

    public GenLet(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Expression: ");
        lc.print();
    }
}