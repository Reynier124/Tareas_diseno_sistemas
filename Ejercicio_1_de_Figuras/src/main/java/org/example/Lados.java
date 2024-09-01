package org.example;

public class Lados {

    private Integer longitud;
    private Puntos puntos;

    public Lados() {
    }

    public Lados(Integer longitud, Puntos puntos) {
        this.longitud = longitud;
        this.puntos = puntos;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Puntos getPuntos() {
        return puntos;
    }

    public void setPuntos(Puntos puntos) {
        this.puntos = puntos;
    }
}
