package awtswing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class MyComponent extends JComponent {
    public void paintComponent(Graphics g){

    }
}

class HelloWorldComponent extends JComponent {


    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    public void paintComponent(Graphics g){
        g.drawString("Hello World Component",MESSAGE_X,MESSAGE_Y);
        Graphics2D g2 = (Graphics2D)g;
        Ellipse2D e = new Ellipse2D.Double(150,200,100,50);
        Rectangle2D r = new Rectangle2D.Double(150,200,100,50);
        g2.draw(e);
        g2.draw(r);
        //setFrameFromDiagonal
        //setFrameFromCenter
    }
    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
class HelloWorldFrame extends JFrame {
    public HelloWorldFrame()
    {
        add(new HelloWorldComponent());
        pack();
    }

}

class Main{
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                HelloWorldFrame frame = new HelloWorldFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Hello World");

            }
        });
    }
}

