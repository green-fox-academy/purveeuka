import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void drawImage(Graphics graphics){
         fourRectangle(graphics,12, 20);
        // Draw four different size and color rectangles
        // Avoid code duplication!
    }
    public  static void fourRectangle(Graphics graphics, int x, int y) {
        for (int shapes = 0; shapes < 4; shapes++) {
            Random random = new Random();
            graphics.setColor(new Color(random.nextInt(0xFFFFFF)));
            graphics.fillRect( x, y, x, y);
            x = random.nextInt(100);
            y = random.nextInt(100);
        }
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}


