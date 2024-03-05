package org.juandavid.api.stream;

import java.util.stream.Stream;

public class OperadorDistinct {

    public static void main(String[] args) {

        Stream<String> nombres = Stream
                    .of("Patí serna", "Paco molina ", "Pepe mena", "Pepe arias",
                        "Pepe Garcia", "Paco molina" , "Paco molina" , "Paco molina")
                .distinct(); //Lo que está repetido lo agrupa


                nombres.forEach(System.out::println);

    }
}
