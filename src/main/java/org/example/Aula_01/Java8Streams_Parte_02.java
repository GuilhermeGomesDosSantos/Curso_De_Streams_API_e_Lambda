package org.example.Aula_01;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams_Parte_02 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        //OBS: Quando eu chamo uma operação final, o meu stream está fechado, não consigo fazer outra operação com ele
        /*Stream<Integer> map = lista.stream()
                .limit(3)
                .map(e -> e * 2);
        map.forEach(e -> System.out.println(e));
         */
        //count, retorna a quantidade de itens que ficou no stream
        /*long count = lista.stream()
                .limit(3)
                .count();
        System.out.println(count);*/

        /*long count = lista.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println(count);*/

        //min, é necessário passar um comparador para ele, para poder falar o menor valor
        /*Optional<Integer> min = lista.stream()
//                .filter(n -> n % 2 == 0)
                .min(Comparator.naturalOrder());
        System.out.println(min.get());
         */

        //max, é necessário passar um comparador para ele, para poder falar o maior valor
        /*Optional<Integer> max = lista.stream()
                .filter(n -> n % 2 == 0)
                .max(Comparator.naturalOrder());
        System.out.println(max.get());
         */

        //collect, serve para transformar, agrupar ou armazenar os elementos processados por um Stream em um contêiner final
        /*List<Integer> novaLista = lista.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 3)
                .collect(Collectors.toList());
        System.out.println(novaLista);*/

        //groupingBy, é utilizado para agrupar elementos de uma coleção
        /*Map<Boolean, List<Integer>> mapa = lista.stream()
                .map(e -> e * 3)
                .collect(Collectors.groupingBy(e -> e % 2 == 0));

        System.out.println(mapa);*/

        /*Map<Integer, List<Integer>> mapa = lista.stream()
                .collect(Collectors.groupingBy(n -> n % 3));
        System.out.println(mapa);*/

        //joining, só trabalha com Strings, onde ele agrupa somente valores de strings
        String collect = lista.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(";"));
        System.out.println(collect);
    }
}
