package com.shivank.streams_terminal;

import java.util.stream.Collectors;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class StreamsSumAvgExample {

    public static int sum() {
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double avg() {
        return StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(avg());
    }
}
