package org.example.Concepts;

import org.example.Utils.UserDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoopsAndControlStructures {
    public static void main(String[] args) {

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(7);
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
