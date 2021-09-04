package com.shivank.streams;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class StreamComparatorExample {

    public static List<Student> sortStudentsByName() {
        return StudentDatabase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static void main(String[] args) {
        sortStudentsByName().forEach(System.out::println);
    }
}
