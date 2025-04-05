package org.example;

import org.example.Utils.UserDetails;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        // data types

        int intNum = 56;                        // size : 4 bytes
        long longNum = 424242424242424L;        // size : 8 bytes
        short shortNum = 30;                    // size : 2 bytes
        byte byteNum = 120;                     // size : 1 byte
        double doubleNum = 5.64242424;          // size : 8 bytes
        float floatNum = 5.7f;                  // size : 4 bytes
        char charVal = 'a';                     // size : 2 bytes
        boolean boolValue = true;               // size : 1 byte

        // Array declaration and assigning values

        int[] arr1 = new int[10];
        int[] arr2 = new int[]{1,2,3,4,5};
        arr1[0] = 5;
        arr2[0] = 10;

        // label
        outerLoop:
        for(int num : arr2)
            if(num == 3)
                break outerLoop;

        // Ternary Operator should return something
        int min = 0; int max = 7;
        int randomNum = new Random().nextInt(max - min + 1) + min;
        String ternaryResult = (randomNum % 2 == 0)?"Even":"odd";

        // switch

        switch (new Random().nextInt(max - min + 1)+min){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4,5,6 -> System.out.println("unknown");
            default -> System.out.println("Still unknown");
        }

        // switch with returns

        String res = switch("String"){
            case "Data"-> "Data";
            default -> "nothing";
        };

        // switch with pattern matching

        UserDetails userDet = new UserDetails();
        Object obj = userDet;
        switch(obj){
            case String s -> System.out.println("String");
            case Integer i -> System.out.println("Integer");
            case UserDetails userDetails -> System.out.println("it's of type " + userDetails.getClass());
            default -> System.out.println("Default");
        }




    }
}