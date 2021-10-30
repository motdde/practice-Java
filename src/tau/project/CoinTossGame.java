package tau.project;

import java.util.Scanner;

public class CoinTossGame {

    public static void main(String[] args) {
        Player player1 = new Player("alade");
        Player player2 = new Player("Ibukun");

        Scanner input = new Scanner(System.in);
        System.out.println("type heads or tail");
        boolean validInput = true;
        String guess;

        do {
            guess = input.nextLine();
            if (guess.equalsIgnoreCase(Coin.HEADS) || guess.equalsIgnoreCase(Coin.TAILS)) {
                validInput = false;
            } else {
                System.out.println("Wrong input try again");
            }
        } while (validInput);

        guess = guess.equalsIgnoreCase("h") ? Coin.HEADS : Coin.TAILS;
        String guessOpposite = guess.equalsIgnoreCase(Coin.HEADS) ? Coin.TAILS : Coin.HEADS;

        player1.setGuess(guess);
        player2.setGuess(guessOpposite);

        Coin coin = new Coin();
        coin.flip();

        if (player1.getGuess().equals(coin.getSide())) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }
        input.close();
    }

}
