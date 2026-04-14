import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public class GraphicsApplication {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AffineTransform Board");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new Board());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class Board extends JPanel {

    public Board() {
        this.setPreferredSize(new Dimension(350, 350));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        setBackground(Color.CYAN);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        Rectangle2D rect = new Rectangle2D.Double(0, 0, 150, 150);
//resourced ai to help me with this affline stuff
        AffineTransform at = new AffineTransform();

        
        at.translate(panelWidth / 2.0 - 75, panelHeight / 2.0 - 75);

     
        double angle = Math.toRadians(22.5);
        at.rotate(angle, 75, 75);

  
        g2.setColor(Color.BLACK);
        g2.draw(at.createTransformedShape(rect));

        g2.setColor(Color.BLUE);
        g2.setFont(new Font("Arial", Font.BOLD, 16));
        g2.drawString("Hello, world!", 10, 20);
    }
}
