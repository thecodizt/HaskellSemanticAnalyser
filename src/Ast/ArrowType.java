package ast;

public class ArrowType implements ASTNode {
    private ASTNode lc;

    public ArrowType(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Arrow Type: ");
        lc.print();
    }
}