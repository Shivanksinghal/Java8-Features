package com.shivank.streams_terminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class StreamsMinByMaxByExample {
    public static Optional<Student> minBy() {
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy() {
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println(minBy());
        System.out.println(maxBy());
    }
}
