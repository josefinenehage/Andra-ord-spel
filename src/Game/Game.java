package Game;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;

public class Game extends JFrame {
    private List<String> words;
    int i = 0;

    public Game(List<String> words) {
        this.words = words;
        Collections.shuffle(words);
    }

    public void run() {

    //    Font f = new Font("serif", Font.PLAIN, 15);
        Font f = new Font("HELVETICA", Font.BOLD, 25);
        Font btnF = new Font("HELVETICA", Font.BOLD, 20);

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
        startBtn.setBounds(150, 170, 140, 40);
        startBtn.setFont(btnF);
        frame.add(startBtn);


        JButton shuffle = new JButton("Shuffle");
        shuffle.setBackground(Color.green);
        shuffle.setBounds(150, 170, 140, 40);
        shuffle.setFont(btnF);

        JLabel label = new JLabel();
        label.setBounds(180, 80, 300, 100);
        label.setFont(f);


        startBtn.addActionListener((event) -> {
            frame.remove(startBtn);
            frame.repaint();
            label.setText(words.get(i));
            frame.repaint();
            frame.add(shuffle);

        });

        shuffle.addActionListener((event) -> {
            if (i <= words.size()) {
                i++;
                frame.add(label);
                label.setText(words.get(i));

            } else {
                label.setText("Spelet över!");

            }
        });




    }


}
