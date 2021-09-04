package com.shivank.streams_terminal;

import java.util.stream.Collectors;

import com.shivank.data.StudentDatabase;

public class StreamCountingExample {
    public static long count() {
        return StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println(count());
    }
}
