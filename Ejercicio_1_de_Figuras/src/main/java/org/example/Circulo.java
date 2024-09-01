package org.example;

public class Circulo extends Elipses{

    private Integer radio;

    public Circulo(String semiejes, Figuras figuras) {
        super(semiejes, figuras);
    }

    public Circulo(String semiejes, Figuras figuras, Integer radio) {
        super(semiejes, figuras);
        this.radio = radio;
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }
}
