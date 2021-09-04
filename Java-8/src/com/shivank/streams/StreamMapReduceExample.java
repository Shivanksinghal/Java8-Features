package com.shivank.streams;

import com.shivank.data.Student;
import com.shivank.data.StudentDatabase;

public class StreamMapReduceExample {

    public static int noOfNotebooks(){
        return StudentDatabase.getAllStudents()
                .stream()
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(noOfNotebooks());
    }
}
