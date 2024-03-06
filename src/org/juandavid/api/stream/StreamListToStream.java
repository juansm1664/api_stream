package org.juandavid.api.stream;

import org.juandavid.api.stream.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamListToStream {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Juan","Serna"));
        lista.add(new Usuario("Pepe","molina"));
        lista.add(new Usuario("Luci","Pastraña"));
        lista.add(new Usuario("Sergio","Gonzales"));
        lista.add(new Usuario("Laura ","Ortiz"));
        lista.add(new Usuario("Pepe","lalo"));


        Stream<String> nombres =  lista.stream()
                .map(user ->user.getNombre().toUpperCase().concat(" ")
                .concat(user.getApellido().toUpperCase()))
                .flatMap(nombre ->{
                    if(nombre.contains("Pepe".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(nombres.count());
    }
}
