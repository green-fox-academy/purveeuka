
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawImage(Graphics graphics) {
        patternDrawer(18,graphics);
    }

    private static void patternDrawer(int stepSize, Graphics graphics) {
        for (int lines = 0; lines < stepSize ; lines++) {
            lineDrawer(lines, stepSize, graphics);
        }
    }

    private static void lineDrawer(int lines, int stepSize, Graphics graphics) {
        graphics.setColor(new Color(181, 74, 244));
        graphics.drawLine(lines * stepSize, 0, HEIGHT - 4 , stepSize * lines);
        graphics.setColor(Color.green);
        graphics.drawLine(0, lines * stepSize, lines * stepSize, WIDTH - 4);
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