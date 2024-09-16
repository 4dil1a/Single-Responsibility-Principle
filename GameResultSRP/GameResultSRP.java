package gameresultsrp;

import java.util.ArrayList;
import java.util.List;

public class GameResultSRP {
    private int guesses;
    private int magicNumber;

    public GameResultSRP(int numberOfGuesses, int theNumber) {
        this.guesses = numberOfGuesses;
        this.magicNumber = theNumber;
    }

    // Getter methods for game result data
    public int getGuesses() {
        return guesses;
    }

    public int getMagicNumber() {
        return magicNumber;
    }
}

// Class responsible for managing the history of game results
class GameHistory {
    private List<GameResultSRP> history = new ArrayList<>();

    // Adds a new game result to the history
    public void addGameResult(GameResultSRP result) {
        history.add(result);
    }

    // Prints the history of all game results
    public void printHistory() {
        for (GameResultSRP result : history) {
            System.out.println("Guesses: " + result.getGuesses() + ", Magic Number: " + result.getMagicNumber());
        }
    }
}

