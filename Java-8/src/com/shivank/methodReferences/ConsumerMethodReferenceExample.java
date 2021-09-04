package com.shivank.methodReferences;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("hello");
    }
}
