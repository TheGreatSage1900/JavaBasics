package org.example.Concepts;

/**
 * A class demonstrating various primitive data types,
 * wrapper classes, and arrays in Java with examples and explanations.
 */
public class DataTypes {

    public static void main(String[] args) {

        // 1. === PRIMITIVE DATA TYPES ===

        // Whole numbers
        int intNum = 56;                        // 4 bytes: -2^31 to 2^31-1
        long longNum = 424242424242424L;        // 8 bytes: large integers (L suffix required)
        short shortNum = 30;                    // 2 bytes: -32,768 to 32,767
        byte byteNum = 120;                     // 1 byte: -128 to 127 (useful for saving memory)

        // Floating-point numbers
        double doubleNum = 5.64242424;          // 8 bytes: high precision decimal (default for decimal values)
        float floatNum = 5.7f;                  // 4 bytes: less precision, must use 'f' suffix

        // Character and Boolean
        char charVal = 'a';                     // 2 bytes: single Unicode character
        boolean boolValue = true;               // 1 bit (size depends on JVM): true/false

        // Print all primitives
        System.out.println("Integer: " + intNum);
        System.out.println("Long: " + longNum);
        System.out.println("Short: " + shortNum);
        System.out.println("Byte: " + byteNum);
        System.out.println("Double: " + doubleNum);
        System.out.println("Float: " + floatNum);
        System.out.println("Char: " + charVal);
        System.out.println("Boolean: " + boolValue);


        // 2. === ARRAYS ===

        // Array declaration and initialization
        int[] arr1 = new int[10];              // array of size 10 with default values (0)
        int[] arr2 = new int[]{1, 2, 3, 4, 5}; // inline initialization

        arr1[0] = 5;                            // assign value at index 0
        arr2[0] = 10;                           // update index 0 to new value

        System.out.println("arr1[0]: " + arr1[0]);
        System.out.println("arr2[0]: " + arr2[0]);


        // 3. === WRAPPER CLASSES & BOXING ===

        // Boxing: converting primitive to wrapper class explicitly
        Integer boxedInt = Integer.valueOf(5);

        // Autoboxing: automatic conversion by Java compiler
        Integer autoBoxedInt = 5;

        // Unboxing: converting wrapper to primitive explicitly
        int unboxedInt = boxedInt.intValue();

        // Auto-unboxing: automatic conversion
        int autoUnboxedInt = autoBoxedInt;

        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);


        // 4. === EXTRA: DEFAULT VALUES OF PRIMITIVES ===
        // (Only applicable in instance variables, not local variables)
        // int → 0
        // long → 0L
        // float → 0.0f
        // double → 0.0d
        // char → '\u0000' (null char)
        // boolean → false
        // reference types (like arrays/objects) → null


        // 5. === FINAL THOUGHTS ===
        // Use primitives for performance
        // Use wrapper classes when working with collections like List, Map, etc.

    }
}
