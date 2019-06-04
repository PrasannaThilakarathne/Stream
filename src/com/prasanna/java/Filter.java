package com.prasanna.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getAllEmployee();


        List<Employee> employeeList=employees.stream().filter(e->e.getName()
                .contains("i")).collect(Collectors.toList());
        System.out.println(employeeList.toString());


        List<Employee> employeeList1=employees.stream().filter(e->e.getName().length()>5)
                .collect(Collectors.toList());
        System.out.println(employeeList1.toString());


    }
}
