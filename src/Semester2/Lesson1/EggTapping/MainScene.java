package Semester2.Lesson1.EggTapping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class MainScene extends JPanel {
    private int clickCount = 0;
    private ImageIcon icon;
    private Timer rickrollTimer;
    private boolean hasTriggeredTroll = false;

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
            if (hasTriggeredTroll) return;
            clickCount++;
            title.setText("Clicks: " + clickCount);

            if (clickCount >= 10 && clickCount < 20) {
                icon = new ImageIcon(getClass().getResource("EggStage2.png"));
            } else if (clickCount >= 20 && clickCount < 30) {
                icon = new ImageIcon(getClass().getResource("EggStage3.png"));
            } else if (clickCount >= 30 && clickCount < 40) {
                icon = new ImageIcon(getClass().getResource("EggStage4.png"));
                imageButton.setBounds(width / 2 - icon.getIconWidth() / 2 ,height / 6 + 60, icon.getIconWidth(), icon.getIconHeight());
            } else if (clickCount >= 40) {
                icon = new ImageIcon(getClass().getResource("EggStageFinal.png"));
                imageButton.setBounds(width / 2 - icon.getIconWidth() / 2 ,height / 6 + 60, icon.getIconWidth(), icon.getIconHeight());

                startRickrollTimer();
                hasTriggeredTroll = true;
            }

            imageButton.setIcon(icon);
        });

        this.add(imageButton);

    }

    private void startRickrollTimer() {

        rickrollTimer = new Timer(3000, new ActionListener() { // 3-second delay
            @Override
            public void actionPerformed(ActionEvent e) {
                triggerEndGameTroll();
            }
        });

        rickrollTimer.setRepeats(false);
        rickrollTimer.start();
    }

    private void triggerEndGameTroll() {

        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
