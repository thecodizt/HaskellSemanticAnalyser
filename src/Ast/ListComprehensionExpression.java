package ast;

public class ListComprehensionExpression implements ASTNode {
    private ASTNode lc;

    public ListComprehensionExpression(ASTNode lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("List Comprehension Expression: ");
        lc.print();
    }
}