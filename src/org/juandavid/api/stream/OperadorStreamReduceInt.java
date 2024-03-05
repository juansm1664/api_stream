package org.juandavid.api.stream;

import java.util.stream.Stream;

public class OperadorStreamReduceInt {

    public static void main(String[] args) {

        Stream<Integer> nombres = Stream
                    .of(3,5,3,5,4,32,45);
        Integer resultado =  nombres.reduce(0 , Integer::sum);
        System.out.println(resultado);

    }
}
