package ast;

public class PatternDeclarationStm implements ASTNode {
    private ASTNode pat;
    private ASTNode rhs;

    public PatternDeclarationStm(ASTNode pat, ASTNode rhs) {
        this.pat = pat;
        this.rhs = rhs;
    }

    @Override
    public void print() {
        System.out.println("Pattern Declaration Node:");
        System.out.print("Pattern name: ");
        pat.print();
        System.out.println("Definition:");
        rhs.print();
    }
}