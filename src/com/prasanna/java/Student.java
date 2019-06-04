package com.prasanna.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private String name;

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    private LocalDate dob;

    public Student(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Prasanna", LocalDate.of(1995, 8 , 1)));
        students.add(new Student("Oshan", LocalDate.of(1994, 8 , 3)));
        students.add(new Student("Nirmal", LocalDate.of(1999, 5 , 8)));
        students.add(new Student("Perera", LocalDate.of(1985, 4 , 20)));
        return students;
    }

    @Override
    public String toString() {
        return name +" "+ dob;
    }
}
