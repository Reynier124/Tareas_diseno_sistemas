package org.example;

public class Imp4 extends Impuestos{
    public Imp4() {
    }

    public Imp4(String objeto, String sujeto, Integer baseImponible, Float alicuota) {
        super(objeto, sujeto, baseImponible, alicuota);
    }

    @Override
    public float calcular() {
        Integer a = getBaseImponible();
        Float b = getAlicuota();

        return (a + 10000) * b;
    }
}
