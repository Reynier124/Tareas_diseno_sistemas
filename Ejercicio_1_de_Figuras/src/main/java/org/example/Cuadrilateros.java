package org.example;

import java.util.List;

public abstract class Cuadrilateros extends Poligonos{

    private String tipo_de_cuadrilatero;

    public Cuadrilateros() {
    }

    public Cuadrilateros(List<Lados> lados, String tipo_de_cuadrilatero) {
        super(lados);
        this.tipo_de_cuadrilatero = tipo_de_cuadrilatero;
    }

    public String getTipo_de_cuadrilatero() {
        return tipo_de_cuadrilatero;
    }

    public void setTipo_de_cuadrilatero(String tipo_de_cuadrilatero) {
        this.tipo_de_cuadrilatero = tipo_de_cuadrilatero;
    }
}
