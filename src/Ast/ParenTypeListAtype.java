package ast;

public class ParenTypeListAtype implements ASTNode {
    private ASTNode lc;

    public ParenTypeListAtype(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("List type: ");
        lc.print();
    }
}