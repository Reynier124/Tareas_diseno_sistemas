package org.example;

public class Circulo extends Elipses {

    private Integer radio;

    public Circulo() {
    }

    public Circulo(int foco, Integer radio) {
        super(foco);
        this.radio = radio;
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", foco=" + getFoco() + "]";
    }
}

