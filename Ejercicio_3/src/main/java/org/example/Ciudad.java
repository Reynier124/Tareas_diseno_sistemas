package org.example;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private Boolean habitantes;
    private Float gastoTotal;
    private Float recaudacionTotal;
    private Impuestos[] impuestos = new Impuestos[5];

    public Ciudad() {
    }

    public Ciudad(String nombre, Boolean habitantes, Float gastoTotal) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.gastoTotal = gastoTotal;
        this.recaudacionTotal = 0.0F;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Boolean habitantes) {
        this.habitantes = habitantes;
    }

    public Float getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(Float gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    public Float getRecaudacionTotal() {
        return recaudacionTotal;
    }

    public void setRecaudacionTotal(Float recaudacionTotal) {
        this.recaudacionTotal = recaudacionTotal;
    }

    public Impuestos[] getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Impuestos[] impuestos) {
        this.impuestos = impuestos;
    }

    public float calcularDeficit(){
        return recaudacionTotal - gastoTotal;
    }

    public void calcularRecuadacion(){
        for(int i = 0 ; i < impuestos.length; i++){
            recaudacionTotal += impuestos[i].calcular();
        }

    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", gastoTotal=" + gastoTotal +
                ", recaudacionTotal=" + recaudacionTotal +
                '}';
    }
}
