package org.example.Concepts;

import lombok.Data;

interface A{
    // Blueprint of class

    // can't be instantiated

    // Can contain concrete methods (default) and abstract methods

    // fields allowed of type static final

    String NAME = "hello";

    void showInheritance();

    default void showDefaultInheritance(String text){
        System.out.println(text);
    }

}

interface B{
    void showInheritance();
    default void showDefaultInheritance(String text){
        System.out.println(text);
    }
}
class Encapsulation {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank())
            this.name = name;
        else
            System.out.println("Name is null or blank");
    }
    public String name;

}

class Inheritance extends Encapsulation{

    String name;

    public void show(){

        System.out.println("In inheritance class");
    }
}

public class OOPS extends Inheritance implements A,B{
    public static void main(String[] args) {

        // Encapsulation

        // Bundles variables and method in a single unit
        // Goal:  restricts direct variable access using private access modifiers
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("Undertaker");


        // Inheritance Access the Super class members with base class object
        // subclass overrides same method
        //Java supports single inheritance of classes
        // Multi level inheritance
        OOPS oops = new OOPS();
        oops.name = "hello";

        oops.showDefaultInheritance("hello");

    }

    @Override
    public void showInheritance() {

    }

    @Override
    public void showDefaultInheritance(String text) {

        // Diamond problem is solved by mentioning which method to use
        A.super.showDefaultInheritance(text);
    }
}
