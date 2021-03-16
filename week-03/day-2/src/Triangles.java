import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void drawImage(Graphics graphics) {
        int x1 = 300;
        int y1 = 550;
        int length = 300;
        int height = 260;
        fractals(graphics, x1, y1, length, height);
    }

    public static void drawTriangle(Graphics graphics, int x, int y, int l, int h) {
        int xPoints[] = {x, x - l, x + l};
        int yPoints[] = {y, y - (2 * h), y - (2 * h)};
        int nPoints = 3;
        graphics.drawPolygon(xPoints, yPoints, nPoints);
    }

    public static void fractals(Graphics graphics, int x, int y, int l, int h) {
        if (l < 3) {
        } else {
            graphics.setColor(Color.BLACK);
            drawTriangle(graphics, x, y, l, h);
            fractals(graphics, x, y, l / 2, h / 2);
            fractals(graphics, x - (l / 2), y - h, l / 2, h / 2);
            fractals(graphics, x + (l / 2), y - h, l / 2, h / 2);
        }
    }

    //    Don't touch the code below
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
