package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pastura extends Cereal {

    public Pastura() {
    }

    public Pastura(String nombre) {
        super(nombre);
    }

    @Override
    public void conseguirRequisitos(){
        Mineral m1 = new Mineral("secundario","potasio",3);
        Mineral m2 = new Mineral("secundario","fosforo",1);
        List<Mineral> minerales = new ArrayList<>();
        minerales.add(m1);
        minerales.add(m2);
        this.setRequisitos(minerales);
    }


}
