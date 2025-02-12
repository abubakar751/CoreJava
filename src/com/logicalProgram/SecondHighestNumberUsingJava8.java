package com.logicalProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SecondHighestNumberUsingJava8 {
    public static void main(String[] args) {
        int[] a={6,5,2,2,4,9,8,9,7};
      IntStream skip = Arrays.stream(a).max().stream().skip(1).distinct().sorted();
        System.out.println(skip.getClass());


    }
}
