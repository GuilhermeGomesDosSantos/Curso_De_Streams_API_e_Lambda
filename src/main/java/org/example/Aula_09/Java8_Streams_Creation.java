package org.example.Aula_09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8_Streams_Creation {
    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //Collection
        list.stream().forEach(System.out::println);

        //Arrays
        Integer[] arrayInt = new Integer[] {1,2,3,4,5};
        Arrays.stream(arrayInt).forEach(System.out::println);

        // Stream.of
        Stream<String> streamOf = Stream.of("Guilherme","Gomes", "dos", "Santos");
        streamOf.forEach(System.out::println);

        //IntStream.range
        IntStream.range(0, 5).forEach(System.out::println);

        //IntStream.rangeClosed
        IntStream.rangeClosed(0,5).forEach(System.out::println);

        //Stream.iterate
        Stream.iterate(5, n -> n * 2).limit(10).forEach(System.out::println);

        // Path
        Path p = Paths.get("");
        Files.list(p).forEach(System.out::println);

        // Random
        new Random().ints().limit(10).forEach(System.out::println);

        // Pattern
        String s = "Deixe um curtir no vídeo";
        Pattern pa = Pattern.compile(" ");
        pa.splitAsStream(s).forEach(System.out::println);
    }
}
