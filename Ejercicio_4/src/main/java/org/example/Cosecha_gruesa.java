package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cosecha_gruesa extends Cereal{
    public Cosecha_gruesa() {
    }

    public Cosecha_gruesa(String nombre) {
        super(nombre);
    }
    @Override
    public void conseguirRequisitos(){
        Mineral m1 = new Mineral("secundario","potasio",12);
        Mineral m2 = new Mineral("secundario","fosforo",8);
        Mineral m3 = new Mineral("secundario","nitrogeno",9);
        Mineral m4 = new Mineral("primario","calcio",2);
        List<Mineral> minerales = new ArrayList<>();
        minerales.add(m1);
        minerales.add(m2);
        minerales.add(m3);
        minerales.add(m4);
        this.setRequisitos(minerales);
    }
}
