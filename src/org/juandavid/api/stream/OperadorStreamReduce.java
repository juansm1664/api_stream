package org.juandavid.api.stream;

import java.util.stream.Stream;

public class OperadorStreamReduce {

    public static void main(String[] args) {

        Stream<String> nombres = Stream
                    .of("Patí serna", "Paco molina ", "Pepe mena", "Pepe arias",
                        "Pepe Garcia", "Paco molina" , "Paco molina" , "Paco molina")
                .distinct(); //Lo que está repetido lo agrupa


        String resultado =  nombres.reduce("Resultado Concatenación: ",(a,b)-> a+ " # " + b);
        System.out.println(resultado);

    }
}
