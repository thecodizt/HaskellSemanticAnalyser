package ast;

public class SingleTypeList implements ASTNode {
    private ASTNode lc;

    public SingleTypeList(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Single Type List: ");
        lc.print();
    }
}