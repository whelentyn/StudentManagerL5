package com.valisteven.loose.oose.fis.lab.student.manager.model;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;

    public Student(String firstName, String lastName, int age, double meanGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.meanGrade = meanGrade;
    }

    @Override
    public String toString() {
        //toString generated implementation
        return "Student";
    }

    @Override
    public boolean equals(Object o) {
        //equals generated implementation
        return true;
    }

    @Override
    public int hashCode() {
        //hashCode generated implementation
        return 12;
    }

    //generated getters and setters for all fields

}

