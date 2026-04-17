import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class GraphicsApplication {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new Board());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class Board extends JPanel {

    BufferedImage img;

    public Board() {
        this.setPreferredSize(new Dimension(350, 350));

        try {
            img = ImageIO.read(new File("IMG_8415.JPG"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        setBackground(Color.CYAN);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        // Scale image to 1/4 of panel size
        int newWidth = panelWidth / 2;
        int newHeight = panelHeight / 2;

        // Position image in bottom-right corner
        int x = panelWidth - newWidth;
        int y = panelHeight - newHeight;

        // Draw the image
        g2.drawImage(img, x, y, newWidth, newHeight, null);
    }
}