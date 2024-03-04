package org.juandavid.api.stream;

import org.juandavid.api.stream.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OperadorFilterSingle {

    public static void main(String[] args) {

        Usuario usuario = Stream
                .of("Patí serna", "Paco molina ", "Pepe mena", "Pepe arias", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(user -> user.getId().equals(3))
                .findFirst().get();

        System.out.println(usuario);


    }
}
