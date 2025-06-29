package org.example.Concepts;

// it can't be instantiated

// it can have both concrete and abstract methods

// extending class must implement all the abstract methods from the abstract class

// can have constructor

abstract class superAbstractClass {
    String name = "abstract class";

    public abstract void show();

    void show2(){
        System.out.println("Concrete method");
    }


}

public class AbstractClass extends superAbstractClass{
    public static void main(String[] args) {

        AbstractClass abstractClass = new AbstractClass();

    }

    @Override
    public void show() {
        System.out.println("From abstract class");
    }
}
