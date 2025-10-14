package org.example.Concepts;

import java.util.function.Consumer;

public class ExceptionHandling {

    static void show(Consumer<Integer> consumer){
        try {
            consumer.accept(5);
        }
        catch (Exception e){
            throw new ArithmeticException("I know it will happen");
        }
    }

    void main() {
        show((Integer a) -> {
            int b = a/0;
        });
        System.out.println("Post exceptoin");
    }
}
