package com.shivank.reflection;

import java.lang.reflect.Field;

public class FieldVariableExample {

    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        System.out.println(personClass.getPackage());

        Field[] fields = personClass.getFields();
        for (Field f: fields) {
            System.out.println(f.getName());
        }

        Field[] fields1 = personClass.getDeclaredFields();
        for (Field f: fields1) {
//            f.setAccessible(true);
            System.out.println(f.getName());
        }
    }

}
