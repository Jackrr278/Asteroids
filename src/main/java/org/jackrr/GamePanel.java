package org.jackrr;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private int posX = 0;
    private int posY = 0;

    public void moveRight() {
        posX = posX + 5;
        repaint();
    }

@Override
    protected void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);

    graphics.drawRect(posX, posY, 50,50);


}

}
