package org.example.Aula_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Java8_Collections {
    public static void main(String[] args) {
//        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        //removeIf
        intList.removeIf(n -> n % 2 == 0);
        intList.forEach(System.out::println);

        //replaceALl
        intList.replaceAll(n -> n * 2);

        // Map
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Se");
        map.put(1, "Inscreva");
        map.put(2, "no");
        map.put(3, "canal");

        map.forEach((k,v) -> System.out.println(k + v));

        // compute
        map.compute(1,(k,v) -> v + " agora");
        map.forEach((k,v) -> System.out.println(k + v));

        // merge
        map.merge(4, "!", (v1, v2) -> v1 + v2);
        map.forEach((k, v) -> System.out.println(k + v));

        //replaceAll
        map.replaceAll((k, v) -> v + "!");
        map.forEach((k,v) -> System.out.println(k + v));
    }
}
