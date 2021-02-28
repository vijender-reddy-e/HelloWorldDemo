package com.company;

public class Student {
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Student() {
    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
