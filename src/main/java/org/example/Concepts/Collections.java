package org.example.Concepts;

import java.util.Arrays;
import java.util.List;

public class Collections {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "Charlie");

        names.add("Jake");
        System.out.println(names);
    }
}
