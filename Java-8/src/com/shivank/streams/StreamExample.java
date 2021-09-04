package com.shivank.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class StreamExample {

    public static void main(String[] args) {

        Predicate<Student> predicate = student -> student.getGradeLevel() >= 3;

        Map<String, List<String>> map = StudentDatabase.getAllStudents()
                .stream()
                .filter(predicate.and(student -> student.getGpa() >= 3.9))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(map);
    }
}
