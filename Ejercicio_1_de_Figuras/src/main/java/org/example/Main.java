package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Puntos pt1 = new Puntos(1,1);
        Puntos pt2 = new Puntos(2,3);
        Puntos pt3 = new Puntos(6,4);
        Puntos pt4 = new Puntos(3,1);

        Lados l1 = new Lados(12,pt2);
        Lados l2 = new Lados(6,pt1);
        Lados l3 = new Lados(5,pt3);
        Lados l4 = new Lados(8,pt4);

        List<Lados> ladosTriangle = new ArrayList<>();
        ladosTriangle.add(l1);
        ladosTriangle.add(l2);
        ladosTriangle.add(l3);

        List<Lados> ladosSquare = new ArrayList<>();
        ladosSquare.add(l1);
        ladosSquare.add(l2);
        ladosSquare.add(l3);
        ladosSquare.add(l4);


        Triangulos t1 = new Triangulos(ladosTriangle, "isosceles");
        Cuadrado c1 = new Cuadrado(ladosSquare,"cuadrado",12,48);
        Circulo cl1 = new Circulo(12,20);

        Figuras f1 = new Figuras();
        f1.setTamano("medio");
        //f1.setElipses(cl1);
        /*
        f1.setPoligonos(c1);
        f1.setPoligonos(t1);

        System.out.println("La figura creada es de tamaño: "+f1.getTamano()+" que contiene la siguiente elipse "+f1.getElipses()+
                " y contiene los siguientes poligonos: "+f1.getPoligonos());

         */
        }

}