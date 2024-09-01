package org.example;

public class Lados {

    private Integer longitud;
    private Puntos puntos = new [2]Puntos;

    public Lados(Integer longitud) {
        this.longitud = longitud;
    }

    public Lados() {
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }
}
