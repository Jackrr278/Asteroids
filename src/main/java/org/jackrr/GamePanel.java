package org.jackrr;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private Image rocket;

    public GamePanel() {
    rocket = new ImageIcon(
            getClass().getResource("/assets/asteroids/textures/rocket.png")
        ).getImage();
    }

    private double rotation = 0;
    private int posX = -25;
    private int posY = -25;

    void rotate() {
        rotation += 0.5;
        repaint();
    }

@Override
    protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);

    Graphics2D g2 = (Graphics2D) graphics;

    int centerX = getWidth() / 2;
    int centerY = getHeight() / 2;

    g2.translate(centerX, centerY);
    g2.rotate(rotation, + 25,  + 25);
    graphics.drawImage(rocket, posX, posY, 50, 50, this);


}

}
