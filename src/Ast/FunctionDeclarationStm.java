public class FunctionDeclarationStm implements ASTNode {
    private ASTNode funlhs;
    private ASTNode rhs;

    public FunctionDeclarationStm(ASTNode funlhs, ASTNode rhs) {
        this.funlhs = funlhs;
        this.rhs = rhs;
    }

    @Override
    public void print() {
        System.out.println("Function Declaration Node:");
        System.out.print("Function name: ");
        funlhs.print();
        System.out.println("Definition:");
        rhs.print();
    }
}