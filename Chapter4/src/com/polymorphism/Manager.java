package com.polymorphism;

public class Manager extends Employee{
    private double bonus;
    public Manager(double salary, String name,double bonus) {
        super(salary, name);
        this.bonus = bonus;
    }


    public double getSalary(){

        return (super.getSalary() + bonus);
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
}
