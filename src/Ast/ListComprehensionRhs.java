package ast;

public class ListComprehensionRhs implements ASTNode {
    private ASTNode lc;

    public ListComprehensionRhs(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("List comprehension: ");
        lc.print();
    }
}