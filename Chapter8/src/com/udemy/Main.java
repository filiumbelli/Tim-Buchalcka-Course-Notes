package com.udemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Color Window");
        frame.setVisible(true);
        frame.setSize(400,300);
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);

        JButton yellowButton = new JButton("Yellow");
        JButton redButton = new JButton("Red");
        JButton blueButton = new JButton("Blue");
        yellowButton.setSize(50,50);
        redButton.setSize(50,50);
        blueButton.setSize(50,50);
        frame.getContentPane().add(yellowButton);
        frame.getContentPane().add(redButton);
        frame.getContentPane().add(blueButton);
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);

    }
}

// all in one
class ButtonFrame extends JFrame {
    private JPanel buttonPanel;

    private class ColorAction implements ActionListener {
        private Color backgroundColor;

        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(backgroundColor);
        }
    }
}

class ColorAction implements ActionListener {
    private Color backgroundColor;

    public ColorAction(Color c) {
        backgroundColor = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
