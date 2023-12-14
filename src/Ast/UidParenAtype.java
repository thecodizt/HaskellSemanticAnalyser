package ast;

public class UidParenAtype implements ASTNode {
    private String lc;

    public UidParenAtype(String lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("UID Type: ");
        System.out.println(lc);
    }
}