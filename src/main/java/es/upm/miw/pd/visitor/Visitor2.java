package es.upm.miw.pd.visitor;

public class Visitor2 extends Visitor {
    
    private int contadorA = 0;

    private int contadorB = 0;

    @Override
    public void visitElementA(ElementA e) {
        this.contadorA++;
    }

    @Override
    public void visitElementB(ElementB e) {
        this.contadorB++;
    }

    public int getAs() {
        return contadorA;
    }

    public int getBs() {
        return contadorB;
    }
    
    

}
