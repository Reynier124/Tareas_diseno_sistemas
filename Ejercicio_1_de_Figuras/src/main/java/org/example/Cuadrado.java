package org.example;

import java.util.List;

public class Cuadrado extends Rectangulo{

    private Integer area;

    public Cuadrado(List<Lados> lados, Figuras figuras, String tipo_de_cuadrilatero, Integer lados_iguales_1, Integer lados_iguales_2, Integer area) {
        super(lados, figuras, tipo_de_cuadrilatero, lados_iguales_1, lados_iguales_2);
        this.area = area;
    }

    public Cuadrado(List<Lados> lados, Figuras figuras, String tipo_de_cuadrilatero, Integer lados_iguales_1, Integer lados_iguales_2) {
        super(lados, figuras, tipo_de_cuadrilatero, lados_iguales_1, lados_iguales_2);
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }
}
