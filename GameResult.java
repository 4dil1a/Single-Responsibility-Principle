package gameresult;

import java.util.ArrayList;
import java.util.List;

public class GameResult {

    static List<GameResult> history = new ArrayList<>();

    int guesses;
    int magicNumber;

    public GameResult(int numberOfGuesses, int theNumber) {
        this.guesses = numberOfGuesses;
        this.magicNumber = theNumber;
        history.add(this);
    }

    public static void printHistory() {
        for (GameResult result : history) {
            System.out.println("Guesses: " + result.guesses + ", Magic Number: " + result.magicNumber);
        }
    }
    
    // Method added to the original code to show data access problem
public static void printHistoryRaw() {
    for (GameResult result : history) {
        System.out.println("Guesses: " + result.guesses + ", Magic Number: " + result.magicNumber);
    }
}


    public static void main(String[] args) {
    GameResult game1 = new GameResult(3, 10);
    GameResult game2 = new GameResult(5, 20);
    GameResult game3 = new GameResult(2, 30);

    System.out.println("Game history (Original):");
    GameResult.printHistory();
    
    // Showing direct data access issue
    System.out.println("Game history (Raw Access):");
    GameResult.printHistoryRaw();
}

}

