package com.shivank.streams_terminal;

import java.util.List;
import java.util.stream.Collectors;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class StreamsMappingExample {

    public static void main(String[] args) {
        List<String> stringList = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));

        System.out.println(stringList);
    }
}
