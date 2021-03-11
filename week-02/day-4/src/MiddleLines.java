import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class MiddleLines {
    public static void drawImage(Graphics line){
        line.setColor(Color.green);
        line.drawLine(HEIGHT / 2 , 0, HEIGHT/2, WIDTH);

        line.setColor(Color.red);
        line.drawLine(0, WIDTH / 2, HEIGHT,WIDTH / 2);
        // draw a red horizontal line to the canvas' middle
        // draw a green vertical line to the canvas' middle
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

