package es.upm.miw.pd.doo.polymorphism.inheritance.lackOf;

public class Addition extends MathematicalOperation{
    
    public Addition(final int operator1, final int operator2) {
        super(operator1, operator2);
    }

    public int calculateOperation() {
        return this.operator1 + this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "+" + operator2 + "]";
    }

}
