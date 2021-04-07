package com.udemy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonTable extends JFrame {

    private final JPanel buttonPanel;

    public ButtonTable() {
        int width = 600;
        int height = 450;
        setSize(width, height);
        setVisible(true);
        setTitle("Hey");
        //create buttons
        JButton yb = new JButton("Yellow");
        JButton bb = new JButton("Blue");
        JButton rb = new JButton("Red");
        //initialize panel
        buttonPanel = new JPanel();
        // add buttons to panel
        // add panel to frame
        makeButton("Yellow", Color.yellow);
        makeButton("Red", Color.red);
        makeButton("Blue", Color.blue);
        // Map functions
        InputMap imap = buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        ActionMap amap = buttonPanel.getActionMap();
        // Action created
        Action pinkAction = new ColorAction("Pink",Color.pink);
        // attach a key name to the method
        imap.put(KeyStroke.getKeyStroke("ctrl P"),"panel.pink");
        // attach the action to the method
        amap.put("panel.pink",pinkAction);
        buttonPanel.add(new JButton(pinkAction));
        add(buttonPanel);

        addWindowListener(new Closer());
        pack();

//        ColorAction yA = new ColorAction(Color.YELLOW);
//        ColorAction bA = new ColorAction(Color.blue);
//        ColorAction rA = new ColorAction(Color.red);
//        yb.addActionListener(yA);
//        bb.addActionListener(bA);
//        rb.addActionListener(rA);


    }

    static class Closer extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    private void makeButton(String name, Color bgColor) {
        JButton button = new JButton(name);
        buttonPanel.add(button);
        button.addActionListener(e -> {
            buttonPanel.setBackground(bgColor);
        });
    }

    public class ColorAction extends AbstractAction {

        public ColorAction(String name, Color c){
            putValue(Action.NAME,name);
            putValue("color",c);
            putValue(Action.SHORT_DESCRIPTION,"Set panel color to " + name.toLowerCase());
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("color");
            buttonPanel.setBackground(c);
        }

    }

    public static void main(String[] args) {
        ButtonTable bt = new ButtonTable();
    }

}
