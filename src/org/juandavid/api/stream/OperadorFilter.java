package org.juandavid.api.stream;

import org.juandavid.api.stream.models.Usuario;

import java.util.List;
import java.util.stream.Stream;

public class OperadorFilter {

    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Patí serna", "Paco molina ", "Pepe mena", "Pepe arias", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                //.filter(user -> user.getNombre().equals("Pepe"))
                .flatMap(user ->{
                    if(user.getNombre().equals("Pepe")){
                        return Stream.of(user);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

        List<Usuario> lista = nombres.toList();
        lista.forEach(System.out::println);


    }
}
