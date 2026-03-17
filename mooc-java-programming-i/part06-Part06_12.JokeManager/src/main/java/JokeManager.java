
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fil
 */
public class JokeManager {

    private final ArrayList<String> jokes;

    public JokeManager() {
        jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            return noJokes();
        }
        Random draw = new Random();
        int index = draw.nextInt(jokes.size());
        return jokes.get(index);
    }

    public void printJokes() {
        if (jokes.isEmpty()) {
            System.out.println(noJokes());
        }
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }

    public void printJokes(int jokeIndex) {
        if (jokes.isEmpty()) {
            System.out.println(noJokes());
        } else {
            if (jokeIndex >= 0 && jokeIndex < jokes.size()) {
                System.out.println(jokes.get(jokeIndex));
            }
        }
    }

    private String noJokes() {
        return "Jokes are in short supply.";
    }
}
