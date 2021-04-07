package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TestTimer {
    public static void main(String[] args) {
        // creates a listener that triggers the actionPerformed every n delay ms.
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(100,listener);
        t.start();
        // Creates a popup screen
        JOptionPane.showMessageDialog(null,"Quit Program?");
        System.exit(0);
    }


}
class TimePrinter implements ActionListener
{
    public void actionPerformed(ActionEvent e){
        Date now  = new Date();
        System.out.println("The time is: " + now);
    }
}
