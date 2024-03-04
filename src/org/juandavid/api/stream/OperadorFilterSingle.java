package org.juandavid.api.stream;

import org.juandavid.api.stream.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OperadorFilterSingle {

    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Patí serna", "Paco molina ", "Pepe mena", "Pepe arias", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(user -> user.getNombre().equals("Pepe"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println(usuario);


    }
}
