package org.example;

public class Imp1 extends Impuestos {
    public Imp1() {
    }

    public Imp1(String objeto, String sujeto, Integer baseImponible, Float alicuota) {
        super(objeto, sujeto, baseImponible, alicuota);
    }

    @Override
    public float calcular() {
        Integer b = getBaseImponible();
        Float a = getAlicuota();

        return a * b;
    }
}
