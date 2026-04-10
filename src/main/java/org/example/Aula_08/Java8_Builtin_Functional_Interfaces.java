package org.example.Aula_08;

import com.sun.source.doctree.SeeTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Java8_Builtin_Functional_Interfaces {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // Supplier fornecedor
        Stream.generate(() -> new Random().nextInt())
                .limit(5)
                .forEach(System.out::println);

        //Predicate
        list.stream()
                .filter((n) -> n % 2 == 0)
                .forEach(System.out::println);

        list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n.doubleValue())
                .forEach(System.out::println);

        //UnaryOperator
        list.stream()
                .filter(e -> e % 2 == 0)
                .map(n -> n.doubleValue())
                .reduce((n1, n2) -> n1 + n2)
                .ifPresent(System.out::println);
    }
}
