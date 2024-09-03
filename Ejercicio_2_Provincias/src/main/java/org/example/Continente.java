package org.example;

public class Continente {

    private String nombre;
    private Pais paises;

    public Continente(String nombre) {
        this.nombre = nombre;
    }

    public Continente() {
    }

    public Continente(String nombre, Pais paises) {
        this.nombre = nombre;
        this.paises = paises;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPaises() {
        return paises;
    }

    public void setPaises(Pais paises) {
        this.paises = paises;
    }
}
