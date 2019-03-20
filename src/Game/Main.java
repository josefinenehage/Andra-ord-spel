package Game;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        WordLoader wl = new WordLoader();
        Game game = new Game(wl.getWords());
        game.run();


    }
}


