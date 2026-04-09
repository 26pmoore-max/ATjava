import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class GraphicsTemplate {
    /*
     * Change the following method to customize
     * what is drawn in the JFrame.
     */
    public static void draw(Graphics g) {
        // by default, this method draws a  square.
        g.setColor(Color.RED);
        g.fillRect(50, 50, 200, 200);

        
        g.setColor(Color.GREEN);
        int[] x = {50, 150, 250};
        int[] y = {50, 0, 50};
        g.fillPolygon(x, y, 3);

       
        g.setColor(Color.BLUE);
        g.fillRect(100, 150, 50, 100);

        
        g.setColor(Color.YELLOW);
        g.fillRect(60, 60, 50, 50);
        g.fillRect(190, 60, 50, 50);

        
        g.setColor(Color.GRAY);
        g.fillRect(250, 150, 100, 100);
        g.setColor(Color.ORANGE);
        int[] x2 = {275, 325, 350, 350, 325, 275, 250, 250};
        int[] y2 = {200, 200, 225, 275, 300, 300, 275,  225};
        g.fillPolygon(x2, y2, 8);


        g.setColor(Color.DARK_GRAY);
        g.fillRect(250, 250, 100, 50);

    

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

    // Do not modify the code in the main method.
    // Your code will go into the draw method above.
    public static void main(String[] args) {
        // this is the desired dimensions of the content area
        // of our JFrame window.
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;

        // the values for border width and title bar height
        // depend on the operating system.
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
                // I don't know what the values are for Linux.
                break;
            case OTHER:
                break;
        }

        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set title
        frame.setTitle("Graphics Template");

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