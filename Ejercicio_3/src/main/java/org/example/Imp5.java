package org.example;

public class Imp5 extends Impuestos {
    public Imp5() {
    }

    public Imp5(String objeto, String sujeto, Integer baseImponible, Float alicuota) {
        super(objeto, sujeto, baseImponible, alicuota);
    }

    @Override
    public float calcular() {
        Integer a = getBaseImponible();
        Float b = getAlicuota();

        return (a*3) * b;
    }
}
