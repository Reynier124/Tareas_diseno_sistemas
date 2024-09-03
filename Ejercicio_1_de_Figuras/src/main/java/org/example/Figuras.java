package org.example;

import java.util.List;

public class Figuras {

    private String tamano;
    private List<Elipses> elipses;
    private List<Poligonos> poligonos;

    public Figuras(String tamano, List<Elipses> elipses, List<Poligonos> poligonos) {
        this.tamano = tamano;
        this.elipses = elipses;
        this.poligonos = poligonos;
    }

    public Figuras() {
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public List<Elipses> getElipses() {
        return elipses;
    }

    public void setElipses(Elipses elipse) {
        elipses.add(elipse);
    }

    public List<Poligonos> getPoligonos() {
        return poligonos;
    }

    public void setPoligonos(Poligonos poligono) {
        poligonos.add(poligono);
    }

}
