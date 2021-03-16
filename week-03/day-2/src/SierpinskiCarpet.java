import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskiCarpet {

    public static void mainDraw(Graphics graphics) {
        carpetDrawer(graphics, 0, 0, 600);
    }

    public static void carpetDrawer(Graphics graphics, int x, int y, int size) {
        int oneThird = size / 3;
        graphics.setColor(Color.black);
        graphics.fillRect(x + oneThird, y + oneThird, oneThird - 2, oneThird - 2);

        if (oneThird > 0) {
            carpetDrawer(graphics, x, y, oneThird);
            carpetDrawer(graphics, x + oneThird, y, oneThird);
            carpetDrawer(graphics, x, y + oneThird, oneThird);
            carpetDrawer(graphics, x + oneThird, y + oneThird, oneThird);
            carpetDrawer(graphics, x + 2 * oneThird, y, oneThird);
            carpetDrawer(graphics, x + oneThird, y + 2 * oneThird, oneThird);
            carpetDrawer(graphics, x, y + 2 * oneThird, oneThird);
            carpetDrawer(graphics, x + 2 * oneThird, y + 2 * oneThird, oneThird);
            carpetDrawer(graphics, x + 2 * oneThird, y + oneThird, oneThird);
        }
    }

    //    Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {

        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
