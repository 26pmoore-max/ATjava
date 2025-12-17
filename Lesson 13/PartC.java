import javax.swing.*;
import java.awt.*;

public class PartC extends JPanel {

 
    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;

    public static final int STEPS = 1000; 
    public static final double SCALE = 150.0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        
        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;

        g.setColor(Color.BLUE);

        int prevX = centerX;
        int prevY = centerY;

        for (int i = 0; i <= STEPS; i++) {

           
            double theta = 2 * Math.PI * i / STEPS;

        
            double r = Math.cos(2 * theta);

            
            double x = SCALE * r * Math.cos(theta);
            double y = SCALE * r * Math.sin(theta);

          
            int plotX = centerX + (int) x;
            int plotY = centerY - (int) y; 

          
            g.drawLine(prevX, prevY, plotX, plotY);

            prevX = plotX;
            prevY = plotY;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Four-Leaved Rose: r = cos(2θ)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(new PartC());
        frame.setVisible(true);
    }
}
