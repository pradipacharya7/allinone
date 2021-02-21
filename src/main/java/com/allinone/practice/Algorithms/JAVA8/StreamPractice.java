package com.allinone.practice.Algorithms.JAVA8;

import java.util.*;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        Integer[] a={5,4,3,7,10,1};
        HashSet<Integer> integers=new HashSet(Arrays.asList(a));
        System.out.println(integers);

        /*
        List<Employee> employeeList=new ArrayList<Employee>();
        employeeList.add(new Employee("ram",10000.23));
        employeeList.add(new Employee("geeta",950000.00));
        employeeList.add(new Employee("sita",950000.00));
        employeeList.add(new Employee("pradip",20000.45));
        Stream.generate(Math::random).limit(12).forEach(System.out::println);
        Stream.of("hello").forEach(System.out::println);
        Employee employee=employeeList.stream().max((a,b)->a.getSalary().compareTo(b.getSalary())).get();
//        employeeList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed()).forEach(System.out::println);
        System.out.println(employee);
        */

    }
}
