package Semester2.Lesson1;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(1000,1000);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLayout(null);

        MainScene mainPanel = new MainScene(0,0,1000,1000);

        window.add(mainPanel);

        window.revalidate();
        window.repaint();

    }
}
