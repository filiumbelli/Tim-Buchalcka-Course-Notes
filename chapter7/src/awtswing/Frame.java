package awtswing;

import javax.swing.*;
import java.awt.*;

public class Frame {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });

    }

    private static class SimpleFrame extends JFrame {
        private static final int width = 600;
        private static final int height = 450;
        Toolkit kit = Toolkit.getDefaultToolkit();

        public SimpleFrame() {
            // basically gets the user screen size and setSize w.r.t that.
            Dimension screenSize = kit.getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;

            // size and locate at once
            // setBounds(400,300,600,300);
            // Features
            setResizable(true);
            setTitle("My Window");
            setIconImage(new ImageIcon("apple.jpg").getImage());
            setVisible(true);
            setSize(screenWidth / 2, screenHeight / 2);
//            setLocation(x,y)
            setLocationByPlatform(true);
//            toFront();
//            toBack();

        }
    }
}
