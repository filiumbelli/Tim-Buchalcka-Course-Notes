package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private double salary ;
    private String name ;
    private Calendar calendar = Calendar.getInstance();
    private Calendar paydate = Calendar.getInstance();

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
        calendar.add(Calendar.MONTH, -1);
    }


    public void paySalary(){
        System.out.println(this.paydate.getTime());
        System.out.println(this.calendar.getTime());
        System.out.println(this.paydate.getTime().compareTo(calendar.getTime()));

    }

}
