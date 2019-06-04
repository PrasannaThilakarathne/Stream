package com.prasanna.java;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private Integer marks;

    public Employee(String name, Integer marks ) {
        this.name = name;
        this.marks =marks;
    }

    @Override
    public String toString() {
        return name +" "+ marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public static List<Employee> getAllEmployee(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Krish", 90));
        employees.add(new Employee("Lakshan", 70));
        employees.add(new Employee("Kasun", 85));
        employees.add(new Employee("Amal", 56));
        employees.add(new Employee("Nimal", 85));
        employees.add(new Employee("Ishan", 80));
        employees.add(new Employee("Nimesh", 60));
        return employees;
    }



}
