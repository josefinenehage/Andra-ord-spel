package Game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        WordLoader wl = new WordLoader();

        Game game = new Game(wl.getWords());

        game.run();


     /*   private List<String> words = new ArrayList<>();
        words.add("ord1");
        words.add("ord2");
        words.add("ord3");
        words.add("ord4");


    }


    public List<String> getWords(List<String> words){
        return words;
    }*/

    }
}


