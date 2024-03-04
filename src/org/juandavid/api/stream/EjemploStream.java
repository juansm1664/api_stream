package org.juandavid.api.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Patí", "Paco", "pedro", "Pepe");

        //OPerador final, siempre debemos llamar para ser uno de stream
        nombres.forEach(System.out::println);

        //A partir de un arreglo
        String[] arr = {"Patí","Paco","pedro","","pepe"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);

        Stream<String> names = Stream.<String>builder()
                .add("Pedro")
                .add("Paco")
                .add("Pati")
                .add("Pepe")
                .add("Polo")
                .build();
        names.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("Maria");
        lista.add("Mar");
        lista.add("Miranda");
        lista.add("Manuela");
        Stream<String> nombres2 = lista.stream();
        nombres2.forEach(System.out::println);
    }
}
