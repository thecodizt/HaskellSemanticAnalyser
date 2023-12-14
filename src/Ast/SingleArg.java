package ast;

public class SingleArg implements ASTNode {
    private ASTNode lc;

    public SingleArg(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Argument: ");
        lc.print();
    }
}