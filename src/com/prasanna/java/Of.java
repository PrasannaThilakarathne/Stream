package com.prasanna.java;

import java.util.stream.Stream;

public class Of {
    public static void main(String[] args) {
        Stream.of(1,3,5,7,4,2,6,2,7,3).sorted().forEach(System.out::println);


        System.out.println("---0--0---");
        Integer[] integers = {2,45,7,3,6,33,6,8,3};
        Stream<Integer> integerStream =Stream.of(integers);
        integerStream.sorted().forEach(System.out::println);
    }
}
