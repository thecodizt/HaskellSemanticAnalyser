package ast;

public class BooleanLiteral implements ASTNode {
    private Boolean lc;

    public BooleanLiteral(Boolean lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Boolean Literal: ");
        System.out.println(lc);
    }
}