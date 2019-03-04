package com.perion.forum1.java10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java10Example {

    public static void main(String[] args) {

        System.out.println("\nvar");
        System.out.println("*************************************");
        HashMap<String, String> verboseMap = new HashMap<>();
        System.out.println(verboseMap.getClass());

        var succinct = new HashMap<String, String>();
        System.out.println(succinct.getClass());

        System.out.println("\nList.copyOf");
        System.out.println("*************************************");
        var vegetables = new ArrayList<>(List.of("Brocolli", "Celery", "Carrot"));
        var unmodifiable = List.copyOf(vegetables);
        System.out.println(unmodifiable.getClass());

        System.out.println("\ntoUnmodifiableList");
        System.out.println("*************************************");
        var result = Stream.of(1, 2, 3, 4)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(result.getClass());

    }
}
