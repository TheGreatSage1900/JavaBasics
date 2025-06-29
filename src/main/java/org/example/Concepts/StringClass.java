package org.example.Concepts;

public class StringClass {
    public static void main(String[] args) {

        // Constant string pool usage both var uses same object

        String name = "jake";
        String name2 = "jake";

        // immutable in the sense new object will be created in the heap
        name = name + "hello";


        // immutable string can be done using StringBuilder and StringBuffer

        // StringBuffer is thread safe but performance is higher in StringBuilder


        StringBuffer str = new StringBuffer("Hello baldino");
        System.out.println(str.charAt(1));
        System.out.println(str.insert(5," jake"));
    }
}
