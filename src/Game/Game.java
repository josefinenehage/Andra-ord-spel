package Game;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Game extends JFrame {
    private List<String> words;
    private int i = 0;

    public Game(List<String> words) {
        this.words = words;
    }

    public void run() {

        //Frame
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(550, 550);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());
        //Start button
        JButton startBtn = new JButton("Start");
        startBtn.setBounds(10, 10, 140, 40);
        frame.add(startBtn);
        JButton shuffle = new JButton("Shuffle");

        // Labels för ord
        JLabel label = new JLabel();

        //Eventlistener skicka ut ord

        startBtn.addActionListener((event) -> {

            if (i < words.size()) {
                frame.add(label);
                label.setText(words.get(i));
                i++;
            } else {
                label.setText("Spelet över!");
            }
        });




    }


}
