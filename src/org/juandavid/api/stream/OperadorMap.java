package org.juandavid.api.stream;

import java.util.stream.Stream;

public class OperadorMap {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Patí", "Paco", "pedro", "Pepe")
                .peek(e-> System.out.println(e))
                .map(nombre ->{
                    return nombre.toUpperCase();
                });

                nombres.forEach(System.out::println);
    }
}
