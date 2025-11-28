package com.functional.programming.streams;

import java.util.List;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Alice", Gender.PREFER_NOT_TO_SAY)
        );

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 76, 443, 67, 64, 43, 9);
//        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
        people.stream()
                .map(person -> person.name)
                .forEach(System.out::println);

        List<String> names = List.of("John", "Maria", "Aisha", "Alice", "spring", "springboot", "aws", "azure");

//        names.stream().filter(name -> name.contains("spring"))
//                .forEach(System.out::println);

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);
//
//        
//        Boolean v = people.stream()
//                .allMatch(person -> person.gender == Gender.FEMALE);
//        System.out.println(v);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }

}
