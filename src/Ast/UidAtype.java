package ast;

public class UidAtype implements ASTNode {
    private String lc;

    public UidAtype(String lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("UID Type: ");
        System.out.println(lc);
    }
}