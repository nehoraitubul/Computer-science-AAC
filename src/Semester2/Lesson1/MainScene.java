package Semester2.Lesson1;

import javax.swing.*;
import java.awt.*;

public class MainScene extends JPanel {
    public MainScene(int x, int y, int width, int height){
        this.setBounds(x, y, width, height);
        this.setLayout(null);
        this.setBackground(Color.BLACK);
        //TEXT
        JLabel title = new JLabel("TITLE");
        title.setBounds(125,125,50,50);
        this.add(title);
        //BUTTON
        JButton button = new JButton("Click");
        this.add(button);
        button.setBounds(100,175,100,50);
        button.addActionListener((event) -> {
            title.setText("Gay!");
            Font currentFont = title.getFont();
            title.setFont(new Font(currentFont.getName(), currentFont.getStyle(), currentFont.getSize() + 5));            });
    }
}
