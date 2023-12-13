package ast;

public class MinusExpression implements ASTNode {
    private ASTNode l;

    public MinusExpression(ASTNode l) {
        this.l = l;
    }

    @Override
    public void print() {
        System.out.println("Minus Expression: ");
        l.print();
    }
}