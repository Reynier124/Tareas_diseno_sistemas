package org.example;

public class Imp2 extends Impuestos {
    public Imp2(String objeto, String sujeto, Integer baseImponible, Float alicuota) {
        super(objeto, sujeto, baseImponible, alicuota);
    }

    public Imp2() {
    }

    @Override
    public float calcular() {
        Integer b = getBaseImponible();
        Float a = getAlicuota();

        return (a/2) * b;
    }
}
