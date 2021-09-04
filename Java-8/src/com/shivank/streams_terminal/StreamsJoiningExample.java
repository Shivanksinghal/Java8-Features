package com.shivank.streams_terminal;

import java.util.stream.Collectors;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class StreamsJoiningExample {

    public static String joining_1() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String joining_3() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println(joining_1());
        System.out.println(joining_2());
        System.out.println(joining_3());
    }
}
