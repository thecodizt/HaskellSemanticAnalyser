package ast;

public class AtypeType implements ASTNode {
    private ASTNode lc;

    public AtypeType(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Arrow Type: ");
        lc.print();
    }
}