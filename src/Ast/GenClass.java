package ast;

public class GenClass implements ASTNode {
    private ASTNode lc;
    private ASTNode l;

    public GenClass(ASTNode lc, ASTNode l) {
        super();
        this.lc = lc;
        this.l = l;
    }

    @Override
    public void print() {
        System.out.println("General Class Parameter: ");
        lc.print();
        System.out.println("General Class Expression: ");
        l.print();
    }
}