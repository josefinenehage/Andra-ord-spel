package Game;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;

public class Game extends JFrame {
    private List<String> words;
    private int i = 0;

    public Game(List<String> words) {
        this.words = words;
        Collections.shuffle(words);
    }

    public void run() {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(450, 450);
        frame.setResizable(false);
        frame.setLocation(800, 200);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);


        JButton startBtn = new JButton("Start game");
        startBtn.setBackground(Color.orange);
        startBtn.setBounds(120, 170, 140, 40);
        frame.add(startBtn);


        JButton shuffle = new JButton("Shuffle");
        shuffle.setBackground(Color.blue);
        shuffle.setBounds(120, 170, 140, 40);


        JLabel label = new JLabel();
        label.setBounds(150, 80, 300, 100);

        startBtn.addActionListener((event) -> {
            frame.remove(startBtn);

            frame.repaint();
            label.setText(words.get(0));
            frame.repaint();
            frame.add(shuffle);

        });

        shuffle.addActionListener((event) -> {
            if (i < words.size()) {
                i++;
                frame.add(label);
                label.setText(words.get(i));

            } else {
                label.setText("Spelet över!");
            }
        });


    }


}
