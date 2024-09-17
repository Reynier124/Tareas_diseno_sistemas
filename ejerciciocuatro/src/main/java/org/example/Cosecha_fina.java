package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cosecha_fina extends Cereal{

    public Cosecha_fina() {
    }

    public Cosecha_fina(String nombre) {
        super(nombre);
    }
    @Override
    public void conseguirRequisitos(){
        Mineral m1 = new Mineral("secundario","potasio",6);
        Mineral m2 = new Mineral("secundario","fosforo",3);
        Mineral m3 = new Mineral("secundario","nitrogeno",8);
        List<Mineral> minerales = new ArrayList<>();
        minerales.add(m1);
        minerales.add(m2);
        minerales.add(m3);
        this.setRequisitos(minerales);
    }
}
