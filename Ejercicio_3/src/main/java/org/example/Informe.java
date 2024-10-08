package org.example;

import java.util.ArrayList;
import java.util.List;

public class Informe {
    public Informe() {
    }

    public List<Ciudad> realizarInforme(Provincia provincia) {
        List<Ciudad> ciudadesDeficit = new ArrayList<>();
        for (Ciudad c : provincia.getCiudades()) {
            if (c.getHabitantes()) {
                c.calcularRecuadacion();
                if (c.calcularDeficit() < 0) {
                    ciudadesDeficit.add(c);
                }
            }
        }
        int ciudades_sin_deficit = (provincia.getCiudades().size() - ciudadesDeficit.size());
            if (ciudades_sin_deficit > ciudadesDeficit.size()) {
                System.out.println("La provincia " + provincia.getNombre() + " tiene balance positivo");
            } else if (ciudades_sin_deficit < ciudadesDeficit.size()) {
                System.out.println("La provincia " + provincia.getNombre() + " tiene balance negativo");
            } else if (ciudades_sin_deficit == ciudadesDeficit.size()) {
                System.out.println("La provincia " + provincia.getNombre() + " tiene balance neutro");
            }

            return ciudadesDeficit;
        }
    }
