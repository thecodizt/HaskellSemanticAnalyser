package ast;

public class IdParenFunctionApplication implements ASTNode {
    private String ID;
    private ASTNode pats;

    public IdParenFunctionApplication(String ID, ASTNode pats) {
        super();
        this.ID = ID;
        this.pats = pats;
    }

    @Override
    public void print() {
        System.out.println("ID Function : ");
        System.out.print(ID);
        System.out.println("Arguments: ");
        pats.print();
    }
}