package org.example;

public class Imp4 extends Impuestos{


    @Override
    public float calcular() {
        Integer b = getBaseImponible();
        Float a = getAlicuota();

        return (a + 10000) * b;
    }
}
