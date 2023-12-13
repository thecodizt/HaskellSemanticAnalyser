package ast;

public class ListComprehensionExpression implements ASTNode {
    private ASTNode lc;

    public ListComprehensionExpression(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("List Comprehension Expression: ");
        lc.print();
    }
}