package com.prasanna.java;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        List<Employee> sortedEmployee=Employee.getAllEmployee().stream()
                .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(sortedEmployee);


        List<Employee> employees = Employee.getAllEmployee().stream()
                .sorted(Comparator.comparing(Employee::getMarks).reversed()).collect(Collectors.toList());
        System.out.println(employees);

        List<Employee> employees1 = Employee.getAllEmployee().stream()
                .sorted((e1,e2)->e1.getMarks().compareTo(e2.getMarks())).collect(Collectors.toList());
        System.out.println(employees1);

        List<Employee> employees2 =Employee.getAllEmployee().stream()
                .sorted((e1,e2)->new Integer(e1.getName().length()).compareTo(e2.getName().length()))
                .collect(Collectors.toList());
        System.out.println(employees2);


    }
}
