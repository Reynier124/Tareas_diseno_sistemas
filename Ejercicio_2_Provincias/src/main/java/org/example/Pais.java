package org.example;

public class Pais {

    private Pais pais;
    private String nombre;
    private Integer pbi;
    private Provincias provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public Pais() {
    }

    public Pais(Pais pais, String nombre, Integer pbi, Provincias provincias) {
        this.pais = pais;
        this.nombre = nombre;
        this.pbi = pbi;
        this.provincias = provincias;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPbi() {
        return pbi;
    }

    public void setPbi(Integer pbi) {
        this.pbi = pbi;
    }

    public Provincias getProvincias() {
        return provincias;
    }

    public void setProvincias(Provincias provincias) {
        this.provincias = provincias;
    }
}
