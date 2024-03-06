package org.juandavid.api.stream;

import org.juandavid.api.stream.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperadorDistictUsuarioSum {

    public static void main(String[] args) {

        IntStream usuario = Stream
                .of("Patí serna", "Paco molina ", "Pepe mena", "Pepe arias",
                        "Pepe Garcia", "Patí serna", "Patí serna", "Patí serna")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(user -> user.toString().length())
                .peek(System.out::println);

        //usuario.forEach(System.out::println);
        IntSummaryStatistics start = usuario.summaryStatistics();
        System.out.println("total numero de letras: " + start.getSum());
        System.out.println("max: " + start.getMax());
        System.out.println("min: "+ start.getMin());
        System.out.println("promedio: "+ start.getAverage());

    }
}
