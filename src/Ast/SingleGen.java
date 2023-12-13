package ast;

public class SingleGen implements ASTNode {
    private ASTNode lc;

    public SingleGen(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Expression: ");
        lc.print();
    }
}