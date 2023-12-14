package ast;

public class DeclarationStm extends declaration implements ASTNode {
    private ASTNode declaration;

    public DeclarationStm(ASTNode declaration) {
        super();
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