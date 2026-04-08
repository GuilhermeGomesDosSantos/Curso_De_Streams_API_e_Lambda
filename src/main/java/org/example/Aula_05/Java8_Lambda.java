package org.example.Aula_05;

import java.util.stream.IntStream;

public class Java8_Lambda {
    // Formas de escrever função lambda
    public static void main(String[] args) {
        // forma simples
        /*IntStream.range(0, 5)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
         */

        // forma simples adicionando parentes
        /*
        IntStream.range(0, 5)
                .filter((int n) -> n % 2 == 0)
                .reduce((n1, n2) -> n1 + n2)
                .ifPresent(System.out::println);
         */

        Runnable runnable = () -> System.out.println("Se inscreva no canal");

        // chave, será necessário utilizar o return com ;
        IntStream.range(0, 5)
                .filter((int n) -> {
                    System.out.println("Passou por aqui");
                    return n % 2 == 0;
                })
                .forEach(System.out::println);

        IntStream.range(0,6)
                .filter(n -> n % 3 == 0)
                .forEach(n -> System.out.println(n));
    }
}
