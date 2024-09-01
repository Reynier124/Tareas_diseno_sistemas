package org.example;

import java.util.List;

public abstract class Rectangulo extends Cuadrilateros {

    private Integer lados_iguales_1;
    private Integer lados_iguales_2;

    public Rectangulo(List<Lados> lados, Figuras figuras, String tipo_de_cuadrilatero, Integer lados_iguales_1, Integer lados_iguales_2) {
        super(lados, figuras, tipo_de_cuadrilatero);
        this.lados_iguales_1 = lados_iguales_1;
        this.lados_iguales_2 = lados_iguales_2;
    }

    public Rectangulo(List<Lados> lados, Figuras figuras, String tipo_de_cuadrilatero) {
        super(lados, figuras, tipo_de_cuadrilatero);
    }


    public Integer getLados_iguales_1() {
        return lados_iguales_1;
    }

    public void setLados_iguales_1(Integer lados_iguales_1) {
        this.lados_iguales_1 = lados_iguales_1;
    }

    public Integer getLados_iguales_2() {
        return lados_iguales_2;
    }

    public void setLados_iguales_2(Integer lados_iguales_2) {
        this.lados_iguales_2 = lados_iguales_2;
    }
}
