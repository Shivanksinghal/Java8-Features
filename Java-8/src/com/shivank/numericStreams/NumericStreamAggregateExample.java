package com.shivank.numericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println(sum);
        OptionalInt optionalInt = IntStream.rangeClosed(1, 50).max();
        System.out.println(optionalInt.isPresent());
        System.out.println(optionalInt.getAsInt());

        OptionalLong optionalLong = LongStream.rangeClosed(50, 100).min();
        System.out.println(optionalLong.isPresent());
        System.out.println(optionalLong.getAsLong());

        OptionalDouble optionalDouble = IntStream.rangeClosed(1, 50).average();
        System.out.println(optionalDouble.isPresent());
        System.out.println(optionalDouble.getAsDouble());
    }
}
