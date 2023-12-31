package ast;

public class FunLhsClass implements ASTNode {
    private String ID;
    private ASTNode pats;

    public FunLhsClass(String ID, ASTNode pats) {
        super();
        this.ID = ID;
        this.pats = pats;
    }

    @Override
    public void print() {
        System.out.println("Function LHS: ");
        System.out.print(ID);
        System.out.println("Patterns: ");
        pats.print();
    }
}