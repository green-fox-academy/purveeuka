import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {
        int triangleSize = 20;

        for (int lineCount = 0; lineCount < triangleSize ; lineCount++) {
            for (int i = -lineCount ; i <=  lineCount ; i ++) {
                if (lineCount % 2 == 0 && i % 2 == 0 ) {
                    triangleDraw(lineCount, i , graphics);
                } else {
                    if (lineCount % 2 != 0 && i % 2 != 0) {
                        triangleDraw(lineCount, i , graphics);
                    }
                }
            }
        }
    }

    private static void triangleDraw(int lineCount, int i, Graphics graphics) {
        int xPoints[] = {200 +  i * 10, 190 + i * 10, 210 + i * 10};
        int yPoints[] = {lineCount * 17, lineCount * 17 + 17, lineCount * 17 + 17};
        int nPoints = 3;
        graphics.setColor(Color.BLACK);
        graphics.drawPolygon(xPoints, yPoints, nPoints);
    }


    static int WIDTH = 400;
    static int HEIGHT = 400;
    // Don't touch the code below

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
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
            drawImage(graphics);
        }
    }
}
