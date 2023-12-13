package ast;

public class IdFunctionApplication implements ASTNode {
    private String ID;
    private ASTNode pats;

    public IdFunctionApplication(String ID, ASTNode pats) {
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