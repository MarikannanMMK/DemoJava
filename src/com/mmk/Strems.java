package com.mmk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Strems  {

    public static void main(String[] args) {
        Employee em = new Employee("MMK", 101, 50000l);

        ArrayList<Employee> emp = new ArrayList<>();

        emp.add(new Employee("MMK", 101, 50000l));
        emp.add(new Employee("Krishna", 103, 60000l));
        emp.add(new Employee("Raji", 102, 40000l));


        List<Employee> collect = emp.stream()
                .filter(employee -> employee.getSalary() > 30000)
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println(collect.toString());
    }


}
