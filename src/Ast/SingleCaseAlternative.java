package ast;

public class SingleCaseAlternative implements ASTNode {
    private ASTNode c;

    public SingleCaseAlternative(ASTNode c) {
        super();
        this.c = c;
    }

    @Override
    public void print() {
        System.out.println("CASE Node: ");
        c.print();
    }
}