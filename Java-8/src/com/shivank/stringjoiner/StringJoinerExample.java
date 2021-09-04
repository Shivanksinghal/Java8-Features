package com.shivank.stringjoiner;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Shivank", "Ajay", "Ravindra", "Rahul");
        StringJoiner stringJoiner1 = new StringJoiner(",", "[", "]");
        StringJoiner stringJoiner2 = new StringJoiner(":", "{", "}");

        stringJoiner1.add(list.get(0)).add(list.get(1));
        System.out.println(stringJoiner1);

        stringJoiner2.add(list.get(2)).add(list.get(3));
        System.out.println(stringJoiner2);

        stringJoiner2.merge(stringJoiner1);
        System.out.println(stringJoiner2);

//        stringJoiner1.merge(stringJoiner2);
//        System.out.println(stringJoiner1);

        Base64.getEncoder().
    }
}
