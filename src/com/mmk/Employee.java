package com.mmk;

import java.time.LocalDate;

public class Employee {

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", Salary=" + Salary +
                '}';
    }

    public Employee(String name, int id, Long salary) {
        this.name = name;
        this.id = id;
        Salary = salary;

    }

    String name ;
    int id;
    Long Salary;

    public String getName() {
        System.out.println(super.getClass());
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }
}
