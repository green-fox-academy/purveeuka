import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class ColoredBox {
    public static void drawImage(Graphics boxEdge) {
        boxEdge.setColor(Color.orange);
        boxEdge.drawLine(10, 10, 10, 200);
        boxEdge.setColor(Color.red);
        boxEdge.drawLine(10, 200, 200, 200);
        boxEdge.setColor(Color.blue);
        boxEdge.drawLine(10, 10, 200, 10);
        boxEdge.setColor(Color.black);
        boxEdge.drawLine(200, 10, 200, 200);
        // Draw a box that has different colored lines on each edge
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
