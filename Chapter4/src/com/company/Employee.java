package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private double salary ;
    private String name ;
    private Calendar calendar = Calendar.getInstance();

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
        calendar.set(2019,Calendar.FEBRUARY,20);

    }


}
