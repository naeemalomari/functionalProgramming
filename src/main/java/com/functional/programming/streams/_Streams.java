package com.functional.programming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _Streams {
    static List<Integer> listOfNumbers = Arrays.asList(100, 123, 235, 124, 875, 500, 400);
    static List<String> listOfNames = Arrays.asList("naim", "mohammad", "ahmad", "mahmoud", "hamada", "hamooda", "hamameedo");

    public static void main(String[] args) {


        listConsumer.accept(listOfNumbers);
        System.out.println("------------------------");
        printIfStartWithLetterA.accept(listOfNames);
        System.out.println("------------------------");
        lenghtGreaterThanFive.accept(listOfNames);
    }

    static Predicate<Integer> evenNumbers = numbers -> numbers % 2 == 0;

    static Consumer<List<Integer>> listConsumer = list ->
            listOfNumbers.stream()
                    .filter(evenNumbers)
                    .forEach(System.out::println);


    static Predicate<String> checkIfStartsWithLetterA = name -> name.startsWith("a");

    static Consumer<List<String>> printIfStartWithLetterA = list ->
            listOfNames.stream()
                    .filter(checkIfStartsWithLetterA)
                    .forEach(System.out::println);

    static Predicate<String> checkIflenghgreaterthanfive = name -> name.length() > 5;

    static Consumer<List<String>> lenghtGreaterThanFive = list ->
            listOfNames.stream()
                    .filter(checkIflenghgreaterthanfive)
                    .forEach(System.out::println);
}
