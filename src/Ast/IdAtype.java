package ast;

public class IdAtype implements ASTNode {
    private String lc;

    public IdAtype(String lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("ID Type: ");
        System.out.println(lc);
    }
}