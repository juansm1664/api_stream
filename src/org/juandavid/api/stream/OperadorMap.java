package org.juandavid.api.stream;

import org.juandavid.api.stream.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperadorMap {

    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Patí serna", "Paco molina ", "pedro mena", "Pepe arias")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre = usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> lista = nombres.toList();
        lista.forEach(System.out::println);


    }
}
