package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Provincias
        Provincia p1 = new Provincia("Mendoza");
        Provincia p2 = new Provincia("Buenos Aires");
        //Ciudades de Mendoza
        Ciudad c1 = new Ciudad("Guaymallen", true, 34890.77F);
        Ciudad c2 = new Ciudad("Godoy Cruz", true, 12366.34F);
        Ciudad c3 = new Ciudad("Las Heras", true, 128312.56F);
        Ciudad c4 = new Ciudad("San Martin", false, 50000.00F);
        //Ciudades de Buenos Aires
        Ciudad c5 = new Ciudad("Palermo", true, 45999.23F);
        Ciudad c6 = new Ciudad("CABA", true, 98546.33F);
        //Impuestos
        Imp1 im1 = new Imp1("Renta","Clase alta", 50000, 0.56F);
        Imp1 im2 = new Imp1("Renta","Clase alta", 72390, 0.23F);
        Imp2 im3 = new Imp2("Vehiculos","Trabador", 22340, 0.15F);
        Imp3 im4 = new Imp3("Ingresos","Empresa", 126934, 0.43F);
        Imp4 im5 = new Imp4("Comida","Persona Fisica", 68900, 0.21F);
        Imp5 im6 = new Imp5("Luz","Persona Fisica", 23743, 0.54F);

        //Agregar ciudades a provincias
        List<Ciudad> ciudades_mendoza = new ArrayList<>();
        ciudades_mendoza.add(c1);
        ciudades_mendoza.add(c2);
        ciudades_mendoza.add(c3);
        ciudades_mendoza.add(c4);
        p1.setCiudades(ciudades_mendoza);

        List<Ciudad> ciudades_buenos_aires = new ArrayList<>();
        ciudades_buenos_aires.add(c5);
        ciudades_buenos_aires.add(c6);
        p2.setCiudades(ciudades_buenos_aires);

        //Hacer listas de impuestos
        List<Impuestos> impuestosMendoza = new ArrayList<>();
        impuestosMendoza.add(im1);
        impuestosMendoza.add(im3);
        impuestosMendoza.add(im4);
        impuestosMendoza.add(im5);
        impuestosMendoza.add(im6);

        List<Impuestos> impuestosBuenosAires = new ArrayList<>();
        impuestosBuenosAires.add(im2);
        impuestosBuenosAires.add(im3);
        impuestosBuenosAires.add(im4);
        impuestosBuenosAires.add(im5);
        impuestosBuenosAires.add(im6);

        //Agregar impuestos a las Ciudades de Mendoza
        c1.setImpuestos(impuestosMendoza);
        c2.setImpuestos(impuestosMendoza);
        c3.setImpuestos(impuestosMendoza);
        c4.setImpuestos(impuestosMendoza);

        //Agregar impuestos a las ciudades de Buenos Aires
        c5.setImpuestos(impuestosBuenosAires);
        c6.setImpuestos(impuestosBuenosAires);

        //Realizar informes
        Informe if1 = new Informe();
        Informe if2 = new Informe();

        if1.realizarInforme(p1);
        if2.realizarInforme(p2);
    }
}