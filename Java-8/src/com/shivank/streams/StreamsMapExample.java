package com.shivank.streams;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class StreamsMapExample {

    public static List<String> nameList() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toList());
    }

    public static Set<String> nameSet() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(nameSet());
    }
}
