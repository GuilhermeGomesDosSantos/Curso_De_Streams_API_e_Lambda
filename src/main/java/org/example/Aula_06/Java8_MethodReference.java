package org.example.Aula_06;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Java8_MethodReference {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2,3, 4, 5,6);

        list.stream()
                //método de refência
                .forEach(System.out::println);

        list.stream()
                .forEach(n -> System.out.println(n));

        //métodos estáticos
        list.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

        list.stream()
                // com método de referência
                .map(Java8_MethodReference::multipliquePorDois)
                .forEach(System.out::println);

        list.stream()
                        .map((n) -> new BigDecimal(n))
                                .forEach(System.out::println);

        list.stream()
                // com método de referência
                .map(BigDecimal::new)
                .forEach(System.out::println);

        // várias instâncias
        list.stream()
                .map((n) -> n.doubleValue())
                .forEach(System.out::println);

        list.stream()
                // com método de referência
                .map(Integer::doubleValue)
                .forEach(System.out::println);

        //única instância
        BigDecimal dois = new BigDecimal(2);
        list.stream()
                .map(BigDecimal::new)
                .map((b) -> dois.multiply(b))
                .forEach(System.out::println);

        //com método de referência
        list.stream()
                .map(BigDecimal::new)
                .map(dois::multiply)
                .forEach(System.out::println);
    }
    private static Integer multipliquePorDois(Integer i){
        return i * 2;
    }
}
