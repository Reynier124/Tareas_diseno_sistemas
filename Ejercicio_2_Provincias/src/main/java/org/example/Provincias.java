package org.example;

public class Provincias {

    private String nombre;
    private Ciudades ciudades;
    private Provincias provincias;

    public Provincias(String nombre) {
        this.nombre = nombre;
    }

    public Provincias() {
    }

    public Provincias(String nombre, Ciudades ciudades, Provincias provincias) {
        this.nombre = nombre;
        this.ciudades = ciudades;
        this.provincias = provincias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudades getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }

    public Provincias getProvincias() {
        return provincias;
    }

    public void setProvincias(Provincias provincias) {
        this.provincias = provincias;
    }
}
