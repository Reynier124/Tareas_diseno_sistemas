package org.example;

import java.util.List;

public abstract class Poligonos {

    private List<Lados> lados;

    public Poligonos() {
    }

    public Poligonos(List<Lados> lados) {
        this.lados = lados;
    }

    public List<Lados> getLados() {
        return lados;
    }

    public void setLados(List<Lados> lados) {
        this.lados = lados;
    }
}
