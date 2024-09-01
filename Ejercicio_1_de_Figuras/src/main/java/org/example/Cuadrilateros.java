package org.example;

import java.util.List;

public abstract class Cuadrilateros extends Poligonos{

    private String tipo_de_cuadrilatero;

    public Cuadrilateros(List<Lados> lados, Figuras figuras, String tipo_de_cuadrilatero) {
        super(lados, figuras);
        this.tipo_de_cuadrilatero = tipo_de_cuadrilatero;
    }

    public Cuadrilateros(List<Lados> lados, Figuras figuras) {
        super(lados, figuras);
    }

    public String getTipo_de_cuadrilatero() {
        return tipo_de_cuadrilatero;
    }

    public void setTipo_de_cuadrilatero(String tipo_de_cuadrilatero) {
        this.tipo_de_cuadrilatero = tipo_de_cuadrilatero;
    }
}
