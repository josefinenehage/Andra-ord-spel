package Game;

import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class WordLoader {

    private List<String> words = new ArrayList<>();

    public WordLoader() {

        File file = new File("C:\\Users\\josefin.enehage\\Documents\\Andra-ord-spel\\wordfile.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        while (scan.hasNextLine()) {
            String word = scan.nextLine();
            String split[] = word.split(" ");

            for(String s : split){
                words.add(s);
            }
        }

        Random rand = new Random();
        int num = rand.nextInt(10);
        for (int i = 0; i < num; i++) {
            words.add("Tjuv!");
        }

       // Collections.shuffle(words);

    }



    public List<String> getWords() {
        return words;
    }



}
