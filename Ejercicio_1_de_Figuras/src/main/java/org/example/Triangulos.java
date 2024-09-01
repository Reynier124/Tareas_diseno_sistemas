package org.example;

import java.util.List;

public class Triangulos extends Poligonos {

    private String tipo;

    public Triangulos(List<Lados> lados, Figuras figuras, String tipo) {
        super(lados, figuras);
        this.tipo = tipo;
    }

    public Triangulos(List<Lados> lados, Figuras figuras) {
        super(lados, figuras);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
