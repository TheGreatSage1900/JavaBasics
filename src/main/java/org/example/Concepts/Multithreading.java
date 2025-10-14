package org.example.Concepts;

public class Multithreading {
    static void main() {
        Thread t1 = new Thread(()-> System.out.println("in thread 1"));
        t1.start();
        System.out.println("in main method");
    }
}
