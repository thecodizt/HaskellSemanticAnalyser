package ast;

public class FloatLiteral implements ASTNode {
    private String lc;

    public FloatLiteral(String lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Float Literal: ");
        System.out.println(lc);
    }
}