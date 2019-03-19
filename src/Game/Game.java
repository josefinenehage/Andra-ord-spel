package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Game extends JFrame {
    private List<String> words;

    public Game(List<String> words) {
        this.words = words;
    }

    public void run() {

        System.out.println(words);
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

        // Labels för ord
        JLabel firstWord = new JLabel();

        //Eventlistener skicka ut ord

        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(words);
            }
        });
    }


}
