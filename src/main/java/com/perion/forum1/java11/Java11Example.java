package com.perion.forum1.java11;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java11Example {

    public static void main(String[] args) throws URISyntaxException, IOException {

        System.out.println("\nisBlank");
        System.out.println("*************************************");
        String str = "aaa";
        String strBlank = "";

        System.out.println(str.isBlank());
        System.out.println(strBlank.isBlank());


        System.out.println("\nlines()");
        System.out.println("*************************************");
        String linesExample = "aaaa\nbbbb\ncccc";
        linesExample.lines().forEach(System.out::println);

        System.out.println("\nrepeat");
        System.out.println("*************************************");
        String repeatExample = "aaa_";
        System.out.println(repeatExample.repeat(3));


        System.out.println("\nstrip");
        System.out.println("*************************************");
        String stripExample = "  aaaaa  ";
        System.out.println(stripExample.strip());
        System.out.println(stripExample.stripLeading());
        System.out.println(stripExample.stripTrailing());


        System.out.println("\nmismatch");
        System.out.println("*************************************");
        byte[] buffer = new byte[] {1,2,3};
        ByteBuffer bb1 = ByteBuffer.wrap(buffer);

        byte[] buffer2 = new byte[] {1,2,4};
        ByteBuffer bb2 = ByteBuffer.wrap(buffer2);

        System.out.println(bb1.mismatch(bb2));


        System.out.println("\nreadString");
        System.out.println("*************************************");
        URL resource = Java11Example.class.getClassLoader().getResource("sample.txt");
        Path path = Path.of(resource.toURI());
        String readString = Files.readString(path);
        System.out.println(readString);

        System.out.println("\nnot");
        System.out.println("*************************************");
        List<String> strings = Stream.of("aa", "")
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        System.out.println(strings);
    }


}
