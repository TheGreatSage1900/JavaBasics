package org.example.Concepts;


// Enables Lambda in java

// Used in streams

// Should have only one abstract method in interface

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//annotation is optional
@java.lang.FunctionalInterface
interface Calculator{
void calculate(int a, int b);
}


@java.lang.FunctionalInterface
interface TriFunction<A,B,C,D>{
    D accept(A a,B b,C c);
}


public class FunctionalInterface{

    static void show(int a, int b, Calculator logic){
        logic.calculate(a,b);
    }


    public static void main(String[] args) {

        // anonymous class one time creation of class without name for implementing functional interface

        Calculator add = new Calculator() {
            @Override
            public void calculate(int a, int b) {
                System.out.println(a + b);
            }
        };

        add.calculate(5,6);

        // this can be rewritten as using lambda expression where

        Calculator sub = (a,b)-> System.out.println(a-b);

        sub.calculate(10,5);


        // passing logic

        show(5,6,(a,b)-> System.out.println(a*b));


        // returning logic

        Calculator operation = switch ("add"){
            case "add" -> (a,b)-> System.out.println(a+b);
            case "sub" -> (a,b)-> System.out.println(a-b);
            default -> (a,b)-> System.out.println("No proper input");
        };

        operation.calculate(10,12);

        // In build functional interfaces
//| Interface           | Method              | Purpose                         | Example                         |
//                | ------------------- | ------------------- | ------------------------------- | ------------------------------- |
//                | `Function<T,R>`     | `R apply(T t)`      | Transforms an input to output   | Convert String to Integer       |
//                | `Predicate<T>`      | `boolean test(T t)` | Checks a condition (true/false) | Check if number > 5             |
//                | `Consumer<T>`       | `void accept(T t)`  | Consumes a value, no return     | Print a string                  |
//                | `Supplier<T>`       | `T get()`           | Produces a value, no input      | Generate a random number        |
//                | `BiFunction<T,U,R>` | `R apply(T,U)`      | 2 inputs → 1 output             | Add two integers and return sum |
//                | `BiConsumer<T,U>`   | `void accept(T,U)`  | 2 inputs, no output             | Print name and age              |



        //  Transforms an input to output

        Function<String,String> convert = (String input)->{
            return input;
        };

        String result = convert.apply("123");
        System.out.println(result.getClass());



        // Predicate to check condition

        Predicate<String> test = (action)-> action.equals("action");

        System.out.println(test.test("action"));

        // Consumer

        Consumer<String> printData = data-> System.out.println(data);

        printData.accept("Data");

        // Supplier

        Supplier<String> randomString = ()-> "RandomString"+ (new Random().nextInt(10 - 5 + 1) + 5);

        System.out.println(randomString.get());

        // user defined TriFunction
        TriFunction<String,String,String,String> concatenateAllInput = (input1,input2,input3)-> input1+input2+input3;

        System.out.println(concatenateAllInput.accept("hello","world","programming"));


    }






}
