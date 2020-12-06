package org.tanouti.oop.basics.interfaces;

public class Main {
    public static void main(String[] args) {
        ITaxeCalculator calculator = getCalculator();
        calculator.calculateTax();
    }
    public static  ITaxeCalculator getCalculator() {
        return new TaxCalculator2019();
    }
}
