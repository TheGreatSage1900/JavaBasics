package org.example.Concepts;

import org.example.Utils.SimpleUser;
import org.example.Utils.UserDetails;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsPlayground {

    public static void main(String[] args) {

        // Given a list of integers, return a list of all even numbers squared.

        List<Integer> numbers = IntStream.range(1,7).boxed().toList();

        System.out.println(
                numbers.stream().filter(number -> number % 2 == 0)
                        .map(number -> number * number)
                        .toList()

        );


       // Count how many strings in a list start with the letter "a" (case insensitive).

        List<String> strings = List.of("apple", "banana", "apricot", "cherry", "avocado");
        Long result = strings.stream()
                .filter(string -> string.toUpperCase().startsWith("A"))
                .count();
        System.out.println(result);

        // Given a list of names, convert them to uppercase and return them joined by a comma.

        List<String> nameStrings = List.of("john", "jane", "doe");
        System.out.println(
                nameStrings.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.joining(","))
        );

        //  Q4: First number divisible by 7 and greater than 30

        List<Integer> numbersList = List.of(10, 25, 35, 42, 55);

                Integer res = numbersList.stream().filter(data->data%7 ==0)
                        .findFirst().orElse(-1);

                System.out.println(res);

        //🔹 Q5: Sum using .reduce()

        List<Integer> numbersList2 = List.of(10, 25, 35, 42, 55);

        Optional<Integer> result2 = numbersList2.stream().reduce(Integer::sum);
        result2.ifPresent(System.out::println);

        int result5 = numbersList2.stream().filter(number -> number %2==0).reduce(Integer::max).orElse(-1);

        System.out.println(result5);

        //  🔸 Q1: Given a list of sentences, return a list of all words.

        List<String> sentences = List.of("Hello world", "FlatMap is awesome", "Streams rock");

        System.out.println(sentences.stream().flatMap(string -> Arrays.stream(string.split(" "))).toList());

        // flatMap

        List<List<String>> nestedString = List.of(List.of("jake"),List.of("baldino"),List.of("metal gear"));

        List<String> result7 = nestedString.stream().flatMap(List::stream).filter(data -> data.startsWith("j")).toList();
        System.out.println(result7);

        UserDetails userDetails1 = new UserDetails();
        userDetails1.setNickNames(List.of("jake"));

        UserDetails userDetails2 = new UserDetails();
        userDetails2.setNickNames(List.of("jake2"));

        List<UserDetails> allList = List.of(userDetails1,userDetails2);
        System.out.println(allList.stream().flatMap(data -> data.getNickNames().stream()).toList());

        // not null values extraction

        List<String> listWithNulls = Arrays.asList("apple", null, "banana");

        List<String> safeList = listWithNulls.stream()
                .filter(Objects::nonNull)       // Wraps nulls safely
                .toList();

        System.out.println(safeList); // Output: [apple, banana]


        // String to char
        String data = "hello";


        List<Character> chard = data.chars().mapToObj(c -> (char)c).peek(System.out::println).distinct().sorted().toList();
        System.out.println(chard);


        // Mastery challenge

        List<String> sentences2 = List.of(
                "Streams are powerful",
                "Java streams rock",
                "Mastering Java is fun",
                "Streams can be tricky sometimes"
        );

//        Extract all words from the sentences.
//
//        Convert them to lowercase, remove duplicates, and sort alphabetically.
//
//        Count how many words start with the letter "s".
        System.out.println(sentences2.stream().map(str -> str.split(" ")).flatMap(Arrays::stream).map(String::toLowerCase).distinct().sorted().filter(str -> str.startsWith("s")).count());

//        Get the first word (alphabetically) that is longer than 6 characters, or return "None" if not found.

        System.out.println(sentences2.stream().sorted().filter(str -> str.length() > 6).findFirst().orElse("None"));

//        Join all words into a single comma-separated string in uppercase.

        System.out.println(sentences2.stream().map(str -> str.split(" ")).flatMap(Arrays::stream).map(String::toUpperCase).collect(Collectors.joining(",")));

//              Group by
        List<String> words = List.of("apple", "banana", "apricot", "cherry", "avocado");


        // group by first character
        System.out.println(words.stream().collect(Collectors.groupingBy(word -> word.charAt(0))));
        // partition by first character
        System.out.println(words.stream().collect(Collectors.partitioningBy(word -> word.startsWith("a"))));

        // group by length of the items
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));

        SimpleUser simpleUser1 = new SimpleUser("albert",24);
        SimpleUser simpleUser2 = new SimpleUser("albert2",24);
        SimpleUser simpleUser3 = new SimpleUser("albert3",25);
        SimpleUser simpleUser4 = new SimpleUser("albert4",25);

        List<SimpleUser> l = List.of(simpleUser1,simpleUser2,simpleUser3,simpleUser4);

        System.out.println(l.stream().collect(Collectors.groupingBy(SimpleUser::getAge, Collectors.mapping(SimpleUser::getName,Collectors.toList()))));

        System.out.println(l.stream().collect(Collectors.groupingBy(SimpleUser::getAge, Collectors.counting())));

        List<String> res3 = IntStream.range(1,11).mapToObj(String::valueOf).toList();
        System.out.println(res3);

//        ✅ Example: Sum of lengths of all strings
        List<String> words2 = List.of("one", "two", "three");
        System.out.println(words2.stream().map(String::length).reduce(Integer::sum));


        List<String> words45 = List.of("one", "three", "seventeen", "hi");

        Map<Integer,List<String>> data3 = words45.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(data3.get(words45.stream().map(String::length).reduce(Integer::max).orElse(-1)).toString());

    }
}
