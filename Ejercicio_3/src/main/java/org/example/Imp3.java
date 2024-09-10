package org.example;

public class Imp3 extends Impuestos {
    public Imp3() {
    }

    public Imp3(String objeto, String sujeto, Integer baseImponible, Float alicuota) {
        super(objeto, sujeto, baseImponible, alicuota);
    }

    @Override
    public float calcular() {
        Integer a = getBaseImponible();
        Float b = getAlicuota();
        return (a*2 + 300) * b;
    }
}
