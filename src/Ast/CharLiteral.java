package ast;

public class CharLiteral implements ASTNode {
    private String lc;

    public CharLiteral(String lc) {
        super();
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Character Literal: ");
        System.out.println(lc);
    }
}