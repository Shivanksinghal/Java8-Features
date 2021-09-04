package com.shivank.streams_terminal;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class StreamGroupingByExample {

    public static void groupStudentsByGender() {
        Map<String, List<Student>> stringListMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(stringListMap);
    }

    public static void groupStudentsByGpa() {
        Map<String, List<Student>> stringListMap = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(stringListMap);
    }

    public static void twoLevelGrouping_1() {
        Map<Integer, Map<String, List<Student>>> map = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(map);
    }

    public static void twoLevelGrouping_2() {
        Map<Integer, Integer> map = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.summingInt(Student::getNoteBooks)));
        System.out.println(map);
    }

    public static void threeArgumentGroupBy() {
        LinkedHashMap<String, Set<Student>> map = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
        System.out.println(map);
    }

    public static void calculateTopGpa() {
        Map<Integer, Student> map = StudentDatabase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(map);
    }

    public static void main(String[] args) {
//        groupStudentsByGender();
//        groupStudentsByGpa();
//        twoLevelGrouping_1();
//        twoLevelGrouping_2();
//        threeArgumentGroupBy();
        calculateTopGpa();
    }
}
