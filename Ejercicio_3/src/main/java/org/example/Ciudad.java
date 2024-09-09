package org.example;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private Boolean habitantes;
    private Float gastoTotal;
    private Float recaudacionTotal;
    private Impuestos[] impuestos = new Impuestos[5];


    public float calcularDeficit(){
        return recaudacionTotal - gastoTotal;
    }

    public void calcularRecuadacion(){
        for(int i = 0 ; i < impuestos.length; i++){
            recaudacionTotal += impuestos[i].calcular();
        }

    }
}
