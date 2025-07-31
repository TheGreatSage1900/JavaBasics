package org.example.Concepts;

// Interface with a single method
interface Human {
    void speak();
}

// Demonstrates the use of anonymous inner class
public class AnonymousClass {
    public static void main(String[] args) {

        // Creating an anonymous class that implements Human
        Human human = new Human() {
            @Override
            public void speak() {
                System.out.println("Hello");
            }
        };

        // Calling the overridden method
        human.speak();



        // is is simplified by funtional Interface

        Human jake = () -> System.out.println("Jake is speaking");
        jake.speak();
    }
}
