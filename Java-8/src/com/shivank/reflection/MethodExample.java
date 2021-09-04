package com.shivank.reflection;

import java.lang.reflect.Method;

public class MethodExample {

    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
//        Method[] methods = personClass.getMethods();
//        for (Method method: methods) {
//            System.out.println(method.getName() + " return type: " + method.getReturnType());
//        }

        Method[] methods1 = personClass.getDeclaredMethods();
        for (Method method: methods1) {
//            method.setAccessible(true);
            System.out.println(method.getName() + " return type: " + method.getReturnType());
        }

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                System.out.println(method.getName());
            }
        }
    }
}
