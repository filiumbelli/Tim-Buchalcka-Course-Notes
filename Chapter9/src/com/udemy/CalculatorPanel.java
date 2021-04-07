package com.udemy;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorPanel extends JFrame {

    private final JPanel panel = new JPanel();
    private final JButton display;
    private static final String title = "Calculator";
    private static final int HEIGHT = 600;
    private static final int WIDTH = 600;
    private double result;
    private String lastCommand;
    private boolean start;

    public CalculatorPanel() {
        setSize(WIDTH,HEIGHT);
        setVisible(true);

        setLayout(new BorderLayout());
        result = 0;
        lastCommand = "=";
        start = true;
        display = new JButton("0");
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);
        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();
        panel.setLayout(new GridLayout(4, 4));
        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("/", command);

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("+", command);
        addButton("=", command);
        add(panel, BorderLayout.CENTER);
        pack();

    }

    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }

    private class InsertAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();
            if (start) {
                if (command.equals("-")) {
                    display.setText(command);
                    start = false;
                } else lastCommand = command;
            } else {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;
            }
        }
    }

    private class CommandAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();

            if (start) {
                if (command.equals("-")) {
                    display.setText(command);
                    start = false;
                } else lastCommand = command;
            } else {
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;
            }
        }
    }

    public void calculate(double x) {
        if (lastCommand.equals("+")) result += x;
        else if (lastCommand.equals("-")) result -= x;
        else if (lastCommand.equals("/")) result /= x;
        else if (lastCommand.equals("*")) result *= x;
        else if (lastCommand.equals("=")) result = x;
        display.setText(" " + result);
    }
}
