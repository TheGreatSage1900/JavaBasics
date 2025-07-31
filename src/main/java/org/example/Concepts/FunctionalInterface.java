package org.example.Concepts;


// Enables Lambda in java

// Used in streams

// Should have only one abstract method in interface

import java.util.Random;
import java.util.function.*;


@java.lang.FunctionalInterface
interface GenericCalculator<R,I,O>{
    R calculate(I input1,O input2);
}


@java.lang.FunctionalInterface
interface TriFunction<A,B,C,D>{
    D accept(A a,B b,C c);
}


public class FunctionalInterface {

    static void calculate(int a, int b, BiFunction<Integer,Integer,Integer> calculate){
        calculate.apply(a,b);
    }


    public static void main(String[] args) {

        calculate(10,5,(a,b)->a+b);
        calculate(10,5,(a,b)->a-b);
        calculate(10,5,(a,b)->a*b);


        //Predicate
        Predicate<String> findStr = (a) -> a.contains("Jake");
        System.out.println(findStr.test("JakeBaldino"));

        //Consumer
        Consumer<String> getStr = (input)-> System.out.println(input);
        getStr.accept("Consumer functional interface");

        //Supplier

        Supplier<Integer> getRandomInteger = () -> new Random().nextInt(5-2)+2;
        System.out.println(getRandomInteger.get());


        //Custom functional Interface
        TriFunction<String,String,String,String> concatenate = (a,b,c)->a+b+c;

        System.out.println(concatenate.accept("hello"," World", " TheGreatSage"));
    }


}
