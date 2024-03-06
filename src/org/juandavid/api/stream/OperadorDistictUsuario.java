package org.juandavid.api.stream;

import org.juandavid.api.stream.models.Usuario;

import java.util.stream.Stream;

public class OperadorDistictUsuario {

    public static void main(String[] args) {

        Stream<Usuario> usuario = Stream
                .of("Patí serna", "Paco molina ", "Pepe mena", "Pepe arias",
                        "Pepe Garcia", "Patí serna", "Patí serna", "Patí serna")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();
        usuario.forEach(System.out::println);

    }
}
