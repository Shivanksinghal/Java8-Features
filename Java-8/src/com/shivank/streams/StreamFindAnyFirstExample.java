package com.shivank.streams;

import java.util.Optional;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class StreamFindAnyFirstExample {
    public static Optional<Student> findAny() {
        return StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirst() {
        return StudentDatabase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findFirst();
    }

    public static void main(String[] args) {
        System.out.println(findAny());
        System.out.println(findFirst());
    }
}
