package com.shivank.functionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "supply";
        System.out.println(supplier.get());
    }
}
