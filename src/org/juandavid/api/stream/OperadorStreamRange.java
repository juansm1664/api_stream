package org.juandavid.api.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperadorStreamRange {

    public static void main(String[] args) {

        IntStream num = IntStream.range(5,23).peek(System.out::println);
        //Integer resultado =  num.reduce(0 , Integer::sum);
        IntSummaryStatistics statistics = num.summaryStatistics(); //Estadistica de los numeros
        //System.out.println(resultado);
        System.out.println(statistics);

    }
}
