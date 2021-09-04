package com.shivank.constructorreference;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    public static void main(String[] args) {
        Supplier<String> supplier = String::new;
        Function<String, String> function = String::new;

        String s = function.apply("Hello");
        System.out.println(s);
    }
}
