package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Cereal {
    private String nombre;
    private List<Mineral> requisitos = new ArrayList<Mineral>();

    public Cereal() {
    }

    public Cereal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Mineral> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Mineral> requisitos) {
        this.requisitos = requisitos;
    }

    public void conseguirRequisitos(){};


}
