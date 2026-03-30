package org.example.Aula_01;

import java.util.Arrays;
import java.util.List;

public class Java8Streams_Parte_01 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        // JAVA 5
        /*
        for (Integer integer : lista){
            System.out.println(integer);
        }
        */

        // JAVA 8
        //lista.stream().forEach(e -> System.out.println(e));

        //skip, pula o numero de elementos passado e printa os demais valores
        //lista.stream().skip(2).forEach(e -> System.out.println(e));

        //limit, é parecido com o skip, porem ao contrário, no caso você diz, quantos elementos quer processar
        //lista.stream().limit(3).forEach(numero -> System.out.println(numero));

        //distinct, ele não permite que o stream processe numéros repetidos
        //lista.stream().distinct().forEach(n -> System.out.println(n));

        //filter, permite fazer a logica de filtro que desejar
//        lista.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

        //map, não tem nada haver com a interface MAP, ele realiza a transformação de elementos e retorna um novo stream com os elementos modificados
        //a lista original não é modificada, é apenas realizada uma transformação no método utilizado
        lista.stream().map(n-> n * 2).forEach(n -> System.out.println(n));
    }
}
