package com.functional.programming.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {


        int increment = incrementByOne(1);
        System.out.println(increment);


        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        // you are chaining multiple functions in a function. , so it will run more than one function ( it takes 1 argument and produces 1 return parameter type)
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));


        // BiFunction this takes 2 argument and return the type :

        System.out.println(incrementByOneAndMultiply(4, 100));

        int incrementByOneAndMultiply = incrementByOneAndMultiplyBiFunction.apply(4, 100);
        System.out.println(incrementByOneAndMultiply);
    }


    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;


    static int incrementByOne(int number) {
        return number + 1;
    }


    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }


}
