package tau.chapter4;

import java.util.Random;

public class RoleTheDie {
    public static void main(String[] args) {
        Random random = new Random();

        int numberOfRollsAllowed = 5;
        int totalSteps = 0;
        int winningScore = 20;

        for (int i = 1; i <= numberOfRollsAllowed; i++) {

            int die = random.nextInt(6) + 1;
            totalSteps = totalSteps + die;

            if (totalSteps == winningScore) {
                System.out.printf("You rolled a %d. You are on space %d. " +
                        "Congrats you win  \n", die, totalSteps);
                break;
            } else if (totalSteps > winningScore) {
                System.out.printf("You have passed space %d. You lose!", winningScore);
            } else if (i == numberOfRollsAllowed) {
                System.out.printf("You are on space %d \n", totalSteps);
                System.out.printf("Unfortunately you didn't make it to space %d. You lose!", winningScore);
            } else {
                System.out.printf("You rolled a %d. " +
                                "You are on space %d and have %d more to go \n",
                        die, totalSteps, (winningScore - totalSteps));
            }
        }
    }
}
