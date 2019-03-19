package Game;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class WordLoader {

    private List<String> words = new ArrayList<>();

    public WordLoader(){


        words.add("ord1");
        words.add("ord2");
        words.add("ord3");
        words.add("ord4");


    }

    public List<String> getWords() {
        return words;
    }


    /*

    public WordLoader{
        List<String> words = new ArrayList<>();

        File file = new File( "C:\\Users\\josefin.enehage\\Documents\\Med-andra-ord\\src\\words.txt" );

            Scanner scan = new Scanner(file);

        while(scan.hasNextLine()){
            String word = scan.nextLine();
            String split [] =  word.split(" ");

            for(String i : split){
                words.add(i);
            }

        }


*/


}
