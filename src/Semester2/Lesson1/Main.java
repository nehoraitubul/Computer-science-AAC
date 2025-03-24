package Semester2.Lesson1;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(window.getWidth(),window.getHeight());
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLayout(null);

        MainScene mainPanel = new MainScene(0,0,window.getWidth(),window.getHeight());

        window.add(mainPanel);

    }
}
