package org.example;

import java.util.List;

public abstract class Rectangulo extends Cuadrilateros {
    private int base;

    public Rectangulo() {
    }

    public Rectangulo(List<Lados> lados, String tipo_de_cuadrilatero, int base) {
        super(lados, tipo_de_cuadrilatero);
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
