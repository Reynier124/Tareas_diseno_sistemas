package org.example;

public class Imp2 extends Impuestos {

    @Override
    public float calcular() {
        Integer b = getBaseImponible();
        Float a = getAlicuota();

        return (a/2) * b;
    }
}
