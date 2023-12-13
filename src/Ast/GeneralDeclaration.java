public class GeneralDeclaration implements ASTNode {
    private String ID;
    private ASTNode types;

    public GeneralDeclaration(String ID, ASTNode types) {
        this.ID = ID;
        this.types = types;
    }

    @Override
    public void print() {
        System.out.println("General Declaration Node:");
        System.out.print("Identifier name: ");
        System.out.println(ID);
        System.out.println("Types:");
        types.print();
    }
}