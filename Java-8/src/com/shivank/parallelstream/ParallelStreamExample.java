package com.shivank.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    private static long checkPerformanceResult(Supplier<Integer> supplier, int n) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; ++i) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    static int sum_sequential_stream() {
        return IntStream.rangeClosed(1, 100000)
                .sum();
    }
    static int sum_parallel_stream() {
        return IntStream.rangeClosed(1, 100000)
                .parallel()
                .sum();
    }
    public static void main(String[] args) {
//        System.out.println(sum_sequential_stream());
//        System.out.println(sum_parallel_stream());
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(checkPerformanceResult(ParallelStreamExample::sum_sequential_stream, 10000));
        System.out.println(checkPerformanceResult(ParallelStreamExample::sum_parallel_stream, 10000));
    }

}
