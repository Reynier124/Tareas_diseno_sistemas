package org.example;

import org.example.entidades.*;
import org.example.repositorios.InMemoryRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Inicializar repositorios
        InMemoryRepository<Continente> continenteRepository = new InMemoryRepository<>();
        InMemoryRepository<Pais> paisRepository = new InMemoryRepository<>();
        InMemoryRepository<Provincias> provinciaRepository = new InMemoryRepository<>();
        InMemoryRepository<Ciudades> ciudadRepository = new InMemoryRepository<>();

        System.out.println(" -----------PROBAMOS EL SISTEMA ----------");

        // Crear continentes
        Continente america = Continente.builder()
                .nombre("América")
                .build();

        Continente europa = Continente.builder()
                .nombre("Europa")
                .build();

        // Crear países en América
        Pais argentina = Pais.builder()
                .nombre("Argentina")
                .continente(america)
                .build();

        Pais uruguay = Pais.builder()
                .nombre("Uruguay")
                .continente(america)
                .build();

        // Crear provincias en Argentina
        Provincias mendoza = Provincias.builder()
                .nombre("Mendoza")
                .pais(argentina)
                .build();

        Provincias sanJuan = Provincias.builder()
                .nombre("San Juan")
                .pais(argentina)
                .build();

        // Crear provincias en Uruguay
        Provincias montevideo = Provincias.builder()
                .nombre("Montevideo")
                .pais(uruguay)
                .build();

        // Crear ciudades en Mendoza
        Ciudades ciudadDeMendoza = Ciudades.builder()
                .nombre("Ciudad de Mendoza")
                .provincia(mendoza)
                .build();

        // Crear ciudades en Montevideo
        Ciudades ciudadDeMontevideo = Ciudades.builder()
                .nombre("Ciudad de Montevideo")
                .provincia(montevideo)
                .build();

        // Asociar países a continentes
        america.setPaises(new HashSet<>(Set.of(argentina, uruguay)));
        europa.setPaises(new HashSet<>());  // Ejemplo de continente sin países (por ahora)

        // Asociar provincias a países
        argentina.setProvincias(new HashSet<>(Set.of(mendoza, sanJuan)));
        uruguay.setProvincias(new HashSet<>(Set.of(montevideo)));

        // Asociar ciudades a provincias
        mendoza.setCiudades(new HashSet<>(Set.of(ciudadDeMendoza)));
        montevideo.setCiudades(new HashSet<>(Set.of(ciudadDeMontevideo)));

        // Guardar continentes, países, provincias y ciudades en sus respectivos repositorios
        continenteRepository.save(america);
        continenteRepository.save(europa);

        paisRepository.save(argentina);
        paisRepository.save(uruguay);

        provinciaRepository.save(mendoza);
        provinciaRepository.save(sanJuan);
        provinciaRepository.save(montevideo);

        ciudadRepository.save(ciudadDeMendoza);
        ciudadRepository.save(ciudadDeMontevideo);

        // Mostrar todos los continentes
        System.out.println("Todos los continentes:");
        List<Continente> todosLosContinentes = continenteRepository.findAll();
        todosLosContinentes.forEach(System.out::println);

        // Mostrar todos los países de América
        System.out.println("Países en América:");
        Optional<Continente> continenteAmerica = continenteRepository.findById(1L);
        if (continenteAmerica.isPresent()) {
            Set<Pais> paisesEnAmerica = continenteAmerica.get().getPaises();
            paisesEnAmerica.forEach(System.out::println);
        } else {
            System.out.println("Continente América no encontrado.");
        }

        // Mostrar todas las provincias de Argentina
        System.out.println("Provincias en Argentina:");
        Optional<Pais> paisArgentina = paisRepository.findById(1L);
        if (paisArgentina.isPresent()) {
            Set<Provincias> provinciasEnArgentina = paisArgentina.get().getProvincias();
            provinciasEnArgentina.forEach(System.out::println);
        } else {
            System.out.println("País Argentina no encontrado.");
        }

        // Mostrar todas las ciudades de Mendoza
        System.out.println("Ciudades en Mendoza:");
        Optional<Provincias> provinciaMendoza = provinciaRepository.findById(1L);
        if (provinciaMendoza.isPresent()) {
            Set<Ciudades> ciudadesEnMendoza = provinciaMendoza.get().getCiudades();
            ciudadesEnMendoza.forEach(System.out::println);
        } else {
            System.out.println("Provincia Mendoza no encontrada.");
        }

        // Actualizar nombre de una ciudad
        Ciudades ciudadActualizada = Ciudades.builder()
                .id(1L)
                .nombre("Ciudad de Mendoza Actualizada")
                .provincia(mendoza)
                .build();

        ciudadRepository.genericUpdate(1L, ciudadActualizada);
        Optional<Ciudades> ciudadVerificada = ciudadRepository.findById(1L);
        ciudadVerificada.ifPresent(c -> System.out.println("Ciudad después de la actualización: " + c));

        // Eliminar un país por ID
        paisRepository.genericDelete(2L);
        Optional<Pais> paisEliminado = paisRepository.findById(2L);
        if (paisEliminado.isEmpty()) {
            System.out.println("El país con ID 2 ha sido eliminado.");
        }

        // Mostrar todos los países restantes en América
        System.out.println("Países en América después de la eliminación:");
        continenteAmerica = continenteRepository.findById(1L);
        if (continenteAmerica.isPresent()) {
            Set<Pais> paisesRestantes = continenteAmerica.get().getPaises();
            paisesRestantes.forEach(System.out::println);
        }
    }
}
