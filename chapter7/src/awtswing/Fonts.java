package awtswing;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Fonts extends JComponent {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        String message = "Hey baby";
        Font yuGothic = new Font("Arial", Font.ITALIC, 35);
        g2.setFont(yuGothic);
        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = yuGothic.getStringBounds(message,context);
        g2.drawString(message,WIDTH/2,HEIGHT/2);

    }

    public Dimension getPreferredSize(){
        return new Dimension(WIDTH,HEIGHT);
    }

}

class FontsTest {
    public static void main(String[] args) {
        String[] fontNames = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();

        for (String font : fontNames) {
            System.out.println(font);
        }
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                JFrame frame = new FontFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Font Frame");
            }
        });
    }
}

class FontFrame extends JFrame {

    JFrame frame = new JFrame();

    public FontFrame() {
        add(new Fonts());
        pack();
    }

}
