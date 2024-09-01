package org.example;

import java.util.List;

public class Triangulos extends Poligonos {
    private String tipo;

    public Triangulos() {
    }

    public Triangulos(List<Lados> lados, String tipo) {
        super(lados);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Triangulos [tipo=" + tipo + ", lados=" + getLados() + "]";
    }
}


