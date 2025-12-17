import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class PartB {

    // Constant for tile size
    public static final int TILE_SIZE = 100;

    /*
     * This method controls what is drawn in the window
     */
    public static void draw(Graphics g) {
        drawTiles(g);
    }

    /*
     * Helper method that draws the grid of tiles
     */
    public static void drawTiles(Graphics g) {
        // 400 / 100 = 4 rows and 4 columns
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {

                // Alternate colors by row and column
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.BLUE);
                } else {
                    g.setColor(Color.RED);
                }

                int x = col * TILE_SIZE;
                int y = row * TILE_SIZE;

                g.fillRect(x, y, TILE_SIZE, TILE_SIZE);
            }
        }
    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER
    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }
        return val;
    }

    // Do not modify the code in the main method
    public static void main(String[] args) {
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;

        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
            case OTHER:
                break;
        }

        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;

        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Alternating Red and Blue Tiles");

        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph);
            }
        };

        frame.add(component);
        frame.setVisible(true);

        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());
    }
}