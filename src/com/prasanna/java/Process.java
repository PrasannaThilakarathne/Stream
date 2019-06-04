package com.prasanna.java;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class Process {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Employees with ENG");
        List<Employee> employees = Employee.getAllEmployee().stream()
                .map(e->new Employee("Eng: "+e.getName(),90)).collect(Collectors.toList());
        System.out.println(employees);
        System.out.println("---------------------------------------------------------------------");





        System.out.println("---------------------------------------------------------------------");
        System.out.println("Marks * 2");
        List<Employee> employees1 = Employee.getAllEmployee().stream()
                .map(e->new Employee("", +e.getMarks()*2)).collect(Collectors.toList());
        System.out.println(employees1);
        System.out.println("---------------------------------------------------------------------");





        System.out.println("---------------------------------------------------------------------");
        System.out.println("Employee names witch Contain 'i' Marks * 3 ");
        List<Employee> employees2 = Employee.getAllEmployee().stream().filter(e->e.getName().contains("i"))
                .map(e->new Employee(e.getName(), +e.getMarks()*3))
                .collect(Collectors.toList());
        System.out.println(employees2);
        System.out.println("---------------------------------------------------------------------");





        System.out.println("---------------------------------------------------------------------");
        List<Student> students = Student.getAllStudents().stream().filter(s-> Period.between(s.getDob(), LocalDate.now()).getYears()>18)
                .collect(Collectors.toList());
        System.out.println(students);
        System.out.println("---------------------------------------------------------------------");
    }
}
