package com.shivank.reflection;

public class ClassExample {

    public static void checkClass(Vehicle vehicle) {
        System.out.println(vehicle.getClass().getName());
    }

    public static void main(String[] args) {
        Class<Person> person = Person.class;
        System.out.println(person.getName());

        Class personClass = null;

        try {
            personClass = Class.forName("com.shivank.reflection.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(personClass.getName());

        checkClass(new Bus());
    }
}
