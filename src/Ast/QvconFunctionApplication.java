package ast;

public class QvconFunctionApplication implements ASTNode {
    private ASTNode c;
    private ASTNode a;

    public QvconFunctionApplication(ASTNode c, ASTNode a) {
        this.c = c;
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("Function: ");
        c.print();
        System.out.println("Arguments: ");
        a.print();
    }
}