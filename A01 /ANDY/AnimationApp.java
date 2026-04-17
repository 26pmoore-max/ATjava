import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class AnimationApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Andy Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new Board());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class Board extends JPanel implements ActionListener {

    BufferedImage img;

    int x = 0;
    int y = 0;

    double angle = 0;

    Timer timer;

    public Board() {
        this.setPreferredSize(new Dimension(720, 720));

        try {
            img = ImageIO.read(new File("Andy.png"));
        } catch (IOException e) {
            System.out.println("Could not load image. Check file location/name.");
            e.printStackTrace();
        }

        timer = new Timer(25, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (img == null) return;

        // move diagonally
        x += 1;
        y += 1;

        // rotate 5 degrees clockwise
        angle += Math.toRadians(5);

        // wrap horizontally
        if (x > getWidth()) {
            x = -img.getWidth();
        }

        // wrap vertically
        if (y > getHeight()) {
            y = -img.getHeight();
        }

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (img == null) {
            g.drawString("Image not found", 20, 20);
            return;
        }

        Graphics2D g2 = (Graphics2D) g.create();

        int centerX = x + img.getWidth() / 2;
        int centerY = y + img.getHeight() / 2;

        g2.rotate(angle, centerX, centerY);

        g2.drawImage(img, x, y, null);

        g2.dispose();
    }
}