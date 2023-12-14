package ast;

public class UIdPat implements ASTNode {
    private String ID;

    public UIdPat(String ID) {
        super();
        this.ID = ID;
    }

    @Override
    public void print() {
        System.out.println("Uppercase Identifier Pattern: ");
        System.out.print(ID);
    }
}