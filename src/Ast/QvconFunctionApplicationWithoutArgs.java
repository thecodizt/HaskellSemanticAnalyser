package ast;

public class QvconFunctionApplicationWithoutArgs implements ASTNode {
    private ASTNode lc;

    public QvconFunctionApplicationWithoutArgs(ASTNode lc) {
        this.lc = lc;
    }

    @Override
    public void print() {
        System.out.println("Function without Arguments: ");
        lc.print();
    }
}