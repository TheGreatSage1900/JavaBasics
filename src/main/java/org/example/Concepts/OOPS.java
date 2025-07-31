package org.example.Concepts;

// Interface A
interface A {
    // Blueprint of class
    // Can't be instantiated
    // Can contain abstract and default (concrete) methods
    // Fields are implicitly public, static, and final
    String NAME = "hello";

    void showInheritance();

    default void showDefaultInheritance(String text) {
        System.out.println(text);
    }
}

// Interface B
interface B {
    void showInheritance();

    default void showDefaultInheritance(String text) {
        System.out.println(text);
    }
}

// Encapsulation class
class Encapsulation {

    private String name;

    // Encapsulation achieved through getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            System.out.println("Name is null or blank");
        }
    }
}

// Inheritance class
class Inheritance extends Encapsulation {

    String name;

    public void show() {
        System.out.println("In Inheritance class");
    }
}

// Main class demonstrating OOP concepts
public class OOPS extends Inheritance implements A, B {

    public static void main(String[] args) {

        // ✅ Encapsulation: Bundling data and methods together
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("Undertaker");

        // ✅ Inheritance: Accessing superclass members
        OOPS oops = new OOPS();
        oops.name = "hello";

        // ✅ Interface default method (handled diamond problem)
        oops.showDefaultInheritance("hello from Interface");

        // Method from subclass
        oops.show();
    }

    // Implementing interface method
    @Override
    public void showInheritance() {
        System.out.println("Overridden showInheritance()");
    }

    // Resolving diamond problem using InterfaceName.super.method()
    @Override
    public void showDefaultInheritance(String text) {
        A.super.showDefaultInheritance(text); // You could use B.super as well
    }
}
