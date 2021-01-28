package com.polymorphism;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Manager boss = new Manager(50000,"Abubakar",1000);
        employees[0] = boss;
        // can't call the getSalary method from directly using
        // employees[0] index from employees array
        boss.setBonus(5000);
        employees[1] = (new Employee(30000,"Burabuk"));
        employees[2] = (new Employee(18000,"Kabbakur"));
        Manager bossCopy  = (Manager) employees[0];
        for(Employee e : employees){
            System.out.println(e.getSalary());
        }
        bossCopy.setBonus(15000);
        System.out.println(bossCopy.getSalary());
        // check the instance of the given objects
        System.out.println(employees[0] instanceof Manager);
        System.out.println(employees[1] instanceof Manager);
    }
}
