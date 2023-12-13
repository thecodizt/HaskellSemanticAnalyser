package ast;

public class IntegerLiteral implements ASTNode {
    private String lc;

    public IntegerLiteral(String lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Integer Literal: ");
        System.out.println(lc);
    }
}