package ast;

public class IntegerLiteral implements ASTNode {
    private int lc;

    public IntegerLiteral(int lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Integer Literal: ");
        System.out.println(lc);
    }
}