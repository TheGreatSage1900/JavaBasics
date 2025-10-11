package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Concepts.NothingProducts;

import java.util.NoSuchElementException;
import java.util.Optional;

import static java.util.Optional.ofNullable;

public class Main{


    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(2000);
        Thread t1 = new Thread(()->{
            System.out.println("in thread 1");
        });

        Thread t2 = new Thread(()->{
            System.out.println("in thread 2");
        });
        t2.setDaemon(true);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("in main thread");
    }
}