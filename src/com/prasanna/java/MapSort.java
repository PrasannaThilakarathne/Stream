package com.prasanna.java;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSort {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Krish",80);
        students.put("Sampath",90);
        students.put("Nimal",67);
        students.put("Perera",45);
        students.put("Sirisena",20);
        students.put("Ranil",10);

        students.entrySet().stream().filter(s->s.getValue()>=60)
                .sorted((s1,s2)->s1.getValue().compareTo(s2.getValue())).collect(Collectors.toList())
                .stream().forEach(s->System.out.println(s.getKey()+" "+s.getValue()));
        System.out.println("---------------");

        List<String> strings=new ArrayList<>();
        students.entrySet().stream().filter(s->s.getValue()>=60)
                .sorted((s1,s2)-> -s1.getValue().compareTo(s2.getValue()))
                .peek(s->strings.add(s.getKey()+" "+s.getValue())).collect(Collectors.toList());
        System.out.println(strings);


        System.out.println("*&&%&^%$&^$^%#$%^&@$$^#%&#*&");

        Map<Integer,String> vehicles=new HashMap<>();
        vehicles.put(10,"car");
        vehicles.put(50,"suv");
        vehicles.put(20,"jeep");
        vehicles.put(12,"bus");
        vehicles.put(15,"ship");
        vehicles.put(16,"lorry");
        vehicles.put(4,"cycle");

        List<String> strings1=new ArrayList<>();
        List<Integer> strings2=new ArrayList<>();

        vehicles.entrySet().stream().sorted((v1,v2)->-v1.getKey().compareTo(v2.getKey()))
                .peek(v->strings2.add(v.getKey())).collect(Collectors.toList())
                .stream().filter(v->v.getValue()!="ship")
                .sorted((v1,v2)->v1.getValue().compareTo(v2.getValue()))
                .peek(v->strings1.add(v.getValue())).forEach(s-> {
            System.out.println(s.getValue());

        });



        //System.out.println(strings1);
        //System.out.println(strings2);
    }
}
