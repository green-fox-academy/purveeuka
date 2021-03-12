import javax.swing.*;

import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        patternDrawer(10, 2, graphics);
    }

    private static void patternDrawer(int stepSize, int canvasDivide, Graphics graphics) {
        for (int lines = 1; lines < WIDTH / stepSize / canvasDivide ; lines++) {
            lineDrawer(lines, stepSize, canvasDivide, graphics);
        }
    }

    private static void lineDrawer(int lines, int stepSize, int canvasDivide, Graphics graphics) {

        graphics.setColor(Color.GREEN);
        graphics.drawLine(  WIDTH / canvasDivide,
                lines * stepSize,
                WIDTH / canvasDivide - (lines * stepSize),
                WIDTH / canvasDivide);

        graphics.drawLine(  WIDTH / canvasDivide,
                lines * stepSize,
                WIDTH / canvasDivide + (lines * stepSize),
                WIDTH / canvasDivide);

        graphics.drawLine(  lines * stepSize,
                WIDTH / canvasDivide,
                WIDTH / canvasDivide,
                WIDTH / canvasDivide + (lines * stepSize));

        graphics.drawLine(  WIDTH / canvasDivide + lines * stepSize,
                WIDTH / canvasDivide,
                WIDTH / canvasDivide,
                WIDTH - (lines * stepSize));
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Ex03EnvelopeStar");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT + 23));
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
