package ast;

public class ParenExpsList implements ASTNode {
    private ASTNode lc;

    public ParenExpsList(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Paren Expresssion List: ");
        lc.print();
    }
}