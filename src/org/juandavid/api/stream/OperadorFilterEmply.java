package org.juandavid.api.stream;

import org.juandavid.api.stream.models.Usuario;

import java.util.stream.Stream;

public class OperadorFilterEmply {

    public static void main(String[] args) {

        Long count = Stream
                .of("Patí serna", "Paco molina ", "", "Pepe arias", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("count " + count);


    }
}
