import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tree {

    public static void drawImage(Graphics graphics) {

        fractals(graphics, 300, 550, -90, 40, 15);
    }

    public static void fractals(Graphics graphics, double startX, double startY, double angle,
                                int length, int loop) {
        if (loop == 0) {
            return;
        } else {
            graphics.setColor(Color.orange);
            double x = startX + length * Math.cos(Math.toRadians(angle));
            double y = startY + length * Math.sin(Math.toRadians(angle));
            graphics.drawLine((int) startX, (int) startY, (int) x, (int) y);
            fractals(graphics, x, y, angle, length - 1, loop - 1);
            fractals(graphics, x, y, angle + 10, length - 3, loop - 1);
            fractals(graphics, x, y, angle - 10, length - 3, loop - 1);
        }
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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
