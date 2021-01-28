package com.company;

public class Main {

    private static int heroMain;
    static {
        // Is executed only once
        System.out.println("Hello baby");
        heroMain = 0x04;
    }
    public static void main(String[] args) {
	 Employee employee = new Employee(3500.00,"Abdurrezzak");
        (new Main()).hero();
    }

    public void hero(){
        System.out.println(heroMain);
    }
}
