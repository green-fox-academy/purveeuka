import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {

    public static void drawImage(Graphics graphics) {
        fractals(graphics, 20, 20, 110, 210);
    }

    public static void drawPentagon(Graphics graphics, int x, int y, int l, int h) {
        int xPoints[] = {x, x + l, x + (3 * l), x + (4 * l), x + (3 * l), x + l};
        int yPoints[] = {y + h, y, y, y + h, y + (2 * h), y + (2 * h)};
        int nPoints = 6;
        graphics.drawPolygon(xPoints, yPoints, nPoints);
    }

    public static void fractals(Graphics graphics, int x, int y, int l, int h) {
        if (h < 1) {
            return;
        } else {
            graphics.setColor(Color.black);
            drawPentagon(graphics, x, y, l, h);
            fractals(graphics, x + l - (l / 3), y, l / 3, h / 3);
            fractals(graphics, x + (2 * l), y, l / 3, h / 3);
            fractals(graphics, x + l - (l / 3), y + h + (h / 3), l / 3, h / 3);
            fractals(graphics, x + (2 * l), y + h + (h / 3), l / 3, h / 3);
            fractals(graphics, x + (2 * l) + ((l / 3) * 2), y + h - (h / 3), l / 3, h / 3);
            fractals(graphics, x, y + h - (h / 3), l / 3, h / 3);
        }
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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