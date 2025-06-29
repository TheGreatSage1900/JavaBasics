package org.example.Concepts;

public class DataTypes {



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

//        Boxing	Primitive → Wrapper	Integer i = Integer.valueOf(5);
//        Autoboxing	Automatic boxing	Integer i = 5;
//        Unboxing	Wrapper → Primitive	int x = i.intValue();
//        Auto-unboxing	Automatic unboxing	int x = i;



    }

}
