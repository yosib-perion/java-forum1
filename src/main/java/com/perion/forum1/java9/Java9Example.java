package com.perion.forum1.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Java9Example {

    public static void main(String[] args) {


        System.out.println("\nImmutable collections");
        System.out.println("*****************************");
        // Collection factory methods
        // adding items to these collections after creation results in an `UnsupportedOperationException`
        Set<Integer> ints = Set.of(1, 2, 3);
        List<String> strings = List.of("first", "second");
        Map<Integer, String> map = Map.of(1, "x", 2, "y");

        System.out.println(ints.getClass() + " " + ints);
        System.out.println(strings.getClass() + " " + strings);
        System.out.println(map.getClass() + " " + map);

        System.out.println("\ntakeWhile");
        System.out.println("*****************************");

        Stream.of(2, 4, 6, 8, 9, 10, 12)
                .takeWhile(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("\ndropWhile");
        System.out.println("*****************************");

        Stream.of(2, 4, 6, 8, 9, 10, 12)
                .dropWhile(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("\niterate");
        System.out.println("*****************************");

        Stream.iterate(3, x -> x < 10 , x -> x+1)
                .forEach(System.out::println);


        System.out.println("\nofNullable");
        System.out.println("*****************************");

        Employee emp= getEmployee(1);
        System.out.println(Stream.ofNullable(emp).count()); // no null check

    }

    private static class Employee {
        int id;
        Set<Integer> roles;

        public Set<Integer> roles() {
            return roles;
        }
    }

    private static Employee getEmployee(int empId){
        return null;
    }


}
