package org.example.Concepts;

/*
 Outer class can only be declared as either `public` or package-private (default).
 Inner classes can use any access modifier: private, protected, public, or default.
*/

// Superclass to demonstrate access modifiers
class TopAccessModifier {

    // private: accessible only within this class
    private String name;

    // default (no modifier): accessible only within same package
    void show() {
        System.out.println(name);

        // Instantiating private inner class from within outer class
        InnerAccessModifier innerAccessModifier = new InnerAccessModifier();
        innerAccessModifier.age = 5;
    }

    // private inner class
    private class InnerAccessModifier {
        private int age;
    }

    // default inner class (accessible within same package)
    class InnerDefaultClass {}

    // protected inner class (accessible to subclasses even outside package)
    protected class InnerProtectedClass {}
}

// Subclass to demonstrate protected access and default
public class AccessModifiers extends TopAccessModifier {

    // protected method: accessible to any subclass, even in other packages
    protected void protectedShow() {
        System.out.println("In protected show method");
    }

    // default variable (no modifier): accessible within same package
    String name;

    public static void main(String[] args) {

        // Creating instance of the superclass
        TopAccessModifier topAccessModifier = new TopAccessModifier();
        topAccessModifier.show(); // accessing default method

        // Cannot access private inner class or private members here
    }

    // protected inner class (redeclared): visible to subclass
    protected class InnerProtectedClass {}
}
