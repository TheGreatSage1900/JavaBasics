package org.example;

import java.util.Optional;

import static java.util.Optional.ofNullable;

public class Main{


    public static void main(String[] args) {

        String a = "Hello";

        Optional.ofNullable(a).map(String::toUpperCase).ifPresentOrElse(System.out::println,()-> System.out.println("Default"));
    }
}