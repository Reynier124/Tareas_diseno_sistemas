package org.example;

import java.util.List;

public class Cuadrado extends Rectangulo {

    private Integer area;

    public Cuadrado() {
    }

    public Cuadrado(List<Lados> lados, String tipo_de_cuadrilatero, int base, Integer area) {
        super(lados, tipo_de_cuadrilatero, base);
        this.area = area;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Cuadrado [area=" + area + ", base=" + getBase() + ", tipo_de_cuadrilatero=" + getTipo_de_cuadrilatero() + ", lados=" + getLados() + "]";
    }
}


