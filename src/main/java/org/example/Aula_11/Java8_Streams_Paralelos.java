package org.example.Aula_11;

import java.util.Arrays;
import java.util.List;

public class Java8_Streams_Paralelos {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        /*
        list.parallelStream().forEach(System.out::println);
        list.parallelStream().forEachOrdered(System.out::println);
         */

        //findAny
        /*
        list.parallelStream().findAny().ifPresent(System.out::println);
        list.stream().findAny().ifPresent(System.out::println);
         */

        //unordered
        /*
        list.parallelStream().skip(1).limit(2).forEach(System.out::println);
         */


    }
}
