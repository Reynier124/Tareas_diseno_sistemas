package org.example;

public class Imp1 extends Impuestos {


    @Override
    public float calcular() {
        Integer b = getBaseImponible();
        Float a = getAlicuota();

        return a * b;
    }
}
