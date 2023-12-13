package ast;

public class ParenFunLhs implements ASTNode {
    private String ID;
    private ASTNode pats;

    public ParenFunLhs(String ID, ASTNode pats) {
        this.ID = ID;
        this.pats = pats;
    }

    @Override
    public void print() {
        System.out.println("Paren Function LHS: ");
        System.out.print(ID);
        System.out.println("Parameters: ");
        pats.print();
    }
}