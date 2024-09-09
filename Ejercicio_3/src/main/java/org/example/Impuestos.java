package org.example;

public abstract class Impuestos {
    private String objeto;
    private String sujeto;
    private Integer baseImponible;
    private Float alicuota;


    public Impuestos() {
    }

    public Impuestos(String objeto, Integer baseImponible, Float alicuota) {
        this.objeto = objeto;
        this.baseImponible = baseImponible;
        this.alicuota = alicuota;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public Integer getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(Integer baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Float getAlicuota() {
        return alicuota;
    }

    public void setAlicuota(Float alicuota) {
        this.alicuota = alicuota;
    }

    public abstract float calcular();

}
