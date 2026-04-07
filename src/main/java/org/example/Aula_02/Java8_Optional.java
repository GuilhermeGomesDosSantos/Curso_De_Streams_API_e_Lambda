package org.example.Aula_02;

import java.util.Optional;
import java.util.stream.Stream;

public class Java8_Optional {
    public static void main(String[] args) {
//        String s = "abc";
        String s = "123";
        Optional<Integer> numero = converteEmNumero(s);
//        System.out.println(numero.isPresent());// se o valor existe retorna true caso contrário false
//        System.out.println(numero.get());// o get é utilizado para retornar o valor que está no Optional, porem pode vir uma exceção
//        converteEmNumero(s).ifPresent(n -> System.out.println(n)); // é executado apenas se o valor existir caso não exista ele não gerá exceção
        /*Integer num = converteEmNumero(s).orElse(2); // caso a função não consiga converter o numéro o orElse já retorna um valor default
        System.out.println(num);*/
//        converteEmNumero().orElseGet(()-> {return operacaoPesada()}); // executa uma função apenas se o Optional estiver vazio
//        Integer num = converteEmNumero(s).orElseThrow(() -> new NullPointerException("Valor Vazio")); // lança uma exceção se o valor não se encontrar presente
        /*Stream.of(1,2,3)
                .findFirst()
                .ifPresent(n -> System.out.println(n));*/
        Stream.of(1)
                .findFirst()
                .orElseThrow(()-> new NullPointerException("Não retornou nenhum valor"));
    }

    public static Optional<Integer> converteEmNumero(String numeroStr){
        try {
            Integer integer = Integer.valueOf(numeroStr);
            return Optional.of(integer); // retorna um Optional com o valor pedido
        } catch (Exception e){
            return Optional.empty();
        }
    }
    /*
    public static Optional<Integer> converteEmNumero(String numerStr){
        return Optional.ofNullable(null);
    }*/
}
