package com.company;

public class Vehicle implements Powered,Cloneable{

    private int speed;
    @Override
    public boolean canMove(int speed) {
        return speed > 0;
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public boolean canMove(){
        return this.speed >0;
    }

    @Override
    public boolean powerOn() {
        return this.speed>0;
    }

    public Vehicle clone() throws CloneNotSupportedException
    {
        return (Vehicle) super.clone();
    }
}
