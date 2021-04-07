package com.company;

public interface Powered extends Moveable {
    boolean powerOn();
    double MAX_SPEED = 200;
}
interface Moveable{
    boolean canMove(int speed);

    boolean canMove();
}
