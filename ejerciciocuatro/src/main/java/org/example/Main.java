package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Minerales
        Mineral m1 = new Mineral("secundario","potasio",12);
        Mineral m2 = new Mineral("secundario","fosforo",8);
        Mineral m3 = new Mineral("secundario","nitrogeno",9);
        Mineral m4 = new Mineral("primario","calcio",2);

        //Pastura
        Pastura p1 = new Pastura("alfalfa");
        Pastura p2 = new Pastura("trebol subterraneo");
        p1.conseguirRequisitos();
        p2.conseguirRequisitos();

        //Cosecha Fina
        Cosecha_fina cf1 = new Cosecha_fina("trigo");
        Cosecha_fina cf2 = new Cosecha_fina("avena");
        cf1.conseguirRequisitos();
        cf2.conseguirRequisitos();

        //Cosecha Gruesa
        Cosecha_gruesa cg1 = new Cosecha_gruesa("girasol");
        Cosecha_gruesa cg2 = new Cosecha_gruesa("maiz");
        cg1.conseguirRequisitos();
        cg2.conseguirRequisitos();


        // Crear lista de minerales
        ArrayList<Mineral> requisitos = new ArrayList<>();
        requisitos.add(m1);
        requisitos.add(m2);
        requisitos.add(m3);
        requisitos.add(m4);

        //Lote
        Lote l1 = new Lote("",1,false);
        l1.setMineral(requisitos);

        // Clasificar el tipo de lote basado en los minerales
        l1.clasificarTipo();
        System.out.println("El tipo de lote es: " + l1.getTipo());

        // Verificar si se puede sembrar Cosecha Fina en el lote
        boolean SembrarFina = l1.Sembrar(cf1);
        if (SembrarFina) {
            System.out.println("Se puede sembrar cosecha fina en el lote.");
        } else {
            System.out.println("No se puede sembrar cosecha fina en el lote.");
        }

        // Verificar si se puede sembrar Cosecha Gruesa en el lote
        boolean SembrarGruesa = l1.Sembrar(cg1);
        if (SembrarGruesa) {
            System.out.println("Se puede sembrar cosecha gruesa en el lote.");
        } else {
            System.out.println("No se puede sembrar cosecha gruesa en el lote.");
        }

        // Verificar si se puede sembrar Pastura en el lote
        boolean SembrarPastura = l1.Sembrar(p1);
        if (SembrarPastura) {
            System.out.println("Se puede sembrar pastura en el lote.");
        } else {
            System.out.println("No se puede sembrar pastura en el lote.");
        }






    }
}