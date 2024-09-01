package org.example;

public class Figuras {

    private String tamano;
    private Elipses elipses;
    private Poligonos poligonos;

    public Figuras(Elipses elipses, Poligonos poligonos, String tamano) {
        this.elipses = elipses;
        this.poligonos = poligonos;
        this.tamano = tamano;
    }

    public Figuras() {
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Elipses getElipses() {
        return elipses;
    }

    public void setElipses(Elipses elipses) {
        this.elipses = elipses;
    }

    public Poligonos getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(Poligonos poligonos) {
        this.poligonos = poligonos;
    }

}
