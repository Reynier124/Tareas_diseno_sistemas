package org.example;

public class Ciudades {

    private Boolean capital;
    private String nombre;

    public Ciudades(String nombre) {
        this.nombre = nombre;
    }

    public Ciudades() {
    }

    public Ciudades(Boolean capital, String nombre) {
        this.capital = capital;
        this.nombre = nombre;
    }

    public Boolean getCapital() {
        return capital;
    }

    public void setCapital(Boolean capital) {
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
