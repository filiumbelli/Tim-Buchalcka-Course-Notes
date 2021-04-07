package com.udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
//    new Thread(new Runnable(){
//        @Override
//        public void run(){
//            System.out.println("Priting from runnable");
//
//        }
//    }).start();
        new Thread(() -> {
            System.out.println("Printing from anonymous lambda class");
        }).start();
        ArrayList<Employee> employees = new ArrayList();

        employees.add(new Employee("Karan", 25));
        employees.add(new Employee("Burak", 31));
        employees.add(new Employee("Tuğrul", 45));
        employees.add(new Employee("Ali", 33));
//        Collections.sort(employees, new Comparator<Employee>(){
//            @Override
//            public int compare(Employee employee1,Employee employee2){
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        // lambda expression of comparator
        Collections.sort(employees, (Employee employee1, Employee employee2) ->
                employee1.getName().compareTo(employee2.getName()));
        for (Employee emp : employees) {
            System.out.println(emp.getName());
        }
        employees.forEach(employee -> {
            System.out.println(employee.getName() + " " + employee.getAge());
        });

    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
