package ast;

public class FunctionDeclarationStm extends declaration implements ASTNode {
    private ASTNode funlhs;
    private ASTNode rhs;

    public FunctionDeclarationStm(ASTNode funlhs, ASTNode rhs) {
        super();
        this.funlhs = funlhs;
        this.rhs = rhs;
    }

    @Override
    public void print() {
        System.out.println("Function Declaration Node:");
        System.out.print("Function name: ");
        if (funlhs != null) {
        	funlhs.print();
        }
        System.out.println("Definition:");
        if (rhs != null) {
        	rhs.print();
        }
    }
}