package org.example;

public class Imp5 extends Impuestos {

    @Override
    public float calcular() {
        Integer b = getBaseImponible();
        Float a = getAlicuota();

        return (a*3) * b;
    }
}
