package org.juandavid.api.stream.models;

import java.util.stream.Stream;

public class OperadorFilterAnyMatch {

    public static void main(String[] args) {

        Boolean existe = Stream
                .of("Patí serna", "Paco molina ", "Pepe mena", "Pepe arias", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(user -> user.getId().equals(3)); // mira si existe en los valores de Stream -> devuelve true o false

        System.out.println(existe);


    }
}
