package ast;

public class IdExpression implements ASTNode {
    private String lc;

    public IdExpression(String lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("ID Expression: ");
        System.out.println(lc);
    }
}