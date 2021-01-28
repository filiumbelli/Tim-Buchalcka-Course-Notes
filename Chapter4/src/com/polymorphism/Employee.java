package com.polymorphism;

import java.util.Calendar;

public class Employee {
    private double salary;
    private String name;
    private Calendar calendar = Calendar.getInstance();

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
        calendar.set(2019, Calendar.FEBRUARY, 20);

    }

    public double getSalary() {
        return this.salary;
    }

}
