package org.example.Aula_07;

import java.util.Arrays;
import java.util.List;

public class Java8_DebugLambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,7,8,9);

        list.stream()
                .peek(n -> System.out.println(n + "Se increva!"))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println(n + "Comente!"))
                .map((n) -> converterParaStringBuilder(n))
                .forEach(System.out::println);
    }
    private static StringBuilder converterParaStringBuilder(Integer n){
        StringBuilder builder = new StringBuilder();
        builder.append(n);
        builder.append("s");
        builder.append("a");
        return builder;
    }
}
