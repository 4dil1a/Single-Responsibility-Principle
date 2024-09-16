/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gameresultsrp;

/**
 *
 * @author Owner
 */

public class Main {
    public static void main(String[] args) {
        GameHistory gameHistory = new GameHistory();

        // Add some game results to the history
        gameHistory.addGameResult(new GameResultSRP(3, 10));
        gameHistory.addGameResult(new GameResultSRP(5, 20));
        gameHistory.addGameResult(new GameResultSRP(2, 30));

        // Print the game history
        System.out.println("Game history:");
        gameHistory.printHistory();
    }
}
