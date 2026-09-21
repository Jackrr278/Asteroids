package org.jackrr;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // gamePanel init
        GamePanel gamePanel = new GamePanel();

        // Game window init and properties
        JFrame gameWindow = new JFrame();
        gameWindow.setSize(500, 500);
        gameWindow.add(gamePanel);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setVisible(true);

        //Timer init
        Timer gameTimer = new Timer(16, e -> {
            gamePanel.rotate();
        });
        gameTimer.start();

    }
}