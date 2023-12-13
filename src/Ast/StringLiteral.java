package ast;

public class StringLiteral implements ASTNode {
    private String lc;

    public StringLiteral(String lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("String Literal: ");
        System.out.println(lc);
    }
}