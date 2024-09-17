package org.example;

import java.util.ArrayList;

public class Lote {
    private String tipo;
    private Integer id;
    private Boolean pastura;
    private ArrayList<Mineral> mineral = new ArrayList<Mineral>(); //agregacion
    private Cereal cereal; //asociacion


    public Lote() {
    }

    public Lote(String tipo, Integer id, Boolean pastura) {
        this.tipo = tipo;
        this.id = id;
        this.pastura = pastura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getPastura() {
        return pastura;
    }

    public void setPastura(Boolean pastura) {
        this.pastura = pastura;
    }

    public ArrayList<Mineral> getMineral() {
        return mineral;
    }

    public void setMineral(ArrayList<Mineral> mineral) {
        this.mineral = mineral;
    }

    public Cereal getCereal() {
        return cereal;
    }

    public void setCereal(Cereal cereal) {
        this.cereal = cereal;
    }

    public void clasificarTipo( ){
        for (Mineral m: mineral){
            if (m.getTipo() == "primario" ) {
                this.tipo = "especial";
            }
            else {
                this.tipo = "comun";
            }
        }
    }
    public Boolean Sembrar(Cereal c){
        for (Mineral m: c.getRequisitos()){
            for (Mineral m2: mineral){
                if (m.getTipo() == m2.getTipo()){
                    if (m.getCantidad() > m2.getCantidad()){
                        return false;
                    }
                    else {
                        Integer nueva_cantidad = m2.getCantidad() - m.getCantidad();
                        m2.setCantidad(nueva_cantidad);
                    }
                }
            }
        }
        if (c.getNombre() == "alfalfa"){
            if (pastura == true){
                return false;
            }
            else {
                return true;
            }
        }
        return true;
    }
}
