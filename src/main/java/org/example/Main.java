package org.example;

import java.util.stream.Collectors;

public class Main{


    public static void main(String[] args) throws InterruptedException {
        String data = "hello";
        System.out.println(data.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(cha -> cha,Collectors.mapping(cha->cha,Collectors.counting()))));
    }
}