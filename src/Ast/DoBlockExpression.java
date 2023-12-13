package ast;

public class DoBlockExpression implements ASTNode {
    private ASTNode lc;

    public DoBlockExpression(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Do Block Expression: ");
        lc.print();
    }
}