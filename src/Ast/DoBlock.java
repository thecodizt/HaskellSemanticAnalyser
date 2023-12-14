package ast;

public class DoBlock implements ASTNode {
    private ASTNode a;

    public DoBlock(ASTNode a) {
        super();
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("Do Block: ");
        if (a != null) {
        	a.print();
        }
    }
}