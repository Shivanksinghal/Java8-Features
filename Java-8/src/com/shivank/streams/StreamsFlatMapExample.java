package com.shivank.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
    public static List<List<String>> printStudentActivities2() {
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getActivities)
//                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(printStudentActivities2());
    }
}
