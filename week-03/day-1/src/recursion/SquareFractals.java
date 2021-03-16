package recursion;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class SquareFractals {
    public static void mainDraw(Graphics graphics){
        int size = 320;
        int positionX = 0;
        int positionY = 0;
        squareRecursion(positionX, positionY, size, graphics);
    }
    public static void drawSquare(int x, int y, int size, Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.fillRect(x, y, size, size);
        graphics.setColor(Color.black);
        graphics.drawRect(x, y, size, size);
    }
    public static void squareRecursion(int x, int y, int size, Graphics graphics) {
        drawSquare(x, y, size, graphics);
        if (size > 10) {
            squareRecursion(x + size / 3, y, size / 3, graphics);
            squareRecursion(x + size * 2 / 3, y + size/ 3, size / 3, graphics);
            squareRecursion(x, y + size / 3, size / 3,  graphics);
            squareRecursion(x + size / 3, y + size * 2 / 3, size / 3, graphics);
        }
    }
    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
