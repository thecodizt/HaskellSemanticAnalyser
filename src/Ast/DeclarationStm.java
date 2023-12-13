public class DeclarationStm implements ASTNode {
    private ASTNode declaration;

    public DeclarationStm(ASTNode declaration) {
        this.declaration = declaration;
    }

    @Override
    public void print() {
        System.out.println("Declaration Statement:");
        if (declaration != null) {
            declaration.print();
        }
    }
}