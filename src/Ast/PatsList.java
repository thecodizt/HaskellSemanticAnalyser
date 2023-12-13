public class PatsList implements ASTNode {
    private ASTNode pat;
    private ASTNode pats;

    public PatsList(ASTNode pat, ASTNode pats) {
        this.pat = pat;
        this.pats = pats;
    }

    @Override
    public void print() {
        System.out.println("Identifier Pattern: ");
        pat.print();
        System.out.println("Identifier Pattern List: ");
        pats.print();
    }
}