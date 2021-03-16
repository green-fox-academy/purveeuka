import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SquareGrid {
    public static void drawImage(Graphics graphics) {
        fractals(graphics, 200, 200, 100, 20);
    }

    public static int randomColor() {
        int randomColor = (int) (Math.random() * 256);
        return randomColor;
    }

    public static void drawBox(Graphics graphics, int x, int y, int l, float w) {
        Graphics2D graphics2 = (Graphics2D) graphics;
        graphics2.setStroke(new BasicStroke(w));
        graphics.drawRect(x - l, y - l, 2 * l, 2 * l);
    }

    public static void fractals(Graphics graphics, int x, int y, int l, float w) {
        if (l < 4) {
            return;
        } else {
            graphics.setColor(new Color(randomColor(), randomColor(), randomColor()));
            drawBox(graphics, x, y, l, w);
            fractals(graphics, x - l, y - l, l / 2, w / 2);
            fractals(graphics, x + l, y + l, l / 2, w / 2);
            fractals(graphics, x + l, y - l, l / 2, w / 2);
            fractals(graphics, x - l, y + l, l / 2, w / 2);
        }
    }
    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

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

