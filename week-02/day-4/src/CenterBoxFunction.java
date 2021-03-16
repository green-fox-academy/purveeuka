import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
  public class CenterBoxFunction {

        public static void drawImage(Graphics graphics){
            for (int squares = 0; squares < 3; squares++) {
                drawSquare( 20, graphics);

            }
        }

        public static int randomSize(){
            return ((int)(Math.random() * 320));
        }

      public static void drawSquare( int size, Graphics graphics) {
          size = randomSize();
          int x = (WIDTH / 2) - (size / 2);
          int y = (HEIGHT / 2) - (size / 2);
          Random random = new Random();
          graphics.setColor(new Color(random.nextInt(0xFFFFFF)));
          graphics.drawRect(x, y, size, size);
      }

      // Create a function that takes 2 parameters and draws one square
      // Parameters: the square size and the graphics
      // The function shall draw a square of that size to the center of the canvas
      // Draw 3 squares with that function
      // (the squares should not be filled otherwise they will hide each other)
      // Avoid code duplication!

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



