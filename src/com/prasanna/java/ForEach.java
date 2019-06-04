package com.prasanna.java;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForEach {
    public static void main(String[] args) {

        Employee.getAllEmployee().forEach(System.out::println);

        Employee.getAllEmployee().forEach(
                        e ->
                        {
                            System.out.println(e.getName());
                            System.out.println("#########");
                        }
                );

        List<Employee> employeeList1=Employee.getAllEmployee().stream()
                .filter(e->e.getName().length()>=5)
                .map(e->new Employee(e.getName().toUpperCase(),e.getMarks()))
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());


        System.out.println(employeeList1);



    }
}
