public class IdPat implements ASTNode {
    private String ID;

    public IdPat(String ID) {
        this.ID = ID;
    }

    @Override
    public void print() {
        System.out.println("Identifier Pattern: ");
        System.out.print(ID);
    }
}