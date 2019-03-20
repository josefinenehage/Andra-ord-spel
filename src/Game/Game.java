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
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            //frame.getContentPane().setLayout(new FlowLayout());
            frame.getContentPane().setBackground(Color.white);


            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            c.fill = GridBagConstraints.HORIZONTAL;

        JButton startBtn = new JButton("Start game");
          startBtn.setBackground(Color.orange);
          c.gridx = 1;
          c.gridy = 5;

         // startBtn.setSize(new Dimension(40,1));
     //    frame.getContentPane().add(startBtn);
        panel.add(startBtn,c);

        frame.setContentPane(panel);

     //   JButton shuffle = new JButton("Shuffle");


   /*     startBtn.addActionListener((event) -> {
            frame.remove(startBtn);
            frame.repaint();
            label.setText(words.get(i));
            frame.add(shuffle);
        });

        shuffle.addActionListener((event)->{
            if (i < words.size()) {
                i++;
                frame.add(label);
                label.setText(words.get(i));

            } else {
                label.setText("Spelet över!");
            }
        });*/


    }


}
