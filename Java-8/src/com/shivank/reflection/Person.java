package com.shivank.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    public String name();
}

public class Person {
    private String name;
    private int age;

    private Person() {

    }

    @Override public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @MyAnnotation(name="myannotation")
    public String returnName() {
        return this.name + " Welcome...";
    }
}
