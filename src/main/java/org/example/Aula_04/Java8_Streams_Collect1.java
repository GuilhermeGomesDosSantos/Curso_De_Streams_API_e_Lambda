package org.example.Aula_04;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Java8_Streams_Collect1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4,5, 6);

        HashSet<String> collect = list.stream().collect(
                ()-> new HashSet<>(),
                (l, e) -> l.add(e.toString()),
                (l1, l2) -> l1.addAll(l2));

        System.out.println(collect);

        Set<Integer> collect2 = list.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(collect2);

        List<Integer> collect3 = list.stream()
                .filter((n) -> n % 2 == 0)
                .collect(Collectors.toCollection(() -> new LinkedList<>()));
        System.out.println(collect3);

        //joining
        String join = list.stream()
                .map(n -> n.toString())
                .collect(Collectors.joining(","));
        System.out.println(join);

        // averaging -> traz a média de todos os valores
        Double media = list.stream()
                .collect(Collectors.averagingInt(n -> n.intValue()));
        System.out.println(media);

        // summing -> traz a soma de todos os valores
        Integer soma = list.stream()
                .collect(Collectors.summingInt(n -> n.intValue()));
        System.out.println(soma );

        //summarizing
        IntSummaryStatistics soma2 = list.stream()
                .collect(Collectors.summarizingInt(n -> n.intValue()));

        System.out.println("Média: " + soma2.getAverage());
        System.out.println("Total de elementos: " + soma2.getCount());
        System.out.println("N° Maior: " + soma2.getMax());
        System.out.println("N° Menor: " + soma2.getMin());
        System.out.println("Soma: " + soma2.getSum());

        //couting -> retorna a quantidade de itens
        Long totalItens = list.stream()
                .filter(n -> n>3)
                .collect(Collectors.counting());

        System.out.println(totalItens);

        list.stream()
                .collect(Collectors.maxBy(Comparator.naturalOrder()))
                .ifPresent(System.out::println);

        list.stream()
                .collect(Collectors.minBy(Comparator.naturalOrder()))
                .ifPresent(System.out::println);

        //groupingBy
        Map<Integer, List<Integer>> collect4 = list.stream()
                .collect(Collectors.groupingBy((n) -> n % 3));
        System.out.println(collect4);

        //partitioningBy
        Map<Boolean, List<Integer>> partitioningBy = list.stream()
                .collect(Collectors.partitioningBy((n) -> n % 2 == 0));
        System.out.println(partitioningBy);

        // toMap
        Map<Integer, Integer> toMap = list.stream()
                .collect(Collectors.toMap(n -> n, n -> n * 2));
        System.out.println();
    }

}
