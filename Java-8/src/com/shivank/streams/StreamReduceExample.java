package com.shivank.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a * b);
    }
    public static Optional<Student> getHighestGpaStudent() {
        return StudentDatabase.getAllStudents()
                .stream()
                .reduce((s1, s2) -> {
                    if(s1.getGpa() > s2.getGpa())
                        return s1;
                    else return s2;
                });
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 7);
        System.out.println(performMultiplication(integerList));
        System.out.println(getHighestGpaStudent());
    }
}
