package Semester2.Lesson1;

import javax.swing.*;
import java.awt.*;

public class MainScene extends JPanel {
    private int clickCount = 0;
    private ImageIcon icon;

    public MainScene(int x, int y, int width, int height){
        final int TITLE_X = width;
        final int TITLE_Y = height;
        final int TITLE_WIDTH = 120;
        final int TITLE_HEIGHT = 50;

        this.setBounds(x, y, width, height);
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        //TEXT
        JLabel title = new JLabel("Clicks: 0", SwingConstants.CENTER);
        title.setBounds(TITLE_X/2-60, TITLE_Y/6, TITLE_WIDTH, TITLE_HEIGHT);
        this.add(title);

        icon = new ImageIcon(getClass().getResource("EggStage1.png"));

        JButton imageButton = new JButton(icon);
        imageButton.setBounds(width / 2 - icon.getIconWidth() / 2 ,height / 6 + 60, icon.getIconWidth(), icon.getIconHeight());

        imageButton.addActionListener((event) -> {
            clickCount++;
            title.setText("Clicks: " + clickCount);

            if (clickCount >= 10 && clickCount < 20) {
                icon = new ImageIcon(getClass().getResource("EggStage2.png"));
            } else if (clickCount >= 20 && clickCount < 30) {
                icon = new ImageIcon(getClass().getResource("EggStage3.png"));
            } else if (clickCount >= 30) {
                icon = new ImageIcon(getClass().getResource("Amit.png"));
            }
            imageButton.setIcon(icon);
        });

        this.add(imageButton);

    }
}
