package org.example.Concepts;

import java.util.ArrayList;
import java.util.List;

public class StaticConcept {

    static {
        System.out.println("In outer class #1");
    }

    private String name;
    private int age;
    // value will be same for all the created objects
    private static int phoneNumber;



    private void show(){
        System.out.println(name + " " + age + " " + phoneNumber);
    }

    public static void show1(){
        System.out.println("show1");
    }

    public static class StaticSubClass{
        static {
            System.out.println("In inner class");
        }
        private static String nickName;

        private String fullName;
        public static void show(){
            System.out.println(nickName);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {

        StaticConcept staticConcept1 = new StaticConcept();
        staticConcept1.name = "jake1";

        StaticConcept staticConcept2 = new StaticConcept();
        
        staticConcept2.name = "jake2";

        StaticConcept.phoneNumber = 424242;

        staticConcept1.show();
        staticConcept2.show();


        StaticSubClass.nickName = "Inner Class nickName";
        StaticSubClass.show();

        // Manual loading of a class to execute the static block
        Class.forName("org.example.Concepts.TempClass");


    }

    //static variables are constant belongs to class not to the object

    // static methods can be called with the class (instance variables can't be called in the static method)

    //static block runs when the class loads

    // this or super can't be used in static

    // static block runs when the class is loaded


}

class TempClass{
    static {
        System.out.println("in temp class");
    }
    String tempName;
}
