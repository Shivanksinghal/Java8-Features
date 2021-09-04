package com.shivank.optional;

import java.util.Optional;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class OptionalExample {

    public static String getStudentName() {
        Student student = StudentDatabase.studentSupplier.get();
        if (student != null)
            return student.getName();
        return null;
    }

    public static Optional<String> getStudentNameOptional() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDatabase.studentSupplier.get());
        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        String name = getStudentName();
        if (name != null) {
            System.out.println(name.length());
        } else {
            System.out.println("Name not found");
        }

        Optional<String> stringOptional = getStudentNameOptional();
        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get().length());
        } else {
            System.out.println(0);
        }
    }
}
