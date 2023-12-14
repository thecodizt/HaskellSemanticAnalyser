package ast;

public class FloatLiteral implements ASTNode {
    private float lc;

    public FloatLiteral(float lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Float Literal: ");
        System.out.println(lc);
    }
}