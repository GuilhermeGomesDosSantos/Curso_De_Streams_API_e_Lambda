package org.example.Aula_03;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Java8_Streams_Reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        List<Integer> listNull = Arrays.asList();
        String s = "Guilherme Gomes dos Santos";
        String[] split = s.split(" ");
        List<String> listStr = Arrays.asList(split);

        //soma
        /*
        Optional<Integer> soma = list.stream().reduce((n1, n2) -> n1 + n2);
        System.out.println(soma.get());
        */
        //multiplicação
        /*
        Optional<Integer> multiplicacao = list.stream().reduce((n1, n2) -> n1 * n2);
        System.out.println(multiplicacao.get());
         */
        /*
        Optional<String> concatenacao = listStr.stream().reduce((s1, s2)-> s1.concat(s2));
        System.out.println(concatenacao.get());
         */

        Integer soma = list.stream().reduce(0,(n1,n2)-> n1 + n2);
        System.out.println(soma);

        Integer multi = list.stream().reduce(1, (n1, n2) -> n1 * n2);
        System.out.println(multi);

        String concat = listStr.stream().reduce("", (s1, s2) -> s1 + s2);
        System.out.println(concat);

        Integer listaVazia = listNull.stream().reduce(0, (n1, n2)-> n1 + n2);
        System.out.println(listaVazia);

        // reduce - menor valor
        double menorValor = DoubleStream.of(1.5, 2.9, 6.7).reduce(Double.POSITIVE_INFINITY, (d1, d2) -> Math.min(d1, d2));
        System.out.println(menorValor);

        Integer soma3 = list.stream().reduce(0, (n1, n2) -> n1 + n2, (n1, n2) -> n1 + n2);
        System.out.println(soma3);

        String reduce = list.stream()
                .reduce(
                        "",
                        (n1, n2) -> n1.toString().concat(n2.toString()),
                        (n1, n2) -> n1.concat(n2)
                );

        System.out.println(reduce);



    }
}
